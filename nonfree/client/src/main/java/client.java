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

	@OriginalMember(owner = "client!client", name = "T", descriptor = "I")
	private static int anInt821;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "Z")
	private static boolean aBoolean199;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
	private static int anInt833;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "Z")
	private static boolean aBoolean200;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "I")
	public static int anInt865;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "Z")
	private static boolean aBoolean203;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "I")
	private static int anInt916;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "Z")
	private static boolean aBoolean214;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "I")
	public static int anInt919;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
	private static int anInt945;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "I")
	private static int anInt953;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
	private static int anInt959;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "Z")
	private static boolean aBoolean224;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
	private static int anInt968;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "I")
	private static int anInt973;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "Lclient!WQWDCUWR;")
	public static Class3_Sub1_Sub1_Sub4_Sub2 aClass3_Sub1_Sub1_Sub4_Sub2_1;

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "I")
	private static int anInt987;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "I")
	private static int anInt1000;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "I")
	private static int anInt1012;

	@OriginalMember(owner = "client!client", name = "Tj", descriptor = "I")
	private static int anInt1043;

	@OriginalMember(owner = "client!client", name = "nk", descriptor = "I")
	private static int anInt1053;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "B")
	private static byte aByte37 = 1;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "[I")
	public static int[] anIntArray219 = new int[32];

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "I")
	private static int anInt864;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "Z")
	private static boolean aBoolean202;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "[I")
	private static int[] anIntArray223;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "B")
	private static byte aByte38;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "[[I")
	public static final int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "B")
	private static byte aByte45;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "I")
	private static int anInt988;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "Ljava/lang/String;")
	private static String aString26;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "I")
	private static int anInt1010;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "[I")
	public static final int[] anIntArray264;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "I")
	private int anInt815;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "I")
	private int anInt816;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "I")
	private int anInt817;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "I")
	private int anInt819;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "I")
	private int anInt820;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "I")
	private int anInt822;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "I")
	private int anInt823;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
	private int anInt824;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
	private int anInt825;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
	private int anInt826;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
	private int anInt827;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "I")
	private int anInt828;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "Lclient!IKKPZVXM;")
	private Class17 aClass17_1;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	private int anInt829;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
	private int anInt832;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
	private int anInt835;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
	private int anInt836;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
	private int anInt837;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "[I")
	private int[] anIntArray215;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "[I")
	private int[] anIntArray216;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "[I")
	private int[] anIntArray217;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "[I")
	private int[] anIntArray218;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
	private int anInt838;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
	private int anInt841;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "I")
	private int anInt842;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "I")
	private int anInt843;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "I")
	private int anInt844;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "I")
	private int anInt845;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "I")
	private int anInt846;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "I")
	private int anInt847;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "I")
	private int anInt848;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "I")
	private int anInt849;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
	private int anInt850;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
	private int anInt851;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
	private int anInt852;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
	private int anInt853;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "I")
	private int anInt855;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "I")
	private int anInt858;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "I")
	private int anInt859;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
	private int anInt860;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "I")
	private int anInt862;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "Lclient!KDQJDBED;")
	private Class21 aClass21_2;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
	private int anInt866;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
	private int anInt868;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "I")
	private int anInt869;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "I")
	private int anInt870;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "I")
	private int anInt871;

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "I")
	private int anInt872;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
	private int anInt873;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "I")
	private int anInt874;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "I")
	private int anInt875;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "I")
	private int anInt876;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "I")
	private int anInt877;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "I")
	private int anInt878;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "I")
	private int anInt879;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "I")
	private int anInt880;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "I")
	private int anInt881;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "I")
	private int anInt883;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "I")
	private int anInt884;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "I")
	private int anInt885;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
	private int anInt886;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "I")
	private int anInt887;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "Lclient!SSCICQYX;")
	private Class3_Sub1_Sub2_Sub3 aClass3_Sub1_Sub2_Sub3_1;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "Lclient!SSCICQYX;")
	private Class3_Sub1_Sub2_Sub3 aClass3_Sub1_Sub2_Sub3_2;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "I")
	private int anInt889;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
	private int anInt890;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "I")
	private int anInt891;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "I")
	private int anInt892;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "Ljava/lang/String;")
	private String aString20;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "Lclient!SSCICQYX;")
	private Class3_Sub1_Sub2_Sub3 aClass3_Sub1_Sub2_Sub3_3;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "Lclient!SSCICQYX;")
	private Class3_Sub1_Sub2_Sub3 aClass3_Sub1_Sub2_Sub3_4;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "Lclient!SSCICQYX;")
	private Class3_Sub1_Sub2_Sub3 aClass3_Sub1_Sub2_Sub3_5;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "Lclient!SSCICQYX;")
	private Class3_Sub1_Sub2_Sub3 aClass3_Sub1_Sub2_Sub3_6;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "Lclient!SSCICQYX;")
	private Class3_Sub1_Sub2_Sub3 aClass3_Sub1_Sub2_Sub3_7;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "I")
	private int anInt893;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "Lclient!SSCICQYX;")
	private Class3_Sub1_Sub2_Sub3 aClass3_Sub1_Sub2_Sub3_8;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "Lclient!SSCICQYX;")
	private Class3_Sub1_Sub2_Sub3 aClass3_Sub1_Sub2_Sub3_9;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "I")
	private int anInt894;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "I")
	private int anInt895;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "I")
	private int anInt896;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "I")
	private int anInt897;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
	private int anInt898;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "Lclient!WSNKRVXZ;")
	private Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_3;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "Lclient!WSNKRVXZ;")
	private Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_4;

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "I")
	private int anInt903;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "[I")
	private int[] anIntArray227;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "[I")
	private int[] anIntArray228;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "[I")
	private int[] anIntArray229;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "[I")
	private int[] anIntArray230;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "I")
	private int anInt906;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "[I")
	private int[] anIntArray231;

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "[I")
	private int[] anIntArray232;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "[I")
	private int[] anIntArray233;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "I")
	private int anInt907;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "I")
	private int anInt908;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "Ljava/lang/String;")
	private String aString21;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
	private int anInt909;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "Lclient!WSNKRVXZ;")
	private Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_5;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "Lclient!WSNKRVXZ;")
	private Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_6;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "[[B")
	private byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "I")
	private int anInt912;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
	private int anInt913;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "[I")
	private int[] anIntArray235;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "[I")
	private int[] anIntArray236;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "I")
	private int anInt914;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "I")
	private int anInt917;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "I")
	private int anInt918;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "Lclient!WSNKRVXZ;")
	private Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_7;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
	private int anInt921;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "I")
	private int anInt922;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "I")
	private int anInt925;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "Lclient!WSNKRVXZ;")
	private Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_8;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "Lclient!WSNKRVXZ;")
	private Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_9;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "Lclient!WSNKRVXZ;")
	private Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_10;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "Lclient!WSNKRVXZ;")
	private Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_11;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "Lclient!WSNKRVXZ;")
	private Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_12;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
	private int anInt929;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
	private int anInt930;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "I")
	private int anInt931;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "I")
	private int anInt932;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "Lclient!WSNKRVXZ;")
	private Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_13;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "I")
	private int anInt933;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "I")
	private int anInt934;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
	private int anInt935;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
	private int anInt936;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
	private int anInt937;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "Lclient!GYXQUUFC;")
	private Class13 aClass13_3;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "Lclient!GYXQUUFC;")
	private Class13 aClass13_4;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "Lclient!GYXQUUFC;")
	private Class13 aClass13_5;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "Lclient!GYXQUUFC;")
	private Class13 aClass13_6;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
	private int anInt938;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "I")
	private int anInt939;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "Lclient!WSNKRVXZ;")
	private Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_14;

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "I")
	private int anInt942;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "I")
	private int anInt943;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "I")
	private int anInt946;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "I")
	private int anInt947;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "I")
	private int anInt948;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "I")
	private int anInt949;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "Lclient!GYXQUUFC;")
	private Class13 aClass13_7;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "Lclient!GYXQUUFC;")
	private Class13 aClass13_8;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "Lclient!GYXQUUFC;")
	private Class13 aClass13_9;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "Lclient!GYXQUUFC;")
	private Class13 aClass13_10;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "Lclient!GYXQUUFC;")
	private Class13 aClass13_11;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "Lclient!GYXQUUFC;")
	private Class13 aClass13_12;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "Lclient!GYXQUUFC;")
	private Class13 aClass13_13;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "Lclient!GYXQUUFC;")
	private Class13 aClass13_14;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "Lclient!GYXQUUFC;")
	private Class13 aClass13_15;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "I")
	private int anInt951;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "I")
	private int anInt957;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
	private int anInt958;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "[I")
	private int[] anIntArray245;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "[I")
	private int[] anIntArray246;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "I")
	private int anInt960;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "I")
	private int anInt962;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "I")
	private int anInt963;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "I")
	private int anInt964;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "I")
	private int anInt965;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "I")
	private int anInt966;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "I")
	private int anInt967;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "Lclient!SSCICQYX;")
	private Class3_Sub1_Sub2_Sub3 aClass3_Sub1_Sub2_Sub3_10;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "Lclient!SSCICQYX;")
	private Class3_Sub1_Sub2_Sub3 aClass3_Sub1_Sub2_Sub3_11;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "Lclient!SSCICQYX;")
	private Class3_Sub1_Sub2_Sub3 aClass3_Sub1_Sub2_Sub3_12;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "Ljava/lang/String;")
	private String aString25;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "I")
	private int anInt970;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
	private int anInt971;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "I")
	private int anInt972;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "I")
	private int anInt974;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "I")
	private int anInt977;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "I")
	private int anInt978;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "I")
	private int anInt979;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "I")
	private int anInt980;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "I")
	private int anInt981;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "I")
	private int anInt982;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "Lclient!GYXQUUFC;")
	private Class13 aClass13_16;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "Lclient!GYXQUUFC;")
	private Class13 aClass13_17;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "Lclient!GYXQUUFC;")
	private Class13 aClass13_18;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "Lclient!GYXQUUFC;")
	private Class13 aClass13_19;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "Lclient!GYXQUUFC;")
	private Class13 aClass13_20;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "Lclient!GYXQUUFC;")
	private Class13 aClass13_21;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "Lclient!GYXQUUFC;")
	private Class13 aClass13_22;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "Lclient!GYXQUUFC;")
	private Class13 aClass13_23;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "Lclient!GYXQUUFC;")
	private Class13 aClass13_24;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "Lclient!BTJUXBKR;")
	private Class3_Sub1_Sub2_Sub1 aClass3_Sub1_Sub2_Sub1_2;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "Lclient!BTJUXBKR;")
	private Class3_Sub1_Sub2_Sub1 aClass3_Sub1_Sub2_Sub1_3;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "Lclient!BTJUXBKR;")
	private Class3_Sub1_Sub2_Sub1 aClass3_Sub1_Sub2_Sub1_4;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "Lclient!BTJUXBKR;")
	private Class3_Sub1_Sub2_Sub1 aClass3_Sub1_Sub2_Sub1_5;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "I")
	private int anInt983;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "I")
	private int anInt984;

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
	private int anInt986;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "I")
	private int anInt989;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "Lclient!SSCICQYX;")
	private Class3_Sub1_Sub2_Sub3 aClass3_Sub1_Sub2_Sub3_13;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "Lclient!SSCICQYX;")
	private Class3_Sub1_Sub2_Sub3 aClass3_Sub1_Sub2_Sub3_14;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "Lclient!SSCICQYX;")
	private Class3_Sub1_Sub2_Sub3 aClass3_Sub1_Sub2_Sub3_15;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "Lclient!SSCICQYX;")
	private Class3_Sub1_Sub2_Sub3 aClass3_Sub1_Sub2_Sub3_16;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "Lclient!SSCICQYX;")
	private Class3_Sub1_Sub2_Sub3 aClass3_Sub1_Sub2_Sub3_17;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "I")
	private int anInt992;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "I")
	private int anInt993;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "[Lclient!SSCICQYX;")
	private Class3_Sub1_Sub2_Sub3[] aClass3_Sub1_Sub2_Sub3Array5;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "I")
	private int anInt996;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "Lclient!RPFMUSNN;")
	private Class35 aClass35_2;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "Lclient!MCPCRICF;")
	private Class25 aClass25_1;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "Lclient!WSNKRVXZ;")
	private Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_15;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "I")
	private int anInt999;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "Lclient!WSNKRVXZ;")
	private Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_16;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "Lclient!WSNKRVXZ;")
	private Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_17;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "Lclient!GYXQUUFC;")
	private Class13 aClass13_25;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "Lclient!GYXQUUFC;")
	private Class13 aClass13_26;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "Lclient!GYXQUUFC;")
	private Class13 aClass13_27;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
	private int anInt1001;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "I")
	private int anInt1004;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "I")
	private int anInt1005;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "I")
	private int anInt1006;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
	private int anInt1007;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "I")
	private int anInt1008;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "I")
	private int anInt1009;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "Lclient!VAVAOKUB;")
	private Class42 aClass42_1;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "I")
	private int anInt1011;

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "I")
	private int anInt1014;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "I")
	private int anInt1015;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
	private int anInt1016;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "I")
	private int anInt1017;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "I")
	private int anInt1018;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "Lclient!SSCICQYX;")
	private Class3_Sub1_Sub2_Sub3 aClass3_Sub1_Sub2_Sub3_18;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "Lclient!SSCICQYX;")
	private Class3_Sub1_Sub2_Sub3 aClass3_Sub1_Sub2_Sub3_19;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "Lclient!SSCICQYX;")
	private Class3_Sub1_Sub2_Sub3 aClass3_Sub1_Sub2_Sub3_20;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "I")
	private int anInt1019;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "I")
	private int anInt1020;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "I")
	private int anInt1022;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "I")
	private int anInt1023;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "I")
	private int anInt1025;

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "I")
	private int anInt1026;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "I")
	private int anInt1027;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "I")
	private int anInt1028;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "I")
	private int anInt1029;

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "I")
	private int anInt1030;

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "I")
	private int anInt1031;

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "I")
	private int anInt1032;

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "I")
	private int anInt1033;

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "I")
	private int anInt1034;

	@OriginalMember(owner = "client!client", name = "Kj", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "Lj", descriptor = "I")
	private int anInt1038;

	@OriginalMember(owner = "client!client", name = "Pj", descriptor = "Lclient!HKGQPBYJ;")
	private Class16_Sub1 aClass16_Sub1_1;

	@OriginalMember(owner = "client!client", name = "Rj", descriptor = "I")
	private int anInt1041;

	@OriginalMember(owner = "client!client", name = "Wj", descriptor = "I")
	private int anInt1044;

	@OriginalMember(owner = "client!client", name = "Xj", descriptor = "I")
	private int anInt1045;

	@OriginalMember(owner = "client!client", name = "Yj", descriptor = "I")
	private int anInt1046;

	@OriginalMember(owner = "client!client", name = "Zj", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!client", name = "ak", descriptor = "I")
	private int anInt1047;

	@OriginalMember(owner = "client!client", name = "jk", descriptor = "I")
	private int anInt1050;

	@OriginalMember(owner = "client!client", name = "kk", descriptor = "I")
	private int anInt1051;

	@OriginalMember(owner = "client!client", name = "lk", descriptor = "I")
	private int anInt1052;

	@OriginalMember(owner = "client!client", name = "mk", descriptor = "Ljava/lang/String;")
	private String aString31;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "[I")
	private int[] anIntArray212 = new int[50];

	@OriginalMember(owner = "client!client", name = "O", descriptor = "I")
	private int anInt818 = 1;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "Z")
	private boolean aBoolean196 = true;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "Z")
	private boolean aBoolean197 = false;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "Lclient!QQMJEFXK;")
	private Class32 aClass32_1 = new Class32();

	@OriginalMember(owner = "client!client", name = "X", descriptor = "[Lclient!WSNKRVXZ;")
	private Class3_Sub1_Sub2_Sub4[] aClass3_Sub1_Sub2_Sub4Array4 = new Class3_Sub1_Sub2_Sub4[32];

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "Z")
	private boolean aBoolean198 = false;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Ljava/lang/String;")
	private String aString17 = "";

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "[I")
	private int[] anIntArray213 = new int[1000];

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
	private int anInt830 = 5;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
	private final int anInt831 = 100;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "[I")
	private int[] anIntArray214 = new int[100];

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
	private int anInt839 = -1;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "Ljava/lang/String;")
	private String aString18 = "";

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
	private int anInt840 = -1;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "Lclient!WNCFPLWV;")
	private Class3_Sub1_Sub4 aClass3_Sub1_Sub4_6 = Class3_Sub1_Sub4.method446();

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "Z")
	private boolean aBoolean201 = false;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "I")
	private int anInt854 = -1;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "I")
	private int anInt856 = 2;

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "I")
	private int anInt857 = 128;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "I")
	private int anInt861 = -1;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "Lclient!WAPMJSJO;")
	private Class44 aClass44_10 = new Class44(aByte38);

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "[Lclient!WSNKRVXZ;")
	private Class3_Sub1_Sub2_Sub4[] aClass3_Sub1_Sub2_Sub4Array5 = new Class3_Sub1_Sub2_Sub4[32];

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "I")
	private int anInt863 = 7759444;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "[I")
	private int[] anIntArray220 = new int[7];

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "I")
	private int anInt867 = 9;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "Ljava/lang/String;")
	private String aString19 = "";

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8 = new String[100];

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "[I")
	private int[] anIntArray221 = new int[100];

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "Z")
	private boolean aBoolean204 = false;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "Z")
	private boolean aBoolean205 = false;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "[I")
	private int[] anIntArray222 = new int[151];

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "Z")
	public boolean aBoolean206 = false;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "I")
	private int anInt882 = -971;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "Z")
	private boolean aBoolean207 = false;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "Z")
	private boolean aBoolean208 = false;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "Z")
	private boolean aBoolean209 = true;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "I")
	private int anInt888 = 78;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "Lclient!WAPMJSJO;")
	private Class44 aClass44_11 = new Class44(aByte38);

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "Z")
	private boolean aBoolean210 = false;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "[Lclient!SSCICQYX;")
	private Class3_Sub1_Sub2_Sub3[] aClass3_Sub1_Sub2_Sub3Array2 = new Class3_Sub1_Sub2_Sub3[2];

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "[J")
	private long[] aLongArray3 = new long[200];

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "[I")
	private int[] anIntArray224 = new int[256];

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "I")
	private int anInt899 = -462;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "I")
	private int anInt900 = -420;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "I")
	private int anInt901 = -438;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "I")
	private int anInt902 = -529;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "I")
	private int anInt904 = -34942;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "[I")
	private int[] anIntArray225 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "[I")
	private int[] anIntArray226 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "Z")
	private boolean aBoolean211 = false;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "I")
	private int anInt905 = -290;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "[Lclient!SSCICQYX;")
	private Class3_Sub1_Sub2_Sub3[] aClass3_Sub1_Sub2_Sub3Array3 = new Class3_Sub1_Sub2_Sub3[100];

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "I")
	private int anInt910 = 547;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
	private int anInt911 = -447;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "[I")
	private int[] anIntArray234 = new int[] { 17, 24, 34, 40 };

	@OriginalMember(owner = "client!client", name = "de", descriptor = "Z")
	private boolean aBoolean212 = false;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "Z")
	private boolean aBoolean213 = false;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "[J")
	private long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!client", name = "je", descriptor = "I")
	private int anInt915 = 4;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "[I")
	private int[] anIntArray237 = new int[5];

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "B")
	private byte aByte39 = 96;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "I")
	private int anInt920 = -1;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "I")
	private int anInt923 = 2;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "Z")
	private boolean aBoolean215 = true;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
	private int anInt924 = 560;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "B")
	private byte aByte40 = 0;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "I")
	private int anInt926 = 2;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "Ljava/lang/String;")
	private String aString22 = "";

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "Ljava/lang/String;")
	private String aString23 = "";

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "I")
	private int anInt927 = 2048;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "I")
	private int anInt928 = 2047;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "[Lclient!WQWDCUWR;")
	private Class3_Sub1_Sub1_Sub4_Sub2[] aClass3_Sub1_Sub1_Sub4_Sub2Array1 = new Class3_Sub1_Sub1_Sub4_Sub2[this.anInt927];

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "[I")
	private int[] anIntArray238 = new int[this.anInt927];

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "[I")
	private int[] anIntArray239 = new int[this.anInt927];

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "[Lclient!WNCFPLWV;")
	private Class3_Sub1_Sub4[] aClass3_Sub1_Sub4Array1 = new Class3_Sub1_Sub4[this.anInt927];

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "[I")
	private int[] anIntArray240 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "[I")
	private int[] anIntArray241 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "Z")
	private boolean aBoolean216 = false;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "[I")
	private int[] anIntArray242 = new int[5];

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "B")
	private byte aByte41 = 113;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "Lclient!WAPMJSJO;")
	private Class44 aClass44_12 = new Class44(aByte38);

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "Z")
	private boolean aBoolean217 = false;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "Z")
	private boolean aBoolean218 = true;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "[Lclient!TUZTEZTO;")
	public Class38[] aClass38Array1 = new Class38[5];

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "[Lclient!WSNKRVXZ;")
	private Class3_Sub1_Sub2_Sub4[] aClass3_Sub1_Sub2_Sub4Array6 = new Class3_Sub1_Sub2_Sub4[1000];

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "B")
	private byte aByte42 = 2;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9 = new String[5];

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "[Z")
	private boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "Z")
	private volatile boolean aBoolean219 = false;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "Z")
	private volatile boolean aBoolean220 = false;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "[I")
	private int[] anIntArray243 = new int[5];

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
	private int anInt940 = -1;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "I")
	private int anInt941 = 2301979;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "Z")
	private volatile boolean aBoolean221 = false;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "I")
	private int anInt944 = 3;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "[Lclient!SSCICQYX;")
	private Class3_Sub1_Sub2_Sub3[] aClass3_Sub1_Sub2_Sub3Array4 = new Class3_Sub1_Sub2_Sub3[13];

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
	private int anInt950 = -868;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "I")
	private int anInt952 = -1;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "B")
	private byte aByte43 = 14;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "I")
	private int anInt954 = 843;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "I")
	private int anInt955 = -1;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "I")
	private int anInt956 = 602;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "[I")
	private int[] anIntArray244 = new int[Class23.anInt272];

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "Z")
	private boolean aBoolean222 = false;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "Ljava/lang/String;")
	private String aString24 = "";

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "B")
	private byte aByte44 = 8;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "[I")
	private int[] anIntArray247 = new int[50];

	@OriginalMember(owner = "client!client", name = "og", descriptor = "I")
	private int anInt961 = -1;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "[I")
	private int[] anIntArray248 = new int[100];

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray10 = new String[100];

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11 = new String[100];

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "Z")
	private boolean aBoolean223 = false;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "[Lclient!WSNKRVXZ;")
	private Class3_Sub1_Sub2_Sub4[] aClass3_Sub1_Sub2_Sub4Array7 = new Class3_Sub1_Sub2_Sub4[32];

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "[Lclient!WSNKRVXZ;")
	private Class3_Sub1_Sub2_Sub4[] aClass3_Sub1_Sub2_Sub4Array8 = new Class3_Sub1_Sub2_Sub4[8];

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
	private int anInt969 = -902;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "Z")
	private boolean aBoolean225 = false;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
	private int anInt975 = 50;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "[I")
	private int[] anIntArray249 = new int[this.anInt975];

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "[I")
	private int[] anIntArray250 = new int[this.anInt975];

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "[I")
	private int[] anIntArray251 = new int[this.anInt975];

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "[I")
	private int[] anIntArray252 = new int[this.anInt975];

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "[I")
	private int[] anIntArray253 = new int[this.anInt975];

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "[I")
	private int[] anIntArray254 = new int[this.anInt975];

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "[I")
	private int[] anIntArray255 = new int[this.anInt975];

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12 = new String[this.anInt975];

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "[I")
	private int[] anIntArray256 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "[Lclient!WSNKRVXZ;")
	private Class3_Sub1_Sub2_Sub4[] aClass3_Sub1_Sub2_Sub4Array9 = new Class3_Sub1_Sub2_Sub4[20];

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "I")
	private int anInt976 = -1;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "B")
	private byte aByte46 = 12;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "Z")
	private boolean aBoolean226 = false;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "[[I")
	private int[][] anIntArrayArray23 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "I")
	private int anInt990 = 1;

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "[B")
	private byte[] aByteArray21 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "I")
	private int anInt991 = 673;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13 = new String[500];

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "[I")
	private int[] anIntArray257 = new int[50];

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray14 = new String[200];

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "I")
	private int anInt994 = 3;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "I")
	private int anInt995 = -1;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "Z")
	private boolean aBoolean227 = false;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "I")
	private int anInt997 = -1;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "I")
	private int anInt998 = -1;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "[I")
	private int[] anIntArray258 = new int[33];

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "Z")
	private boolean aBoolean228 = false;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "[I")
	private final int[] anIntArray259 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "Ljava/lang/String;")
	private String aString27 = "";

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "Ljava/lang/String;")
	private String aString28 = "";

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "Z")
	private boolean aBoolean229 = false;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "[Lclient!FUVVWALN;")
	private Class11[] aClass11Array1 = new Class11[4];

	@OriginalMember(owner = "client!client", name = "si", descriptor = "[I")
	private int[] anIntArray260 = new int[200];

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "Z")
	private boolean aBoolean230 = false;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
	private int anInt1003 = -1;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "[I")
	private int[] anIntArray261 = new int[151];

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "[I")
	private int[] anIntArray262 = new int[Class23.anInt272];

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "Z")
	private boolean aBoolean231 = false;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "Lclient!WNCFPLWV;")
	private Class3_Sub1_Sub4 aClass3_Sub1_Sub4_7 = Class3_Sub1_Sub4.method446();

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7 = new int[4][13][13];

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "Lclient!WNCFPLWV;")
	private Class3_Sub1_Sub4 aClass3_Sub1_Sub4_8 = new Class3_Sub1_Sub4((byte) -58, new byte[5000]);

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "[Lclient!UGARWYIU;")
	private Class3_Sub1_Sub1_Sub4_Sub1[] aClass3_Sub1_Sub1_Sub4_Sub1Array1 = new Class3_Sub1_Sub1_Sub4_Sub1[16384];

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "[I")
	private int[] anIntArray263 = new int[16384];

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "[I")
	private int[] anIntArray265 = new int[Class23.anInt272];

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "[I")
	private int[] anIntArray266 = new int[9];

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "[I")
	private int[] anIntArray267 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "Z")
	private boolean aBoolean232 = true;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "B")
	private byte aByte47 = 34;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "[I")
	private int[] anIntArray268 = new int[5];

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "Z")
	private boolean aBoolean233 = false;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "[Lclient!WSNKRVXZ;")
	private Class3_Sub1_Sub2_Sub4[] aClass3_Sub1_Sub2_Sub4Array10 = new Class3_Sub1_Sub2_Sub4[100];

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "I")
	private int anInt1021 = 790;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "Z")
	private boolean aBoolean234 = false;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "I")
	private int anInt1024 = 9;

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "[I")
	private int[] anIntArray269 = new int[500];

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "[I")
	private int[] anIntArray270 = new int[500];

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "[I")
	private int[] anIntArray271 = new int[500];

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "[I")
	private int[] anIntArray272 = new int[500];

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "I")
	private int anInt1035 = -1;

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "I")
	private int anInt1036 = -1;

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "[I")
	public int[] anIntArray273 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "Ljava/lang/String;")
	private String aString29 = "";

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "Z")
	private boolean aBoolean235 = true;

	@OriginalMember(owner = "client!client", name = "Mj", descriptor = "[Z")
	private boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Nj", descriptor = "I")
	private int anInt1039 = -521;

	@OriginalMember(owner = "client!client", name = "Oj", descriptor = "I")
	private int anInt1040 = 987;

	@OriginalMember(owner = "client!client", name = "Qj", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Sj", descriptor = "I")
	private int anInt1042 = 5063219;

	@OriginalMember(owner = "client!client", name = "Uj", descriptor = "Z")
	private boolean aBoolean236 = false;

	@OriginalMember(owner = "client!client", name = "Vj", descriptor = "Ljava/lang/String;")
	private String aString30 = "";

	@OriginalMember(owner = "client!client", name = "bk", descriptor = "[I")
	private int[] anIntArray274 = new int[5];

	@OriginalMember(owner = "client!client", name = "ck", descriptor = "I")
	private int anInt1048 = 916;

	@OriginalMember(owner = "client!client", name = "dk", descriptor = "Lclient!WNCFPLWV;")
	private Class3_Sub1_Sub4 aClass3_Sub1_Sub4_9 = Class3_Sub1_Sub4.method446();

	@OriginalMember(owner = "client!client", name = "ek", descriptor = "[[[Lclient!WAPMJSJO;")
	private Class44[][][] aClass44ArrayArrayArray1 = new Class44[4][104][104];

	@OriginalMember(owner = "client!client", name = "fk", descriptor = "[I")
	private int[] anIntArray275 = new int[2000];

	@OriginalMember(owner = "client!client", name = "gk", descriptor = "I")
	private int anInt1049 = 3353893;

	@OriginalMember(owner = "client!client", name = "hk", descriptor = "[[I")
	private int[][] anIntArrayArray25 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "ik", descriptor = "[I")
	private int[] anIntArray276 = new int[33];

	@OriginalMember(owner = "client!client", name = "ok", descriptor = "Z")
	private boolean aBoolean237 = false;

	static {
		@Pc(6) int local6 = 2;
		@Pc(8) int local8;
		for (local8 = 0; local8 < 32; local8++) {
			anIntArray219[local8] = local6 - 1;
			local6 += local6;
		}
		aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
		anInt864 = 10;
		aBoolean202 = true;
		anIntArray223 = new int[99];
		local6 = 0;
		for (local8 = 0; local8 < 99; local8++) {
			@Pc(44) int local44 = local8 + 1;
			@Pc(57) int local57 = (int) ((double) local44 + Math.pow(2.0D, (double) local44 / 7.0D) * 300.0D);
			local6 += local57;
			anIntArray223[local8] = local6 / 4;
		}
		aByte38 = -126;
		anIntArrayArray22 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
		aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		aByte45 = -45;
		anInt988 = 576;
		aString26 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		anInt1010 = -420;
		anIntArray264 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private static void method622() {
		try {
			Class25.aBoolean85 = false;
			Class3_Sub1_Sub2_Sub2.aBoolean40 = false;
			aBoolean203 = false;
			Class47.aBoolean179 = false;
			Class8.aBoolean27 = false;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("26241, " + -23613 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private static void method632() {
		try {
			Class25.aBoolean85 = true;
			Class3_Sub1_Sub2_Sub2.aBoolean40 = true;
			aBoolean203 = true;
			Class47.aBoolean179 = true;
			Class8.aBoolean27 = true;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("40677, " + 0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BII)Ljava/lang/String;")
	private static String method671(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (aByte45 != -45) {
				throw new NullPointerException();
			}
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
			signlink.reporterror("71071, " + -45 + ", " + arg0 + ", " + arg1 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(II)Ljava/lang/String;")
	private static String method674(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("53496, " + arg0 + ", " + -306 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(II)Ljava/lang/String;")
	private static String method685(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) String local4 = String.valueOf(arg0);
			for (@Pc(18) int local18 = local4.length() - 3; local18 > 0; local18 -= 3) {
				local4 = local4.substring(0, local18) + "," + local4.substring(local18);
			}
			if (local4.length() > 8) {
				local4 = "@gre@" + local4.substring(0, local4.length() - 8) + " million @whi@(" + local4 + ")";
			} else if (local4.length() > 4) {
				local4 = "@cya@" + local4.substring(0, local4.length() - 4) + "K @whi@(" + local4 + ")";
			}
			return " " + local4;
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("41472, " + -327 + ", " + arg0 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 373);
			if (arg0.length == 5) {
				anInt864 = Integer.parseInt(arg0[0]);
				anInt865 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method632();
				} else if (arg0[2].equals("highmem")) {
					method622();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean202 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean202 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt1056 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method575();
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method588() {
		try {
			@Pc(19) int local19;
			@Pc(26) int local26;
			if (this.anInt1019 == 0) {
				local19 = super.anInt800 / 2 - 80;
				local26 = super.anInt801 / 2 + 20;
				local26 += 20;
				if (super.anInt809 == 1 && super.anInt810 >= local19 - 75 && super.anInt810 <= local19 + 75 && super.anInt811 >= local26 - 20 && super.anInt811 <= local26 + 20) {
					this.anInt1019 = 3;
					this.anInt960 = 0;
				}
				local19 = super.anInt800 / 2 + 80;
				if (super.anInt809 == 1 && super.anInt810 >= local19 - 75 && super.anInt810 <= local19 + 75 && super.anInt811 >= local26 - 20 && super.anInt811 <= local26 + 20) {
					this.aString27 = "";
					this.aString28 = "Enter your username & password.";
					this.anInt1019 = 2;
					this.anInt960 = 0;
				}
			} else if (this.anInt1019 == 2) {
				local19 = super.anInt801 / 2 - 40;
				local19 += 30;
				local19 += 25;
				if (super.anInt809 == 1 && super.anInt811 >= local19 - 15 && super.anInt811 < local19) {
					this.anInt960 = 0;
				}
				local19 += 15;
				if (super.anInt809 == 1 && super.anInt811 >= local19 - 15 && super.anInt811 < local19) {
					this.anInt960 = 1;
				}
				local19 += 15;
				local26 = super.anInt800 / 2 - 80;
				@Pc(172) int local172 = super.anInt801 / 2 + 50;
				@Pc(173) int local173 = local172 + 20;
				if (super.anInt809 == 1 && super.anInt810 >= local26 - 75 && super.anInt810 <= local26 + 75 && super.anInt811 >= local173 - 20 && super.anInt811 <= local173 + 20) {
					this.anInt1001 = 0;
					this.method606(this.aString22, this.aString23, false);
					if (this.aBoolean206) {
						return;
					}
				}
				local26 = super.anInt800 / 2 + 80;
				if (super.anInt809 == 1 && super.anInt810 >= local26 - 75 && super.anInt810 <= local26 + 75 && super.anInt811 >= local173 - 20 && super.anInt811 <= local173 + 20) {
					this.anInt1019 = 0;
					this.aString22 = "";
					this.aString23 = "";
				}
				while (true) {
					while (true) {
						@Pc(264) int local264 = this.method579(this.anInt1040);
						if (local264 == -1) {
							return;
						}
						@Pc(269) boolean local269 = false;
						for (@Pc(271) int local271 = 0; local271 < aString26.length(); local271++) {
							if (local264 == aString26.charAt(local271)) {
								local269 = true;
								break;
							}
						}
						if (this.anInt960 == 0) {
							if (local264 == 8 && this.aString22.length() > 0) {
								this.aString22 = this.aString22.substring(0, this.aString22.length() - 1);
							}
							if (local264 == 9 || local264 == 10 || local264 == 13) {
								this.anInt960 = 1;
							}
							if (local269) {
								this.aString22 = this.aString22 + (char) local264;
							}
							if (this.aString22.length() > 12) {
								this.aString22 = this.aString22.substring(0, 12);
							}
						} else if (this.anInt960 == 1) {
							if (local264 == 8 && this.aString23.length() > 0) {
								this.aString23 = this.aString23.substring(0, this.aString23.length() - 1);
							}
							if (local264 == 9 || local264 == 10 || local264 == 13) {
								this.anInt960 = 0;
							}
							if (local269) {
								this.aString23 = this.aString23 + (char) local264;
							}
							if (this.aString23.length() > 20) {
								this.aString23 = this.aString23.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt1019 == 3) {
				local19 = super.anInt800 / 2;
				local26 = super.anInt801 / 2 + 50;
				@Pc(428) int local428 = local26 + 20;
				if (super.anInt809 == 1 && super.anInt810 >= local19 - 75 && super.anInt810 <= local19 + 75 && super.anInt811 >= local428 - 20 && super.anInt811 <= local428 + 20) {
					this.anInt1019 = 0;
					return;
				}
			}
		} catch (@Pc(461) RuntimeException local461) {
			signlink.reporterror("82745, " + 6 + ", " + local461.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIBLclient!BJGOYLYN;)V")
	private void method589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class2 arg3) {
		try {
			if (this.anInt1045 < 400) {
				if (arg3.anIntArray3 != null) {
					arg3 = arg3.method6();
				}
				if (arg3 != null && arg3.aBoolean2) {
					@Pc(23) String local23 = arg3.aString1;
					if (arg3.anInt24 != 0) {
						local23 = local23 + method671(arg3.anInt24, aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt753) + " (level-" + arg3.anInt24 + ")";
					}
					if (this.anInt889 == 1) {
						this.aStringArray13[this.anInt1045] = "Use " + this.aString20 + " with @yel@" + local23;
						this.anIntArray271[this.anInt1045] = 625;
						this.anIntArray272[this.anInt1045] = arg2;
						this.anIntArray269[this.anInt1045] = arg1;
						this.anIntArray270[this.anInt1045] = arg0;
						this.anInt1045++;
					} else if (this.anInt1050 != 1) {
						@Pc(166) int local166;
						if (arg3.aStringArray1 != null) {
							for (local166 = 4; local166 >= 0; local166--) {
								if (arg3.aStringArray1[local166] != null && !arg3.aStringArray1[local166].equalsIgnoreCase("attack")) {
									this.aStringArray13[this.anInt1045] = arg3.aStringArray1[local166] + " @yel@" + local23;
									if (local166 == 0) {
										this.anIntArray271[this.anInt1045] = 884;
									}
									if (local166 == 1) {
										this.anIntArray271[this.anInt1045] = 316;
									}
									if (local166 == 2) {
										this.anIntArray271[this.anInt1045] = 369;
									}
									if (local166 == 3) {
										this.anIntArray271[this.anInt1045] = 825;
									}
									if (local166 == 4) {
										this.anIntArray271[this.anInt1045] = 708;
									}
									this.anIntArray272[this.anInt1045] = arg2;
									this.anIntArray269[this.anInt1045] = arg1;
									this.anIntArray270[this.anInt1045] = arg0;
									this.anInt1045++;
								}
							}
						}
						if (arg3.aStringArray1 != null) {
							for (local166 = 4; local166 >= 0; local166--) {
								if (arg3.aStringArray1[local166] != null && arg3.aStringArray1[local166].equalsIgnoreCase("attack")) {
									@Pc(290) short local290 = 0;
									if (arg3.anInt24 > aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt753) {
										local290 = 2000;
									}
									this.aStringArray13[this.anInt1045] = arg3.aStringArray1[local166] + " @yel@" + local23;
									if (local166 == 0) {
										this.anIntArray271[this.anInt1045] = local290 + 884;
									}
									if (local166 == 1) {
										this.anIntArray271[this.anInt1045] = local290 + 316;
									}
									if (local166 == 2) {
										this.anIntArray271[this.anInt1045] = local290 + 369;
									}
									if (local166 == 3) {
										this.anIntArray271[this.anInt1045] = local290 + 825;
									}
									if (local166 == 4) {
										this.anIntArray271[this.anInt1045] = local290 + 708;
									}
									this.anIntArray272[this.anInt1045] = arg2;
									this.anIntArray269[this.anInt1045] = arg1;
									this.anIntArray270[this.anInt1045] = arg0;
									this.anInt1045++;
								}
							}
						}
						this.aStringArray13[this.anInt1045] = "Examine @yel@" + local23;
						this.anIntArray271[this.anInt1045] = 1250;
						this.anIntArray272[this.anInt1045] = arg2;
						this.anIntArray269[this.anInt1045] = arg1;
						this.anIntArray270[this.anInt1045] = arg0;
						this.anInt1045++;
					} else if ((this.anInt1052 & 0x2) == 2) {
						this.aStringArray13[this.anInt1045] = this.aString31 + " @yel@" + local23;
						this.anIntArray271[this.anInt1045] = 959;
						this.anIntArray272[this.anInt1045] = arg2;
						this.anIntArray269[this.anInt1045] = arg1;
						this.anIntArray270[this.anInt1045] = arg0;
						this.anInt1045++;
						return;
					}
				}
			}
		} catch (@Pc(440) RuntimeException local440) {
			signlink.reporterror("94697, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 2 + ", " + arg3 + ", " + local440.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	private boolean method590(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(7) int local7 = 0; local7 < this.anInt907; local7++) {
				if (arg0.equalsIgnoreCase(this.aStringArray14[local7])) {
					return true;
				}
			}
			@Pc(28) boolean local28 = false;
			return arg0.equalsIgnoreCase(aClass3_Sub1_Sub1_Sub4_Sub2_1.aString16);
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("9898, " + arg0 + ", " + arg1 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)Z")
	private boolean method591() {
		try {
			if (this.aClass42_1 == null) {
				return false;
			}
			@Pc(432) String local432;
			@Pc(243) int local243;
			try {
				@Pc(20) int local20 = this.aClass42_1.method430();
				if (local20 == 0) {
					return false;
				}
				if (this.anInt871 == -1) {
					this.aClass42_1.method431(this.aClass3_Sub1_Sub4_6.aByteArray20, 0, 1);
					this.anInt871 = this.aClass3_Sub1_Sub4_6.aByteArray20[0] & 0xFF;
					if (this.aClass21_2 != null) {
						this.anInt871 = this.anInt871 - this.aClass21_2.method235() & 0xFF;
					}
					this.anInt870 = Class20.anIntArray53[this.anInt871];
					local20--;
				}
				if (this.anInt870 == -1) {
					if (local20 <= 0) {
						return false;
					}
					this.aClass42_1.method431(this.aClass3_Sub1_Sub4_6.aByteArray20, 0, 1);
					this.anInt870 = this.aClass3_Sub1_Sub4_6.aByteArray20[0] & 0xFF;
					local20--;
				}
				if (this.anInt870 == -2) {
					if (local20 <= 1) {
						return false;
					}
					this.aClass42_1.method431(this.aClass3_Sub1_Sub4_6.aByteArray20, 0, 2);
					this.aClass3_Sub1_Sub4_6.anInt666 = 0;
					this.anInt870 = this.aClass3_Sub1_Sub4_6.method460();
					local20 -= 2;
				}
				if (local20 < this.anInt870) {
					return false;
				}
				this.aClass3_Sub1_Sub4_6.anInt666 = 0;
				this.aClass42_1.method431(this.aClass3_Sub1_Sub4_6.aByteArray20, 0, this.anInt870);
				this.anInt872 = 0;
				this.anInt837 = this.anInt836;
				this.anInt836 = this.anInt835;
				this.anInt835 = this.anInt871;
				@Pc(165) int local165;
				if (this.anInt871 == 189) {
					local165 = this.aClass3_Sub1_Sub4_6.method486(255);
					Class32.method316(local165).anInt413 = 3;
					if (aClass3_Sub1_Sub1_Sub4_Sub2_1.aClass2_2 == null) {
						Class32.method316(local165).anInt414 = (aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray180[0] << 25) + (aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray180[4] << 20) + (aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray179[0] << 15) + (aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray179[8] << 10) + (aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray179[11] << 5) + aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray179[1];
					} else {
						Class32.method316(local165).anInt414 = (int) (aClass3_Sub1_Sub1_Sub4_Sub2_1.aClass2_2.aLong1 + 305419896L);
					}
					this.anInt871 = -1;
					return true;
				}
				@Pc(248) int local248;
				if (this.anInt871 == 80) {
					local165 = this.aClass3_Sub1_Sub4_6.method461();
					local243 = this.aClass3_Sub1_Sub4_6.method485((byte) 6);
					local248 = this.aClass3_Sub1_Sub4_6.method489();
					@Pc(251) Class32 local251 = Class32.method316(local243);
					local251.anInt444 = local165;
					local251.anInt433 = local248;
					this.anInt871 = -1;
					return true;
				}
				@Pc(275) String local275;
				if (this.anInt871 == 143) {
					local165 = this.aClass3_Sub1_Sub4_6.method487();
					local275 = this.aClass3_Sub1_Sub4_6.method465();
					Class32.method316(local165).aString9 = local275;
					@Pc(287) int local287 = this.anIntArray256[this.anInt994];
					if (Class32.method316(local165).anInt424 == local287) {
						this.aBoolean207 = true;
					}
					this.anInt871 = -1;
					return true;
				}
				@Pc(308) Class32 local308;
				if (this.anInt871 == 29) {
					local165 = this.aClass3_Sub1_Sub4_6.method487();
					local308 = Class32.method316(local165);
					for (local248 = 0; local248 < local308.anIntArray101.length; local248++) {
						local308.anIntArray101[local248] = -1;
						local308.anIntArray101[local248] = 0;
					}
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 147) {
					local165 = this.aClass3_Sub1_Sub4_6.method460();
					@Pc(351) boolean local351 = this.aClass3_Sub1_Sub4_6.method477() == 1;
					Class32.method316(local165).aBoolean101 = local351;
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 46) {
					if (this.anInt994 == 12) {
						this.aBoolean207 = true;
					}
					this.anInt951 = this.aClass3_Sub1_Sub4_6.method458();
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 139) {
					this.anInt881 = this.aClass3_Sub1_Sub4_6.method458();
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 214) {
					local165 = this.aClass3_Sub1_Sub4_6.method488((byte) 8);
					if (local165 != this.anInt997) {
						this.method613(this.anInt997);
						this.anInt997 = local165;
					}
					this.aBoolean197 = true;
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 7) {
					local432 = this.aClass3_Sub1_Sub4_6.method465();
					local243 = this.aClass3_Sub1_Sub4_6.method458();
					local248 = this.aClass3_Sub1_Sub4_6.method478();
					if (local243 >= 1 && local243 <= 5) {
						if (local432.equalsIgnoreCase("null")) {
							local432 = null;
						}
						this.aStringArray9[local243 - 1] = local432;
						this.aBooleanArray11[local243 - 1] = local248 == 0;
					}
					this.anInt871 = -1;
					return true;
				}
				@Pc(500) int local500;
				@Pc(504) int local504;
				if (this.anInt871 == 184) {
					this.aBoolean207 = true;
					local165 = this.aClass3_Sub1_Sub4_6.method460();
					local308 = Class32.method316(local165);
					while (this.aClass3_Sub1_Sub4_6.anInt666 < this.anInt870) {
						local248 = this.aClass3_Sub1_Sub4_6.method472();
						local500 = this.aClass3_Sub1_Sub4_6.method460();
						local504 = this.aClass3_Sub1_Sub4_6.method458();
						if (local504 == 255) {
							local504 = this.aClass3_Sub1_Sub4_6.method463();
						}
						if (local248 >= 0 && local248 < local308.anIntArray101.length) {
							local308.anIntArray101[local248] = local500;
							local308.anIntArray97[local248] = local504;
						}
					}
					this.anInt871 = -1;
					return true;
				}
				@Pc(695) int local695;
				@Pc(662) int local662;
				@Pc(548) long local548;
				if (this.anInt871 == 237) {
					local548 = this.aClass3_Sub1_Sub4_6.method464();
					local248 = this.aClass3_Sub1_Sub4_6.method458();
					@Pc(558) String local558 = Class15.method202(Class15.method199(local548));
					for (local504 = 0; local504 < this.anInt907; local504++) {
						if (local548 == this.aLongArray3[local504]) {
							if (this.anIntArray260[local504] != local248) {
								this.anIntArray260[local504] = local248;
								this.aBoolean207 = true;
								if (local248 > 0) {
									this.method603(5, "", local558 + " has logged in.");
								}
								if (local248 == 0) {
									this.method603(5, "", local558 + " has logged out.");
								}
							}
							local558 = null;
							break;
						}
					}
					if (local558 != null && this.anInt907 < 200) {
						this.aLongArray3[this.anInt907] = local548;
						this.aStringArray14[this.anInt907] = local558;
						this.anIntArray260[this.anInt907] = local248;
						this.anInt907++;
						this.aBoolean207 = true;
					}
					@Pc(656) boolean local656 = false;
					while (!local656) {
						local656 = true;
						for (local662 = 0; local662 < this.anInt907 - 1; local662++) {
							if (this.anIntArray260[local662] != anInt864 && this.anIntArray260[local662 + 1] == anInt864 || this.anIntArray260[local662] == 0 && this.anIntArray260[local662 + 1] != 0) {
								local695 = this.anIntArray260[local662];
								this.anIntArray260[local662] = this.anIntArray260[local662 + 1];
								this.anIntArray260[local662 + 1] = local695;
								@Pc(717) String local717 = this.aStringArray14[local662];
								this.aStringArray14[local662] = this.aStringArray14[local662 + 1];
								this.aStringArray14[local662 + 1] = local717;
								@Pc(739) long local739 = this.aLongArray3[local662];
								this.aLongArray3[local662] = this.aLongArray3[local662 + 1];
								this.aLongArray3[local662 + 1] = local739;
								this.aBoolean207 = true;
								local656 = false;
							}
						}
					}
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 17) {
					local165 = this.aClass3_Sub1_Sub4_6.method461();
					if (local165 >= 0) {
						this.method673(local165);
					}
					if (local165 != this.anInt995) {
						this.method613(this.anInt995);
						this.anInt995 = local165;
					}
					this.anInt871 = -1;
					return true;
				}
				@Pc(823) Class32 local823;
				if (this.anInt871 == 190) {
					local165 = this.aClass3_Sub1_Sub4_6.method488((byte) 8);
					local243 = this.aClass3_Sub1_Sub4_6.method487();
					local823 = Class32.method316(local243);
					if (local823.anInt415 != local165 || local165 == -1) {
						local823.anInt415 = local165;
						local823.anInt437 = 0;
						local823.anInt431 = 0;
					}
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 186) {
					@Pc(853) byte local853 = this.aClass3_Sub1_Sub4_6.method480();
					local243 = this.aClass3_Sub1_Sub4_6.method486(255);
					this.anIntArray275[local243] = local853;
					if (this.anIntArray273[local243] != local853) {
						this.anIntArray273[local243] = local853;
						this.method652(local243);
						this.aBoolean207 = true;
						if (this.anInt997 != -1) {
							this.aBoolean197 = true;
						}
					}
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 18) {
					this.anInt896 = this.aClass3_Sub1_Sub4_6.method478();
					this.anInt895 = this.aClass3_Sub1_Sub4_6.method478();
					for (local165 = this.anInt895; local165 < this.anInt895 + 8; local165++) {
						for (local243 = this.anInt896; local243 < this.anInt896 + 8; local243++) {
							if (this.aClass44ArrayArrayArray1[this.anInt894][local165][local243] != null) {
								this.aClass44ArrayArrayArray1[this.anInt894][local165][local243] = null;
								this.method669(local165, local243);
							}
						}
					}
					for (@Pc(962) Class3_Sub2 local962 = (Class3_Sub2) this.aClass44_12.method439(); local962 != null; local962 = (Class3_Sub2) this.aClass44_12.method441()) {
						if (local962.anInt258 >= this.anInt895 && local962.anInt258 < this.anInt895 + 8 && local962.anInt259 >= this.anInt896 && local962.anInt259 < this.anInt896 + 8 && local962.anInt256 == this.anInt894) {
							local962.anInt260 = 0;
						}
					}
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 137) {
					this.anInt931 = 0;
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 250) {
					local165 = this.aClass3_Sub1_Sub4_6.method486(255);
					local243 = this.aClass3_Sub1_Sub4_6.method476();
					if (local165 == 65535) {
						local165 = -1;
					}
					if (this.anIntArray256[local243] != local165) {
						this.method613(this.anIntArray256[local243]);
						this.anIntArray256[local243] = local165;
					}
					this.aBoolean207 = true;
					this.aBoolean208 = true;
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 207) {
					this.anInt921 = this.aClass3_Sub1_Sub4_6.method487();
					this.anInt1015 = this.aClass3_Sub1_Sub4_6.method485((byte) 6);
					this.anInt992 = this.aClass3_Sub1_Sub4_6.method487();
					this.anInt986 = this.aClass3_Sub1_Sub4_6.method485((byte) 6);
					this.anInt853 = this.aClass3_Sub1_Sub4_6.method492();
					this.aClass3_Sub1_Sub4_6.method486(255);
					this.anInt903 = this.aClass3_Sub1_Sub4_6.method486(255);
					this.anInt1025 = this.aClass3_Sub1_Sub4_6.method485((byte) 6);
					this.anInt843 = this.aClass3_Sub1_Sub4_6.method485((byte) 6);
					this.aClass3_Sub1_Sub4_6.method477();
					this.anInt885 = this.aClass3_Sub1_Sub4_6.method460();
					signlink.dnslookup(Class15.method201(this.anInt853));
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 62) {
					this.anInt908 = this.aClass3_Sub1_Sub4_6.method458();
					this.aBoolean207 = true;
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 255) {
					local165 = this.aClass3_Sub1_Sub4_6.method460();
					local243 = this.aClass3_Sub1_Sub4_6.method485((byte) 6);
					this.method673(local165);
					if (local243 != -1) {
						this.method673(local243);
					}
					if (this.anInt961 != -1) {
						this.method613(this.anInt961);
						this.anInt961 = -1;
					}
					if (this.anInt920 != -1) {
						this.method613(this.anInt920);
						this.anInt920 = -1;
					}
					if (this.anInt840 != -1) {
						this.method613(this.anInt840);
						this.anInt840 = -1;
					}
					if (this.anInt998 != local165) {
						this.method613(this.anInt998);
						this.anInt998 = local165;
					}
					if (this.anInt955 != local165) {
						this.method613(this.anInt955);
						this.anInt955 = local243;
					}
					this.anInt1020 = 0;
					this.aBoolean205 = false;
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 236) {
					local165 = this.aClass3_Sub1_Sub4_6.method460();
					local243 = this.aClass3_Sub1_Sub4_6.method493(this.anInt991);
					this.anIntArray275[local165] = local243;
					if (this.anIntArray273[local165] != local243) {
						this.anIntArray273[local165] = local243;
						this.method652(local165);
						this.aBoolean207 = true;
						if (this.anInt997 != -1) {
							this.aBoolean197 = true;
						}
					}
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 231) {
					for (local165 = 0; local165 < this.anIntArray273.length; local165++) {
						if (this.anIntArray273[local165] != this.anIntArray275[local165]) {
							this.anIntArray273[local165] = this.anIntArray275[local165];
							this.method652(local165);
							this.aBoolean207 = true;
						}
					}
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 64) {
					this.anInt1003 = this.aClass3_Sub1_Sub4_6.method460();
					this.anInt820 = this.aClass3_Sub1_Sub4_6.method458();
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 192) {
					local165 = this.aClass3_Sub1_Sub4_6.method487();
					local243 = this.aClass3_Sub1_Sub4_6.method460();
					Class32.method316(local165).anInt413 = 2;
					Class32.method316(local165).anInt414 = local243;
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 134) {
					this.anInt896 = this.aClass3_Sub1_Sub4_6.method458();
					this.anInt895 = this.aClass3_Sub1_Sub4_6.method478();
					while (this.aClass3_Sub1_Sub4_6.anInt666 < this.anInt870) {
						local165 = this.aClass3_Sub1_Sub4_6.method458();
						this.method704(local165, this.aClass3_Sub1_Sub4_6);
					}
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 59) {
					local165 = this.aClass3_Sub1_Sub4_6.method460();
					this.method673(local165);
					if (this.anInt840 != -1) {
						this.method613(this.anInt840);
						this.anInt840 = -1;
						this.aBoolean197 = true;
					}
					if (this.anInt998 != -1) {
						this.method613(this.anInt998);
						this.anInt998 = -1;
						this.aBoolean210 = true;
					}
					if (this.anInt955 != -1) {
						this.method613(this.anInt955);
						this.anInt955 = -1;
					}
					if (this.anInt961 != -1) {
						this.method613(this.anInt961);
						this.anInt961 = -1;
					}
					if (this.anInt920 != local165) {
						this.method613(this.anInt920);
						this.anInt920 = local165;
					}
					if (this.anInt1020 != 0) {
						this.anInt1020 = 0;
						this.aBoolean197 = true;
					}
					this.aBoolean207 = true;
					this.aBoolean208 = true;
					this.aBoolean205 = false;
					this.anInt871 = -1;
					return true;
				}
				@Pc(1553) boolean local1553;
				@Pc(1555) int local1555;
				@Pc(1622) String local1622;
				if (this.anInt871 == 217) {
					local548 = this.aClass3_Sub1_Sub4_6.method464();
					local248 = this.aClass3_Sub1_Sub4_6.method463();
					local500 = this.aClass3_Sub1_Sub4_6.method458();
					local1553 = false;
					for (local1555 = 0; local1555 < 100; local1555++) {
						if (this.anIntArray214[local1555] == local248) {
							local1553 = true;
							break;
						}
					}
					if (local500 <= 1) {
						for (local662 = 0; local662 < this.anInt1046; local662++) {
							if (this.aLongArray4[local662] == local548) {
								local1553 = true;
								break;
							}
						}
					}
					if (!local1553 && this.anInt841 == 0) {
						try {
							this.anIntArray214[this.anInt984] = local248;
							this.anInt984 = (this.anInt984 + 1) % 100;
							local1622 = Class22.method238(this.anInt870 - 13, this.aClass3_Sub1_Sub4_6);
							if (local500 != 3) {
								local1622 = Class14.method170(local1622);
							}
							if (local500 == 2 || local500 == 3) {
								this.method603(7, "@cr2@" + Class15.method202(Class15.method199(local548)), local1622);
							} else if (local500 == 1) {
								this.method603(7, "@cr1@" + Class15.method202(Class15.method199(local548)), local1622);
							} else {
								this.method603(3, Class15.method202(Class15.method199(local548)), local1622);
							}
						} catch (@Pc(1686) Exception local1686) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 168) {
					this.aBoolean207 = true;
					local165 = this.aClass3_Sub1_Sub4_6.method476();
					local243 = this.aClass3_Sub1_Sub4_6.method476();
					local248 = this.aClass3_Sub1_Sub4_6.method463();
					this.anIntArray265[local165] = local248;
					this.anIntArray262[local165] = local243;
					this.anIntArray244[local165] = 1;
					for (local500 = 0; local500 < 98; local500++) {
						if (local248 >= anIntArray223[local500]) {
							this.anIntArray244[local165] = local500 + 2;
						}
					}
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 203 || this.anInt871 == 89) {
					local165 = this.anInt912;
					local243 = this.anInt913;
					if (this.anInt871 == 203) {
						local165 = this.aClass3_Sub1_Sub4_6.method485((byte) 6);
						local243 = this.aClass3_Sub1_Sub4_6.method486(255);
						this.aBoolean228 = false;
					}
					if (this.anInt871 == 89) {
						local243 = this.aClass3_Sub1_Sub4_6.method486(255);
						this.aClass3_Sub1_Sub4_6.method468(255);
						local248 = 0;
						while (true) {
							if (local248 >= 4) {
								this.aClass3_Sub1_Sub4_6.method470();
								local165 = this.aClass3_Sub1_Sub4_6.method487();
								this.aBoolean228 = true;
								break;
							}
							for (local500 = 0; local500 < 13; local500++) {
								for (local504 = 0; local504 < 13; local504++) {
									local1555 = this.aClass3_Sub1_Sub4_6.method469(1);
									if (local1555 == 1) {
										this.anIntArrayArrayArray7[local248][local500][local504] = this.aClass3_Sub1_Sub4_6.method469(26);
									} else {
										this.anIntArrayArrayArray7[local248][local500][local504] = -1;
									}
								}
							}
							local248++;
						}
					}
					if (this.anInt912 == local165 && this.anInt913 == local243 && this.anInt1044 == 2) {
						this.anInt871 = -1;
						return true;
					}
					this.anInt912 = local165;
					this.anInt913 = local243;
					this.anInt946 = (this.anInt912 - 6) * 8;
					this.anInt947 = (this.anInt913 - 6) * 8;
					this.aBoolean227 = false;
					if ((this.anInt912 / 8 == 48 || this.anInt912 / 8 == 49) && this.anInt913 / 8 == 48) {
						this.aBoolean227 = true;
					}
					if (this.anInt912 / 8 == 48 && this.anInt913 / 8 == 148) {
						this.aBoolean227 = true;
					}
					this.anInt1044 = 1;
					this.aLong32 = System.currentTimeMillis();
					this.method609("Loading - please wait.", null);
					if (this.anInt871 == 203) {
						local248 = 0;
						local500 = (this.anInt912 - 6) / 8;
						label1208: while (true) {
							if (local500 > (this.anInt912 + 6) / 8) {
								this.aByteArrayArray6 = new byte[local248][];
								this.aByteArrayArray5 = new byte[local248][];
								this.anIntArray231 = new int[local248];
								this.anIntArray232 = new int[local248];
								this.anIntArray233 = new int[local248];
								local248 = 0;
								local504 = (this.anInt912 - 6) / 8;
								while (true) {
									if (local504 > (this.anInt912 + 6) / 8) {
										break label1208;
									}
									for (local1555 = (this.anInt913 - 6) / 8; local1555 <= (this.anInt913 + 6) / 8; local1555++) {
										this.anIntArray231[local248] = (local504 << 8) + local1555;
										if (this.aBoolean227 && (local1555 == 49 || local1555 == 149 || local1555 == 147 || local504 == 50 || local504 == 49 && local1555 == 47)) {
											this.anIntArray232[local248] = -1;
											this.anIntArray233[local248] = -1;
											local248++;
										} else {
											local662 = this.anIntArray232[local248] = this.aClass16_Sub1_1.method211(local504, 0, local1555);
											if (local662 != -1) {
												this.aClass16_Sub1_1.method222(3, local662);
											}
											local695 = this.anIntArray233[local248] = this.aClass16_Sub1_1.method211(local504, 1, local1555);
											if (local695 != -1) {
												this.aClass16_Sub1_1.method222(3, local695);
											}
											local248++;
										}
									}
									local504++;
								}
							}
							for (local504 = (this.anInt913 - 6) / 8; local504 <= (this.anInt913 + 6) / 8; local504++) {
								local248++;
							}
							local500++;
						}
					}
					if (this.anInt871 == 89) {
						local248 = 0;
						@Pc(2153) int[] local2153 = new int[676];
						local504 = 0;
						label1169: while (true) {
							@Pc(2183) int local2183;
							@Pc(2189) int local2189;
							@Pc(2199) int local2199;
							if (local504 >= 4) {
								this.aByteArrayArray6 = new byte[local248][];
								this.aByteArrayArray5 = new byte[local248][];
								this.anIntArray231 = new int[local248];
								this.anIntArray232 = new int[local248];
								this.anIntArray233 = new int[local248];
								local1555 = 0;
								while (true) {
									if (local1555 >= local248) {
										break label1169;
									}
									local662 = this.anIntArray231[local1555] = local2153[local1555];
									local695 = local662 >> 8 & 0xFF;
									local2183 = local662 & 0xFF;
									local2189 = this.anIntArray232[local1555] = this.aClass16_Sub1_1.method211(local695, 0, local2183);
									if (local2189 != -1) {
										this.aClass16_Sub1_1.method222(3, local2189);
									}
									local2199 = this.anIntArray233[local1555] = this.aClass16_Sub1_1.method211(local695, 1, local2183);
									if (local2199 != -1) {
										this.aClass16_Sub1_1.method222(3, local2199);
									}
									local1555++;
								}
							}
							for (local1555 = 0; local1555 < 13; local1555++) {
								for (local662 = 0; local662 < 13; local662++) {
									local695 = this.anIntArrayArrayArray7[local504][local1555][local662];
									if (local695 != -1) {
										local2183 = local695 >> 14 & 0x3FF;
										local2189 = local695 >> 3 & 0x7FF;
										local2199 = (local2183 / 8 << 8) + local2189 / 8;
										for (@Pc(2201) int local2201 = 0; local2201 < local248; local2201++) {
											if (local2153[local2201] == local2199) {
												local2199 = -1;
												break;
											}
										}
										if (local2199 != -1) {
											local2153[local248++] = local2199;
										}
									}
								}
							}
							local504++;
						}
					}
					local248 = this.anInt946 - this.anInt948;
					local500 = this.anInt947 - this.anInt949;
					this.anInt948 = this.anInt946;
					this.anInt949 = this.anInt947;
					for (local504 = 0; local504 < 16384; local504++) {
						@Pc(2354) Class3_Sub1_Sub1_Sub4_Sub1 local2354 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local504];
						if (local2354 != null) {
							for (local662 = 0; local662 < 10; local662++) {
								local2354.anIntArray174[local662] -= local248;
								local2354.anIntArray175[local662] -= local500;
							}
							local2354.anInt728 -= local248 * 128;
							local2354.anInt729 -= local500 * 128;
						}
					}
					for (local1555 = 0; local1555 < this.anInt927; local1555++) {
						@Pc(2409) Class3_Sub1_Sub1_Sub4_Sub2 local2409 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local1555];
						if (local2409 != null) {
							for (local695 = 0; local695 < 10; local695++) {
								local2409.anIntArray174[local695] -= local248;
								local2409.anIntArray175[local695] -= local500;
							}
							local2409.anInt728 -= local248 * 128;
							local2409.anInt729 -= local500 * 128;
						}
					}
					this.aBoolean226 = true;
					@Pc(2461) byte local2461 = 0;
					@Pc(2463) byte local2463 = 104;
					@Pc(2465) byte local2465 = 1;
					if (local248 < 0) {
						local2461 = 103;
						local2463 = -1;
						local2465 = -1;
					}
					@Pc(2475) byte local2475 = 0;
					@Pc(2477) byte local2477 = 104;
					@Pc(2479) byte local2479 = 1;
					if (local500 < 0) {
						local2475 = 103;
						local2477 = -1;
						local2479 = -1;
					}
					for (@Pc(2489) int local2489 = local2461; local2489 != local2463; local2489 += local2465) {
						for (@Pc(2493) int local2493 = local2475; local2493 != local2477; local2493 += local2479) {
							@Pc(2499) int local2499 = local2489 + local248;
							@Pc(2503) int local2503 = local2493 + local500;
							for (@Pc(2505) int local2505 = 0; local2505 < 4; local2505++) {
								if (local2499 >= 0 && local2503 >= 0 && local2499 < 104 && local2503 < 104) {
									this.aClass44ArrayArrayArray1[local2505][local2489][local2493] = this.aClass44ArrayArrayArray1[local2505][local2499][local2503];
								} else {
									this.aClass44ArrayArrayArray1[local2505][local2489][local2493] = null;
								}
							}
						}
					}
					for (@Pc(2567) Class3_Sub2 local2567 = (Class3_Sub2) this.aClass44_12.method439(); local2567 != null; local2567 = (Class3_Sub2) this.aClass44_12.method441()) {
						local2567.anInt258 -= local248;
						local2567.anInt259 -= local500;
						if (local2567.anInt258 < 0 || local2567.anInt259 < 0 || local2567.anInt258 >= 104 || local2567.anInt259 >= 104) {
							local2567.method514();
						}
					}
					if (this.anInt931 != 0) {
						this.anInt931 -= local248;
						this.anInt932 -= local500;
					}
					this.aBoolean201 = false;
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 92) {
					local165 = this.aClass3_Sub1_Sub4_6.method487();
					local243 = this.aClass3_Sub1_Sub4_6.method486(255);
					local248 = local165 >> 10 & 0x1F;
					local500 = local165 >> 5 & 0x1F;
					local504 = local165 & 0x1F;
					Class32.method316(local243).anInt446 = (local248 << 19) + (local500 << 11) + (local504 << 3);
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 252) {
					local165 = this.aClass3_Sub1_Sub4_6.method460();
					local243 = this.aClass3_Sub1_Sub4_6.method458();
					local248 = this.aClass3_Sub1_Sub4_6.method460();
					if (local248 == 65535) {
						if (this.anInt983 < 50) {
							this.anIntArray247[this.anInt983] = (short) local165;
							this.anIntArray212[this.anInt983] = local243;
							this.anIntArray257[this.anInt983] = 0;
							this.anInt983++;
						}
					} else if (this.aBoolean218 && !aBoolean203 && this.anInt983 < 50) {
						this.anIntArray247[this.anInt983] = local165;
						this.anIntArray212[this.anInt983] = local243;
						this.anIntArray257[this.anInt983] = local248 + Class41.anIntArray171[local165];
						this.anInt983++;
					}
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 155) {
					this.anInt866 = this.aClass3_Sub1_Sub4_6.method458();
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 132) {
					this.aBoolean201 = false;
					for (local165 = 0; local165 < 5; local165++) {
						this.aBooleanArray12[local165] = false;
					}
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 220) {
					this.anInt996 = this.aClass3_Sub1_Sub4_6.method487() * 30;
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 194) {
					local165 = this.aClass3_Sub1_Sub4_6.method485((byte) 6);
					this.method673(local165);
					if (this.anInt920 != -1) {
						this.method613(this.anInt920);
						this.anInt920 = -1;
						this.aBoolean207 = true;
						this.aBoolean208 = true;
					}
					if (this.anInt840 != -1) {
						this.method613(this.anInt840);
						this.anInt840 = -1;
						this.aBoolean197 = true;
					}
					if (this.anInt998 != -1) {
						this.method613(this.anInt998);
						this.anInt998 = -1;
						this.aBoolean210 = true;
					}
					if (this.anInt955 != -1) {
						this.method613(this.anInt955);
						this.anInt955 = -1;
					}
					if (this.anInt961 != local165) {
						this.method613(this.anInt961);
						this.anInt961 = local165;
					}
					if (this.anInt1020 != 0) {
						this.anInt1020 = 0;
						this.aBoolean197 = true;
					}
					this.aBoolean205 = false;
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 19) {
					this.method663(this.aClass3_Sub1_Sub4_6, this.anInt870);
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 187) {
					this.method608();
					this.anInt871 = -1;
					return false;
				}
				if (this.anInt871 == 165) {
					for (local165 = 0; local165 < this.aClass3_Sub1_Sub1_Sub4_Sub2Array1.length; local165++) {
						if (this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local165] != null) {
							this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local165].anInt701 = -1;
						}
					}
					for (local243 = 0; local243 < this.aClass3_Sub1_Sub1_Sub4_Sub1Array1.length; local243++) {
						if (this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local243] != null) {
							this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local243].anInt701 = -1;
						}
					}
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 14) {
					if (this.anInt994 == 12) {
						this.aBoolean207 = true;
					}
					this.anInt965 = this.aClass3_Sub1_Sub4_6.method461();
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 216) {
					this.anInt839 = this.aClass3_Sub1_Sub4_6.method478();
					if (this.anInt839 == this.anInt994) {
						if (this.anInt839 == 3) {
							this.anInt994 = 1;
						} else {
							this.anInt994 = 3;
						}
						this.aBoolean207 = true;
					}
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 111) {
					this.method601(this.aClass3_Sub1_Sub4_6, this.anInt870);
					this.aBoolean226 = false;
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 63) {
					this.aBoolean204 = false;
					this.anInt1020 = 1;
					this.aString30 = "";
					this.aBoolean197 = true;
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 116) {
					if (this.anInt920 != -1) {
						this.method613(this.anInt920);
						this.anInt920 = -1;
						this.aBoolean207 = true;
						this.aBoolean208 = true;
					}
					if (this.anInt840 != -1) {
						this.method613(this.anInt840);
						this.anInt840 = -1;
						this.aBoolean197 = true;
					}
					if (this.anInt998 != -1) {
						this.method613(this.anInt998);
						this.anInt998 = -1;
						this.aBoolean210 = true;
					}
					if (this.anInt955 != -1) {
						this.method613(this.anInt955);
						this.anInt955 = -1;
					}
					if (this.anInt961 != -1) {
						this.method613(this.anInt961);
						this.anInt961 = -1;
					}
					if (this.anInt1020 != 0) {
						this.anInt1020 = 0;
						this.aBoolean197 = true;
					}
					this.aBoolean205 = false;
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 108) {
					local165 = this.aClass3_Sub1_Sub4_6.method485((byte) 6);
					if (local165 == 65535) {
						local165 = -1;
					}
					if (local165 != this.anInt854 && this.aBoolean232 && !aBoolean203 && this.anInt898 == 0) {
						this.anInt819 = local165;
						this.aBoolean196 = true;
						this.aClass16_Sub1_1.method222(2, this.anInt819);
					}
					this.anInt854 = local165;
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 193) {
					local165 = this.aClass3_Sub1_Sub4_6.method490();
					local243 = this.aClass3_Sub1_Sub4_6.method486(255);
					if (this.aBoolean232 && !aBoolean203) {
						this.anInt819 = local243;
						this.aBoolean196 = false;
						this.aClass16_Sub1_1.method222(2, this.anInt819);
						this.anInt898 = local165;
					}
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 227 || this.anInt871 == 206 || this.anInt871 == 152 || this.anInt871 == 79 || this.anInt871 == 177 || this.anInt871 == 185 || this.anInt871 == 45 || this.anInt871 == 94 || this.anInt871 == 115 || this.anInt871 == 57 || this.anInt871 == 101) {
					this.method704(this.anInt871, this.aClass3_Sub1_Sub4_6);
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 244) {
					this.anInt1046 = this.anInt870 / 8;
					for (local165 = 0; local165 < this.anInt1046; local165++) {
						this.aLongArray4[local165] = this.aClass3_Sub1_Sub4_6.method464();
					}
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 251) {
					local165 = this.aClass3_Sub1_Sub4_6.method486(255);
					local243 = this.aClass3_Sub1_Sub4_6.method460();
					local248 = this.aClass3_Sub1_Sub4_6.method486(255);
					Class32.method316(local248).anInt436 = (local165 << 16) + local243;
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 107) {
					this.aBoolean204 = false;
					this.anInt1020 = 2;
					this.aString30 = "";
					this.aBoolean197 = true;
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 97) {
					this.anInt887 = this.aClass3_Sub1_Sub4_6.method458();
					if (this.anInt887 == 1) {
						this.anInt906 = this.aClass3_Sub1_Sub4_6.method460();
					}
					if (this.anInt887 >= 2 && this.anInt887 <= 6) {
						if (this.anInt887 == 2) {
							this.anInt878 = 64;
							this.anInt879 = 64;
						}
						if (this.anInt887 == 3) {
							this.anInt878 = 0;
							this.anInt879 = 64;
						}
						if (this.anInt887 == 4) {
							this.anInt878 = 128;
							this.anInt879 = 64;
						}
						if (this.anInt887 == 5) {
							this.anInt878 = 64;
							this.anInt879 = 0;
						}
						if (this.anInt887 == 6) {
							this.anInt878 = 64;
							this.anInt879 = 128;
						}
						this.anInt887 = 2;
						this.anInt875 = this.aClass3_Sub1_Sub4_6.method460();
						this.anInt876 = this.aClass3_Sub1_Sub4_6.method460();
						this.anInt877 = this.aClass3_Sub1_Sub4_6.method458();
					}
					if (this.anInt887 == 10) {
						this.anInt962 = this.aClass3_Sub1_Sub4_6.method460();
					}
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 5) {
					this.anInt964 = this.aClass3_Sub1_Sub4_6.method458();
					this.anInt935 = this.aClass3_Sub1_Sub4_6.method458();
					this.anInt838 = this.aClass3_Sub1_Sub4_6.method458();
					this.aBoolean222 = true;
					this.aBoolean197 = true;
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 176) {
					local165 = this.aClass3_Sub1_Sub4_6.method486(255);
					local243 = this.aClass3_Sub1_Sub4_6.method460();
					local823 = Class32.method316(local243);
					if (local823 != null && local823.anInt443 == 0) {
						if (local165 < 0) {
							local165 = 0;
						}
						if (local165 > local823.anInt417 - local823.anInt441) {
							local165 = local823.anInt417 - local823.anInt441;
						}
						local823.anInt440 = local165;
					}
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 167) {
					local165 = this.aClass3_Sub1_Sub4_6.method487();
					local243 = this.aClass3_Sub1_Sub4_6.method486(255);
					local248 = this.aClass3_Sub1_Sub4_6.method460();
					if (local248 == 65535) {
						Class32.method316(local165).anInt413 = 0;
						this.anInt871 = -1;
						return true;
					}
					@Pc(3637) Class10 local3637 = Class10.method118(local248);
					Class32.method316(local165).anInt413 = 4;
					Class32.method316(local165).anInt414 = local248;
					Class32.method316(local165).anInt419 = local3637.anInt150;
					Class32.method316(local165).anInt420 = local3637.anInt157;
					Class32.method316(local165).anInt418 = local3637.anInt146 * 100 / local243;
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 93) {
					local165 = this.aClass3_Sub1_Sub4_6.method487();
					this.method673(local165);
					if (this.anInt920 != -1) {
						this.method613(this.anInt920);
						this.anInt920 = -1;
						this.aBoolean207 = true;
						this.aBoolean208 = true;
					}
					if (this.anInt998 != -1) {
						this.method613(this.anInt998);
						this.anInt998 = -1;
						this.aBoolean210 = true;
					}
					if (this.anInt955 != -1) {
						this.method613(this.anInt955);
						this.anInt955 = -1;
					}
					if (this.anInt961 != -1) {
						this.method613(this.anInt961);
						this.anInt961 = -1;
					}
					if (this.anInt840 != local165) {
						this.method613(this.anInt840);
						this.anInt840 = local165;
					}
					this.aBoolean205 = false;
					this.aBoolean197 = true;
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 50) {
					local165 = this.aClass3_Sub1_Sub4_6.method487();
					local243 = this.aClass3_Sub1_Sub4_6.method486(255);
					if (this.anInt840 != -1) {
						this.method613(this.anInt840);
						this.anInt840 = -1;
						this.aBoolean197 = true;
					}
					if (this.anInt998 != -1) {
						this.method613(this.anInt998);
						this.anInt998 = -1;
						this.aBoolean210 = true;
					}
					if (this.anInt955 != -1) {
						this.method613(this.anInt955);
						this.anInt955 = -1;
					}
					if (this.anInt961 != local165) {
						this.method613(this.anInt961);
						this.anInt961 = local165;
					}
					if (this.anInt920 != local243) {
						this.method613(this.anInt920);
						this.anInt920 = local243;
					}
					if (this.anInt1020 != 0) {
						this.anInt1020 = 0;
						this.aBoolean197 = true;
					}
					this.aBoolean207 = true;
					this.aBoolean208 = true;
					this.aBoolean205 = false;
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 201) {
					local165 = this.aClass3_Sub1_Sub4_6.method486(255);
					local243 = this.aClass3_Sub1_Sub4_6.method487();
					Class32.method316(local243).anInt413 = 1;
					Class32.method316(local243).anInt414 = local165;
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 99) {
					this.aBoolean207 = true;
					local165 = this.aClass3_Sub1_Sub4_6.method460();
					local308 = Class32.method316(local165);
					local248 = this.aClass3_Sub1_Sub4_6.method460();
					for (local500 = 0; local500 < local248; local500++) {
						local504 = this.aClass3_Sub1_Sub4_6.method478();
						if (local504 == 255) {
							local504 = this.aClass3_Sub1_Sub4_6.method493(this.anInt991);
						}
						local308.anIntArray101[local500] = this.aClass3_Sub1_Sub4_6.method486(255);
						local308.anIntArray97[local500] = local504;
					}
					for (local504 = local248; local504 < local308.anIntArray101.length; local504++) {
						local308.anIntArray101[local504] = 0;
						local308.anIntArray97[local504] = 0;
					}
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 159) {
					this.aBoolean201 = true;
					this.anInt824 = this.aClass3_Sub1_Sub4_6.method458();
					this.anInt825 = this.aClass3_Sub1_Sub4_6.method458();
					this.anInt826 = this.aClass3_Sub1_Sub4_6.method460();
					this.anInt827 = this.aClass3_Sub1_Sub4_6.method458();
					this.anInt828 = this.aClass3_Sub1_Sub4_6.method458();
					if (this.anInt828 >= 100) {
						local165 = this.anInt824 * 128 + 64;
						local243 = this.anInt825 * 128 + 64;
						local248 = this.method688(local165, local243, 899, this.anInt894) - this.anInt826;
						local500 = local165 - this.anInt1030;
						local504 = local248 - this.anInt1031;
						local1555 = local243 - this.anInt1032;
						local662 = (int) Math.sqrt((double) (local500 * local500 + local1555 * local1555));
						this.anInt1033 = (int) (Math.atan2((double) local504, (double) local662) * 325.949D) & 0x7FF;
						this.anInt1034 = (int) (Math.atan2((double) local500, (double) local1555) * -325.949D) & 0x7FF;
						if (this.anInt1033 < 128) {
							this.anInt1033 = 128;
						}
						if (this.anInt1033 > 383) {
							this.anInt1033 = 383;
						}
					}
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 36) {
					this.anInt896 = this.aClass3_Sub1_Sub4_6.method477();
					this.anInt895 = this.aClass3_Sub1_Sub4_6.method476();
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 118) {
					local165 = this.aClass3_Sub1_Sub4_6.method485((byte) 6);
					local243 = this.aClass3_Sub1_Sub4_6.method460();
					local248 = this.aClass3_Sub1_Sub4_6.method460();
					local500 = this.aClass3_Sub1_Sub4_6.method485((byte) 6);
					Class32.method316(local165).anInt419 = local248;
					Class32.method316(local165).anInt420 = local500;
					Class32.method316(local165).anInt418 = local243;
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 130) {
					local432 = this.aClass3_Sub1_Sub4_6.method465();
					@Pc(4182) long local4182;
					if (local432.endsWith(":tradereq:")) {
						local275 = local432.substring(0, local432.indexOf(":"));
						local4182 = Class15.method198(local275);
						local1553 = false;
						for (local1555 = 0; local1555 < this.anInt1046; local1555++) {
							if (this.aLongArray4[local1555] == local4182) {
								local1553 = true;
								break;
							}
						}
						if (!local1553 && this.anInt841 == 0) {
							this.method603(4, local275, "wishes to trade with you.");
						}
					} else if (local432.endsWith(":duelreq:")) {
						local275 = local432.substring(0, local432.indexOf(":"));
						local4182 = Class15.method198(local275);
						local1553 = false;
						for (local1555 = 0; local1555 < this.anInt1046; local1555++) {
							if (this.aLongArray4[local1555] == local4182) {
								local1553 = true;
								break;
							}
						}
						if (!local1553 && this.anInt841 == 0) {
							this.method603(8, local275, "wishes to duel with you.");
						}
					} else if (local432.endsWith(":chalreq:")) {
						local275 = local432.substring(0, local432.indexOf(":"));
						local4182 = Class15.method198(local275);
						local1553 = false;
						for (local1555 = 0; local1555 < this.anInt1046; local1555++) {
							if (this.aLongArray4[local1555] == local4182) {
								local1553 = true;
								break;
							}
						}
						if (!local1553 && this.anInt841 == 0) {
							local1622 = local432.substring(local432.indexOf(":") + 1, local432.length() - 9);
							this.method603(8, local275, local1622);
						}
					} else {
						this.method603(0, "", local432);
					}
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 2) {
					this.anInt994 = this.aClass3_Sub1_Sub4_6.method478();
					this.aBoolean207 = true;
					this.aBoolean208 = true;
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 78) {
					this.aBoolean201 = true;
					this.anInt844 = this.aClass3_Sub1_Sub4_6.method458();
					this.anInt845 = this.aClass3_Sub1_Sub4_6.method458();
					this.anInt846 = this.aClass3_Sub1_Sub4_6.method460();
					this.anInt847 = this.aClass3_Sub1_Sub4_6.method458();
					this.anInt848 = this.aClass3_Sub1_Sub4_6.method458();
					if (this.anInt848 >= 100) {
						this.anInt1030 = this.anInt844 * 128 + 64;
						this.anInt1032 = this.anInt845 * 128 + 64;
						this.anInt1031 = this.method688(this.anInt1030, this.anInt1032, 899, this.anInt894) - this.anInt846;
					}
					this.anInt871 = -1;
					return true;
				}
				if (this.anInt871 == 129) {
					local165 = this.aClass3_Sub1_Sub4_6.method458();
					local243 = this.aClass3_Sub1_Sub4_6.method458();
					local248 = this.aClass3_Sub1_Sub4_6.method458();
					local500 = this.aClass3_Sub1_Sub4_6.method458();
					this.aBooleanArray12[local165] = true;
					this.anIntArray242[local165] = local243;
					this.anIntArray237[local165] = local248;
					this.anIntArray274[local165] = local500;
					this.anIntArray268[local165] = 0;
					this.anInt871 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt871 + "," + this.anInt870 + " - " + this.anInt836 + "," + this.anInt837);
				this.method608();
			} catch (@Pc(4509) IOException local4509) {
				this.method670();
			} catch (@Pc(4514) Exception local4514) {
				local432 = "T2 - " + this.anInt871 + "," + this.anInt836 + "," + this.anInt837 + " - " + this.anInt870 + "," + (this.anInt946 + aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray174[0]) + "," + (this.anInt947 + aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray175[0]) + " - ";
				for (local243 = 0; local243 < this.anInt870 && local243 < 50; local243++) {
					local432 = local432 + this.aClass3_Sub1_Sub4_6.aByteArray20[local243] + ",";
				}
				signlink.reporterror(local432);
				this.method608();
			}
			return true;
		} catch (@Pc(4595) RuntimeException local4595) {
			signlink.reporterror("2156, " + 1 + ", " + local4595.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	@Override
	public void method586(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}
		if (signlink.mainapp == null) {
			super.method586(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method581(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < this.anInt830 || arg0 > this.anInt830) {
				this.method580();
			}
			if (!this.aBoolean198 && !this.aBoolean223 && !this.aBoolean234) {
				anInt919++;
				if (this.aBoolean206) {
					this.method597();
				} else {
					this.method588();
				}
				this.method607(anInt1010);
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("75411, " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZZ)V")
	private void method592(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt728 >> 7 == this.anInt931 && aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt729 >> 7 == this.anInt932) {
				this.anInt931 = 0;
			}
			@Pc(21) int local21 = this.anInt929;
			if (arg0) {
				local21 = 1;
			}
			for (@Pc(27) int local27 = 0; local27 < local21; local27++) {
				@Pc(33) Class3_Sub1_Sub1_Sub4_Sub2 local33;
				@Pc(38) int local38;
				if (arg0) {
					local33 = aClass3_Sub1_Sub1_Sub4_Sub2_1;
					local38 = this.anInt928 << 14;
				} else {
					local33 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[this.anIntArray238[local27]];
					local38 = this.anIntArray238[local27] << 14;
				}
				if (local33 != null && local33.method506()) {
					local33.aBoolean170 = false;
					if ((aBoolean203 && this.anInt929 > 50 || this.anInt929 > 200) && !arg0 && local33.anInt732 == local33.anInt689) {
						local33.aBoolean170 = true;
					}
					@Pc(89) int local89 = local33.anInt728 >> 7;
					@Pc(94) int local94 = local33.anInt729 >> 7;
					if (local89 >= 0 && local89 < 104 && local94 >= 0 && local94 < 104) {
						if (local33.aClass3_Sub1_Sub1_Sub5_2 == null || anInt919 < local33.anInt737 || anInt919 >= local33.anInt738) {
							if ((local33.anInt728 & 0x7F) == 64 && (local33.anInt729 & 0x7F) == 64) {
								if (this.anIntArrayArray24[local89][local94] == this.anInt937) {
									continue;
								}
								this.anIntArrayArray24[local89][local94] = this.anInt937;
							}
							local33.anInt736 = this.method688(local33.anInt728, local33.anInt729, 899, this.anInt894);
							this.aClass25_1.method259(local33.aBoolean167, this.anInt894, local33, local33.anInt730, local33.anInt729, 60, local33.anInt736, local33.anInt728, local38);
						} else {
							local33.aBoolean170 = false;
							local33.anInt736 = this.method688(local33.anInt728, local33.anInt729, 899, this.anInt894);
							this.aClass25_1.method260(local33.anInt730, local33.anInt728, local33.anInt729, local33.anInt746, local33.anInt736, local38, local33, local33.anInt747, local33.anInt745, local33.anInt748, this.anInt894);
						}
					}
				}
			}
			if (arg1) {
				this.aBoolean229 = !this.aBoolean229;
			}
		} catch (@Pc(233) RuntimeException local233) {
			signlink.reporterror("78121, " + arg0 + ", " + arg1 + ", " + local233.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
	private void method593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg1 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg3 & 0x7FF;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = arg2;
			@Pc(23) int local23;
			@Pc(27) int local27;
			@Pc(37) int local37;
			if (local5 != 0) {
				local23 = Class3_Sub1_Sub1_Sub5.anIntArray166[local5];
				local27 = Class3_Sub1_Sub1_Sub5.anIntArray167[local5];
				local37 = local27 * 0 - arg2 * local23 >> 16;
				local17 = local23 * 0 + arg2 * local27 >> 16;
				local15 = local37;
			}
			if (local11 != 0) {
				local23 = Class3_Sub1_Sub1_Sub5.anIntArray166[local11];
				local27 = Class3_Sub1_Sub1_Sub5.anIntArray167[local11];
				local37 = local17 * local23 + local27 * 0 >> 16;
				local17 = local17 * local27 - local23 * 0 >> 16;
				local13 = local37;
			}
			this.anInt1030 = arg5 - local13;
			this.anInt1031 = arg0 - local15;
			this.anInt1032 = arg4 - local17;
			this.anInt1033 = arg1;
			this.anInt1034 = arg3;
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("50352, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 3 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!WNCFPLWV;IZ)V")
	private void method594(@OriginalArg(0) Class3_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt930; local3++) {
				@Pc(10) int local10 = this.anIntArray239[local3];
				@Pc(15) Class3_Sub1_Sub1_Sub4_Sub1 local15 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local10];
				@Pc(18) int local18 = arg0.method458();
				if ((local18 & 0x2) != 0) {
					local15.aClass2_1 = Class2.method4(arg0.method486(255));
					local15.anInt714 = local15.aClass2_1.aByte2;
					local15.anInt708 = local15.aClass2_1.anInt32;
					local15.anInt718 = local15.aClass2_1.anInt17;
					local15.anInt719 = local15.aClass2_1.anInt22;
					local15.anInt720 = local15.aClass2_1.anInt14;
					local15.anInt721 = local15.aClass2_1.anInt29;
					local15.anInt689 = local15.aClass2_1.anInt23;
				}
				@Pc(70) int local70;
				@Pc(73) int local73;
				if ((local18 & 0x40) != 0) {
					local70 = arg0.method458();
					local73 = arg0.method458();
					local15.method510(local73, this.anInt911, anInt919, local70);
					local15.anInt724 = anInt919 + 300;
					local15.anInt725 = arg0.method458();
					local15.anInt726 = arg0.method478();
				}
				if ((local18 & 0x80) != 0) {
					local70 = arg0.method458();
					local73 = arg0.method458();
					local15.method510(local73, this.anInt911, anInt919, local70);
					local15.anInt724 = anInt919 + 300;
					local15.anInt725 = arg0.method476();
					local15.anInt726 = arg0.method458();
				}
				if ((local18 & 0x4) != 0) {
					local15.anInt723 = arg0.method485((byte) 6);
					if (local15.anInt723 == 65535) {
						local15.anInt723 = -1;
					}
				}
				if ((local18 & 0x1) != 0) {
					local70 = arg0.method485((byte) 6);
					if (local70 == 65535) {
						local70 = -1;
					}
					local73 = arg0.method477();
					if (local70 == local15.anInt701 && local70 != -1) {
						@Pc(170) int local170 = Class30.aClass30Array1[local70].anInt394;
						if (local170 == 1) {
							local15.anInt702 = 0;
							local15.anInt703 = 0;
							local15.anInt704 = local73;
							local15.anInt705 = 0;
						}
						if (local170 == 2) {
							local15.anInt705 = 0;
						}
					} else if (local70 == -1 || local15.anInt701 == -1 || Class30.aClass30Array1[local70].anInt388 >= Class30.aClass30Array1[local15.anInt701].anInt388) {
						local15.anInt701 = local70;
						local15.anInt702 = 0;
						local15.anInt703 = 0;
						local15.anInt704 = local73;
						local15.anInt705 = 0;
						local15.anInt727 = local15.anInt716;
					}
				}
				if ((local18 & 0x10) != 0) {
					local15.anInt706 = arg0.method485((byte) 6);
					local15.anInt707 = arg0.method460();
				}
				if ((local18 & 0x20) != 0) {
					local15.anInt709 = arg0.method485((byte) 6);
					local70 = arg0.method492();
					local15.anInt713 = local70 >> 16;
					local15.anInt712 = anInt919 + (local70 & 0xFFFF);
					local15.anInt710 = 0;
					local15.anInt711 = 0;
					if (local15.anInt712 > anInt919) {
						local15.anInt710 = -1;
					}
					if (local15.anInt709 == 65535) {
						local15.anInt709 = -1;
					}
				}
				if ((local18 & 0x8) != 0) {
					local15.aString15 = arg0.method465();
					local15.anInt735 = 100;
				}
			}
			this.aBoolean206 &= true;
		} catch (@Pc(311) RuntimeException local311) {
			signlink.reporterror("70341, " + arg0 + ", " + arg1 + ", " + true + ", " + local311.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!WNCFPLWV;I)V")
	private void method595(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub4 arg1) {
		try {
			while (true) {
				if (arg1.anInt667 + 10 < arg0 * 8) {
					@Pc(21) int local21 = arg1.method469(11);
					if (local21 != 2047) {
						if (this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local21] == null) {
							this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local21] = new Class3_Sub1_Sub1_Sub4_Sub2();
							if (this.aClass3_Sub1_Sub4Array1[local21] != null) {
								this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local21].method513(this.aClass3_Sub1_Sub4Array1[local21]);
							}
						}
						this.anIntArray238[this.anInt929++] = local21;
						@Pc(67) Class3_Sub1_Sub1_Sub4_Sub2 local67 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local21];
						local67.anInt715 = anInt919;
						@Pc(75) int local75 = arg1.method469(5);
						if (local75 > 15) {
							local75 -= 32;
						}
						@Pc(84) int local84 = arg1.method469(1);
						if (local84 == 1) {
							this.anIntArray239[this.anInt930++] = local21;
						}
						@Pc(103) int local103 = arg1.method469(5);
						if (local103 > 15) {
							local103 -= 32;
						}
						@Pc(112) int local112 = arg1.method469(1);
						local67.method509(aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray174[0] + local75, (byte) 4, local112 == 1, aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray175[0] + local103);
						continue;
					}
				}
				arg1.method470();
				return;
			}
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("36415, " + arg0 + ", " + arg1 + ", " + 2 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method596() {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray245[local5 + 32512] = 255;
				}
			}
			@Pc(41) int local41;
			@Pc(48) int local48;
			@Pc(54) int local54;
			for (local12 = 0; local12 < 100; local12++) {
				local41 = (int) (Math.random() * 124.0D) + 2;
				local48 = (int) (Math.random() * 128.0D) + 128;
				local54 = local41 + (local48 << 7);
				this.anIntArray245[local54] = 192;
			}
			for (local41 = 1; local41 < 255; local41++) {
				for (local48 = 1; local48 < 127; local48++) {
					local54 = local48 + (local41 << 7);
					this.anIntArray246[local54] = (this.anIntArray245[local54 - 1] + this.anIntArray245[local54 + 1] + this.anIntArray245[local54 - 128] + this.anIntArray245[local54 + 128]) / 4;
				}
			}
			this.anInt999 += 128;
			if (this.anInt999 > this.anIntArray235.length) {
				this.anInt999 -= this.anIntArray235.length;
				local48 = (int) (Math.random() * 12.0D);
				this.method639(this.anInt867, this.aClass3_Sub1_Sub2_Sub3Array5[local48]);
			}
			@Pc(180) int local180;
			for (local48 = 1; local48 < 255; local48++) {
				for (local54 = 1; local54 < 127; local54++) {
					local180 = local54 + (local48 << 7);
					@Pc(203) int local203 = this.anIntArray246[local180 + 128] - this.anIntArray235[local180 + this.anInt999 & this.anIntArray235.length - 1] / 5;
					if (local203 < 0) {
						local203 = 0;
					}
					this.anIntArray245[local180] = local203;
				}
			}
			for (local54 = 0; local54 < 255; local54++) {
				this.anIntArray224[local54] = this.anIntArray224[local54 + 1];
			}
			this.anIntArray224[255] = (int) (Math.sin((double) anInt919 / 14.0D) * 16.0D + Math.sin((double) anInt919 / 15.0D) * 14.0D + Math.sin((double) anInt919 / 16.0D) * 12.0D);
			if (this.anInt883 > 0) {
				this.anInt883 -= 4;
			}
			if (this.anInt884 > 0) {
				this.anInt884 -= 4;
			}
			if (this.anInt883 == 0 && this.anInt884 == 0) {
				local180 = (int) (Math.random() * 2000.0D);
				if (local180 == 0) {
					this.anInt883 = 1024;
				}
				if (local180 == 1) {
					this.anInt884 = 1024;
					return;
				}
			}
		} catch (@Pc(314) RuntimeException local314) {
			signlink.reporterror("41989, " + 9 + ", " + local314.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method597() {
		try {
			if (this.anInt996 > 1) {
				this.anInt996--;
			}
			if (this.anInt874 > 0) {
				this.anInt874--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method591(); local22++) {
			}
			if (this.aBoolean206) {
				@Pc(41) Object local41 = this.aClass17_1.anObject1;
				@Pc(66) int local66;
				@Pc(68) int local68;
				@Pc(70) int local70;
				@Pc(103) int local103;
				synchronized (this.aClass17_1.anObject1) {
					if (!aBoolean200) {
						this.aClass17_1.anInt245 = 0;
					} else if (super.anInt809 != 0 || this.aClass17_1.anInt245 >= 40) {
						this.aClass3_Sub1_Sub4_7.method447(52);
						this.aClass3_Sub1_Sub4_7.method448(0);
						local66 = this.aClass3_Sub1_Sub4_7.anInt666;
						local68 = 0;
						@Pc(86) int local86;
						for (local70 = 0; local70 < this.aClass17_1.anInt245 && local66 - this.aClass3_Sub1_Sub4_7.anInt666 < 240; local70++) {
							local68++;
							local86 = this.aClass17_1.anIntArray51[local70];
							if (local86 < 0) {
								local86 = 0;
							} else if (local86 > 502) {
								local86 = 502;
							}
							local103 = this.aClass17_1.anIntArray50[local70];
							if (local103 < 0) {
								local103 = 0;
							} else if (local103 > 764) {
								local103 = 764;
							}
							@Pc(120) int local120 = local86 * 765 + local103;
							if (this.aClass17_1.anIntArray51[local70] == -1 && this.aClass17_1.anIntArray50[local70] == -1) {
								local103 = -1;
								local86 = -1;
								local120 = 524287;
							}
							if (local103 != this.anInt957 || local86 != this.anInt958) {
								@Pc(165) int local165 = local103 - this.anInt957;
								this.anInt957 = local103;
								@Pc(173) int local173 = local86 - this.anInt958;
								this.anInt958 = local86;
								if (this.anInt897 < 8 && local165 >= -32 && local165 <= 31 && local173 >= -32 && local173 <= 31) {
									local165 += 32;
									local173 += 32;
									this.aClass3_Sub1_Sub4_7.method449((this.anInt897 << 12) + (local165 << 6) + local173);
									this.anInt897 = 0;
								} else if (this.anInt897 < 8) {
									this.aClass3_Sub1_Sub4_7.method451((this.anInt897 << 19) + local120 + 8388608);
									this.anInt897 = 0;
								} else {
									this.aClass3_Sub1_Sub4_7.method452((this.anInt897 << 19) + local120 - 1073741824);
									this.anInt897 = 0;
								}
							} else if (this.anInt897 < 2047) {
								this.anInt897++;
							}
						}
						this.aClass3_Sub1_Sub4_7.method457(this.aClass3_Sub1_Sub4_7.anInt666 - local66);
						if (local68 >= this.aClass17_1.anInt245) {
							this.aClass17_1.anInt245 = 0;
						} else {
							this.aClass17_1.anInt245 -= local68;
							for (local86 = 0; local86 < this.aClass17_1.anInt245; local86++) {
								this.aClass17_1.anIntArray50[local86] = this.aClass17_1.anIntArray50[local86 + local68];
								this.aClass17_1.anIntArray51[local86] = this.aClass17_1.anIntArray51[local86 + local68];
							}
						}
					}
				}
				if (super.anInt809 != 0) {
					@Pc(336) long local336 = (super.aLong28 - this.aLong29) / 50L;
					if (local336 > 4095L) {
						local336 = 4095L;
					}
					this.aLong29 = super.aLong28;
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
					@Pc(382) byte local382 = 0;
					if (super.anInt809 == 2) {
						local382 = 1;
					}
					local103 = (int) local336;
					this.aClass3_Sub1_Sub4_7.method447(154);
					this.aClass3_Sub1_Sub4_7.method491((local103 << 20) + (local382 << 19) + local70);
				}
				if (this.anInt972 > 0) {
					this.anInt972--;
				}
				if (super.anIntArray210[1] == 1 || super.anIntArray210[2] == 1 || super.anIntArray210[3] == 1 || super.anIntArray210[4] == 1) {
					this.aBoolean225 = true;
				}
				if (this.aBoolean225 && this.anInt972 <= 0) {
					this.anInt972 = 20;
					this.aBoolean225 = false;
					this.aClass3_Sub1_Sub4_7.method447(6);
					this.aClass3_Sub1_Sub4_7.method482(this.anInt858);
					this.aClass3_Sub1_Sub4_7.method449(this.anInt857);
				}
				if (super.aBoolean195 && !this.aBoolean209) {
					this.aBoolean209 = true;
					this.aClass3_Sub1_Sub4_7.method447(107);
					this.aClass3_Sub1_Sub4_7.method448(1);
				}
				if (!super.aBoolean195 && this.aBoolean209) {
					this.aBoolean209 = false;
					this.aClass3_Sub1_Sub4_7.method447(107);
					this.aClass3_Sub1_Sub4_7.method448(0);
				}
				this.method705();
				this.method628();
				this.method640();
				this.anInt872++;
				if (this.anInt872 > 750) {
					this.method670();
				}
				this.method643();
				this.method712();
				this.method657();
				this.anInt880++;
				if (this.anInt1029 != 0) {
					this.anInt1028 += 20;
					if (this.anInt1028 >= 400) {
						this.anInt1029 = 0;
					}
				}
				if (this.anInt852 != 0) {
					this.anInt849++;
					if (this.anInt849 >= 15) {
						if (this.anInt852 == 2) {
							this.aBoolean207 = true;
						}
						if (this.anInt852 == 3) {
							this.aBoolean197 = true;
						}
						this.anInt852 = 0;
					}
				}
				if (this.anInt980 != 0) {
					this.anInt842++;
					if (super.anInt804 > this.anInt981 + 5 || super.anInt804 < this.anInt981 - 5 || super.anInt805 > this.anInt982 + 5 || super.anInt805 < this.anInt982 - 5) {
						this.aBoolean236 = true;
					}
					if (super.anInt803 == 0) {
						if (this.anInt980 == 2) {
							this.aBoolean207 = true;
						}
						if (this.anInt980 == 3) {
							this.aBoolean197 = true;
						}
						this.anInt980 = 0;
						if (this.aBoolean236 && this.anInt842 >= 5) {
							this.anInt967 = -1;
							this.method636();
							if (this.anInt967 == this.anInt978 && this.anInt966 != this.anInt979) {
								@Pc(683) Class32 local683 = Class32.method316(this.anInt978);
								@Pc(685) byte local685 = 0;
								if (this.anInt943 == 1 && local683.anInt430 == 206) {
									local685 = 1;
								}
								if (local683.anIntArray101[this.anInt966] <= 0) {
									local685 = 0;
								}
								if (local683.aBoolean99) {
									local66 = this.anInt979;
									local68 = this.anInt966;
									local683.anIntArray101[local68] = local683.anIntArray101[local66];
									local683.anIntArray97[local68] = local683.anIntArray97[local66];
									local683.anIntArray101[local66] = -1;
									local683.anIntArray97[local66] = 0;
								} else if (local685 == 1) {
									local66 = this.anInt979;
									local68 = this.anInt966;
									while (local66 != local68) {
										if (local66 > local68) {
											local683.method317(local66, local66 - 1);
											local66--;
										} else if (local66 < local68) {
											local683.method317(local66, local66 + 1);
											local66++;
										}
									}
								} else {
									local683.method317(this.anInt979, this.anInt966);
								}
								this.aClass3_Sub1_Sub4_7.method447(84);
								this.aClass3_Sub1_Sub4_7.method482(this.anInt966);
								this.aClass3_Sub1_Sub4_7.method449(this.anInt978);
								this.aClass3_Sub1_Sub4_7.method475(local685);
								this.aClass3_Sub1_Sub4_7.method449(this.anInt979);
							}
						} else if ((this.anInt993 == 1 || this.method641(this.anInt918, this.anInt1045 - 1)) && this.anInt1045 > 2) {
							this.method629();
						} else if (this.anInt1045 > 0) {
							this.method627(this.anInt1045 - 1);
						}
						this.anInt849 = 10;
						super.anInt809 = 0;
					}
				}
				@Pc(858) int local858;
				@Pc(860) int local860;
				if (Class25.anInt313 != -1) {
					local858 = Class25.anInt313;
					local860 = Class25.anInt314;
					@Pc(881) boolean local881 = this.method610(0, aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray175[0], aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray174[0], 0, local858, 0, 0, 0, 0, true, local860);
					Class25.anInt313 = -1;
					if (local881) {
						this.anInt1026 = super.anInt810;
						this.anInt1027 = super.anInt811;
						this.anInt1029 = 1;
						this.anInt1028 = 0;
					}
				}
				if (super.anInt809 == 1 && this.aString25 != null) {
					this.aString25 = null;
					this.aBoolean197 = true;
					super.anInt809 = 0;
				}
				this.method625();
				if (this.anInt998 == -1) {
					this.method614();
					this.method709(this.anInt956);
					this.method611();
				}
				if (super.anInt803 == 1 || super.anInt809 == 1) {
					this.anInt1022++;
				}
				if (this.anInt942 == 0 && this.anInt816 == 0 && this.anInt939 == 0) {
					if (this.anInt917 > 0) {
						this.anInt917--;
					}
				} else if (this.anInt917 < 100) {
					this.anInt917++;
					if (this.anInt917 == 100) {
						if (this.anInt942 != 0) {
							this.aBoolean197 = true;
						}
						if (this.anInt816 != 0) {
							this.aBoolean207 = true;
						}
					}
				}
				if (this.anInt1044 == 2) {
					this.method693();
				}
				if (this.anInt1044 == 2 && this.aBoolean201) {
					this.method711(843);
				}
				for (local858 = 0; local858 < 5; local858++) {
					@Pc(1024) int local1024 = this.anIntArray268[local858]++;
				}
				this.method684();
				super.anInt802++;
				if (super.anInt802 > 4500) {
					this.anInt874 = 250;
					super.anInt802 -= 500;
					this.aClass3_Sub1_Sub4_7.method447(221);
				}
				this.anInt934++;
				if (this.anInt934 > 500) {
					this.anInt934 = 0;
					local860 = (int) (Math.random() * 8.0D);
					if ((local860 & 0x1) == 1) {
						this.anInt925 += this.anInt926;
					}
					if ((local860 & 0x2) == 2) {
						this.anInt922 += this.anInt923;
					}
					if ((local860 & 0x4) == 4) {
						this.anInt817 += this.anInt818;
					}
				}
				if (this.anInt925 < -50) {
					this.anInt926 = 2;
				}
				if (this.anInt925 > 50) {
					this.anInt926 = -2;
				}
				if (this.anInt922 < -55) {
					this.anInt923 = 2;
				}
				if (this.anInt922 > 55) {
					this.anInt923 = -2;
				}
				if (this.anInt817 < -40) {
					this.anInt818 = 1;
				}
				if (this.anInt817 > 40) {
					this.anInt818 = -1;
				}
				this.anInt893++;
				if (this.anInt893 > 500) {
					this.anInt893 = 0;
					local860 = (int) (Math.random() * 8.0D);
					if ((local860 & 0x1) == 1) {
						this.anInt855 += this.anInt856;
					}
					if ((local860 & 0x2) == 2) {
						this.anInt989 += this.anInt990;
					}
				}
				if (this.anInt855 < -60) {
					this.anInt856 = 2;
				}
				if (this.anInt855 > 60) {
					this.anInt856 = -2;
				}
				if (this.anInt989 < -20) {
					this.anInt990 = 1;
				}
				if (this.anInt989 > 10) {
					this.anInt990 = -1;
				}
				anInt1012++;
				if (anInt1012 > 1287) {
					anInt1012 = 0;
					this.aClass3_Sub1_Sub4_7.method447(20);
					this.aClass3_Sub1_Sub4_7.method448(0);
					local860 = this.aClass3_Sub1_Sub4_7.anInt666;
					this.aClass3_Sub1_Sub4_7.method448(104);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass3_Sub1_Sub4_7.method448(249);
					}
					this.aClass3_Sub1_Sub4_7.method449(60855);
					this.aClass3_Sub1_Sub4_7.method448((int) (Math.random() * 256.0D));
					this.aClass3_Sub1_Sub4_7.method449(46023);
					this.aClass3_Sub1_Sub4_7.method448(143);
					this.aClass3_Sub1_Sub4_7.method449((int) (Math.random() * 65536.0D));
					this.aClass3_Sub1_Sub4_7.method448(165);
					this.aClass3_Sub1_Sub4_7.method449(49928);
					this.aClass3_Sub1_Sub4_7.method448((int) (Math.random() * 256.0D));
					this.aClass3_Sub1_Sub4_7.method457(this.aClass3_Sub1_Sub4_7.anInt666 - local860);
				}
				this.anInt873++;
				if (this.anInt873 > 50) {
					this.aClass3_Sub1_Sub4_7.method447(186);
				}
				try {
					if (this.aClass42_1 != null && this.aClass3_Sub1_Sub4_7.anInt666 > 0) {
						this.aClass42_1.method432(this.aClass3_Sub1_Sub4_7.aByteArray20, this.aClass3_Sub1_Sub4_7.anInt666);
						this.aClass3_Sub1_Sub4_7.anInt666 = 0;
						this.anInt873 = 0;
					}
				} catch (@Pc(1351) IOException local1351) {
					this.method670();
				} catch (@Pc(1356) Exception local1356) {
					this.method608();
				}
			}
		} catch (@Pc(1361) RuntimeException local1361) {
			signlink.reporterror("95289, " + 9956 + ", " + local1361.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
	private void method598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			this.anInt870 += 0;
			@Pc(7) Class3_Sub2 local7 = null;
			for (@Pc(12) Class3_Sub2 local12 = (Class3_Sub2) this.aClass44_12.method439(); local12 != null; local12 = (Class3_Sub2) this.aClass44_12.method441()) {
				if (local12.anInt256 == arg4 && local12.anInt258 == arg1 && local12.anInt259 == arg8 && local12.anInt257 == arg3) {
					local7 = local12;
					break;
				}
			}
			if (local7 == null) {
				local7 = new Class3_Sub2();
				local7.anInt256 = arg4;
				local7.anInt257 = arg3;
				local7.anInt258 = arg1;
				local7.anInt259 = arg8;
				this.method675(local7);
				this.aClass44_12.method436(local7);
			}
			local7.anInt261 = arg7;
			local7.anInt263 = arg6;
			local7.anInt262 = arg2;
			local7.anInt264 = arg5;
			local7.anInt260 = arg0;
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("68968, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILclient!QQMJEFXK;II)V")
	private void method599(@OriginalArg(1) int arg0, @OriginalArg(2) Class32 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1.anInt443 == 0 && arg1.anIntArray105 != null && (!arg1.aBoolean101 || this.anInt1014 == arg1.anInt442 || this.anInt822 == arg1.anInt442 || this.anInt1016 == arg1.anInt442)) {
				@Pc(29) int local29 = Class3_Sub1_Sub2.anInt762;
				@Pc(31) int local31 = Class3_Sub1_Sub2.anInt760;
				@Pc(33) int local33 = Class3_Sub1_Sub2.anInt763;
				@Pc(35) int local35 = Class3_Sub1_Sub2.anInt761;
				Class3_Sub1_Sub2.method518(arg3 + arg1.anInt441, arg0, arg0 + arg1.anInt438, arg3);
				@Pc(51) int local51 = arg1.anIntArray105.length;
				for (@Pc(57) int local57 = 0; local57 < local51; local57++) {
					@Pc(66) int local66 = arg1.anIntArray100[local57] + arg0;
					@Pc(75) int local75 = arg1.anIntArray104[local57] + arg3 - arg2;
					@Pc(81) Class32 local81 = Class32.method316(arg1.anIntArray105[local57]);
					@Pc(86) int local86 = local66 + local81.anInt444;
					@Pc(91) int local91 = local75 + local81.anInt433;
					if (local81.anInt430 > 0) {
						this.method655(local81);
					}
					if (local81.anInt443 == 0) {
						if (local81.anInt440 > local81.anInt417 - local81.anInt441) {
							local81.anInt440 = local81.anInt417 - local81.anInt441;
						}
						if (local81.anInt440 < 0) {
							local81.anInt440 = 0;
						}
						this.method599(local86, local81, local81.anInt440, local91);
						if (local81.anInt417 > local81.anInt441) {
							this.method697(local91, local81.anInt441, local86 + local81.anInt438, local81.anInt417, local81.anInt440);
						}
					} else if (local81.anInt443 != 1) {
						@Pc(163) int local163;
						@Pc(167) int local167;
						@Pc(178) int local178;
						@Pc(213) int local213;
						@Pc(220) int local220;
						@Pc(245) int local245;
						@Pc(161) int local161;
						@Pc(211) int local211;
						if (local81.anInt443 == 2) {
							local161 = 0;
							for (local163 = 0; local163 < local81.anInt441; local163++) {
								for (local167 = 0; local167 < local81.anInt438; local167++) {
									local178 = local86 + local167 * (local81.anInt428 + 32);
									@Pc(187) int local187 = local91 + local163 * (local81.anInt432 + 32);
									if (local161 < 20) {
										local178 += local81.anIntArray99[local161];
										local187 += local81.anIntArray102[local161];
									}
									if (local81.anIntArray101[local161] > 0) {
										local211 = 0;
										local213 = 0;
										local220 = local81.anIntArray101[local161] - 1;
										if (local178 > Class3_Sub1_Sub2.anInt762 - 32 && local178 < Class3_Sub1_Sub2.anInt763 && local187 > Class3_Sub1_Sub2.anInt760 - 32 && local187 < Class3_Sub1_Sub2.anInt761 || this.anInt980 != 0 && this.anInt979 == local161) {
											local245 = 0;
											if (this.anInt889 == 1 && this.anInt890 == local161 && this.anInt891 == local81.anInt442) {
												local245 = 16777215;
											}
											@Pc(269) Class3_Sub1_Sub2_Sub4 local269 = Class10.method124(local245, local81.anIntArray97[local161], local220);
											if (local269 != null) {
												@Pc(348) int local348;
												if (this.anInt980 != 0 && this.anInt979 == local161 && this.anInt978 == local81.anInt442) {
													local211 = super.anInt804 - this.anInt981;
													local213 = super.anInt805 - this.anInt982;
													if (local211 < 5 && local211 > -5) {
														local211 = 0;
													}
													if (local213 < 5 && local213 > -5) {
														local213 = 0;
													}
													if (this.anInt842 < 5) {
														local211 = 0;
														local213 = 0;
													}
													local269.method535((byte) 4, local178 + local211, local187 + local213);
													if (local187 + local213 < Class3_Sub1_Sub2.anInt760 && arg1.anInt440 > 0) {
														local348 = this.anInt880 * (Class3_Sub1_Sub2.anInt760 - local187 - local213) / 3;
														if (local348 > this.anInt880 * 10) {
															local348 = this.anInt880 * 10;
														}
														if (local348 > arg1.anInt440) {
															local348 = arg1.anInt440;
														}
														arg1.anInt440 -= local348;
														this.anInt982 += local348;
													}
													if (local187 + local213 + 32 > Class3_Sub1_Sub2.anInt761 && arg1.anInt440 < arg1.anInt417 - arg1.anInt441) {
														local348 = this.anInt880 * (local187 + local213 + 32 - Class3_Sub1_Sub2.anInt761) / 3;
														if (local348 > this.anInt880 * 10) {
															local348 = this.anInt880 * 10;
														}
														if (local348 > arg1.anInt417 - arg1.anInt441 - arg1.anInt440) {
															local348 = arg1.anInt417 - arg1.anInt441 - arg1.anInt440;
														}
														arg1.anInt440 += local348;
														this.anInt982 -= local348;
													}
												} else if (this.anInt852 != 0 && this.anInt851 == local161 && this.anInt850 == local81.anInt442) {
													local269.method535((byte) 4, local178, local187);
												} else {
													local269.method533(local178, local187);
												}
												if (local269.anInt774 == 33 || local81.anIntArray97[local161] != 1) {
													local348 = local81.anIntArray97[local161];
													this.aClass3_Sub1_Sub2_Sub1_2.method49(local178 + local211 + 1, 0, method674(local348), local187 + local213 + 10, this.anInt969);
													this.aClass3_Sub1_Sub2_Sub1_2.method49(local178 + local211, 16776960, method674(local348), local187 + local213 + 9, this.anInt969);
												}
											}
										}
									} else if (local81.aClass3_Sub1_Sub2_Sub4Array2 != null && local161 < 20) {
										@Pc(539) Class3_Sub1_Sub2_Sub4 local539 = local81.aClass3_Sub1_Sub2_Sub4Array2[local161];
										if (local539 != null) {
											local539.method533(local178, local187);
										}
									}
									local161++;
								}
							}
						} else if (local81.anInt443 == 3) {
							@Pc(565) boolean local565 = false;
							if (this.anInt1016 == local81.anInt442 || this.anInt822 == local81.anInt442 || this.anInt1014 == local81.anInt442) {
								local565 = true;
							}
							if (this.method694(local81)) {
								local161 = local81.anInt429;
								if (local565 && local81.anInt427 != 0) {
									local161 = local81.anInt427;
								}
							} else {
								local161 = local81.anInt446;
								if (local565 && local81.anInt423 != 0) {
									local161 = local81.anInt423;
								}
							}
							if (local81.aByte23 == 0) {
								if (local81.aBoolean105) {
									Class3_Sub1_Sub2.method521(local81.anInt438, local161, local81.anInt441, local86, this.aByte44, local91);
								} else {
									Class3_Sub1_Sub2.method522(local81.anInt441, local81.anInt438, local161, local91, local86);
								}
							} else if (local81.aBoolean105) {
								Class3_Sub1_Sub2.method520(local91, 256 - (local81.aByte23 & 0xFF), local81.anInt441, local81.anInt438, this.anInt1041, local86, local161);
							} else {
								Class3_Sub1_Sub2.method523(local91, local161, this.anInt904, local86, local81.anInt438, 256 - (local81.aByte23 & 0xFF), local81.anInt441);
							}
						} else {
							@Pc(686) Class3_Sub1_Sub2_Sub1 local686;
							@Pc(963) String local963;
							if (local81.anInt443 == 4) {
								local686 = local81.aClass3_Sub1_Sub2_Sub1_1;
								@Pc(689) String local689 = local81.aString9;
								@Pc(691) boolean local691 = false;
								if (this.anInt1016 == local81.anInt442 || this.anInt822 == local81.anInt442 || this.anInt1014 == local81.anInt442) {
									local691 = true;
								}
								if (this.method694(local81)) {
									local163 = local81.anInt429;
									if (local691 && local81.anInt427 != 0) {
										local163 = local81.anInt427;
									}
									if (local81.aString7.length() > 0) {
										local689 = local81.aString7;
									}
								} else {
									local163 = local81.anInt446;
									if (local691 && local81.anInt423 != 0) {
										local163 = local81.anInt423;
									}
								}
								if (local81.anInt421 == 6 && this.aBoolean205) {
									local689 = "Please wait...";
									local163 = local81.anInt446;
								}
								if (Class3_Sub1_Sub2.anInt758 == 479) {
									if (local163 == 16776960) {
										local163 = 255;
									}
									if (local163 == 49152) {
										local163 = 16777215;
									}
								}
								local211 = local91 + local686.anInt66;
								while (local689.length() > 0) {
									if (local689.indexOf("%") != -1) {
										label390: while (true) {
											local213 = local689.indexOf("%1");
											if (local213 == -1) {
												while (true) {
													local213 = local689.indexOf("%2");
													if (local213 == -1) {
														while (true) {
															local213 = local689.indexOf("%3");
															if (local213 == -1) {
																while (true) {
																	local213 = local689.indexOf("%4");
																	if (local213 == -1) {
																		while (true) {
																			local213 = local689.indexOf("%5");
																			if (local213 == -1) {
																				break label390;
																			}
																			local689 = local689.substring(0, local213) + this.method634(this.method686(local81, 4)) + local689.substring(local213 + 2);
																		}
																	}
																	local689 = local689.substring(0, local213) + this.method634(this.method686(local81, 3)) + local689.substring(local213 + 2);
																}
															}
															local689 = local689.substring(0, local213) + this.method634(this.method686(local81, 2)) + local689.substring(local213 + 2);
														}
													}
													local689 = local689.substring(0, local213) + this.method634(this.method686(local81, 1)) + local689.substring(local213 + 2);
												}
											}
											local689 = local689.substring(0, local213) + this.method634(this.method686(local81, 0)) + local689.substring(local213 + 2);
										}
									}
									local213 = local689.indexOf("\\n");
									if (local213 == -1) {
										local963 = local689;
										local689 = "";
									} else {
										local963 = local689.substring(0, local213);
										local689 = local689.substring(local213 + 2);
									}
									if (local81.aBoolean98) {
										local686.method46(local963, local211, local81.aBoolean100, local86 + local81.anInt438 / 2, local163);
									} else {
										local686.method53((byte) 1, local81.aBoolean100, local211, local163, local86, local963);
									}
									local211 += local686.anInt66;
								}
							} else if (local81.anInt443 == 5) {
								@Pc(1025) Class3_Sub1_Sub2_Sub4 local1025;
								if (this.method694(local81)) {
									local1025 = local81.aClass3_Sub1_Sub2_Sub4_2;
								} else {
									local1025 = local81.aClass3_Sub1_Sub2_Sub4_1;
								}
								if (local1025 != null) {
									local1025.method533(local86, local91);
								}
							} else if (local81.anInt443 == 6) {
								local161 = Class3_Sub1_Sub2_Sub2.anInt132;
								local163 = Class3_Sub1_Sub2_Sub2.anInt133;
								Class3_Sub1_Sub2_Sub2.anInt132 = local86 + local81.anInt438 / 2;
								Class3_Sub1_Sub2_Sub2.anInt133 = local91 + local81.anInt441 / 2;
								local167 = Class3_Sub1_Sub2_Sub2.anIntArray27[local81.anInt419] * local81.anInt418 >> 16;
								local178 = Class3_Sub1_Sub2_Sub2.anIntArray28[local81.anInt419] * local81.anInt418 >> 16;
								@Pc(1086) boolean local1086 = this.method694(local81);
								if (local1086) {
									local211 = local81.anInt416;
								} else {
									local211 = local81.anInt415;
								}
								@Pc(1106) Class3_Sub1_Sub1_Sub5 local1106;
								if (local211 == -1) {
									local1106 = local81.method319(-1, local1086, -1);
								} else {
									@Pc(1112) Class30 local1112 = Class30.aClass30Array1[local211];
									local1106 = local81.method319(local1112.anIntArray91[local81.anInt437], local1086, local1112.anIntArray90[local81.anInt437]);
								}
								if (local1106 != null) {
									local1106.method417(local81.anInt420, 0, local81.anInt419, 0, local167, local178);
								}
								Class3_Sub1_Sub2_Sub2.anInt132 = local161;
								Class3_Sub1_Sub2_Sub2.anInt133 = local163;
							} else {
								if (local81.anInt443 == 7) {
									local686 = local81.aClass3_Sub1_Sub2_Sub1_1;
									local163 = 0;
									for (local167 = 0; local167 < local81.anInt441; local167++) {
										for (local178 = 0; local178 < local81.anInt438; local178++) {
											if (local81.anIntArray101[local163] > 0) {
												@Pc(1176) Class10 local1176 = Class10.method118(local81.anIntArray101[local163] - 1);
												@Pc(1180) String local1180 = String.valueOf(local1176.aString3);
												if (local1176.aBoolean44 || local81.anIntArray97[local163] != 1) {
													local1180 = local1180 + " x" + method685(local81.anIntArray97[local163]);
												}
												local213 = local86 + local178 * (local81.anInt428 + 115);
												local220 = local91 + local167 * (local81.anInt432 + 12);
												if (local81.aBoolean98) {
													local686.method46(local1180, local220, local81.aBoolean100, local213 + local81.anInt438 / 2, local81.anInt446);
												} else {
													local686.method53((byte) 1, local81.aBoolean100, local220, local81.anInt446, local213, local1180);
												}
											}
											local163++;
										}
									}
								}
								if (local81.anInt443 == 8 && (this.anInt942 == local81.anInt442 || this.anInt816 == local81.anInt442 || this.anInt939 == local81.anInt442) && this.anInt917 == 100) {
									local161 = 0;
									local163 = 0;
									@Pc(1294) Class3_Sub1_Sub2_Sub1 local1294 = this.aClass3_Sub1_Sub2_Sub1_3;
									@Pc(1297) String local1297 = local81.aString9;
									while (local1297.length() > 0) {
										local211 = local1297.indexOf("\\n");
										if (local211 == -1) {
											local963 = local1297;
											local1297 = "";
										} else {
											local963 = local1297.substring(0, local211);
											local1297 = local1297.substring(local211 + 2);
										}
										local213 = local1294.method47(this.anInt1021, local963);
										if (local213 > local161) {
											local161 = local213;
										}
										local163 += local1294.anInt66 + 1;
									}
									local161 += 6;
									local163 += 7;
									local211 = local86 + local81.anInt438 - local161 - 5;
									local213 = local91 + local81.anInt441 + 5;
									if (local211 < local86 + 5) {
										local211 = local86 + 5;
									}
									if (local211 + local161 > arg0 + arg1.anInt438) {
										local211 = arg0 + arg1.anInt438 - local161;
									}
									if (local213 + local163 > arg3 + arg1.anInt441) {
										local213 = arg3 + arg1.anInt441 - local163;
									}
									Class3_Sub1_Sub2.method521(local161, 16777120, local163, local211, this.aByte44, local213);
									Class3_Sub1_Sub2.method522(local163, local161, 0, local213, local211);
									local1297 = local81.aString9;
									local220 = local213 + local1294.anInt66 + 2;
									while (local1297.length() > 0) {
										local245 = local1297.indexOf("\\n");
										if (local245 == -1) {
											local963 = local1297;
											local1297 = "";
										} else {
											local963 = local1297.substring(0, local245);
											local1297 = local1297.substring(local245 + 2);
										}
										local1294.method53((byte) 1, false, local220, 0, local211 + 3, local963);
										local220 += local1294.anInt66 + 1;
									}
								}
							}
						}
					}
				}
				Class3_Sub1_Sub2.method518(local35, local29, local33, local31);
			}
		} catch (@Pc(1484) RuntimeException local1484) {
			signlink.reporterror("90811, " + 66 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local1484.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZ)V")
	private void method600(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		try {
			signlink.anInt1060 = arg0;
			if (arg1) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("21357, " + arg0 + ", " + 941 + ", " + arg1 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!WNCFPLWV;IB)V")
	private void method601(@OriginalArg(0) Class3_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt829 = 0;
			this.anInt930 = 0;
			this.method665(arg0, arg1);
			this.method617(arg0, arg1);
			this.method595(arg1, arg0);
			this.method646(arg1, arg0);
			@Pc(41) int local41;
			for (@Pc(34) int local34 = 0; local34 < this.anInt829; local34++) {
				local41 = this.anIntArray213[local34];
				if (this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local41].anInt715 != anInt919) {
					this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local41] = null;
				}
			}
			if (arg0.anInt666 != arg1) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.anInt666 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local41 = 0; local41 < this.anInt929; local41++) {
				if (this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[this.anIntArray238[local41]] == null) {
					signlink.reporterror(this.aString22 + " null entry in pl list - pos:" + local41 + " size:" + this.anInt929);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("62216, " + arg0 + ", " + arg1 + ", " + 3 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method602() {
		try {
			if (this.anInt887 == 2) {
				this.method668((this.anInt875 - this.anInt946 << 7) + this.anInt878, this.aByte40, (this.anInt876 - this.anInt947 << 7) + this.anInt879, this.anInt877 * 2);
				if (this.anInt1035 > -1 && anInt919 % 20 < 10) {
					this.aClass3_Sub1_Sub2_Sub4Array7[0].method533(this.anInt1035 - 12, this.anInt1036 - 28);
				}
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("88683, " + 0 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;B)V")
	private void method603(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		try {
			if (arg0 == 0 && this.anInt997 != -1) {
				this.aString25 = arg2;
				super.anInt809 = 0;
			}
			if (this.anInt840 == -1) {
				this.aBoolean197 = true;
			}
			for (@Pc(20) int local20 = 99; local20 > 0; local20--) {
				this.anIntArray248[local20] = this.anIntArray248[local20 - 1];
				this.aStringArray10[local20] = this.aStringArray10[local20 - 1];
				this.aStringArray11[local20] = this.aStringArray11[local20 - 1];
			}
			this.anIntArray248[0] = arg0;
			this.aStringArray10[0] = arg1;
			this.aStringArray11[0] = arg2;
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("5182, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 1 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)V")
	private void method604(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method605(@OriginalArg(0) int arg0) {
		try {
			this.aBoolean221 = false;
			while (this.aBoolean219) {
				this.aBoolean221 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(11) Exception local11) {
				}
			}
			this.aClass3_Sub1_Sub2_Sub3_1 = null;
			this.aClass3_Sub1_Sub2_Sub3_2 = null;
			@Pc(25) boolean local25 = false;
			this.aClass3_Sub1_Sub2_Sub3Array5 = null;
			this.anIntArray215 = null;
			this.anIntArray216 = null;
			this.anIntArray217 = null;
			this.anIntArray218 = null;
			this.anIntArray235 = null;
			this.anIntArray236 = null;
			this.anIntArray245 = null;
			this.anIntArray246 = null;
			this.aClass3_Sub1_Sub2_Sub4_3 = null;
			this.aClass3_Sub1_Sub2_Sub4_4 = null;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("22356, " + arg0 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method606(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString27 = "";
				this.aString28 = "Connecting to server...";
				this.method702(true);
			}
			this.aClass42_1 = new Class42(this.method621(anInt865 + 43594), 9, this);
			@Pc(30) long local30 = Class15.method198(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass3_Sub1_Sub4_7.anInt666 = 0;
			this.aClass3_Sub1_Sub4_7.method448(14);
			this.aClass3_Sub1_Sub4_7.method448(local37);
			this.aClass42_1.method432(this.aClass3_Sub1_Sub4_7.aByteArray20, 2);
			for (@Pc(60) int local60 = 0; local60 < 8; local60++) {
				this.aClass42_1.method429();
			}
			@Pc(74) int local74 = this.aClass42_1.method429();
			@Pc(76) int local76 = local74;
			@Pc(225) int local225;
			@Pc(260) int local260;
			if (local74 == 0) {
				this.aClass42_1.method431(this.aClass3_Sub1_Sub4_6.aByteArray20, 0, 8);
				this.aClass3_Sub1_Sub4_6.anInt666 = 0;
				this.aLong31 = this.aClass3_Sub1_Sub4_6.method464();
				@Pc(99) int[] local99 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong31 >> 32), (int) this.aLong31 };
				this.aClass3_Sub1_Sub4_7.anInt666 = 0;
				this.aClass3_Sub1_Sub4_7.method448(10);
				this.aClass3_Sub1_Sub4_7.method452(local99[0]);
				this.aClass3_Sub1_Sub4_7.method452(local99[1]);
				this.aClass3_Sub1_Sub4_7.method452(local99[2]);
				this.aClass3_Sub1_Sub4_7.method452(local99[3]);
				this.aClass3_Sub1_Sub4_7.method452(signlink.anInt1055);
				this.aClass3_Sub1_Sub4_7.method455(arg0);
				this.aClass3_Sub1_Sub4_7.method455(arg1);
				this.aClass3_Sub1_Sub4_7.method473(aBigInteger2, aBigInteger1);
				this.aClass3_Sub1_Sub4_9.anInt666 = 0;
				if (arg2) {
					this.aClass3_Sub1_Sub4_9.method448(18);
				} else {
					this.aClass3_Sub1_Sub4_9.method448(16);
				}
				this.aClass3_Sub1_Sub4_9.method448(this.aClass3_Sub1_Sub4_7.anInt666 + 36 + 1 + 1 + 2);
				this.aClass3_Sub1_Sub4_9.method448(255);
				this.aClass3_Sub1_Sub4_9.method449(373);
				this.aClass3_Sub1_Sub4_9.method448(aBoolean203 ? 1 : 0);
				for (local225 = 0; local225 < 9; local225++) {
					this.aClass3_Sub1_Sub4_9.method452(this.anIntArray266[local225]);
				}
				this.aClass3_Sub1_Sub4_9.method456(this.aByte39, this.aClass3_Sub1_Sub4_7.aByteArray20, this.aClass3_Sub1_Sub4_7.anInt666);
				this.aClass3_Sub1_Sub4_7.aClass21_1 = new Class21(local99, (byte) 53);
				for (local260 = 0; local260 < 4; local260++) {
					local99[local260] += 50;
				}
				this.aClass21_2 = new Class21(local99, (byte) 53);
				this.aClass42_1.method432(this.aClass3_Sub1_Sub4_9.aByteArray20, this.aClass3_Sub1_Sub4_9.anInt666);
				local74 = this.aClass42_1.method429();
			}
			if (local74 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(302) Exception local302) {
				}
				this.method606(arg0, arg1, arg2);
			} else {
				@Pc(390) int local390;
				if (local74 == 2) {
					this.anInt815 = this.aClass42_1.method429();
					aBoolean200 = this.aClass42_1.method429() == 1;
					this.aLong29 = 0L;
					this.anInt897 = 0;
					this.aClass17_1.anInt245 = 0;
					super.aBoolean195 = true;
					this.aBoolean209 = true;
					this.aBoolean206 = true;
					this.aClass3_Sub1_Sub4_7.anInt666 = 0;
					this.aClass3_Sub1_Sub4_6.anInt666 = 0;
					this.anInt871 = -1;
					this.anInt835 = -1;
					this.anInt836 = -1;
					this.anInt837 = -1;
					this.anInt870 = 0;
					this.anInt872 = 0;
					this.anInt996 = 0;
					this.anInt874 = 0;
					this.anInt887 = 0;
					this.anInt1045 = 0;
					this.aBoolean231 = false;
					super.anInt802 = 0;
					for (local390 = 0; local390 < 100; local390++) {
						this.aStringArray11[local390] = null;
					}
					this.anInt889 = 0;
					this.anInt1050 = 0;
					this.anInt1044 = 0;
					this.anInt983 = 0;
					this.anInt925 = (int) (Math.random() * 100.0D) - 50;
					this.anInt922 = (int) (Math.random() * 110.0D) - 55;
					this.anInt817 = (int) (Math.random() * 80.0D) - 40;
					this.anInt855 = (int) (Math.random() * 120.0D) - 60;
					this.anInt989 = (int) (Math.random() * 30.0D) - 20;
					this.anInt858 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt881 = 0;
					this.anInt952 = -1;
					this.anInt931 = 0;
					this.anInt932 = 0;
					this.anInt929 = 0;
					this.anInt1011 = 0;
					for (local225 = 0; local225 < this.anInt927; local225++) {
						this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local225] = null;
						this.aClass3_Sub1_Sub4Array1[local225] = null;
					}
					for (local260 = 0; local260 < 16384; local260++) {
						this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local260] = null;
					}
					aClass3_Sub1_Sub1_Sub4_Sub2_1 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[this.anInt928] = new Class3_Sub1_Sub1_Sub4_Sub2();
					this.aClass44_10.method443();
					this.aClass44_11.method443();
					@Pc(535) int local535;
					@Pc(539) int local539;
					for (@Pc(531) int local531 = 0; local531 < 4; local531++) {
						for (local535 = 0; local535 < 104; local535++) {
							for (local539 = 0; local539 < 104; local539++) {
								this.aClass44ArrayArrayArray1[local531][local535][local539] = null;
							}
						}
					}
					this.aClass44_12 = new Class44(aByte38);
					this.anInt908 = 0;
					this.anInt907 = 0;
					this.method613(this.anInt997);
					this.anInt997 = -1;
					this.method613(this.anInt840);
					this.anInt840 = -1;
					this.method613(this.anInt961);
					this.anInt961 = -1;
					this.method613(this.anInt998);
					this.anInt998 = -1;
					this.method613(this.anInt955);
					this.anInt955 = -1;
					this.method613(this.anInt920);
					this.anInt920 = -1;
					this.method613(this.anInt995);
					this.anInt995 = -1;
					this.aBoolean205 = false;
					this.anInt994 = 3;
					this.anInt1020 = 0;
					this.aBoolean231 = false;
					this.aBoolean204 = false;
					this.aString25 = null;
					this.anInt866 = 0;
					this.anInt839 = -1;
					this.aBoolean235 = true;
					this.method676();
					for (local535 = 0; local535 < 5; local535++) {
						this.anIntArray243[local535] = 0;
					}
					for (local539 = 0; local539 < 5; local539++) {
						this.aStringArray9[local539] = null;
						this.aBooleanArray11[local539] = false;
					}
					anInt987 = 0;
					anInt953 = 0;
					anInt916 = 0;
					anInt1000 = 0;
					anInt945 = 0;
					this.method723();
				} else if (local74 == 3) {
					this.aString27 = "";
					this.aString28 = "Invalid username or password.";
				} else if (local74 == 4) {
					this.aString27 = "Your account has been disabled.";
					this.aString28 = "Please check your message-centre for details.";
				} else if (local74 == 5) {
					this.aString27 = "Your account is already logged in.";
					this.aString28 = "Try again in 60 secs...";
				} else if (local74 == 6) {
					this.aString27 = "RuneScape has been updated!";
					this.aString28 = "Please reload this page.";
				} else if (local74 == 7) {
					this.aString27 = "This world is full.";
					this.aString28 = "Please use a different world.";
				} else if (local74 == 8) {
					this.aString27 = "Unable to connect.";
					this.aString28 = "Login server offline.";
				} else if (local74 == 9) {
					this.aString27 = "Login limit exceeded.";
					this.aString28 = "Too many connections from your address.";
				} else if (local74 == 10) {
					this.aString27 = "Unable to connect.";
					this.aString28 = "Bad session id.";
				} else if (local74 == 12) {
					this.aString27 = "You need a members account to login to this world.";
					this.aString28 = "Please subscribe, or use a different world.";
				} else if (local74 == 13) {
					this.aString27 = "Could not complete login.";
					this.aString28 = "Please try using a different world.";
				} else if (local74 == 14) {
					this.aString27 = "The server is being updated.";
					this.aString28 = "Please wait 1 minute and try again.";
				} else if (local74 == 15) {
					this.aBoolean206 = true;
					this.aClass3_Sub1_Sub4_7.anInt666 = 0;
					this.aClass3_Sub1_Sub4_6.anInt666 = 0;
					this.anInt871 = -1;
					this.anInt835 = -1;
					this.anInt836 = -1;
					this.anInt837 = -1;
					this.anInt870 = 0;
					this.anInt872 = 0;
					this.anInt996 = 0;
					this.anInt1045 = 0;
					this.aBoolean231 = false;
					this.aLong32 = System.currentTimeMillis();
				} else if (local74 == 16) {
					this.aString27 = "Login attempts exceeded.";
					this.aString28 = "Please wait 1 minute and try again.";
				} else if (local74 == 17) {
					this.aString27 = "You are standing in a members-only area.";
					this.aString28 = "To play on this world move to a free area first";
				} else if (local74 == 20) {
					this.aString27 = "Invalid loginserver requested";
					this.aString28 = "Please try using a different world.";
				} else if (local74 == 21) {
					local390 = this.aClass42_1.method429();
					for (@Pc(908) int local908 = local390 + 3; local908 >= 0; local908--) {
						this.aString27 = "You have only just left another world";
						this.aString28 = "Your profile will be transferred in: " + local908;
						this.method702(true);
						try {
							Thread.sleep(1200L);
						} catch (@Pc(930) Exception local930) {
						}
					}
					this.method606(arg0, arg1, arg2);
				} else if (local74 == 22) {
					this.aString27 = "Malformed login packet.";
					this.aString28 = "Please try again.";
				} else if (local74 == 23) {
					this.aString27 = "No reply from loginserver.";
					this.aString28 = "Please try again.";
				} else if (local74 == 24) {
					this.aString27 = "Error loading your profile.";
					this.aString28 = "Please contact customer support.";
				} else if (local74 == 25) {
					this.aString27 = "Unexpected loginserver response.";
					this.aString28 = "Please try using a different world.";
				} else if (local74 == 26) {
					this.aString27 = "This computers address has been blocked";
					this.aString28 = "as it was used to break our rules";
				} else if (local74 != -1) {
					System.out.println("response:" + local74);
					this.aString27 = "Unexpected server response";
					this.aString28 = "Please try using a different world.";
				} else if (local76 != 0) {
					this.aString27 = "No response from server";
					this.aString28 = "Please try using a different world.";
				} else if (this.anInt1001 < 2) {
					try {
						Thread.sleep(2000L);
					} catch (@Pc(1002) Exception local1002) {
					}
					this.anInt1001++;
					this.method606(arg0, arg1, arg2);
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

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method607(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				this.anInt871 = -1;
			}
			while (true) {
				@Pc(10) Class3_Sub1_Sub3 local10 = this.aClass16_Sub1_1.method225();
				if (local10 == null) {
					return;
				}
				if (local10.anInt285 == 0) {
					Class3_Sub1_Sub1_Sub5.method394(local10.anInt287, local10.aByteArray8, (byte) 6);
					if ((this.aClass16_Sub1_1.method208(local10.anInt287) & 0x62) != 0) {
						this.aBoolean207 = true;
						if (this.anInt840 != -1 || this.anInt997 != -1) {
							this.aBoolean197 = true;
						}
					}
				}
				if (local10.anInt285 == 1 && local10.aByteArray8 != null) {
					Class5.method61(local10.aByteArray8);
				}
				if (local10.anInt285 == 2 && local10.anInt287 == this.anInt819 && local10.aByteArray8 != null) {
					this.method649(this.aBoolean196, local10.aByteArray8);
				}
				if (local10.anInt285 == 3 && this.anInt1044 == 1) {
					for (@Pc(85) int local85 = 0; local85 < this.aByteArrayArray6.length; local85++) {
						if (this.anIntArray232[local85] == local10.anInt287) {
							this.aByteArrayArray6[local85] = local10.aByteArray8;
							if (local10.aByteArray8 == null) {
								this.anIntArray232[local85] = -1;
							}
							break;
						}
						if (this.anIntArray233[local85] == local10.anInt287) {
							this.aByteArrayArray5[local85] = local10.aByteArray8;
							if (local10.aByteArray8 == null) {
								this.anIntArray233[local85] = -1;
							}
							break;
						}
					}
				}
				if (local10.anInt285 == 93 && this.aClass16_Sub1_1.method215(local10.anInt287, (byte) 2)) {
					Class47.method548(new Class3_Sub1_Sub4((byte) -58, local10.aByteArray8), this.aClass16_Sub1_1);
				}
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("56128, " + arg0 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	private void method608() {
		try {
			try {
				if (this.aClass42_1 != null) {
					this.aClass42_1.method428();
				}
			} catch (@Pc(13) Exception local13) {
			}
			this.aClass42_1 = null;
			this.aBoolean206 = false;
			this.anInt1019 = 0;
			this.aString22 = "";
			this.aString23 = "";
			this.method680();
			this.aClass25_1.method248();
			for (@Pc(37) int local37 = 0; local37 < 4; local37++) {
				this.aClass11Array1[local37].method128();
			}
			System.gc();
			this.method638();
			this.anInt854 = -1;
			this.anInt819 = -1;
			this.anInt898 = 0;
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("80227, " + 3 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)V")
	private void method609(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(19) int local19;
			if (this.aClass13_5 != null) {
				this.aClass13_5.method157(this.aBoolean229);
				Class3_Sub1_Sub2_Sub2.anIntArray29 = this.anIntArray229;
				local19 = 151;
				if (arg1 != null) {
					local19 -= 7;
				}
				this.aClass3_Sub1_Sub2_Sub1_3.method45(local19, arg0, 257, 0);
				this.aClass3_Sub1_Sub2_Sub1_3.method45(local19 - 1, arg0, 256, 16777215);
				local19 += 15;
				if (arg1 != null) {
					this.aClass3_Sub1_Sub2_Sub1_3.method45(local19, arg1, 257, 0);
					this.aClass3_Sub1_Sub2_Sub1_3.method45(local19 - 1, arg1, 256, 16777215);
				}
				this.aClass13_5.method158(4, super.aGraphics2, 4);
			} else if (super.aClass13_2 != null) {
				super.aClass13_2.method157(this.aBoolean229);
				Class3_Sub1_Sub2_Sub2.anIntArray29 = this.anIntArray230;
				local19 = 251;
				Class3_Sub1_Sub2.method521(300, 0, 50, 233, this.aByte44, 221);
				Class3_Sub1_Sub2.method522(50, 300, 16777215, 221, 233);
				if (arg1 != null) {
					local19 -= 7;
				}
				this.aClass3_Sub1_Sub2_Sub1_3.method45(local19, arg0, 383, 0);
				this.aClass3_Sub1_Sub2_Sub1_3.method45(local19 - 1, arg0, 382, 16777215);
				local19 += 15;
				if (arg1 != null) {
					this.aClass3_Sub1_Sub2_Sub1_3.method45(local19, arg1, 383, 0);
					this.aClass3_Sub1_Sub2_Sub1_3.method45(local19 - 1, arg1, 382, 16777215);
				}
				super.aClass13_2.method158(0, super.aGraphics2, 0);
			}
		} catch (@Pc(174) RuntimeException local174) {
			signlink.reporterror("83274, " + -95 + ", " + arg0 + ", " + arg1 + ", " + local174.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIIZZI)Z")
	private boolean method610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray23[local7][local11] = 0;
					this.anIntArrayArray25[local7][local11] = 99999999;
				}
			}
			local11 = arg2;
			@Pc(39) int local39 = arg1;
			this.anIntArrayArray23[arg2][arg1] = 99;
			this.anIntArrayArray25[arg2][arg1] = 0;
			@Pc(55) byte local55 = 0;
			@Pc(57) int local57 = 0;
			this.anIntArray225[0] = arg2;
			@Pc(66) int local66 = local55 + 1;
			this.anIntArray226[0] = arg1;
			@Pc(70) boolean local70 = false;
			@Pc(74) int local74 = this.anIntArray225.length;
			@Pc(81) int[][] local81 = this.aClass11Array1[this.anInt894].anIntArrayArray4;
			@Pc(192) int local192;
			while (local57 != local66) {
				local11 = this.anIntArray225[local57];
				local39 = this.anIntArray226[local57];
				local57 = (local57 + 1) % local74;
				if (local11 == arg4 && local39 == arg10) {
					local70 = true;
					break;
				}
				if (arg7 != 0) {
					if ((arg7 < 5 || arg7 == 10) && this.aClass11Array1[this.anInt894].method137(local39, arg10, arg3, arg4, local11, arg7 - 1)) {
						local70 = true;
						break;
					}
					if (arg7 < 10 && this.aClass11Array1[this.anInt894].method138(arg10, local39, arg3, arg7 - 1, arg4, local11)) {
						local70 = true;
						break;
					}
				}
				if (arg6 != 0 && arg0 != 0 && this.aClass11Array1[this.anInt894].method139(arg10, arg4, arg0, arg6, arg5, local11, local39)) {
					local70 = true;
					break;
				}
				local192 = this.anIntArrayArray25[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray23[local11 - 1][local39] == 0 && (local81[local11 - 1][local39] & 0x1280108) == 0) {
					this.anIntArray225[local66] = local11 - 1;
					this.anIntArray226[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray23[local11 - 1][local39] = 2;
					this.anIntArrayArray25[local11 - 1][local39] = local192;
				}
				if (local11 < 103 && this.anIntArrayArray23[local11 + 1][local39] == 0 && (local81[local11 + 1][local39] & 0x1280180) == 0) {
					this.anIntArray225[local66] = local11 + 1;
					this.anIntArray226[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray23[local11 + 1][local39] = 8;
					this.anIntArrayArray25[local11 + 1][local39] = local192;
				}
				if (local39 > 0 && this.anIntArrayArray23[local11][local39 - 1] == 0 && (local81[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray225[local66] = local11;
					this.anIntArray226[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray23[local11][local39 - 1] = 1;
					this.anIntArrayArray25[local11][local39 - 1] = local192;
				}
				if (local39 < 103 && this.anIntArrayArray23[local11][local39 + 1] == 0 && (local81[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray225[local66] = local11;
					this.anIntArray226[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray23[local11][local39 + 1] = 4;
					this.anIntArrayArray25[local11][local39 + 1] = local192;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray23[local11 - 1][local39 - 1] == 0 && (local81[local11 - 1][local39 - 1] & 0x128010E) == 0 && (local81[local11 - 1][local39] & 0x1280108) == 0 && (local81[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray225[local66] = local11 - 1;
					this.anIntArray226[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray23[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray25[local11 - 1][local39 - 1] = local192;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray23[local11 + 1][local39 - 1] == 0 && (local81[local11 + 1][local39 - 1] & 0x1280183) == 0 && (local81[local11 + 1][local39] & 0x1280180) == 0 && (local81[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray225[local66] = local11 + 1;
					this.anIntArray226[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray23[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray25[local11 + 1][local39 - 1] = local192;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray23[local11 - 1][local39 + 1] == 0 && (local81[local11 - 1][local39 + 1] & 0x1280138) == 0 && (local81[local11 - 1][local39] & 0x1280108) == 0 && (local81[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray225[local66] = local11 - 1;
					this.anIntArray226[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray23[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray25[local11 - 1][local39 + 1] = local192;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray23[local11 + 1][local39 + 1] == 0 && (local81[local11 + 1][local39 + 1] & 0x12801E0) == 0 && (local81[local11 + 1][local39] & 0x1280180) == 0 && (local81[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray225[local66] = local11 + 1;
					this.anIntArray226[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray23[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray25[local11 + 1][local39 + 1] = local192;
				}
			}
			this.anInt1047 = 0;
			@Pc(808) int local808;
			@Pc(814) int local814;
			@Pc(820) int local820;
			if (!local70) {
				if (!arg9) {
					return false;
				}
				local192 = 1000;
				local808 = 100;
				for (local814 = arg4 - 10; local814 <= arg4 + 10; local814++) {
					for (local820 = arg10 - 10; local820 <= arg10 + 10; local820++) {
						if (local814 >= 0 && local820 >= 0 && local814 < 104 && local820 < 104 && this.anIntArrayArray25[local814][local820] < 100) {
							@Pc(842) int local842 = 0;
							if (local814 < arg4) {
								local842 = arg4 - local814;
							} else if (local814 > arg4 + arg6 - 1) {
								local842 = local814 + 1 - arg4 - arg6;
							}
							@Pc(868) int local868 = 0;
							if (local820 < arg10) {
								local868 = arg10 - local820;
							} else if (local820 > arg10 + arg0 - 1) {
								local868 = local820 + 1 - arg10 - arg0;
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
				if (local11 == arg2 && local39 == arg1) {
					return false;
				}
				this.anInt1047 = 1;
			}
			@Pc(961) byte local961 = 0;
			this.anIntArray225[0] = local11;
			local57 = local961 + 1;
			this.anIntArray226[0] = local39;
			local192 = local808 = this.anIntArrayArray23[local11][local39];
			while (local11 != arg2 || local39 != arg1) {
				if (local192 != local808) {
					local808 = local192;
					this.anIntArray225[local57] = local11;
					this.anIntArray226[local57++] = local39;
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
				local192 = this.anIntArrayArray23[local11][local39];
			}
			if (local57 > 0) {
				local74 = local57;
				if (local57 > 25) {
					local74 = 25;
				}
				local57--;
				@Pc(1060) int local1060 = this.anIntArray225[local57];
				local814 = this.anIntArray226[local57];
				if (arg8 == 0) {
					this.aClass3_Sub1_Sub4_7.method447(67);
					this.aClass3_Sub1_Sub4_7.method448(local74 + local74 + 3);
				}
				if (arg8 == 1) {
					this.aClass3_Sub1_Sub4_7.method447(125);
					this.aClass3_Sub1_Sub4_7.method448(local74 + local74 + 3 + 14);
				}
				if (arg8 == 2) {
					this.aClass3_Sub1_Sub4_7.method447(10);
					this.aClass3_Sub1_Sub4_7.method448(local74 + local74 + 3);
				}
				this.anInt931 = this.anIntArray225[0];
				this.anInt932 = this.anIntArray226[0];
				for (local820 = 1; local820 < local74; local820++) {
					local57--;
					this.aClass3_Sub1_Sub4_7.method474(this.anIntArray225[local57] - local1060);
					this.aClass3_Sub1_Sub4_7.method448(this.anIntArray226[local57] - local814);
				}
				this.aClass3_Sub1_Sub4_7.method482(local814 + this.anInt947);
				this.aClass3_Sub1_Sub4_7.method448(super.anIntArray210[5] == 1 ? 1 : 0);
				this.aClass3_Sub1_Sub4_7.method449(local1060 + this.anInt946);
				return true;
			} else if (arg8 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1191) RuntimeException local1191) {
			signlink.reporterror("5557, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + true + ", " + arg9 + ", " + arg10 + ", " + local1191.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method611() {
		try {
			if (super.anInt809 == 1) {
				if (super.anInt810 >= 6 && super.anInt810 <= 106 && super.anInt811 >= 467 && super.anInt811 <= 499) {
					this.anInt964 = (this.anInt964 + 1) % 4;
					this.aBoolean222 = true;
					this.aBoolean197 = true;
					this.aClass3_Sub1_Sub4_7.method447(8);
					this.aClass3_Sub1_Sub4_7.method448(this.anInt964);
					this.aClass3_Sub1_Sub4_7.method448(this.anInt935);
					this.aClass3_Sub1_Sub4_7.method448(this.anInt838);
				}
				if (super.anInt810 >= 135 && super.anInt810 <= 235 && super.anInt811 >= 467 && super.anInt811 <= 499) {
					this.anInt935 = (this.anInt935 + 1) % 3;
					this.aBoolean222 = true;
					this.aBoolean197 = true;
					this.aClass3_Sub1_Sub4_7.method447(8);
					this.aClass3_Sub1_Sub4_7.method448(this.anInt964);
					this.aClass3_Sub1_Sub4_7.method448(this.anInt935);
					this.aClass3_Sub1_Sub4_7.method448(this.anInt838);
				}
				if (super.anInt810 >= 273 && super.anInt810 <= 373 && super.anInt811 >= 467 && super.anInt811 <= 499) {
					this.anInt838 = (this.anInt838 + 1) % 3;
					this.aBoolean222 = true;
					this.aBoolean197 = true;
					this.aClass3_Sub1_Sub4_7.method447(8);
					this.aClass3_Sub1_Sub4_7.method448(this.anInt964);
					this.aClass3_Sub1_Sub4_7.method448(this.anInt935);
					this.aClass3_Sub1_Sub4_7.method448(this.anInt838);
				}
				if (super.anInt810 >= 412 && super.anInt810 <= 512 && super.anInt811 >= 467 && super.anInt811 <= 499) {
					if (this.anInt961 == -1) {
						this.method683();
						this.aString18 = "";
						this.aBoolean213 = false;
						this.anInt976 = this.anInt961 = Class32.anInt422;
						return;
					}
					this.method603(0, "", "Please close the interface you have open before using 'report abuse'");
					return;
				}
			}
		} catch (@Pc(202) RuntimeException local202) {
			signlink.reporterror("29818, " + -26949 + ", " + local202.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZJ)V")
	private void method612(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt1046; local8++) {
					if (this.aLongArray4[local8] == arg0) {
						this.anInt1046--;
						this.aBoolean207 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt1046; local28++) {
							this.aLongArray4[local28] = this.aLongArray4[local28 + 1];
						}
						this.aClass3_Sub1_Sub4_7.method447(35);
						this.aClass3_Sub1_Sub4_7.method454(arg0);
						break;
					}
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("30472, " + false + ", " + arg0 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method613(@OriginalArg(1) int arg0) {
		try {
			Class32.method318(arg0);
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("63880, " + 6 + ", " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method614() {
		try {
			this.anInt870 += 0;
			if (this.anInt881 == 0 && super.anInt809 == 1) {
				@Pc(20) int local20 = super.anInt810 - 25 - 550;
				@Pc(27) int local27 = super.anInt811 - 5 - 4;
				if (local20 >= 0 && local27 >= 0 && local20 < 146 && local27 < 151) {
					local20 -= 73;
					local27 -= 75;
					@Pc(47) int local47 = this.anInt858 + this.anInt855 & 0x7FF;
					@Pc(51) int local51 = Class3_Sub1_Sub2_Sub2.anIntArray27[local47];
					@Pc(55) int local55 = Class3_Sub1_Sub2_Sub2.anIntArray28[local47];
					@Pc(64) int local64 = local51 * (this.anInt989 + 256) >> 8;
					@Pc(73) int local73 = local55 * (this.anInt989 + 256) >> 8;
					@Pc(83) int local83 = local27 * local64 + local20 * local73 >> 11;
					@Pc(93) int local93 = local27 * local73 - local20 * local64 >> 11;
					@Pc(100) int local100 = aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt728 + local83 >> 7;
					@Pc(107) int local107 = aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt729 - local93 >> 7;
					@Pc(128) boolean local128 = this.method610(0, aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray175[0], aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray174[0], 0, local100, 0, 0, 0, 1, true, local107);
					if (local128) {
						this.aClass3_Sub1_Sub4_7.method448(local20);
						this.aClass3_Sub1_Sub4_7.method448(local27);
						this.aClass3_Sub1_Sub4_7.method449(this.anInt858);
						this.aClass3_Sub1_Sub4_7.method448(57);
						this.aClass3_Sub1_Sub4_7.method448(this.anInt855);
						this.aClass3_Sub1_Sub4_7.method448(this.anInt989);
						this.aClass3_Sub1_Sub4_7.method448(89);
						this.aClass3_Sub1_Sub4_7.method449(aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt728);
						this.aClass3_Sub1_Sub4_7.method449(aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt729);
						this.aClass3_Sub1_Sub4_7.method448(this.anInt1047);
						this.aClass3_Sub1_Sub4_7.method448(63);
						return;
					}
				}
			}
		} catch (@Pc(182) RuntimeException local182) {
			signlink.reporterror("34909, " + 0 + ", " + local182.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method615() {
		try {
			this.aClass3_Sub1_Sub2_Sub3_1 = new Class3_Sub1_Sub2_Sub3(this.aClass35_2, "titlebox", 0);
			this.aClass3_Sub1_Sub2_Sub3_2 = new Class3_Sub1_Sub2_Sub3(this.aClass35_2, "titlebutton", 0);
			this.aClass3_Sub1_Sub2_Sub3Array5 = new Class3_Sub1_Sub2_Sub3[12];
			for (@Pc(29) int local29 = 0; local29 < 12; local29++) {
				this.aClass3_Sub1_Sub2_Sub3Array5[local29] = new Class3_Sub1_Sub2_Sub3(this.aClass35_2, "runes", local29);
			}
			this.aClass3_Sub1_Sub2_Sub4_3 = new Class3_Sub1_Sub2_Sub4(128, 265);
			this.aClass3_Sub1_Sub2_Sub4_4 = new Class3_Sub1_Sub2_Sub4(128, 265);
			for (@Pc(62) int local62 = 0; local62 < 33920; local62++) {
				this.aClass3_Sub1_Sub2_Sub4_3.anIntArray182[local62] = this.aClass13_10.anIntArray40[local62];
			}
			for (@Pc(80) int local80 = 0; local80 < 33920; local80++) {
				this.aClass3_Sub1_Sub2_Sub4_4.anIntArray182[local80] = this.aClass13_11.anIntArray40[local80];
			}
			this.anIntArray216 = new int[256];
			for (@Pc(102) int local102 = 0; local102 < 64; local102++) {
				this.anIntArray216[local102] = local102 * 262144;
			}
			for (@Pc(117) int local117 = 0; local117 < 64; local117++) {
				this.anIntArray216[local117 + 64] = local117 * 1024 + 16711680;
			}
			for (@Pc(136) int local136 = 0; local136 < 64; local136++) {
				this.anIntArray216[local136 + 128] = local136 * 4 + 16776960;
			}
			for (@Pc(155) int local155 = 0; local155 < 64; local155++) {
				this.anIntArray216[local155 + 192] = 16777215;
			}
			this.anIntArray217 = new int[256];
			for (@Pc(174) int local174 = 0; local174 < 64; local174++) {
				this.anIntArray217[local174] = local174 * 1024;
			}
			for (@Pc(189) int local189 = 0; local189 < 64; local189++) {
				this.anIntArray217[local189 + 64] = local189 * 4 + 65280;
			}
			for (@Pc(208) int local208 = 0; local208 < 64; local208++) {
				this.anIntArray217[local208 + 128] = local208 * 262144 + 65535;
			}
			for (@Pc(227) int local227 = 0; local227 < 64; local227++) {
				this.anIntArray217[local227 + 192] = 16777215;
			}
			this.anIntArray218 = new int[256];
			for (@Pc(246) int local246 = 0; local246 < 64; local246++) {
				this.anIntArray218[local246] = local246 * 4;
			}
			for (@Pc(261) int local261 = 0; local261 < 64; local261++) {
				this.anIntArray218[local261 + 64] = local261 * 262144 + 255;
			}
			for (@Pc(280) int local280 = 0; local280 < 64; local280++) {
				this.anIntArray218[local280 + 128] = local280 * 1024 + 16711935;
			}
			for (@Pc(299) int local299 = 0; local299 < 64; local299++) {
				this.anIntArray218[local299 + 192] = 16777215;
			}
			this.anIntArray215 = new int[256];
			this.anIntArray235 = new int[32768];
			this.anIntArray236 = new int[32768];
			this.method639(this.anInt867, null);
			this.anIntArray245 = new int[32768];
			this.anIntArray246 = new int[32768];
			this.method587(10, "Connecting to fileserver");
			if (!this.aBoolean221) {
				this.aBoolean220 = true;
				this.aBoolean221 = true;
				this.method586(this, 2);
			}
		} catch (@Pc(357) RuntimeException local357) {
			signlink.reporterror("9676, " + 2 + ", " + local357.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZI)Z")
	private boolean method616(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(10) boolean local10 = false;
			@Pc(13) Class32 local13 = Class32.method316(arg0);
			for (@Pc(15) int local15 = 0; local15 < local13.anIntArray105.length && local13.anIntArray105[local15] != -1; local15++) {
				@Pc(29) Class32 local29 = Class32.method316(local13.anIntArray105[local15]);
				if (local29.anInt443 == 0) {
					local10 |= this.method616(local29.anInt442, arg1);
				}
				@Pc(63) int local63;
				if (local29.anInt443 == 6 && (local29.anInt415 != -1 || local29.anInt416 != -1)) {
					@Pc(58) boolean local58 = this.method694(local29);
					if (local58) {
						local63 = local29.anInt416;
					} else {
						local63 = local29.anInt415;
					}
					if (local63 != -1) {
						@Pc(75) Class30 local75 = Class30.aClass30Array1[local63];
						local29.anInt431 += arg1;
						while (local29.anInt431 > local75.method308(local29.anInt437)) {
							local29.anInt431 -= local75.method308(local29.anInt437);
							local29.anInt437++;
							if (local29.anInt437 >= local75.anInt386) {
								local29.anInt437 -= local75.anInt387;
								if (local29.anInt437 < 0 || local29.anInt437 >= local75.anInt386) {
									local29.anInt437 = 0;
								}
							}
							local10 = true;
						}
					}
				}
				if (local29.anInt443 == 6 && local29.anInt436 != 0) {
					@Pc(144) int local144 = local29.anInt436 >> 16;
					local63 = local29.anInt436 << 16 >> 16;
					@Pc(155) int local155 = local144 * arg1;
					local63 *= arg1;
					local29.anInt419 = local29.anInt419 + local155 & 0x7FF;
					local29.anInt420 = local29.anInt420 + local63 & 0x7FF;
					local10 = true;
				}
			}
			return local10;
		} catch (@Pc(186) RuntimeException local186) {
			signlink.reporterror("48435, " + arg0 + ", " + false + ", " + arg1 + ", " + local186.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILjava/lang/String;)V")
	@Override
	protected void method587(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		try {
			this.anInt1018 = arg0;
			this.aString21 = arg1;
			this.method695(560);
			if (this.aClass35_2 == null) {
				super.method587(arg0, arg1);
			} else {
				this.aClass13_9.method157(this.aBoolean229);
				this.aClass3_Sub1_Sub2_Sub1_4.method45(54, "RuneScape is loading - please wait...", 180, 16777215);
				Class3_Sub1_Sub2.method522(34, 304, 9179409, 62, 28);
				Class3_Sub1_Sub2.method522(32, 302, 0, 63, 29);
				Class3_Sub1_Sub2.method521(arg0 * 3, 9179409, 30, 30, this.aByte44, 64);
				Class3_Sub1_Sub2.method521(300 - arg0 * 3, 0, 30, arg0 * 3 + 30, this.aByte44, 64);
				this.aClass3_Sub1_Sub2_Sub1_4.method45(85, arg1, 180, 16777215);
				this.aClass13_9.method158(171, super.aGraphics2, 202);
				if (this.aBoolean210) {
					this.aBoolean210 = false;
					if (!this.aBoolean221) {
						this.aClass13_10.method158(0, super.aGraphics2, 0);
						this.aClass13_11.method158(0, super.aGraphics2, 637);
					}
					this.aClass13_7.method158(0, super.aGraphics2, 128);
					this.aClass13_8.method158(371, super.aGraphics2, 202);
					this.aClass13_12.method158(265, super.aGraphics2, 0);
					this.aClass13_13.method158(265, super.aGraphics2, 562);
					this.aClass13_14.method158(171, super.aGraphics2, 128);
					this.aClass13_15.method158(171, super.aGraphics2, 562);
				}
			}
		} catch (@Pc(219) RuntimeException local219) {
			signlink.reporterror("59588, " + -59 + ", " + arg0 + ", " + arg1 + ", " + local219.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!WNCFPLWV;I)V")
	private void method617(@OriginalArg(1) Class3_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(11) int local11 = arg0.method469(8);
			@Pc(17) int local17;
			if (local11 < this.anInt929) {
				for (local17 = local11; local17 < this.anInt929; local17++) {
					this.anIntArray213[this.anInt829++] = this.anIntArray238[local17];
				}
			}
			if (local11 > this.anInt929) {
				signlink.reporterror(this.aString22 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt929 = 0;
			for (local17 = 0; local17 < local11; local17++) {
				@Pc(69) int local69 = this.anIntArray238[local17];
				@Pc(74) Class3_Sub1_Sub1_Sub4_Sub2 local74 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local69];
				@Pc(79) int local79 = arg0.method469(1);
				if (local79 == 0) {
					this.anIntArray238[this.anInt929++] = local69;
					local74.anInt715 = anInt919;
				} else {
					@Pc(102) int local102 = arg0.method469(2);
					if (local102 == 0) {
						this.anIntArray238[this.anInt929++] = local69;
						local74.anInt715 = anInt919;
						this.anIntArray239[this.anInt930++] = local69;
					} else {
						@Pc(153) int local153;
						@Pc(163) int local163;
						if (local102 == 1) {
							this.anIntArray238[this.anInt929++] = local69;
							local74.anInt715 = anInt919;
							local153 = arg0.method469(3);
							local74.method508(false, local153);
							local163 = arg0.method469(1);
							if (local163 == 1) {
								this.anIntArray239[this.anInt930++] = local69;
							}
						} else if (local102 == 2) {
							this.anIntArray238[this.anInt929++] = local69;
							local74.anInt715 = anInt919;
							local153 = arg0.method469(3);
							local74.method508(true, local153);
							local163 = arg0.method469(3);
							local74.method508(true, local163);
							@Pc(221) int local221 = arg0.method469(1);
							if (local221 == 1) {
								this.anIntArray239[this.anInt930++] = local69;
							}
						} else if (local102 == 3) {
							this.anIntArray213[this.anInt829++] = local69;
						}
					}
				}
			}
		} catch (@Pc(258) RuntimeException local258) {
			signlink.reporterror("91430, " + 9 + ", " + arg0 + ", " + arg1 + ", " + local258.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	private void method618(@OriginalArg(0) boolean arg0) {
		try {
			if (super.aClass13_2 == null) {
				this.method605(17);
				this.aClass13_7 = null;
				if (!arg0) {
					this.aClass13_8 = null;
					this.aClass13_9 = null;
					this.aClass13_10 = null;
					this.aClass13_11 = null;
					this.aClass13_12 = null;
					this.aClass13_13 = null;
					this.aClass13_14 = null;
					this.aClass13_15 = null;
					this.aClass13_6 = null;
					this.aClass13_4 = null;
					this.aClass13_3 = null;
					this.aClass13_5 = null;
					this.aClass13_25 = null;
					this.aClass13_26 = null;
					this.aClass13_27 = null;
					super.aClass13_2 = new Class13(3, 503, 765, this.method585());
					this.aBoolean210 = true;
				}
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("93644, " + arg0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!WNCFPLWV;Lclient!WQWDCUWR;III)V")
	private void method619(@OriginalArg(0) Class3_Sub1_Sub4 arg0, @OriginalArg(1) Class3_Sub1_Sub1_Sub4_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(12) int local12;
			@Pc(20) int local20;
			@Pc(32) int local32;
			if ((arg2 & 0x1) != 0) {
				local12 = arg0.method460();
				if (local12 == 65535) {
					local12 = -1;
				}
				local20 = arg0.method458();
				if (local12 == arg1.anInt701 && local12 != -1) {
					local32 = Class30.aClass30Array1[local12].anInt394;
					if (local32 == 1) {
						arg1.anInt702 = 0;
						arg1.anInt703 = 0;
						arg1.anInt704 = local20;
						arg1.anInt705 = 0;
					}
					if (local32 == 2) {
						arg1.anInt705 = 0;
					}
				} else if (local12 == -1 || arg1.anInt701 == -1 || Class30.aClass30Array1[local12].anInt388 >= Class30.aClass30Array1[arg1.anInt701].anInt388) {
					arg1.anInt701 = local12;
					arg1.anInt702 = 0;
					arg1.anInt703 = 0;
					arg1.anInt704 = local20;
					arg1.anInt705 = 0;
					arg1.anInt727 = arg1.anInt716;
				}
			}
			if ((arg2 & 0x200) != 0) {
				arg1.anInt694 = arg0.method458();
				arg1.anInt696 = arg0.method477();
				arg1.anInt695 = arg0.method458();
				arg1.anInt697 = arg0.method458();
				arg1.anInt698 = arg0.method486(255) + anInt919;
				arg1.anInt699 = arg0.method486(255) + anInt919;
				arg1.anInt700 = arg0.method478();
				arg1.method507();
			}
			if ((arg2 & 0x80) != 0) {
				local12 = arg0.method476();
				@Pc(145) byte[] local145 = new byte[local12];
				@Pc(151) Class3_Sub1_Sub4 local151 = new Class3_Sub1_Sub4((byte) -58, local145);
				arg0.method495(local12, local145);
				this.aClass3_Sub1_Sub4Array1[arg3] = local151;
				arg1.method513(local151);
			}
			if ((arg2 & 0x40) != 0) {
				arg1.aString15 = arg0.method465();
				if (arg1.aString15.charAt(0) == '~') {
					arg1.aString15 = arg1.aString15.substring(1);
					this.method603(2, arg1.aString16, arg1.aString15);
				} else if (arg1 == aClass3_Sub1_Sub1_Sub4_Sub2_1) {
					this.method603(2, arg1.aString16, arg1.aString15);
				}
				arg1.anInt692 = 0;
				arg1.anInt722 = 0;
				arg1.anInt735 = 150;
			}
			if ((arg2 & 0x4) != 0) {
				arg1.anInt706 = arg0.method485((byte) 6);
				arg1.anInt707 = arg0.method485((byte) 6);
			}
			if ((arg2 & 0x10) != 0) {
				local12 = arg0.method486(255);
				local20 = arg0.method478();
				local32 = arg0.method478();
				@Pc(249) int local249 = arg0.anInt666;
				if (arg1.aString16 != null && arg1.aBoolean169) {
					@Pc(259) long local259 = Class15.method198(arg1.aString16);
					@Pc(261) boolean local261 = false;
					if (local20 <= 1) {
						for (@Pc(266) int local266 = 0; local266 < this.anInt1046; local266++) {
							if (this.aLongArray4[local266] == local259) {
								local261 = true;
								break;
							}
						}
					}
					if (!local261 && this.anInt841 == 0) {
						try {
							this.aClass3_Sub1_Sub4_8.anInt666 = 0;
							arg0.method494(local32, this.aClass3_Sub1_Sub4_8.aByteArray20);
							this.aClass3_Sub1_Sub4_8.anInt666 = 0;
							@Pc(311) String local311 = Class22.method238(local32, this.aClass3_Sub1_Sub4_8);
							@Pc(315) String local315 = Class14.method170(local311);
							arg1.aString15 = local315;
							arg1.anInt692 = local12 >> 8;
							arg1.anInt722 = local12 & 0xFF;
							arg1.anInt735 = 150;
							if (local20 == 2 || local20 == 3) {
								this.method603(1, "@cr2@" + arg1.aString16, local315);
							} else if (local20 == 1) {
								this.method603(1, "@cr1@" + arg1.aString16, local315);
							} else {
								this.method603(2, arg1.aString16, local315);
							}
						} catch (@Pc(379) Exception local379) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg0.anInt666 = local249 + local32;
			}
			if ((arg2 & 0x2) != 0) {
				arg1.anInt723 = arg0.method486(255);
				if (arg1.anInt723 == 65535) {
					arg1.anInt723 = -1;
				}
			}
			if ((arg2 & 0x400) != 0) {
				arg1.anInt709 = arg0.method486(255);
				local12 = arg0.method493(this.anInt991);
				arg1.anInt713 = local12 >> 16;
				arg1.anInt712 = anInt919 + (local12 & 0xFFFF);
				arg1.anInt710 = 0;
				arg1.anInt711 = 0;
				if (arg1.anInt712 > anInt919) {
					arg1.anInt710 = -1;
				}
				if (arg1.anInt709 == 65535) {
					arg1.anInt709 = -1;
				}
			}
			if ((arg2 & 0x8) != 0) {
				local12 = arg0.method478();
				local20 = arg0.method478();
				arg1.method510(local20, this.anInt911, anInt919, local12);
				arg1.anInt724 = anInt919 + 300;
				arg1.anInt725 = arg0.method476();
				arg1.anInt726 = arg0.method478();
			}
			if ((arg2 & 0x100) != 0) {
				local12 = arg0.method478();
				local20 = arg0.method476();
				arg1.method510(local20, this.anInt911, anInt919, local12);
				arg1.anInt724 = anInt919 + 300;
				arg1.anInt725 = arg0.method478();
				arg1.anInt726 = arg0.method477();
			}
		} catch (@Pc(519) RuntimeException local519) {
			signlink.reporterror("19408, " + arg0 + ", " + arg1 + ", " + 529 + ", " + arg2 + ", " + arg3 + ", " + local519.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method620() {
		try {
			if (this.aByte43 != 14) {
				this.anInt871 = -1;
			}
			for (@Pc(13) Class3_Sub1_Sub1_Sub3 local13 = (Class3_Sub1_Sub1_Sub3) this.aClass44_11.method439(); local13 != null; local13 = (Class3_Sub1_Sub1_Sub3) this.aClass44_11.method441()) {
				if (local13.anInt466 != this.anInt894 || local13.aBoolean110) {
					local13.method514();
				} else if (anInt919 >= local13.anInt464) {
					local13.method330(this.anInt880);
					if (local13.aBoolean110) {
						local13.method514();
					} else {
						this.aClass25_1.method259(false, local13.anInt466, local13, 0, local13.anInt468, 60, local13.anInt469, local13.anInt467, -1);
					}
				}
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("75123, " + 14 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)Ljava/net/Socket;")
	public Socket method621(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!WNCFPLWV;I)V")
	private void method623(@OriginalArg(1) Class3_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				if (arg0.anInt667 + 21 < arg1 * 8) {
					@Pc(16) int local16 = arg0.method469(14);
					if (local16 != 16383) {
						if (this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local16] == null) {
							this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local16] = new Class3_Sub1_Sub1_Sub4_Sub1();
						}
						@Pc(36) Class3_Sub1_Sub1_Sub4_Sub1 local36 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local16];
						this.anIntArray263[this.anInt1011++] = local16;
						local36.anInt715 = anInt919;
						@Pc(55) int local55 = arg0.method469(5);
						if (local55 > 15) {
							local55 -= 32;
						}
						@Pc(64) int local64 = arg0.method469(5);
						if (local64 > 15) {
							local64 -= 32;
						}
						@Pc(73) int local73 = arg0.method469(1);
						if (local73 == 1) {
							this.anIntArray239[this.anInt930++] = local16;
						}
						@Pc(92) int local92 = arg0.method469(1);
						local36.aClass2_1 = Class2.method4(arg0.method469(13));
						local36.anInt714 = local36.aClass2_1.aByte2;
						local36.anInt708 = local36.aClass2_1.anInt32;
						local36.anInt718 = local36.aClass2_1.anInt17;
						local36.anInt719 = local36.aClass2_1.anInt22;
						local36.anInt720 = local36.aClass2_1.anInt14;
						local36.anInt721 = local36.aClass2_1.anInt29;
						local36.anInt689 = local36.aClass2_1.anInt23;
						local36.method509(aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray174[0] + local55, (byte) 4, local92 == 1, aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray175[0] + local64);
						continue;
					}
				}
				arg0.method470();
				return;
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("84766, " + 27810 + ", " + arg0 + ", " + arg1 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method624(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt907 >= 100 && this.anInt820 != 1) {
					this.method603(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
				} else if (this.anInt907 >= 200) {
					this.method603(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
				} else {
					@Pc(38) String local38 = Class15.method202(Class15.method199(arg0));
					for (@Pc(44) int local44 = 0; local44 < this.anInt907; local44++) {
						if (this.aLongArray3[local44] == arg0) {
							this.method603(0, "", local38 + " is already on your friend list");
							return;
						}
					}
					for (@Pc(74) int local74 = 0; local74 < this.anInt1046; local74++) {
						if (this.aLongArray4[local74] == arg0) {
							this.method603(0, "", "Please remove " + local38 + " from your ignore list first");
							return;
						}
					}
					if (!local38.equals(aClass3_Sub1_Sub1_Sub4_Sub2_1.aString16)) {
						this.aStringArray14[this.anInt907] = local38;
						this.aLongArray3[this.anInt907] = arg0;
						this.anIntArray260[this.anInt907] = 0;
						this.anInt907++;
						this.aBoolean207 = true;
						this.aClass3_Sub1_Sub4_7.method447(128);
						this.aClass3_Sub1_Sub4_7.method454(arg0);
					}
				}
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("930, " + arg0 + ", " + -34932 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method625() {
		try {
			if (this.anInt980 == 0) {
				@Pc(6) int local6 = super.anInt809;
				if (this.anInt1050 == 1 && super.anInt810 >= 516 && super.anInt811 >= 160 && super.anInt810 <= 765 && super.anInt811 <= 205) {
					local6 = 0;
				}
				@Pc(42) int local42;
				@Pc(45) int local45;
				@Pc(121) int local121;
				if (this.aBoolean231) {
					if (local6 != 1) {
						local42 = super.anInt804;
						local45 = super.anInt805;
						if (this.anInt1005 == 0) {
							local42 -= 4;
							local45 -= 4;
						}
						if (this.anInt1005 == 1) {
							local42 -= 553;
							local45 -= 205;
						}
						if (this.anInt1005 == 2) {
							local42 -= 17;
							local45 -= 357;
						}
						if (local42 < this.anInt1006 - 10 || local42 > this.anInt1006 + this.anInt1008 + 10 || local45 < this.anInt1007 - 10 || local45 > this.anInt1007 + this.anInt1009 + 10) {
							this.aBoolean231 = false;
							if (this.anInt1005 == 1) {
								this.aBoolean207 = true;
							}
							if (this.anInt1005 == 2) {
								this.aBoolean197 = true;
							}
						}
					}
					if (local6 == 1) {
						local42 = this.anInt1006;
						local45 = this.anInt1007;
						local121 = this.anInt1008;
						@Pc(124) int local124 = super.anInt810;
						@Pc(127) int local127 = super.anInt811;
						if (this.anInt1005 == 0) {
							local124 -= 4;
							local127 -= 4;
						}
						if (this.anInt1005 == 1) {
							local124 -= 553;
							local127 -= 205;
						}
						if (this.anInt1005 == 2) {
							local124 -= 17;
							local127 -= 357;
						}
						@Pc(146) int local146 = -1;
						for (@Pc(148) int local148 = 0; local148 < this.anInt1045; local148++) {
							@Pc(163) int local163 = local45 + (this.anInt1045 - 1 - local148) * 15 + 31;
							if (local124 > local42 && local124 < local42 + local121 && local127 > local163 - 13 && local127 < local163 + 3) {
								local146 = local148;
							}
						}
						if (local146 != -1) {
							this.method627(local146);
						}
						this.aBoolean231 = false;
						if (this.anInt1005 == 1) {
							this.aBoolean207 = true;
						}
						if (this.anInt1005 == 2) {
							this.aBoolean197 = true;
							return;
						}
					}
				} else {
					if (local6 == 1 && this.anInt1045 > 0) {
						local42 = this.anIntArray271[this.anInt1045 - 1];
						if (local42 == 190 || local42 == 669 || local42 == 516 || local42 == 173 || local42 == 237 || local42 == 205 || local42 == 755 || local42 == 848 || local42 == 840 || local42 == 280 || local42 == 18 || local42 == 1156) {
							local45 = this.anIntArray269[this.anInt1045 - 1];
							local121 = this.anIntArray270[this.anInt1045 - 1];
							@Pc(282) Class32 local282 = Class32.method316(local121);
							if (local282.aBoolean102 || local282.aBoolean99) {
								this.aBoolean236 = false;
								this.anInt842 = 0;
								this.anInt978 = local121;
								this.anInt979 = local45;
								this.anInt980 = 2;
								this.anInt981 = super.anInt810;
								this.anInt982 = super.anInt811;
								if (Class32.method316(local121).anInt424 == this.anInt961) {
									this.anInt980 = 1;
								}
								if (Class32.method316(local121).anInt424 == this.anInt840) {
									this.anInt980 = 3;
								}
								return;
							}
						}
					}
					if (local6 == 1 && (this.anInt993 == 1 || this.method641(this.anInt918, this.anInt1045 - 1)) && this.anInt1045 > 2) {
						local6 = 2;
					}
					if (local6 == 1 && this.anInt1045 > 0) {
						this.method627(this.anInt1045 - 1);
					}
					if (local6 != 2 || this.anInt1045 <= 0) {
						return;
					}
					this.method629();
				}
			}
		} catch (@Pc(376) RuntimeException local376) {
			signlink.reporterror("32282, " + true + ", " + local376.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!WQWDCUWR;II)V")
	private void method626(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub1_Sub1_Sub4_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1 != aClass3_Sub1_Sub1_Sub4_Sub2_1 && this.anInt1045 < 400) {
				@Pc(45) String local45;
				if (arg1.anInt751 == 0) {
					local45 = arg1.aString16 + method671(arg1.anInt753, aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt753) + " (level-" + arg1.anInt753 + ")";
				} else {
					local45 = arg1.aString16 + " (skill-" + arg1.anInt751 + ")";
				}
				@Pc(175) int local175;
				if (this.anInt889 == 1) {
					this.aStringArray13[this.anInt1045] = "Use " + this.aString20 + " with @whi@" + local45;
					this.anIntArray271[this.anInt1045] = 411;
					this.anIntArray272[this.anInt1045] = arg0;
					this.anIntArray269[this.anInt1045] = arg3;
					this.anIntArray270[this.anInt1045] = arg2;
					this.anInt1045++;
				} else if (this.anInt1050 != 1) {
					for (local175 = 4; local175 >= 0; local175--) {
						if (this.aStringArray9[local175] != null) {
							this.aStringArray13[this.anInt1045] = this.aStringArray9[local175] + " @whi@" + local45;
							@Pc(202) short local202 = 0;
							if (this.aStringArray9[local175].equalsIgnoreCase("attack")) {
								if (arg1.anInt753 > aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt753) {
									local202 = 2000;
								}
								if (aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt750 != 0 && arg1.anInt750 != 0) {
									if (aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt750 == arg1.anInt750) {
										local202 = 2000;
									} else {
										local202 = 0;
									}
								}
							} else if (this.aBooleanArray11[local175]) {
								local202 = 2000;
							}
							if (local175 == 0) {
								this.anIntArray271[this.anInt1045] = local202 + 710;
							}
							if (local175 == 1) {
								this.anIntArray271[this.anInt1045] = local202 + 116;
							}
							if (local175 == 2) {
								this.anIntArray271[this.anInt1045] = local202 + 149;
							}
							if (local175 == 3) {
								this.anIntArray271[this.anInt1045] = local202 + 750;
							}
							if (local175 == 4) {
								this.anIntArray271[this.anInt1045] = local202 + 740;
							}
							this.anIntArray272[this.anInt1045] = arg0;
							this.anIntArray269[this.anInt1045] = arg3;
							this.anIntArray270[this.anInt1045] = arg2;
							this.anInt1045++;
						}
					}
				} else if ((this.anInt1052 & 0x8) == 8) {
					this.aStringArray13[this.anInt1045] = this.aString31 + " @whi@" + local45;
					this.anIntArray271[this.anInt1045] = 483;
					this.anIntArray272[this.anInt1045] = arg0;
					this.anIntArray269[this.anInt1045] = arg3;
					this.anIntArray270[this.anInt1045] = arg2;
					this.anInt1045++;
				}
				for (local175 = 0; local175 < this.anInt1045; local175++) {
					if (this.anIntArray271[local175] == 599) {
						this.aStringArray13[local175] = "Walk here @whi@" + local45;
						return;
					}
				}
			}
		} catch (@Pc(352) RuntimeException local352) {
			signlink.reporterror("89215, " + arg0 + ", " + -154 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local352.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method627(@OriginalArg(1) int arg0) {
		try {
			if (arg0 >= 0) {
				@Pc(13) int local13 = this.anIntArray269[arg0];
				@Pc(18) int local18 = this.anIntArray270[arg0];
				@Pc(23) int local23 = this.anIntArray271[arg0];
				@Pc(28) int local28 = this.anIntArray272[arg0];
				if (local23 >= 2000) {
					local23 -= 2000;
				}
				if (this.anInt1020 != 0 && local23 != 1725) {
					this.anInt1020 = 0;
					this.aBoolean197 = true;
				}
				@Pc(68) boolean local68;
				if (local23 == 497) {
					local68 = this.method610(0, aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray175[0], aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray174[0], 0, local13, 0, 0, 0, 2, false, local18);
					if (!local68) {
						this.method610(1, aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray175[0], aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray174[0], 0, local13, 0, 1, 0, 2, false, local18);
					}
					this.anInt1026 = super.anInt810;
					this.anInt1027 = super.anInt811;
					this.anInt1029 = 2;
					this.anInt1028 = 0;
					anInt953++;
					if (anInt953 >= 114) {
						this.aClass3_Sub1_Sub4_7.method447(153);
						this.aClass3_Sub1_Sub4_7.method452(0);
						anInt953 = 0;
					}
					this.aClass3_Sub1_Sub4_7.method447(251);
					this.aClass3_Sub1_Sub4_7.method483(local18 + this.anInt947);
					this.aClass3_Sub1_Sub4_7.method484((byte) 8, local28);
					this.aClass3_Sub1_Sub4_7.method484((byte) 8, local13 + this.anInt946);
				}
				if (local23 == 560) {
					this.aClass3_Sub1_Sub4_7.method447(170);
					this.aClass3_Sub1_Sub4_7.method483(local28);
					this.aClass3_Sub1_Sub4_7.method483(local13);
					this.aClass3_Sub1_Sub4_7.method482(local18);
					this.aClass3_Sub1_Sub4_7.method482(this.anInt1051);
					this.anInt849 = 0;
					this.anInt850 = local18;
					this.anInt851 = local13;
					this.anInt852 = 2;
					if (Class32.method316(local18).anInt424 == this.anInt961) {
						this.anInt852 = 1;
					}
					if (Class32.method316(local18).anInt424 == this.anInt840) {
						this.anInt852 = 3;
					}
				}
				if (local23 == 277 && this.method642(local13, local18, local28)) {
					this.aClass3_Sub1_Sub4_7.method447(185);
					this.aClass3_Sub1_Sub4_7.method482(local18 + this.anInt947);
					this.aClass3_Sub1_Sub4_7.method484((byte) 8, local13 + this.anInt946);
					this.aClass3_Sub1_Sub4_7.method482(this.anInt1051);
					this.aClass3_Sub1_Sub4_7.method484((byte) 8, local28 >> 14 & 0x7FFF);
				}
				@Pc(287) int local287;
				@Pc(269) Class32 local269;
				if (local23 == 144) {
					this.aClass3_Sub1_Sub4_7.method447(176);
					this.aClass3_Sub1_Sub4_7.method449(local18);
					local269 = Class32.method316(local18);
					if (local269.anIntArrayArray13 != null && local269.anIntArrayArray13[0][0] == 5) {
						local287 = local269.anIntArrayArray13[0][1];
						this.anIntArray273[local287] = 1 - this.anIntArray273[local287];
						this.method652(local287);
						this.aBoolean207 = true;
					}
				}
				@Pc(310) Class10 local310;
				@Pc(336) String local336;
				if (local23 == 1156) {
					local310 = Class10.method118(local28);
					@Pc(313) Class32 local313 = Class32.method316(local18);
					if (local313 != null && local313.anIntArray97[local13] >= 100000) {
						local336 = local313.anIntArray97[local13] + " x " + local310.aString3;
					} else if (local310.aByteArray4 == null) {
						local336 = "It's a " + local310.aString3 + ".";
					} else {
						local336 = new String(local310.aByteArray4);
					}
					this.method603(0, "", local336);
				}
				@Pc(374) Class3_Sub1_Sub1_Sub4_Sub1 local374;
				if (local23 == 884) {
					local374 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local28];
					if (local374 != null) {
						this.method610(1, aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray175[0], aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray174[0], 0, local374.anIntArray174[0], 0, 1, 0, 2, false, local374.anIntArray175[0]);
						this.anInt1026 = super.anInt810;
						this.anInt1027 = super.anInt811;
						this.anInt1029 = 2;
						this.anInt1028 = 0;
						this.aClass3_Sub1_Sub4_7.method447(72);
						this.aClass3_Sub1_Sub4_7.method449(local28);
					}
				}
				if (local23 == 825) {
					local374 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local28];
					if (local374 != null) {
						this.method610(1, aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray175[0], aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray174[0], 0, local374.anIntArray174[0], 0, 1, 0, 2, false, local374.anIntArray175[0]);
						this.anInt1026 = super.anInt810;
						this.anInt1027 = super.anInt811;
						this.anInt1029 = 2;
						this.anInt1028 = 0;
						anInt1000 += local28;
						if (anInt1000 >= 146) {
							this.aClass3_Sub1_Sub4_7.method447(245);
							this.aClass3_Sub1_Sub4_7.method449(3789);
							anInt1000 = 0;
						}
						this.aClass3_Sub1_Sub4_7.method447(5);
						this.aClass3_Sub1_Sub4_7.method449(local28);
					}
				}
				if (local23 == 959) {
					local374 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local28];
					if (local374 != null) {
						this.method610(1, aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray175[0], aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray174[0], 0, local374.anIntArray174[0], 0, 1, 0, 2, false, local374.anIntArray175[0]);
						this.anInt1026 = super.anInt810;
						this.anInt1027 = super.anInt811;
						this.anInt1029 = 2;
						this.anInt1028 = 0;
						this.aClass3_Sub1_Sub4_7.method447(220);
						this.aClass3_Sub1_Sub4_7.method482(this.anInt1051);
						this.aClass3_Sub1_Sub4_7.method449(local28);
					}
				}
				if (local23 == 264) {
					local68 = this.method610(0, aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray175[0], aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray174[0], 0, local13, 0, 0, 0, 2, false, local18);
					if (!local68) {
						this.method610(1, aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray175[0], aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray174[0], 0, local13, 0, 1, 0, 2, false, local18);
					}
					this.anInt1026 = super.anInt810;
					this.anInt1027 = super.anInt811;
					this.anInt1029 = 2;
					this.anInt1028 = 0;
					this.aClass3_Sub1_Sub4_7.method447(181);
					this.aClass3_Sub1_Sub4_7.method484((byte) 8, local18 + this.anInt947);
					this.aClass3_Sub1_Sub4_7.method483(local28);
					this.aClass3_Sub1_Sub4_7.method483(local13 + this.anInt946);
				}
				@Pc(665) Class3_Sub1_Sub1_Sub4_Sub2 local665;
				if (local23 == 750) {
					local665 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local28];
					if (local665 != null) {
						this.method610(1, aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray175[0], aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray174[0], 0, local665.anIntArray174[0], 0, 1, 0, 2, false, local665.anIntArray175[0]);
						this.anInt1026 = super.anInt810;
						this.anInt1027 = super.anInt811;
						this.anInt1029 = 2;
						this.anInt1028 = 0;
						this.aClass3_Sub1_Sub4_7.method447(14);
						this.aClass3_Sub1_Sub4_7.method449(local28);
					}
				}
				if (local23 == 840) {
					this.aClass3_Sub1_Sub4_7.method447(225);
					this.aClass3_Sub1_Sub4_7.method483(local28);
					this.aClass3_Sub1_Sub4_7.method483(local13);
					this.aClass3_Sub1_Sub4_7.method483(local18);
					this.anInt849 = 0;
					this.anInt850 = local18;
					this.anInt851 = local13;
					this.anInt852 = 2;
					if (Class32.method316(local18).anInt424 == this.anInt961) {
						this.anInt852 = 1;
					}
					if (Class32.method316(local18).anInt424 == this.anInt840) {
						this.anInt852 = 3;
					}
				}
				if (local23 == 265) {
					local68 = this.method610(0, aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray175[0], aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray174[0], 0, local13, 0, 0, 0, 2, false, local18);
					if (!local68) {
						this.method610(1, aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray175[0], aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray174[0], 0, local13, 0, 1, 0, 2, false, local18);
					}
					this.anInt1026 = super.anInt810;
					this.anInt1027 = super.anInt811;
					this.anInt1029 = 2;
					this.anInt1028 = 0;
					this.aClass3_Sub1_Sub4_7.method447(41);
					this.aClass3_Sub1_Sub4_7.method482(local18 + this.anInt947);
					this.aClass3_Sub1_Sub4_7.method449(local28);
					this.aClass3_Sub1_Sub4_7.method449(local13 + this.anInt946);
				}
				if (local23 == 369) {
					local374 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local28];
					if (local374 != null) {
						this.method610(1, aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray175[0], aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray174[0], 0, local374.anIntArray174[0], 0, 1, 0, 2, false, local374.anIntArray175[0]);
						this.anInt1026 = super.anInt810;
						this.anInt1027 = super.anInt811;
						this.anInt1029 = 2;
						this.anInt1028 = 0;
						this.aClass3_Sub1_Sub4_7.method447(135);
						this.aClass3_Sub1_Sub4_7.method484((byte) 8, local28);
					}
				}
				@Pc(947) String local947;
				if (local23 == 1250) {
					local374 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local28];
					if (local374 != null) {
						@Pc(929) Class2 local929 = local374.aClass2_1;
						if (local929.anIntArray3 != null) {
							local929 = local929.method6();
						}
						if (local929 != null) {
							if (local929.aByteArray1 == null) {
								local947 = "It's a " + local929.aString1 + ".";
							} else {
								local947 = new String(local929.aByteArray1);
							}
							this.method603(0, "", local947);
						}
					}
				}
				if (local23 == 755) {
					this.aClass3_Sub1_Sub4_7.method447(149);
					this.aClass3_Sub1_Sub4_7.method483(local18);
					this.aClass3_Sub1_Sub4_7.method483(local13);
					this.aClass3_Sub1_Sub4_7.method449(local28);
					this.anInt849 = 0;
					this.anInt850 = local18;
					this.anInt851 = local13;
					this.anInt852 = 2;
					if (Class32.method316(local18).anInt424 == this.anInt961) {
						this.anInt852 = 1;
					}
					if (Class32.method316(local18).anInt424 == this.anInt840) {
						this.anInt852 = 3;
					}
				}
				if (local23 == 282) {
					local269 = Class32.method316(local18);
					@Pc(1026) boolean local1026 = true;
					if (local269.anInt430 > 0) {
						local1026 = this.method710(local269);
					}
					if (local1026) {
						this.aClass3_Sub1_Sub4_7.method447(176);
						this.aClass3_Sub1_Sub4_7.method449(local18);
					}
				}
				if (local23 == 848) {
					this.aClass3_Sub1_Sub4_7.method447(143);
					this.aClass3_Sub1_Sub4_7.method482(local18);
					this.aClass3_Sub1_Sub4_7.method482(local13);
					this.aClass3_Sub1_Sub4_7.method449(local28);
					this.anInt849 = 0;
					this.anInt850 = local18;
					this.anInt851 = local13;
					this.anInt852 = 2;
					if (Class32.method316(local18).anInt424 == this.anInt961) {
						this.anInt852 = 1;
					}
					if (Class32.method316(local18).anInt424 == this.anInt840) {
						this.anInt852 = 3;
					}
				}
				if (local23 == 516) {
					this.aClass3_Sub1_Sub4_7.method447(142);
					this.aClass3_Sub1_Sub4_7.method483(local13);
					this.aClass3_Sub1_Sub4_7.method449(local18);
					this.aClass3_Sub1_Sub4_7.method482(local28);
					this.anInt849 = 0;
					this.anInt850 = local18;
					this.anInt851 = local13;
					this.anInt852 = 2;
					if (Class32.method316(local18).anInt424 == this.anInt961) {
						this.anInt852 = 1;
					}
					if (Class32.method316(local18).anInt424 == this.anInt840) {
						this.anInt852 = 3;
					}
				}
				if (local23 == 669) {
					this.aClass3_Sub1_Sub4_7.method447(187);
					this.aClass3_Sub1_Sub4_7.method483(local28);
					this.aClass3_Sub1_Sub4_7.method482(local18);
					this.aClass3_Sub1_Sub4_7.method484((byte) 8, local13);
					this.anInt849 = 0;
					this.anInt850 = local18;
					this.anInt851 = local13;
					this.anInt852 = 2;
					if (Class32.method316(local18).anInt424 == this.anInt961) {
						this.anInt852 = 1;
					}
					if (Class32.method316(local18).anInt424 == this.anInt840) {
						this.anInt852 = 3;
					}
				}
				if (local23 == 708) {
					local374 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local28];
					if (local374 != null) {
						this.method610(1, aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray175[0], aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray174[0], 0, local374.anIntArray174[0], 0, 1, 0, 2, false, local374.anIntArray175[0]);
						this.anInt1026 = super.anInt810;
						this.anInt1027 = super.anInt811;
						this.anInt1029 = 2;
						this.anInt1028 = 0;
						this.aClass3_Sub1_Sub4_7.method447(160);
						this.aClass3_Sub1_Sub4_7.method482(local28);
					}
				}
				if (local23 == 190) {
					this.aClass3_Sub1_Sub4_7.method447(183);
					this.aClass3_Sub1_Sub4_7.method482(local18);
					this.aClass3_Sub1_Sub4_7.method484((byte) 8, local28);
					this.aClass3_Sub1_Sub4_7.method483(local13);
					this.anInt849 = 0;
					this.anInt850 = local18;
					this.anInt851 = local13;
					this.anInt852 = 2;
					if (Class32.method316(local18).anInt424 == this.anInt961) {
						this.anInt852 = 1;
					}
					if (Class32.method316(local18).anInt424 == this.anInt840) {
						this.anInt852 = 3;
					}
				}
				if (local23 == 599) {
					if (this.aBoolean231) {
						this.aClass25_1.method286(local18 - 4, local13 - 4);
					} else {
						this.aClass25_1.method286(super.anInt811 - 4, super.anInt810 - 4);
					}
				}
				if (local23 == 1247) {
					local310 = Class10.method118(local28);
					if (local310.aByteArray4 == null) {
						local336 = "It's a " + local310.aString3 + ".";
					} else {
						local336 = new String(local310.aByteArray4);
					}
					this.method603(0, "", local336);
				}
				if (local23 == 625) {
					local374 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local28];
					if (local374 != null) {
						this.method610(1, aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray175[0], aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray174[0], 0, local374.anIntArray174[0], 0, 1, 0, 2, false, local374.anIntArray175[0]);
						this.anInt1026 = super.anInt810;
						this.anInt1027 = super.anInt811;
						this.anInt1029 = 2;
						this.anInt1028 = 0;
						this.aClass3_Sub1_Sub4_7.method447(82);
						this.aClass3_Sub1_Sub4_7.method483(this.anInt891);
						this.aClass3_Sub1_Sub4_7.method482(local28);
						this.aClass3_Sub1_Sub4_7.method484((byte) 8, this.anInt892);
						this.aClass3_Sub1_Sub4_7.method484((byte) 8, this.anInt890);
					}
				}
				if (local23 == 112) {
					this.aClass3_Sub1_Sub4_7.method447(172);
					this.aClass3_Sub1_Sub4_7.method484((byte) 8, this.anInt890);
					this.aClass3_Sub1_Sub4_7.method449(this.anInt892);
					this.aClass3_Sub1_Sub4_7.method449(local13);
					this.aClass3_Sub1_Sub4_7.method483(this.anInt891);
					this.aClass3_Sub1_Sub4_7.method484((byte) 8, local18);
					this.aClass3_Sub1_Sub4_7.method482(local28);
					this.anInt849 = 0;
					this.anInt850 = local18;
					this.anInt851 = local13;
					this.anInt852 = 2;
					if (Class32.method316(local18).anInt424 == this.anInt961) {
						this.anInt852 = 1;
					}
					if (Class32.method316(local18).anInt424 == this.anInt840) {
						this.anInt852 = 3;
					}
				}
				if (local23 == 18) {
					this.anInt889 = 1;
					this.anInt890 = local13;
					this.anInt891 = local18;
					this.anInt892 = local28;
					this.aString20 = String.valueOf(Class10.method118(local28).aString3);
					this.anInt1050 = 0;
					this.aBoolean207 = true;
				} else {
					if (local23 == 393) {
						this.aClass3_Sub1_Sub4_7.method447(176);
						this.aClass3_Sub1_Sub4_7.method449(local18);
						local269 = Class32.method316(local18);
						if (local269.anIntArrayArray13 != null && local269.anIntArrayArray13[0][0] == 5) {
							local287 = local269.anIntArrayArray13[0][1];
							if (this.anIntArray273[local287] != local269.anIntArray98[0]) {
								this.anIntArray273[local287] = local269.anIntArray98[0];
								this.method652(local287);
								this.aBoolean207 = true;
							}
						}
					}
					@Pc(1621) String local1621;
					if (local23 == 545) {
						local1621 = this.aStringArray13[arg0];
						local287 = local1621.indexOf("@whi@");
						if (local287 != -1) {
							if (this.anInt961 == -1) {
								this.method683();
								this.aString18 = local1621.substring(local287 + 5).trim();
								this.aBoolean213 = false;
								this.anInt976 = this.anInt961 = Class32.anInt422;
							} else {
								this.method603(0, "", "Please close the interface you have open before using 'report abuse'");
							}
						}
					}
					if (local23 == 964) {
						local68 = this.method610(0, aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray175[0], aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray174[0], 0, local13, 0, 0, 0, 2, false, local18);
						if (!local68) {
							this.method610(1, aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray175[0], aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray174[0], 0, local13, 0, 1, 0, 2, false, local18);
						}
						this.anInt1026 = super.anInt810;
						this.anInt1027 = super.anInt811;
						this.anInt1029 = 2;
						this.anInt1028 = 0;
						this.aClass3_Sub1_Sub4_7.method447(31);
						this.aClass3_Sub1_Sub4_7.method482(this.anInt892);
						this.aClass3_Sub1_Sub4_7.method449(local28);
						this.aClass3_Sub1_Sub4_7.method483(this.anInt890);
						this.aClass3_Sub1_Sub4_7.method483(local18 + this.anInt947);
						this.aClass3_Sub1_Sub4_7.method482(local13 + this.anInt946);
						this.aClass3_Sub1_Sub4_7.method482(this.anInt891);
					}
					if (local23 == 237) {
						this.aClass3_Sub1_Sub4_7.method447(224);
						this.aClass3_Sub1_Sub4_7.method483(local13);
						this.aClass3_Sub1_Sub4_7.method482(local28);
						this.aClass3_Sub1_Sub4_7.method482(local18);
						this.anInt849 = 0;
						this.anInt850 = local18;
						this.anInt851 = local13;
						this.anInt852 = 2;
						if (Class32.method316(local18).anInt424 == this.anInt961) {
							this.anInt852 = 1;
						}
						if (Class32.method316(local18).anInt424 == this.anInt840) {
							this.anInt852 = 3;
						}
					}
					if (local23 == 710) {
						local665 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local28];
						if (local665 != null) {
							this.method610(1, aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray175[0], aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray174[0], 0, local665.anIntArray174[0], 0, 1, 0, 2, false, local665.anIntArray175[0]);
							this.anInt1026 = super.anInt810;
							this.anInt1027 = super.anInt811;
							this.anInt1029 = 2;
							this.anInt1028 = 0;
							this.aClass3_Sub1_Sub4_7.method447(53);
							this.aClass3_Sub1_Sub4_7.method449(local28);
						}
					}
					if (local23 == 1436) {
						this.method642(local13, local18, local28);
						this.aClass3_Sub1_Sub4_7.method447(222);
						this.aClass3_Sub1_Sub4_7.method483(local28 >> 14 & 0x7FFF);
						this.aClass3_Sub1_Sub4_7.method483(local13 + this.anInt946);
						this.aClass3_Sub1_Sub4_7.method482(local18 + this.anInt947);
					}
					if (local23 == 194) {
						this.method683();
					}
					if (local23 == 756) {
						local68 = this.method610(0, aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray175[0], aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray174[0], 0, local13, 0, 0, 0, 2, false, local18);
						if (!local68) {
							this.method610(1, aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray175[0], aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray174[0], 0, local13, 0, 1, 0, 2, false, local18);
						}
						this.anInt1026 = super.anInt810;
						this.anInt1027 = super.anInt811;
						this.anInt1029 = 2;
						this.anInt1028 = 0;
						this.aClass3_Sub1_Sub4_7.method447(248);
						this.aClass3_Sub1_Sub4_7.method484((byte) 8, local28);
						this.aClass3_Sub1_Sub4_7.method449(local13 + this.anInt946);
						this.aClass3_Sub1_Sub4_7.method483(this.anInt1051);
						this.aClass3_Sub1_Sub4_7.method449(local18 + this.anInt947);
					}
					if (local23 == 448) {
						local68 = this.method610(0, aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray175[0], aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray174[0], 0, local13, 0, 0, 0, 2, false, local18);
						if (!local68) {
							this.method610(1, aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray175[0], aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray174[0], 0, local13, 0, 1, 0, 2, false, local18);
						}
						this.anInt1026 = super.anInt810;
						this.anInt1027 = super.anInt811;
						this.anInt1029 = 2;
						this.anInt1028 = 0;
						this.aClass3_Sub1_Sub4_7.method447(46);
						this.aClass3_Sub1_Sub4_7.method484((byte) 8, local28);
						this.aClass3_Sub1_Sub4_7.method449(local13 + this.anInt946);
						this.aClass3_Sub1_Sub4_7.method449(local18 + this.anInt947);
					}
					@Pc(2135) int local2135;
					if (local23 == 52 || local23 == 285) {
						local1621 = this.aStringArray13[arg0];
						local287 = local1621.indexOf("@whi@");
						if (local287 != -1) {
							local1621 = local1621.substring(local287 + 5).trim();
							local947 = Class15.method202(Class15.method199(Class15.method198(local1621)));
							@Pc(2133) boolean local2133 = false;
							for (local2135 = 0; local2135 < this.anInt929; local2135++) {
								@Pc(2145) Class3_Sub1_Sub1_Sub4_Sub2 local2145 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[this.anIntArray238[local2135]];
								if (local2145 != null && local2145.aString16 != null && local2145.aString16.equalsIgnoreCase(local947)) {
									this.method610(1, aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray175[0], aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray174[0], 0, local2145.anIntArray174[0], 0, 1, 0, 2, false, local2145.anIntArray175[0]);
									if (local23 == 52) {
										this.aClass3_Sub1_Sub4_7.method447(14);
										this.aClass3_Sub1_Sub4_7.method449(this.anIntArray238[local2135]);
									}
									if (local23 == 285) {
										this.aClass3_Sub1_Sub4_7.method447(53);
										this.aClass3_Sub1_Sub4_7.method449(this.anIntArray238[local2135]);
									}
									local2133 = true;
									break;
								}
							}
							if (!local2133) {
								this.method603(0, "", "Unable to find " + local947);
							}
						}
					}
					if (local23 == 134) {
						this.method642(local13, local18, local28);
						this.aClass3_Sub1_Sub4_7.method447(85);
						this.aClass3_Sub1_Sub4_7.method484((byte) 8, local18 + this.anInt947);
						this.aClass3_Sub1_Sub4_7.method483(local13 + this.anInt946);
						this.aClass3_Sub1_Sub4_7.method483(local28 >> 14 & 0x7FFF);
					}
					if (local23 == 280) {
						this.aClass3_Sub1_Sub4_7.method447(106);
						this.aClass3_Sub1_Sub4_7.method482(local28);
						this.aClass3_Sub1_Sub4_7.method483(local18);
						this.aClass3_Sub1_Sub4_7.method482(local13);
						this.anInt849 = 0;
						this.anInt850 = local18;
						this.anInt851 = local13;
						this.anInt852 = 2;
						if (Class32.method316(local18).anInt424 == this.anInt961) {
							this.anInt852 = 1;
						}
						if (Class32.method316(local18).anInt424 == this.anInt840) {
							this.anInt852 = 3;
						}
					}
					if (local23 == 205) {
						this.aClass3_Sub1_Sub4_7.method447(109);
						this.aClass3_Sub1_Sub4_7.method449(local13);
						this.aClass3_Sub1_Sub4_7.method449(local18);
						this.aClass3_Sub1_Sub4_7.method483(local28);
						this.anInt849 = 0;
						this.anInt850 = local18;
						this.anInt851 = local13;
						this.anInt852 = 2;
						if (Class32.method316(local18).anInt424 == this.anInt961) {
							this.anInt852 = 1;
						}
						if (Class32.method316(local18).anInt424 == this.anInt840) {
							this.anInt852 = 3;
						}
					}
					if (local23 == 116) {
						local665 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local28];
						if (local665 != null) {
							this.method610(1, aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray175[0], aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray174[0], 0, local665.anIntArray174[0], 0, 1, 0, 2, false, local665.anIntArray175[0]);
							this.anInt1026 = super.anInt810;
							this.anInt1027 = super.anInt811;
							this.anInt1029 = 2;
							this.anInt1028 = 0;
							this.aClass3_Sub1_Sub4_7.method447(254);
							this.aClass3_Sub1_Sub4_7.method482(local28);
						}
					}
					if (local23 == 1286) {
						@Pc(2449) int local2449 = local28 >> 14 & 0x7FFF;
						@Pc(2452) Class8 local2452 = Class8.method70(local2449);
						if (local2452.aByteArray3 == null) {
							local947 = "It's a " + local2452.aString2 + ".";
						} else {
							local947 = new String(local2452.aByteArray3);
						}
						this.method603(0, "", local947);
					}
					if (local23 == 203) {
						anInt987 += local18;
						if (anInt987 >= 77) {
							this.aClass3_Sub1_Sub4_7.method447(208);
							this.aClass3_Sub1_Sub4_7.method448(154);
							anInt987 = 0;
						}
						this.method642(local13, local18, local28);
						this.aClass3_Sub1_Sub4_7.method447(112);
						this.aClass3_Sub1_Sub4_7.method482(local13 + this.anInt946);
						this.aClass3_Sub1_Sub4_7.method482(local18 + this.anInt947);
						this.aClass3_Sub1_Sub4_7.method449(local28 >> 14 & 0x7FFF);
					}
					if (local23 == 483) {
						local665 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local28];
						if (local665 != null) {
							this.method610(1, aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray175[0], aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray174[0], 0, local665.anIntArray174[0], 0, 1, 0, 2, false, local665.anIntArray175[0]);
							this.anInt1026 = super.anInt810;
							this.anInt1027 = super.anInt811;
							this.anInt1029 = 2;
							this.anInt1028 = 0;
							this.aClass3_Sub1_Sub4_7.method447(66);
							this.aClass3_Sub1_Sub4_7.method449(this.anInt1051);
							this.aClass3_Sub1_Sub4_7.method484((byte) 8, local28);
						}
					}
					@Pc(2635) long local2635;
					if (local23 == 493 || local23 == 968 || local23 == 366 || local23 == 453) {
						local1621 = this.aStringArray13[arg0];
						local287 = local1621.indexOf("@whi@");
						if (local287 != -1) {
							local2635 = Class15.method198(local1621.substring(local287 + 5).trim());
							if (local23 == 493) {
								this.method624(local2635);
							}
							if (local23 == 968) {
								this.method696(local2635, this.anInt823);
							}
							if (local23 == 366) {
								this.method721(local2635);
							}
							if (local23 == 453) {
								this.method612(local2635);
							}
						}
					}
					if (local23 == 886) {
						this.method642(local13, local18, local28);
						this.aClass3_Sub1_Sub4_7.method447(71);
						this.aClass3_Sub1_Sub4_7.method483(local28 >> 14 & 0x7FFF);
						this.aClass3_Sub1_Sub4_7.method483(local18 + this.anInt947);
						this.aClass3_Sub1_Sub4_7.method449(local13 + this.anInt946);
					}
					if (local23 == 645) {
						this.method642(local13, local18, local28);
						this.aClass3_Sub1_Sub4_7.method447(218);
						this.aClass3_Sub1_Sub4_7.method449(local18 + this.anInt947);
						this.aClass3_Sub1_Sub4_7.method484((byte) 8, local13 + this.anInt946);
						this.aClass3_Sub1_Sub4_7.method482(local28 >> 14 & 0x7FFF);
					}
					if (local23 == 830) {
						local68 = this.method610(0, aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray175[0], aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray174[0], 0, local13, 0, 0, 0, 2, false, local18);
						if (!local68) {
							this.method610(1, aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray175[0], aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray174[0], 0, local13, 0, 1, 0, 2, false, local18);
						}
						this.anInt1026 = super.anInt810;
						this.anInt1027 = super.anInt811;
						this.anInt1029 = 2;
						this.anInt1028 = 0;
						anInt916++;
						if (anInt916 >= 89) {
							this.aClass3_Sub1_Sub4_7.method447(73);
							this.aClass3_Sub1_Sub4_7.method448(156);
							anInt916 = 0;
						}
						this.aClass3_Sub1_Sub4_7.method447(54);
						this.aClass3_Sub1_Sub4_7.method484((byte) 8, local18 + this.anInt947);
						this.aClass3_Sub1_Sub4_7.method449(local28);
						this.aClass3_Sub1_Sub4_7.method484((byte) 8, local13 + this.anInt946);
					}
					if (local23 == 149) {
						local665 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local28];
						if (local665 != null) {
							this.method610(1, aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray175[0], aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray174[0], 0, local665.anIntArray174[0], 0, 1, 0, 2, false, local665.anIntArray175[0]);
							this.anInt1026 = super.anInt810;
							this.anInt1027 = super.anInt811;
							this.anInt1029 = 2;
							this.anInt1028 = 0;
							this.aClass3_Sub1_Sub4_7.method447(147);
							this.aClass3_Sub1_Sub4_7.method449(local28);
						}
					}
					if (local23 == 740) {
						local665 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local28];
						if (local665 != null) {
							this.method610(1, aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray175[0], aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray174[0], 0, local665.anIntArray174[0], 0, 1, 0, 2, false, local665.anIntArray175[0]);
							this.anInt1026 = super.anInt810;
							this.anInt1027 = super.anInt811;
							this.anInt1029 = 2;
							this.anInt1028 = 0;
							if ((local28 & 0x3) == 0) {
								anInt945++;
							}
							if (anInt945 >= 135) {
								this.aClass3_Sub1_Sub4_7.method447(127);
								this.aClass3_Sub1_Sub4_7.method449(42923);
								anInt945 = 0;
							}
							this.aClass3_Sub1_Sub4_7.method447(58);
							this.aClass3_Sub1_Sub4_7.method484((byte) 8, local28);
						}
					}
					if (local23 == 173) {
						this.aClass3_Sub1_Sub4_7.method447(237);
						this.aClass3_Sub1_Sub4_7.method449(local13);
						this.aClass3_Sub1_Sub4_7.method484((byte) 8, local18);
						this.aClass3_Sub1_Sub4_7.method483(local28);
						this.anInt849 = 0;
						this.anInt850 = local18;
						this.anInt851 = local13;
						this.anInt852 = 2;
						if (Class32.method316(local18).anInt424 == this.anInt961) {
							this.anInt852 = 1;
						}
						if (Class32.method316(local18).anInt424 == this.anInt840) {
							this.anInt852 = 3;
						}
					}
					if (local23 == 945) {
						local1621 = this.aStringArray13[arg0];
						local287 = local1621.indexOf("@whi@");
						if (local287 != -1) {
							local2635 = Class15.method198(local1621.substring(local287 + 5).trim());
							local2135 = -1;
							for (@Pc(3068) int local3068 = 0; local3068 < this.anInt907; local3068++) {
								if (this.aLongArray3[local3068] == local2635) {
									local2135 = local3068;
									break;
								}
							}
							if (local2135 != -1 && this.anIntArray260[local2135] > 0) {
								this.aBoolean197 = true;
								this.anInt1020 = 0;
								this.aBoolean204 = true;
								this.aString17 = "";
								this.anInt936 = 3;
								this.aLong33 = this.aLongArray3[local2135];
								this.aString24 = "Enter message to send to " + this.aStringArray14[local2135];
							}
						}
					}
					if (local23 == 507) {
						local269 = Class32.method316(local18);
						this.anInt1050 = 1;
						this.anInt1051 = local18;
						this.anInt1052 = local269.anInt439;
						this.anInt889 = 0;
						this.aBoolean207 = true;
						local336 = local269.aString6;
						if (local336.indexOf(" ") != -1) {
							local336 = local336.substring(0, local336.indexOf(" "));
						}
						local947 = local269.aString6;
						if (local947.indexOf(" ") != -1) {
							local947 = local947.substring(local947.indexOf(" ") + 1);
						}
						this.aString31 = local336 + " " + local269.aString8 + " " + local947;
						if (this.anInt1052 == 16) {
							this.aBoolean207 = true;
							this.anInt994 = 3;
							this.aBoolean208 = true;
						}
					} else {
						if (local23 == 316) {
							local374 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local28];
							if (local374 != null) {
								this.method610(1, aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray175[0], aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray174[0], 0, local374.anIntArray174[0], 0, 1, 0, 2, false, local374.anIntArray175[0]);
								this.anInt1026 = super.anInt810;
								this.anInt1027 = super.anInt811;
								this.anInt1029 = 2;
								this.anInt1028 = 0;
								this.aClass3_Sub1_Sub4_7.method447(70);
								this.aClass3_Sub1_Sub4_7.method483(local28);
							}
						}
						if (local23 == 613 && this.method642(local13, local18, local28)) {
							this.aClass3_Sub1_Sub4_7.method447(59);
							this.aClass3_Sub1_Sub4_7.method483(this.anInt891);
							this.aClass3_Sub1_Sub4_7.method449(local13 + this.anInt946);
							this.aClass3_Sub1_Sub4_7.method484((byte) 8, local28 >> 14 & 0x7FFF);
							this.aClass3_Sub1_Sub4_7.method484((byte) 8, this.anInt892);
							this.aClass3_Sub1_Sub4_7.method483(local18 + this.anInt947);
							this.aClass3_Sub1_Sub4_7.method483(this.anInt890);
						}
						if (local23 == 411) {
							local665 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local28];
							if (local665 != null) {
								this.method610(1, aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray175[0], aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray174[0], 0, local665.anIntArray174[0], 0, 1, 0, 2, false, local665.anIntArray175[0]);
								this.anInt1026 = super.anInt810;
								this.anInt1027 = super.anInt811;
								this.anInt1029 = 2;
								this.anInt1028 = 0;
								this.aClass3_Sub1_Sub4_7.method447(159);
								this.aClass3_Sub1_Sub4_7.method482(this.anInt892);
								this.aClass3_Sub1_Sub4_7.method483(this.anInt890);
								this.aClass3_Sub1_Sub4_7.method449(this.anInt891);
								this.aClass3_Sub1_Sub4_7.method449(local28);
							}
						}
						if (local23 == 588 && !this.aBoolean205) {
							this.aClass3_Sub1_Sub4_7.method447(182);
							this.aClass3_Sub1_Sub4_7.method449(local18);
							this.aBoolean205 = true;
						}
						if (local23 == 210) {
							this.method613(this.anInt997);
							this.anInt997 = -1;
							this.aBoolean197 = true;
						}
						this.anInt889 = 0;
						this.anInt1050 = 0;
						this.aBoolean207 = true;
					}
				}
			}
		} catch (@Pc(3449) RuntimeException local3449) {
			signlink.reporterror("75595, " + -718 + ", " + arg0 + ", " + local3449.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method628() {
		try {
			if (this.anInt915 != 4) {
				this.anInt871 = -1;
			}
			if (this.anInt1044 == 2) {
				for (@Pc(17) Class3_Sub2 local17 = (Class3_Sub2) this.aClass44_12.method439(); local17 != null; local17 = (Class3_Sub2) this.aClass44_12.method441()) {
					if (local17.anInt260 > 0) {
						local17.anInt260--;
					}
					if (local17.anInt260 != 0) {
						if (local17.anInt264 > 0) {
							local17.anInt264--;
						}
						if (local17.anInt264 == 0 && local17.anInt258 >= 1 && local17.anInt259 >= 1 && local17.anInt258 <= 102 && local17.anInt259 <= 102 && (local17.anInt261 < 0 || Class47.method558(local17.anInt261, local17.anInt263))) {
							this.method645(local17.anInt259, local17.anInt256, local17.anInt262, local17.anInt263, local17.anInt257, local17.anInt261, local17.anInt258);
							local17.anInt264 = -1;
							if (local17.anInt261 == local17.anInt265 && local17.anInt265 == -1) {
								local17.method514();
							} else if (local17.anInt261 == local17.anInt265 && local17.anInt262 == local17.anInt266 && local17.anInt263 == local17.anInt267) {
								local17.method514();
							}
						}
					} else if (local17.anInt265 < 0 || Class47.method558(local17.anInt265, local17.anInt267)) {
						this.method645(local17.anInt259, local17.anInt256, local17.anInt266, local17.anInt267, local17.anInt257, local17.anInt265, local17.anInt258);
						local17.method514();
					}
				}
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("76013, " + 4 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method584() {
		try {
			this.aBoolean210 = true;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("98561, " + 23974 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method629() {
		try {
			@Pc(12) int local12 = this.aClass3_Sub1_Sub2_Sub1_4.method47(this.anInt1021, "Choose Option");
			@Pc(26) int local26;
			for (@Pc(14) int local14 = 0; local14 < this.anInt1045; local14++) {
				local26 = this.aClass3_Sub1_Sub2_Sub1_4.method47(this.anInt1021, this.aStringArray13[local14]);
				if (local26 > local12) {
					local12 = local26;
				}
			}
			local12 += 8;
			local26 = this.anInt1045 * 15 + 21;
			@Pc(69) int local69;
			@Pc(87) int local87;
			if (super.anInt810 > 4 && super.anInt811 > 4 && super.anInt810 < 516 && super.anInt811 < 338) {
				local69 = super.anInt810 - local12 / 2 - 4;
				if (local69 + local12 > 512) {
					local69 = 512 - local12;
				}
				if (local69 < 0) {
					local69 = 0;
				}
				local87 = super.anInt811 - 4;
				if (local87 + local26 > 334) {
					local87 = 334 - local26;
				}
				if (local87 < 0) {
					local87 = 0;
				}
				this.aBoolean231 = true;
				this.anInt1005 = 0;
				this.anInt1006 = local69;
				this.anInt1007 = local87;
				this.anInt1008 = local12;
				this.anInt1009 = this.anInt1045 * 15 + 22;
			}
			if (super.anInt810 > 553 && super.anInt811 > 205 && super.anInt810 < 743 && super.anInt811 < 466) {
				local69 = super.anInt810 - local12 / 2 - 553;
				if (local69 < 0) {
					local69 = 0;
				} else if (local69 + local12 > 190) {
					local69 = 190 - local12;
				}
				local87 = super.anInt811 - 205;
				if (local87 < 0) {
					local87 = 0;
				} else if (local87 + local26 > 261) {
					local87 = 261 - local26;
				}
				this.aBoolean231 = true;
				this.anInt1005 = 1;
				this.anInt1006 = local69;
				this.anInt1007 = local87;
				this.anInt1008 = local12;
				this.anInt1009 = this.anInt1045 * 15 + 22;
			}
			if (super.anInt810 > 17 && super.anInt811 > 357 && super.anInt810 < 496 && super.anInt811 < 453) {
				local69 = super.anInt810 - local12 / 2 - 17;
				if (local69 < 0) {
					local69 = 0;
				} else if (local69 + local12 > 479) {
					local69 = 479 - local12;
				}
				local87 = super.anInt811 - 357;
				if (local87 < 0) {
					local87 = 0;
				} else if (local87 + local26 > 96) {
					local87 = 96 - local26;
				}
				this.aBoolean231 = true;
				this.anInt1005 = 2;
				this.anInt1006 = local69;
				this.anInt1007 = local87;
				this.anInt1008 = local12;
				this.anInt1009 = this.anInt1045 * 15 + 22;
			}
		} catch (@Pc(291) RuntimeException local291) {
			signlink.reporterror("47735, " + 3 + ", " + local291.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method630() {
		try {
			this.anInt870 += 0;
			this.aBoolean219 = true;
			try {
				@Pc(10) long local10 = System.currentTimeMillis();
				@Pc(12) int local12 = 0;
				@Pc(14) int local14 = 20;
				while (this.aBoolean221) {
					this.anInt1004++;
					this.method596();
					this.method596();
					this.method633();
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
			this.aBoolean219 = false;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("97180, " + 0 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method631(@OriginalArg(1) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass3_Sub1_Sub2_Sub4_13.anIntArray182;
			@Pc(8) int local8 = local5.length;
			for (@Pc(20) int local20 = 0; local20 < local8; local20++) {
				local5[local20] = 0;
			}
			@Pc(44) int local44;
			@Pc(46) int local46;
			for (@Pc(32) int local32 = 1; local32 < 103; local32++) {
				local44 = (103 - local32) * 512 * 4 + 24628;
				for (local46 = 1; local46 < 103; local46++) {
					if ((this.aByteArrayArrayArray8[arg0][local46][local32] & 0x18) == 0) {
						this.aClass25_1.method283(local5, local44, arg0, local46, local32);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local46][local32] & 0x8) != 0) {
						this.aClass25_1.method283(local5, local44, arg0 + 1, local46, local32);
					}
					local44 += 4;
				}
			}
			local44 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local46 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass3_Sub1_Sub2_Sub4_13.method528(this.aBoolean229);
			@Pc(157) int local157;
			for (@Pc(153) int local153 = 1; local153 < 103; local153++) {
				for (local157 = 1; local157 < 103; local157++) {
					if ((this.aByteArrayArrayArray8[arg0][local157][local153] & 0x18) == 0) {
						this.method724(local46, arg0, local44, local157, local153);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local157][local153] & 0x8) != 0) {
						this.method724(local46, arg0 + 1, local44, local157, local153);
					}
				}
			}
			if (this.aClass13_5 != null) {
				this.aClass13_5.method157(this.aBoolean229);
				Class3_Sub1_Sub2_Sub2.anIntArray29 = this.anIntArray229;
			}
			anInt1043++;
			if (anInt1043 > 134) {
				anInt1043 = 0;
				this.aClass3_Sub1_Sub4_7.method447(101);
				this.aClass3_Sub1_Sub4_7.method452(0);
			}
			this.anInt933 = 0;
			for (local157 = 0; local157 < 104; local157++) {
				for (@Pc(250) int local250 = 0; local250 < 104; local250++) {
					@Pc(260) int local260 = this.aClass25_1.method277(this.anInt894, local157, local250);
					if (local260 != 0) {
						local260 = local260 >> 14 & 0x7FFF;
						@Pc(272) int local272 = Class8.method70(local260).anInt106;
						if (local272 >= 0) {
							@Pc(276) int local276 = local157;
							@Pc(278) int local278 = local250;
							if (local272 != 22 && local272 != 29 && local272 != 34 && local272 != 36 && local272 != 46 && local272 != 47 && local272 != 48) {
								@Pc(310) int[][] local310 = this.aClass11Array1[this.anInt894].anIntArrayArray4;
								for (@Pc(312) int local312 = 0; local312 < 10; local312++) {
									@Pc(319) int local319 = (int) (Math.random() * 4.0D);
									if (local319 == 0 && local276 > 0 && local276 > local157 - 3 && (local310[local276 - 1][local278] & 0x1280108) == 0) {
										local276--;
									}
									if (local319 == 1 && local276 < 103 && local276 < local157 + 3 && (local310[local276 + 1][local278] & 0x1280180) == 0) {
										local276++;
									}
									if (local319 == 2 && local278 > 0 && local278 > local250 - 3 && (local310[local276][local278 - 1] & 0x1280102) == 0) {
										local278--;
									}
									if (local319 == 3 && local278 < 103 && local278 < local250 + 3 && (local310[local276][local278 + 1] & 0x1280120) == 0) {
										local278++;
									}
								}
							}
							this.aClass3_Sub1_Sub2_Sub4Array6[this.anInt933] = this.aClass3_Sub1_Sub2_Sub4Array10[local272];
							this.anIntArray240[this.anInt933] = local276;
							this.anIntArray241[this.anInt933] = local278;
							this.anInt933++;
						}
					}
				}
			}
			anInt821++;
			if (anInt821 > 196) {
				anInt821 = 0;
				this.aClass3_Sub1_Sub4_7.method447(23);
				this.aClass3_Sub1_Sub4_7.method448(203);
			}
		} catch (@Pc(467) RuntimeException local467) {
			signlink.reporterror("20366, " + 25 + ", " + arg0 + ", " + local467.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method633() {
		try {
			@Pc(8) int local8;
			if (this.anInt883 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt883 > 768) {
						this.anIntArray215[local8] = this.method722(1024 - this.anInt883, this.anIntArray217[local8], this.anIntArray216[local8]);
					} else if (this.anInt883 > 256) {
						this.anIntArray215[local8] = this.anIntArray217[local8];
					} else {
						this.anIntArray215[local8] = this.method722(256 - this.anInt883, this.anIntArray216[local8], this.anIntArray217[local8]);
					}
				}
			} else if (this.anInt884 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt884 > 768) {
						this.anIntArray215[local8] = this.method722(1024 - this.anInt884, this.anIntArray218[local8], this.anIntArray216[local8]);
					} else if (this.anInt884 > 256) {
						this.anIntArray215[local8] = this.anIntArray218[local8];
					} else {
						this.anIntArray215[local8] = this.method722(256 - this.anInt884, this.anIntArray216[local8], this.anIntArray218[local8]);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray215[local8] = this.anIntArray216[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass13_10.anIntArray40[local8] = this.aClass3_Sub1_Sub2_Sub4_3.anIntArray182[local8];
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
				local198 = this.anIntArray224[local185] * (256 - local185) / 256;
				local202 = local198 + 22;
				if (local202 < 0) {
					local202 = 0;
				}
				local181 += local202;
				for (local212 = local202; local212 < 128; local212++) {
					local220 = this.anIntArray245[local181++];
					if (local220 == 0) {
						local183++;
					} else {
						local224 = local220;
						local228 = 256 - local220;
						local220 = this.anIntArray215[local220];
						local239 = this.aClass13_10.anIntArray40[local183];
						this.aClass13_10.anIntArray40[local183++] = ((local220 & 0xFF00FF) * local224 + (local239 & 0xFF00FF) * local228 & 0xFF00FF00) + ((local220 & 0xFF00) * local224 + (local239 & 0xFF00) * local228 & 0xFF0000) >> 8;
					}
				}
				local183 += local202;
			}
			this.aClass13_10.method158(0, super.aGraphics2, 0);
			for (local198 = 0; local198 < 33920; local198++) {
				this.aClass13_11.anIntArray40[local198] = this.aClass3_Sub1_Sub2_Sub4_4.anIntArray182[local198];
			}
			local181 = 0;
			local183 = 1176;
			for (local202 = 1; local202 < 255; local202++) {
				local212 = this.anIntArray224[local202] * (256 - local202) / 256;
				local220 = 103 - local212;
				local183 += local212;
				for (local224 = 0; local224 < local220; local224++) {
					local228 = this.anIntArray245[local181++];
					if (local228 == 0) {
						local183++;
					} else {
						local239 = local228;
						@Pc(362) int local362 = 256 - local228;
						local228 = this.anIntArray215[local228];
						@Pc(373) int local373 = this.aClass13_11.anIntArray40[local183];
						this.aClass13_11.anIntArray40[local183++] = ((local228 & 0xFF00FF) * local239 + (local373 & 0xFF00FF) * local362 & 0xFF00FF00) + ((local228 & 0xFF00) * local239 + (local373 & 0xFF00) * local362 & 0xFF0000) >> 8;
					}
				}
				local181 += 128 - local220;
				local183 += 128 - local220 - local212;
			}
			this.aClass13_11.method158(0, super.aGraphics2, 637);
		} catch (@Pc(448) RuntimeException local448) {
			signlink.reporterror("42428, " + 5 + ", " + local448.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)Ljava/lang/String;")
	private String method634(@OriginalArg(1) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("29499, " + -977 + ", " + arg0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method635() {
		try {
			if (this.anInt886 != 0) {
				@Pc(5) int local5 = 0;
				if (this.anInt996 != 0) {
					local5 = 1;
				}
				for (@Pc(12) int local12 = 0; local12 < 100; local12++) {
					if (this.aStringArray11[local12] != null) {
						@Pc(24) int local24 = this.anIntArray248[local12];
						@Pc(29) String local29 = this.aStringArray10[local12];
						if (local29 != null && local29.startsWith("@cr1@")) {
							local29 = local29.substring(5);
						}
						if (local29 != null && local29.startsWith("@cr2@")) {
							local29 = local29.substring(5);
						}
						if ((local24 == 3 || local24 == 7) && (local24 == 7 || this.anInt935 == 0 || this.anInt935 == 1 && this.method590(local29, (byte) 5))) {
							@Pc(82) int local82 = 329 - local5 * 13;
							if (super.anInt804 > 4 && super.anInt805 - 4 > local82 - 10 && super.anInt805 - 4 <= local82 + 3) {
								@Pc(122) int local122 = this.aClass3_Sub1_Sub2_Sub1_3.method47(this.anInt1021, "From:  " + local29 + this.aStringArray11[local12]) + 25;
								if (local122 > 450) {
									local122 = 450;
								}
								if (super.anInt804 < local122 + 4) {
									if (this.anInt815 >= 1) {
										this.aStringArray13[this.anInt1045] = "Report abuse @whi@" + local29;
										this.anIntArray271[this.anInt1045] = 2545;
										this.anInt1045++;
									}
									this.aStringArray13[this.anInt1045] = "Add ignore @whi@" + local29;
									this.anIntArray271[this.anInt1045] = 2968;
									this.anInt1045++;
									this.aStringArray13[this.anInt1045] = "Add friend @whi@" + local29;
									this.anIntArray271[this.anInt1045] = 2493;
									this.anInt1045++;
								}
							}
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
						if ((local24 == 5 || local24 == 6) && this.anInt935 < 2) {
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(243) RuntimeException local243) {
			signlink.reporterror("18223, " + -76 + ", " + local243.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method636() {
		try {
			if (this.anInt980 == 0) {
				this.aStringArray13[0] = "Cancel";
				this.anIntArray271[0] = 1725;
				this.anInt1045 = 1;
				if (this.anInt998 == -1) {
					this.method635();
					this.anInt977 = 0;
					this.anInt1023 = 0;
					if (super.anInt804 > 4 && super.anInt805 > 4 && super.anInt804 < 516 && super.anInt805 < 338) {
						if (this.anInt961 == -1) {
							this.method678();
						} else {
							this.method677(super.anInt805, 0, 0, 4, 4, Class32.method316(this.anInt961), super.anInt804);
						}
					}
					if (this.anInt977 != this.anInt1014) {
						this.anInt1014 = this.anInt977;
					}
					if (this.anInt1023 != this.anInt939) {
						this.anInt939 = this.anInt1023;
					}
					this.anInt977 = 0;
					this.anInt1023 = 0;
					if (super.anInt804 > 553 && super.anInt805 > 205 && super.anInt804 < 743 && super.anInt805 < 466) {
						if (this.anInt920 != -1) {
							this.method677(super.anInt805, 0, 1, 553, 205, Class32.method316(this.anInt920), super.anInt804);
						} else if (this.anIntArray256[this.anInt994] != -1) {
							this.method677(super.anInt805, 0, 1, 553, 205, Class32.method316(this.anIntArray256[this.anInt994]), super.anInt804);
						}
					}
					if (this.anInt977 != this.anInt822) {
						this.aBoolean207 = true;
						this.anInt822 = this.anInt977;
					}
					if (this.anInt1023 != this.anInt816) {
						this.aBoolean207 = true;
						this.anInt816 = this.anInt1023;
					}
					this.anInt977 = 0;
					this.anInt1023 = 0;
					if (super.anInt804 > 17 && super.anInt805 > 357 && super.anInt804 < 496 && super.anInt805 < 453) {
						if (this.anInt840 != -1) {
							this.method677(super.anInt805, 0, 2, 17, 357, Class32.method316(this.anInt840), super.anInt804);
						} else if (this.anInt997 != -1) {
							this.method677(super.anInt805, 0, 3, 17, 357, Class32.method316(this.anInt997), super.anInt804);
						} else if (super.anInt805 < 434 && super.anInt804 < 426 && this.anInt1020 == 0) {
							this.method659(super.anInt804 - 17, super.anInt805 - 357, this.anInt905);
						}
					}
					if ((this.anInt840 != -1 || this.anInt997 != -1) && this.anInt977 != this.anInt1016) {
						this.aBoolean197 = true;
						this.anInt1016 = this.anInt977;
					}
					if ((this.anInt840 != -1 || this.anInt997 != -1) && this.anInt1023 != this.anInt942) {
						this.aBoolean197 = true;
						this.anInt942 = this.anInt1023;
					}
					@Pc(350) boolean local350 = false;
					while (!local350) {
						local350 = true;
						for (@Pc(356) int local356 = 0; local356 < this.anInt1045 - 1; local356++) {
							if (this.anIntArray271[local356] < 1000 && this.anIntArray271[local356 + 1] > 1000) {
								@Pc(377) String local377 = this.aStringArray13[local356];
								this.aStringArray13[local356] = this.aStringArray13[local356 + 1];
								this.aStringArray13[local356 + 1] = local377;
								@Pc(399) int local399 = this.anIntArray271[local356];
								this.anIntArray271[local356] = this.anIntArray271[local356 + 1];
								this.anIntArray271[local356 + 1] = local399;
								@Pc(421) int local421 = this.anIntArray269[local356];
								this.anIntArray269[local356] = this.anIntArray269[local356 + 1];
								this.anIntArray269[local356 + 1] = local421;
								@Pc(443) int local443 = this.anIntArray270[local356];
								this.anIntArray270[local356] = this.anIntArray270[local356 + 1];
								this.anIntArray270[local356 + 1] = local443;
								@Pc(465) int local465 = this.anIntArray272[local356];
								this.anIntArray272[local356] = this.anIntArray272[local356 + 1];
								this.anIntArray272[local356 + 1] = local465;
								local350 = false;
							}
						}
					}
				} else {
					this.anInt977 = 0;
					this.anInt1023 = 0;
					this.method677(super.anInt805, 0, 0, 0, 0, Class32.method316(this.anInt998), super.anInt804);
					if (this.anInt977 != this.anInt1014) {
						this.anInt1014 = this.anInt977;
					}
					if (this.anInt1023 != this.anInt939) {
						this.anInt939 = this.anInt1023;
					}
				}
			}
		} catch (@Pc(495) RuntimeException local495) {
			signlink.reporterror("74274, " + 0 + ", " + local495.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)Z")
	private boolean method637() {
		try {
			if (this.aByte42 != 2) {
				for (@Pc(5) int local5 = 1; local5 > 0; local5++) {
				}
			}
			return signlink.wavereplay();
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("49521, " + 2 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method638() {
		try {
			signlink.aBoolean238 = false;
			signlink.anInt1061 = 0;
			signlink.midi = "stop";
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("17434, " + false + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!SSCICQYX;)V")
	private void method639(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub2_Sub3 arg1) {
		try {
			if (arg0 < 9 || arg0 > 9) {
				this.anInt871 = -1;
			}
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray235.length; local14++) {
				this.anIntArray235[local14] = 0;
			}
			@Pc(39) int local39;
			for (@Pc(29) int local29 = 0; local29 < 5000; local29++) {
				local39 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray235[local39] = (int) (Math.random() * 256.0D);
			}
			@Pc(57) int local57;
			@Pc(61) int local61;
			@Pc(69) int local69;
			for (local39 = 0; local39 < 20; local39++) {
				for (local57 = 1; local57 < 255; local57++) {
					for (local61 = 1; local61 < 127; local61++) {
						local69 = local61 + (local57 << 7);
						this.anIntArray236[local69] = (this.anIntArray235[local69 - 1] + this.anIntArray235[local69 + 1] + this.anIntArray235[local69 - 128] + this.anIntArray235[local69 + 128]) / 4;
					}
				}
				@Pc(115) int[] local115 = this.anIntArray235;
				this.anIntArray235 = this.anIntArray236;
				this.anIntArray236 = local115;
			}
			if (arg1 != null) {
				local57 = 0;
				for (local61 = 0; local61 < arg1.anInt548; local61++) {
					for (local69 = 0; local69 < arg1.anInt547; local69++) {
						if (arg1.aByteArray16[local57++] != 0) {
							@Pc(151) int local151 = local69 + arg1.anInt549 + 16;
							@Pc(158) int local158 = local61 + arg1.anInt550 + 16;
							@Pc(164) int local164 = local151 + (local158 << 7);
							this.anIntArray235[local164] = 0;
						}
					}
				}
			}
		} catch (@Pc(181) RuntimeException local181) {
			signlink.reporterror("81031, " + arg0 + ", " + arg1 + ", " + local181.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method640() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt983; local3++) {
				if (this.anIntArray257[local3] <= 0) {
					@Pc(12) boolean local12 = false;
					try {
						if (this.anIntArray247[local3] != this.anInt940 || this.anIntArray212[local3] != this.anInt861) {
							@Pc(45) Class3_Sub1_Sub4 local45 = Class41.method423(this.anIntArray247[local3], this.anIntArray212[local3]);
							if (System.currentTimeMillis() + (long) (local45.anInt666 / 22) > this.aLong30 + (long) (this.anInt963 / 22)) {
								this.anInt963 = local45.anInt666;
								this.aLong30 = System.currentTimeMillis();
								if (this.method687(local45.aByteArray20, local45.anInt666)) {
									this.anInt940 = this.anIntArray247[local3];
									this.anInt861 = this.anIntArray212[local3];
								} else {
									local12 = true;
								}
							}
						} else if (!this.method637()) {
							local12 = true;
						}
					} catch (@Pc(95) Exception local95) {
						if (signlink.reporterror) {
							this.aClass3_Sub1_Sub4_7.method447(121);
							this.aClass3_Sub1_Sub4_7.method449(this.anIntArray247[local3] & 0x7FFF);
						} else {
							this.aClass3_Sub1_Sub4_7.method447(121);
							this.aClass3_Sub1_Sub4_7.method449(-1);
						}
					}
					if (local12 && this.anIntArray257[local3] != -5) {
						this.anIntArray257[local3] = -5;
					} else {
						this.anInt983--;
						for (@Pc(138) int local138 = local3; local138 < this.anInt983; local138++) {
							this.anIntArray247[local138] = this.anIntArray247[local138 + 1];
							this.anIntArray212[local138] = this.anIntArray212[local138 + 1];
							this.anIntArray257[local138] = this.anIntArray257[local138 + 1];
						}
						local3--;
					}
				} else {
					@Pc(190) int local190 = this.anIntArray257[local3]--;
				}
			}
			if (this.anInt898 > 0) {
				this.anInt898 -= 20;
				if (this.anInt898 < 0) {
					this.anInt898 = 0;
				}
				if (this.anInt898 == 0 && this.aBoolean232 && !aBoolean203) {
					this.anInt819 = this.anInt854;
					this.aBoolean196 = true;
					this.aClass16_Sub1_1.method222(2, this.anInt819);
					return;
				}
			}
		} catch (@Pc(240) RuntimeException local240) {
			signlink.reporterror("13924, " + -17345 + ", " + local240.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)Z")
	private boolean method641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 != 0) {
				this.aClass3_Sub1_Sub4_7.method448(226);
			}
			if (arg1 < 0) {
				return false;
			}
			@Pc(14) int local14 = this.anIntArray271[arg1];
			if (local14 >= 2000) {
				local14 -= 2000;
			}
			return local14 == 493;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("51135, " + arg0 + ", " + arg1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean220) {
			this.method630();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBII)Z")
	private boolean method642(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = arg2 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass25_1.method278(this.anInt894, arg0, arg1, arg2);
			if (local16 == -1) {
				return false;
			}
			@Pc(25) int local25 = local16 & 0x1F;
			@Pc(31) int local31 = local16 >> 6 & 0x3;
			if (local25 == 10 || local25 == 11 || local25 == 22) {
				@Pc(43) Class8 local43 = Class8.method70(local7);
				@Pc(51) int local51;
				@Pc(54) int local54;
				if (local31 == 0 || local31 == 2) {
					local51 = local43.anInt102;
					local54 = local43.anInt110;
				} else {
					local51 = local43.anInt110;
					local54 = local43.anInt102;
				}
				@Pc(65) int local65 = local43.anInt95;
				if (local31 != 0) {
					local65 = (local65 << local31 & 0xF) + (local65 >> 4 - local31);
				}
				this.method610(local54, aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray175[0], aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray174[0], 0, arg0, local65, local51, 0, 2, true, arg1);
			} else {
				this.method610(0, aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray175[0], aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray174[0], local31, arg0, 0, 0, local25 + 1, 2, true, arg1);
			}
			this.anInt1026 = super.anInt810;
			this.anInt1027 = super.anInt811;
			this.anInt1029 = 2;
			this.anInt1028 = 0;
			return true;
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("16816, " + arg0 + ", " + 59 + ", " + arg1 + ", " + arg2 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method643() {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt929; local3++) {
				if (local3 == -1) {
					local11 = this.anInt928;
				} else {
					local11 = this.anIntArray238[local3];
				}
				@Pc(23) Class3_Sub1_Sub1_Sub4_Sub2 local23 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local11];
				if (local23 != null) {
					this.method713(local23, 1);
				}
			}
			anInt973++;
			if (anInt973 > 1881) {
				anInt973 = 0;
				this.aClass3_Sub1_Sub4_7.method447(207);
				this.aClass3_Sub1_Sub4_7.method448(0);
				local11 = this.aClass3_Sub1_Sub4_7.anInt666;
				this.aClass3_Sub1_Sub4_7.method448((int) (Math.random() * 256.0D));
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass3_Sub1_Sub4_7.method448(68);
				}
				this.aClass3_Sub1_Sub4_7.method449(46660);
				this.aClass3_Sub1_Sub4_7.method449((int) (Math.random() * 65536.0D));
				this.aClass3_Sub1_Sub4_7.method449(9575);
				this.aClass3_Sub1_Sub4_7.method449(41697);
				this.aClass3_Sub1_Sub4_7.method448(216);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass3_Sub1_Sub4_7.method449(36121);
				}
				this.aClass3_Sub1_Sub4_7.method449(64072);
				this.aClass3_Sub1_Sub4_7.method449(26089);
				this.aClass3_Sub1_Sub4_7.method457(this.aClass3_Sub1_Sub4_7.anInt666 - local11);
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("99797, " + true + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BZ)V")
	private void method644(@OriginalArg(0) byte arg0, @OriginalArg(1) boolean arg1) {
		try {
			@Pc(6) boolean local6 = false;
			for (@Pc(12) int local12 = 0; local12 < this.anInt1011; local12++) {
				@Pc(22) Class3_Sub1_Sub1_Sub4_Sub1 local22 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[this.anIntArray263[local12]];
				@Pc(31) int local31 = (this.anIntArray263[local12] << 14) + 536870912;
				if (local22 != null && local22.method506() && local22.aClass2_1.aBoolean1 == arg1 && local22.aClass2_1.method1()) {
					@Pc(52) int local52 = local22.anInt728 >> 7;
					@Pc(57) int local57 = local22.anInt729 >> 7;
					if (local52 >= 0 && local52 < 104 && local57 >= 0 && local57 < 104) {
						if (local22.anInt714 == 1 && (local22.anInt728 & 0x7F) == 64 && (local22.anInt729 & 0x7F) == 64) {
							if (this.anIntArrayArray24[local52][local57] == this.anInt937) {
								continue;
							}
							this.anIntArrayArray24[local52][local57] = this.anInt937;
						}
						if (!local22.aClass2_1.aBoolean2) {
							local31 += Integer.MIN_VALUE;
						}
						this.aClass25_1.method259(local22.aBoolean167, this.anInt894, local22, local22.anInt730, local22.anInt729, (local22.anInt714 - 1) * 64 + 60, this.method688(local22.anInt728, local22.anInt729, 899, this.anInt894), local22.anInt728, local31);
					}
				}
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("52637, " + arg0 + ", " + arg1 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
	private void method645(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg6 >= 1 && arg0 >= 1 && arg6 <= 102 && arg0 <= 102) {
				if (aBoolean203 && arg1 != this.anInt894) {
					return;
				}
				@Pc(31) int local31 = 0;
				if (arg4 == 0) {
					local31 = this.aClass25_1.method274(arg1, arg6, arg0);
				}
				if (arg4 == 1) {
					local31 = this.aClass25_1.method275(arg0, arg6, arg1);
				}
				if (arg4 == 2) {
					local31 = this.aClass25_1.method276(arg1, arg6, arg0);
				}
				if (arg4 == 3) {
					local31 = this.aClass25_1.method277(arg1, arg6, arg0);
				}
				@Pc(87) int local87;
				if (local31 != 0) {
					local87 = this.aClass25_1.method278(arg1, arg6, arg0, local31);
					@Pc(93) int local93 = local31 >> 14 & 0x7FFF;
					@Pc(97) int local97 = local87 & 0x1F;
					@Pc(101) int local101 = local87 >> 6;
					@Pc(113) Class8 local113;
					if (arg4 == 0) {
						this.aClass25_1.method265(arg0, arg6, arg1);
						local113 = Class8.method70(local93);
						if (local113.aBoolean25) {
							this.aClass11Array1[arg1].method133(local101, arg6, arg0, local113.aBoolean32, local97);
						}
					}
					if (arg4 == 1) {
						this.aClass25_1.method266(arg0, arg1, arg6);
					}
					if (arg4 == 2) {
						this.aClass25_1.method267(arg0, arg1, arg6, this.anInt882);
						local113 = Class8.method70(local93);
						if (arg6 + local113.anInt102 > 103 || arg0 + local113.anInt102 > 103 || arg6 + local113.anInt110 > 103 || arg0 + local113.anInt110 > 103) {
							return;
						}
						if (local113.aBoolean25) {
							this.aClass11Array1[arg1].method134(arg6, local113.aBoolean32, local113.anInt110, local113.anInt102, arg0, local101);
						}
					}
					if (arg4 == 3) {
						this.aClass25_1.method268(arg0, arg1, arg6);
						local113 = Class8.method70(local93);
						if (local113.aBoolean25 && local113.aBoolean28) {
							this.aClass11Array1[arg1].method136(arg0, arg6);
						}
					}
				}
				if (arg5 >= 0) {
					local87 = arg1;
					if (arg1 < 3 && (this.aByteArrayArrayArray8[1][arg6][arg0] & 0x2) == 2) {
						local87 = arg1 + 1;
					}
					Class47.method543(this.anIntArrayArrayArray8, arg5, local87, arg0, this.aClass25_1, this.aClass11Array1[arg1], arg3, arg1, arg2, arg6);
					return;
				}
			}
		} catch (@Pc(261) RuntimeException local261) {
			signlink.reporterror("48355, " + arg0 + ", " + 12071 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local261.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!WNCFPLWV;)V")
	private void method646(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub1_Sub4 arg1) {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anInt930; local5++) {
				@Pc(12) int local12 = this.anIntArray239[local5];
				@Pc(17) Class3_Sub1_Sub1_Sub4_Sub2 local17 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local12];
				@Pc(20) int local20 = arg1.method458();
				if ((local20 & 0x20) != 0) {
					local20 += arg1.method458() << 8;
				}
				this.method619(arg1, local17, local20, local12);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("31998, " + 4 + ", " + arg0 + ", " + arg1 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!QQMJEFXK;)Z")
	private boolean method647(@OriginalArg(1) Class32 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt430;
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
				this.aStringArray13[this.anInt1045] = "Remove @whi@" + this.aStringArray14[local4];
				this.anIntArray271[this.anInt1045] = 366;
				this.anInt1045++;
				this.aStringArray13[this.anInt1045] = "Message @whi@" + this.aStringArray14[local4];
				this.anIntArray271[this.anInt1045] = 945;
				this.anInt1045++;
				return true;
			} else if (local4 >= 401 && local4 <= 500) {
				this.aStringArray13[this.anInt1045] = "Remove @whi@" + arg0.aString9;
				this.anIntArray271[this.anInt1045] = 453;
				this.anInt1045++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("54560, " + 0 + ", " + arg0 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method648(@OriginalArg(0) int arg0) {
		try {
			this.method658();
			if (arg0 >= 0) {
				this.aClass3_Sub1_Sub4_7.method448(255);
			}
			if (this.anInt1029 == 1) {
				this.aClass3_Sub1_Sub2_Sub4Array8[this.anInt1028 / 100].method533(this.anInt1026 - 8 - 4, this.anInt1027 - 8 - 4);
			}
			if (this.anInt1029 == 2) {
				this.aClass3_Sub1_Sub2_Sub4Array8[this.anInt1028 / 100 + 4].method533(this.anInt1026 - 8 - 4, this.anInt1027 - 8 - 4);
			}
			if (this.anInt995 != -1) {
				this.method616(this.anInt995, this.anInt880);
				this.method599(0, Class32.method316(this.anInt995), 0, 0);
			}
			if (this.anInt961 != -1) {
				this.method616(this.anInt961, this.anInt880);
				this.method599(0, Class32.method316(this.anInt961), 0, 0);
			}
			this.method662();
			if (!this.aBoolean231) {
				this.method636();
				this.method698();
			} else if (this.anInt1005 == 0) {
				this.method726();
			}
			if (this.anInt866 == 1) {
				this.aClass3_Sub1_Sub2_Sub4_7.method533(472, 296);
			}
			@Pc(172) int local172;
			if (aBoolean214) {
				@Pc(138) byte local138 = 20;
				@Pc(140) int local140 = 16776960;
				if (super.anInt799 < 30 && aBoolean203) {
					local140 = 16711680;
				}
				if (super.anInt799 < 20 && !aBoolean203) {
					local140 = 16711680;
				}
				this.aClass3_Sub1_Sub2_Sub1_3.method44("Fps:" + super.anInt799, local140, 20);
				local172 = local138 + 15;
				@Pc(174) Runtime local174 = Runtime.getRuntime();
				@Pc(183) int local183 = (int) ((local174.totalMemory() - local174.freeMemory()) / 1024L);
				if (local183 > 33554432 && aBoolean203) {
				}
				if (local183 > 67108864 && !aBoolean203) {
				}
				this.aClass3_Sub1_Sub2_Sub1_3.method44("Mem:" + local183 + "k", 16776960, 35);
				local172 += 15;
			}
			if (this.anInt996 != 0) {
				@Pc(224) int local224 = this.anInt996 / 50;
				local172 = local224 / 60;
				@Pc(232) int local232 = local224 % 60;
				if (local232 < 10) {
					this.aClass3_Sub1_Sub2_Sub1_3.method49(4, 16776960, "System update in: " + local172 + ":0" + local232, 329, this.anInt969);
				} else {
					this.aClass3_Sub1_Sub2_Sub1_3.method49(4, 16776960, "System update in: " + local172 + ":" + local232, 329, this.anInt969);
				}
			}
		} catch (@Pc(276) RuntimeException local276) {
			signlink.reporterror("26836, " + arg0 + ", " + local276.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[BZ)V")
	private void method649(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		try {
			if (this.aBoolean232) {
				signlink.anInt1061 = arg0 ? 1 : 0;
				signlink.midisave(arg1, arg1.length);
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("97052, " + arg0 + ", " + arg1 + ", " + false + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method650(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) Graphics local4 = this.method585().getGraphics();
			local4.setColor(Color.black);
			if (arg0 <= 0) {
				this.anInt871 = this.aClass3_Sub1_Sub4_6.method458();
			}
			local4.fillRect(0, 0, 765, 503);
			this.method578();
			@Pc(43) byte local43;
			@Pc(49) int local49;
			if (this.aBoolean223) {
				this.aBoolean221 = false;
				local4.setFont(new Font("Helvetica", 1, 16));
				local4.setColor(Color.yellow);
				local43 = 35;
				local4.drawString("Sorry, an error has occured whilst loading RuneScape", 30, 35);
				local49 = local43 + 50;
				local4.setColor(Color.white);
				local4.drawString("To fix this try the following (in order):", 30, 85);
				@Pc(58) int local58 = local49 + 50;
				local4.setColor(Color.white);
				local4.setFont(new Font("Helvetica", 1, 12));
				local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				@Pc(75) int local75 = local58 + 30;
				local4.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, 165);
				@Pc(81) int local81 = local75 + 30;
				local4.drawString("3: Try using a different game-world", 30, 195);
				@Pc(87) int local87 = local81 + 30;
				local4.drawString("4: Try rebooting your computer", 30, 225);
				@Pc(93) int local93 = local87 + 30;
				local4.drawString("5: Try selecting a different version of Java from the play-game menu", 30, 255);
			}
			if (this.aBoolean234) {
				this.aBoolean221 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean198) {
				this.aBoolean221 = false;
				local4.setColor(Color.yellow);
				local43 = 35;
				local4.drawString("Error a copy of RuneScape already appears to be loaded", 30, 35);
				local49 = local43 + 50;
				local4.setColor(Color.white);
				local4.drawString("To fix this try the following (in order):", 30, 85);
				local49 += 50;
				local4.setColor(Color.white);
				local4.setFont(new Font("Helvetica", 1, 12));
				local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				local49 += 30;
				local4.drawString("2: Try rebooting your computer, and reloading", 30, 165);
				local49 += 30;
			}
		} catch (@Pc(181) RuntimeException local181) {
			signlink.reporterror("78815, " + arg0 + ", " + local181.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method651() {
		try {
			this.aClass13_3.method157(this.aBoolean229);
			this.aBoolean206 &= true;
			Class3_Sub1_Sub2_Sub2.anIntArray29 = this.anIntArray228;
			this.aClass3_Sub1_Sub2_Sub3_18.method369(0, 0);
			if (this.anInt920 != -1) {
				this.method599(0, Class32.method316(this.anInt920), 0, 0);
			} else if (this.anIntArray256[this.anInt994] != -1) {
				this.method599(0, Class32.method316(this.anIntArray256[this.anInt994]), 0, 0);
			}
			if (this.aBoolean231 && this.anInt1005 == 1) {
				this.method726();
			}
			this.aClass13_3.method158(205, super.aGraphics2, 553);
			this.aClass13_5.method157(this.aBoolean229);
			Class3_Sub1_Sub2_Sub2.anIntArray29 = this.anIntArray229;
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("36673, " + true + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
	private void method652(@OriginalArg(0) int arg0) {
		try {
			@Pc(15) int local15 = Class37.aClass37Array1[arg0].anInt528;
			if (local15 != 0) {
				@Pc(23) int local23 = this.anIntArray273[arg0];
				if (local15 == 1) {
					if (local23 == 1) {
						Class3_Sub1_Sub2_Sub2.method107(0.9D);
					}
					if (local23 == 2) {
						Class3_Sub1_Sub2_Sub2.method107(0.8D);
					}
					if (local23 == 3) {
						Class3_Sub1_Sub2_Sub2.method107(0.7D);
					}
					if (local23 == 4) {
						Class3_Sub1_Sub2_Sub2.method107(0.6D);
					}
					Class10.aClass7_4.method67();
					this.aBoolean210 = true;
				}
				if (local15 == 3) {
					@Pc(61) boolean local61 = this.aBoolean232;
					if (local23 == 0) {
						this.method600(0, this.aBoolean232);
						this.aBoolean232 = true;
					}
					if (local23 == 1) {
						this.method600(-400, this.aBoolean232);
						this.aBoolean232 = true;
					}
					if (local23 == 2) {
						this.method600(-800, this.aBoolean232);
						this.aBoolean232 = true;
					}
					if (local23 == 3) {
						this.method600(-1200, this.aBoolean232);
						this.aBoolean232 = true;
					}
					if (local23 == 4) {
						this.aBoolean232 = false;
					}
					if (this.aBoolean232 != local61 && !aBoolean203) {
						if (this.aBoolean232) {
							this.anInt819 = this.anInt854;
							this.aBoolean196 = true;
							this.aClass16_Sub1_1.method222(2, this.anInt819);
						} else {
							this.method638();
						}
						this.anInt898 = 0;
					}
				}
				if (local15 == 4) {
					if (local23 == 0) {
						this.aBoolean218 = true;
						this.method681(0);
					}
					if (local23 == 1) {
						this.aBoolean218 = true;
						this.method681(-400);
					}
					if (local23 == 2) {
						this.aBoolean218 = true;
						this.method681(-800);
					}
					if (local23 == 3) {
						this.aBoolean218 = true;
						this.method681(-1200);
					}
					if (local23 == 4) {
						this.aBoolean218 = false;
					}
				}
				if (local15 == 5) {
					this.anInt993 = local23;
				}
				if (local15 == 6) {
					this.anInt1038 = local23;
				}
				if (local15 == 8) {
					this.anInt886 = local23;
					this.aBoolean197 = true;
				}
				if (local15 == 9) {
					this.anInt943 = local23;
				}
			}
		} catch (@Pc(221) RuntimeException local221) {
			signlink.reporterror("44525, " + arg0 + ", " + 0 + ", " + local221.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method653() {
		try {
			this.anInt974 = 0;
			@Pc(70) int local70;
			for (@Pc(6) int local6 = -1; local6 < this.anInt929 + this.anInt1011; local6++) {
				@Pc(13) Class3_Sub1_Sub1_Sub4 local13;
				if (local6 == -1) {
					local13 = aClass3_Sub1_Sub1_Sub4_Sub2_1;
				} else if (local6 < this.anInt929) {
					local13 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[this.anIntArray238[local6]];
				} else {
					local13 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[this.anIntArray263[local6 - this.anInt929]];
				}
				if (local13 != null && local13.method506()) {
					@Pc(54) Class2 local54;
					if (local13 instanceof Class3_Sub1_Sub1_Sub4_Sub1) {
						local54 = ((Class3_Sub1_Sub1_Sub4_Sub1) local13).aClass2_1;
						if (local54.anIntArray3 != null) {
							local54 = local54.method6();
						}
						if (local54 == null) {
							continue;
						}
					}
					if (local6 >= this.anInt929) {
						local54 = ((Class3_Sub1_Sub1_Sub4_Sub1) local13).aClass2_1;
						if (local54.anInt25 >= 0 && local54.anInt25 < this.aClass3_Sub1_Sub2_Sub4Array4.length) {
							this.method667(local13, local13.anInt691 + 15);
							if (this.anInt1035 > -1) {
								this.aClass3_Sub1_Sub2_Sub4Array4[local54.anInt25].method533(this.anInt1035 - 12, this.anInt1036 - 30);
							}
						}
						if (this.anInt887 == 1 && this.anInt906 == this.anIntArray263[local6 - this.anInt929] && anInt919 % 20 < 10) {
							this.method667(local13, local13.anInt691 + 15);
							if (this.anInt1035 > -1) {
								this.aClass3_Sub1_Sub2_Sub4Array7[0].method533(this.anInt1035 - 12, this.anInt1036 - 28);
							}
						}
					} else {
						local70 = 30;
						@Pc(73) Class3_Sub1_Sub1_Sub4_Sub2 local73 = (Class3_Sub1_Sub1_Sub4_Sub2) local13;
						if (local73.anInt739 != -1 || local73.anInt749 != -1) {
							this.method667(local13, local13.anInt691 + 15);
							if (this.anInt1035 > -1) {
								if (local73.anInt739 != -1) {
									this.aClass3_Sub1_Sub2_Sub4Array5[local73.anInt739].method533(this.anInt1035 - 12, this.anInt1036 - 30);
									local70 += 25;
								}
								if (local73.anInt749 != -1) {
									this.aClass3_Sub1_Sub2_Sub4Array4[local73.anInt749].method533(this.anInt1035 - 12, this.anInt1036 - local70);
									local70 += 25;
								}
							}
						}
						if (local6 >= 0 && this.anInt887 == 10 && this.anInt962 == this.anIntArray238[local6]) {
							this.method667(local13, local13.anInt691 + 15);
							if (this.anInt1035 > -1) {
								this.aClass3_Sub1_Sub2_Sub4Array7[1].method533(this.anInt1035 - 12, this.anInt1036 - local70);
							}
						}
					}
					if (local13.aString15 != null && (local6 >= this.anInt929 || this.anInt964 == 0 || this.anInt964 == 3 || this.anInt964 == 1 && this.method590(((Class3_Sub1_Sub1_Sub4_Sub2) local13).aString16, (byte) 5))) {
						this.method667(local13, local13.anInt691);
						if (this.anInt1035 > -1 && this.anInt974 < this.anInt975) {
							this.anIntArray252[this.anInt974] = this.aClass3_Sub1_Sub2_Sub1_4.method48(local13.aString15) / 2;
							this.anIntArray251[this.anInt974] = this.aClass3_Sub1_Sub2_Sub1_4.anInt66;
							this.anIntArray249[this.anInt974] = this.anInt1035;
							this.anIntArray250[this.anInt974] = this.anInt1036;
							this.anIntArray253[this.anInt974] = local13.anInt692;
							this.anIntArray254[this.anInt974] = local13.anInt722;
							this.anIntArray255[this.anInt974] = local13.anInt735;
							this.aStringArray12[this.anInt974++] = local13.aString15;
							if (this.anInt1038 == 0 && local13.anInt722 >= 1 && local13.anInt722 <= 3) {
								this.anIntArray251[this.anInt974] += 10;
								this.anIntArray250[this.anInt974] += 5;
							}
							if (this.anInt1038 == 0 && local13.anInt722 == 4) {
								this.anIntArray252[this.anInt974] = 60;
							}
							if (this.anInt1038 == 0 && local13.anInt722 == 5) {
								this.anIntArray251[this.anInt974] += 5;
							}
						}
					}
					if (local13.anInt724 > anInt919) {
						this.method667(local13, local13.anInt691 + 15);
						if (this.anInt1035 > -1) {
							local70 = local13.anInt725 * 30 / local13.anInt726;
							if (local70 > 30) {
								local70 = 30;
							}
							Class3_Sub1_Sub2.method521(local70, 65280, 5, this.anInt1035 - 15, this.aByte44, this.anInt1036 - 3);
							Class3_Sub1_Sub2.method521(30 - local70, 16711680, 5, this.anInt1035 + local70 - 15, this.aByte44, this.anInt1036 - 3);
						}
					}
					for (local70 = 0; local70 < 4; local70++) {
						if (local13.anIntArray178[local70] > anInt919) {
							this.method667(local13, local13.anInt691 / 2);
							if (this.anInt1035 > -1) {
								if (local70 == 1) {
									this.anInt1036 -= 20;
								}
								if (local70 == 2) {
									this.anInt1035 -= 15;
									this.anInt1036 -= 10;
								}
								if (local70 == 3) {
									this.anInt1035 += 15;
									this.anInt1036 -= 10;
								}
								this.aClass3_Sub1_Sub2_Sub4Array9[local13.anIntArray177[local70]].method533(this.anInt1035 - 12, this.anInt1036 - 12);
								this.aClass3_Sub1_Sub2_Sub1_2.method45(this.anInt1036 + 4, String.valueOf(local13.anIntArray176[local70]), this.anInt1035, 0);
								this.aClass3_Sub1_Sub2_Sub1_2.method45(this.anInt1036 + 3, String.valueOf(local13.anIntArray176[local70]), this.anInt1035 - 1, 16777215);
							}
						}
					}
				}
			}
			anInt968++;
			@Pc(641) int local641;
			if (anInt968 > 1667) {
				anInt968 = 0;
				this.aClass3_Sub1_Sub4_7.method447(33);
				this.aClass3_Sub1_Sub4_7.method448(0);
				local641 = this.aClass3_Sub1_Sub4_7.anInt666;
				this.aClass3_Sub1_Sub4_7.method449((int) (Math.random() * 65536.0D));
				this.aClass3_Sub1_Sub4_7.method449(56176);
				this.aClass3_Sub1_Sub4_7.method449(44384);
				this.aClass3_Sub1_Sub4_7.method448((int) (Math.random() * 256.0D));
				this.aClass3_Sub1_Sub4_7.method448((int) (Math.random() * 256.0D));
				this.aClass3_Sub1_Sub4_7.method449(5941);
				this.aClass3_Sub1_Sub4_7.method448((int) (Math.random() * 256.0D));
				this.aClass3_Sub1_Sub4_7.method448(94);
				this.aClass3_Sub1_Sub4_7.method448((int) (Math.random() * 256.0D));
				this.aClass3_Sub1_Sub4_7.method448(244);
				this.aClass3_Sub1_Sub4_7.method457(this.aClass3_Sub1_Sub4_7.anInt666 - local641);
			}
			for (local641 = 0; local641 < this.anInt974; local641++) {
				local70 = this.anIntArray249[local641];
				@Pc(719) int local719 = this.anIntArray250[local641];
				@Pc(724) int local724 = this.anIntArray252[local641];
				@Pc(729) int local729 = this.anIntArray251[local641];
				@Pc(731) boolean local731 = true;
				while (local731) {
					local731 = false;
					for (@Pc(737) int local737 = 0; local737 < local641; local737++) {
						if (local719 + 2 > this.anIntArray250[local737] - this.anIntArray251[local737] && local719 - local729 < this.anIntArray250[local737] + 2 && local70 - local724 < this.anIntArray249[local737] + this.anIntArray252[local737] && local70 + local724 > this.anIntArray249[local737] - this.anIntArray252[local737] && this.anIntArray250[local737] - this.anIntArray251[local737] < local719) {
							local719 = this.anIntArray250[local737] - this.anIntArray251[local737];
							local731 = true;
						}
					}
				}
				this.anInt1035 = this.anIntArray249[local641];
				this.anInt1036 = this.anIntArray250[local641] = local719;
				@Pc(836) String local836 = this.aStringArray12[local641];
				if (this.anInt1038 == 0) {
					@Pc(841) int local841 = 16776960;
					if (this.anIntArray253[local641] < 6) {
						local841 = this.anIntArray267[this.anIntArray253[local641]];
					}
					if (this.anIntArray253[local641] == 6) {
						local841 = this.anInt937 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray253[local641] == 7) {
						local841 = this.anInt937 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray253[local641] == 8) {
						local841 = this.anInt937 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(916) int local916;
					if (this.anIntArray253[local641] == 9) {
						local916 = 150 - this.anIntArray255[local641];
						if (local916 < 50) {
							local841 = local916 * 1280 + 16711680;
						} else if (local916 < 100) {
							local841 = 16776960 - (local916 - 50) * 327680;
						} else if (local916 < 150) {
							local841 = (local916 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray253[local641] == 10) {
						local916 = 150 - this.anIntArray255[local641];
						if (local916 < 50) {
							local841 = local916 * 5 + 16711680;
						} else if (local916 < 100) {
							local841 = 16711935 - (local916 - 50) * 327680;
						} else if (local916 < 150) {
							local841 = (local916 - 100) * 327680 + 255 - (local916 - 100) * 5;
						}
					}
					if (this.anIntArray253[local641] == 11) {
						local916 = 150 - this.anIntArray255[local641];
						if (local916 < 50) {
							local841 = 16777215 - local916 * 327685;
						} else if (local916 < 100) {
							local841 = (local916 - 50) * 327685 + 65280;
						} else if (local916 < 150) {
							local841 = 16777215 - (local916 - 100) * 327680;
						}
					}
					if (this.anIntArray254[local641] == 0) {
						this.aClass3_Sub1_Sub2_Sub1_4.method45(this.anInt1036 + 1, local836, this.anInt1035, 0);
						this.aClass3_Sub1_Sub2_Sub1_4.method45(this.anInt1036, local836, this.anInt1035, local841);
					}
					if (this.anIntArray254[local641] == 1) {
						this.aClass3_Sub1_Sub2_Sub1_4.method50(local836, 0, this.anInt1035, this.anInt937, this.anInt1036 + 1);
						this.aClass3_Sub1_Sub2_Sub1_4.method50(local836, local841, this.anInt1035, this.anInt937, this.anInt1036);
					}
					if (this.anIntArray254[local641] == 2) {
						this.aClass3_Sub1_Sub2_Sub1_4.method51(this.anInt1035, this.anInt937, 0, this.anInt1036 + 1, local836);
						this.aClass3_Sub1_Sub2_Sub1_4.method51(this.anInt1035, this.anInt937, local841, this.anInt1036, local836);
					}
					if (this.anIntArray254[local641] == 3) {
						this.aClass3_Sub1_Sub2_Sub1_4.method52(this.anInt937, this.anInt1036 + 1, 0, 150 - this.anIntArray255[local641], local836, this.anInt1035);
						this.aClass3_Sub1_Sub2_Sub1_4.method52(this.anInt937, this.anInt1036, local841, 150 - this.anIntArray255[local641], local836, this.anInt1035);
					}
					@Pc(1213) int local1213;
					if (this.anIntArray254[local641] == 4) {
						local916 = this.aClass3_Sub1_Sub2_Sub1_4.method48(local836);
						local1213 = (150 - this.anIntArray255[local641]) * (local916 + 100) / 150;
						Class3_Sub1_Sub2.method518(334, this.anInt1035 - 50, this.anInt1035 + 50, 0);
						this.aClass3_Sub1_Sub2_Sub1_4.method49(this.anInt1035 + 50 - local1213, 0, local836, this.anInt1036 + 1, this.anInt969);
						this.aClass3_Sub1_Sub2_Sub1_4.method49(this.anInt1035 + 50 - local1213, local841, local836, this.anInt1036, this.anInt969);
						Class3_Sub1_Sub2.method517();
					}
					if (this.anIntArray254[local641] == 5) {
						local916 = 150 - this.anIntArray255[local641];
						local1213 = 0;
						if (local916 < 25) {
							local1213 = local916 - 25;
						} else if (local916 > 125) {
							local1213 = local916 - 125;
						}
						Class3_Sub1_Sub2.method518(this.anInt1036 + 5, 0, 512, this.anInt1036 - this.aClass3_Sub1_Sub2_Sub1_4.anInt66 - 1);
						this.aClass3_Sub1_Sub2_Sub1_4.method45(this.anInt1036 + local1213 + 1, local836, this.anInt1035, 0);
						this.aClass3_Sub1_Sub2_Sub1_4.method45(this.anInt1036 + local1213, local836, this.anInt1035, local841);
						Class3_Sub1_Sub2.method517();
					}
				} else {
					this.aClass3_Sub1_Sub2_Sub1_4.method45(this.anInt1036 + 1, local836, this.anInt1035, 0);
					this.aClass3_Sub1_Sub2_Sub1_4.method45(this.anInt1036, local836, this.anInt1035, 16776960);
				}
			}
		} catch (@Pc(1365) RuntimeException local1365) {
			signlink.reporterror("84216, " + 0 + ", " + local1365.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method654(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean233) {
			if (this.aSocket3 != null) {
				try {
					this.aSocket3.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket3 = null;
			}
			this.aSocket3 = this.method621(43595);
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

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!QQMJEFXK;)V")
	private void method655(@OriginalArg(1) Class32 arg0) {
		try {
			@Pc(9) int local9 = arg0.anInt430;
			@Pc(65) int local65;
			if ((local9 < 1 || local9 > 100) && (local9 < 701 || local9 > 800)) {
				if (local9 >= 101 && local9 <= 200 || !(local9 < 801 || local9 > 900)) {
					local65 = this.anInt907;
					if (this.anInt908 != 2) {
						local65 = 0;
					}
					if (local9 > 800) {
						local9 -= 701;
					} else {
						local9 -= 101;
					}
					if (local9 >= local65) {
						arg0.aString9 = "";
						arg0.anInt421 = 0;
					} else {
						if (this.anIntArray260[local9] == 0) {
							arg0.aString9 = "@red@Offline";
						} else if (this.anIntArray260[local9] < 200) {
							if (this.anIntArray260[local9] == anInt864) {
								arg0.aString9 = "@gre@World" + (this.anIntArray260[local9] - 9);
							} else {
								arg0.aString9 = "@yel@World" + (this.anIntArray260[local9] - 9);
							}
						} else if (this.anIntArray260[local9] == anInt864) {
							arg0.aString9 = "@gre@Classic" + (this.anIntArray260[local9] - 219);
						} else {
							arg0.aString9 = "@yel@Classic" + (this.anIntArray260[local9] - 219);
						}
						arg0.anInt421 = 1;
					}
				} else if (local9 == 203) {
					local65 = this.anInt907;
					if (this.anInt908 != 2) {
						local65 = 0;
					}
					arg0.anInt417 = local65 * 15 + 20;
					if (arg0.anInt417 <= arg0.anInt441) {
						arg0.anInt417 = arg0.anInt441 + 1;
					}
				} else if (local9 >= 401 && local9 <= 500) {
					local9 -= 401;
					if (local9 == 0 && this.anInt908 == 0) {
						arg0.aString9 = "Loading ignore list";
						arg0.anInt421 = 0;
					} else if (local9 == 1 && this.anInt908 == 0) {
						arg0.aString9 = "Please wait...";
						arg0.anInt421 = 0;
					} else {
						local65 = this.anInt1046;
						if (this.anInt908 == 0) {
							local65 = 0;
						}
						if (local9 >= local65) {
							arg0.aString9 = "";
							arg0.anInt421 = 0;
						} else {
							arg0.aString9 = Class15.method202(Class15.method199(this.aLongArray4[local9]));
							arg0.anInt421 = 1;
						}
					}
				} else if (local9 == 503) {
					arg0.anInt417 = this.anInt1046 * 15 + 20;
					if (arg0.anInt417 <= arg0.anInt441) {
						arg0.anInt417 = arg0.anInt441 + 1;
					}
				} else if (local9 == 327) {
					arg0.anInt419 = 150;
					arg0.anInt420 = (int) (Math.sin((double) anInt919 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean212) {
						for (local65 = 0; local65 < 7; local65++) {
							@Pc(378) int local378 = this.anIntArray220[local65];
							if (local378 >= 0 && !Class36.aClass36Array1[local378].method344()) {
								return;
							}
						}
						this.aBoolean212 = false;
						@Pc(397) Class3_Sub1_Sub1_Sub5[] local397 = new Class3_Sub1_Sub1_Sub5[7];
						@Pc(399) int local399 = 0;
						for (@Pc(401) int local401 = 0; local401 < 7; local401++) {
							@Pc(408) int local408 = this.anIntArray220[local401];
							if (local408 >= 0) {
								local397[local399++] = Class36.aClass36Array1[local408].method345();
							}
						}
						@Pc(430) Class3_Sub1_Sub1_Sub5 local430 = new Class3_Sub1_Sub1_Sub5(local399, local397, 0);
						for (@Pc(432) int local432 = 0; local432 < 5; local432++) {
							if (this.anIntArray243[local432] != 0) {
								local430.method410(anIntArrayArray22[local432][0], anIntArrayArray22[local432][this.anIntArray243[local432]]);
								if (local432 == 1) {
									local430.method410(anIntArray264[0], anIntArray264[this.anIntArray243[local432]]);
								}
							}
						}
						local430.method403(956);
						local430.method404(936, Class30.aClass30Array1[aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt689].anIntArray90[0]);
						local430.method413(64, 850, -30, -50, -30, true);
						arg0.anInt413 = 5;
						arg0.anInt414 = 0;
						Class32.method324(local430);
					}
				} else if (local9 == 324) {
					if (this.aClass3_Sub1_Sub2_Sub4_5 == null) {
						this.aClass3_Sub1_Sub2_Sub4_5 = arg0.aClass3_Sub1_Sub2_Sub4_1;
						this.aClass3_Sub1_Sub2_Sub4_6 = arg0.aClass3_Sub1_Sub2_Sub4_2;
					}
					if (this.aBoolean235) {
						arg0.aClass3_Sub1_Sub2_Sub4_1 = this.aClass3_Sub1_Sub2_Sub4_6;
					} else {
						arg0.aClass3_Sub1_Sub2_Sub4_1 = this.aClass3_Sub1_Sub2_Sub4_5;
					}
				} else if (local9 == 325) {
					if (this.aClass3_Sub1_Sub2_Sub4_5 == null) {
						this.aClass3_Sub1_Sub2_Sub4_5 = arg0.aClass3_Sub1_Sub2_Sub4_1;
						this.aClass3_Sub1_Sub2_Sub4_6 = arg0.aClass3_Sub1_Sub2_Sub4_2;
					}
					if (this.aBoolean235) {
						arg0.aClass3_Sub1_Sub2_Sub4_1 = this.aClass3_Sub1_Sub2_Sub4_5;
					} else {
						arg0.aClass3_Sub1_Sub2_Sub4_1 = this.aClass3_Sub1_Sub2_Sub4_6;
					}
				} else if (local9 == 600) {
					arg0.aString9 = this.aString18;
					if (anInt919 % 20 < 10) {
						arg0.aString9 = arg0.aString9 + "|";
					} else {
						arg0.aString9 = arg0.aString9 + " ";
					}
				} else {
					if (local9 == 620) {
						if (this.anInt815 < 1) {
							arg0.aString9 = "";
						} else if (this.aBoolean213) {
							arg0.anInt446 = 16711680;
							arg0.aString9 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg0.anInt446 = 16777215;
							arg0.aString9 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(637) String local637;
					if (local9 == 660) {
						local65 = this.anInt843 - this.anInt885;
						if (local65 <= 0) {
							local637 = "earlier today";
						} else if (local65 == 1) {
							local637 = "yesterday";
						} else {
							local637 = local65 + " days ago";
						}
						arg0.aString9 = "You last logged in @red@" + local637 + "@bla@ from: @red@" + signlink.dns;
					}
					if (local9 == 661) {
						if (this.anInt1025 == 0) {
							arg0.aString9 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
						} else if (this.anInt1025 <= this.anInt843) {
							arg0.aString9 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method656(this.anInt1025);
						} else {
							local65 = this.anInt843 + 14 - this.anInt1025;
							if (local65 <= 0) {
								local637 = "Earlier today";
							} else if (local65 == 1) {
								local637 = "Yesterday";
							} else {
								local637 = local65 + " days ago";
							}
							arg0.aString9 = local637 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method656(this.anInt1025) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
						}
					}
					if (local9 == 662) {
						@Pc(755) String local755;
						if (this.anInt1015 == 0) {
							local755 = "@yel@0 unread messages";
						} else if (this.anInt1015 == 1) {
							local755 = "@gre@1 unread message";
						} else {
							local755 = "@gre@" + this.anInt1015 + " unread messages";
						}
						arg0.aString9 = "You have " + local755 + "\\nin your message centre.";
					}
					if (local9 == 663) {
						if (this.anInt921 > 0 && this.anInt921 <= this.anInt843 + 10) {
							arg0.aString9 = "Last password change:\\n@gre@" + this.method656(this.anInt921);
						} else {
							arg0.aString9 = "Last password change:\\n@gre@Never changed";
						}
					}
					if (local9 == 665) {
						if (this.anInt903 > 2 && !aBoolean202) {
							arg0.aString9 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
						} else if (this.anInt903 > 2) {
							arg0.aString9 = "\\n\\nYou have @gre@" + this.anInt903 + "@yel@ days of\\nmember credit remaining.";
						} else if (this.anInt903 > 0) {
							arg0.aString9 = "You have @gre@" + this.anInt903 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
						} else {
							arg0.aString9 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
						}
					}
					if (local9 == 667) {
						if (this.anInt903 > 2 && !aBoolean202) {
							arg0.aString9 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
						} else if (this.anInt903 > 0) {
							arg0.aString9 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
						} else {
							arg0.aString9 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
						}
					}
					if (local9 == 668) {
						if (this.anInt1025 > this.anInt843) {
							arg0.aString9 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
						} else {
							arg0.aString9 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
						}
					}
				}
			} else if (local9 == 1 && this.anInt908 == 0) {
				arg0.aString9 = "Loading friend list";
				arg0.anInt421 = 0;
			} else if (local9 == 1 && this.anInt908 == 1) {
				arg0.aString9 = "Connecting to friendserver";
				arg0.anInt421 = 0;
			} else if (local9 == 2 && this.anInt908 != 2) {
				arg0.aString9 = "Please wait...";
				arg0.anInt421 = 0;
			} else {
				local65 = this.anInt907;
				if (this.anInt908 != 2) {
					local65 = 0;
				}
				if (local9 > 700) {
					local9 -= 601;
				} else {
					local9--;
				}
				if (local9 >= local65) {
					arg0.aString9 = "";
					arg0.anInt421 = 0;
				} else {
					arg0.aString9 = this.aStringArray14[local9];
					arg0.anInt421 = 1;
				}
			}
		} catch (@Pc(912) RuntimeException local912) {
			signlink.reporterror("88124, " + -44119 + ", " + arg0 + ", " + local912.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	private String method656(@OriginalArg(0) int arg0) {
		try {
			if (arg0 > this.anInt843 + 10) {
				return "Unknown";
			}
			@Pc(14) long local14 = ((long) arg0 + 11745L) * 86400000L;
			@Pc(16) Calendar local16 = Calendar.getInstance();
			local16.setTime(new Date(local14));
			@Pc(26) int local26 = local16.get(5);
			@Pc(30) int local30 = local16.get(2);
			@Pc(40) int local40 = local16.get(1);
			@Pc(91) String[] local91 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
			return local26 + "-" + local91[local30] + "-" + local40;
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("34000, " + arg0 + ", " + false + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method657() {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt929; local3++) {
				if (local3 == -1) {
					local11 = this.anInt928;
				} else {
					local11 = this.anIntArray238[local3];
				}
				@Pc(23) Class3_Sub1_Sub1_Sub4_Sub2 local23 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local11];
				if (local23 != null && local23.anInt735 > 0) {
					local23.anInt735--;
					if (local23.anInt735 == 0) {
						local23.aString15 = null;
					}
				}
			}
			for (local11 = 0; local11 < this.anInt1011; local11++) {
				@Pc(54) int local54 = this.anIntArray263[local11];
				@Pc(59) Class3_Sub1_Sub1_Sub4_Sub1 local59 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local54];
				if (local59 != null && local59.anInt735 > 0) {
					local59.anInt735--;
					if (local59.anInt735 == 0) {
						local59.aString15 = null;
					}
				}
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("11884, " + -972 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method658() {
		try {
			if (this.anInt886 != 0) {
				@Pc(6) Class3_Sub1_Sub2_Sub1 local6 = this.aClass3_Sub1_Sub2_Sub1_3;
				@Pc(8) int local8 = 0;
				if (this.anInt996 != 0) {
					local8 = 1;
				}
				for (@Pc(15) int local15 = 0; local15 < 100; local15++) {
					if (this.aStringArray11[local15] != null) {
						@Pc(27) int local27 = this.anIntArray248[local15];
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
						if ((local27 == 3 || local27 == 7) && (local27 == 7 || this.anInt935 == 0 || this.anInt935 == 1 && this.method590(local32, (byte) 5))) {
							local85 = 329 - local8 * 13;
							local6.method49(4, 0, "From", local85, this.anInt969);
							local6.method49(4, 65535, "From", local85 - 1, this.anInt969);
							@Pc(113) int local113 = local6.method47(this.anInt1021, "From ") + 4;
							if (local34 == 1) {
								this.aClass3_Sub1_Sub2_Sub3Array2[0].method369(local113, local85 - 12);
								local113 += 14;
							}
							if (local34 == 2) {
								this.aClass3_Sub1_Sub2_Sub3Array2[1].method369(local113, local85 - 12);
								local113 += 14;
							}
							local6.method49(local113, 0, local32 + ": " + this.aStringArray11[local15], local85, this.anInt969);
							local6.method49(local113, 65535, local32 + ": " + this.aStringArray11[local15], local85 - 1, this.anInt969);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local27 == 5 && this.anInt935 < 2) {
							local85 = 329 - local8 * 13;
							local6.method49(4, 0, this.aStringArray11[local15], local85, this.anInt969);
							local6.method49(4, 65535, this.aStringArray11[local15], local85 - 1, this.anInt969);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local27 == 6 && this.anInt935 < 2) {
							local85 = 329 - local8 * 13;
							local6.method49(4, 0, "To " + local32 + ": " + this.aStringArray11[local15], local85, this.anInt969);
							local6.method49(4, 65535, "To " + local32 + ": " + this.aStringArray11[local15], local85 - 1, this.anInt969);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(303) RuntimeException local303) {
			signlink.reporterror("62932, " + 0 + ", " + local303.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method580() {
		this.method587(20, "Starting up");
		if (signlink.sunjava) {
			super.anInt798 = 5;
		}
		if (aBoolean224) {
			this.aBoolean198 = true;
			return;
		}
		aBoolean224 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method692();
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
			this.aBoolean234 = true;
			return;
		}
		if (signlink.aRandomAccessFile3 != null) {
			for (@Pc(107) int local107 = 0; local107 < 5; local107++) {
				this.aClass38Array1[local107] = new Class38(signlink.aRandomAccessFile3, 0, signlink.aRandomAccessFileArray1[local107], 600000, local107 + 1);
			}
		}
		try {
			this.method679();
			this.aClass35_2 = this.method666("title", this.anIntArray266[1], 1, "title screen", 25);
			this.aClass3_Sub1_Sub2_Sub1_2 = new Class3_Sub1_Sub2_Sub1("p11_full", this.aClass35_2, (byte) -104, false);
			this.aClass3_Sub1_Sub2_Sub1_3 = new Class3_Sub1_Sub2_Sub1("p12_full", this.aClass35_2, (byte) -104, false);
			this.aClass3_Sub1_Sub2_Sub1_4 = new Class3_Sub1_Sub2_Sub1("b12_full", this.aClass35_2, (byte) -104, false);
			this.aClass3_Sub1_Sub2_Sub1_5 = new Class3_Sub1_Sub2_Sub1("q8_full", this.aClass35_2, (byte) -104, true);
			this.method707();
			this.method615();
			@Pc(203) Class35 local203 = this.method666("config", this.anIntArray266[2], 2, "config", 30);
			@Pc(215) Class35 local215 = this.method666("interface", this.anIntArray266[3], 3, "interface", 35);
			@Pc(227) Class35 local227 = this.method666("media", this.anIntArray266[4], 4, "2d graphics", 40);
			@Pc(239) Class35 local239 = this.method666("textures", this.anIntArray266[6], 6, "textures", 45);
			@Pc(251) Class35 local251 = this.method666("wordenc", this.anIntArray266[7], 7, "chat system", 50);
			@Pc(263) Class35 local263 = this.method666("sounds", this.anIntArray266[8], 8, "sound effects", 55);
			this.aByteArrayArrayArray8 = new byte[4][104][104];
			this.anIntArrayArrayArray8 = new int[4][105][105];
			this.aClass25_1 = new Class25(104, -954, this.anIntArrayArrayArray8, 4, 104);
			for (@Pc(288) int local288 = 0; local288 < 4; local288++) {
				this.aClass11Array1[local288] = new Class11(104, 32, 104);
			}
			this.aClass3_Sub1_Sub2_Sub4_13 = new Class3_Sub1_Sub2_Sub4(512, 512);
			@Pc(323) Class35 local323 = this.method666("versionlist", this.anIntArray266[5], 5, "update list", 60);
			this.method587(60, "Connecting to update server");
			this.aClass16_Sub1_1 = new Class16_Sub1();
			this.aClass16_Sub1_1.method214(local323, this);
			Class5.method60(this.aClass16_Sub1_1.method224());
			Class3_Sub1_Sub1_Sub5.method393(this.aClass16_Sub1_1.method206(0), this.aClass16_Sub1_1);
			if (!aBoolean203) {
				this.anInt819 = 0;
				this.aBoolean196 = true;
				this.aClass16_Sub1_1.method222(2, this.anInt819);
				while (this.aClass16_Sub1_1.method210() > 0) {
					this.method607(anInt1010);
					try {
						Thread.sleep(100L);
					} catch (@Pc(374) Exception local374) {
					}
					if (this.aClass16_Sub1_1.anInt222 > 3) {
						this.method604("ondemand");
						return;
					}
				}
			}
			this.method587(65, "Requesting animations");
			@Pc(398) int local398 = this.aClass16_Sub1_1.method206(1);
			for (@Pc(400) int local400 = 0; local400 < local398; local400++) {
				this.aClass16_Sub1_1.method222(1, local400);
			}
			@Pc(419) int local419;
			while (this.aClass16_Sub1_1.method210() > 0) {
				local419 = local398 - this.aClass16_Sub1_1.method210();
				if (local419 > 0) {
					this.method587(65, "Loading animations - " + local419 * 100 / local398 + "%");
				}
				this.method607(anInt1010);
				try {
					Thread.sleep(100L);
				} catch (@Pc(445) Exception local445) {
				}
				if (this.aClass16_Sub1_1.anInt222 > 3) {
					this.method604("ondemand");
					return;
				}
			}
			this.method587(70, "Requesting models");
			local398 = this.aClass16_Sub1_1.method206(0);
			@Pc(479) int local479;
			for (local419 = 0; local419 < local398; local419++) {
				local479 = this.aClass16_Sub1_1.method208(local419);
				if ((local479 & 0x1) != 0) {
					this.aClass16_Sub1_1.method222(0, local419);
				}
			}
			local398 = this.aClass16_Sub1_1.method210();
			while (this.aClass16_Sub1_1.method210() > 0) {
				local479 = local398 - this.aClass16_Sub1_1.method210();
				if (local479 > 0) {
					this.method587(70, "Loading models - " + local479 * 100 / local398 + "%");
				}
				this.method607(anInt1010);
				try {
					Thread.sleep(100L);
				} catch (@Pc(530) Exception local530) {
				}
			}
			if (this.aClass38Array1[0] != null) {
				this.method587(75, "Requesting maps");
				this.aClass16_Sub1_1.method222(3, this.aClass16_Sub1_1.method211(47, 0, 48));
				this.aClass16_Sub1_1.method222(3, this.aClass16_Sub1_1.method211(47, 1, 48));
				this.aClass16_Sub1_1.method222(3, this.aClass16_Sub1_1.method211(48, 0, 48));
				this.aClass16_Sub1_1.method222(3, this.aClass16_Sub1_1.method211(48, 1, 48));
				this.aClass16_Sub1_1.method222(3, this.aClass16_Sub1_1.method211(49, 0, 48));
				this.aClass16_Sub1_1.method222(3, this.aClass16_Sub1_1.method211(49, 1, 48));
				this.aClass16_Sub1_1.method222(3, this.aClass16_Sub1_1.method211(47, 0, 47));
				this.aClass16_Sub1_1.method222(3, this.aClass16_Sub1_1.method211(47, 1, 47));
				this.aClass16_Sub1_1.method222(3, this.aClass16_Sub1_1.method211(48, 0, 47));
				this.aClass16_Sub1_1.method222(3, this.aClass16_Sub1_1.method211(48, 1, 47));
				this.aClass16_Sub1_1.method222(3, this.aClass16_Sub1_1.method211(48, 0, 148));
				this.aClass16_Sub1_1.method222(3, this.aClass16_Sub1_1.method211(48, 1, 148));
				local398 = this.aClass16_Sub1_1.method210();
				while (this.aClass16_Sub1_1.method210() > 0) {
					local479 = local398 - this.aClass16_Sub1_1.method210();
					if (local479 > 0) {
						this.method587(75, "Loading maps - " + local479 * 100 / local398 + "%");
					}
					this.method607(anInt1010);
					try {
						Thread.sleep(100L);
					} catch (@Pc(715) Exception local715) {
					}
				}
			}
			local398 = this.aClass16_Sub1_1.method206(0);
			@Pc(736) int local736;
			for (local479 = 0; local479 < local398; local479++) {
				local736 = this.aClass16_Sub1_1.method208(local479);
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
					this.aClass16_Sub1_1.method219(local479, 0, local738);
				}
			}
			this.aClass16_Sub1_1.method207(aBoolean202);
			if (!aBoolean203) {
				local398 = this.aClass16_Sub1_1.method206(2);
				for (local736 = 1; local736 < local398; local736++) {
					if (this.aClass16_Sub1_1.method212(local736)) {
						this.aClass16_Sub1_1.method219(local736, 2, (byte) 1);
					}
				}
			}
			local398 = this.aClass16_Sub1_1.method206(0);
			@Pc(861) int local861;
			for (local736 = 0; local736 < local398; local736++) {
				local861 = this.aClass16_Sub1_1.method208(local736);
				if (local861 == 0 && this.aClass16_Sub1_1.anInt219 < 200) {
					this.aClass16_Sub1_1.method219(local736, 0, (byte) 1);
				}
			}
			this.method587(80, "Unpacking media");
			this.aClass3_Sub1_Sub2_Sub3_18 = new Class3_Sub1_Sub2_Sub3(local227, "invback", 0);
			this.aClass3_Sub1_Sub2_Sub3_20 = new Class3_Sub1_Sub2_Sub3(local227, "chatback", 0);
			this.aClass3_Sub1_Sub2_Sub3_19 = new Class3_Sub1_Sub2_Sub3(local227, "mapback", 0);
			this.aClass3_Sub1_Sub2_Sub3_10 = new Class3_Sub1_Sub2_Sub3(local227, "backbase1", 0);
			this.aClass3_Sub1_Sub2_Sub3_11 = new Class3_Sub1_Sub2_Sub3(local227, "backbase2", 0);
			this.aClass3_Sub1_Sub2_Sub3_12 = new Class3_Sub1_Sub2_Sub3(local227, "backhmid1", 0);
			for (local861 = 0; local861 < 13; local861++) {
				this.aClass3_Sub1_Sub2_Sub3Array4[local861] = new Class3_Sub1_Sub2_Sub3(local227, "sideicons", local861);
			}
			this.aClass3_Sub1_Sub2_Sub4_15 = new Class3_Sub1_Sub2_Sub4(local227, "compass", 0);
			this.aClass3_Sub1_Sub2_Sub4_14 = new Class3_Sub1_Sub2_Sub4(local227, "mapedge", 0);
			this.aClass3_Sub1_Sub2_Sub4_14.method530();
			for (@Pc(972) int local972 = 0; local972 < 72; local972++) {
				this.aClass3_Sub1_Sub2_Sub3Array3[local972] = new Class3_Sub1_Sub2_Sub3(local227, "mapscene", local972);
			}
			for (@Pc(990) int local990 = 0; local990 < 70; local990++) {
				this.aClass3_Sub1_Sub2_Sub4Array10[local990] = new Class3_Sub1_Sub2_Sub4(local227, "mapfunction", local990);
			}
			for (@Pc(1008) int local1008 = 0; local1008 < 5; local1008++) {
				this.aClass3_Sub1_Sub2_Sub4Array9[local1008] = new Class3_Sub1_Sub2_Sub4(local227, "hitmarks", local1008);
			}
			for (@Pc(1026) int local1026 = 0; local1026 < 6; local1026++) {
				this.aClass3_Sub1_Sub2_Sub4Array5[local1026] = new Class3_Sub1_Sub2_Sub4(local227, "headicons_pk", local1026);
			}
			for (@Pc(1044) int local1044 = 0; local1044 < 9; local1044++) {
				this.aClass3_Sub1_Sub2_Sub4Array4[local1044] = new Class3_Sub1_Sub2_Sub4(local227, "headicons_prayer", local1044);
			}
			for (@Pc(1062) int local1062 = 0; local1062 < 6; local1062++) {
				this.aClass3_Sub1_Sub2_Sub4Array7[local1062] = new Class3_Sub1_Sub2_Sub4(local227, "headicons_hint", local1062);
			}
			this.aClass3_Sub1_Sub2_Sub4_7 = new Class3_Sub1_Sub2_Sub4(local227, "overlay_multiway", 0);
			this.aClass3_Sub1_Sub2_Sub4_16 = new Class3_Sub1_Sub2_Sub4(local227, "mapmarker", 0);
			this.aClass3_Sub1_Sub2_Sub4_17 = new Class3_Sub1_Sub2_Sub4(local227, "mapmarker", 1);
			for (@Pc(1104) int local1104 = 0; local1104 < 8; local1104++) {
				this.aClass3_Sub1_Sub2_Sub4Array8[local1104] = new Class3_Sub1_Sub2_Sub4(local227, "cross", local1104);
			}
			this.aClass3_Sub1_Sub2_Sub4_8 = new Class3_Sub1_Sub2_Sub4(local227, "mapdots", 0);
			this.aClass3_Sub1_Sub2_Sub4_9 = new Class3_Sub1_Sub2_Sub4(local227, "mapdots", 1);
			this.aClass3_Sub1_Sub2_Sub4_10 = new Class3_Sub1_Sub2_Sub4(local227, "mapdots", 2);
			this.aClass3_Sub1_Sub2_Sub4_11 = new Class3_Sub1_Sub2_Sub4(local227, "mapdots", 3);
			this.aClass3_Sub1_Sub2_Sub4_12 = new Class3_Sub1_Sub2_Sub4(local227, "mapdots", 4);
			this.aClass3_Sub1_Sub2_Sub3_8 = new Class3_Sub1_Sub2_Sub3(local227, "scrollbar", 0);
			this.aClass3_Sub1_Sub2_Sub3_9 = new Class3_Sub1_Sub2_Sub3(local227, "scrollbar", 1);
			this.aClass3_Sub1_Sub2_Sub3_13 = new Class3_Sub1_Sub2_Sub3(local227, "redstone1", 0);
			this.aClass3_Sub1_Sub2_Sub3_14 = new Class3_Sub1_Sub2_Sub3(local227, "redstone2", 0);
			this.aClass3_Sub1_Sub2_Sub3_15 = new Class3_Sub1_Sub2_Sub3(local227, "redstone3", 0);
			this.aClass3_Sub1_Sub2_Sub3_16 = new Class3_Sub1_Sub2_Sub3(local227, "redstone1", 0);
			this.aClass3_Sub1_Sub2_Sub3_16.method366(aByte37);
			this.aClass3_Sub1_Sub2_Sub3_17 = new Class3_Sub1_Sub2_Sub3(local227, "redstone2", 0);
			this.aClass3_Sub1_Sub2_Sub3_17.method366(aByte37);
			this.aClass3_Sub1_Sub2_Sub3_3 = new Class3_Sub1_Sub2_Sub3(local227, "redstone1", 0);
			this.aClass3_Sub1_Sub2_Sub3_3.method367();
			this.aClass3_Sub1_Sub2_Sub3_4 = new Class3_Sub1_Sub2_Sub3(local227, "redstone2", 0);
			this.aClass3_Sub1_Sub2_Sub3_4.method367();
			this.aClass3_Sub1_Sub2_Sub3_5 = new Class3_Sub1_Sub2_Sub3(local227, "redstone3", 0);
			this.aClass3_Sub1_Sub2_Sub3_5.method367();
			this.aClass3_Sub1_Sub2_Sub3_6 = new Class3_Sub1_Sub2_Sub3(local227, "redstone1", 0);
			this.aClass3_Sub1_Sub2_Sub3_6.method366(aByte37);
			this.aClass3_Sub1_Sub2_Sub3_6.method367();
			this.aClass3_Sub1_Sub2_Sub3_7 = new Class3_Sub1_Sub2_Sub3(local227, "redstone2", 0);
			this.aClass3_Sub1_Sub2_Sub3_7.method366(aByte37);
			this.aClass3_Sub1_Sub2_Sub3_7.method367();
			for (@Pc(1294) int local1294 = 0; local1294 < 2; local1294++) {
				this.aClass3_Sub1_Sub2_Sub3Array2[local1294] = new Class3_Sub1_Sub2_Sub3(local227, "mod_icons", local1294);
			}
			@Pc(1317) Class3_Sub1_Sub2_Sub4 local1317 = new Class3_Sub1_Sub2_Sub4(local227, "backleft1", 0);
			this.aClass13_16 = new Class13(3, local1317.anInt771, local1317.anInt770, this.method585());
			local1317.method531(0, 0);
			@Pc(1342) Class3_Sub1_Sub2_Sub4 local1342 = new Class3_Sub1_Sub2_Sub4(local227, "backleft2", 0);
			this.aClass13_17 = new Class13(3, local1342.anInt771, local1342.anInt770, this.method585());
			local1342.method531(0, 0);
			@Pc(1367) Class3_Sub1_Sub2_Sub4 local1367 = new Class3_Sub1_Sub2_Sub4(local227, "backright1", 0);
			this.aClass13_18 = new Class13(3, local1367.anInt771, local1367.anInt770, this.method585());
			local1367.method531(0, 0);
			@Pc(1392) Class3_Sub1_Sub2_Sub4 local1392 = new Class3_Sub1_Sub2_Sub4(local227, "backright2", 0);
			this.aClass13_19 = new Class13(3, local1392.anInt771, local1392.anInt770, this.method585());
			local1392.method531(0, 0);
			@Pc(1417) Class3_Sub1_Sub2_Sub4 local1417 = new Class3_Sub1_Sub2_Sub4(local227, "backtop1", 0);
			this.aClass13_20 = new Class13(3, local1417.anInt771, local1417.anInt770, this.method585());
			local1417.method531(0, 0);
			@Pc(1442) Class3_Sub1_Sub2_Sub4 local1442 = new Class3_Sub1_Sub2_Sub4(local227, "backvmid1", 0);
			this.aClass13_21 = new Class13(3, local1442.anInt771, local1442.anInt770, this.method585());
			local1442.method531(0, 0);
			@Pc(1467) Class3_Sub1_Sub2_Sub4 local1467 = new Class3_Sub1_Sub2_Sub4(local227, "backvmid2", 0);
			this.aClass13_22 = new Class13(3, local1467.anInt771, local1467.anInt770, this.method585());
			local1467.method531(0, 0);
			@Pc(1492) Class3_Sub1_Sub2_Sub4 local1492 = new Class3_Sub1_Sub2_Sub4(local227, "backvmid3", 0);
			this.aClass13_23 = new Class13(3, local1492.anInt771, local1492.anInt770, this.method585());
			local1492.method531(0, 0);
			@Pc(1517) Class3_Sub1_Sub2_Sub4 local1517 = new Class3_Sub1_Sub2_Sub4(local227, "backhmid2", 0);
			this.aClass13_24 = new Class13(3, local1517.anInt771, local1517.anInt770, this.method585());
			local1517.method531(0, 0);
			@Pc(1542) int local1542 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1549) int local1549 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1556) int local1556 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1563) int local1563 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1565) int local1565 = 0; local1565 < 100; local1565++) {
				if (this.aClass3_Sub1_Sub2_Sub4Array10[local1565] != null) {
					this.aClass3_Sub1_Sub2_Sub4Array10[local1565].method529(local1556 + local1563, local1549 + local1563, local1542 + local1563);
				}
				if (this.aClass3_Sub1_Sub2_Sub3Array3[local1565] != null) {
					this.aClass3_Sub1_Sub2_Sub3Array3[local1565].method368(local1556 + local1563, local1549 + local1563, local1542 + local1563);
				}
			}
			this.method587(83, "Unpacking textures");
			Class3_Sub1_Sub2_Sub2.method103(local239);
			Class3_Sub1_Sub2_Sub2.method107(0.8D);
			Class3_Sub1_Sub2_Sub2.method102();
			this.method587(86, "Unpacking config");
			Class30.method307(local203);
			Class8.method78(local203);
			Class26.method299(local203);
			Class10.method115(local203);
			Class2.method8(local203);
			Class36.method342(local203);
			Class39.method375(local203);
			Class37.method348(local203);
			Class43.method434(local203);
			Class10.aBoolean45 = aBoolean202;
			if (!aBoolean203) {
				this.method587(90, "Unpacking sounds");
				@Pc(1668) byte[] local1668 = local263.method341("sounds.dat", null);
				@Pc(1674) Class3_Sub1_Sub4 local1674 = new Class3_Sub1_Sub4((byte) -58, local1668);
				Class41.method422(local1674);
			}
			this.method587(95, "Unpacking interfaces");
			@Pc(1705) Class3_Sub1_Sub2_Sub1[] local1705 = new Class3_Sub1_Sub2_Sub1[] { this.aClass3_Sub1_Sub2_Sub1_2, this.aClass3_Sub1_Sub2_Sub1_3, this.aClass3_Sub1_Sub2_Sub1_4, this.aClass3_Sub1_Sub2_Sub1_5 };
			Class32.method321(local215, local1705, local227);
			this.method587(100, "Preparing game engine");
			@Pc(1721) int local1721;
			@Pc(1723) int local1723;
			@Pc(1725) int local1725;
			for (@Pc(1717) int local1717 = 0; local1717 < 33; local1717++) {
				local1721 = 999;
				local1723 = 0;
				for (local1725 = 0; local1725 < 34; local1725++) {
					if (this.aClass3_Sub1_Sub2_Sub3_19.aByteArray16[local1725 + local1717 * this.aClass3_Sub1_Sub2_Sub3_19.anInt547] == 0) {
						if (local1721 == 999) {
							local1721 = local1725;
						}
					} else if (local1721 != 999) {
						local1723 = local1725;
						break;
					}
				}
				this.anIntArray276[local1717] = local1721;
				this.anIntArray258[local1717] = local1723 - local1721;
			}
			@Pc(1783) int local1783;
			for (local1721 = 5; local1721 < 156; local1721++) {
				local1723 = 999;
				local1725 = 0;
				for (local1783 = 25; local1783 < 172; local1783++) {
					if (this.aClass3_Sub1_Sub2_Sub3_19.aByteArray16[local1783 + local1721 * this.aClass3_Sub1_Sub2_Sub3_19.anInt547] == 0 && (local1783 > 34 || local1721 > 34)) {
						if (local1723 == 999) {
							local1723 = local1783;
						}
					} else if (local1723 != 999) {
						local1725 = local1783;
						break;
					}
				}
				this.anIntArray261[local1721 - 5] = local1723 - 25;
				this.anIntArray222[local1721 - 5] = local1725 - local1723;
			}
			Class3_Sub1_Sub2_Sub2.method100(503, 765);
			this.anIntArray230 = Class3_Sub1_Sub2_Sub2.anIntArray29;
			Class3_Sub1_Sub2_Sub2.method100(96, 479);
			this.anIntArray227 = Class3_Sub1_Sub2_Sub2.anIntArray29;
			Class3_Sub1_Sub2_Sub2.method100(261, 190);
			this.anIntArray228 = Class3_Sub1_Sub2_Sub2.anIntArray29;
			Class3_Sub1_Sub2_Sub2.method100(334, 512);
			this.anIntArray229 = Class3_Sub1_Sub2_Sub2.anIntArray29;
			@Pc(1874) int[] local1874 = new int[9];
			for (local1725 = 0; local1725 < 9; local1725++) {
				local1783 = local1725 * 32 + 128 + 15;
				@Pc(1892) int local1892 = local1783 * 3 + 600;
				@Pc(1896) int local1896 = Class3_Sub1_Sub2_Sub2.anIntArray27[local1783];
				local1874[local1725] = local1892 * local1896 >> 16;
			}
			Class25.method284(local1874, (byte) 7);
			Class14.method160(local251);
			this.aClass17_1 = new Class17(this, -30992);
			this.method586(this.aClass17_1, 10);
			Class3_Sub1_Sub1_Sub2.aClient4 = this;
			Class8.aClient2 = this;
			Class2.aClient1 = this;
		} catch (@Pc(1937) Exception local1937) {
			signlink.reporterror("loaderror " + this.aString21 + " " + this.anInt1018);
			this.aBoolean223 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(III)V")
	private void method659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(1) int local1 = 0;
			for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
				if (this.aStringArray11[local3] != null) {
					@Pc(15) int local15 = this.anIntArray248[local3];
					@Pc(26) int local26 = this.anInt862 + 70 + 4 - local1 * 14;
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
					if ((local15 == 1 || local15 == 2) && (local15 == 1 || this.anInt964 == 0 || this.anInt964 == 1 && this.method590(local34, (byte) 5))) {
						if (arg1 > local26 - 14 && arg1 <= local26 && !local34.equals(aClass3_Sub1_Sub1_Sub4_Sub2_1.aString16)) {
							if (this.anInt815 >= 1) {
								this.aStringArray13[this.anInt1045] = "Report abuse @whi@" + local34;
								this.anIntArray271[this.anInt1045] = 545;
								this.anInt1045++;
							}
							this.aStringArray13[this.anInt1045] = "Add ignore @whi@" + local34;
							this.anIntArray271[this.anInt1045] = 968;
							this.anInt1045++;
							this.aStringArray13[this.anInt1045] = "Add friend @whi@" + local34;
							this.anIntArray271[this.anInt1045] = 493;
							this.anInt1045++;
						}
						local1++;
					}
					if ((local15 == 3 || local15 == 7) && this.anInt886 == 0 && (local15 == 7 || this.anInt935 == 0 || this.anInt935 == 1 && this.method590(local34, (byte) 5))) {
						if (arg1 > local26 - 14 && arg1 <= local26) {
							if (this.anInt815 >= 1) {
								this.aStringArray13[this.anInt1045] = "Report abuse @whi@" + local34;
								this.anIntArray271[this.anInt1045] = 545;
								this.anInt1045++;
							}
							this.aStringArray13[this.anInt1045] = "Add ignore @whi@" + local34;
							this.anIntArray271[this.anInt1045] = 968;
							this.anInt1045++;
							this.aStringArray13[this.anInt1045] = "Add friend @whi@" + local34;
							this.anIntArray271[this.anInt1045] = 493;
							this.anInt1045++;
						}
						local1++;
					}
					if (local15 == 4 && (this.anInt838 == 0 || this.anInt838 == 1 && this.method590(local34, (byte) 5))) {
						if (arg1 > local26 - 14 && arg1 <= local26) {
							this.aStringArray13[this.anInt1045] = "Accept trade @whi@" + local34;
							this.anIntArray271[this.anInt1045] = 52;
							this.anInt1045++;
						}
						local1++;
					}
					if ((local15 == 5 || local15 == 6) && this.anInt886 == 0 && this.anInt935 < 2) {
						local1++;
					}
					if (local15 == 8 && (this.anInt838 == 0 || this.anInt838 == 1 && this.method590(local34, (byte) 5))) {
						if (arg1 > local26 - 14 && arg1 <= local26) {
							this.aStringArray13[this.anInt1045] = "Accept challenge @whi@" + local34;
							this.anIntArray271[this.anInt1045] = 285;
							this.anInt1045++;
						}
						local1++;
					}
				}
			}
			if (arg2 >= 0) {
				anInt1010 = 381;
			}
		} catch (@Pc(403) RuntimeException local403) {
			signlink.reporterror("41796, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local403.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!QQMJEFXK;IIIIIII)V")
	private void method660(@OriginalArg(1) Class32 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (this.aBoolean217) {
				this.anInt914 = 32;
			} else {
				this.anInt914 = 0;
			}
			this.aBoolean217 = false;
			if (arg4 >= arg7 && arg4 < arg7 + 16 && arg2 >= arg3 && arg2 < arg3 + 16) {
				arg0.anInt440 -= this.anInt1022 * 4;
				if (arg5 == 1) {
					this.aBoolean207 = true;
				}
				if (arg5 == 2 || arg5 == 3) {
					this.aBoolean197 = true;
				}
			} else if (arg4 >= arg7 && arg4 < arg7 + 16 && arg2 >= arg3 + arg1 - 16 && arg2 < arg3 + arg1) {
				arg0.anInt440 += this.anInt1022 * 4;
				if (arg5 == 1) {
					this.aBoolean207 = true;
				}
				if (arg5 == 2 || arg5 == 3) {
					this.aBoolean197 = true;
				}
			} else if (arg4 >= arg7 - this.anInt914 && arg4 < arg7 + this.anInt914 + 16 && arg2 >= arg3 + 16 && arg2 < arg3 + arg1 - 16 && this.anInt1022 > 0) {
				@Pc(139) int local139 = (arg1 - 32) * arg1 / arg6;
				if (local139 < 8) {
					local139 = 8;
				}
				@Pc(154) int local154 = arg2 - arg3 - local139 / 2 - 16;
				@Pc(160) int local160 = arg1 - local139 - 32;
				arg0.anInt440 = (arg6 - arg1) * local154 / local160;
				if (arg5 == 1) {
					this.aBoolean207 = true;
				}
				if (arg5 == 2 || arg5 == 3) {
					this.aBoolean197 = true;
				}
				this.aBoolean217 = true;
			}
		} catch (@Pc(189) RuntimeException local189) {
			signlink.reporterror("50809, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local189.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!WNCFPLWV;II)V")
	private void method661(@OriginalArg(0) Class3_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			arg0.method468(255);
			@Pc(9) int local9 = arg0.method469(8);
			if (arg2 > 0) {
				@Pc(18) int local18;
				if (local9 < this.anInt1011) {
					for (local18 = local9; local18 < this.anInt1011; local18++) {
						this.anIntArray213[this.anInt829++] = this.anIntArray263[local18];
					}
				}
				if (local9 > this.anInt1011) {
					signlink.reporterror(this.aString22 + " Too many npcs");
					throw new RuntimeException("eek");
				}
				this.anInt1011 = 0;
				for (local18 = 0; local18 < local9; local18++) {
					@Pc(70) int local70 = this.anIntArray263[local18];
					@Pc(75) Class3_Sub1_Sub1_Sub4_Sub1 local75 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local70];
					@Pc(80) int local80 = arg0.method469(1);
					if (local80 == 0) {
						this.anIntArray263[this.anInt1011++] = local70;
						local75.anInt715 = anInt919;
					} else {
						@Pc(103) int local103 = arg0.method469(2);
						if (local103 == 0) {
							this.anIntArray263[this.anInt1011++] = local70;
							local75.anInt715 = anInt919;
							this.anIntArray239[this.anInt930++] = local70;
						} else {
							@Pc(154) int local154;
							@Pc(164) int local164;
							if (local103 == 1) {
								this.anIntArray263[this.anInt1011++] = local70;
								local75.anInt715 = anInt919;
								local154 = arg0.method469(3);
								local75.method508(false, local154);
								local164 = arg0.method469(1);
								if (local164 == 1) {
									this.anIntArray239[this.anInt930++] = local70;
								}
							} else if (local103 == 2) {
								this.anIntArray263[this.anInt1011++] = local70;
								local75.anInt715 = anInt919;
								local154 = arg0.method469(3);
								local75.method508(true, local154);
								local164 = arg0.method469(3);
								local75.method508(true, local164);
								@Pc(222) int local222 = arg0.method469(1);
								if (local222 == 1) {
									this.anIntArray239[this.anInt930++] = local70;
								}
							} else if (local103 == 3) {
								this.anIntArray213[this.anInt829++] = local70;
							}
						}
					}
				}
			}
		} catch (@Pc(259) RuntimeException local259) {
			signlink.reporterror("19564, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local259.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method662() {
		try {
			this.anInt841 = 0;
			@Pc(20) int local20 = (aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt728 >> 7) + this.anInt946;
			@Pc(28) int local28 = (aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt729 >> 7) + this.anInt947;
			if (local20 >= 3053 && local20 <= 3156 && local28 >= 3056 && local28 <= 3136) {
				this.anInt841 = 1;
			}
			if (local20 >= 3072 && local20 <= 3118 && local28 >= 9492 && local28 <= 9535) {
				this.anInt841 = 1;
			}
			if (this.anInt841 == 1 && local20 >= 3139 && local20 <= 3199 && local28 >= 3008 && local28 <= 3062) {
				this.anInt841 = 0;
			}
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("47679, " + false + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!WNCFPLWV;II)V")
	private void method663(@OriginalArg(0) Class3_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt829 = 0;
			@Pc(8) int local8 = arg1 + 0;
			this.anInt930 = 0;
			this.method661(arg0, local8, this.anInt1048);
			this.method623(arg0, local8);
			this.method594(arg0, local8);
			@Pc(36) int local36;
			for (@Pc(29) int local29 = 0; local29 < this.anInt829; local29++) {
				local36 = this.anIntArray213[local29];
				if (this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local36].anInt715 != anInt919) {
					this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local36].aClass2_1 = null;
					this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local36] = null;
				}
			}
			if (arg0.anInt666 != local8) {
				signlink.reporterror(this.aString22 + " size mismatch in getnpcpos - pos:" + arg0.anInt666 + " psize:" + local8);
				throw new RuntimeException("eek");
			}
			for (local36 = 0; local36 < this.anInt1011; local36++) {
				if (this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[this.anIntArray263[local36]] == null) {
					signlink.reporterror(this.aString22 + " null entry in npc list - pos:" + local36 + " size:" + this.anInt1011);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("16645, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method664() {
		try {
			this.aClass13_4.method157(this.aBoolean229);
			@Pc(25) int local25;
			@Pc(27) int local27;
			if (this.anInt881 == 2) {
				@Pc(20) byte[] local20 = this.aClass3_Sub1_Sub2_Sub3_19.aByteArray16;
				@Pc(22) int[] local22 = Class3_Sub1_Sub2.anIntArray181;
				local25 = local20.length;
				for (local27 = 0; local27 < local25; local27++) {
					if (local20[local27] == 0) {
						local22[local27] = 0;
					}
				}
				this.aClass3_Sub1_Sub2_Sub4_15.method537(this.anIntArray258, 25, 0, this.anInt858, 256, 0, 33, 33, this.anIntArray276, 25);
				this.aClass13_5.method157(this.aBoolean229);
				Class3_Sub1_Sub2_Sub2.anIntArray29 = this.anIntArray229;
			} else {
				@Pc(75) int local75 = this.anInt858 + this.anInt855 & 0x7FF;
				@Pc(82) int local82 = aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt728 / 32 + 48;
				local25 = 464 - aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt729 / 32;
				this.aClass3_Sub1_Sub2_Sub4_13.method537(this.anIntArray222, local25, 25, local75, this.anInt989 + 256, 5, 146, 151, this.anIntArray261, local82);
				this.aClass3_Sub1_Sub2_Sub4_15.method537(this.anIntArray258, 25, 0, this.anInt858, 256, 0, 33, 33, this.anIntArray276, 25);
				for (local27 = 0; local27 < this.anInt933; local27++) {
					local82 = this.anIntArray240[local27] * 4 + 2 - aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt728 / 32;
					local25 = this.anIntArray241[local27] * 4 + 2 - aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt729 / 32;
					this.method682(local25, local82, this.aClass3_Sub1_Sub2_Sub4Array6[local27]);
				}
				@Pc(177) int local177;
				for (@Pc(173) int local173 = 0; local173 < 104; local173++) {
					for (local177 = 0; local177 < 104; local177++) {
						@Pc(189) Class44 local189 = this.aClass44ArrayArrayArray1[this.anInt894][local173][local177];
						if (local189 != null) {
							local82 = local173 * 4 + 2 - aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt728 / 32;
							local25 = local177 * 4 + 2 - aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt729 / 32;
							this.method682(local25, local82, this.aClass3_Sub1_Sub2_Sub4_8);
						}
					}
				}
				for (local177 = 0; local177 < this.anInt1011; local177++) {
					@Pc(240) Class3_Sub1_Sub1_Sub4_Sub1 local240 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[this.anIntArray263[local177]];
					if (local240 != null && local240.method506()) {
						@Pc(249) Class2 local249 = local240.aClass2_1;
						if (local249.anIntArray3 != null) {
							local249 = local249.method6();
						}
						if (local249 != null && local249.aBoolean4 && local249.aBoolean2) {
							local82 = local240.anInt728 / 32 - aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt728 / 32;
							local25 = local240.anInt729 / 32 - aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt729 / 32;
							this.method682(local25, local82, this.aClass3_Sub1_Sub2_Sub4_9);
						}
					}
				}
				@Pc(308) Class3_Sub1_Sub1_Sub4_Sub2 local308;
				for (@Pc(298) int local298 = 0; local298 < this.anInt929; local298++) {
					local308 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[this.anIntArray238[local298]];
					if (local308 != null && local308.method506()) {
						local82 = local308.anInt728 / 32 - aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt728 / 32;
						local25 = local308.anInt729 / 32 - aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt729 / 32;
						@Pc(336) boolean local336 = false;
						@Pc(340) long local340 = Class15.method198(local308.aString16);
						for (@Pc(342) int local342 = 0; local342 < this.anInt907; local342++) {
							if (local340 == this.aLongArray3[local342] && this.anIntArray260[local342] != 0) {
								local336 = true;
								break;
							}
						}
						@Pc(367) boolean local367 = false;
						if (aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt750 != 0 && local308.anInt750 != 0 && aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt750 == local308.anInt750) {
							local367 = true;
						}
						if (local336) {
							this.method682(local25, local82, this.aClass3_Sub1_Sub2_Sub4_11);
						} else if (local367) {
							this.method682(local25, local82, this.aClass3_Sub1_Sub2_Sub4_12);
						} else {
							this.method682(local25, local82, this.aClass3_Sub1_Sub2_Sub4_10);
						}
					}
				}
				if (this.anInt887 != 0 && anInt919 % 20 < 10) {
					if (this.anInt887 == 1 && this.anInt906 >= 0 && this.anInt906 < this.aClass3_Sub1_Sub1_Sub4_Sub1Array1.length) {
						@Pc(441) Class3_Sub1_Sub1_Sub4_Sub1 local441 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[this.anInt906];
						if (local441 != null) {
							local82 = local441.anInt728 / 32 - aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt728 / 32;
							local25 = local441.anInt729 / 32 - aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt729 / 32;
							this.method690(local25, local82, this.aClass3_Sub1_Sub2_Sub4_17);
						}
					}
					if (this.anInt887 == 2) {
						local82 = (this.anInt875 - this.anInt946) * 4 + 2 - aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt728 / 32;
						local25 = (this.anInt876 - this.anInt947) * 4 + 2 - aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt729 / 32;
						this.method690(local25, local82, this.aClass3_Sub1_Sub2_Sub4_17);
					}
					if (this.anInt887 == 10 && this.anInt962 >= 0 && this.anInt962 < this.aClass3_Sub1_Sub1_Sub4_Sub2Array1.length) {
						local308 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[this.anInt962];
						if (local308 != null) {
							local82 = local308.anInt728 / 32 - aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt728 / 32;
							local25 = local308.anInt729 / 32 - aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt729 / 32;
							this.method690(local25, local82, this.aClass3_Sub1_Sub2_Sub4_17);
						}
					}
				}
				if (this.anInt931 != 0) {
					local82 = this.anInt931 * 4 + 2 - aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt728 / 32;
					local25 = this.anInt932 * 4 + 2 - aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt729 / 32;
					this.method682(local25, local82, this.aClass3_Sub1_Sub2_Sub4_16);
				}
				Class3_Sub1_Sub2.method521(3, 16777215, 3, 97, this.aByte44, 78);
				this.aClass13_5.method157(this.aBoolean229);
				Class3_Sub1_Sub2_Sub2.anIntArray29 = this.anIntArray229;
			}
		} catch (@Pc(611) RuntimeException local611) {
			signlink.reporterror("75474, " + -18786 + ", " + local611.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!WNCFPLWV;IZ)V")
	private void method665(@OriginalArg(0) Class3_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			arg0.method468(255);
			@Pc(14) int local14 = arg0.method469(1);
			if (local14 != 0) {
				@Pc(22) int local22 = arg0.method469(2);
				if (local22 == 0) {
					this.anIntArray239[this.anInt930++] = this.anInt928;
				} else {
					@Pc(45) int local45;
					@Pc(55) int local55;
					if (local22 == 1) {
						local45 = arg0.method469(3);
						aClass3_Sub1_Sub1_Sub4_Sub2_1.method508(false, local45);
						local55 = arg0.method469(1);
						if (local55 == 1) {
							this.anIntArray239[this.anInt930++] = this.anInt928;
						}
					} else {
						@Pc(99) int local99;
						if (local22 == 2) {
							local45 = arg0.method469(3);
							aClass3_Sub1_Sub1_Sub4_Sub2_1.method508(true, local45);
							local55 = arg0.method469(3);
							aClass3_Sub1_Sub1_Sub4_Sub2_1.method508(true, local55);
							local99 = arg0.method469(1);
							if (local99 == 1) {
								this.anIntArray239[this.anInt930++] = this.anInt928;
							}
						} else if (local22 == 3) {
							local45 = arg0.method469(1);
							this.anInt894 = arg0.method469(2);
							local55 = arg0.method469(7);
							local99 = arg0.method469(1);
							if (local99 == 1) {
								this.anIntArray239[this.anInt930++] = this.anInt928;
							}
							@Pc(159) int local159 = arg0.method469(7);
							aClass3_Sub1_Sub1_Sub4_Sub2_1.method509(local55, (byte) 4, local45 == 1, local159);
						}
					}
				}
			}
		} catch (@Pc(172) RuntimeException local172) {
			signlink.reporterror("75338, " + arg0 + ", " + arg1 + ", " + false + ", " + local172.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;IIILjava/lang/String;I)Lclient!RPFMUSNN;")
	private Class35 method666(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(3) byte[] local3 = null;
			@Pc(5) int local5 = 5;
			try {
				if (this.aClass38Array1[0] != null) {
					local3 = this.aClass38Array1[0].method371(arg2);
				}
			} catch (@Pc(20) Exception local20) {
			}
			@Pc(34) int local34;
			if (local3 != null) {
				this.aCRC32_2.reset();
				this.aCRC32_2.update(local3);
				local34 = (int) this.aCRC32_2.getValue();
				if (local34 != arg1) {
					local3 = null;
				}
			}
			if (local3 != null) {
				return new Class35(34083, local3);
			}
			local34 = 0;
			while (local3 == null) {
				@Pc(62) String local62 = "Unknown error";
				this.method587(arg4, "Requesting " + arg3);
				@Pc(77) int local77;
				try {
					local77 = 0;
					@Pc(88) DataInputStream local88 = this.method654(arg0 + arg1);
					@Pc(91) byte[] local91 = new byte[6];
					local88.readFully(local91, 0, 6);
					@Pc(102) Class3_Sub1_Sub4 local102 = new Class3_Sub1_Sub4((byte) -58, local91);
					local102.anInt666 = 3;
					@Pc(110) int local110 = local102.method462() + 6;
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
							this.method587(arg4, "Loading " + arg3 + " - " + local175 + "%");
						}
						local77 = local175;
					}
					local88.close();
					try {
						if (this.aClass38Array1[0] != null) {
							this.aClass38Array1[0].method372(local3, (byte) 5, local3.length, arg2);
						}
					} catch (@Pc(220) Exception local220) {
						this.aClass38Array1[0] = null;
					}
					if (local3 != null) {
						this.aCRC32_2.reset();
						this.aCRC32_2.update(local3);
						local135 = (int) this.aCRC32_2.getValue();
						if (local135 != arg1) {
							local3 = null;
							local34++;
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
						if (local34 >= 3) {
							this.method587(arg4, "Game updated - please reload page");
							local77 = 10;
						} else {
							this.method587(arg4, local62 + " - Retrying in " + local77);
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
					this.aBoolean233 = !this.aBoolean233;
				}
			}
			return new Class35(34083, local3);
		} catch (@Pc(359) RuntimeException local359) {
			signlink.reporterror("57597, " + arg0 + ", " + -3191 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local359.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!RODHPQMW;IB)V")
	private void method667(@OriginalArg(0) Class3_Sub1_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			this.method668(arg0.anInt728, this.aByte40, arg0.anInt729, arg1);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("11275, " + arg0 + ", " + arg1 + ", " + -122 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IBII)V")
	private void method668(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg0 >= 128 && arg2 >= 128 && arg0 <= 13056 && arg2 <= 13056) {
				@Pc(28) int local28 = this.method688(arg0, arg2, 899, this.anInt894) - arg3;
				@Pc(33) int local33 = arg0 - this.anInt1030;
				@Pc(38) int local38 = local28 - this.anInt1031;
				@Pc(43) int local43 = arg2 - this.anInt1032;
				@Pc(48) int local48 = Class3_Sub1_Sub1_Sub5.anIntArray166[this.anInt1033];
				@Pc(53) int local53 = Class3_Sub1_Sub1_Sub5.anIntArray167[this.anInt1033];
				@Pc(58) int local58 = Class3_Sub1_Sub1_Sub5.anIntArray166[this.anInt1034];
				@Pc(63) int local63 = Class3_Sub1_Sub1_Sub5.anIntArray167[this.anInt1034];
				@Pc(73) int local73 = local43 * local58 + local33 * local63 >> 16;
				@Pc(83) int local83 = local43 * local63 - local33 * local58 >> 16;
				@Pc(85) int local85 = local73;
				@Pc(95) int local95 = local38 * local53 - local83 * local48 >> 16;
				@Pc(105) int local105 = local38 * local48 + local83 * local53 >> 16;
				if (arg1 == 0) {
					@Pc(109) boolean local109 = false;
					if (local105 >= 50) {
						this.anInt1035 = Class3_Sub1_Sub2_Sub2.anInt132 + (local85 << 9) / local105;
						this.anInt1036 = Class3_Sub1_Sub2_Sub2.anInt133 + (local95 << 9) / local105;
					} else {
						this.anInt1035 = -1;
						this.anInt1036 = -1;
					}
				}
			} else {
				this.anInt1035 = -1;
				this.anInt1036 = -1;
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("7296, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
	private void method669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class44 local9 = this.aClass44ArrayArrayArray1[this.anInt894][arg0][arg1];
		if (local9 == null) {
			this.aClass25_1.method269(this.anInt894, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class3_Sub1_Sub1_Sub1 local23 = null;
		@Pc(27) Class3_Sub1_Sub1_Sub1 local27;
		for (local27 = (Class3_Sub1_Sub1_Sub1) local9.method439(); local27 != null; local27 = (Class3_Sub1_Sub1_Sub1) local9.method441()) {
			@Pc(32) Class10 local32 = Class10.method118(local27.anInt206);
			@Pc(35) int local35 = local32.anInt140;
			if (local32.aBoolean44) {
				local35 *= local27.anInt205 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method437(local23);
		@Pc(65) Class3_Sub1_Sub1_Sub1 local65 = null;
		@Pc(67) Class3_Sub1_Sub1_Sub1 local67 = null;
		for (local27 = (Class3_Sub1_Sub1_Sub1) local9.method439(); local27 != null; local27 = (Class3_Sub1_Sub1_Sub1) local9.method441()) {
			if (local27.anInt206 != local23.anInt206 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt206 != local23.anInt206 && local27.anInt206 != local65.anInt206 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass25_1.method255(arg1, this.method688(arg0 * 128 + 64, arg1 * 128 + 64, 899, this.anInt894), local67, local23, local110, local65, this.anInt894, arg0);
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method670() {
		try {
			if (this.anInt874 > 0) {
				this.method608();
			} else {
				this.method609("Connection lost", "Please wait - attempting to reestablish");
				this.anInt881 = 0;
				this.anInt931 = 0;
				@Pc(25) Class42 local25 = this.aClass42_1;
				this.aBoolean206 = false;
				this.anInt1001 = 0;
				this.method606(this.aString22, this.aString23, true);
				if (!this.aBoolean206) {
					this.method608();
				}
				try {
					local25.method428();
				} catch (@Pc(48) Exception local48) {
				}
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("49048, " + true + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt864 = Integer.parseInt(this.getParameter("nodeid"));
		anInt865 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method632();
		} else {
			method622();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean202 = false;
		} else {
			aBoolean202 = true;
		}
		this.method576();
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method672() {
		try {
			System.out.println("============");
			this.aBoolean206 &= true;
			System.out.println("flame-cycle:" + this.anInt1004);
			if (this.aClass16_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass16_Sub1_1.anInt220);
			}
			System.out.println("loop-cycle:" + anInt919);
			System.out.println("draw-cycle:" + anInt833);
			System.out.println("ptype:" + this.anInt871);
			System.out.println("psize:" + this.anInt870);
			if (this.aClass42_1 != null) {
				this.aClass42_1.method433();
			}
			super.aBoolean193 = true;
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("58366, " + true + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)Ljava/awt/Component;")
	@Override
	protected Component method585() {
		try {
			this.anInt870 += 0;
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("83279, " + 0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V")
	private void method673(@OriginalArg(0) int arg0) {
		try {
			@Pc(9) Class32 local9 = Class32.method316(arg0);
			for (@Pc(11) int local11 = 0; local11 < local9.anIntArray105.length && local9.anIntArray105[local11] != -1; local11++) {
				@Pc(25) Class32 local25 = Class32.method316(local9.anIntArray105[local11]);
				if (local25.anInt443 == 1) {
					this.method673(local25.anInt442);
				}
				local25.anInt437 = 0;
				local25.anInt431 = 0;
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("11149, " + arg0 + ", " + false + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!JMLHLOET;I)V")
	private void method675(@OriginalArg(0) Class3_Sub2 arg0) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			if (arg0.anInt257 == 0) {
				local1 = this.aClass25_1.method274(arg0.anInt256, arg0.anInt258, arg0.anInt259);
			}
			if (arg0.anInt257 == 1) {
				local1 = this.aClass25_1.method275(arg0.anInt259, arg0.anInt258, arg0.anInt256);
			}
			if (arg0.anInt257 == 2) {
				local1 = this.aClass25_1.method276(arg0.anInt256, arg0.anInt258, arg0.anInt259);
			}
			if (arg0.anInt257 == 3) {
				local1 = this.aClass25_1.method277(arg0.anInt256, arg0.anInt258, arg0.anInt259);
			}
			if (local1 != 0) {
				@Pc(76) int local76 = this.aClass25_1.method278(arg0.anInt256, arg0.anInt258, arg0.anInt259, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local76 & 0x1F;
				local7 = local76 >> 6;
			}
			arg0.anInt265 = local3;
			arg0.anInt267 = local5;
			arg0.anInt266 = local7;
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("82196, " + arg0 + ", " + -46483 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method676() {
		try {
			this.aBoolean212 = true;
			for (@Pc(14) int local14 = 0; local14 < 7; local14++) {
				this.anIntArray220[local14] = -1;
				for (@Pc(23) int local23 = 0; local23 < Class36.anInt522; local23++) {
					if (!Class36.aClass36Array1[local23].aBoolean116 && Class36.aClass36Array1[local23].anInt523 == local14 + (this.aBoolean235 ? 0 : 7)) {
						this.anIntArray220[local14] = local23;
						break;
					}
				}
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("85406, " + -26 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIBLclient!QQMJEFXK;I)V")
	private void method677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class32 arg5, @OriginalArg(7) int arg6) {
		try {
			if (this.aByte46 != 12) {
				this.anInt871 = -1;
			}
			if (arg5.anInt443 == 0 && arg5.anIntArray105 != null && !arg5.aBoolean101 && (arg6 >= arg3 && arg0 >= arg4 && arg6 <= arg3 + arg5.anInt438 && arg0 <= arg4 + arg5.anInt441)) {
				@Pc(41) int local41 = arg5.anIntArray105.length;
				for (@Pc(43) int local43 = 0; local43 < local41; local43++) {
					@Pc(52) int local52 = arg5.anIntArray100[local43] + arg3;
					@Pc(61) int local61 = arg5.anIntArray104[local43] + arg4 - arg1;
					@Pc(67) Class32 local67 = Class32.method316(arg5.anIntArray105[local43]);
					@Pc(72) int local72 = local52 + local67.anInt444;
					@Pc(77) int local77 = local61 + local67.anInt433;
					if ((local67.anInt445 >= 0 || local67.anInt423 != 0) && arg6 >= local72 && arg0 >= local77 && arg6 < local72 + local67.anInt438 && arg0 < local77 + local67.anInt441) {
						if (local67.anInt445 >= 0) {
							this.anInt977 = local67.anInt445;
						} else {
							this.anInt977 = local67.anInt442;
						}
					}
					if (local67.anInt443 == 8 && arg6 >= local72 && arg0 >= local77 && arg6 < local72 + local67.anInt438 && arg0 < local77 + local67.anInt441) {
						this.anInt1023 = local67.anInt442;
					}
					if (local67.anInt443 == 0) {
						this.method677(arg0, local67.anInt440, arg2, local72, local77, local67, arg6);
						if (local67.anInt417 > local67.anInt441) {
							this.method660(local67, local67.anInt441, arg0, local77, arg6, arg2, local67.anInt417, local72 + local67.anInt438);
						}
					} else {
						if (local67.anInt421 == 1 && arg6 >= local72 && arg0 >= local77 && arg6 < local72 + local67.anInt438 && arg0 < local77 + local67.anInt441) {
							@Pc(201) boolean local201 = false;
							if (local67.anInt430 != 0) {
								local201 = this.method647(local67);
							}
							if (!local201) {
								this.aStringArray13[this.anInt1045] = local67.aString10;
								this.anIntArray271[this.anInt1045] = 282;
								this.anIntArray270[this.anInt1045] = local67.anInt442;
								this.anInt1045++;
							}
						}
						if (local67.anInt421 == 2 && this.anInt1050 == 0 && arg6 >= local72 && arg0 >= local77 && arg6 < local72 + local67.anInt438 && arg0 < local77 + local67.anInt441) {
							@Pc(265) String local265 = local67.aString6;
							if (local265.indexOf(" ") != -1) {
								local265 = local265.substring(0, local265.indexOf(" "));
							}
							this.aStringArray13[this.anInt1045] = local265 + " @gre@" + local67.aString8;
							this.anIntArray271[this.anInt1045] = 507;
							this.anIntArray270[this.anInt1045] = local67.anInt442;
							this.anInt1045++;
						}
						if (local67.anInt421 == 3 && arg6 >= local72 && arg0 >= local77 && arg6 < local72 + local67.anInt438 && arg0 < local77 + local67.anInt441) {
							this.aStringArray13[this.anInt1045] = "Close";
							if (arg2 == 3) {
								this.anIntArray271[this.anInt1045] = 210;
							} else {
								this.anIntArray271[this.anInt1045] = 194;
							}
							this.anIntArray270[this.anInt1045] = local67.anInt442;
							this.anInt1045++;
						}
						if (local67.anInt421 == 4 && arg6 >= local72 && arg0 >= local77 && arg6 < local72 + local67.anInt438 && arg0 < local77 + local67.anInt441) {
							this.aStringArray13[this.anInt1045] = local67.aString10;
							this.anIntArray271[this.anInt1045] = 144;
							this.anIntArray270[this.anInt1045] = local67.anInt442;
							this.anInt1045++;
						}
						if (local67.anInt421 == 5 && arg6 >= local72 && arg0 >= local77 && arg6 < local72 + local67.anInt438 && arg0 < local77 + local67.anInt441) {
							this.aStringArray13[this.anInt1045] = local67.aString10;
							this.anIntArray271[this.anInt1045] = 393;
							this.anIntArray270[this.anInt1045] = local67.anInt442;
							this.anInt1045++;
						}
						if (local67.anInt421 == 6 && !this.aBoolean205 && arg6 >= local72 && arg0 >= local77 && arg6 < local72 + local67.anInt438 && arg0 < local77 + local67.anInt441) {
							this.aStringArray13[this.anInt1045] = local67.aString10;
							this.anIntArray271[this.anInt1045] = 588;
							this.anIntArray270[this.anInt1045] = local67.anInt442;
							this.anInt1045++;
						}
						if (local67.anInt443 == 2) {
							@Pc(524) int local524 = 0;
							for (@Pc(526) int local526 = 0; local526 < local67.anInt441; local526++) {
								for (@Pc(530) int local530 = 0; local530 < local67.anInt438; local530++) {
									@Pc(541) int local541 = local72 + local530 * (local67.anInt428 + 32);
									@Pc(550) int local550 = local77 + local526 * (local67.anInt432 + 32);
									if (local524 < 20) {
										local541 += local67.anIntArray99[local524];
										local550 += local67.anIntArray102[local524];
									}
									if (arg6 >= local541 && arg0 >= local550 && arg6 < local541 + 32 && arg0 < local550 + 32) {
										this.anInt966 = local524;
										this.anInt967 = local67.anInt442;
										if (local67.anIntArray101[local524] > 0) {
											@Pc(603) Class10 local603 = Class10.method118(local67.anIntArray101[local524] - 1);
											if (this.anInt889 == 1 && local67.aBoolean104) {
												if (local67.anInt442 != this.anInt891 || local524 != this.anInt890) {
													this.aStringArray13[this.anInt1045] = "Use " + this.aString20 + " with @lre@" + local603.aString3;
													this.anIntArray271[this.anInt1045] = 112;
													this.anIntArray272[this.anInt1045] = local603.anInt155;
													this.anIntArray269[this.anInt1045] = local524;
													this.anIntArray270[this.anInt1045] = local67.anInt442;
													this.anInt1045++;
												}
											} else if (this.anInt1050 != 1 || !local67.aBoolean104) {
												@Pc(740) int local740;
												if (local67.aBoolean104) {
													for (local740 = 4; local740 >= 3; local740--) {
														if (local603.aStringArray4 != null && local603.aStringArray4[local740] != null) {
															this.aStringArray13[this.anInt1045] = local603.aStringArray4[local740] + " @lre@" + local603.aString3;
															if (local740 == 3) {
																this.anIntArray271[this.anInt1045] = 840;
															}
															if (local740 == 4) {
																this.anIntArray271[this.anInt1045] = 280;
															}
															this.anIntArray272[this.anInt1045] = local603.anInt155;
															this.anIntArray269[this.anInt1045] = local524;
															this.anIntArray270[this.anInt1045] = local67.anInt442;
															this.anInt1045++;
														} else if (local740 == 4) {
															this.aStringArray13[this.anInt1045] = "Drop @lre@" + local603.aString3;
															this.anIntArray271[this.anInt1045] = 280;
															this.anIntArray272[this.anInt1045] = local603.anInt155;
															this.anIntArray269[this.anInt1045] = local524;
															this.anIntArray270[this.anInt1045] = local67.anInt442;
															this.anInt1045++;
														}
													}
												}
												if (local67.aBoolean106) {
													this.aStringArray13[this.anInt1045] = "Use @lre@" + local603.aString3;
													this.anIntArray271[this.anInt1045] = 18;
													this.anIntArray272[this.anInt1045] = local603.anInt155;
													this.anIntArray269[this.anInt1045] = local524;
													this.anIntArray270[this.anInt1045] = local67.anInt442;
													this.anInt1045++;
												}
												if (local67.aBoolean104 && local603.aStringArray4 != null) {
													for (local740 = 2; local740 >= 0; local740--) {
														if (local603.aStringArray4[local740] != null) {
															this.aStringArray13[this.anInt1045] = local603.aStringArray4[local740] + " @lre@" + local603.aString3;
															if (local740 == 0) {
																this.anIntArray271[this.anInt1045] = 205;
															}
															if (local740 == 1) {
																this.anIntArray271[this.anInt1045] = 755;
															}
															if (local740 == 2) {
																this.anIntArray271[this.anInt1045] = 848;
															}
															this.anIntArray272[this.anInt1045] = local603.anInt155;
															this.anIntArray269[this.anInt1045] = local524;
															this.anIntArray270[this.anInt1045] = local67.anInt442;
															this.anInt1045++;
														}
													}
												}
												if (local67.aStringArray7 != null) {
													for (local740 = 4; local740 >= 0; local740--) {
														if (local67.aStringArray7[local740] != null) {
															this.aStringArray13[this.anInt1045] = local67.aStringArray7[local740] + " @lre@" + local603.aString3;
															if (local740 == 0) {
																this.anIntArray271[this.anInt1045] = 190;
															}
															if (local740 == 1) {
																this.anIntArray271[this.anInt1045] = 669;
															}
															if (local740 == 2) {
																this.anIntArray271[this.anInt1045] = 516;
															}
															if (local740 == 3) {
																this.anIntArray271[this.anInt1045] = 173;
															}
															if (local740 == 4) {
																this.anIntArray271[this.anInt1045] = 237;
															}
															this.anIntArray272[this.anInt1045] = local603.anInt155;
															this.anIntArray269[this.anInt1045] = local524;
															this.anIntArray270[this.anInt1045] = local67.anInt442;
															this.anInt1045++;
														}
													}
												}
												this.aStringArray13[this.anInt1045] = "Examine @lre@" + local603.aString3;
												this.anIntArray271[this.anInt1045] = 1156;
												this.anIntArray272[this.anInt1045] = local603.anInt155;
												this.anIntArray269[this.anInt1045] = local524;
												this.anIntArray270[this.anInt1045] = local67.anInt442;
												this.anInt1045++;
											} else if ((this.anInt1052 & 0x10) == 16) {
												this.aStringArray13[this.anInt1045] = this.aString31 + " @lre@" + local603.aString3;
												this.anIntArray271[this.anInt1045] = 560;
												this.anIntArray272[this.anInt1045] = local603.anInt155;
												this.anIntArray269[this.anInt1045] = local524;
												this.anIntArray270[this.anInt1045] = local67.anInt442;
												this.anInt1045++;
											}
										}
									}
									local524++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1170) RuntimeException local1170) {
			signlink.reporterror("33909, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 12 + ", " + arg5 + ", " + arg6 + ", " + local1170.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method678() {
		try {
			if (this.anInt889 == 0 && this.anInt1050 == 0) {
				this.aStringArray13[this.anInt1045] = "Walk here";
				this.anIntArray271[this.anInt1045] = 599;
				this.anIntArray269[this.anInt1045] = super.anInt804;
				this.anIntArray270[this.anInt1045] = super.anInt805;
				this.anInt1045++;
			}
			@Pc(41) int local41 = -1;
			for (@Pc(43) int local43 = 0; local43 < Class3_Sub1_Sub1_Sub5.anInt637; local43++) {
				@Pc(49) int local49 = Class3_Sub1_Sub1_Sub5.anIntArray165[local43];
				@Pc(53) int local53 = local49 & 0x7F;
				@Pc(59) int local59 = local49 >> 7 & 0x7F;
				@Pc(65) int local65 = local49 >> 29 & 0x3;
				@Pc(71) int local71 = local49 >> 14 & 0x7FFF;
				if (local49 != local41) {
					local41 = local49;
					@Pc(218) int local218;
					if (local65 == 2 && this.aClass25_1.method278(this.anInt894, local53, local59, local49) >= 0) {
						@Pc(91) Class8 local91 = Class8.method70(local71);
						if (local91.anIntArray18 != null) {
							local91 = local91.method77();
						}
						if (local91 == null) {
							continue;
						}
						if (this.anInt889 == 1) {
							this.aStringArray13[this.anInt1045] = "Use " + this.aString20 + " with @cya@" + local91.aString2;
							this.anIntArray271[this.anInt1045] = 613;
							this.anIntArray272[this.anInt1045] = local49;
							this.anIntArray269[this.anInt1045] = local53;
							this.anIntArray270[this.anInt1045] = local59;
							this.anInt1045++;
						} else if (this.anInt1050 != 1) {
							if (local91.aStringArray2 != null) {
								for (local218 = 4; local218 >= 0; local218--) {
									if (local91.aStringArray2[local218] != null) {
										this.aStringArray13[this.anInt1045] = local91.aStringArray2[local218] + " @cya@" + local91.aString2;
										if (local218 == 0) {
											this.anIntArray271[this.anInt1045] = 203;
										}
										if (local218 == 1) {
											this.anIntArray271[this.anInt1045] = 645;
										}
										if (local218 == 2) {
											this.anIntArray271[this.anInt1045] = 134;
										}
										if (local218 == 3) {
											this.anIntArray271[this.anInt1045] = 886;
										}
										if (local218 == 4) {
											this.anIntArray271[this.anInt1045] = 1436;
										}
										this.anIntArray272[this.anInt1045] = local49;
										this.anIntArray269[this.anInt1045] = local53;
										this.anIntArray270[this.anInt1045] = local59;
										this.anInt1045++;
									}
								}
							}
							this.aStringArray13[this.anInt1045] = "Examine @cya@" + local91.aString2;
							this.anIntArray271[this.anInt1045] = 1286;
							this.anIntArray272[this.anInt1045] = local91.anInt98 << 14;
							this.anIntArray269[this.anInt1045] = local53;
							this.anIntArray270[this.anInt1045] = local59;
							this.anInt1045++;
						} else if ((this.anInt1052 & 0x4) == 4) {
							this.aStringArray13[this.anInt1045] = this.aString31 + " @cya@" + local91.aString2;
							this.anIntArray271[this.anInt1045] = 277;
							this.anIntArray272[this.anInt1045] = local49;
							this.anIntArray269[this.anInt1045] = local53;
							this.anIntArray270[this.anInt1045] = local59;
							this.anInt1045++;
						}
					}
					@Pc(398) Class3_Sub1_Sub1_Sub4_Sub1 local398;
					@Pc(446) Class3_Sub1_Sub1_Sub4_Sub2 local446;
					@Pc(436) int local436;
					if (local65 == 1) {
						@Pc(369) Class3_Sub1_Sub1_Sub4_Sub1 local369 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local71];
						if (local369.aClass2_1.aByte2 == 1 && (local369.anInt728 & 0x7F) == 64 && (local369.anInt729 & 0x7F) == 64) {
							for (local218 = 0; local218 < this.anInt1011; local218++) {
								local398 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[this.anIntArray263[local218]];
								if (local398 != null && local398 != local369 && local398.aClass2_1.aByte2 == 1 && local398.anInt728 == local369.anInt728 && local398.anInt729 == local369.anInt729) {
									this.method589(local59, local53, this.anIntArray263[local218], local398.aClass2_1);
								}
							}
							for (local436 = 0; local436 < this.anInt929; local436++) {
								local446 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[this.anIntArray238[local436]];
								if (local446 != null && local446.anInt728 == local369.anInt728 && local446.anInt729 == local369.anInt729) {
									this.method626(this.anIntArray238[local436], local446, local59, local53);
								}
							}
						}
						this.method589(local59, local53, local71, local369.aClass2_1);
					}
					if (local65 == 0) {
						@Pc(488) Class3_Sub1_Sub1_Sub4_Sub2 local488 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local71];
						if ((local488.anInt728 & 0x7F) == 64 && (local488.anInt729 & 0x7F) == 64) {
							for (local218 = 0; local218 < this.anInt1011; local218++) {
								local398 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[this.anIntArray263[local218]];
								if (local398 != null && local398.aClass2_1.aByte2 == 1 && local398.anInt728 == local488.anInt728 && local398.anInt729 == local488.anInt729) {
									this.method589(local59, local53, this.anIntArray263[local218], local398.aClass2_1);
								}
							}
							for (local436 = 0; local436 < this.anInt929; local436++) {
								local446 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[this.anIntArray238[local436]];
								if (local446 != null && local446 != local488 && local446.anInt728 == local488.anInt728 && local446.anInt729 == local488.anInt729) {
									this.method626(this.anIntArray238[local436], local446, local59, local53);
								}
							}
						}
						this.method626(local71, local488, local59, local53);
					}
					if (local65 == 3) {
						@Pc(607) Class44 local607 = this.aClass44ArrayArrayArray1[this.anInt894][local53][local59];
						if (local607 != null) {
							for (@Pc(614) Class3_Sub1_Sub1_Sub1 local614 = (Class3_Sub1_Sub1_Sub1) local607.method440(); local614 != null; local614 = (Class3_Sub1_Sub1_Sub1) local607.method442()) {
								@Pc(620) Class10 local620 = Class10.method118(local614.anInt206);
								if (this.anInt889 == 1) {
									this.aStringArray13[this.anInt1045] = "Use " + this.aString20 + " with @lre@" + local620.aString3;
									this.anIntArray271[this.anInt1045] = 964;
									this.anIntArray272[this.anInt1045] = local614.anInt206;
									this.anIntArray269[this.anInt1045] = local53;
									this.anIntArray270[this.anInt1045] = local59;
									this.anInt1045++;
								} else if (this.anInt1050 != 1) {
									for (@Pc(737) int local737 = 4; local737 >= 0; local737--) {
										if (local620.aStringArray3 != null && local620.aStringArray3[local737] != null) {
											this.aStringArray13[this.anInt1045] = local620.aStringArray3[local737] + " @lre@" + local620.aString3;
											if (local737 == 0) {
												this.anIntArray271[this.anInt1045] = 448;
											}
											if (local737 == 1) {
												this.anIntArray271[this.anInt1045] = 264;
											}
											if (local737 == 2) {
												this.anIntArray271[this.anInt1045] = 830;
											}
											if (local737 == 3) {
												this.anIntArray271[this.anInt1045] = 497;
											}
											if (local737 == 4) {
												this.anIntArray271[this.anInt1045] = 265;
											}
											this.anIntArray272[this.anInt1045] = local614.anInt206;
											this.anIntArray269[this.anInt1045] = local53;
											this.anIntArray270[this.anInt1045] = local59;
											this.anInt1045++;
										} else if (local737 == 2) {
											this.aStringArray13[this.anInt1045] = "Take @lre@" + local620.aString3;
											this.anIntArray271[this.anInt1045] = 830;
											this.anIntArray272[this.anInt1045] = local614.anInt206;
											this.anIntArray269[this.anInt1045] = local53;
											this.anIntArray270[this.anInt1045] = local59;
											this.anInt1045++;
										}
									}
									this.aStringArray13[this.anInt1045] = "Examine @lre@" + local620.aString3;
									this.anIntArray271[this.anInt1045] = 1247;
									this.anIntArray272[this.anInt1045] = local614.anInt206;
									this.anIntArray269[this.anInt1045] = local53;
									this.anIntArray270[this.anInt1045] = local59;
									this.anInt1045++;
								} else if ((this.anInt1052 & 0x1) == 1) {
									this.aStringArray13[this.anInt1045] = this.aString31 + " @lre@" + local620.aString3;
									this.anIntArray271[this.anInt1045] = 756;
									this.anIntArray272[this.anInt1045] = local614.anInt206;
									this.anIntArray269[this.anInt1045] = local53;
									this.anIntArray270[this.anInt1045] = local59;
									this.anInt1045++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(949) RuntimeException local949) {
			signlink.reporterror("41300, " + false + ", " + local949.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method679() {
		try {
			@Pc(3) int local3 = 5;
			this.anIntArray266[8] = 0;
			if (this.aByte41 != 113) {
				this.aBoolean230 = !this.aBoolean230;
			}
			@Pc(22) int local22 = 0;
			while (this.anIntArray266[8] == 0) {
				@Pc(26) String local26 = "Unknown problem";
				this.method587(20, "Connecting to web server");
				try {
					@Pc(48) DataInputStream local48 = this.method654("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 373);
					@Pc(55) Class3_Sub1_Sub4 local55 = new Class3_Sub1_Sub4((byte) -58, new byte[40]);
					local48.readFully(local55.aByteArray20, 0, 40);
					local48.close();
					for (@Pc(65) int local65 = 0; local65 < 9; local65++) {
						this.anIntArray266[local65] = local55.method463();
					}
					@Pc(80) int local80 = local55.method463();
					@Pc(82) int local82 = 1234;
					for (@Pc(84) int local84 = 0; local84 < 9; local84++) {
						local82 = (local82 << 1) + this.anIntArray266[local84];
					}
					if (local80 != local82) {
						local26 = "checksum problem";
						this.anIntArray266[8] = 0;
					}
				} catch (@Pc(111) EOFException local111) {
					local26 = "EOF problem";
					this.anIntArray266[8] = 0;
				} catch (@Pc(120) IOException local120) {
					local26 = "connection problem";
					this.anIntArray266[8] = 0;
				} catch (@Pc(129) Exception local129) {
					local26 = "logic problem";
					this.anIntArray266[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray266[8] == 0) {
					local22++;
					for (@Pc(147) int local147 = local3; local147 > 0; local147--) {
						if (local22 >= 10) {
							this.method587(10, "Game updated - please reload page");
							local147 = 10;
						} else {
							this.method587(10, local26 + " - Will retry in " + local147 + " secs.");
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(181) Exception local181) {
						}
					}
					local3 *= 2;
					if (local3 > 60) {
						local3 = 60;
					}
					this.aBoolean233 = !this.aBoolean233;
				}
			}
		} catch (@Pc(209) RuntimeException local209) {
			signlink.reporterror("32600, " + 113 + ", " + local209.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method680() {
		try {
			Class8.aClass7_3.method67();
			Class8.aClass7_2.method67();
			Class2.aClass7_1.method67();
			Class10.aClass7_5.method67();
			Class10.aClass7_4.method67();
			this.anInt870 += 0;
			Class3_Sub1_Sub1_Sub4_Sub2.aClass7_9.method67();
			Class39.aClass7_8.method67();
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("95099, " + 0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BI)V")
	private void method681(@OriginalArg(1) int arg0) {
		try {
			signlink.anInt1063 = arg0;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("7560, " + 77 + ", " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZLclient!WSNKRVXZ;)V")
	private void method682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3_Sub1_Sub2_Sub4 arg2) {
		try {
			if (arg2 != null) {
				@Pc(10) int local10 = this.anInt858 + this.anInt855 & 0x7FF;
				@Pc(18) int local18 = arg1 * arg1 + arg0 * arg0;
				if (local18 <= 6400) {
					@Pc(26) int local26 = Class3_Sub1_Sub1_Sub5.anIntArray166[local10];
					@Pc(30) int local30 = Class3_Sub1_Sub1_Sub5.anIntArray167[local10];
					@Pc(39) int local39 = local26 * 256 / (this.anInt989 + 256);
					@Pc(48) int local48 = local30 * 256 / (this.anInt989 + 256);
					@Pc(58) int local58 = arg0 * local39 + arg1 * local48 >> 16;
					@Pc(68) int local68 = arg0 * local48 - arg1 * local39 >> 16;
					if (local18 > 2500) {
						arg2.method539(local58 + 94 + 4 - arg2.anInt774 / 2, this.aClass3_Sub1_Sub2_Sub3_19, 83 - local68 - arg2.anInt775 / 2 - 4);
					} else {
						arg2.method533(local58 + 94 + 4 - arg2.anInt774 / 2, 83 - local68 - arg2.anInt775 / 2 - 4);
					}
				}
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("79008, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method683() {
		try {
			this.aClass3_Sub1_Sub4_7.method447(178);
			if (this.anInt920 != -1) {
				this.method613(this.anInt920);
				this.anInt920 = -1;
				this.aBoolean207 = true;
				this.aBoolean205 = false;
				this.aBoolean208 = true;
			}
			if (this.anInt840 != -1) {
				this.method613(this.anInt840);
				this.anInt840 = -1;
				this.aBoolean197 = true;
				this.aBoolean205 = false;
			}
			if (this.anInt998 != -1) {
				this.method613(this.anInt998);
				this.anInt998 = -1;
				this.aBoolean210 = true;
			}
			if (this.anInt955 != -1) {
				this.method613(this.anInt955);
				this.anInt955 = -1;
			}
			if (this.anInt961 != -1) {
				this.method613(this.anInt961);
				this.anInt961 = -1;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("12079, " + 5 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method684() {
		try {
			while (true) {
				@Pc(13) int local13 = this.method579(this.anInt1040);
				if (local13 == -1) {
					return;
				}
				if (this.anInt961 != -1 && this.anInt961 == this.anInt976) {
					if (local13 == 8 && this.aString18.length() > 0) {
						this.aString18 = this.aString18.substring(0, this.aString18.length() - 1);
					}
					if ((local13 >= 97 && local13 <= 122 || local13 >= 65 && local13 <= 90 || local13 >= 48 && local13 <= 57 || local13 == 32) && this.aString18.length() < 12) {
						this.aString18 = this.aString18 + (char) local13;
					}
				} else {
					@Pc(193) int local193;
					if (this.aBoolean204) {
						if (local13 >= 32 && local13 <= 122 && this.aString17.length() < 80) {
							this.aString17 = this.aString17 + (char) local13;
							this.aBoolean197 = true;
						}
						if (local13 == 8 && this.aString17.length() > 0) {
							this.aString17 = this.aString17.substring(0, this.aString17.length() - 1);
							this.aBoolean197 = true;
						}
						if (local13 == 13 || local13 == 10) {
							this.aBoolean204 = false;
							this.aBoolean197 = true;
							@Pc(153) long local153;
							if (this.anInt936 == 1) {
								local153 = Class15.method198(this.aString17);
								this.method624(local153);
							}
							if (this.anInt936 == 2 && this.anInt907 > 0) {
								local153 = Class15.method198(this.aString17);
								this.method721(local153);
							}
							if (this.anInt936 == 3 && this.aString17.length() > 0) {
								this.aClass3_Sub1_Sub4_7.method447(235);
								this.aClass3_Sub1_Sub4_7.method448(0);
								local193 = this.aClass3_Sub1_Sub4_7.anInt666;
								this.aClass3_Sub1_Sub4_7.method454(this.aLong33);
								Class22.method239(this.aString17, this.aClass3_Sub1_Sub4_7);
								this.aClass3_Sub1_Sub4_7.method457(this.aClass3_Sub1_Sub4_7.anInt666 - local193);
								this.aString17 = Class22.method240(this.aString17);
								this.aString17 = Class14.method170(this.aString17);
								this.method603(6, Class15.method202(Class15.method199(this.aLong33)), this.aString17);
								if (this.anInt935 == 2) {
									this.anInt935 = 1;
									this.aBoolean222 = true;
									this.aClass3_Sub1_Sub4_7.method447(8);
									this.aClass3_Sub1_Sub4_7.method448(this.anInt964);
									this.aClass3_Sub1_Sub4_7.method448(this.anInt935);
									this.aClass3_Sub1_Sub4_7.method448(this.anInt838);
								}
							}
							if (this.anInt936 == 4 && this.anInt1046 < 100) {
								local153 = Class15.method198(this.aString17);
								this.method696(local153, this.anInt823);
							}
							if (this.anInt936 == 5 && this.anInt1046 > 0) {
								local153 = Class15.method198(this.aString17);
								this.method612(local153);
							}
						}
					} else if (this.anInt1020 == 1) {
						if (local13 >= 48 && local13 <= 57 && this.aString30.length() < 10) {
							this.aString30 = this.aString30 + (char) local13;
							this.aBoolean197 = true;
						}
						if (local13 == 8 && this.aString30.length() > 0) {
							this.aString30 = this.aString30.substring(0, this.aString30.length() - 1);
							this.aBoolean197 = true;
						}
						if (local13 == 13 || local13 == 10) {
							if (this.aString30.length() > 0) {
								local193 = 0;
								try {
									local193 = Integer.parseInt(this.aString30);
								} catch (@Pc(371) Exception local371) {
								}
								this.aClass3_Sub1_Sub4_7.method447(24);
								this.aClass3_Sub1_Sub4_7.method452(local193);
							}
							this.anInt1020 = 0;
							this.aBoolean197 = true;
						}
					} else if (this.anInt1020 == 2) {
						if (local13 >= 32 && local13 <= 122 && this.aString30.length() < 12) {
							this.aString30 = this.aString30 + (char) local13;
							this.aBoolean197 = true;
						}
						if (local13 == 8 && this.aString30.length() > 0) {
							this.aString30 = this.aString30.substring(0, this.aString30.length() - 1);
							this.aBoolean197 = true;
						}
						if (local13 == 13 || local13 == 10) {
							if (this.aString30.length() > 0) {
								this.aClass3_Sub1_Sub4_7.method447(25);
								this.aClass3_Sub1_Sub4_7.method454(Class15.method198(this.aString30));
							}
							this.anInt1020 = 0;
							this.aBoolean197 = true;
						}
					} else if (this.anInt1020 == 3) {
						if (local13 >= 32 && local13 <= 122 && this.aString30.length() < 40) {
							this.aString30 = this.aString30 + (char) local13;
							this.aBoolean197 = true;
						}
						if (local13 == 8 && this.aString30.length() > 0) {
							this.aString30 = this.aString30.substring(0, this.aString30.length() - 1);
							this.aBoolean197 = true;
						}
					} else if (this.anInt840 == -1 && this.anInt998 == -1) {
						if (local13 >= 32 && local13 <= 122 && this.aString29.length() < 80) {
							this.aString29 = this.aString29 + (char) local13;
							this.aBoolean197 = true;
						}
						if (local13 == 8 && this.aString29.length() > 0) {
							this.aString29 = this.aString29.substring(0, this.aString29.length() - 1);
							this.aBoolean197 = true;
						}
						if ((local13 == 13 || local13 == 10) && this.aString29.length() > 0) {
							if (this.anInt815 == 2) {
								if (this.aString29.equals("::clientdrop")) {
									this.method670();
								}
								if (this.aString29.equals("::lag")) {
									this.method672();
								}
								if (this.aString29.equals("::prefetchmusic")) {
									for (local193 = 0; local193 < this.aClass16_Sub1_1.method206(2); local193++) {
										this.aClass16_Sub1_1.method219(local193, 2, (byte) 1);
									}
								}
								if (this.aString29.equals("::fpson")) {
									aBoolean214 = true;
								}
								if (this.aString29.equals("::fpsoff")) {
									aBoolean214 = false;
								}
								if (this.aString29.equals("::noclip")) {
									for (local193 = 0; local193 < 4; local193++) {
										for (@Pc(656) int local656 = 1; local656 < 103; local656++) {
											for (@Pc(660) int local660 = 1; local660 < 103; local660++) {
												this.aClass11Array1[local193].anIntArrayArray4[local656][local660] = 0;
											}
										}
									}
								}
							}
							if (this.aString29.startsWith("::")) {
								this.aClass3_Sub1_Sub4_7.method447(151);
								this.aClass3_Sub1_Sub4_7.method448(this.aString29.length() - 1);
								this.aClass3_Sub1_Sub4_7.method455(this.aString29.substring(2));
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
								this.aClass3_Sub1_Sub4_7.method447(130);
								this.aClass3_Sub1_Sub4_7.method448(0);
								@Pc(970) int local970 = this.aClass3_Sub1_Sub4_7.anInt666;
								this.aClass3_Sub1_Sub4_7.method475(local717);
								this.aClass3_Sub1_Sub4_8.anInt666 = 0;
								Class22.method239(this.aString29, this.aClass3_Sub1_Sub4_8);
								this.aClass3_Sub1_Sub4_7.method456(this.aByte39, this.aClass3_Sub1_Sub4_8.aByteArray20, this.aClass3_Sub1_Sub4_8.anInt666);
								this.aClass3_Sub1_Sub4_7.method474(local889);
								this.aClass3_Sub1_Sub4_7.method457(this.aClass3_Sub1_Sub4_7.anInt666 - local970);
								this.aString29 = Class22.method240(this.aString29);
								this.aString29 = Class14.method170(this.aString29);
								aClass3_Sub1_Sub1_Sub4_Sub2_1.aString15 = this.aString29;
								aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt692 = local717;
								aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt722 = local889;
								aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt735 = 150;
								if (this.anInt815 == 2) {
									this.method603(2, "@cr2@" + aClass3_Sub1_Sub1_Sub4_Sub2_1.aString16, aClass3_Sub1_Sub1_Sub4_Sub2_1.aString15);
								} else if (this.anInt815 == 1) {
									this.method603(2, "@cr1@" + aClass3_Sub1_Sub1_Sub4_Sub2_1.aString16, aClass3_Sub1_Sub1_Sub4_Sub2_1.aString15);
								} else {
									this.method603(2, aClass3_Sub1_Sub1_Sub4_Sub2_1.aString16, aClass3_Sub1_Sub1_Sub4_Sub2_1.aString15);
								}
								if (this.anInt964 == 2) {
									this.anInt964 = 3;
									this.aBoolean222 = true;
									this.aClass3_Sub1_Sub4_7.method447(8);
									this.aClass3_Sub1_Sub4_7.method448(this.anInt964);
									this.aClass3_Sub1_Sub4_7.method448(this.anInt935);
									this.aClass3_Sub1_Sub4_7.method448(this.anInt838);
								}
							}
							this.aString29 = "";
							this.aBoolean197 = true;
						}
					}
				}
			}
		} catch (@Pc(1124) RuntimeException local1124) {
			signlink.reporterror("67504, " + -170 + ", " + local1124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!QQMJEFXK;II)I")
	private int method686(@OriginalArg(0) Class32 arg0, @OriginalArg(2) int arg1) {
		try {
			if (arg0.anIntArrayArray13 == null || arg1 >= arg0.anIntArrayArray13.length) {
				return -2;
			}
			try {
				@Pc(24) int[] local24 = arg0.anIntArrayArray13[arg1];
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
						local37 = this.anIntArray262[local24[local28++]];
					}
					if (local35 == 2) {
						local37 = this.anIntArray244[local24[local28++]];
					}
					if (local35 == 3) {
						local37 = this.anIntArray265[local24[local28++]];
					}
					@Pc(85) Class32 local85;
					@Pc(90) int local90;
					@Pc(103) int local103;
					if (local35 == 4) {
						local85 = Class32.method316(local24[local28++]);
						local90 = local24[local28++];
						if (local90 >= 0 && local90 < Class10.anInt142 && (!Class10.method118(local90).aBoolean46 || aBoolean202)) {
							for (local103 = 0; local103 < local85.anIntArray101.length; local103++) {
								if (local85.anIntArray101[local103] == local90 + 1) {
									local37 += local85.anIntArray97[local103];
								}
							}
						}
					}
					if (local35 == 5) {
						local37 = this.anIntArray273[local24[local28++]];
					}
					if (local35 == 6) {
						local37 = anIntArray223[this.anIntArray244[local24[local28++]] - 1];
					}
					if (local35 == 7) {
						local37 = this.anIntArray273[local24[local28++]] * 100 / 46875;
					}
					if (local35 == 8) {
						local37 = aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt753;
					}
					@Pc(178) int local178;
					if (local35 == 9) {
						for (local178 = 0; local178 < Class23.anInt272; local178++) {
							if (Class23.aBooleanArray3[local178]) {
								local37 += this.anIntArray244[local178];
							}
						}
					}
					if (local35 == 10) {
						local85 = Class32.method316(local24[local28++]);
						local90 = local24[local28++] + 1;
						if (local90 >= 0 && local90 < Class10.anInt142 && (!Class10.method118(local90).aBoolean46 || aBoolean202)) {
							for (local103 = 0; local103 < local85.anIntArray101.length; local103++) {
								if (local85.anIntArray101[local103] == local90) {
									local37 = 999999999;
									break;
								}
							}
						}
					}
					if (local35 == 11) {
						local37 = this.anInt951;
					}
					if (local35 == 12) {
						local37 = this.anInt965;
					}
					if (local35 == 13) {
						local178 = this.anIntArray273[local24[local28++]];
						local90 = local24[local28++];
						local37 = (local178 & 0x1 << local90) == 0 ? 0 : 1;
					}
					if (local35 == 14) {
						local178 = local24[local28++];
						@Pc(292) Class43 local292 = Class43.aClass43Array1[local178];
						local103 = local292.anInt645;
						@Pc(298) int local298 = local292.anInt646;
						@Pc(301) int local301 = local292.anInt647;
						@Pc(307) int local307 = anIntArray219[local301 - local298];
						local37 = this.anIntArray273[local103] >> local298 & local307;
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
						local37 = (aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt728 >> 7) + this.anInt946;
					}
					if (local35 == 19) {
						local37 = (aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt729 >> 7) + this.anInt947;
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
			} catch (@Pc(400) Exception local400) {
				return -1;
			}
		} catch (@Pc(403) RuntimeException local403) {
			signlink.reporterror("72632, " + arg0 + ", " + -341 + ", " + arg1 + ", " + local403.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BII)Z")
	private boolean method687(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			return arg0 == null ? true : signlink.wavesave(arg0, arg1);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("35502, " + arg0 + ", " + arg1 + ", " + -6504 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
	private int method688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(7) int local7 = arg0 >> 7;
			@Pc(11) int local11 = arg1 >> 7;
			if (local7 < 0 || local11 < 0 || local7 > 103 || local11 > 103) {
				return 0;
			}
			@Pc(25) int local25 = arg3;
			if (arg3 < 3 && (this.aByteArrayArrayArray8[1][local7][local11] & 0x2) == 2) {
				local25 = arg3 + 1;
			}
			@Pc(45) int local45 = arg0 & 0x7F;
			@Pc(49) int local49 = arg1 & 0x7F;
			@Pc(77) int local77 = this.anIntArrayArrayArray8[local25][local7][local11] * (128 - local45) + this.anIntArrayArrayArray8[local25][local7 + 1][local11] * local45 >> 7;
			@Pc(109) int local109 = this.anIntArrayArrayArray8[local25][local7][local11 + 1] * (128 - local45) + this.anIntArrayArrayArray8[local25][local7 + 1][local11 + 1] * local45 >> 7;
			return local77 * (128 - local49) + local109 * local49 >> 7;
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("99427, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method689(@OriginalArg(0) int arg0) {
		try {
			this.anInt937++;
			this.method592(true, this.aBoolean216);
			this.method644((byte) 6, true);
			this.method592(false, this.aBoolean216);
			this.method644((byte) 6, false);
			this.method691();
			this.method620();
			@Pc(37) int local37;
			@Pc(76) int local76;
			if (!this.aBoolean201) {
				local37 = this.anInt857;
				if (this.anInt1017 / 256 > local37) {
					local37 = this.anInt1017 / 256;
				}
				if (this.aBooleanArray12[4] && this.anIntArray237[4] + 128 > local37) {
					local37 = this.anIntArray237[4] + 128;
				}
				local76 = this.anInt858 + this.anInt817 & 0x7FF;
				this.method593(this.method688(aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt728, aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt729, 899, this.anInt894) - 50, local37, local37 * 3 + 600, local76, this.anInt971, this.anInt970);
			}
			if (this.aBoolean201) {
				local37 = this.method701();
			} else {
				local37 = this.method700();
			}
			local76 = this.anInt1030;
			@Pc(120) int local120 = this.anInt1031;
			@Pc(123) int local123 = this.anInt1032;
			@Pc(126) int local126 = this.anInt1033;
			@Pc(129) int local129 = this.anInt1034;
			@Pc(178) int local178;
			for (@Pc(131) int local131 = 0; local131 < 5; local131++) {
				if (this.aBooleanArray12[local131]) {
					local178 = (int) (Math.random() * (double) (this.anIntArray242[local131] * 2 + 1) - (double) this.anIntArray242[local131] + Math.sin((double) this.anIntArray268[local131] * ((double) this.anIntArray274[local131] / 100.0D)) * (double) this.anIntArray237[local131]);
					if (local131 == 0) {
						this.anInt1030 += local178;
					}
					if (local131 == 1) {
						this.anInt1031 += local178;
					}
					if (local131 == 2) {
						this.anInt1032 += local178;
					}
					if (local131 == 3) {
						this.anInt1034 = this.anInt1034 + local178 & 0x7FF;
					}
					if (local131 == 4) {
						this.anInt1033 += local178;
						if (this.anInt1033 < 128) {
							this.anInt1033 = 128;
						}
						if (this.anInt1033 > 383) {
							this.anInt1033 = 383;
						}
					}
				}
			}
			local178 = Class3_Sub1_Sub2_Sub2.anInt136;
			Class3_Sub1_Sub1_Sub5.aBoolean140 = true;
			Class3_Sub1_Sub1_Sub5.anInt637 = 0;
			Class3_Sub1_Sub1_Sub5.anInt635 = super.anInt804 - 4;
			Class3_Sub1_Sub1_Sub5.anInt636 = super.anInt805 - 4;
			Class3_Sub1_Sub2.method519();
			this.aClass25_1.method287(this.anInt1032, this.anInt1030, this.anInt1031, this.anInt1033, this.anInt1034, local37);
			this.aClass25_1.method262();
			this.method653();
			this.method602();
			this.method699(local178);
			this.method648(this.anInt902);
			this.aClass13_5.method158(4, super.aGraphics2, 4);
			this.anInt1030 = local76;
			this.anInt1031 = local120;
			this.anInt1032 = local123;
			this.anInt1033 = local126;
			if (arg0 >= 0) {
				this.aClass3_Sub1_Sub4_7.method448(10);
			}
			this.anInt1034 = local129;
		} catch (@Pc(324) RuntimeException local324) {
			signlink.reporterror("52402, " + arg0 + ", " + local324.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZILclient!WSNKRVXZ;)V")
	private void method690(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub1_Sub2_Sub4 arg2) {
		try {
			this.aBoolean206 &= true;
			@Pc(13) int local13 = arg1 * arg1 + arg0 * arg0;
			if (local13 > 4225 && local13 < 90000) {
				@Pc(27) int local27 = this.anInt858 + this.anInt855 & 0x7FF;
				@Pc(31) int local31 = Class3_Sub1_Sub1_Sub5.anIntArray166[local27];
				@Pc(35) int local35 = Class3_Sub1_Sub1_Sub5.anIntArray167[local27];
				@Pc(44) int local44 = local31 * 256 / (this.anInt989 + 256);
				@Pc(53) int local53 = local35 * 256 / (this.anInt989 + 256);
				@Pc(63) int local63 = arg0 * local44 + arg1 * local53 >> 16;
				@Pc(73) int local73 = arg0 * local53 - arg1 * local44 >> 16;
				@Pc(79) double local79 = Math.atan2((double) local63, (double) local73);
				@Pc(85) int local85 = (int) (Math.sin(local79) * 63.0D);
				@Pc(91) int local91 = (int) (Math.cos(local79) * 57.0D);
				this.aClass3_Sub1_Sub2_Sub4_14.method538(local85 + 94 + 4 - 10, local79, 83 - local91 - 20);
			} else {
				this.method682(arg0, arg1, arg2);
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("45976, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method691() {
		try {
			for (@Pc(6) Class3_Sub1_Sub1_Sub6 local6 = (Class3_Sub1_Sub1_Sub6) this.aClass44_10.method439(); local6 != null; local6 = (Class3_Sub1_Sub1_Sub6) this.aClass44_10.method441()) {
				if (local6.anInt677 != this.anInt894 || anInt919 > local6.anInt686) {
					local6.method514();
				} else if (anInt919 >= local6.anInt685) {
					if (local6.anInt684 > 0) {
						@Pc(36) Class3_Sub1_Sub1_Sub4_Sub1 local36 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local6.anInt684 - 1];
						if (local36 != null && local36.anInt728 >= 0 && local36.anInt728 < 13312 && local36.anInt729 >= 0 && local36.anInt729 < 13312) {
							local6.method501(local36.anInt729, local36.anInt728, this.method688(local36.anInt728, local36.anInt729, 899, local6.anInt677) - local6.anInt676, anInt919);
						}
					}
					if (local6.anInt684 < 0) {
						@Pc(81) int local81 = -local6.anInt684 - 1;
						@Pc(87) Class3_Sub1_Sub1_Sub4_Sub2 local87;
						if (local81 == this.anInt1003) {
							local87 = aClass3_Sub1_Sub1_Sub4_Sub2_1;
						} else {
							local87 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local81];
						}
						if (local87 != null && local87.anInt728 >= 0 && local87.anInt728 < 13312 && local87.anInt729 >= 0 && local87.anInt729 < 13312) {
							local6.method501(local87.anInt729, local87.anInt728, this.method688(local87.anInt728, local87.anInt729, 899, local6.anInt677) - local6.anInt676, anInt919);
						}
					}
					local6.method500(this.anInt880, this.anInt938);
					this.aClass25_1.method259(false, this.anInt894, local6, local6.anInt678, (int) local6.aDouble6, 60, (int) local6.aDouble7, (int) local6.aDouble5, -1);
				}
			}
			anInt959++;
			if (anInt959 > 1602) {
				anInt959 = 0;
				this.aClass3_Sub1_Sub4_7.method447(138);
				this.aClass3_Sub1_Sub4_7.method448(0);
				@Pc(195) int local195 = this.aClass3_Sub1_Sub4_7.anInt666;
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass3_Sub1_Sub4_7.method448(0);
				}
				this.aClass3_Sub1_Sub4_7.method449(63187);
				this.aClass3_Sub1_Sub4_7.method448(25);
				this.aClass3_Sub1_Sub4_7.method448(148);
				this.aClass3_Sub1_Sub4_7.method448((int) (Math.random() * 256.0D));
				this.aClass3_Sub1_Sub4_7.method448(111);
				this.aClass3_Sub1_Sub4_7.method449(13097);
				this.aClass3_Sub1_Sub4_7.method448(50);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass3_Sub1_Sub4_7.method449(42137);
				}
				this.aClass3_Sub1_Sub4_7.method448((int) (Math.random() * 256.0D));
				this.aClass3_Sub1_Sub4_7.method457(this.aClass3_Sub1_Sub4_7.anInt666 - local195);
			}
		} catch (@Pc(262) RuntimeException local262) {
			signlink.reporterror("7925, " + 0 + ", " + local262.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)Ljava/lang/String;")
	private String method692() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("41511, " + false + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
	private void method693() {
		try {
			try {
				@Pc(13) int local13 = aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt728 + this.anInt925;
				@Pc(19) int local19 = aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt729 + this.anInt922;
				if (this.anInt970 - local13 < -500 || this.anInt970 - local13 > 500 || this.anInt971 - local19 < -500 || this.anInt971 - local19 > 500) {
					this.anInt970 = local13;
					this.anInt971 = local19;
				}
				if (this.anInt970 != local13) {
					this.anInt970 += (local13 - this.anInt970) / 16;
				}
				if (this.anInt971 != local19) {
					this.anInt971 += (local19 - this.anInt971) / 16;
				}
				if (super.anIntArray210[1] == 1) {
					this.anInt859 += (-this.anInt859 - 24) / 2;
				} else if (super.anIntArray210[2] == 1) {
					this.anInt859 += (24 - this.anInt859) / 2;
				} else {
					this.anInt859 /= 2;
				}
				if (super.anIntArray210[3] == 1) {
					this.anInt860 += (12 - this.anInt860) / 2;
				} else if (super.anIntArray210[4] == 1) {
					this.anInt860 += (-this.anInt860 - 12) / 2;
				} else {
					this.anInt860 /= 2;
				}
				this.anInt858 = this.anInt858 + this.anInt859 / 2 & 0x7FF;
				this.anInt857 += this.anInt860 / 2;
				if (this.anInt857 < 128) {
					this.anInt857 = 128;
				}
				if (this.anInt857 > 383) {
					this.anInt857 = 383;
				}
				@Pc(206) int local206 = this.anInt970 >> 7;
				@Pc(211) int local211 = this.anInt971 >> 7;
				@Pc(221) int local221 = this.method688(this.anInt970, this.anInt971, 899, this.anInt894);
				@Pc(223) int local223 = 0;
				@Pc(239) int local239;
				if (local206 > 3 && local211 > 3 && local206 < 100 && local211 < 100) {
					for (local239 = local206 - 4; local239 <= local206 + 4; local239++) {
						for (@Pc(245) int local245 = local211 - 4; local245 <= local211 + 4; local245++) {
							@Pc(250) int local250 = this.anInt894;
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
				if (local239 > this.anInt1017) {
					this.anInt1017 += (local239 - this.anInt1017) / 24;
				} else if (local239 < this.anInt1017) {
					this.anInt1017 += (local239 - this.anInt1017) / 80;
				}
			} catch (@Pc(341) Exception local341) {
				signlink.reporterror("glfc_ex " + aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt728 + "," + aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt729 + "," + this.anInt970 + "," + this.anInt971 + "," + this.anInt912 + "," + this.anInt913 + "," + this.anInt946 + "," + this.anInt947);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(391) RuntimeException local391) {
			signlink.reporterror("78498, " + -25 + ", " + local391.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!QQMJEFXK;B)Z")
	private boolean method694(@OriginalArg(0) Class32 arg0) {
		try {
			if (arg0.anIntArray103 == null) {
				return false;
			}
			for (@Pc(11) int local11 = 0; local11 < arg0.anIntArray103.length; local11++) {
				@Pc(19) int local19 = this.method686(arg0, local11);
				@Pc(24) int local24 = arg0.anIntArray98[local11];
				if (arg0.anIntArray103[local11] == 2) {
					if (local19 >= local24) {
						return false;
					}
				} else if (arg0.anIntArray103[local11] == 3) {
					if (local19 <= local24) {
						return false;
					}
				} else if (arg0.anIntArray103[local11] == 4) {
					if (local19 == local24) {
						return false;
					}
				} else if (local19 != local24) {
					return false;
				}
			}
			return true;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("35668, " + arg0 + ", " + 77 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method695(@OriginalArg(0) int arg0) {
		try {
			if (this.aClass13_7 == null) {
				super.aClass13_2 = null;
				this.aClass13_6 = null;
				this.aClass13_4 = null;
				this.aClass13_3 = null;
				this.aClass13_5 = null;
				this.aClass13_25 = null;
				this.aClass13_26 = null;
				@Pc(28) boolean local28 = false;
				this.aClass13_27 = null;
				this.aClass13_10 = new Class13(3, 265, 128, this.method585());
				Class3_Sub1_Sub2.method519();
				this.aClass13_11 = new Class13(3, 265, 128, this.method585());
				Class3_Sub1_Sub2.method519();
				this.aClass13_7 = new Class13(3, 171, 509, this.method585());
				Class3_Sub1_Sub2.method519();
				this.aClass13_8 = new Class13(3, 132, 360, this.method585());
				Class3_Sub1_Sub2.method519();
				this.aClass13_9 = new Class13(3, 200, 360, this.method585());
				Class3_Sub1_Sub2.method519();
				this.aClass13_12 = new Class13(3, 238, 202, this.method585());
				Class3_Sub1_Sub2.method519();
				this.aClass13_13 = new Class13(3, 238, 203, this.method585());
				Class3_Sub1_Sub2.method519();
				this.aClass13_14 = new Class13(3, 94, 74, this.method585());
				Class3_Sub1_Sub2.method519();
				this.aClass13_15 = new Class13(3, 94, 75, this.method585());
				Class3_Sub1_Sub2.method519();
				if (this.aClass35_2 != null) {
					this.method707();
					this.method615();
				}
				this.aBoolean210 = true;
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("77242, " + arg0 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(JI)V")
	private void method696(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 != 0L) {
				if (this.anInt1046 >= 100) {
					this.method603(0, "", "Your ignore list is full. Max of 100 hit");
				} else {
					@Pc(23) String local23 = Class15.method202(Class15.method199(arg0));
					for (@Pc(25) int local25 = 0; local25 < this.anInt1046; local25++) {
						if (this.aLongArray4[local25] == arg0) {
							this.method603(0, "", local23 + " is already on your ignore list");
							return;
						}
					}
					for (@Pc(55) int local55 = 0; local55 < this.anInt907; local55++) {
						if (this.aLongArray3[local55] == arg0) {
							this.method603(0, "", "Please remove " + local23 + " from your friend list first");
							return;
						}
					}
					this.anInt870 += arg1;
					this.aLongArray4[this.anInt1046++] = arg0;
					this.aBoolean207 = true;
					this.aClass3_Sub1_Sub4_7.method447(200);
					this.aClass3_Sub1_Sub4_7.method454(arg0);
				}
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("45854, " + arg0 + ", " + arg1 + ", " + local116.toString());
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
				return new URL("http://127.0.0.1:" + (anInt865 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aClass3_Sub1_Sub2_Sub3_8.method369(arg2, arg0);
			this.aClass3_Sub1_Sub2_Sub3_9.method369(arg2, arg0 + arg1 - 16);
			Class3_Sub1_Sub2.method521(16, this.anInt941, arg1 - 32, arg2, this.aByte44, arg0 + 16);
			@Pc(36) int local36 = (arg1 - 32) * arg1 / arg3;
			if (local36 < 8) {
				local36 = 8;
			}
			@Pc(53) int local53 = (arg1 - local36 - 32) * arg4 / (arg3 - arg1);
			Class3_Sub1_Sub2.method521(16, this.anInt1042, local36, arg2, this.aByte44, arg0 + local53 + 16);
			Class3_Sub1_Sub2.method526(local36, (byte) 1, this.anInt863, arg0 + local53 + 16, arg2);
			Class3_Sub1_Sub2.method526(local36, (byte) 1, this.anInt863, arg0 + local53 + 16, arg2 + 1);
			Class3_Sub1_Sub2.method524(arg0 + local53 + 16, this.anInt863, 16, arg2);
			Class3_Sub1_Sub2.method524(arg0 + local53 + 17, this.anInt863, 16, arg2);
			Class3_Sub1_Sub2.method526(local36, (byte) 1, this.anInt1049, arg0 + local53 + 16, arg2 + 15);
			Class3_Sub1_Sub2.method526(local36 - 1, (byte) 1, this.anInt1049, arg0 + local53 + 17, arg2 + 14);
			Class3_Sub1_Sub2.method524(arg0 + local53 + local36 + 15, this.anInt1049, 16, arg2);
			Class3_Sub1_Sub2.method524(arg0 + local53 + local36 + 14, this.anInt1049, 15, arg2 + 1);
		} catch (@Pc(174) RuntimeException local174) {
			signlink.reporterror("63451, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 2 + ", " + arg4 + ", " + local174.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method698() {
		try {
			if (this.anInt1045 >= 2 || this.anInt889 != 0 || this.anInt1050 != 0) {
				@Pc(39) String local39;
				if (this.anInt889 == 1 && this.anInt1045 < 2) {
					local39 = "Use " + this.aString20 + " with...";
				} else if (this.anInt1050 == 1 && this.anInt1045 < 2) {
					local39 = this.aString31 + "...";
				} else {
					local39 = this.aStringArray13[this.anInt1045 - 1];
				}
				if (this.anInt1045 > 2) {
					local39 = local39 + "@whi@ / " + (this.anInt1045 - 2) + " more options";
				}
				this.aClass3_Sub1_Sub2_Sub1_4.method54(4, 15, anInt919 / 1000, local39, 16777215);
			}
		} catch (@Pc(103) RuntimeException local103) {
			signlink.reporterror("48500, " + -213 + ", " + local103.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(II)V")
	private void method699(@OriginalArg(1) int arg0) {
		try {
			if (!aBoolean203) {
				for (@Pc(11) int local11 = 0; local11 < this.anIntArray234.length; local11++) {
					@Pc(18) int local18 = this.anIntArray234[local11];
					if (Class3_Sub1_Sub2_Sub2.anIntArray31[local18] >= arg0) {
						@Pc(27) Class3_Sub1_Sub2_Sub3 local27 = Class3_Sub1_Sub2_Sub2.aClass3_Sub1_Sub2_Sub3Array1[local18];
						@Pc(35) int local35 = local27.anInt547 * local27.anInt548 - 1;
						@Pc(43) int local43 = local27.anInt547 * this.anInt880 * 2;
						@Pc(46) byte[] local46 = local27.aByteArray16;
						@Pc(49) byte[] local49 = this.aByteArray21;
						for (@Pc(51) int local51 = 0; local51 <= local35; local51++) {
							local49[local51] = local46[local51 - local43 & local35];
						}
						local27.aByteArray16 = local49;
						this.aByteArray21 = local46;
						Class3_Sub1_Sub2_Sub2.method105(local18, 59);
					}
				}
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("86080, " + 1 + ", " + arg0 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)I")
	private int method700() {
		try {
			@Pc(7) int local7 = 3;
			if (this.anInt1033 < 310) {
				@Pc(16) int local16 = this.anInt1030 >> 7;
				@Pc(21) int local21 = this.anInt1032 >> 7;
				@Pc(26) int local26 = aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt728 >> 7;
				@Pc(31) int local31 = aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt729 >> 7;
				if ((this.aByteArrayArrayArray8[this.anInt894][local16][local21] & 0x4) != 0) {
					local7 = this.anInt894;
				}
				@Pc(53) int local53;
				if (local26 > local16) {
					local53 = local26 - local16;
				} else {
					local53 = local16 - local26;
				}
				@Pc(66) int local66;
				if (local31 > local21) {
					local66 = local31 - local21;
				} else {
					local66 = local21 - local31;
				}
				@Pc(81) int local81;
				@Pc(83) int local83;
				if (local53 > local66) {
					local81 = local66 * 65536 / local53;
					local83 = 32768;
					while (local16 != local26) {
						if (local16 < local26) {
							local16++;
						} else if (local16 > local26) {
							local16--;
						}
						if ((this.aByteArrayArrayArray8[this.anInt894][local16][local21] & 0x4) != 0) {
							local7 = this.anInt894;
						}
						local83 += local81;
						if (local83 >= 65536) {
							local83 -= 65536;
							if (local21 < local31) {
								local21++;
							} else if (local21 > local31) {
								local21--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt894][local16][local21] & 0x4) != 0) {
								local7 = this.anInt894;
							}
						}
					}
				} else {
					local81 = local53 * 65536 / local66;
					local83 = 32768;
					while (local21 != local31) {
						if (local21 < local31) {
							local21++;
						} else if (local21 > local31) {
							local21--;
						}
						if ((this.aByteArrayArrayArray8[this.anInt894][local16][local21] & 0x4) != 0) {
							local7 = this.anInt894;
						}
						local83 += local81;
						if (local83 >= 65536) {
							local83 -= 65536;
							if (local16 < local26) {
								local16++;
							} else if (local16 > local26) {
								local16--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt894][local16][local21] & 0x4) != 0) {
								local7 = this.anInt894;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray8[this.anInt894][aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt728 >> 7][aClass3_Sub1_Sub1_Sub4_Sub2_1.anInt729 >> 7] & 0x4) != 0) {
				local7 = this.anInt894;
			}
			return local7;
		} catch (@Pc(248) RuntimeException local248) {
			signlink.reporterror("64619, " + -521 + ", " + local248.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)I")
	private int method701() {
		try {
			@Pc(9) int local9 = this.method688(this.anInt1030, this.anInt1032, 899, this.anInt894);
			return local9 - this.anInt1031 >= 800 || (this.aByteArrayArrayArray8[this.anInt894][this.anInt1030 >> 7][this.anInt1032 >> 7] & 0x4) == 0 ? 3 : this.anInt894;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("96680, " + false + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IZ)V")
	private void method702(@OriginalArg(1) boolean arg0) {
		try {
			this.method695(560);
			this.aClass13_9.method157(this.aBoolean229);
			this.aClass3_Sub1_Sub2_Sub3_1.method369(0, 0);
			@Pc(45) byte local45;
			@Pc(57) int local57;
			if (this.anInt1019 == 0) {
				this.aClass3_Sub1_Sub2_Sub1_2.method46(this.aClass16_Sub1_1.aString4, 180, true, 180, 7711145);
				local45 = 80;
				this.aClass3_Sub1_Sub2_Sub1_4.method46("Welcome to RuneScape", 80, true, 180, 16776960);
				local57 = local45 + 30;
				this.aClass3_Sub1_Sub2_Sub3_2.method369(27, 100);
				this.aClass3_Sub1_Sub2_Sub1_4.method46("New User", 125, true, 100, 16777215);
				this.aClass3_Sub1_Sub2_Sub3_2.method369(187, 100);
				this.aClass3_Sub1_Sub2_Sub1_4.method46("Existing User", 125, true, 260, 16777215);
			}
			if (this.anInt1019 == 2) {
				local45 = 60;
				if (this.aString27.length() > 0) {
					this.aClass3_Sub1_Sub2_Sub1_4.method46(this.aString27, 45, true, 180, 16776960);
					this.aClass3_Sub1_Sub2_Sub1_4.method46(this.aString28, 60, true, 180, 16776960);
					local57 = local45 + 30;
				} else {
					this.aClass3_Sub1_Sub2_Sub1_4.method46(this.aString28, 53, true, 180, 16776960);
					local57 = local45 + 30;
				}
				this.aClass3_Sub1_Sub2_Sub1_4.method53((byte) 1, true, 90, 16777215, 90, "Username: " + this.aString22 + (this.anInt960 == 0 & anInt919 % 40 < 20 ? "@yel@|" : ""));
				local57 += 15;
				this.aClass3_Sub1_Sub2_Sub1_4.method53((byte) 1, true, 105, 16777215, 92, "Password: " + Class15.method203(this.aString23) + (this.anInt960 == 1 & anInt919 % 40 < 20 ? "@yel@|" : ""));
				local57 += 15;
				if (!arg0) {
					this.aClass3_Sub1_Sub2_Sub3_2.method369(27, 130);
					this.aClass3_Sub1_Sub2_Sub1_4.method46("Login", 155, true, 100, 16777215);
					this.aClass3_Sub1_Sub2_Sub3_2.method369(187, 130);
					this.aClass3_Sub1_Sub2_Sub1_4.method46("Cancel", 155, true, 260, 16777215);
				}
			}
			if (this.anInt1019 == 3) {
				this.aClass3_Sub1_Sub2_Sub1_4.method46("Create a free account", 40, true, 180, 16776960);
				local45 = 65;
				this.aClass3_Sub1_Sub2_Sub1_4.method46("To create a new account you need to", 65, true, 180, 16777215);
				local57 = local45 + 15;
				this.aClass3_Sub1_Sub2_Sub1_4.method46("go back to the main RuneScape webpage", 80, true, 180, 16777215);
				local57 += 15;
				this.aClass3_Sub1_Sub2_Sub1_4.method46("and choose the 'create account'", 95, true, 180, 16777215);
				local57 += 15;
				this.aClass3_Sub1_Sub2_Sub1_4.method46("button near the top of that page.", 110, true, 180, 16777215);
				local57 += 15;
				this.aClass3_Sub1_Sub2_Sub3_2.method369(107, 130);
				this.aClass3_Sub1_Sub2_Sub1_4.method46("Cancel", 155, true, 180, 16777215);
			}
			this.aClass13_9.method158(171, super.aGraphics2, 202);
			if (9 == this.anInt1024 && this.aBoolean210) {
				this.aBoolean210 = false;
				this.aClass13_7.method158(0, super.aGraphics2, 128);
				this.aClass13_8.method158(371, super.aGraphics2, 202);
				this.aClass13_12.method158(265, super.aGraphics2, 0);
				this.aClass13_13.method158(265, super.aGraphics2, 562);
				this.aClass13_14.method158(171, super.aGraphics2, 128);
				this.aClass13_15.method158(171, super.aGraphics2, 562);
			}
		} catch (@Pc(495) RuntimeException local495) {
			signlink.reporterror("15246, " + 9 + ", " + arg0 + ", " + local495.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method703(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null || arg0.length() == 0) {
				this.anInt868 = 0;
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
						this.anInt868 = 0;
						label49: for (local21 = 0; local21 < Class10.anInt142; local21++) {
							@Pc(74) Class10 local74 = Class10.method118(local21);
							if (local74.anInt141 == -1 && local74.aString3 != null) {
								@Pc(85) String local85 = local74.aString3.toLowerCase();
								for (@Pc(87) int local87 = 0; local87 < local17; local87++) {
									if (local85.indexOf(local15[local87]) == -1) {
										continue label49;
									}
								}
								this.aStringArray8[this.anInt868] = local85;
								this.anIntArray221[this.anInt868] = local21;
								this.anInt868++;
								if (this.anInt868 >= this.aStringArray8.length) {
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
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("30156, " + 8 + ", " + arg0 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!WNCFPLWV;Z)V")
	private void method704(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub4 arg1) {
		try {
			@Pc(17) int local17;
			@Pc(21) int local21;
			@Pc(25) int local25;
			@Pc(33) int local33;
			@Pc(52) int local52;
			@Pc(30) int local30;
			@Pc(42) int local42;
			@Pc(49) int local49;
			if (arg0 == 101) {
				local17 = arg1.method476();
				local21 = local17 >> 2;
				local25 = local17 & 0x3;
				local30 = this.anIntArray259[local21];
				local33 = arg1.method458();
				local42 = this.anInt895 + (local33 >> 4 & 0x7);
				local49 = this.anInt896 + (local33 & 0x7);
				local52 = arg1.method460();
				if (local42 >= 0 && local49 >= 0 && local42 < 104 && local49 < 104) {
					this.method598(-1, local42, local25, local30, this.anInt894, 0, local21, local52, local49);
				}
			} else if (arg0 == 177) {
				local17 = arg1.method458();
				local21 = this.anInt895 + (local17 >> 4 & 0x7);
				local25 = this.anInt896 + (local17 & 0x7);
				local30 = arg1.method460();
				local33 = arg1.method458();
				local42 = arg1.method460();
				if (local21 >= 0 && local25 >= 0 && local21 < 104 && local25 < 104) {
					local21 = local21 * 128 + 64;
					local25 = local25 * 128 + 64;
					@Pc(150) Class3_Sub1_Sub1_Sub3 local150 = new Class3_Sub1_Sub1_Sub3(this.anInt894, local25, local42, local30, anInt919, this.method688(local21, local25, 899, this.anInt894) - local33, local21, (byte) 1);
					this.aClass44_11.method436(local150);
				}
			} else if (arg0 == 79) {
				local17 = arg1.method476();
				local21 = this.anInt895 + (local17 >> 4 & 0x7);
				local25 = this.anInt896 + (local17 & 0x7);
				local30 = arg1.method485((byte) 6);
				local33 = arg1.method487();
				local42 = arg1.method486(255);
				if (local21 >= 0 && local25 >= 0 && local21 < 104 && local25 < 104 && local30 != this.anInt1003) {
					@Pc(208) Class3_Sub1_Sub1_Sub1 local208 = new Class3_Sub1_Sub1_Sub1();
					local208.anInt206 = local42;
					local208.anInt205 = local33;
					if (this.aClass44ArrayArrayArray1[this.anInt894][local21][local25] == null) {
						this.aClass44ArrayArrayArray1[this.anInt894][local21][local25] = new Class44(aByte38);
					}
					this.aClass44ArrayArrayArray1[this.anInt894][local21][local25].method436(local208);
					this.method669(local21, local25);
				}
			} else {
				@Pc(300) int local300;
				@Pc(304) int local304;
				@Pc(309) int local309;
				@Pc(313) int local313;
				@Pc(320) int local320;
				if (arg0 == 152) {
					local17 = arg1.method478();
					local21 = this.anInt895 + (local17 >> 4 & 0x7);
					local25 = this.anInt896 + (local17 & 0x7);
					@Pc(280) byte local280 = arg1.method479();
					local33 = arg1.method486(255);
					@Pc(288) byte local288 = arg1.method481();
					@Pc(292) byte local292 = arg1.method479();
					local52 = arg1.method478();
					local300 = local52 >> 2;
					local304 = local52 & 0x3;
					local309 = this.anIntArray259[local300];
					local313 = arg1.method487();
					@Pc(316) byte local316 = arg1.method459();
					local320 = arg1.method485((byte) 6);
					@Pc(324) int local324 = arg1.method486(255);
					@Pc(330) Class3_Sub1_Sub1_Sub4_Sub2 local330;
					if (local320 == this.anInt1003) {
						local330 = aClass3_Sub1_Sub1_Sub4_Sub2_1;
					} else {
						local330 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local320];
					}
					if (local330 != null) {
						@Pc(342) Class8 local342 = Class8.method70(local313);
						@Pc(352) int local352 = this.anIntArrayArrayArray8[this.anInt894][local21][local25];
						@Pc(364) int local364 = this.anIntArrayArrayArray8[this.anInt894][local21 + 1][local25];
						@Pc(378) int local378 = this.anIntArrayArrayArray8[this.anInt894][local21 + 1][local25 + 1];
						@Pc(390) int local390 = this.anIntArrayArrayArray8[this.anInt894][local21][local25 + 1];
						@Pc(400) Class3_Sub1_Sub1_Sub5 local400 = local342.method76(local300, local304, local352, local364, local378, local390, -1);
						if (local400 != null) {
							this.method598(local33 + 1, local21, 0, local309, this.anInt894, local324 + 1, 0, -1, local25);
							local330.anInt737 = local324 + anInt919;
							local330.anInt738 = local33 + anInt919;
							local330.aClass3_Sub1_Sub1_Sub5_2 = local400;
							@Pc(435) int local435 = local342.anInt102;
							@Pc(438) int local438 = local342.anInt110;
							if (local304 == 1 || local304 == 3) {
								local435 = local342.anInt110;
								local438 = local342.anInt102;
							}
							local330.anInt740 = local21 * 128 + local435 * 64;
							local330.anInt742 = local25 * 128 + local438 * 64;
							local330.anInt741 = this.method688(local330.anInt740, local330.anInt742, 899, this.anInt894);
							@Pc(484) byte local484;
							if (local316 > local288) {
								local484 = local316;
								local316 = local288;
								local288 = local484;
							}
							if (local280 > local292) {
								local484 = local280;
								local280 = local292;
								local292 = local484;
							}
							local330.anInt745 = local21 + local316;
							local330.anInt747 = local21 + local288;
							local330.anInt746 = local25 + local280;
							local330.anInt748 = local25 + local292;
						}
					}
				}
				if (arg0 == 185) {
					local17 = arg1.method458();
					local21 = this.anInt895 + (local17 >> 4 & 0x7);
					local25 = this.anInt896 + (local17 & 0x7);
					local30 = local21 + arg1.method459();
					local33 = local25 + arg1.method459();
					local42 = arg1.method461();
					local49 = arg1.method460();
					local52 = arg1.method458() * 4;
					local300 = arg1.method458() * 4;
					local304 = arg1.method460();
					local309 = arg1.method460();
					local313 = arg1.method458();
					@Pc(577) int local577 = arg1.method458();
					if (local21 >= 0 && local25 >= 0 && local21 < 104 && local25 < 104 && local30 >= 0 && local33 >= 0 && local30 < 104 && local33 < 104 && local49 != 65535) {
						local21 = local21 * 128 + 64;
						local25 = local25 * 128 + 64;
						local30 = local30 * 128 + 64;
						local33 = local33 * 128 + 64;
						@Pc(653) Class3_Sub1_Sub1_Sub6 local653 = new Class3_Sub1_Sub1_Sub6(this.anInt894, local300, local25, local577, local21, this.method688(local21, local25, 899, this.anInt894) - local52, local313, (byte) -30, local304 + anInt919, local309 + anInt919, local49, local42);
						local653.method501(local33, local30, this.method688(local30, local33, 899, this.anInt894) - local300, local304 + anInt919);
						this.aClass44_10.method436(local653);
					}
				} else {
					@Pc(720) Class3_Sub1_Sub1_Sub1 local720;
					if (arg0 == 94) {
						local17 = arg1.method487();
						local21 = arg1.method485((byte) 6);
						local25 = arg1.method478();
						local30 = this.anInt895 + (local25 >> 4 & 0x7);
						local33 = this.anInt896 + (local25 & 0x7);
						if (local30 >= 0 && local33 >= 0 && local30 < 104 && local33 < 104) {
							local720 = new Class3_Sub1_Sub1_Sub1();
							local720.anInt206 = local21;
							local720.anInt205 = local17;
							if (this.aClass44ArrayArrayArray1[this.anInt894][local30][local33] == null) {
								this.aClass44ArrayArrayArray1[this.anInt894][local30][local33] = new Class44(aByte38);
							}
							this.aClass44ArrayArrayArray1[this.anInt894][local30][local33].method436(local720);
							this.method669(local30, local33);
						}
					} else if (arg0 == 115) {
						local17 = arg1.method487();
						local21 = arg1.method477();
						local25 = this.anInt895 + (local21 >> 4 & 0x7);
						local30 = this.anInt896 + (local21 & 0x7);
						local33 = arg1.method476();
						local42 = local33 >> 2;
						local49 = local33 & 0x3;
						local52 = this.anIntArray259[local42];
						if (local25 >= 0 && local30 >= 0 && local25 < 103 && local30 < 103) {
							local300 = this.anIntArrayArrayArray8[this.anInt894][local25][local30];
							local304 = this.anIntArrayArrayArray8[this.anInt894][local25 + 1][local30];
							local309 = this.anIntArrayArrayArray8[this.anInt894][local25 + 1][local30 + 1];
							local313 = this.anIntArrayArrayArray8[this.anInt894][local25][local30 + 1];
							if (local52 == 0) {
								@Pc(878) Class34 local878 = this.aClass25_1.method270(this.anInt894, local30, local25);
								if (local878 != null) {
									local320 = local878.anInt459 >> 14 & 0x7FFF;
									if (local42 == 2) {
										local878.aClass3_Sub1_Sub1_4 = new Class3_Sub1_Sub1_Sub2(local309, local304, local313, false, true, local300, 2, local49 + 4, local320, local17);
										local878.aClass3_Sub1_Sub1_5 = new Class3_Sub1_Sub1_Sub2(local309, local304, local313, false, true, local300, 2, local49 + 1 & 0x3, local320, local17);
									} else {
										local878.aClass3_Sub1_Sub1_4 = new Class3_Sub1_Sub1_Sub2(local309, local304, local313, false, true, local300, local42, local49, local320, local17);
									}
								}
							}
							if (local52 == 1) {
								@Pc(955) Class12 local955 = this.aClass25_1.method271(local25, local30, this.anInt894);
								if (local955 != null) {
									local955.aClass3_Sub1_Sub1_3 = new Class3_Sub1_Sub1_Sub2(local309, local304, local313, false, true, local300, 4, 0, local955.anInt180 >> 14 & 0x7FFF, local17);
								}
							}
							if (local52 == 2) {
								@Pc(989) Class1 local989 = this.aClass25_1.method272(local30, local25, this.anInt894);
								if (local42 == 11) {
									local42 = 10;
								}
								if (local989 != null) {
									local989.aClass3_Sub1_Sub1_1 = new Class3_Sub1_Sub1_Sub2(local309, local304, local313, false, true, local300, local42, local49, local989.anInt12 >> 14 & 0x7FFF, local17);
								}
							}
							if (local52 == 3) {
								@Pc(1029) Class6 local1029 = this.aClass25_1.method273(this.anInt944, local25, this.anInt894, local30);
								if (local1029 != null) {
									local1029.aClass3_Sub1_Sub1_2 = new Class3_Sub1_Sub1_Sub2(local309, local304, local313, false, true, local300, 22, local49, local1029.anInt90 >> 14 & 0x7FFF, local17);
								}
							}
						}
					} else if (arg0 == 45) {
						local17 = arg1.method487();
						local21 = arg1.method477();
						local25 = this.anInt895 + (local21 >> 4 & 0x7);
						local30 = this.anInt896 + (local21 & 0x7);
						if (local25 >= 0 && local30 >= 0 && local25 < 104 && local30 < 104) {
							@Pc(1099) Class44 local1099 = this.aClass44ArrayArrayArray1[this.anInt894][local25][local30];
							if (local1099 != null) {
								for (local720 = (Class3_Sub1_Sub1_Sub1) local1099.method439(); local720 != null; local720 = (Class3_Sub1_Sub1_Sub1) local1099.method441()) {
									if (local720.anInt206 == (local17 & 0x7FFF)) {
										local720.method514();
										break;
									}
								}
								if (local1099.method439() == null) {
									this.aClass44ArrayArrayArray1[this.anInt894][local25][local30] = null;
								}
								this.method669(local25, local30);
							}
						}
					} else if (arg0 == 57) {
						local17 = arg1.method476();
						local21 = local17 >> 2;
						local25 = local17 & 0x3;
						local30 = this.anIntArray259[local21];
						local33 = arg1.method478();
						local42 = this.anInt895 + (local33 >> 4 & 0x7);
						local49 = this.anInt896 + (local33 & 0x7);
						if (local42 >= 0 && local49 >= 0 && local42 < 104 && local49 < 104) {
							this.method598(-1, local42, local25, local30, this.anInt894, 0, local21, -1, local49);
						}
					} else {
						if (arg0 == 227) {
							local17 = arg1.method458();
							local21 = this.anInt895 + (local17 >> 4 & 0x7);
							local25 = this.anInt896 + (local17 & 0x7);
							local30 = arg1.method460();
							local33 = arg1.method458();
							local42 = local33 >> 4 & 0xF;
							local49 = local33 & 0x7;
							if (aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray174[0] >= local21 - local42 && aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray174[0] <= local21 + local42 && aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray175[0] >= local25 - local42 && aClass3_Sub1_Sub1_Sub4_Sub2_1.anIntArray175[0] <= local25 + local42 && this.aBoolean218 && !aBoolean203 && this.anInt983 < 50) {
								this.anIntArray247[this.anInt983] = local30;
								this.anIntArray212[this.anInt983] = local49;
								this.anIntArray257[this.anInt983] = Class41.anIntArray171[local30];
								this.anInt983++;
							}
						}
						if (arg0 == 206) {
							local17 = arg1.method458();
							local21 = this.anInt895 + (local17 >> 4 & 0x7);
							local25 = this.anInt896 + (local17 & 0x7);
							local30 = arg1.method460();
							local33 = arg1.method460();
							local42 = arg1.method460();
							if (local21 >= 0 && local25 >= 0 && local21 < 104 && local25 < 104) {
								@Pc(1362) Class44 local1362 = this.aClass44ArrayArrayArray1[this.anInt894][local21][local25];
								if (local1362 != null) {
									for (@Pc(1368) Class3_Sub1_Sub1_Sub1 local1368 = (Class3_Sub1_Sub1_Sub1) local1362.method439(); local1368 != null; local1368 = (Class3_Sub1_Sub1_Sub1) local1362.method441()) {
										if (local1368.anInt206 == (local30 & 0x7FFF) && local1368.anInt205 == local33) {
											local1368.anInt205 = local42;
											break;
										}
									}
									this.method669(local21, local25);
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1398) RuntimeException local1398) {
			signlink.reporterror("10865, " + arg0 + ", " + arg1 + ", " + false + ", " + local1398.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private void method705() {
		try {
			this.anInt870 += 0;
			if (aBoolean203 && this.anInt1044 == 2 && Class47.anInt787 != this.anInt894) {
				this.method609("Loading - please wait.", null);
				this.anInt1044 = 1;
				this.aLong32 = System.currentTimeMillis();
			}
			if (this.anInt1044 == 1) {
				@Pc(34) int local34 = this.method706((byte) 4);
				if (local34 != 0 && System.currentTimeMillis() - this.aLong32 > 360000L) {
					signlink.reporterror(this.aString22 + " glcfb " + this.aLong31 + "," + local34 + "," + aBoolean203 + "," + this.aClass38Array1[0] + "," + this.aClass16_Sub1_1.method210() + "," + this.anInt894 + "," + this.anInt912 + "," + this.anInt913);
					this.aLong32 = System.currentTimeMillis();
				}
			}
			if (this.anInt1044 == 2 && this.anInt894 != this.anInt952) {
				this.anInt952 = this.anInt894;
				this.method631(this.anInt894);
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("56107, " + 0 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(B)I")
	private int method706(@OriginalArg(0) byte arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray6.length; local3++) {
				if (this.aByteArrayArray6[local3] == null && this.anIntArray232[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray5[local3] == null && this.anIntArray233[local3] != -1) {
					return -2;
				}
			}
			@Pc(39) boolean local39 = true;
			for (@Pc(41) int local41 = 0; local41 < this.aByteArrayArray6.length; local41++) {
				@Pc(48) byte[] local48 = this.aByteArrayArray5[local41];
				if (local48 != null) {
					@Pc(62) int local62 = (this.anIntArray231[local41] >> 8) * 64 - this.anInt946;
					@Pc(74) int local74 = (this.anIntArray231[local41] & 0xFF) * 64 - this.anInt947;
					if (this.aBoolean228) {
						local62 = 10;
						local74 = 10;
					}
					local39 &= Class47.method554(local62, local48, local74, 302);
				}
			}
			if (!local39) {
				return -3;
			} else if (this.aBoolean226) {
				return -4;
			} else {
				this.anInt1044 = 2;
				Class47.anInt787 = this.anInt894;
				this.method725();
				@Pc(118) boolean local118 = false;
				this.aClass3_Sub1_Sub4_7.method447(188);
				return 0;
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("5721, " + arg0 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private void method707() {
		try {
			@Pc(7) byte[] local7 = this.aClass35_2.method341("title.dat", null);
			@Pc(13) Class3_Sub1_Sub2_Sub4 local13 = new Class3_Sub1_Sub2_Sub4(local7, this);
			this.aClass13_10.method157(this.aBoolean229);
			local13.method531(0, 0);
			this.aClass13_11.method157(this.aBoolean229);
			local13.method531(0, -637);
			this.aClass13_7.method157(this.aBoolean229);
			local13.method531(0, -128);
			this.aClass13_8.method157(this.aBoolean229);
			local13.method531(-371, -202);
			this.aClass13_9.method157(this.aBoolean229);
			local13.method531(-171, -202);
			this.aClass13_12.method157(this.aBoolean229);
			local13.method531(-265, 0);
			this.aClass13_13.method157(this.aBoolean229);
			local13.method531(-265, -562);
			this.aClass13_14.method157(this.aBoolean229);
			local13.method531(-171, -128);
			this.aClass13_15.method157(this.aBoolean229);
			local13.method531(-171, -562);
			@Pc(107) int[] local107 = new int[local13.anInt770];
			for (@Pc(109) int local109 = 0; local109 < local13.anInt771; local109++) {
				for (@Pc(113) int local113 = 0; local113 < local13.anInt770; local113++) {
					local107[local113] = local13.anIntArray182[local13.anInt770 + local13.anInt770 * local109 - local113 - 1];
				}
				for (@Pc(139) int local139 = 0; local139 < local13.anInt770; local139++) {
					local13.anIntArray182[local139 + local13.anInt770 * local109] = local107[local139];
				}
			}
			this.aClass13_10.method157(this.aBoolean229);
			local13.method531(0, 382);
			this.aClass13_11.method157(this.aBoolean229);
			local13.method531(0, -255);
			this.aClass13_7.method157(this.aBoolean229);
			local13.method531(0, 254);
			this.aClass13_8.method157(this.aBoolean229);
			local13.method531(-371, 180);
			this.aClass13_9.method157(this.aBoolean229);
			local13.method531(-171, 180);
			this.aClass13_12.method157(this.aBoolean229);
			local13.method531(-265, 382);
			this.aClass13_13.method157(this.aBoolean229);
			local13.method531(-265, -180);
			this.aClass13_14.method157(this.aBoolean229);
			local13.method531(-171, 254);
			this.aClass13_15.method157(this.aBoolean229);
			local13.method531(-171, -180);
			local13 = new Class3_Sub1_Sub2_Sub4(this.aClass35_2, "logo", 0);
			this.aClass13_7.method157(this.aBoolean229);
			local13.method533(382 - local13.anInt770 / 2 - 128, 18);
			System.gc();
		} catch (@Pc(297) RuntimeException local297) {
			signlink.reporterror("25386, " + false + ", " + local297.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private void method708() {
		try {
			for (@Pc(6) Class3_Sub2 local6 = (Class3_Sub2) this.aClass44_12.method439(); local6 != null; local6 = (Class3_Sub2) this.aClass44_12.method441()) {
				if (local6.anInt260 == -1) {
					local6.anInt264 = 0;
					this.method675(local6);
				} else {
					local6.method514();
				}
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("24583, " + -58 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
	private void method709(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = 10 / arg0;
			if (super.anInt809 == 1) {
				if (super.anInt810 >= 539 && super.anInt810 <= 573 && super.anInt811 >= 169 && super.anInt811 < 205 && this.anIntArray256[0] != -1) {
					this.aBoolean207 = true;
					this.anInt994 = 0;
					this.aBoolean208 = true;
				}
				if (super.anInt810 >= 569 && super.anInt810 <= 599 && super.anInt811 >= 168 && super.anInt811 < 205 && this.anIntArray256[1] != -1) {
					this.aBoolean207 = true;
					this.anInt994 = 1;
					this.aBoolean208 = true;
				}
				if (super.anInt810 >= 597 && super.anInt810 <= 627 && super.anInt811 >= 168 && super.anInt811 < 205 && this.anIntArray256[2] != -1) {
					this.aBoolean207 = true;
					this.anInt994 = 2;
					this.aBoolean208 = true;
				}
				if (super.anInt810 >= 625 && super.anInt810 <= 669 && super.anInt811 >= 168 && super.anInt811 < 203 && this.anIntArray256[3] != -1) {
					this.aBoolean207 = true;
					this.anInt994 = 3;
					this.aBoolean208 = true;
				}
				if (super.anInt810 >= 666 && super.anInt810 <= 696 && super.anInt811 >= 168 && super.anInt811 < 205 && this.anIntArray256[4] != -1) {
					this.aBoolean207 = true;
					this.anInt994 = 4;
					this.aBoolean208 = true;
				}
				if (super.anInt810 >= 694 && super.anInt810 <= 724 && super.anInt811 >= 168 && super.anInt811 < 205 && this.anIntArray256[5] != -1) {
					this.aBoolean207 = true;
					this.anInt994 = 5;
					this.aBoolean208 = true;
				}
				if (super.anInt810 >= 722 && super.anInt810 <= 756 && super.anInt811 >= 169 && super.anInt811 < 205 && this.anIntArray256[6] != -1) {
					this.aBoolean207 = true;
					this.anInt994 = 6;
					this.aBoolean208 = true;
				}
				if (super.anInt810 >= 540 && super.anInt810 <= 574 && super.anInt811 >= 466 && super.anInt811 < 502 && this.anIntArray256[7] != -1) {
					this.aBoolean207 = true;
					this.anInt994 = 7;
					this.aBoolean208 = true;
				}
				if (super.anInt810 >= 572 && super.anInt810 <= 602 && super.anInt811 >= 466 && super.anInt811 < 503 && this.anIntArray256[8] != -1) {
					this.aBoolean207 = true;
					this.anInt994 = 8;
					this.aBoolean208 = true;
				}
				if (super.anInt810 >= 599 && super.anInt810 <= 629 && super.anInt811 >= 466 && super.anInt811 < 503 && this.anIntArray256[9] != -1) {
					this.aBoolean207 = true;
					this.anInt994 = 9;
					this.aBoolean208 = true;
				}
				if (super.anInt810 >= 627 && super.anInt810 <= 671 && super.anInt811 >= 467 && super.anInt811 < 502 && this.anIntArray256[10] != -1) {
					this.aBoolean207 = true;
					this.anInt994 = 10;
					this.aBoolean208 = true;
				}
				if (super.anInt810 >= 669 && super.anInt810 <= 699 && super.anInt811 >= 466 && super.anInt811 < 503 && this.anIntArray256[11] != -1) {
					this.aBoolean207 = true;
					this.anInt994 = 11;
					this.aBoolean208 = true;
				}
				if (super.anInt810 >= 696 && super.anInt810 <= 726 && super.anInt811 >= 466 && super.anInt811 < 503 && this.anIntArray256[12] != -1) {
					this.aBoolean207 = true;
					this.anInt994 = 12;
					this.aBoolean208 = true;
				}
				if (super.anInt810 >= 724 && super.anInt810 <= 758 && super.anInt811 >= 466 && super.anInt811 < 502 && this.anIntArray256[13] != -1) {
					this.aBoolean207 = true;
					this.anInt994 = 13;
					this.aBoolean208 = true;
					return;
				}
			}
		} catch (@Pc(443) RuntimeException local443) {
			signlink.reporterror("28230, " + arg0 + ", " + local443.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!QQMJEFXK;B)Z")
	private boolean method710(@OriginalArg(0) Class32 arg0) {
		try {
			@Pc(11) int local11 = arg0.anInt430;
			if (this.anInt908 == 2) {
				if (local11 == 201) {
					this.aBoolean197 = true;
					this.anInt1020 = 0;
					this.aBoolean204 = true;
					this.aString17 = "";
					this.anInt936 = 1;
					this.aString24 = "Enter name of friend to add to list";
				}
				if (local11 == 202) {
					this.aBoolean197 = true;
					this.anInt1020 = 0;
					this.aBoolean204 = true;
					this.aString17 = "";
					this.anInt936 = 2;
					this.aString24 = "Enter name of friend to delete from list";
				}
			}
			if (local11 == 205) {
				this.anInt874 = 250;
				return true;
			}
			if (local11 == 501) {
				this.aBoolean197 = true;
				this.anInt1020 = 0;
				this.aBoolean204 = true;
				this.aString17 = "";
				this.anInt936 = 4;
				this.aString24 = "Enter name of player to add to list";
			}
			if (local11 == 502) {
				this.aBoolean197 = true;
				this.anInt1020 = 0;
				this.aBoolean204 = true;
				this.aString17 = "";
				this.anInt936 = 5;
				this.aString24 = "Enter name of player to delete from list";
			}
			@Pc(119) int local119;
			@Pc(123) int local123;
			@Pc(128) int local128;
			if (local11 >= 300 && local11 <= 313) {
				local119 = (local11 - 300) / 2;
				local123 = local11 & 0x1;
				local128 = this.anIntArray220[local119];
				if (local128 != -1) {
					while (true) {
						if (local123 == 0) {
							local128--;
							if (local128 < 0) {
								local128 = Class36.anInt522 - 1;
							}
						}
						if (local123 == 1) {
							local128++;
							if (local128 >= Class36.anInt522) {
								local128 = 0;
							}
						}
						if (!Class36.aClass36Array1[local128].aBoolean116 && Class36.aClass36Array1[local128].anInt523 == local119 + (this.aBoolean235 ? 0 : 7)) {
							this.anIntArray220[local119] = local128;
							this.aBoolean212 = true;
							break;
						}
					}
				}
			}
			if (local11 >= 314 && local11 <= 323) {
				local119 = (local11 - 314) / 2;
				local123 = local11 & 0x1;
				local128 = this.anIntArray243[local119];
				if (local123 == 0) {
					local128--;
					if (local128 < 0) {
						local128 = anIntArrayArray22[local119].length - 1;
					}
				}
				if (local123 == 1) {
					local128++;
					if (local128 >= anIntArrayArray22[local119].length) {
						local128 = 0;
					}
				}
				this.anIntArray243[local119] = local128;
				this.aBoolean212 = true;
			}
			if (local11 == 324 && !this.aBoolean235) {
				this.aBoolean235 = true;
				this.method676();
			}
			if (local11 == 325 && this.aBoolean235) {
				this.aBoolean235 = false;
				this.method676();
			}
			if (local11 == 326) {
				this.aClass3_Sub1_Sub4_7.method447(236);
				this.aClass3_Sub1_Sub4_7.method448(this.aBoolean235 ? 0 : 1);
				for (local119 = 0; local119 < 7; local119++) {
					this.aClass3_Sub1_Sub4_7.method448(this.anIntArray220[local119]);
				}
				for (local123 = 0; local123 < 5; local123++) {
					this.aClass3_Sub1_Sub4_7.method448(this.anIntArray243[local123]);
				}
				return true;
			}
			if (local11 == 620) {
				this.aBoolean213 = !this.aBoolean213;
			}
			if (local11 >= 601 && local11 <= 613) {
				this.method683();
				if (this.aString18.length() > 0) {
					this.aClass3_Sub1_Sub4_7.method447(158);
					this.aClass3_Sub1_Sub4_7.method454(Class15.method198(this.aString18));
					this.aClass3_Sub1_Sub4_7.method448(local11 - 601);
					this.aClass3_Sub1_Sub4_7.method448(this.aBoolean213 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(356) RuntimeException local356) {
			signlink.reporterror("99324, " + arg0 + ", " + 8 + ", " + local356.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
	private void method711(@OriginalArg(0) int arg0) {
		try {
			@Pc(6) int local6 = this.anInt844 * 128 + 64;
			@Pc(13) int local13 = this.anInt845 * 128 + 64;
			@Pc(24) int local24 = this.method688(local6, local13, 899, this.anInt894) - this.anInt846;
			if (this.anInt1030 < local6) {
				this.anInt1030 += this.anInt847 + (local6 - this.anInt1030) * this.anInt848 / 1000;
				if (this.anInt1030 > local6) {
					this.anInt1030 = local6;
				}
			}
			if (this.anInt1030 > local6) {
				this.anInt1030 -= this.anInt847 + (this.anInt1030 - local6) * this.anInt848 / 1000;
				if (this.anInt1030 < local6) {
					this.anInt1030 = local6;
				}
			}
			if (this.anInt1031 < local24) {
				this.anInt1031 += this.anInt847 + (local24 - this.anInt1031) * this.anInt848 / 1000;
				if (this.anInt1031 > local24) {
					this.anInt1031 = local24;
				}
			}
			if (this.anInt1031 > local24) {
				this.anInt1031 -= this.anInt847 + (this.anInt1031 - local24) * this.anInt848 / 1000;
				if (this.anInt1031 < local24) {
					this.anInt1031 = local24;
				}
			}
			if (this.anInt1032 < local13) {
				this.anInt1032 += this.anInt847 + (local13 - this.anInt1032) * this.anInt848 / 1000;
				if (this.anInt1032 > local13) {
					this.anInt1032 = local13;
				}
			}
			if (this.anInt1032 > local13) {
				this.anInt1032 -= this.anInt847 + (this.anInt1032 - local13) * this.anInt848 / 1000;
				if (this.anInt1032 < local13) {
					this.anInt1032 = local13;
				}
			}
			local6 = this.anInt824 * 128 + 64;
			local13 = this.anInt825 * 128 + 64;
			local24 = this.method688(local6, local13, 899, this.anInt894) - this.anInt826;
			@Pc(222) int local222 = local6 - this.anInt1030;
			@Pc(227) int local227 = local24 - this.anInt1031;
			@Pc(232) int local232 = local13 - this.anInt1032;
			@Pc(236) boolean local236 = false;
			@Pc(247) int local247 = (int) Math.sqrt((double) (local222 * local222 + local232 * local232));
			@Pc(258) int local258 = (int) (Math.atan2((double) local227, (double) local247) * 325.949D) & 0x7FF;
			@Pc(269) int local269 = (int) (Math.atan2((double) local222, (double) local232) * -325.949D) & 0x7FF;
			if (local258 < 128) {
				local258 = 128;
			}
			if (local258 > 383) {
				local258 = 383;
			}
			if (this.anInt1033 < local258) {
				this.anInt1033 += this.anInt827 + (local258 - this.anInt1033) * this.anInt828 / 1000;
				if (this.anInt1033 > local258) {
					this.anInt1033 = local258;
				}
			}
			if (this.anInt1033 > local258) {
				this.anInt1033 -= this.anInt827 + (this.anInt1033 - local258) * this.anInt828 / 1000;
				if (this.anInt1033 < local258) {
					this.anInt1033 = local258;
				}
			}
			@Pc(340) int local340 = local269 - this.anInt1034;
			if (local340 > 1024) {
				local340 -= 2048;
			}
			if (local340 < -1024) {
				local340 += 2048;
			}
			if (local340 > 0) {
				this.anInt1034 += this.anInt827 + local340 * this.anInt828 / 1000;
				this.anInt1034 &= 0x7FF;
			}
			if (local340 < 0) {
				this.anInt1034 -= this.anInt827 + -local340 * this.anInt828 / 1000;
				this.anInt1034 &= 0x7FF;
			}
			@Pc(398) int local398 = local269 - this.anInt1034;
			if (local398 > 1024) {
				local398 -= 2048;
			}
			if (local398 < -1024) {
				local398 += 2048;
			}
			if (local398 < 0 && local340 > 0 || local398 > 0 && local340 < 0) {
				this.anInt1034 = local269;
			}
		} catch (@Pc(419) RuntimeException local419) {
			signlink.reporterror("24759, " + arg0 + ", " + local419.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method583() {
		try {
			if (this.aBoolean198 || this.aBoolean223 || this.aBoolean234) {
				this.method650(this.anInt910);
			} else {
				anInt833++;
				if (this.aBoolean206) {
					this.method719();
				} else {
					this.method702(false);
				}
				this.anInt1022 = 0;
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("5323, " + 7 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(B)V")
	private void method712() {
		try {
			for (@Pc(8) int local8 = 0; local8 < this.anInt1011; local8++) {
				@Pc(15) int local15 = this.anIntArray263[local8];
				@Pc(20) Class3_Sub1_Sub1_Sub4_Sub1 local20 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[local15];
				if (local20 != null) {
					this.method713(local20, local20.aClass2_1.aByte2);
				}
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("85012, " + -18 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!RODHPQMW;I)V")
	private void method713(@OriginalArg(1) Class3_Sub1_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		try {
			if (arg0.anInt728 < 128 || arg0.anInt729 < 128 || arg0.anInt728 >= 13184 || arg0.anInt729 >= 13184) {
				arg0.anInt701 = -1;
				arg0.anInt709 = -1;
				arg0.anInt698 = 0;
				arg0.anInt699 = 0;
				arg0.anInt728 = arg0.anIntArray174[0] * 128 + arg0.anInt714 * 64;
				arg0.anInt729 = arg0.anIntArray175[0] * 128 + arg0.anInt714 * 64;
				arg0.method507();
			}
			if (arg0 == aClass3_Sub1_Sub1_Sub4_Sub2_1 && (arg0.anInt728 < 1536 || arg0.anInt729 < 1536 || arg0.anInt728 >= 11776 || arg0.anInt729 >= 11776)) {
				arg0.anInt701 = -1;
				arg0.anInt709 = -1;
				arg0.anInt698 = 0;
				arg0.anInt699 = 0;
				arg0.anInt728 = arg0.anIntArray174[0] * 128 + arg0.anInt714 * 64;
				arg0.anInt729 = arg0.anIntArray175[0] * 128 + arg0.anInt714 * 64;
				arg0.method507();
			}
			if (arg0.anInt698 > anInt919) {
				this.method714(arg0);
			} else if (arg0.anInt699 >= anInt919) {
				this.method715(arg0);
			} else {
				this.method716(arg0);
			}
			this.method717(arg0);
			this.method718(arg0);
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("2171, " + 29067 + ", " + arg0 + ", " + arg1 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!RODHPQMW;)V")
	private void method714(@OriginalArg(1) Class3_Sub1_Sub1_Sub4 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt698 - anInt919;
			@Pc(18) int local18 = arg0.anInt694 * 128 + arg0.anInt714 * 64;
			@Pc(28) int local28 = arg0.anInt696 * 128 + arg0.anInt714 * 64;
			arg0.anInt728 += (local18 - arg0.anInt728) / local4;
			arg0.anInt729 += (local28 - arg0.anInt729) / local4;
			arg0.anInt717 = 0;
			if (arg0.anInt700 == 0) {
				arg0.anInt731 = 1024;
			}
			if (arg0.anInt700 == 1) {
				arg0.anInt731 = 1536;
			}
			if (arg0.anInt700 == 2) {
				arg0.anInt731 = 0;
			}
			if (arg0.anInt700 == 3) {
				arg0.anInt731 = 512;
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("97463, " + 54 + ", " + arg0 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!RODHPQMW;)V")
	private void method715(@OriginalArg(1) Class3_Sub1_Sub1_Sub4 arg0) {
		try {
			if (arg0.anInt699 == anInt919 || arg0.anInt701 == -1 || arg0.anInt704 != 0 || arg0.anInt703 + 1 > Class30.aClass30Array1[arg0.anInt701].method308(arg0.anInt702)) {
				@Pc(29) int local29 = arg0.anInt699 - arg0.anInt698;
				@Pc(34) int local34 = anInt919 - arg0.anInt698;
				@Pc(44) int local44 = arg0.anInt694 * 128 + arg0.anInt714 * 64;
				@Pc(54) int local54 = arg0.anInt696 * 128 + arg0.anInt714 * 64;
				@Pc(64) int local64 = arg0.anInt695 * 128 + arg0.anInt714 * 64;
				@Pc(74) int local74 = arg0.anInt697 * 128 + arg0.anInt714 * 64;
				arg0.anInt728 = (local44 * (local29 - local34) + local64 * local34) / local29;
				arg0.anInt729 = (local54 * (local29 - local34) + local74 * local34) / local29;
			}
			arg0.anInt717 = 0;
			if (arg0.anInt700 == 0) {
				arg0.anInt731 = 1024;
			}
			if (arg0.anInt700 == 1) {
				arg0.anInt731 = 1536;
			}
			if (arg0.anInt700 == 2) {
				arg0.anInt731 = 0;
			}
			if (arg0.anInt700 == 3) {
				arg0.anInt731 = 512;
			}
			arg0.anInt730 = arg0.anInt731;
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("84917, " + false + ", " + arg0 + ", " + local138.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BLclient!RODHPQMW;)V")
	private void method716(@OriginalArg(1) Class3_Sub1_Sub1_Sub4 arg0) {
		try {
			arg0.anInt732 = arg0.anInt689;
			if (arg0.anInt716 == 0) {
				arg0.anInt717 = 0;
			} else {
				if (arg0.anInt701 != -1 && arg0.anInt704 == 0) {
					@Pc(24) Class30 local24 = Class30.aClass30Array1[arg0.anInt701];
					if (arg0.anInt727 > 0 && local24.anInt392 == 0) {
						arg0.anInt717++;
						return;
					}
					if (arg0.anInt727 <= 0 && local24.anInt393 == 0) {
						arg0.anInt717++;
						return;
					}
				}
				@Pc(53) int local53 = arg0.anInt728;
				@Pc(56) int local56 = arg0.anInt729;
				@Pc(71) int local71 = arg0.anIntArray174[arg0.anInt716 - 1] * 128 + arg0.anInt714 * 64;
				@Pc(86) int local86 = arg0.anIntArray175[arg0.anInt716 - 1] * 128 + arg0.anInt714 * 64;
				if (local71 - local53 <= 256 && local71 - local53 >= -256 && local86 - local56 <= 256 && local86 - local56 >= -256) {
					if (local53 < local71) {
						if (local56 < local86) {
							arg0.anInt731 = 1280;
						} else if (local56 > local86) {
							arg0.anInt731 = 1792;
						} else {
							arg0.anInt731 = 1536;
						}
					} else if (local53 > local71) {
						if (local56 < local86) {
							arg0.anInt731 = 768;
						} else if (local56 > local86) {
							arg0.anInt731 = 256;
						} else {
							arg0.anInt731 = 512;
						}
					} else if (local56 < local86) {
						arg0.anInt731 = 1024;
					} else {
						arg0.anInt731 = 0;
					}
					@Pc(188) int local188 = arg0.anInt731 - arg0.anInt730 & 0x7FF;
					if (local188 > 1024) {
						local188 -= 2048;
					}
					@Pc(195) int local195 = arg0.anInt719;
					if (local188 >= -256 && local188 <= 256) {
						local195 = arg0.anInt718;
					} else if (local188 >= 256 && local188 < 768) {
						local195 = arg0.anInt721;
					} else if (local188 >= -768 && local188 <= -256) {
						local195 = arg0.anInt720;
					}
					if (local195 == -1) {
						local195 = arg0.anInt718;
					}
					arg0.anInt732 = local195;
					@Pc(237) int local237 = 4;
					if (arg0.anInt730 != arg0.anInt731 && arg0.anInt723 == -1 && arg0.anInt708 != 0) {
						local237 = 2;
					}
					if (arg0.anInt716 > 2) {
						local237 = 6;
					}
					if (arg0.anInt716 > 3) {
						local237 = 8;
					}
					if (arg0.anInt717 > 0 && arg0.anInt716 > 1) {
						local237 = 8;
						arg0.anInt717--;
					}
					if (arg0.aBooleanArray10[arg0.anInt716 - 1]) {
						local237 <<= 0x1;
					}
					if (local237 >= 8 && arg0.anInt732 == arg0.anInt718 && arg0.anInt693 != -1) {
						arg0.anInt732 = arg0.anInt693;
					}
					if (local53 < local71) {
						arg0.anInt728 += local237;
						if (arg0.anInt728 > local71) {
							arg0.anInt728 = local71;
						}
					} else if (local53 > local71) {
						arg0.anInt728 -= local237;
						if (arg0.anInt728 < local71) {
							arg0.anInt728 = local71;
						}
					}
					if (local56 < local86) {
						arg0.anInt729 += local237;
						if (arg0.anInt729 > local86) {
							arg0.anInt729 = local86;
						}
					} else if (local56 > local86) {
						arg0.anInt729 -= local237;
						if (arg0.anInt729 < local86) {
							arg0.anInt729 = local86;
						}
					}
					if (arg0.anInt728 == local71 && arg0.anInt729 == local86) {
						arg0.anInt716--;
						if (arg0.anInt727 > 0) {
							arg0.anInt727--;
							return;
						}
					}
				} else {
					arg0.anInt728 = local71;
					arg0.anInt729 = local86;
				}
			}
		} catch (@Pc(399) RuntimeException local399) {
			signlink.reporterror("15052, " + 102 + ", " + arg0 + ", " + local399.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!RODHPQMW;)V")
	private void method717(@OriginalArg(1) Class3_Sub1_Sub1_Sub4 arg0) {
		try {
			if (arg0.anInt708 != 0) {
				@Pc(35) int local35;
				@Pc(41) int local41;
				if (arg0.anInt723 != -1 && arg0.anInt723 < 32768) {
					@Pc(27) Class3_Sub1_Sub1_Sub4_Sub1 local27 = this.aClass3_Sub1_Sub1_Sub4_Sub1Array1[arg0.anInt723];
					if (local27 != null) {
						local35 = arg0.anInt728 - local27.anInt728;
						local41 = arg0.anInt729 - local27.anInt729;
						if (local35 != 0 || local41 != 0) {
							arg0.anInt731 = (int) (Math.atan2((double) local35, (double) local41) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(66) int local66;
				if (arg0.anInt723 >= 32768) {
					local66 = arg0.anInt723 - 32768;
					if (local66 == this.anInt1003) {
						local66 = this.anInt928;
					}
					@Pc(78) Class3_Sub1_Sub1_Sub4_Sub2 local78 = this.aClass3_Sub1_Sub1_Sub4_Sub2Array1[local66];
					if (local78 != null) {
						local41 = arg0.anInt728 - local78.anInt728;
						@Pc(92) int local92 = arg0.anInt729 - local78.anInt729;
						if (local41 != 0 || local92 != 0) {
							arg0.anInt731 = (int) (Math.atan2((double) local41, (double) local92) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt706 != 0 || arg0.anInt707 != 0) && (arg0.anInt716 == 0 || arg0.anInt717 > 0)) {
					local66 = arg0.anInt728 - (arg0.anInt706 - this.anInt946 - this.anInt946) * 64;
					local35 = arg0.anInt729 - (arg0.anInt707 - this.anInt947 - this.anInt947) * 64;
					if (local66 != 0 || local35 != 0) {
						arg0.anInt731 = (int) (Math.atan2((double) local66, (double) local35) * 325.949D) & 0x7FF;
					}
					arg0.anInt706 = 0;
					arg0.anInt707 = 0;
				}
				local66 = arg0.anInt731 - arg0.anInt730 & 0x7FF;
				if (local66 != 0) {
					if (local66 < arg0.anInt708 || local66 > 2048 - arg0.anInt708) {
						arg0.anInt730 = arg0.anInt731;
					} else if (local66 > 1024) {
						arg0.anInt730 -= arg0.anInt708;
					} else {
						arg0.anInt730 += arg0.anInt708;
					}
					arg0.anInt730 &= 0x7FF;
					if (arg0.anInt732 == arg0.anInt689 && arg0.anInt730 != arg0.anInt731) {
						if (arg0.anInt690 != -1) {
							arg0.anInt732 = arg0.anInt690;
							return;
						}
						arg0.anInt732 = arg0.anInt718;
						return;
					}
				}
			}
		} catch (@Pc(246) RuntimeException local246) {
			signlink.reporterror("67552, " + 3562 + ", " + arg0 + ", " + local246.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!RODHPQMW;Z)V")
	private void method718(@OriginalArg(0) Class3_Sub1_Sub1_Sub4 arg0) {
		try {
			arg0.aBoolean167 = false;
			@Pc(18) Class30 local18;
			if (arg0.anInt732 != -1) {
				local18 = Class30.aClass30Array1[arg0.anInt732];
				arg0.anInt734++;
				if (arg0.anInt733 < local18.anInt386 && arg0.anInt734 > local18.method308(arg0.anInt733)) {
					arg0.anInt734 = 1;
					arg0.anInt733++;
				}
				if (arg0.anInt733 >= local18.anInt386) {
					arg0.anInt734 = 1;
					arg0.anInt733 = 0;
				}
			}
			if (arg0.anInt709 != -1 && anInt919 >= arg0.anInt712) {
				if (arg0.anInt710 < 0) {
					arg0.anInt710 = 0;
				}
				local18 = Class39.aClass39Array1[arg0.anInt709].aClass30_2;
				arg0.anInt711++;
				if (arg0.anInt710 < local18.anInt386 && arg0.anInt711 > local18.method308(arg0.anInt710)) {
					arg0.anInt711 = 1;
					arg0.anInt710++;
				}
				if (arg0.anInt710 >= local18.anInt386 && (arg0.anInt710 < 0 || arg0.anInt710 >= local18.anInt386)) {
					arg0.anInt709 = -1;
				}
			}
			if (arg0.anInt701 != -1 && arg0.anInt704 <= 1) {
				local18 = Class30.aClass30Array1[arg0.anInt701];
				if (local18.anInt392 == 1 && arg0.anInt727 > 0 && arg0.anInt698 <= anInt919 && arg0.anInt699 < anInt919) {
					arg0.anInt704 = 1;
					return;
				}
			}
			if (arg0.anInt701 != -1 && arg0.anInt704 == 0) {
				local18 = Class30.aClass30Array1[arg0.anInt701];
				arg0.anInt703++;
				if (arg0.anInt702 < local18.anInt386 && arg0.anInt703 > local18.method308(arg0.anInt702)) {
					arg0.anInt703 = 1;
					arg0.anInt702++;
				}
				if (arg0.anInt702 >= local18.anInt386) {
					arg0.anInt702 -= local18.anInt387;
					arg0.anInt705++;
					if (arg0.anInt705 >= local18.anInt391) {
						arg0.anInt701 = -1;
					}
					if (arg0.anInt702 < 0 || arg0.anInt702 >= local18.anInt386) {
						arg0.anInt701 = -1;
					}
				}
				arg0.aBoolean167 = local18.aBoolean92;
			}
			if (arg0.anInt704 > 0) {
				arg0.anInt704--;
			}
		} catch (@Pc(245) RuntimeException local245) {
			signlink.reporterror("6177, " + arg0 + ", " + false + ", " + local245.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private void method719() {
		try {
			if (this.anInt998 == -1 || this.anInt1044 != 2 && super.aClass13_2 == null) {
				if (this.aBoolean210) {
					this.method723();
					this.aBoolean210 = false;
					this.aClass13_16.method158(4, super.aGraphics2, 0);
					this.aClass13_17.method158(357, super.aGraphics2, 0);
					this.aClass13_18.method158(4, super.aGraphics2, 722);
					this.aClass13_19.method158(205, super.aGraphics2, 743);
					this.aClass13_20.method158(0, super.aGraphics2, 0);
					this.aClass13_21.method158(4, super.aGraphics2, 516);
					this.aClass13_22.method158(205, super.aGraphics2, 516);
					this.aClass13_23.method158(357, super.aGraphics2, 496);
					this.aClass13_24.method158(338, super.aGraphics2, 0);
					this.aBoolean207 = true;
					this.aBoolean197 = true;
					this.aBoolean208 = true;
					this.aBoolean222 = true;
					if (this.anInt1044 != 2) {
						this.aClass13_5.method158(4, super.aGraphics2, 4);
						this.aClass13_4.method158(4, super.aGraphics2, 550);
					}
				}
				if (this.anInt1044 == 2) {
					this.method689(this.anInt901);
				}
				if (this.aBoolean231 && this.anInt1005 == 1) {
					this.aBoolean207 = true;
				}
				@Pc(285) boolean local285;
				if (this.anInt920 != -1) {
					local285 = this.method616(this.anInt920, this.anInt880);
					if (local285) {
						this.aBoolean207 = true;
					}
				}
				if (this.anInt852 == 2) {
					this.aBoolean207 = true;
				}
				if (this.anInt980 == 2) {
					this.aBoolean207 = true;
				}
				if (this.aBoolean207) {
					this.method651();
					this.aBoolean207 = false;
				}
				@Pc(370) int local370;
				if (this.anInt840 == -1 && this.anInt1020 == 0) {
					this.aClass32_1.anInt440 = this.anInt888 - this.anInt862 - 77;
					if (super.anInt804 > 448 && super.anInt804 < 560 && super.anInt805 > 332) {
						this.method660(this.aClass32_1, 77, super.anInt805 - 357, 0, super.anInt804 - 17, -1, this.anInt888, 463);
					}
					local370 = this.anInt888 - this.aClass32_1.anInt440 - 77;
					if (local370 < 0) {
						local370 = 0;
					}
					if (local370 > this.anInt888 - 77) {
						local370 = this.anInt888 - 77;
					}
					if (this.anInt862 != local370) {
						this.anInt862 = local370;
						this.aBoolean197 = true;
					}
				}
				if (this.anInt840 == -1 && this.anInt1020 == 3) {
					local370 = this.anInt868 * 14 + 7;
					this.aClass32_1.anInt440 = this.anInt869;
					if (super.anInt804 > 448 && super.anInt804 < 560 && super.anInt805 > 332) {
						this.method660(this.aClass32_1, 77, super.anInt805 - 357, 0, super.anInt804 - 17, -1, local370, 463);
					}
					@Pc(449) int local449 = this.aClass32_1.anInt440;
					if (local449 < 0) {
						local449 = 0;
					}
					if (local449 > local370 - 77) {
						local449 = local370 - 77;
					}
					if (this.anInt869 != local449) {
						this.anInt869 = local449;
						this.aBoolean197 = true;
					}
				}
				if (this.anInt840 != -1) {
					local285 = this.method616(this.anInt840, this.anInt880);
					if (local285) {
						this.aBoolean197 = true;
					}
				}
				if (this.anInt852 == 3) {
					this.aBoolean197 = true;
				}
				if (this.anInt980 == 3) {
					this.aBoolean197 = true;
				}
				if (this.aString25 != null) {
					this.aBoolean197 = true;
				}
				if (this.aBoolean231 && this.anInt1005 == 2) {
					this.aBoolean197 = true;
				}
				if (this.aBoolean197) {
					this.method720();
					this.aBoolean197 = false;
				}
				if (this.anInt1044 == 2) {
					this.method664();
					this.aClass13_4.method158(4, super.aGraphics2, 550);
					anInt1053++;
					if (anInt1053 > 71) {
						anInt1053 = 0;
						this.aClass3_Sub1_Sub4_7.method447(252);
					}
				}
				if (this.anInt839 != -1) {
					this.aBoolean208 = true;
				}
				if (this.aBoolean208) {
					if (this.anInt839 != -1 && this.anInt839 == this.anInt994) {
						this.anInt839 = -1;
						this.aClass3_Sub1_Sub4_7.method447(202);
						this.aClass3_Sub1_Sub4_7.method448(this.anInt994);
					}
					this.aBoolean208 = false;
					this.aClass13_27.method157(this.aBoolean229);
					this.aClass3_Sub1_Sub2_Sub3_12.method369(0, 0);
					if (this.anInt920 == -1) {
						if (this.anIntArray256[this.anInt994] != -1) {
							if (this.anInt994 == 0) {
								this.aClass3_Sub1_Sub2_Sub3_13.method369(22, 10);
							}
							if (this.anInt994 == 1) {
								this.aClass3_Sub1_Sub2_Sub3_14.method369(54, 8);
							}
							if (this.anInt994 == 2) {
								this.aClass3_Sub1_Sub2_Sub3_14.method369(82, 8);
							}
							if (this.anInt994 == 3) {
								this.aClass3_Sub1_Sub2_Sub3_15.method369(110, 8);
							}
							if (this.anInt994 == 4) {
								this.aClass3_Sub1_Sub2_Sub3_17.method369(153, 8);
							}
							if (this.anInt994 == 5) {
								this.aClass3_Sub1_Sub2_Sub3_17.method369(181, 8);
							}
							if (this.anInt994 == 6) {
								this.aClass3_Sub1_Sub2_Sub3_16.method369(209, 9);
							}
						}
						if (this.anIntArray256[0] != -1 && (this.anInt839 != 0 || anInt919 % 20 < 10)) {
							this.aClass3_Sub1_Sub2_Sub3Array4[0].method369(29, 13);
						}
						if (this.anIntArray256[1] != -1 && (this.anInt839 != 1 || anInt919 % 20 < 10)) {
							this.aClass3_Sub1_Sub2_Sub3Array4[1].method369(53, 11);
						}
						if (this.anIntArray256[2] != -1 && (this.anInt839 != 2 || anInt919 % 20 < 10)) {
							this.aClass3_Sub1_Sub2_Sub3Array4[2].method369(82, 11);
						}
						if (this.anIntArray256[3] != -1 && (this.anInt839 != 3 || anInt919 % 20 < 10)) {
							this.aClass3_Sub1_Sub2_Sub3Array4[3].method369(115, 12);
						}
						if (this.anIntArray256[4] != -1 && (this.anInt839 != 4 || anInt919 % 20 < 10)) {
							this.aClass3_Sub1_Sub2_Sub3Array4[4].method369(153, 13);
						}
						if (this.anIntArray256[5] != -1 && (this.anInt839 != 5 || anInt919 % 20 < 10)) {
							this.aClass3_Sub1_Sub2_Sub3Array4[5].method369(180, 11);
						}
						if (this.anIntArray256[6] != -1 && (this.anInt839 != 6 || anInt919 % 20 < 10)) {
							this.aClass3_Sub1_Sub2_Sub3Array4[6].method369(208, 13);
						}
					}
					this.aClass13_27.method158(160, super.aGraphics2, 516);
					this.aClass13_26.method157(this.aBoolean229);
					this.aClass3_Sub1_Sub2_Sub3_11.method369(0, 0);
					if (this.anInt920 == -1) {
						if (this.anIntArray256[this.anInt994] != -1) {
							if (this.anInt994 == 7) {
								this.aClass3_Sub1_Sub2_Sub3_3.method369(42, 0);
							}
							if (this.anInt994 == 8) {
								this.aClass3_Sub1_Sub2_Sub3_4.method369(74, 0);
							}
							if (this.anInt994 == 9) {
								this.aClass3_Sub1_Sub2_Sub3_4.method369(102, 0);
							}
							if (this.anInt994 == 10) {
								this.aClass3_Sub1_Sub2_Sub3_5.method369(130, 1);
							}
							if (this.anInt994 == 11) {
								this.aClass3_Sub1_Sub2_Sub3_7.method369(173, 0);
							}
							if (this.anInt994 == 12) {
								this.aClass3_Sub1_Sub2_Sub3_7.method369(201, 0);
							}
							if (this.anInt994 == 13) {
								this.aClass3_Sub1_Sub2_Sub3_6.method369(229, 0);
							}
						}
						if (this.anIntArray256[8] != -1 && (this.anInt839 != 8 || anInt919 % 20 < 10)) {
							this.aClass3_Sub1_Sub2_Sub3Array4[7].method369(74, 2);
						}
						if (this.anIntArray256[9] != -1 && (this.anInt839 != 9 || anInt919 % 20 < 10)) {
							this.aClass3_Sub1_Sub2_Sub3Array4[8].method369(102, 3);
						}
						if (this.anIntArray256[10] != -1 && (this.anInt839 != 10 || anInt919 % 20 < 10)) {
							this.aClass3_Sub1_Sub2_Sub3Array4[9].method369(137, 4);
						}
						if (this.anIntArray256[11] != -1 && (this.anInt839 != 11 || anInt919 % 20 < 10)) {
							this.aClass3_Sub1_Sub2_Sub3Array4[10].method369(174, 2);
						}
						if (this.anIntArray256[12] != -1 && (this.anInt839 != 12 || anInt919 % 20 < 10)) {
							this.aClass3_Sub1_Sub2_Sub3Array4[11].method369(201, 2);
						}
						if (this.anIntArray256[13] != -1 && (this.anInt839 != 13 || anInt919 % 20 < 10)) {
							this.aClass3_Sub1_Sub2_Sub3Array4[12].method369(226, 2);
						}
					}
					this.aClass13_26.method158(466, super.aGraphics2, 496);
					this.aClass13_5.method157(this.aBoolean229);
					Class3_Sub1_Sub2_Sub2.anIntArray29 = this.anIntArray229;
				}
				if (this.aBoolean222) {
					this.aBoolean222 = false;
					this.aClass13_25.method157(this.aBoolean229);
					this.aClass3_Sub1_Sub2_Sub3_10.method369(0, 0);
					this.aClass3_Sub1_Sub2_Sub1_3.method46("Public chat", 28, true, 55, 16777215);
					if (this.anInt964 == 0) {
						this.aClass3_Sub1_Sub2_Sub1_3.method46("On", 41, true, 55, 65280);
					}
					if (this.anInt964 == 1) {
						this.aClass3_Sub1_Sub2_Sub1_3.method46("Friends", 41, true, 55, 16776960);
					}
					if (this.anInt964 == 2) {
						this.aClass3_Sub1_Sub2_Sub1_3.method46("Off", 41, true, 55, 16711680);
					}
					if (this.anInt964 == 3) {
						this.aClass3_Sub1_Sub2_Sub1_3.method46("Hide", 41, true, 55, 65535);
					}
					this.aClass3_Sub1_Sub2_Sub1_3.method46("Private chat", 28, true, 184, 16777215);
					if (this.anInt935 == 0) {
						this.aClass3_Sub1_Sub2_Sub1_3.method46("On", 41, true, 184, 65280);
					}
					if (this.anInt935 == 1) {
						this.aClass3_Sub1_Sub2_Sub1_3.method46("Friends", 41, true, 184, 16776960);
					}
					if (this.anInt935 == 2) {
						this.aClass3_Sub1_Sub2_Sub1_3.method46("Off", 41, true, 184, 16711680);
					}
					this.aClass3_Sub1_Sub2_Sub1_3.method46("Trade/compete", 28, true, 324, 16777215);
					if (this.anInt838 == 0) {
						this.aClass3_Sub1_Sub2_Sub1_3.method46("On", 41, true, 324, 65280);
					}
					if (this.anInt838 == 1) {
						this.aClass3_Sub1_Sub2_Sub1_3.method46("Friends", 41, true, 324, 16776960);
					}
					if (this.anInt838 == 2) {
						this.aClass3_Sub1_Sub2_Sub1_3.method46("Off", 41, true, 324, 16711680);
					}
					this.aClass3_Sub1_Sub2_Sub1_3.method46("Report abuse", 33, true, 458, 16777215);
					this.aClass13_25.method158(453, super.aGraphics2, 0);
					this.aClass13_5.method157(this.aBoolean229);
					Class3_Sub1_Sub2_Sub2.anIntArray29 = this.anIntArray229;
				}
				this.anInt880 = 0;
			} else {
				if (this.anInt1044 == 2) {
					this.method616(this.anInt998, this.anInt880);
					if (this.anInt955 != -1) {
						this.method616(this.anInt955, this.anInt880);
					}
					this.anInt880 = 0;
					this.method618(this.aBoolean237);
					super.aClass13_2.method157(this.aBoolean229);
					Class3_Sub1_Sub2_Sub2.anIntArray29 = this.anIntArray230;
					Class3_Sub1_Sub2.method519();
					this.aBoolean210 = true;
					@Pc(63) Class32 local63 = Class32.method316(this.anInt998);
					if (local63.anInt438 == 512 && local63.anInt441 == 334 && local63.anInt443 == 0) {
						local63.anInt438 = 765;
						local63.anInt441 = 503;
					}
					this.method599(0, local63, 0, 0);
					if (this.anInt955 != -1) {
						local63 = Class32.method316(this.anInt955);
						if (local63.anInt438 == 512 && local63.anInt441 == 334 && local63.anInt443 == 0) {
							local63.anInt438 = 765;
							local63.anInt441 = 503;
						}
						this.method599(0, local63, 0, 0);
					}
					if (this.aBoolean231) {
						this.method726();
					} else {
						this.method636();
						this.method698();
					}
				}
				super.aClass13_2.method158(0, super.aGraphics2, 0);
			}
		} catch (@Pc(1298) RuntimeException local1298) {
			signlink.reporterror("38243, " + true + ", " + local1298.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
	private void method720() {
		try {
			this.aClass13_6.method157(this.aBoolean229);
			Class3_Sub1_Sub2_Sub2.anIntArray29 = this.anIntArray227;
			this.aClass3_Sub1_Sub2_Sub3_20.method369(0, 0);
			if (this.aBoolean204) {
				this.aClass3_Sub1_Sub2_Sub1_4.method45(40, this.aString24, 239, 0);
				this.aClass3_Sub1_Sub2_Sub1_4.method45(60, this.aString17 + "*", 239, 128);
			} else if (this.anInt1020 == 1) {
				this.aClass3_Sub1_Sub2_Sub1_4.method45(40, "Enter amount:", 239, 0);
				this.aClass3_Sub1_Sub2_Sub1_4.method45(60, this.aString30 + "*", 239, 128);
			} else if (this.anInt1020 == 2) {
				this.aClass3_Sub1_Sub2_Sub1_4.method45(40, "Enter name:", 239, 0);
				this.aClass3_Sub1_Sub2_Sub1_4.method45(60, this.aString30 + "*", 239, 128);
			} else {
				@Pc(126) Class3_Sub1_Sub2_Sub1 local126;
				@Pc(134) int local134;
				@Pc(145) int local145;
				if (this.anInt1020 == 3) {
					if (this.aString30 != this.aString19) {
						this.method703(this.aString30);
						this.aString19 = this.aString30;
					}
					local126 = this.aClass3_Sub1_Sub2_Sub1_3;
					Class3_Sub1_Sub2.method518(77, 0, 463, 0);
					for (local134 = 0; local134 < this.anInt868; local134++) {
						local145 = local134 * 14 + 18 - this.anInt869;
						if (local145 > 0 && local145 < 110) {
							local126.method45(local145, this.aStringArray8[local134], 239, 0);
						}
					}
					Class3_Sub1_Sub2.method517();
					if (this.anInt868 > 5) {
						this.method697(0, 77, 463, this.anInt868 * 14 + 7, this.anInt869);
					}
					if (this.aString30.length() == 0) {
						this.aClass3_Sub1_Sub2_Sub1_4.method45(40, "Enter object name", 239, 255);
					} else if (this.anInt868 == 0) {
						this.aClass3_Sub1_Sub2_Sub1_4.method45(40, "No matching objects found, please shorten search", 239, 0);
					}
					local126.method45(90, this.aString30 + "*", 239, 0);
					Class3_Sub1_Sub2.method524(77, 0, 479, 0);
				} else if (this.aString25 != null) {
					this.aClass3_Sub1_Sub2_Sub1_4.method45(40, this.aString25, 239, 0);
					this.aClass3_Sub1_Sub2_Sub1_4.method45(60, "Click to continue", 239, 128);
				} else if (this.anInt840 != -1) {
					this.method599(0, Class32.method316(this.anInt840), 0, 0);
				} else if (this.anInt997 == -1) {
					local126 = this.aClass3_Sub1_Sub2_Sub1_3;
					local134 = 0;
					Class3_Sub1_Sub2.method518(77, 0, 463, 0);
					for (local145 = 0; local145 < 100; local145++) {
						if (this.aStringArray11[local145] != null) {
							@Pc(310) int local310 = this.anIntArray248[local145];
							@Pc(319) int local319 = this.anInt862 + 70 - local134 * 14;
							@Pc(324) String local324 = this.aStringArray10[local145];
							@Pc(326) byte local326 = 0;
							if (local324 != null && local324.startsWith("@cr1@")) {
								local324 = local324.substring(5);
								local326 = 1;
							}
							if (local324 != null && local324.startsWith("@cr2@")) {
								local324 = local324.substring(5);
								local326 = 2;
							}
							if (local310 == 0) {
								if (local319 > 0 && local319 < 110) {
									local126.method49(4, 0, this.aStringArray11[local145], local319, this.anInt969);
								}
								local134++;
							}
							@Pc(397) int local397;
							if ((local310 == 1 || local310 == 2) && (local310 == 1 || this.anInt964 == 0 || this.anInt964 == 1 && this.method590(local324, (byte) 5))) {
								if (local319 > 0 && local319 < 110) {
									local397 = 4;
									if (local326 == 1) {
										this.aClass3_Sub1_Sub2_Sub3Array2[0].method369(4, local319 - 12);
										local397 += 14;
									}
									if (local326 == 2) {
										this.aClass3_Sub1_Sub2_Sub3Array2[1].method369(local397, local319 - 12);
										local397 += 14;
									}
									local126.method49(local397, 0, local324 + ":", local319, this.anInt969);
									local397 += local126.method47(this.anInt1021, local324) + 8;
									local126.method49(local397, 255, this.aStringArray11[local145], local319, this.anInt969);
								}
								local134++;
							}
							if ((local310 == 3 || local310 == 7) && this.anInt886 == 0 && (local310 == 7 || this.anInt935 == 0 || this.anInt935 == 1 && this.method590(local324, (byte) 5))) {
								if (local319 > 0 && local319 < 110) {
									local126.method49(4, 0, "From", local319, this.anInt969);
									local397 = local126.method47(this.anInt1021, "From ") + 4;
									if (local326 == 1) {
										this.aClass3_Sub1_Sub2_Sub3Array2[0].method369(local397, local319 - 12);
										local397 += 14;
									}
									if (local326 == 2) {
										this.aClass3_Sub1_Sub2_Sub3Array2[1].method369(local397, local319 - 12);
										local397 += 14;
									}
									local126.method49(local397, 0, local324 + ":", local319, this.anInt969);
									local397 += local126.method47(this.anInt1021, local324) + 8;
									local126.method49(local397, 8388608, this.aStringArray11[local145], local319, this.anInt969);
								}
								local134++;
							}
							if (local310 == 4 && (this.anInt838 == 0 || this.anInt838 == 1 && this.method590(local324, (byte) 5))) {
								if (local319 > 0 && local319 < 110) {
									local126.method49(4, 8388736, local324 + " " + this.aStringArray11[local145], local319, this.anInt969);
								}
								local134++;
							}
							if (local310 == 5 && this.anInt886 == 0 && this.anInt935 < 2) {
								if (local319 > 0 && local319 < 110) {
									local126.method49(4, 8388608, this.aStringArray11[local145], local319, this.anInt969);
								}
								local134++;
							}
							if (local310 == 6 && this.anInt886 == 0 && this.anInt935 < 2) {
								if (local319 > 0 && local319 < 110) {
									local126.method49(4, 0, "To " + local324 + ":", local319, this.anInt969);
									local126.method49(local126.method47(this.anInt1021, "To " + local324) + 12, 8388608, this.aStringArray11[local145], local319, this.anInt969);
								}
								local134++;
							}
							if (local310 == 8 && (this.anInt838 == 0 || this.anInt838 == 1 && this.method590(local324, (byte) 5))) {
								if (local319 > 0 && local319 < 110) {
									local126.method49(4, 8270336, local324 + " " + this.aStringArray11[local145], local319, this.anInt969);
								}
								local134++;
							}
						}
					}
					Class3_Sub1_Sub2.method517();
					this.anInt888 = local134 * 14 + 7;
					if (this.anInt888 < 78) {
						this.anInt888 = 78;
					}
					this.method697(0, 77, 463, this.anInt888, this.anInt888 - this.anInt862 - 77);
					@Pc(781) String local781;
					if (aClass3_Sub1_Sub1_Sub4_Sub2_1 == null || aClass3_Sub1_Sub1_Sub4_Sub2_1.aString16 == null) {
						local781 = Class15.method202(this.aString22);
					} else {
						local781 = aClass3_Sub1_Sub1_Sub4_Sub2_1.aString16;
					}
					local126.method49(4, 0, local781 + ":", 90, this.anInt969);
					local126.method49(local126.method47(this.anInt1021, local781 + ": ") + 6, 255, this.aString29 + "*", 90, this.anInt969);
					Class3_Sub1_Sub2.method524(77, 0, 479, 0);
				} else {
					this.method599(0, Class32.method316(this.anInt997), 0, 0);
				}
			}
			if (this.aBoolean231 && this.anInt1005 == 2) {
				this.method726();
			}
			this.aClass13_6.method158(357, super.aGraphics2, 17);
			this.aClass13_5.method157(this.aBoolean229);
			Class3_Sub1_Sub2_Sub2.anIntArray29 = this.anIntArray229;
		} catch (@Pc(874) RuntimeException local874) {
			signlink.reporterror("65729, " + true + ", " + local874.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
	private void method721(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(19) int local19 = 0; local19 < this.anInt907; local19++) {
					if (this.aLongArray3[local19] == arg0) {
						this.anInt907--;
						this.aBoolean207 = true;
						for (@Pc(39) int local39 = local19; local39 < this.anInt907; local39++) {
							this.aStringArray14[local39] = this.aStringArray14[local39 + 1];
							this.anIntArray260[local39] = this.anIntArray260[local39 + 1];
							this.aLongArray3[local39] = this.aLongArray3[local39 + 1];
						}
						this.aClass3_Sub1_Sub4_7.method447(241);
						this.aClass3_Sub1_Sub4_7.method454(arg0);
						return;
					}
				}
			}
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("92083, " + 2 + ", " + arg0 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method582() {
		try {
			this.aClass3_Sub1_Sub1_Sub4_Sub2Array1 = null;
			this.anIntArray238 = null;
			this.anIntArray239 = null;
			this.aClass3_Sub1_Sub4Array1 = null;
			this.anIntArray213 = null;
			this.aClass3_Sub1_Sub2_Sub3_10 = null;
			this.aClass3_Sub1_Sub2_Sub3_11 = null;
			this.aClass3_Sub1_Sub2_Sub3_12 = null;
			if (this.aClass17_1 != null) {
				this.aClass17_1.aBoolean74 = false;
			}
			this.aClass17_1 = null;
			this.aClass3_Sub1_Sub1_Sub4_Sub1Array1 = null;
			this.anIntArray263 = null;
			this.anIntArrayArray23 = null;
			this.anIntArrayArray25 = null;
			this.anIntArray225 = null;
			this.anIntArray226 = null;
			this.aClass3_Sub1_Sub2_Sub3Array4 = null;
			this.aClass13_25 = null;
			this.aClass13_26 = null;
			this.aClass13_27 = null;
			this.aClass13_16 = null;
			this.aClass13_17 = null;
			this.aClass13_18 = null;
			this.aClass13_19 = null;
			this.aClass3_Sub1_Sub2_Sub3_3 = null;
			this.aClass3_Sub1_Sub2_Sub3_4 = null;
			this.aClass3_Sub1_Sub2_Sub3_5 = null;
			this.aClass3_Sub1_Sub2_Sub3_6 = null;
			this.aClass3_Sub1_Sub2_Sub3_7 = null;
			this.aClass3_Sub1_Sub2_Sub4_13 = null;
			this.aClass3_Sub1_Sub2_Sub4_8 = null;
			this.aClass3_Sub1_Sub2_Sub4_9 = null;
			this.aClass3_Sub1_Sub2_Sub4_10 = null;
			this.aClass3_Sub1_Sub2_Sub4_11 = null;
			this.aClass3_Sub1_Sub2_Sub4_12 = null;
			this.aClass44ArrayArrayArray1 = null;
			this.aClass44_12 = null;
			this.aClass3_Sub1_Sub2_Sub4_15 = null;
			this.aClass3_Sub1_Sub2_Sub4Array9 = null;
			this.aClass3_Sub1_Sub2_Sub4Array5 = null;
			this.aClass3_Sub1_Sub2_Sub4Array4 = null;
			this.aClass3_Sub1_Sub2_Sub4Array7 = null;
			this.aClass3_Sub1_Sub2_Sub4Array8 = null;
			this.anIntArray273 = null;
			this.aClass13_12 = null;
			this.aClass13_13 = null;
			this.aClass13_14 = null;
			this.aClass13_15 = null;
			if (this.aClass16_Sub1_1 != null) {
				this.aClass16_Sub1_1.method221();
			}
			this.aClass16_Sub1_1 = null;
			this.aClass3_Sub1_Sub4_7 = null;
			this.aClass3_Sub1_Sub4_9 = null;
			this.aClass3_Sub1_Sub4_6 = null;
			this.anIntArray269 = null;
			this.anIntArray270 = null;
			this.anIntArray271 = null;
			this.anIntArray272 = null;
			this.aStringArray13 = null;
			this.aClass3_Sub1_Sub4_8 = null;
			this.aClass3_Sub1_Sub2_Sub3_13 = null;
			this.aClass3_Sub1_Sub2_Sub3_14 = null;
			this.aClass3_Sub1_Sub2_Sub3_15 = null;
			this.aClass3_Sub1_Sub2_Sub3_16 = null;
			this.aClass3_Sub1_Sub2_Sub3_17 = null;
			this.aByteArray21 = null;
			this.aClass13_20 = null;
			this.aClass13_21 = null;
			this.aClass13_22 = null;
			this.aClass13_23 = null;
			this.aClass13_24 = null;
			this.anIntArray240 = null;
			this.anIntArray241 = null;
			this.aClass3_Sub1_Sub2_Sub4Array6 = null;
			this.aClass13_3 = null;
			this.aClass13_4 = null;
			this.aClass13_5 = null;
			this.aClass13_6 = null;
			this.anIntArrayArray24 = null;
			this.anIntArrayArrayArray8 = null;
			this.aByteArrayArrayArray8 = null;
			this.aClass25_1 = null;
			this.aClass11Array1 = null;
			this.aClass3_Sub1_Sub2_Sub3_18 = null;
			this.aClass3_Sub1_Sub2_Sub3_19 = null;
			this.aClass3_Sub1_Sub2_Sub3_20 = null;
			this.method638();
			try {
				if (this.aClass42_1 != null) {
					this.aClass42_1.method428();
				}
			} catch (@Pc(282) Exception local282) {
			}
			this.aClass42_1 = null;
			this.aClass3_Sub1_Sub2_Sub3Array3 = null;
			this.aClass3_Sub1_Sub2_Sub4Array10 = null;
			this.anIntArray231 = null;
			this.aByteArrayArray6 = null;
			this.aByteArrayArray5 = null;
			this.anIntArray232 = null;
			this.anIntArray233 = null;
			this.aClass3_Sub1_Sub2_Sub4_7 = null;
			this.aStringArray14 = null;
			this.aLongArray3 = null;
			this.anIntArray260 = null;
			this.aClass44_10 = null;
			this.aClass44_11 = null;
			this.aClass13_10 = null;
			this.aClass13_11 = null;
			this.aClass13_7 = null;
			this.aClass13_8 = null;
			this.aClass13_9 = null;
			this.method605(17);
			Class8.method73();
			Class2.method3();
			Class10.method116();
			Class32.method323();
			Class26.aClass26Array1 = null;
			Class36.aClass36Array1 = null;
			Class49.aClass49Array1 = null;
			Class30.aClass30Array1 = null;
			Class39.aClass39Array1 = null;
			Class39.aClass7_8 = null;
			Class37.aClass37Array1 = null;
			super.aClass13_2 = null;
			Class3_Sub1_Sub1_Sub4_Sub2.aClass7_9 = null;
			Class3_Sub1_Sub2_Sub2.method98();
			Class25.method247();
			Class3_Sub1_Sub1_Sub5.method392();
			Class5.method62();
			System.gc();
		} catch (@Pc(380) RuntimeException local380) {
			signlink.reporterror("70749, " + 297 + ", " + local380.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BIII)I")
	private int method722(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = 256 - arg0;
			return ((arg2 & 0xFF00FF) * local3 + (arg1 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg2 & 0xFF00) * local3 + (arg1 & 0xFF00) * arg0 & 0xFF0000) >> 8;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("50456, " + 66 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "M", descriptor = "(I)V")
	private void method723() {
		try {
			if (this.aClass13_6 == null) {
				this.method605(17);
				super.aClass13_2 = null;
				this.aClass13_7 = null;
				this.aClass13_8 = null;
				this.aClass13_9 = null;
				this.aClass13_10 = null;
				this.aClass13_11 = null;
				this.aClass13_12 = null;
				this.aClass13_13 = null;
				this.aClass13_14 = null;
				this.aClass13_15 = null;
				this.aClass13_6 = new Class13(3, 96, 479, this.method585());
				this.aClass13_4 = new Class13(3, 156, 172, this.method585());
				Class3_Sub1_Sub2.method519();
				this.aClass3_Sub1_Sub2_Sub3_19.method369(0, 0);
				this.aClass13_3 = new Class13(3, 261, 190, this.method585());
				this.aClass13_5 = new Class13(3, 334, 512, this.method585());
				Class3_Sub1_Sub2.method519();
				this.aClass13_25 = new Class13(3, 50, 496, this.method585());
				this.aClass13_26 = new Class13(3, 37, 269, this.method585());
				this.aClass13_27 = new Class13(3, 45, 249, this.method585());
				this.aBoolean210 = true;
				this.aClass13_5.method157(this.aBoolean229);
				Class3_Sub1_Sub2_Sub2.anIntArray29 = this.anIntArray229;
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("4450, " + 9 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIIIII)V")
	private void method724(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(8) int local8 = this.aClass25_1.method274(arg1, arg3, arg4);
			@Pc(23) int local23;
			@Pc(29) int local29;
			@Pc(33) int local33;
			@Pc(35) int local35;
			@Pc(57) int local57;
			@Pc(63) int local63;
			if (local8 != 0) {
				local23 = this.aClass25_1.method278(arg1, arg3, arg4, local8);
				local29 = local23 >> 6 & 0x3;
				local33 = local23 & 0x1F;
				local35 = arg2;
				if (local8 > 0) {
					local35 = arg0;
				}
				@Pc(43) int[] local43 = this.aClass3_Sub1_Sub2_Sub4_13.anIntArray182;
				local57 = arg3 * 4 + (103 - arg4) * 512 * 4 + 24624;
				local63 = local8 >> 14 & 0x7FFF;
				@Pc(66) Class8 local66 = Class8.method70(local63);
				if (local66.anInt113 == -1) {
					if (local33 == 0 || local33 == 2) {
						if (local29 == 0) {
							local43[local57] = local35;
							local43[local57 + 512] = local35;
							local43[local57 + 1024] = local35;
							local43[local57 + 1536] = local35;
						} else if (local29 == 1) {
							local43[local57] = local35;
							local43[local57 + 1] = local35;
							local43[local57 + 2] = local35;
							local43[local57 + 3] = local35;
						} else if (local29 == 2) {
							local43[local57 + 3] = local35;
							local43[local57 + 3 + 512] = local35;
							local43[local57 + 3 + 1024] = local35;
							local43[local57 + 3 + 1536] = local35;
						} else if (local29 == 3) {
							local43[local57 + 1536] = local35;
							local43[local57 + 1536 + 1] = local35;
							local43[local57 + 1536 + 2] = local35;
							local43[local57 + 1536 + 3] = local35;
						}
					}
					if (local33 == 3) {
						if (local29 == 0) {
							local43[local57] = local35;
						} else if (local29 == 1) {
							local43[local57 + 3] = local35;
						} else if (local29 == 2) {
							local43[local57 + 3 + 1536] = local35;
						} else if (local29 == 3) {
							local43[local57 + 1536] = local35;
						}
					}
					if (local33 == 2) {
						if (local29 == 3) {
							local43[local57] = local35;
							local43[local57 + 512] = local35;
							local43[local57 + 1024] = local35;
							local43[local57 + 1536] = local35;
						} else if (local29 == 0) {
							local43[local57] = local35;
							local43[local57 + 1] = local35;
							local43[local57 + 2] = local35;
							local43[local57 + 3] = local35;
						} else if (local29 == 1) {
							local43[local57 + 3] = local35;
							local43[local57 + 3 + 512] = local35;
							local43[local57 + 3 + 1024] = local35;
							local43[local57 + 3 + 1536] = local35;
						} else if (local29 == 2) {
							local43[local57 + 1536] = local35;
							local43[local57 + 1536 + 1] = local35;
							local43[local57 + 1536 + 2] = local35;
							local43[local57 + 1536 + 3] = local35;
						}
					}
				} else {
					@Pc(76) Class3_Sub1_Sub2_Sub3 local76 = this.aClass3_Sub1_Sub2_Sub3Array3[local66.anInt113];
					if (local76 != null) {
						@Pc(88) int local88 = (local66.anInt102 * 4 - local76.anInt547) / 2;
						@Pc(98) int local98 = (local66.anInt110 * 4 - local76.anInt548) / 2;
						local76.method369(arg3 * 4 + local88 + 48, (104 - arg4 - local66.anInt110) * 4 + 48 + local98);
					}
				}
			}
			local8 = this.aClass25_1.method276(arg1, arg3, arg4);
			if (local8 != 0) {
				local23 = this.aClass25_1.method278(arg1, arg3, arg4, local8);
				local29 = local23 >> 6 & 0x3;
				local33 = local23 & 0x1F;
				local35 = local8 >> 14 & 0x7FFF;
				@Pc(452) Class8 local452 = Class8.method70(local35);
				@Pc(484) int local484;
				if (local452.anInt113 != -1) {
					@Pc(462) Class3_Sub1_Sub2_Sub3 local462 = this.aClass3_Sub1_Sub2_Sub3Array3[local452.anInt113];
					if (local462 != null) {
						local63 = (local452.anInt102 * 4 - local462.anInt547) / 2;
						local484 = (local452.anInt110 * 4 - local462.anInt548) / 2;
						local462.method369(arg3 * 4 + local63 + 48, (104 - arg4 - local452.anInt110) * 4 + 48 + local484);
					}
				} else if (local33 == 9) {
					local57 = 15658734;
					if (local8 > 0) {
						local57 = 15597568;
					}
					@Pc(521) int[] local521 = this.aClass3_Sub1_Sub2_Sub4_13.anIntArray182;
					local484 = arg3 * 4 + (103 - arg4) * 512 * 4 + 24624;
					if (local29 == 0 || local29 == 2) {
						local521[local484 + 1536] = local57;
						local521[local484 + 1024 + 1] = local57;
						local521[local484 + 512 + 2] = local57;
						local521[local484 + 3] = local57;
					} else {
						local521[local484] = local57;
						local521[local484 + 512 + 1] = local57;
						local521[local484 + 1024 + 2] = local57;
						local521[local484 + 1536 + 3] = local57;
					}
				}
			}
			local8 = this.aClass25_1.method277(arg1, arg3, arg4);
			if (local8 != 0) {
				local23 = local8 >> 14 & 0x7FFF;
				@Pc(616) Class8 local616 = Class8.method70(local23);
				if (local616.anInt113 != -1) {
					@Pc(626) Class3_Sub1_Sub2_Sub3 local626 = this.aClass3_Sub1_Sub2_Sub3Array3[local616.anInt113];
					if (local626 != null) {
						local35 = (local616.anInt102 * 4 - local626.anInt547) / 2;
						@Pc(648) int local648 = (local616.anInt110 * 4 - local626.anInt548) / 2;
						local626.method369(arg3 * 4 + local35 + 48, (104 - arg4 - local616.anInt110) * 4 + 48 + local648);
						return;
					}
				}
			}
		} catch (@Pc(672) RuntimeException local672) {
			signlink.reporterror("742, " + arg0 + ", " + -868 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local672.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "N", descriptor = "(I)V")
	private void method725() {
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
				this.aClass44_11.method443();
				this.aClass44_10.method443();
				Class3_Sub1_Sub2_Sub2.method101();
				this.method680();
				this.aClass25_1.method248();
				System.gc();
				for (local22 = 0; local22 < 4; local22++) {
					this.aClass11Array1[local22].method128();
				}
				for (local35 = 0; local35 < 4; local35++) {
					for (local39 = 0; local39 < 104; local39++) {
						for (local43 = 0; local43 < 104; local43++) {
							this.aByteArrayArrayArray8[local35][local39][local43] = 0;
						}
					}
				}
				@Pc(77) Class47 local77 = new Class47(104, this.anIntArrayArrayArray8, 104, -706, this.aByteArrayArrayArray8);
				local43 = this.aByteArrayArray6.length;
				this.aClass3_Sub1_Sub4_7.method447(186);
				@Pc(238) int local238;
				@Pc(226) int local226;
				if (!this.aBoolean228) {
					@Pc(122) byte[] local122;
					for (local91 = 0; local91 < local43; local91++) {
						local105 = (this.anIntArray231[local91] >> 8) * 64 - this.anInt946;
						local117 = (this.anIntArray231[local91] & 0xFF) * 64 - this.anInt947;
						local122 = this.aByteArrayArray6[local91];
						if (local122 != null) {
							local77.method557(local117, (this.anInt912 - 6) * 8, local122, (this.anInt913 - 6) * 8, local105, this.aClass11Array1);
						}
					}
					for (local105 = 0; local105 < local43; local105++) {
						local117 = (this.anIntArray231[local105] >> 8) * 64 - this.anInt946;
						local176 = (this.anIntArray231[local105] & 0xFF) * 64 - this.anInt947;
						@Pc(181) byte[] local181 = this.aByteArrayArray6[local105];
						if (local181 == null && this.anInt913 < 800) {
							local77.method545(local117, 64, local176, 64);
						}
					}
					this.aClass3_Sub1_Sub4_7.method447(186);
					for (local117 = 0; local117 < local43; local117++) {
						local122 = this.aByteArrayArray5[local117];
						if (local122 != null) {
							local226 = (this.anIntArray231[local117] >> 8) * 64 - this.anInt946;
							local238 = (this.anIntArray231[local117] & 0xFF) * 64 - this.anInt947;
							local77.method553(this.aClass11Array1, local122, local226, local238, this.aClass25_1);
						}
					}
				}
				if (this.aBoolean228) {
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
										local77.method545(local105 * 8, 8, local117 * 8, 8);
									}
								}
							}
							this.aClass3_Sub1_Sub4_7.method447(186);
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
											for (@Pc(496) int local496 = 0; local496 < this.anIntArray231.length; local496++) {
												if (this.anIntArray231[local496] == local317 && this.aByteArrayArray5[local496] != null) {
													local77.method544(local176 * 8, (local315 & 0x7) * 8, (local305 & 0x7) * 8, this.aByteArrayArray5[local496], local299, 867, local117, this.aClass25_1, local293, local226 * 8, this.aClass11Array1);
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
									for (local317 = 0; local317 < this.anIntArray231.length; local317++) {
										if (this.anIntArray231[local317] == local315 && this.aByteArrayArray6[local317] != null) {
											local77.method559((local305 & 0x7) * 8, local91, local117 * 8, this.aByteArrayArray6[local317], (local299 & 0x7) * 8, this.aClass11Array1, local105 * 8, local293, local238);
											local269 = true;
											break;
										}
									}
								}
								if (!local269) {
									local77.method549(local91, local105 * 8, local117 * 8);
								}
							}
						}
						local91++;
					}
				}
				this.aClass3_Sub1_Sub4_7.method447(186);
				local77.method550(this.anInt899, this.aClass25_1, this.aClass11Array1);
				if (this.aClass13_5 != null) {
					this.aClass13_5.method157(this.aBoolean229);
					Class3_Sub1_Sub2_Sub2.anIntArray29 = this.anIntArray229;
				}
				this.aClass3_Sub1_Sub4_7.method447(186);
				local91 = Class47.anInt781;
				if (local91 > this.anInt894) {
					local91 = this.anInt894;
				}
				if (local91 < this.anInt894 - 1) {
					local91 = this.anInt894 - 1;
				}
				if (aBoolean203) {
					this.aClass25_1.method249(Class47.anInt781);
				} else {
					this.aClass25_1.method249(0);
				}
				for (local105 = 0; local105 < 104; local105++) {
					for (local117 = 0; local117 < 104; local117++) {
						this.method669(local105, local117);
					}
				}
				this.method708();
			} catch (@Pc(647) Exception local647) {
			}
			Class8.aClass7_3.method67();
			if (super.aFrame_Sub1_2 != null) {
				this.aClass3_Sub1_Sub4_7.method447(94);
				this.aClass3_Sub1_Sub4_7.method452(1057001181);
			}
			if (aBoolean203 && signlink.aRandomAccessFile3 != null) {
				local22 = this.aClass16_Sub1_1.method206(0);
				for (local35 = 0; local35 < local22; local35++) {
					local39 = this.aClass16_Sub1_1.method208(local35);
					if ((local39 & 0x79) == 0) {
						Class3_Sub1_Sub1_Sub5.method395(local35);
					}
				}
			}
			System.gc();
			Class3_Sub1_Sub2_Sub2.method102();
			this.aClass16_Sub1_1.method223(this.aByte47);
			local22 = (this.anInt912 - 6) / 8 - 1;
			local35 = (this.anInt912 + 6) / 8 + 1;
			local39 = (this.anInt913 - 6) / 8 - 1;
			local43 = (this.anInt913 + 6) / 8 + 1;
			if (this.aBoolean227) {
				local22 = 49;
				local35 = 50;
				local39 = 49;
				local43 = 50;
			}
			for (local91 = local22; local91 <= local35; local91++) {
				for (local105 = local39; local105 <= local43; local105++) {
					if (local91 == local22 || local91 == local35 || local105 == local39 || local105 == local43) {
						local117 = this.aClass16_Sub1_1.method211(local91, 0, local105);
						if (local117 != -1) {
							this.aClass16_Sub1_1.method209(3, local117);
						}
						local176 = this.aClass16_Sub1_1.method211(local91, 1, local105);
						if (local176 != -1) {
							this.aClass16_Sub1_1.method209(3, local176);
						}
					}
				}
			}
		} catch (@Pc(817) RuntimeException local817) {
			signlink.reporterror("97051, " + 664 + ", " + local817.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(B)V")
	private void method726() {
		try {
			@Pc(4) int local4 = this.anInt1006;
			@Pc(7) int local7 = this.anInt1007;
			@Pc(10) int local10 = this.anInt1008;
			@Pc(13) int local13 = this.anInt1009;
			Class3_Sub1_Sub2.method521(local10, 6116423, local13, local4, this.aByte44, local7);
			Class3_Sub1_Sub2.method521(local10 - 2, 0, 16, local4 + 1, this.aByte44, local7 + 1);
			Class3_Sub1_Sub2.method522(local13 - 19, local10 - 2, 0, local7 + 18, local4 + 1);
			this.aClass3_Sub1_Sub2_Sub1_4.method49(local4 + 3, 6116423, "Choose Option", local7 + 14, this.anInt969);
			@Pc(68) int local68 = super.anInt804;
			@Pc(71) int local71 = super.anInt805;
			if (this.anInt1005 == 0) {
				local68 -= 4;
				local71 -= 4;
			}
			if (this.anInt1005 == 1) {
				local68 -= 553;
				local71 -= 205;
			}
			if (this.anInt1005 == 2) {
				local68 -= 17;
				local71 -= 357;
			}
			for (@Pc(90) int local90 = 0; local90 < this.anInt1045; local90++) {
				@Pc(105) int local105 = local7 + (this.anInt1045 - 1 - local90) * 15 + 31;
				@Pc(107) int local107 = 16777215;
				if (local68 > local4 && local68 < local4 + local10 && local71 > local105 - 13 && local71 < local105 + 3) {
					local107 = 16776960;
				}
				this.aClass3_Sub1_Sub2_Sub1_4.method53((byte) 1, true, local105, local107, local4 + 3, this.aStringArray13[local90]);
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("77664, " + 114 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}
}
