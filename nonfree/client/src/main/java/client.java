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

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "Lclient!EJJAKGTE;")
	public static Class3_Sub1_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "Z")
	private static boolean aBoolean199;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
	private static int anInt853;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
	private static int anInt882;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "I")
	private static int anInt884;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
	private static int anInt891;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "I")
	private static int anInt905;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "I")
	private static int anInt912;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "I")
	private static int anInt920;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "I")
	public static int anInt941;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "Z")
	private static boolean aBoolean224;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "I")
	private static int anInt956;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "I")
	private static int anInt961;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
	private static int anInt962;

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "I")
	private static int anInt989;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "Z")
	private static boolean aBoolean240;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "I")
	public static int anInt1003;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "I")
	private static int anInt1012;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
	private static int anInt1025;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
	private static int anInt1030;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "I")
	private static int anInt1036;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "Z")
	private static boolean aBoolean248;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "Z")
	private static boolean aBoolean249;

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "I")
	private static int anInt1062;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "Ljava/lang/String;")
	private static String aString18 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "[I")
	public static int[] anIntArray229 = new int[32];

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "I")
	private static int anInt936;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
	private static int anInt940;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "Z")
	private static boolean aBoolean223;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
	private static int anInt973;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "[I")
	public static final int[] anIntArray264;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "I")
	private static int anInt1038;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "[[I")
	public static final int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "[I")
	private static int[] anIntArray269;

	@OriginalMember(owner = "client!client", name = "Mj", descriptor = "I")
	private static int anInt1065;

	@OriginalMember(owner = "client!client", name = "Qj", descriptor = "I")
	private static int anInt1069;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "I")
	private int anInt844;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "I")
	private int anInt845;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "[I")
	private int[] anIntArray212;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "[I")
	private int[] anIntArray213;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "[I")
	private int[] anIntArray214;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "[I")
	private int[] anIntArray215;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "Ljava/lang/String;")
	private String aString17;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "Lclient!TZRNBMTC;")
	private Class32 aClass32_3;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "Lclient!TZRNBMTC;")
	private Class32 aClass32_4;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "Lclient!TZRNBMTC;")
	private Class32 aClass32_5;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
	private int anInt850;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "Lclient!XZFDFADG;")
	private Class6_Sub1 aClass6_Sub1_1;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
	private int anInt851;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Lclient!KZTQXFDC;")
	private Class3_Sub1_Sub3_Sub1 aClass3_Sub1_Sub3_Sub1_1;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "Lclient!KZTQXFDC;")
	private Class3_Sub1_Sub3_Sub1 aClass3_Sub1_Sub3_Sub1_2;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "Lclient!KZTQXFDC;")
	private Class3_Sub1_Sub3_Sub1 aClass3_Sub1_Sub3_Sub1_3;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "Lclient!WBHAMUQI;")
	private Class41 aClass41_2;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
	private int anInt856;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
	private int anInt857;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
	private int anInt858;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
	private int anInt859;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
	private int anInt860;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "I")
	private int anInt861;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "I")
	private int anInt862;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "Lclient!NUXITFPR;")
	private Class3_Sub1_Sub3_Sub2 aClass3_Sub1_Sub3_Sub2_3;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "Lclient!NUXITFPR;")
	private Class3_Sub1_Sub3_Sub2 aClass3_Sub1_Sub3_Sub2_4;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "I")
	private int anInt864;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "I")
	private int anInt865;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
	private int anInt866;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
	private int anInt867;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
	private int anInt868;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
	private int anInt869;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "I")
	private int anInt870;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "I")
	private int anInt871;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "I")
	private int anInt872;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "Lclient!YQNDWKQR;")
	private Class48 aClass48_1;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "Ljava/lang/String;")
	private String aString22;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "I")
	private int anInt874;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
	private int anInt876;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "Lclient!NUXITFPR;")
	private Class3_Sub1_Sub3_Sub2 aClass3_Sub1_Sub3_Sub2_5;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
	private int anInt877;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "I")
	private int anInt878;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "I")
	private int anInt880;

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "I")
	private int anInt881;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "I")
	private int anInt883;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "I")
	private int anInt885;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "I")
	private int anInt887;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "Lclient!KZTQXFDC;")
	private Class3_Sub1_Sub3_Sub1 aClass3_Sub1_Sub3_Sub1_4;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "Lclient!KZTQXFDC;")
	private Class3_Sub1_Sub3_Sub1 aClass3_Sub1_Sub3_Sub1_5;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "Lclient!TZRNBMTC;")
	private Class32 aClass32_6;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "Lclient!TZRNBMTC;")
	private Class32 aClass32_7;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "Lclient!TZRNBMTC;")
	private Class32 aClass32_8;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "Lclient!TZRNBMTC;")
	private Class32 aClass32_9;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "I")
	private int anInt890;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "I")
	private int anInt892;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "I")
	private int anInt893;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "I")
	private int anInt894;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
	private int anInt895;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "I")
	private int anInt896;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "I")
	private int anInt897;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "I")
	private int anInt898;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "I")
	private int anInt899;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "I")
	private int anInt900;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "I")
	private int anInt902;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
	private int anInt906;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "I")
	private int anInt908;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "I")
	private int anInt909;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "I")
	private int anInt910;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "I")
	private int anInt913;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "I")
	private int anInt914;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "I")
	private int anInt915;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "I")
	private int anInt916;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "I")
	private int anInt917;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "[I")
	private int[] anIntArray232;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "[I")
	private int[] anIntArray233;

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "I")
	private int anInt919;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "I")
	private int anInt922;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "I")
	private int anInt923;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "Lclient!KZTQXFDC;")
	private Class3_Sub1_Sub3_Sub1 aClass3_Sub1_Sub3_Sub1_6;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "Lclient!KZTQXFDC;")
	private Class3_Sub1_Sub3_Sub1 aClass3_Sub1_Sub3_Sub1_7;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "Lclient!KZTQXFDC;")
	private Class3_Sub1_Sub3_Sub1 aClass3_Sub1_Sub3_Sub1_8;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "Lclient!KZTQXFDC;")
	private Class3_Sub1_Sub3_Sub1 aClass3_Sub1_Sub3_Sub1_9;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "Lclient!KZTQXFDC;")
	private Class3_Sub1_Sub3_Sub1 aClass3_Sub1_Sub3_Sub1_10;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "I")
	private int anInt924;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "I")
	private int anInt925;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "I")
	private int anInt926;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "Lclient!LXDDKEZF;")
	private Class17 aClass17_1;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "I")
	private int anInt927;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "I")
	private int anInt929;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "Lclient!NUXITFPR;")
	private Class3_Sub1_Sub3_Sub2 aClass3_Sub1_Sub3_Sub2_6;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "Lclient!NUXITFPR;")
	private Class3_Sub1_Sub3_Sub2 aClass3_Sub1_Sub3_Sub2_7;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "I")
	private int anInt931;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
	private int anInt932;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "I")
	private int anInt933;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "I")
	private int anInt934;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "I")
	private int anInt935;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "I")
	private int anInt937;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "I")
	private int anInt938;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "I")
	private int anInt939;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "[[B")
	private byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "[I")
	private int[] anIntArray238;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "[I")
	private int[] anIntArray239;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "[I")
	private int[] anIntArray240;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "[I")
	private int[] anIntArray241;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "I")
	private int anInt942;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
	private int anInt943;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "I")
	private int anInt944;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
	private int anInt945;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
	private int anInt946;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
	private int anInt948;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "[I")
	private int[] anIntArray242;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "[I")
	private int[] anIntArray243;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "[I")
	private int[] anIntArray244;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "I")
	private int anInt949;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "I")
	private int anInt951;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "I")
	private int anInt952;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "I")
	private int anInt953;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "I")
	private int anInt954;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "I")
	private int anInt955;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "Lclient!TZRNBMTC;")
	private Class32 aClass32_10;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "Lclient!TZRNBMTC;")
	private Class32 aClass32_11;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "Lclient!TZRNBMTC;")
	private Class32 aClass32_12;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "Lclient!TZRNBMTC;")
	private Class32 aClass32_13;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "Lclient!TZRNBMTC;")
	private Class32 aClass32_14;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "Lclient!TZRNBMTC;")
	private Class32 aClass32_15;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "Lclient!TZRNBMTC;")
	private Class32 aClass32_16;

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "Lclient!TZRNBMTC;")
	private Class32 aClass32_17;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "Lclient!TZRNBMTC;")
	private Class32 aClass32_18;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "I")
	private int anInt957;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "I")
	private int anInt958;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "I")
	private int anInt959;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "I")
	private int anInt960;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "I")
	private int anInt963;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "I")
	private int anInt964;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "I")
	private int anInt965;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "I")
	private int anInt966;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
	private int anInt967;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "I")
	private int anInt968;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "Lclient!ZEOHBQWT;")
	private Class49 aClass49_1;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "I")
	private int anInt969;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "I")
	private int anInt970;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "I")
	private int anInt974;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "I")
	private int anInt975;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "Lclient!KZTQXFDC;")
	private Class3_Sub1_Sub3_Sub1 aClass3_Sub1_Sub3_Sub1_11;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "Lclient!KZTQXFDC;")
	private Class3_Sub1_Sub3_Sub1 aClass3_Sub1_Sub3_Sub1_12;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "I")
	private int anInt976;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "Lclient!NUXITFPR;")
	private Class3_Sub1_Sub3_Sub2 aClass3_Sub1_Sub3_Sub2_8;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "I")
	private int anInt977;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "I")
	private int anInt978;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
	private int anInt979;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
	private int anInt980;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
	private int anInt981;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
	private int anInt982;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "I")
	private int anInt983;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "I")
	private int anInt984;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
	private int anInt985;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "I")
	private int anInt986;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "I")
	private int anInt987;

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "I")
	private int anInt988;

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "Ljava/lang/String;")
	private String aString27;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "[I")
	private int[] anIntArray257;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "[I")
	private int[] anIntArray258;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "I")
	private int anInt990;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "I")
	private int anInt991;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "I")
	private int anInt992;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "I")
	private int anInt993;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "I")
	private int anInt994;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "Lclient!NUXITFPR;")
	private Class3_Sub1_Sub3_Sub2 aClass3_Sub1_Sub3_Sub2_9;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "Lclient!NUXITFPR;")
	private Class3_Sub1_Sub3_Sub2 aClass3_Sub1_Sub3_Sub2_10;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "I")
	private int anInt995;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "I")
	private int anInt997;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "I")
	private int anInt998;

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
	private int anInt999;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "I")
	private int anInt1000;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "I")
	private int anInt1005;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "I")
	private int anInt1006;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "I")
	private int anInt1007;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "I")
	private int anInt1008;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "I")
	private int anInt1009;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "I")
	private int anInt1010;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "I")
	private int anInt1013;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "I")
	private int anInt1014;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "I")
	private int anInt1016;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "I")
	private int anInt1017;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "I")
	private int anInt1018;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
	private int anInt1019;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "I")
	private int anInt1022;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "I")
	private int anInt1024;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "I")
	private int anInt1028;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
	private int anInt1029;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "I")
	private int anInt1031;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "I")
	private int anInt1032;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "I")
	private int anInt1033;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
	private int anInt1034;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "I")
	private int anInt1035;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "Lclient!DTIATKJO;")
	private Class7 aClass7_2;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "Lclient!THSQSAVT;")
	private Class3_Sub1_Sub3_Sub4 aClass3_Sub1_Sub3_Sub4_2;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "Lclient!THSQSAVT;")
	private Class3_Sub1_Sub3_Sub4 aClass3_Sub1_Sub3_Sub4_3;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "Lclient!THSQSAVT;")
	private Class3_Sub1_Sub3_Sub4 aClass3_Sub1_Sub3_Sub4_4;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "Lclient!THSQSAVT;")
	private Class3_Sub1_Sub3_Sub4 aClass3_Sub1_Sub3_Sub4_5;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "I")
	private int anInt1039;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "I")
	private int anInt1040;

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "I")
	private int anInt1041;

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "Lclient!NUXITFPR;")
	private Class3_Sub1_Sub3_Sub2 aClass3_Sub1_Sub3_Sub2_11;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "I")
	private int anInt1043;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "I")
	private int anInt1044;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "I")
	private int anInt1045;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "I")
	private int anInt1047;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "Lclient!KZTQXFDC;")
	private Class3_Sub1_Sub3_Sub1 aClass3_Sub1_Sub3_Sub1_13;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "Lclient!KZTQXFDC;")
	private Class3_Sub1_Sub3_Sub1 aClass3_Sub1_Sub3_Sub1_14;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "Lclient!KZTQXFDC;")
	private Class3_Sub1_Sub3_Sub1 aClass3_Sub1_Sub3_Sub1_15;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "Lclient!KZTQXFDC;")
	private Class3_Sub1_Sub3_Sub1 aClass3_Sub1_Sub3_Sub1_16;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "Lclient!KZTQXFDC;")
	private Class3_Sub1_Sub3_Sub1 aClass3_Sub1_Sub3_Sub1_17;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "I")
	private int anInt1049;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "I")
	private int anInt1050;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "I")
	private int anInt1052;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "I")
	private int anInt1053;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "I")
	private int anInt1054;

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "I")
	private int anInt1055;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "Ljava/lang/String;")
	private String aString30;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "Lclient!NUXITFPR;")
	private Class3_Sub1_Sub3_Sub2 aClass3_Sub1_Sub3_Sub2_12;

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "Lclient!NUXITFPR;")
	private Class3_Sub1_Sub3_Sub2 aClass3_Sub1_Sub3_Sub2_13;

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "Lclient!NUXITFPR;")
	private Class3_Sub1_Sub3_Sub2 aClass3_Sub1_Sub3_Sub2_14;

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "Lclient!NUXITFPR;")
	private Class3_Sub1_Sub3_Sub2 aClass3_Sub1_Sub3_Sub2_15;

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "Lclient!NUXITFPR;")
	private Class3_Sub1_Sub3_Sub2 aClass3_Sub1_Sub3_Sub2_16;

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "I")
	private int anInt1056;

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "I")
	private int anInt1059;

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "I")
	private int anInt1060;

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "[Lclient!KZTQXFDC;")
	private Class3_Sub1_Sub3_Sub1[] aClass3_Sub1_Sub3_Sub1Array4;

	@OriginalMember(owner = "client!client", name = "Kj", descriptor = "I")
	private int anInt1063;

	@OriginalMember(owner = "client!client", name = "Nj", descriptor = "I")
	private int anInt1066;

	@OriginalMember(owner = "client!client", name = "Oj", descriptor = "I")
	private int anInt1067;

	@OriginalMember(owner = "client!client", name = "Pj", descriptor = "I")
	private int anInt1068;

	@OriginalMember(owner = "client!client", name = "Sj", descriptor = "Lclient!KZTQXFDC;")
	private Class3_Sub1_Sub3_Sub1 aClass3_Sub1_Sub3_Sub1_18;

	@OriginalMember(owner = "client!client", name = "Tj", descriptor = "Lclient!KZTQXFDC;")
	private Class3_Sub1_Sub3_Sub1 aClass3_Sub1_Sub3_Sub1_19;

	@OriginalMember(owner = "client!client", name = "Uj", descriptor = "Lclient!KZTQXFDC;")
	private Class3_Sub1_Sub3_Sub1 aClass3_Sub1_Sub3_Sub1_20;

	@OriginalMember(owner = "client!client", name = "Wj", descriptor = "Lclient!NUXITFPR;")
	private Class3_Sub1_Sub3_Sub2 aClass3_Sub1_Sub3_Sub2_17;

	@OriginalMember(owner = "client!client", name = "bk", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!client", name = "ck", descriptor = "Lclient!TZRNBMTC;")
	private Class32 aClass32_19;

	@OriginalMember(owner = "client!client", name = "dk", descriptor = "Lclient!TZRNBMTC;")
	private Class32 aClass32_20;

	@OriginalMember(owner = "client!client", name = "ek", descriptor = "Lclient!TZRNBMTC;")
	private Class32 aClass32_21;

	@OriginalMember(owner = "client!client", name = "fk", descriptor = "Lclient!TZRNBMTC;")
	private Class32 aClass32_22;

	@OriginalMember(owner = "client!client", name = "gk", descriptor = "Lclient!TZRNBMTC;")
	private Class32 aClass32_23;

	@OriginalMember(owner = "client!client", name = "hk", descriptor = "Lclient!TZRNBMTC;")
	private Class32 aClass32_24;

	@OriginalMember(owner = "client!client", name = "ik", descriptor = "Lclient!TZRNBMTC;")
	private Class32 aClass32_25;

	@OriginalMember(owner = "client!client", name = "jk", descriptor = "Lclient!TZRNBMTC;")
	private Class32 aClass32_26;

	@OriginalMember(owner = "client!client", name = "kk", descriptor = "Lclient!TZRNBMTC;")
	private Class32 aClass32_27;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "I")
	private int anInt842 = -1;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "I")
	private int anInt843 = -1;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "I")
	private int anInt846 = -1;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "[Lclient!NUXITFPR;")
	private Class3_Sub1_Sub3_Sub2[] aClass3_Sub1_Sub3_Sub2Array4 = new Class3_Sub1_Sub3_Sub2[100];

	@OriginalMember(owner = "client!client", name = "X", descriptor = "Z")
	private volatile boolean aBoolean198 = false;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "I")
	private int anInt847 = 1;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
	private int anInt848 = -1;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
	private int anInt849 = -754;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "[[I")
	private int[][] anIntArrayArray22 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "Ljava/lang/String;")
	private String aString19 = "";

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "Z")
	private boolean aBoolean200 = false;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
	private int anInt852 = -1;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "Z")
	private boolean aBoolean201 = true;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "[I")
	private int[] anIntArray216 = new int[33];

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "Z")
	private boolean aBoolean202 = false;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
	private int anInt854 = 2301979;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "[I")
	private int[] anIntArray217 = new int[5];

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
	private int anInt855 = -1;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "B")
	private byte aByte39 = 6;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "Ljava/lang/String;")
	private String aString20 = "";

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "Ljava/lang/String;")
	private String aString21 = "";

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "I")
	private int anInt863 = 481;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "[Lclient!NUXITFPR;")
	private Class3_Sub1_Sub3_Sub2[] aClass3_Sub1_Sub3_Sub2Array5 = new Class3_Sub1_Sub3_Sub2[32];

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "I")
	private int anInt873 = 50;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "[I")
	private int[] anIntArray218 = new int[this.anInt873];

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "[I")
	private int[] anIntArray219 = new int[this.anInt873];

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "[I")
	private int[] anIntArray220 = new int[this.anInt873];

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "[I")
	private int[] anIntArray221 = new int[this.anInt873];

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "[I")
	private int[] anIntArray222 = new int[this.anInt873];

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "[I")
	private int[] anIntArray223 = new int[this.anInt873];

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "[I")
	private int[] anIntArray224 = new int[this.anInt873];

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8 = new String[this.anInt873];

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "Z")
	private boolean aBoolean203 = true;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "Z")
	private boolean aBoolean204 = false;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "[I")
	private int[] anIntArray225 = new int[4000];

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "[I")
	private int[] anIntArray226 = new int[4000];

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "I")
	private int anInt875 = -1;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "[B")
	private byte[] aByteArray21 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "Z")
	private boolean aBoolean205 = false;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "Z")
	private boolean aBoolean206 = true;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9 = new String[5];

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "[Z")
	private boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "Z")
	private boolean aBoolean207 = false;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "I")
	private int anInt879 = -1;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "[[I")
	private int[][] anIntArrayArray23 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "[Lclient!NUXITFPR;")
	private Class3_Sub1_Sub3_Sub2[] aClass3_Sub1_Sub3_Sub2Array6 = new Class3_Sub1_Sub3_Sub2[32];

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "[I")
	private int[] anIntArray227 = new int[100];

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray10 = new String[100];

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11 = new String[100];

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "[[[Lclient!VYBZTNTY;")
	private Class38[][][] aClass38ArrayArrayArray1 = new Class38[4][104][104];

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "I")
	private int anInt886 = 60;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "[I")
	private int[] anIntArray228 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "I")
	private int anInt888 = 2;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
	private int anInt889 = 8;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "B")
	private byte aByte40 = 3;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "[Lclient!NUXITFPR;")
	private Class3_Sub1_Sub3_Sub2[] aClass3_Sub1_Sub3_Sub2Array7 = new Class3_Sub1_Sub3_Sub2[8];

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "Z")
	private boolean aBoolean208 = false;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "Z")
	private boolean aBoolean209 = true;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "Z")
	private boolean aBoolean210 = false;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "I")
	private int anInt901 = -1;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "I")
	private int anInt903 = -36645;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "I")
	private int anInt904 = 1;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "B")
	private byte aByte41 = 4;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "I")
	private int anInt907 = 1;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "I")
	private final int anInt911 = 100;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "[I")
	private int[] anIntArray230 = new int[100];

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "B")
	private byte aByte42 = 109;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "Z")
	private boolean aBoolean211 = false;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12 = new String[200];

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "[I")
	private int[] anIntArray231 = new int[200];

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "I")
	private int anInt921 = 690;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "[I")
	private int[] anIntArray234 = new int[5];

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "Z")
	private boolean aBoolean212 = false;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "Z")
	private boolean aBoolean213 = true;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "[I")
	private int[] anIntArray235 = new int[5];

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "[Z")
	private boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "Z")
	public boolean aBoolean214 = false;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "Z")
	private boolean aBoolean215 = true;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "Z")
	private boolean aBoolean216 = true;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "[J")
	private long[] aLongArray3 = new long[200];

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
	private int anInt928 = 7759444;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "I")
	private int anInt930 = -7597;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "Z")
	private boolean aBoolean217 = true;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "Lclient!VYBZTNTY;")
	private Class38 aClass38_10 = new Class38((byte) 55);

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "[Lclient!NUXITFPR;")
	private Class3_Sub1_Sub3_Sub2[] aClass3_Sub1_Sub3_Sub2Array8 = new Class3_Sub1_Sub3_Sub2[1000];

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "[I")
	private int[] anIntArray236 = new int[5];

	@OriginalMember(owner = "client!client", name = "De", descriptor = "Lclient!GHHPHSRU;")
	private Class3_Sub1_Sub2 aClass3_Sub1_Sub2_6 = Class3_Sub1_Sub2.method77();

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "[Lclient!XBMRDXRN;")
	private Class43[] aClass43Array1 = new Class43[4];

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "Z")
	private boolean aBoolean218 = false;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13 = new String[500];

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "Ljava/lang/String;")
	private String aString23 = "";

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "Z")
	private boolean aBoolean219 = true;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "[I")
	private int[] anIntArray237 = new int[Class19.anInt490];

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "Z")
	private boolean aBoolean220 = false;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "Z")
	private boolean aBoolean221 = false;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "Z")
	private boolean aBoolean222 = false;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "Z")
	private boolean aBoolean225 = false;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "B")
	private byte aByte43 = -10;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
	private int anInt947 = -1;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "I")
	private int anInt950 = 2;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "Z")
	private boolean aBoolean226 = false;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "Z")
	private boolean aBoolean227 = false;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "Z")
	private boolean aBoolean228 = true;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "[I")
	private int[] anIntArray245 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "[I")
	private int[] anIntArray246 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "[Lclient!KZTQXFDC;")
	private Class3_Sub1_Sub3_Sub1[] aClass3_Sub1_Sub3_Sub1Array2 = new Class3_Sub1_Sub3_Sub1[2];

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "[I")
	private int[] anIntArray247 = new int[Class19.anInt490];

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "Ljava/lang/String;")
	private String aString24 = "";

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "Ljava/lang/String;")
	private String aString25 = "";

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "B")
	private byte aByte44 = 94;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "[I")
	private int[] anIntArray248 = new int[] { 17, 24, 34, 40 };

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "[I")
	private int[] anIntArray249 = new int[5];

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "B")
	private byte aByte45 = 67;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "[I")
	private int[] anIntArray250 = new int[50];

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "Lclient!EKHKDMUP;")
	private Class9 aClass9_1 = new Class9();

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "I")
	private int anInt971 = -1;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
	private int anInt972 = -1;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "Z")
	private boolean aBoolean229 = false;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "[Lclient!NUXITFPR;")
	private Class3_Sub1_Sub3_Sub2[] aClass3_Sub1_Sub3_Sub2Array9 = new Class3_Sub1_Sub3_Sub2[20];

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "[I")
	private int[] anIntArray251 = new int[151];

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "[I")
	private int[] anIntArray252 = new int[Class19.anInt490];

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "Z")
	private boolean aBoolean230 = true;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "B")
	private byte aByte46 = 4;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8 = new int[4][13][13];

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "[I")
	private int[] anIntArray253 = new int[500];

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "[I")
	private int[] anIntArray254 = new int[500];

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "[I")
	private int[] anIntArray255 = new int[500];

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "[I")
	private int[] anIntArray256 = new int[500];

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "Z")
	private boolean aBoolean231 = true;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "Z")
	private boolean aBoolean232 = false;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "Z")
	private boolean aBoolean233 = false;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "Ljava/lang/String;")
	private String aString26 = "";

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "Lclient!VYBZTNTY;")
	private Class38 aClass38_11 = new Class38((byte) 55);

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "Z")
	private volatile boolean aBoolean234 = false;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "Ljava/lang/String;")
	private String aString28 = "";

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "[I")
	private int[] anIntArray259 = new int[50];

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "[I")
	private int[] anIntArray260 = new int[7];

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "Lclient!GHHPHSRU;")
	private Class3_Sub1_Sub2 aClass3_Sub1_Sub2_7 = Class3_Sub1_Sub2.method77();

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "Z")
	private volatile boolean aBoolean235 = false;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "[I")
	private int[] anIntArray261 = new int[151];

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "Lclient!VYBZTNTY;")
	private Class38 aClass38_12 = new Class38((byte) 55);

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "Z")
	private boolean aBoolean236 = false;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "Ljava/lang/String;")
	private String aString29 = "";

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "Z")
	private boolean aBoolean237 = false;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "Z")
	private boolean aBoolean238 = true;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "[I")
	private final int[] anIntArray262 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "I")
	private int anInt996 = -1;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "Lclient!GHHPHSRU;")
	private Class3_Sub1_Sub2 aClass3_Sub1_Sub2_8 = new Class3_Sub1_Sub2(-527, new byte[5000]);

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "[Lclient!LJAXEEYT;")
	private Class3_Sub1_Sub1_Sub1_Sub2[] aClass3_Sub1_Sub1_Sub1_Sub2Array1 = new Class3_Sub1_Sub1_Sub1_Sub2[16384];

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "[I")
	private int[] anIntArray263 = new int[16384];

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "Z")
	private boolean aBoolean239 = true;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "Z")
	private boolean aBoolean241 = true;

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "Z")
	private boolean aBoolean242 = false;

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "I")
	private int anInt1002 = 3353893;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "I")
	private int anInt1004 = 5063219;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "I")
	private int anInt1011 = -1;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "Z")
	private boolean aBoolean243 = false;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "I")
	private int anInt1015 = 1;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "Z")
	private boolean aBoolean244 = false;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "[I")
	private int[] anIntArray265 = new int[50];

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "I")
	private int anInt1021 = 5;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "I")
	private int anInt1023 = 78;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "Z")
	private boolean aBoolean245 = true;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "I")
	private int anInt1026 = 2048;

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "I")
	private int anInt1027 = 2047;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "[Lclient!EJJAKGTE;")
	private Class3_Sub1_Sub1_Sub1_Sub1[] aClass3_Sub1_Sub1_Sub1_Sub1Array1 = new Class3_Sub1_Sub1_Sub1_Sub1[this.anInt1026];

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "[I")
	private int[] anIntArray266 = new int[this.anInt1026];

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "[I")
	private int[] anIntArray267 = new int[this.anInt1026];

	@OriginalMember(owner = "client!client", name = "si", descriptor = "[Lclient!GHHPHSRU;")
	private Class3_Sub1_Sub2[] aClass3_Sub1_Sub2Array1 = new Class3_Sub1_Sub2[this.anInt1026];

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "B")
	private byte aByte47 = 37;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "[Lclient!KZTQXFDC;")
	private Class3_Sub1_Sub3_Sub1[] aClass3_Sub1_Sub3_Sub1Array3 = new Class3_Sub1_Sub3_Sub1[13];

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "Z")
	private boolean aBoolean246 = true;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "Z")
	private boolean aBoolean247 = false;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "I")
	private int anInt1037 = -1;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "[I")
	private int[] anIntArray268 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "[Lclient!XEGQQHIM;")
	public Class44[] aClass44Array1 = new Class44[5];

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "[J")
	private long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
	private int anInt1042 = 128;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
	private int anInt1046 = -73;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "I")
	private int anInt1048 = -401;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "I")
	private int anInt1051 = -1;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "Z")
	private boolean aBoolean250 = false;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "Lclient!GHHPHSRU;")
	private Class3_Sub1_Sub2 aClass3_Sub1_Sub2_9 = Class3_Sub1_Sub2.method77();

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "I")
	private int anInt1057 = -184;

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "I")
	private int anInt1058 = 3;

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "Z")
	private boolean aBoolean251 = false;

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "I")
	private int anInt1061 = 2;

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "[Lclient!KZTQXFDC;")
	private Class3_Sub1_Sub3_Sub1[] aClass3_Sub1_Sub3_Sub1Array5 = new Class3_Sub1_Sub3_Sub1[100];

	@OriginalMember(owner = "client!client", name = "Jj", descriptor = "[I")
	private int[] anIntArray270 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Rj", descriptor = "[Lclient!NUXITFPR;")
	private Class3_Sub1_Sub3_Sub2[] aClass3_Sub1_Sub3_Sub2Array10 = new Class3_Sub1_Sub3_Sub2[32];

	@OriginalMember(owner = "client!client", name = "Vj", descriptor = "I")
	private int anInt1070 = -300;

	@OriginalMember(owner = "client!client", name = "Xj", descriptor = "[I")
	private int[] anIntArray271 = new int[9];

	@OriginalMember(owner = "client!client", name = "Yj", descriptor = "[I")
	public int[] anIntArray272 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Zj", descriptor = "[I")
	private int[] anIntArray273 = new int[256];

	@OriginalMember(owner = "client!client", name = "ak", descriptor = "[I")
	private int[] anIntArray274 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "lk", descriptor = "[I")
	private int[] anIntArray275 = new int[33];

	static {
		@Pc(11) int local11 = 2;
		@Pc(13) int local13;
		for (local13 = 0; local13 < 32; local13++) {
			anIntArray229[local13] = local11 - 1;
			local11 += local11;
		}
		aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		anInt936 = -347;
		anInt940 = 10;
		aBoolean223 = true;
		anInt973 = 927;
		anIntArray264 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		anInt1038 = -550;
		anIntArrayArray25 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
		anIntArray269 = new int[99];
		local11 = 0;
		for (local13 = 0; local13 < 99; local13++) {
			@Pc(382) int local382 = local13 + 1;
			@Pc(395) int local395 = (int) ((double) local382 + Math.pow(2.0D, (double) local382 / 7.0D) * 300.0D);
			local11 += local395;
			anIntArray269[local13] = local11 / 4;
		}
		anInt1065 = 22558;
		anInt1069 = 32443;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)Ljava/lang/String;")
	private static String method606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("16686, " + arg0 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 345);
			if (arg0.length == 5) {
				anInt940 = Integer.parseInt(arg0[0]);
				anInt941 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method638(694);
				} else if (arg0[2].equals("highmem")) {
					method713();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean223 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean223 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt1073 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method574(anInt973);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private static void method638(@OriginalArg(0) int arg0) {
		try {
			Class17.aBoolean86 = true;
			@Pc(5) boolean local5 = false;
			Class3_Sub1_Sub3_Sub3.aBoolean139 = true;
			aBoolean224 = true;
			Class23.aBoolean127 = true;
			Class18.aBoolean93 = true;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("96169, " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)Ljava/lang/String;")
	private static String method674(@OriginalArg(0) int arg0) {
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
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("50171, " + arg0 + ", " + -118 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private static void method713() {
		try {
			Class17.aBoolean86 = false;
			Class3_Sub1_Sub3_Sub3.aBoolean139 = false;
			aBoolean224 = false;
			Class23.aBoolean127 = false;
			Class18.aBoolean93 = false;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("89516, " + false + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(III)Ljava/lang/String;")
	private static String method714(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(12) int local12 = arg0 - arg1;
			if (local12 < -9) {
				return "@red@";
			} else if (local12 < -6) {
				return "@or3@";
			} else if (local12 < -3) {
				return "@or2@";
			} else if (local12 < 0) {
				return "@or1@";
			} else if (local12 > 9) {
				return "@gre@";
			} else if (local12 > 6) {
				return "@gr3@";
			} else if (local12 > 3) {
				return "@gr2@";
			} else if (local12 > 0) {
				return "@gr1@";
			} else {
				return "@yel@";
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("81542, " + 854 + ", " + arg0 + ", " + arg1 + ", " + local53.toString());
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
				return new URL("http://127.0.0.1:" + (anInt941 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method587() {
		try {
			if (this.aClass32_10 == null) {
				super.aClass32_2 = null;
				this.aClass32_9 = null;
				this.aClass32_7 = null;
				this.aClass32_6 = null;
				this.aClass32_8 = null;
				this.aClass32_3 = null;
				this.aClass32_4 = null;
				this.aClass32_5 = null;
				this.aClass32_13 = new Class32(128, this.method584((byte) 9), 265, 9);
				Class3_Sub1_Sub3.method430();
				this.aClass32_14 = new Class32(128, this.method584((byte) 9), 265, 9);
				Class3_Sub1_Sub3.method430();
				this.aClass32_10 = new Class32(509, this.method584((byte) 9), 171, 9);
				Class3_Sub1_Sub3.method430();
				this.aClass32_11 = new Class32(360, this.method584((byte) 9), 132, 9);
				Class3_Sub1_Sub3.method430();
				this.aClass32_12 = new Class32(360, this.method584((byte) 9), 200, 9);
				Class3_Sub1_Sub3.method430();
				this.aClass32_15 = new Class32(202, this.method584((byte) 9), 238, 9);
				Class3_Sub1_Sub3.method430();
				this.aClass32_16 = new Class32(203, this.method584((byte) 9), 238, 9);
				Class3_Sub1_Sub3.method430();
				this.aClass32_17 = new Class32(74, this.method584((byte) 9), 94, 9);
				Class3_Sub1_Sub3.method430();
				this.aClass32_18 = new Class32(75, this.method584((byte) 9), 94, 9);
				Class3_Sub1_Sub3.method430();
				if (this.aClass7_2 != null) {
					this.method649();
					this.method592(anInt936);
				}
				this.aBoolean227 = true;
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("27510, " + 51 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	private void method588() {
		try {
			if (aBoolean224 && this.anInt877 == 2 && Class23.anInt568 != this.anInt862) {
				this.method644("Loading - please wait.", null);
				this.anInt877 = 1;
				this.aLong30 = System.currentTimeMillis();
			}
			if (this.anInt877 == 1) {
				@Pc(35) int local35 = this.method589();
				if (local35 != 0 && System.currentTimeMillis() - this.aLong30 > 360000L) {
					signlink.reporterror(this.aString20 + " glcfb " + this.aLong29 + "," + local35 + "," + aBoolean224 + "," + this.aClass44Array1[0] + "," + this.aClass6_Sub1_1.method540() + "," + this.anInt862 + "," + this.anInt892 + "," + this.anInt893);
					this.aLong30 = System.currentTimeMillis();
				}
			}
			if (this.anInt877 == 2 && this.anInt862 != this.anInt996) {
				this.anInt996 = this.anInt862;
				this.method639(this.anInt862);
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("56694, " + -831 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)I")
	private int method589() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray6.length; local3++) {
				if (this.aByteArrayArray6[local3] == null && this.anIntArray243[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray5[local3] == null && this.anIntArray244[local3] != -1) {
					return -2;
				}
			}
			@Pc(39) boolean local39 = true;
			this.aBoolean214 &= true;
			for (@Pc(47) int local47 = 0; local47 < this.aByteArrayArray6.length; local47++) {
				@Pc(54) byte[] local54 = this.aByteArrayArray5[local47];
				if (local54 != null) {
					@Pc(68) int local68 = (this.anIntArray242[local47] >> 8) * 64 - this.anInt866;
					@Pc(80) int local80 = (this.anIntArray242[local47] & 0xFF) * 64 - this.anInt867;
					if (this.aBoolean210) {
						local68 = 10;
						local80 = 10;
					}
					local39 &= Class23.method364(local80, local54, local68);
				}
			}
			if (!local39) {
				return -3;
			} else if (this.aBoolean212) {
				return -4;
			} else {
				this.anInt877 = 2;
				Class23.anInt568 = this.anInt862;
				this.method640();
				this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 211);
				return 0;
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("46997, " + true + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!EKHKDMUP;ZI)I")
	private int method590(@OriginalArg(0) Class9 arg0, @OriginalArg(2) int arg1) {
		try {
			if (arg0.anIntArrayArray1 == null || arg1 >= arg0.anIntArrayArray1.length) {
				return -2;
			}
			try {
				@Pc(21) int[] local21 = arg0.anIntArrayArray1[arg1];
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
						local34 = this.anIntArray252[local21[local25++]];
					}
					if (local32 == 2) {
						local34 = this.anIntArray237[local21[local25++]];
					}
					if (local32 == 3) {
						local34 = this.anIntArray247[local21[local25++]];
					}
					@Pc(82) Class9 local82;
					@Pc(87) int local87;
					@Pc(100) int local100;
					if (local32 == 4) {
						local82 = Class9.method58(local21[local25++]);
						local87 = local21[local25++];
						if (local87 >= 0 && local87 < Class50.anInt795 && (!Class50.method562(local87).aBoolean192 || aBoolean223)) {
							for (local100 = 0; local100 < local82.anIntArray27.length; local100++) {
								if (local82.anIntArray27[local100] == local87 + 1) {
									local34 += local82.anIntArray34[local100];
								}
							}
						}
					}
					if (local32 == 5) {
						local34 = this.anIntArray272[local21[local25++]];
					}
					if (local32 == 6) {
						local34 = anIntArray269[this.anIntArray237[local21[local25++]] - 1];
					}
					if (local32 == 7) {
						local34 = this.anIntArray272[local21[local25++]] * 100 / 46875;
					}
					if (local32 == 8) {
						local34 = aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt188;
					}
					@Pc(175) int local175;
					if (local32 == 9) {
						for (local175 = 0; local175 < Class19.anInt490; local175++) {
							if (Class19.aBooleanArray6[local175]) {
								local34 += this.anIntArray237[local175];
							}
						}
					}
					if (local32 == 10) {
						local82 = Class9.method58(local21[local25++]);
						local87 = local21[local25++] + 1;
						if (local87 >= 0 && local87 < Class50.anInt795 && (!Class50.method562(local87).aBoolean192 || aBoolean223)) {
							for (local100 = 0; local100 < local82.anIntArray27.length; local100++) {
								if (local82.anIntArray27[local100] == local87) {
									local34 = 999999999;
									break;
								}
							}
						}
					}
					if (local32 == 11) {
						local34 = this.anInt958;
					}
					if (local32 == 12) {
						local34 = this.anInt999;
					}
					if (local32 == 13) {
						local175 = this.anIntArray272[local21[local25++]];
						local87 = local21[local25++];
						local34 = (local175 & 0x1 << local87) == 0 ? 0 : 1;
					}
					if (local32 == 14) {
						local175 = local21[local25++];
						@Pc(289) Class22 local289 = Class22.aClass22Array1[local175];
						local100 = local289.anInt529;
						@Pc(295) int local295 = local289.anInt530;
						@Pc(298) int local298 = local289.anInt531;
						@Pc(304) int local304 = anIntArray229[local298 - local295];
						local34 = this.anIntArray272[local100] >> local295 & local304;
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
						local34 = (aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt380 >> 7) + this.anInt866;
					}
					if (local32 == 19) {
						local34 = (aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt381 >> 7) + this.anInt867;
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
			signlink.reporterror("73564, " + arg0 + ", " + false + ", " + arg1 + ", " + local400.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!EKHKDMUP;)Z")
	private boolean method591(@OriginalArg(1) Class9 arg0) {
		try {
			if (arg0.anIntArray33 == null) {
				return false;
			}
			for (@Pc(18) int local18 = 0; local18 < arg0.anIntArray33.length; local18++) {
				@Pc(26) int local26 = this.method590(arg0, local18);
				@Pc(31) int local31 = arg0.anIntArray29[local18];
				if (arg0.anIntArray33[local18] == 2) {
					if (local26 >= local31) {
						return false;
					}
				} else if (arg0.anIntArray33[local18] == 3) {
					if (local26 <= local31) {
						return false;
					}
				} else if (arg0.anIntArray33[local18] == 4) {
					if (local26 == local31) {
						return false;
					}
				} else if (local26 != local31) {
					return false;
				}
			}
			return true;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("54782, " + 3 + ", " + arg0 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLjava/lang/String;)V")
	@Override
	protected void method586(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2) {
		try {
			this.anInt948 = arg0;
			this.aString22 = arg2;
			this.method587();
			if (this.aClass7_2 == null) {
				super.method586(arg0, aBoolean199, arg2);
			} else {
				this.aClass32_12.method459();
				if (!arg1) {
					this.aClass3_Sub1_Sub3_Sub4_4.method440(54, 180, 16777215, "RuneScape is loading - please wait...");
					Class3_Sub1_Sub3.method433(28, 304, 62, 9179409, 34);
					Class3_Sub1_Sub3.method433(29, 302, 63, 0, 32);
					Class3_Sub1_Sub3.method432(30, 64, arg0 * 3, 9179409, 30);
					Class3_Sub1_Sub3.method432(arg0 * 3 + 30, 64, 300 - arg0 * 3, 0, 30);
					this.aClass3_Sub1_Sub3_Sub4_4.method440(85, 180, 16777215, arg2);
					this.aClass32_12.method460(171, 202, super.aGraphics2);
					if (this.aBoolean227) {
						this.aBoolean227 = false;
						if (!this.aBoolean198) {
							this.aClass32_13.method460(0, 0, super.aGraphics2);
							this.aClass32_14.method460(0, 637, super.aGraphics2);
						}
						this.aClass32_10.method460(0, 128, super.aGraphics2);
						this.aClass32_11.method460(371, 202, super.aGraphics2);
						this.aClass32_15.method460(265, 0, super.aGraphics2);
						this.aClass32_16.method460(265, 562, super.aGraphics2);
						this.aClass32_17.method460(171, 128, super.aGraphics2);
						this.aClass32_18.method460(171, 562, super.aGraphics2);
					}
				}
			}
		} catch (@Pc(213) RuntimeException local213) {
			signlink.reporterror("42524, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local213.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	private void method592(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 0) {
				this.aClass3_Sub1_Sub3_Sub1_4 = new Class3_Sub1_Sub3_Sub1(this.aClass7_2, "titlebox", 0);
				this.aClass3_Sub1_Sub3_Sub1_5 = new Class3_Sub1_Sub3_Sub1(this.aClass7_2, "titlebutton", 0);
				this.aClass3_Sub1_Sub3_Sub1Array4 = new Class3_Sub1_Sub3_Sub1[12];
				for (@Pc(30) int local30 = 0; local30 < 12; local30++) {
					this.aClass3_Sub1_Sub3_Sub1Array4[local30] = new Class3_Sub1_Sub3_Sub1(this.aClass7_2, "runes", local30);
				}
				this.aClass3_Sub1_Sub3_Sub2_6 = new Class3_Sub1_Sub3_Sub2(128, 265);
				this.aClass3_Sub1_Sub3_Sub2_7 = new Class3_Sub1_Sub3_Sub2(128, 265);
				for (@Pc(63) int local63 = 0; local63 < 33920; local63++) {
					this.aClass3_Sub1_Sub3_Sub2_6.anIntArray83[local63] = this.aClass32_13.anIntArray171[local63];
				}
				for (@Pc(81) int local81 = 0; local81 < 33920; local81++) {
					this.aClass3_Sub1_Sub3_Sub2_7.anIntArray83[local81] = this.aClass32_14.anIntArray171[local81];
				}
				this.anIntArray213 = new int[256];
				for (@Pc(103) int local103 = 0; local103 < 64; local103++) {
					this.anIntArray213[local103] = local103 * 262144;
				}
				for (@Pc(118) int local118 = 0; local118 < 64; local118++) {
					this.anIntArray213[local118 + 64] = local118 * 1024 + 16711680;
				}
				for (@Pc(137) int local137 = 0; local137 < 64; local137++) {
					this.anIntArray213[local137 + 128] = local137 * 4 + 16776960;
				}
				for (@Pc(156) int local156 = 0; local156 < 64; local156++) {
					this.anIntArray213[local156 + 192] = 16777215;
				}
				this.anIntArray214 = new int[256];
				for (@Pc(175) int local175 = 0; local175 < 64; local175++) {
					this.anIntArray214[local175] = local175 * 1024;
				}
				for (@Pc(190) int local190 = 0; local190 < 64; local190++) {
					this.anIntArray214[local190 + 64] = local190 * 4 + 65280;
				}
				for (@Pc(209) int local209 = 0; local209 < 64; local209++) {
					this.anIntArray214[local209 + 128] = local209 * 262144 + 65535;
				}
				for (@Pc(228) int local228 = 0; local228 < 64; local228++) {
					this.anIntArray214[local228 + 192] = 16777215;
				}
				this.anIntArray215 = new int[256];
				for (@Pc(247) int local247 = 0; local247 < 64; local247++) {
					this.anIntArray215[local247] = local247 * 4;
				}
				for (@Pc(262) int local262 = 0; local262 < 64; local262++) {
					this.anIntArray215[local262 + 64] = local262 * 262144 + 255;
				}
				for (@Pc(281) int local281 = 0; local281 < 64; local281++) {
					this.anIntArray215[local281 + 128] = local281 * 1024 + 16711935;
				}
				for (@Pc(300) int local300 = 0; local300 < 64; local300++) {
					this.anIntArray215[local300 + 192] = 16777215;
				}
				this.anIntArray212 = new int[256];
				this.anIntArray232 = new int[32768];
				this.anIntArray233 = new int[32768];
				this.method670(null);
				this.anIntArray257 = new int[32768];
				this.anIntArray258 = new int[32768];
				this.method586(10, aBoolean199, "Connecting to fileserver");
				if (!this.aBoolean198) {
					this.aBoolean235 = true;
					this.aBoolean198 = true;
					this.method585(this, 2);
				}
			}
		} catch (@Pc(357) RuntimeException local357) {
			signlink.reporterror("7266, " + arg0 + ", " + local357.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt940 = Integer.parseInt(this.getParameter("nodeid"));
		anInt941 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method638(694);
		} else {
			method713();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean223 = false;
		} else {
			aBoolean223 = true;
		}
		this.method575(984);
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method593() {
		try {
			if (this.anInt915 == 0) {
				@Pc(6) int local6 = super.anInt836;
				if (this.anInt986 == 1 && super.anInt837 >= 516 && super.anInt838 >= 160 && super.anInt837 <= 765 && super.anInt838 <= 205) {
					local6 = 0;
				}
				@Pc(42) int local42;
				@Pc(45) int local45;
				@Pc(121) int local121;
				if (this.aBoolean226) {
					if (local6 != 1) {
						local42 = super.anInt831;
						local45 = super.anInt832;
						if (this.anInt1006 == 0) {
							local42 -= 4;
							local45 -= 4;
						}
						if (this.anInt1006 == 1) {
							local42 -= 553;
							local45 -= 205;
						}
						if (this.anInt1006 == 2) {
							local42 -= 17;
							local45 -= 357;
						}
						if (local42 < this.anInt1007 - 10 || local42 > this.anInt1007 + this.anInt1009 + 10 || local45 < this.anInt1008 - 10 || local45 > this.anInt1008 + this.anInt1010 + 10) {
							this.aBoolean226 = false;
							if (this.anInt1006 == 1) {
								this.aBoolean243 = true;
							}
							if (this.anInt1006 == 2) {
								this.aBoolean229 = true;
							}
						}
					}
					if (local6 == 1) {
						local42 = this.anInt1007;
						local45 = this.anInt1008;
						local121 = this.anInt1009;
						@Pc(124) int local124 = super.anInt837;
						@Pc(127) int local127 = super.anInt838;
						if (this.anInt1006 == 0) {
							local124 -= 4;
							local127 -= 4;
						}
						if (this.anInt1006 == 1) {
							local124 -= 553;
							local127 -= 205;
						}
						if (this.anInt1006 == 2) {
							local124 -= 17;
							local127 -= 357;
						}
						@Pc(146) int local146 = -1;
						for (@Pc(148) int local148 = 0; local148 < this.anInt1017; local148++) {
							@Pc(163) int local163 = local45 + (this.anInt1017 - 1 - local148) * 15 + 31;
							if (local124 > local42 && local124 < local42 + local121 && local127 > local163 - 13 && local127 < local163 + 3) {
								local146 = local148;
							}
						}
						if (local146 != -1) {
							this.method707(local146);
						}
						this.aBoolean226 = false;
						if (this.anInt1006 == 1) {
							this.aBoolean243 = true;
						}
						if (this.anInt1006 == 2) {
							this.aBoolean229 = true;
							return;
						}
					}
				} else {
					if (local6 == 1 && this.anInt1017 > 0) {
						local42 = this.anIntArray255[this.anInt1017 - 1];
						if (local42 == 592 || local42 == 637 || local42 == 148 || local42 == 708 || local42 == 306 || local42 == 17 || local42 == 994 || local42 == 840 || local42 == 68 || local42 == 910 || local42 == 874 || local42 == 1893) {
							local45 = this.anIntArray253[this.anInt1017 - 1];
							local121 = this.anIntArray254[this.anInt1017 - 1];
							@Pc(282) Class9 local282 = Class9.method58(local121);
							if (local282.aBoolean35 || local282.aBoolean38) {
								this.aBoolean233 = false;
								this.anInt1056 = 0;
								this.anInt913 = local121;
								this.anInt914 = local45;
								this.anInt915 = 2;
								this.anInt916 = super.anInt837;
								this.anInt917 = super.anInt838;
								if (Class9.method58(local121).anInt206 == this.anInt848) {
									this.anInt915 = 1;
								}
								if (Class9.method58(local121).anInt206 == this.anInt846) {
									this.anInt915 = 3;
								}
								return;
							}
						}
					}
					if (local6 == 1 && (this.anInt939 == 1 || this.method633((byte) 2, this.anInt1017 - 1)) && this.anInt1017 > 2) {
						local6 = 2;
					}
					if (local6 == 1 && this.anInt1017 > 0) {
						this.method707(this.anInt1017 - 1);
					}
					if (local6 != 2 || this.anInt1017 <= 0) {
						return;
					}
					this.method687();
				}
			}
		} catch (@Pc(375) RuntimeException local375) {
			signlink.reporterror("22475, " + 5 + ", " + local375.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!GHHPHSRU;II)V")
	private void method594(@OriginalArg(0) Class3_Sub1_Sub2 arg0, @OriginalArg(2) int arg1) {
		try {
			arg0.method99();
			@Pc(13) int local13 = arg0.method100(1, this.anInt1048);
			if (local13 != 0) {
				@Pc(22) int local22 = arg0.method100(2, this.anInt1048);
				if (local22 == 0) {
					this.anIntArray267[this.anInt1029++] = this.anInt1027;
				} else {
					@Pc(46) int local46;
					@Pc(57) int local57;
					if (local22 == 1) {
						local46 = arg0.method100(3, this.anInt1048);
						aClass3_Sub1_Sub1_Sub1_Sub1_1.method210(false, local46);
						local57 = arg0.method100(1, this.anInt1048);
						if (local57 == 1) {
							this.anIntArray267[this.anInt1029++] = this.anInt1027;
						}
					} else {
						@Pc(104) int local104;
						if (local22 == 2) {
							local46 = arg0.method100(3, this.anInt1048);
							aClass3_Sub1_Sub1_Sub1_Sub1_1.method210(true, local46);
							local57 = arg0.method100(3, this.anInt1048);
							aClass3_Sub1_Sub1_Sub1_Sub1_1.method210(true, local57);
							local104 = arg0.method100(1, this.anInt1048);
							if (local104 == 1) {
								this.anIntArray267[this.anInt1029++] = this.anInt1027;
							}
						} else if (local22 == 3) {
							local46 = arg0.method100(1, this.anInt1048);
							if (local46 == 1) {
								this.anIntArray267[this.anInt1029++] = this.anInt1027;
							}
							local57 = arg0.method100(7, this.anInt1048);
							local104 = arg0.method100(7, this.anInt1048);
							this.anInt862 = arg0.method100(2, this.anInt1048);
							@Pc(169) int local169 = arg0.method100(1, this.anInt1048);
							aClass3_Sub1_Sub1_Sub1_Sub1_1.method211(local104, local57, local169 == 1);
						}
					}
				}
			}
		} catch (@Pc(182) RuntimeException local182) {
			signlink.reporterror("4232, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local182.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Ljava/lang/String;")
	private String method595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			while (arg1 >= 0) {
				this.aBoolean211 = !this.aBoolean211;
			}
			if (arg0 < 999999999) {
				return String.valueOf(arg0);
			} else {
				return "*";
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("3324, " + arg0 + ", " + arg1 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	private void method596() {
		try {
			@Pc(13) int local13 = this.anInt1031 * 128 + 64;
			@Pc(20) int local20 = this.anInt1032 * 128 + 64;
			@Pc(31) int local31 = this.method601(local20, this.anInt862, local13) - this.anInt1033;
			if (this.anInt963 < local13) {
				this.anInt963 += this.anInt1034 + (local13 - this.anInt963) * this.anInt1035 / 1000;
				if (this.anInt963 > local13) {
					this.anInt963 = local13;
				}
			}
			if (this.anInt963 > local13) {
				this.anInt963 -= this.anInt1034 + (this.anInt963 - local13) * this.anInt1035 / 1000;
				if (this.anInt963 < local13) {
					this.anInt963 = local13;
				}
			}
			if (this.anInt964 < local31) {
				this.anInt964 += this.anInt1034 + (local31 - this.anInt964) * this.anInt1035 / 1000;
				if (this.anInt964 > local31) {
					this.anInt964 = local31;
				}
			}
			if (this.anInt964 > local31) {
				this.anInt964 -= this.anInt1034 + (this.anInt964 - local31) * this.anInt1035 / 1000;
				if (this.anInt964 < local31) {
					this.anInt964 = local31;
				}
			}
			if (this.anInt965 < local20) {
				this.anInt965 += this.anInt1034 + (local20 - this.anInt965) * this.anInt1035 / 1000;
				if (this.anInt965 > local20) {
					this.anInt965 = local20;
				}
			}
			if (this.anInt965 > local20) {
				this.anInt965 -= this.anInt1034 + (this.anInt965 - local20) * this.anInt1035 / 1000;
				if (this.anInt965 < local20) {
					this.anInt965 = local20;
				}
			}
			anInt956++;
			@Pc(222) int local222;
			if (anInt956 > 1352) {
				anInt956 = 0;
				this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 91);
				this.aClass3_Sub1_Sub2_7.method79(0);
				local222 = this.aClass3_Sub1_Sub2_7.anInt257;
				this.aClass3_Sub1_Sub2_7.method80(49556);
				this.aClass3_Sub1_Sub2_7.method79((int) (Math.random() * 256.0D));
				this.aClass3_Sub1_Sub2_7.method79((int) (Math.random() * 256.0D));
				this.aClass3_Sub1_Sub2_7.method79(217);
				this.aClass3_Sub1_Sub2_7.method79((int) (Math.random() * 256.0D));
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass3_Sub1_Sub2_7.method79(78);
				}
				this.aClass3_Sub1_Sub2_7.method80(22816);
				this.aClass3_Sub1_Sub2_7.method80((int) (Math.random() * 65536.0D));
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass3_Sub1_Sub2_7.method79(35);
				}
				this.aClass3_Sub1_Sub2_7.method79((int) (Math.random() * 256.0D));
				this.aClass3_Sub1_Sub2_7.method88(this.aClass3_Sub1_Sub2_7.anInt257 - local222);
			}
			local13 = this.anInt951 * 128 + 64;
			local20 = this.anInt952 * 128 + 64;
			local31 = this.method601(local20, this.anInt862, local13) - this.anInt953;
			local222 = local13 - this.anInt963;
			@Pc(331) int local331 = local31 - this.anInt964;
			@Pc(336) int local336 = local20 - this.anInt965;
			@Pc(347) int local347 = (int) Math.sqrt((double) (local222 * local222 + local336 * local336));
			@Pc(358) int local358 = (int) (Math.atan2((double) local331, (double) local347) * 325.949D) & 0x7FF;
			@Pc(369) int local369 = (int) (Math.atan2((double) local222, (double) local336) * -325.949D) & 0x7FF;
			if (local358 < 128) {
				local358 = 128;
			}
			if (local358 > 383) {
				local358 = 383;
			}
			if (this.anInt966 < local358) {
				this.anInt966 += this.anInt954 + (local358 - this.anInt966) * this.anInt955 / 1000;
				if (this.anInt966 > local358) {
					this.anInt966 = local358;
				}
			}
			if (this.anInt966 > local358) {
				this.anInt966 -= this.anInt954 + (this.anInt966 - local358) * this.anInt955 / 1000;
				if (this.anInt966 < local358) {
					this.anInt966 = local358;
				}
			}
			@Pc(440) int local440 = local369 - this.anInt967;
			if (local440 > 1024) {
				local440 -= 2048;
			}
			if (local440 < -1024) {
				local440 += 2048;
			}
			if (local440 > 0) {
				this.anInt967 += this.anInt954 + local440 * this.anInt955 / 1000;
				this.anInt967 &= 0x7FF;
			}
			if (local440 < 0) {
				this.anInt967 -= this.anInt954 + -local440 * this.anInt955 / 1000;
				this.anInt967 &= 0x7FF;
			}
			@Pc(498) int local498 = local369 - this.anInt967;
			if (local498 > 1024) {
				local498 -= 2048;
			}
			if (local498 < -1024) {
				local498 += 2048;
			}
			if (local498 < 0 && local440 > 0 || local498 > 0 && local440 < 0) {
				this.anInt967 = local369;
			}
		} catch (@Pc(519) RuntimeException local519) {
			signlink.reporterror("42542, " + 0 + ", " + local519.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	private void method597() {
		try {
			Class18.aClass35_7.method476();
			Class18.aClass35_6.method476();
			Class5.aClass35_2.method476();
			Class50.aClass35_8.method476();
			Class50.aClass35_9.method476();
			Class3_Sub1_Sub1_Sub1_Sub1.aClass35_3.method476();
			Class2.aClass35_1.method476();
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("54792, " + 1 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;I)V")
	private void method598(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		try {
			this.aBoolean214 &= true;
			if (arg2 == 0 && this.anInt875 != -1) {
				this.aString17 = arg1;
				super.anInt836 = 0;
			}
			if (this.anInt846 == -1) {
				this.aBoolean229 = true;
			}
			for (@Pc(26) int local26 = 99; local26 > 0; local26--) {
				this.anIntArray227[local26] = this.anIntArray227[local26 - 1];
				this.aStringArray10[local26] = this.aStringArray10[local26 - 1];
				this.aStringArray11[local26] = this.aStringArray11[local26 - 1];
			}
			this.anIntArray227[0] = arg2;
			this.aStringArray10[0] = arg0;
			this.aStringArray11[0] = arg1;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("38974, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method599() {
		try {
			@Pc(20) int local20;
			for (@Pc(12) int local12 = -1; local12 < this.anInt1028; local12++) {
				if (local12 == -1) {
					local20 = this.anInt1027;
				} else {
					local20 = this.anIntArray266[local12];
				}
				@Pc(32) Class3_Sub1_Sub1_Sub1_Sub1 local32 = this.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local20];
				if (local32 != null && local32.anInt370 > 0) {
					local32.anInt370--;
					if (local32.anInt370 == 0) {
						local32.aString10 = null;
					}
				}
			}
			for (local20 = 0; local20 < this.anInt997; local20++) {
				@Pc(63) int local63 = this.anIntArray263[local20];
				@Pc(68) Class3_Sub1_Sub1_Sub1_Sub2 local68 = this.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local63];
				if (local68 != null && local68.anInt370 > 0) {
					local68.anInt370--;
					if (local68.anInt370 == 0) {
						local68.aString10 = null;
					}
				}
			}
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("82830, " + -22637 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!GHHPHSRU;B)V")
	private void method600(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub2 arg1) {
		try {
			for (@Pc(14) int local14 = 0; local14 < this.anInt1029; local14++) {
				@Pc(21) int local21 = this.anIntArray267[local14];
				@Pc(26) Class3_Sub1_Sub1_Sub1_Sub2 local26 = this.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local21];
				@Pc(29) int local29 = arg1.method89();
				@Pc(36) int local36;
				@Pc(39) int local39;
				if ((local29 & 0x20) != 0) {
					local36 = arg1.method89();
					local39 = arg1.method89();
					local26.method212(local39, local36, anInt1003);
					local26.anInt409 = anInt1003 + 300;
					local26.anInt410 = arg1.method110();
					local26.anInt411 = arg1.method108();
				}
				if ((local29 & 0x1) != 0) {
					local36 = arg1.method91();
					if (local36 == 65535) {
						local36 = -1;
					}
					local39 = arg1.method109();
					if (local36 == local26.anInt375 && local36 != -1) {
						@Pc(88) int local88 = Class39.aClass39Array1[local36].anInt731;
						if (local88 == 1) {
							local26.anInt376 = 0;
							local26.anInt377 = 0;
							local26.anInt378 = local39;
							local26.anInt379 = 0;
						}
						if (local88 == 2) {
							local26.anInt379 = 0;
						}
					} else if (local36 == -1 || local26.anInt375 == -1 || Class39.aClass39Array1[local36].anInt725 >= Class39.aClass39Array1[local26.anInt375].anInt725) {
						local26.anInt375 = local36;
						local26.anInt376 = 0;
						local26.anInt377 = 0;
						local26.anInt378 = local39;
						local26.anInt379 = 0;
						local26.anInt402 = local26.anInt401;
					}
				}
				if ((local29 & 0x8) != 0) {
					local26.aClass5_2 = Class5.method24(arg1.method117());
					local26.anInt392 = local26.aClass5_2.aByte1;
					local26.anInt403 = local26.aClass5_2.anInt43;
					local26.anInt412 = local26.aClass5_2.anInt48;
					local26.anInt413 = local26.aClass5_2.anInt56;
					local26.anInt414 = local26.aClass5_2.anInt51;
					local26.anInt415 = local26.aClass5_2.anInt49;
					local26.anInt404 = local26.aClass5_2.anInt58;
				}
				if ((local29 & 0x4) != 0) {
					local26.aString10 = arg1.method96();
					local26.anInt370 = 100;
				}
				if ((local29 & 0x80) != 0) {
					local36 = arg1.method109();
					local39 = arg1.method108();
					local26.method212(local39, local36, anInt1003);
					local26.anInt409 = anInt1003 + 300;
					local26.anInt410 = arg1.method108();
					local26.anInt411 = arg1.method109();
				}
				if ((local29 & 0x2) != 0) {
					local26.anInt407 = arg1.method118();
					local26.anInt408 = arg1.method118();
				}
				if ((local29 & 0x40) != 0) {
					local26.anInt395 = arg1.method118();
					local36 = arg1.method123(this.aByte41);
					local26.anInt399 = local36 >> 16;
					local26.anInt398 = anInt1003 + (local36 & 0xFFFF);
					local26.anInt396 = 0;
					local26.anInt397 = 0;
					if (local26.anInt398 > anInt1003) {
						local26.anInt396 = -1;
					}
					if (local26.anInt395 == 65535) {
						local26.anInt395 = -1;
					}
				}
				if ((local29 & 0x10) != 0) {
					local26.anInt406 = arg1.method91();
					if (local26.anInt406 == 65535) {
						local26.anInt406 = -1;
					}
				}
			}
		} catch (@Pc(318) RuntimeException local318) {
			signlink.reporterror("46681, " + arg0 + ", " + arg1 + ", " + 6 + ", " + local318.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
	private int method601(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
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
			@Pc(48) int local48 = arg2 & 0x7F;
			@Pc(52) int local52 = arg0 & 0x7F;
			@Pc(80) int local80 = this.anIntArrayArrayArray7[local21][local3][local7] * (128 - local48) + this.anIntArrayArrayArray7[local21][local3 + 1][local7] * local48 >> 7;
			@Pc(112) int local112 = this.anIntArrayArrayArray7[local21][local3][local7 + 1] * (128 - local48) + this.anIntArrayArrayArray7[local21][local3 + 1][local7 + 1] * local48 >> 7;
			return local80 * (128 - local52) + local112 * local52 >> 7;
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("30637, " + arg0 + ", " + 215 + ", " + arg1 + ", " + arg2 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method602() {
		try {
			if (this.anInt926 == 0 && super.anInt836 == 1) {
				@Pc(24) int local24 = super.anInt837 - 25 - 550;
				@Pc(31) int local31 = super.anInt838 - 5 - 4;
				if (local24 >= 0 && local31 >= 0 && local24 < 146 && local31 < 151) {
					local24 -= 73;
					local31 -= 75;
					@Pc(51) int local51 = this.anInt1043 + this.anInt887 & 0x7FF;
					@Pc(55) int local55 = Class3_Sub1_Sub3_Sub3.anIntArray137[local51];
					@Pc(59) int local59 = Class3_Sub1_Sub3_Sub3.anIntArray138[local51];
					@Pc(68) int local68 = local55 * (this.anInt906 + 256) >> 8;
					@Pc(77) int local77 = local59 * (this.anInt906 + 256) >> 8;
					@Pc(87) int local87 = local31 * local68 + local24 * local77 >> 11;
					@Pc(97) int local97 = local31 * local77 - local24 * local68 >> 11;
					@Pc(104) int local104 = aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt380 + local87 >> 7;
					@Pc(111) int local111 = aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt381 - local97 >> 7;
					@Pc(132) boolean local132 = this.method631(local111, 0, local104, 0, 0, 0, 1, true, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray54[0], 0, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray55[0]);
					if (local132) {
						this.aClass3_Sub1_Sub2_7.method79(local24);
						this.aClass3_Sub1_Sub2_7.method79(local31);
						this.aClass3_Sub1_Sub2_7.method80(this.anInt1043);
						this.aClass3_Sub1_Sub2_7.method79(57);
						this.aClass3_Sub1_Sub2_7.method79(this.anInt887);
						this.aClass3_Sub1_Sub2_7.method79(this.anInt906);
						this.aClass3_Sub1_Sub2_7.method79(89);
						this.aClass3_Sub1_Sub2_7.method80(aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt380);
						this.aClass3_Sub1_Sub2_7.method80(aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt381);
						this.aClass3_Sub1_Sub2_7.method79(this.anInt899);
						this.aClass3_Sub1_Sub2_7.method79(63);
						return;
					}
				}
			}
		} catch (@Pc(186) RuntimeException local186) {
			signlink.reporterror("37736, " + 2259 + ", " + local186.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BIZ)V")
	private void method603(@OriginalArg(0) byte[] arg0, @OriginalArg(2) boolean arg1) {
		try {
			if (this.aBoolean216) {
				signlink.anInt1078 = arg1 ? 1 : 0;
				signlink.midisave(arg0, arg0.length);
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("60070, " + arg0 + ", " + -953 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILclient!NUXITFPR;I)V")
	private void method604(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub1_Sub3_Sub2 arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = this.anInt1043 + this.anInt887 & 0x7FF;
			@Pc(15) int local15 = arg2 * arg2 + arg0 * arg0;
			if (local15 <= 6400) {
				@Pc(23) int local23 = Class3_Sub1_Sub1_Sub3.anIntArray121[local7];
				@Pc(27) int local27 = Class3_Sub1_Sub1_Sub3.anIntArray122[local7];
				@Pc(36) int local36 = local23 * 256 / (this.anInt906 + 256);
				@Pc(45) int local45 = local27 * 256 / (this.anInt906 + 256);
				@Pc(55) int local55 = arg0 * local36 + arg2 * local45 >> 16;
				@Pc(65) int local65 = arg0 * local45 - arg2 * local36 >> 16;
				if (local15 > 2500) {
					arg1.method309(local55 + 94 + 4 - arg1.anInt513 / 2, this.aClass3_Sub1_Sub3_Sub1_2, 83 - local65 - arg1.anInt514 / 2 - 4);
				} else {
					arg1.method303(83 - local65 - arg1.anInt514 / 2 - 4, local55 + 94 - arg1.anInt513 / 2 + 4);
				}
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("75134, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method605(@OriginalArg(0) boolean arg0) {
		try {
			this.aClass32_6.method459();
			Class3_Sub1_Sub3_Sub3.anIntArray139 = this.anIntArray239;
			this.aClass3_Sub1_Sub3_Sub1_1.method204(0, 0);
			if (this.anInt901 != -1) {
				this.method689(0, 0, Class9.method58(this.anInt901), 0);
			} else if (this.anIntArray274[this.anInt1058] != -1) {
				this.method689(0, 0, Class9.method58(this.anIntArray274[this.anInt1058]), 0);
			}
			if (this.aBoolean226 && this.anInt1006 == 1) {
				this.method657();
			}
			this.aClass32_6.method460(205, 553, super.aGraphics2);
			if (!arg0) {
				this.aBoolean211 = !this.aBoolean211;
			}
			this.aClass32_8.method459();
			Class3_Sub1_Sub3_Sub3.anIntArray139 = this.anIntArray240;
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("98435, " + arg0 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method607() {
		try {
			this.aBoolean234 = true;
			try {
				@Pc(12) long local12 = System.currentTimeMillis();
				@Pc(14) int local14 = 0;
				@Pc(16) int local16 = 20;
				while (this.aBoolean198) {
					this.anInt924++;
					this.method682();
					this.method682();
					this.method678();
					local14++;
					if (local14 > 10) {
						@Pc(39) long local39 = System.currentTimeMillis();
						@Pc(48) int local48 = (int) (local39 - local12) / 10 - local16;
						local16 = 40 - local48;
						if (local16 < 5) {
							local16 = 5;
						}
						local14 = 0;
						local12 = local39;
					}
					try {
						Thread.sleep((long) local16);
					} catch (@Pc(66) Exception local66) {
					}
				}
			} catch (@Pc(72) Exception local72) {
			}
			this.aBoolean234 = false;
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("75634, " + 86 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method608() {
		try {
			signlink.aBoolean252 = false;
			signlink.anInt1078 = 0;
			signlink.midi = "stop";
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("8415, " + -557 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILclient!NUXITFPR;I)V")
	private void method609(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub1_Sub3_Sub2 arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(11) int local11 = arg0 * arg0 + arg2 * arg2;
			if (local11 > 4225 && local11 < 90000) {
				@Pc(25) int local25 = this.anInt1043 + this.anInt887 & 0x7FF;
				@Pc(29) int local29 = Class3_Sub1_Sub1_Sub3.anIntArray121[local25];
				@Pc(33) int local33 = Class3_Sub1_Sub1_Sub3.anIntArray122[local25];
				@Pc(42) int local42 = local29 * 256 / (this.anInt906 + 256);
				@Pc(51) int local51 = local33 * 256 / (this.anInt906 + 256);
				@Pc(61) int local61 = arg2 * local42 + arg0 * local51 >> 16;
				@Pc(71) int local71 = arg2 * local51 - arg0 * local42 >> 16;
				@Pc(77) double local77 = Math.atan2((double) local61, (double) local71);
				@Pc(83) int local83 = (int) (Math.sin(local77) * 63.0D);
				@Pc(89) int local89 = (int) (Math.cos(local77) * 57.0D);
				this.aClass3_Sub1_Sub3_Sub2_5.method308(83 - local89 - 20, local77, local83 + 94 + 4 - 10);
			} else {
				this.method604(arg2, arg1, arg0);
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("39689, " + -26 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method610(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			if (!arg0) {
				this.anInt932 = -1;
			}
			if (!aBoolean224) {
				for (@Pc(10) int local10 = 0; local10 < this.anIntArray248.length; local10++) {
					@Pc(17) int local17 = this.anIntArray248[local10];
					if (Class3_Sub1_Sub3_Sub3.anIntArray141[local17] >= arg1) {
						@Pc(26) Class3_Sub1_Sub3_Sub1 local26 = Class3_Sub1_Sub3_Sub3.aClass3_Sub1_Sub3_Sub1Array1[local17];
						@Pc(34) int local34 = local26.anInt361 * local26.anInt362 - 1;
						@Pc(42) int local42 = local26.anInt361 * this.anInt975 * 2;
						@Pc(45) byte[] local45 = local26.aByteArray10;
						@Pc(48) byte[] local48 = this.aByteArray21;
						for (@Pc(50) int local50 = 0; local50 <= local34; local50++) {
							local48[local50] = local45[local50 - local42 & local34];
						}
						local26.aByteArray10 = local48;
						this.aByteArray21 = local45;
						Class3_Sub1_Sub3_Sub3.method397(local17);
					}
				}
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("27409, " + arg0 + ", " + arg1 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method611(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			if (this.anInt877 == 2) {
				for (@Pc(22) Class3_Sub2 local22 = (Class3_Sub2) this.aClass38_10.method486(); local22 != null; local22 = (Class3_Sub2) this.aClass38_10.method488()) {
					if (local22.anInt237 > 0) {
						local22.anInt237--;
					}
					if (local22.anInt237 != 0) {
						if (local22.anInt241 > 0) {
							local22.anInt241--;
						}
						if (local22.anInt241 == 0 && local22.anInt244 >= 1 && local22.anInt245 >= 1 && local22.anInt244 <= 102 && local22.anInt245 <= 102 && (local22.anInt238 < 0 || Class23.method355(local22.anInt240, local22.anInt238))) {
							this.method655(local22.anInt243, local22.anInt238, local22.anInt240, local22.anInt242, local22.anInt245, local22.anInt244, local22.anInt239);
							local22.anInt241 = -1;
							if (local22.anInt238 == local22.anInt234 && local22.anInt234 == -1) {
								local22.method503();
							} else if (local22.anInt238 == local22.anInt234 && local22.anInt239 == local22.anInt235 && local22.anInt240 == local22.anInt236) {
								local22.method503();
							}
						}
					} else if (local22.anInt234 < 0 || Class23.method355(local22.anInt236, local22.anInt234)) {
						this.method655(local22.anInt243, local22.anInt234, local22.anInt236, local22.anInt242, local22.anInt245, local22.anInt244, local22.anInt235);
						local22.method503();
					}
				}
			}
		} catch (@Pc(165) RuntimeException local165) {
			signlink.reporterror("97996, " + arg0 + ", " + local165.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method612() {
		try {
			this.aBoolean208 = true;
			for (@Pc(6) int local6 = 0; local6 < 7; local6++) {
				this.anIntArray260[local6] = -1;
				for (@Pc(15) int local15 = 0; local15 < Class10.anInt232; local15++) {
					if (!Class10.aClass10Array1[local15].aBoolean41 && Class10.aClass10Array1[local15].anInt233 == local6 + (this.aBoolean238 ? 0 : 7)) {
						this.anIntArray260[local6] = local15;
						break;
					}
				}
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("41558, " + -194 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)I")
	private int method613() {
		try {
			@Pc(8) int local8 = 3;
			if (this.anInt966 < 310) {
				@Pc(17) int local17 = this.anInt963 >> 7;
				@Pc(22) int local22 = this.anInt965 >> 7;
				@Pc(27) int local27 = aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt380 >> 7;
				@Pc(32) int local32 = aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt381 >> 7;
				if ((this.aByteArrayArrayArray8[this.anInt862][local17][local22] & 0x4) != 0) {
					local8 = this.anInt862;
				}
				@Pc(54) int local54;
				if (local27 > local17) {
					local54 = local27 - local17;
				} else {
					local54 = local17 - local27;
				}
				@Pc(67) int local67;
				if (local32 > local22) {
					local67 = local32 - local22;
				} else {
					local67 = local22 - local32;
				}
				@Pc(82) int local82;
				@Pc(84) int local84;
				if (local54 > local67) {
					local82 = local67 * 65536 / local54;
					local84 = 32768;
					while (local17 != local27) {
						if (local17 < local27) {
							local17++;
						} else if (local17 > local27) {
							local17--;
						}
						if ((this.aByteArrayArrayArray8[this.anInt862][local17][local22] & 0x4) != 0) {
							local8 = this.anInt862;
						}
						local84 += local82;
						if (local84 >= 65536) {
							local84 -= 65536;
							if (local22 < local32) {
								local22++;
							} else if (local22 > local32) {
								local22--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt862][local17][local22] & 0x4) != 0) {
								local8 = this.anInt862;
							}
						}
					}
				} else {
					local82 = local54 * 65536 / local67;
					local84 = 32768;
					while (local22 != local32) {
						if (local22 < local32) {
							local22++;
						} else if (local22 > local32) {
							local22--;
						}
						if ((this.aByteArrayArrayArray8[this.anInt862][local17][local22] & 0x4) != 0) {
							local8 = this.anInt862;
						}
						local84 += local82;
						if (local84 >= 65536) {
							local84 -= 65536;
							if (local17 < local27) {
								local17++;
							} else if (local17 > local27) {
								local17--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt862][local17][local22] & 0x4) != 0) {
								local8 = this.anInt862;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray8[this.anInt862][aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt380 >> 7][aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt381 >> 7] & 0x4) != 0) {
				local8 = this.anInt862;
			}
			return local8;
		} catch (@Pc(250) RuntimeException local250) {
			signlink.reporterror("59945, " + false + ", " + local250.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)I")
	private int method614() {
		try {
			@Pc(9) int local9 = this.method601(this.anInt965, this.anInt862, this.anInt963);
			return local9 - this.anInt964 >= 800 || (this.aByteArrayArrayArray8[this.anInt862][this.anInt963 >> 7][this.anInt965 >> 7] & 0x4) == 0 ? 3 : this.anInt862;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("24271, " + 35713 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)Ljava/lang/String;")
	private String method615() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("35070, " + -253 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!GHHPHSRU;)V")
	private void method616(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub1_Sub2 arg1) {
		try {
			this.anInt1039 = 0;
			this.anInt1029 = 0;
			this.method664(arg0, arg1);
			this.method720(arg0, arg1);
			this.method600(arg0, arg1);
			@Pc(31) int local31;
			for (@Pc(24) int local24 = 0; local24 < this.anInt1039; local24++) {
				local31 = this.anIntArray268[local24];
				if (this.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local31].anInt391 != anInt1003) {
					this.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local31].aClass5_2 = null;
					this.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local31] = null;
				}
			}
			if (arg1.anInt257 != arg0) {
				signlink.reporterror(this.aString20 + " size mismatch in getnpcpos - pos:" + arg1.anInt257 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local31 = 0; local31 < this.anInt997; local31++) {
				if (this.aClass3_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray263[local31]] == null) {
					signlink.reporterror(this.aString20 + " null entry in npc list - pos:" + local31 + " size:" + this.anInt997);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("26387, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZIIIII)V")
	private void method617(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
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
				local23 = Class3_Sub1_Sub1_Sub3.anIntArray121[local5];
				local27 = Class3_Sub1_Sub1_Sub3.anIntArray122[local5];
				local37 = local27 * 0 - arg3 * local23 >> 16;
				local17 = local23 * 0 + arg3 * local27 >> 16;
				local15 = local37;
			}
			if (local11 != 0) {
				local23 = Class3_Sub1_Sub1_Sub3.anIntArray121[local11];
				local27 = Class3_Sub1_Sub1_Sub3.anIntArray122[local11];
				local37 = local17 * local23 + local27 * 0 >> 16;
				local17 = local17 * local27 - local23 * 0 >> 16;
				local13 = local37;
			}
			this.anInt963 = arg5 - local13;
			this.aBoolean214 &= true;
			this.anInt964 = arg1 - local15;
			this.anInt965 = arg2 - local17;
			this.anInt966 = arg4;
			this.anInt967 = arg0;
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("73211, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method618(@OriginalArg(0) boolean arg0) {
		try {
			if (!arg0) {
				for (@Pc(5) int local5 = 1; local5 > 0; local5++) {
				}
			}
			for (@Pc(15) Class3_Sub1_Sub1_Sub4 local15 = (Class3_Sub1_Sub1_Sub4) this.aClass38_11.method486(); local15 != null; local15 = (Class3_Sub1_Sub1_Sub4) this.aClass38_11.method488()) {
				if (local15.anInt624 != this.anInt862 || local15.aBoolean150) {
					local15.method503();
				} else if (anInt1003 >= local15.anInt628) {
					local15.method416(this.anInt975, this.aBoolean231);
					if (local15.aBoolean150) {
						local15.method503();
					} else {
						this.aClass17_1.method233(local15, local15.anInt625, local15.anInt626, -1, local15.anInt627, false, 60, this.aByte46, 0, local15.anInt624);
					}
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("1269, " + arg0 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JB)V")
	private void method619(@OriginalArg(0) long arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg0 != 0L) {
				if (this.anInt919 >= 100) {
					this.method598("", "Your ignore list is full. Max of 100 hit", 0);
				} else {
					@Pc(23) String local23 = Class36.method481(Class36.method478(arg0, 622));
					for (@Pc(25) int local25 = 0; local25 < this.anInt919; local25++) {
						if (this.aLongArray4[local25] == arg0) {
							this.method598("", local23 + " is already on your ignore list", 0);
							return;
						}
					}
					for (@Pc(55) int local55 = 0; local55 < this.anInt937; local55++) {
						if (this.aLongArray3[local55] == arg0) {
							this.method598("", "Please remove " + local23 + " from your friend list first", 0);
							return;
						}
					}
					this.aLongArray4[this.anInt919++] = arg0;
					this.aBoolean243 = true;
					if (arg1 != 6) {
						this.aClass3_Sub1_Sub2_7.method79(66);
					}
					this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 122);
					this.aClass3_Sub1_Sub2_7.method85(arg0);
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("55822, " + arg0 + ", " + arg1 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method581() {
		try {
			signlink.reporterror = false;
			try {
				if (this.aClass48_1 != null) {
					this.aClass48_1.method555();
				}
			} catch (@Pc(11) Exception local11) {
			}
			this.aClass48_1 = null;
			this.method608();
			if (this.aClass49_1 != null) {
				this.aClass49_1.aBoolean189 = false;
			}
			this.aClass49_1 = null;
			this.aClass6_Sub1_1.method544();
			this.aClass6_Sub1_1 = null;
			this.aClass3_Sub1_Sub2_8 = null;
			this.aClass3_Sub1_Sub2_7 = null;
			this.aClass3_Sub1_Sub2_9 = null;
			this.aClass3_Sub1_Sub2_6 = null;
			this.anIntArray242 = null;
			this.aByteArrayArray6 = null;
			this.aByteArrayArray5 = null;
			this.anIntArray243 = null;
			this.anIntArray244 = null;
			this.anIntArrayArrayArray7 = null;
			this.aByteArrayArrayArray8 = null;
			this.aClass17_1 = null;
			this.aClass43Array1 = null;
			this.anIntArrayArray24 = null;
			this.anIntArrayArray22 = null;
			this.anIntArray225 = null;
			this.anIntArray226 = null;
			this.aByteArray21 = null;
			this.aClass32_6 = null;
			this.aClass32_7 = null;
			this.aClass32_8 = null;
			this.aClass32_9 = null;
			this.aClass32_3 = null;
			this.aClass32_4 = null;
			this.aClass32_5 = null;
			this.aClass32_19 = null;
			this.aClass32_20 = null;
			this.aClass32_21 = null;
			this.aClass32_22 = null;
			this.aClass32_23 = null;
			this.aClass32_24 = null;
			this.aClass32_25 = null;
			this.aClass32_26 = null;
			this.aClass32_27 = null;
			this.aClass3_Sub1_Sub3_Sub1_1 = null;
			this.aClass3_Sub1_Sub3_Sub1_2 = null;
			this.aClass3_Sub1_Sub3_Sub1_3 = null;
			this.aClass3_Sub1_Sub3_Sub1_18 = null;
			this.aClass3_Sub1_Sub3_Sub1_19 = null;
			this.aClass3_Sub1_Sub3_Sub1_20 = null;
			this.aClass3_Sub1_Sub3_Sub1Array3 = null;
			this.aClass3_Sub1_Sub3_Sub1_6 = null;
			this.aClass3_Sub1_Sub3_Sub1_7 = null;
			this.aClass3_Sub1_Sub3_Sub1_8 = null;
			this.aClass3_Sub1_Sub3_Sub1_9 = null;
			this.aClass3_Sub1_Sub3_Sub1_10 = null;
			this.aClass3_Sub1_Sub3_Sub1_13 = null;
			this.aClass3_Sub1_Sub3_Sub1_14 = null;
			this.aClass3_Sub1_Sub3_Sub1_15 = null;
			this.aClass3_Sub1_Sub3_Sub1_16 = null;
			this.aClass3_Sub1_Sub3_Sub1_17 = null;
			this.aClass3_Sub1_Sub3_Sub2_8 = null;
			this.aClass3_Sub1_Sub3_Sub2Array9 = null;
			this.aClass3_Sub1_Sub3_Sub2Array6 = null;
			this.aClass3_Sub1_Sub3_Sub2Array10 = null;
			this.aClass3_Sub1_Sub3_Sub2Array5 = null;
			this.aClass3_Sub1_Sub3_Sub2Array7 = null;
			this.aClass3_Sub1_Sub3_Sub2_17 = null;
			this.aClass3_Sub1_Sub3_Sub2_12 = null;
			this.aClass3_Sub1_Sub3_Sub2_13 = null;
			this.aClass3_Sub1_Sub3_Sub2_14 = null;
			this.aClass3_Sub1_Sub3_Sub2_15 = null;
			this.aClass3_Sub1_Sub3_Sub2_16 = null;
			this.aClass3_Sub1_Sub3_Sub1Array5 = null;
			this.aClass3_Sub1_Sub3_Sub2Array4 = null;
			this.anIntArrayArray23 = null;
			this.aClass3_Sub1_Sub1_Sub1_Sub1Array1 = null;
			this.anIntArray266 = null;
			this.anIntArray267 = null;
			this.aClass3_Sub1_Sub2Array1 = null;
			this.anIntArray268 = null;
			this.aClass3_Sub1_Sub1_Sub1_Sub2Array1 = null;
			this.anIntArray263 = null;
			this.aClass38ArrayArrayArray1 = null;
			this.aClass38_10 = null;
			this.aClass38_12 = null;
			this.aClass38_11 = null;
			this.anIntArray253 = null;
			this.anIntArray254 = null;
			this.anIntArray255 = null;
			this.anIntArray256 = null;
			this.aStringArray13 = null;
			this.anIntArray272 = null;
			this.anIntArray245 = null;
			this.anIntArray246 = null;
			this.aClass3_Sub1_Sub3_Sub2Array8 = null;
			this.aClass3_Sub1_Sub3_Sub2_11 = null;
			this.aStringArray12 = null;
			this.aLongArray3 = null;
			this.anIntArray231 = null;
			this.aClass32_13 = null;
			this.aClass32_14 = null;
			this.aClass32_10 = null;
			this.aClass32_11 = null;
			this.aClass32_12 = null;
			this.aClass32_15 = null;
			this.aClass32_16 = null;
			this.aClass32_17 = null;
			this.aClass32_18 = null;
			this.method653();
			Class18.method281();
			Class5.method22();
			Class50.method563();
			Class9.method61();
			Class25.aClass25Array1 = null;
			Class10.aClass10Array1 = null;
			Class20.aClass20Array1 = null;
			Class39.aClass39Array1 = null;
			Class2.aClass2Array1 = null;
			Class2.aClass35_1 = null;
			Class28.aClass28Array1 = null;
			super.aClass32_2 = null;
			Class3_Sub1_Sub1_Sub1_Sub1.aClass35_3 = null;
			Class3_Sub1_Sub3_Sub3.method390();
			Class17.method221();
			Class3_Sub1_Sub1_Sub3.method317();
			Class47.method552();
			System.gc();
		} catch (@Pc(384) RuntimeException local384) {
			signlink.reporterror("20201, " + 9 + ", " + local384.toString());
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

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method620() {
		try {
			this.anInt872 = 0;
			@Pc(70) int local70;
			for (@Pc(6) int local6 = -1; local6 < this.anInt1028 + this.anInt997; local6++) {
				@Pc(13) Class3_Sub1_Sub1_Sub1 local13;
				if (local6 == -1) {
					local13 = aClass3_Sub1_Sub1_Sub1_Sub1_1;
				} else if (local6 < this.anInt1028) {
					local13 = this.aClass3_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray266[local6]];
				} else {
					local13 = this.aClass3_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray263[local6 - this.anInt1028]];
				}
				if (local13 != null && local13.method214()) {
					@Pc(54) Class5 local54;
					if (local13 instanceof Class3_Sub1_Sub1_Sub1_Sub2) {
						local54 = ((Class3_Sub1_Sub1_Sub1_Sub2) local13).aClass5_2;
						if (local54.anIntArray7 != null) {
							local54 = local54.method26();
						}
						if (local54 == null) {
							continue;
						}
					}
					if (local6 >= this.anInt1028) {
						local54 = ((Class3_Sub1_Sub1_Sub1_Sub2) local13).aClass5_2;
						if (local54.anInt41 >= 0 && local54.anInt41 < this.aClass3_Sub1_Sub3_Sub2Array10.length) {
							this.method698(local13.anInt393 + 15, local13);
							if (this.anInt971 > -1) {
								this.aClass3_Sub1_Sub3_Sub2Array10[local54.anInt41].method303(this.anInt972 - 30, this.anInt971 - 12);
							}
						}
						if (this.anInt902 == 1 && this.anInt1019 == this.anIntArray263[local6 - this.anInt1028] && anInt1003 % 20 < 10) {
							this.method698(local13.anInt393 + 15, local13);
							if (this.anInt971 > -1) {
								this.aClass3_Sub1_Sub3_Sub2Array5[0].method303(this.anInt972 - 28, this.anInt971 - 12);
							}
						}
					} else {
						local70 = 30;
						@Pc(73) Class3_Sub1_Sub1_Sub1_Sub1 local73 = (Class3_Sub1_Sub1_Sub1_Sub1) local13;
						if (local73.anInt184 != -1 || local73.anInt175 != -1) {
							this.method698(local13.anInt393 + 15, local13);
							if (this.anInt971 > -1) {
								if (local73.anInt184 != -1) {
									this.aClass3_Sub1_Sub3_Sub2Array6[local73.anInt184].method303(this.anInt972 - 30, this.anInt971 - 12);
									local70 += 25;
								}
								if (local73.anInt175 != -1) {
									this.aClass3_Sub1_Sub3_Sub2Array10[local73.anInt175].method303(this.anInt972 - local70, this.anInt971 - 12);
									local70 += 25;
								}
							}
						}
						if (local6 >= 0 && this.anInt902 == 10 && this.anInt1059 == this.anIntArray266[local6]) {
							this.method698(local13.anInt393 + 15, local13);
							if (this.anInt971 > -1) {
								this.aClass3_Sub1_Sub3_Sub2Array5[1].method303(this.anInt972 - local70, this.anInt971 - 12);
							}
						}
					}
					if (local13.aString10 != null && (local6 >= this.anInt1028 || this.anInt1022 == 0 || this.anInt1022 == 3 || this.anInt1022 == 1 && this.method650(((Class3_Sub1_Sub1_Sub1_Sub1) local13).aString4))) {
						this.method698(local13.anInt393, local13);
						if (this.anInt971 > -1 && this.anInt872 < this.anInt873) {
							this.anIntArray221[this.anInt872] = this.aClass3_Sub1_Sub3_Sub4_4.method443(local13.aString10) / 2;
							this.anIntArray220[this.anInt872] = this.aClass3_Sub1_Sub3_Sub4_4.anInt674;
							this.anIntArray218[this.anInt872] = this.anInt971;
							this.anIntArray219[this.anInt872] = this.anInt972;
							this.anIntArray222[this.anInt872] = local13.anInt400;
							this.anIntArray223[this.anInt872] = local13.anInt416;
							this.anIntArray224[this.anInt872] = local13.anInt370;
							this.aStringArray8[this.anInt872++] = local13.aString10;
							if (this.anInt894 == 0 && local13.anInt416 >= 1 && local13.anInt416 <= 3) {
								this.anIntArray220[this.anInt872] += 10;
								this.anIntArray219[this.anInt872] += 5;
							}
							if (this.anInt894 == 0 && local13.anInt416 == 4) {
								this.anIntArray221[this.anInt872] = 60;
							}
							if (this.anInt894 == 0 && local13.anInt416 == 5) {
								this.anIntArray220[this.anInt872] += 5;
							}
						}
					}
					if (local13.anInt409 > anInt1003) {
						this.method698(local13.anInt393 + 15, local13);
						if (this.anInt971 > -1) {
							local70 = local13.anInt410 * 30 / local13.anInt411;
							if (local70 > 30) {
								local70 = 30;
							}
							Class3_Sub1_Sub3.method432(this.anInt971 - 15, this.anInt972 - 3, local70, 65280, 5);
							Class3_Sub1_Sub3.method432(this.anInt971 + local70 - 15, this.anInt972 - 3, 30 - local70, 16711680, 5);
						}
					}
					for (local70 = 0; local70 < 4; local70++) {
						if (local13.anIntArray58[local70] > anInt1003) {
							this.method698(local13.anInt393 / 2, local13);
							if (this.anInt971 > -1) {
								if (local70 == 1) {
									this.anInt972 -= 20;
								}
								if (local70 == 2) {
									this.anInt971 -= 15;
									this.anInt972 -= 10;
								}
								if (local70 == 3) {
									this.anInt971 += 15;
									this.anInt972 -= 10;
								}
								this.aClass3_Sub1_Sub3_Sub2Array9[local13.anIntArray57[local70]].method303(this.anInt972 - 12, this.anInt971 - 12);
								this.aClass3_Sub1_Sub3_Sub4_2.method440(this.anInt972 + 4, this.anInt971, 0, String.valueOf(local13.anIntArray56[local70]));
								this.aClass3_Sub1_Sub3_Sub4_2.method440(this.anInt972 + 3, this.anInt971 - 1, 16777215, String.valueOf(local13.anIntArray56[local70]));
							}
						}
					}
				}
			}
			anInt884++;
			@Pc(631) int local631;
			if (anInt884 > 1950) {
				anInt884 = 0;
				this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 218);
				this.aClass3_Sub1_Sub2_7.method79(0);
				local631 = this.aClass3_Sub1_Sub2_7.anInt257;
				this.aClass3_Sub1_Sub2_7.method80(40201);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass3_Sub1_Sub2_7.method79(138);
				}
				this.aClass3_Sub1_Sub2_7.method79((int) (Math.random() * 256.0D));
				this.aClass3_Sub1_Sub2_7.method79(149);
				this.aClass3_Sub1_Sub2_7.method80(26766);
				this.aClass3_Sub1_Sub2_7.method79((int) (Math.random() * 256.0D));
				this.aClass3_Sub1_Sub2_7.method80(33876);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass3_Sub1_Sub2_7.method79(53);
				}
				this.aClass3_Sub1_Sub2_7.method79((int) (Math.random() * 256.0D));
				this.aClass3_Sub1_Sub2_7.method80(20471);
				this.aClass3_Sub1_Sub2_7.method88(this.aClass3_Sub1_Sub2_7.anInt257 - local631);
			}
			for (local631 = 0; local631 < this.anInt872; local631++) {
				local70 = this.anIntArray218[local631];
				@Pc(713) int local713 = this.anIntArray219[local631];
				@Pc(718) int local718 = this.anIntArray221[local631];
				@Pc(723) int local723 = this.anIntArray220[local631];
				@Pc(725) boolean local725 = true;
				while (local725) {
					local725 = false;
					for (@Pc(731) int local731 = 0; local731 < local631; local731++) {
						if (local713 + 2 > this.anIntArray219[local731] - this.anIntArray220[local731] && local713 - local723 < this.anIntArray219[local731] + 2 && local70 - local718 < this.anIntArray218[local731] + this.anIntArray221[local731] && local70 + local718 > this.anIntArray218[local731] - this.anIntArray221[local731] && this.anIntArray219[local731] - this.anIntArray220[local731] < local713) {
							local713 = this.anIntArray219[local731] - this.anIntArray220[local731];
							local725 = true;
						}
					}
				}
				this.anInt971 = this.anIntArray218[local631];
				this.anInt972 = this.anIntArray219[local631] = local713;
				@Pc(830) String local830 = this.aStringArray8[local631];
				if (this.anInt894 == 0) {
					@Pc(835) int local835 = 16776960;
					if (this.anIntArray222[local631] < 6) {
						local835 = this.anIntArray228[this.anIntArray222[local631]];
					}
					if (this.anIntArray222[local631] == 6) {
						local835 = this.anInt850 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray222[local631] == 7) {
						local835 = this.anInt850 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray222[local631] == 8) {
						local835 = this.anInt850 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(910) int local910;
					if (this.anIntArray222[local631] == 9) {
						local910 = 150 - this.anIntArray224[local631];
						if (local910 < 50) {
							local835 = local910 * 1280 + 16711680;
						} else if (local910 < 100) {
							local835 = 16776960 - (local910 - 50) * 327680;
						} else if (local910 < 150) {
							local835 = (local910 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray222[local631] == 10) {
						local910 = 150 - this.anIntArray224[local631];
						if (local910 < 50) {
							local835 = local910 * 5 + 16711680;
						} else if (local910 < 100) {
							local835 = 16711935 - (local910 - 50) * 327680;
						} else if (local910 < 150) {
							local835 = (local910 - 100) * 327680 + 255 - (local910 - 100) * 5;
						}
					}
					if (this.anIntArray222[local631] == 11) {
						local910 = 150 - this.anIntArray224[local631];
						if (local910 < 50) {
							local835 = 16777215 - local910 * 327685;
						} else if (local910 < 100) {
							local835 = (local910 - 50) * 327685 + 65280;
						} else if (local910 < 150) {
							local835 = 16777215 - (local910 - 100) * 327680;
						}
					}
					if (this.anIntArray223[local631] == 0) {
						this.aClass3_Sub1_Sub3_Sub4_4.method440(this.anInt972 + 1, this.anInt971, 0, local830);
						this.aClass3_Sub1_Sub3_Sub4_4.method440(this.anInt972, this.anInt971, local835, local830);
					}
					if (this.anIntArray223[local631] == 1) {
						this.aClass3_Sub1_Sub3_Sub4_4.method445(this.anInt850, this.anInt972 + 1, this.anInt971, local830, 0);
						this.aClass3_Sub1_Sub3_Sub4_4.method445(this.anInt850, this.anInt972, this.anInt971, local830, local835);
					}
					if (this.anIntArray223[local631] == 2) {
						this.aClass3_Sub1_Sub3_Sub4_4.method446(this.anInt850, this.anInt971, this.anInt972 + 1, local830, 0);
						this.aClass3_Sub1_Sub3_Sub4_4.method446(this.anInt850, this.anInt971, this.anInt972, local830, local835);
					}
					if (this.anIntArray223[local631] == 3) {
						this.aClass3_Sub1_Sub3_Sub4_4.method447(this.anInt972 + 1, this.anInt971, 150 - this.anIntArray224[local631], this.anInt850, local830, 0);
						this.aClass3_Sub1_Sub3_Sub4_4.method447(this.anInt972, this.anInt971, 150 - this.anIntArray224[local631], this.anInt850, local830, local835);
					}
					@Pc(1207) int local1207;
					if (this.anIntArray223[local631] == 4) {
						local910 = this.aClass3_Sub1_Sub3_Sub4_4.method443(local830);
						local1207 = (150 - this.anIntArray224[local631]) * (local910 + 100) / 150;
						Class3_Sub1_Sub3.method429(this.anInt971 - 50, 0, 334, this.anInt971 + 50);
						this.aClass3_Sub1_Sub3_Sub4_4.method444(0, local830, this.anInt972 + 1, this.anInt971 + 50 - local1207);
						this.aClass3_Sub1_Sub3_Sub4_4.method444(local835, local830, this.anInt972, this.anInt971 + 50 - local1207);
						Class3_Sub1_Sub3.method428();
					}
					if (this.anIntArray223[local631] == 5) {
						local910 = 150 - this.anIntArray224[local631];
						local1207 = 0;
						if (local910 < 25) {
							local1207 = local910 - 25;
						} else if (local910 > 125) {
							local1207 = local910 - 125;
						}
						Class3_Sub1_Sub3.method429(0, this.anInt972 - this.aClass3_Sub1_Sub3_Sub4_4.anInt674 - 1, this.anInt972 + 5, 512);
						this.aClass3_Sub1_Sub3_Sub4_4.method440(this.anInt972 + local1207 + 1, this.anInt971, 0, local830);
						this.aClass3_Sub1_Sub3_Sub4_4.method440(this.anInt972 + local1207, this.anInt971, local835, local830);
						Class3_Sub1_Sub3.method428();
					}
				} else {
					this.aClass3_Sub1_Sub3_Sub4_4.method440(this.anInt972 + 1, this.anInt971, 0, local830);
					this.aClass3_Sub1_Sub3_Sub4_4.method440(this.anInt972, this.anInt971, 16776960, local830);
				}
			}
			this.aBoolean214 &= true;
		} catch (@Pc(1363) RuntimeException local1363) {
			signlink.reporterror("55532, " + true + ", " + local1363.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method621() {
		try {
			this.aBoolean214 &= true;
			@Pc(17) int local17;
			@Pc(24) int local24;
			if (this.anInt890 == 0) {
				local17 = super.anInt827 / 2 - 80;
				local24 = super.anInt828 / 2 + 20;
				local24 += 20;
				if (super.anInt836 == 1 && super.anInt837 >= local17 - 75 && super.anInt837 <= local17 + 75 && super.anInt838 >= local24 - 20 && super.anInt838 <= local24 + 20) {
					this.anInt890 = 3;
					this.anInt960 = 0;
				}
				local17 = super.anInt827 / 2 + 80;
				if (super.anInt836 == 1 && super.anInt837 >= local17 - 75 && super.anInt837 <= local17 + 75 && super.anInt838 >= local24 - 20 && super.anInt838 <= local24 + 20) {
					this.aString24 = "";
					this.aString25 = "Enter your username & password.";
					this.anInt890 = 2;
					this.anInt960 = 0;
				}
			} else if (this.anInt890 == 2) {
				local17 = super.anInt828 / 2 - 40;
				local17 += 30;
				local17 += 25;
				if (super.anInt836 == 1 && super.anInt838 >= local17 - 15 && super.anInt838 < local17) {
					this.anInt960 = 0;
				}
				local17 += 15;
				if (super.anInt836 == 1 && super.anInt838 >= local17 - 15 && super.anInt838 < local17) {
					this.anInt960 = 1;
				}
				local17 += 15;
				local24 = super.anInt827 / 2 - 80;
				@Pc(170) int local170 = super.anInt828 / 2 + 50;
				@Pc(171) int local171 = local170 + 20;
				if (super.anInt836 == 1 && super.anInt837 >= local24 - 75 && super.anInt837 <= local24 + 75 && super.anInt838 >= local171 - 20 && super.anInt838 <= local171 + 20) {
					this.anInt856 = 0;
					this.method719(this.aString20, this.aString21, false);
					if (this.aBoolean214) {
						return;
					}
				}
				local24 = super.anInt827 / 2 + 80;
				if (super.anInt836 == 1 && super.anInt837 >= local24 - 75 && super.anInt837 <= local24 + 75 && super.anInt838 >= local171 - 20 && super.anInt838 <= local171 + 20) {
					this.anInt890 = 0;
					this.aString20 = "";
					this.aString21 = "";
				}
				while (true) {
					while (true) {
						@Pc(262) int local262 = this.method578(this.anInt930);
						if (local262 == -1) {
							return;
						}
						@Pc(267) boolean local267 = false;
						for (@Pc(269) int local269 = 0; local269 < aString18.length(); local269++) {
							if (local262 == aString18.charAt(local269)) {
								local267 = true;
								break;
							}
						}
						if (this.anInt960 == 0) {
							if (local262 == 8 && this.aString20.length() > 0) {
								this.aString20 = this.aString20.substring(0, this.aString20.length() - 1);
							}
							if (local262 == 9 || local262 == 10 || local262 == 13) {
								this.anInt960 = 1;
							}
							if (local267) {
								this.aString20 = this.aString20 + (char) local262;
							}
							if (this.aString20.length() > 12) {
								this.aString20 = this.aString20.substring(0, 12);
							}
						} else if (this.anInt960 == 1) {
							if (local262 == 8 && this.aString21.length() > 0) {
								this.aString21 = this.aString21.substring(0, this.aString21.length() - 1);
							}
							if (local262 == 9 || local262 == 10 || local262 == 13) {
								this.anInt960 = 0;
							}
							if (local267) {
								this.aString21 = this.aString21 + (char) local262;
							}
							if (this.aString21.length() > 20) {
								this.aString21 = this.aString21.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt890 == 3) {
				local17 = super.anInt827 / 2;
				local24 = super.anInt828 / 2 + 50;
				@Pc(426) int local426 = local24 + 20;
				if (super.anInt836 == 1 && super.anInt837 >= local17 - 75 && super.anInt837 <= local17 + 75 && super.anInt838 >= local426 - 20 && super.anInt838 <= local426 + 20) {
					this.anInt890 = 0;
					return;
				}
			}
		} catch (@Pc(459) RuntimeException local459) {
			signlink.reporterror("5948, " + true + ", " + local459.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method622() {
		try {
			if (this.aClass32_9 == null) {
				this.method653();
				super.aClass32_2 = null;
				this.aClass32_10 = null;
				this.aClass32_11 = null;
				this.aClass32_12 = null;
				this.aClass32_13 = null;
				this.aClass32_14 = null;
				this.aClass32_15 = null;
				this.aClass32_16 = null;
				this.aClass32_17 = null;
				this.aClass32_18 = null;
				this.aClass32_9 = new Class32(479, this.method584((byte) 9), 96, 9);
				this.aClass32_7 = new Class32(172, this.method584((byte) 9), 156, 9);
				Class3_Sub1_Sub3.method430();
				this.aClass3_Sub1_Sub3_Sub1_2.method204(0, 0);
				this.aClass32_6 = new Class32(190, this.method584((byte) 9), 261, 9);
				this.aClass32_8 = new Class32(512, this.method584((byte) 9), 334, 9);
				Class3_Sub1_Sub3.method430();
				this.aClass32_3 = new Class32(496, this.method584((byte) 9), 50, 9);
				this.aClass32_4 = new Class32(269, this.method584((byte) 9), 37, 9);
				this.aClass32_5 = new Class32(249, this.method584((byte) 9), 45, 9);
				this.aBoolean227 = true;
				this.aClass32_8.method459();
				Class3_Sub1_Sub3_Sub3.anIntArray139 = this.anIntArray240;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("41766, " + 14922 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method579() {
		this.method586(20, aBoolean199, "Starting up");
		if (signlink.sunjava) {
			super.anInt825 = 5;
		}
		if (aBoolean240) {
			this.aBoolean232 = true;
			return;
		}
		aBoolean240 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method615();
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
		if (local25.endsWith("127.0.0.1")) {
			local21 = true;
		}
		if (!local21) {
			this.aBoolean218 = true;
			return;
		}
		if (signlink.aRandomAccessFile3 != null) {
			for (@Pc(101) int local101 = 0; local101 < 5; local101++) {
				this.aClass44Array1[local101] = new Class44(local101 + 1, signlink.aRandomAccessFileArray1[local101], 500000, (byte) -128, signlink.aRandomAccessFile3);
			}
		}
		try {
			this.method658();
			this.aClass7_2 = this.method724(this.anIntArray271[1], "title", "title screen", 25, 1);
			this.aClass3_Sub1_Sub3_Sub4_2 = new Class3_Sub1_Sub3_Sub4(this.aClass7_2, "p11_full", false, 279);
			this.aClass3_Sub1_Sub3_Sub4_3 = new Class3_Sub1_Sub3_Sub4(this.aClass7_2, "p12_full", false, 279);
			this.aClass3_Sub1_Sub3_Sub4_4 = new Class3_Sub1_Sub3_Sub4(this.aClass7_2, "b12_full", false, 279);
			this.aClass3_Sub1_Sub3_Sub4_5 = new Class3_Sub1_Sub3_Sub4(this.aClass7_2, "q8_full", true, 279);
			this.method649();
			this.method592(anInt936);
			@Pc(197) Class7 local197 = this.method724(this.anIntArray271[2], "config", "config", 30, 2);
			@Pc(209) Class7 local209 = this.method724(this.anIntArray271[3], "interface", "interface", 35, 3);
			@Pc(221) Class7 local221 = this.method724(this.anIntArray271[4], "media", "2d graphics", 40, 4);
			@Pc(233) Class7 local233 = this.method724(this.anIntArray271[6], "textures", "textures", 45, 6);
			@Pc(245) Class7 local245 = this.method724(this.anIntArray271[7], "wordenc", "chat system", 50, 7);
			@Pc(257) Class7 local257 = this.method724(this.anIntArray271[8], "sounds", "sound effects", 55, 8);
			this.aByteArrayArrayArray8 = new byte[4][104][104];
			this.anIntArrayArrayArray7 = new int[4][105][105];
			this.aClass17_1 = new Class17(4, (byte) 94, 104, 104, this.anIntArrayArrayArray7);
			for (@Pc(282) int local282 = 0; local282 < 4; local282++) {
				this.aClass43Array1[local282] = new Class43(104, 104, anInt1069);
			}
			this.aClass3_Sub1_Sub3_Sub2_11 = new Class3_Sub1_Sub3_Sub2(512, 512);
			@Pc(317) Class7 local317 = this.method724(this.anIntArray271[5], "versionlist", "update list", 60, 5);
			this.method586(60, aBoolean199, "Connecting to update server");
			this.aClass6_Sub1_1 = new Class6_Sub1();
			this.aClass6_Sub1_1.method543(local317, this);
			Class47.method550(this.aClass6_Sub1_1.method536(878));
			Class3_Sub1_Sub1_Sub3.method318(this.aClass6_Sub1_1.method535(0, 171), this.aClass6_Sub1_1);
			if (!aBoolean224) {
				this.anInt998 = 0;
				this.aBoolean239 = true;
				this.aClass6_Sub1_1.method548(2, this.anInt998);
				while (this.aClass6_Sub1_1.method540() > 0) {
					this.method645((byte) 9);
					try {
						Thread.sleep(100L);
					} catch (@Pc(368) Exception local368) {
					}
					if (this.aClass6_Sub1_1.anInt776 > 3) {
						this.method672("ondemand");
						return;
					}
				}
			}
			this.method586(65, aBoolean199, "Requesting animations");
			@Pc(392) int local392 = this.aClass6_Sub1_1.method535(1, 171);
			for (@Pc(394) int local394 = 0; local394 < local392; local394++) {
				this.aClass6_Sub1_1.method548(1, local394);
			}
			@Pc(413) int local413;
			while (this.aClass6_Sub1_1.method540() > 0) {
				local413 = local392 - this.aClass6_Sub1_1.method540();
				if (local413 > 0) {
					this.method586(65, aBoolean199, "Loading animations - " + local413 * 100 / local392 + "%");
				}
				this.method645((byte) 9);
				try {
					Thread.sleep(100L);
				} catch (@Pc(439) Exception local439) {
				}
				if (this.aClass6_Sub1_1.anInt776 > 3) {
					this.method672("ondemand");
					return;
				}
			}
			this.method586(70, aBoolean199, "Requesting models");
			local392 = this.aClass6_Sub1_1.method535(0, 171);
			@Pc(473) int local473;
			for (local413 = 0; local413 < local392; local413++) {
				local473 = this.aClass6_Sub1_1.method534(local413);
				if ((local473 & 0x1) != 0) {
					this.aClass6_Sub1_1.method548(0, local413);
				}
			}
			local392 = this.aClass6_Sub1_1.method540();
			while (this.aClass6_Sub1_1.method540() > 0) {
				local473 = local392 - this.aClass6_Sub1_1.method540();
				if (local473 > 0) {
					this.method586(70, aBoolean199, "Loading models - " + local473 * 100 / local392 + "%");
				}
				this.method645((byte) 9);
				try {
					Thread.sleep(100L);
				} catch (@Pc(524) Exception local524) {
				}
			}
			if (this.aClass44Array1[0] != null) {
				this.method586(75, aBoolean199, "Requesting maps");
				this.aClass6_Sub1_1.method548(3, this.aClass6_Sub1_1.method533(48, anInt1065, 47, 0));
				this.aClass6_Sub1_1.method548(3, this.aClass6_Sub1_1.method533(48, anInt1065, 47, 1));
				this.aClass6_Sub1_1.method548(3, this.aClass6_Sub1_1.method533(48, anInt1065, 48, 0));
				this.aClass6_Sub1_1.method548(3, this.aClass6_Sub1_1.method533(48, anInt1065, 48, 1));
				this.aClass6_Sub1_1.method548(3, this.aClass6_Sub1_1.method533(48, anInt1065, 49, 0));
				this.aClass6_Sub1_1.method548(3, this.aClass6_Sub1_1.method533(48, anInt1065, 49, 1));
				this.aClass6_Sub1_1.method548(3, this.aClass6_Sub1_1.method533(47, anInt1065, 47, 0));
				this.aClass6_Sub1_1.method548(3, this.aClass6_Sub1_1.method533(47, anInt1065, 47, 1));
				this.aClass6_Sub1_1.method548(3, this.aClass6_Sub1_1.method533(47, anInt1065, 48, 0));
				this.aClass6_Sub1_1.method548(3, this.aClass6_Sub1_1.method533(47, anInt1065, 48, 1));
				this.aClass6_Sub1_1.method548(3, this.aClass6_Sub1_1.method533(148, anInt1065, 48, 0));
				this.aClass6_Sub1_1.method548(3, this.aClass6_Sub1_1.method533(148, anInt1065, 48, 1));
				local392 = this.aClass6_Sub1_1.method540();
				while (this.aClass6_Sub1_1.method540() > 0) {
					local473 = local392 - this.aClass6_Sub1_1.method540();
					if (local473 > 0) {
						this.method586(75, aBoolean199, "Loading maps - " + local473 * 100 / local392 + "%");
					}
					this.method645((byte) 9);
					try {
						Thread.sleep(100L);
					} catch (@Pc(709) Exception local709) {
					}
				}
			}
			local392 = this.aClass6_Sub1_1.method535(0, 171);
			@Pc(730) int local730;
			for (local473 = 0; local473 < local392; local473++) {
				local730 = this.aClass6_Sub1_1.method534(local473);
				@Pc(732) byte local732 = 0;
				if ((local730 & 0x8) != 0) {
					local732 = 10;
				} else if ((local730 & 0x20) != 0) {
					local732 = 9;
				} else if ((local730 & 0x10) != 0) {
					local732 = 8;
				} else if ((local730 & 0x40) != 0) {
					local732 = 7;
				} else if ((local730 & 0x80) != 0) {
					local732 = 6;
				} else if ((local730 & 0x2) != 0) {
					local732 = 5;
				} else if ((local730 & 0x4) != 0) {
					local732 = 4;
				}
				if ((local730 & 0x1) != 0) {
					local732 = 3;
				}
				if (local732 != 0) {
					this.aClass6_Sub1_1.method541(0, local732, local473);
				}
			}
			this.aClass6_Sub1_1.method532(aBoolean223);
			if (!aBoolean224) {
				local392 = this.aClass6_Sub1_1.method535(2, 171);
				for (local730 = 1; local730 < local392; local730++) {
					if (this.aClass6_Sub1_1.method530(local730)) {
						this.aClass6_Sub1_1.method541(2, (byte) 1, local730);
					}
				}
			}
			this.method586(80, aBoolean199, "Unpacking media");
			this.aClass3_Sub1_Sub3_Sub1_1 = new Class3_Sub1_Sub3_Sub1(local221, "invback", 0);
			this.aClass3_Sub1_Sub3_Sub1_3 = new Class3_Sub1_Sub3_Sub1(local221, "chatback", 0);
			this.aClass3_Sub1_Sub3_Sub1_2 = new Class3_Sub1_Sub3_Sub1(local221, "mapback", 0);
			this.aClass3_Sub1_Sub3_Sub1_18 = new Class3_Sub1_Sub3_Sub1(local221, "backbase1", 0);
			this.aClass3_Sub1_Sub3_Sub1_19 = new Class3_Sub1_Sub3_Sub1(local221, "backbase2", 0);
			this.aClass3_Sub1_Sub3_Sub1_20 = new Class3_Sub1_Sub3_Sub1(local221, "backhmid1", 0);
			for (local730 = 0; local730 < 13; local730++) {
				this.aClass3_Sub1_Sub3_Sub1Array3[local730] = new Class3_Sub1_Sub3_Sub1(local221, "sideicons", local730);
			}
			this.aClass3_Sub1_Sub3_Sub2_8 = new Class3_Sub1_Sub3_Sub2(local221, "compass", 0);
			this.aClass3_Sub1_Sub3_Sub2_5 = new Class3_Sub1_Sub3_Sub2(local221, "mapedge", 0);
			this.aClass3_Sub1_Sub3_Sub2_5.method300(24);
			for (@Pc(932) int local932 = 0; local932 < 72; local932++) {
				this.aClass3_Sub1_Sub3_Sub1Array5[local932] = new Class3_Sub1_Sub3_Sub1(local221, "mapscene", local932);
			}
			for (@Pc(950) int local950 = 0; local950 < 63; local950++) {
				this.aClass3_Sub1_Sub3_Sub2Array4[local950] = new Class3_Sub1_Sub3_Sub2(local221, "mapfunction", local950);
			}
			for (@Pc(968) int local968 = 0; local968 < 5; local968++) {
				this.aClass3_Sub1_Sub3_Sub2Array9[local968] = new Class3_Sub1_Sub3_Sub2(local221, "hitmarks", local968);
			}
			for (@Pc(986) int local986 = 0; local986 < 6; local986++) {
				this.aClass3_Sub1_Sub3_Sub2Array6[local986] = new Class3_Sub1_Sub3_Sub2(local221, "headicons_pk", local986);
			}
			for (@Pc(1004) int local1004 = 0; local1004 < 9; local1004++) {
				this.aClass3_Sub1_Sub3_Sub2Array10[local1004] = new Class3_Sub1_Sub3_Sub2(local221, "headicons_prayer", local1004);
			}
			for (@Pc(1022) int local1022 = 0; local1022 < 6; local1022++) {
				this.aClass3_Sub1_Sub3_Sub2Array5[local1022] = new Class3_Sub1_Sub3_Sub2(local221, "headicons_hint", local1022);
			}
			this.aClass3_Sub1_Sub3_Sub2_17 = new Class3_Sub1_Sub3_Sub2(local221, "overlay_multiway", 0);
			this.aClass3_Sub1_Sub3_Sub2_3 = new Class3_Sub1_Sub3_Sub2(local221, "mapmarker", 0);
			this.aClass3_Sub1_Sub3_Sub2_4 = new Class3_Sub1_Sub3_Sub2(local221, "mapmarker", 1);
			for (@Pc(1064) int local1064 = 0; local1064 < 8; local1064++) {
				this.aClass3_Sub1_Sub3_Sub2Array7[local1064] = new Class3_Sub1_Sub3_Sub2(local221, "cross", local1064);
			}
			this.aClass3_Sub1_Sub3_Sub2_12 = new Class3_Sub1_Sub3_Sub2(local221, "mapdots", 0);
			this.aClass3_Sub1_Sub3_Sub2_13 = new Class3_Sub1_Sub3_Sub2(local221, "mapdots", 1);
			this.aClass3_Sub1_Sub3_Sub2_14 = new Class3_Sub1_Sub3_Sub2(local221, "mapdots", 2);
			this.aClass3_Sub1_Sub3_Sub2_15 = new Class3_Sub1_Sub3_Sub2(local221, "mapdots", 3);
			this.aClass3_Sub1_Sub3_Sub2_16 = new Class3_Sub1_Sub3_Sub2(local221, "mapdots", 4);
			this.aClass3_Sub1_Sub3_Sub1_11 = new Class3_Sub1_Sub3_Sub1(local221, "scrollbar", 0);
			this.aClass3_Sub1_Sub3_Sub1_12 = new Class3_Sub1_Sub3_Sub1(local221, "scrollbar", 1);
			this.aClass3_Sub1_Sub3_Sub1_6 = new Class3_Sub1_Sub3_Sub1(local221, "redstone1", 0);
			this.aClass3_Sub1_Sub3_Sub1_7 = new Class3_Sub1_Sub3_Sub1(local221, "redstone2", 0);
			this.aClass3_Sub1_Sub3_Sub1_8 = new Class3_Sub1_Sub3_Sub1(local221, "redstone3", 0);
			this.aClass3_Sub1_Sub3_Sub1_9 = new Class3_Sub1_Sub3_Sub1(local221, "redstone1", 0);
			this.aClass3_Sub1_Sub3_Sub1_9.method201();
			this.aClass3_Sub1_Sub3_Sub1_10 = new Class3_Sub1_Sub3_Sub1(local221, "redstone2", 0);
			this.aClass3_Sub1_Sub3_Sub1_10.method201();
			this.aClass3_Sub1_Sub3_Sub1_13 = new Class3_Sub1_Sub3_Sub1(local221, "redstone1", 0);
			this.aClass3_Sub1_Sub3_Sub1_13.method202();
			this.aClass3_Sub1_Sub3_Sub1_14 = new Class3_Sub1_Sub3_Sub1(local221, "redstone2", 0);
			this.aClass3_Sub1_Sub3_Sub1_14.method202();
			this.aClass3_Sub1_Sub3_Sub1_15 = new Class3_Sub1_Sub3_Sub1(local221, "redstone3", 0);
			this.aClass3_Sub1_Sub3_Sub1_15.method202();
			this.aClass3_Sub1_Sub3_Sub1_16 = new Class3_Sub1_Sub3_Sub1(local221, "redstone1", 0);
			this.aClass3_Sub1_Sub3_Sub1_16.method201();
			this.aClass3_Sub1_Sub3_Sub1_16.method202();
			this.aClass3_Sub1_Sub3_Sub1_17 = new Class3_Sub1_Sub3_Sub1(local221, "redstone2", 0);
			this.aClass3_Sub1_Sub3_Sub1_17.method201();
			this.aClass3_Sub1_Sub3_Sub1_17.method202();
			for (@Pc(1254) int local1254 = 0; local1254 < 2; local1254++) {
				this.aClass3_Sub1_Sub3_Sub1Array2[local1254] = new Class3_Sub1_Sub3_Sub1(local221, "mod_icons", local1254);
			}
			@Pc(1277) Class3_Sub1_Sub3_Sub2 local1277 = new Class3_Sub1_Sub3_Sub2(local221, "backleft1", 0);
			this.aClass32_19 = new Class32(local1277.anInt509, this.method584((byte) 9), local1277.anInt510, 9);
			local1277.method301(0, 0);
			@Pc(1302) Class3_Sub1_Sub3_Sub2 local1302 = new Class3_Sub1_Sub3_Sub2(local221, "backleft2", 0);
			this.aClass32_20 = new Class32(local1302.anInt509, this.method584((byte) 9), local1302.anInt510, 9);
			local1302.method301(0, 0);
			@Pc(1327) Class3_Sub1_Sub3_Sub2 local1327 = new Class3_Sub1_Sub3_Sub2(local221, "backright1", 0);
			this.aClass32_21 = new Class32(local1327.anInt509, this.method584((byte) 9), local1327.anInt510, 9);
			local1327.method301(0, 0);
			@Pc(1352) Class3_Sub1_Sub3_Sub2 local1352 = new Class3_Sub1_Sub3_Sub2(local221, "backright2", 0);
			this.aClass32_22 = new Class32(local1352.anInt509, this.method584((byte) 9), local1352.anInt510, 9);
			local1352.method301(0, 0);
			@Pc(1377) Class3_Sub1_Sub3_Sub2 local1377 = new Class3_Sub1_Sub3_Sub2(local221, "backtop1", 0);
			this.aClass32_23 = new Class32(local1377.anInt509, this.method584((byte) 9), local1377.anInt510, 9);
			local1377.method301(0, 0);
			@Pc(1402) Class3_Sub1_Sub3_Sub2 local1402 = new Class3_Sub1_Sub3_Sub2(local221, "backvmid1", 0);
			this.aClass32_24 = new Class32(local1402.anInt509, this.method584((byte) 9), local1402.anInt510, 9);
			local1402.method301(0, 0);
			@Pc(1427) Class3_Sub1_Sub3_Sub2 local1427 = new Class3_Sub1_Sub3_Sub2(local221, "backvmid2", 0);
			this.aClass32_25 = new Class32(local1427.anInt509, this.method584((byte) 9), local1427.anInt510, 9);
			local1427.method301(0, 0);
			@Pc(1452) Class3_Sub1_Sub3_Sub2 local1452 = new Class3_Sub1_Sub3_Sub2(local221, "backvmid3", 0);
			this.aClass32_26 = new Class32(local1452.anInt509, this.method584((byte) 9), local1452.anInt510, 9);
			local1452.method301(0, 0);
			@Pc(1477) Class3_Sub1_Sub3_Sub2 local1477 = new Class3_Sub1_Sub3_Sub2(local221, "backhmid2", 0);
			this.aClass32_27 = new Class32(local1477.anInt509, this.method584((byte) 9), local1477.anInt510, 9);
			local1477.method301(0, 0);
			@Pc(1502) int local1502 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1509) int local1509 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1516) int local1516 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1523) int local1523 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1525) int local1525 = 0; local1525 < 100; local1525++) {
				if (this.aClass3_Sub1_Sub3_Sub2Array4[local1525] != null) {
					this.aClass3_Sub1_Sub3_Sub2Array4[local1525].method299(local1516 + local1523, local1502 + local1523, 307, local1509 + local1523);
				}
				if (this.aClass3_Sub1_Sub3_Sub1Array5[local1525] != null) {
					this.aClass3_Sub1_Sub3_Sub1Array5[local1525].method203(local1516 + local1523, local1502 + local1523, local1509 + local1523);
				}
			}
			this.method586(83, aBoolean199, "Unpacking textures");
			Class3_Sub1_Sub3_Sub3.method395(local233);
			Class3_Sub1_Sub3_Sub3.method399(0.8D);
			Class3_Sub1_Sub3_Sub3.method394();
			this.method586(86, aBoolean199, "Unpacking config");
			Class39.method491(local197);
			Class18.method282(local197);
			Class25.method372(local197);
			Class50.method572(local197);
			Class5.method27(local197);
			Class10.method68(local197);
			Class2.method16(local197);
			Class28.method410(local197);
			Class22.method311(local197);
			Class50.aBoolean190 = aBoolean223;
			if (!aBoolean224) {
				this.method586(90, aBoolean199, "Unpacking sounds");
				@Pc(1628) byte[] local1628 = local257.method30("sounds.dat", null);
				@Pc(1634) Class3_Sub1_Sub2 local1634 = new Class3_Sub1_Sub2(-527, local1628);
				Class40.method494(local1634);
			}
			this.method586(95, aBoolean199, "Unpacking interfaces");
			@Pc(1665) Class3_Sub1_Sub3_Sub4[] local1665 = new Class3_Sub1_Sub3_Sub4[] { this.aClass3_Sub1_Sub3_Sub4_2, this.aClass3_Sub1_Sub3_Sub4_3, this.aClass3_Sub1_Sub3_Sub4_4, this.aClass3_Sub1_Sub3_Sub4_5 };
			Class9.method60(local1665, local209, local221);
			this.method586(100, aBoolean199, "Preparing game engine");
			@Pc(1681) int local1681;
			@Pc(1683) int local1683;
			@Pc(1685) int local1685;
			for (@Pc(1677) int local1677 = 0; local1677 < 33; local1677++) {
				local1681 = 999;
				local1683 = 0;
				for (local1685 = 0; local1685 < 34; local1685++) {
					if (this.aClass3_Sub1_Sub3_Sub1_2.aByteArray10[local1685 + local1677 * this.aClass3_Sub1_Sub3_Sub1_2.anInt361] == 0) {
						if (local1681 == 999) {
							local1681 = local1685;
						}
					} else if (local1681 != 999) {
						local1683 = local1685;
						break;
					}
				}
				this.anIntArray275[local1677] = local1681;
				this.anIntArray216[local1677] = local1683 - local1681;
			}
			@Pc(1743) int local1743;
			for (local1681 = 5; local1681 < 156; local1681++) {
				local1683 = 999;
				local1685 = 0;
				for (local1743 = 25; local1743 < 172; local1743++) {
					if (this.aClass3_Sub1_Sub3_Sub1_2.aByteArray10[local1743 + local1681 * this.aClass3_Sub1_Sub3_Sub1_2.anInt361] == 0 && (local1743 > 34 || local1681 > 34)) {
						if (local1683 == 999) {
							local1683 = local1743;
						}
					} else if (local1683 != 999) {
						local1685 = local1743;
						break;
					}
				}
				this.anIntArray251[local1681 - 5] = local1683 - 25;
				this.anIntArray261[local1681 - 5] = local1685 - local1683;
			}
			Class3_Sub1_Sub3_Sub3.method392(503, 765);
			this.anIntArray241 = Class3_Sub1_Sub3_Sub3.anIntArray139;
			Class3_Sub1_Sub3_Sub3.method392(96, 479);
			this.anIntArray238 = Class3_Sub1_Sub3_Sub3.anIntArray139;
			Class3_Sub1_Sub3_Sub3.method392(261, 190);
			this.anIntArray239 = Class3_Sub1_Sub3_Sub3.anIntArray139;
			Class3_Sub1_Sub3_Sub3.method392(334, 512);
			this.anIntArray240 = Class3_Sub1_Sub3_Sub3.anIntArray139;
			@Pc(1834) int[] local1834 = new int[9];
			for (local1685 = 0; local1685 < 9; local1685++) {
				local1743 = local1685 * 32 + 128 + 15;
				@Pc(1852) int local1852 = local1743 * 3 + 600;
				@Pc(1856) int local1856 = Class3_Sub1_Sub3_Sub3.anIntArray137[local1743];
				local1834[local1685] = local1852 * local1856 >> 16;
			}
			Class17.method258(local1834);
			Class12.method128(local245);
			this.aClass49_1 = new Class49(this, false);
			this.method585(this.aClass49_1, 10);
			Class3_Sub1_Sub1_Sub6.aClient3 = this;
			Class18.aClient2 = this;
			Class5.aClient1 = this;
		} catch (@Pc(1897) Exception local1897) {
			signlink.reporterror("loaderror " + this.aString22 + " " + this.anInt948);
			this.aBoolean220 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method623() {
		try {
			for (@Pc(6) Class3_Sub2 local6 = (Class3_Sub2) this.aClass38_10.method486(); local6 != null; local6 = (Class3_Sub2) this.aClass38_10.method488()) {
				if (local6.anInt237 == -1) {
					local6.anInt241 = 0;
					this.method704(this.aBoolean204, local6);
				} else {
					local6.method503();
				}
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("13577, " + -889 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method624() {
		try {
			if (this.anInt925 != 0) {
				@Pc(6) Class3_Sub1_Sub3_Sub4 local6 = this.aClass3_Sub1_Sub3_Sub4_3;
				@Pc(8) int local8 = 0;
				if (this.anInt929 != 0) {
					local8 = 1;
				}
				for (@Pc(15) int local15 = 0; local15 < 100; local15++) {
					if (this.aStringArray11[local15] != null) {
						@Pc(27) int local27 = this.anIntArray227[local15];
						@Pc(32) String local32 = this.aStringArray10[local15];
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
						if ((local27 == 3 || local27 == 7) && (local27 == 7 || this.anInt976 == 0 || this.anInt976 == 1 && this.method650(local32))) {
							local85 = 329 - local8 * 13;
							local6.method444(0, "From", local85, 4);
							local6.method444(65535, "From", local85 - 1, 4);
							@Pc(110) int local110 = local6.method442("From ") + 4;
							if (local34 == 1) {
								this.aClass3_Sub1_Sub3_Sub1Array2[0].method204(local85 - 12, local110);
								local110 += 14;
							}
							if (local34 == 2) {
								this.aClass3_Sub1_Sub3_Sub1Array2[1].method204(local85 - 12, local110);
								local110 += 14;
							}
							local6.method444(0, local32 + ": " + this.aStringArray11[local15], local85, local110);
							local6.method444(65535, local32 + ": " + this.aStringArray11[local15], local85 - 1, local110);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local27 == 5 && this.anInt976 < 2) {
							local85 = 329 - local8 * 13;
							local6.method444(0, this.aStringArray11[local15], local85, 4);
							local6.method444(65535, this.aStringArray11[local15], local85 - 1, 4);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local27 == 6 && this.anInt976 < 2) {
							local85 = 329 - local8 * 13;
							local6.method444(0, "To " + local32 + ": " + this.aStringArray11[local15], local85, 4);
							local6.method444(65535, "To " + local32 + ": " + this.aStringArray11[local15], local85 - 1, 4);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
					}
				}
				this.anInt931 += 0;
			}
		} catch (@Pc(295) RuntimeException local295) {
			signlink.reporterror("49709, " + 0 + ", " + local295.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(14) int local14 = this.aClass17_1.method248(arg4, arg3, arg2);
			@Pc(24) int local24;
			@Pc(30) int local30;
			@Pc(34) int local34;
			@Pc(36) int local36;
			@Pc(58) int local58;
			@Pc(64) int local64;
			if (local14 != 0) {
				local24 = this.aClass17_1.method252(arg4, arg3, arg2, local14);
				local30 = local24 >> 6 & 0x3;
				local34 = local24 & 0x1F;
				local36 = arg1;
				if (local14 > 0) {
					local36 = arg0;
				}
				@Pc(44) int[] local44 = this.aClass3_Sub1_Sub3_Sub2_11.anIntArray83;
				local58 = arg3 * 4 + (103 - arg2) * 512 * 4 + 24624;
				local64 = local14 >> 14 & 0x7FFF;
				@Pc(67) Class18 local67 = Class18.method278(local64);
				if (local67.anInt468 == -1) {
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
					@Pc(77) Class3_Sub1_Sub3_Sub1 local77 = this.aClass3_Sub1_Sub3_Sub1Array5[local67.anInt468];
					if (local77 != null) {
						@Pc(89) int local89 = (local67.anInt488 * 4 - local77.anInt361) / 2;
						@Pc(99) int local99 = (local67.anInt484 * 4 - local77.anInt362) / 2;
						local77.method204((104 - arg2 - local67.anInt484) * 4 + local99 + 48, arg3 * 4 + 48 + local89);
					}
				}
			}
			local14 = this.aClass17_1.method250(arg4, arg3, arg2);
			if (local14 != 0) {
				local24 = this.aClass17_1.method252(arg4, arg3, arg2, local14);
				local30 = local24 >> 6 & 0x3;
				local34 = local24 & 0x1F;
				local36 = local14 >> 14 & 0x7FFF;
				@Pc(453) Class18 local453 = Class18.method278(local36);
				@Pc(485) int local485;
				if (local453.anInt468 != -1) {
					@Pc(463) Class3_Sub1_Sub3_Sub1 local463 = this.aClass3_Sub1_Sub3_Sub1Array5[local453.anInt468];
					if (local463 != null) {
						local64 = (local453.anInt488 * 4 - local463.anInt361) / 2;
						local485 = (local453.anInt484 * 4 - local463.anInt362) / 2;
						local463.method204((104 - arg2 - local453.anInt484) * 4 + local485 + 48, arg3 * 4 + 48 + local64);
					}
				} else if (local34 == 9) {
					local58 = 15658734;
					if (local14 > 0) {
						local58 = 15597568;
					}
					@Pc(522) int[] local522 = this.aClass3_Sub1_Sub3_Sub2_11.anIntArray83;
					local485 = arg3 * 4 + (103 - arg2) * 512 * 4 + 24624;
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
			local14 = this.aClass17_1.method251(arg4, arg3, arg2);
			if (local14 != 0) {
				local24 = local14 >> 14 & 0x7FFF;
				@Pc(617) Class18 local617 = Class18.method278(local24);
				if (local617.anInt468 != -1) {
					@Pc(627) Class3_Sub1_Sub3_Sub1 local627 = this.aClass3_Sub1_Sub3_Sub1Array5[local617.anInt468];
					if (local627 != null) {
						local36 = (local617.anInt488 * 4 - local627.anInt361) / 2;
						@Pc(649) int local649 = (local617.anInt484 * 4 - local627.anInt362) / 2;
						local627.method204((104 - arg2 - local617.anInt484) * 4 + local649 + 48, arg3 * 4 + 48 + local36);
						return;
					}
				}
			}
		} catch (@Pc(673) RuntimeException local673) {
			signlink.reporterror("42812, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -20742 + ", " + arg4 + ", " + local673.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method626(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt919; local8++) {
					if (this.aLongArray4[local8] == arg0) {
						this.anInt919--;
						this.aBoolean243 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt919; local28++) {
							this.aLongArray4[local28] = this.aLongArray4[local28 + 1];
						}
						this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 140);
						this.aClass3_Sub1_Sub2_7.method85(arg0);
						break;
					}
				}
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("49700, " + arg0 + ", " + -256 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
	private void method627(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) int local4 = Class28.aClass28Array1[arg0].anInt615;
			if (local4 != 0) {
				@Pc(12) int local12 = this.anIntArray272[arg0];
				if (local4 == 1) {
					if (local12 == 1) {
						Class3_Sub1_Sub3_Sub3.method399(0.9D);
					}
					if (local12 == 2) {
						Class3_Sub1_Sub3_Sub3.method399(0.8D);
					}
					if (local12 == 3) {
						Class3_Sub1_Sub3_Sub3.method399(0.7D);
					}
					if (local12 == 4) {
						Class3_Sub1_Sub3_Sub3.method399(0.6D);
					}
					Class50.aClass35_9.method476();
					this.aBoolean227 = true;
				}
				if (local4 == 3) {
					@Pc(55) boolean local55 = this.aBoolean216;
					if (local12 == 0) {
						this.method703(0, this.aBoolean216);
						this.aBoolean216 = true;
					}
					if (local12 == 1) {
						this.method703(-400, this.aBoolean216);
						this.aBoolean216 = true;
					}
					if (local12 == 2) {
						this.method703(-800, this.aBoolean216);
						this.aBoolean216 = true;
					}
					if (local12 == 3) {
						this.method703(-1200, this.aBoolean216);
						this.aBoolean216 = true;
					}
					if (local12 == 4) {
						this.aBoolean216 = false;
					}
					if (this.aBoolean216 != local55 && !aBoolean224) {
						if (this.aBoolean216) {
							this.anInt998 = this.anInt855;
							this.aBoolean239 = true;
							this.aClass6_Sub1_1.method548(2, this.anInt998);
						} else {
							this.method608();
						}
						this.anInt995 = 0;
					}
				}
				if (local4 == 4) {
					if (local12 == 0) {
						this.aBoolean217 = true;
						this.method628(0);
					}
					if (local12 == 1) {
						this.aBoolean217 = true;
						this.method628(-400);
					}
					if (local12 == 2) {
						this.aBoolean217 = true;
						this.method628(-800);
					}
					if (local12 == 3) {
						this.aBoolean217 = true;
						this.method628(-1200);
					}
					if (local12 == 4) {
						this.aBoolean217 = false;
					}
				}
				if (local4 == 5) {
					this.anInt939 = local12;
				}
				if (local4 == 6) {
					this.anInt894 = local12;
				}
				if (local4 == 8) {
					this.anInt925 = local12;
					this.aBoolean229 = true;
				}
				if (local4 == 9) {
					this.anInt878 = local12;
				}
			}
		} catch (@Pc(215) RuntimeException local215) {
			signlink.reporterror("67484, " + true + ", " + arg0 + ", " + local215.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method628(@OriginalArg(1) int arg0) {
		try {
			signlink.anInt1080 = arg0;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("96176, " + -110 + ", " + arg0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method629() {
		try {
			if (this.anInt925 != 0) {
				@Pc(5) int local5 = 0;
				if (this.anInt929 != 0) {
					local5 = 1;
				}
				for (@Pc(12) int local12 = 0; local12 < 100; local12++) {
					if (this.aStringArray11[local12] != null) {
						@Pc(24) int local24 = this.anIntArray227[local12];
						@Pc(29) String local29 = this.aStringArray10[local12];
						if (local29 != null && local29.startsWith("@cr1@")) {
							local29 = local29.substring(5);
						}
						if (local29 != null && local29.startsWith("@cr2@")) {
							local29 = local29.substring(5);
						}
						if ((local24 == 3 || local24 == 7) && (local24 == 7 || this.anInt976 == 0 || this.anInt976 == 1 && this.method650(local29))) {
							@Pc(82) int local82 = 329 - local5 * 13;
							if (super.anInt831 > 4 && super.anInt832 - 4 > local82 - 10 && super.anInt832 - 4 <= local82 + 3) {
								@Pc(121) int local121 = this.aClass3_Sub1_Sub3_Sub4_3.method442("From:  " + local29 + this.aStringArray11[local12]) + 25;
								if (local121 > 450) {
									local121 = 450;
								}
								if (super.anInt831 < local121 + 4) {
									if (this.anInt1066 >= 1) {
										this.aStringArray13[this.anInt1017] = "Report abuse @whi@" + local29;
										this.anIntArray255[this.anInt1017] = 2279;
										this.anInt1017++;
									}
									this.aStringArray13[this.anInt1017] = "Add ignore @whi@" + local29;
									this.anIntArray255[this.anInt1017] = 2275;
									this.anInt1017++;
									this.aStringArray13[this.anInt1017] = "Add friend @whi@" + local29;
									this.anIntArray255[this.anInt1017] = 2691;
									this.anInt1017++;
								}
							}
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
						if ((local24 == 5 || local24 == 6) && this.anInt976 < 2) {
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(245) RuntimeException local245) {
			signlink.reporterror("61227, " + 3 + ", " + local245.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method630(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean200) {
			if (this.aSocket3 != null) {
				try {
					this.aSocket3.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket3 = null;
			}
			this.aSocket3 = this.method686(43595);
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIBIIZIII)Z")
	private boolean method631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray24[local7][local11] = 0;
					this.anIntArrayArray22[local7][local11] = 99999999;
				}
			}
			local11 = arg8;
			@Pc(39) int local39 = arg10;
			this.anIntArrayArray24[arg8][arg10] = 99;
			this.anIntArrayArray22[arg8][arg10] = 0;
			@Pc(55) byte local55 = 0;
			@Pc(57) int local57 = 0;
			this.anIntArray225[0] = arg8;
			@Pc(71) int local71 = local55 + 1;
			this.anIntArray226[0] = arg10;
			@Pc(75) boolean local75 = false;
			@Pc(79) int local79 = this.anIntArray225.length;
			@Pc(86) int[][] local86 = this.aClass43Array1[this.anInt862].anIntArrayArray19;
			@Pc(197) int local197;
			while (local57 != local71) {
				local11 = this.anIntArray225[local57];
				local39 = this.anIntArray226[local57];
				local57 = (local57 + 1) % local79;
				if (local11 == arg2 && local39 == arg0) {
					local75 = true;
					break;
				}
				if (arg1 != 0) {
					if ((arg1 < 5 || arg1 == 10) && this.aClass43Array1[this.anInt862].method517(arg1 - 1, local11, arg5, arg0, arg2, local39)) {
						local75 = true;
						break;
					}
					if (arg1 < 10 && this.aClass43Array1[this.anInt862].method518(arg5, arg0, local11, arg1 - 1, local39, arg2)) {
						local75 = true;
						break;
					}
				}
				if (arg3 != 0 && arg9 != 0 && this.aClass43Array1[this.anInt862].method519(arg3, arg4, arg9, arg0, local39, local11, arg2)) {
					local75 = true;
					break;
				}
				local197 = this.anIntArrayArray22[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray24[local11 - 1][local39] == 0 && (local86[local11 - 1][local39] & 0x1280108) == 0) {
					this.anIntArray225[local71] = local11 - 1;
					this.anIntArray226[local71] = local39;
					local71 = (local71 + 1) % local79;
					this.anIntArrayArray24[local11 - 1][local39] = 2;
					this.anIntArrayArray22[local11 - 1][local39] = local197;
				}
				if (local11 < 103 && this.anIntArrayArray24[local11 + 1][local39] == 0 && (local86[local11 + 1][local39] & 0x1280180) == 0) {
					this.anIntArray225[local71] = local11 + 1;
					this.anIntArray226[local71] = local39;
					local71 = (local71 + 1) % local79;
					this.anIntArrayArray24[local11 + 1][local39] = 8;
					this.anIntArrayArray22[local11 + 1][local39] = local197;
				}
				if (local39 > 0 && this.anIntArrayArray24[local11][local39 - 1] == 0 && (local86[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray225[local71] = local11;
					this.anIntArray226[local71] = local39 - 1;
					local71 = (local71 + 1) % local79;
					this.anIntArrayArray24[local11][local39 - 1] = 1;
					this.anIntArrayArray22[local11][local39 - 1] = local197;
				}
				if (local39 < 103 && this.anIntArrayArray24[local11][local39 + 1] == 0 && (local86[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray225[local71] = local11;
					this.anIntArray226[local71] = local39 + 1;
					local71 = (local71 + 1) % local79;
					this.anIntArrayArray24[local11][local39 + 1] = 4;
					this.anIntArrayArray22[local11][local39 + 1] = local197;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray24[local11 - 1][local39 - 1] == 0 && (local86[local11 - 1][local39 - 1] & 0x128010E) == 0 && (local86[local11 - 1][local39] & 0x1280108) == 0 && (local86[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray225[local71] = local11 - 1;
					this.anIntArray226[local71] = local39 - 1;
					local71 = (local71 + 1) % local79;
					this.anIntArrayArray24[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray22[local11 - 1][local39 - 1] = local197;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray24[local11 + 1][local39 - 1] == 0 && (local86[local11 + 1][local39 - 1] & 0x1280183) == 0 && (local86[local11 + 1][local39] & 0x1280180) == 0 && (local86[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray225[local71] = local11 + 1;
					this.anIntArray226[local71] = local39 - 1;
					local71 = (local71 + 1) % local79;
					this.anIntArrayArray24[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray22[local11 + 1][local39 - 1] = local197;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray24[local11 - 1][local39 + 1] == 0 && (local86[local11 - 1][local39 + 1] & 0x1280138) == 0 && (local86[local11 - 1][local39] & 0x1280108) == 0 && (local86[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray225[local71] = local11 - 1;
					this.anIntArray226[local71] = local39 + 1;
					local71 = (local71 + 1) % local79;
					this.anIntArrayArray24[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray22[local11 - 1][local39 + 1] = local197;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray24[local11 + 1][local39 + 1] == 0 && (local86[local11 + 1][local39 + 1] & 0x12801E0) == 0 && (local86[local11 + 1][local39] & 0x1280180) == 0 && (local86[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray225[local71] = local11 + 1;
					this.anIntArray226[local71] = local39 + 1;
					local71 = (local71 + 1) % local79;
					this.anIntArrayArray24[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray22[local11 + 1][local39 + 1] = local197;
				}
			}
			this.anInt899 = 0;
			@Pc(813) int local813;
			@Pc(819) int local819;
			@Pc(825) int local825;
			if (!local75) {
				if (arg7) {
					local197 = 100;
					for (local813 = 1; local813 < 2; local813++) {
						for (local819 = arg2 - local813; local819 <= arg2 + local813; local819++) {
							for (local825 = arg0 - local813; local825 <= arg0 + local813; local825++) {
								if (local819 >= 0 && local825 >= 0 && local819 < 104 && local825 < 104 && this.anIntArrayArray22[local819][local825] < local197) {
									local197 = this.anIntArrayArray22[local819][local825];
									local11 = local819;
									local39 = local825;
									this.anInt899 = 1;
									local75 = true;
								}
							}
						}
						if (local75) {
							break;
						}
					}
				}
				if (!local75) {
					return false;
				}
			}
			@Pc(886) byte local886 = 0;
			this.anIntArray225[0] = local11;
			local57 = local886 + 1;
			this.anIntArray226[0] = local39;
			local197 = local813 = this.anIntArrayArray24[local11][local39];
			while (local11 != arg8 || local39 != arg10) {
				if (local197 != local813) {
					local813 = local197;
					this.anIntArray225[local57] = local11;
					this.anIntArray226[local57++] = local39;
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
				local197 = this.anIntArrayArray24[local11][local39];
			}
			if (local57 > 0) {
				local79 = local57;
				if (local57 > 25) {
					local79 = 25;
				}
				local57--;
				local819 = this.anIntArray225[local57];
				local825 = this.anIntArray226[local57];
				if (arg6 == 0) {
					this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 3);
					this.aClass3_Sub1_Sub2_7.method79(local79 + local79 + 3);
				}
				if (arg6 == 1) {
					this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 234);
					this.aClass3_Sub1_Sub2_7.method79(local79 + local79 + 3 + 14);
				}
				if (arg6 == 2) {
					this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 104);
					this.aClass3_Sub1_Sub2_7.method79(local79 + local79 + 3);
				}
				this.aClass3_Sub1_Sub2_7.method80(local825 + this.anInt867);
				this.aClass3_Sub1_Sub2_7.method113(local819 + this.anInt866);
				this.anInt1040 = this.anIntArray225[0];
				this.anInt1041 = this.anIntArray226[0];
				for (@Pc(1062) int local1062 = 1; local1062 < local79; local1062++) {
					local57--;
					this.aClass3_Sub1_Sub2_7.method79(this.anIntArray225[local57] - local819);
					this.aClass3_Sub1_Sub2_7.method107(this.anIntArray226[local57] - local825);
				}
				this.aClass3_Sub1_Sub2_7.method106(super.anIntArray210[5] == 1 ? 1 : 0);
				return true;
			} else if (arg6 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1111) RuntimeException local1111) {
			signlink.reporterror("5242, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 37 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local1111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method632(@OriginalArg(0) int arg0) {
		try {
			this.aClass32_9.method459();
			Class3_Sub1_Sub3_Sub3.anIntArray139 = this.anIntArray238;
			this.aClass3_Sub1_Sub3_Sub1_3.method204(0, 0);
			if (this.aBoolean244) {
				this.aClass3_Sub1_Sub3_Sub4_4.method440(40, 239, 0, this.aString29);
				this.aClass3_Sub1_Sub3_Sub4_4.method440(60, 239, 128, this.aString23 + "*");
			} else if (this.anInt969 == 1) {
				this.aClass3_Sub1_Sub3_Sub4_4.method440(40, 239, 0, "Enter amount:");
				this.aClass3_Sub1_Sub3_Sub4_4.method440(60, 239, 128, this.aString28 + "*");
			} else if (this.anInt969 == 2) {
				this.aClass3_Sub1_Sub3_Sub4_4.method440(40, 239, 0, "Enter name:");
				this.aClass3_Sub1_Sub3_Sub4_4.method440(60, 239, 128, this.aString28 + "*");
			} else if (this.aString17 != null) {
				this.aClass3_Sub1_Sub3_Sub4_4.method440(40, 239, 0, this.aString17);
				this.aClass3_Sub1_Sub3_Sub4_4.method440(60, 239, 128, "Click to continue");
			} else if (this.anInt846 != -1) {
				this.method689(0, 0, Class9.method58(this.anInt846), 0);
			} else if (this.anInt875 == -1) {
				@Pc(159) Class3_Sub1_Sub3_Sub4 local159 = this.aClass3_Sub1_Sub3_Sub4_3;
				@Pc(161) int local161 = 0;
				Class3_Sub1_Sub3.method429(0, 0, 77, 463);
				for (@Pc(169) int local169 = 0; local169 < 100; local169++) {
					if (this.aStringArray11[local169] != null) {
						@Pc(181) int local181 = this.anIntArray227[local169];
						@Pc(190) int local190 = this.anInt927 + 70 - local161 * 14;
						@Pc(195) String local195 = this.aStringArray10[local169];
						@Pc(197) byte local197 = 0;
						if (local195 != null && local195.startsWith("@cr1@")) {
							local195 = local195.substring(5);
							local197 = 1;
						}
						if (local195 != null && local195.startsWith("@cr2@")) {
							local195 = local195.substring(5);
							local197 = 2;
						}
						if (local181 == 0) {
							if (local190 > 0 && local190 < 110) {
								local159.method444(0, this.aStringArray11[local169], local190, 4);
							}
							local161++;
						}
						@Pc(267) int local267;
						if ((local181 == 1 || local181 == 2) && (local181 == 1 || this.anInt1022 == 0 || this.anInt1022 == 1 && this.method650(local195))) {
							if (local190 > 0 && local190 < 110) {
								local267 = 4;
								if (local197 == 1) {
									this.aClass3_Sub1_Sub3_Sub1Array2[0].method204(local190 - 12, 4);
									local267 += 14;
								}
								if (local197 == 2) {
									this.aClass3_Sub1_Sub3_Sub1Array2[1].method204(local190 - 12, local267);
									local267 += 14;
								}
								local159.method444(0, local195 + ":", local190, local267);
								local267 += local159.method442(local195) + 8;
								local159.method444(255, this.aStringArray11[local169], local190, local267);
							}
							local161++;
						}
						if ((local181 == 3 || local181 == 7) && this.anInt925 == 0 && (local181 == 7 || this.anInt976 == 0 || this.anInt976 == 1 && this.method650(local195))) {
							if (local190 > 0 && local190 < 110) {
								local159.method444(0, "From", local190, 4);
								local267 = local159.method442("From ") + 4;
								if (local197 == 1) {
									this.aClass3_Sub1_Sub3_Sub1Array2[0].method204(local190 - 12, local267);
									local267 += 14;
								}
								if (local197 == 2) {
									this.aClass3_Sub1_Sub3_Sub1Array2[1].method204(local190 - 12, local267);
									local267 += 14;
								}
								local159.method444(0, local195 + ":", local190, local267);
								local267 += local159.method442(local195) + 8;
								local159.method444(8388608, this.aStringArray11[local169], local190, local267);
							}
							local161++;
						}
						if (local181 == 4 && (this.anInt900 == 0 || this.anInt900 == 1 && this.method650(local195))) {
							if (local190 > 0 && local190 < 110) {
								local159.method444(8388736, local195 + " " + this.aStringArray11[local169], local190, 4);
							}
							local161++;
						}
						if (local181 == 5 && this.anInt925 == 0 && this.anInt976 < 2) {
							if (local190 > 0 && local190 < 110) {
								local159.method444(8388608, this.aStringArray11[local169], local190, 4);
							}
							local161++;
						}
						if (local181 == 6 && this.anInt925 == 0 && this.anInt976 < 2) {
							if (local190 > 0 && local190 < 110) {
								local159.method444(0, "To " + local195 + ":", local190, 4);
								local159.method444(8388608, this.aStringArray11[local169], local190, local159.method442("To " + local195) + 12);
							}
							local161++;
						}
						if (local181 == 8 && (this.anInt900 == 0 || this.anInt900 == 1 && this.method650(local195))) {
							if (local190 > 0 && local190 < 110) {
								local159.method444(8270336, local195 + " " + this.aStringArray11[local169], local190, 4);
							}
							local161++;
						}
					}
				}
				Class3_Sub1_Sub3.method428();
				this.anInt1023 = local161 * 14 + 7;
				if (this.anInt1023 < 78) {
					this.anInt1023 = 78;
				}
				this.method669(77, 463, 0, this.anInt1023 - this.anInt927 - 77, this.anInt1023);
				@Pc(637) String local637;
				if (aClass3_Sub1_Sub1_Sub1_Sub1_1 == null || aClass3_Sub1_Sub1_Sub1_Sub1_1.aString4 == null) {
					local637 = Class36.method481(this.aString20);
				} else {
					local637 = aClass3_Sub1_Sub1_Sub1_Sub1_1.aString4;
				}
				local159.method444(0, local637 + ":", 90, 4);
				local159.method444(255, this.aString26 + "*", 90, local159.method442(local637 + ": ") + 6);
				Class3_Sub1_Sub3.method435(0, 479, 0, 77);
			} else {
				this.method689(0, 0, Class9.method58(this.anInt875), 0);
			}
			if (this.aBoolean226 && this.anInt1006 == 2) {
				this.method657();
			}
			this.aClass32_9.method460(357, 17, super.aGraphics2);
			this.aClass32_8.method459();
			Class3_Sub1_Sub3_Sub3.anIntArray139 = this.anIntArray240;
			if (arg0 != 0) {
				this.aClass38ArrayArrayArray1 = null;
			}
		} catch (@Pc(723) RuntimeException local723) {
			signlink.reporterror("19450, " + arg0 + ", " + local723.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BI)Z")
	private boolean method633(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 < 0) {
				return false;
			}
			@Pc(8) int local8 = this.anIntArray255[arg1];
			@Pc(13) boolean local13 = false;
			if (local8 >= 2000) {
				local8 -= 2000;
			}
			return local8 == 691;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("37983, " + arg0 + ", " + arg1 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!EKHKDMUP;)Z")
	private boolean method634(@OriginalArg(0) int arg0, @OriginalArg(1) Class9 arg1) {
		try {
			@Pc(4) int local4 = arg1.anInt220;
			@Pc(8) boolean local8 = false;
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
				this.aStringArray13[this.anInt1017] = "Remove @whi@" + this.aStringArray12[local4];
				this.anIntArray255[this.anInt1017] = 739;
				this.anInt1017++;
				this.aStringArray13[this.anInt1017] = "Message @whi@" + this.aStringArray12[local4];
				this.anIntArray255[this.anInt1017] = 633;
				this.anInt1017++;
				return true;
			} else if (local4 >= 401 && local4 <= 500) {
				this.aStringArray13[this.anInt1017] = "Remove @whi@" + arg1.aString9;
				this.anIntArray255[this.anInt1017] = 266;
				this.anInt1017++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("18807, " + arg0 + ", " + arg1 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method635() {
		try {
			if (super.anInt836 == 1) {
				if (super.anInt837 >= 6 && super.anInt837 <= 106 && super.anInt838 >= 467 && super.anInt838 <= 499) {
					this.anInt1022 = (this.anInt1022 + 1) % 4;
					this.aBoolean225 = true;
					this.aBoolean229 = true;
					this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 198);
					this.aClass3_Sub1_Sub2_7.method79(this.anInt1022);
					this.aClass3_Sub1_Sub2_7.method79(this.anInt976);
					this.aClass3_Sub1_Sub2_7.method79(this.anInt900);
				}
				if (super.anInt837 >= 135 && super.anInt837 <= 235 && super.anInt838 >= 467 && super.anInt838 <= 499) {
					this.anInt976 = (this.anInt976 + 1) % 3;
					this.aBoolean225 = true;
					this.aBoolean229 = true;
					this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 198);
					this.aClass3_Sub1_Sub2_7.method79(this.anInt1022);
					this.aClass3_Sub1_Sub2_7.method79(this.anInt976);
					this.aClass3_Sub1_Sub2_7.method79(this.anInt900);
				}
				if (super.anInt837 >= 273 && super.anInt837 <= 373 && super.anInt838 >= 467 && super.anInt838 <= 499) {
					this.anInt900 = (this.anInt900 + 1) % 3;
					this.aBoolean225 = true;
					this.aBoolean229 = true;
					this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 198);
					this.aClass3_Sub1_Sub2_7.method79(this.anInt1022);
					this.aClass3_Sub1_Sub2_7.method79(this.anInt976);
					this.aClass3_Sub1_Sub2_7.method79(this.anInt900);
				}
				if (super.anInt837 >= 412 && super.anInt837 <= 512 && super.anInt838 >= 467 && super.anInt838 <= 499) {
					if (this.anInt848 == -1) {
						this.method721();
						this.aString19 = "";
						this.aBoolean207 = false;
						this.anInt852 = this.anInt848 = Class9.anInt214;
					} else {
						this.method598("", "Please close the interface you have open before using 'report abuse'", 0);
					}
				}
				anInt920++;
				if (anInt920 > 92) {
					anInt920 = 0;
					this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 43);
					return;
				}
			}
		} catch (@Pc(227) RuntimeException local227) {
			signlink.reporterror("61763, " + -300 + ", " + local227.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
	private void method636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			@Pc(1) Class3_Sub2 local1 = null;
			for (@Pc(6) Class3_Sub2 local6 = (Class3_Sub2) this.aClass38_10.method486(); local6 != null; local6 = (Class3_Sub2) this.aClass38_10.method488()) {
				if (local6.anInt242 == arg1 && local6.anInt244 == arg3 && local6.anInt245 == arg7 && local6.anInt243 == arg2) {
					local1 = local6;
					break;
				}
			}
			if (local1 == null) {
				local1 = new Class3_Sub2();
				local1.anInt242 = arg1;
				local1.anInt243 = arg2;
				local1.anInt244 = arg3;
				local1.anInt245 = arg7;
				this.method704(this.aBoolean204, local1);
				this.aClass38_10.method483(local1);
			}
			local1.anInt238 = arg6;
			local1.anInt240 = arg8;
			local1.anInt239 = arg9;
			local1.anInt241 = arg4;
			local1.anInt237 = arg0;
			if (arg5 < 0) {
				;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("55167, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZB)V")
	private void method637(@OriginalArg(0) boolean arg0) {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anInt997; local5++) {
				@Pc(15) Class3_Sub1_Sub1_Sub1_Sub2 local15 = this.aClass3_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray263[local5]];
				@Pc(24) int local24 = (this.anIntArray263[local5] << 14) + 536870912;
				if (local15 != null && local15.method214() && local15.aClass5_2.aBoolean9 == arg0 && local15.aClass5_2.method23()) {
					@Pc(45) int local45 = local15.anInt380 >> 7;
					@Pc(50) int local50 = local15.anInt381 >> 7;
					if (local45 >= 0 && local45 < 104 && local50 >= 0 && local50 < 104) {
						if (local15.anInt392 == 1 && (local15.anInt380 & 0x7F) == 64 && (local15.anInt381 & 0x7F) == 64) {
							if (this.anIntArrayArray23[local45][local50] == this.anInt850) {
								continue;
							}
							this.anIntArrayArray23[local45][local50] = this.anInt850;
						}
						if (!local15.aClass5_2.aBoolean7) {
							local24 += Integer.MIN_VALUE;
						}
						this.aClass17_1.method233(local15, local15.anInt380, local15.anInt381, local24, this.method601(local15.anInt381, this.anInt862, local15.anInt380), local15.aBoolean77, (local15.anInt392 - 1) * 64 + 60, this.aByte46, local15.anInt382, this.anInt862);
					}
				}
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("71554, " + arg0 + ", " + -59 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
	private void method639(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass3_Sub1_Sub3_Sub2_11.anIntArray83;
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
						this.aClass17_1.method257(local5, local34, arg0, local36, local22);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local36][local22] & 0x8) != 0) {
						this.aClass17_1.method257(local5, local34, arg0 + 1, local36, local22);
					}
					local34 += 4;
				}
			}
			local34 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local36 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass3_Sub1_Sub3_Sub2_11.method298();
			@Pc(146) int local146;
			for (@Pc(142) int local142 = 1; local142 < 103; local142++) {
				for (local146 = 1; local146 < 103; local146++) {
					if ((this.aByteArrayArrayArray8[arg0][local146][local142] & 0x18) == 0) {
						this.method625(local36, local34, local142, local146, arg0);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local146][local142] & 0x8) != 0) {
						this.method625(local36, local34, local142, local146, arg0 + 1);
					}
				}
			}
			if (this.aClass32_8 != null) {
				this.aClass32_8.method459();
				Class3_Sub1_Sub3_Sub3.anIntArray139 = this.anIntArray240;
			}
			this.anInt959 = 0;
			for (local146 = 0; local146 < 104; local146++) {
				for (@Pc(226) int local226 = 0; local226 < 104; local226++) {
					@Pc(236) int local236 = this.aClass17_1.method251(this.anInt862, local146, local226);
					if (local236 != 0) {
						local236 = local236 >> 14 & 0x7FFF;
						@Pc(248) int local248 = Class18.method278(local236).anInt481;
						if (local248 >= 0) {
							@Pc(252) int local252 = local146;
							@Pc(254) int local254 = local226;
							if (local248 != 22 && local248 != 29 && local248 != 34 && local248 != 36 && local248 != 46 && local248 != 47 && local248 != 48) {
								@Pc(286) int[][] local286 = this.aClass43Array1[this.anInt862].anIntArrayArray19;
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
							this.aClass3_Sub1_Sub3_Sub2Array8[this.anInt959] = this.aClass3_Sub1_Sub3_Sub2Array4[local248];
							this.anIntArray245[this.anInt959] = local252;
							this.anIntArray246[this.anInt959] = local254;
							this.anInt959++;
						}
					}
				}
			}
		} catch (@Pc(425) RuntimeException local425) {
			signlink.reporterror("95530, " + arg0 + ", " + true + ", " + local425.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method640() {
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
				this.anInt996 = -1;
				this.aClass38_11.method490();
				this.aClass38_12.method490();
				Class3_Sub1_Sub3_Sub3.method393();
				this.method597();
				this.aClass17_1.method222();
				System.gc();
				for (local22 = 0; local22 < 4; local22++) {
					this.aClass43Array1[local22].method508();
				}
				for (local35 = 0; local35 < 4; local35++) {
					for (local39 = 0; local39 < 104; local39++) {
						for (local43 = 0; local43 < 104; local43++) {
							this.aByteArrayArrayArray8[local35][local39][local43] = 0;
						}
					}
				}
				@Pc(77) Class23 local77 = new Class23(this.aByteArrayArrayArray8, 0, this.anIntArrayArrayArray7, 104, 104);
				local43 = this.aByteArrayArray6.length;
				this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 135);
				@Pc(240) int local240;
				@Pc(228) int local228;
				if (!this.aBoolean210) {
					@Pc(123) byte[] local123;
					for (local92 = 0; local92 < local43; local92++) {
						local106 = (this.anIntArray242[local92] >> 8) * 64 - this.anInt866;
						local118 = (this.anIntArray242[local92] & 0xFF) * 64 - this.anInt867;
						local123 = this.aByteArrayArray6[local92];
						if (local123 != null) {
							local77.method350((this.anInt893 - 6) * 8, (this.anInt892 - 6) * 8, this.aClass43Array1, local106, local118, local123);
						}
					}
					for (local106 = 0; local106 < local43; local106++) {
						local118 = (this.anIntArray242[local106] >> 8) * 64 - this.anInt866;
						local177 = (this.anIntArray242[local106] & 0xFF) * 64 - this.anInt867;
						@Pc(182) byte[] local182 = this.aByteArrayArray6[local106];
						if (local182 == null && this.anInt893 < 800) {
							local77.method352(local118, 64, 64, local177);
						}
					}
					this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 135);
					for (local118 = 0; local118 < local43; local118++) {
						local123 = this.aByteArrayArray5[local118];
						if (local123 != null) {
							local228 = (this.anIntArray242[local118] >> 8) * 64 - this.anInt866;
							local240 = (this.anIntArray242[local118] & 0xFF) * 64 - this.anInt867;
							local77.method348(local240, this.aClass43Array1, local123, this.aClass17_1, local228);
						}
					}
				}
				if (this.aBoolean210) {
					local92 = 0;
					label254: while (true) {
						@Pc(299) int local299;
						@Pc(305) int local305;
						@Pc(315) int local315;
						@Pc(317) int local317;
						if (local92 >= 4) {
							for (local106 = 0; local106 < 13; local106++) {
								for (local118 = 0; local118 < 13; local118++) {
									local177 = this.anIntArrayArrayArray8[0][local106][local118];
									if (local177 == -1) {
										local77.method352(local106 * 8, 8, 8, local118 * 8);
									}
								}
							}
							this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 135);
							local118 = 0;
							while (true) {
								if (local118 >= 4) {
									break label254;
								}
								for (local177 = 0; local177 < 13; local177++) {
									for (local228 = 0; local228 < 13; local228++) {
										local240 = this.anIntArrayArrayArray8[local118][local177][local228];
										if (local240 != -1) {
											local299 = local240 >> 24 & 0x3;
											local305 = local240 >> 1 & 0x3;
											local315 = local240 >> 14 & 0x3FF;
											local317 = local240 >> 3 & 0x7FF;
											@Pc(481) int local481 = (local315 / 8 << 8) + local317 / 8;
											for (@Pc(483) int local483 = 0; local483 < this.anIntArray242.length; local483++) {
												if (this.anIntArray242[local483] == local481 && this.aByteArrayArray5[local483] != null) {
													local77.method349(this.aClass43Array1, local305, (local315 & 0x7) * 8, (local317 & 0x7) * 8, local177 * 8, local118, this.aClass17_1, local228 * 8, local299, this.aByteArrayArray5[local483]);
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
									local228 = local177 >> 24 & 0x3;
									local240 = local177 >> 1 & 0x3;
									local299 = local177 >> 14 & 0x3FF;
									local305 = local177 >> 3 & 0x7FF;
									local315 = (local299 / 8 << 8) + local305 / 8;
									for (local317 = 0; local317 < this.anIntArray242.length; local317++) {
										if (this.anIntArray242[local317] == local315 && this.aByteArrayArray6[local317] != null) {
											local77.method347(local118 * 8, local106 * 8, (local299 & 0x7) * 8, this.aClass43Array1, (local305 & 0x7) * 8, local92, local228, this.aByteArrayArray6[local317], local240);
											break;
										}
									}
								}
							}
						}
						local92++;
					}
				}
				this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 135);
				local77.method346(this.aClass17_1, this.aClass43Array1);
				if (this.aClass32_8 != null) {
					this.aClass32_8.method459();
					Class3_Sub1_Sub3_Sub3.anIntArray139 = this.anIntArray240;
				}
				this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 135);
				local92 = Class23.anInt564;
				if (local92 > this.anInt862) {
					local92 = this.anInt862;
				}
				if (local92 < this.anInt862 - 1) {
					local92 = this.anInt862 - 1;
				}
				if (aBoolean224) {
					this.aClass17_1.method223(Class23.anInt564);
				} else {
					this.aClass17_1.method223(0);
				}
				for (local106 = 0; local106 < 104; local106++) {
					for (local118 = 0; local118 < 104; local118++) {
						this.method701(local106, local118);
					}
				}
				anInt961++;
				if (anInt961 > 55) {
					anInt961 = 0;
					this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 124);
				}
				this.method623();
			} catch (@Pc(649) Exception local649) {
			}
			Class18.aClass35_7.method476();
			if (super.aFrame_Sub1_2 != null) {
				this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 158);
				this.aClass3_Sub1_Sub2_7.method83(1057001181);
			}
			if (aBoolean224 && signlink.aRandomAccessFile3 != null) {
				local22 = this.aClass6_Sub1_1.method535(0, 171);
				for (local35 = 0; local35 < local22; local35++) {
					local39 = this.aClass6_Sub1_1.method534(local35);
					if ((local39 & 0x79) == 0) {
						Class3_Sub1_Sub1_Sub3.method320(local35);
					}
				}
			}
			System.gc();
			Class3_Sub1_Sub3_Sub3.method394();
			this.aClass6_Sub1_1.method542();
			local22 = (this.anInt892 - 6) / 8 - 1;
			local35 = (this.anInt892 + 6) / 8 + 1;
			local39 = (this.anInt893 - 6) / 8 - 1;
			local43 = (this.anInt893 + 6) / 8 + 1;
			if (this.aBoolean251) {
				local22 = 49;
				local35 = 50;
				local39 = 49;
				local43 = 50;
			}
			for (local92 = local22; local92 <= local35; local92++) {
				for (local106 = local39; local106 <= local43; local106++) {
					if (local92 == local22 || local92 == local35 || local106 == local39 || local106 == local43) {
						local118 = this.aClass6_Sub1_1.method533(local106, anInt1065, local92, 0);
						if (local118 != -1) {
							this.aClass6_Sub1_1.method549(local118, 3, this.anInt847);
						}
						local177 = this.aClass6_Sub1_1.method533(local106, anInt1065, local92, 1);
						if (local177 != -1) {
							this.aClass6_Sub1_1.method549(local177, 3, this.anInt847);
						}
					}
				}
			}
		} catch (@Pc(820) RuntimeException local820) {
			signlink.reporterror("59851, " + 4 + ", " + local820.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method641() {
		try {
			if (this.anInt935 > 0) {
				this.method643();
			} else {
				this.method644("Connection lost", "Please wait - attempting to reestablish");
				this.anInt926 = 0;
				this.anInt1040 = 0;
				@Pc(20) Class48 local20 = this.aClass48_1;
				this.aBoolean214 = false;
				this.anInt856 = 0;
				this.method719(this.aString20, this.aString21, true);
				if (!this.aBoolean214) {
					this.method643();
				}
				try {
					local20.method555();
				} catch (@Pc(46) Exception local46) {
				}
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("33964, " + true + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!DDJHHGTJ;III)V")
	private void method642(@OriginalArg(1) Class5 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (this.anInt1017 < 400) {
				if (arg0.anIntArray7 != null) {
					arg0 = arg0.method26();
				}
				if (arg0 != null && arg0.aBoolean7) {
					@Pc(23) String local23 = arg0.aString1;
					if (arg0.anInt53 != 0) {
						local23 = local23 + method714(aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt188, arg0.anInt53) + " (level-" + arg0.anInt53 + ")";
					}
					if (this.anInt1052 == 1) {
						this.aStringArray13[this.anInt1017] = "Use " + this.aString30 + " with @yel@" + local23;
						this.anIntArray255[this.anInt1017] = 237;
						this.anIntArray256[this.anInt1017] = arg1;
						this.anIntArray253[this.anInt1017] = arg3;
						this.anIntArray254[this.anInt1017] = arg2;
						this.anInt1017++;
					} else if (this.anInt986 != 1) {
						@Pc(165) int local165;
						if (arg0.aStringArray1 != null) {
							for (local165 = 4; local165 >= 0; local165--) {
								if (arg0.aStringArray1[local165] != null && !arg0.aStringArray1[local165].equalsIgnoreCase("attack")) {
									this.aStringArray13[this.anInt1017] = arg0.aStringArray1[local165] + " @yel@" + local23;
									if (local165 == 0) {
										this.anIntArray255[this.anInt1017] = 886;
									}
									if (local165 == 1) {
										this.anIntArray255[this.anInt1017] = 645;
									}
									if (local165 == 2) {
										this.anIntArray255[this.anInt1017] = 723;
									}
									if (local165 == 3) {
										this.anIntArray255[this.anInt1017] = 667;
									}
									if (local165 == 4) {
										this.anIntArray255[this.anInt1017] = 423;
									}
									this.anIntArray256[this.anInt1017] = arg1;
									this.anIntArray253[this.anInt1017] = arg3;
									this.anIntArray254[this.anInt1017] = arg2;
									this.anInt1017++;
								}
							}
						}
						if (arg0.aStringArray1 != null) {
							for (local165 = 4; local165 >= 0; local165--) {
								if (arg0.aStringArray1[local165] != null && arg0.aStringArray1[local165].equalsIgnoreCase("attack")) {
									@Pc(289) short local289 = 0;
									if (arg0.anInt53 > aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt188) {
										local289 = 2000;
									}
									this.aStringArray13[this.anInt1017] = arg0.aStringArray1[local165] + " @yel@" + local23;
									if (local165 == 0) {
										this.anIntArray255[this.anInt1017] = local289 + 886;
									}
									if (local165 == 1) {
										this.anIntArray255[this.anInt1017] = local289 + 645;
									}
									if (local165 == 2) {
										this.anIntArray255[this.anInt1017] = local289 + 723;
									}
									if (local165 == 3) {
										this.anIntArray255[this.anInt1017] = local289 + 667;
									}
									if (local165 == 4) {
										this.anIntArray255[this.anInt1017] = local289 + 423;
									}
									this.anIntArray256[this.anInt1017] = arg1;
									this.anIntArray253[this.anInt1017] = arg3;
									this.anIntArray254[this.anInt1017] = arg2;
									this.anInt1017++;
								}
							}
						}
						this.aStringArray13[this.anInt1017] = "Examine @yel@" + local23;
						this.anIntArray255[this.anInt1017] = 1892;
						this.anIntArray256[this.anInt1017] = arg1;
						this.anIntArray253[this.anInt1017] = arg3;
						this.anIntArray254[this.anInt1017] = arg2;
						this.anInt1017++;
					} else if ((this.anInt988 & 0x2) == 2) {
						this.aStringArray13[this.anInt1017] = this.aString27 + " @yel@" + local23;
						this.anIntArray255[this.anInt1017] = 893;
						this.anIntArray256[this.anInt1017] = arg1;
						this.anIntArray253[this.anInt1017] = arg3;
						this.anIntArray254[this.anInt1017] = arg2;
						this.anInt1017++;
						return;
					}
				}
			}
		} catch (@Pc(439) RuntimeException local439) {
			signlink.reporterror("17004, " + 1 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local439.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method643() {
		try {
			try {
				if (this.aClass48_1 != null) {
					this.aClass48_1.method555();
				}
			} catch (@Pc(7) Exception local7) {
			}
			this.aClass48_1 = null;
			this.aBoolean214 = false;
			this.anInt890 = 0;
			this.aString20 = "";
			this.aString21 = "";
			this.method597();
			this.aClass17_1.method222();
			for (@Pc(36) int local36 = 0; local36 < 4; local36++) {
				this.aClass43Array1[local36].method508();
			}
			System.gc();
			this.method608();
			this.anInt855 = -1;
			this.anInt998 = -1;
			this.anInt995 = 0;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("90473, " + false + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
	private void method644(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(20) int local20;
			if (this.aClass32_8 != null) {
				this.aClass32_8.method459();
				Class3_Sub1_Sub3_Sub3.anIntArray139 = this.anIntArray240;
				local20 = 151;
				if (arg1 != null) {
					local20 -= 7;
				}
				this.aClass3_Sub1_Sub3_Sub4_3.method440(local20, 257, 0, arg0);
				this.aClass3_Sub1_Sub3_Sub4_3.method440(local20 - 1, 256, 16777215, arg0);
				local20 += 15;
				if (arg1 != null) {
					this.aClass3_Sub1_Sub3_Sub4_3.method440(local20, 257, 0, arg1);
					this.aClass3_Sub1_Sub3_Sub4_3.method440(local20 - 1, 256, 16777215, arg1);
				}
				this.aClass32_8.method460(4, 4, super.aGraphics2);
			} else if (super.aClass32_2 != null) {
				super.aClass32_2.method459();
				Class3_Sub1_Sub3_Sub3.anIntArray139 = this.anIntArray241;
				local20 = 251;
				Class3_Sub1_Sub3.method432(233, 221, 300, 0, 50);
				Class3_Sub1_Sub3.method433(233, 300, 221, 16777215, 50);
				if (arg1 != null) {
					local20 -= 7;
				}
				this.aClass3_Sub1_Sub3_Sub4_3.method440(local20, 383, 0, arg0);
				this.aClass3_Sub1_Sub3_Sub4_3.method440(local20 - 1, 382, 16777215, arg0);
				local20 += 15;
				if (arg1 != null) {
					this.aClass3_Sub1_Sub3_Sub4_3.method440(local20, 383, 0, arg1);
					this.aClass3_Sub1_Sub3_Sub4_3.method440(local20 - 1, 382, 16777215, arg1);
				}
				super.aClass32_2.method460(0, 0, super.aGraphics2);
			}
		} catch (@Pc(173) RuntimeException local173) {
			signlink.reporterror("21242, " + arg0 + ", " + -284 + ", " + arg1 + ", " + local173.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method645(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			while (true) {
				@Pc(13) Class3_Sub1_Sub4 local13 = this.aClass6_Sub1_1.method529();
				if (local13 == null) {
					return;
				}
				if (local13.anInt639 == 0) {
					Class3_Sub1_Sub1_Sub3.method319(local13.anInt638, local13.aByteArray12);
					if ((this.aClass6_Sub1_1.method534(local13.anInt638) & 0x62) != 0) {
						this.aBoolean243 = true;
						if (this.anInt846 != -1 || this.anInt875 != -1) {
							this.aBoolean229 = true;
						}
					}
				}
				if (local13.anInt639 == 1 && local13.aByteArray12 != null) {
					Class47.method551(local13.aByteArray12);
				}
				if (local13.anInt639 == 2 && local13.anInt638 == this.anInt998 && local13.aByteArray12 != null) {
					this.method603(local13.aByteArray12, this.aBoolean239);
				}
				if (local13.anInt639 == 3 && this.anInt877 == 1) {
					for (@Pc(88) int local88 = 0; local88 < this.aByteArrayArray6.length; local88++) {
						if (this.anIntArray243[local88] == local13.anInt638) {
							this.aByteArrayArray6[local88] = local13.aByteArray12;
							if (local13.aByteArray12 == null) {
								this.anIntArray243[local88] = -1;
							}
							break;
						}
						if (this.anIntArray244[local88] == local13.anInt638) {
							this.aByteArrayArray5[local88] = local13.aByteArray12;
							if (local13.aByteArray12 == null) {
								this.anIntArray244[local88] = -1;
							}
							break;
						}
					}
				}
				if (local13.anInt639 == 93 && this.aClass6_Sub1_1.method539(local13.anInt638, this.anInt886)) {
					Class23.method365(this.aClass6_Sub1_1, new Class3_Sub1_Sub2(-527, local13.aByteArray12));
				}
			}
		} catch (@Pc(166) RuntimeException local166) {
			signlink.reporterror("94650, " + arg0 + ", " + local166.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(III)Z")
	private boolean method646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) boolean local3 = false;
			if (arg0 != -36645) {
				this.aClass38ArrayArrayArray1 = null;
			}
			@Pc(12) Class9 local12 = Class9.method58(arg2);
			for (@Pc(14) int local14 = 0; local14 < local12.anIntArray28.length && local12.anIntArray28[local14] != -1; local14++) {
				@Pc(28) Class9 local28 = Class9.method58(local12.anIntArray28[local14]);
				if (local28.anInt218 == 1) {
					local3 |= this.method646(this.anInt903, arg1, local28.anInt221);
				}
				@Pc(64) int local64;
				if (local28.anInt218 == 6 && (local28.anInt195 != -1 || local28.anInt196 != -1)) {
					@Pc(59) boolean local59 = this.method591(local28);
					if (local59) {
						local64 = local28.anInt196;
					} else {
						local64 = local28.anInt195;
					}
					if (local64 != -1) {
						@Pc(76) Class39 local76 = Class39.aClass39Array1[local64];
						local28.anInt216 += arg1;
						while (local28.anInt216 > local76.method492(local28.anInt230)) {
							local28.anInt216 -= local76.method492(local28.anInt230) + 1;
							local28.anInt230++;
							if (local28.anInt230 >= local76.anInt723) {
								local28.anInt230 -= local76.anInt724;
								if (local28.anInt230 < 0 || local28.anInt230 >= local76.anInt723) {
									local28.anInt230 = 0;
								}
							}
							local3 = true;
						}
					}
				}
				if (local28.anInt218 == 6 && local28.anInt194 != 0) {
					@Pc(147) int local147 = local28.anInt194 >> 16;
					local64 = local28.anInt194 << 16 >> 16;
					@Pc(158) int local158 = local147 * arg1;
					local64 *= arg1;
					local28.anInt212 = local28.anInt212 + local158 & 0x7FF;
					local28.anInt213 = local28.anInt213 + local64 & 0x7FF;
					local3 = true;
				}
			}
			return local3;
		} catch (@Pc(189) RuntimeException local189) {
			signlink.reporterror("53383, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local189.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I[BZ)Z")
	private boolean method647(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.aBoolean214 &= true;
			return arg1 == null ? true : signlink.wavesave(arg1, arg0);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("41914, " + arg0 + ", " + arg1 + ", " + true + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIB)V")
	private void method648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(1) int local1 = 0;
			if (this.aByte47 == 37) {
				for (@Pc(8) int local8 = 0; local8 < 100; local8++) {
					if (this.aStringArray11[local8] != null) {
						@Pc(20) int local20 = this.anIntArray227[local8];
						@Pc(31) int local31 = this.anInt927 + 70 + 4 - local1 * 14;
						if (local31 < -20) {
							break;
						}
						@Pc(39) String local39 = this.aStringArray10[local8];
						if (local39 != null && local39.startsWith("@cr1@")) {
							local39 = local39.substring(5);
						}
						if (local39 != null && local39.startsWith("@cr2@")) {
							local39 = local39.substring(5);
						}
						if (local20 == 0) {
							local1++;
						}
						if ((local20 == 1 || local20 == 2) && (local20 == 1 || this.anInt1022 == 0 || this.anInt1022 == 1 && this.method650(local39))) {
							if (arg0 > local31 - 14 && arg0 <= local31 && !local39.equals(aClass3_Sub1_Sub1_Sub1_Sub1_1.aString4)) {
								if (this.anInt1066 >= 1) {
									this.aStringArray13[this.anInt1017] = "Report abuse @whi@" + local39;
									this.anIntArray255[this.anInt1017] = 279;
									this.anInt1017++;
								}
								this.aStringArray13[this.anInt1017] = "Add ignore @whi@" + local39;
								this.anIntArray255[this.anInt1017] = 275;
								this.anInt1017++;
								this.aStringArray13[this.anInt1017] = "Add friend @whi@" + local39;
								this.anIntArray255[this.anInt1017] = 691;
								this.anInt1017++;
							}
							local1++;
						}
						if ((local20 == 3 || local20 == 7) && this.anInt925 == 0 && (local20 == 7 || this.anInt976 == 0 || this.anInt976 == 1 && this.method650(local39))) {
							if (arg0 > local31 - 14 && arg0 <= local31) {
								if (this.anInt1066 >= 1) {
									this.aStringArray13[this.anInt1017] = "Report abuse @whi@" + local39;
									this.anIntArray255[this.anInt1017] = 279;
									this.anInt1017++;
								}
								this.aStringArray13[this.anInt1017] = "Add ignore @whi@" + local39;
								this.anIntArray255[this.anInt1017] = 275;
								this.anInt1017++;
								this.aStringArray13[this.anInt1017] = "Add friend @whi@" + local39;
								this.anIntArray255[this.anInt1017] = 691;
								this.anInt1017++;
							}
							local1++;
						}
						if (local20 == 4 && (this.anInt900 == 0 || this.anInt900 == 1 && this.method650(local39))) {
							if (arg0 > local31 - 14 && arg0 <= local31) {
								this.aStringArray13[this.anInt1017] = "Accept trade @whi@" + local39;
								this.anIntArray255[this.anInt1017] = 532;
								this.anInt1017++;
							}
							local1++;
						}
						if ((local20 == 5 || local20 == 6) && this.anInt925 == 0 && this.anInt976 < 2) {
							local1++;
						}
						if (local20 == 8 && (this.anInt900 == 0 || this.anInt900 == 1 && this.method650(local39))) {
							if (arg0 > local31 - 14 && arg0 <= local31) {
								this.aStringArray13[this.anInt1017] = "Accept challenge @whi@" + local39;
								this.anIntArray255[this.anInt1017] = 938;
								this.anInt1017++;
							}
							local1++;
						}
					}
				}
			}
		} catch (@Pc(404) RuntimeException local404) {
			signlink.reporterror("7851, " + arg0 + ", " + arg1 + ", " + 37 + ", " + local404.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method649() {
		try {
			@Pc(7) byte[] local7 = this.aClass7_2.method30("title.dat", null);
			@Pc(13) Class3_Sub1_Sub3_Sub2 local13 = new Class3_Sub1_Sub3_Sub2(local7, this);
			this.aClass32_13.method459();
			local13.method301(0, 0);
			this.aClass32_14.method459();
			local13.method301(0, -637);
			this.aClass32_10.method459();
			local13.method301(0, -128);
			this.aClass32_11.method459();
			local13.method301(-371, -202);
			this.aClass32_12.method459();
			local13.method301(-171, -202);
			this.aClass32_15.method459();
			local13.method301(-265, 0);
			this.aClass32_16.method459();
			local13.method301(-265, -562);
			this.aClass32_17.method459();
			local13.method301(-171, -128);
			this.aClass32_18.method459();
			local13.method301(-171, -562);
			@Pc(98) int[] local98 = new int[local13.anInt509];
			for (@Pc(100) int local100 = 0; local100 < local13.anInt510; local100++) {
				for (@Pc(104) int local104 = 0; local104 < local13.anInt509; local104++) {
					local98[local104] = local13.anIntArray83[local13.anInt509 + local13.anInt509 * local100 - local104 - 1];
				}
				for (@Pc(130) int local130 = 0; local130 < local13.anInt509; local130++) {
					local13.anIntArray83[local130 + local13.anInt509 * local100] = local98[local130];
				}
			}
			this.aClass32_13.method459();
			local13.method301(0, 382);
			this.aClass32_14.method459();
			local13.method301(0, -255);
			this.aClass32_10.method459();
			local13.method301(0, 254);
			this.aClass32_11.method459();
			local13.method301(-371, 180);
			this.aClass32_12.method459();
			local13.method301(-171, 180);
			this.aClass32_15.method459();
			local13.method301(-265, 382);
			this.aClass32_16.method459();
			local13.method301(-265, -180);
			this.aClass32_17.method459();
			local13.method301(-171, 254);
			this.aClass32_18.method459();
			local13.method301(-171, -180);
			local13 = new Class3_Sub1_Sub3_Sub2(this.aClass7_2, "logo", 0);
			this.aClass32_10.method459();
			local13.method303(18, 382 - local13.anInt509 / 2 - 128);
			System.gc();
		} catch (@Pc(274) RuntimeException local274) {
			signlink.reporterror("18615, " + 502 + ", " + local274.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLjava/lang/String;)Z")
	private boolean method650(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(5) int local5 = 0; local5 < this.anInt937; local5++) {
				if (arg0.equalsIgnoreCase(this.aStringArray12[local5])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass3_Sub1_Sub1_Sub1_Sub1_1.aString4);
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("55772, " + -30 + ", " + arg0 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!EKHKDMUP;B)Z")
	private boolean method651(@OriginalArg(0) Class9 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt220;
			if (this.anInt938 == 2) {
				if (local4 == 201) {
					this.aBoolean229 = true;
					this.anInt969 = 0;
					this.aBoolean244 = true;
					this.aString23 = "";
					this.anInt968 = 1;
					this.aString29 = "Enter name of friend to add to list";
				}
				if (local4 == 202) {
					this.aBoolean229 = true;
					this.anInt969 = 0;
					this.aBoolean244 = true;
					this.aString23 = "";
					this.anInt968 = 2;
					this.aString29 = "Enter name of friend to delete from list";
				}
			}
			if (local4 == 205) {
				this.anInt935 = 250;
				return true;
			}
			if (local4 == 501) {
				this.aBoolean229 = true;
				this.anInt969 = 0;
				this.aBoolean244 = true;
				this.aString23 = "";
				this.anInt968 = 4;
				this.aString29 = "Enter name of player to add to list";
			}
			if (local4 == 502) {
				this.aBoolean229 = true;
				this.anInt969 = 0;
				this.aBoolean244 = true;
				this.aString23 = "";
				this.anInt968 = 5;
				this.aString29 = "Enter name of player to delete from list";
			}
			@Pc(118) int local118;
			@Pc(122) int local122;
			@Pc(127) int local127;
			if (local4 >= 300 && local4 <= 313) {
				local118 = (local4 - 300) / 2;
				local122 = local4 & 0x1;
				local127 = this.anIntArray260[local118];
				if (local127 != -1) {
					while (true) {
						if (local122 == 0) {
							local127--;
							if (local127 < 0) {
								local127 = Class10.anInt232 - 1;
							}
						}
						if (local122 == 1) {
							local127++;
							if (local127 >= Class10.anInt232) {
								local127 = 0;
							}
						}
						if (!Class10.aClass10Array1[local127].aBoolean41 && Class10.aClass10Array1[local127].anInt233 == local118 + (this.aBoolean238 ? 0 : 7)) {
							this.anIntArray260[local118] = local127;
							this.aBoolean208 = true;
							break;
						}
					}
				}
			}
			if (local4 >= 314 && local4 <= 323) {
				local118 = (local4 - 314) / 2;
				local122 = local4 & 0x1;
				local127 = this.anIntArray235[local118];
				if (local122 == 0) {
					local127--;
					if (local127 < 0) {
						local127 = anIntArrayArray25[local118].length - 1;
					}
				}
				if (local122 == 1) {
					local127++;
					if (local127 >= anIntArrayArray25[local118].length) {
						local127 = 0;
					}
				}
				this.anIntArray235[local118] = local127;
				this.aBoolean208 = true;
			}
			if (local4 == 324 && !this.aBoolean238) {
				this.aBoolean238 = true;
				this.method612();
			}
			if (local4 == 325 && this.aBoolean238) {
				this.aBoolean238 = false;
				this.method612();
			}
			if (local4 == 326) {
				this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 25);
				this.aClass3_Sub1_Sub2_7.method79(this.aBoolean238 ? 0 : 1);
				for (local118 = 0; local118 < 7; local118++) {
					this.aClass3_Sub1_Sub2_7.method79(this.anIntArray260[local118]);
				}
				for (local122 = 0; local122 < 5; local122++) {
					this.aClass3_Sub1_Sub2_7.method79(this.anIntArray235[local122]);
				}
				return true;
			}
			if (local4 == 620) {
				this.aBoolean207 = !this.aBoolean207;
			}
			if (local4 >= 601 && local4 <= 613) {
				this.method721();
				if (this.aString19.length() > 0) {
					this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 195);
					this.aClass3_Sub1_Sub2_7.method85(Class36.method477(this.aString19));
					this.aClass3_Sub1_Sub2_7.method79(local4 - 601);
					this.aClass3_Sub1_Sub2_7.method79(this.aBoolean207 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(357) RuntimeException local357) {
			signlink.reporterror("66686, " + arg0 + ", " + -127 + ", " + local357.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IILclient!GHHPHSRU;)V")
	private void method652(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub1_Sub2 arg1) {
		try {
			this.anInt1039 = 0;
			this.anInt1029 = 0;
			this.method594(arg1, arg0);
			this.method685(arg1, arg0, this.anInt904);
			this.method715(arg0, arg1);
			this.method710(arg1, arg0);
			@Pc(47) int local47;
			for (@Pc(40) int local40 = 0; local40 < this.anInt1039; local40++) {
				local47 = this.anIntArray268[local40];
				if (this.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local47].anInt391 != anInt1003) {
					this.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local47] = null;
				}
			}
			if (arg1.anInt257 != arg0) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.anInt257 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local47 = 0; local47 < this.anInt1028; local47++) {
				if (this.aClass3_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray266[local47]] == null) {
					signlink.reporterror(this.aString20 + " null entry in pl list - pos:" + local47 + " size:" + this.anInt1028);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("17418, " + arg0 + ", " + 480 + ", " + arg1 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method653() {
		try {
			this.aBoolean198 = false;
			while (this.aBoolean234) {
				this.aBoolean198 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(11) Exception local11) {
				}
			}
			this.aClass3_Sub1_Sub3_Sub1_4 = null;
			this.aClass3_Sub1_Sub3_Sub1_5 = null;
			this.aClass3_Sub1_Sub3_Sub1Array4 = null;
			this.anIntArray212 = null;
			this.anIntArray213 = null;
			this.anIntArray214 = null;
			this.anIntArray215 = null;
			this.anIntArray232 = null;
			this.anIntArray233 = null;
			this.anIntArray257 = null;
			this.anInt931 += 0;
			this.anIntArray258 = null;
			this.aClass3_Sub1_Sub3_Sub2_6 = null;
			this.aClass3_Sub1_Sub3_Sub2_7 = null;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("50814, " + 0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!EJJAKGTE;IIII)V")
	private void method654(@OriginalArg(0) Class3_Sub1_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 != aClass3_Sub1_Sub1_Sub1_Sub1_1 && this.anInt1017 < 400) {
				@Pc(40) String local40;
				if (arg0.anInt172 == 0) {
					local40 = arg0.aString4 + method714(aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt188, arg0.anInt188) + " (level-" + arg0.anInt188 + ")";
				} else {
					local40 = arg0.aString4 + " (skill-" + arg0.anInt172 + ")";
				}
				@Pc(170) int local170;
				if (this.anInt1052 == 1) {
					this.aStringArray13[this.anInt1017] = "Use " + this.aString30 + " with @whi@" + local40;
					this.anIntArray255[this.anInt1017] = 395;
					this.anIntArray256[this.anInt1017] = arg2;
					this.anIntArray253[this.anInt1017] = arg1;
					this.anIntArray254[this.anInt1017] = arg3;
					this.anInt1017++;
				} else if (this.anInt986 != 1) {
					for (local170 = 4; local170 >= 0; local170--) {
						if (this.aStringArray9[local170] != null) {
							this.aStringArray13[this.anInt1017] = this.aStringArray9[local170] + " @whi@" + local40;
							@Pc(197) short local197 = 0;
							if (this.aStringArray9[local170].equalsIgnoreCase("attack")) {
								if (arg0.anInt188 > aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt188) {
									local197 = 2000;
								}
								if (aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt174 != 0 && arg0.anInt174 != 0) {
									if (aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt174 == arg0.anInt174) {
										local197 = 2000;
									} else {
										local197 = 0;
									}
								}
							} else if (this.aBooleanArray11[local170]) {
								local197 = 2000;
							}
							if (local170 == 0) {
								this.anIntArray255[this.anInt1017] = local197 + 134;
							}
							if (local170 == 1) {
								this.anIntArray255[this.anInt1017] = local197 + 473;
							}
							if (local170 == 2) {
								this.anIntArray255[this.anInt1017] = local197 + 261;
							}
							if (local170 == 3) {
								this.anIntArray255[this.anInt1017] = local197 + 554;
							}
							if (local170 == 4) {
								this.anIntArray255[this.anInt1017] = local197 + 778;
							}
							this.anIntArray256[this.anInt1017] = arg2;
							this.anIntArray253[this.anInt1017] = arg1;
							this.anIntArray254[this.anInt1017] = arg3;
							this.anInt1017++;
						}
					}
				} else if ((this.anInt988 & 0x8) == 8) {
					this.aStringArray13[this.anInt1017] = this.aString27 + " @whi@" + local40;
					this.anIntArray255[this.anInt1017] = 681;
					this.anIntArray256[this.anInt1017] = arg2;
					this.anIntArray253[this.anInt1017] = arg1;
					this.anIntArray254[this.anInt1017] = arg3;
					this.anInt1017++;
				}
				for (local170 = 0; local170 < this.anInt1017; local170++) {
					if (this.anIntArray255[local170] == 506) {
						this.aStringArray13[local170] = "Walk here @whi@" + local40;
						return;
					}
				}
			}
		} catch (@Pc(347) RuntimeException local347) {
			signlink.reporterror("49344, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -800 + ", " + arg3 + ", " + local347.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
	private void method655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg5 >= 1 && arg4 >= 1 && arg5 <= 102 && arg4 <= 102) {
				if (aBoolean224 && arg3 != this.anInt862) {
					return;
				}
				@Pc(24) int local24 = 0;
				if (arg0 == 0) {
					local24 = this.aClass17_1.method248(arg3, arg5, arg4);
				}
				if (arg0 == 1) {
					local24 = this.aClass17_1.method249(arg3, arg4, arg5);
				}
				if (arg0 == 2) {
					local24 = this.aClass17_1.method250(arg3, arg5, arg4);
				}
				if (arg0 == 3) {
					local24 = this.aClass17_1.method251(arg3, arg5, arg4);
				}
				@Pc(80) int local80;
				if (local24 != 0) {
					local80 = this.aClass17_1.method252(arg3, arg5, arg4, local24);
					@Pc(86) int local86 = local24 >> 14 & 0x7FFF;
					@Pc(90) int local90 = local80 & 0x1F;
					@Pc(94) int local94 = local80 >> 6;
					@Pc(106) Class18 local106;
					if (arg0 == 0) {
						this.aClass17_1.method239(arg4, arg5, arg3);
						local106 = Class18.method278(local86);
						if (local106.aBoolean89) {
							this.aClass43Array1[arg3].method513(arg4, local90, local94, arg5, local106.aBoolean94);
						}
					}
					if (arg0 == 1) {
						this.aClass17_1.method240(arg3, arg5, arg4);
					}
					if (arg0 == 2) {
						this.aClass17_1.method241(arg3, arg4, arg5);
						local106 = Class18.method278(local86);
						if (arg5 + local106.anInt488 > 103 || arg4 + local106.anInt488 > 103 || arg5 + local106.anInt484 > 103 || arg4 + local106.anInt484 > 103) {
							return;
						}
						if (local106.aBoolean89) {
							this.aClass43Array1[arg3].method514(arg5, arg4, local94, local106.aBoolean94, local106.anInt484, this.aBoolean242, local106.anInt488);
						}
					}
					if (arg0 == 3) {
						this.aClass17_1.method242(arg5, arg4, arg3);
						local106 = Class18.method278(local86);
						if (local106.aBoolean89 && local106.aBoolean90) {
							this.aClass43Array1[arg3].method516(arg4, arg5);
						}
					}
				}
				if (arg1 >= 0) {
					local80 = arg3;
					if (arg3 < 3 && (this.aByteArrayArrayArray8[1][arg5][arg4] & 0x2) == 2) {
						local80 = arg3 + 1;
					}
					Class23.method354(arg6, this.aClass17_1, this.anIntArrayArrayArray7, arg1, this.anInt921, this.aClass43Array1[arg3], arg4, arg2, arg5, arg3, local80);
					return;
				}
			}
		} catch (@Pc(255) RuntimeException local255) {
			signlink.reporterror("11423, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + 5 + ", " + local255.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBIILclient!EKHKDMUP;III)V")
	private void method656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class9 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (this.aBoolean222) {
				this.anInt1013 = 32;
			} else {
				this.anInt1013 = 0;
			}
			this.aBoolean222 = false;
			if (arg7 >= arg3 && arg7 < arg3 + 16 && arg5 >= arg6 && arg5 < arg6 + 16) {
				arg4.anInt205 -= this.anInt946 * 4;
				if (arg1 == 1) {
					this.aBoolean243 = true;
				}
				if (arg1 == 2 || arg1 == 3) {
					this.aBoolean229 = true;
				}
			} else if (arg7 >= arg3 && arg7 < arg3 + 16 && arg5 >= arg6 + arg2 - 16 && arg5 < arg6 + arg2) {
				arg4.anInt205 += this.anInt946 * 4;
				if (arg1 == 1) {
					this.aBoolean243 = true;
				}
				if (arg1 == 2 || arg1 == 3) {
					this.aBoolean229 = true;
				}
			} else if (arg7 >= arg3 - this.anInt1013 && arg7 < arg3 + this.anInt1013 + 16 && arg5 >= arg6 + 16 && arg5 < arg6 + arg2 - 16 && this.anInt946 > 0) {
				@Pc(148) int local148 = (arg2 - 32) * arg2 / arg0;
				if (local148 < 8) {
					local148 = 8;
				}
				@Pc(163) int local163 = arg5 - arg6 - local148 / 2 - 16;
				@Pc(169) int local169 = arg2 - local148 - 32;
				arg4.anInt205 = (arg0 - arg2) * local163 / local169;
				if (arg1 == 1) {
					this.aBoolean243 = true;
				}
				if (arg1 == 2 || arg1 == 3) {
					this.aBoolean229 = true;
				}
				this.aBoolean222 = true;
			}
		} catch (@Pc(198) RuntimeException local198) {
			signlink.reporterror("36742, " + arg0 + ", " + arg1 + ", " + 43 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local198.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method657() {
		try {
			@Pc(2) int local2 = this.anInt1007;
			@Pc(5) int local5 = this.anInt1008;
			@Pc(8) int local8 = this.anInt1009;
			@Pc(11) int local11 = this.anInt1010;
			Class3_Sub1_Sub3.method432(local2, local5, local8, 6116423, local11);
			Class3_Sub1_Sub3.method432(local2 + 1, local5 + 1, local8 - 2, 0, 16);
			Class3_Sub1_Sub3.method433(local2 + 1, local8 - 2, local5 + 18, 0, local11 - 19);
			if (this.aByte43 != -10) {
				this.anInt932 = -1;
			}
			this.aClass3_Sub1_Sub3_Sub4_4.method444(6116423, "Choose Option", local5 + 14, local2 + 3);
			@Pc(70) int local70 = super.anInt831;
			@Pc(73) int local73 = super.anInt832;
			if (this.anInt1006 == 0) {
				local70 -= 4;
				local73 -= 4;
			}
			if (this.anInt1006 == 1) {
				local70 -= 553;
				local73 -= 205;
			}
			if (this.anInt1006 == 2) {
				local70 -= 17;
				local73 -= 357;
			}
			for (@Pc(92) int local92 = 0; local92 < this.anInt1017; local92++) {
				@Pc(107) int local107 = local5 + (this.anInt1017 - 1 - local92) * 15 + 31;
				@Pc(109) int local109 = 16777215;
				if (local70 > local2 && local70 < local2 + local8 && local73 > local107 - 13 && local73 < local107 + 3) {
					local109 = 16776960;
				}
				this.aClass3_Sub1_Sub3_Sub4_4.method448(local2 + 3, this.aStringArray13[local92], local109, local107, true);
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("1366, " + -10 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method658() {
		try {
			@Pc(3) int local3 = 5;
			this.anIntArray271[8] = 0;
			@Pc(16) int local16 = 0;
			while (this.anIntArray271[8] == 0) {
				@Pc(20) String local20 = "Unknown problem";
				this.method586(20, aBoolean199, "Connecting to web server");
				try {
					@Pc(42) DataInputStream local42 = this.method630("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 345);
					@Pc(49) Class3_Sub1_Sub2 local49 = new Class3_Sub1_Sub2(-527, new byte[40]);
					local42.readFully(local49.aByteArray3, 0, 40);
					local42.close();
					for (@Pc(59) int local59 = 0; local59 < 9; local59++) {
						this.anIntArray271[local59] = local49.method94();
					}
					@Pc(74) int local74 = local49.method94();
					@Pc(76) int local76 = 1234;
					for (@Pc(78) int local78 = 0; local78 < 9; local78++) {
						local76 = (local76 << 1) + this.anIntArray271[local78];
					}
					if (local74 != local76) {
						local20 = "checksum problem";
						this.anIntArray271[8] = 0;
					}
				} catch (@Pc(105) EOFException local105) {
					local20 = "EOF problem";
					this.anIntArray271[8] = 0;
				} catch (@Pc(114) IOException local114) {
					local20 = "connection problem";
					this.anIntArray271[8] = 0;
				} catch (@Pc(123) Exception local123) {
					local20 = "logic problem";
					this.anIntArray271[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray271[8] == 0) {
					local16++;
					for (@Pc(141) int local141 = local3; local141 > 0; local141--) {
						if (local16 >= 10) {
							this.method586(10, aBoolean199, "Game updated - please reload page");
							local141 = 10;
						} else {
							this.method586(10, aBoolean199, local20 + " - Will retry in " + local141 + " secs.");
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(175) Exception local175) {
						}
					}
					local3 *= 2;
					if (local3 > 60) {
						local3 = 60;
					}
					this.aBoolean200 = !this.aBoolean200;
				}
			}
		} catch (@Pc(203) RuntimeException local203) {
			signlink.reporterror("52465, " + -565 + ", " + local203.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
	private void method659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = true;
			Class9.method67(arg0, 15);
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("88327, " + arg0 + ", " + arg1 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
	private void method660() {
		try {
			this.anInt850++;
			this.method673(true);
			this.method637(true);
			this.method673(false);
			this.method637(false);
			this.method662();
			this.method618(this.aBoolean228);
			@Pc(40) int local40;
			@Pc(79) int local79;
			if (!this.aBoolean237) {
				local40 = this.anInt1042;
				if (this.anInt970 / 256 > local40) {
					local40 = this.anInt970 / 256;
				}
				if (this.aBooleanArray12[4] && this.anIntArray217[4] + 128 > local40) {
					local40 = this.anIntArray217[4] + 128;
				}
				local79 = this.anInt1043 + this.anInt1014 & 0x7FF;
				this.method617(local79, this.method601(aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt381, this.anInt862, aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt380) - 50, this.anInt993, local40 * 3 + 600, local40, this.anInt992);
			}
			if (this.aBoolean237) {
				local40 = this.method614();
			} else {
				local40 = this.method613();
			}
			local79 = this.anInt963;
			@Pc(123) int local123 = this.anInt964;
			@Pc(126) int local126 = this.anInt965;
			@Pc(129) int local129 = this.anInt966;
			@Pc(132) int local132 = this.anInt967;
			@Pc(181) int local181;
			for (@Pc(134) int local134 = 0; local134 < 5; local134++) {
				if (this.aBooleanArray12[local134]) {
					local181 = (int) (Math.random() * (double) (this.anIntArray234[local134] * 2 + 1) - (double) this.anIntArray234[local134] + Math.sin((double) this.anIntArray249[local134] * ((double) this.anIntArray236[local134] / 100.0D)) * (double) this.anIntArray217[local134]);
					if (local134 == 0) {
						this.anInt963 += local181;
					}
					if (local134 == 1) {
						this.anInt964 += local181;
					}
					if (local134 == 2) {
						this.anInt965 += local181;
					}
					if (local134 == 3) {
						this.anInt967 = this.anInt967 + local181 & 0x7FF;
					}
					if (local134 == 4) {
						this.anInt966 += local181;
						if (this.anInt966 < 128) {
							this.anInt966 = 128;
						}
						if (this.anInt966 > 383) {
							this.anInt966 = 383;
						}
					}
				}
			}
			local181 = Class3_Sub1_Sub3_Sub3.anInt603;
			Class3_Sub1_Sub1_Sub3.aBoolean125 = true;
			Class3_Sub1_Sub1_Sub3.anInt560 = 0;
			Class3_Sub1_Sub1_Sub3.anInt558 = super.anInt831 - 4;
			Class3_Sub1_Sub1_Sub3.anInt559 = super.anInt832 - 4;
			Class3_Sub1_Sub3.method430();
			this.aClass17_1.method261(this.anInt964, this.anInt967, this.anInt965, local40, this.anInt966, this.anInt963);
			this.aClass17_1.method236();
			this.method620();
			this.method712();
			this.method610(this.aBoolean219, local181);
			this.method718();
			this.aClass32_8.method460(4, 4, super.aGraphics2);
			this.anInt963 = local79;
			this.anInt964 = local123;
			this.anInt965 = local126;
			this.anInt966 = local129;
			this.anInt967 = local132;
		} catch (@Pc(321) RuntimeException local321) {
			signlink.reporterror("10699, " + 126 + ", " + local321.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZZ)V")
	private void method661(@OriginalArg(1) boolean arg0) {
		try {
			this.method587();
			this.aClass32_12.method459();
			this.aClass3_Sub1_Sub3_Sub1_4.method204(0, 0);
			@Pc(49) byte local49;
			@Pc(61) int local61;
			if (this.anInt890 == 0) {
				this.aClass3_Sub1_Sub3_Sub4_2.method441(true, 7711145, 180, this.aClass6_Sub1_1.aString15, 180);
				local49 = 80;
				this.aClass3_Sub1_Sub3_Sub4_4.method441(true, 16776960, 80, "Welcome to RuneScape", 180);
				local61 = local49 + 30;
				this.aClass3_Sub1_Sub3_Sub1_5.method204(100, 27);
				this.aClass3_Sub1_Sub3_Sub4_4.method441(true, 16777215, 125, "New User", 100);
				this.aClass3_Sub1_Sub3_Sub1_5.method204(100, 187);
				this.aClass3_Sub1_Sub3_Sub4_4.method441(true, 16777215, 125, "Existing User", 260);
			}
			if (this.anInt890 == 2) {
				local49 = 60;
				if (this.aString24.length() > 0) {
					this.aClass3_Sub1_Sub3_Sub4_4.method441(true, 16776960, 45, this.aString24, 180);
					this.aClass3_Sub1_Sub3_Sub4_4.method441(true, 16776960, 60, this.aString25, 180);
					local61 = local49 + 30;
				} else {
					this.aClass3_Sub1_Sub3_Sub4_4.method441(true, 16776960, 53, this.aString25, 180);
					local61 = local49 + 30;
				}
				this.aClass3_Sub1_Sub3_Sub4_4.method448(90, "Username: " + this.aString20 + (this.anInt960 == 0 & anInt1003 % 40 < 20 ? "@yel@|" : ""), 16777215, 90, true);
				local61 += 15;
				this.aClass3_Sub1_Sub3_Sub4_4.method448(92, "Password: " + Class36.method482(this.aString21) + (this.anInt960 == 1 & anInt1003 % 40 < 20 ? "@yel@|" : ""), 16777215, 105, true);
				local61 += 15;
				if (!arg0) {
					this.aClass3_Sub1_Sub3_Sub1_5.method204(130, 27);
					this.aClass3_Sub1_Sub3_Sub4_4.method441(true, 16777215, 155, "Login", 100);
					this.aClass3_Sub1_Sub3_Sub1_5.method204(130, 187);
					this.aClass3_Sub1_Sub3_Sub4_4.method441(true, 16777215, 155, "Cancel", 260);
				}
			}
			if (this.anInt890 == 3) {
				this.aClass3_Sub1_Sub3_Sub4_4.method441(true, 16776960, 40, "Create a free account", 180);
				local49 = 65;
				this.aClass3_Sub1_Sub3_Sub4_4.method441(true, 16777215, 65, "To create a new account you need to", 180);
				local61 = local49 + 15;
				this.aClass3_Sub1_Sub3_Sub4_4.method441(true, 16777215, 80, "go back to the main RuneScape webpage", 180);
				local61 += 15;
				this.aClass3_Sub1_Sub3_Sub4_4.method441(true, 16777215, 95, "and choose the 'create account'", 180);
				local61 += 15;
				this.aClass3_Sub1_Sub3_Sub4_4.method441(true, 16777215, 110, "button near the top of that page.", 180);
				local61 += 15;
				this.aClass3_Sub1_Sub3_Sub1_5.method204(130, 107);
				this.aClass3_Sub1_Sub3_Sub4_4.method441(true, 16777215, 155, "Cancel", 180);
			}
			this.aClass32_12.method460(171, 202, super.aGraphics2);
			if (this.aBoolean227) {
				this.aBoolean227 = false;
				this.aClass32_10.method460(0, 128, super.aGraphics2);
				this.aClass32_11.method460(371, 202, super.aGraphics2);
				this.aClass32_15.method460(265, 0, super.aGraphics2);
				this.aClass32_16.method460(265, 562, super.aGraphics2);
				this.aClass32_17.method460(171, 128, super.aGraphics2);
				this.aClass32_18.method460(171, 562, super.aGraphics2);
			}
		} catch (@Pc(494) RuntimeException local494) {
			signlink.reporterror("14993, " + false + ", " + arg0 + ", " + local494.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method583() {
		try {
			this.aBoolean227 = true;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("95716, " + 97 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
	private void method662() {
		try {
			for (@Pc(10) Class3_Sub1_Sub1_Sub5 local10 = (Class3_Sub1_Sub1_Sub5) this.aClass38_12.method486(); local10 != null; local10 = (Class3_Sub1_Sub1_Sub5) this.aClass38_12.method488()) {
				if (local10.anInt643 != this.anInt862 || anInt1003 > local10.anInt651) {
					local10.method503();
				} else if (anInt1003 >= local10.anInt650) {
					if (local10.anInt658 > 0) {
						@Pc(40) Class3_Sub1_Sub1_Sub1_Sub2 local40 = this.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local10.anInt658 - 1];
						if (local40 != null && local40.anInt380 >= 0 && local40.anInt380 < 13312 && local40.anInt381 >= 0 && local40.anInt381 < 13312) {
							local10.method424(this.method601(local40.anInt381, local10.anInt643, local40.anInt380) - local10.anInt649, anInt1003, local40.anInt381, local40.anInt380);
						}
					}
					if (local10.anInt658 < 0) {
						@Pc(85) int local85 = -local10.anInt658 - 1;
						@Pc(91) Class3_Sub1_Sub1_Sub1_Sub1 local91;
						if (local85 == this.anInt1051) {
							local91 = aClass3_Sub1_Sub1_Sub1_Sub1_1;
						} else {
							local91 = this.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local85];
						}
						if (local91 != null && local91.anInt380 >= 0 && local91.anInt380 < 13312 && local91.anInt381 >= 0 && local91.anInt381 < 13312) {
							local10.method424(this.method601(local91.anInt381, local10.anInt643, local91.anInt380) - local10.anInt649, anInt1003, local91.anInt381, local91.anInt380);
						}
					}
					local10.method423(this.anInt975);
					this.aClass17_1.method233(local10, (int) local10.aDouble5, (int) local10.aDouble6, -1, (int) local10.aDouble7, false, 60, this.aByte46, local10.anInt652, this.anInt862);
				}
			}
		} catch (@Pc(172) RuntimeException local172) {
			signlink.reporterror("4729, " + 4 + ", " + local172.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(B)V")
	private void method663(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) Graphics local4 = this.method584((byte) 9).getGraphics();
			local4.setColor(Color.black);
			if (arg0 != 67) {
				this.anInt932 = -1;
			}
			local4.fillRect(0, 0, 765, 503);
			this.method577();
			@Pc(42) byte local42;
			@Pc(48) int local48;
			if (this.aBoolean220) {
				this.aBoolean198 = false;
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
			if (this.aBoolean218) {
				this.aBoolean198 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean232) {
				this.aBoolean198 = false;
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
			signlink.reporterror("89561, " + arg0 + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLclient!GHHPHSRU;)V")
	private void method664(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub1_Sub2 arg1) {
		try {
			arg1.method99();
			@Pc(15) int local15 = arg1.method100(8, this.anInt1048);
			@Pc(21) int local21;
			if (local15 < this.anInt997) {
				for (local21 = local15; local21 < this.anInt997; local21++) {
					this.anIntArray268[this.anInt1039++] = this.anIntArray263[local21];
				}
			}
			if (local15 > this.anInt997) {
				signlink.reporterror(this.aString20 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt997 = 0;
			for (local21 = 0; local21 < local15; local21++) {
				@Pc(73) int local73 = this.anIntArray263[local21];
				@Pc(78) Class3_Sub1_Sub1_Sub1_Sub2 local78 = this.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local73];
				@Pc(84) int local84 = arg1.method100(1, this.anInt1048);
				if (local84 == 0) {
					this.anIntArray263[this.anInt997++] = local73;
					local78.anInt391 = anInt1003;
				} else {
					@Pc(108) int local108 = arg1.method100(2, this.anInt1048);
					if (local108 == 0) {
						this.anIntArray263[this.anInt997++] = local73;
						local78.anInt391 = anInt1003;
						this.anIntArray267[this.anInt1029++] = local73;
					} else {
						@Pc(160) int local160;
						@Pc(171) int local171;
						if (local108 == 1) {
							this.anIntArray263[this.anInt997++] = local73;
							local78.anInt391 = anInt1003;
							local160 = arg1.method100(3, this.anInt1048);
							local78.method210(false, local160);
							local171 = arg1.method100(1, this.anInt1048);
							if (local171 == 1) {
								this.anIntArray267[this.anInt1029++] = local73;
							}
						} else if (local108 == 2) {
							this.anIntArray263[this.anInt997++] = local73;
							local78.anInt391 = anInt1003;
							local160 = arg1.method100(3, this.anInt1048);
							local78.method210(true, local160);
							local171 = arg1.method100(3, this.anInt1048);
							local78.method210(true, local171);
							@Pc(232) int local232 = arg1.method100(1, this.anInt1048);
							if (local232 == 1) {
								this.anIntArray267[this.anInt1029++] = local73;
							}
						} else if (local108 == 3) {
							this.anIntArray268[this.anInt1039++] = local73;
						}
					}
				}
			}
		} catch (@Pc(269) RuntimeException local269) {
			signlink.reporterror("38438, " + arg0 + ", " + false + ", " + arg1 + ", " + local269.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(B)V")
	private void method665() {
		try {
			this.anInt977 = 0;
			@Pc(17) int local17 = (aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt380 >> 7) + this.anInt866;
			@Pc(25) int local25 = (aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt381 >> 7) + this.anInt867;
			if (local17 >= 3053 && local17 <= 3156 && local25 >= 3056 && local25 <= 3136) {
				this.anInt977 = 1;
			}
			if (local17 >= 3072 && local17 <= 3118 && local25 >= 9492 && local25 <= 9535) {
				this.anInt977 = 1;
			}
			if (this.anInt977 == 1 && local17 >= 3139 && local17 <= 3199 && local25 >= 3008 && local25 <= 3062) {
				this.anInt977 = 0;
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("10046, " + 8 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(B)V")
	private void method666() {
		try {
			for (@Pc(10) int local10 = -1; local10 < this.anInt1028; local10++) {
				@Pc(18) int local18;
				if (local10 == -1) {
					local18 = this.anInt1027;
				} else {
					local18 = this.anIntArray266[local10];
				}
				@Pc(30) Class3_Sub1_Sub1_Sub1_Sub1 local30 = this.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local18];
				if (local30 != null) {
					this.method691(1, local30);
				}
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("56052, " + 25 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
	private void method667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(2) Class9 local2 = Class9.method58(arg0);
			for (@Pc(4) int local4 = 0; local4 < local2.anIntArray28.length && local2.anIntArray28[local4] != -1; local4++) {
				@Pc(18) Class9 local18 = Class9.method58(local2.anIntArray28[local4]);
				if (local18.anInt218 == 1) {
					this.method667(local18.anInt221, this.anInt1046);
				}
				local18.anInt230 = 0;
				local18.anInt216 = 0;
			}
			if (arg1 >= 0) {
				this.anInt930 = this.aClass41_2.method500();
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("1535, " + arg0 + ", " + arg1 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
	private void method668(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt937; local8++) {
					if (this.aLongArray3[local8] == arg0) {
						this.anInt937--;
						this.aBoolean243 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt937; local28++) {
							this.aStringArray12[local28] = this.aStringArray12[local28 + 1];
							this.anIntArray231[local28] = this.anIntArray231[local28 + 1];
							this.aLongArray3[local28] = this.aLongArray3[local28 + 1];
						}
						this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 250);
						this.aClass3_Sub1_Sub2_7.method85(arg0);
						break;
					}
				}
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("31831, " + -353 + ", " + arg0 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIIIII)V")
	private void method669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aClass3_Sub1_Sub3_Sub1_11.method204(arg2, arg1);
			this.anInt931 += 0;
			this.aClass3_Sub1_Sub3_Sub1_12.method204(arg2 + arg0 - 16, arg1);
			Class3_Sub1_Sub3.method432(arg1, arg2 + 16, 16, this.anInt854, arg0 - 32);
			@Pc(41) int local41 = (arg0 - 32) * arg0 / arg4;
			if (local41 < 8) {
				local41 = 8;
			}
			@Pc(58) int local58 = (arg0 - local41 - 32) * arg3 / (arg4 - arg0);
			Class3_Sub1_Sub3.method432(arg1, arg2 + local58 + 16, 16, this.anInt1004, local41);
			Class3_Sub1_Sub3.method437(local41, this.anInt928, arg1, arg2 + local58 + 16);
			Class3_Sub1_Sub3.method437(local41, this.anInt928, arg1 + 1, arg2 + 16 + local58);
			Class3_Sub1_Sub3.method435(arg1, 16, this.anInt928, arg2 + local58 + 16);
			Class3_Sub1_Sub3.method435(arg1, 16, this.anInt928, arg2 + local58 + 17);
			Class3_Sub1_Sub3.method437(local41, this.anInt1002, arg1 + 15, arg2 + 16 + local58);
			Class3_Sub1_Sub3.method437(local41 - 1, this.anInt1002, arg1 + 14, arg2 + 17 + local58);
			Class3_Sub1_Sub3.method435(arg1, 16, this.anInt1002, arg2 + local58 + local41 + 15);
			Class3_Sub1_Sub3.method435(arg1 + 1, 15, this.anInt1002, arg2 + local58 + local41 + 14);
		} catch (@Pc(174) RuntimeException local174) {
			signlink.reporterror("79741, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local174.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!KZTQXFDC;I)V")
	private void method670(@OriginalArg(0) Class3_Sub1_Sub3_Sub1 arg0) {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anIntArray232.length; local5++) {
				this.anIntArray232[local5] = 0;
			}
			@Pc(30) int local30;
			for (@Pc(20) int local20 = 0; local20 < 5000; local20++) {
				local30 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray232[local30] = (int) (Math.random() * 256.0D);
			}
			@Pc(61) int local61;
			@Pc(65) int local65;
			@Pc(73) int local73;
			for (local30 = 0; local30 < 20; local30++) {
				for (local61 = 1; local61 < 255; local61++) {
					for (local65 = 1; local65 < 127; local65++) {
						local73 = local65 + (local61 << 7);
						this.anIntArray233[local73] = (this.anIntArray232[local73 - 1] + this.anIntArray232[local73 + 1] + this.anIntArray232[local73 - 128] + this.anIntArray232[local73 + 128]) / 4;
					}
				}
				@Pc(119) int[] local119 = this.anIntArray232;
				this.anIntArray232 = this.anIntArray233;
				this.anIntArray233 = local119;
			}
			if (arg0 != null) {
				local61 = 0;
				for (local65 = 0; local65 < arg0.anInt362; local65++) {
					for (local73 = 0; local73 < arg0.anInt361; local73++) {
						if (arg0.aByteArray10[local61++] != 0) {
							@Pc(155) int local155 = local73 + arg0.anInt363 + 16;
							@Pc(162) int local162 = local65 + arg0.anInt364 + 16;
							@Pc(168) int local168 = local155 + (local162 << 7);
							this.anIntArray232[local168] = 0;
						}
					}
				}
			}
		} catch (@Pc(185) RuntimeException local185) {
			signlink.reporterror("71609, " + arg0 + ", " + 1 + ", " + local185.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBI)Z")
	private boolean method671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = arg1 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass17_1.method252(this.anInt862, arg2, arg0, arg1);
			if (local16 == -1) {
				return false;
			}
			@Pc(25) int local25 = local16 & 0x1F;
			@Pc(31) int local31 = local16 >> 6 & 0x3;
			if (local25 == 10 || local25 == 11 || local25 == 22) {
				@Pc(43) Class18 local43 = Class18.method278(local7);
				@Pc(51) int local51;
				@Pc(54) int local54;
				if (local31 == 0 || local31 == 2) {
					local51 = local43.anInt488;
					local54 = local43.anInt484;
				} else {
					local51 = local43.anInt484;
					local54 = local43.anInt488;
				}
				@Pc(65) int local65 = local43.anInt465;
				if (local31 != 0) {
					local65 = (local65 << local31 & 0xF) + (local65 >> 4 - local31);
				}
				this.method631(arg0, 0, arg2, local51, local65, 0, 2, false, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray54[0], local54, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray55[0]);
			} else {
				this.method631(arg0, local25 + 1, arg2, 0, 0, local31, 2, false, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray54[0], 0, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray55[0]);
			}
			this.anInt942 = super.anInt837;
			this.anInt943 = super.anInt838;
			this.anInt945 = 2;
			this.anInt944 = 0;
			return true;
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("64236, " + arg0 + ", " + arg1 + ", " + 9 + ", " + arg2 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)V")
	private void method672(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZZ)V")
	private void method673(@OriginalArg(0) boolean arg0) {
		try {
			if (aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt380 >> 7 == this.anInt1040 && aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt381 >> 7 == this.anInt1041) {
				this.anInt1040 = 0;
			}
			@Pc(21) int local21 = this.anInt1028;
			if (arg0) {
				local21 = 1;
			}
			for (@Pc(34) int local34 = 0; local34 < local21; local34++) {
				@Pc(40) Class3_Sub1_Sub1_Sub1_Sub1 local40;
				@Pc(45) int local45;
				if (arg0) {
					local40 = aClass3_Sub1_Sub1_Sub1_Sub1_1;
					local45 = this.anInt1027 << 14;
				} else {
					local40 = this.aClass3_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray266[local34]];
					local45 = this.anIntArray266[local34] << 14;
				}
				if (local40 != null && local40.method214()) {
					local40.aBoolean26 = false;
					if ((aBoolean224 && this.anInt1028 > 50 || this.anInt1028 > 200) && !arg0 && local40.anInt371 == local40.anInt404) {
						local40.aBoolean26 = true;
					}
					@Pc(96) int local96 = local40.anInt380 >> 7;
					@Pc(101) int local101 = local40.anInt381 >> 7;
					if (local96 >= 0 && local96 < 104 && local101 >= 0 && local101 < 104) {
						if (local40.aClass3_Sub1_Sub1_Sub3_1 == null || anInt1003 < local40.anInt185 || anInt1003 >= local40.anInt186) {
							if ((local40.anInt380 & 0x7F) == 64 && (local40.anInt381 & 0x7F) == 64) {
								if (this.anIntArrayArray23[local96][local101] == this.anInt850) {
									continue;
								}
								this.anIntArrayArray23[local96][local101] = this.anInt850;
							}
							local40.anInt189 = this.method601(local40.anInt381, this.anInt862, local40.anInt380);
							this.aClass17_1.method233(local40, local40.anInt380, local40.anInt381, local45, local40.anInt189, local40.aBoolean77, 60, this.aByte46, local40.anInt382, this.anInt862);
						} else {
							local40.aBoolean26 = false;
							local40.anInt189 = this.method601(local40.anInt381, this.anInt862, local40.anInt380);
							this.aClass17_1.method234(local40.anInt382, local40.anInt182, local45, local40.anInt381, local40, this.anInt862, local40.anInt189, local40.anInt181, local40.anInt183, local40.anInt180, local40.anInt380);
						}
					}
				}
			}
		} catch (@Pc(231) RuntimeException local231) {
			signlink.reporterror("99450, " + arg0 + ", " + true + ", " + local231.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method580() {
		try {
			if (!this.aBoolean232 && !this.aBoolean220 && !this.aBoolean218) {
				anInt1003++;
				if (this.aBoolean214) {
					this.method709();
				} else {
					this.method621();
				}
				this.method645((byte) 9);
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("88469, " + true + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(B)V")
	private void method675() {
		try {
			this.aClass32_7.method459();
			@Pc(18) int local18;
			@Pc(20) int local20;
			if (this.anInt926 == 2) {
				@Pc(13) byte[] local13 = this.aClass3_Sub1_Sub3_Sub1_2.aByteArray10;
				@Pc(15) int[] local15 = Class3_Sub1_Sub3.anIntArray162;
				local18 = local13.length;
				for (local20 = 0; local20 < local18; local20++) {
					if (local13[local20] == 0) {
						local15[local20] = 0;
					}
				}
				this.aClass3_Sub1_Sub3_Sub2_8.method307(this.anIntArray216, 25, 33, 25, 0, this.aBoolean246, 0, 33, this.anInt1043, 256, this.anIntArray275);
				this.aClass32_8.method459();
				Class3_Sub1_Sub3_Sub3.anIntArray139 = this.anIntArray240;
			} else {
				@Pc(68) int local68 = this.anInt1043 + this.anInt887 & 0x7FF;
				@Pc(75) int local75 = aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt380 / 32 + 48;
				local18 = 464 - aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt381 / 32;
				this.aClass3_Sub1_Sub3_Sub2_11.method307(this.anIntArray261, local75, 146, local18, 5, this.aBoolean246, 25, 151, local68, this.anInt906 + 256, this.anIntArray251);
				this.aClass3_Sub1_Sub3_Sub2_8.method307(this.anIntArray216, 25, 33, 25, 0, this.aBoolean246, 0, 33, this.anInt1043, 256, this.anIntArray275);
				for (local20 = 0; local20 < this.anInt959; local20++) {
					local75 = this.anIntArray245[local20] * 4 + 2 - aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt380 / 32;
					local18 = this.anIntArray246[local20] * 4 + 2 - aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt381 / 32;
					this.method604(local18, this.aClass3_Sub1_Sub3_Sub2Array8[local20], local75);
				}
				@Pc(183) int local183;
				for (@Pc(179) int local179 = 0; local179 < 104; local179++) {
					for (local183 = 0; local183 < 104; local183++) {
						@Pc(195) Class38 local195 = this.aClass38ArrayArrayArray1[this.anInt862][local179][local183];
						if (local195 != null) {
							local75 = local179 * 4 + 2 - aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt380 / 32;
							local18 = local183 * 4 + 2 - aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt381 / 32;
							this.method604(local18, this.aClass3_Sub1_Sub3_Sub2_12, local75);
						}
					}
				}
				for (local183 = 0; local183 < this.anInt997; local183++) {
					@Pc(246) Class3_Sub1_Sub1_Sub1_Sub2 local246 = this.aClass3_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray263[local183]];
					if (local246 != null && local246.method214()) {
						@Pc(255) Class5 local255 = local246.aClass5_2;
						if (local255.anIntArray7 != null) {
							local255 = local255.method26();
						}
						if (local255 != null && local255.aBoolean8 && local255.aBoolean7) {
							local75 = local246.anInt380 / 32 - aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt380 / 32;
							local18 = local246.anInt381 / 32 - aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt381 / 32;
							this.method604(local18, this.aClass3_Sub1_Sub3_Sub2_13, local75);
						}
					}
				}
				@Pc(314) Class3_Sub1_Sub1_Sub1_Sub1 local314;
				for (@Pc(304) int local304 = 0; local304 < this.anInt1028; local304++) {
					local314 = this.aClass3_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray266[local304]];
					if (local314 != null && local314.method214()) {
						local75 = local314.anInt380 / 32 - aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt380 / 32;
						local18 = local314.anInt381 / 32 - aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt381 / 32;
						@Pc(342) boolean local342 = false;
						@Pc(346) long local346 = Class36.method477(local314.aString4);
						for (@Pc(348) int local348 = 0; local348 < this.anInt937; local348++) {
							if (local346 == this.aLongArray3[local348] && this.anIntArray231[local348] != 0) {
								local342 = true;
								break;
							}
						}
						@Pc(373) boolean local373 = false;
						if (aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt174 != 0 && local314.anInt174 != 0 && aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt174 == local314.anInt174) {
							local373 = true;
						}
						if (local342) {
							this.method604(local18, this.aClass3_Sub1_Sub3_Sub2_15, local75);
						} else if (local373) {
							this.method604(local18, this.aClass3_Sub1_Sub3_Sub2_16, local75);
						} else {
							this.method604(local18, this.aClass3_Sub1_Sub3_Sub2_14, local75);
						}
					}
				}
				if (this.anInt902 != 0 && anInt1003 % 20 < 10) {
					if (this.anInt902 == 1 && this.anInt1019 >= 0 && this.anInt1019 < this.aClass3_Sub1_Sub1_Sub1_Sub2Array1.length) {
						@Pc(447) Class3_Sub1_Sub1_Sub1_Sub2 local447 = this.aClass3_Sub1_Sub1_Sub1_Sub2Array1[this.anInt1019];
						if (local447 != null) {
							local75 = local447.anInt380 / 32 - aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt380 / 32;
							local18 = local447.anInt381 / 32 - aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt381 / 32;
							this.method609(local75, this.aClass3_Sub1_Sub3_Sub2_4, local18);
						}
					}
					if (this.anInt902 == 2) {
						local75 = (this.anInt857 - this.anInt866) * 4 + 2 - aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt380 / 32;
						local18 = (this.anInt858 - this.anInt867) * 4 + 2 - aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt381 / 32;
						this.method609(local75, this.aClass3_Sub1_Sub3_Sub2_4, local18);
					}
					if (this.anInt902 == 10 && this.anInt1059 >= 0 && this.anInt1059 < this.aClass3_Sub1_Sub1_Sub1_Sub1Array1.length) {
						local314 = this.aClass3_Sub1_Sub1_Sub1_Sub1Array1[this.anInt1059];
						if (local314 != null) {
							local75 = local314.anInt380 / 32 - aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt380 / 32;
							local18 = local314.anInt381 / 32 - aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt381 / 32;
							this.method609(local75, this.aClass3_Sub1_Sub3_Sub2_4, local18);
						}
					}
				}
				if (this.anInt1040 != 0) {
					local75 = this.anInt1040 * 4 + 2 - aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt380 / 32;
					local18 = this.anInt1041 * 4 + 2 - aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt381 / 32;
					this.method604(local18, this.aClass3_Sub1_Sub3_Sub2_3, local75);
				}
				Class3_Sub1_Sub3.method432(97, 78, 3, 16777215, 3);
				this.aClass32_8.method459();
				Class3_Sub1_Sub3_Sub3.anIntArray139 = this.anIntArray240;
			}
		} catch (@Pc(615) RuntimeException local615) {
			signlink.reporterror("67670, " + 9 + ", " + local615.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method676() {
		try {
			if (this.anInt915 == 0) {
				this.aStringArray13[0] = "Cancel";
				this.anIntArray255[0] = 1152;
				this.anInt1017 = 1;
				if (this.anInt947 == -1) {
					this.method629();
					this.anInt1016 = 0;
					this.anInt1047 = 0;
					if (super.anInt831 > 4 && super.anInt832 > 4 && super.anInt831 < 516 && super.anInt832 < 338) {
						if (this.anInt848 == -1) {
							this.method723(this.aBoolean241);
						} else {
							this.method684(0, 4, super.anInt831, super.anInt832, 4, 0, Class9.method58(this.anInt848));
						}
					}
					if (this.anInt1016 != this.anInt1018) {
						this.anInt1018 = this.anInt1016;
					}
					if (this.anInt1047 != this.anInt922) {
						this.anInt922 = this.anInt1047;
					}
					this.anInt1016 = 0;
					this.anInt1047 = 0;
					if (super.anInt831 > 553 && super.anInt832 > 205 && super.anInt831 < 743 && super.anInt832 < 466) {
						if (this.anInt901 != -1) {
							this.method684(0, 553, super.anInt831, super.anInt832, 205, 1, Class9.method58(this.anInt901));
						} else if (this.anIntArray274[this.anInt1058] != -1) {
							this.method684(0, 553, super.anInt831, super.anInt832, 205, 1, Class9.method58(this.anIntArray274[this.anInt1058]));
						}
					}
					if (this.anInt1016 != this.anInt991) {
						this.aBoolean243 = true;
						this.anInt991 = this.anInt1016;
					}
					if (this.anInt1047 != this.anInt885) {
						this.aBoolean243 = true;
						this.anInt885 = this.anInt1047;
					}
					this.anInt1016 = 0;
					this.anInt1047 = 0;
					if (super.anInt831 > 17 && super.anInt832 > 357 && super.anInt831 < 496 && super.anInt832 < 453) {
						if (this.anInt846 != -1) {
							this.method684(0, 17, super.anInt831, super.anInt832, 357, 2, Class9.method58(this.anInt846));
						} else if (this.anInt875 != -1) {
							this.method684(0, 17, super.anInt831, super.anInt832, 357, 3, Class9.method58(this.anInt875));
						} else if (super.anInt832 < 434 && super.anInt831 < 426) {
							this.method648(super.anInt832 - 357, super.anInt831 - 17);
						}
					}
					if ((this.anInt846 != -1 || this.anInt875 != -1) && this.anInt1016 != this.anInt981) {
						this.aBoolean229 = true;
						this.anInt981 = this.anInt1016;
					}
					if ((this.anInt846 != -1 || this.anInt875 != -1) && this.anInt1047 != this.anInt874) {
						this.aBoolean229 = true;
						this.anInt874 = this.anInt1047;
					}
					@Pc(348) boolean local348 = false;
					while (!local348) {
						local348 = true;
						for (@Pc(354) int local354 = 0; local354 < this.anInt1017 - 1; local354++) {
							if (this.anIntArray255[local354] < 1000 && this.anIntArray255[local354 + 1] > 1000) {
								@Pc(375) String local375 = this.aStringArray13[local354];
								this.aStringArray13[local354] = this.aStringArray13[local354 + 1];
								this.aStringArray13[local354 + 1] = local375;
								@Pc(397) int local397 = this.anIntArray255[local354];
								this.anIntArray255[local354] = this.anIntArray255[local354 + 1];
								this.anIntArray255[local354 + 1] = local397;
								@Pc(419) int local419 = this.anIntArray253[local354];
								this.anIntArray253[local354] = this.anIntArray253[local354 + 1];
								this.anIntArray253[local354 + 1] = local419;
								@Pc(441) int local441 = this.anIntArray254[local354];
								this.anIntArray254[local354] = this.anIntArray254[local354 + 1];
								this.anIntArray254[local354 + 1] = local441;
								@Pc(463) int local463 = this.anIntArray256[local354];
								this.anIntArray256[local354] = this.anIntArray256[local354 + 1];
								this.anIntArray256[local354 + 1] = local463;
								local348 = false;
							}
						}
					}
				} else {
					this.anInt1016 = 0;
					this.anInt1047 = 0;
					this.method684(0, 0, super.anInt831, super.anInt832, 0, 0, Class9.method58(this.anInt947));
					if (this.anInt1016 != this.anInt1018) {
						this.anInt1018 = this.anInt1016;
					}
					if (this.anInt1047 != this.anInt922) {
						this.anInt922 = this.anInt1047;
					}
				}
			}
		} catch (@Pc(493) RuntimeException local493) {
			signlink.reporterror("34318, " + -697 + ", " + local493.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method677() {
		try {
			anInt882++;
			if (anInt882 > 90) {
				anInt882 = 0;
				this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 238);
			}
			while (true) {
				@Pc(26) int local26;
				do {
					while (true) {
						local26 = this.method578(this.anInt930);
						if (local26 == -1) {
							return;
						}
						if (this.anInt848 != -1 && this.anInt848 == this.anInt852) {
							if (local26 == 8 && this.aString19.length() > 0) {
								this.aString19 = this.aString19.substring(0, this.aString19.length() - 1);
							}
							break;
						}
						@Pc(207) int local207;
						if (this.aBoolean244) {
							if (local26 >= 32 && local26 <= 122 && this.aString23.length() < 80) {
								this.aString23 = this.aString23 + (char) local26;
								this.aBoolean229 = true;
							}
							if (local26 == 8 && this.aString23.length() > 0) {
								this.aString23 = this.aString23.substring(0, this.aString23.length() - 1);
								this.aBoolean229 = true;
							}
							if (local26 == 13 || local26 == 10) {
								this.aBoolean244 = false;
								this.aBoolean229 = true;
								@Pc(166) long local166;
								if (this.anInt968 == 1) {
									local166 = Class36.method477(this.aString23);
									this.method705(local166);
								}
								if (this.anInt968 == 2 && this.anInt937 > 0) {
									local166 = Class36.method477(this.aString23);
									this.method668(local166);
								}
								if (this.anInt968 == 3 && this.aString23.length() > 0) {
									this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 44);
									this.aClass3_Sub1_Sub2_7.method79(0);
									local207 = this.aClass3_Sub1_Sub2_7.anInt257;
									this.aClass3_Sub1_Sub2_7.method85(this.aLong31);
									Class27.method408(this.aString23, this.aClass3_Sub1_Sub2_7);
									this.aClass3_Sub1_Sub2_7.method88(this.aClass3_Sub1_Sub2_7.anInt257 - local207);
									this.aString23 = Class27.method409(810, this.aString23);
									this.aString23 = Class12.method138(810, this.aString23);
									this.method598(Class36.method481(Class36.method478(this.aLong31, 622)), this.aString23, 6);
									if (this.anInt976 == 2) {
										this.anInt976 = 1;
										this.aBoolean225 = true;
										this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 198);
										this.aClass3_Sub1_Sub2_7.method79(this.anInt1022);
										this.aClass3_Sub1_Sub2_7.method79(this.anInt976);
										this.aClass3_Sub1_Sub2_7.method79(this.anInt900);
									}
								}
								if (this.anInt968 == 4 && this.anInt919 < 100) {
									local166 = Class36.method477(this.aString23);
									this.method619(local166, this.aByte39);
								}
								if (this.anInt968 == 5 && this.anInt919 > 0) {
									local166 = Class36.method477(this.aString23);
									this.method626(local166);
								}
							}
						} else if (this.anInt969 == 1) {
							if (local26 >= 48 && local26 <= 57 && this.aString28.length() < 10) {
								this.aString28 = this.aString28 + (char) local26;
								this.aBoolean229 = true;
							}
							if (local26 == 8 && this.aString28.length() > 0) {
								this.aString28 = this.aString28.substring(0, this.aString28.length() - 1);
								this.aBoolean229 = true;
							}
							if (local26 == 13 || local26 == 10) {
								if (this.aString28.length() > 0) {
									local207 = 0;
									try {
										local207 = Integer.parseInt(this.aString28);
									} catch (@Pc(386) Exception local386) {
									}
									this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 240);
									this.aClass3_Sub1_Sub2_7.method83(local207);
								}
								this.anInt969 = 0;
								this.aBoolean229 = true;
							}
						} else if (this.anInt969 == 2) {
							if (local26 >= 32 && local26 <= 122 && this.aString28.length() < 12) {
								this.aString28 = this.aString28 + (char) local26;
								this.aBoolean229 = true;
							}
							if (local26 == 8 && this.aString28.length() > 0) {
								this.aString28 = this.aString28.substring(0, this.aString28.length() - 1);
								this.aBoolean229 = true;
							}
							if (local26 == 13 || local26 == 10) {
								if (this.aString28.length() > 0) {
									this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 89);
									this.aClass3_Sub1_Sub2_7.method85(Class36.method477(this.aString28));
								}
								this.anInt969 = 0;
								this.aBoolean229 = true;
							}
						} else if (this.anInt846 == -1 && this.anInt947 == -1) {
							if (local26 >= 32 && local26 <= 122 && this.aString26.length() < 80) {
								this.aString26 = this.aString26 + (char) local26;
								this.aBoolean229 = true;
							}
							if (local26 == 8 && this.aString26.length() > 0) {
								this.aString26 = this.aString26.substring(0, this.aString26.length() - 1);
								this.aBoolean229 = true;
							}
							if ((local26 == 13 || local26 == 10) && this.aString26.length() > 0) {
								if (this.anInt1066 == 2) {
									if (this.aString26.equals("::clientdrop")) {
										this.method641();
									}
									if (this.aString26.equals("::lag")) {
										this.method683();
									}
									if (this.aString26.equals("::prefetchmusic")) {
										for (local207 = 0; local207 < this.aClass6_Sub1_1.method535(2, 171); local207++) {
											this.aClass6_Sub1_1.method541(2, (byte) 1, local207);
										}
									}
									if (this.aString26.equals("::fpson")) {
										aBoolean249 = true;
									}
									if (this.aString26.equals("::fpsoff")) {
										aBoolean249 = false;
									}
									if (this.aString26.equals("::noclip")) {
										for (local207 = 0; local207 < 4; local207++) {
											for (@Pc(620) int local620 = 1; local620 < 103; local620++) {
												for (@Pc(624) int local624 = 1; local624 < 103; local624++) {
													this.aClass43Array1[local207].anIntArrayArray19[local620][local624] = 0;
												}
											}
										}
									}
								}
								if (this.aString26.startsWith("::")) {
									this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 221);
									this.aClass3_Sub1_Sub2_7.method79(this.aString26.length() - 1);
									this.aClass3_Sub1_Sub2_7.method86(this.aString26.substring(2));
								} else {
									@Pc(680) String local680 = this.aString26.toLowerCase();
									@Pc(682) byte local682 = 0;
									if (local680.startsWith("yellow:")) {
										local682 = 0;
										this.aString26 = this.aString26.substring(7);
									} else if (local680.startsWith("red:")) {
										local682 = 1;
										this.aString26 = this.aString26.substring(4);
									} else if (local680.startsWith("green:")) {
										local682 = 2;
										this.aString26 = this.aString26.substring(6);
									} else if (local680.startsWith("cyan:")) {
										local682 = 3;
										this.aString26 = this.aString26.substring(5);
									} else if (local680.startsWith("purple:")) {
										local682 = 4;
										this.aString26 = this.aString26.substring(7);
									} else if (local680.startsWith("white:")) {
										local682 = 5;
										this.aString26 = this.aString26.substring(6);
									} else if (local680.startsWith("flash1:")) {
										local682 = 6;
										this.aString26 = this.aString26.substring(7);
									} else if (local680.startsWith("flash2:")) {
										local682 = 7;
										this.aString26 = this.aString26.substring(7);
									} else if (local680.startsWith("flash3:")) {
										local682 = 8;
										this.aString26 = this.aString26.substring(7);
									} else if (local680.startsWith("glow1:")) {
										local682 = 9;
										this.aString26 = this.aString26.substring(6);
									} else if (local680.startsWith("glow2:")) {
										local682 = 10;
										this.aString26 = this.aString26.substring(6);
									} else if (local680.startsWith("glow3:")) {
										local682 = 11;
										this.aString26 = this.aString26.substring(6);
									}
									local680 = this.aString26.toLowerCase();
									@Pc(854) byte local854 = 0;
									if (local680.startsWith("wave:")) {
										local854 = 1;
										this.aString26 = this.aString26.substring(5);
									} else if (local680.startsWith("wave2:")) {
										local854 = 2;
										this.aString26 = this.aString26.substring(6);
									} else if (local680.startsWith("shake:")) {
										local854 = 3;
										this.aString26 = this.aString26.substring(6);
									} else if (local680.startsWith("scroll:")) {
										local854 = 4;
										this.aString26 = this.aString26.substring(7);
									} else if (local680.startsWith("slide:")) {
										local854 = 5;
										this.aString26 = this.aString26.substring(6);
									}
									this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 204);
									this.aClass3_Sub1_Sub2_7.method79(0);
									@Pc(936) int local936 = this.aClass3_Sub1_Sub2_7.anInt257;
									this.aClass3_Sub1_Sub2_7.method105(local682);
									this.aClass3_Sub1_Sub2_8.anInt257 = 0;
									Class27.method408(this.aString26, this.aClass3_Sub1_Sub2_8);
									this.aClass3_Sub1_Sub2_7.method125(this.aClass3_Sub1_Sub2_8.aByteArray3, this.aClass3_Sub1_Sub2_8.anInt257);
									this.aClass3_Sub1_Sub2_7.method79(local854);
									this.aClass3_Sub1_Sub2_7.method88(this.aClass3_Sub1_Sub2_7.anInt257 - local936);
									this.aString26 = Class27.method409(810, this.aString26);
									this.aString26 = Class12.method138(810, this.aString26);
									aClass3_Sub1_Sub1_Sub1_Sub1_1.aString10 = this.aString26;
									aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt400 = local682;
									aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt416 = local854;
									aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt370 = 150;
									if (this.anInt1066 == 2) {
										this.method598("@cr2@" + aClass3_Sub1_Sub1_Sub1_Sub1_1.aString4, aClass3_Sub1_Sub1_Sub1_Sub1_1.aString10, 2);
									} else if (this.anInt1066 == 1) {
										this.method598("@cr1@" + aClass3_Sub1_Sub1_Sub1_Sub1_1.aString4, aClass3_Sub1_Sub1_Sub1_Sub1_1.aString10, 2);
									} else {
										this.method598(aClass3_Sub1_Sub1_Sub1_Sub1_1.aString4, aClass3_Sub1_Sub1_Sub1_Sub1_1.aString10, 2);
									}
									if (this.anInt1022 == 2) {
										this.anInt1022 = 3;
										this.aBoolean225 = true;
										this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 198);
										this.aClass3_Sub1_Sub2_7.method79(this.anInt1022);
										this.aClass3_Sub1_Sub2_7.method79(this.anInt976);
										this.aClass3_Sub1_Sub2_7.method79(this.anInt900);
									}
								}
								this.aString26 = "";
								this.aBoolean229 = true;
							}
						}
					}
				} while ((local26 < 97 || local26 > 122) && (local26 < 65 || local26 > 90) && (local26 < 48 || local26 > 57) && local26 != 32);
				if (this.aString19.length() < 12) {
					this.aString19 = this.aString19 + (char) local26;
				}
			}
		} catch (@Pc(1089) RuntimeException local1089) {
			signlink.reporterror("59895, " + false + ", " + local1089.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method678() {
		try {
			@Pc(8) int local8;
			if (this.anInt880 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt880 > 768) {
						this.anIntArray212[local8] = this.method706(this.anIntArray214[local8], this.anIntArray213[local8], 1024 - this.anInt880);
					} else if (this.anInt880 > 256) {
						this.anIntArray212[local8] = this.anIntArray214[local8];
					} else {
						this.anIntArray212[local8] = this.method706(this.anIntArray213[local8], this.anIntArray214[local8], 256 - this.anInt880);
					}
				}
			} else if (this.anInt881 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt881 > 768) {
						this.anIntArray212[local8] = this.method706(this.anIntArray215[local8], this.anIntArray213[local8], 1024 - this.anInt881);
					} else if (this.anInt881 > 256) {
						this.anIntArray212[local8] = this.anIntArray215[local8];
					} else {
						this.anIntArray212[local8] = this.method706(this.anIntArray213[local8], this.anIntArray215[local8], 256 - this.anInt881);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray212[local8] = this.anIntArray213[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass32_13.anIntArray171[local8] = this.aClass3_Sub1_Sub3_Sub2_6.anIntArray83[local8];
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
				local198 = this.anIntArray273[local185] * (256 - local185) / 256;
				local202 = local198 + 22;
				if (local202 < 0) {
					local202 = 0;
				}
				local181 += local202;
				for (local212 = local202; local212 < 128; local212++) {
					local220 = this.anIntArray257[local181++];
					if (local220 == 0) {
						local183++;
					} else {
						local224 = local220;
						local228 = 256 - local220;
						local220 = this.anIntArray212[local220];
						local239 = this.aClass32_13.anIntArray171[local183];
						this.aClass32_13.anIntArray171[local183++] = ((local220 & 0xFF00FF) * local224 + (local239 & 0xFF00FF) * local228 & 0xFF00FF00) + ((local220 & 0xFF00) * local224 + (local239 & 0xFF00) * local228 & 0xFF0000) >> 8;
					}
				}
				local183 += local202;
			}
			this.aClass32_13.method460(0, 0, super.aGraphics2);
			for (local198 = 0; local198 < 33920; local198++) {
				this.aClass32_14.anIntArray171[local198] = this.aClass3_Sub1_Sub3_Sub2_7.anIntArray83[local198];
			}
			local181 = 0;
			local183 = 1176;
			for (local202 = 1; local202 < 255; local202++) {
				local212 = this.anIntArray273[local202] * (256 - local202) / 256;
				local220 = 103 - local212;
				local183 += local212;
				for (local224 = 0; local224 < local220; local224++) {
					local228 = this.anIntArray257[local181++];
					if (local228 == 0) {
						local183++;
					} else {
						local239 = local228;
						@Pc(372) int local372 = 256 - local228;
						local228 = this.anIntArray212[local228];
						@Pc(383) int local383 = this.aClass32_14.anIntArray171[local183];
						this.aClass32_14.anIntArray171[local183++] = ((local228 & 0xFF00FF) * local239 + (local383 & 0xFF00FF) * local372 & 0xFF00FF00) + ((local228 & 0xFF00) * local239 + (local383 & 0xFF00) * local372 & 0xFF0000) >> 8;
					}
				}
				local181 += 128 - local220;
				local183 += 128 - local220 - local212;
			}
			this.aClass32_14.method460(0, 637, super.aGraphics2);
		} catch (@Pc(455) RuntimeException local455) {
			signlink.reporterror("35423, " + 6 + ", " + local455.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method679() {
		try {
			if (this.anInt1017 >= 2 || this.anInt1052 != 0 || this.anInt986 != 0) {
				@Pc(34) String local34;
				if (this.anInt1052 == 1 && this.anInt1017 < 2) {
					local34 = "Use " + this.aString30 + " with...";
				} else if (this.anInt986 == 1 && this.anInt1017 < 2) {
					local34 = this.aString27 + "...";
				} else {
					local34 = this.aStringArray13[this.anInt1017 - 1];
				}
				if (this.anInt1017 > 2) {
					local34 = local34 + "@whi@ / " + (this.anInt1017 - 2) + " more options";
				}
				this.aClass3_Sub1_Sub3_Sub4_4.method449(anInt1003 / 1000, 16777215, 4, local34, 15);
			}
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("96009, " + false + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!EKHKDMUP;B)V")
	private void method680(@OriginalArg(0) Class9 arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(4) int local4 = arg0.anInt220;
			@Pc(9) boolean local9 = false;
			@Pc(75) int local75;
			if ((local4 < 1 || local4 > 100) && (local4 < 701 || local4 > 800)) {
				if (local4 >= 101 && local4 <= 200 || local4 >= 801 && local4 <= 900) {
					local75 = this.anInt937;
					if (this.anInt938 != 2) {
						local75 = 0;
					}
					if (local4 > 800) {
						local4 -= 701;
					} else {
						local4 -= 101;
					}
					if (local4 >= local75) {
						arg0.aString9 = "";
						arg0.anInt224 = 0;
					} else {
						if (this.anIntArray231[local4] == 0) {
							arg0.aString9 = "@red@Offline";
						} else if (this.anIntArray231[local4] < 200) {
							if (this.anIntArray231[local4] == anInt940) {
								arg0.aString9 = "@gre@World-" + (this.anIntArray231[local4] - 9);
							} else {
								arg0.aString9 = "@yel@World-" + (this.anIntArray231[local4] - 9);
							}
						} else if (this.anIntArray231[local4] == anInt940) {
							arg0.aString9 = "@gre@Classic" + (this.anIntArray231[local4] - 219);
						} else {
							arg0.aString9 = "@yel@Classic" + (this.anIntArray231[local4] - 219);
						}
						arg0.anInt224 = 1;
					}
				} else if (local4 == 203) {
					local75 = this.anInt937;
					if (this.anInt938 != 2) {
						local75 = 0;
					}
					arg0.anInt193 = local75 * 15 + 20;
					if (arg0.anInt193 <= arg0.anInt210) {
						arg0.anInt193 = arg0.anInt210 + 1;
					}
				} else if (local4 >= 401 && local4 <= 500) {
					local4 -= 401;
					if (local4 == 0 && this.anInt938 == 0) {
						arg0.aString9 = "Loading ignore list";
						arg0.anInt224 = 0;
					} else if (local4 == 1 && this.anInt938 == 0) {
						arg0.aString9 = "Please wait...";
						arg0.anInt224 = 0;
					} else {
						local75 = this.anInt919;
						if (this.anInt938 == 0) {
							local75 = 0;
						}
						if (local4 >= local75) {
							arg0.aString9 = "";
							arg0.anInt224 = 0;
						} else {
							arg0.aString9 = Class36.method481(Class36.method478(this.aLongArray4[local4], 622));
							arg0.anInt224 = 1;
						}
					}
				} else if (local4 == 503) {
					arg0.anInt193 = this.anInt919 * 15 + 20;
					if (arg0.anInt193 <= arg0.anInt210) {
						arg0.anInt193 = arg0.anInt210 + 1;
					}
				} else if (local4 == 327) {
					arg0.anInt212 = 150;
					arg0.anInt213 = (int) (Math.sin((double) anInt1003 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean208) {
						for (local75 = 0; local75 < 7; local75++) {
							@Pc(388) int local388 = this.anIntArray260[local75];
							if (local388 >= 0 && !Class10.aClass10Array1[local388].method70()) {
								return;
							}
						}
						this.aBoolean208 = false;
						@Pc(407) Class3_Sub1_Sub1_Sub3[] local407 = new Class3_Sub1_Sub1_Sub3[7];
						@Pc(409) int local409 = 0;
						for (@Pc(411) int local411 = 0; local411 < 7; local411++) {
							@Pc(418) int local418 = this.anIntArray260[local411];
							if (local418 >= 0) {
								local407[local409++] = Class10.aClass10Array1[local418].method71();
							}
						}
						@Pc(440) Class3_Sub1_Sub1_Sub3 local440 = new Class3_Sub1_Sub1_Sub3(local409, -537, local407);
						for (@Pc(442) int local442 = 0; local442 < 5; local442++) {
							if (this.anIntArray235[local442] != 0) {
								local440.method335(anIntArrayArray25[local442][0], anIntArrayArray25[local442][this.anIntArray235[local442]]);
								if (local442 == 1) {
									local440.method335(anIntArray264[0], anIntArray264[this.anIntArray235[local442]]);
								}
							}
						}
						local440.method328();
						local440.method329(Class39.aClass39Array1[aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt404].anIntArray183[0]);
						local440.method338(64, 850, -30, -50, -30, true);
						arg0.anInt200 = 5;
						arg0.anInt201 = 0;
						Class9.method59(local440);
					}
				} else if (local4 == 324) {
					if (this.aClass3_Sub1_Sub3_Sub2_9 == null) {
						this.aClass3_Sub1_Sub3_Sub2_9 = arg0.aClass3_Sub1_Sub3_Sub2_1;
						this.aClass3_Sub1_Sub3_Sub2_10 = arg0.aClass3_Sub1_Sub3_Sub2_2;
					}
					if (this.aBoolean238) {
						arg0.aClass3_Sub1_Sub3_Sub2_1 = this.aClass3_Sub1_Sub3_Sub2_10;
					} else {
						arg0.aClass3_Sub1_Sub3_Sub2_1 = this.aClass3_Sub1_Sub3_Sub2_9;
					}
				} else if (local4 == 325) {
					if (this.aClass3_Sub1_Sub3_Sub2_9 == null) {
						this.aClass3_Sub1_Sub3_Sub2_9 = arg0.aClass3_Sub1_Sub3_Sub2_1;
						this.aClass3_Sub1_Sub3_Sub2_10 = arg0.aClass3_Sub1_Sub3_Sub2_2;
					}
					if (this.aBoolean238) {
						arg0.aClass3_Sub1_Sub3_Sub2_1 = this.aClass3_Sub1_Sub3_Sub2_9;
					} else {
						arg0.aClass3_Sub1_Sub3_Sub2_1 = this.aClass3_Sub1_Sub3_Sub2_10;
					}
				} else if (local4 == 600) {
					arg0.aString9 = this.aString19;
					if (anInt1003 % 20 < 10) {
						arg0.aString9 = arg0.aString9 + "|";
					} else {
						arg0.aString9 = arg0.aString9 + " ";
					}
				} else {
					if (local4 == 620) {
						if (this.anInt1066 < 1) {
							arg0.aString9 = "";
						} else if (this.aBoolean207) {
							arg0.anInt217 = 16711680;
							arg0.aString9 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg0.anInt217 = 16777215;
							arg0.aString9 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(647) String local647;
					if (local4 == 660) {
						local75 = this.anInt1063 - this.anInt910;
						if (local75 <= 0) {
							local647 = "earlier today";
						} else if (local75 == 1) {
							local647 = "yesterday";
						} else {
							local647 = local75 + " days ago";
						}
						arg0.aString9 = "You last logged in @red@" + local647 + "@bla@ from: @red@" + signlink.dns;
					}
					if (local4 == 661) {
						if (this.anInt923 == 0) {
							arg0.aString9 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
						} else if (this.anInt923 <= this.anInt1063) {
							arg0.aString9 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method681(this.anInt923);
						} else {
							local75 = this.anInt1063 + 14 - this.anInt923;
							if (local75 <= 0) {
								local647 = "Earlier today";
							} else if (local75 == 1) {
								local647 = "Yesterday";
							} else {
								local647 = local75 + " days ago";
							}
							arg0.aString9 = local647 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method681(this.anInt923) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
						}
					}
					if (local4 == 662) {
						@Pc(765) String local765;
						if (this.anInt978 == 0) {
							local765 = "@yel@0 unread messages";
						} else if (this.anInt978 == 1) {
							local765 = "@gre@1 unread message";
						} else {
							local765 = "@gre@" + this.anInt978 + " unread messages";
						}
						arg0.aString9 = "You have " + local765 + "\\nin your message centre.";
					}
					if (local4 == 663) {
						if (this.anInt1050 > 0 && this.anInt1050 <= this.anInt1063 + 10) {
							arg0.aString9 = "Last password change:\\n@gre@" + this.method681(this.anInt1050);
						} else {
							arg0.aString9 = "Last password change:\\n@gre@Never changed";
						}
					}
					if (local4 == 664) {
						if (this.anInt1005 == 0) {
							arg0.aString9 = "You have not yet set\\nany contact details.";
						}
						if (this.anInt1005 == 1) {
							arg0.aString9 = "Contact Details Last Set:\\n@gre@" + this.method681(this.anInt1000);
						}
						if (this.anInt1005 == 2) {
							arg0.aString9 = "You need to set\\nnew contact details.";
						}
					}
					if (local4 == 665) {
						if (this.anInt864 > 2 && !aBoolean223) {
							arg0.aString9 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
						} else if (this.anInt864 > 2) {
							arg0.aString9 = "\\n\\nYou have @gre@" + this.anInt864 + "@yel@ days of\\nmember credit remaining.";
						} else if (this.anInt864 > 0) {
							arg0.aString9 = "You have @gre@" + this.anInt864 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
						} else {
							arg0.aString9 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
						}
					}
					if (local4 == 667) {
						if (this.anInt864 > 2 && !aBoolean223) {
							arg0.aString9 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
						} else if (this.anInt864 > 0) {
							arg0.aString9 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
						} else {
							arg0.aString9 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
						}
					}
					if (local4 == 668) {
						if (this.anInt923 > this.anInt1063) {
							arg0.aString9 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
						} else {
							arg0.aString9 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
						}
					}
				}
			} else if (local4 == 1 && this.anInt938 == 0) {
				arg0.aString9 = "Loading friend list";
				arg0.anInt224 = 0;
			} else if (local4 == 1 && this.anInt938 == 1) {
				arg0.aString9 = "Connecting to friendserver";
				arg0.anInt224 = 0;
			} else if (local4 == 2 && this.anInt938 != 2) {
				arg0.aString9 = "Please wait...";
				arg0.anInt224 = 0;
			} else {
				local75 = this.anInt937;
				if (this.anInt938 != 2) {
					local75 = 0;
				}
				if (local4 > 700) {
					local4 -= 601;
				} else {
					local4--;
				}
				if (local4 >= local75) {
					arg0.aString9 = "";
					arg0.anInt224 = 0;
				} else {
					arg0.aString9 = this.aStringArray12[local4];
					arg0.anInt224 = 1;
				}
			}
		} catch (@Pc(955) RuntimeException local955) {
			signlink.reporterror("58135, " + arg0 + ", " + arg1 + ", " + local955.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IB)Ljava/lang/String;")
	private String method681(@OriginalArg(0) int arg0) {
		try {
			if (arg0 > this.anInt1063 + 10) {
				return "Unknown";
			}
			@Pc(19) long local19 = ((long) arg0 + 11745L) * 86400000L;
			@Pc(21) Calendar local21 = Calendar.getInstance();
			local21.setTime(new Date(local19));
			@Pc(31) int local31 = local21.get(5);
			@Pc(35) int local35 = local21.get(2);
			@Pc(39) int local39 = local21.get(1);
			@Pc(90) String[] local90 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
			return local31 + "-" + local90[local35] + "-" + local39;
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("62921, " + arg0 + ", " + 19 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(B)V")
	private void method682() {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray257[local5 + 32512] = 255;
				}
			}
			@Pc(41) int local41;
			@Pc(48) int local48;
			@Pc(54) int local54;
			for (local12 = 0; local12 < 100; local12++) {
				local41 = (int) (Math.random() * 124.0D) + 2;
				local48 = (int) (Math.random() * 128.0D) + 128;
				local54 = local41 + (local48 << 7);
				this.anIntArray257[local54] = 192;
			}
			for (local41 = 1; local41 < 255; local41++) {
				for (local48 = 1; local48 < 127; local48++) {
					local54 = local48 + (local41 << 7);
					this.anIntArray258[local54] = (this.anIntArray257[local54 - 1] + this.anIntArray257[local54 + 1] + this.anIntArray257[local54 - 128] + this.anIntArray257[local54 + 128]) / 4;
				}
			}
			this.anInt870 += 128;
			if (this.anInt870 > this.anIntArray232.length) {
				this.anInt870 -= this.anIntArray232.length;
				local48 = (int) (Math.random() * 12.0D);
				this.method670(this.aClass3_Sub1_Sub3_Sub1Array4[local48]);
			}
			@Pc(174) int local174;
			for (local48 = 1; local48 < 255; local48++) {
				for (local54 = 1; local54 < 127; local54++) {
					local174 = local54 + (local48 << 7);
					@Pc(197) int local197 = this.anIntArray258[local174 + 128] - this.anIntArray232[local174 + this.anInt870 & this.anIntArray232.length - 1] / 5;
					if (local197 < 0) {
						local197 = 0;
					}
					this.anIntArray257[local174] = local197;
				}
			}
			for (local54 = 0; local54 < 255; local54++) {
				this.anIntArray273[local54] = this.anIntArray273[local54 + 1];
			}
			this.anIntArray273[255] = (int) (Math.sin((double) anInt1003 / 14.0D) * 16.0D + Math.sin((double) anInt1003 / 15.0D) * 14.0D + Math.sin((double) anInt1003 / 16.0D) * 12.0D);
			if (this.anInt880 > 0) {
				this.anInt880 -= 4;
			}
			if (this.anInt881 > 0) {
				this.anInt881 -= 4;
			}
			if (this.anInt880 == 0 && this.anInt881 == 0) {
				local174 = (int) (Math.random() * 2000.0D);
				if (local174 == 0) {
					this.anInt880 = 1024;
				}
				if (local174 == 1) {
					this.anInt881 = 1024;
					return;
				}
			}
		} catch (@Pc(308) RuntimeException local308) {
			signlink.reporterror("7062, " + -21 + ", " + local308.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(B)V")
	private void method683() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt924);
			if (this.aClass6_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass6_Sub1_1.anInt780);
			}
			System.out.println("loop-cycle:" + anInt1003);
			System.out.println("draw-cycle:" + anInt962);
			System.out.println("ptype:" + this.anInt932);
			System.out.println("psize:" + this.anInt931);
			if (this.aClass48_1 != null) {
				this.aClass48_1.method560();
			}
			super.aBoolean195 = true;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("4992, " + -38 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)Ljava/awt/Component;")
	@Override
	protected Component method584(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("9507, " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIILclient!EKHKDMUP;)V")
	private void method684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class9 arg6) {
		try {
			if (arg6.anInt218 == 0 && arg6.anIntArray28 != null && !arg6.aBoolean36 && (arg2 >= arg1 && arg3 >= arg4 && arg2 <= arg1 + arg6.anInt197 && arg3 <= arg4 + arg6.anInt210)) {
				@Pc(34) int local34 = arg6.anIntArray28.length;
				for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
					@Pc(45) int local45 = arg6.anIntArray30[local36] + arg1;
					@Pc(54) int local54 = arg6.anIntArray31[local36] + arg4 - arg0;
					@Pc(60) Class9 local60 = Class9.method58(arg6.anIntArray28[local36]);
					@Pc(65) int local65 = local45 + local60.anInt198;
					@Pc(70) int local70 = local54 + local60.anInt199;
					if ((local60.anInt204 >= 0 || local60.anInt225 != 0) && arg2 >= local65 && arg3 >= local70 && arg2 < local65 + local60.anInt197 && arg3 < local70 + local60.anInt210) {
						if (local60.anInt204 >= 0) {
							this.anInt1016 = local60.anInt204;
						} else {
							this.anInt1016 = local60.anInt221;
						}
					}
					if (local60.anInt218 == 8 && arg2 >= local65 && arg3 >= local70 && arg2 < local65 + local60.anInt197 && arg3 < local70 + local60.anInt210) {
						this.anInt1047 = local60.anInt221;
					}
					if (local60.anInt218 == 0) {
						this.method684(local60.anInt205, local65, arg2, arg3, local70, arg5, local60);
						if (local60.anInt193 > local60.anInt210) {
							this.method656(local60.anInt193, arg5, local60.anInt210, local65 + local60.anInt197, local60, arg3, local70, arg2);
						}
					} else {
						if (local60.anInt224 == 1 && arg2 >= local65 && arg3 >= local70 && arg2 < local65 + local60.anInt197 && arg3 < local70 + local60.anInt210) {
							@Pc(194) boolean local194 = false;
							if (local60.anInt220 != 0) {
								local194 = this.method634(381, local60);
							}
							if (!local194) {
								this.aStringArray13[this.anInt1017] = local60.aString8;
								this.anIntArray255[this.anInt1017] = 663;
								this.anIntArray254[this.anInt1017] = local60.anInt221;
								this.anInt1017++;
							}
						}
						if (local60.anInt224 == 2 && this.anInt986 == 0 && arg2 >= local65 && arg3 >= local70 && arg2 < local65 + local60.anInt197 && arg3 < local70 + local60.anInt210) {
							@Pc(258) String local258 = local60.aString7;
							if (local258.indexOf(" ") != -1) {
								local258 = local258.substring(0, local258.indexOf(" "));
							}
							this.aStringArray13[this.anInt1017] = local258 + " @gre@" + local60.aString5;
							this.anIntArray255[this.anInt1017] = 896;
							this.anIntArray254[this.anInt1017] = local60.anInt221;
							this.anInt1017++;
						}
						if (local60.anInt224 == 3 && arg2 >= local65 && arg3 >= local70 && arg2 < local65 + local60.anInt197 && arg3 < local70 + local60.anInt210) {
							this.aStringArray13[this.anInt1017] = "Close";
							if (arg5 == 3) {
								this.anIntArray255[this.anInt1017] = 951;
							} else {
								this.anIntArray255[this.anInt1017] = 838;
							}
							this.anIntArray254[this.anInt1017] = local60.anInt221;
							this.anInt1017++;
						}
						if (local60.anInt224 == 4 && arg2 >= local65 && arg3 >= local70 && arg2 < local65 + local60.anInt197 && arg3 < local70 + local60.anInt210) {
							this.aStringArray13[this.anInt1017] = local60.aString8;
							this.anIntArray255[this.anInt1017] = 241;
							this.anIntArray254[this.anInt1017] = local60.anInt221;
							this.anInt1017++;
						}
						if (local60.anInt224 == 5 && arg2 >= local65 && arg3 >= local70 && arg2 < local65 + local60.anInt197 && arg3 < local70 + local60.anInt210) {
							this.aStringArray13[this.anInt1017] = local60.aString8;
							this.anIntArray255[this.anInt1017] = 507;
							this.anIntArray254[this.anInt1017] = local60.anInt221;
							this.anInt1017++;
						}
						if (local60.anInt224 == 6 && !this.aBoolean221 && arg2 >= local65 && arg3 >= local70 && arg2 < local65 + local60.anInt197 && arg3 < local70 + local60.anInt210) {
							this.aStringArray13[this.anInt1017] = local60.aString8;
							this.anIntArray255[this.anInt1017] = 338;
							this.anIntArray254[this.anInt1017] = local60.anInt221;
							this.anInt1017++;
						}
						if (local60.anInt218 == 2) {
							@Pc(517) int local517 = 0;
							for (@Pc(519) int local519 = 0; local519 < local60.anInt210; local519++) {
								for (@Pc(523) int local523 = 0; local523 < local60.anInt197; local523++) {
									@Pc(534) int local534 = local65 + local523 * (local60.anInt227 + 32);
									@Pc(543) int local543 = local70 + local519 * (local60.anInt226 + 32);
									if (local517 < 20) {
										local534 += local60.anIntArray35[local517];
										local543 += local60.anIntArray32[local517];
									}
									if (arg2 >= local534 && arg3 >= local543 && arg2 < local534 + 32 && arg3 < local543 + 32) {
										this.anInt1067 = local517;
										this.anInt1068 = local60.anInt221;
										if (local60.anIntArray27[local517] > 0) {
											@Pc(596) Class50 local596 = Class50.method562(local60.anIntArray27[local517] - 1);
											if (this.anInt1052 == 1 && local60.aBoolean33) {
												if (local60.anInt221 != this.anInt1054 || local517 != this.anInt1053) {
													this.aStringArray13[this.anInt1017] = "Use " + this.aString30 + " with @lre@" + local596.aString16;
													this.anIntArray255[this.anInt1017] = 775;
													this.anIntArray256[this.anInt1017] = local596.anInt801;
													this.anIntArray253[this.anInt1017] = local517;
													this.anIntArray254[this.anInt1017] = local60.anInt221;
													this.anInt1017++;
												}
											} else if (this.anInt986 != 1 || !local60.aBoolean33) {
												@Pc(733) int local733;
												if (local60.aBoolean33) {
													for (local733 = 4; local733 >= 3; local733--) {
														if (local596.aStringArray6 != null && local596.aStringArray6[local733] != null) {
															this.aStringArray13[this.anInt1017] = local596.aStringArray6[local733] + " @lre@" + local596.aString16;
															if (local733 == 3) {
																this.anIntArray255[this.anInt1017] = 68;
															}
															if (local733 == 4) {
																this.anIntArray255[this.anInt1017] = 910;
															}
															this.anIntArray256[this.anInt1017] = local596.anInt801;
															this.anIntArray253[this.anInt1017] = local517;
															this.anIntArray254[this.anInt1017] = local60.anInt221;
															this.anInt1017++;
														} else if (local733 == 4) {
															this.aStringArray13[this.anInt1017] = "Drop @lre@" + local596.aString16;
															this.anIntArray255[this.anInt1017] = 910;
															this.anIntArray256[this.anInt1017] = local596.anInt801;
															this.anIntArray253[this.anInt1017] = local517;
															this.anIntArray254[this.anInt1017] = local60.anInt221;
															this.anInt1017++;
														}
													}
												}
												if (local60.aBoolean39) {
													this.aStringArray13[this.anInt1017] = "Use @lre@" + local596.aString16;
													this.anIntArray255[this.anInt1017] = 874;
													this.anIntArray256[this.anInt1017] = local596.anInt801;
													this.anIntArray253[this.anInt1017] = local517;
													this.anIntArray254[this.anInt1017] = local60.anInt221;
													this.anInt1017++;
												}
												if (local60.aBoolean33 && local596.aStringArray6 != null) {
													for (local733 = 2; local733 >= 0; local733--) {
														if (local596.aStringArray6[local733] != null) {
															this.aStringArray13[this.anInt1017] = local596.aStringArray6[local733] + " @lre@" + local596.aString16;
															if (local733 == 0) {
																this.anIntArray255[this.anInt1017] = 17;
															}
															if (local733 == 1) {
																this.anIntArray255[this.anInt1017] = 994;
															}
															if (local733 == 2) {
																this.anIntArray255[this.anInt1017] = 840;
															}
															this.anIntArray256[this.anInt1017] = local596.anInt801;
															this.anIntArray253[this.anInt1017] = local517;
															this.anIntArray254[this.anInt1017] = local60.anInt221;
															this.anInt1017++;
														}
													}
												}
												if (local60.aStringArray2 != null) {
													for (local733 = 4; local733 >= 0; local733--) {
														if (local60.aStringArray2[local733] != null) {
															this.aStringArray13[this.anInt1017] = local60.aStringArray2[local733] + " @lre@" + local596.aString16;
															if (local733 == 0) {
																this.anIntArray255[this.anInt1017] = 592;
															}
															if (local733 == 1) {
																this.anIntArray255[this.anInt1017] = 637;
															}
															if (local733 == 2) {
																this.anIntArray255[this.anInt1017] = 148;
															}
															if (local733 == 3) {
																this.anIntArray255[this.anInt1017] = 708;
															}
															if (local733 == 4) {
																this.anIntArray255[this.anInt1017] = 306;
															}
															this.anIntArray256[this.anInt1017] = local596.anInt801;
															this.anIntArray253[this.anInt1017] = local517;
															this.anIntArray254[this.anInt1017] = local60.anInt221;
															this.anInt1017++;
														}
													}
												}
												this.aStringArray13[this.anInt1017] = "Examine @lre@" + local596.aString16;
												this.anIntArray255[this.anInt1017] = 1893;
												this.anIntArray256[this.anInt1017] = local596.anInt801;
												this.anIntArray253[this.anInt1017] = local517;
												this.anIntArray254[this.anInt1017] = local60.anInt221;
												this.anInt1017++;
											} else if ((this.anInt988 & 0x10) == 16) {
												this.aStringArray13[this.anInt1017] = this.aString27 + " @lre@" + local596.aString16;
												this.anIntArray255[this.anInt1017] = 39;
												this.anIntArray256[this.anInt1017] = local596.anInt801;
												this.anIntArray253[this.anInt1017] = local517;
												this.anIntArray254[this.anInt1017] = local60.anInt221;
												this.anInt1017++;
											}
										}
									}
									local517++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1165) RuntimeException local1165) {
			signlink.reporterror("46867, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local1165.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!GHHPHSRU;II)V")
	private void method685(@OriginalArg(0) Class3_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg2 >= 1 && arg2 <= 1) {
				@Pc(14) int local14 = arg0.method100(8, this.anInt1048);
				@Pc(20) int local20;
				if (local14 < this.anInt1028) {
					for (local20 = local14; local20 < this.anInt1028; local20++) {
						this.anIntArray268[this.anInt1039++] = this.anIntArray266[local20];
					}
				}
				if (local14 > this.anInt1028) {
					signlink.reporterror(this.aString20 + " Too many players");
					throw new RuntimeException("eek");
				}
				this.anInt1028 = 0;
				for (local20 = 0; local20 < local14; local20++) {
					@Pc(72) int local72 = this.anIntArray266[local20];
					@Pc(77) Class3_Sub1_Sub1_Sub1_Sub1 local77 = this.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local72];
					@Pc(83) int local83 = arg0.method100(1, this.anInt1048);
					if (local83 == 0) {
						this.anIntArray266[this.anInt1028++] = local72;
						local77.anInt391 = anInt1003;
					} else {
						@Pc(107) int local107 = arg0.method100(2, this.anInt1048);
						if (local107 == 0) {
							this.anIntArray266[this.anInt1028++] = local72;
							local77.anInt391 = anInt1003;
							this.anIntArray267[this.anInt1029++] = local72;
						} else {
							@Pc(159) int local159;
							@Pc(170) int local170;
							if (local107 == 1) {
								this.anIntArray266[this.anInt1028++] = local72;
								local77.anInt391 = anInt1003;
								local159 = arg0.method100(3, this.anInt1048);
								local77.method210(false, local159);
								local170 = arg0.method100(1, this.anInt1048);
								if (local170 == 1) {
									this.anIntArray267[this.anInt1029++] = local72;
								}
							} else if (local107 == 2) {
								this.anIntArray266[this.anInt1028++] = local72;
								local77.anInt391 = anInt1003;
								local159 = arg0.method100(3, this.anInt1048);
								local77.method210(true, local159);
								local170 = arg0.method100(3, this.anInt1048);
								local77.method210(true, local170);
								@Pc(231) int local231 = arg0.method100(1, this.anInt1048);
								if (local231 == 1) {
									this.anIntArray267[this.anInt1029++] = local72;
								}
							} else if (local107 == 3) {
								this.anIntArray268[this.anInt1039++] = local72;
							}
						}
					}
				}
			}
		} catch (@Pc(268) RuntimeException local268) {
			signlink.reporterror("36560, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local268.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)Ljava/net/Socket;")
	public Socket method686(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean235) {
			this.method607();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method687() {
		try {
			@Pc(7) int local7 = this.aClass3_Sub1_Sub3_Sub4_4.method442("Choose Option");
			@Pc(20) int local20;
			for (@Pc(9) int local9 = 0; local9 < this.anInt1017; local9++) {
				local20 = this.aClass3_Sub1_Sub3_Sub4_4.method442(this.aStringArray13[local9]);
				if (local20 > local7) {
					local7 = local20;
				}
			}
			local7 += 8;
			local20 = this.anInt1017 * 15 + 21;
			@Pc(71) int local71;
			@Pc(89) int local89;
			if (super.anInt837 > 4 && super.anInt838 > 4 && super.anInt837 < 516 && super.anInt838 < 338) {
				local71 = super.anInt837 - local7 / 2 - 4;
				if (local71 + local7 > 512) {
					local71 = 512 - local7;
				}
				if (local71 < 0) {
					local71 = 0;
				}
				local89 = super.anInt838 - 4;
				if (local89 + local20 > 334) {
					local89 = 334 - local20;
				}
				if (local89 < 0) {
					local89 = 0;
				}
				this.aBoolean226 = true;
				this.anInt1006 = 0;
				this.anInt1007 = local71;
				this.anInt1008 = local89;
				this.anInt1009 = local7;
				this.anInt1010 = this.anInt1017 * 15 + 22;
			}
			if (super.anInt837 > 553 && super.anInt838 > 205 && super.anInt837 < 743 && super.anInt838 < 466) {
				local71 = super.anInt837 - local7 / 2 - 553;
				if (local71 < 0) {
					local71 = 0;
				} else if (local71 + local7 > 190) {
					local71 = 190 - local7;
				}
				local89 = super.anInt838 - 205;
				if (local89 < 0) {
					local89 = 0;
				} else if (local89 + local20 > 261) {
					local89 = 261 - local20;
				}
				this.aBoolean226 = true;
				this.anInt1006 = 1;
				this.anInt1007 = local71;
				this.anInt1008 = local89;
				this.anInt1009 = local7;
				this.anInt1010 = this.anInt1017 * 15 + 22;
			}
			if (super.anInt837 > 17 && super.anInt838 > 357 && super.anInt837 < 496 && super.anInt838 < 453) {
				local71 = super.anInt837 - local7 / 2 - 17;
				if (local71 < 0) {
					local71 = 0;
				} else if (local71 + local7 > 479) {
					local71 = 479 - local7;
				}
				local89 = super.anInt838 - 357;
				if (local89 < 0) {
					local89 = 0;
				} else if (local89 + local20 > 96) {
					local89 = 96 - local20;
				}
				this.aBoolean226 = true;
				this.anInt1006 = 2;
				this.anInt1007 = local71;
				this.anInt1008 = local89;
				this.anInt1009 = local7;
				this.anInt1010 = this.anInt1017 * 15 + 22;
			}
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("56003, " + 9 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method688(@OriginalArg(0) int arg0) {
		try {
			if (super.aClass32_2 == null) {
				this.method653();
				this.aClass32_10 = null;
				this.aClass32_11 = null;
				this.aClass32_12 = null;
				this.aClass32_13 = null;
				this.aClass32_14 = null;
				this.aClass32_15 = null;
				this.aClass32_16 = null;
				this.aClass32_17 = null;
				this.aClass32_18 = null;
				this.aClass32_9 = null;
				this.aClass32_7 = null;
				if (arg0 != this.anInt1021) {
					this.anInt932 = -1;
				}
				this.aClass32_6 = null;
				this.aClass32_8 = null;
				this.aClass32_3 = null;
				this.aClass32_4 = null;
				this.aClass32_5 = null;
				super.aClass32_2 = new Class32(765, this.method584((byte) 9), 503, 9);
				this.aBoolean227 = true;
			}
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("69427, " + arg0 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!EKHKDMUP;I)V")
	private void method689(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class9 arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2.anInt218 == 0 && arg2.anIntArray28 != null && (!arg2.aBoolean36 || this.anInt1018 == arg2.anInt221 || this.anInt991 == arg2.anInt221 || this.anInt981 == arg2.anInt221)) {
				@Pc(34) int local34 = Class3_Sub1_Sub3.anInt667;
				@Pc(36) int local36 = Class3_Sub1_Sub3.anInt665;
				@Pc(38) int local38 = Class3_Sub1_Sub3.anInt668;
				@Pc(40) int local40 = Class3_Sub1_Sub3.anInt666;
				Class3_Sub1_Sub3.method429(arg0, arg1, arg1 + arg2.anInt210, arg0 + arg2.anInt197);
				@Pc(56) int local56 = arg2.anIntArray28.length;
				for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
					@Pc(67) int local67 = arg2.anIntArray30[local58] + arg0;
					@Pc(76) int local76 = arg2.anIntArray31[local58] + arg1 - arg3;
					@Pc(82) Class9 local82 = Class9.method58(arg2.anIntArray28[local58]);
					@Pc(87) int local87 = local67 + local82.anInt198;
					@Pc(92) int local92 = local76 + local82.anInt199;
					if (local82.anInt220 > 0) {
						this.method680(local82, (byte) 2);
					}
					if (local82.anInt218 == 0) {
						if (local82.anInt205 > local82.anInt193 - local82.anInt210) {
							local82.anInt205 = local82.anInt193 - local82.anInt210;
						}
						if (local82.anInt205 < 0) {
							local82.anInt205 = 0;
						}
						this.method689(local87, local92, local82, local82.anInt205);
						if (local82.anInt193 > local82.anInt210) {
							this.method669(local82.anInt210, local87 + local82.anInt197, local92, local82.anInt205, local82.anInt193);
						}
					} else if (local82.anInt218 != 1) {
						@Pc(164) int local164;
						@Pc(168) int local168;
						@Pc(179) int local179;
						@Pc(214) int local214;
						@Pc(221) int local221;
						@Pc(246) int local246;
						@Pc(162) int local162;
						@Pc(212) int local212;
						if (local82.anInt218 == 2) {
							local162 = 0;
							for (local164 = 0; local164 < local82.anInt210; local164++) {
								for (local168 = 0; local168 < local82.anInt197; local168++) {
									local179 = local87 + local168 * (local82.anInt227 + 32);
									@Pc(188) int local188 = local92 + local164 * (local82.anInt226 + 32);
									if (local162 < 20) {
										local179 += local82.anIntArray35[local162];
										local188 += local82.anIntArray32[local162];
									}
									if (local82.anIntArray27[local162] > 0) {
										local212 = 0;
										local214 = 0;
										local221 = local82.anIntArray27[local162] - 1;
										if (local179 > Class3_Sub1_Sub3.anInt667 - 32 && local179 < Class3_Sub1_Sub3.anInt668 && local188 > Class3_Sub1_Sub3.anInt665 - 32 && local188 < Class3_Sub1_Sub3.anInt666 || this.anInt915 != 0 && this.anInt914 == local162) {
											local246 = 0;
											if (this.anInt1052 == 1 && this.anInt1053 == local162 && this.anInt1054 == local82.anInt221) {
												local246 = 16777215;
											}
											@Pc(270) Class3_Sub1_Sub3_Sub2 local270 = Class50.method564(local246, local82.anIntArray34[local162], local221);
											if (local270 != null) {
												@Pc(349) int local349;
												if (this.anInt915 != 0 && this.anInt914 == local162 && this.anInt913 == local82.anInt221) {
													local212 = super.anInt831 - this.anInt916;
													local214 = super.anInt832 - this.anInt917;
													if (local212 < 5 && local212 > -5) {
														local212 = 0;
													}
													if (local214 < 5 && local214 > -5) {
														local214 = 0;
													}
													if (this.anInt1056 < 5) {
														local212 = 0;
														local214 = 0;
													}
													local270.method305(local179 + local212, local188 + local214);
													if (local188 + local214 < Class3_Sub1_Sub3.anInt665 && arg2.anInt205 > 0) {
														local349 = this.anInt975 * (Class3_Sub1_Sub3.anInt665 - local188 - local214) / 3;
														if (local349 > this.anInt975 * 10) {
															local349 = this.anInt975 * 10;
														}
														if (local349 > arg2.anInt205) {
															local349 = arg2.anInt205;
														}
														arg2.anInt205 -= local349;
														this.anInt917 += local349;
													}
													if (local188 + local214 + 32 > Class3_Sub1_Sub3.anInt666 && arg2.anInt205 < arg2.anInt193 - arg2.anInt210) {
														local349 = this.anInt975 * (local188 + local214 + 32 - Class3_Sub1_Sub3.anInt666) / 3;
														if (local349 > this.anInt975 * 10) {
															local349 = this.anInt975 * 10;
														}
														if (local349 > arg2.anInt193 - arg2.anInt210 - arg2.anInt205) {
															local349 = arg2.anInt193 - arg2.anInt210 - arg2.anInt205;
														}
														arg2.anInt205 += local349;
														this.anInt917 -= local349;
													}
												} else if (this.anInt898 != 0 && this.anInt897 == local162 && this.anInt896 == local82.anInt221) {
													local270.method305(local179, local188);
												} else {
													local270.method303(local188, local179);
												}
												if (local270.anInt513 == 33 || local82.anIntArray34[local162] != 1) {
													local349 = local82.anIntArray34[local162];
													this.aClass3_Sub1_Sub3_Sub4_2.method444(0, method606(local349, 790), local188 + local214 + 10, local179 + 1 + local212);
													this.aClass3_Sub1_Sub3_Sub4_2.method444(16776960, method606(local349, 790), local188 + local214 + 9, local179 + local212);
												}
											}
										}
									} else if (local82.aClass3_Sub1_Sub3_Sub2Array2 != null && local162 < 20) {
										@Pc(538) Class3_Sub1_Sub3_Sub2 local538 = local82.aClass3_Sub1_Sub3_Sub2Array2[local162];
										if (local538 != null) {
											local538.method303(local188, local179);
										}
									}
									local162++;
								}
							}
						} else if (local82.anInt218 == 3) {
							@Pc(564) boolean local564 = false;
							if (this.anInt981 == local82.anInt221 || this.anInt991 == local82.anInt221 || this.anInt1018 == local82.anInt221) {
								local564 = true;
							}
							if (this.method591(local82)) {
								local162 = local82.anInt203;
								if (local564 && local82.anInt202 != 0) {
									local162 = local82.anInt202;
								}
							} else {
								local162 = local82.anInt217;
								if (local564 && local82.anInt225 != 0) {
									local162 = local82.anInt225;
								}
							}
							if (local82.aByte5 == 0) {
								if (local82.aBoolean32) {
									Class3_Sub1_Sub3.method432(local87, local92, local82.anInt197, local162, local82.anInt210);
								} else {
									Class3_Sub1_Sub3.method433(local87, local82.anInt197, local92, local162, local82.anInt210);
								}
							} else if (local82.aBoolean32) {
								Class3_Sub1_Sub3.method431(256 - (local82.aByte5 & 0xFF), local82.anInt197, local162, local87, local92, local82.anInt210);
							} else {
								Class3_Sub1_Sub3.method434(256 - (local82.aByte5 & 0xFF), local82.anInt210, local82.anInt197, local92, local87, local162);
							}
						} else {
							@Pc(682) Class3_Sub1_Sub3_Sub4 local682;
							@Pc(959) String local959;
							if (local82.anInt218 == 4) {
								local682 = local82.aClass3_Sub1_Sub3_Sub4_1;
								@Pc(685) String local685 = local82.aString9;
								@Pc(687) boolean local687 = false;
								if (this.anInt981 == local82.anInt221 || this.anInt991 == local82.anInt221 || this.anInt1018 == local82.anInt221) {
									local687 = true;
								}
								if (this.method591(local82)) {
									local164 = local82.anInt203;
									if (local687 && local82.anInt202 != 0) {
										local164 = local82.anInt202;
									}
									if (local82.aString6.length() > 0) {
										local685 = local82.aString6;
									}
								} else {
									local164 = local82.anInt217;
									if (local687 && local82.anInt225 != 0) {
										local164 = local82.anInt225;
									}
								}
								if (local82.anInt224 == 6 && this.aBoolean221) {
									local685 = "Please wait...";
									local164 = local82.anInt217;
								}
								if (Class3_Sub1_Sub3.anInt663 == 479) {
									if (local164 == 16776960) {
										local164 = 255;
									}
									if (local164 == 49152) {
										local164 = 16777215;
									}
								}
								local212 = local92 + local682.anInt674;
								while (local685.length() > 0) {
									if (local685.indexOf("%") != -1) {
										label386: while (true) {
											local214 = local685.indexOf("%1");
											if (local214 == -1) {
												while (true) {
													local214 = local685.indexOf("%2");
													if (local214 == -1) {
														while (true) {
															local214 = local685.indexOf("%3");
															if (local214 == -1) {
																while (true) {
																	local214 = local685.indexOf("%4");
																	if (local214 == -1) {
																		while (true) {
																			local214 = local685.indexOf("%5");
																			if (local214 == -1) {
																				break label386;
																			}
																			local685 = local685.substring(0, local214) + this.method595(this.method590(local82, 4), anInt1038) + local685.substring(local214 + 2);
																		}
																	}
																	local685 = local685.substring(0, local214) + this.method595(this.method590(local82, 3), anInt1038) + local685.substring(local214 + 2);
																}
															}
															local685 = local685.substring(0, local214) + this.method595(this.method590(local82, 2), anInt1038) + local685.substring(local214 + 2);
														}
													}
													local685 = local685.substring(0, local214) + this.method595(this.method590(local82, 1), anInt1038) + local685.substring(local214 + 2);
												}
											}
											local685 = local685.substring(0, local214) + this.method595(this.method590(local82, 0), anInt1038) + local685.substring(local214 + 2);
										}
									}
									local214 = local685.indexOf("\\n");
									if (local214 == -1) {
										local959 = local685;
										local685 = "";
									} else {
										local959 = local685.substring(0, local214);
										local685 = local685.substring(local214 + 2);
									}
									if (local82.aBoolean31) {
										local682.method441(local82.aBoolean37, local164, local212, local959, local87 + local82.anInt197 / 2);
									} else {
										local682.method448(local87, local959, local164, local212, local82.aBoolean37);
									}
									local212 += local682.anInt674;
								}
							} else if (local82.anInt218 == 5) {
								@Pc(1021) Class3_Sub1_Sub3_Sub2 local1021;
								if (this.method591(local82)) {
									local1021 = local82.aClass3_Sub1_Sub3_Sub2_2;
								} else {
									local1021 = local82.aClass3_Sub1_Sub3_Sub2_1;
								}
								if (local1021 != null) {
									local1021.method303(local92, local87);
								}
							} else if (local82.anInt218 == 6) {
								local162 = Class3_Sub1_Sub3_Sub3.anInt599;
								local164 = Class3_Sub1_Sub3_Sub3.anInt600;
								Class3_Sub1_Sub3_Sub3.anInt599 = local87 + local82.anInt197 / 2;
								Class3_Sub1_Sub3_Sub3.anInt600 = local92 + local82.anInt210 / 2;
								local168 = Class3_Sub1_Sub3_Sub3.anIntArray137[local82.anInt212] * local82.anInt211 >> 16;
								local179 = Class3_Sub1_Sub3_Sub3.anIntArray138[local82.anInt212] * local82.anInt211 >> 16;
								@Pc(1082) boolean local1082 = this.method591(local82);
								if (local1082) {
									local212 = local82.anInt196;
								} else {
									local212 = local82.anInt195;
								}
								@Pc(1102) Class3_Sub1_Sub1_Sub3 local1102;
								if (local212 == -1) {
									local1102 = local82.method65(local1082, -1, -1);
								} else {
									@Pc(1108) Class39 local1108 = Class39.aClass39Array1[local212];
									local1102 = local82.method65(local1082, local1108.anIntArray183[local82.anInt230], local1108.anIntArray184[local82.anInt230]);
								}
								if (local1102 != null) {
									local1102.method341(local82.anInt213, 0, local82.anInt212, 0, local168, local179);
								}
								Class3_Sub1_Sub3_Sub3.anInt599 = local162;
								Class3_Sub1_Sub3_Sub3.anInt600 = local164;
							} else {
								if (local82.anInt218 == 7) {
									local682 = local82.aClass3_Sub1_Sub3_Sub4_1;
									local164 = 0;
									for (local168 = 0; local168 < local82.anInt210; local168++) {
										for (local179 = 0; local179 < local82.anInt197; local179++) {
											if (local82.anIntArray27[local164] > 0) {
												@Pc(1172) Class50 local1172 = Class50.method562(local82.anIntArray27[local164] - 1);
												@Pc(1175) String local1175 = local1172.aString16;
												if (local1172.aBoolean191 || local82.anIntArray34[local164] != 1) {
													local1175 = local1175 + " x" + method674(local82.anIntArray34[local164]);
												}
												local214 = local87 + local179 * (local82.anInt227 + 115);
												local221 = local92 + local168 * (local82.anInt226 + 12);
												if (local82.aBoolean31) {
													local682.method441(local82.aBoolean37, local82.anInt217, local221, local1175, local214 + local82.anInt197 / 2);
												} else {
													local682.method448(local214, local1175, local82.anInt217, local221, local82.aBoolean37);
												}
											}
											local164++;
										}
									}
								}
								if (local82.anInt218 == 8 && (this.anInt874 == local82.anInt221 || this.anInt885 == local82.anInt221 || this.anInt922 == local82.anInt221) && this.anInt990 == 100) {
									local162 = 0;
									local164 = 0;
									@Pc(1289) Class3_Sub1_Sub3_Sub4 local1289 = this.aClass3_Sub1_Sub3_Sub4_3;
									@Pc(1292) String local1292 = local82.aString9;
									while (local1292.length() > 0) {
										local212 = local1292.indexOf("\\n");
										if (local212 == -1) {
											local959 = local1292;
											local1292 = "";
										} else {
											local959 = local1292.substring(0, local212);
											local1292 = local1292.substring(local212 + 2);
										}
										local214 = local1289.method442(local959);
										if (local214 > local162) {
											local162 = local214;
										}
										local164 += local1289.anInt674 + 1;
									}
									local162 += 6;
									local164 += 7;
									local212 = local87 + local82.anInt197 - local162 - 5;
									local214 = local92 + local82.anInt210 + 5;
									if (local212 < local87 + 5) {
										local212 = local87 + 5;
									}
									if (local212 + local162 > arg0 + arg2.anInt197) {
										local212 = arg0 + arg2.anInt197 - local162;
									}
									Class3_Sub1_Sub3.method432(local212, local214, local162, 16777120, local164);
									Class3_Sub1_Sub3.method433(local212, local162, local214, 0, local164);
									local1292 = local82.aString9;
									local221 = local214 + local1289.anInt674 + 2;
									while (local1292.length() > 0) {
										local246 = local1292.indexOf("\\n");
										if (local246 == -1) {
											local959 = local1292;
											local1292 = "";
										} else {
											local959 = local1292.substring(0, local246);
											local1292 = local1292.substring(local246 + 2);
										}
										local1289.method448(local212 + 3, local959, 0, local221, false);
										local221 += local1289.anInt674 + 1;
									}
								}
							}
						}
					}
				}
				Class3_Sub1_Sub3.method429(local34, local36, local40, local38);
			}
		} catch (@Pc(1462) RuntimeException local1462) {
			signlink.reporterror("63919, " + arg0 + ", " + 481 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local1462.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private void method690(@OriginalArg(0) boolean arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt997; local1++) {
				@Pc(8) int local8 = this.anIntArray263[local1];
				@Pc(13) Class3_Sub1_Sub1_Sub1_Sub2 local13 = this.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local8];
				if (local13 != null) {
					this.method691(local13.aClass5_2.aByte1, local13);
				}
			}
			if (arg0) {
				this.aClass38ArrayArrayArray1 = null;
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("18538, " + arg0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILclient!GSULPWKR;)V")
	private void method691(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub1_Sub1_Sub1 arg1) {
		try {
			if (arg1.anInt380 < 128 || arg1.anInt381 < 128 || arg1.anInt380 >= 13184 || arg1.anInt381 >= 13184) {
				arg1.anInt375 = -1;
				arg1.anInt395 = -1;
				arg1.anInt387 = 0;
				arg1.anInt388 = 0;
				arg1.anInt380 = arg1.anIntArray54[0] * 128 + arg1.anInt392 * 64;
				arg1.anInt381 = arg1.anIntArray55[0] * 128 + arg1.anInt392 * 64;
				arg1.method213(772);
			}
			if (arg1 == aClass3_Sub1_Sub1_Sub1_Sub1_1 && (arg1.anInt380 < 1536 || arg1.anInt381 < 1536 || arg1.anInt380 >= 11776 || arg1.anInt381 >= 11776)) {
				arg1.anInt375 = -1;
				arg1.anInt395 = -1;
				arg1.anInt387 = 0;
				arg1.anInt388 = 0;
				arg1.anInt380 = arg1.anIntArray54[0] * 128 + arg1.anInt392 * 64;
				arg1.anInt381 = arg1.anIntArray55[0] * 128 + arg1.anInt392 * 64;
				arg1.method213(772);
			}
			if (arg1.anInt387 > anInt1003) {
				this.method692(arg1);
			} else if (arg1.anInt388 >= anInt1003) {
				this.method693(arg1);
			} else {
				this.method694(arg1);
			}
			this.method695(arg1);
			this.method696(this.aBoolean250, arg1);
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("66703, " + 2 + ", " + arg0 + ", " + arg1 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!GSULPWKR;Z)V")
	private void method692(@OriginalArg(0) Class3_Sub1_Sub1_Sub1 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt387 - anInt1003;
			@Pc(23) int local23 = arg0.anInt383 * 128 + arg0.anInt392 * 64;
			@Pc(33) int local33 = arg0.anInt385 * 128 + arg0.anInt392 * 64;
			arg0.anInt380 += (local23 - arg0.anInt380) / local4;
			arg0.anInt381 += (local33 - arg0.anInt381) / local4;
			arg0.anInt394 = 0;
			if (arg0.anInt389 == 0) {
				arg0.anInt390 = 1024;
			}
			if (arg0.anInt389 == 1) {
				arg0.anInt390 = 1536;
			}
			if (arg0.anInt389 == 2) {
				arg0.anInt390 = 0;
			}
			if (arg0.anInt389 == 3) {
				arg0.anInt390 = 512;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("56025, " + arg0 + ", " + false + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!GSULPWKR;)V")
	private void method693(@OriginalArg(1) Class3_Sub1_Sub1_Sub1 arg0) {
		try {
			if (arg0.anInt388 == anInt1003 || arg0.anInt375 == -1 || arg0.anInt378 != 0 || arg0.anInt377 + 1 > Class39.aClass39Array1[arg0.anInt375].method492(arg0.anInt376)) {
				@Pc(29) int local29 = arg0.anInt388 - arg0.anInt387;
				@Pc(34) int local34 = anInt1003 - arg0.anInt387;
				@Pc(44) int local44 = arg0.anInt383 * 128 + arg0.anInt392 * 64;
				@Pc(54) int local54 = arg0.anInt385 * 128 + arg0.anInt392 * 64;
				@Pc(64) int local64 = arg0.anInt384 * 128 + arg0.anInt392 * 64;
				@Pc(74) int local74 = arg0.anInt386 * 128 + arg0.anInt392 * 64;
				arg0.anInt380 = (local44 * (local29 - local34) + local64 * local34) / local29;
				arg0.anInt381 = (local54 * (local29 - local34) + local74 * local34) / local29;
			}
			arg0.anInt394 = 0;
			if (arg0.anInt389 == 0) {
				arg0.anInt390 = 1024;
			}
			if (arg0.anInt389 == 1) {
				arg0.anInt390 = 1536;
			}
			if (arg0.anInt389 == 2) {
				arg0.anInt390 = 0;
			}
			if (arg0.anInt389 == 3) {
				arg0.anInt390 = 512;
			}
			arg0.anInt382 = arg0.anInt390;
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("41806, " + true + ", " + arg0 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!GSULPWKR;I)V")
	private void method694(@OriginalArg(0) Class3_Sub1_Sub1_Sub1 arg0) {
		try {
			arg0.anInt371 = arg0.anInt404;
			if (arg0.anInt401 == 0) {
				arg0.anInt394 = 0;
			} else {
				if (arg0.anInt375 != -1 && arg0.anInt378 == 0) {
					@Pc(24) Class39 local24 = Class39.aClass39Array1[arg0.anInt375];
					if (arg0.anInt402 > 0 && local24.anInt729 == 0) {
						arg0.anInt394++;
						return;
					}
					if (arg0.anInt402 <= 0 && local24.anInt730 == 0) {
						arg0.anInt394++;
						return;
					}
				}
				@Pc(53) int local53 = arg0.anInt380;
				@Pc(56) int local56 = arg0.anInt381;
				@Pc(71) int local71 = arg0.anIntArray54[arg0.anInt401 - 1] * 128 + arg0.anInt392 * 64;
				@Pc(86) int local86 = arg0.anIntArray55[arg0.anInt401 - 1] * 128 + arg0.anInt392 * 64;
				if (local71 - local53 <= 256 && local71 - local53 >= -256 && local86 - local56 <= 256 && local86 - local56 >= -256) {
					if (local53 < local71) {
						if (local56 < local86) {
							arg0.anInt390 = 1280;
						} else if (local56 > local86) {
							arg0.anInt390 = 1792;
						} else {
							arg0.anInt390 = 1536;
						}
					} else if (local53 > local71) {
						if (local56 < local86) {
							arg0.anInt390 = 768;
						} else if (local56 > local86) {
							arg0.anInt390 = 256;
						} else {
							arg0.anInt390 = 512;
						}
					} else if (local56 < local86) {
						arg0.anInt390 = 1024;
					} else {
						arg0.anInt390 = 0;
					}
					@Pc(188) int local188 = arg0.anInt390 - arg0.anInt382 & 0x7FF;
					if (local188 > 1024) {
						local188 -= 2048;
					}
					@Pc(195) int local195 = arg0.anInt413;
					if (local188 >= -256 && local188 <= 256) {
						local195 = arg0.anInt412;
					} else if (local188 >= 256 && local188 < 768) {
						local195 = arg0.anInt415;
					} else if (local188 >= -768 && local188 <= -256) {
						local195 = arg0.anInt414;
					}
					if (local195 == -1) {
						local195 = arg0.anInt412;
					}
					arg0.anInt371 = local195;
					@Pc(237) int local237 = 4;
					if (arg0.anInt382 != arg0.anInt390 && arg0.anInt406 == -1 && arg0.anInt403 != 0) {
						local237 = 2;
					}
					if (arg0.anInt401 > 2) {
						local237 = 6;
					}
					if (arg0.anInt401 > 3) {
						local237 = 8;
					}
					if (arg0.anInt394 > 0 && arg0.anInt401 > 1) {
						local237 = 8;
						arg0.anInt394--;
					}
					if (arg0.aBooleanArray5[arg0.anInt401 - 1]) {
						local237 <<= 0x1;
					}
					if (local237 >= 8 && arg0.anInt371 == arg0.anInt412 && arg0.anInt374 != -1) {
						arg0.anInt371 = arg0.anInt374;
					}
					if (local53 < local71) {
						arg0.anInt380 += local237;
						if (arg0.anInt380 > local71) {
							arg0.anInt380 = local71;
						}
					} else if (local53 > local71) {
						arg0.anInt380 -= local237;
						if (arg0.anInt380 < local71) {
							arg0.anInt380 = local71;
						}
					}
					if (local56 < local86) {
						arg0.anInt381 += local237;
						if (arg0.anInt381 > local86) {
							arg0.anInt381 = local86;
						}
					} else if (local56 > local86) {
						arg0.anInt381 -= local237;
						if (arg0.anInt381 < local86) {
							arg0.anInt381 = local86;
						}
					}
					if (arg0.anInt380 == local71 && arg0.anInt381 == local86) {
						arg0.anInt401--;
						if (arg0.anInt402 > 0) {
							arg0.anInt402--;
							return;
						}
					}
				} else {
					arg0.anInt380 = local71;
					arg0.anInt381 = local86;
				}
			}
		} catch (@Pc(399) RuntimeException local399) {
			signlink.reporterror("48817, " + arg0 + ", " + 18230 + ", " + local399.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!GSULPWKR;)V")
	private void method695(@OriginalArg(1) Class3_Sub1_Sub1_Sub1 arg0) {
		try {
			if (arg0.anInt403 != 0) {
				@Pc(33) int local33;
				@Pc(39) int local39;
				if (arg0.anInt406 != -1 && arg0.anInt406 < 32768) {
					@Pc(25) Class3_Sub1_Sub1_Sub1_Sub2 local25 = this.aClass3_Sub1_Sub1_Sub1_Sub2Array1[arg0.anInt406];
					if (local25 != null) {
						local33 = arg0.anInt380 - local25.anInt380;
						local39 = arg0.anInt381 - local25.anInt381;
						if (local33 != 0 || local39 != 0) {
							arg0.anInt390 = (int) (Math.atan2((double) local33, (double) local39) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(64) int local64;
				if (arg0.anInt406 >= 32768) {
					local64 = arg0.anInt406 - 32768;
					if (local64 == this.anInt1051) {
						local64 = this.anInt1027;
					}
					@Pc(76) Class3_Sub1_Sub1_Sub1_Sub1 local76 = this.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local64];
					if (local76 != null) {
						local39 = arg0.anInt380 - local76.anInt380;
						@Pc(90) int local90 = arg0.anInt381 - local76.anInt381;
						if (local39 != 0 || local90 != 0) {
							arg0.anInt390 = (int) (Math.atan2((double) local39, (double) local90) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt407 != 0 || arg0.anInt408 != 0) && (arg0.anInt401 == 0 || arg0.anInt394 > 0)) {
					local64 = arg0.anInt380 - (arg0.anInt407 - this.anInt866 - this.anInt866) * 64;
					local33 = arg0.anInt381 - (arg0.anInt408 - this.anInt867 - this.anInt867) * 64;
					if (local64 != 0 || local33 != 0) {
						arg0.anInt390 = (int) (Math.atan2((double) local64, (double) local33) * 325.949D) & 0x7FF;
					}
					arg0.anInt407 = 0;
					arg0.anInt408 = 0;
				}
				local64 = arg0.anInt390 - arg0.anInt382 & 0x7FF;
				if (local64 != 0) {
					if (local64 < arg0.anInt403 || local64 > 2048 - arg0.anInt403) {
						arg0.anInt382 = arg0.anInt390;
					} else if (local64 > 1024) {
						arg0.anInt382 -= arg0.anInt403;
					} else {
						arg0.anInt382 += arg0.anInt403;
					}
					arg0.anInt382 &= 0x7FF;
					if (arg0.anInt371 == arg0.anInt404 && arg0.anInt382 != arg0.anInt390) {
						if (arg0.anInt405 != -1) {
							arg0.anInt371 = arg0.anInt405;
							return;
						}
						arg0.anInt371 = arg0.anInt412;
						return;
					}
				}
			}
		} catch (@Pc(244) RuntimeException local244) {
			signlink.reporterror("17127, " + 2 + ", " + arg0 + ", " + local244.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZLclient!GSULPWKR;)V")
	private void method696(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class3_Sub1_Sub1_Sub1 arg1) {
		try {
			if (arg0) {
				this.anInt932 = -1;
			}
			arg1.aBoolean77 = false;
			@Pc(18) Class39 local18;
			if (arg1.anInt371 != -1) {
				local18 = Class39.aClass39Array1[arg1.anInt371];
				arg1.anInt373++;
				if (arg1.anInt372 < local18.anInt723 && arg1.anInt373 > local18.method492(arg1.anInt372)) {
					arg1.anInt373 = 0;
					arg1.anInt372++;
				}
				if (arg1.anInt372 >= local18.anInt723) {
					arg1.anInt373 = 0;
					arg1.anInt372 = 0;
				}
			}
			if (arg1.anInt395 != -1 && anInt1003 >= arg1.anInt398) {
				if (arg1.anInt396 < 0) {
					arg1.anInt396 = 0;
				}
				local18 = Class2.aClass2Array1[arg1.anInt395].aClass39_1;
				arg1.anInt397++;
				while (arg1.anInt396 < local18.anInt723 && arg1.anInt397 > local18.method492(arg1.anInt396)) {
					arg1.anInt397 -= local18.method492(arg1.anInt396);
					arg1.anInt396++;
				}
				if (arg1.anInt396 >= local18.anInt723 && (arg1.anInt396 < 0 || arg1.anInt396 >= local18.anInt723)) {
					arg1.anInt395 = -1;
				}
			}
			if (arg1.anInt375 != -1 && arg1.anInt378 <= 1) {
				local18 = Class39.aClass39Array1[arg1.anInt375];
				if (local18.anInt729 == 1 && arg1.anInt402 > 0 && arg1.anInt387 <= anInt1003 && arg1.anInt388 < anInt1003) {
					arg1.anInt378 = 1;
					return;
				}
			}
			if (arg1.anInt375 != -1 && arg1.anInt378 == 0) {
				local18 = Class39.aClass39Array1[arg1.anInt375];
				arg1.anInt377++;
				while (arg1.anInt376 < local18.anInt723 && arg1.anInt377 > local18.method492(arg1.anInt376)) {
					arg1.anInt377 -= local18.method492(arg1.anInt376);
					arg1.anInt376++;
				}
				if (arg1.anInt376 >= local18.anInt723) {
					arg1.anInt376 -= local18.anInt724;
					arg1.anInt379++;
					if (arg1.anInt379 >= local18.anInt728) {
						arg1.anInt375 = -1;
					}
					if (arg1.anInt376 < 0 || arg1.anInt376 >= local18.anInt723) {
						arg1.anInt375 = -1;
					}
				}
				arg1.aBoolean77 = local18.aBoolean171;
			}
			if (arg1.anInt378 > 0) {
				arg1.anInt378--;
			}
		} catch (@Pc(263) RuntimeException local263) {
			signlink.reporterror("51392, " + arg0 + ", " + arg1 + ", " + local263.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(B)V")
	private void method697() {
		try {
			if (this.anInt947 == -1 || this.anInt877 != 2 && super.aClass32_2 == null) {
				if (this.aBoolean227) {
					this.method622();
					this.aBoolean227 = false;
					this.aClass32_19.method460(4, 0, super.aGraphics2);
					this.aClass32_20.method460(357, 0, super.aGraphics2);
					this.aClass32_21.method460(4, 722, super.aGraphics2);
					this.aClass32_22.method460(205, 743, super.aGraphics2);
					this.aClass32_23.method460(0, 0, super.aGraphics2);
					this.aClass32_24.method460(4, 516, super.aGraphics2);
					this.aClass32_25.method460(205, 516, super.aGraphics2);
					this.aClass32_26.method460(357, 496, super.aGraphics2);
					this.aClass32_27.method460(338, 0, super.aGraphics2);
					this.aBoolean243 = true;
					this.aBoolean229 = true;
					this.aBoolean247 = true;
					this.aBoolean225 = true;
					if (this.anInt877 != 2) {
						this.aClass32_8.method460(4, 4, super.aGraphics2);
						this.aClass32_7.method460(4, 550, super.aGraphics2);
					}
				}
				if (this.anInt877 == 2) {
					this.method660();
				}
				if (this.aBoolean226 && this.anInt1006 == 1) {
					this.aBoolean243 = true;
				}
				@Pc(283) boolean local283;
				if (this.anInt901 != -1) {
					local283 = this.method646(this.anInt903, this.anInt975, this.anInt901);
					if (local283) {
						this.aBoolean243 = true;
					}
				}
				if (this.anInt898 == 2) {
					this.aBoolean243 = true;
				}
				if (this.anInt915 == 2) {
					this.aBoolean243 = true;
				}
				if (this.aBoolean243) {
					this.method605(this.aBoolean206);
					this.aBoolean243 = false;
				}
				if (this.anInt846 == -1) {
					this.aClass9_1.anInt205 = this.anInt1023 - this.anInt927 - 77;
					if (super.anInt831 > 448 && super.anInt831 < 560 && super.anInt832 > 332) {
						this.method656(this.anInt1023, -1, 77, 463, this.aClass9_1, super.anInt832 - 357, 0, super.anInt831 - 17);
					}
					@Pc(366) int local366 = this.anInt1023 - this.aClass9_1.anInt205 - 77;
					if (local366 < 0) {
						local366 = 0;
					}
					if (local366 > this.anInt1023 - 77) {
						local366 = this.anInt1023 - 77;
					}
					if (this.anInt927 != local366) {
						this.anInt927 = local366;
						this.aBoolean229 = true;
					}
				}
				if (this.anInt846 != -1) {
					local283 = this.method646(this.anInt903, this.anInt975, this.anInt846);
					if (local283) {
						this.aBoolean229 = true;
					}
				}
				if (this.anInt898 == 3) {
					this.aBoolean229 = true;
				}
				if (this.anInt915 == 3) {
					this.aBoolean229 = true;
				}
				if (this.aString17 != null) {
					this.aBoolean229 = true;
				}
				if (this.aBoolean226 && this.anInt1006 == 2) {
					this.aBoolean229 = true;
				}
				if (this.aBoolean229) {
					this.method632(this.anInt883);
					this.aBoolean229 = false;
				}
				if (this.anInt877 == 2) {
					this.method675();
					this.aClass32_7.method460(4, 550, super.aGraphics2);
				}
				if (this.anInt1011 != -1) {
					this.aBoolean247 = true;
				}
				if (this.aBoolean247) {
					if (this.anInt1011 != -1 && this.anInt1011 == this.anInt1058) {
						this.anInt1011 = -1;
						this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 119);
						this.aClass3_Sub1_Sub2_7.method79(this.anInt1058);
					}
					this.aBoolean247 = false;
					this.aClass32_5.method459();
					this.aClass3_Sub1_Sub3_Sub1_20.method204(0, 0);
					if (this.anInt901 == -1) {
						if (this.anIntArray274[this.anInt1058] != -1) {
							if (this.anInt1058 == 0) {
								this.aClass3_Sub1_Sub3_Sub1_6.method204(10, 22);
							}
							if (this.anInt1058 == 1) {
								this.aClass3_Sub1_Sub3_Sub1_7.method204(8, 54);
							}
							if (this.anInt1058 == 2) {
								this.aClass3_Sub1_Sub3_Sub1_7.method204(8, 82);
							}
							if (this.anInt1058 == 3) {
								this.aClass3_Sub1_Sub3_Sub1_8.method204(8, 110);
							}
							if (this.anInt1058 == 4) {
								this.aClass3_Sub1_Sub3_Sub1_10.method204(8, 153);
							}
							if (this.anInt1058 == 5) {
								this.aClass3_Sub1_Sub3_Sub1_10.method204(8, 181);
							}
							if (this.anInt1058 == 6) {
								this.aClass3_Sub1_Sub3_Sub1_9.method204(9, 209);
							}
						}
						if (this.anIntArray274[0] != -1 && (this.anInt1011 != 0 || anInt1003 % 20 < 10)) {
							this.aClass3_Sub1_Sub3_Sub1Array3[0].method204(13, 29);
						}
						if (this.anIntArray274[1] != -1 && (this.anInt1011 != 1 || anInt1003 % 20 < 10)) {
							this.aClass3_Sub1_Sub3_Sub1Array3[1].method204(11, 53);
						}
						if (this.anIntArray274[2] != -1 && (this.anInt1011 != 2 || anInt1003 % 20 < 10)) {
							this.aClass3_Sub1_Sub3_Sub1Array3[2].method204(11, 82);
						}
						if (this.anIntArray274[3] != -1 && (this.anInt1011 != 3 || anInt1003 % 20 < 10)) {
							this.aClass3_Sub1_Sub3_Sub1Array3[3].method204(12, 115);
						}
						if (this.anIntArray274[4] != -1 && (this.anInt1011 != 4 || anInt1003 % 20 < 10)) {
							this.aClass3_Sub1_Sub3_Sub1Array3[4].method204(13, 153);
						}
						if (this.anIntArray274[5] != -1 && (this.anInt1011 != 5 || anInt1003 % 20 < 10)) {
							this.aClass3_Sub1_Sub3_Sub1Array3[5].method204(11, 180);
						}
						if (this.anIntArray274[6] != -1 && (this.anInt1011 != 6 || anInt1003 % 20 < 10)) {
							this.aClass3_Sub1_Sub3_Sub1Array3[6].method204(13, 208);
						}
					}
					this.aClass32_5.method460(160, 516, super.aGraphics2);
					anInt905++;
					if (anInt905 > 77) {
						anInt905 = 0;
						this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 116);
					}
					this.aClass32_4.method459();
					this.aClass3_Sub1_Sub3_Sub1_19.method204(0, 0);
					if (this.anInt901 == -1) {
						if (this.anIntArray274[this.anInt1058] != -1) {
							if (this.anInt1058 == 7) {
								this.aClass3_Sub1_Sub3_Sub1_13.method204(0, 42);
							}
							if (this.anInt1058 == 8) {
								this.aClass3_Sub1_Sub3_Sub1_14.method204(0, 74);
							}
							if (this.anInt1058 == 9) {
								this.aClass3_Sub1_Sub3_Sub1_14.method204(0, 102);
							}
							if (this.anInt1058 == 10) {
								this.aClass3_Sub1_Sub3_Sub1_15.method204(1, 130);
							}
							if (this.anInt1058 == 11) {
								this.aClass3_Sub1_Sub3_Sub1_17.method204(0, 173);
							}
							if (this.anInt1058 == 12) {
								this.aClass3_Sub1_Sub3_Sub1_17.method204(0, 201);
							}
							if (this.anInt1058 == 13) {
								this.aClass3_Sub1_Sub3_Sub1_16.method204(0, 229);
							}
						}
						if (this.anIntArray274[8] != -1 && (this.anInt1011 != 8 || anInt1003 % 20 < 10)) {
							this.aClass3_Sub1_Sub3_Sub1Array3[7].method204(2, 74);
						}
						if (this.anIntArray274[9] != -1 && (this.anInt1011 != 9 || anInt1003 % 20 < 10)) {
							this.aClass3_Sub1_Sub3_Sub1Array3[8].method204(3, 102);
						}
						if (this.anIntArray274[10] != -1 && (this.anInt1011 != 10 || anInt1003 % 20 < 10)) {
							this.aClass3_Sub1_Sub3_Sub1Array3[9].method204(4, 137);
						}
						if (this.anIntArray274[11] != -1 && (this.anInt1011 != 11 || anInt1003 % 20 < 10)) {
							this.aClass3_Sub1_Sub3_Sub1Array3[10].method204(2, 174);
						}
						if (this.anIntArray274[12] != -1 && (this.anInt1011 != 12 || anInt1003 % 20 < 10)) {
							this.aClass3_Sub1_Sub3_Sub1Array3[11].method204(2, 201);
						}
						if (this.anIntArray274[13] != -1 && (this.anInt1011 != 13 || anInt1003 % 20 < 10)) {
							this.aClass3_Sub1_Sub3_Sub1Array3[12].method204(2, 226);
						}
					}
					this.aClass32_4.method460(466, 496, super.aGraphics2);
					this.aClass32_8.method459();
					Class3_Sub1_Sub3_Sub3.anIntArray139 = this.anIntArray240;
				}
				if (this.aBoolean225) {
					this.aBoolean225 = false;
					this.aClass32_3.method459();
					this.aClass3_Sub1_Sub3_Sub1_18.method204(0, 0);
					this.aClass3_Sub1_Sub3_Sub4_3.method441(true, 16777215, 28, "Public chat", 55);
					if (this.anInt1022 == 0) {
						this.aClass3_Sub1_Sub3_Sub4_3.method441(true, 65280, 41, "On", 55);
					}
					if (this.anInt1022 == 1) {
						this.aClass3_Sub1_Sub3_Sub4_3.method441(true, 16776960, 41, "Friends", 55);
					}
					if (this.anInt1022 == 2) {
						this.aClass3_Sub1_Sub3_Sub4_3.method441(true, 16711680, 41, "Off", 55);
					}
					if (this.anInt1022 == 3) {
						this.aClass3_Sub1_Sub3_Sub4_3.method441(true, 65535, 41, "Hide", 55);
					}
					this.aClass3_Sub1_Sub3_Sub4_3.method441(true, 16777215, 28, "Private chat", 184);
					if (this.anInt976 == 0) {
						this.aClass3_Sub1_Sub3_Sub4_3.method441(true, 65280, 41, "On", 184);
					}
					if (this.anInt976 == 1) {
						this.aClass3_Sub1_Sub3_Sub4_3.method441(true, 16776960, 41, "Friends", 184);
					}
					if (this.anInt976 == 2) {
						this.aClass3_Sub1_Sub3_Sub4_3.method441(true, 16711680, 41, "Off", 184);
					}
					this.aClass3_Sub1_Sub3_Sub4_3.method441(true, 16777215, 28, "Trade/compete", 324);
					if (this.anInt900 == 0) {
						this.aClass3_Sub1_Sub3_Sub4_3.method441(true, 65280, 41, "On", 324);
					}
					if (this.anInt900 == 1) {
						this.aClass3_Sub1_Sub3_Sub4_3.method441(true, 16776960, 41, "Friends", 324);
					}
					if (this.anInt900 == 2) {
						this.aClass3_Sub1_Sub3_Sub4_3.method441(true, 16711680, 41, "Off", 324);
					}
					this.aClass3_Sub1_Sub3_Sub4_3.method441(true, 16777215, 33, "Report abuse", 458);
					this.aClass32_3.method460(453, 0, super.aGraphics2);
					this.aClass32_8.method459();
					Class3_Sub1_Sub3_Sub3.anIntArray139 = this.anIntArray240;
				}
				this.anInt975 = 0;
			} else {
				if (this.anInt877 == 2) {
					this.method646(this.anInt903, this.anInt975, this.anInt947);
					if (this.anInt879 != -1) {
						this.method646(this.anInt903, this.anInt975, this.anInt879);
					}
					this.anInt975 = 0;
					this.method688(this.anInt1021);
					super.aClass32_2.method459();
					Class3_Sub1_Sub3_Sub3.anIntArray139 = this.anIntArray241;
					Class3_Sub1_Sub3.method430();
					this.aBoolean227 = true;
					@Pc(61) Class9 local61 = Class9.method58(this.anInt947);
					if (local61.anInt197 == 512 && local61.anInt210 == 334 && local61.anInt218 == 0) {
						local61.anInt197 = 765;
						local61.anInt210 = 503;
					}
					this.method689(0, 0, local61, 0);
					if (this.anInt879 != -1) {
						local61 = Class9.method58(this.anInt879);
						if (local61.anInt197 == 512 && local61.anInt210 == 334 && local61.anInt218 == 0) {
							local61.anInt197 = 765;
							local61.anInt210 = 503;
						}
						this.method689(0, 0, local61, 0);
					}
					if (this.aBoolean226) {
						this.method657();
					} else {
						this.method676();
						this.method679();
					}
				}
				super.aClass32_2.method460(0, 0, super.aGraphics2);
			}
		} catch (@Pc(1226) RuntimeException local1226) {
			signlink.reporterror("61874, " + 9 + ", " + local1226.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!GSULPWKR;Z)V")
	private void method698(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub1_Sub1 arg1) {
		try {
			this.method699(arg1.anInt380, arg1.anInt381, arg0);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("34438, " + arg0 + ", " + arg1 + ", " + false + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)V")
	private void method699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg0 >= 128 && arg1 >= 128 && arg0 <= 13056 && arg1 <= 13056) {
				@Pc(28) int local28 = this.method601(arg1, this.anInt862, arg0) - arg2;
				this.anInt931 += 0;
				@Pc(39) int local39 = arg0 - this.anInt963;
				@Pc(44) int local44 = local28 - this.anInt964;
				@Pc(49) int local49 = arg1 - this.anInt965;
				@Pc(54) int local54 = Class3_Sub1_Sub1_Sub3.anIntArray121[this.anInt966];
				@Pc(59) int local59 = Class3_Sub1_Sub1_Sub3.anIntArray122[this.anInt966];
				@Pc(64) int local64 = Class3_Sub1_Sub1_Sub3.anIntArray121[this.anInt967];
				@Pc(69) int local69 = Class3_Sub1_Sub1_Sub3.anIntArray122[this.anInt967];
				@Pc(79) int local79 = local49 * local64 + local39 * local69 >> 16;
				@Pc(89) int local89 = local49 * local69 - local39 * local64 >> 16;
				@Pc(91) int local91 = local79;
				@Pc(101) int local101 = local44 * local59 - local89 * local54 >> 16;
				@Pc(111) int local111 = local44 * local54 + local89 * local59 >> 16;
				if (local111 >= 50) {
					this.anInt971 = Class3_Sub1_Sub3_Sub3.anInt599 + (local91 << 9) / local111;
					this.anInt972 = Class3_Sub1_Sub3_Sub3.anInt600 + (local101 << 9) / local111;
				} else {
					this.anInt971 = -1;
					this.anInt972 = -1;
				}
			} else {
				this.anInt971 = -1;
				this.anInt972 = -1;
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("36222, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!GHHPHSRU;Lclient!EJJAKGTE;B)V")
	private void method700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub2 arg2, @OriginalArg(3) Class3_Sub1_Sub1_Sub1_Sub1 arg3) {
		try {
			if ((arg0 & 0x40) != 0) {
				arg3.anInt406 = arg2.method117();
				if (arg3.anInt406 == 65535) {
					arg3.anInt406 = -1;
				}
			}
			if ((arg0 & 0x8) != 0) {
				arg3.anInt407 = arg2.method117();
				arg3.anInt408 = arg2.method117();
			}
			@Pc(46) int local46;
			@Pc(49) int local49;
			@Pc(53) int local53;
			if ((arg0 & 0x20) != 0) {
				local46 = arg2.method116();
				local49 = arg2.method89();
				local53 = arg2.method110();
				@Pc(56) int local56 = arg2.anInt257;
				if (arg3.aString4 != null && arg3.aBoolean27) {
					@Pc(66) long local66 = Class36.method477(arg3.aString4);
					@Pc(68) boolean local68 = false;
					if (local49 <= 1) {
						for (@Pc(73) int local73 = 0; local73 < this.anInt919; local73++) {
							if (this.aLongArray4[local73] == local66) {
								local68 = true;
								break;
							}
						}
					}
					if (!local68 && this.anInt977 == 0) {
						try {
							this.aClass3_Sub1_Sub2_8.anInt257 = 0;
							arg2.method126(local53, this.aClass3_Sub1_Sub2_8.aByteArray3);
							this.aClass3_Sub1_Sub2_8.anInt257 = 0;
							@Pc(118) String local118 = Class27.method407(this.aClass3_Sub1_Sub2_8, local53);
							@Pc(122) String local122 = Class12.method138(810, local118);
							arg3.aString10 = local122;
							arg3.anInt400 = local46 >> 8;
							arg3.anInt416 = local46 & 0xFF;
							arg3.anInt370 = 150;
							if (local49 == 2 || local49 == 3) {
								this.method598("@cr2@" + arg3.aString4, local122, 1);
							} else if (local49 == 1) {
								this.method598("@cr1@" + arg3.aString4, local122, 1);
							} else {
								this.method598(arg3.aString4, local122, 2);
							}
						} catch (@Pc(186) Exception local186) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg2.anInt257 = local56 + local53;
			}
			if ((arg0 & 0x1) != 0) {
				arg3.aString10 = arg2.method96();
				if (arg3.aString10.charAt(0) == '~') {
					arg3.aString10 = arg3.aString10.substring(1);
					this.method598(arg3.aString4, arg3.aString10, 2);
				} else if (arg3 == aClass3_Sub1_Sub1_Sub1_Sub1_1) {
					this.method598(arg3.aString4, arg3.aString10, 2);
				}
				arg3.anInt400 = 0;
				arg3.anInt416 = 0;
				arg3.anInt370 = 150;
			}
			if ((arg0 & 0x4) != 0) {
				local46 = arg2.method110();
				@Pc(255) byte[] local255 = new byte[local46];
				@Pc(261) Class3_Sub1_Sub2 local261 = new Class3_Sub1_Sub2(-527, local255);
				arg2.method127(local46, local255);
				this.aClass3_Sub1_Sub2Array1[arg1] = local261;
				arg3.method57(285, local261);
			}
			if ((arg0 & 0x200) != 0) {
				arg3.anInt395 = arg2.method116();
				local46 = arg2.method124();
				arg3.anInt399 = local46 >> 16;
				arg3.anInt398 = anInt1003 + (local46 & 0xFFFF);
				arg3.anInt396 = 0;
				arg3.anInt397 = 0;
				if (arg3.anInt398 > anInt1003) {
					arg3.anInt396 = -1;
				}
				if (arg3.anInt395 == 65535) {
					arg3.anInt395 = -1;
				}
			}
			if ((arg0 & 0x400) != 0) {
				local46 = arg2.method89();
				local49 = arg2.method89();
				arg3.method212(local49, local46, anInt1003);
				arg3.anInt409 = anInt1003 + 300;
				arg3.anInt410 = arg2.method108();
				arg3.anInt411 = arg2.method108();
			}
			if ((arg0 & 0x2) != 0) {
				local46 = arg2.method91();
				if (local46 == 65535) {
					local46 = -1;
				}
				local49 = arg2.method89();
				if (local46 == arg3.anInt375 && local46 != -1) {
					local53 = Class39.aClass39Array1[local46].anInt731;
					if (local53 == 1) {
						arg3.anInt376 = 0;
						arg3.anInt377 = 0;
						arg3.anInt378 = local49;
						arg3.anInt379 = 0;
					}
					if (local53 == 2) {
						arg3.anInt379 = 0;
					}
				} else if (local46 == -1 || arg3.anInt375 == -1 || Class39.aClass39Array1[local46].anInt725 >= Class39.aClass39Array1[arg3.anInt375].anInt725) {
					arg3.anInt375 = local46;
					arg3.anInt376 = 0;
					arg3.anInt377 = 0;
					arg3.anInt378 = local49;
					arg3.anInt379 = 0;
					arg3.anInt402 = arg3.anInt401;
				}
			}
			if ((arg0 & 0x80) != 0) {
				local46 = arg2.method108();
				local49 = arg2.method110();
				arg3.method212(local49, local46, anInt1003);
				arg3.anInt409 = anInt1003 + 300;
				arg3.anInt410 = arg2.method89();
				arg3.anInt411 = arg2.method89();
			}
			if ((arg0 & 0x100) != 0) {
				arg3.anInt383 = arg2.method109();
				arg3.anInt385 = arg2.method110();
				arg3.anInt384 = arg2.method109();
				arg3.anInt386 = arg2.method110();
				arg3.anInt387 = arg2.method91() + anInt1003;
				arg3.anInt388 = arg2.method116() + anInt1003;
				arg3.anInt389 = arg2.method109();
				arg3.method213(772);
			}
		} catch (@Pc(516) RuntimeException local516) {
			signlink.reporterror("54904, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 91 + ", " + local516.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
	private void method701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class38 local9 = this.aClass38ArrayArrayArray1[this.anInt862][arg0][arg1];
		if (local9 == null) {
			this.aClass17_1.method243(this.anInt862, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class3_Sub1_Sub1_Sub2 local23 = null;
		@Pc(27) Class3_Sub1_Sub1_Sub2 local27;
		for (local27 = (Class3_Sub1_Sub1_Sub2) local9.method486(); local27 != null; local27 = (Class3_Sub1_Sub1_Sub2) local9.method488()) {
			@Pc(32) Class50 local32 = Class50.method562(local27.anInt299);
			@Pc(35) int local35 = local32.anInt808;
			if (local32.aBoolean191) {
				local35 *= local27.anInt300 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method484(local23);
		@Pc(65) Class3_Sub1_Sub1_Sub2 local65 = null;
		@Pc(67) Class3_Sub1_Sub1_Sub2 local67 = null;
		for (local27 = (Class3_Sub1_Sub1_Sub2) local9.method486(); local27 != null; local27 = (Class3_Sub1_Sub1_Sub2) local9.method488()) {
			if (local27.anInt299 != local23.anInt299 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt299 != local23.anInt299 && local27.anInt299 != local65.anInt299 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass17_1.method229(this.anInt862, arg1, local110, arg0, local23, this.method601(arg1 * 128 + 64, this.anInt862, arg0 * 128 + 64), local67, local65);
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method702() {
		try {
			this.anInt931 += 0;
			try {
				@Pc(13) int local13 = aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt380 + this.anInt1060;
				@Pc(19) int local19 = aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt381 + this.anInt949;
				if (this.anInt992 - local13 < -500 || this.anInt992 - local13 > 500 || this.anInt993 - local19 < -500 || this.anInt993 - local19 > 500) {
					this.anInt992 = local13;
					this.anInt993 = local19;
				}
				if (this.anInt992 != local13) {
					this.anInt992 += (local13 - this.anInt992) / 16;
				}
				if (this.anInt993 != local19) {
					this.anInt993 += (local19 - this.anInt993) / 16;
				}
				if (super.anIntArray210[1] == 1) {
					this.anInt1044 += (-this.anInt1044 - 24) / 2;
				} else if (super.anIntArray210[2] == 1) {
					this.anInt1044 += (24 - this.anInt1044) / 2;
				} else {
					this.anInt1044 /= 2;
				}
				if (super.anIntArray210[3] == 1) {
					this.anInt1045 += (12 - this.anInt1045) / 2;
				} else if (super.anIntArray210[4] == 1) {
					this.anInt1045 += (-this.anInt1045 - 12) / 2;
				} else {
					this.anInt1045 /= 2;
				}
				this.anInt1043 = this.anInt1043 + this.anInt1044 / 2 & 0x7FF;
				this.anInt1042 += this.anInt1045 / 2;
				if (this.anInt1042 < 128) {
					this.anInt1042 = 128;
				}
				if (this.anInt1042 > 383) {
					this.anInt1042 = 383;
				}
				@Pc(206) int local206 = this.anInt992 >> 7;
				@Pc(211) int local211 = this.anInt993 >> 7;
				@Pc(221) int local221 = this.method601(this.anInt993, this.anInt862, this.anInt992);
				@Pc(223) int local223 = 0;
				@Pc(239) int local239;
				if (local206 > 3 && local211 > 3 && local206 < 100 && local211 < 100) {
					for (local239 = local206 - 4; local239 <= local206 + 4; local239++) {
						for (@Pc(245) int local245 = local211 - 4; local245 <= local211 + 4; local245++) {
							@Pc(250) int local250 = this.anInt862;
							if (local250 < 3 && (this.aByteArrayArrayArray8[1][local239][local245] & 0x2) == 2) {
								local250++;
							}
							@Pc(277) int local277 = local221 - this.anIntArrayArrayArray7[local250][local239][local245];
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
				if (local239 > this.anInt970) {
					this.anInt970 += (local239 - this.anInt970) / 24;
				} else if (local239 < this.anInt970) {
					this.anInt970 += (local239 - this.anInt970) / 80;
				}
			} catch (@Pc(341) Exception local341) {
				signlink.reporterror("glfc_ex " + aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt380 + "," + aClass3_Sub1_Sub1_Sub1_Sub1_1.anInt381 + "," + this.anInt992 + "," + this.anInt993 + "," + this.anInt892 + "," + this.anInt893 + "," + this.anInt866 + "," + this.anInt867);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(391) RuntimeException local391) {
			signlink.reporterror("60728, " + 0 + ", " + local391.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZ)V")
	private void method703(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		try {
			signlink.anInt1077 = arg0;
			if (arg1) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("67320, " + 28068 + ", " + arg0 + ", " + arg1 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!FNOFBEYP;)V")
	private void method704(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class3_Sub2 arg1) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			if (arg1.anInt243 == 0) {
				local1 = this.aClass17_1.method248(arg1.anInt242, arg1.anInt244, arg1.anInt245);
			}
			if (arg1.anInt243 == 1) {
				local1 = this.aClass17_1.method249(arg1.anInt242, arg1.anInt245, arg1.anInt244);
			}
			if (arg1.anInt243 == 2) {
				local1 = this.aClass17_1.method250(arg1.anInt242, arg1.anInt244, arg1.anInt245);
			}
			if (arg1.anInt243 == 3) {
				local1 = this.aClass17_1.method251(arg1.anInt242, arg1.anInt244, arg1.anInt245);
			}
			@Pc(76) int local76;
			if (local1 != 0) {
				local76 = this.aClass17_1.method252(arg1.anInt242, arg1.anInt244, arg1.anInt245, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local76 & 0x1F;
				local7 = local76 >> 6;
			}
			arg1.anInt234 = local3;
			arg1.anInt236 = local5;
			if (arg0) {
				for (local76 = 1; local76 > 0; local76++) {
				}
			}
			arg1.anInt235 = local7;
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("54937, " + arg0 + ", " + arg1 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(JB)V")
	private void method705(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt937 >= 100 && this.anInt871 != 1) {
					this.method598("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
				} else if (this.anInt937 >= 200) {
					this.method598("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
				} else {
					@Pc(38) String local38 = Class36.method481(Class36.method478(arg0, 622));
					for (@Pc(40) int local40 = 0; local40 < this.anInt937; local40++) {
						if (this.aLongArray3[local40] == arg0) {
							this.method598("", local38 + " is already on your friend list", 0);
							return;
						}
					}
					for (@Pc(70) int local70 = 0; local70 < this.anInt919; local70++) {
						if (this.aLongArray4[local70] == arg0) {
							this.method598("", "Please remove " + local38 + " from your ignore list first", 0);
							return;
						}
					}
					if (!local38.equals(aClass3_Sub1_Sub1_Sub1_Sub1_1.aString4)) {
						this.aStringArray12[this.anInt937] = local38;
						this.aLongArray3[this.anInt937] = arg0;
						this.anIntArray231[this.anInt937] = 0;
						this.anInt937++;
						this.aBoolean243 = true;
						this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 177);
						this.aClass3_Sub1_Sub2_7.method85(arg0);
					}
				}
			}
		} catch (@Pc(156) RuntimeException local156) {
			signlink.reporterror("69826, " + arg0 + ", " + -66 + ", " + local156.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method582() {
		try {
			if (this.aBoolean232 || this.aBoolean220 || this.aBoolean218) {
				this.method663(this.aByte45);
			} else {
				anInt962++;
				if (this.aBoolean214) {
					this.method697();
				} else {
					this.method661(false);
				}
				this.anInt946 = 0;
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("68362, " + -115 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IIII)I")
	private int method706(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = 256 - arg2;
			return ((arg1 & 0xFF00FF) * local3 + (arg0 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg1 & 0xFF00) * local3 + (arg0 & 0xFF00) * arg2 & 0xFF0000) >> 8;
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("9256, " + -300 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IB)V")
	private void method707(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				if (this.anInt969 != 0) {
					this.anInt969 = 0;
					this.aBoolean229 = true;
				}
				@Pc(18) int local18 = this.anIntArray253[arg0];
				@Pc(23) int local23 = this.anIntArray254[arg0];
				@Pc(28) int local28 = this.anIntArray255[arg0];
				@Pc(33) int local33 = this.anIntArray256[arg0];
				if (local28 >= 2000) {
					local28 -= 2000;
				}
				if (local28 == 775) {
					this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 182);
					this.aClass3_Sub1_Sub2_7.method80(local18);
					this.aClass3_Sub1_Sub2_7.method80(this.anInt1055);
					this.aClass3_Sub1_Sub2_7.method114(955, local23);
					this.aClass3_Sub1_Sub2_7.method80(this.anInt1053);
					this.aClass3_Sub1_Sub2_7.method115(local33);
					this.aClass3_Sub1_Sub2_7.method115(this.anInt1054);
					this.anInt895 = 0;
					this.anInt896 = local23;
					this.anInt897 = local18;
					this.anInt898 = 2;
					if (Class9.method58(local23).anInt206 == this.anInt848) {
						this.anInt898 = 1;
					}
					if (Class9.method58(local23).anInt206 == this.anInt846) {
						this.anInt898 = 3;
					}
				}
				@Pc(130) boolean local130;
				if (local28 == 658) {
					local130 = this.method631(local23, 0, local18, 0, 0, 0, 2, false, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray54[0], 0, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray55[0]);
					if (!local130) {
						this.method631(local23, 0, local18, 1, 0, 0, 2, false, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray54[0], 1, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray55[0]);
					}
					this.anInt942 = super.anInt837;
					this.anInt943 = super.anInt838;
					this.anInt945 = 2;
					this.anInt944 = 0;
					this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 189);
					this.aClass3_Sub1_Sub2_7.method80(local23 + this.anInt867);
					this.aClass3_Sub1_Sub2_7.method113(local33);
					this.aClass3_Sub1_Sub2_7.method80(local18 + this.anInt866);
				}
				if (local28 == 595) {
					local130 = this.method631(local23, 0, local18, 0, 0, 0, 2, false, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray54[0], 0, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray55[0]);
					if (!local130) {
						this.method631(local23, 0, local18, 1, 0, 0, 2, false, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray54[0], 1, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray55[0]);
					}
					this.anInt942 = super.anInt837;
					this.anInt943 = super.anInt838;
					this.anInt945 = 2;
					this.anInt944 = 0;
					if ((this.anInt867 & 0x3) == 0) {
						anInt1036++;
					}
					if (anInt1036 >= 84) {
						this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 48);
						this.aClass3_Sub1_Sub2_7.method83(0);
						anInt1036 = 0;
					}
					this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 8);
					this.aClass3_Sub1_Sub2_7.method80(local18 + this.anInt866);
					this.aClass3_Sub1_Sub2_7.method114(955, local23 + this.anInt867);
					this.aClass3_Sub1_Sub2_7.method114(955, local33);
				}
				if (local28 == 39) {
					this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 84);
					this.aClass3_Sub1_Sub2_7.method80(local33);
					this.aClass3_Sub1_Sub2_7.method113(this.anInt987);
					this.aClass3_Sub1_Sub2_7.method80(local23);
					this.aClass3_Sub1_Sub2_7.method113(local18);
					this.anInt895 = 0;
					this.anInt896 = local23;
					this.anInt897 = local18;
					this.anInt898 = 2;
					if (Class9.method58(local23).anInt206 == this.anInt848) {
						this.anInt898 = 1;
					}
					if (Class9.method58(local23).anInt206 == this.anInt846) {
						this.anInt898 = 3;
					}
				}
				if (local28 == 687) {
					local130 = this.method631(local23, 0, local18, 0, 0, 0, 2, false, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray54[0], 0, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray55[0]);
					if (!local130) {
						this.method631(local23, 0, local18, 1, 0, 0, 2, false, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray54[0], 1, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray55[0]);
					}
					this.anInt942 = super.anInt837;
					this.anInt943 = super.anInt838;
					this.anInt945 = 2;
					this.anInt944 = 0;
					anInt1030 += this.anInt866;
					if (anInt1030 >= 132) {
						this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 205);
						this.aClass3_Sub1_Sub2_7.method83(0);
						anInt1030 = 0;
					}
					this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 57);
					this.aClass3_Sub1_Sub2_7.method113(local18 + this.anInt866);
					this.aClass3_Sub1_Sub2_7.method113(local33);
					this.aClass3_Sub1_Sub2_7.method115(local23 + this.anInt867);
				}
				@Pc(501) String local501;
				@Pc(475) Class50 local475;
				if (local28 == 1893) {
					local475 = Class50.method562(local33);
					@Pc(478) Class9 local478 = Class9.method58(local23);
					if (local478 != null && local478.anIntArray34[local18] >= 100000) {
						local501 = local478.anIntArray34[local18] + " x " + local475.aString16;
					} else if (local475.aByteArray20 == null) {
						local501 = "It's a " + local475.aString16 + ".";
					} else {
						local501 = new String(local475.aByteArray20);
					}
					this.method598("", local501, 0);
				}
				@Pc(539) Class3_Sub1_Sub1_Sub1_Sub1 local539;
				if (local28 == 261) {
					local539 = this.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local33];
					if (local539 != null) {
						this.method631(local539.anIntArray55[0], 0, local539.anIntArray54[0], 1, 0, 0, 2, false, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray54[0], 1, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray55[0]);
						this.anInt942 = super.anInt837;
						this.anInt943 = super.anInt838;
						this.anInt945 = 2;
						this.anInt944 = 0;
						this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 188);
						this.aClass3_Sub1_Sub2_7.method113(local33);
					}
				}
				if (local28 == 1408) {
					local475 = Class50.method562(local33);
					if (local475.aByteArray20 == null) {
						local501 = "It's a " + local475.aString16 + ".";
					} else {
						local501 = new String(local475.aByteArray20);
					}
					this.method598("", local501, 0);
				}
				@Pc(635) Class3_Sub1_Sub1_Sub1_Sub2 local635;
				if (local28 == 886) {
					local635 = this.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local33];
					if (local635 != null) {
						this.method631(local635.anIntArray55[0], 0, local635.anIntArray54[0], 1, 0, 0, 2, false, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray54[0], 1, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray55[0]);
						this.anInt942 = super.anInt837;
						this.anInt943 = super.anInt838;
						this.anInt945 = 2;
						this.anInt944 = 0;
						this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 212);
						this.aClass3_Sub1_Sub2_7.method115(local33);
					}
				}
				if (local28 == 723) {
					local635 = this.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local33];
					if (local635 != null) {
						this.method631(local635.anIntArray55[0], 0, local635.anIntArray54[0], 1, 0, 0, 2, false, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray54[0], 1, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray55[0]);
						this.anInt942 = super.anInt837;
						this.anInt943 = super.anInt838;
						this.anInt945 = 2;
						this.anInt944 = 0;
						this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 81);
						this.aClass3_Sub1_Sub2_7.method114(955, local33);
					}
				}
				if (local28 == 337) {
					this.method671(local23, local33, local18);
					this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 75);
					this.aClass3_Sub1_Sub2_7.method114(955, local18 + this.anInt866);
					this.aClass3_Sub1_Sub2_7.method80(local23 + this.anInt867);
					this.aClass3_Sub1_Sub2_7.method114(955, local33 >> 14 & 0x7FFF);
				}
				@Pc(822) String local822;
				if (local28 == 1892) {
					local635 = this.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local33];
					if (local635 != null) {
						@Pc(804) Class5 local804 = local635.aClass5_2;
						if (local804.anIntArray7 != null) {
							local804 = local804.method26();
						}
						if (local804 != null) {
							if (local804.aByteArray1 == null) {
								local822 = "It's a " + local804.aString1 + ".";
							} else {
								local822 = new String(local804.aByteArray1);
							}
							this.method598("", local822, 0);
						}
					}
				}
				if (local28 == 506) {
					if (this.aBoolean226) {
						this.aClass17_1.method260(local18 - 4, local23 - 4);
					} else {
						this.aClass17_1.method260(super.anInt837 - 4, super.anInt838 - 4);
					}
				}
				if (local28 == 838) {
					this.method721();
				}
				if (local28 == 708) {
					if ((local33 & 0x3) == 0) {
						anInt1062++;
					}
					if (anInt1062 >= 102) {
						this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 106);
						this.aClass3_Sub1_Sub2_7.method83(0);
						anInt1062 = 0;
					}
					this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 136);
					this.aClass3_Sub1_Sub2_7.method115(local33);
					this.aClass3_Sub1_Sub2_7.method114(955, local18);
					this.aClass3_Sub1_Sub2_7.method114(955, local23);
					this.anInt895 = 0;
					this.anInt896 = local23;
					this.anInt897 = local18;
					this.anInt898 = 2;
					if (Class9.method58(local23).anInt206 == this.anInt848) {
						this.anInt898 = 1;
					}
					if (Class9.method58(local23).anInt206 == this.anInt846) {
						this.anInt898 = 3;
					}
				}
				if (local28 == 473) {
					local539 = this.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local33];
					if (local539 != null) {
						this.method631(local539.anIntArray55[0], 0, local539.anIntArray54[0], 1, 0, 0, 2, false, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray54[0], 1, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray55[0]);
						this.anInt942 = super.anInt837;
						this.anInt943 = super.anInt838;
						this.anInt945 = 2;
						this.anInt944 = 0;
						this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 12);
						this.aClass3_Sub1_Sub2_7.method113(local33);
					}
				}
				if (local28 == 148) {
					this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 58);
					this.aClass3_Sub1_Sub2_7.method80(local23);
					this.aClass3_Sub1_Sub2_7.method115(local18);
					this.aClass3_Sub1_Sub2_7.method113(local33);
					this.anInt895 = 0;
					this.anInt896 = local23;
					this.anInt897 = local18;
					this.anInt898 = 2;
					if (Class9.method58(local23).anInt206 == this.anInt848) {
						this.anInt898 = 1;
					}
					if (Class9.method58(local23).anInt206 == this.anInt846) {
						this.anInt898 = 3;
					}
				}
				if (local28 == 1586) {
					this.method671(local23, local33, local18);
					this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 109);
					this.aClass3_Sub1_Sub2_7.method115(local33 >> 14 & 0x7FFF);
					this.aClass3_Sub1_Sub2_7.method113(local23 + this.anInt867);
					this.aClass3_Sub1_Sub2_7.method80(local18 + this.anInt866);
				}
				if (local28 == 484 && this.method671(local23, local33, local18)) {
					this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 245);
					this.aClass3_Sub1_Sub2_7.method113(local18 + this.anInt866);
					this.aClass3_Sub1_Sub2_7.method114(955, this.anInt1054);
					this.aClass3_Sub1_Sub2_7.method115(this.anInt1053);
					this.aClass3_Sub1_Sub2_7.method80(local33 >> 14 & 0x7FFF);
					this.aClass3_Sub1_Sub2_7.method113(this.anInt1055);
					this.aClass3_Sub1_Sub2_7.method115(local23 + this.anInt867);
				}
				if (local28 == 910) {
					this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 206);
					this.aClass3_Sub1_Sub2_7.method80(local18);
					this.aClass3_Sub1_Sub2_7.method115(local33);
					this.aClass3_Sub1_Sub2_7.method113(local23);
					this.anInt895 = 0;
					this.anInt896 = local23;
					this.anInt897 = local18;
					this.anInt898 = 2;
					if (Class9.method58(local23).anInt206 == this.anInt848) {
						this.anInt898 = 1;
					}
					if (Class9.method58(local23).anInt206 == this.anInt846) {
						this.anInt898 = 3;
					}
				}
				if (local28 == 893) {
					local635 = this.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local33];
					if (local635 != null) {
						this.method631(local635.anIntArray55[0], 0, local635.anIntArray54[0], 1, 0, 0, 2, false, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray54[0], 1, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray55[0]);
						this.anInt942 = super.anInt837;
						this.anInt943 = super.anInt838;
						this.anInt945 = 2;
						this.anInt944 = 0;
						this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 232);
						this.aClass3_Sub1_Sub2_7.method113(this.anInt987);
						this.aClass3_Sub1_Sub2_7.method115(local33);
					}
				}
				if (local28 == 230) {
					local130 = this.method631(local23, 0, local18, 0, 0, 0, 2, false, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray54[0], 0, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray55[0]);
					if (!local130) {
						this.method631(local23, 0, local18, 1, 0, 0, 2, false, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray54[0], 1, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray55[0]);
					}
					this.anInt942 = super.anInt837;
					this.anInt943 = super.anInt838;
					this.anInt945 = 2;
					this.anInt944 = 0;
					this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 46);
					this.aClass3_Sub1_Sub2_7.method115(local33);
					this.aClass3_Sub1_Sub2_7.method113(local18 + this.anInt866);
					this.aClass3_Sub1_Sub2_7.method115(local23 + this.anInt867);
				}
				if (local28 == 874) {
					this.anInt1052 = 1;
					this.anInt1053 = local18;
					this.anInt1054 = local23;
					this.anInt1055 = local33;
					this.aString30 = Class50.method562(local33).aString16;
					this.anInt986 = 0;
					this.aBoolean243 = true;
				} else {
					if (local28 == 778) {
						local539 = this.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local33];
						if (local539 != null) {
							this.method631(local539.anIntArray55[0], 0, local539.anIntArray54[0], 1, 0, 0, 2, false, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray54[0], 1, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray55[0]);
							this.anInt942 = super.anInt837;
							this.anInt943 = super.anInt838;
							this.anInt945 = 2;
							this.anInt944 = 0;
							this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 41);
							this.aClass3_Sub1_Sub2_7.method113(local33);
						}
					}
					if (local28 == 554) {
						local539 = this.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local33];
						if (local539 != null) {
							this.method631(local539.anIntArray55[0], 0, local539.anIntArray54[0], 1, 0, 0, 2, false, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray54[0], 1, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray55[0]);
							this.anInt942 = super.anInt837;
							this.anInt943 = super.anInt838;
							this.anInt945 = 2;
							this.anInt944 = 0;
							anInt912++;
							if (anInt912 >= 145) {
								this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 64);
								this.aClass3_Sub1_Sub2_7.method79(5);
								anInt912 = 0;
							}
							this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 68);
							this.aClass3_Sub1_Sub2_7.method80(local33);
						}
					}
					@Pc(1551) Class9 local1551;
					if (local28 == 896) {
						local1551 = Class9.method58(local23);
						this.anInt986 = 1;
						this.anInt987 = local23;
						this.anInt988 = local1551.anInt219;
						this.anInt1052 = 0;
						this.aBoolean243 = true;
						local501 = local1551.aString7;
						if (local501.indexOf(" ") != -1) {
							local501 = local501.substring(0, local501.indexOf(" "));
						}
						local822 = local1551.aString7;
						if (local822.indexOf(" ") != -1) {
							local822 = local822.substring(local822.indexOf(" ") + 1);
						}
						this.aString27 = local501 + " " + local1551.aString5 + " " + local822;
						if (this.anInt988 == 16) {
							this.aBoolean243 = true;
							this.anInt1058 = 3;
							this.aBoolean247 = true;
						}
					} else {
						@Pc(1654) int local1654;
						@Pc(1652) long local1652;
						@Pc(1641) int local1641;
						@Pc(1637) String local1637;
						if (local28 == 633) {
							local1637 = this.aStringArray13[arg0];
							local1641 = local1637.indexOf("@whi@");
							if (local1641 != -1) {
								local1652 = Class36.method477(local1637.substring(local1641 + 5).trim());
								local1654 = -1;
								for (@Pc(1656) int local1656 = 0; local1656 < this.anInt937; local1656++) {
									if (this.aLongArray3[local1656] == local1652) {
										local1654 = local1656;
										break;
									}
								}
								if (local1654 != -1 && this.anIntArray231[local1654] > 0) {
									this.aBoolean229 = true;
									this.anInt969 = 0;
									this.aBoolean244 = true;
									this.aString23 = "";
									this.anInt968 = 3;
									this.aLong31 = this.aLongArray3[local1654];
									this.aString29 = "Enter message to send to " + this.aStringArray12[local1654];
								}
							}
						}
						if (local28 == 994) {
							this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 87);
							this.aClass3_Sub1_Sub2_7.method114(955, local18);
							this.aClass3_Sub1_Sub2_7.method114(955, local33);
							this.aClass3_Sub1_Sub2_7.method115(local23);
							this.anInt895 = 0;
							this.anInt896 = local23;
							this.anInt897 = local18;
							this.anInt898 = 2;
							if (Class9.method58(local23).anInt206 == this.anInt848) {
								this.anInt898 = 1;
							}
							if (Class9.method58(local23).anInt206 == this.anInt846) {
								this.anInt898 = 3;
							}
						}
						if (local28 == 645) {
							local635 = this.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local33];
							if (local635 != null) {
								this.method631(local635.anIntArray55[0], 0, local635.anIntArray54[0], 1, 0, 0, 2, false, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray54[0], 1, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray55[0]);
								this.anInt942 = super.anInt837;
								this.anInt943 = super.anInt838;
								this.anInt945 = 2;
								this.anInt944 = 0;
								this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 18);
								this.aClass3_Sub1_Sub2_7.method80(local33);
							}
						}
						if (local28 == 1138) {
							@Pc(1839) int local1839 = local33 >> 14 & 0x7FFF;
							@Pc(1842) Class18 local1842 = Class18.method278(local1839);
							if (local1842.aByteArray11 == null) {
								local822 = "It's a " + local1842.aString11 + ".";
							} else {
								local822 = new String(local1842.aByteArray11);
							}
							this.method598("", local822, 0);
						}
						if (local28 == 840) {
							this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 247);
							this.aClass3_Sub1_Sub2_7.method113(local18);
							this.aClass3_Sub1_Sub2_7.method114(955, local23);
							this.aClass3_Sub1_Sub2_7.method80(local33);
							this.anInt895 = 0;
							this.anInt896 = local23;
							this.anInt897 = local18;
							this.anInt898 = 2;
							if (Class9.method58(local23).anInt206 == this.anInt848) {
								this.anInt898 = 1;
							}
							if (Class9.method58(local23).anInt206 == this.anInt846) {
								this.anInt898 = 3;
							}
						}
						if (local28 == 670) {
							local130 = this.method631(local23, 0, local18, 0, 0, 0, 2, false, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray54[0], 0, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray55[0]);
							if (!local130) {
								this.method631(local23, 0, local18, 1, 0, 0, 2, false, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray54[0], 1, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray55[0]);
							}
							this.anInt942 = super.anInt837;
							this.anInt943 = super.anInt838;
							this.anInt945 = 2;
							this.anInt944 = 0;
							this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 185);
							this.aClass3_Sub1_Sub2_7.method115(local33);
							this.aClass3_Sub1_Sub2_7.method114(955, local23 + this.anInt867);
							this.aClass3_Sub1_Sub2_7.method114(955, local18 + this.anInt866);
						}
						if (local28 == 667) {
							local635 = this.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local33];
							if (local635 != null) {
								this.method631(local635.anIntArray55[0], 0, local635.anIntArray54[0], 1, 0, 0, 2, false, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray54[0], 1, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray55[0]);
								this.anInt942 = super.anInt837;
								this.anInt943 = super.anInt838;
								this.anInt945 = 2;
								this.anInt944 = 0;
								this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 170);
								this.aClass3_Sub1_Sub2_7.method114(955, local33);
							}
						}
						if (local28 == 395) {
							local539 = this.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local33];
							if (local539 != null) {
								this.method631(local539.anIntArray55[0], 0, local539.anIntArray54[0], 1, 0, 0, 2, false, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray54[0], 1, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray55[0]);
								this.anInt942 = super.anInt837;
								this.anInt943 = super.anInt838;
								this.anInt945 = 2;
								this.anInt944 = 0;
								this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 149);
								this.aClass3_Sub1_Sub2_7.method114(955, local33);
								this.aClass3_Sub1_Sub2_7.method80(this.anInt1053);
								this.aClass3_Sub1_Sub2_7.method114(955, this.anInt1054);
								this.aClass3_Sub1_Sub2_7.method114(955, this.anInt1055);
							}
						}
						if (local28 == 134) {
							local539 = this.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local33];
							if (local539 != null) {
								this.method631(local539.anIntArray55[0], 0, local539.anIntArray54[0], 1, 0, 0, 2, false, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray54[0], 1, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray55[0]);
								this.anInt942 = super.anInt837;
								this.anInt943 = super.anInt838;
								this.anInt945 = 2;
								this.anInt944 = 0;
								this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 171);
								this.aClass3_Sub1_Sub2_7.method115(local33);
							}
						}
						if (local28 == 507) {
							this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 27);
							this.aClass3_Sub1_Sub2_7.method80(local23);
							local1551 = Class9.method58(local23);
							if (local1551.anIntArrayArray1 != null && local1551.anIntArrayArray1[0][0] == 5) {
								local1641 = local1551.anIntArrayArray1[0][1];
								if (this.anIntArray272[local1641] != local1551.anIntArray29[0]) {
									this.anIntArray272[local1641] = local1551.anIntArray29[0];
									this.method627(local1641);
									this.aBoolean243 = true;
								}
							}
						}
						if (local28 == 637) {
							this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 54);
							this.aClass3_Sub1_Sub2_7.method114(955, local33);
							this.aClass3_Sub1_Sub2_7.method113(local18);
							this.aClass3_Sub1_Sub2_7.method113(local23);
							this.anInt895 = 0;
							this.anInt896 = local23;
							this.anInt897 = local18;
							this.anInt898 = 2;
							if (Class9.method58(local23).anInt206 == this.anInt848) {
								this.anInt898 = 1;
							}
							if (Class9.method58(local23).anInt206 == this.anInt846) {
								this.anInt898 = 3;
							}
						}
						if (local28 == 951) {
							this.method659(this.anInt875, 15);
							this.anInt875 = -1;
							this.aBoolean229 = true;
						}
						if (local28 == 681) {
							local539 = this.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local33];
							if (local539 != null) {
								this.method631(local539.anIntArray55[0], 0, local539.anIntArray54[0], 1, 0, 0, 2, false, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray54[0], 1, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray55[0]);
								this.anInt942 = super.anInt837;
								this.anInt943 = super.anInt838;
								this.anInt945 = 2;
								this.anInt944 = 0;
								this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 45);
								this.aClass3_Sub1_Sub2_7.method80(this.anInt987);
								this.aClass3_Sub1_Sub2_7.method114(955, local33);
							}
						}
						if (local28 == 592) {
							this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 121);
							this.aClass3_Sub1_Sub2_7.method113(local18);
							this.aClass3_Sub1_Sub2_7.method113(local33);
							this.aClass3_Sub1_Sub2_7.method114(955, local23);
							this.anInt895 = 0;
							this.anInt896 = local23;
							this.anInt897 = local18;
							this.anInt898 = 2;
							if (Class9.method58(local23).anInt206 == this.anInt848) {
								this.anInt898 = 1;
							}
							if (Class9.method58(local23).anInt206 == this.anInt846) {
								this.anInt898 = 3;
							}
						}
						if (local28 == 807 && this.method671(local23, local33, local18)) {
							this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 155);
							this.aClass3_Sub1_Sub2_7.method114(955, local33 >> 14 & 0x7FFF);
							this.aClass3_Sub1_Sub2_7.method115(local23 + this.anInt867);
							this.aClass3_Sub1_Sub2_7.method115(local18 + this.anInt866);
							this.aClass3_Sub1_Sub2_7.method80(this.anInt987);
						}
						if (local28 == 532 || local28 == 938) {
							local1637 = this.aStringArray13[arg0];
							local1641 = local1637.indexOf("@whi@");
							if (local1641 != -1) {
								local1637 = local1637.substring(local1641 + 5).trim();
								local822 = Class36.method481(Class36.method478(Class36.method477(local1637), 622));
								@Pc(2541) boolean local2541 = false;
								for (local1654 = 0; local1654 < this.anInt1028; local1654++) {
									@Pc(2553) Class3_Sub1_Sub1_Sub1_Sub1 local2553 = this.aClass3_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray266[local1654]];
									if (local2553 != null && local2553.aString4 != null && local2553.aString4.equalsIgnoreCase(local822)) {
										this.method631(local2553.anIntArray55[0], 0, local2553.anIntArray54[0], 1, 0, 0, 2, false, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray54[0], 1, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray55[0]);
										if (local28 == 532) {
											anInt912++;
											if (anInt912 >= 145) {
												this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 64);
												this.aClass3_Sub1_Sub2_7.method79(5);
												anInt912 = 0;
											}
											this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 68);
											this.aClass3_Sub1_Sub2_7.method80(this.anIntArray266[local1654]);
										}
										if (local28 == 938) {
											this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 171);
											this.aClass3_Sub1_Sub2_7.method115(this.anIntArray266[local1654]);
										}
										local2541 = true;
										break;
									}
								}
								if (!local2541) {
									this.method598("", "Unable to find " + local822, 0);
								}
							}
						}
						if (local28 == 663) {
							local1551 = Class9.method58(local23);
							@Pc(2673) boolean local2673 = true;
							if (local1551.anInt220 > 0) {
								local2673 = this.method651(local1551);
							}
							if (local2673) {
								this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 27);
								this.aClass3_Sub1_Sub2_7.method80(local23);
							}
						}
						if (local28 == 17) {
							this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 161);
							this.aClass3_Sub1_Sub2_7.method114(955, local33);
							this.aClass3_Sub1_Sub2_7.method80(local18);
							this.aClass3_Sub1_Sub2_7.method115(local23);
							this.anInt895 = 0;
							this.anInt896 = local23;
							this.anInt897 = local18;
							this.anInt898 = 2;
							if (Class9.method58(local23).anInt206 == this.anInt848) {
								this.anInt898 = 1;
							}
							if (Class9.method58(local23).anInt206 == this.anInt846) {
								this.anInt898 = 3;
							}
						}
						if (local28 == 78) {
							local130 = this.method631(local23, 0, local18, 0, 0, 0, 2, false, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray54[0], 0, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray55[0]);
							if (!local130) {
								this.method631(local23, 0, local18, 1, 0, 0, 2, false, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray54[0], 1, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray55[0]);
							}
							this.anInt942 = super.anInt837;
							this.anInt943 = super.anInt838;
							this.anInt945 = 2;
							this.anInt944 = 0;
							this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 96);
							this.aClass3_Sub1_Sub2_7.method114(955, this.anInt987);
							this.aClass3_Sub1_Sub2_7.method113(local33);
							this.aClass3_Sub1_Sub2_7.method80(local23 + this.anInt867);
							this.aClass3_Sub1_Sub2_7.method115(local18 + this.anInt866);
						}
						if (local28 == 237) {
							local635 = this.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local33];
							if (local635 != null) {
								this.method631(local635.anIntArray55[0], 0, local635.anIntArray54[0], 1, 0, 0, 2, false, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray54[0], 1, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray55[0]);
								this.anInt942 = super.anInt837;
								this.anInt943 = super.anInt838;
								this.anInt945 = 2;
								this.anInt944 = 0;
								this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 62);
								this.aClass3_Sub1_Sub2_7.method113(local33);
								this.aClass3_Sub1_Sub2_7.method113(this.anInt1054);
								this.aClass3_Sub1_Sub2_7.method114(955, this.anInt1055);
								this.aClass3_Sub1_Sub2_7.method80(this.anInt1053);
							}
						}
						if (local28 == 496) {
							if ((local23 & 0x3) == 0) {
								anInt1012++;
							}
							if (anInt1012 >= 94) {
								this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 209);
								this.aClass3_Sub1_Sub2_7.method79(102);
								anInt1012 = 0;
							}
							this.method671(local23, local33, local18);
							this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 202);
							this.aClass3_Sub1_Sub2_7.method80(local18 + this.anInt866);
							this.aClass3_Sub1_Sub2_7.method115(local33 >> 14 & 0x7FFF);
							this.aClass3_Sub1_Sub2_7.method80(local23 + this.anInt867);
						}
						if (local28 == 338 && !this.aBoolean221) {
							this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 24);
							this.aClass3_Sub1_Sub2_7.method80(local23);
							this.aBoolean221 = true;
						}
						if (local28 == 423) {
							local635 = this.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local33];
							if (local635 != null) {
								this.method631(local635.anIntArray55[0], 0, local635.anIntArray54[0], 1, 0, 0, 2, false, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray54[0], 1, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray55[0]);
								this.anInt942 = super.anInt837;
								this.anInt943 = super.anInt838;
								this.anInt945 = 2;
								this.anInt944 = 0;
								this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 32);
								this.aClass3_Sub1_Sub2_7.method115(local33);
							}
						}
						if (local28 == 846) {
							this.method671(local23, local33, local18);
							this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 83);
							this.aClass3_Sub1_Sub2_7.method113(local23 + this.anInt867);
							this.aClass3_Sub1_Sub2_7.method115(local18 + this.anInt866);
							this.aClass3_Sub1_Sub2_7.method113(local33 >> 14 & 0x7FFF);
						}
						if (local28 == 68) {
							this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 74);
							this.aClass3_Sub1_Sub2_7.method113(local33);
							this.aClass3_Sub1_Sub2_7.method115(local23);
							this.aClass3_Sub1_Sub2_7.method114(955, local18);
							this.anInt895 = 0;
							this.anInt896 = local23;
							this.anInt897 = local18;
							this.anInt898 = 2;
							if (Class9.method58(local23).anInt206 == this.anInt848) {
								this.anInt898 = 1;
							}
							if (Class9.method58(local23).anInt206 == this.anInt846) {
								this.anInt898 = 3;
							}
						}
						if (local28 == 538) {
							anInt891 += local33;
							if (anInt891 >= 136) {
								this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 237);
								anInt891 = 0;
							}
							this.method671(local23, local33, local18);
							this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 93);
							this.aClass3_Sub1_Sub2_7.method115(local33 >> 14 & 0x7FFF);
							this.aClass3_Sub1_Sub2_7.method113(local23 + this.anInt867);
							this.aClass3_Sub1_Sub2_7.method114(955, local18 + this.anInt866);
						}
						if (local28 == 306) {
							this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 159);
							this.aClass3_Sub1_Sub2_7.method80(local23);
							this.aClass3_Sub1_Sub2_7.method113(local33);
							this.aClass3_Sub1_Sub2_7.method80(local18);
							this.anInt895 = 0;
							this.anInt896 = local23;
							this.anInt897 = local18;
							this.anInt898 = 2;
							if (Class9.method58(local23).anInt206 == this.anInt848) {
								this.anInt898 = 1;
							}
							if (Class9.method58(local23).anInt206 == this.anInt846) {
								this.anInt898 = 3;
							}
						}
						if (local28 == 241) {
							this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 27);
							this.aClass3_Sub1_Sub2_7.method80(local23);
							local1551 = Class9.method58(local23);
							if (local1551.anIntArrayArray1 != null && local1551.anIntArrayArray1[0][0] == 5) {
								local1641 = local1551.anIntArrayArray1[0][1];
								this.anIntArray272[local1641] = 1 - this.anIntArray272[local1641];
								this.method627(local1641);
								this.aBoolean243 = true;
							}
						}
						if (local28 == 279) {
							local1637 = this.aStringArray13[arg0];
							local1641 = local1637.indexOf("@whi@");
							if (local1641 != -1) {
								if (this.anInt848 == -1) {
									this.method721();
									this.aString19 = local1637.substring(local1641 + 5).trim();
									this.aBoolean207 = false;
									this.anInt852 = this.anInt848 = Class9.anInt214;
								} else {
									this.method598("", "Please close the interface you have open before using 'report abuse'", 0);
								}
							}
						}
						if (local28 == 691 || local28 == 275 || local28 == 739 || local28 == 266) {
							local1637 = this.aStringArray13[arg0];
							local1641 = local1637.indexOf("@whi@");
							if (local1641 != -1) {
								local1652 = Class36.method477(local1637.substring(local1641 + 5).trim());
								if (local28 == 691) {
									this.method705(local1652);
								}
								if (local28 == 275) {
									this.method619(local1652, this.aByte39);
								}
								if (local28 == 739) {
									this.method668(local1652);
								}
								if (local28 == 266) {
									this.method626(local1652);
								}
							}
						}
						if (local28 == 383) {
							local130 = this.method631(local23, 0, local18, 0, 0, 0, 2, false, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray54[0], 0, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray55[0]);
							if (!local130) {
								this.method631(local23, 0, local18, 1, 0, 0, 2, false, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray54[0], 1, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray55[0]);
							}
							this.anInt942 = super.anInt837;
							this.anInt943 = super.anInt838;
							this.anInt945 = 2;
							this.anInt944 = 0;
							this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 199);
							this.aClass3_Sub1_Sub2_7.method80(this.anInt1055);
							this.aClass3_Sub1_Sub2_7.method80(this.anInt1053);
							this.aClass3_Sub1_Sub2_7.method114(955, local18 + this.anInt866);
							this.aClass3_Sub1_Sub2_7.method115(this.anInt1054);
							this.aClass3_Sub1_Sub2_7.method115(local23 + this.anInt867);
							this.aClass3_Sub1_Sub2_7.method113(local33);
						}
						this.anInt1052 = 0;
						this.anInt986 = 0;
						this.aBoolean243 = true;
					}
				}
			}
		} catch (@Pc(3544) RuntimeException local3544) {
			signlink.reporterror("69463, " + arg0 + ", " + -121 + ", " + local3544.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IILclient!GHHPHSRU;)V")
	private void method708(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub1_Sub2 arg1) {
		try {
			@Pc(17) int local17;
			@Pc(26) int local26;
			@Pc(33) int local33;
			@Pc(36) int local36;
			@Pc(39) int local39;
			@Pc(45) int local45;
			@Pc(49) int local49;
			if (arg0 == 246) {
				local17 = arg1.method89();
				local26 = this.anInt979 + (local17 >> 4 & 0x7);
				local33 = this.anInt980 + (local17 & 0x7);
				local36 = arg1.method91();
				local39 = arg1.method89();
				local45 = local39 >> 4 & 0xF;
				local49 = local39 & 0x7;
				if (aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray54[0] >= local26 - local45 && aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray54[0] <= local26 + local45 && aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray55[0] >= local33 - local45 && aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray55[0] <= local33 + local45 && this.aBoolean217 && !aBoolean224 && this.anInt974 < 50) {
					this.anIntArray250[this.anInt974] = local36;
					this.anIntArray265[this.anInt974] = local49;
					this.anIntArray259[this.anInt974] = Class40.anIntArray187[local36];
					this.anInt974++;
				}
			}
			if (arg0 == 225) {
				local17 = arg1.method89();
				local26 = this.anInt979 + (local17 >> 4 & 0x7);
				local33 = this.anInt980 + (local17 & 0x7);
				local36 = arg1.method91();
				local39 = arg1.method91();
				local45 = arg1.method91();
				if (local26 >= 0 && local33 >= 0 && local26 < 104 && local33 < 104) {
					@Pc(167) Class38 local167 = this.aClass38ArrayArrayArray1[this.anInt862][local26][local33];
					if (local167 != null) {
						for (@Pc(173) Class3_Sub1_Sub1_Sub2 local173 = (Class3_Sub1_Sub1_Sub2) local167.method486(); local173 != null; local173 = (Class3_Sub1_Sub1_Sub2) local167.method488()) {
							if (local173.anInt299 == (local36 & 0x7FFF) && local173.anInt300 == local39) {
								local173.anInt300 = local45;
								break;
							}
						}
						this.method701(local26, local33);
					}
				}
			} else {
				@Pc(246) int local246;
				if (arg0 == 35) {
					local17 = arg1.method117();
					local26 = arg1.method110();
					local33 = this.anInt979 + (local26 >> 4 & 0x7);
					local36 = this.anInt980 + (local26 & 0x7);
					local39 = arg1.method108();
					local45 = local39 >> 2;
					local49 = local39 & 0x3;
					local246 = this.anIntArray262[local45];
					if (local33 >= 0 && local36 >= 0 && local33 < 104 && local36 < 104) {
						this.method636(-1, this.anInt862, local246, local33, 0, this.anInt849, local17, local36, local45, local49);
					}
				} else {
					@Pc(335) int local335;
					@Pc(347) int local347;
					@Pc(361) int local361;
					@Pc(373) int local373;
					@Pc(393) int local393;
					if (arg0 == 234) {
						local17 = arg1.method109();
						local26 = local17 >> 2;
						local33 = local17 & 0x3;
						local36 = this.anIntArray262[local26];
						local39 = arg1.method118();
						local45 = arg1.method109();
						local49 = this.anInt979 + (local45 >> 4 & 0x7);
						local246 = this.anInt980 + (local45 & 0x7);
						if (local49 >= 0 && local246 >= 0 && local49 < 103 && local246 < 103) {
							local335 = this.anIntArrayArrayArray7[this.anInt862][local49][local246];
							local347 = this.anIntArrayArrayArray7[this.anInt862][local49 + 1][local246];
							local361 = this.anIntArrayArrayArray7[this.anInt862][local49 + 1][local246 + 1];
							local373 = this.anIntArrayArrayArray7[this.anInt862][local49][local246 + 1];
							if (local36 == 0) {
								@Pc(384) Class26 local384 = this.aClass17_1.method244(this.anInt862, local49, local246);
								if (local384 != null) {
									local393 = local384.anInt609 >> 14 & 0x7FFF;
									if (local26 == 2) {
										local384.aClass3_Sub1_Sub1_6 = new Class3_Sub1_Sub1_Sub6(local361, local393, false, local347, local33 + 4, 0, local335, 2, local39, local373);
										local384.aClass3_Sub1_Sub1_7 = new Class3_Sub1_Sub1_Sub6(local361, local393, false, local347, local33 + 1 & 0x3, 0, local335, 2, local39, local373);
									} else {
										local384.aClass3_Sub1_Sub1_6 = new Class3_Sub1_Sub1_Sub6(local361, local393, false, local347, local33, 0, local335, local26, local39, local373);
									}
								}
							}
							if (local36 == 1) {
								@Pc(461) Class42 local461 = this.aClass17_1.method245(this.anInt862, local246, local49);
								if (local461 != null) {
									local461.aClass3_Sub1_Sub1_8 = new Class3_Sub1_Sub1_Sub6(local361, local461.anInt760 >> 14 & 0x7FFF, false, local347, 0, 0, local335, 4, local39, local373);
								}
							}
							if (local36 == 2) {
								@Pc(495) Class21 local495 = this.aClass17_1.method246(this.anInt862, local49, local246);
								if (local26 == 11) {
									local26 = 10;
								}
								if (local495 != null) {
									local495.aClass3_Sub1_Sub1_5 = new Class3_Sub1_Sub1_Sub6(local361, local495.anInt526 >> 14 & 0x7FFF, false, local347, local33, 0, local335, local26, local39, local373);
								}
							}
							if (local36 == 3) {
								@Pc(534) Class14 local534 = this.aClass17_1.method247(844, this.anInt862, local246, local49);
								if (local534 != null) {
									local534.aClass3_Sub1_Sub1_4 = new Class3_Sub1_Sub1_Sub6(local361, local534.anInt335 >> 14 & 0x7FFF, false, local347, local33, 0, local335, 22, local39, local373);
								}
							}
						}
					} else {
						@Pc(609) Class3_Sub1_Sub1_Sub2 local609;
						if (arg0 == 59) {
							local17 = arg1.method109();
							local26 = this.anInt979 + (local17 >> 4 & 0x7);
							local33 = this.anInt980 + (local17 & 0x7);
							local36 = arg1.method91();
							if (local26 >= 0 && local33 >= 0 && local26 < 104 && local33 < 104) {
								@Pc(603) Class38 local603 = this.aClass38ArrayArrayArray1[this.anInt862][local26][local33];
								if (local603 != null) {
									for (local609 = (Class3_Sub1_Sub1_Sub2) local603.method486(); local609 != null; local609 = (Class3_Sub1_Sub1_Sub2) local603.method488()) {
										if (local609.anInt299 == (local36 & 0x7FFF)) {
											local609.method503();
											break;
										}
									}
									if (local603.method486() == null) {
										this.aClass38ArrayArrayArray1[this.anInt862][local26][local33] = null;
									}
									this.method701(local26, local33);
								}
							}
						} else {
							@Pc(706) int local706;
							if (arg0 == 191) {
								local17 = arg1.method89();
								local26 = this.anInt979 + (local17 >> 4 & 0x7);
								local33 = this.anInt980 + (local17 & 0x7);
								local36 = local26 + arg1.method90();
								local39 = local33 + arg1.method90();
								local45 = arg1.method92();
								local49 = arg1.method91();
								local246 = arg1.method89() * 4;
								local335 = arg1.method89() * 4;
								local347 = arg1.method91();
								local361 = arg1.method91();
								local373 = arg1.method89();
								local706 = arg1.method89();
								if (local26 >= 0 && local33 >= 0 && local26 < 104 && local33 < 104 && local36 >= 0 && local39 >= 0 && local36 < 104 && local39 < 104 && local49 != 65535) {
									local26 = local26 * 128 + 64;
									local33 = local33 * 128 + 64;
									local36 = local36 * 128 + 64;
									local39 = local39 * 128 + 64;
									@Pc(782) Class3_Sub1_Sub1_Sub5 local782 = new Class3_Sub1_Sub1_Sub5(this.anInt862, local45, local361 + anInt1003, local49, local26, local335, (byte) 2, local347 + anInt1003, local706, this.method601(local33, this.anInt862, local26) - local246, local33, local373);
									local782.method424(this.method601(local39, this.anInt862, local36) - local335, local347 + anInt1003, local39, local36);
									this.aClass38_12.method483(local782);
								}
							} else if (arg0 == 18) {
								local17 = arg1.method89();
								local26 = this.anInt979 + (local17 >> 4 & 0x7);
								local33 = this.anInt980 + (local17 & 0x7);
								local36 = arg1.method91();
								local39 = arg1.method89();
								local45 = arg1.method91();
								if (local26 >= 0 && local33 >= 0 && local26 < 104 && local33 < 104) {
									local26 = local26 * 128 + 64;
									local33 = local33 * 128 + 64;
									@Pc(878) Class3_Sub1_Sub1_Sub4 local878 = new Class3_Sub1_Sub1_Sub4(this.anInt862, local45, local33, this.method601(local33, this.anInt862, local26) - local39, anInt1003, local36, local26, -14763);
									this.aClass38_11.method483(local878);
								}
							} else if (arg0 == 249) {
								local17 = arg1.method91();
								local26 = arg1.method117();
								local33 = arg1.method109();
								local36 = this.anInt979 + (local33 >> 4 & 0x7);
								local39 = this.anInt980 + (local33 & 0x7);
								local45 = arg1.method118();
								if (local36 >= 0 && local39 >= 0 && local36 < 104 && local39 < 104 && local45 != this.anInt1051) {
									@Pc(935) Class3_Sub1_Sub1_Sub2 local935 = new Class3_Sub1_Sub1_Sub2();
									local935.anInt299 = local17;
									local935.anInt300 = local26;
									if (this.aClass38ArrayArrayArray1[this.anInt862][local36][local39] == null) {
										this.aClass38ArrayArrayArray1[this.anInt862][local36][local39] = new Class38((byte) 55);
									}
									this.aClass38ArrayArrayArray1[this.anInt862][local36][local39].method483(local935);
									this.method701(local36, local39);
								}
							} else if (arg0 == 80) {
								local17 = arg1.method116();
								local26 = arg1.method110();
								local33 = this.anInt979 + (local26 >> 4 & 0x7);
								local36 = this.anInt980 + (local26 & 0x7);
								local39 = arg1.method118();
								if (local33 >= 0 && local36 >= 0 && local33 < 104 && local36 < 104) {
									local609 = new Class3_Sub1_Sub1_Sub2();
									local609.anInt299 = local17;
									local609.anInt300 = local39;
									if (this.aClass38ArrayArrayArray1[this.anInt862][local33][local36] == null) {
										this.aClass38ArrayArrayArray1[this.anInt862][local33][local36] = new Class38((byte) 55);
									}
									this.aClass38ArrayArrayArray1[this.anInt862][local33][local36].method483(local609);
									this.method701(local33, local36);
								}
							} else if (arg0 == 213) {
								local17 = arg1.method110();
								local26 = local17 >> 2;
								local33 = local17 & 0x3;
								local36 = this.anIntArray262[local26];
								local39 = arg1.method109();
								local45 = this.anInt979 + (local39 >> 4 & 0x7);
								local49 = this.anInt980 + (local39 & 0x7);
								if (local45 >= 0 && local49 >= 0 && local45 < 104 && local49 < 104) {
									this.method636(-1, this.anInt862, local36, local45, 0, this.anInt849, -1, local49, local26, local33);
								}
							} else if (arg0 == 195) {
								@Pc(1141) byte local1141 = arg1.method90();
								local26 = arg1.method116();
								local33 = arg1.method117();
								@Pc(1154) byte local1154 = arg1.method111(this.anInt1057);
								local39 = arg1.method118();
								@Pc(1162) byte local1162 = arg1.method112();
								@Pc(1167) byte local1167 = arg1.method111(this.anInt1057);
								local246 = arg1.method117();
								local335 = arg1.method109();
								local347 = local335 >> 2;
								local361 = local335 & 0x3;
								local373 = this.anIntArray262[local347];
								local706 = arg1.method108();
								local393 = this.anInt979 + (local706 >> 4 & 0x7);
								@Pc(1208) int local1208 = this.anInt980 + (local706 & 0x7);
								@Pc(1214) Class3_Sub1_Sub1_Sub1_Sub1 local1214;
								if (local33 == this.anInt1051) {
									local1214 = aClass3_Sub1_Sub1_Sub1_Sub1_1;
								} else {
									local1214 = this.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local33];
								}
								if (local1214 != null) {
									@Pc(1226) Class18 local1226 = Class18.method278(local26);
									@Pc(1236) int local1236 = this.anIntArrayArrayArray7[this.anInt862][local393][local1208];
									@Pc(1248) int local1248 = this.anIntArrayArrayArray7[this.anInt862][local393 + 1][local1208];
									@Pc(1262) int local1262 = this.anIntArrayArrayArray7[this.anInt862][local393 + 1][local1208 + 1];
									@Pc(1274) int local1274 = this.anIntArrayArrayArray7[this.anInt862][local393][local1208 + 1];
									@Pc(1284) Class3_Sub1_Sub1_Sub3 local1284 = local1226.method274(local347, local361, local1236, local1248, local1262, local1274, -1);
									if (local1284 != null) {
										this.method636(local39 + 1, this.anInt862, local373, local393, local246 + 1, this.anInt849, -1, local1208, 0, 0);
										local1214.anInt185 = local246 + anInt1003;
										local1214.anInt186 = local39 + anInt1003;
										local1214.aClass3_Sub1_Sub1_Sub3_1 = local1284;
										@Pc(1320) int local1320 = local1226.anInt488;
										@Pc(1323) int local1323 = local1226.anInt484;
										if (local361 == 1 || local361 == 3) {
											local1320 = local1226.anInt484;
											local1323 = local1226.anInt488;
										}
										local1214.anInt177 = local393 * 128 + local1320 * 64;
										local1214.anInt179 = local1208 * 128 + local1323 * 64;
										local1214.anInt178 = this.method601(local1214.anInt179, this.anInt862, local1214.anInt177);
										@Pc(1369) byte local1369;
										if (local1167 > local1141) {
											local1369 = local1167;
											local1167 = local1141;
											local1141 = local1369;
										}
										if (local1162 > local1154) {
											local1369 = local1162;
											local1162 = local1154;
											local1154 = local1369;
										}
										local1214.anInt180 = local393 + local1167;
										local1214.anInt182 = local393 + local1141;
										local1214.anInt181 = local1208 + local1162;
										local1214.anInt183 = local1208 + local1154;
										return;
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1404) RuntimeException local1404) {
			signlink.reporterror("7655, " + arg0 + ", " + 6 + ", " + arg1 + ", " + local1404.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method709() {
		try {
			if (this.anInt929 > 1) {
				this.anInt929--;
			}
			if (this.anInt935 > 0) {
				this.anInt935--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method717(); local22++) {
			}
			if (this.aBoolean214) {
				@Pc(41) Object local41 = this.aClass49_1.anObject1;
				@Pc(67) int local67;
				@Pc(69) int local69;
				@Pc(71) int local71;
				@Pc(104) int local104;
				synchronized (this.aClass49_1.anObject1) {
					if (!aBoolean248) {
						this.aClass49_1.anInt788 = 0;
					} else if (super.anInt836 != 0 || this.aClass49_1.anInt788 >= 40) {
						this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 210);
						this.aClass3_Sub1_Sub2_7.method79(0);
						local67 = this.aClass3_Sub1_Sub2_7.anInt257;
						local69 = 0;
						@Pc(87) int local87;
						for (local71 = 0; local71 < this.aClass49_1.anInt788 && local67 - this.aClass3_Sub1_Sub2_7.anInt257 < 240; local71++) {
							local69++;
							local87 = this.aClass49_1.anIntArray204[local71];
							if (local87 < 0) {
								local87 = 0;
							} else if (local87 > 502) {
								local87 = 502;
							}
							local104 = this.aClass49_1.anIntArray203[local71];
							if (local104 < 0) {
								local104 = 0;
							} else if (local104 > 764) {
								local104 = 764;
							}
							@Pc(121) int local121 = local87 * 765 + local104;
							if (this.aClass49_1.anIntArray204[local71] == -1 && this.aClass49_1.anIntArray203[local71] == -1) {
								local104 = -1;
								local87 = -1;
								local121 = 524287;
							}
							if (local104 != this.anInt908 || local87 != this.anInt909) {
								@Pc(166) int local166 = local104 - this.anInt908;
								this.anInt908 = local104;
								@Pc(174) int local174 = local87 - this.anInt909;
								this.anInt909 = local87;
								if (this.anInt876 < 8 && local166 >= -32 && local166 <= 31 && local174 >= -32 && local174 <= 31) {
									local166 += 32;
									local174 += 32;
									this.aClass3_Sub1_Sub2_7.method80((this.anInt876 << 12) + (local166 << 6) + local174);
									this.anInt876 = 0;
								} else if (this.anInt876 < 8) {
									this.aClass3_Sub1_Sub2_7.method82((this.anInt876 << 19) + local121 + 8388608);
									this.anInt876 = 0;
								} else {
									this.aClass3_Sub1_Sub2_7.method83((this.anInt876 << 19) + local121 - 1073741824);
									this.anInt876 = 0;
								}
							} else if (this.anInt876 < 2047) {
								this.anInt876++;
							}
						}
						this.aClass3_Sub1_Sub2_7.method88(this.aClass3_Sub1_Sub2_7.anInt257 - local67);
						if (local69 >= this.aClass49_1.anInt788) {
							this.aClass49_1.anInt788 = 0;
						} else {
							this.aClass49_1.anInt788 -= local69;
							for (local87 = 0; local87 < this.aClass49_1.anInt788; local87++) {
								this.aClass49_1.anIntArray203[local87] = this.aClass49_1.anIntArray203[local87 + local69];
								this.aClass49_1.anIntArray204[local87] = this.aClass49_1.anIntArray204[local87 + local69];
							}
						}
					}
				}
				if (super.anInt836 != 0) {
					@Pc(337) long local337 = (super.aLong28 - this.aLong33) / 50L;
					if (local337 > 4095L) {
						local337 = 4095L;
					}
					this.aLong33 = super.aLong28;
					local67 = super.anInt838;
					if (local67 < 0) {
						local67 = 0;
					} else if (local67 > 502) {
						local67 = 502;
					}
					local69 = super.anInt837;
					if (local69 < 0) {
						local69 = 0;
					} else if (local69 > 764) {
						local69 = 764;
					}
					local71 = local67 * 765 + local69;
					@Pc(383) byte local383 = 0;
					if (super.anInt836 == 2) {
						local383 = 1;
					}
					local104 = (int) local337;
					this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 14);
					this.aClass3_Sub1_Sub2_7.method122((local104 << 20) + (local383 << 19) + local71);
				}
				if (this.anInt994 > 0) {
					this.anInt994--;
				}
				if (super.anIntArray210[1] == 1 || super.anIntArray210[2] == 1 || super.anIntArray210[3] == 1 || super.anIntArray210[4] == 1) {
					this.aBoolean236 = true;
				}
				if (this.aBoolean236 && this.anInt994 <= 0) {
					this.anInt994 = 20;
					this.aBoolean236 = false;
					this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 55);
					this.aClass3_Sub1_Sub2_7.method115(this.anInt1042);
					this.aClass3_Sub1_Sub2_7.method115(this.anInt1043);
				}
				if (super.aBoolean197 && !this.aBoolean213) {
					this.aBoolean213 = true;
					this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 235);
					this.aClass3_Sub1_Sub2_7.method79(1);
				}
				if (!super.aBoolean197 && this.aBoolean213) {
					this.aBoolean213 = false;
					this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 235);
					this.aClass3_Sub1_Sub2_7.method79(0);
				}
				this.method588();
				this.method611((byte) 7);
				this.method722();
				this.anInt933++;
				if (this.anInt933 > 750) {
					this.method641();
				}
				this.method666();
				this.method690(this.aBoolean211);
				this.method599();
				this.anInt975++;
				if (this.anInt945 != 0) {
					this.anInt944 += 20;
					if (this.anInt944 >= 400) {
						this.anInt945 = 0;
					}
				}
				if (this.anInt898 != 0) {
					this.anInt895++;
					if (this.anInt895 >= 15) {
						if (this.anInt898 == 2) {
							this.aBoolean243 = true;
						}
						if (this.anInt898 == 3) {
							this.aBoolean229 = true;
						}
						this.anInt898 = 0;
					}
				}
				if (this.anInt915 != 0) {
					this.anInt1056++;
					if (super.anInt831 > this.anInt916 + 5 || super.anInt831 < this.anInt916 - 5 || super.anInt832 > this.anInt917 + 5 || super.anInt832 < this.anInt917 - 5) {
						this.aBoolean233 = true;
					}
					if (super.anInt830 == 0) {
						if (this.anInt915 == 2) {
							this.aBoolean243 = true;
						}
						if (this.anInt915 == 3) {
							this.aBoolean229 = true;
						}
						this.anInt915 = 0;
						if (this.aBoolean233 && this.anInt1056 >= 5) {
							this.anInt1068 = -1;
							this.method676();
							if (this.anInt1068 == this.anInt913 && this.anInt1067 != this.anInt914) {
								@Pc(690) Class9 local690 = Class9.method58(this.anInt913);
								@Pc(692) byte local692 = 0;
								if (this.anInt878 == 1 && local690.anInt220 == 206) {
									local692 = 1;
								}
								if (local690.anIntArray27[this.anInt1067] <= 0) {
									local692 = 0;
								}
								if (local690.aBoolean38) {
									local67 = this.anInt914;
									local69 = this.anInt1067;
									local690.anIntArray27[local69] = local690.anIntArray27[local67];
									local690.anIntArray34[local69] = local690.anIntArray34[local67];
									local690.anIntArray27[local67] = -1;
									local690.anIntArray34[local67] = 0;
								} else if (local692 == 1) {
									local67 = this.anInt914;
									local69 = this.anInt1067;
									while (local67 != local69) {
										if (local67 > local69) {
											local690.method66(local67 - 1, local67);
											local67--;
										} else if (local67 < local69) {
											local690.method66(local67 + 1, local67);
											local67++;
										}
									}
								} else {
									local690.method66(this.anInt1067, this.anInt914);
								}
								this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 139);
								this.aClass3_Sub1_Sub2_7.method114(955, this.anInt1067);
								this.aClass3_Sub1_Sub2_7.method80(this.anInt914);
								this.aClass3_Sub1_Sub2_7.method114(955, this.anInt913);
								this.aClass3_Sub1_Sub2_7.method107(local692);
							}
						} else if ((this.anInt939 == 1 || this.method633((byte) 2, this.anInt1017 - 1)) && this.anInt1017 > 2) {
							this.method687();
						} else if (this.anInt1017 > 0) {
							this.method707(this.anInt1017 - 1);
						}
						this.anInt895 = 10;
						super.anInt836 = 0;
					}
				}
				@Pc(866) int local866;
				@Pc(868) int local868;
				if (Class17.anInt454 != -1) {
					local866 = Class17.anInt454;
					local868 = Class17.anInt455;
					@Pc(889) boolean local889 = this.method631(local868, 0, local866, 0, 0, 0, 0, true, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray54[0], 0, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray55[0]);
					Class17.anInt454 = -1;
					if (local889) {
						this.anInt942 = super.anInt837;
						this.anInt943 = super.anInt838;
						this.anInt945 = 1;
						this.anInt944 = 0;
					}
				}
				if (super.anInt836 == 1 && this.aString17 != null) {
					this.aString17 = null;
					this.aBoolean229 = true;
					super.anInt836 = 0;
				}
				this.method593();
				if (this.anInt947 == -1) {
					this.method602();
					this.method716(this.aByte44);
					this.method635();
				}
				if (super.anInt830 == 1 || super.anInt836 == 1) {
					this.anInt946++;
				}
				if (this.anInt874 == 0 && this.anInt885 == 0 && this.anInt922 == 0) {
					if (this.anInt990 > 0) {
						this.anInt990--;
					}
				} else if (this.anInt990 < 100) {
					this.anInt990++;
					if (this.anInt990 == 100) {
						if (this.anInt874 != 0) {
							this.aBoolean229 = true;
						}
						if (this.anInt885 != 0) {
							this.aBoolean243 = true;
						}
					}
				}
				if (this.anInt877 == 2) {
					this.method702();
				}
				if (this.anInt877 == 2 && this.aBoolean237) {
					this.method596();
				}
				for (local866 = 0; local866 < 5; local866++) {
					@Pc(1026) int local1026 = this.anIntArray249[local866]++;
				}
				this.method677();
				anInt989++;
				if (anInt989 > 101) {
					anInt989 = 0;
					this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 39);
					this.aClass3_Sub1_Sub2_7.method83(0);
				}
				super.anInt829++;
				if (super.anInt829 > 4500) {
					this.anInt935 = 250;
					super.anInt829 -= 500;
					this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 50);
				}
				this.anInt865++;
				if (this.anInt865 > 500) {
					this.anInt865 = 0;
					local868 = (int) (Math.random() * 8.0D);
					if ((local868 & 0x1) == 1) {
						this.anInt1060 += this.anInt1061;
					}
					if ((local868 & 0x2) == 2) {
						this.anInt949 += this.anInt950;
					}
					if ((local868 & 0x4) == 4) {
						this.anInt1014 += this.anInt1015;
					}
				}
				if (this.anInt1060 < -50) {
					this.anInt1061 = 2;
				}
				if (this.anInt1060 > 50) {
					this.anInt1061 = -2;
				}
				if (this.anInt949 < -55) {
					this.anInt950 = 2;
				}
				if (this.anInt949 > 55) {
					this.anInt950 = -2;
				}
				if (this.anInt1014 < -40) {
					this.anInt1015 = 1;
				}
				if (this.anInt1014 > 40) {
					this.anInt1015 = -1;
				}
				this.anInt957++;
				if (this.anInt957 > 500) {
					this.anInt957 = 0;
					local868 = (int) (Math.random() * 8.0D);
					if ((local868 & 0x1) == 1) {
						this.anInt887 += this.anInt888;
					}
					if ((local868 & 0x2) == 2) {
						this.anInt906 += this.anInt907;
					}
				}
				if (this.anInt887 < -60) {
					this.anInt888 = 2;
				}
				if (this.anInt887 > 60) {
					this.anInt888 = -2;
				}
				if (this.anInt906 < -20) {
					this.anInt907 = 1;
				}
				if (this.anInt906 > 10) {
					this.anInt907 = -1;
				}
				this.anInt934++;
				if (this.anInt934 > 50) {
					this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 135);
				}
				try {
					if (this.aClass48_1 != null && this.aClass3_Sub1_Sub2_7.anInt257 > 0) {
						this.aClass48_1.method559(this.aClass3_Sub1_Sub2_7.aByteArray3, this.aClass3_Sub1_Sub2_7.anInt257);
						this.aClass3_Sub1_Sub2_7.anInt257 = 0;
						this.anInt934 = 0;
					}
				} catch (@Pc(1296) IOException local1296) {
					this.method641();
				} catch (@Pc(1301) Exception local1301) {
					this.method643();
				}
			}
		} catch (@Pc(1306) RuntimeException local1306) {
			signlink.reporterror("92731, " + -35326 + ", " + local1306.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!GHHPHSRU;II)V")
	private void method710(@OriginalArg(0) Class3_Sub1_Sub2 arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt1029; local1++) {
				@Pc(8) int local8 = this.anIntArray267[local1];
				@Pc(13) Class3_Sub1_Sub1_Sub1_Sub1 local13 = this.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local8];
				@Pc(16) int local16 = arg0.method89();
				if ((local16 & 0x10) != 0) {
					local16 += arg0.method89() << 8;
				}
				this.method700(local16, local8, arg0, local13);
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("91324, " + arg0 + ", " + arg1 + ", " + 515 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(B)Z")
	private boolean method711() {
		try {
			return signlink.wavereplay();
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("44076, " + 4 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(B)V")
	private void method712() {
		try {
			if (this.anInt902 == 2) {
				this.method699((this.anInt857 - this.anInt866 << 7) + this.anInt860, (this.anInt858 - this.anInt867 << 7) + this.anInt861, this.anInt859 * 2);
				if (this.anInt971 > -1 && anInt1003 % 20 < 10) {
					this.aClass3_Sub1_Sub3_Sub2Array5[0].method303(this.anInt972 - 28, this.anInt971 - 12);
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("46801, " + 72 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILclient!GHHPHSRU;)V")
	private void method715(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub1_Sub2 arg1) {
		try {
			this.aBoolean214 &= true;
			while (arg1.anInt258 + 10 < arg0 * 8) {
				@Pc(19) int local19 = arg1.method100(11, this.anInt1048);
				if (local19 == 2047) {
					break;
				}
				if (this.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local19] == null) {
					this.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local19] = new Class3_Sub1_Sub1_Sub1_Sub1();
					if (this.aClass3_Sub1_Sub2Array1[local19] != null) {
						this.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local19].method57(285, this.aClass3_Sub1_Sub2Array1[local19]);
					}
				}
				this.anIntArray266[this.anInt1028++] = local19;
				@Pc(65) Class3_Sub1_Sub1_Sub1_Sub1 local65 = this.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local19];
				local65.anInt391 = anInt1003;
				@Pc(74) int local74 = arg1.method100(5, this.anInt1048);
				if (local74 > 15) {
					local74 -= 32;
				}
				@Pc(84) int local84 = arg1.method100(1, this.anInt1048);
				@Pc(90) int local90 = arg1.method100(5, this.anInt1048);
				if (local90 > 15) {
					local90 -= 32;
				}
				@Pc(100) int local100 = arg1.method100(1, this.anInt1048);
				if (local100 == 1) {
					this.anIntArray267[this.anInt1029++] = local19;
				}
				local65.method211(aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray54[0] + local74, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray55[0] + local90, local84 == 1);
			}
			arg1.method101();
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("14922, " + true + ", " + arg0 + ", " + arg1 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(B)V")
	private void method716(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 == 94 && super.anInt836 == 1) {
				if (super.anInt837 >= 539 && super.anInt837 <= 573 && super.anInt838 >= 169 && super.anInt838 < 205 && this.anIntArray274[0] != -1) {
					this.aBoolean243 = true;
					this.anInt1058 = 0;
					this.aBoolean247 = true;
				}
				if (super.anInt837 >= 569 && super.anInt837 <= 599 && super.anInt838 >= 168 && super.anInt838 < 205 && this.anIntArray274[1] != -1) {
					this.aBoolean243 = true;
					this.anInt1058 = 1;
					this.aBoolean247 = true;
				}
				if (super.anInt837 >= 597 && super.anInt837 <= 627 && super.anInt838 >= 168 && super.anInt838 < 205 && this.anIntArray274[2] != -1) {
					this.aBoolean243 = true;
					this.anInt1058 = 2;
					this.aBoolean247 = true;
				}
				if (super.anInt837 >= 625 && super.anInt837 <= 669 && super.anInt838 >= 168 && super.anInt838 < 203 && this.anIntArray274[3] != -1) {
					this.aBoolean243 = true;
					this.anInt1058 = 3;
					this.aBoolean247 = true;
				}
				if (super.anInt837 >= 666 && super.anInt837 <= 696 && super.anInt838 >= 168 && super.anInt838 < 205 && this.anIntArray274[4] != -1) {
					this.aBoolean243 = true;
					this.anInt1058 = 4;
					this.aBoolean247 = true;
				}
				if (super.anInt837 >= 694 && super.anInt837 <= 724 && super.anInt838 >= 168 && super.anInt838 < 205 && this.anIntArray274[5] != -1) {
					this.aBoolean243 = true;
					this.anInt1058 = 5;
					this.aBoolean247 = true;
				}
				if (super.anInt837 >= 722 && super.anInt837 <= 756 && super.anInt838 >= 169 && super.anInt838 < 205 && this.anIntArray274[6] != -1) {
					this.aBoolean243 = true;
					this.anInt1058 = 6;
					this.aBoolean247 = true;
				}
				if (super.anInt837 >= 540 && super.anInt837 <= 574 && super.anInt838 >= 466 && super.anInt838 < 502 && this.anIntArray274[7] != -1) {
					this.aBoolean243 = true;
					this.anInt1058 = 7;
					this.aBoolean247 = true;
				}
				if (super.anInt837 >= 572 && super.anInt837 <= 602 && super.anInt838 >= 466 && super.anInt838 < 503 && this.anIntArray274[8] != -1) {
					this.aBoolean243 = true;
					this.anInt1058 = 8;
					this.aBoolean247 = true;
				}
				if (super.anInt837 >= 599 && super.anInt837 <= 629 && super.anInt838 >= 466 && super.anInt838 < 503 && this.anIntArray274[9] != -1) {
					this.aBoolean243 = true;
					this.anInt1058 = 9;
					this.aBoolean247 = true;
				}
				if (super.anInt837 >= 627 && super.anInt837 <= 671 && super.anInt838 >= 467 && super.anInt838 < 502 && this.anIntArray274[10] != -1) {
					this.aBoolean243 = true;
					this.anInt1058 = 10;
					this.aBoolean247 = true;
				}
				if (super.anInt837 >= 669 && super.anInt837 <= 699 && super.anInt838 >= 466 && super.anInt838 < 503 && this.anIntArray274[11] != -1) {
					this.aBoolean243 = true;
					this.anInt1058 = 11;
					this.aBoolean247 = true;
				}
				if (super.anInt837 >= 696 && super.anInt837 <= 726 && super.anInt838 >= 466 && super.anInt838 < 503 && this.anIntArray274[12] != -1) {
					this.aBoolean243 = true;
					this.anInt1058 = 12;
					this.aBoolean247 = true;
				}
				if (super.anInt837 >= 724 && super.anInt837 <= 758 && super.anInt838 >= 466 && super.anInt838 < 502 && this.anIntArray274[13] != -1) {
					this.aBoolean243 = true;
					this.anInt1058 = 13;
					this.aBoolean247 = true;
					return;
				}
			}
		} catch (@Pc(443) RuntimeException local443) {
			signlink.reporterror("23266, " + arg0 + ", " + local443.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(B)Z")
	private boolean method717() {
		try {
			if (this.aClass48_1 == null) {
				return false;
			}
			@Pc(2005) String local2005;
			@Pc(180) int local180;
			try {
				@Pc(15) int local15 = this.aClass48_1.method557();
				if (local15 == 0) {
					return false;
				}
				if (this.anInt932 == -1) {
					this.aClass48_1.method558(this.aClass3_Sub1_Sub2_6.aByteArray3, 0, 1);
					this.anInt932 = this.aClass3_Sub1_Sub2_6.aByteArray3[0] & 0xFF;
					if (this.aClass41_2 != null) {
						this.anInt932 = this.anInt932 - this.aClass41_2.method500() & 0xFF;
					}
					this.anInt931 = Class45.anIntArray192[this.anInt932];
					local15--;
				}
				if (this.anInt931 == -1) {
					if (local15 <= 0) {
						return false;
					}
					this.aClass48_1.method558(this.aClass3_Sub1_Sub2_6.aByteArray3, 0, 1);
					this.anInt931 = this.aClass3_Sub1_Sub2_6.aByteArray3[0] & 0xFF;
					local15--;
				}
				if (this.anInt931 == -2) {
					if (local15 <= 1) {
						return false;
					}
					this.aClass48_1.method558(this.aClass3_Sub1_Sub2_6.aByteArray3, 0, 2);
					this.aClass3_Sub1_Sub2_6.anInt257 = 0;
					this.anInt931 = this.aClass3_Sub1_Sub2_6.method91();
					local15 -= 2;
				}
				if (local15 < this.anInt931) {
					return false;
				}
				this.aClass3_Sub1_Sub2_6.anInt257 = 0;
				this.aClass48_1.method558(this.aClass3_Sub1_Sub2_6.aByteArray3, 0, this.anInt931);
				this.anInt933 = 0;
				this.anInt984 = this.anInt983;
				this.anInt983 = this.anInt982;
				this.anInt982 = this.anInt932;
				if (this.anInt932 == 102) {
					this.method616(this.anInt931, this.aClass3_Sub1_Sub2_6);
					this.anInt932 = -1;
					return true;
				}
				@Pc(175) int local175;
				if (this.anInt932 == 148) {
					local175 = this.aClass3_Sub1_Sub2_6.method91();
					local180 = this.aClass3_Sub1_Sub2_6.method118();
					Class9.method58(local180).anInt200 = 2;
					Class9.method58(local180).anInt201 = local175;
					this.anInt932 = -1;
					return true;
				}
				@Pc(211) int local211;
				if (this.anInt932 == 193) {
					local175 = this.aClass3_Sub1_Sub2_6.method116();
					local180 = this.aClass3_Sub1_Sub2_6.method91();
					local211 = this.aClass3_Sub1_Sub2_6.method117();
					Class9.method58(local211).anInt194 = (local175 << 16) + local180;
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 220) {
					local175 = this.aClass3_Sub1_Sub2_6.method91();
					local180 = this.aClass3_Sub1_Sub2_6.method89();
					local211 = this.aClass3_Sub1_Sub2_6.method91();
					if (this.aBoolean217 && !aBoolean224 && this.anInt974 < 50) {
						this.anIntArray250[this.anInt974] = local175;
						this.anIntArray265[this.anInt974] = local180;
						this.anIntArray259[this.anInt974] = local211 + Class40.anIntArray187[local175];
						this.anInt974++;
					}
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 109) {
					this.method643();
					this.anInt932 = -1;
					return false;
				}
				if (this.anInt932 == 212) {
					this.anInt902 = this.aClass3_Sub1_Sub2_6.method89();
					if (this.anInt902 == 1) {
						this.anInt1019 = this.aClass3_Sub1_Sub2_6.method91();
					}
					if (this.anInt902 >= 2 && this.anInt902 <= 6) {
						if (this.anInt902 == 2) {
							this.anInt860 = 64;
							this.anInt861 = 64;
						}
						if (this.anInt902 == 3) {
							this.anInt860 = 0;
							this.anInt861 = 64;
						}
						if (this.anInt902 == 4) {
							this.anInt860 = 128;
							this.anInt861 = 64;
						}
						if (this.anInt902 == 5) {
							this.anInt860 = 64;
							this.anInt861 = 0;
						}
						if (this.anInt902 == 6) {
							this.anInt860 = 64;
							this.anInt861 = 128;
						}
						this.anInt902 = 2;
						this.anInt857 = this.aClass3_Sub1_Sub2_6.method91();
						this.anInt858 = this.aClass3_Sub1_Sub2_6.method91();
						this.anInt859 = this.aClass3_Sub1_Sub2_6.method89();
					}
					if (this.anInt902 == 10) {
						this.anInt1059 = this.aClass3_Sub1_Sub2_6.method91();
					}
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 130) {
					this.aBoolean244 = false;
					this.anInt969 = 2;
					this.aString28 = "";
					this.aBoolean229 = true;
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 124) {
					if (this.anInt1058 == 12) {
						this.aBoolean243 = true;
					}
					this.anInt999 = this.aClass3_Sub1_Sub2_6.method92();
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 3) {
					local175 = this.aClass3_Sub1_Sub2_6.method117();
					if (local175 == 65535) {
						local175 = -1;
					}
					if (local175 != this.anInt855 && this.aBoolean216 && !aBoolean224 && this.anInt995 == 0) {
						this.anInt998 = local175;
						this.aBoolean239 = true;
						this.aClass6_Sub1_1.method548(2, this.anInt998);
					}
					this.anInt855 = local175;
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 62) {
					local175 = this.aClass3_Sub1_Sub2_6.method121();
					local180 = this.aClass3_Sub1_Sub2_6.method118();
					if (this.aBoolean216 && !aBoolean224) {
						this.anInt998 = local180;
						this.aBoolean239 = false;
						this.aClass6_Sub1_1.method548(2, this.anInt998);
						this.anInt995 = local175;
					}
					this.anInt932 = -1;
					return true;
				}
				@Pc(546) Class9 local546;
				if (this.anInt932 == 70) {
					local175 = this.aClass3_Sub1_Sub2_6.method118();
					local180 = this.aClass3_Sub1_Sub2_6.method120();
					local546 = Class9.method58(local175);
					if (local546.anInt195 != local180 || local180 == -1) {
						local546.anInt195 = local180;
						local546.anInt230 = 0;
						local546.anInt216 = 0;
					}
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 37) {
					this.anInt980 = this.aClass3_Sub1_Sub2_6.method108();
					this.anInt979 = this.aClass3_Sub1_Sub2_6.method109();
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 163) {
					this.anInt938 = this.aClass3_Sub1_Sub2_6.method89();
					this.aBoolean243 = true;
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 117) {
					this.anInt1022 = this.aClass3_Sub1_Sub2_6.method89();
					this.anInt976 = this.aClass3_Sub1_Sub2_6.method89();
					this.anInt900 = this.aClass3_Sub1_Sub2_6.method89();
					this.aBoolean225 = true;
					this.aBoolean229 = true;
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 228) {
					local175 = this.aClass3_Sub1_Sub2_6.method118();
					local180 = this.aClass3_Sub1_Sub2_6.method117();
					if (this.anInt846 != -1) {
						this.method659(this.anInt846, 15);
						this.anInt846 = -1;
						this.aBoolean229 = true;
					}
					if (this.anInt947 != -1) {
						this.method659(this.anInt947, 15);
						this.anInt947 = -1;
						this.aBoolean227 = true;
					}
					if (this.anInt879 != -1) {
						this.method659(this.anInt879, 15);
						this.anInt879 = -1;
					}
					if (this.anInt848 != local175) {
						this.method659(this.anInt848, 15);
						this.anInt848 = local175;
					}
					if (this.anInt901 != local180) {
						this.method659(this.anInt901, 15);
						this.anInt901 = local180;
					}
					if (this.anInt969 != 0) {
						this.anInt969 = 0;
						this.aBoolean229 = true;
					}
					this.aBoolean243 = true;
					this.aBoolean247 = true;
					this.aBoolean221 = false;
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 211) {
					local175 = this.aClass3_Sub1_Sub2_6.method91();
					this.method667(local175, this.anInt1046);
					if (this.anInt846 != -1) {
						this.method659(this.anInt846, 15);
						this.anInt846 = -1;
						this.aBoolean229 = true;
					}
					if (this.anInt947 != -1) {
						this.method659(this.anInt947, 15);
						this.anInt947 = -1;
						this.aBoolean227 = true;
					}
					if (this.anInt879 != -1) {
						this.method659(this.anInt879, 15);
						this.anInt879 = -1;
					}
					if (this.anInt848 != -1) {
						this.method659(this.anInt848, 15);
						this.anInt848 = -1;
					}
					if (this.anInt901 != local175) {
						this.method659(this.anInt901, 15);
						this.anInt901 = local175;
					}
					if (this.anInt969 != 0) {
						this.anInt969 = 0;
						this.aBoolean229 = true;
					}
					this.aBoolean243 = true;
					this.aBoolean247 = true;
					this.aBoolean221 = false;
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 36) {
					this.aBoolean237 = true;
					this.anInt1031 = this.aClass3_Sub1_Sub2_6.method89();
					this.anInt1032 = this.aClass3_Sub1_Sub2_6.method89();
					this.anInt1033 = this.aClass3_Sub1_Sub2_6.method91();
					this.anInt1034 = this.aClass3_Sub1_Sub2_6.method89();
					this.anInt1035 = this.aClass3_Sub1_Sub2_6.method89();
					if (this.anInt1035 >= 100) {
						this.anInt963 = this.anInt1031 * 128 + 64;
						this.anInt965 = this.anInt1032 * 128 + 64;
						this.anInt964 = this.method601(this.anInt965, this.anInt862, this.anInt963) - this.anInt1033;
					}
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 178) {
					this.anInt1051 = this.aClass3_Sub1_Sub2_6.method91();
					this.anInt871 = this.aClass3_Sub1_Sub2_6.method89();
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 251) {
					if (this.anInt901 != -1) {
						this.method659(this.anInt901, 15);
						this.anInt901 = -1;
						this.aBoolean243 = true;
						this.aBoolean247 = true;
					}
					if (this.anInt846 != -1) {
						this.method659(this.anInt846, 15);
						this.anInt846 = -1;
						this.aBoolean229 = true;
					}
					if (this.anInt947 != -1) {
						this.method659(this.anInt947, 15);
						this.anInt947 = -1;
						this.aBoolean227 = true;
					}
					if (this.anInt879 != -1) {
						this.method659(this.anInt879, 15);
						this.anInt879 = -1;
					}
					if (this.anInt848 != -1) {
						this.method659(this.anInt848, 15);
						this.anInt848 = -1;
					}
					if (this.anInt969 != 0) {
						this.anInt969 = 0;
						this.aBoolean229 = true;
					}
					this.aBoolean221 = false;
					this.anInt932 = -1;
					return true;
				}
				@Pc(1068) int local1068;
				@Pc(1072) int local1072;
				@Pc(1081) int local1081;
				@Pc(1366) int local1366;
				@Pc(1387) int local1387;
				if (this.anInt932 == 122 || this.anInt932 == 159) {
					local175 = this.anInt892;
					local180 = this.anInt893;
					if (this.anInt932 == 122) {
						local180 = this.aClass3_Sub1_Sub2_6.method116();
						local175 = this.aClass3_Sub1_Sub2_6.method117();
						this.aBoolean210 = false;
					}
					if (this.anInt932 == 159) {
						this.aClass3_Sub1_Sub2_6.method99();
						local211 = 0;
						while (true) {
							if (local211 >= 4) {
								this.aClass3_Sub1_Sub2_6.method101();
								local175 = this.aClass3_Sub1_Sub2_6.method117();
								local180 = this.aClass3_Sub1_Sub2_6.method117();
								this.aBoolean210 = true;
								break;
							}
							for (local1068 = 0; local1068 < 13; local1068++) {
								for (local1072 = 0; local1072 < 13; local1072++) {
									local1081 = this.aClass3_Sub1_Sub2_6.method100(1, this.anInt1048);
									if (local1081 == 1) {
										this.anIntArrayArrayArray8[local211][local1068][local1072] = this.aClass3_Sub1_Sub2_6.method100(26, this.anInt1048);
									} else {
										this.anIntArrayArrayArray8[local211][local1068][local1072] = -1;
									}
								}
							}
							local211++;
						}
					}
					if (this.anInt892 == local175 && this.anInt893 == local180 && this.anInt877 == 2) {
						this.anInt932 = -1;
						return true;
					}
					this.anInt892 = local175;
					this.anInt893 = local180;
					this.anInt866 = (this.anInt892 - 6) * 8;
					this.anInt867 = (this.anInt893 - 6) * 8;
					this.aBoolean251 = false;
					if ((this.anInt892 / 8 == 48 || this.anInt892 / 8 == 49) && this.anInt893 / 8 == 48) {
						this.aBoolean251 = true;
					}
					if (this.anInt892 / 8 == 48 && this.anInt893 / 8 == 148) {
						this.aBoolean251 = true;
					}
					this.anInt877 = 1;
					this.aLong30 = System.currentTimeMillis();
					this.method644("Loading - please wait.", null);
					if (this.anInt932 == 122) {
						local211 = 0;
						local1068 = (this.anInt892 - 6) / 8;
						label1200: while (true) {
							if (local1068 > (this.anInt892 + 6) / 8) {
								this.aByteArrayArray6 = new byte[local211][];
								this.aByteArrayArray5 = new byte[local211][];
								this.anIntArray242 = new int[local211];
								this.anIntArray243 = new int[local211];
								this.anIntArray244 = new int[local211];
								local211 = 0;
								local1072 = (this.anInt892 - 6) / 8;
								while (true) {
									if (local1072 > (this.anInt892 + 6) / 8) {
										break label1200;
									}
									for (local1081 = (this.anInt893 - 6) / 8; local1081 <= (this.anInt893 + 6) / 8; local1081++) {
										this.anIntArray242[local211] = (local1072 << 8) + local1081;
										if (this.aBoolean251 && (local1081 == 49 || local1081 == 149 || local1081 == 147 || local1072 == 50 || local1072 == 49 && local1081 == 47)) {
											this.anIntArray243[local211] = -1;
											this.anIntArray244[local211] = -1;
											local211++;
										} else {
											local1366 = this.anIntArray243[local211] = this.aClass6_Sub1_1.method533(local1081, anInt1065, local1072, 0);
											if (local1366 != -1) {
												this.aClass6_Sub1_1.method548(3, local1366);
											}
											local1387 = this.anIntArray244[local211] = this.aClass6_Sub1_1.method533(local1081, anInt1065, local1072, 1);
											if (local1387 != -1) {
												this.aClass6_Sub1_1.method548(3, local1387);
											}
											local211++;
										}
									}
									local1072++;
								}
							}
							for (local1072 = (this.anInt893 - 6) / 8; local1072 <= (this.anInt893 + 6) / 8; local1072++) {
								local211++;
							}
							local1068++;
						}
					}
					if (this.anInt932 == 159) {
						local211 = 0;
						@Pc(1423) int[] local1423 = new int[676];
						local1072 = 0;
						label1159: while (true) {
							@Pc(1469) int local1469;
							@Pc(1453) int local1453;
							@Pc(1459) int local1459;
							if (local1072 >= 4) {
								this.aByteArrayArray6 = new byte[local211][];
								this.aByteArrayArray5 = new byte[local211][];
								this.anIntArray242 = new int[local211];
								this.anIntArray243 = new int[local211];
								this.anIntArray244 = new int[local211];
								local1081 = 0;
								while (true) {
									if (local1081 >= local211) {
										break label1159;
									}
									local1366 = this.anIntArray242[local1081] = local1423[local1081];
									local1387 = local1366 >> 8 & 0xFF;
									local1453 = local1366 & 0xFF;
									local1459 = this.anIntArray243[local1081] = this.aClass6_Sub1_1.method533(local1453, anInt1065, local1387, 0);
									if (local1459 != -1) {
										this.aClass6_Sub1_1.method548(3, local1459);
									}
									local1469 = this.anIntArray244[local1081] = this.aClass6_Sub1_1.method533(local1453, anInt1065, local1387, 1);
									if (local1469 != -1) {
										this.aClass6_Sub1_1.method548(3, local1469);
									}
									local1081++;
								}
							}
							for (local1081 = 0; local1081 < 13; local1081++) {
								for (local1366 = 0; local1366 < 13; local1366++) {
									local1387 = this.anIntArrayArrayArray8[local1072][local1081][local1366];
									if (local1387 != -1) {
										local1453 = local1387 >> 14 & 0x3FF;
										local1459 = local1387 >> 3 & 0x7FF;
										local1469 = (local1453 / 8 << 8) + local1459 / 8;
										for (@Pc(1471) int local1471 = 0; local1471 < local211; local1471++) {
											if (local1423[local1471] == local1469) {
												local1469 = -1;
												break;
											}
										}
										if (local1469 != -1) {
											local1423[local211++] = local1469;
										}
									}
								}
							}
							local1072++;
						}
					}
					local211 = this.anInt866 - this.anInt868;
					local1068 = this.anInt867 - this.anInt869;
					this.anInt868 = this.anInt866;
					this.anInt869 = this.anInt867;
					for (local1072 = 0; local1072 < 16384; local1072++) {
						@Pc(1624) Class3_Sub1_Sub1_Sub1_Sub2 local1624 = this.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local1072];
						if (local1624 != null) {
							for (local1366 = 0; local1366 < 10; local1366++) {
								local1624.anIntArray54[local1366] -= local211;
								local1624.anIntArray55[local1366] -= local1068;
							}
							local1624.anInt380 -= local211 * 128;
							local1624.anInt381 -= local1068 * 128;
						}
					}
					for (local1081 = 0; local1081 < this.anInt1026; local1081++) {
						@Pc(1679) Class3_Sub1_Sub1_Sub1_Sub1 local1679 = this.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local1081];
						if (local1679 != null) {
							for (local1387 = 0; local1387 < 10; local1387++) {
								local1679.anIntArray54[local1387] -= local211;
								local1679.anIntArray55[local1387] -= local1068;
							}
							local1679.anInt380 -= local211 * 128;
							local1679.anInt381 -= local1068 * 128;
						}
					}
					this.aBoolean212 = true;
					@Pc(1731) byte local1731 = 0;
					@Pc(1733) byte local1733 = 104;
					@Pc(1735) byte local1735 = 1;
					if (local211 < 0) {
						local1731 = 103;
						local1733 = -1;
						local1735 = -1;
					}
					@Pc(1745) byte local1745 = 0;
					@Pc(1747) byte local1747 = 104;
					@Pc(1749) byte local1749 = 1;
					if (local1068 < 0) {
						local1745 = 103;
						local1747 = -1;
						local1749 = -1;
					}
					for (@Pc(1759) int local1759 = local1731; local1759 != local1733; local1759 += local1735) {
						for (@Pc(1763) int local1763 = local1745; local1763 != local1747; local1763 += local1749) {
							@Pc(1769) int local1769 = local1759 + local211;
							@Pc(1773) int local1773 = local1763 + local1068;
							for (@Pc(1775) int local1775 = 0; local1775 < 4; local1775++) {
								if (local1769 >= 0 && local1773 >= 0 && local1769 < 104 && local1773 < 104) {
									this.aClass38ArrayArrayArray1[local1775][local1759][local1763] = this.aClass38ArrayArrayArray1[local1775][local1769][local1773];
								} else {
									this.aClass38ArrayArrayArray1[local1775][local1759][local1763] = null;
								}
							}
						}
					}
					for (@Pc(1837) Class3_Sub2 local1837 = (Class3_Sub2) this.aClass38_10.method486(); local1837 != null; local1837 = (Class3_Sub2) this.aClass38_10.method488()) {
						local1837.anInt244 -= local211;
						local1837.anInt245 -= local1068;
						if (local1837.anInt244 < 0 || local1837.anInt245 < 0 || local1837.anInt244 >= 104 || local1837.anInt245 >= 104) {
							local1837.method503();
						}
					}
					if (this.anInt1040 != 0) {
						this.anInt1040 -= local211;
						this.anInt1041 -= local1068;
					}
					this.aBoolean237 = false;
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 97) {
					for (local175 = 0; local175 < this.anIntArray272.length; local175++) {
						if (this.anIntArray272[local175] != this.anIntArray270[local175]) {
							this.anIntArray272[local175] = this.anIntArray270[local175];
							this.method627(local175);
							this.aBoolean243 = true;
						}
					}
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 146) {
					this.aBoolean244 = false;
					this.anInt969 = 1;
					this.aString28 = "";
					this.aBoolean229 = true;
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 57) {
					this.anInt1011 = this.aClass3_Sub1_Sub2_6.method109();
					if (this.anInt1011 == this.anInt1058) {
						if (this.anInt1011 == 3) {
							this.anInt1058 = 1;
						} else {
							this.anInt1058 = 3;
						}
						this.aBoolean243 = true;
					}
					this.anInt932 = -1;
					return true;
				}
				@Pc(2016) String local2016;
				@Pc(2021) boolean local2021;
				@Pc(2156) String local2156;
				if (this.anInt932 == 21) {
					local2005 = this.aClass3_Sub1_Sub2_6.method96();
					@Pc(2019) long local2019;
					if (local2005.endsWith(":tradereq:")) {
						local2016 = local2005.substring(0, local2005.indexOf(":"));
						local2019 = Class36.method477(local2016);
						local2021 = false;
						for (local1081 = 0; local1081 < this.anInt919; local1081++) {
							if (this.aLongArray4[local1081] == local2019) {
								local2021 = true;
								break;
							}
						}
						if (!local2021 && this.anInt977 == 0) {
							this.method598(local2016, "wishes to trade with you.", 4);
						}
					} else if (local2005.endsWith(":duelreq:")) {
						local2016 = local2005.substring(0, local2005.indexOf(":"));
						local2019 = Class36.method477(local2016);
						local2021 = false;
						for (local1081 = 0; local1081 < this.anInt919; local1081++) {
							if (this.aLongArray4[local1081] == local2019) {
								local2021 = true;
								break;
							}
						}
						if (!local2021 && this.anInt977 == 0) {
							this.method598(local2016, "wishes to duel with you.", 8);
						}
					} else if (local2005.endsWith(":chalreq:")) {
						local2016 = local2005.substring(0, local2005.indexOf(":"));
						local2019 = Class36.method477(local2016);
						local2021 = false;
						for (local1081 = 0; local1081 < this.anInt919; local1081++) {
							if (this.aLongArray4[local1081] == local2019) {
								local2021 = true;
								break;
							}
						}
						if (!local2021 && this.anInt977 == 0) {
							local2156 = local2005.substring(local2005.indexOf(":") + 1, local2005.length() - 9);
							this.method598(local2016, local2156, 8);
						}
					} else {
						this.method598("", local2005, 0);
					}
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 42) {
					this.anInt929 = this.aClass3_Sub1_Sub2_6.method118() * 30;
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 69) {
					local175 = this.aClass3_Sub1_Sub2_6.method116();
					local180 = this.aClass3_Sub1_Sub2_6.method94();
					this.anIntArray270[local175] = local180;
					if (this.anIntArray272[local175] != local180) {
						this.anIntArray272[local175] = local180;
						this.method627(local175);
						this.aBoolean243 = true;
						if (this.anInt875 != -1) {
							this.aBoolean229 = true;
						}
					}
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 86) {
					for (local175 = 0; local175 < this.aClass3_Sub1_Sub1_Sub1_Sub1Array1.length; local175++) {
						if (this.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local175] != null) {
							this.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local175].anInt375 = -1;
						}
					}
					for (local180 = 0; local180 < this.aClass3_Sub1_Sub1_Sub1_Sub2Array1.length; local180++) {
						if (this.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local180] != null) {
							this.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local180].anInt375 = -1;
						}
					}
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 33) {
					local175 = this.aClass3_Sub1_Sub2_6.method91();
					local180 = this.aClass3_Sub1_Sub2_6.method118();
					local211 = local175 >> 10 & 0x1F;
					local1068 = local175 >> 5 & 0x1F;
					local1072 = local175 & 0x1F;
					Class9.method58(local180).anInt217 = (local211 << 19) + (local1068 << 11) + (local1072 << 3);
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 41) {
					local175 = this.aClass3_Sub1_Sub2_6.method117();
					local180 = this.aClass3_Sub1_Sub2_6.method118();
					this.method667(local175, this.anInt1046);
					if (local180 != -1) {
						this.method667(local180, this.anInt1046);
					}
					if (this.anInt848 != -1) {
						this.method659(this.anInt848, 15);
						this.anInt848 = -1;
					}
					if (this.anInt901 != -1) {
						this.method659(this.anInt901, 15);
						this.anInt901 = -1;
					}
					if (this.anInt846 != -1) {
						this.method659(this.anInt846, 15);
						this.anInt846 = -1;
					}
					if (this.anInt947 != local175) {
						this.method659(this.anInt947, 15);
						this.anInt947 = local175;
					}
					if (this.anInt879 != local175) {
						this.method659(this.anInt879, 15);
						this.anInt879 = local180;
					}
					this.anInt969 = 0;
					this.aBoolean221 = false;
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 171) {
					local175 = this.aClass3_Sub1_Sub2_6.method119();
					if (local175 >= 0) {
						this.method667(local175, this.anInt1046);
					}
					if (local175 != this.anInt843) {
						this.method659(this.anInt843, 15);
						this.anInt843 = local175;
					}
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 73) {
					local175 = this.aClass3_Sub1_Sub2_6.method118();
					local180 = this.aClass3_Sub1_Sub2_6.method117();
					local211 = this.aClass3_Sub1_Sub2_6.method118();
					local1068 = this.aClass3_Sub1_Sub2_6.method117();
					Class9.method58(local211).anInt212 = local1068;
					Class9.method58(local211).anInt213 = local175;
					Class9.method58(local211).anInt211 = local180;
					this.anInt932 = -1;
					return true;
				}
				@Pc(2521) long local2521;
				if (this.anInt932 == 89) {
					local2521 = this.aClass3_Sub1_Sub2_6.method95(this.aByte40);
					local211 = this.aClass3_Sub1_Sub2_6.method94();
					local1068 = this.aClass3_Sub1_Sub2_6.method89();
					local2021 = false;
					for (local1081 = 0; local1081 < 100; local1081++) {
						if (this.anIntArray230[local1081] == local211) {
							local2021 = true;
							break;
						}
					}
					if (local1068 <= 1) {
						for (local1366 = 0; local1366 < this.anInt919; local1366++) {
							if (this.aLongArray4[local1366] == local2521) {
								local2021 = true;
								break;
							}
						}
					}
					if (!local2021 && this.anInt977 == 0) {
						try {
							this.anIntArray230[this.anInt845] = local211;
							this.anInt845 = (this.anInt845 + 1) % 100;
							local2156 = Class27.method407(this.aClass3_Sub1_Sub2_6, this.anInt931 - 13);
							if (local1068 != 3) {
								local2156 = Class12.method138(810, local2156);
							}
							if (local1068 == 2 || local1068 == 3) {
								this.method598("@cr2@" + Class36.method481(Class36.method478(local2521, 622)), local2156, 7);
							} else if (local1068 == 1) {
								this.method598("@cr1@" + Class36.method481(Class36.method478(local2521, 622)), local2156, 7);
							} else {
								this.method598(Class36.method481(Class36.method478(local2521, 622)), local2156, 3);
							}
						} catch (@Pc(2664) Exception local2664) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 138) {
					local175 = this.aClass3_Sub1_Sub2_6.method117();
					Class9.method58(local175).anInt200 = 3;
					if (aClass3_Sub1_Sub1_Sub1_Sub1_1.aClass5_1 == null) {
						Class9.method58(local175).anInt201 = (aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray26[0] << 25) + (aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray26[4] << 20) + (aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray25[0] << 15) + (aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray25[8] << 10) + (aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray25[11] << 5) + aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray25[1];
					} else {
						Class9.method58(local175).anInt201 = (int) (aClass3_Sub1_Sub1_Sub1_Sub1_1.aClass5_1.aLong4 + 305419896L);
					}
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 240) {
					local175 = this.aClass3_Sub1_Sub2_6.method116();
					local180 = this.aClass3_Sub1_Sub2_6.method117();
					local546 = Class9.method58(local180);
					if (local546 != null && local546.anInt218 == 0) {
						if (local175 < 0) {
							local175 = 0;
						}
						if (local175 > local546.anInt193 - local546.anInt210) {
							local175 = local546.anInt193 - local546.anInt210;
						}
						local546.anInt205 = local175;
					}
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 176) {
					local175 = this.aClass3_Sub1_Sub2_6.method117();
					local180 = this.aClass3_Sub1_Sub2_6.method117();
					Class9.method58(local175).anInt200 = 1;
					Class9.method58(local175).anInt201 = local180;
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 67) {
					local175 = this.aClass3_Sub1_Sub2_6.method89();
					local180 = this.aClass3_Sub1_Sub2_6.method89();
					local211 = this.aClass3_Sub1_Sub2_6.method89();
					local1068 = this.aClass3_Sub1_Sub2_6.method89();
					this.aBooleanArray12[local175] = true;
					this.anIntArray234[local175] = local180;
					this.anIntArray217[local175] = local211;
					this.anIntArray236[local175] = local1068;
					this.anIntArray249[local175] = 0;
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 137) {
					if (this.anInt1058 == 12) {
						this.aBoolean243 = true;
					}
					this.anInt958 = this.aClass3_Sub1_Sub2_6.method89();
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 129) {
					this.method652(this.anInt931, this.aClass3_Sub1_Sub2_6);
					this.aBoolean212 = false;
					this.anInt932 = -1;
					return true;
				}
				@Pc(2924) Class9 local2924;
				if (this.anInt932 == 16) {
					this.aBoolean243 = true;
					local175 = this.aClass3_Sub1_Sub2_6.method91();
					local2924 = Class9.method58(local175);
					local211 = this.aClass3_Sub1_Sub2_6.method91();
					for (local1068 = 0; local1068 < local211; local1068++) {
						local2924.anIntArray27[local1068] = this.aClass3_Sub1_Sub2_6.method118();
						local1072 = this.aClass3_Sub1_Sub2_6.method108();
						if (local1072 == 255) {
							local1072 = this.aClass3_Sub1_Sub2_6.method124();
						}
						local2924.anIntArray34[local1068] = local1072;
					}
					for (local1072 = local211; local1072 < local2924.anIntArray27.length; local1072++) {
						local2924.anIntArray27[local1072] = 0;
						local2924.anIntArray34[local1072] = 0;
					}
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 210) {
					this.anInt926 = this.aClass3_Sub1_Sub2_6.method89();
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 166) {
					this.anInt979 = this.aClass3_Sub1_Sub2_6.method110();
					this.anInt980 = this.aClass3_Sub1_Sub2_6.method108();
					while (this.aClass3_Sub1_Sub2_6.anInt257 < this.anInt931) {
						local175 = this.aClass3_Sub1_Sub2_6.method89();
						this.method708(local175, this.aClass3_Sub1_Sub2_6);
					}
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 105) {
					local175 = this.aClass3_Sub1_Sub2_6.method116();
					local2924 = Class9.method58(local175);
					for (local211 = 0; local211 < local2924.anIntArray27.length; local211++) {
						local2924.anIntArray27[local211] = -1;
						local2924.anIntArray27[local211] = 0;
					}
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 72) {
					local175 = this.aClass3_Sub1_Sub2_6.method92();
					if (local175 != this.anInt875) {
						this.method659(this.anInt875, 15);
						this.anInt875 = local175;
					}
					this.aBoolean229 = true;
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 46) {
					local175 = this.aClass3_Sub1_Sub2_6.method108();
					local180 = this.aClass3_Sub1_Sub2_6.method116();
					if (local180 == 65535) {
						local180 = -1;
					}
					if (this.anIntArray274[local175] != local180) {
						this.method659(this.anIntArray274[local175], 15);
						this.anIntArray274[local175] = local180;
					}
					this.aBoolean243 = true;
					this.aBoolean247 = true;
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 239) {
					local175 = this.aClass3_Sub1_Sub2_6.method117();
					local2016 = this.aClass3_Sub1_Sub2_6.method96();
					Class9.method58(local175).aString9 = local2016;
					@Pc(3178) int local3178 = this.anIntArray274[this.anInt1058];
					if (Class9.method58(local175).anInt206 == local3178) {
						this.aBoolean243 = true;
					}
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 29) {
					local175 = this.aClass3_Sub1_Sub2_6.method118();
					@Pc(3206) boolean local3206 = this.aClass3_Sub1_Sub2_6.method110() == 1;
					Class9.method58(local175).aBoolean36 = local3206;
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 186) {
					local175 = this.aClass3_Sub1_Sub2_6.method119();
					local180 = this.aClass3_Sub1_Sub2_6.method118();
					local211 = this.aClass3_Sub1_Sub2_6.method119();
					@Pc(3237) Class9 local3237 = Class9.method58(local180);
					local3237.anInt198 = local211;
					local3237.anInt199 = local175;
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 99) {
					local175 = this.aClass3_Sub1_Sub2_6.method117();
					this.method667(local175, this.anInt1046);
					if (this.anInt901 != -1) {
						this.method659(this.anInt901, 15);
						this.anInt901 = -1;
						this.aBoolean243 = true;
						this.aBoolean247 = true;
					}
					if (this.anInt947 != -1) {
						this.method659(this.anInt947, 15);
						this.anInt947 = -1;
						this.aBoolean227 = true;
					}
					if (this.anInt879 != -1) {
						this.method659(this.anInt879, 15);
						this.anInt879 = -1;
					}
					if (this.anInt848 != -1) {
						this.method659(this.anInt848, 15);
						this.anInt848 = -1;
					}
					if (this.anInt846 != local175) {
						this.method659(this.anInt846, 15);
						this.anInt846 = local175;
					}
					this.aBoolean221 = false;
					this.aBoolean229 = true;
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 156) {
					this.anInt1040 = 0;
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 246 || this.anInt932 == 225 || this.anInt932 == 195 || this.anInt932 == 249 || this.anInt932 == 18 || this.anInt932 == 191 || this.anInt932 == 59 || this.anInt932 == 80 || this.anInt932 == 234 || this.anInt932 == 213 || this.anInt932 == 35) {
					this.method708(this.anInt932, this.aClass3_Sub1_Sub2_6);
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 207) {
					local2005 = this.aClass3_Sub1_Sub2_6.method96();
					local180 = this.aClass3_Sub1_Sub2_6.method89();
					local211 = this.aClass3_Sub1_Sub2_6.method89();
					if (local180 >= 1 && local180 <= 5) {
						if (local2005.equalsIgnoreCase("null")) {
							local2005 = null;
						}
						this.aStringArray9[local180 - 1] = local2005;
						this.aBooleanArray11[local180 - 1] = local211 == 0;
					}
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 76) {
					this.aBoolean237 = false;
					for (local175 = 0; local175 < 5; local175++) {
						this.aBooleanArray12[local175] = false;
					}
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 222) {
					this.anInt919 = this.anInt931 / 8;
					for (local175 = 0; local175 < this.anInt919; local175++) {
						this.aLongArray4[local175] = this.aClass3_Sub1_Sub2_6.method95(this.aByte40);
					}
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 61) {
					this.anInt1024 = this.aClass3_Sub1_Sub2_6.method89();
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 217) {
					local175 = this.aClass3_Sub1_Sub2_6.method117();
					local180 = this.aClass3_Sub1_Sub2_6.method91();
					local211 = this.aClass3_Sub1_Sub2_6.method118();
					if (local180 == 65535) {
						Class9.method58(local175).anInt200 = 0;
						this.anInt932 = -1;
						return true;
					}
					@Pc(3566) Class50 local3566 = Class50.method562(local180);
					Class9.method58(local175).anInt200 = 4;
					Class9.method58(local175).anInt201 = local180;
					Class9.method58(local175).anInt212 = local3566.anInt804;
					Class9.method58(local175).anInt213 = local3566.anInt797;
					Class9.method58(local175).anInt211 = local3566.anInt802 * 100 / local211;
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 199) {
					local2521 = this.aClass3_Sub1_Sub2_6.method95(this.aByte40);
					local211 = this.aClass3_Sub1_Sub2_6.method89();
					@Pc(3618) String local3618 = Class36.method481(Class36.method478(local2521, 622));
					for (local1072 = 0; local1072 < this.anInt937; local1072++) {
						if (local2521 == this.aLongArray3[local1072]) {
							if (this.anIntArray231[local1072] != local211) {
								this.anIntArray231[local1072] = local211;
								this.aBoolean243 = true;
								if (local211 > 0) {
									this.method598("", local3618 + " has logged in.", 5);
								}
								if (local211 == 0) {
									this.method598("", local3618 + " has logged out.", 5);
								}
							}
							local3618 = null;
							break;
						}
					}
					if (local3618 != null && this.anInt937 < 200) {
						this.aLongArray3[this.anInt937] = local2521;
						this.aStringArray12[this.anInt937] = local3618;
						this.anIntArray231[this.anInt937] = local211;
						this.anInt937++;
						this.aBoolean243 = true;
					}
					@Pc(3716) boolean local3716 = false;
					while (!local3716) {
						local3716 = true;
						for (local1366 = 0; local1366 < this.anInt937 - 1; local1366++) {
							if (this.anIntArray231[local1366] != anInt940 && this.anIntArray231[local1366 + 1] == anInt940 || this.anIntArray231[local1366] == 0 && this.anIntArray231[local1366 + 1] != 0) {
								local1387 = this.anIntArray231[local1366];
								this.anIntArray231[local1366] = this.anIntArray231[local1366 + 1];
								this.anIntArray231[local1366 + 1] = local1387;
								@Pc(3777) String local3777 = this.aStringArray12[local1366];
								this.aStringArray12[local1366] = this.aStringArray12[local1366 + 1];
								this.aStringArray12[local1366 + 1] = local3777;
								@Pc(3799) long local3799 = this.aLongArray3[local1366];
								this.aLongArray3[local1366] = this.aLongArray3[local1366 + 1];
								this.aLongArray3[local1366 + 1] = local3799;
								this.aBoolean243 = true;
								local3716 = false;
							}
						}
					}
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 27) {
					this.aBoolean243 = true;
					local175 = this.aClass3_Sub1_Sub2_6.method91();
					local2924 = Class9.method58(local175);
					while (this.aClass3_Sub1_Sub2_6.anInt257 < this.anInt931) {
						local211 = this.aClass3_Sub1_Sub2_6.method103();
						local1068 = this.aClass3_Sub1_Sub2_6.method91();
						local1072 = this.aClass3_Sub1_Sub2_6.method89();
						if (local1072 == 255) {
							local1072 = this.aClass3_Sub1_Sub2_6.method94();
						}
						if (local211 >= 0 && local211 < local2924.anIntArray27.length) {
							local2924.anIntArray27[local211] = local1068;
							local2924.anIntArray34[local211] = local1072;
						}
					}
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 90) {
					this.anInt979 = this.aClass3_Sub1_Sub2_6.method110();
					this.anInt980 = this.aClass3_Sub1_Sub2_6.method89();
					for (local175 = this.anInt979; local175 < this.anInt979 + 8; local175++) {
						for (local180 = this.anInt980; local180 < this.anInt980 + 8; local180++) {
							if (this.aClass38ArrayArrayArray1[this.anInt862][local175][local180] != null) {
								this.aClass38ArrayArrayArray1[this.anInt862][local175][local180] = null;
								this.method701(local175, local180);
							}
						}
					}
					for (@Pc(3966) Class3_Sub2 local3966 = (Class3_Sub2) this.aClass38_10.method486(); local3966 != null; local3966 = (Class3_Sub2) this.aClass38_10.method488()) {
						if (local3966.anInt244 >= this.anInt979 && local3966.anInt244 < this.anInt979 + 8 && local3966.anInt245 >= this.anInt980 && local3966.anInt245 < this.anInt980 + 8 && local3966.anInt242 == this.anInt862) {
							local3966.anInt237 = 0;
						}
					}
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 135) {
					local175 = this.aClass3_Sub1_Sub2_6.method91();
					this.method667(local175, this.anInt1046);
					if (this.anInt901 != -1) {
						this.method659(this.anInt901, 15);
						this.anInt901 = -1;
						this.aBoolean243 = true;
						this.aBoolean247 = true;
					}
					if (this.anInt846 != -1) {
						this.method659(this.anInt846, 15);
						this.anInt846 = -1;
						this.aBoolean229 = true;
					}
					if (this.anInt947 != -1) {
						this.method659(this.anInt947, 15);
						this.anInt947 = -1;
						this.aBoolean227 = true;
					}
					if (this.anInt879 != -1) {
						this.method659(this.anInt879, 15);
						this.anInt879 = -1;
					}
					if (this.anInt848 != local175) {
						this.method659(this.anInt848, 15);
						this.anInt848 = local175;
					}
					if (this.anInt969 != 0) {
						this.anInt969 = 0;
						this.aBoolean229 = true;
					}
					this.aBoolean221 = false;
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 181) {
					this.aBoolean243 = true;
					local175 = this.aClass3_Sub1_Sub2_6.method124();
					local180 = this.aClass3_Sub1_Sub2_6.method109();
					local211 = this.aClass3_Sub1_Sub2_6.method108();
					this.anIntArray247[local211] = local175;
					this.anIntArray252[local211] = local180;
					this.anIntArray237[local211] = 1;
					for (local1068 = 0; local1068 < 98; local1068++) {
						if (local175 >= anIntArray269[local1068]) {
							this.anIntArray237[local211] = local1068 + 2;
						}
					}
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 2) {
					this.anInt1058 = this.aClass3_Sub1_Sub2_6.method108();
					this.aBoolean243 = true;
					this.aBoolean247 = true;
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 101) {
					this.anInt1063 = this.aClass3_Sub1_Sub2_6.method118();
					this.anInt844 = this.aClass3_Sub1_Sub2_6.method123(this.aByte41);
					this.anInt923 = this.aClass3_Sub1_Sub2_6.method116();
					this.anInt978 = this.aClass3_Sub1_Sub2_6.method91();
					this.anInt1005 = this.aClass3_Sub1_Sub2_6.method89();
					this.anInt851 = this.aClass3_Sub1_Sub2_6.method118();
					this.anInt864 = this.aClass3_Sub1_Sub2_6.method91();
					this.anInt1049 = this.aClass3_Sub1_Sub2_6.method117();
					this.anInt1050 = this.aClass3_Sub1_Sub2_6.method117();
					this.anInt1000 = this.aClass3_Sub1_Sub2_6.method118();
					this.anInt910 = this.aClass3_Sub1_Sub2_6.method116();
					signlink.dnslookup(Class36.method480(this.anInt844));
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 31) {
					this.aBoolean237 = true;
					this.anInt951 = this.aClass3_Sub1_Sub2_6.method89();
					this.anInt952 = this.aClass3_Sub1_Sub2_6.method89();
					this.anInt953 = this.aClass3_Sub1_Sub2_6.method91();
					this.anInt954 = this.aClass3_Sub1_Sub2_6.method89();
					this.anInt955 = this.aClass3_Sub1_Sub2_6.method89();
					if (this.anInt955 >= 100) {
						local175 = this.anInt951 * 128 + 64;
						local180 = this.anInt952 * 128 + 64;
						local211 = this.method601(local180, this.anInt862, local175) - this.anInt953;
						local1068 = local175 - this.anInt963;
						local1072 = local211 - this.anInt964;
						local1081 = local180 - this.anInt965;
						local1366 = (int) Math.sqrt((double) (local1068 * local1068 + local1081 * local1081));
						this.anInt966 = (int) (Math.atan2((double) local1072, (double) local1366) * 325.949D) & 0x7FF;
						this.anInt967 = (int) (Math.atan2((double) local1068, (double) local1081) * -325.949D) & 0x7FF;
						if (this.anInt966 < 128) {
							this.anInt966 = 128;
						}
						if (this.anInt966 > 383) {
							this.anInt966 = 383;
						}
					}
					this.anInt932 = -1;
					return true;
				}
				if (this.anInt932 == 232) {
					local175 = this.aClass3_Sub1_Sub2_6.method118();
					@Pc(4421) byte local4421 = this.aClass3_Sub1_Sub2_6.method111(this.anInt1057);
					this.anIntArray270[local175] = local4421;
					if (this.anIntArray272[local175] != local4421) {
						this.anIntArray272[local175] = local4421;
						this.method627(local175);
						this.aBoolean243 = true;
						if (this.anInt875 != -1) {
							this.aBoolean229 = true;
						}
					}
					this.anInt932 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt932 + "," + this.anInt931 + " - " + this.anInt983 + "," + this.anInt984);
				this.method643();
			} catch (@Pc(4485) IOException local4485) {
				this.method641();
			} catch (@Pc(4490) Exception local4490) {
				local2005 = "T2 - " + this.anInt932 + "," + this.anInt983 + "," + this.anInt984 + " - " + this.anInt931 + "," + (this.anInt866 + aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray54[0]) + "," + (this.anInt867 + aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray55[0]) + " - ";
				for (local180 = 0; local180 < this.anInt931 && local180 < 50; local180++) {
					local2005 = local2005 + this.aClass3_Sub1_Sub2_6.aByteArray3[local180] + ",";
				}
				signlink.reporterror(local2005);
				this.method643();
			}
			return true;
		} catch (@Pc(4571) RuntimeException local4571) {
			signlink.reporterror("64959, " + 52 + ", " + local4571.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
	private void method718() {
		try {
			this.method624();
			if (this.anInt945 == 1) {
				this.aClass3_Sub1_Sub3_Sub2Array7[this.anInt944 / 100].method303(this.anInt943 - 8 - 4, this.anInt942 - 8 - 4);
			}
			if (this.anInt945 == 2) {
				this.aClass3_Sub1_Sub3_Sub2Array7[this.anInt944 / 100 + 4].method303(this.anInt943 - 8 - 4, this.anInt942 - 8 - 4);
				anInt1025++;
				if (anInt1025 > 52) {
					anInt1025 = 0;
					this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 103);
				}
			}
			if (this.anInt843 != -1) {
				this.method646(this.anInt903, this.anInt975, this.anInt843);
				this.method689(0, 0, Class9.method58(this.anInt843), 0);
			}
			if (this.anInt848 != -1) {
				this.method646(this.anInt903, this.anInt975, this.anInt848);
				this.method689(0, 0, Class9.method58(this.anInt848), 0);
			}
			this.method665();
			if (!this.aBoolean226) {
				this.method676();
				this.method679();
			} else if (this.anInt1006 == 0) {
				this.method657();
			}
			if (this.anInt1024 == 1) {
				this.aClass3_Sub1_Sub3_Sub2_17.method303(296, 472);
			}
			@Pc(194) int local194;
			if (aBoolean249) {
				@Pc(160) byte local160 = 20;
				@Pc(162) int local162 = 16776960;
				if (super.anInt826 < 30 && aBoolean224) {
					local162 = 16711680;
				}
				if (super.anInt826 < 20 && !aBoolean224) {
					local162 = 16711680;
				}
				this.aClass3_Sub1_Sub3_Sub4_3.method439(local162, 20, "Fps:" + super.anInt826);
				local194 = local160 + 15;
				@Pc(196) Runtime local196 = Runtime.getRuntime();
				@Pc(205) int local205 = (int) ((local196.totalMemory() - local196.freeMemory()) / 1024L);
				if (local205 > 33554432 && aBoolean224) {
				}
				if (local205 > 67108864 && !aBoolean224) {
				}
				this.aClass3_Sub1_Sub3_Sub4_3.method439(16776960, 35, "Mem:" + local205 + "k");
				local194 += 15;
			}
			if (this.anInt929 != 0) {
				@Pc(246) int local246 = this.anInt929 / 50;
				local194 = local246 / 60;
				@Pc(254) int local254 = local246 % 60;
				if (local254 < 10) {
					this.aClass3_Sub1_Sub3_Sub4_3.method444(16776960, "System update in: " + local194 + ":0" + local254, 329, 4);
				} else {
					this.aClass3_Sub1_Sub3_Sub4_3.method444(16776960, "System update in: " + local194 + ":" + local254, 329, 4);
				}
				anInt853++;
				if (anInt853 > 77) {
					anInt853 = 0;
					this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 29);
					return;
				}
			}
		} catch (@Pc(312) RuntimeException local312) {
			signlink.reporterror("24160, " + true + ", " + local312.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method719(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString24 = "";
				this.aString25 = "Connecting to server...";
				this.method661(true);
			}
			this.aClass48_1 = new Class48(0, this, this.method686(anInt941 + 43594));
			@Pc(30) long local30 = Class36.method477(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass3_Sub1_Sub2_7.anInt257 = 0;
			this.aClass3_Sub1_Sub2_7.method79(14);
			this.aClass3_Sub1_Sub2_7.method79(local37);
			this.aClass48_1.method559(this.aClass3_Sub1_Sub2_7.aByteArray3, 2);
			for (@Pc(60) int local60 = 0; local60 < 8; local60++) {
				this.aClass48_1.method556();
			}
			@Pc(74) int local74 = this.aClass48_1.method556();
			@Pc(76) int local76 = local74;
			@Pc(227) int local227;
			@Pc(261) int local261;
			if (local74 == 0) {
				this.aClass48_1.method558(this.aClass3_Sub1_Sub2_6.aByteArray3, 0, 8);
				this.aClass3_Sub1_Sub2_6.anInt257 = 0;
				this.aLong29 = this.aClass3_Sub1_Sub2_6.method95(this.aByte40);
				@Pc(100) int[] local100 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong29 >> 32), (int) this.aLong29 };
				this.aClass3_Sub1_Sub2_7.anInt257 = 0;
				this.aClass3_Sub1_Sub2_7.method79(10);
				this.aClass3_Sub1_Sub2_7.method83(local100[0]);
				this.aClass3_Sub1_Sub2_7.method83(local100[1]);
				this.aClass3_Sub1_Sub2_7.method83(local100[2]);
				this.aClass3_Sub1_Sub2_7.method83(local100[3]);
				this.aClass3_Sub1_Sub2_7.method83(signlink.anInt1072);
				this.aClass3_Sub1_Sub2_7.method86(arg0);
				this.aClass3_Sub1_Sub2_7.method86(arg1);
				this.aClass3_Sub1_Sub2_7.method104(aBigInteger2, this.anInt889, aBigInteger1);
				this.aClass3_Sub1_Sub2_9.anInt257 = 0;
				if (arg2) {
					this.aClass3_Sub1_Sub2_9.method79(18);
				} else {
					this.aClass3_Sub1_Sub2_9.method79(16);
				}
				this.aClass3_Sub1_Sub2_9.method79(this.aClass3_Sub1_Sub2_7.anInt257 + 36 + 1 + 1 + 2);
				this.aClass3_Sub1_Sub2_9.method79(255);
				this.aClass3_Sub1_Sub2_9.method80(345);
				this.aClass3_Sub1_Sub2_9.method79(aBoolean224 ? 1 : 0);
				for (local227 = 0; local227 < 9; local227++) {
					this.aClass3_Sub1_Sub2_9.method83(this.anIntArray271[local227]);
				}
				this.aClass3_Sub1_Sub2_9.method87(this.aClass3_Sub1_Sub2_7.aByteArray3, this.aClass3_Sub1_Sub2_7.anInt257);
				this.aClass3_Sub1_Sub2_7.aClass41_1 = new Class41((byte) 4, local100);
				for (local261 = 0; local261 < 4; local261++) {
					local100[local261] += 50;
				}
				this.aClass41_2 = new Class41((byte) 4, local100);
				this.aClass48_1.method559(this.aClass3_Sub1_Sub2_9.aByteArray3, this.aClass3_Sub1_Sub2_9.anInt257);
				local74 = this.aClass48_1.method556();
			}
			if (local74 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(303) Exception local303) {
				}
				this.method719(arg0, arg1, arg2);
			} else {
				@Pc(391) int local391;
				if (local74 == 2) {
					this.anInt1066 = this.aClass48_1.method556();
					aBoolean248 = this.aClass48_1.method556() == 1;
					this.aLong33 = 0L;
					this.anInt876 = 0;
					this.aClass49_1.anInt788 = 0;
					super.aBoolean197 = true;
					this.aBoolean213 = true;
					this.aBoolean214 = true;
					this.aClass3_Sub1_Sub2_7.anInt257 = 0;
					this.aClass3_Sub1_Sub2_6.anInt257 = 0;
					this.anInt932 = -1;
					this.anInt982 = -1;
					this.anInt983 = -1;
					this.anInt984 = -1;
					this.anInt931 = 0;
					this.anInt933 = 0;
					this.anInt929 = 0;
					this.anInt935 = 0;
					this.anInt902 = 0;
					this.anInt1017 = 0;
					this.aBoolean226 = false;
					super.anInt829 = 0;
					for (local391 = 0; local391 < 100; local391++) {
						this.aStringArray11[local391] = null;
					}
					this.anInt1052 = 0;
					this.anInt986 = 0;
					this.anInt877 = 0;
					this.anInt974 = 0;
					this.anInt1060 = (int) (Math.random() * 100.0D) - 50;
					this.anInt949 = (int) (Math.random() * 110.0D) - 55;
					this.anInt1014 = (int) (Math.random() * 80.0D) - 40;
					this.anInt887 = (int) (Math.random() * 120.0D) - 60;
					this.anInt906 = (int) (Math.random() * 30.0D) - 20;
					this.anInt1043 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt926 = 0;
					this.anInt996 = -1;
					this.anInt1040 = 0;
					this.anInt1041 = 0;
					this.anInt1028 = 0;
					this.anInt997 = 0;
					for (local227 = 0; local227 < this.anInt1026; local227++) {
						this.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local227] = null;
						this.aClass3_Sub1_Sub2Array1[local227] = null;
					}
					for (local261 = 0; local261 < 16384; local261++) {
						this.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local261] = null;
					}
					aClass3_Sub1_Sub1_Sub1_Sub1_1 = this.aClass3_Sub1_Sub1_Sub1_Sub1Array1[this.anInt1027] = new Class3_Sub1_Sub1_Sub1_Sub1();
					this.aClass38_12.method490();
					this.aClass38_11.method490();
					@Pc(536) int local536;
					@Pc(540) int local540;
					for (@Pc(532) int local532 = 0; local532 < 4; local532++) {
						for (local536 = 0; local536 < 104; local536++) {
							for (local540 = 0; local540 < 104; local540++) {
								this.aClass38ArrayArrayArray1[local532][local536][local540] = null;
							}
						}
					}
					this.aClass38_10 = new Class38((byte) 55);
					this.anInt938 = 0;
					this.anInt937 = 0;
					this.method659(this.anInt875, 15);
					this.anInt875 = -1;
					this.method659(this.anInt846, 15);
					this.anInt846 = -1;
					this.method659(this.anInt848, 15);
					this.anInt848 = -1;
					this.method659(this.anInt947, 15);
					this.anInt947 = -1;
					this.method659(this.anInt879, 15);
					this.anInt879 = -1;
					this.method659(this.anInt901, 15);
					this.anInt901 = -1;
					this.method659(this.anInt843, 15);
					this.anInt843 = -1;
					this.aBoolean221 = false;
					this.anInt1058 = 3;
					this.anInt969 = 0;
					this.aBoolean226 = false;
					this.aBoolean244 = false;
					this.aString17 = null;
					this.anInt1024 = 0;
					this.anInt1011 = -1;
					this.aBoolean238 = true;
					this.method612();
					for (local536 = 0; local536 < 5; local536++) {
						this.anIntArray235[local536] = 0;
					}
					for (local540 = 0; local540 < 5; local540++) {
						this.aStringArray9[local540] = null;
						this.aBooleanArray11[local540] = false;
					}
					anInt1036 = 0;
					anInt1062 = 0;
					anInt891 = 0;
					anInt1012 = 0;
					anInt1030 = 0;
					anInt912 = 0;
					this.method622();
				} else if (local74 == 3) {
					this.aString24 = "";
					this.aString25 = "Invalid username or password.";
				} else if (local74 == 4) {
					this.aString24 = "Your account has been disabled.";
					this.aString25 = "Please check your message-centre for details.";
				} else if (local74 == 5) {
					this.aString24 = "Your account is already logged in.";
					this.aString25 = "Try again in 60 secs...";
				} else if (local74 == 6) {
					this.aString24 = "RuneScape has been updated!";
					this.aString25 = "Please reload this page.";
				} else if (local74 == 7) {
					this.aString24 = "This world is full.";
					this.aString25 = "Please use a different world.";
				} else if (local74 == 8) {
					this.aString24 = "Unable to connect.";
					this.aString25 = "Login server offline.";
				} else if (local74 == 9) {
					this.aString24 = "Login limit exceeded.";
					this.aString25 = "Too many connections from your address.";
				} else if (local74 == 10) {
					this.aString24 = "Unable to connect.";
					this.aString25 = "Bad session id.";
				} else if (local74 == 11) {
					this.aString24 = "Login server rejected session.";
					this.aString25 = "Please try again.";
				} else if (local74 == 12) {
					this.aString24 = "You need a members account to login to this world.";
					this.aString25 = "Please subscribe, or use a different world.";
				} else if (local74 == 13) {
					this.aString24 = "Could not complete login.";
					this.aString25 = "Please try using a different world.";
				} else if (local74 == 14) {
					this.aString24 = "The server is being updated.";
					this.aString25 = "Please wait 1 minute and try again.";
				} else if (local74 == 15) {
					this.aBoolean214 = true;
					this.aClass3_Sub1_Sub2_7.anInt257 = 0;
					this.aClass3_Sub1_Sub2_6.anInt257 = 0;
					this.anInt932 = -1;
					this.anInt982 = -1;
					this.anInt983 = -1;
					this.anInt984 = -1;
					this.anInt931 = 0;
					this.anInt933 = 0;
					this.anInt929 = 0;
					this.anInt1017 = 0;
					this.aBoolean226 = false;
					this.aLong30 = System.currentTimeMillis();
				} else if (local74 == 16) {
					this.aString24 = "Login attempts exceeded.";
					this.aString25 = "Please wait 1 minute and try again.";
				} else if (local74 == 17) {
					this.aString24 = "You are standing in a members-only area.";
					this.aString25 = "To play on this world move to a free area first";
				} else if (local74 == 20) {
					this.aString24 = "Invalid loginserver requested";
					this.aString25 = "Please try using a different world.";
				} else if (local74 == 21) {
					local391 = this.aClass48_1.method556();
					for (@Pc(919) int local919 = local391 + 3; local919 >= 0; local919--) {
						this.aString24 = "You have only just left another world";
						this.aString25 = "Your profile will be transferred in: " + local919;
						this.method661(true);
						try {
							Thread.sleep(1200L);
						} catch (@Pc(941) Exception local941) {
						}
					}
					this.method719(arg0, arg1, arg2);
				} else if (local74 == 22) {
					this.aString24 = "Malformed login packet.";
					this.aString25 = "Please try again.";
				} else if (local74 != -1) {
					System.out.println("response:" + local74);
					this.aString24 = "Unexpected server response";
					this.aString25 = "Please try using a different world.";
				} else if (local76 != 0) {
					this.aString24 = "No response from server";
					this.aString25 = "Please try using a different world.";
				} else if (this.anInt856 < 2) {
					try {
						Thread.sleep(2000L);
					} catch (@Pc(973) Exception local973) {
					}
					this.anInt856++;
					this.method719(arg0, arg1, arg2);
				} else {
					this.aString24 = "No response from loginserver";
					this.aString25 = "Please wait 1 minute and try again.";
				}
			}
		} catch (@Pc(1016) IOException local1016) {
			this.aString24 = "";
			this.aString25 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!GHHPHSRU;Z)V")
	private void method720(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub2 arg1) {
		try {
			while (true) {
				if (arg1.anInt258 + 21 < arg0 * 8) {
					@Pc(18) int local18 = arg1.method100(14, this.anInt1048);
					if (local18 != 16383) {
						if (this.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local18] == null) {
							this.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local18] = new Class3_Sub1_Sub1_Sub1_Sub2();
						}
						@Pc(38) Class3_Sub1_Sub1_Sub1_Sub2 local38 = this.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local18];
						this.anIntArray263[this.anInt997++] = local18;
						local38.anInt391 = anInt1003;
						@Pc(58) int local58 = arg1.method100(1, this.anInt1048);
						if (local58 == 1) {
							this.anIntArray267[this.anInt1029++] = local18;
						}
						@Pc(78) int local78 = arg1.method100(5, this.anInt1048);
						if (local78 > 15) {
							local78 -= 32;
						}
						local38.aClass5_2 = Class5.method24(arg1.method100(12, this.anInt1048));
						@Pc(96) int local96 = arg1.method100(1, this.anInt1048);
						@Pc(102) int local102 = arg1.method100(5, this.anInt1048);
						if (local102 > 15) {
							local102 -= 32;
						}
						local38.anInt392 = local38.aClass5_2.aByte1;
						local38.anInt403 = local38.aClass5_2.anInt43;
						local38.anInt412 = local38.aClass5_2.anInt48;
						local38.anInt413 = local38.aClass5_2.anInt56;
						local38.anInt414 = local38.aClass5_2.anInt51;
						local38.anInt415 = local38.aClass5_2.anInt49;
						local38.anInt404 = local38.aClass5_2.anInt58;
						local38.method211(aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray54[0] + local102, aClass3_Sub1_Sub1_Sub1_Sub1_1.anIntArray55[0] + local78, local96 == 1);
						continue;
					}
				}
				arg1.method101();
				return;
			}
		} catch (@Pc(169) RuntimeException local169) {
			signlink.reporterror("71290, " + arg0 + ", " + arg1 + ", " + true + ", " + local169.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method721() {
		try {
			this.anInt931 += 0;
			this.aClass3_Sub1_Sub2_7.method78(this.aBoolean215, 47);
			if (this.anInt901 != -1) {
				this.method659(this.anInt901, 15);
				this.anInt901 = -1;
				this.aBoolean243 = true;
				this.aBoolean221 = false;
				this.aBoolean247 = true;
			}
			if (this.anInt846 != -1) {
				this.method659(this.anInt846, 15);
				this.anInt846 = -1;
				this.aBoolean229 = true;
				this.aBoolean221 = false;
			}
			if (this.anInt947 != -1) {
				this.method659(this.anInt947, 15);
				this.anInt947 = -1;
				this.aBoolean227 = true;
			}
			if (this.anInt879 != -1) {
				this.method659(this.anInt879, 15);
				this.anInt879 = -1;
			}
			if (this.anInt848 != -1) {
				this.method659(this.anInt848, 15);
				this.anInt848 = -1;
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("3417, " + 0 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(B)V")
	private void method722() {
		try {
			if (this.aByte42 != 109) {
				this.anInt932 = this.aClass3_Sub1_Sub2_6.method89();
			}
			for (@Pc(12) int local12 = 0; local12 < this.anInt974; local12++) {
				if (this.anIntArray259[local12] <= 0) {
					@Pc(21) boolean local21 = false;
					try {
						if (this.anIntArray250[local12] != this.anInt842 || this.anIntArray265[local12] != this.anInt1037) {
							@Pc(54) Class3_Sub1_Sub2 local54 = Class40.method495(this.anIntArray265[local12], this.anIntArray250[local12]);
							if (System.currentTimeMillis() + (long) (local54.anInt257 / 22) > this.aLong32 + (long) (this.anInt985 / 22)) {
								this.anInt985 = local54.anInt257;
								this.aLong32 = System.currentTimeMillis();
								if (this.method647(local54.anInt257, local54.aByteArray3)) {
									this.anInt842 = this.anIntArray250[local12];
									this.anInt1037 = this.anIntArray265[local12];
								} else {
									local21 = true;
								}
							}
						} else if (!this.method711()) {
							local21 = true;
						}
					} catch (@Pc(104) Exception local104) {
					}
					if (local21 && this.anIntArray259[local12] != -5) {
						this.anIntArray259[local12] = -5;
					} else {
						this.anInt974--;
						for (@Pc(120) int local120 = local12; local120 < this.anInt974; local120++) {
							this.anIntArray250[local120] = this.anIntArray250[local120 + 1];
							this.anIntArray265[local120] = this.anIntArray265[local120 + 1];
							this.anIntArray259[local120] = this.anIntArray259[local120 + 1];
						}
						local12--;
					}
				} else {
					@Pc(172) int local172 = this.anIntArray259[local12]--;
				}
			}
			if (this.anInt995 > 0) {
				this.anInt995 -= 20;
				if (this.anInt995 < 0) {
					this.anInt995 = 0;
				}
				if (this.anInt995 == 0 && this.aBoolean216 && !aBoolean224) {
					this.anInt998 = this.anInt855;
					this.aBoolean239 = true;
					this.aClass6_Sub1_1.method548(2, this.anInt998);
					return;
				}
			}
		} catch (@Pc(218) RuntimeException local218) {
			signlink.reporterror("50060, " + 109 + ", " + local218.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
	private void method723(@OriginalArg(0) boolean arg0) {
		try {
			if (this.anInt1052 == 0 && this.anInt986 == 0) {
				this.aStringArray13[this.anInt1017] = "Walk here";
				this.anIntArray255[this.anInt1017] = 506;
				this.anIntArray253[this.anInt1017] = super.anInt831;
				this.anIntArray254[this.anInt1017] = super.anInt832;
				this.anInt1017++;
			}
			@Pc(41) int local41 = -1;
			this.aBoolean214 &= arg0;
			for (@Pc(49) int local49 = 0; local49 < Class3_Sub1_Sub1_Sub3.anInt560; local49++) {
				@Pc(55) int local55 = Class3_Sub1_Sub1_Sub3.anIntArray120[local49];
				@Pc(59) int local59 = local55 & 0x7F;
				@Pc(65) int local65 = local55 >> 7 & 0x7F;
				@Pc(71) int local71 = local55 >> 29 & 0x3;
				@Pc(77) int local77 = local55 >> 14 & 0x7FFF;
				if (local55 != local41) {
					local41 = local55;
					@Pc(225) int local225;
					if (local71 == 2 && this.aClass17_1.method252(this.anInt862, local59, local65, local55) >= 0) {
						@Pc(97) Class18 local97 = Class18.method278(local77);
						if (local97.anIntArray79 != null) {
							local97 = local97.method283(this.aBoolean202);
						}
						if (local97 == null) {
							continue;
						}
						if (this.anInt1052 == 1) {
							this.aStringArray13[this.anInt1017] = "Use " + this.aString30 + " with @cya@" + local97.aString11;
							this.anIntArray255[this.anInt1017] = 484;
							this.anIntArray256[this.anInt1017] = local55;
							this.anIntArray253[this.anInt1017] = local59;
							this.anIntArray254[this.anInt1017] = local65;
							this.anInt1017++;
						} else if (this.anInt986 != 1) {
							if (local97.aStringArray4 != null) {
								for (local225 = 4; local225 >= 0; local225--) {
									if (local97.aStringArray4[local225] != null) {
										this.aStringArray13[this.anInt1017] = local97.aStringArray4[local225] + " @cya@" + local97.aString11;
										if (local225 == 0) {
											this.anIntArray255[this.anInt1017] = 538;
										}
										if (local225 == 1) {
											this.anIntArray255[this.anInt1017] = 337;
										}
										if (local225 == 2) {
											this.anIntArray255[this.anInt1017] = 496;
										}
										if (local225 == 3) {
											this.anIntArray255[this.anInt1017] = 846;
										}
										if (local225 == 4) {
											this.anIntArray255[this.anInt1017] = 1586;
										}
										this.anIntArray256[this.anInt1017] = local55;
										this.anIntArray253[this.anInt1017] = local59;
										this.anIntArray254[this.anInt1017] = local65;
										this.anInt1017++;
									}
								}
							}
							this.aStringArray13[this.anInt1017] = "Examine @cya@" + local97.aString11;
							this.anIntArray255[this.anInt1017] = 1138;
							this.anIntArray256[this.anInt1017] = local97.anInt474 << 14;
							this.anIntArray253[this.anInt1017] = local59;
							this.anIntArray254[this.anInt1017] = local65;
							this.anInt1017++;
						} else if ((this.anInt988 & 0x4) == 4) {
							this.aStringArray13[this.anInt1017] = this.aString27 + " @cya@" + local97.aString11;
							this.anIntArray255[this.anInt1017] = 807;
							this.anIntArray256[this.anInt1017] = local55;
							this.anIntArray253[this.anInt1017] = local59;
							this.anIntArray254[this.anInt1017] = local65;
							this.anInt1017++;
						}
					}
					@Pc(405) Class3_Sub1_Sub1_Sub1_Sub2 local405;
					@Pc(453) Class3_Sub1_Sub1_Sub1_Sub1 local453;
					@Pc(443) int local443;
					if (local71 == 1) {
						@Pc(376) Class3_Sub1_Sub1_Sub1_Sub2 local376 = this.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local77];
						if (local376.aClass5_2.aByte1 == 1 && (local376.anInt380 & 0x7F) == 64 && (local376.anInt381 & 0x7F) == 64) {
							for (local225 = 0; local225 < this.anInt997; local225++) {
								local405 = this.aClass3_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray263[local225]];
								if (local405 != null && local405 != local376 && local405.aClass5_2.aByte1 == 1 && local405.anInt380 == local376.anInt380 && local405.anInt381 == local376.anInt381) {
									this.method642(local405.aClass5_2, this.anIntArray263[local225], local65, local59);
								}
							}
							for (local443 = 0; local443 < this.anInt1028; local443++) {
								local453 = this.aClass3_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray266[local443]];
								if (local453 != null && local453.anInt380 == local376.anInt380 && local453.anInt381 == local376.anInt381) {
									this.method654(local453, local59, this.anIntArray266[local443], local65);
								}
							}
						}
						this.method642(local376.aClass5_2, local77, local65, local59);
					}
					if (local71 == 0) {
						@Pc(495) Class3_Sub1_Sub1_Sub1_Sub1 local495 = this.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local77];
						if ((local495.anInt380 & 0x7F) == 64 && (local495.anInt381 & 0x7F) == 64) {
							for (local225 = 0; local225 < this.anInt997; local225++) {
								local405 = this.aClass3_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray263[local225]];
								if (local405 != null && local405.aClass5_2.aByte1 == 1 && local405.anInt380 == local495.anInt380 && local405.anInt381 == local495.anInt381) {
									this.method642(local405.aClass5_2, this.anIntArray263[local225], local65, local59);
								}
							}
							for (local443 = 0; local443 < this.anInt1028; local443++) {
								local453 = this.aClass3_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray266[local443]];
								if (local453 != null && local453 != local495 && local453.anInt380 == local495.anInt380 && local453.anInt381 == local495.anInt381) {
									this.method654(local453, local59, this.anIntArray266[local443], local65);
								}
							}
						}
						this.method654(local495, local59, local77, local65);
					}
					if (local71 == 3) {
						@Pc(614) Class38 local614 = this.aClass38ArrayArrayArray1[this.anInt862][local59][local65];
						if (local614 != null) {
							for (@Pc(621) Class3_Sub1_Sub1_Sub2 local621 = (Class3_Sub1_Sub1_Sub2) local614.method487(); local621 != null; local621 = (Class3_Sub1_Sub1_Sub2) local614.method489()) {
								@Pc(627) Class50 local627 = Class50.method562(local621.anInt299);
								if (this.anInt1052 == 1) {
									this.aStringArray13[this.anInt1017] = "Use " + this.aString30 + " with @lre@" + local627.aString16;
									this.anIntArray255[this.anInt1017] = 383;
									this.anIntArray256[this.anInt1017] = local621.anInt299;
									this.anIntArray253[this.anInt1017] = local59;
									this.anIntArray254[this.anInt1017] = local65;
									this.anInt1017++;
								} else if (this.anInt986 != 1) {
									for (@Pc(744) int local744 = 4; local744 >= 0; local744--) {
										if (local627.aStringArray7 != null && local627.aStringArray7[local744] != null) {
											this.aStringArray13[this.anInt1017] = local627.aStringArray7[local744] + " @lre@" + local627.aString16;
											if (local744 == 0) {
												this.anIntArray255[this.anInt1017] = 230;
											}
											if (local744 == 1) {
												this.anIntArray255[this.anInt1017] = 658;
											}
											if (local744 == 2) {
												this.anIntArray255[this.anInt1017] = 595;
											}
											if (local744 == 3) {
												this.anIntArray255[this.anInt1017] = 670;
											}
											if (local744 == 4) {
												this.anIntArray255[this.anInt1017] = 687;
											}
											this.anIntArray256[this.anInt1017] = local621.anInt299;
											this.anIntArray253[this.anInt1017] = local59;
											this.anIntArray254[this.anInt1017] = local65;
											this.anInt1017++;
										} else if (local744 == 2) {
											this.aStringArray13[this.anInt1017] = "Take @lre@" + local627.aString16;
											this.anIntArray255[this.anInt1017] = 595;
											this.anIntArray256[this.anInt1017] = local621.anInt299;
											this.anIntArray253[this.anInt1017] = local59;
											this.anIntArray254[this.anInt1017] = local65;
											this.anInt1017++;
										}
									}
									this.aStringArray13[this.anInt1017] = "Examine @lre@" + local627.aString16;
									this.anIntArray255[this.anInt1017] = 1408;
									this.anIntArray256[this.anInt1017] = local621.anInt299;
									this.anIntArray253[this.anInt1017] = local59;
									this.anIntArray254[this.anInt1017] = local65;
									this.anInt1017++;
								} else if ((this.anInt988 & 0x1) == 1) {
									this.aStringArray13[this.anInt1017] = this.aString27 + " @lre@" + local627.aString16;
									this.anIntArray255[this.anInt1017] = 78;
									this.anIntArray256[this.anInt1017] = local621.anInt299;
									this.anIntArray253[this.anInt1017] = local59;
									this.anIntArray254[this.anInt1017] = local65;
									this.anInt1017++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(951) RuntimeException local951) {
			signlink.reporterror("14492, " + arg0 + ", " + local951.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;III)Lclient!DTIATKJO;")
	private Class7 method724(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(3) byte[] local3 = null;
			@Pc(5) int local5 = 5;
			try {
				if (this.aClass44Array1[0] != null) {
					local3 = this.aClass44Array1[0].method520(arg4);
				}
			} catch (@Pc(20) Exception local20) {
			}
			@Pc(34) int local34;
			if (local3 != null) {
				this.aCRC32_2.reset();
				this.aCRC32_2.update(local3);
				local34 = (int) this.aCRC32_2.getValue();
				if (local34 != arg0) {
					local3 = null;
				}
			}
			if (local3 != null) {
				return new Class7((byte) 8, local3);
			}
			local34 = 0;
			while (local3 == null) {
				@Pc(55) String local55 = "Unknown error";
				this.method586(arg3, aBoolean199, "Requesting " + arg2);
				@Pc(70) int local70;
				try {
					local70 = 0;
					@Pc(81) DataInputStream local81 = this.method630(arg1 + arg0);
					@Pc(84) byte[] local84 = new byte[6];
					local81.readFully(local84, 0, 6);
					@Pc(95) Class3_Sub1_Sub2 local95 = new Class3_Sub1_Sub2(-527, local84);
					local95.anInt257 = 3;
					@Pc(103) int local103 = local95.method93() + 6;
					@Pc(105) int local105 = 6;
					local3 = new byte[local103];
					for (@Pc(110) int local110 = 0; local110 < 6; local110++) {
						local3[local110] = local84[local110];
					}
					@Pc(127) int local127;
					while (local105 < local103) {
						local127 = local103 - local105;
						if (local127 > 1000) {
							local127 = 1000;
						}
						@Pc(138) int local138 = local81.read(local3, local105, local127);
						if (local138 < 0) {
							(new StringBuffer("Length error: ")).append(local105).append("/").append(local103).toString();
							throw new IOException("EOF");
						}
						local105 += local138;
						@Pc(167) int local167 = local105 * 100 / local103;
						if (local167 != local70) {
							this.method586(arg3, aBoolean199, "Loading " + arg2 + " - " + local167 + "%");
						}
						local70 = local167;
					}
					local81.close();
					try {
						if (this.aClass44Array1[0] != null) {
							this.aClass44Array1[0].method521(arg4, local3, (byte) 7, local3.length);
						}
					} catch (@Pc(212) Exception local212) {
						this.aClass44Array1[0] = null;
					}
					if (local3 != null) {
						this.aCRC32_2.reset();
						this.aCRC32_2.update(local3);
						local127 = (int) this.aCRC32_2.getValue();
						if (local127 != arg0) {
							local3 = null;
							local34++;
							local55 = "Checksum error: " + local127;
						}
					}
				} catch (@Pc(247) IOException local247) {
					if (local55.equals("Unknown error")) {
						local55 = "Connection error";
					}
					local3 = null;
				} catch (@Pc(257) NullPointerException local257) {
					local55 = "Null error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(266) ArrayIndexOutOfBoundsException local266) {
					local55 = "Bounds error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(275) Exception local275) {
					local55 = "Unexpected error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				}
				if (local3 == null) {
					for (local70 = local5; local70 > 0; local70--) {
						if (local34 >= 3) {
							this.method586(arg3, aBoolean199, "Game updated - please reload page");
							local70 = 10;
						} else {
							this.method586(arg3, aBoolean199, local55 + " - Retrying in " + local70);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(319) Exception local319) {
						}
					}
					local5 *= 2;
					if (local5 > 60) {
						local5 = 60;
					}
					this.aBoolean200 = !this.aBoolean200;
				}
			}
			return new Class7((byte) 8, local3);
		} catch (@Pc(360) RuntimeException local360) {
			signlink.reporterror("83007, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -5 + ", " + arg3 + ", " + arg4 + ", " + local360.toString());
			throw new RuntimeException();
		}
	}
}
