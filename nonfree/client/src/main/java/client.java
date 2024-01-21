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

	@OriginalMember(owner = "client!client", name = "I", descriptor = "I")
	private static int anInt841;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "I")
	private static int anInt848;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "Lclient!TINBLEHZ;")
	public static Class2_Sub1_Sub1_Sub2_Sub1 aClass2_Sub1_Sub1_Sub2_Sub1_1;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
	private static int anInt862;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "I")
	private static int anInt886;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
	private static int anInt900;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "I")
	private static int anInt937;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "Z")
	private static boolean aBoolean216;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "I")
	private static int anInt961;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
	private static int anInt972;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "Z")
	private static boolean aBoolean219;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "I")
	public static int anInt993;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "Z")
	private static boolean aBoolean220;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "I")
	public static int anInt1014;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "Z")
	private static boolean aBoolean227;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "I")
	private static int anInt1025;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "I")
	private static int anInt1031;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "I")
	private static int anInt1040;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "I")
	private static int anInt1049;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "I")
	private static int anInt1060;

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "I")
	private static int anInt1063;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "[I")
	public static final int[] anIntArray223;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "[[I")
	public static final int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "[I")
	private static int[] anIntArray232;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "Ljava/lang/String;")
	private static String aString24;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "I")
	private static int anInt994;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "I")
	private static int anInt1013;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "Z")
	private static boolean aBoolean226;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "I")
	private static int anInt1035;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "I")
	private static int anInt1045;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "[I")
	public static int[] anIntArray265;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "B")
	private static byte aByte36;

	@OriginalMember(owner = "client!client", name = "J", descriptor = "I")
	private int anInt842;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "I")
	private int anInt843;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "I")
	private int anInt844;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "I")
	private int anInt845;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "I")
	private int anInt846;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "I")
	private int anInt847;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "Lclient!AKBGAGNS;")
	private Class1 aClass1_3;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "Lclient!AKBGAGNS;")
	private Class1 aClass1_4;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "Lclient!AKBGAGNS;")
	private Class1 aClass1_5;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "Lclient!AKBGAGNS;")
	private Class1 aClass1_6;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "Lclient!AKBGAGNS;")
	private Class1 aClass1_7;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "Lclient!AKBGAGNS;")
	private Class1 aClass1_8;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "Lclient!AKBGAGNS;")
	private Class1 aClass1_9;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "Lclient!AKBGAGNS;")
	private Class1 aClass1_10;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Lclient!AKBGAGNS;")
	private Class1 aClass1_11;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
	private int anInt850;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
	private int anInt851;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
	private int anInt852;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
	private int anInt853;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
	private int anInt854;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
	private int anInt855;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
	private int anInt856;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "Lclient!AKBGAGNS;")
	private Class1 aClass1_12;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "Lclient!AKBGAGNS;")
	private Class1 aClass1_13;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "Lclient!AKBGAGNS;")
	private Class1 aClass1_14;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
	private int anInt857;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
	private int anInt858;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
	private int anInt859;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
	private int anInt861;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "I")
	private int anInt865;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "I")
	private int anInt866;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "I")
	private int anInt867;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "I")
	private int anInt868;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "I")
	private int anInt869;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "I")
	private int anInt870;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "I")
	private int anInt871;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "I")
	private int anInt872;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
	private int anInt873;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
	private int anInt874;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "I")
	private int anInt875;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "I")
	private int anInt876;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "I")
	private int anInt877;

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "I")
	private int anInt878;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
	private int anInt880;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "I")
	private int anInt881;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
	private int anInt882;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "I")
	private int anInt883;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
	private int anInt884;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "I")
	private int anInt885;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "[I")
	private int[] anIntArray219;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "[I")
	private int[] anIntArray220;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "[I")
	private int[] anIntArray221;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
	private int anInt887;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "Lclient!NPZZPPRD;")
	private Class2_Sub1_Sub3_Sub4 aClass2_Sub1_Sub3_Sub4_1;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "Lclient!NPZZPPRD;")
	private Class2_Sub1_Sub3_Sub4 aClass2_Sub1_Sub3_Sub4_2;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "Lclient!NPZZPPRD;")
	private Class2_Sub1_Sub3_Sub4 aClass2_Sub1_Sub3_Sub4_3;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "Lclient!NPZZPPRD;")
	private Class2_Sub1_Sub3_Sub4 aClass2_Sub1_Sub3_Sub4_4;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "Lclient!NPZZPPRD;")
	private Class2_Sub1_Sub3_Sub4 aClass2_Sub1_Sub3_Sub4_5;

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "[Lclient!NPZZPPRD;")
	private Class2_Sub1_Sub3_Sub4[] aClass2_Sub1_Sub3_Sub4Array2;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "Lclient!NPZZPPRD;")
	private Class2_Sub1_Sub3_Sub4 aClass2_Sub1_Sub3_Sub4_6;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "Lclient!NPZZPPRD;")
	private Class2_Sub1_Sub3_Sub4 aClass2_Sub1_Sub3_Sub4_7;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "Lclient!NPZZPPRD;")
	private Class2_Sub1_Sub3_Sub4 aClass2_Sub1_Sub3_Sub4_8;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "I")
	private int anInt890;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "I")
	private int anInt893;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "Lclient!NPZZPPRD;")
	private Class2_Sub1_Sub3_Sub4 aClass2_Sub1_Sub3_Sub4_9;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "Lclient!NPZZPPRD;")
	private Class2_Sub1_Sub3_Sub4 aClass2_Sub1_Sub3_Sub4_10;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "Lclient!NPZZPPRD;")
	private Class2_Sub1_Sub3_Sub4 aClass2_Sub1_Sub3_Sub4_11;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "Lclient!NPZZPPRD;")
	private Class2_Sub1_Sub3_Sub4 aClass2_Sub1_Sub3_Sub4_12;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "Lclient!NPZZPPRD;")
	private Class2_Sub1_Sub3_Sub4 aClass2_Sub1_Sub3_Sub4_13;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "I")
	private int anInt894;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "I")
	private int anInt897;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "I")
	private int anInt898;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "Lclient!LOVQYTIZ;")
	private Class2_Sub1_Sub3_Sub3 aClass2_Sub1_Sub3_Sub3_3;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "I")
	private int anInt901;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "I")
	private int anInt902;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "I")
	private int anInt903;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "I")
	private int anInt904;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "Lclient!PWLKORWL;")
	private Class32 aClass32_1;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "I")
	private int anInt905;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "Lclient!FOFQGQZJ;")
	private Class14_Sub1 aClass14_Sub1_1;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "I")
	private int anInt906;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
	private int anInt907;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "Lclient!AKBGAGNS;")
	private Class1 aClass1_15;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "Lclient!AKBGAGNS;")
	private Class1 aClass1_16;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "Lclient!AKBGAGNS;")
	private Class1 aClass1_17;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "Lclient!AKBGAGNS;")
	private Class1 aClass1_18;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "I")
	private int anInt909;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "I")
	private int anInt911;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "Lclient!JUPFHAZZ;")
	private Class21 aClass21_2;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "I")
	private int anInt913;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "I")
	private int anInt914;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "I")
	private int anInt915;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "Ljava/lang/String;")
	private String aString20;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "I")
	private int anInt916;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "[[B")
	private byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "I")
	private int anInt918;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "I")
	private int anInt919;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "I")
	private int anInt920;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
	private int anInt921;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "I")
	private int anInt922;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "Lclient!LOVQYTIZ;")
	private Class2_Sub1_Sub3_Sub3 aClass2_Sub1_Sub3_Sub3_4;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "I")
	private int anInt923;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "I")
	private int anInt924;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "I")
	private int anInt925;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "I")
	private int anInt926;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "I")
	private int anInt928;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "I")
	private int anInt929;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
	private int anInt930;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "I")
	private int anInt931;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "I")
	private int anInt932;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "I")
	private int anInt933;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "I")
	private int anInt934;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "I")
	private int anInt935;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
	private int anInt936;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
	private int anInt938;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
	private int anInt939;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "I")
	private int anInt940;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "I")
	private int anInt941;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "I")
	private int anInt942;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "I")
	private int anInt943;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "I")
	private int anInt944;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "I")
	private int anInt945;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "I")
	private int anInt946;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "Lclient!LICHOWDY;")
	private Class2_Sub1_Sub3_Sub2 aClass2_Sub1_Sub3_Sub2_2;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "Lclient!LICHOWDY;")
	private Class2_Sub1_Sub3_Sub2 aClass2_Sub1_Sub3_Sub2_3;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "Lclient!LICHOWDY;")
	private Class2_Sub1_Sub3_Sub2 aClass2_Sub1_Sub3_Sub2_4;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "Lclient!LICHOWDY;")
	private Class2_Sub1_Sub3_Sub2 aClass2_Sub1_Sub3_Sub2_5;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "I")
	private int anInt949;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "I")
	private int anInt951;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
	private int anInt952;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "I")
	private int anInt953;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "I")
	private int anInt954;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
	private int anInt955;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
	private int anInt956;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "[I")
	private int[] anIntArray238;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "[I")
	private int[] anIntArray239;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "[I")
	private int[] anIntArray240;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "[I")
	private int[] anIntArray241;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "I")
	private int anInt957;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "I")
	private int anInt958;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "Lclient!JPCEPCNA;")
	private Class20 aClass20_1;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
	private int anInt964;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "I")
	private int anInt965;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "Lclient!NPZZPPRD;")
	private Class2_Sub1_Sub3_Sub4 aClass2_Sub1_Sub3_Sub4_14;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "Lclient!NPZZPPRD;")
	private Class2_Sub1_Sub3_Sub4 aClass2_Sub1_Sub3_Sub4_15;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "I")
	private int anInt967;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "I")
	private int anInt968;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "I")
	private int anInt969;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "I")
	private int anInt970;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "I")
	private int anInt971;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "I")
	private int anInt973;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "I")
	private int anInt974;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
	private int anInt975;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "I")
	private int anInt976;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "I")
	private int anInt977;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "I")
	private int anInt978;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
	private int anInt979;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "Lclient!NPZZPPRD;")
	private Class2_Sub1_Sub3_Sub4 aClass2_Sub1_Sub3_Sub4_16;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "Lclient!NPZZPPRD;")
	private Class2_Sub1_Sub3_Sub4 aClass2_Sub1_Sub3_Sub4_17;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "Lclient!NPZZPPRD;")
	private Class2_Sub1_Sub3_Sub4 aClass2_Sub1_Sub3_Sub4_18;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "I")
	private int anInt981;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "I")
	private int anInt982;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "I")
	private int anInt984;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
	private int anInt985;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "I")
	private int anInt986;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
	private int anInt987;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "I")
	private int anInt988;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "Lclient!PDGRVIXR;")
	private Class31 aClass31_1;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "Ljava/lang/String;")
	private String aString23;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "I")
	private int anInt991;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
	private int anInt995;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
	private int anInt996;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
	private int anInt997;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
	private int anInt998;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "Ljava/lang/String;")
	private String aString25;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "I")
	private int anInt1002;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "I")
	private int anInt1004;

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "Lclient!LOVQYTIZ;")
	private Class2_Sub1_Sub3_Sub3 aClass2_Sub1_Sub3_Sub3_5;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "I")
	private int anInt1006;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "I")
	private int anInt1007;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "Ljava/lang/String;")
	private String aString27;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "I")
	private int anInt1008;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "I")
	private int anInt1009;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "Lclient!LOVQYTIZ;")
	private Class2_Sub1_Sub3_Sub3 aClass2_Sub1_Sub3_Sub3_6;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "Lclient!LOVQYTIZ;")
	private Class2_Sub1_Sub3_Sub3 aClass2_Sub1_Sub3_Sub3_7;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "Lclient!LOVQYTIZ;")
	private Class2_Sub1_Sub3_Sub3 aClass2_Sub1_Sub3_Sub3_8;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "Lclient!LOVQYTIZ;")
	private Class2_Sub1_Sub3_Sub3 aClass2_Sub1_Sub3_Sub3_9;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "Lclient!LOVQYTIZ;")
	private Class2_Sub1_Sub3_Sub3 aClass2_Sub1_Sub3_Sub3_10;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "I")
	private int anInt1010;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "I")
	private int anInt1012;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "[I")
	private int[] anIntArray253;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "[I")
	private int[] anIntArray254;

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
	private int anInt1015;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "Lclient!LOVQYTIZ;")
	private Class2_Sub1_Sub3_Sub3 aClass2_Sub1_Sub3_Sub3_11;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "Lclient!LOVQYTIZ;")
	private Class2_Sub1_Sub3_Sub3 aClass2_Sub1_Sub3_Sub3_12;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "I")
	private int anInt1017;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "I")
	private int anInt1018;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "I")
	private int anInt1019;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "I")
	private int anInt1020;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "I")
	private int anInt1021;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "I")
	private int anInt1023;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "Lclient!LOVQYTIZ;")
	private Class2_Sub1_Sub3_Sub3 aClass2_Sub1_Sub3_Sub3_13;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "Lclient!LOVQYTIZ;")
	private Class2_Sub1_Sub3_Sub3 aClass2_Sub1_Sub3_Sub3_14;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "I")
	private int anInt1027;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "I")
	private int anInt1029;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
	private int anInt1030;

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "I")
	private int anInt1032;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "I")
	private int anInt1033;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "[I")
	private int[] anIntArray261;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "[I")
	private int[] anIntArray262;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "Lclient!FKXPJREN;")
	private Class13 aClass13_2;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "I")
	private int anInt1037;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
	private int anInt1038;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "Lclient!LOVQYTIZ;")
	private Class2_Sub1_Sub3_Sub3 aClass2_Sub1_Sub3_Sub3_15;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "Lclient!LOVQYTIZ;")
	private Class2_Sub1_Sub3_Sub3 aClass2_Sub1_Sub3_Sub3_16;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "I")
	private int anInt1041;

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "I")
	private int anInt1042;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "I")
	private int anInt1043;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "I")
	private int anInt1044;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "I")
	private int anInt1046;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "I")
	private int anInt1047;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "I")
	private int anInt1051;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "I")
	private int anInt1052;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "I")
	private int anInt1053;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "I")
	private int anInt1054;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "I")
	private int anInt1056;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "I")
	private int anInt1057;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "I")
	private int anInt1058;

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "Lclient!NPZZPPRD;")
	private Class2_Sub1_Sub3_Sub4 aClass2_Sub1_Sub3_Sub4_19;

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "Lclient!NPZZPPRD;")
	private Class2_Sub1_Sub3_Sub4 aClass2_Sub1_Sub3_Sub4_20;

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "I")
	private int anInt1061;

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "I")
	private int anInt1064;

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "I")
	private int anInt1065;

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "I")
	private int anInt1066;

	@OriginalMember(owner = "client!client", name = "Pj", descriptor = "I")
	private int anInt1070;

	@OriginalMember(owner = "client!client", name = "Sj", descriptor = "[I")
	private int[] anIntArray273;

	@OriginalMember(owner = "client!client", name = "Tj", descriptor = "[I")
	private int[] anIntArray274;

	@OriginalMember(owner = "client!client", name = "Uj", descriptor = "[I")
	private int[] anIntArray275;

	@OriginalMember(owner = "client!client", name = "Vj", descriptor = "[I")
	private int[] anIntArray276;

	@OriginalMember(owner = "client!client", name = "Xj", descriptor = "Lclient!AKBGAGNS;")
	private Class1 aClass1_19;

	@OriginalMember(owner = "client!client", name = "Yj", descriptor = "Lclient!AKBGAGNS;")
	private Class1 aClass1_20;

	@OriginalMember(owner = "client!client", name = "Zj", descriptor = "Lclient!AKBGAGNS;")
	private Class1 aClass1_21;

	@OriginalMember(owner = "client!client", name = "ak", descriptor = "Lclient!AKBGAGNS;")
	private Class1 aClass1_22;

	@OriginalMember(owner = "client!client", name = "bk", descriptor = "Lclient!AKBGAGNS;")
	private Class1 aClass1_23;

	@OriginalMember(owner = "client!client", name = "ck", descriptor = "Lclient!AKBGAGNS;")
	private Class1 aClass1_24;

	@OriginalMember(owner = "client!client", name = "dk", descriptor = "Lclient!AKBGAGNS;")
	private Class1 aClass1_25;

	@OriginalMember(owner = "client!client", name = "ek", descriptor = "Lclient!AKBGAGNS;")
	private Class1 aClass1_26;

	@OriginalMember(owner = "client!client", name = "fk", descriptor = "Lclient!AKBGAGNS;")
	private Class1 aClass1_27;

	@OriginalMember(owner = "client!client", name = "gk", descriptor = "I")
	private int anInt1073;

	@OriginalMember(owner = "client!client", name = "hk", descriptor = "I")
	private int anInt1074;

	@OriginalMember(owner = "client!client", name = "ik", descriptor = "Lclient!LOVQYTIZ;")
	private Class2_Sub1_Sub3_Sub3 aClass2_Sub1_Sub3_Sub3_17;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "[I")
	private int[] anIntArray212 = new int[500];

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "[I")
	private int[] anIntArray213 = new int[500];

	@OriginalMember(owner = "client!client", name = "R", descriptor = "[I")
	private int[] anIntArray214 = new int[500];

	@OriginalMember(owner = "client!client", name = "S", descriptor = "[I")
	private int[] anIntArray215 = new int[500];

	@OriginalMember(owner = "client!client", name = "T", descriptor = "Z")
	private volatile boolean aBoolean199 = false;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "[Lclient!LOVQYTIZ;")
	private Class2_Sub1_Sub3_Sub3[] aClass2_Sub1_Sub3_Sub3Array4 = new Class2_Sub1_Sub3_Sub3[32];

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "[I")
	private int[] anIntArray216 = new int[50];

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "Z")
	private boolean aBoolean200 = false;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	private int anInt849 = -340;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "[I")
	private int[] anIntArray217 = new int[5];

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "[Lclient!ZLYJLLFY;")
	public Class50[] aClass50Array1 = new Class50[5];

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
	private int anInt860 = 3353893;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "Z")
	private boolean aBoolean201 = true;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
	private int anInt863 = -693;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
	private int anInt864 = 7759444;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "Z")
	private boolean aBoolean202 = false;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "Ljava/lang/String;")
	private String aString17 = "";

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "Ljava/lang/String;")
	private String aString18 = "";

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "[I")
	private int[] anIntArray218 = new int[5];

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "I")
	private int anInt879 = -1;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "[Lclient!LOVQYTIZ;")
	private Class2_Sub1_Sub3_Sub3[] aClass2_Sub1_Sub3_Sub3Array5 = new Class2_Sub1_Sub3_Sub3[32];

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "Z")
	private boolean aBoolean203 = false;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "Z")
	private boolean aBoolean204 = false;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "Z")
	private boolean aBoolean206 = false;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7 = new int[4][13][13];

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "I")
	private int anInt888 = -24060;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "[Lclient!VDSFJUIR;")
	private Class42[] aClass42Array1 = new Class42[4];

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "Z")
	private boolean aBoolean207 = true;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "[I")
	private int[] anIntArray222 = new int[Class49.anInt765];

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "I")
	private int anInt889 = 5063219;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "Lclient!TKPFKOXP;")
	private Class2_Sub1_Sub4 aClass2_Sub1_Sub4_6 = Class2_Sub1_Sub4.method480();

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "I")
	private int anInt891 = 3;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "Ljava/lang/String;")
	private String aString19 = "";

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "I")
	private int anInt892 = -17889;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "Z")
	private boolean aBoolean208 = false;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "Z")
	private boolean aBoolean209 = false;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "I")
	private int anInt895 = -1;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "Z")
	private boolean aBoolean210 = true;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "[I")
	private int[] anIntArray224 = new int[5];

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "Lclient!IJNDWVIL;")
	private Class19 aClass19_1 = new Class19();

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "I")
	private final int anInt899 = 100;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "[I")
	private int[] anIntArray225 = new int[100];

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "[I")
	private int[] anIntArray226 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "id", descriptor = "Z")
	private boolean aBoolean211 = false;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "[I")
	private int[] anIntArray227 = new int[7];

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "[Lclient!LOVQYTIZ;")
	private Class2_Sub1_Sub3_Sub3[] aClass2_Sub1_Sub3_Sub3Array6 = new Class2_Sub1_Sub3_Sub3[32];

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "I")
	private int anInt908 = -20671;

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "I")
	private int anInt910 = -38836;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "I")
	private int anInt912 = 2;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "Z")
	private boolean aBoolean212 = true;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "B")
	private byte aByte26 = -54;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "I")
	private int anInt917 = 78;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "Z")
	private boolean aBoolean213 = false;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "[I")
	private int[] anIntArray228 = new int[5];

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "[[I")
	private int[][] anIntArrayArray23 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "[I")
	private int[] anIntArray229 = new int[33];

	@OriginalMember(owner = "client!client", name = "be", descriptor = "[I")
	private int[] anIntArray230 = new int[100];

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8 = new String[100];

	@OriginalMember(owner = "client!client", name = "de", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9 = new String[100];

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "B")
	private byte aByte27 = 0;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "[I")
	private int[] anIntArray231 = new int[5];

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "Z")
	private boolean aBoolean214 = false;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "I")
	private int anInt927 = 128;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "Z")
	private boolean aBoolean215 = false;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "[I")
	private int[] anIntArray233 = new int[50];

	@OriginalMember(owner = "client!client", name = "He", descriptor = "[Z")
	private boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "[I")
	private int[] anIntArray234 = new int[151];

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "[I")
	private final int[] anIntArray235 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "Lclient!SXQMCHPP;")
	private Class38 aClass38_10 = new Class38(5);

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "I")
	private int anInt947 = -1;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
	private int anInt948 = -1;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "[I")
	private int[] anIntArray236 = new int[9];

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "[Lclient!NPZZPPRD;")
	private Class2_Sub1_Sub3_Sub4[] aClass2_Sub1_Sub3_Sub4Array3 = new Class2_Sub1_Sub3_Sub4[2];

	@OriginalMember(owner = "client!client", name = "We", descriptor = "I")
	private int anInt950 = 1;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "Ljava/lang/String;")
	private String aString21 = "";

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "Ljava/lang/String;")
	private String aString22 = "";

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "[I")
	private int[] anIntArray237 = new int[200];

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "Z")
	public boolean aBoolean217 = false;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "Lclient!TKPFKOXP;")
	private Class2_Sub1_Sub4 aClass2_Sub1_Sub4_7 = new Class2_Sub1_Sub4(859, new byte[5000]);

	@OriginalMember(owner = "client!client", name = "of", descriptor = "[Lclient!ZHNLOFBM;")
	private Class2_Sub1_Sub1_Sub2_Sub2[] aClass2_Sub1_Sub1_Sub2_Sub2Array1 = new Class2_Sub1_Sub1_Sub2_Sub2[16384];

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "[I")
	private int[] anIntArray242 = new int[16384];

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "I")
	private int anInt959 = -1;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
	private int anInt960 = -1;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "I")
	private int anInt962 = 2048;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "I")
	private int anInt963 = 2047;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "[Lclient!TINBLEHZ;")
	private Class2_Sub1_Sub1_Sub2_Sub1[] aClass2_Sub1_Sub1_Sub2_Sub1Array1 = new Class2_Sub1_Sub1_Sub2_Sub1[this.anInt962];

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "[I")
	private int[] anIntArray243 = new int[this.anInt962];

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "[I")
	private int[] anIntArray244 = new int[this.anInt962];

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "[Lclient!TKPFKOXP;")
	private Class2_Sub1_Sub4[] aClass2_Sub1_Sub4Array1 = new Class2_Sub1_Sub4[this.anInt962];

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "I")
	private int anInt966 = -1;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "[I")
	private int[] anIntArray245 = new int[33];

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "B")
	private byte aByte28 = 6;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "I")
	private int anInt980 = -1;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "Lclient!SXQMCHPP;")
	private Class38 aClass38_11 = new Class38(5);

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "I")
	private int anInt983 = -1;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "[Lclient!LOVQYTIZ;")
	private Class2_Sub1_Sub3_Sub3[] aClass2_Sub1_Sub3_Sub3Array7 = new Class2_Sub1_Sub3_Sub3[1000];

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "Z")
	private volatile boolean aBoolean218 = false;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "B")
	private byte aByte29 = 111;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "I")
	private int anInt989 = -333;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "I")
	private int anInt990 = -1;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "[J")
	private long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray10 = new String[500];

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "I")
	private int anInt992 = 1;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "[I")
	private int[] anIntArray246 = new int[2000];

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "B")
	private byte aByte30 = 3;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "Z")
	private volatile boolean aBoolean221 = false;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "[I")
	private int[] anIntArray247 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "[I")
	private int[] anIntArray248 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
	private int anInt999 = -1;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "[I")
	private int[] anIntArray249 = new int[Class49.anInt765];

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "Ljava/lang/String;")
	private String aString26 = "";

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "I")
	private int anInt1000 = -1;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "Z")
	private boolean aBoolean222 = true;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
	private int anInt1001 = 14;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "[I")
	public int[] anIntArray250 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11 = new String[5];

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "[Z")
	private boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "I")
	private int anInt1003 = -490;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "I")
	private int anInt1005 = 2;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "[I")
	private int[] anIntArray251 = new int[1000];

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "[I")
	private int[] anIntArray252 = new int[1000];

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "Z")
	private boolean aBoolean223 = false;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "[[I")
	private int[][] anIntArrayArray25 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "Z")
	private boolean aBoolean224 = true;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "Z")
	private boolean aBoolean225 = true;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "[Lclient!NPZZPPRD;")
	private Class2_Sub1_Sub3_Sub4[] aClass2_Sub1_Sub3_Sub4Array4 = new Class2_Sub1_Sub3_Sub4[100];

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "I")
	private int anInt1011 = 5;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "[Lclient!LOVQYTIZ;")
	private Class2_Sub1_Sub3_Sub3[] aClass2_Sub1_Sub3_Sub3Array8 = new Class2_Sub1_Sub3_Sub3[8];

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12 = new String[200];

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "Ljava/lang/String;")
	private String aString28 = "";

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "Z")
	private boolean aBoolean228 = false;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "Lclient!TKPFKOXP;")
	private Class2_Sub1_Sub4 aClass2_Sub1_Sub4_8 = Class2_Sub1_Sub4.method480();

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "Lclient!SXQMCHPP;")
	private Class38 aClass38_12 = new Class38(5);

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "[I")
	private int[] anIntArray255 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "[I")
	private int[] anIntArray256 = new int[Class49.anInt765];

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "B")
	private byte aByte31 = 3;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "[I")
	private int[] anIntArray257 = new int[256];

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "[I")
	private int[] anIntArray258 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "I")
	private int anInt1022 = -1;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "[I")
	private int[] anIntArray259 = new int[151];

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "[J")
	private long[] aLongArray4 = new long[200];

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "Z")
	private boolean aBoolean229 = false;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "[I")
	private int[] anIntArray260 = new int[] { 17, 24, 34, 40 };

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "Z")
	private boolean aBoolean230 = false;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
	private int anInt1024 = -182;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "I")
	private int anInt1026 = 1;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "Z")
	private boolean aBoolean231 = true;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "I")
	private int anInt1034 = -1;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "Z")
	private boolean aBoolean232 = false;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "Z")
	private boolean aBoolean233 = false;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "I")
	private int anInt1036 = -276;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "Lclient!TKPFKOXP;")
	private Class2_Sub1_Sub4 aClass2_Sub1_Sub4_9 = Class2_Sub1_Sub4.method480();

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "[[[Lclient!SXQMCHPP;")
	private Class38[][][] aClass38ArrayArrayArray1 = new Class38[4][104][104];

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "B")
	private byte aByte32 = 18;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "[Lclient!LOVQYTIZ;")
	private Class2_Sub1_Sub3_Sub3[] aClass2_Sub1_Sub3_Sub3Array9 = new Class2_Sub1_Sub3_Sub3[100];

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "I")
	private int anInt1039 = -223;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "B")
	private byte aByte33 = 8;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "B")
	private byte aByte34 = 73;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "Z")
	private boolean aBoolean234 = false;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "Z")
	private boolean aBoolean235 = false;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "[Lclient!LOVQYTIZ;")
	private Class2_Sub1_Sub3_Sub3[] aClass2_Sub1_Sub3_Sub3Array10 = new Class2_Sub1_Sub3_Sub3[20];

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "Ljava/lang/String;")
	private String aString29 = "";

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "Ljava/lang/String;")
	private String aString30 = "";

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13 = new String[100];

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "[I")
	private int[] anIntArray263 = new int[100];

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "Z")
	private boolean aBoolean236 = false;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "Z")
	private boolean aBoolean237 = false;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
	private int anInt1048 = 2;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "[I")
	private int[] anIntArray264 = new int[50];

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "B")
	private byte aByte35 = 17;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "I")
	private int anInt1050 = 577;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "Z")
	private boolean aBoolean238 = false;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "Ljava/lang/String;")
	private String aString31 = "";

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "I")
	private int anInt1059 = -1;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "B")
	private byte aByte37 = -24;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "[B")
	private byte[] aByteArray21 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "I")
	private int anInt1062 = -962;

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "Z")
	private boolean aBoolean239 = false;

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "I")
	private int anInt1067 = 50;

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "[I")
	private int[] anIntArray266 = new int[this.anInt1067];

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "[I")
	private int[] anIntArray267 = new int[this.anInt1067];

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "[I")
	private int[] anIntArray268 = new int[this.anInt1067];

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "[I")
	private int[] anIntArray269 = new int[this.anInt1067];

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "[I")
	private int[] anIntArray270 = new int[this.anInt1067];

	@OriginalMember(owner = "client!client", name = "Jj", descriptor = "[I")
	private int[] anIntArray271 = new int[this.anInt1067];

	@OriginalMember(owner = "client!client", name = "Kj", descriptor = "[I")
	private int[] anIntArray272 = new int[this.anInt1067];

	@OriginalMember(owner = "client!client", name = "Lj", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray14 = new String[this.anInt1067];

	@OriginalMember(owner = "client!client", name = "Mj", descriptor = "I")
	private int anInt1068 = 924;

	@OriginalMember(owner = "client!client", name = "Nj", descriptor = "Z")
	private boolean aBoolean240 = false;

	@OriginalMember(owner = "client!client", name = "Oj", descriptor = "I")
	private int anInt1069 = 2301979;

	@OriginalMember(owner = "client!client", name = "Qj", descriptor = "I")
	private int anInt1071 = 2;

	@OriginalMember(owner = "client!client", name = "Rj", descriptor = "[Lclient!NPZZPPRD;")
	private Class2_Sub1_Sub3_Sub4[] aClass2_Sub1_Sub3_Sub4Array5 = new Class2_Sub1_Sub3_Sub4[13];

	@OriginalMember(owner = "client!client", name = "Wj", descriptor = "I")
	private int anInt1072 = -1;

	static {
		aBoolean205 = true;
		anIntArray223 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		anIntArrayArray22 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
		anIntArray232 = new int[99];
		@Pc(338) int local338 = 0;
		@Pc(340) int local340;
		for (local340 = 0; local340 < 99; local340++) {
			@Pc(345) int local345 = local340 + 1;
			@Pc(358) int local358 = (int) ((double) local345 + Math.pow(2.0D, (double) local345 / 7.0D) * 300.0D);
			local338 += local358;
			anIntArray232[local340] = local338 / 4;
		}
		aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		aString24 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		anInt994 = 37470;
		anInt1013 = 10;
		aBoolean226 = true;
		anInt1035 = 8;
		anInt1045 = -34;
		anIntArray265 = new int[32];
		local338 = 2;
		for (local340 = 0; local340 < 32; local340++) {
			anIntArray265[local340] = local338 - 1;
			local338 += local338;
		}
		aByte36 = -55;
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 366);
			if (arg0.length == 5) {
				anInt1013 = Integer.parseInt(arg0[0]);
				anInt1014 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method674();
				} else if (arg0[2].equals("highmem")) {
					method668(aByte36);
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean226 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean226 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt1077 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method576();
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)Ljava/lang/String;")
	private static String method654(@OriginalArg(1) int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("87839, " + -394 + ", " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)Ljava/lang/String;")
	private static String method664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) String local4 = String.valueOf(arg0);
			for (@Pc(9) int local9 = local4.length() - 3; local9 > 0; local9 -= 3) {
				local4 = local4.substring(0, local9) + "," + local4.substring(local9);
			}
			@Pc(34) boolean local34 = false;
			if (local4.length() > 8) {
				local4 = "@gre@" + local4.substring(0, local4.length() - 8) + " million @whi@(" + local4 + ")";
			} else if (local4.length() > 4) {
				local4 = "@cya@" + local4.substring(0, local4.length() - 4) + "K @whi@(" + local4 + ")";
			}
			return " " + local4;
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("80631, " + arg0 + ", " + arg1 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private static void method668(@OriginalArg(0) byte arg0) {
		try {
			Class20.aBoolean80 = false;
			Class2_Sub1_Sub3_Sub1.aBoolean55 = false;
			if (arg0 == aByte36) {
				aBoolean227 = false;
				Class3.aBoolean27 = false;
				Class37.aBoolean153 = false;
			}
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("25832, " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private static void method674() {
		try {
			Class20.aBoolean80 = true;
			Class2_Sub1_Sub3_Sub1.aBoolean55 = true;
			aBoolean227 = true;
			Class3.aBoolean27 = true;
			Class37.aBoolean153 = true;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("68897, " + 6 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(III)Ljava/lang/String;")
	private static String method675(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
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
			signlink.reporterror("71505, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!TKPFKOXP;B)V")
	private void method589(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub4 arg1) {
		try {
			this.anInt1018 = 0;
			this.anInt965 = 0;
			this.method726(arg0, this.aByte33, arg1);
			this.method655(arg1, arg0);
			this.method708(arg1, arg0);
			this.method722(arg0, arg1);
			@Pc(43) int local43;
			for (@Pc(36) int local36 = 0; local36 < this.anInt1018; local36++) {
				local43 = this.anIntArray258[local36];
				if (this.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local43].anInt777 != anInt993) {
					this.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local43] = null;
				}
			}
			if (arg1.anInt672 != arg0) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.anInt672 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local43 = 0; local43 < this.anInt964; local43++) {
				if (this.aClass2_Sub1_Sub1_Sub2_Sub1Array1[this.anIntArray243[local43]] == null) {
					signlink.reporterror(this.aString21 + " null entry in pl list - pos:" + local43 + " size:" + this.anInt964);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("84026, " + arg0 + ", " + arg1 + ", " + 9 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	private void method590(@OriginalArg(0) int arg0) {
		try {
			@Pc(7) int local7 = this.aClass2_Sub1_Sub3_Sub2_4.method302("Choose Option", (byte) 3);
			@Pc(20) int local20;
			for (@Pc(9) int local9 = 0; local9 < this.anInt1053; local9++) {
				local20 = this.aClass2_Sub1_Sub3_Sub2_4.method302(this.aStringArray10[local9], (byte) 3);
				if (local20 > local7) {
					local7 = local20;
				}
			}
			local7 += 8;
			while (arg0 >= 0) {
			}
			local20 = this.anInt1053 * 15 + 21;
			@Pc(73) int local73;
			@Pc(91) int local91;
			if (super.anInt836 > 4 && super.anInt837 > 4 && super.anInt836 < 516 && super.anInt837 < 338) {
				local73 = super.anInt836 - local7 / 2 - 4;
				if (local73 + local7 > 512) {
					local73 = 512 - local7;
				}
				if (local73 < 0) {
					local73 = 0;
				}
				local91 = super.anInt837 - 4;
				if (local91 + local20 > 334) {
					local91 = 334 - local20;
				}
				if (local91 < 0) {
					local91 = 0;
				}
				this.aBoolean233 = true;
				this.anInt880 = 0;
				this.anInt881 = local73;
				this.anInt882 = local91;
				this.anInt883 = local7;
				this.anInt884 = this.anInt1053 * 15 + 22;
			}
			if (super.anInt836 > 553 && super.anInt837 > 205 && super.anInt836 < 743 && super.anInt837 < 466) {
				local73 = super.anInt836 - local7 / 2 - 553;
				if (local73 < 0) {
					local73 = 0;
				} else if (local73 + local7 > 190) {
					local73 = 190 - local7;
				}
				local91 = super.anInt837 - 205;
				if (local91 < 0) {
					local91 = 0;
				} else if (local91 + local20 > 261) {
					local91 = 261 - local20;
				}
				this.aBoolean233 = true;
				this.anInt880 = 1;
				this.anInt881 = local73;
				this.anInt882 = local91;
				this.anInt883 = local7;
				this.anInt884 = this.anInt1053 * 15 + 22;
			}
			if (super.anInt836 > 17 && super.anInt837 > 357 && super.anInt836 < 496 && super.anInt837 < 453) {
				local73 = super.anInt836 - local7 / 2 - 17;
				if (local73 < 0) {
					local73 = 0;
				} else if (local73 + local7 > 479) {
					local73 = 479 - local7;
				}
				local91 = super.anInt837 - 357;
				if (local91 < 0) {
					local91 = 0;
				} else if (local91 + local20 > 96) {
					local91 = 96 - local20;
				}
				this.aBoolean233 = true;
				this.anInt880 = 2;
				this.anInt881 = local73;
				this.anInt882 = local91;
				this.anInt883 = local7;
				this.anInt884 = this.anInt1053 * 15 + 22;
			}
		} catch (@Pc(295) RuntimeException local295) {
			signlink.reporterror("16551, " + arg0 + ", " + local295.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method591() {
		try {
			@Pc(6) int local6 = this.anInt939 * 128 + 64;
			@Pc(13) int local13 = this.anInt940 * 128 + 64;
			@Pc(25) int local25 = this.method720(local6, this.anInt953, local13, this.anInt905) - this.anInt941;
			if (this.anInt843 < local6) {
				this.anInt843 += this.anInt942 + (local6 - this.anInt843) * this.anInt943 / 1000;
				if (this.anInt843 > local6) {
					this.anInt843 = local6;
				}
			}
			if (this.anInt843 > local6) {
				this.anInt843 -= this.anInt942 + (this.anInt843 - local6) * this.anInt943 / 1000;
				if (this.anInt843 < local6) {
					this.anInt843 = local6;
				}
			}
			if (this.anInt844 < local25) {
				this.anInt844 += this.anInt942 + (local25 - this.anInt844) * this.anInt943 / 1000;
				if (this.anInt844 > local25) {
					this.anInt844 = local25;
				}
			}
			if (this.anInt844 > local25) {
				this.anInt844 -= this.anInt942 + (this.anInt844 - local25) * this.anInt943 / 1000;
				if (this.anInt844 < local25) {
					this.anInt844 = local25;
				}
			}
			if (this.anInt845 < local13) {
				this.anInt845 += this.anInt942 + (local13 - this.anInt845) * this.anInt943 / 1000;
				if (this.anInt845 > local13) {
					this.anInt845 = local13;
				}
			}
			if (this.anInt845 > local13) {
				this.anInt845 -= this.anInt942 + (this.anInt845 - local13) * this.anInt943 / 1000;
				if (this.anInt845 < local13) {
					this.anInt845 = local13;
				}
			}
			local6 = this.anInt967 * 128 + 64;
			local13 = this.anInt968 * 128 + 64;
			local25 = this.method720(local6, this.anInt953, local13, this.anInt905) - this.anInt969;
			@Pc(229) int local229 = local6 - this.anInt843;
			@Pc(234) int local234 = local25 - this.anInt844;
			@Pc(239) int local239 = local13 - this.anInt845;
			@Pc(250) int local250 = (int) Math.sqrt((double) (local229 * local229 + local239 * local239));
			@Pc(261) int local261 = (int) (Math.atan2((double) local234, (double) local250) * 325.949D) & 0x7FF;
			@Pc(272) int local272 = (int) (Math.atan2((double) local229, (double) local239) * -325.949D) & 0x7FF;
			if (local261 < 128) {
				local261 = 128;
			}
			if (local261 > 383) {
				local261 = 383;
			}
			if (this.anInt846 < local261) {
				this.anInt846 += this.anInt970 + (local261 - this.anInt846) * this.anInt971 / 1000;
				if (this.anInt846 > local261) {
					this.anInt846 = local261;
				}
			}
			if (this.anInt846 > local261) {
				this.anInt846 -= this.anInt970 + (this.anInt846 - local261) * this.anInt971 / 1000;
				if (this.anInt846 < local261) {
					this.anInt846 = local261;
				}
			}
			@Pc(343) int local343 = local272 - this.anInt847;
			if (local343 > 1024) {
				local343 -= 2048;
			}
			if (local343 < -1024) {
				local343 += 2048;
			}
			if (local343 > 0) {
				this.anInt847 += this.anInt970 + local343 * this.anInt971 / 1000;
				this.anInt847 &= 0x7FF;
			}
			if (local343 < 0) {
				this.anInt847 -= this.anInt970 + -local343 * this.anInt971 / 1000;
				this.anInt847 &= 0x7FF;
			}
			@Pc(401) int local401 = local272 - this.anInt847;
			if (local401 > 1024) {
				local401 -= 2048;
			}
			if (local401 < -1024) {
				local401 += 2048;
			}
			if (local401 < 0 && local343 > 0 || local401 > 0 && local343 < 0) {
				this.anInt847 = local272;
			}
		} catch (@Pc(422) RuntimeException local422) {
			signlink.reporterror("94639, " + 390 + ", " + local422.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!TKPFKOXP;)V")
	private void method592(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub4 arg1) {
		try {
			this.anInt1018 = 0;
			this.anInt965 = 0;
			this.method595(arg0, arg1);
			this.method691(arg0, arg1);
			this.method644(arg1, arg0);
			@Pc(35) int local35;
			for (@Pc(28) int local28 = 0; local28 < this.anInt1018; local28++) {
				local35 = this.anIntArray258[local28];
				if (this.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local35].anInt777 != anInt993) {
					this.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local35].aClass48_2 = null;
					this.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local35] = null;
				}
			}
			if (arg1.anInt672 != arg0) {
				signlink.reporterror(this.aString21 + " size mismatch in getnpcpos - pos:" + arg1.anInt672 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local35 = 0; local35 < this.anInt957; local35++) {
				if (this.aClass2_Sub1_Sub1_Sub2_Sub2Array1[this.anIntArray242[local35]] == null) {
					signlink.reporterror(this.aString21 + " null entry in npc list - pos:" + local35 + " size:" + this.anInt957);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("6771, " + 2 + ", " + arg0 + ", " + arg1 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method593() {
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
				this.anInt948 = -1;
				this.aClass38_11.method465();
				this.aClass38_12.method465();
				Class2_Sub1_Sub3_Sub1.method135();
				this.method719();
				this.aClass20_1.method222();
				System.gc();
				for (local22 = 0; local22 < 4; local22++) {
					this.aClass42Array1[local22].method533();
				}
				for (local35 = 0; local35 < 4; local35++) {
					for (local39 = 0; local39 < 104; local39++) {
						for (local43 = 0; local43 < 104; local43++) {
							this.aByteArrayArrayArray8[local35][local39][local43] = 0;
						}
					}
				}
				@Pc(77) Class3 local77 = new Class3(this.anIntArrayArrayArray8, this.aByteArrayArrayArray8, 6, 104, 104);
				local43 = this.aByteArrayArray6.length;
				this.aClass2_Sub1_Sub4_8.method481(122);
				@Pc(252) int local252;
				@Pc(240) int local240;
				if (!this.aBoolean223) {
					@Pc(122) byte[] local122;
					for (local91 = 0; local91 < local43; local91++) {
						local105 = (this.anIntArray219[local91] >> 8) * 64 - this.anInt870;
						local117 = (this.anIntArray219[local91] & 0xFF) * 64 - this.anInt871;
						local122 = this.aByteArrayArray6[local91];
						if (local122 != null) {
							local77.method44((this.anInt856 - 6) * 8, local122, local117, local105, (this.anInt855 - 6) * 8, this.aClass42Array1);
						}
					}
					for (local105 = 0; local105 < local43; local105++) {
						local117 = (this.anIntArray219[local105] >> 8) * 64 - this.anInt870;
						local176 = (this.anIntArray219[local105] & 0xFF) * 64 - this.anInt871;
						@Pc(181) byte[] local181 = this.aByteArrayArray6[local105];
						if (local181 == null && this.anInt856 < 800) {
							local77.method47(local117, 64, local176, 64);
						}
					}
					anInt862++;
					if (anInt862 > 67) {
						anInt862 = 0;
						this.aClass2_Sub1_Sub4_8.method481(9);
					}
					this.aClass2_Sub1_Sub4_8.method481(122);
					for (local117 = 0; local117 < local43; local117++) {
						local122 = this.aByteArrayArray5[local117];
						if (local122 != null) {
							local240 = (this.anIntArray219[local117] >> 8) * 64 - this.anInt870;
							local252 = (this.anIntArray219[local117] & 0xFF) * 64 - this.anInt871;
							local77.method53(local122, this.aClass42Array1, local240, 416, this.aClass20_1, local252);
						}
					}
				}
				if (this.aBoolean223) {
					local91 = 0;
					label258: while (true) {
						@Pc(307) int local307;
						@Pc(313) int local313;
						@Pc(319) int local319;
						@Pc(329) int local329;
						@Pc(331) int local331;
						if (local91 >= 4) {
							for (local105 = 0; local105 < 13; local105++) {
								for (local117 = 0; local117 < 13; local117++) {
									local176 = this.anIntArrayArrayArray7[0][local105][local117];
									if (local176 == -1) {
										local77.method47(local105 * 8, 8, local117 * 8, 8);
									}
								}
							}
							this.aClass2_Sub1_Sub4_8.method481(122);
							local117 = 0;
							while (true) {
								if (local117 >= 4) {
									break label258;
								}
								for (local176 = 0; local176 < 13; local176++) {
									for (local240 = 0; local240 < 13; local240++) {
										local252 = this.anIntArrayArrayArray7[local117][local176][local240];
										if (local252 != -1) {
											local307 = local252 >> 24 & 0x3;
											local313 = local252 >> 1 & 0x3;
											local319 = local252 >> 14 & 0x3FF;
											local329 = local252 >> 3 & 0x7FF;
											local331 = (local319 / 8 << 8) + local329 / 8;
											for (@Pc(510) int local510 = 0; local510 < this.anIntArray219.length; local510++) {
												if (this.anIntArray219[local510] == local331 && this.aByteArrayArray5[local510] != null) {
													local77.method45((local319 & 0x7) * 8, this.aClass20_1, local240 * 8, local307, local176 * 8, (local329 & 0x7) * 8, local313, this.aClass42Array1, local117, this.aByteArrayArray5[local510]);
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
								@Pc(283) boolean local283 = false;
								local240 = this.anIntArrayArrayArray7[local91][local105][local117];
								if (local240 != -1) {
									local252 = local240 >> 24 & 0x3;
									local307 = local240 >> 1 & 0x3;
									local313 = local240 >> 14 & 0x3FF;
									local319 = local240 >> 3 & 0x7FF;
									local329 = (local313 / 8 << 8) + local319 / 8;
									for (local331 = 0; local331 < this.anIntArray219.length; local331++) {
										if (this.anIntArray219[local331] == local329 && this.aByteArrayArray6[local331] != null) {
											local77.method52(local117 * 8, local307, local252, this.aByteArrayArray6[local331], local105 * 8, (local319 & 0x7) * 8, (local313 & 0x7) * 8, this.aClass42Array1, local91);
											local283 = true;
											break;
										}
									}
								}
								if (!local283) {
									local77.method54(local117 * 8, 20, local91, local105 * 8);
								}
							}
						}
						local91++;
					}
				}
				this.aClass2_Sub1_Sub4_8.method481(122);
				local77.method42(this.aClass42Array1, this.aClass20_1);
				if (this.aClass1_17 != null) {
					this.aClass1_17.method1(this.aByte34);
					Class2_Sub1_Sub3_Sub1.anIntArray53 = this.anIntArray240;
				}
				this.aClass2_Sub1_Sub4_8.method481(122);
				local91 = Class3.anInt94;
				if (local91 > this.anInt953) {
					local91 = this.anInt953;
				}
				if (local91 < this.anInt953 - 1) {
					local91 = this.anInt953 - 1;
				}
				if (aBoolean227) {
					this.aClass20_1.method223(Class3.anInt94);
				} else {
					this.aClass20_1.method223(0);
				}
				for (local105 = 0; local105 < 104; local105++) {
					for (local117 = 0; local117 < 104; local117++) {
						this.method701(local105, local117);
					}
				}
				this.method658();
			} catch (@Pc(660) Exception local660) {
			}
			Class37.aClass25_6.method349();
			if (super.aFrame_Sub1_2 != null) {
				this.aClass2_Sub1_Sub4_8.method481(159);
				this.aClass2_Sub1_Sub4_8.method486(1057001181);
			}
			if (aBoolean227 && signlink.aRandomAccessFile3 != null) {
				local22 = this.aClass14_Sub1_1.method100(0);
				for (local35 = 0; local35 < local22; local35++) {
					local39 = this.aClass14_Sub1_1.method91(local35);
					if ((local39 & 0x79) == 0) {
						Class2_Sub1_Sub1_Sub6.method384(local35);
					}
				}
			}
			System.gc();
			Class2_Sub1_Sub3_Sub1.method136(anInt1045);
			this.aClass14_Sub1_1.method99();
			local22 = (this.anInt855 - 6) / 8 - 1;
			local35 = (this.anInt855 + 6) / 8 + 1;
			this.anInt865 += 0;
			local39 = (this.anInt856 - 6) / 8 - 1;
			local43 = (this.anInt856 + 6) / 8 + 1;
			if (this.aBoolean240) {
				local22 = 49;
				local35 = 50;
				local39 = 49;
				local43 = 50;
			}
			for (local91 = local22; local91 <= local35; local91++) {
				for (local105 = local39; local105 <= local43; local105++) {
					if (local91 == local22 || local91 == local35 || local105 == local39 || local105 == local43) {
						local117 = this.aClass14_Sub1_1.method96(0, local105, local91);
						if (local117 != -1) {
							this.aClass14_Sub1_1.method94(3, local117, 687);
						}
						local176 = this.aClass14_Sub1_1.method96(1, local105, local91);
						if (local176 != -1) {
							this.aClass14_Sub1_1.method94(3, local176, 687);
						}
					}
				}
			}
		} catch (@Pc(830) RuntimeException local830) {
			signlink.reporterror("45003, " + 0 + ", " + local830.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method594(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString17 = "";
				this.aString18 = "Connecting to server...";
				this.method710(true);
			}
			this.aClass32_1 = new Class32(this, this.method671(anInt1014 + 43594), (byte) 5);
			@Pc(30) long local30 = Class7.method55(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass2_Sub1_Sub4_8.anInt672 = 0;
			this.aClass2_Sub1_Sub4_8.method482(14);
			this.aClass2_Sub1_Sub4_8.method482(local37);
			this.aClass32_1.method424(this.aClass2_Sub1_Sub4_8.aByteArray17, 2);
			for (@Pc(60) int local60 = 0; local60 < 8; local60++) {
				this.aClass32_1.method421();
			}
			@Pc(74) int local74 = this.aClass32_1.method421();
			@Pc(76) int local76 = local74;
			@Pc(225) int local225;
			@Pc(260) int local260;
			if (local74 == 0) {
				this.aClass32_1.method423(this.aClass2_Sub1_Sub4_6.aByteArray17, 0, 8);
				this.aClass2_Sub1_Sub4_6.anInt672 = 0;
				this.aLong30 = this.aClass2_Sub1_Sub4_6.method498();
				@Pc(99) int[] local99 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong30 >> 32), (int) this.aLong30 };
				this.aClass2_Sub1_Sub4_8.anInt672 = 0;
				this.aClass2_Sub1_Sub4_8.method482(10);
				this.aClass2_Sub1_Sub4_8.method486(local99[0]);
				this.aClass2_Sub1_Sub4_8.method486(local99[1]);
				this.aClass2_Sub1_Sub4_8.method486(local99[2]);
				this.aClass2_Sub1_Sub4_8.method486(local99[3]);
				this.aClass2_Sub1_Sub4_8.method486(signlink.anInt1076);
				this.aClass2_Sub1_Sub4_8.method489(arg0);
				this.aClass2_Sub1_Sub4_8.method489(arg1);
				this.aClass2_Sub1_Sub4_8.method507((byte) 2, aBigInteger2, aBigInteger1);
				this.aClass2_Sub1_Sub4_9.anInt672 = 0;
				if (arg2) {
					this.aClass2_Sub1_Sub4_9.method482(18);
				} else {
					this.aClass2_Sub1_Sub4_9.method482(16);
				}
				this.aClass2_Sub1_Sub4_9.method482(this.aClass2_Sub1_Sub4_8.anInt672 + 36 + 1 + 1 + 2);
				this.aClass2_Sub1_Sub4_9.method482(255);
				this.aClass2_Sub1_Sub4_9.method483(366);
				this.aClass2_Sub1_Sub4_9.method482(aBoolean227 ? 1 : 0);
				for (local225 = 0; local225 < 9; local225++) {
					this.aClass2_Sub1_Sub4_9.method486(this.anIntArray236[local225]);
				}
				this.aClass2_Sub1_Sub4_9.method490(this.aClass2_Sub1_Sub4_8.aByteArray17, this.aClass2_Sub1_Sub4_8.anInt672, this.anInt1068);
				this.aClass2_Sub1_Sub4_8.aClass13_1 = new Class13(local99, false);
				for (local260 = 0; local260 < 4; local260++) {
					local99[local260] += 50;
				}
				this.aClass13_2 = new Class13(local99, false);
				this.aClass32_1.method424(this.aClass2_Sub1_Sub4_9.aByteArray17, this.aClass2_Sub1_Sub4_9.anInt672);
				local74 = this.aClass32_1.method421();
			}
			if (local74 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(302) Exception local302) {
				}
				this.method594(arg0, arg1, arg2);
			} else {
				@Pc(390) int local390;
				if (local74 == 2) {
					this.anInt1046 = this.aClass32_1.method421();
					aBoolean216 = this.aClass32_1.method421() == 1;
					this.aLong33 = 0L;
					this.anInt979 = 0;
					this.aClass31_1.anInt517 = 0;
					super.aBoolean198 = true;
					this.aBoolean201 = true;
					this.aBoolean217 = true;
					this.aClass2_Sub1_Sub4_8.anInt672 = 0;
					this.aClass2_Sub1_Sub4_6.anInt672 = 0;
					this.anInt866 = -1;
					this.anInt1019 = -1;
					this.anInt1020 = -1;
					this.anInt1021 = -1;
					this.anInt865 = 0;
					this.anInt867 = 0;
					this.anInt924 = 0;
					this.anInt869 = 0;
					this.anInt938 = 0;
					this.anInt1053 = 0;
					this.aBoolean233 = false;
					super.anInt828 = 0;
					for (local390 = 0; local390 < 100; local390++) {
						this.aStringArray9[local390] = null;
					}
					this.anInt995 = 0;
					this.anInt913 = 0;
					this.anInt887 = 0;
					this.anInt922 = 0;
					this.anInt1004 = (int) (Math.random() * 100.0D) - 50;
					this.anInt911 = (int) (Math.random() * 110.0D) - 55;
					this.anInt949 = (int) (Math.random() * 80.0D) - 40;
					this.anInt1070 = (int) (Math.random() * 120.0D) - 60;
					this.anInt991 = (int) (Math.random() * 30.0D) - 20;
					this.anInt928 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt861 = 0;
					this.anInt948 = -1;
					this.anInt1073 = 0;
					this.anInt1074 = 0;
					this.anInt964 = 0;
					this.anInt957 = 0;
					for (local225 = 0; local225 < this.anInt962; local225++) {
						this.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local225] = null;
						this.aClass2_Sub1_Sub4Array1[local225] = null;
					}
					for (local260 = 0; local260 < 16384; local260++) {
						this.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local260] = null;
					}
					aClass2_Sub1_Sub1_Sub2_Sub1_1 = this.aClass2_Sub1_Sub1_Sub2_Sub1Array1[this.anInt963] = new Class2_Sub1_Sub1_Sub2_Sub1();
					this.aClass38_12.method465();
					this.aClass38_11.method465();
					@Pc(535) int local535;
					@Pc(539) int local539;
					for (@Pc(531) int local531 = 0; local531 < 4; local531++) {
						for (local535 = 0; local535 < 104; local535++) {
							for (local539 = 0; local539 < 104; local539++) {
								this.aClass38ArrayArrayArray1[local531][local535][local539] = null;
							}
						}
					}
					this.aClass38_10 = new Class38(5);
					this.anInt955 = 0;
					this.anInt954 = 0;
					this.method705(this.anInt1072);
					this.anInt1072 = -1;
					this.method705(this.anInt980);
					this.anInt980 = -1;
					this.method705(this.anInt947);
					this.anInt947 = -1;
					this.method705(this.anInt879);
					this.anInt879 = -1;
					this.method705(this.anInt895);
					this.anInt895 = -1;
					this.method705(this.anInt966);
					this.anInt966 = -1;
					this.method705(this.anInt1059);
					this.anInt1059 = -1;
					this.aBoolean211 = false;
					this.anInt891 = 3;
					this.anInt1015 = 0;
					this.aBoolean233 = false;
					this.aBoolean236 = false;
					this.aString27 = null;
					this.anInt952 = 0;
					this.anInt1022 = -1;
					this.aBoolean224 = true;
					this.method601();
					for (local535 = 0; local535 < 5; local535++) {
						this.anIntArray228[local535] = 0;
					}
					for (local539 = 0; local539 < 5; local539++) {
						this.aStringArray11[local539] = null;
						this.aBooleanArray12[local539] = false;
					}
					anInt937 = 0;
					anInt1063 = 0;
					anInt972 = 0;
					anInt1025 = 0;
					anInt1040 = 0;
					anInt886 = 0;
					this.method693();
				} else if (local74 == 3) {
					this.aString17 = "";
					this.aString18 = "Invalid username or password.";
				} else if (local74 == 4) {
					this.aString17 = "Your account has been disabled.";
					this.aString18 = "Please check your message-centre for details.";
				} else if (local74 == 5) {
					this.aString17 = "Your account is already logged in.";
					this.aString18 = "Try again in 60 secs...";
				} else if (local74 == 6) {
					this.aString17 = "RuneScape has been updated!";
					this.aString18 = "Please reload this page.";
				} else if (local74 == 7) {
					this.aString17 = "This world is full.";
					this.aString18 = "Please use a different world.";
				} else if (local74 == 8) {
					this.aString17 = "Unable to connect.";
					this.aString18 = "Login server offline.";
				} else if (local74 == 9) {
					this.aString17 = "Login limit exceeded.";
					this.aString18 = "Too many connections from your address.";
				} else if (local74 == 10) {
					this.aString17 = "Unable to connect.";
					this.aString18 = "Bad session id.";
				} else if (local74 == 12) {
					this.aString17 = "You need a members account to login to this world.";
					this.aString18 = "Please subscribe, or use a different world.";
				} else if (local74 == 13) {
					this.aString17 = "Could not complete login.";
					this.aString18 = "Please try using a different world.";
				} else if (local74 == 14) {
					this.aString17 = "The server is being updated.";
					this.aString18 = "Please wait 1 minute and try again.";
				} else if (local74 == 15) {
					this.aBoolean217 = true;
					this.aClass2_Sub1_Sub4_8.anInt672 = 0;
					this.aClass2_Sub1_Sub4_6.anInt672 = 0;
					this.anInt866 = -1;
					this.anInt1019 = -1;
					this.anInt1020 = -1;
					this.anInt1021 = -1;
					this.anInt865 = 0;
					this.anInt867 = 0;
					this.anInt924 = 0;
					this.anInt1053 = 0;
					this.aBoolean233 = false;
					this.aLong31 = System.currentTimeMillis();
				} else if (local74 == 16) {
					this.aString17 = "Login attempts exceeded.";
					this.aString18 = "Please wait 1 minute and try again.";
				} else if (local74 == 17) {
					this.aString17 = "You are standing in a members-only area.";
					this.aString18 = "To play on this world move to a free area first";
				} else if (local74 == 20) {
					this.aString17 = "Invalid loginserver requested";
					this.aString18 = "Please try using a different world.";
				} else if (local74 == 21) {
					local390 = this.aClass32_1.method421();
					for (@Pc(908) int local908 = local390 + 3; local908 >= 0; local908--) {
						this.aString17 = "You have only just left another world";
						this.aString18 = "Your profile will be transferred in: " + local908;
						this.method710(true);
						try {
							Thread.sleep(1200L);
						} catch (@Pc(930) Exception local930) {
						}
					}
					this.method594(arg0, arg1, arg2);
				} else if (local74 == 22) {
					this.aString17 = "Malformed login packet.";
					this.aString18 = "Please try again.";
				} else if (local74 == 23) {
					this.aString17 = "No reply from loginserver.";
					this.aString18 = "Please try again.";
				} else if (local74 == 24) {
					this.aString17 = "Error loading your profile.";
					this.aString18 = "Please contact customer support.";
				} else if (local74 == 25) {
					this.aString17 = "Unexpected loginserver response.";
					this.aString18 = "Please try using a different world.";
				} else if (local74 == 26) {
					this.aString17 = "This computers address has been blocked";
					this.aString18 = "as it was used to break our rules";
				} else if (local74 != -1) {
					System.out.println("response:" + local74);
					this.aString17 = "Unexpected server response";
					this.aString18 = "Please try using a different world.";
				} else if (local76 != 0) {
					this.aString17 = "No response from server";
					this.aString18 = "Please try using a different world.";
				} else if (this.anInt1029 < 2) {
					try {
						Thread.sleep(2000L);
					} catch (@Pc(1002) Exception local1002) {
					}
					this.anInt1029++;
					this.method594(arg0, arg1, arg2);
				} else {
					this.aString17 = "No response from loginserver";
					this.aString18 = "Please wait 1 minute and try again.";
				}
			}
		} catch (@Pc(1045) IOException local1045) {
			this.aString17 = "";
			this.aString18 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!TKPFKOXP;I)V")
	private void method595(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub4 arg1) {
		try {
			arg1.method502((byte) 5);
			@Pc(9) int local9 = arg1.method503(8);
			@Pc(15) int local15;
			if (local9 < this.anInt957) {
				for (local15 = local9; local15 < this.anInt957; local15++) {
					this.anIntArray258[this.anInt1018++] = this.anIntArray242[local15];
				}
			}
			if (local9 > this.anInt957) {
				signlink.reporterror(this.aString21 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt957 = 0;
			for (local15 = 0; local15 < local9; local15++) {
				@Pc(78) int local78 = this.anIntArray242[local15];
				@Pc(83) Class2_Sub1_Sub1_Sub2_Sub2 local83 = this.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local78];
				@Pc(88) int local88 = arg1.method503(1);
				if (local88 == 0) {
					this.anIntArray242[this.anInt957++] = local78;
					local83.anInt777 = anInt993;
				} else {
					@Pc(111) int local111 = arg1.method503(2);
					if (local111 == 0) {
						this.anIntArray242[this.anInt957++] = local78;
						local83.anInt777 = anInt993;
						this.anIntArray244[this.anInt965++] = local78;
					} else {
						@Pc(162) int local162;
						@Pc(172) int local172;
						if (local111 == 1) {
							this.anIntArray242[this.anInt957++] = local78;
							local83.anInt777 = anInt993;
							local162 = arg1.method503(3);
							local83.method569(local162, false);
							local172 = arg1.method503(1);
							if (local172 == 1) {
								this.anIntArray244[this.anInt965++] = local78;
							}
						} else if (local111 == 2) {
							this.anIntArray242[this.anInt957++] = local78;
							local83.anInt777 = anInt993;
							local162 = arg1.method503(3);
							local83.method569(local162, true);
							local172 = arg1.method503(3);
							local83.method569(local172, true);
							@Pc(230) int local230 = arg1.method503(1);
							if (local230 == 1) {
								this.anIntArray244[this.anInt965++] = local78;
							}
						} else if (local111 == 3) {
							this.anIntArray258[this.anInt1018++] = local78;
						}
					}
				}
			}
		} catch (@Pc(267) RuntimeException local267) {
			signlink.reporterror("53507, " + arg0 + ", " + arg1 + ", " + 40961 + ", " + local267.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILjava/lang/String;ILjava/lang/String;I)Lclient!JUPFHAZZ;")
	private Class21 method596(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(3) byte[] local3 = null;
			@Pc(5) int local5 = 5;
			try {
				if (this.aClass50Array1[0] != null) {
					local3 = this.aClass50Array1[0].method572(arg0);
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
				return new Class21(-6438, local3);
			}
			local34 = 0;
			while (local3 == null) {
				@Pc(61) String local61 = "Unknown error";
				this.method588(arg2, "Requesting " + arg3);
				@Pc(76) int local76;
				try {
					local76 = 0;
					@Pc(87) DataInputStream local87 = this.method702(arg1 + arg4);
					@Pc(90) byte[] local90 = new byte[6];
					local87.readFully(local90, 0, 6);
					@Pc(101) Class2_Sub1_Sub4 local101 = new Class2_Sub1_Sub4(859, local90);
					local101.anInt672 = 3;
					@Pc(109) int local109 = local101.method496() + 6;
					@Pc(111) int local111 = 6;
					local3 = new byte[local109];
					for (@Pc(116) int local116 = 0; local116 < 6; local116++) {
						local3[local116] = local90[local116];
					}
					@Pc(134) int local134;
					while (local111 < local109) {
						local134 = local109 - local111;
						if (local134 > 1000) {
							local134 = 1000;
						}
						@Pc(145) int local145 = local87.read(local3, local111, local134);
						if (local145 < 0) {
							(new StringBuffer("Length error: ")).append(local111).append("/").append(local109).toString();
							throw new IOException("EOF");
						}
						local111 += local145;
						@Pc(174) int local174 = local111 * 100 / local109;
						if (local174 != local76) {
							this.method588(arg2, "Loading " + arg3 + " - " + local174 + "%");
						}
						local76 = local174;
					}
					local87.close();
					try {
						if (this.aClass50Array1[0] != null) {
							this.aClass50Array1[0].method573(local3, local3.length, arg0);
						}
					} catch (@Pc(219) Exception local219) {
						this.aClass50Array1[0] = null;
					}
					if (local3 != null) {
						this.aCRC32_2.reset();
						this.aCRC32_2.update(local3);
						local134 = (int) this.aCRC32_2.getValue();
						if (local134 != arg4) {
							local3 = null;
							local34++;
							local61 = "Checksum error: " + local134;
						}
					}
				} catch (@Pc(254) IOException local254) {
					if (local61.equals("Unknown error")) {
						local61 = "Connection error";
					}
					local3 = null;
				} catch (@Pc(264) NullPointerException local264) {
					local61 = "Null error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(273) ArrayIndexOutOfBoundsException local273) {
					local61 = "Bounds error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(282) Exception local282) {
					local61 = "Unexpected error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				}
				if (local3 == null) {
					for (local76 = local5; local76 > 0; local76--) {
						if (local34 >= 3) {
							this.method588(arg2, "Game updated - please reload page");
							local76 = 10;
						} else {
							this.method588(arg2, local61 + " - Retrying in " + local76);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(326) Exception local326) {
						}
					}
					local5 *= 2;
					if (local5 > 60) {
						local5 = 60;
					}
					this.aBoolean235 = !this.aBoolean235;
				}
			}
			return new Class21(-6438, local3);
		} catch (@Pc(358) RuntimeException local358) {
			signlink.reporterror("94892, " + -54 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local358.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method597(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt1007 >= 100) {
					this.method663("Your ignore list is full. Max of 100 hit", 0, "", this.anInt933);
				} else {
					@Pc(24) String local24 = Class7.method59(Class7.method56(arg0));
					for (@Pc(26) int local26 = 0; local26 < this.anInt1007; local26++) {
						if (this.aLongArray3[local26] == arg0) {
							this.method663(local24 + " is already on your ignore list", 0, "", this.anInt933);
							return;
						}
					}
					for (@Pc(57) int local57 = 0; local57 < this.anInt954; local57++) {
						if (this.aLongArray4[local57] == arg0) {
							this.method663("Please remove " + local24 + " from your friend list first", 0, "", this.anInt933);
							return;
						}
					}
					this.aLongArray3[this.anInt1007++] = arg0;
					this.aBoolean214 = true;
					this.aClass2_Sub1_Sub4_8.method481(74);
					this.aClass2_Sub1_Sub4_8.method488(arg0, this.anInt863);
				}
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("81101, " + arg0 + ", " + 5 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
	private void method598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			this.anInt865 += 0;
			if (arg5 >= 1 && arg3 >= 1 && arg5 <= 102 && arg3 <= 102) {
				if (aBoolean227 && arg4 != this.anInt953) {
					return;
				}
				@Pc(26) int local26 = 0;
				if (arg6 == 0) {
					local26 = this.aClass20_1.method248(arg4, arg5, arg3);
				}
				if (arg6 == 1) {
					local26 = this.aClass20_1.method249(arg3, 251, arg4, arg5);
				}
				if (arg6 == 2) {
					local26 = this.aClass20_1.method250(arg4, arg5, arg3);
				}
				if (arg6 == 3) {
					local26 = this.aClass20_1.method251(arg4, arg5, arg3);
				}
				@Pc(82) int local82;
				if (local26 != 0) {
					local82 = this.aClass20_1.method252(arg4, arg5, arg3, local26);
					@Pc(88) int local88 = local26 >> 14 & 0x7FFF;
					@Pc(92) int local92 = local82 & 0x1F;
					@Pc(96) int local96 = local82 >> 6;
					@Pc(108) Class37 local108;
					if (arg6 == 0) {
						this.aClass20_1.method239(arg3, arg5, arg4);
						local108 = Class37.method451(local88);
						if (local108.aBoolean156) {
							this.aClass42Array1[arg4].method538(arg3, local92, arg5, local96, local108.aBoolean158);
						}
					}
					if (arg6 == 1) {
						this.aClass20_1.method240(arg4, arg5, arg3);
					}
					if (arg6 == 2) {
						this.aClass20_1.method241(arg3, arg5, arg4);
						local108 = Class37.method451(local88);
						if (arg5 + local108.anInt575 > 103 || arg3 + local108.anInt575 > 103 || arg5 + local108.anInt593 > 103 || arg3 + local108.anInt593 > 103) {
							return;
						}
						if (local108.aBoolean156) {
							this.aClass42Array1[arg4].method539(local108.anInt593, arg5, local108.anInt575, local96, arg3, local108.aBoolean158);
						}
					}
					if (arg6 == 3) {
						this.aClass20_1.method242(arg5, arg4, arg3);
						local108 = Class37.method451(local88);
						if (local108.aBoolean156 && local108.aBoolean159) {
							this.aClass42Array1[arg4].method541(arg3, arg5);
						}
					}
				}
				if (arg2 >= 0) {
					local82 = arg4;
					if (arg4 < 3 && (this.aByteArrayArrayArray8[1][arg5][arg3] & 0x2) == 2) {
						local82 = arg4 + 1;
					}
					Class3.method50(this.anIntArrayArrayArray8, this.aClass42Array1[arg4], arg3, arg1, arg4, this.aClass20_1, arg5, local82, arg2, arg0);
					return;
				}
			}
		} catch (@Pc(255) RuntimeException local255) {
			signlink.reporterror("87364, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local255.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ[B)V")
	private void method599(@OriginalArg(1) boolean arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (this.aBoolean231) {
				signlink.anInt1082 = arg0 ? 1 : 0;
				signlink.midisave(arg1, arg1.length);
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("5263, " + 577 + ", " + arg0 + ", " + arg1 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method600() {
		try {
			this.aBoolean217 &= true;
			@Pc(17) int local17;
			@Pc(24) int local24;
			if (this.anInt1058 == 0) {
				local17 = super.anInt826 / 2 - 80;
				local24 = super.anInt827 / 2 + 20;
				local24 += 20;
				if (super.anInt835 == 1 && super.anInt836 >= local17 - 75 && super.anInt836 <= local17 + 75 && super.anInt837 >= local24 - 20 && super.anInt837 <= local24 + 20) {
					this.anInt1058 = 3;
					this.anInt916 = 0;
				}
				local17 = super.anInt826 / 2 + 80;
				if (super.anInt835 == 1 && super.anInt836 >= local17 - 75 && super.anInt836 <= local17 + 75 && super.anInt837 >= local24 - 20 && super.anInt837 <= local24 + 20) {
					this.aString17 = "";
					this.aString18 = "Enter your username & password.";
					this.anInt1058 = 2;
					this.anInt916 = 0;
				}
			} else if (this.anInt1058 == 2) {
				local17 = super.anInt827 / 2 - 40;
				local17 += 30;
				local17 += 25;
				if (super.anInt835 == 1 && super.anInt837 >= local17 - 15 && super.anInt837 < local17) {
					this.anInt916 = 0;
				}
				local17 += 15;
				if (super.anInt835 == 1 && super.anInt837 >= local17 - 15 && super.anInt837 < local17) {
					this.anInt916 = 1;
				}
				local17 += 15;
				local24 = super.anInt826 / 2 - 80;
				@Pc(170) int local170 = super.anInt827 / 2 + 50;
				@Pc(171) int local171 = local170 + 20;
				if (super.anInt835 == 1 && super.anInt836 >= local24 - 75 && super.anInt836 <= local24 + 75 && super.anInt837 >= local171 - 20 && super.anInt837 <= local171 + 20) {
					this.anInt1029 = 0;
					this.method594(this.aString21, this.aString22, false);
					if (this.aBoolean217) {
						return;
					}
				}
				local24 = super.anInt826 / 2 + 80;
				if (super.anInt835 == 1 && super.anInt836 >= local24 - 75 && super.anInt836 <= local24 + 75 && super.anInt837 >= local171 - 20 && super.anInt837 <= local171 + 20) {
					this.anInt1058 = 0;
					this.aString21 = "";
					this.aString22 = "";
				}
				while (true) {
					while (true) {
						@Pc(261) int local261 = this.method580((byte) 8);
						if (local261 == -1) {
							return;
						}
						@Pc(266) boolean local266 = false;
						for (@Pc(268) int local268 = 0; local268 < aString24.length(); local268++) {
							if (local261 == aString24.charAt(local268)) {
								local266 = true;
								break;
							}
						}
						if (this.anInt916 == 0) {
							if (local261 == 8 && this.aString21.length() > 0) {
								this.aString21 = this.aString21.substring(0, this.aString21.length() - 1);
							}
							if (local261 == 9 || local261 == 10 || local261 == 13) {
								this.anInt916 = 1;
							}
							if (local266) {
								this.aString21 = this.aString21 + (char) local261;
							}
							if (this.aString21.length() > 12) {
								this.aString21 = this.aString21.substring(0, 12);
							}
						} else if (this.anInt916 == 1) {
							if (local261 == 8 && this.aString22.length() > 0) {
								this.aString22 = this.aString22.substring(0, this.aString22.length() - 1);
							}
							if (local261 == 9 || local261 == 10 || local261 == 13) {
								this.anInt916 = 0;
							}
							if (local266) {
								this.aString22 = this.aString22 + (char) local261;
							}
							if (this.aString22.length() > 20) {
								this.aString22 = this.aString22.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt1058 == 3) {
				local17 = super.anInt826 / 2;
				local24 = super.anInt827 / 2 + 50;
				@Pc(425) int local425 = local24 + 20;
				if (super.anInt835 == 1 && super.anInt836 >= local17 - 75 && super.anInt836 <= local17 + 75 && super.anInt837 >= local425 - 20 && super.anInt837 <= local425 + 20) {
					this.anInt1058 = 0;
					return;
				}
			}
		} catch (@Pc(458) RuntimeException local458) {
			signlink.reporterror("68086, " + true + ", " + local458.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method601() {
		try {
			this.anInt865 += 0;
			this.aBoolean234 = true;
			for (@Pc(12) int local12 = 0; local12 < 7; local12++) {
				this.anIntArray227[local12] = -1;
				for (@Pc(21) int local21 = 0; local21 < Class27.anInt481; local21++) {
					if (!Class27.aClass27Array1[local21].aBoolean123 && Class27.aClass27Array1[local21].anInt482 == local12 + (this.aBoolean224 ? 0 : 7)) {
						this.anIntArray227[local12] = local21;
						break;
					}
				}
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("79635, " + 0 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method602() {
		try {
			this.aClass1_15.method1(this.aByte34);
			Class2_Sub1_Sub3_Sub1.anIntArray53 = this.anIntArray239;
			this.aClass2_Sub1_Sub3_Sub4_16.method369(0, this.anInt908, 0);
			if (this.anInt966 != -1) {
				this.method634(0, 0, 0, Class19.method213(this.anInt966));
			} else if (this.anIntArray226[this.anInt891] != -1) {
				this.method634(0, 0, 0, Class19.method213(this.anIntArray226[this.anInt891]));
			}
			if (this.aBoolean233 && this.anInt880 == 1) {
				this.method605();
			}
			this.aClass1_15.method2(205, 553, super.aGraphics2);
			this.aClass1_17.method1(this.aByte34);
			Class2_Sub1_Sub3_Sub1.anIntArray53 = this.anIntArray240;
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("50776, " + 0 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	private void method603() {
		try {
			for (@Pc(6) Class2_Sub1_Sub1_Sub5 local6 = (Class2_Sub1_Sub1_Sub5) this.aClass38_12.method461(); local6 != null; local6 = (Class2_Sub1_Sub1_Sub5) this.aClass38_12.method463()) {
				if (local6.anInt387 != this.anInt953 || anInt993 > local6.anInt386) {
					local6.method562();
				} else if (anInt993 >= local6.anInt385) {
					if (local6.anInt396 > 0) {
						@Pc(38) Class2_Sub1_Sub1_Sub2_Sub2 local38 = this.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local6.anInt396 - 1];
						if (local38 != null && local38.anInt778 >= 0 && local38.anInt778 < 13312 && local38.anInt779 >= 0 && local38.anInt779 < 13312) {
							local6.method283(local38.anInt779, this.method720(local38.anInt778, local6.anInt387, local38.anInt779, this.anInt905) - local6.anInt391, local38.anInt778, anInt993);
						}
					}
					if (local6.anInt396 < 0) {
						@Pc(84) int local84 = -local6.anInt396 - 1;
						@Pc(90) Class2_Sub1_Sub1_Sub2_Sub1 local90;
						if (local84 == this.anInt999) {
							local90 = aClass2_Sub1_Sub1_Sub2_Sub1_1;
						} else {
							local90 = this.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local84];
						}
						if (local90 != null && local90.anInt778 >= 0 && local90.anInt778 < 13312 && local90.anInt779 >= 0 && local90.anInt779 < 13312) {
							local6.method283(local90.anInt779, this.method720(local90.anInt778, local6.anInt387, local90.anInt779, this.anInt905) - local6.anInt391, local90.anInt778, anInt993);
						}
					}
					local6.method284(this.anInt901);
					this.aClass20_1.method233((int) local6.aDouble7, (int) local6.aDouble8, local6.anInt397, (int) local6.aDouble6, this.anInt953, 60, -1, false, local6);
				}
			}
		} catch (@Pc(171) RuntimeException local171) {
			signlink.reporterror("45959, " + 4 + ", " + local171.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIBIIIIZ)Z")
	private boolean method604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray24[local7][local11] = 0;
					this.anIntArrayArray23[local7][local11] = 99999999;
				}
			}
			local11 = arg3;
			@Pc(39) int local39 = arg2;
			this.anIntArrayArray24[arg3][arg2] = 99;
			@Pc(51) boolean local51 = false;
			this.anIntArrayArray23[arg3][arg2] = 0;
			@Pc(65) byte local65 = 0;
			@Pc(67) int local67 = 0;
			this.anIntArray247[0] = arg3;
			@Pc(76) int local76 = local65 + 1;
			this.anIntArray248[0] = arg2;
			@Pc(80) boolean local80 = false;
			@Pc(84) int local84 = this.anIntArray247.length;
			@Pc(91) int[][] local91 = this.aClass42Array1[this.anInt953].anIntArrayArray21;
			@Pc(202) int local202;
			while (local67 != local76) {
				local11 = this.anIntArray247[local67];
				local39 = this.anIntArray248[local67];
				local67 = (local67 + 1) % local84;
				if (local11 == arg5 && local39 == arg8) {
					local80 = true;
					break;
				}
				if (arg7 != 0) {
					if ((arg7 < 5 || arg7 == 10) && this.aClass42Array1[this.anInt953].method542(arg8, arg5, arg4, local11, local39, arg7 - 1)) {
						local80 = true;
						break;
					}
					if (arg7 < 10 && this.aClass42Array1[this.anInt953].method543(arg8, local11, local39, arg7 - 1, arg5, arg4)) {
						local80 = true;
						break;
					}
				}
				if (arg0 != 0 && arg10 != 0 && this.aClass42Array1[this.anInt953].method544(arg1, local39, arg10, 749, local11, arg5, arg0, arg8)) {
					local80 = true;
					break;
				}
				local202 = this.anIntArrayArray23[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray24[local11 - 1][local39] == 0 && (local91[local11 - 1][local39] & 0x1280108) == 0) {
					this.anIntArray247[local76] = local11 - 1;
					this.anIntArray248[local76] = local39;
					local76 = (local76 + 1) % local84;
					this.anIntArrayArray24[local11 - 1][local39] = 2;
					this.anIntArrayArray23[local11 - 1][local39] = local202;
				}
				if (local11 < 103 && this.anIntArrayArray24[local11 + 1][local39] == 0 && (local91[local11 + 1][local39] & 0x1280180) == 0) {
					this.anIntArray247[local76] = local11 + 1;
					this.anIntArray248[local76] = local39;
					local76 = (local76 + 1) % local84;
					this.anIntArrayArray24[local11 + 1][local39] = 8;
					this.anIntArrayArray23[local11 + 1][local39] = local202;
				}
				if (local39 > 0 && this.anIntArrayArray24[local11][local39 - 1] == 0 && (local91[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray247[local76] = local11;
					this.anIntArray248[local76] = local39 - 1;
					local76 = (local76 + 1) % local84;
					this.anIntArrayArray24[local11][local39 - 1] = 1;
					this.anIntArrayArray23[local11][local39 - 1] = local202;
				}
				if (local39 < 103 && this.anIntArrayArray24[local11][local39 + 1] == 0 && (local91[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray247[local76] = local11;
					this.anIntArray248[local76] = local39 + 1;
					local76 = (local76 + 1) % local84;
					this.anIntArrayArray24[local11][local39 + 1] = 4;
					this.anIntArrayArray23[local11][local39 + 1] = local202;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray24[local11 - 1][local39 - 1] == 0 && (local91[local11 - 1][local39 - 1] & 0x128010E) == 0 && (local91[local11 - 1][local39] & 0x1280108) == 0 && (local91[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray247[local76] = local11 - 1;
					this.anIntArray248[local76] = local39 - 1;
					local76 = (local76 + 1) % local84;
					this.anIntArrayArray24[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray23[local11 - 1][local39 - 1] = local202;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray24[local11 + 1][local39 - 1] == 0 && (local91[local11 + 1][local39 - 1] & 0x1280183) == 0 && (local91[local11 + 1][local39] & 0x1280180) == 0 && (local91[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray247[local76] = local11 + 1;
					this.anIntArray248[local76] = local39 - 1;
					local76 = (local76 + 1) % local84;
					this.anIntArrayArray24[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray23[local11 + 1][local39 - 1] = local202;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray24[local11 - 1][local39 + 1] == 0 && (local91[local11 - 1][local39 + 1] & 0x1280138) == 0 && (local91[local11 - 1][local39] & 0x1280108) == 0 && (local91[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray247[local76] = local11 - 1;
					this.anIntArray248[local76] = local39 + 1;
					local76 = (local76 + 1) % local84;
					this.anIntArrayArray24[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray23[local11 - 1][local39 + 1] = local202;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray24[local11 + 1][local39 + 1] == 0 && (local91[local11 + 1][local39 + 1] & 0x12801E0) == 0 && (local91[local11 + 1][local39] & 0x1280180) == 0 && (local91[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray247[local76] = local11 + 1;
					this.anIntArray248[local76] = local39 + 1;
					local76 = (local76 + 1) % local84;
					this.anIntArrayArray24[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray23[local11 + 1][local39 + 1] = local202;
				}
			}
			this.anInt1032 = 0;
			@Pc(818) int local818;
			@Pc(824) int local824;
			@Pc(830) int local830;
			if (!local80) {
				if (!arg11) {
					return false;
				}
				local202 = 1000;
				local818 = 100;
				for (local824 = arg5 - 10; local824 <= arg5 + 10; local824++) {
					for (local830 = arg8 - 10; local830 <= arg8 + 10; local830++) {
						if (local824 >= 0 && local830 >= 0 && local824 < 104 && local830 < 104 && this.anIntArrayArray23[local824][local830] < 100) {
							@Pc(852) int local852 = 0;
							if (local824 < arg5) {
								local852 = arg5 - local824;
							} else if (local824 > arg5 + arg0 - 1) {
								local852 = local824 + 1 - arg5 - arg0;
							}
							@Pc(878) int local878 = 0;
							if (local830 < arg8) {
								local878 = arg8 - local830;
							} else if (local830 > arg8 + arg10 - 1) {
								local878 = local830 + 1 - arg8 - arg10;
							}
							@Pc(910) int local910 = local852 * local852 + local878 * local878;
							if (local910 < local202 || local910 == local202 && this.anIntArrayArray23[local824][local830] < local818) {
								local202 = local910;
								local818 = this.anIntArrayArray23[local824][local830];
								local11 = local824;
								local39 = local830;
							}
						}
					}
				}
				if (local202 == 1000) {
					return false;
				}
				if (local11 == arg3 && local39 == arg2) {
					return false;
				}
				this.anInt1032 = 1;
			}
			@Pc(971) byte local971 = 0;
			this.anIntArray247[0] = local11;
			local67 = local971 + 1;
			this.anIntArray248[0] = local39;
			local202 = local818 = this.anIntArrayArray24[local11][local39];
			while (local11 != arg3 || local39 != arg2) {
				if (local202 != local818) {
					local818 = local202;
					this.anIntArray247[local67] = local11;
					this.anIntArray248[local67++] = local39;
				}
				if ((local202 & 0x2) != 0) {
					local11++;
				} else if ((local202 & 0x8) != 0) {
					local11--;
				}
				if ((local202 & 0x1) != 0) {
					local39++;
				} else if ((local202 & 0x4) != 0) {
					local39--;
				}
				local202 = this.anIntArrayArray24[local11][local39];
			}
			if (local67 > 0) {
				local84 = local67;
				if (local67 > 25) {
					local84 = 25;
				}
				local67--;
				@Pc(1061) int local1061 = this.anIntArray247[local67];
				local824 = this.anIntArray248[local67];
				anInt1025 += local84;
				if (anInt1025 >= 142) {
					this.aClass2_Sub1_Sub4_8.method481(161);
					anInt1025 = 0;
				}
				if (arg9 == 0) {
					this.aClass2_Sub1_Sub4_8.method481(64);
					this.aClass2_Sub1_Sub4_8.method482(local84 + local84 + 3);
				}
				if (arg9 == 1) {
					this.aClass2_Sub1_Sub4_8.method481(177);
					this.aClass2_Sub1_Sub4_8.method482(local84 + local84 + 3 + 14);
				}
				if (arg9 == 2) {
					this.aClass2_Sub1_Sub4_8.method481(181);
					this.aClass2_Sub1_Sub4_8.method482(local84 + local84 + 3);
				}
				this.aClass2_Sub1_Sub4_8.method517(this.aByte32, local1061 + this.anInt870);
				this.aClass2_Sub1_Sub4_8.method517(this.aByte32, local824 + this.anInt871);
				this.anInt1073 = this.anIntArray247[0];
				this.anInt1074 = this.anIntArray248[0];
				for (local830 = 1; local830 < local84; local830++) {
					local67--;
					this.aClass2_Sub1_Sub4_8.method509(this.anIntArray247[local67] - local1061);
					this.aClass2_Sub1_Sub4_8.method508(this.anIntArray248[local67] - local824);
				}
				this.aClass2_Sub1_Sub4_8.method509(super.anIntArray210[5] == 1 ? 1 : 0);
				return true;
			} else if (arg9 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1211) RuntimeException local1211) {
			signlink.reporterror("45939, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local1211.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method605() {
		try {
			@Pc(4) int local4 = this.anInt881;
			@Pc(7) int local7 = this.anInt882;
			@Pc(10) int local10 = this.anInt883;
			@Pc(13) int local13 = this.anInt884;
			Class2_Sub1_Sub3.method357(local4, local10, local7, 6116423, local13);
			Class2_Sub1_Sub3.method357(local4 + 1, local10 - 2, local7 + 1, 0, 16);
			Class2_Sub1_Sub3.method358(local4 + 1, local7 + 18, local13 - 19, local10 - 2, 0, 149);
			this.aClass2_Sub1_Sub3_Sub2_4.method304("Choose Option", local7 + 14, local4 + 3, this.aBoolean207, 6116423);
			@Pc(79) int local79 = super.anInt830;
			@Pc(82) int local82 = super.anInt831;
			if (this.anInt880 == 0) {
				local79 -= 4;
				local82 -= 4;
			}
			if (this.anInt880 == 1) {
				local79 -= 553;
				local82 -= 205;
			}
			if (this.anInt880 == 2) {
				local79 -= 17;
				local82 -= 357;
			}
			for (@Pc(101) int local101 = 0; local101 < this.anInt1053; local101++) {
				@Pc(116) int local116 = local7 + (this.anInt1053 - 1 - local101) * 15 + 31;
				@Pc(118) int local118 = 16777215;
				if (local79 > local4 && local79 < local4 + local10 && local82 > local116 - 13 && local82 < local116 + 3) {
					local118 = 16776960;
				}
				this.aClass2_Sub1_Sub3_Sub2_4.method308(local4 + 3, local116, local118, true, this.aStringArray10[local101]);
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("94285, " + 0 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method585() {
		try {
			this.aBoolean209 = true;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("16880, " + true + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method606() {
		try {
			this.aClass1_18.method1(this.aByte34);
			Class2_Sub1_Sub3_Sub1.anIntArray53 = this.anIntArray238;
			this.aClass2_Sub1_Sub3_Sub4_18.method369(0, this.anInt908, 0);
			if (this.aBoolean236) {
				this.aClass2_Sub1_Sub3_Sub2_4.method300(this.aString28, 239, 40, 0);
				this.aClass2_Sub1_Sub3_Sub2_4.method300(this.aString29 + "*", 239, 60, 128);
			} else if (this.anInt1015 == 1) {
				this.aClass2_Sub1_Sub3_Sub2_4.method300("Enter amount:", 239, 40, 0);
				this.aClass2_Sub1_Sub3_Sub2_4.method300(this.aString31 + "*", 239, 60, 128);
			} else if (this.anInt1015 == 2) {
				this.aClass2_Sub1_Sub3_Sub2_4.method300("Enter name:", 239, 40, 0);
				this.aClass2_Sub1_Sub3_Sub2_4.method300(this.aString31 + "*", 239, 60, 128);
			} else {
				@Pc(127) Class2_Sub1_Sub3_Sub2 local127;
				@Pc(135) int local135;
				@Pc(146) int local146;
				if (this.anInt1015 == 3) {
					if (this.aString31 != this.aString30) {
						this.method696(this.aString31);
						this.aString30 = this.aString31;
					}
					local127 = this.aClass2_Sub1_Sub3_Sub2_3;
					Class2_Sub1_Sub3.method354(0, 0, 463, 77);
					for (local135 = 0; local135 < this.anInt1041; local135++) {
						local146 = local135 * 14 + 18 - this.anInt1042;
						if (local146 > 0 && local146 < 110) {
							local127.method300(this.aStringArray13[local135], 239, local146, 0);
						}
					}
					Class2_Sub1_Sub3.method353();
					if (this.anInt1041 > 5) {
						this.method657(77, this.anInt1042, this.anInt1041 * 14 + 7, 0, 463);
					}
					if (this.aString31.length() == 0) {
						this.aClass2_Sub1_Sub3_Sub2_4.method300("Enter object name", 239, 40, 255);
					} else if (this.anInt1041 == 0) {
						this.aClass2_Sub1_Sub3_Sub2_4.method300("No matching objects found, please shorten search", 239, 40, 0);
					}
					local127.method300(this.aString31 + "*", 239, 90, 0);
					Class2_Sub1_Sub3.method360(479, 0, 77, 0, (byte) 3);
				} else if (this.aString27 != null) {
					this.aClass2_Sub1_Sub3_Sub2_4.method300(this.aString27, 239, 40, 0);
					this.aClass2_Sub1_Sub3_Sub2_4.method300("Click to continue", 239, 60, 128);
				} else if (this.anInt980 != -1) {
					this.method634(0, 0, 0, Class19.method213(this.anInt980));
				} else if (this.anInt1072 == -1) {
					local127 = this.aClass2_Sub1_Sub3_Sub2_3;
					local135 = 0;
					Class2_Sub1_Sub3.method354(0, 0, 463, 77);
					for (local146 = 0; local146 < 100; local146++) {
						if (this.aStringArray9[local146] != null) {
							@Pc(311) int local311 = this.anIntArray230[local146];
							@Pc(320) int local320 = this.anInt1012 + 70 - local135 * 14;
							@Pc(325) String local325 = this.aStringArray8[local146];
							@Pc(327) byte local327 = 0;
							if (local325 != null && local325.startsWith("@cr1@")) {
								local325 = local325.substring(5);
								local327 = 1;
							}
							if (local325 != null && local325.startsWith("@cr2@")) {
								local325 = local325.substring(5);
								local327 = 2;
							}
							if (local311 == 0) {
								if (local320 > 0 && local320 < 110) {
									local127.method304(this.aStringArray9[local146], local320, 4, this.aBoolean207, 0);
								}
								local135++;
							}
							@Pc(398) int local398;
							if ((local311 == 1 || local311 == 2) && (local311 == 1 || this.anInt1033 == 0 || this.anInt1033 == 1 && this.method662(local325))) {
								if (local320 > 0 && local320 < 110) {
									local398 = 4;
									if (local327 == 1) {
										this.aClass2_Sub1_Sub3_Sub4Array3[0].method369(local320 - 12, this.anInt908, 4);
										local398 += 14;
									}
									if (local327 == 2) {
										this.aClass2_Sub1_Sub3_Sub4Array3[1].method369(local320 - 12, this.anInt908, local398);
										local398 += 14;
									}
									local127.method304(local325 + ":", local320, local398, this.aBoolean207, 0);
									local398 += local127.method302(local325, (byte) 3) + 8;
									local127.method304(this.aStringArray9[local146], local320, local398, this.aBoolean207, 255);
								}
								local135++;
							}
							if ((local311 == 3 || local311 == 7) && this.anInt925 == 0 && (local311 == 7 || this.anInt923 == 0 || this.anInt923 == 1 && this.method662(local325))) {
								if (local320 > 0 && local320 < 110) {
									local127.method304("From", local320, 4, this.aBoolean207, 0);
									local398 = local127.method302("From ", (byte) 3) + 4;
									if (local327 == 1) {
										this.aClass2_Sub1_Sub3_Sub4Array3[0].method369(local320 - 12, this.anInt908, local398);
										local398 += 14;
									}
									if (local327 == 2) {
										this.aClass2_Sub1_Sub3_Sub4Array3[1].method369(local320 - 12, this.anInt908, local398);
										local398 += 14;
									}
									local127.method304(local325 + ":", local320, local398, this.aBoolean207, 0);
									local398 += local127.method302(local325, (byte) 3) + 8;
									local127.method304(this.aStringArray9[local146], local320, local398, this.aBoolean207, 8388608);
								}
								local135++;
							}
							if (local311 == 4 && (this.anInt1010 == 0 || this.anInt1010 == 1 && this.method662(local325))) {
								if (local320 > 0 && local320 < 110) {
									local127.method304(local325 + " " + this.aStringArray9[local146], local320, 4, this.aBoolean207, 8388736);
								}
								local135++;
							}
							if (local311 == 5 && this.anInt925 == 0 && this.anInt923 < 2) {
								if (local320 > 0 && local320 < 110) {
									local127.method304(this.aStringArray9[local146], local320, 4, this.aBoolean207, 8388608);
								}
								local135++;
							}
							if (local311 == 6 && this.anInt925 == 0 && this.anInt923 < 2) {
								if (local320 > 0 && local320 < 110) {
									local127.method304("To " + local325 + ":", local320, 4, this.aBoolean207, 0);
									local127.method304(this.aStringArray9[local146], local320, local127.method302("To " + local325, (byte) 3) + 12, this.aBoolean207, 8388608);
								}
								local135++;
							}
							if (local311 == 8 && (this.anInt1010 == 0 || this.anInt1010 == 1 && this.method662(local325))) {
								if (local320 > 0 && local320 < 110) {
									local127.method304(local325 + " " + this.aStringArray9[local146], local320, 4, this.aBoolean207, 8270336);
								}
								local135++;
							}
						}
					}
					Class2_Sub1_Sub3.method353();
					this.anInt917 = local135 * 14 + 7;
					if (this.anInt917 < 78) {
						this.anInt917 = 78;
					}
					this.method657(77, this.anInt917 - this.anInt1012 - 77, this.anInt917, 0, 463);
					@Pc(782) String local782;
					if (aClass2_Sub1_Sub1_Sub2_Sub1_1 == null || aClass2_Sub1_Sub1_Sub2_Sub1_1.aString13 == null) {
						local782 = Class7.method59(this.aString21);
					} else {
						local782 = aClass2_Sub1_Sub1_Sub2_Sub1_1.aString13;
					}
					local127.method304(local782 + ":", 90, 4, this.aBoolean207, 0);
					local127.method304(this.aString26 + "*", 90, local127.method302(local782 + ": ", (byte) 3) + 6, this.aBoolean207, 255);
					Class2_Sub1_Sub3.method360(479, 0, 77, 0, (byte) 3);
				} else {
					this.method634(0, 0, 0, Class19.method213(this.anInt1072));
				}
			}
			if (this.aBoolean233 && this.anInt880 == 2) {
				this.method605();
			}
			this.aClass1_18.method2(357, 17, super.aGraphics2);
			this.aClass1_17.method1(this.aByte34);
			Class2_Sub1_Sub3_Sub1.anIntArray53 = this.anIntArray240;
		} catch (@Pc(875) RuntimeException local875) {
			signlink.reporterror("29343, " + false + ", " + local875.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!LOVQYTIZ;II)V")
	private void method607(@OriginalArg(1) Class2_Sub1_Sub3_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg0 != null) {
				@Pc(10) int local10 = this.anInt928 + this.anInt1070 & 0x7FF;
				@Pc(18) int local18 = arg1 * arg1 + arg2 * arg2;
				if (local18 <= 6400) {
					@Pc(26) int local26 = Class2_Sub1_Sub1_Sub6.anIntArray147[local10];
					@Pc(30) int local30 = Class2_Sub1_Sub1_Sub6.anIntArray148[local10];
					@Pc(39) int local39 = local26 * 256 / (this.anInt991 + 256);
					@Pc(48) int local48 = local30 * 256 / (this.anInt991 + 256);
					@Pc(58) int local58 = arg2 * local39 + arg1 * local48 >> 16;
					@Pc(68) int local68 = arg2 * local48 - arg1 * local39 >> 16;
					if (local18 > 2500) {
						arg0.method340(this.aClass2_Sub1_Sub3_Sub4_17, 83 - local68 - arg0.anInt441 / 2 - 4, local58 + 94 - arg0.anInt440 / 2 + 4);
					} else {
						arg0.method334(83 - local68 - arg0.anInt441 / 2 - 4, this.anInt908, local58 + 94 + 4 - arg0.anInt440 / 2);
					}
				}
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("51176, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!TINBLEHZ;IIII)V")
	private void method608(@OriginalArg(0) Class2_Sub1_Sub1_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg3 != this.anInt1011) {
				this.anInt1026 = 21;
			}
			if (arg0 != aClass2_Sub1_Sub1_Sub2_Sub1_1 && this.anInt1053 < 400) {
				@Pc(42) String local42;
				if (arg0.anInt657 == 0) {
					local42 = arg0.aString13 + method675(arg0.anInt661, aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt661) + " (level-" + arg0.anInt661 + ")";
				} else {
					local42 = arg0.aString13 + " (skill-" + arg0.anInt657 + ")";
				}
				@Pc(172) int local172;
				if (this.anInt995 == 1) {
					this.aStringArray10[this.anInt1053] = "Use " + this.aString25 + " with @whi@" + local42;
					this.anIntArray214[this.anInt1053] = 8;
					this.anIntArray215[this.anInt1053] = arg2;
					this.anIntArray212[this.anInt1053] = arg1;
					this.anIntArray213[this.anInt1053] = arg4;
					this.anInt1053++;
				} else if (this.anInt913 != 1) {
					for (local172 = 4; local172 >= 0; local172--) {
						if (this.aStringArray11[local172] != null) {
							this.aStringArray10[this.anInt1053] = this.aStringArray11[local172] + " @whi@" + local42;
							@Pc(199) short local199 = 0;
							if (this.aStringArray11[local172].equalsIgnoreCase("attack")) {
								if (arg0.anInt661 > aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt661) {
									local199 = 2000;
								}
								if (aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt655 != 0 && arg0.anInt655 != 0) {
									if (aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt655 == arg0.anInt655) {
										local199 = 2000;
									} else {
										local199 = 0;
									}
								}
							} else if (this.aBooleanArray12[local172]) {
								local199 = 2000;
							}
							if (local172 == 0) {
								this.anIntArray214[this.anInt1053] = local199 + 246;
							}
							if (local172 == 1) {
								this.anIntArray214[this.anInt1053] = local199 + 147;
							}
							if (local172 == 2) {
								this.anIntArray214[this.anInt1053] = local199 + 389;
							}
							if (local172 == 3) {
								this.anIntArray214[this.anInt1053] = local199 + 51;
							}
							if (local172 == 4) {
								this.anIntArray214[this.anInt1053] = local199 + 178;
							}
							this.anIntArray215[this.anInt1053] = arg2;
							this.anIntArray212[this.anInt1053] = arg1;
							this.anIntArray213[this.anInt1053] = arg4;
							this.anInt1053++;
						}
					}
				} else if ((this.anInt915 & 0x8) == 8) {
					this.aStringArray10[this.anInt1053] = this.aString20 + " @whi@" + local42;
					this.anIntArray214[this.anInt1053] = 493;
					this.anIntArray215[this.anInt1053] = arg2;
					this.anIntArray212[this.anInt1053] = arg1;
					this.anIntArray213[this.anInt1053] = arg4;
					this.anInt1053++;
				}
				for (local172 = 0; local172 < this.anInt1053; local172++) {
					if (this.anIntArray214[local172] == 113) {
						this.aStringArray10[local172] = "Walk here @whi@" + local42;
						return;
					}
				}
			}
		} catch (@Pc(349) RuntimeException local349) {
			signlink.reporterror("49631, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local349.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method609() {
		try {
			this.anInt1066 = 0;
			@Pc(81) int local81;
			for (@Pc(16) int local16 = -1; local16 < this.anInt964 + this.anInt957; local16++) {
				@Pc(23) Class2_Sub1_Sub1_Sub2 local23;
				if (local16 == -1) {
					local23 = aClass2_Sub1_Sub1_Sub2_Sub1_1;
				} else if (local16 < this.anInt964) {
					local23 = this.aClass2_Sub1_Sub1_Sub2_Sub1Array1[this.anIntArray243[local16]];
				} else {
					local23 = this.aClass2_Sub1_Sub1_Sub2_Sub2Array1[this.anIntArray242[local16 - this.anInt964]];
				}
				if (local23 != null && local23.method568(this.anInt946)) {
					@Pc(65) Class48 local65;
					if (local23 instanceof Class2_Sub1_Sub1_Sub2_Sub2) {
						local65 = ((Class2_Sub1_Sub1_Sub2_Sub2) local23).aClass48_2;
						if (local65.anIntArray201 != null) {
							local65 = local65.method555();
						}
						if (local65 == null) {
							continue;
						}
					}
					if (local16 >= this.anInt964) {
						local65 = ((Class2_Sub1_Sub1_Sub2_Sub2) local23).aClass48_2;
						if (local65.anInt748 >= 0 && local65.anInt748 < this.aClass2_Sub1_Sub3_Sub3Array6.length) {
							this.method717(local23, local23.anInt800 + 15);
							if (this.anInt959 > -1) {
								this.aClass2_Sub1_Sub3_Sub3Array6[local65.anInt748].method334(this.anInt960 - 30, this.anInt908, this.anInt959 - 12);
							}
						}
						if (this.anInt938 == 1 && this.anInt1052 == this.anIntArray242[local16 - this.anInt964] && anInt993 % 20 < 10) {
							this.method717(local23, local23.anInt800 + 15);
							if (this.anInt959 > -1) {
								this.aClass2_Sub1_Sub3_Sub3Array5[0].method334(this.anInt960 - 28, this.anInt908, this.anInt959 - 12);
							}
						}
					} else {
						local81 = 30;
						@Pc(84) Class2_Sub1_Sub1_Sub2_Sub1 local84 = (Class2_Sub1_Sub1_Sub2_Sub1) local23;
						if (local84.anInt664 != -1 || local84.anInt662 != -1) {
							this.method717(local23, local23.anInt800 + 15);
							if (this.anInt959 > -1) {
								if (local84.anInt664 != -1) {
									this.aClass2_Sub1_Sub3_Sub3Array4[local84.anInt664].method334(this.anInt960 - 30, this.anInt908, this.anInt959 - 12);
									local81 += 25;
								}
								if (local84.anInt662 != -1) {
									this.aClass2_Sub1_Sub3_Sub3Array6[local84.anInt662].method334(this.anInt960 - local81, this.anInt908, this.anInt959 - 12);
									local81 += 25;
								}
							}
						}
						if (local16 >= 0 && this.anInt938 == 10 && this.anInt859 == this.anIntArray243[local16]) {
							this.method717(local23, local23.anInt800 + 15);
							if (this.anInt959 > -1) {
								this.aClass2_Sub1_Sub3_Sub3Array5[1].method334(this.anInt960 - local81, this.anInt908, this.anInt959 - 12);
							}
						}
					}
					if (local23.aString16 != null && (local16 >= this.anInt964 || this.anInt1033 == 0 || this.anInt1033 == 3 || this.anInt1033 == 1 && this.method662(((Class2_Sub1_Sub1_Sub2_Sub1) local23).aString13))) {
						this.method717(local23, local23.anInt800);
						if (this.anInt959 > -1 && this.anInt1066 < this.anInt1067) {
							this.anIntArray269[this.anInt1066] = this.aClass2_Sub1_Sub3_Sub2_4.method303(local23.aString16) / 2;
							this.anIntArray268[this.anInt1066] = this.aClass2_Sub1_Sub3_Sub2_4.anInt417;
							this.anIntArray266[this.anInt1066] = this.anInt959;
							this.anIntArray267[this.anInt1066] = this.anInt960;
							this.anIntArray270[this.anInt1066] = local23.anInt790;
							this.anIntArray271[this.anInt1066] = local23.anInt787;
							this.anIntArray272[this.anInt1066] = local23.anInt789;
							this.aStringArray14[this.anInt1066++] = local23.aString16;
							if (this.anInt904 == 0 && local23.anInt787 >= 1 && local23.anInt787 <= 3) {
								this.anIntArray268[this.anInt1066] += 10;
								this.anIntArray267[this.anInt1066] += 5;
							}
							if (this.anInt904 == 0 && local23.anInt787 == 4) {
								this.anIntArray269[this.anInt1066] = 60;
							}
							if (this.anInt904 == 0 && local23.anInt787 == 5) {
								this.anIntArray268[this.anInt1066] += 5;
							}
						}
					}
					if (local23.anInt783 > anInt993) {
						this.method717(local23, local23.anInt800 + 15);
						if (this.anInt959 > -1) {
							local81 = local23.anInt784 * 30 / local23.anInt785;
							if (local81 > 30) {
								local81 = 30;
							}
							Class2_Sub1_Sub3.method357(this.anInt959 - 15, local81, this.anInt960 - 3, 65280, 5);
							Class2_Sub1_Sub3.method357(this.anInt959 + local81 - 15, 30 - local81, this.anInt960 - 3, 16711680, 5);
						}
					}
					for (local81 = 0; local81 < 4; local81++) {
						if (local23.anIntArray207[local81] > anInt993) {
							this.method717(local23, local23.anInt800 / 2);
							if (this.anInt959 > -1) {
								if (local81 == 1) {
									this.anInt960 -= 20;
								}
								if (local81 == 2) {
									this.anInt959 -= 15;
									this.anInt960 -= 10;
								}
								if (local81 == 3) {
									this.anInt959 += 15;
									this.anInt960 -= 10;
								}
								this.aClass2_Sub1_Sub3_Sub3Array10[local23.anIntArray206[local81]].method334(this.anInt960 - 12, this.anInt908, this.anInt959 - 12);
								this.aClass2_Sub1_Sub3_Sub2_2.method300(String.valueOf(local23.anIntArray205[local81]), this.anInt959, this.anInt960 + 4, 0);
								this.aClass2_Sub1_Sub3_Sub2_2.method300(String.valueOf(local23.anIntArray205[local81]), this.anInt959 - 1, this.anInt960 + 3, 16777215);
							}
						}
					}
				}
			}
			for (@Pc(627) int local627 = 0; local627 < this.anInt1066; local627++) {
				local81 = this.anIntArray266[local627];
				@Pc(639) int local639 = this.anIntArray267[local627];
				@Pc(644) int local644 = this.anIntArray269[local627];
				@Pc(649) int local649 = this.anIntArray268[local627];
				@Pc(651) boolean local651 = true;
				while (local651) {
					local651 = false;
					for (@Pc(657) int local657 = 0; local657 < local627; local657++) {
						if (local639 + 2 > this.anIntArray267[local657] - this.anIntArray268[local657] && local639 - local649 < this.anIntArray267[local657] + 2 && local81 - local644 < this.anIntArray266[local657] + this.anIntArray269[local657] && local81 + local644 > this.anIntArray266[local657] - this.anIntArray269[local657] && this.anIntArray267[local657] - this.anIntArray268[local657] < local639) {
							local639 = this.anIntArray267[local657] - this.anIntArray268[local657];
							local651 = true;
						}
					}
				}
				this.anInt959 = this.anIntArray266[local627];
				this.anInt960 = this.anIntArray267[local627] = local639;
				@Pc(756) String local756 = this.aStringArray14[local627];
				if (this.anInt904 == 0) {
					@Pc(761) int local761 = 16776960;
					if (this.anIntArray270[local627] < 6) {
						local761 = this.anIntArray255[this.anIntArray270[local627]];
					}
					if (this.anIntArray270[local627] == 6) {
						local761 = this.anInt944 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray270[local627] == 7) {
						local761 = this.anInt944 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray270[local627] == 8) {
						local761 = this.anInt944 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(836) int local836;
					if (this.anIntArray270[local627] == 9) {
						local836 = 150 - this.anIntArray272[local627];
						if (local836 < 50) {
							local761 = local836 * 1280 + 16711680;
						} else if (local836 < 100) {
							local761 = 16776960 - (local836 - 50) * 327680;
						} else if (local836 < 150) {
							local761 = (local836 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray270[local627] == 10) {
						local836 = 150 - this.anIntArray272[local627];
						if (local836 < 50) {
							local761 = local836 * 5 + 16711680;
						} else if (local836 < 100) {
							local761 = 16711935 - (local836 - 50) * 327680;
						} else if (local836 < 150) {
							local761 = (local836 - 100) * 327680 + 255 - (local836 - 100) * 5;
						}
					}
					if (this.anIntArray270[local627] == 11) {
						local836 = 150 - this.anIntArray272[local627];
						if (local836 < 50) {
							local761 = 16777215 - local836 * 327685;
						} else if (local836 < 100) {
							local761 = (local836 - 50) * 327685 + 65280;
						} else if (local836 < 150) {
							local761 = 16777215 - (local836 - 100) * 327680;
						}
					}
					if (this.anIntArray271[local627] == 0) {
						this.aClass2_Sub1_Sub3_Sub2_4.method300(local756, this.anInt959, this.anInt960 + 1, 0);
						this.aClass2_Sub1_Sub3_Sub2_4.method300(local756, this.anInt959, this.anInt960, local761);
					}
					if (this.anIntArray271[local627] == 1) {
						this.aClass2_Sub1_Sub3_Sub2_4.method305(this.anInt960 + 1, this.anInt944, 0, this.anInt959, local756);
						this.aClass2_Sub1_Sub3_Sub2_4.method305(this.anInt960, this.anInt944, local761, this.anInt959, local756);
					}
					if (this.anIntArray271[local627] == 2) {
						this.aClass2_Sub1_Sub3_Sub2_4.method306(this.anInt944, this.anInt960 + 1, this.anInt959, 0, local756);
						this.aClass2_Sub1_Sub3_Sub2_4.method306(this.anInt944, this.anInt960, this.anInt959, local761, local756);
					}
					if (this.anIntArray271[local627] == 3) {
						this.aClass2_Sub1_Sub3_Sub2_4.method307(0, this.anInt944, local756, this.anInt959, this.anInt960 + 1, 150 - this.anIntArray272[local627]);
						this.aClass2_Sub1_Sub3_Sub2_4.method307(local761, this.anInt944, local756, this.anInt959, this.anInt960, 150 - this.anIntArray272[local627]);
					}
					@Pc(1133) int local1133;
					if (this.anIntArray271[local627] == 4) {
						local836 = this.aClass2_Sub1_Sub3_Sub2_4.method303(local756);
						local1133 = (150 - this.anIntArray272[local627]) * (local836 + 100) / 150;
						Class2_Sub1_Sub3.method354(0, this.anInt959 - 50, this.anInt959 + 50, 334);
						this.aClass2_Sub1_Sub3_Sub2_4.method304(local756, this.anInt960 + 1, this.anInt959 + 50 - local1133, this.aBoolean207, 0);
						this.aClass2_Sub1_Sub3_Sub2_4.method304(local756, this.anInt960, this.anInt959 + 50 - local1133, this.aBoolean207, local761);
						Class2_Sub1_Sub3.method353();
					}
					if (this.anIntArray271[local627] == 5) {
						local836 = 150 - this.anIntArray272[local627];
						local1133 = 0;
						if (local836 < 25) {
							local1133 = local836 - 25;
						} else if (local836 > 125) {
							local1133 = local836 - 125;
						}
						Class2_Sub1_Sub3.method354(this.anInt960 - this.aClass2_Sub1_Sub3_Sub2_4.anInt417 - 1, 0, 512, this.anInt960 + 5);
						this.aClass2_Sub1_Sub3_Sub2_4.method300(local756, this.anInt959, this.anInt960 + local1133 + 1, 0);
						this.aClass2_Sub1_Sub3_Sub2_4.method300(local756, this.anInt959, this.anInt960 + local1133, local761);
						Class2_Sub1_Sub3.method353();
					}
				} else {
					this.aClass2_Sub1_Sub3_Sub2_4.method300(local756, this.anInt959, this.anInt960 + 1, 0);
					this.aClass2_Sub1_Sub3_Sub2_4.method300(local756, this.anInt959, this.anInt960, 16776960);
				}
			}
		} catch (@Pc(1285) RuntimeException local1285) {
			signlink.reporterror("87193, " + false + ", " + local1285.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZI)V")
	private void method610(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		try {
			signlink.anInt1081 = arg1;
			if (arg0) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("69485, " + 9 + ", " + arg0 + ", " + arg1 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method611() {
		try {
			for (@Pc(12) Class2_Sub1_Sub1_Sub1 local12 = (Class2_Sub1_Sub1_Sub1) this.aClass38_11.method461(); local12 != null; local12 = (Class2_Sub1_Sub1_Sub1) this.aClass38_11.method463()) {
				if (local12.anInt9 != this.anInt953 || local12.aBoolean11) {
					local12.method562();
				} else if (anInt993 >= local12.anInt13) {
					local12.method15(this.anInt901);
					if (local12.aBoolean11) {
						local12.method562();
					} else {
						this.aClass20_1.method233(local12.anInt11, local12.anInt12, 0, local12.anInt10, local12.anInt9, 60, -1, false, local12);
					}
				}
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("31369, " + 4 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method612() {
		try {
			if (this.anInt869 > 0) {
				this.method687();
			} else {
				this.method688("Connection lost", "Please wait - attempting to reestablish");
				this.anInt861 = 0;
				this.aBoolean217 &= true;
				this.anInt1073 = 0;
				@Pc(26) Class32 local26 = this.aClass32_1;
				this.aBoolean217 = false;
				this.anInt1029 = 0;
				this.method594(this.aString21, this.aString22, true);
				if (!this.aBoolean217) {
					this.method687();
				}
				try {
					local26.method420();
				} catch (@Pc(49) Exception local49) {
				}
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("39885, " + true + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method613() {
		try {
			this.anInt865 += 0;
			if (aBoolean227 && this.anInt887 == 2 && Class3.anInt98 != this.anInt953) {
				this.method688("Loading - please wait.", null);
				this.anInt887 = 1;
				this.aLong31 = System.currentTimeMillis();
			}
			if (this.anInt887 == 1) {
				@Pc(34) int local34 = this.method614();
				if (local34 != 0 && System.currentTimeMillis() - this.aLong31 > 360000L) {
					signlink.reporterror(this.aString21 + " glcfb " + this.aLong30 + "," + local34 + "," + aBoolean227 + "," + this.aClass50Array1[0] + "," + this.aClass14_Sub1_1.method86() + "," + this.anInt953 + "," + this.anInt855 + "," + this.anInt856);
					this.aLong31 = System.currentTimeMillis();
				}
			}
			if (this.anInt887 == 2 && this.anInt953 != this.anInt948) {
				this.anInt948 = this.anInt953;
				this.method637(this.anInt953, 655);
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("31737, " + 0 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)I")
	private int method614() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray6.length; local3++) {
				if (this.aByteArrayArray6[local3] == null && this.anIntArray220[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray5[local3] == null && this.anIntArray221[local3] != -1) {
					return -2;
				}
			}
			@Pc(39) boolean local39 = true;
			for (@Pc(41) int local41 = 0; local41 < this.aByteArrayArray6.length; local41++) {
				@Pc(48) byte[] local48 = this.aByteArrayArray5[local41];
				if (local48 != null) {
					@Pc(62) int local62 = (this.anIntArray219[local41] >> 8) * 64 - this.anInt870;
					@Pc(74) int local74 = (this.anIntArray219[local41] & 0xFF) * 64 - this.anInt871;
					if (this.aBoolean223) {
						local62 = 10;
						local74 = 10;
					}
					local39 &= Class3.method35(local74, local48, local62);
				}
			}
			if (!local39) {
				return -3;
			} else if (this.aBoolean203) {
				return -4;
			} else {
				this.anInt887 = 2;
				Class3.anInt98 = this.anInt953;
				this.method593();
				this.aClass2_Sub1_Sub4_8.method481(255);
				return 0;
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("33327, " + -48111 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method615() {
		try {
			for (@Pc(8) int local8 = 0; local8 < this.anInt922; local8++) {
				if (this.anIntArray264[local8] <= 0) {
					@Pc(17) boolean local17 = false;
					try {
						if (this.anIntArray216[local8] != this.anInt1000 || this.anIntArray233[local8] != this.anInt990) {
							@Pc(50) Class2_Sub1_Sub4 local50 = Class35.method429(this.anIntArray233[local8], this.anIntArray216[local8]);
							if (System.currentTimeMillis() + (long) (local50.anInt672 / 22) > this.aLong32 + (long) (this.anInt890 / 22)) {
								this.anInt890 = local50.anInt672;
								this.aLong32 = System.currentTimeMillis();
								if (this.method628(478, local50.aByteArray17, local50.anInt672)) {
									this.anInt1000 = this.anIntArray216[local8];
									this.anInt990 = this.anIntArray233[local8];
								} else {
									local17 = true;
								}
							}
						} else if (!this.method685()) {
							local17 = true;
						}
					} catch (@Pc(100) Exception local100) {
						if (signlink.reporterror) {
							this.aClass2_Sub1_Sub4_8.method481(152);
							this.aClass2_Sub1_Sub4_8.method483(this.anIntArray216[local8] & 0x7FFF);
						} else {
							this.aClass2_Sub1_Sub4_8.method481(152);
							this.aClass2_Sub1_Sub4_8.method483(-1);
						}
					}
					if (local17 && this.anIntArray264[local8] != -5) {
						this.anIntArray264[local8] = -5;
					} else {
						this.anInt922--;
						for (@Pc(143) int local143 = local8; local143 < this.anInt922; local143++) {
							this.anIntArray216[local143] = this.anIntArray216[local143 + 1];
							this.anIntArray233[local143] = this.anIntArray233[local143 + 1];
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
				if (this.anInt958 == 0 && this.aBoolean231 && !aBoolean227) {
					this.anInt1009 = this.anInt1034;
					this.aBoolean225 = true;
					this.aClass14_Sub1_1.method87(2, this.anInt1009);
					return;
				}
			}
		} catch (@Pc(241) RuntimeException local241) {
			signlink.reporterror("4042, " + 26 + ", " + local241.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method616(@OriginalArg(1) int arg0) {
		try {
			if (arg0 >= 0) {
				@Pc(12) int local12 = this.anIntArray212[arg0];
				@Pc(17) int local17 = this.anIntArray213[arg0];
				@Pc(22) int local22 = this.anIntArray214[arg0];
				@Pc(27) int local27 = this.anIntArray215[arg0];
				if (local22 >= 2000) {
					local22 -= 2000;
				}
				if (this.anInt1015 != 0 && local22 != 1946) {
					this.anInt1015 = 0;
					this.aBoolean208 = true;
				}
				@Pc(54) String local54;
				@Pc(58) int local58;
				@Pc(75) String local75;
				@Pc(79) int local79;
				if (local22 == 404 || local22 == 394) {
					local54 = this.aStringArray10[arg0];
					local58 = local54.indexOf("@whi@");
					if (local58 != -1) {
						local54 = local54.substring(local58 + 5).trim();
						local75 = Class7.method59(Class7.method56(Class7.method55(local54)));
						@Pc(77) boolean local77 = false;
						for (local79 = 0; local79 < this.anInt964; local79++) {
							@Pc(89) Class2_Sub1_Sub1_Sub2_Sub1 local89 = this.aClass2_Sub1_Sub1_Sub2_Sub1Array1[this.anIntArray243[local79]];
							if (local89 != null && local89.aString13 != null && local89.aString13.equalsIgnoreCase(local75)) {
								this.method604(1, 0, aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray209[0], aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray208[0], 0, local89.anIntArray208[0], (byte) 9, 0, local89.anIntArray209[0], 2, 1, false);
								if (local22 == 404) {
									anInt972++;
									if (anInt972 >= 110) {
										this.aClass2_Sub1_Sub4_8.method481(164);
										this.aClass2_Sub1_Sub4_8.method486(0);
										anInt972 = 0;
									}
									this.aClass2_Sub1_Sub4_8.method481(143);
									this.aClass2_Sub1_Sub4_8.method483(this.anIntArray243[local79]);
								}
								if (local22 == 394) {
									this.aClass2_Sub1_Sub4_8.method481(204);
									this.aClass2_Sub1_Sub4_8.method518(this.anIntArray243[local79]);
								}
								local77 = true;
								break;
							}
						}
						if (!local77) {
							this.method663("Unable to find " + local75, 0, "", this.anInt933);
						}
					}
				}
				if (local22 == 113) {
					if (this.aBoolean233) {
						this.aClass20_1.method260(local12 - 4, local17 - 4);
					} else {
						this.aClass20_1.method260(super.anInt836 - 4, super.anInt837 - 4);
					}
				}
				if (local22 == 440) {
					this.anInt995 = 1;
					this.anInt996 = local12;
					this.anInt997 = local17;
					this.anInt998 = local27;
					this.aString25 = String.valueOf(Class36.method434(local27).aString10);
					this.anInt913 = 0;
					this.aBoolean214 = true;
				} else {
					if (local22 == 280) {
						this.aClass2_Sub1_Sub4_8.method481(173);
						this.aClass2_Sub1_Sub4_8.method516(local17, 674);
						this.aClass2_Sub1_Sub4_8.method516(this.anInt996, 674);
						this.aClass2_Sub1_Sub4_8.method516(local27, 674);
						this.aClass2_Sub1_Sub4_8.method518(this.anInt998);
						this.aClass2_Sub1_Sub4_8.method516(this.anInt997, 674);
						this.aClass2_Sub1_Sub4_8.method516(local12, 674);
						this.anInt974 = 0;
						this.anInt975 = local17;
						this.anInt976 = local12;
						this.anInt977 = 2;
						if (Class19.method213(local17).anInt309 == this.anInt947) {
							this.anInt977 = 1;
						}
						if (Class19.method213(local17).anInt309 == this.anInt980) {
							this.anInt977 = 3;
						}
					}
					@Pc(352) boolean local352;
					if (local22 == 420) {
						local352 = this.method604(0, 0, aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray209[0], aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray208[0], 0, local12, (byte) 9, 0, local17, 2, 0, false);
						if (!local352) {
							this.method604(1, 0, aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray209[0], aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray208[0], 0, local12, (byte) 9, 0, local17, 2, 1, false);
						}
						this.anInt875 = super.anInt836;
						this.anInt876 = super.anInt837;
						this.anInt878 = 2;
						this.anInt877 = 0;
						this.aClass2_Sub1_Sub4_8.method481(26);
						this.aClass2_Sub1_Sub4_8.method483(local27);
						this.aClass2_Sub1_Sub4_8.method516(local12 + this.anInt870, 674);
						this.aClass2_Sub1_Sub4_8.method483(local17 + this.anInt871);
					}
					if (local22 == 753) {
						this.method721(local12, 618, local17, local27);
						this.aClass2_Sub1_Sub4_8.method481(200);
						this.aClass2_Sub1_Sub4_8.method516(local12 + this.anInt870, 674);
						this.aClass2_Sub1_Sub4_8.method483(local17 + this.anInt871);
						this.aClass2_Sub1_Sub4_8.method518(local27 >> 14 & 0x7FFF);
					}
					if (local22 == 202) {
						this.method721(local12, 618, local17, local27);
						this.aClass2_Sub1_Sub4_8.method481(217);
						this.aClass2_Sub1_Sub4_8.method518(local12 + this.anInt870);
						this.aClass2_Sub1_Sub4_8.method517(this.aByte32, local17 + this.anInt871);
						this.aClass2_Sub1_Sub4_8.method516(local27 >> 14 & 0x7FFF, 674);
					}
					if (local22 == 839) {
						this.aClass2_Sub1_Sub4_8.method481(77);
						this.aClass2_Sub1_Sub4_8.method483(local27);
						this.aClass2_Sub1_Sub4_8.method518(local12);
						this.aClass2_Sub1_Sub4_8.method517(this.aByte32, local17);
						this.anInt974 = 0;
						this.anInt975 = local17;
						this.anInt976 = local12;
						this.anInt977 = 2;
						if (Class19.method213(local17).anInt309 == this.anInt947) {
							this.anInt977 = 1;
						}
						if (Class19.method213(local17).anInt309 == this.anInt980) {
							this.anInt977 = 3;
						}
					}
					@Pc(554) Class2_Sub1_Sub1_Sub2_Sub2 local554;
					if (local22 == 764) {
						local554 = this.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local27];
						if (local554 != null) {
							this.method604(1, 0, aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray209[0], aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray208[0], 0, local554.anIntArray208[0], (byte) 9, 0, local554.anIntArray209[0], 2, 1, false);
							this.anInt875 = super.anInt836;
							this.anInt876 = super.anInt837;
							this.anInt878 = 2;
							this.anInt877 = 0;
							this.aClass2_Sub1_Sub4_8.method481(149);
							this.aClass2_Sub1_Sub4_8.method518(local27);
							this.aClass2_Sub1_Sub4_8.method518(this.anInt914);
						}
					}
					if (local22 == 221 && !this.aBoolean211) {
						this.aClass2_Sub1_Sub4_8.method481(126);
						this.aClass2_Sub1_Sub4_8.method483(local17);
						this.aBoolean211 = true;
					}
					@Pc(663) long local663;
					if (local22 == 627 || local22 == 608 || local22 == 819 || local22 == 650) {
						local54 = this.aStringArray10[arg0];
						local58 = local54.indexOf("@whi@");
						if (local58 != -1) {
							local663 = Class7.method55(local54.substring(local58 + 5).trim());
							if (local22 == 627) {
								this.method689(local663, (byte) 4);
							}
							if (local22 == 608) {
								this.method597(local663);
							}
							if (local22 == 819) {
								this.method660(local663);
							}
							if (local22 == 650) {
								this.method620(local663);
							}
						}
					}
					@Pc(697) Class36 local697;
					@Pc(723) String local723;
					if (local22 == 1251) {
						local697 = Class36.method434(local27);
						@Pc(700) Class19 local700 = Class19.method213(local17);
						if (local700 != null && local700.anIntArray64[local12] >= 100000) {
							local723 = local700.anIntArray64[local12] + " x " + local697.aString10;
						} else if (local697.aByteArray15 == null) {
							local723 = "It's a " + local697.aString10 + ".";
						} else {
							local723 = new String(local697.aByteArray15);
						}
						this.method663(local723, 0, "", this.anInt933);
					}
					@Pc(762) Class2_Sub1_Sub1_Sub2_Sub1 local762;
					if (local22 == 178) {
						local762 = this.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local27];
						if (local762 != null) {
							this.method604(1, 0, aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray209[0], aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray208[0], 0, local762.anIntArray208[0], (byte) 9, 0, local762.anIntArray209[0], 2, 1, false);
							this.anInt875 = super.anInt836;
							this.anInt876 = super.anInt837;
							this.anInt878 = 2;
							this.anInt877 = 0;
							this.aClass2_Sub1_Sub4_8.method481(197);
							this.aClass2_Sub1_Sub4_8.method516(local27, 674);
						}
					}
					if (local22 == 479) {
						this.method721(local12, 618, local17, local27);
						this.aClass2_Sub1_Sub4_8.method481(5);
						this.aClass2_Sub1_Sub4_8.method483(local12 + this.anInt870);
						this.aClass2_Sub1_Sub4_8.method518(local17 + this.anInt871);
						this.aClass2_Sub1_Sub4_8.method518(local27 >> 14 & 0x7FFF);
					}
					if (local22 == 51) {
						local762 = this.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local27];
						if (local762 != null) {
							this.method604(1, 0, aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray209[0], aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray208[0], 0, local762.anIntArray208[0], (byte) 9, 0, local762.anIntArray209[0], 2, 1, false);
							this.anInt875 = super.anInt836;
							this.anInt876 = super.anInt837;
							this.anInt878 = 2;
							this.anInt877 = 0;
							anInt972++;
							if (anInt972 >= 110) {
								this.aClass2_Sub1_Sub4_8.method481(164);
								this.aClass2_Sub1_Sub4_8.method486(0);
								anInt972 = 0;
							}
							this.aClass2_Sub1_Sub4_8.method481(143);
							this.aClass2_Sub1_Sub4_8.method483(local27);
						}
					}
					if (local22 == 990) {
						local554 = this.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local27];
						if (local554 != null) {
							this.method604(1, 0, aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray209[0], aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray208[0], 0, local554.anIntArray208[0], (byte) 9, 0, local554.anIntArray209[0], 2, 1, false);
							this.anInt875 = super.anInt836;
							this.anInt876 = super.anInt837;
							this.anInt878 = 2;
							this.anInt877 = 0;
							this.aClass2_Sub1_Sub4_8.method481(191);
							this.aClass2_Sub1_Sub4_8.method517(this.aByte32, local27);
						}
					}
					@Pc(1009) Class19 local1009;
					if (local22 == 98) {
						this.aClass2_Sub1_Sub4_8.method481(50);
						this.aClass2_Sub1_Sub4_8.method483(local17);
						local1009 = Class19.method213(local17);
						if (local1009.anIntArrayArray12 != null && local1009.anIntArrayArray12[0][0] == 5) {
							local58 = local1009.anIntArrayArray12[0][1];
							this.anIntArray250[local58] = 1 - this.anIntArray250[local58];
							this.method715(local58);
							this.aBoolean214 = true;
						}
					}
					if (local22 == 8) {
						local762 = this.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local27];
						if (local762 != null) {
							this.method604(1, 0, aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray209[0], aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray208[0], 0, local762.anIntArray208[0], (byte) 9, 0, local762.anIntArray209[0], 2, 1, false);
							this.anInt875 = super.anInt836;
							this.anInt876 = super.anInt837;
							this.anInt878 = 2;
							this.anInt877 = 0;
							this.aClass2_Sub1_Sub4_8.method481(73);
							this.aClass2_Sub1_Sub4_8.method516(this.anInt996, 674);
							this.aClass2_Sub1_Sub4_8.method516(this.anInt997, 674);
							this.aClass2_Sub1_Sub4_8.method516(this.anInt998, 674);
							this.aClass2_Sub1_Sub4_8.method483(local27);
						}
					}
					if (local22 == 882) {
						local352 = this.method604(0, 0, aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray209[0], aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray208[0], 0, local12, (byte) 9, 0, local17, 2, 0, false);
						if (!local352) {
							this.method604(1, 0, aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray209[0], aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray208[0], 0, local12, (byte) 9, 0, local17, 2, 1, false);
						}
						this.anInt875 = super.anInt836;
						this.anInt876 = super.anInt837;
						this.anInt878 = 2;
						this.anInt877 = 0;
						this.aClass2_Sub1_Sub4_8.method481(202);
						this.aClass2_Sub1_Sub4_8.method517(this.aByte32, local27);
						this.aClass2_Sub1_Sub4_8.method517(this.aByte32, local17 + this.anInt871);
						this.aClass2_Sub1_Sub4_8.method483(local12 + this.anInt870);
					}
					if (local22 == 352) {
						this.aClass2_Sub1_Sub4_8.method481(82);
						this.aClass2_Sub1_Sub4_8.method517(this.aByte32, local12);
						this.aClass2_Sub1_Sub4_8.method516(local17, 674);
						this.aClass2_Sub1_Sub4_8.method516(local27, 674);
						this.anInt974 = 0;
						this.anInt975 = local17;
						this.anInt976 = local12;
						this.anInt977 = 2;
						if (Class19.method213(local17).anInt309 == this.anInt947) {
							this.anInt977 = 1;
						}
						if (Class19.method213(local17).anInt309 == this.anInt980) {
							this.anInt977 = 3;
						}
					}
					if (local22 == 228) {
						this.aClass2_Sub1_Sub4_8.method481(109);
						this.aClass2_Sub1_Sub4_8.method516(local17, 674);
						this.aClass2_Sub1_Sub4_8.method516(local27, 674);
						this.aClass2_Sub1_Sub4_8.method483(local12);
						this.anInt974 = 0;
						this.anInt975 = local17;
						this.anInt976 = local12;
						this.anInt977 = 2;
						if (Class19.method213(local17).anInt309 == this.anInt947) {
							this.anInt977 = 1;
						}
						if (Class19.method213(local17).anInt309 == this.anInt980) {
							this.anInt977 = 3;
						}
					}
					if (local22 == 1071) {
						local554 = this.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local27];
						if (local554 != null) {
							@Pc(1329) Class48 local1329 = local554.aClass48_2;
							if (local1329.anIntArray201 != null) {
								local1329 = local1329.method555();
							}
							if (local1329 != null) {
								if (local1329.aByteArray19 == null) {
									local75 = "It's a " + local1329.aString15 + ".";
								} else {
									local75 = new String(local1329.aByteArray19);
								}
								this.method663(local75, 0, "", this.anInt933);
							}
						}
					}
					if (local22 == 553) {
						local554 = this.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local27];
						if (local554 != null) {
							this.method604(1, 0, aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray209[0], aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray208[0], 0, local554.anIntArray208[0], (byte) 9, 0, local554.anIntArray209[0], 2, 1, false);
							this.anInt875 = super.anInt836;
							this.anInt876 = super.anInt837;
							this.anInt878 = 2;
							this.anInt877 = 0;
							this.aClass2_Sub1_Sub4_8.method481(165);
							this.aClass2_Sub1_Sub4_8.method517(this.aByte32, local27);
						}
					}
					if (local22 == 768) {
						this.method714();
					}
					if (local22 == 648) {
						this.aClass2_Sub1_Sub4_8.method481(212);
						this.aClass2_Sub1_Sub4_8.method516(local12, 674);
						this.aClass2_Sub1_Sub4_8.method518(local17);
						this.aClass2_Sub1_Sub4_8.method518(local27);
						this.anInt974 = 0;
						this.anInt975 = local17;
						this.anInt976 = local12;
						this.anInt977 = 2;
						if (Class19.method213(local17).anInt309 == this.anInt947) {
							this.anInt977 = 1;
						}
						if (Class19.method213(local17).anInt309 == this.anInt980) {
							this.anInt977 = 3;
						}
					}
					if (local22 == 246) {
						local762 = this.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local27];
						if (local762 != null) {
							this.method604(1, 0, aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray209[0], aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray208[0], 0, local762.anIntArray208[0], (byte) 9, 0, local762.anIntArray209[0], 2, 1, false);
							this.anInt875 = super.anInt836;
							this.anInt876 = super.anInt837;
							this.anInt878 = 2;
							this.anInt877 = 0;
							this.aClass2_Sub1_Sub4_8.method481(204);
							this.aClass2_Sub1_Sub4_8.method518(local27);
						}
					}
					if (local22 == 436) {
						this.aClass2_Sub1_Sub4_8.method481(50);
						this.aClass2_Sub1_Sub4_8.method483(local17);
						local1009 = Class19.method213(local17);
						if (local1009.anIntArrayArray12 != null && local1009.anIntArrayArray12[0][0] == 5) {
							local58 = local1009.anIntArrayArray12[0][1];
							if (this.anIntArray250[local58] != local1009.anIntArray63[0]) {
								this.anIntArray250[local58] = local1009.anIntArray63[0];
								this.method715(local58);
								this.aBoolean214 = true;
							}
						}
					}
					if (local22 == 978) {
						local352 = this.method604(0, 0, aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray209[0], aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray208[0], 0, local12, (byte) 9, 0, local17, 2, 0, false);
						if (!local352) {
							this.method604(1, 0, aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray209[0], aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray208[0], 0, local12, (byte) 9, 0, local17, 2, 1, false);
						}
						this.anInt875 = super.anInt836;
						this.anInt876 = super.anInt837;
						this.anInt878 = 2;
						this.anInt877 = 0;
						this.aClass2_Sub1_Sub4_8.method481(55);
						this.aClass2_Sub1_Sub4_8.method517(this.aByte32, local12 + this.anInt870);
						this.aClass2_Sub1_Sub4_8.method517(this.aByte32, local27);
						this.aClass2_Sub1_Sub4_8.method516(this.anInt914, 674);
						this.aClass2_Sub1_Sub4_8.method483(local17 + this.anInt871);
					}
					if (local22 == 233) {
						local352 = this.method604(0, 0, aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray209[0], aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray208[0], 0, local12, (byte) 9, 0, local17, 2, 0, false);
						if (!local352) {
							this.method604(1, 0, aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray209[0], aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray208[0], 0, local12, (byte) 9, 0, local17, 2, 1, false);
						}
						this.anInt875 = super.anInt836;
						this.anInt876 = super.anInt837;
						this.anInt878 = 2;
						this.anInt877 = 0;
						this.aClass2_Sub1_Sub4_8.method481(123);
						this.aClass2_Sub1_Sub4_8.method518(local27);
						this.aClass2_Sub1_Sub4_8.method483(local12 + this.anInt870);
						this.aClass2_Sub1_Sub4_8.method483(local17 + this.anInt871);
					}
					if (local22 == 618) {
						local352 = this.method604(0, 0, aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray209[0], aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray208[0], 0, local12, (byte) 9, 0, local17, 2, 0, false);
						if (!local352) {
							this.method604(1, 0, aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray209[0], aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray208[0], 0, local12, (byte) 9, 0, local17, 2, 1, false);
						}
						this.anInt875 = super.anInt836;
						this.anInt876 = super.anInt837;
						this.anInt878 = 2;
						this.anInt877 = 0;
						this.aClass2_Sub1_Sub4_8.method481(18);
						this.aClass2_Sub1_Sub4_8.method483(local12 + this.anInt870);
						this.aClass2_Sub1_Sub4_8.method517(this.aByte32, local27);
						this.aClass2_Sub1_Sub4_8.method483(local17 + this.anInt871);
					}
					if (local22 == 633) {
						this.aClass2_Sub1_Sub4_8.method481(171);
						this.aClass2_Sub1_Sub4_8.method518(local17);
						this.aClass2_Sub1_Sub4_8.method483(local12);
						this.aClass2_Sub1_Sub4_8.method516(local27, 674);
						this.anInt974 = 0;
						this.anInt975 = local17;
						this.anInt976 = local12;
						this.anInt977 = 2;
						if (Class19.method213(local17).anInt309 == this.anInt947) {
							this.anInt977 = 1;
						}
						if (Class19.method213(local17).anInt309 == this.anInt980) {
							this.anInt977 = 3;
						}
					}
					if (local22 == 417) {
						this.aClass2_Sub1_Sub4_8.method481(245);
						this.aClass2_Sub1_Sub4_8.method517(this.aByte32, local12);
						this.aClass2_Sub1_Sub4_8.method483(local27);
						this.aClass2_Sub1_Sub4_8.method518(local17);
						this.aClass2_Sub1_Sub4_8.method518(this.anInt914);
						this.anInt974 = 0;
						this.anInt975 = local17;
						this.anInt976 = local12;
						this.anInt977 = 2;
						if (Class19.method213(local17).anInt309 == this.anInt947) {
							this.anInt977 = 1;
						}
						if (Class19.method213(local17).anInt309 == this.anInt980) {
							this.anInt977 = 3;
						}
					}
					if (local22 == 438 && this.method721(local12, 618, local17, local27)) {
						this.aClass2_Sub1_Sub4_8.method481(54);
						this.aClass2_Sub1_Sub4_8.method483(local12 + this.anInt870);
						this.aClass2_Sub1_Sub4_8.method483(local27 >> 14 & 0x7FFF);
						this.aClass2_Sub1_Sub4_8.method517(this.aByte32, this.anInt996);
						this.aClass2_Sub1_Sub4_8.method517(this.aByte32, this.anInt998);
						this.aClass2_Sub1_Sub4_8.method518(this.anInt997);
						this.aClass2_Sub1_Sub4_8.method516(local17 + this.anInt871, 674);
					}
					if (local22 == 471) {
						local54 = this.aStringArray10[arg0];
						local58 = local54.indexOf("@whi@");
						if (local58 != -1) {
							if (this.anInt947 == -1) {
								this.method714();
								this.aString19 = local54.substring(local58 + 5).trim();
								this.aBoolean230 = false;
								this.anInt983 = this.anInt947 = Class19.anInt282;
							} else {
								this.method663("Please close the interface you have open before using 'report abuse'", 0, "", this.anInt933);
							}
						}
					}
					if (local22 == 227) {
						local554 = this.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local27];
						if (local554 != null) {
							this.method604(1, 0, aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray209[0], aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray208[0], 0, local554.anIntArray208[0], (byte) 9, 0, local554.anIntArray209[0], 2, 1, false);
							this.anInt875 = super.anInt836;
							this.anInt876 = super.anInt837;
							this.anInt878 = 2;
							this.anInt877 = 0;
							if ((local27 & 0x3) == 0) {
								anInt886++;
							}
							if (anInt886 >= 81) {
								this.aClass2_Sub1_Sub4_8.method481(239);
								this.aClass2_Sub1_Sub4_8.method482(166);
								anInt886 = 0;
							}
							this.aClass2_Sub1_Sub4_8.method481(187);
							this.aClass2_Sub1_Sub4_8.method516(local27, 674);
						}
					}
					if (local22 == 266) {
						local1009 = Class19.method213(local17);
						this.anInt913 = 1;
						this.anInt914 = local17;
						this.anInt915 = local1009.anInt277;
						this.anInt995 = 0;
						this.aBoolean214 = true;
						local723 = local1009.aString5;
						if (local723.indexOf(" ") != -1) {
							local723 = local723.substring(0, local723.indexOf(" "));
						}
						local75 = local1009.aString5;
						if (local75.indexOf(" ") != -1) {
							local75 = local75.substring(local75.indexOf(" ") + 1);
						}
						this.aString20 = local723 + " " + local1009.aString6 + " " + local75;
						if (this.anInt915 == 16) {
							this.aBoolean214 = true;
							this.anInt891 = 3;
							this.aBoolean206 = true;
						}
					} else {
						if (local22 == 561) {
							this.aClass2_Sub1_Sub4_8.method481(63);
							this.aClass2_Sub1_Sub4_8.method517(this.aByte32, local12);
							this.aClass2_Sub1_Sub4_8.method517(this.aByte32, local17);
							this.aClass2_Sub1_Sub4_8.method517(this.aByte32, local27);
							this.anInt974 = 0;
							this.anInt975 = local17;
							this.anInt976 = local12;
							this.anInt977 = 2;
							if (Class19.method213(local17).anInt309 == this.anInt947) {
								this.anInt977 = 1;
							}
							if (Class19.method213(local17).anInt309 == this.anInt980) {
								this.anInt977 = 3;
							}
						}
						if (local22 == 660) {
							this.aClass2_Sub1_Sub4_8.method481(113);
							this.aClass2_Sub1_Sub4_8.method483(local12);
							this.aClass2_Sub1_Sub4_8.method483(local27);
							this.aClass2_Sub1_Sub4_8.method516(local17, 674);
							this.anInt974 = 0;
							this.anInt975 = local17;
							this.anInt976 = local12;
							this.anInt977 = 2;
							if (Class19.method213(local17).anInt309 == this.anInt947) {
								this.anInt977 = 1;
							}
							if (Class19.method213(local17).anInt309 == this.anInt980) {
								this.anInt977 = 3;
							}
						}
						if (local22 == 103) {
							anInt1063 += local17;
							if (anInt1063 >= 78) {
								this.aClass2_Sub1_Sub4_8.method481(153);
								this.aClass2_Sub1_Sub4_8.method482(42);
								anInt1063 = 0;
							}
							this.aClass2_Sub1_Sub4_8.method481(240);
							this.aClass2_Sub1_Sub4_8.method483(local27);
							this.aClass2_Sub1_Sub4_8.method517(this.aByte32, local17);
							this.aClass2_Sub1_Sub4_8.method483(local12);
							this.anInt974 = 0;
							this.anInt975 = local17;
							this.anInt976 = local12;
							this.anInt977 = 2;
							if (Class19.method213(local17).anInt309 == this.anInt947) {
								this.anInt977 = 1;
							}
							if (Class19.method213(local17).anInt309 == this.anInt980) {
								this.anInt977 = 3;
							}
						}
						if (local22 == 147) {
							local762 = this.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local27];
							if (local762 != null) {
								this.method604(1, 0, aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray209[0], aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray208[0], 0, local762.anIntArray208[0], (byte) 9, 0, local762.anIntArray209[0], 2, 1, false);
								this.anInt875 = super.anInt836;
								this.anInt876 = super.anInt837;
								this.anInt878 = 2;
								this.anInt877 = 0;
								this.aClass2_Sub1_Sub4_8.method481(20);
								this.aClass2_Sub1_Sub4_8.method517(this.aByte32, local27);
							}
						}
						if (local22 == 672) {
							local554 = this.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local27];
							if (local554 != null) {
								this.method604(1, 0, aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray209[0], aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray208[0], 0, local554.anIntArray208[0], (byte) 9, 0, local554.anIntArray209[0], 2, 1, false);
								this.anInt875 = super.anInt836;
								this.anInt876 = super.anInt837;
								this.anInt878 = 2;
								this.anInt877 = 0;
								this.aClass2_Sub1_Sub4_8.method481(34);
								this.aClass2_Sub1_Sub4_8.method516(local27, 674);
							}
						}
						if (local22 == 240) {
							if ((local17 & 0x3) == 0) {
								anInt1040++;
							}
							if (anInt1040 >= 144) {
								this.aClass2_Sub1_Sub4_8.method481(91);
								this.aClass2_Sub1_Sub4_8.method485(6100950);
								anInt1040 = 0;
							}
							this.aClass2_Sub1_Sub4_8.method481(205);
							this.aClass2_Sub1_Sub4_8.method518(local17);
							this.aClass2_Sub1_Sub4_8.method517(this.aByte32, local12);
							this.aClass2_Sub1_Sub4_8.method483(local27);
							this.anInt974 = 0;
							this.anInt975 = local17;
							this.anInt976 = local12;
							this.anInt977 = 2;
							if (Class19.method213(local17).anInt309 == this.anInt947) {
								this.anInt977 = 1;
							}
							if (Class19.method213(local17).anInt309 == this.anInt980) {
								this.anInt977 = 3;
							}
						}
						if (local22 == 111) {
							this.method721(local12, 618, local17, local27);
							this.aClass2_Sub1_Sub4_8.method481(188);
							this.aClass2_Sub1_Sub4_8.method518(local17 + this.anInt871);
							this.aClass2_Sub1_Sub4_8.method518(local27 >> 14 & 0x7FFF);
							this.aClass2_Sub1_Sub4_8.method516(local12 + this.anInt870, 674);
						}
						if (local22 == 1936) {
							local697 = Class36.method434(local27);
							if (local697.aByteArray15 == null) {
								local723 = "It's a " + local697.aString10 + ".";
							} else {
								local723 = new String(local697.aByteArray15);
							}
							this.method663(local723, 0, "", this.anInt933);
						}
						if (local22 == 724) {
							this.aClass2_Sub1_Sub4_8.method481(38);
							this.aClass2_Sub1_Sub4_8.method517(this.aByte32, local17);
							this.aClass2_Sub1_Sub4_8.method518(local27);
							this.aClass2_Sub1_Sub4_8.method483(local12);
							this.anInt974 = 0;
							this.anInt975 = local17;
							this.anInt976 = local12;
							this.anInt977 = 2;
							if (Class19.method213(local17).anInt309 == this.anInt947) {
								this.anInt977 = 1;
							}
							if (Class19.method213(local17).anInt309 == this.anInt980) {
								this.anInt977 = 3;
							}
						}
						if (local22 == 138) {
							local1009 = Class19.method213(local17);
							@Pc(2766) boolean local2766 = true;
							if (local1009.anInt307 > 0) {
								local2766 = this.method641(local1009);
							}
							if (local2766) {
								this.aClass2_Sub1_Sub4_8.method481(50);
								this.aClass2_Sub1_Sub4_8.method483(local17);
							}
						}
						if (local22 == 229) {
							local554 = this.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local27];
							if (local554 != null) {
								this.method604(1, 0, aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray209[0], aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray208[0], 0, local554.anIntArray208[0], (byte) 9, 0, local554.anIntArray209[0], 2, 1, false);
								this.anInt875 = super.anInt836;
								this.anInt876 = super.anInt837;
								this.anInt878 = 2;
								this.anInt877 = 0;
								this.aClass2_Sub1_Sub4_8.method481(79);
								this.aClass2_Sub1_Sub4_8.method518(this.anInt998);
								this.aClass2_Sub1_Sub4_8.method516(this.anInt997, 674);
								this.aClass2_Sub1_Sub4_8.method516(this.anInt996, 674);
								this.aClass2_Sub1_Sub4_8.method517(this.aByte32, local27);
							}
						}
						if (local22 == 493) {
							local762 = this.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local27];
							if (local762 != null) {
								this.method604(1, 0, aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray209[0], aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray208[0], 0, local762.anIntArray208[0], (byte) 9, 0, local762.anIntArray209[0], 2, 1, false);
								this.anInt875 = super.anInt836;
								this.anInt876 = super.anInt837;
								this.anInt878 = 2;
								this.anInt877 = 0;
								this.aClass2_Sub1_Sub4_8.method481(25);
								this.aClass2_Sub1_Sub4_8.method518(this.anInt914);
								this.aClass2_Sub1_Sub4_8.method518(local27);
							}
						}
						if (local22 == 389) {
							local762 = this.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local27];
							if (local762 != null) {
								this.method604(1, 0, aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray209[0], aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray208[0], 0, local762.anIntArray208[0], (byte) 9, 0, local762.anIntArray209[0], 2, 1, false);
								this.anInt875 = super.anInt836;
								this.anInt876 = super.anInt837;
								this.anInt878 = 2;
								this.anInt877 = 0;
								this.aClass2_Sub1_Sub4_8.method481(137);
								this.aClass2_Sub1_Sub4_8.method518(local27);
							}
						}
						if (local22 == 1790) {
							this.method721(local12, 618, local17, local27);
							this.aClass2_Sub1_Sub4_8.method481(216);
							this.aClass2_Sub1_Sub4_8.method518(local17 + this.anInt871);
							this.aClass2_Sub1_Sub4_8.method518(local27 >> 14 & 0x7FFF);
							this.aClass2_Sub1_Sub4_8.method483(local12 + this.anInt870);
						}
						if (local22 == 469) {
							local352 = this.method604(0, 0, aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray209[0], aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray208[0], 0, local12, (byte) 9, 0, local17, 2, 0, false);
							if (!local352) {
								this.method604(1, 0, aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray209[0], aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray208[0], 0, local12, (byte) 9, 0, local17, 2, 1, false);
							}
							this.anInt875 = super.anInt836;
							this.anInt876 = super.anInt837;
							this.anInt878 = 2;
							this.anInt877 = 0;
							this.aClass2_Sub1_Sub4_8.method481(41);
							this.aClass2_Sub1_Sub4_8.method517(this.aByte32, local27);
							this.aClass2_Sub1_Sub4_8.method518(this.anInt996);
							this.aClass2_Sub1_Sub4_8.method483(this.anInt998);
							this.aClass2_Sub1_Sub4_8.method518(local17 + this.anInt871);
							this.aClass2_Sub1_Sub4_8.method483(local12 + this.anInt870);
							this.aClass2_Sub1_Sub4_8.method518(this.anInt997);
						}
						if (local22 == 918 && this.method721(local12, 618, local17, local27)) {
							this.aClass2_Sub1_Sub4_8.method481(247);
							this.aClass2_Sub1_Sub4_8.method518(local12 + this.anInt870);
							this.aClass2_Sub1_Sub4_8.method517(this.aByte32, this.anInt914);
							this.aClass2_Sub1_Sub4_8.method517(this.aByte32, local27 >> 14 & 0x7FFF);
							this.aClass2_Sub1_Sub4_8.method516(local17 + this.anInt871, 674);
						}
						if (local22 == 81) {
							local554 = this.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local27];
							if (local554 != null) {
								this.method604(1, 0, aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray209[0], aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray208[0], 0, local554.anIntArray208[0], (byte) 9, 0, local554.anIntArray209[0], 2, 1, false);
								this.anInt875 = super.anInt836;
								this.anInt876 = super.anInt837;
								this.anInt878 = 2;
								this.anInt877 = 0;
								this.aClass2_Sub1_Sub4_8.method481(233);
								this.aClass2_Sub1_Sub4_8.method516(local27, 674);
							}
						}
						if (local22 == 908) {
							this.method705(this.anInt1072);
							this.anInt1072 = -1;
							this.aBoolean208 = true;
						}
						if (local22 == 756) {
							local352 = this.method604(0, 0, aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray209[0], aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray208[0], 0, local12, (byte) 9, 0, local17, 2, 0, false);
							if (!local352) {
								this.method604(1, 0, aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray209[0], aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray208[0], 0, local12, (byte) 9, 0, local17, 2, 1, false);
							}
							this.anInt875 = super.anInt836;
							this.anInt876 = super.anInt837;
							this.anInt878 = 2;
							this.anInt877 = 0;
							anInt937 += local17;
							if (anInt937 >= 121) {
								this.aClass2_Sub1_Sub4_8.method481(10);
								this.aClass2_Sub1_Sub4_8.method485(1866764);
								anInt937 = 0;
							}
							this.aClass2_Sub1_Sub4_8.method481(174);
							this.aClass2_Sub1_Sub4_8.method517(this.aByte32, local27);
							this.aClass2_Sub1_Sub4_8.method483(local17 + this.anInt871);
							this.aClass2_Sub1_Sub4_8.method518(local12 + this.anInt870);
						}
						if (local22 == 1083) {
							@Pc(3373) int local3373 = local27 >> 14 & 0x7FFF;
							@Pc(3376) Class37 local3376 = Class37.method451(local3373);
							if (local3376.aByteArray16 == null) {
								local75 = "It's a " + local3376.aString11 + ".";
							} else {
								local75 = new String(local3376.aByteArray16);
							}
							this.method663(local75, 0, "", this.anInt933);
						}
						if (local22 == 824) {
							local54 = this.aStringArray10[arg0];
							local58 = local54.indexOf("@whi@");
							if (local58 != -1) {
								local663 = Class7.method55(local54.substring(local58 + 5).trim());
								local79 = -1;
								for (@Pc(3432) int local3432 = 0; local3432 < this.anInt954; local3432++) {
									if (this.aLongArray4[local3432] == local663) {
										local79 = local3432;
										break;
									}
								}
								if (local79 != -1 && this.anIntArray237[local79] > 0) {
									this.aBoolean208 = true;
									this.anInt1015 = 0;
									this.aBoolean236 = true;
									this.aString29 = "";
									this.anInt903 = 3;
									this.aLong29 = this.aLongArray4[local79];
									this.aString28 = "Enter message to send to " + this.aStringArray12[local79];
								}
							}
						}
						this.anInt995 = 0;
						this.anInt913 = 0;
						this.aBoolean214 = true;
					}
				}
			}
		} catch (@Pc(3502) RuntimeException local3502) {
			signlink.reporterror("83891, " + -701 + ", " + arg0 + ", " + local3502.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!BHRFVUZN;Z)V")
	private void method617(@OriginalArg(0) Class2_Sub2 arg0) {
		try {
			@Pc(7) int local7 = 0;
			@Pc(9) int local9 = -1;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			if (arg0.anInt66 == 0) {
				local7 = this.aClass20_1.method248(arg0.anInt65, arg0.anInt67, arg0.anInt68);
			}
			if (arg0.anInt66 == 1) {
				local7 = this.aClass20_1.method249(arg0.anInt68, 251, arg0.anInt65, arg0.anInt67);
			}
			if (arg0.anInt66 == 2) {
				local7 = this.aClass20_1.method250(arg0.anInt65, arg0.anInt67, arg0.anInt68);
			}
			if (arg0.anInt66 == 3) {
				local7 = this.aClass20_1.method251(arg0.anInt65, arg0.anInt67, arg0.anInt68);
			}
			if (local7 != 0) {
				@Pc(82) int local82 = this.aClass20_1.method252(arg0.anInt65, arg0.anInt67, arg0.anInt68, local7);
				local9 = local7 >> 14 & 0x7FFF;
				local11 = local82 & 0x1F;
				local13 = local82 >> 6;
			}
			arg0.anInt69 = local9;
			arg0.anInt71 = local11;
			arg0.anInt70 = local13;
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("16101, " + arg0 + ", " + false + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!NPZZPPRD;Z)V")
	private void method618(@OriginalArg(0) Class2_Sub1_Sub3_Sub4 arg0) {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anIntArray253.length; local5++) {
				this.anIntArray253[local5] = 0;
			}
			@Pc(30) int local30;
			for (@Pc(20) int local20 = 0; local20 < 5000; local20++) {
				local30 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray253[local30] = (int) (Math.random() * 256.0D);
			}
			@Pc(53) int local53;
			@Pc(57) int local57;
			@Pc(65) int local65;
			for (local30 = 0; local30 < 20; local30++) {
				for (local53 = 1; local53 < 255; local53++) {
					for (local57 = 1; local57 < 127; local57++) {
						local65 = local57 + (local53 << 7);
						this.anIntArray254[local65] = (this.anIntArray253[local65 - 1] + this.anIntArray253[local65 + 1] + this.anIntArray253[local65 - 128] + this.anIntArray253[local65 + 128]) / 4;
					}
				}
				@Pc(111) int[] local111 = this.anIntArray253;
				this.anIntArray253 = this.anIntArray254;
				this.anIntArray254 = local111;
			}
			if (arg0 != null) {
				local53 = 0;
				for (local57 = 0; local57 < arg0.anInt475; local57++) {
					for (local65 = 0; local65 < arg0.anInt474; local65++) {
						if (arg0.aByteArray12[local53++] != 0) {
							@Pc(147) int local147 = local65 + arg0.anInt476 + 16;
							@Pc(154) int local154 = local57 + arg0.anInt477 + 16;
							@Pc(160) int local160 = local147 + (local154 << 7);
							this.anIntArray253[local160] = 0;
						}
					}
				}
			}
		} catch (@Pc(177) RuntimeException local177) {
			signlink.reporterror("45168, " + arg0 + ", " + false + ", " + local177.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!IJNDWVIL;I)Z")
	private boolean method619(@OriginalArg(0) Class19 arg0) {
		try {
			@Pc(10) int local10 = arg0.anInt307;
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
				this.aStringArray10[this.anInt1053] = "Remove @whi@" + this.aStringArray12[local10];
				this.anIntArray214[this.anInt1053] = 819;
				this.anInt1053++;
				this.aStringArray10[this.anInt1053] = "Message @whi@" + this.aStringArray12[local10];
				this.anIntArray214[this.anInt1053] = 824;
				this.anInt1053++;
				return true;
			} else if (local10 >= 401 && local10 <= 500) {
				this.aStringArray10[this.anInt1053] = "Remove @whi@" + arg0.aString7;
				this.anIntArray214[this.anInt1053] = 650;
				this.anInt1053++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("72722, " + arg0 + ", " + 3 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JB)V")
	private void method620(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt1007; local8++) {
					if (this.aLongArray3[local8] == arg0) {
						this.anInt1007--;
						this.aBoolean214 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt1007; local28++) {
							this.aLongArray3[local28] = this.aLongArray3[local28 + 1];
						}
						this.aClass2_Sub1_Sub4_8.method481(215);
						this.aClass2_Sub1_Sub4_8.method488(arg0, this.anInt863);
						break;
					}
				}
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("57286, " + arg0 + ", " + 3 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method621(@OriginalArg(1) int arg0) {
		try {
			signlink.anInt1084 = arg0;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("18289, " + false + ", " + arg0 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method622(@OriginalArg(0) int arg0) {
		try {
			@Pc(7) byte[] local7 = this.aClass21_2.method275("title.dat", null);
			@Pc(13) Class2_Sub1_Sub3_Sub3 local13 = new Class2_Sub1_Sub3_Sub3(local7, this);
			this.aClass1_22.method1(this.aByte34);
			local13.method332(0, 488, 0);
			this.aClass1_23.method1(this.aByte34);
			local13.method332(-637, 488, 0);
			this.aClass1_19.method1(this.aByte34);
			local13.method332(-128, 488, 0);
			this.aClass1_20.method1(this.aByte34);
			local13.method332(-202, 488, -371);
			this.aClass1_21.method1(this.aByte34);
			local13.method332(-202, 488, -171);
			this.aClass1_24.method1(this.aByte34);
			local13.method332(0, 488, -265);
			this.aClass1_25.method1(this.aByte34);
			local13.method332(-562, 488, -265);
			this.aClass1_26.method1(this.aByte34);
			local13.method332(-128, 488, -171);
			this.aClass1_27.method1(this.aByte34);
			local13.method332(-562, 488, -171);
			@Pc(107) int[] local107 = new int[local13.anInt436];
			for (@Pc(109) int local109 = 0; local109 < local13.anInt437; local109++) {
				for (@Pc(113) int local113 = 0; local113 < local13.anInt436; local113++) {
					local107[local113] = local13.anIntArray103[local13.anInt436 + local13.anInt436 * local109 - local113 - 1];
				}
				for (@Pc(139) int local139 = 0; local139 < local13.anInt436; local139++) {
					local13.anIntArray103[local139 + local13.anInt436 * local109] = local107[local139];
				}
			}
			if (arg0 != 8) {
				this.aClass2_Sub1_Sub4_8.method482(8);
			}
			this.aClass1_22.method1(this.aByte34);
			local13.method332(382, 488, 0);
			this.aClass1_23.method1(this.aByte34);
			local13.method332(-255, 488, 0);
			this.aClass1_19.method1(this.aByte34);
			local13.method332(254, 488, 0);
			this.aClass1_20.method1(this.aByte34);
			local13.method332(180, 488, -371);
			this.aClass1_21.method1(this.aByte34);
			local13.method332(180, 488, -171);
			this.aClass1_24.method1(this.aByte34);
			local13.method332(382, 488, -265);
			this.aClass1_25.method1(this.aByte34);
			local13.method332(-180, 488, -265);
			this.aClass1_26.method1(this.aByte34);
			local13.method332(254, 488, -171);
			this.aClass1_27.method1(this.aByte34);
			local13.method332(-180, 488, -171);
			local13 = new Class2_Sub1_Sub3_Sub3(this.aClass21_2, "logo", 0);
			this.aClass1_19.method1(this.aByte34);
			local13.method334(18, this.anInt908, 382 - local13.anInt436 / 2 - 128);
			System.gc();
		} catch (@Pc(300) RuntimeException local300) {
			signlink.reporterror("49203, " + arg0 + ", " + local300.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
	private void method623(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(5) Class2_Sub2 local5 = null;
			for (@Pc(10) Class2_Sub2 local10 = (Class2_Sub2) this.aClass38_10.method461(); local10 != null; local10 = (Class2_Sub2) this.aClass38_10.method463()) {
				if (local10.anInt65 == arg7 && local10.anInt67 == arg4 && local10.anInt68 == arg6 && local10.anInt66 == arg8) {
					local5 = local10;
					break;
				}
			}
			if (local5 == null) {
				local5 = new Class2_Sub2();
				local5.anInt65 = arg7;
				local5.anInt66 = arg8;
				local5.anInt67 = arg4;
				local5.anInt68 = arg6;
				this.method617(local5);
				this.aClass38_10.method458(local5);
			}
			local5.anInt73 = arg0;
			local5.anInt75 = arg5;
			local5.anInt74 = arg1;
			local5.anInt76 = arg2;
			local5.anInt72 = arg3;
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("37750, " + 24210 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method624() {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt964; local3++) {
				if (local3 == -1) {
					local11 = this.anInt963;
				} else {
					local11 = this.anIntArray243[local3];
				}
				@Pc(23) Class2_Sub1_Sub1_Sub2_Sub1 local23 = this.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local11];
				if (local23 != null && local23.anInt789 > 0) {
					local23.anInt789--;
					if (local23.anInt789 == 0) {
						local23.aString16 = null;
					}
				}
			}
			this.aBoolean217 &= true;
			for (local11 = 0; local11 < this.anInt957; local11++) {
				@Pc(60) int local60 = this.anIntArray242[local11];
				@Pc(65) Class2_Sub1_Sub1_Sub2_Sub2 local65 = this.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local60];
				if (local65 != null && local65.anInt789 > 0) {
					local65.anInt789--;
					if (local65.anInt789 == 0) {
						local65.aString16 = null;
					}
				}
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("2075, " + true + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method625() {
		try {
			@Pc(4) Graphics local4 = this.method586(aBoolean205).getGraphics();
			local4.setColor(Color.black);
			local4.fillRect(0, 0, 765, 503);
			this.method579(this.aByte31);
			@Pc(44) byte local44;
			@Pc(50) int local50;
			if (this.aBoolean229) {
				this.aBoolean221 = false;
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
			if (this.aBoolean200) {
				this.aBoolean221 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean213) {
				this.aBoolean221 = false;
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
			signlink.reporterror("66218, " + 3 + ", " + local182.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method626() {
		try {
			if (super.anInt835 == 1) {
				if (super.anInt836 >= 6 && super.anInt836 <= 106 && super.anInt837 >= 467 && super.anInt837 <= 499) {
					this.anInt1033 = (this.anInt1033 + 1) % 4;
					this.aBoolean232 = true;
					this.aBoolean208 = true;
					this.aClass2_Sub1_Sub4_8.method481(14);
					this.aClass2_Sub1_Sub4_8.method482(this.anInt1033);
					this.aClass2_Sub1_Sub4_8.method482(this.anInt923);
					this.aClass2_Sub1_Sub4_8.method482(this.anInt1010);
				}
				if (super.anInt836 >= 135 && super.anInt836 <= 235 && super.anInt837 >= 467 && super.anInt837 <= 499) {
					this.anInt923 = (this.anInt923 + 1) % 3;
					this.aBoolean232 = true;
					this.aBoolean208 = true;
					this.aClass2_Sub1_Sub4_8.method481(14);
					this.aClass2_Sub1_Sub4_8.method482(this.anInt1033);
					this.aClass2_Sub1_Sub4_8.method482(this.anInt923);
					this.aClass2_Sub1_Sub4_8.method482(this.anInt1010);
				}
				if (super.anInt836 >= 273 && super.anInt836 <= 373 && super.anInt837 >= 467 && super.anInt837 <= 499) {
					this.anInt1010 = (this.anInt1010 + 1) % 3;
					this.aBoolean232 = true;
					this.aBoolean208 = true;
					this.aClass2_Sub1_Sub4_8.method481(14);
					this.aClass2_Sub1_Sub4_8.method482(this.anInt1033);
					this.aClass2_Sub1_Sub4_8.method482(this.anInt923);
					this.aClass2_Sub1_Sub4_8.method482(this.anInt1010);
				}
				if (super.anInt836 >= 412 && super.anInt836 <= 512 && super.anInt837 >= 467 && super.anInt837 <= 499) {
					if (this.anInt947 == -1) {
						this.method714();
						this.aString19 = "";
						this.aBoolean230 = false;
						this.anInt983 = this.anInt947 = Class19.anInt282;
						return;
					}
					this.method663("Please close the interface you have open before using 'report abuse'", 0, "", this.anInt933);
					return;
				}
			}
		} catch (@Pc(203) RuntimeException local203) {
			signlink.reporterror("50645, " + -16 + ", " + local203.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method627(@OriginalArg(1) int arg0) {
		try {
			@Pc(2) Class19 local2 = Class19.method213(arg0);
			for (@Pc(4) int local4 = 0; local4 < local2.anIntArray66.length && local2.anIntArray66[local4] != -1; local4++) {
				@Pc(18) Class19 local18 = Class19.method213(local2.anIntArray66[local4]);
				if (local18.anInt310 == 1) {
					this.method627(local18.anInt293);
				}
				local18.anInt291 = 0;
				local18.anInt308 = 0;
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("69994, " + 337 + ", " + arg0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I[BI)Z")
	private boolean method628(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) boolean local3 = false;
			return arg1 == null ? true : signlink.wavesave(arg1, arg2);
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("20300, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method629(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt924 > 1) {
				this.anInt924--;
			}
			if (this.anInt869 > 0) {
				this.anInt869--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method703(); local22++) {
			}
			if (this.aBoolean217) {
				@Pc(41) Object local41 = this.aClass31_1.anObject1;
				@Pc(66) int local66;
				@Pc(68) int local68;
				@Pc(70) int local70;
				@Pc(103) int local103;
				synchronized (this.aClass31_1.anObject1) {
					if (!aBoolean216) {
						this.aClass31_1.anInt517 = 0;
					} else if (super.anInt835 != 0 || this.aClass31_1.anInt517 >= 40) {
						this.aClass2_Sub1_Sub4_8.method481(43);
						this.aClass2_Sub1_Sub4_8.method482(0);
						local66 = this.aClass2_Sub1_Sub4_8.anInt672;
						local68 = 0;
						@Pc(86) int local86;
						for (local70 = 0; local70 < this.aClass31_1.anInt517 && local66 - this.aClass2_Sub1_Sub4_8.anInt672 < 240; local70++) {
							local68++;
							local86 = this.aClass31_1.anIntArray156[local70];
							if (local86 < 0) {
								local86 = 0;
							} else if (local86 > 502) {
								local86 = 502;
							}
							local103 = this.aClass31_1.anIntArray155[local70];
							if (local103 < 0) {
								local103 = 0;
							} else if (local103 > 764) {
								local103 = 764;
							}
							@Pc(120) int local120 = local86 * 765 + local103;
							if (this.aClass31_1.anIntArray156[local70] == -1 && this.aClass31_1.anIntArray155[local70] == -1) {
								local103 = -1;
								local86 = -1;
								local120 = 524287;
							}
							if (local103 != this.anInt1064 || local86 != this.anInt1065) {
								@Pc(165) int local165 = local103 - this.anInt1064;
								this.anInt1064 = local103;
								@Pc(173) int local173 = local86 - this.anInt1065;
								this.anInt1065 = local86;
								if (this.anInt979 < 8 && local165 >= -32 && local165 <= 31 && local173 >= -32 && local173 <= 31) {
									local165 += 32;
									local173 += 32;
									this.aClass2_Sub1_Sub4_8.method483((this.anInt979 << 12) + (local165 << 6) + local173);
									this.anInt979 = 0;
								} else if (this.anInt979 < 8) {
									this.aClass2_Sub1_Sub4_8.method485((this.anInt979 << 19) + local120 + 8388608);
									this.anInt979 = 0;
								} else {
									this.aClass2_Sub1_Sub4_8.method486((this.anInt979 << 19) + local120 - 1073741824);
									this.anInt979 = 0;
								}
							} else if (this.anInt979 < 2047) {
								this.anInt979++;
							}
						}
						this.aClass2_Sub1_Sub4_8.method491(this.aClass2_Sub1_Sub4_8.anInt672 - local66);
						if (local68 >= this.aClass31_1.anInt517) {
							this.aClass31_1.anInt517 = 0;
						} else {
							this.aClass31_1.anInt517 -= local68;
							for (local86 = 0; local86 < this.aClass31_1.anInt517; local86++) {
								this.aClass31_1.anIntArray155[local86] = this.aClass31_1.anIntArray155[local86 + local68];
								this.aClass31_1.anIntArray156[local86] = this.aClass31_1.anIntArray156[local86 + local68];
							}
						}
					}
				}
				if (super.anInt835 != 0) {
					@Pc(336) long local336 = (super.aLong28 - this.aLong33) / 50L;
					if (local336 > 4095L) {
						local336 = 4095L;
					}
					this.aLong33 = super.aLong28;
					local66 = super.anInt837;
					if (local66 < 0) {
						local66 = 0;
					} else if (local66 > 502) {
						local66 = 502;
					}
					local68 = super.anInt836;
					if (local68 < 0) {
						local68 = 0;
					} else if (local68 > 764) {
						local68 = 764;
					}
					local70 = local66 * 765 + local68;
					@Pc(382) byte local382 = 0;
					if (super.anInt835 == 2) {
						local382 = 1;
					}
					local103 = (int) local336;
					this.aClass2_Sub1_Sub4_8.method481(135);
					this.aClass2_Sub1_Sub4_8.method526((local103 << 20) + (local382 << 19) + local70);
				}
				if (this.anInt936 > 0) {
					this.anInt936--;
				}
				if (super.anIntArray210[1] == 1 || super.anIntArray210[2] == 1 || super.anIntArray210[3] == 1 || super.anIntArray210[4] == 1) {
					this.aBoolean215 = true;
				}
				if (this.aBoolean215 && this.anInt936 <= 0) {
					this.anInt936 = 20;
					this.aBoolean215 = false;
					this.aClass2_Sub1_Sub4_8.method481(219);
					this.aClass2_Sub1_Sub4_8.method483(this.anInt927);
					this.aClass2_Sub1_Sub4_8.method483(this.anInt928);
				}
				if (super.aBoolean198 && !this.aBoolean201) {
					this.aBoolean201 = true;
					this.aClass2_Sub1_Sub4_8.method481(30);
					this.aClass2_Sub1_Sub4_8.method482(1);
				}
				if (!super.aBoolean198 && this.aBoolean201) {
					this.aBoolean201 = false;
					this.aClass2_Sub1_Sub4_8.method481(30);
					this.aClass2_Sub1_Sub4_8.method482(0);
				}
				this.method613();
				this.method686();
				this.method615();
				anInt1060++;
				if (anInt1060 > 168) {
					anInt1060 = 0;
					this.aClass2_Sub1_Sub4_8.method481(139);
					this.aClass2_Sub1_Sub4_8.method483(12152);
				}
				this.anInt867++;
				if (this.anInt867 > 750) {
					this.method612();
				}
				this.method631();
				this.method645(496);
				this.method624();
				this.anInt901++;
				if (this.anInt878 != 0) {
					this.anInt877 += 20;
					if (this.anInt877 >= 400) {
						this.anInt878 = 0;
					}
				}
				if (this.anInt977 != 0) {
					this.anInt974++;
					if (this.anInt974 >= 15) {
						if (this.anInt977 == 2) {
							this.aBoolean214 = true;
						}
						if (this.anInt977 == 3) {
							this.aBoolean208 = true;
						}
						this.anInt977 = 0;
					}
				}
				if (this.anInt986 != 0) {
					this.anInt1054++;
					if (super.anInt830 > this.anInt987 + 5 || super.anInt830 < this.anInt987 - 5 || super.anInt831 > this.anInt988 + 5 || super.anInt831 < this.anInt988 - 5) {
						this.aBoolean202 = true;
					}
					if (super.anInt829 == 0) {
						if (this.anInt986 == 2) {
							this.aBoolean214 = true;
						}
						if (this.anInt986 == 3) {
							this.aBoolean208 = true;
						}
						this.anInt986 = 0;
						if (this.aBoolean202 && this.anInt1054 >= 5) {
							this.anInt920 = -1;
							this.method633();
							if (this.anInt920 == this.anInt984 && this.anInt919 != this.anInt985) {
								@Pc(700) Class19 local700 = Class19.method213(this.anInt984);
								@Pc(702) byte local702 = 0;
								if (this.anInt885 == 1 && local700.anInt307 == 206) {
									local702 = 1;
								}
								if (local700.anIntArray67[this.anInt919] <= 0) {
									local702 = 0;
								}
								if (local700.aBoolean73) {
									local66 = this.anInt985;
									local68 = this.anInt919;
									local700.anIntArray67[local68] = local700.anIntArray67[local66];
									local700.anIntArray64[local68] = local700.anIntArray64[local66];
									local700.anIntArray67[local66] = -1;
									local700.anIntArray64[local66] = 0;
								} else if (local702 == 1) {
									local66 = this.anInt985;
									local68 = this.anInt919;
									while (local66 != local68) {
										if (local66 > local68) {
											local700.method211(local66, local66 - 1);
											local66--;
										} else if (local66 < local68) {
											local700.method211(local66, local66 + 1);
											local66++;
										}
									}
								} else {
									local700.method211(this.anInt985, this.anInt919);
								}
								this.aClass2_Sub1_Sub4_8.method481(157);
								this.aClass2_Sub1_Sub4_8.method508(local702);
								this.aClass2_Sub1_Sub4_8.method483(this.anInt919);
								this.aClass2_Sub1_Sub4_8.method516(this.anInt985, 674);
								this.aClass2_Sub1_Sub4_8.method483(this.anInt984);
							}
						} else if ((this.anInt1037 == 1 || this.method665(this.anInt1053 - 1)) && this.anInt1053 > 2) {
							this.method590(this.anInt1003);
						} else if (this.anInt1053 > 0) {
							this.method616(this.anInt1053 - 1);
						}
						this.anInt974 = 10;
						super.anInt835 = 0;
					}
				}
				@Pc(875) int local875;
				@Pc(877) int local877;
				if (Class20.anInt344 != -1) {
					local875 = Class20.anInt344;
					local877 = Class20.anInt345;
					@Pc(898) boolean local898 = this.method604(0, 0, aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray209[0], aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray208[0], 0, local875, (byte) 9, 0, local877, 0, 0, true);
					Class20.anInt344 = -1;
					if (local898) {
						this.anInt875 = super.anInt836;
						this.anInt876 = super.anInt837;
						this.anInt878 = 1;
						this.anInt877 = 0;
					}
				}
				if (super.anInt835 == 1 && this.aString27 != null) {
					this.aString27 = null;
					this.aBoolean208 = true;
					super.anInt835 = 0;
				}
				this.method723();
				if (this.anInt879 == -1) {
					this.method636();
					this.method669();
					this.method626();
				}
				if (super.anInt829 == 1 || super.anInt835 == 1) {
					this.anInt931++;
				}
				if (this.anInt1051 == 0 && this.anInt909 == 0 && this.anInt906 == 0) {
					if (this.anInt842 > 0) {
						this.anInt842--;
					}
				} else if (this.anInt842 < 100) {
					this.anInt842++;
					if (this.anInt842 == 100) {
						if (this.anInt1051 != 0) {
							this.aBoolean208 = true;
						}
						if (this.anInt909 != 0) {
							this.aBoolean214 = true;
						}
					}
				}
				if (this.anInt887 == 2) {
					this.method643();
				}
				if (this.anInt887 == 2 && this.aBoolean239) {
					this.method591();
				}
				for (local875 = 0; local875 < 5; local875++) {
					@Pc(1034) int local1034 = this.anIntArray218[local875]++;
				}
				this.method659();
				super.anInt828++;
				if (super.anInt828 > 4500) {
					this.anInt869 = 250;
					super.anInt828 -= 500;
					this.aClass2_Sub1_Sub4_8.method481(120);
				}
				this.anInt926++;
				if (arg0 >= 0) {
					this.aBoolean212 = !this.aBoolean212;
				}
				if (this.anInt926 > 500) {
					this.anInt926 = 0;
					local877 = (int) (Math.random() * 8.0D);
					if ((local877 & 0x1) == 1) {
						this.anInt1004 += this.anInt1005;
					}
					if ((local877 & 0x2) == 2) {
						this.anInt911 += this.anInt912;
					}
					if ((local877 & 0x4) == 4) {
						this.anInt949 += this.anInt950;
					}
				}
				if (this.anInt1004 < -50) {
					this.anInt1005 = 2;
				}
				if (this.anInt1004 > 50) {
					this.anInt1005 = -2;
				}
				if (this.anInt911 < -55) {
					this.anInt912 = 2;
				}
				if (this.anInt911 > 55) {
					this.anInt912 = -2;
				}
				if (this.anInt949 < -40) {
					this.anInt950 = 1;
				}
				if (this.anInt949 > 40) {
					this.anInt950 = -1;
				}
				this.anInt894++;
				if (this.anInt894 > 500) {
					this.anInt894 = 0;
					local877 = (int) (Math.random() * 8.0D);
					if ((local877 & 0x1) == 1) {
						this.anInt1070 += this.anInt1071;
					}
					if ((local877 & 0x2) == 2) {
						this.anInt991 += this.anInt992;
					}
				}
				if (this.anInt1070 < -60) {
					this.anInt1071 = 2;
				}
				if (this.anInt1070 > 60) {
					this.anInt1071 = -2;
				}
				if (this.anInt991 < -20) {
					this.anInt992 = 1;
				}
				if (this.anInt991 > 10) {
					this.anInt992 = -1;
				}
				anInt848++;
				if (anInt848 > 1503) {
					anInt848 = 0;
					this.aClass2_Sub1_Sub4_8.method481(148);
					this.aClass2_Sub1_Sub4_8.method482(0);
					local877 = this.aClass2_Sub1_Sub4_8.anInt672;
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass2_Sub1_Sub4_8.method483(49529);
					}
					this.aClass2_Sub1_Sub4_8.method482(10);
					this.aClass2_Sub1_Sub4_8.method482(242);
					this.aClass2_Sub1_Sub4_8.method482(58);
					this.aClass2_Sub1_Sub4_8.method483((int) (Math.random() * 65536.0D));
					this.aClass2_Sub1_Sub4_8.method482(245);
					this.aClass2_Sub1_Sub4_8.method483(51582);
					this.aClass2_Sub1_Sub4_8.method482(73);
					this.aClass2_Sub1_Sub4_8.method483(62060);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass2_Sub1_Sub4_8.method482(175);
					}
					this.aClass2_Sub1_Sub4_8.method491(this.aClass2_Sub1_Sub4_8.anInt672 - local877);
				}
				this.anInt868++;
				if (this.anInt868 > 50) {
					this.aClass2_Sub1_Sub4_8.method481(122);
				}
				try {
					if (this.aClass32_1 != null && this.aClass2_Sub1_Sub4_8.anInt672 > 0) {
						this.aClass32_1.method424(this.aClass2_Sub1_Sub4_8.aByteArray17, this.aClass2_Sub1_Sub4_8.anInt672);
						this.aClass2_Sub1_Sub4_8.anInt672 = 0;
						this.anInt868 = 0;
					}
				} catch (@Pc(1370) IOException local1370) {
					this.method612();
				} catch (@Pc(1375) Exception local1375) {
					this.method687();
				}
			}
		} catch (@Pc(1380) RuntimeException local1380) {
			signlink.reporterror("87973, " + arg0 + ", " + local1380.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!IJNDWVIL;)I")
	private int method630(@OriginalArg(1) int arg0, @OriginalArg(2) Class19 arg1) {
		try {
			if (arg1.anIntArrayArray12 == null || arg0 >= arg1.anIntArrayArray12.length) {
				return -2;
			}
			try {
				@Pc(21) int[] local21 = arg1.anIntArrayArray12[arg0];
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
						local34 = this.anIntArray249[local21[local25++]];
					}
					if (local32 == 2) {
						local34 = this.anIntArray222[local21[local25++]];
					}
					if (local32 == 3) {
						local34 = this.anIntArray256[local21[local25++]];
					}
					@Pc(82) Class19 local82;
					@Pc(87) int local87;
					@Pc(100) int local100;
					if (local32 == 4) {
						local82 = Class19.method213(local21[local25++]);
						local87 = local21[local25++];
						if (local87 >= 0 && local87 < Class36.anInt543 && (!Class36.method434(local87).aBoolean145 || aBoolean226)) {
							for (local100 = 0; local100 < local82.anIntArray67.length; local100++) {
								if (local82.anIntArray67[local100] == local87 + 1) {
									local34 += local82.anIntArray64[local100];
								}
							}
						}
					}
					if (local32 == 5) {
						local34 = this.anIntArray250[local21[local25++]];
					}
					if (local32 == 6) {
						local34 = anIntArray232[this.anIntArray222[local21[local25++]] - 1];
					}
					if (local32 == 7) {
						local34 = this.anIntArray250[local21[local25++]] * 100 / 46875;
					}
					if (local32 == 8) {
						local34 = aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt661;
					}
					@Pc(175) int local175;
					if (local32 == 9) {
						for (local175 = 0; local175 < Class49.anInt765; local175++) {
							if (Class49.aBooleanArray9[local175]) {
								local34 += this.anIntArray222[local175];
							}
						}
					}
					if (local32 == 10) {
						local82 = Class19.method213(local21[local25++]);
						local87 = local21[local25++] + 1;
						if (local87 >= 0 && local87 < Class36.anInt543 && (!Class36.method434(local87).aBoolean145 || aBoolean226)) {
							for (local100 = 0; local100 < local82.anIntArray67.length; local100++) {
								if (local82.anIntArray67[local100] == local87) {
									local34 = 999999999;
									break;
								}
							}
						}
					}
					if (local32 == 11) {
						local34 = this.anInt978;
					}
					if (local32 == 12) {
						local34 = this.anInt893;
					}
					if (local32 == 13) {
						local175 = this.anIntArray250[local21[local25++]];
						local87 = local21[local25++];
						local34 = (local175 & 0x1 << local87) == 0 ? 0 : 1;
					}
					if (local32 == 14) {
						local175 = local21[local25++];
						@Pc(289) Class40 local289 = Class40.aClass40Array1[local175];
						local100 = local289.anInt678;
						@Pc(295) int local295 = local289.anInt679;
						@Pc(298) int local298 = local289.anInt680;
						@Pc(304) int local304 = anIntArray265[local298 - local295];
						local34 = this.anIntArray250[local100] >> local295 & local304;
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
						local34 = (aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt778 >> 7) + this.anInt870;
					}
					if (local32 == 19) {
						local34 = (aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt779 >> 7) + this.anInt871;
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
			signlink.reporterror("56525, " + 417 + ", " + arg0 + ", " + arg1 + ", " + local400.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method631() {
		try {
			for (@Pc(3) int local3 = -1; local3 < this.anInt964; local3++) {
				@Pc(11) int local11;
				if (local3 == -1) {
					local11 = this.anInt963;
				} else {
					local11 = this.anIntArray243[local3];
				}
				@Pc(23) Class2_Sub1_Sub1_Sub2_Sub1 local23 = this.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local11];
				if (local23 != null) {
					this.method646(1, local23);
				}
			}
			anInt900++;
			if (anInt900 > 69) {
				anInt900 = 0;
				this.aClass2_Sub1_Sub4_8.method481(75);
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("29644, " + 314 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method632() {
		try {
			this.aBoolean221 = false;
			while (this.aBoolean218) {
				this.aBoolean221 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(11) Exception local11) {
				}
			}
			this.aClass2_Sub1_Sub3_Sub4_14 = null;
			this.aClass2_Sub1_Sub3_Sub4_15 = null;
			this.aClass2_Sub1_Sub3_Sub4Array2 = null;
			this.anIntArray273 = null;
			this.anIntArray274 = null;
			this.anIntArray275 = null;
			this.anIntArray276 = null;
			this.anIntArray253 = null;
			this.anIntArray254 = null;
			this.anIntArray261 = null;
			this.anIntArray262 = null;
			this.aClass2_Sub1_Sub3_Sub3_15 = null;
			this.aClass2_Sub1_Sub3_Sub3_16 = null;
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("25342, " + -182 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method633() {
		try {
			if (this.anInt986 == 0) {
				this.aStringArray10[0] = "Cancel";
				this.anIntArray214[0] = 1946;
				this.anInt1053 = 1;
				if (this.anInt879 == -1) {
					this.method711(169);
					this.anInt857 = 0;
					this.anInt874 = 0;
					if (super.anInt830 > 4 && super.anInt831 > 4 && super.anInt830 < 516 && super.anInt831 < 338) {
						if (this.anInt947 == -1) {
							this.method716(14);
						} else {
							this.method727(4, Class19.method213(this.anInt947), 0, 0, this.anInt1036, 4, super.anInt830, super.anInt831);
						}
					}
					if (this.anInt857 != this.anInt1047) {
						this.anInt1047 = this.anInt857;
					}
					if (this.anInt874 != this.anInt906) {
						this.anInt906 = this.anInt874;
					}
					this.anInt857 = 0;
					this.anInt874 = 0;
					if (super.anInt830 > 553 && super.anInt831 > 205 && super.anInt830 < 743 && super.anInt831 < 466) {
						if (this.anInt966 != -1) {
							this.method727(553, Class19.method213(this.anInt966), 1, 0, this.anInt1036, 205, super.anInt830, super.anInt831);
						} else if (this.anIntArray226[this.anInt891] != -1) {
							this.method727(553, Class19.method213(this.anIntArray226[this.anInt891]), 1, 0, this.anInt1036, 205, super.anInt830, super.anInt831);
						}
					}
					if (this.anInt857 != this.anInt897) {
						this.aBoolean214 = true;
						this.anInt897 = this.anInt857;
					}
					if (this.anInt874 != this.anInt909) {
						this.aBoolean214 = true;
						this.anInt909 = this.anInt874;
					}
					this.anInt857 = 0;
					this.anInt874 = 0;
					if (super.anInt830 > 17 && super.anInt831 > 357 && super.anInt830 < 496 && super.anInt831 < 453) {
						if (this.anInt980 != -1) {
							this.method727(17, Class19.method213(this.anInt980), 2, 0, this.anInt1036, 357, super.anInt830, super.anInt831);
						} else if (this.anInt1072 != -1) {
							this.method727(17, Class19.method213(this.anInt1072), 3, 0, this.anInt1036, 357, super.anInt830, super.anInt831);
						} else if (super.anInt831 < 434 && super.anInt830 < 426 && this.anInt1015 == 0) {
							this.method679(super.anInt830 - 17, super.anInt831 - 357);
						}
					}
					if ((this.anInt980 != -1 || this.anInt1072 != -1) && this.anInt857 != this.anInt932) {
						this.aBoolean208 = true;
						this.anInt932 = this.anInt857;
					}
					if ((this.anInt980 != -1 || this.anInt1072 != -1) && this.anInt874 != this.anInt1051) {
						this.aBoolean208 = true;
						this.anInt1051 = this.anInt874;
					}
					@Pc(349) boolean local349 = false;
					while (!local349) {
						local349 = true;
						for (@Pc(361) int local361 = 0; local361 < this.anInt1053 - 1; local361++) {
							if (this.anIntArray214[local361] < 1000 && this.anIntArray214[local361 + 1] > 1000) {
								@Pc(382) String local382 = this.aStringArray10[local361];
								this.aStringArray10[local361] = this.aStringArray10[local361 + 1];
								this.aStringArray10[local361 + 1] = local382;
								@Pc(404) int local404 = this.anIntArray214[local361];
								this.anIntArray214[local361] = this.anIntArray214[local361 + 1];
								this.anIntArray214[local361 + 1] = local404;
								@Pc(426) int local426 = this.anIntArray212[local361];
								this.anIntArray212[local361] = this.anIntArray212[local361 + 1];
								this.anIntArray212[local361 + 1] = local426;
								@Pc(448) int local448 = this.anIntArray213[local361];
								this.anIntArray213[local361] = this.anIntArray213[local361 + 1];
								this.anIntArray213[local361 + 1] = local448;
								@Pc(470) int local470 = this.anIntArray215[local361];
								this.anIntArray215[local361] = this.anIntArray215[local361 + 1];
								this.anIntArray215[local361 + 1] = local470;
								local349 = false;
							}
						}
					}
				} else {
					this.anInt857 = 0;
					this.anInt874 = 0;
					this.method727(0, Class19.method213(this.anInt879), 0, 0, this.anInt1036, 0, super.anInt830, super.anInt831);
					if (this.anInt857 != this.anInt1047) {
						this.anInt1047 = this.anInt857;
					}
					if (this.anInt874 != this.anInt906) {
						this.anInt906 = this.anInt874;
					}
				}
			}
		} catch (@Pc(500) RuntimeException local500) {
			signlink.reporterror("11918, " + -113 + ", " + local500.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZILclient!IJNDWVIL;)V")
	private void method634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class19 arg3) {
		try {
			if (arg3.anInt310 == 0 && arg3.anIntArray66 != null && (!arg3.aBoolean75 || this.anInt1047 == arg3.anInt293 || this.anInt897 == arg3.anInt293 || this.anInt932 == arg3.anInt293)) {
				@Pc(29) int local29 = Class2_Sub1_Sub3.anInt467;
				@Pc(31) int local31 = Class2_Sub1_Sub3.anInt465;
				@Pc(33) int local33 = Class2_Sub1_Sub3.anInt468;
				@Pc(35) int local35 = Class2_Sub1_Sub3.anInt466;
				Class2_Sub1_Sub3.method354(arg1, arg2, arg2 + arg3.anInt288, arg1 + arg3.anInt302);
				this.aBoolean217 &= true;
				@Pc(57) int local57 = arg3.anIntArray66.length;
				for (@Pc(59) int local59 = 0; local59 < local57; local59++) {
					@Pc(68) int local68 = arg3.anIntArray65[local59] + arg2;
					@Pc(77) int local77 = arg3.anIntArray68[local59] + arg1 - arg0;
					@Pc(83) Class19 local83 = Class19.method213(arg3.anIntArray66[local59]);
					@Pc(88) int local88 = local68 + local83.anInt287;
					@Pc(93) int local93 = local77 + local83.anInt290;
					if (local83.anInt307 > 0) {
						this.method724(local83);
					}
					if (local83.anInt310 == 0) {
						if (local83.anInt289 > local83.anInt292 - local83.anInt302) {
							local83.anInt289 = local83.anInt292 - local83.anInt302;
						}
						if (local83.anInt289 < 0) {
							local83.anInt289 = 0;
						}
						this.method634(local83.anInt289, local93, local88, local83);
						if (local83.anInt292 > local83.anInt302) {
							this.method657(local83.anInt302, local83.anInt289, local83.anInt292, local93, local88 + local83.anInt288);
						}
					} else if (local83.anInt310 != 1) {
						@Pc(165) int local165;
						@Pc(169) int local169;
						@Pc(180) int local180;
						@Pc(215) int local215;
						@Pc(222) int local222;
						@Pc(247) int local247;
						@Pc(163) int local163;
						@Pc(213) int local213;
						if (local83.anInt310 == 2) {
							local163 = 0;
							for (local165 = 0; local165 < local83.anInt302; local165++) {
								for (local169 = 0; local169 < local83.anInt288; local169++) {
									local180 = local88 + local169 * (local83.anInt303 + 32);
									@Pc(189) int local189 = local93 + local165 * (local83.anInt297 + 32);
									if (local163 < 20) {
										local180 += local83.anIntArray69[local163];
										local189 += local83.anIntArray70[local163];
									}
									if (local83.anIntArray67[local163] > 0) {
										local213 = 0;
										local215 = 0;
										local222 = local83.anIntArray67[local163] - 1;
										if (local180 > Class2_Sub1_Sub3.anInt467 - 32 && local180 < Class2_Sub1_Sub3.anInt468 && local189 > Class2_Sub1_Sub3.anInt465 - 32 && local189 < Class2_Sub1_Sub3.anInt466 || this.anInt986 != 0 && this.anInt985 == local163) {
											local247 = 0;
											if (this.anInt995 == 1 && this.anInt996 == local163 && this.anInt997 == local83.anInt293) {
												local247 = 16777215;
											}
											@Pc(271) Class2_Sub1_Sub3_Sub3 local271 = Class36.method444(local222, local83.anIntArray64[local163], local247);
											if (local271 != null) {
												@Pc(350) int local350;
												if (this.anInt986 != 0 && this.anInt985 == local163 && this.anInt984 == local83.anInt293) {
													local213 = super.anInt830 - this.anInt987;
													local215 = super.anInt831 - this.anInt988;
													if (local213 < 5 && local213 > -5) {
														local213 = 0;
													}
													if (local215 < 5 && local215 > -5) {
														local215 = 0;
													}
													if (this.anInt1054 < 5) {
														local213 = 0;
														local215 = 0;
													}
													local271.method336(local180 + local213, local189 + local215);
													if (local189 + local215 < Class2_Sub1_Sub3.anInt465 && arg3.anInt289 > 0) {
														local350 = this.anInt901 * (Class2_Sub1_Sub3.anInt465 - local189 - local215) / 3;
														if (local350 > this.anInt901 * 10) {
															local350 = this.anInt901 * 10;
														}
														if (local350 > arg3.anInt289) {
															local350 = arg3.anInt289;
														}
														arg3.anInt289 -= local350;
														this.anInt988 += local350;
													}
													if (local189 + local215 + 32 > Class2_Sub1_Sub3.anInt466 && arg3.anInt289 < arg3.anInt292 - arg3.anInt302) {
														local350 = this.anInt901 * (local189 + local215 + 32 - Class2_Sub1_Sub3.anInt466) / 3;
														if (local350 > this.anInt901 * 10) {
															local350 = this.anInt901 * 10;
														}
														if (local350 > arg3.anInt292 - arg3.anInt302 - arg3.anInt289) {
															local350 = arg3.anInt292 - arg3.anInt302 - arg3.anInt289;
														}
														arg3.anInt289 += local350;
														this.anInt988 -= local350;
													}
												} else if (this.anInt977 != 0 && this.anInt976 == local163 && this.anInt975 == local83.anInt293) {
													local271.method336(local180, local189);
												} else {
													local271.method334(local189, this.anInt908, local180);
												}
												if (local271.anInt440 == 33 || local83.anIntArray64[local163] != 1) {
													local350 = local83.anIntArray64[local163];
													this.aClass2_Sub1_Sub3_Sub2_2.method304(method654(local350), local189 + local215 + 10, local180 + 1 + local213, this.aBoolean207, 0);
													this.aClass2_Sub1_Sub3_Sub2_2.method304(method654(local350), local189 + local215 + 9, local180 + local213, this.aBoolean207, 16776960);
												}
											}
										}
									} else if (local83.aClass2_Sub1_Sub3_Sub3Array2 != null && local163 < 20) {
										@Pc(542) Class2_Sub1_Sub3_Sub3 local542 = local83.aClass2_Sub1_Sub3_Sub3Array2[local163];
										if (local542 != null) {
											local542.method334(local189, this.anInt908, local180);
										}
									}
									local163++;
								}
							}
						} else if (local83.anInt310 == 3) {
							@Pc(569) boolean local569 = false;
							if (this.anInt932 == local83.anInt293 || this.anInt897 == local83.anInt293 || this.anInt1047 == local83.anInt293) {
								local569 = true;
							}
							if (this.method699(local83)) {
								local163 = local83.anInt286;
								if (local569 && local83.anInt276 != 0) {
									local163 = local83.anInt276;
								}
							} else {
								local163 = local83.anInt301;
								if (local569 && local83.anInt285 != 0) {
									local163 = local83.anInt285;
								}
							}
							if (local83.aByte11 == 0) {
								if (local83.aBoolean69) {
									Class2_Sub1_Sub3.method357(local88, local83.anInt288, local93, local163, local83.anInt302);
								} else {
									Class2_Sub1_Sub3.method358(local88, local93, local83.anInt302, local83.anInt288, local163, 149);
								}
							} else if (local83.aBoolean69) {
								Class2_Sub1_Sub3.method356(local163, local83.anInt288, 256 - (local83.aByte11 & 0xFF), local83.anInt302, local93, 252, local88);
							} else {
								Class2_Sub1_Sub3.method359(256 - (local83.aByte11 & 0xFF), local93, local83.anInt288, local163, local83.anInt302, local88);
							}
						} else {
							@Pc(687) Class2_Sub1_Sub3_Sub2 local687;
							@Pc(964) String local964;
							if (local83.anInt310 == 4) {
								local687 = local83.aClass2_Sub1_Sub3_Sub2_1;
								@Pc(690) String local690 = local83.aString7;
								@Pc(692) boolean local692 = false;
								if (this.anInt932 == local83.anInt293 || this.anInt897 == local83.anInt293 || this.anInt1047 == local83.anInt293) {
									local692 = true;
								}
								if (this.method699(local83)) {
									local165 = local83.anInt286;
									if (local692 && local83.anInt276 != 0) {
										local165 = local83.anInt276;
									}
									if (local83.aString8.length() > 0) {
										local690 = local83.aString8;
									}
								} else {
									local165 = local83.anInt301;
									if (local692 && local83.anInt285 != 0) {
										local165 = local83.anInt285;
									}
								}
								if (local83.anInt306 == 6 && this.aBoolean211) {
									local690 = "Please wait...";
									local165 = local83.anInt301;
								}
								if (Class2_Sub1_Sub3.anInt463 == 479) {
									if (local165 == 16776960) {
										local165 = 255;
									}
									if (local165 == 49152) {
										local165 = 16777215;
									}
								}
								local213 = local93 + local687.anInt417;
								while (local690.length() > 0) {
									if (local690.indexOf("%") != -1) {
										label390: while (true) {
											local215 = local690.indexOf("%1");
											if (local215 == -1) {
												while (true) {
													local215 = local690.indexOf("%2");
													if (local215 == -1) {
														while (true) {
															local215 = local690.indexOf("%3");
															if (local215 == -1) {
																while (true) {
																	local215 = local690.indexOf("%4");
																	if (local215 == -1) {
																		while (true) {
																			local215 = local690.indexOf("%5");
																			if (local215 == -1) {
																				break label390;
																			}
																			local690 = local690.substring(0, local215) + this.method694(this.method630(4, local83)) + local690.substring(local215 + 2);
																		}
																	}
																	local690 = local690.substring(0, local215) + this.method694(this.method630(3, local83)) + local690.substring(local215 + 2);
																}
															}
															local690 = local690.substring(0, local215) + this.method694(this.method630(2, local83)) + local690.substring(local215 + 2);
														}
													}
													local690 = local690.substring(0, local215) + this.method694(this.method630(1, local83)) + local690.substring(local215 + 2);
												}
											}
											local690 = local690.substring(0, local215) + this.method694(this.method630(0, local83)) + local690.substring(local215 + 2);
										}
									}
									local215 = local690.indexOf("\\n");
									if (local215 == -1) {
										local964 = local690;
										local690 = "";
									} else {
										local964 = local690.substring(0, local215);
										local690 = local690.substring(local215 + 2);
									}
									if (local83.aBoolean77) {
										local687.method301(local964, local83.aBoolean76, local213, local165, local88 + local83.anInt288 / 2);
									} else {
										local687.method308(local88, local213, local165, local83.aBoolean76, local964);
									}
									local213 += local687.anInt417;
								}
							} else if (local83.anInt310 == 5) {
								@Pc(1026) Class2_Sub1_Sub3_Sub3 local1026;
								if (this.method699(local83)) {
									local1026 = local83.aClass2_Sub1_Sub3_Sub3_1;
								} else {
									local1026 = local83.aClass2_Sub1_Sub3_Sub3_2;
								}
								if (local1026 != null) {
									local1026.method334(local93, this.anInt908, local88);
								}
							} else if (local83.anInt310 == 6) {
								local163 = Class2_Sub1_Sub3_Sub1.anInt226;
								local165 = Class2_Sub1_Sub3_Sub1.anInt227;
								Class2_Sub1_Sub3_Sub1.anInt226 = local88 + local83.anInt288 / 2;
								Class2_Sub1_Sub3_Sub1.anInt227 = local93 + local83.anInt302 / 2;
								local169 = Class2_Sub1_Sub3_Sub1.anIntArray51[local83.anInt295] * local83.anInt294 >> 16;
								local180 = Class2_Sub1_Sub3_Sub1.anIntArray52[local83.anInt295] * local83.anInt294 >> 16;
								@Pc(1088) boolean local1088 = this.method699(local83);
								if (local1088) {
									local213 = local83.anInt284;
								} else {
									local213 = local83.anInt283;
								}
								@Pc(1108) Class2_Sub1_Sub1_Sub6 local1108;
								if (local213 == -1) {
									local1108 = local83.method216(local1088, -1, -1);
								} else {
									@Pc(1114) Class22 local1114 = Class22.aClass22Array1[local213];
									local1108 = local83.method216(local1088, local1114.anIntArray93[local83.anInt291], local1114.anIntArray92[local83.anInt291]);
								}
								if (local1108 != null) {
									local1108.method406(local83.anInt296, 0, local83.anInt295, 0, local169, local180);
								}
								Class2_Sub1_Sub3_Sub1.anInt226 = local163;
								Class2_Sub1_Sub3_Sub1.anInt227 = local165;
							} else {
								if (local83.anInt310 == 7) {
									local687 = local83.aClass2_Sub1_Sub3_Sub2_1;
									local165 = 0;
									for (local169 = 0; local169 < local83.anInt302; local169++) {
										for (local180 = 0; local180 < local83.anInt288; local180++) {
											if (local83.anIntArray67[local165] > 0) {
												@Pc(1178) Class36 local1178 = Class36.method434(local83.anIntArray67[local165] - 1);
												@Pc(1182) String local1182 = String.valueOf(local1178.aString10);
												if (local1178.aBoolean144 || local83.anIntArray64[local165] != 1) {
													local1182 = local1182 + " x" + method664(local83.anIntArray64[local165], 888);
												}
												local215 = local88 + local180 * (local83.anInt303 + 115);
												local222 = local93 + local169 * (local83.anInt297 + 12);
												if (local83.aBoolean77) {
													local687.method301(local1182, local83.aBoolean76, local222, local83.anInt301, local215 + local83.anInt288 / 2);
												} else {
													local687.method308(local215, local222, local83.anInt301, local83.aBoolean76, local1182);
												}
											}
											local165++;
										}
									}
								}
								if (local83.anInt310 == 8 && (this.anInt1051 == local83.anInt293 || this.anInt909 == local83.anInt293 || this.anInt906 == local83.anInt293) && this.anInt842 == 100) {
									local163 = 0;
									local165 = 0;
									@Pc(1296) Class2_Sub1_Sub3_Sub2 local1296 = this.aClass2_Sub1_Sub3_Sub2_3;
									@Pc(1299) String local1299 = local83.aString7;
									while (local1299.length() > 0) {
										local213 = local1299.indexOf("\\n");
										if (local213 == -1) {
											local964 = local1299;
											local1299 = "";
										} else {
											local964 = local1299.substring(0, local213);
											local1299 = local1299.substring(local213 + 2);
										}
										local215 = local1296.method302(local964, (byte) 3);
										if (local215 > local163) {
											local163 = local215;
										}
										local165 += local1296.anInt417 + 1;
									}
									local163 += 6;
									local165 += 7;
									local213 = local88 + local83.anInt288 - local163 - 5;
									local215 = local93 + local83.anInt302 + 5;
									if (local213 < local88 + 5) {
										local213 = local88 + 5;
									}
									if (local213 + local163 > arg2 + arg3.anInt288) {
										local213 = arg2 + arg3.anInt288 - local163;
									}
									if (local215 + local165 > arg1 + arg3.anInt302) {
										local215 = arg1 + arg3.anInt302 - local165;
									}
									Class2_Sub1_Sub3.method357(local213, local163, local215, 16777120, local165);
									Class2_Sub1_Sub3.method358(local213, local215, local165, local163, 0, 149);
									local1299 = local83.aString7;
									local222 = local215 + local1296.anInt417 + 2;
									while (local1299.length() > 0) {
										local247 = local1299.indexOf("\\n");
										if (local247 == -1) {
											local964 = local1299;
											local1299 = "";
										} else {
											local964 = local1299.substring(0, local247);
											local1299 = local1299.substring(local247 + 2);
										}
										local1296.method308(local213 + 3, local222, 0, false, local964);
										local222 += local1296.anInt417 + 1;
									}
								}
							}
						}
					}
				}
				Class2_Sub1_Sub3.method354(local31, local29, local33, local35);
			}
		} catch (@Pc(1484) RuntimeException local1484) {
			signlink.reporterror("52235, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + local1484.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method635() {
		try {
			this.aClass2_Sub1_Sub3_Sub4_14 = new Class2_Sub1_Sub3_Sub4(this.aClass21_2, "titlebox", 0);
			this.aClass2_Sub1_Sub3_Sub4_15 = new Class2_Sub1_Sub3_Sub4(this.aClass21_2, "titlebutton", 0);
			this.aClass2_Sub1_Sub3_Sub4Array2 = new Class2_Sub1_Sub3_Sub4[12];
			for (@Pc(29) int local29 = 0; local29 < 12; local29++) {
				this.aClass2_Sub1_Sub3_Sub4Array2[local29] = new Class2_Sub1_Sub3_Sub4(this.aClass21_2, "runes", local29);
			}
			this.aClass2_Sub1_Sub3_Sub3_15 = new Class2_Sub1_Sub3_Sub3(128, 265);
			this.aClass2_Sub1_Sub3_Sub3_16 = new Class2_Sub1_Sub3_Sub3(128, 265);
			for (@Pc(62) int local62 = 0; local62 < 33920; local62++) {
				this.aClass2_Sub1_Sub3_Sub3_15.anIntArray103[local62] = this.aClass1_22.anIntArray1[local62];
			}
			for (@Pc(80) int local80 = 0; local80 < 33920; local80++) {
				this.aClass2_Sub1_Sub3_Sub3_16.anIntArray103[local80] = this.aClass1_23.anIntArray1[local80];
			}
			this.anIntArray274 = new int[256];
			for (@Pc(102) int local102 = 0; local102 < 64; local102++) {
				this.anIntArray274[local102] = local102 * 262144;
			}
			for (@Pc(117) int local117 = 0; local117 < 64; local117++) {
				this.anIntArray274[local117 + 64] = local117 * 1024 + 16711680;
			}
			for (@Pc(136) int local136 = 0; local136 < 64; local136++) {
				this.anIntArray274[local136 + 128] = local136 * 4 + 16776960;
			}
			for (@Pc(155) int local155 = 0; local155 < 64; local155++) {
				this.anIntArray274[local155 + 192] = 16777215;
			}
			this.anIntArray275 = new int[256];
			for (@Pc(174) int local174 = 0; local174 < 64; local174++) {
				this.anIntArray275[local174] = local174 * 1024;
			}
			for (@Pc(189) int local189 = 0; local189 < 64; local189++) {
				this.anIntArray275[local189 + 64] = local189 * 4 + 65280;
			}
			for (@Pc(208) int local208 = 0; local208 < 64; local208++) {
				this.anIntArray275[local208 + 128] = local208 * 262144 + 65535;
			}
			for (@Pc(227) int local227 = 0; local227 < 64; local227++) {
				this.anIntArray275[local227 + 192] = 16777215;
			}
			this.anIntArray276 = new int[256];
			for (@Pc(246) int local246 = 0; local246 < 64; local246++) {
				this.anIntArray276[local246] = local246 * 4;
			}
			for (@Pc(261) int local261 = 0; local261 < 64; local261++) {
				this.anIntArray276[local261 + 64] = local261 * 262144 + 255;
			}
			for (@Pc(280) int local280 = 0; local280 < 64; local280++) {
				this.anIntArray276[local280 + 128] = local280 * 1024 + 16711935;
			}
			for (@Pc(299) int local299 = 0; local299 < 64; local299++) {
				this.anIntArray276[local299 + 192] = 16777215;
			}
			this.anIntArray273 = new int[256];
			this.anIntArray253 = new int[32768];
			this.anIntArray254 = new int[32768];
			this.method618(null);
			this.anIntArray261 = new int[32768];
			this.anIntArray262 = new int[32768];
			this.method588(10, "Connecting to fileserver");
			if (!this.aBoolean221) {
				this.aBoolean199 = true;
				this.aBoolean221 = true;
				this.method587(this, 2);
			}
		} catch (@Pc(356) RuntimeException local356) {
			signlink.reporterror("74312, " + 5 + ", " + local356.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method636() {
		try {
			if (this.anInt861 == 0 && super.anInt835 == 1) {
				@Pc(23) int local23 = super.anInt836 - 25 - 550;
				@Pc(30) int local30 = super.anInt837 - 5 - 4;
				if (local23 >= 0 && local30 >= 0 && local23 < 146 && local30 < 151) {
					local23 -= 73;
					local30 -= 75;
					@Pc(50) int local50 = this.anInt928 + this.anInt1070 & 0x7FF;
					@Pc(54) int local54 = Class2_Sub1_Sub3_Sub1.anIntArray51[local50];
					@Pc(58) int local58 = Class2_Sub1_Sub3_Sub1.anIntArray52[local50];
					@Pc(67) int local67 = local54 * (this.anInt991 + 256) >> 8;
					@Pc(76) int local76 = local58 * (this.anInt991 + 256) >> 8;
					@Pc(86) int local86 = local30 * local67 + local23 * local76 >> 11;
					@Pc(96) int local96 = local30 * local76 - local23 * local67 >> 11;
					@Pc(103) int local103 = aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt778 + local86 >> 7;
					@Pc(110) int local110 = aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt779 - local96 >> 7;
					@Pc(131) boolean local131 = this.method604(0, 0, aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray209[0], aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray208[0], 0, local103, (byte) 9, 0, local110, 1, 0, true);
					if (local131) {
						this.aClass2_Sub1_Sub4_8.method482(local23);
						this.aClass2_Sub1_Sub4_8.method482(local30);
						this.aClass2_Sub1_Sub4_8.method483(this.anInt928);
						this.aClass2_Sub1_Sub4_8.method482(57);
						this.aClass2_Sub1_Sub4_8.method482(this.anInt1070);
						this.aClass2_Sub1_Sub4_8.method482(this.anInt991);
						this.aClass2_Sub1_Sub4_8.method482(89);
						this.aClass2_Sub1_Sub4_8.method483(aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt778);
						this.aClass2_Sub1_Sub4_8.method483(aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt779);
						this.aClass2_Sub1_Sub4_8.method482(this.anInt1032);
						this.aClass2_Sub1_Sub4_8.method482(63);
						return;
					}
				}
			}
		} catch (@Pc(185) RuntimeException local185) {
			signlink.reporterror("33890, " + -69 + ", " + local185.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) int[] local5 = this.aClass2_Sub1_Sub3_Sub3_17.anIntArray103;
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
						this.aClass20_1.method257(local5, local34, arg0, local36, local22);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local36][local22] & 0x8) != 0) {
						this.aClass20_1.method257(local5, local34, arg0 + 1, local36, local22);
					}
					local34 += 4;
				}
			}
			local34 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local36 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass2_Sub1_Sub3_Sub3_17.method329(this.aByte34);
			@Pc(147) int local147;
			for (@Pc(143) int local143 = 1; local143 < 103; local143++) {
				for (local147 = 1; local147 < 103; local147++) {
					if ((this.aByteArrayArrayArray8[arg0][local147][local143] & 0x18) == 0) {
						this.method676(local143, local34, local147, arg0, local36);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local147][local143] & 0x8) != 0) {
						this.method676(local143, local34, local147, arg0 + 1, local36);
					}
				}
			}
			if (this.aClass1_17 != null) {
				this.aClass1_17.method1(this.aByte34);
				Class2_Sub1_Sub3_Sub1.anIntArray53 = this.anIntArray240;
			}
			this.anInt1006 = 0;
			for (local147 = 0; local147 < 104; local147++) {
				for (@Pc(222) int local222 = 0; local222 < 104; local222++) {
					@Pc(232) int local232 = this.aClass20_1.method251(this.anInt953, local147, local222);
					if (local232 != 0) {
						local232 = local232 >> 14 & 0x7FFF;
						@Pc(244) int local244 = Class37.method451(local232).anInt579;
						if (local244 >= 0) {
							@Pc(248) int local248 = local147;
							@Pc(250) int local250 = local222;
							if (local244 != 22 && local244 != 29 && local244 != 34 && local244 != 36 && local244 != 46 && local244 != 47 && local244 != 48) {
								@Pc(282) int[][] local282 = this.aClass42Array1[this.anInt953].anIntArrayArray21;
								for (@Pc(284) int local284 = 0; local284 < 10; local284++) {
									@Pc(291) int local291 = (int) (Math.random() * 4.0D);
									if (local291 == 0 && local248 > 0 && local248 > local147 - 3 && (local282[local248 - 1][local250] & 0x1280108) == 0) {
										local248--;
									}
									if (local291 == 1 && local248 < 103 && local248 < local147 + 3 && (local282[local248 + 1][local250] & 0x1280180) == 0) {
										local248++;
									}
									if (local291 == 2 && local250 > 0 && local250 > local222 - 3 && (local282[local248][local250 - 1] & 0x1280102) == 0) {
										local250--;
									}
									if (local291 == 3 && local250 < 103 && local250 < local222 + 3 && (local282[local248][local250 + 1] & 0x1280120) == 0) {
										local250++;
									}
								}
							}
							this.aClass2_Sub1_Sub3_Sub3Array7[this.anInt1006] = this.aClass2_Sub1_Sub3_Sub3Array9[local244];
							this.anIntArray251[this.anInt1006] = local248;
							this.anIntArray252[this.anInt1006] = local250;
							this.anInt1006++;
						}
					}
				}
			}
			@Pc(423) boolean local423 = false;
		} catch (@Pc(425) RuntimeException local425) {
			signlink.reporterror("75711, " + arg0 + ", " + arg1 + ", " + local425.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method638(@OriginalArg(0) int arg0) {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt898);
			if (this.aClass14_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass14_Sub1_1.anInt191);
			}
			System.out.println("loop-cycle:" + anInt993);
			System.out.println("draw-cycle:" + anInt961);
			System.out.println("ptype:" + this.anInt866);
			@Pc(58) boolean local58 = true;
			System.out.println("psize:" + this.anInt865);
			if (this.aClass32_1 != null) {
				this.aClass32_1.method425(62);
			}
			super.aBoolean196 = true;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("80287, " + arg0 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)Ljava/awt/Component;")
	@Override
	protected Component method586(@OriginalArg(0) boolean arg0) {
		try {
			this.aBoolean217 &= arg0;
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("64111, " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method639() {
		try {
			if (this.aClass1_19 == null) {
				super.aClass1_2 = null;
				this.aClass1_18 = null;
				this.aClass1_16 = null;
				this.aClass1_15 = null;
				this.aClass1_17 = null;
				this.aClass1_12 = null;
				this.aClass1_13 = null;
				this.aClass1_14 = null;
				this.aClass1_22 = new Class1(265, -826, this.method586(aBoolean205), 128);
				Class2_Sub1_Sub3.method355();
				this.aClass1_23 = new Class1(265, -826, this.method586(aBoolean205), 128);
				Class2_Sub1_Sub3.method355();
				this.aClass1_19 = new Class1(171, -826, this.method586(aBoolean205), 509);
				Class2_Sub1_Sub3.method355();
				this.aClass1_20 = new Class1(132, -826, this.method586(aBoolean205), 360);
				Class2_Sub1_Sub3.method355();
				this.aClass1_21 = new Class1(200, -826, this.method586(aBoolean205), 360);
				Class2_Sub1_Sub3.method355();
				this.aClass1_24 = new Class1(238, -826, this.method586(aBoolean205), 202);
				Class2_Sub1_Sub3.method355();
				this.aClass1_25 = new Class1(238, -826, this.method586(aBoolean205), 203);
				Class2_Sub1_Sub3.method355();
				this.aClass1_26 = new Class1(94, -826, this.method586(aBoolean205), 74);
				Class2_Sub1_Sub3.method355();
				this.aClass1_27 = new Class1(94, -826, this.method586(aBoolean205), 75);
				Class2_Sub1_Sub3.method355();
				if (this.aClass21_2 != null) {
					this.method622(anInt1035);
					this.method635();
				}
				this.aBoolean209 = true;
			}
		} catch (@Pc(166) RuntimeException local166) {
			signlink.reporterror("49420, " + true + ", " + local166.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method640() {
		try {
			if (super.aClass1_2 == null) {
				this.method632();
				this.aClass1_19 = null;
				this.aClass1_20 = null;
				this.aClass1_21 = null;
				this.aClass1_22 = null;
				this.aClass1_23 = null;
				this.aClass1_24 = null;
				this.aClass1_25 = null;
				this.aClass1_26 = null;
				this.aClass1_27 = null;
				this.aClass1_18 = null;
				this.aClass1_16 = null;
				this.aClass1_15 = null;
				this.aClass1_17 = null;
				this.aClass1_12 = null;
				this.aClass1_13 = null;
				this.aClass1_14 = null;
				super.aClass1_2 = new Class1(503, -826, this.method586(aBoolean205), 765);
				this.aBoolean209 = true;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("98752, " + 1 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!IJNDWVIL;)Z")
	private boolean method641(@OriginalArg(1) Class19 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt307;
			if (this.anInt955 == 2) {
				if (local4 == 201) {
					this.aBoolean208 = true;
					this.anInt1015 = 0;
					this.aBoolean236 = true;
					this.aString29 = "";
					this.anInt903 = 1;
					this.aString28 = "Enter name of friend to add to list";
				}
				if (local4 == 202) {
					this.aBoolean208 = true;
					this.anInt1015 = 0;
					this.aBoolean236 = true;
					this.aString29 = "";
					this.anInt903 = 2;
					this.aString28 = "Enter name of friend to delete from list";
				}
			}
			if (local4 == 205) {
				this.anInt869 = 250;
				return true;
			}
			if (local4 == 501) {
				this.aBoolean208 = true;
				this.anInt1015 = 0;
				this.aBoolean236 = true;
				this.aString29 = "";
				this.anInt903 = 4;
				this.aString28 = "Enter name of player to add to list";
			}
			if (local4 == 502) {
				this.aBoolean208 = true;
				this.anInt1015 = 0;
				this.aBoolean236 = true;
				this.aString29 = "";
				this.anInt903 = 5;
				this.aString28 = "Enter name of player to delete from list";
			}
			@Pc(118) int local118;
			@Pc(122) int local122;
			@Pc(127) int local127;
			if (local4 >= 300 && local4 <= 313) {
				local118 = (local4 - 300) / 2;
				local122 = local4 & 0x1;
				local127 = this.anIntArray227[local118];
				if (local127 != -1) {
					while (true) {
						if (local122 == 0) {
							local127--;
							if (local127 < 0) {
								local127 = Class27.anInt481 - 1;
							}
						}
						if (local122 == 1) {
							local127++;
							if (local127 >= Class27.anInt481) {
								local127 = 0;
							}
						}
						if (!Class27.aClass27Array1[local127].aBoolean123 && Class27.aClass27Array1[local127].anInt482 == local118 + (this.aBoolean224 ? 0 : 7)) {
							this.anIntArray227[local118] = local127;
							this.aBoolean234 = true;
							break;
						}
					}
				}
			}
			if (local4 >= 314 && local4 <= 323) {
				local118 = (local4 - 314) / 2;
				local122 = local4 & 0x1;
				local127 = this.anIntArray228[local118];
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
				this.anIntArray228[local118] = local127;
				this.aBoolean234 = true;
			}
			if (local4 == 324 && !this.aBoolean224) {
				this.aBoolean224 = true;
				this.method601();
			}
			if (local4 == 325 && this.aBoolean224) {
				this.aBoolean224 = false;
				this.method601();
			}
			if (local4 == 326) {
				this.aClass2_Sub1_Sub4_8.method481(115);
				this.aClass2_Sub1_Sub4_8.method482(this.aBoolean224 ? 0 : 1);
				for (local118 = 0; local118 < 7; local118++) {
					this.aClass2_Sub1_Sub4_8.method482(this.anIntArray227[local118]);
				}
				for (local122 = 0; local122 < 5; local122++) {
					this.aClass2_Sub1_Sub4_8.method482(this.anIntArray228[local122]);
				}
				return true;
			}
			if (local4 == 620) {
				this.aBoolean230 = !this.aBoolean230;
			}
			if (local4 >= 601 && local4 <= 613) {
				this.method714();
				if (this.aString19.length() > 0) {
					this.aClass2_Sub1_Sub4_8.method481(114);
					this.aClass2_Sub1_Sub4_8.method488(Class7.method55(this.aString19), this.anInt863);
					this.aClass2_Sub1_Sub4_8.method482(local4 - 601);
					this.aClass2_Sub1_Sub4_8.method482(this.aBoolean230 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(356) RuntimeException local356) {
			signlink.reporterror("96285, " + 3 + ", " + arg0 + ", " + local356.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method642(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt1053 >= 2 || this.anInt995 != 0 || this.anInt913 != 0) {
				@Pc(31) String local31;
				if (this.anInt995 == 1 && this.anInt1053 < 2) {
					local31 = "Use " + this.aString25 + " with...";
				} else if (this.anInt913 == 1 && this.anInt1053 < 2) {
					local31 = this.aString20 + "...";
				} else {
					local31 = this.aStringArray10[this.anInt1053 - 1];
				}
				if (this.anInt1053 > 2) {
					local31 = local31 + "@whi@ / " + (this.anInt1053 - 2) + " more options";
				}
				this.aClass2_Sub1_Sub3_Sub2_4.method309(anInt993 / 1000, 15, 16777215, 4, local31);
				this.anInt865 += arg0;
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("96977, " + arg0 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method643() {
		try {
			try {
				@Pc(13) int local13 = aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt778 + this.anInt1004;
				@Pc(19) int local19 = aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt779 + this.anInt911;
				if (this.anInt934 - local13 < -500 || this.anInt934 - local13 > 500 || this.anInt935 - local19 < -500 || this.anInt935 - local19 > 500) {
					this.anInt934 = local13;
					this.anInt935 = local19;
				}
				if (this.anInt934 != local13) {
					this.anInt934 += (local13 - this.anInt934) / 16;
				}
				if (this.anInt935 != local19) {
					this.anInt935 += (local19 - this.anInt935) / 16;
				}
				if (super.anIntArray210[1] == 1) {
					this.anInt929 += (-this.anInt929 - 24) / 2;
				} else if (super.anIntArray210[2] == 1) {
					this.anInt929 += (24 - this.anInt929) / 2;
				} else {
					this.anInt929 /= 2;
				}
				if (super.anIntArray210[3] == 1) {
					this.anInt930 += (12 - this.anInt930) / 2;
				} else if (super.anIntArray210[4] == 1) {
					this.anInt930 += (-this.anInt930 - 12) / 2;
				} else {
					this.anInt930 /= 2;
				}
				this.anInt928 = this.anInt928 + this.anInt929 / 2 & 0x7FF;
				this.anInt927 += this.anInt930 / 2;
				if (this.anInt927 < 128) {
					this.anInt927 = 128;
				}
				if (this.anInt927 > 383) {
					this.anInt927 = 383;
				}
				@Pc(206) int local206 = this.anInt934 >> 7;
				@Pc(211) int local211 = this.anInt935 >> 7;
				@Pc(222) int local222 = this.method720(this.anInt934, this.anInt953, this.anInt935, this.anInt905);
				@Pc(224) int local224 = 0;
				@Pc(240) int local240;
				if (local206 > 3 && local211 > 3 && local206 < 100 && local211 < 100) {
					for (local240 = local206 - 4; local240 <= local206 + 4; local240++) {
						for (@Pc(246) int local246 = local211 - 4; local246 <= local211 + 4; local246++) {
							@Pc(251) int local251 = this.anInt953;
							if (local251 < 3 && (this.aByteArrayArrayArray8[1][local240][local246] & 0x2) == 2) {
								local251++;
							}
							@Pc(278) int local278 = local222 - this.anIntArrayArrayArray8[local251][local240][local246];
							if (local278 > local224) {
								local224 = local278;
							}
						}
					}
				}
				anInt1031++;
				if (anInt1031 > 1496) {
					anInt1031 = 0;
					this.aClass2_Sub1_Sub4_8.method481(253);
					this.aClass2_Sub1_Sub4_8.method482(0);
					local240 = this.aClass2_Sub1_Sub4_8.anInt672;
					this.aClass2_Sub1_Sub4_8.method483(33963);
					this.aClass2_Sub1_Sub4_8.method482(182);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass2_Sub1_Sub4_8.method483(51200);
					}
					this.aClass2_Sub1_Sub4_8.method482((int) (Math.random() * 256.0D));
					this.aClass2_Sub1_Sub4_8.method483((int) (Math.random() * 65536.0D));
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass2_Sub1_Sub4_8.method483(6721);
					}
					this.aClass2_Sub1_Sub4_8.method483((int) (Math.random() * 65536.0D));
					this.aClass2_Sub1_Sub4_8.method482(136);
					this.aClass2_Sub1_Sub4_8.method482(59);
					this.aClass2_Sub1_Sub4_8.method483(42501);
					this.aClass2_Sub1_Sub4_8.method491(this.aClass2_Sub1_Sub4_8.anInt672 - local240);
				}
				local240 = local224 * 192;
				if (local240 > 98048) {
					local240 = 98048;
				}
				if (local240 < 32768) {
					local240 = 32768;
				}
				if (local240 > this.anInt1061) {
					this.anInt1061 += (local240 - this.anInt1061) / 24;
				} else if (local240 < this.anInt1061) {
					this.anInt1061 += (local240 - this.anInt1061) / 80;
				}
			} catch (@Pc(432) Exception local432) {
				signlink.reporterror("glfc_ex " + aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt778 + "," + aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt779 + "," + this.anInt934 + "," + this.anInt935 + "," + this.anInt855 + "," + this.anInt856 + "," + this.anInt870 + "," + this.anInt871);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(482) RuntimeException local482) {
			signlink.reporterror("24138, " + 15 + ", " + local482.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!TKPFKOXP;ZI)V")
	private void method644(@OriginalArg(0) Class2_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(9) int local9 = 0; local9 < this.anInt965; local9++) {
				@Pc(16) int local16 = this.anIntArray244[local9];
				@Pc(21) Class2_Sub1_Sub1_Sub2_Sub2 local21 = this.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local16];
				@Pc(24) int local24 = arg0.method492();
				@Pc(36) int local36;
				if ((local24 & 0x20) != 0) {
					local21.anInt768 = arg0.method520();
					local36 = arg0.method497();
					local21.anInt772 = local36 >> 16;
					local21.anInt771 = anInt993 + (local36 & 0xFFFF);
					local21.anInt769 = 0;
					local21.anInt770 = 0;
					if (local21.anInt771 > anInt993) {
						local21.anInt769 = -1;
					}
					if (local21.anInt768 == 65535) {
						local21.anInt768 = -1;
					}
				}
				@Pc(85) int local85;
				if ((local24 & 0x2) != 0) {
					local36 = arg0.method521();
					if (local36 == 65535) {
						local36 = -1;
					}
					local85 = arg0.method511(435);
					if (local36 == local21.anInt791 && local36 != -1) {
						@Pc(97) int local97 = Class22.aClass22Array1[local36].anInt380;
						if (local97 == 1) {
							local21.anInt792 = 0;
							local21.anInt793 = 0;
							local21.anInt794 = local85;
							local21.anInt795 = 0;
						}
						if (local97 == 2) {
							local21.anInt795 = 0;
						}
					} else if (local36 == -1 || local21.anInt791 == -1 || Class22.aClass22Array1[local36].anInt374 >= Class22.aClass22Array1[local21.anInt791].anInt374) {
						local21.anInt791 = local36;
						local21.anInt792 = 0;
						local21.anInt793 = 0;
						local21.anInt794 = local85;
						local21.anInt795 = 0;
						local21.anInt796 = local21.anInt788;
					}
				}
				if ((local24 & 0x1) != 0) {
					local36 = arg0.method510(this.aByte37);
					local85 = arg0.method511(435);
					local21.method570(local36, anInt993, local85);
					local21.anInt783 = anInt993 + 300;
					local21.anInt784 = arg0.method492();
					local21.anInt785 = arg0.method492();
				}
				if ((local24 & 0x80) != 0) {
					local21.aString16 = arg0.method499();
					local21.anInt789 = 100;
				}
				if ((local24 & 0x10) != 0) {
					local21.anInt782 = arg0.method494();
					if (local21.anInt782 == 65535) {
						local21.anInt782 = -1;
					}
				}
				if ((local24 & 0x40) != 0) {
					local36 = arg0.method512();
					local85 = arg0.method512();
					local21.method570(local36, anInt993, local85);
					local21.anInt783 = anInt993 + 300;
					local21.anInt784 = arg0.method511(435);
					local21.anInt785 = arg0.method492();
				}
				if ((local24 & 0x4) != 0) {
					local21.aClass48_2 = Class48.method560(arg0.method519());
					local21.anInt786 = local21.aClass48_2.aByte25;
					local21.anInt781 = local21.aClass48_2.anInt744;
					local21.anInt773 = local21.aClass48_2.anInt751;
					local21.anInt774 = local21.aClass48_2.anInt759;
					local21.anInt775 = local21.aClass48_2.anInt758;
					local21.anInt776 = local21.aClass48_2.anInt746;
					local21.anInt804 = local21.aClass48_2.anInt747;
				}
				if ((local24 & 0x8) != 0) {
					local21.anInt801 = arg0.method521();
					local21.anInt802 = arg0.method521();
				}
			}
		} catch (@Pc(312) RuntimeException local312) {
			signlink.reporterror("48950, " + arg0 + ", " + false + ", " + arg1 + ", " + local312.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method645(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			for (@Pc(5) int local5 = 0; local5 < this.anInt957; local5++) {
				@Pc(12) int local12 = this.anIntArray242[local5];
				@Pc(17) Class2_Sub1_Sub1_Sub2_Sub2 local17 = this.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local12];
				if (local17 != null) {
					this.method646(local17.aClass48_2.aByte25, local17);
				}
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("32323, " + arg0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!AQPBLKMD;)V")
	private void method646(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub1_Sub2 arg1) {
		try {
			if (arg1.anInt778 < 128 || arg1.anInt779 < 128 || arg1.anInt778 >= 13184 || arg1.anInt779 >= 13184) {
				arg1.anInt791 = -1;
				arg1.anInt768 = -1;
				arg1.anInt810 = 0;
				arg1.anInt811 = 0;
				arg1.anInt778 = arg1.anIntArray208[0] * 128 + arg1.anInt786 * 64;
				arg1.anInt779 = arg1.anIntArray209[0] * 128 + arg1.anInt786 * 64;
				arg1.method566();
			}
			if (arg1 == aClass2_Sub1_Sub1_Sub2_Sub1_1 && (arg1.anInt778 < 1536 || arg1.anInt779 < 1536 || arg1.anInt778 >= 11776 || arg1.anInt779 >= 11776)) {
				arg1.anInt791 = -1;
				arg1.anInt768 = -1;
				arg1.anInt810 = 0;
				arg1.anInt811 = 0;
				arg1.anInt778 = arg1.anIntArray208[0] * 128 + arg1.anInt786 * 64;
				arg1.anInt779 = arg1.anIntArray209[0] * 128 + arg1.anInt786 * 64;
				arg1.method566();
			}
			if (arg1.anInt810 > anInt993) {
				this.method647(arg1);
			} else if (arg1.anInt811 >= anInt993) {
				this.method648(arg1);
			} else {
				this.method649(arg1);
			}
			this.method650(arg1);
			this.method651(arg1);
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("45905, " + -962 + ", " + arg0 + ", " + arg1 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!AQPBLKMD;B)V")
	private void method647(@OriginalArg(0) Class2_Sub1_Sub1_Sub2 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt810 - anInt993;
			@Pc(14) int local14 = arg0.anInt806 * 128 + arg0.anInt786 * 64;
			@Pc(24) int local24 = arg0.anInt808 * 128 + arg0.anInt786 * 64;
			arg0.anInt778 += (local14 - arg0.anInt778) / local4;
			arg0.anInt779 += (local24 - arg0.anInt779) / local4;
			arg0.anInt813 = 0;
			if (arg0.anInt812 == 0) {
				arg0.anInt814 = 1024;
			}
			if (arg0.anInt812 == 1) {
				arg0.anInt814 = 1536;
			}
			if (arg0.anInt812 == 2) {
				arg0.anInt814 = 0;
			}
			if (arg0.anInt812 == 3) {
				arg0.anInt814 = 512;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("96061, " + arg0 + ", " + 44 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!AQPBLKMD;I)V")
	private void method648(@OriginalArg(0) Class2_Sub1_Sub1_Sub2 arg0) {
		try {
			if (arg0.anInt811 == anInt993 || arg0.anInt791 == -1 || arg0.anInt794 != 0 || arg0.anInt793 + 1 > Class22.aClass22Array1[arg0.anInt791].method277(arg0.anInt792)) {
				@Pc(29) int local29 = arg0.anInt811 - arg0.anInt810;
				@Pc(34) int local34 = anInt993 - arg0.anInt810;
				@Pc(44) int local44 = arg0.anInt806 * 128 + arg0.anInt786 * 64;
				@Pc(54) int local54 = arg0.anInt808 * 128 + arg0.anInt786 * 64;
				@Pc(64) int local64 = arg0.anInt807 * 128 + arg0.anInt786 * 64;
				@Pc(74) int local74 = arg0.anInt809 * 128 + arg0.anInt786 * 64;
				arg0.anInt778 = (local44 * (local29 - local34) + local64 * local34) / local29;
				arg0.anInt779 = (local54 * (local29 - local34) + local74 * local34) / local29;
			}
			arg0.anInt813 = 0;
			if (arg0.anInt812 == 0) {
				arg0.anInt814 = 1024;
			}
			if (arg0.anInt812 == 1) {
				arg0.anInt814 = 1536;
			}
			if (arg0.anInt812 == 2) {
				arg0.anInt814 = 0;
			}
			if (arg0.anInt812 == 3) {
				arg0.anInt814 = 512;
			}
			arg0.anInt780 = arg0.anInt814;
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("68076, " + arg0 + ", " + -223 + ", " + local138.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!AQPBLKMD;Z)V")
	private void method649(@OriginalArg(0) Class2_Sub1_Sub1_Sub2 arg0) {
		try {
			arg0.anInt797 = arg0.anInt804;
			if (arg0.anInt788 == 0) {
				arg0.anInt813 = 0;
			} else {
				if (arg0.anInt791 != -1 && arg0.anInt794 == 0) {
					@Pc(24) Class22 local24 = Class22.aClass22Array1[arg0.anInt791];
					if (arg0.anInt796 > 0 && local24.anInt378 == 0) {
						arg0.anInt813++;
						return;
					}
					if (arg0.anInt796 <= 0 && local24.anInt379 == 0) {
						arg0.anInt813++;
						return;
					}
				}
				@Pc(53) int local53 = arg0.anInt778;
				@Pc(56) int local56 = arg0.anInt779;
				this.aBoolean217 &= true;
				@Pc(77) int local77 = arg0.anIntArray208[arg0.anInt788 - 1] * 128 + arg0.anInt786 * 64;
				@Pc(92) int local92 = arg0.anIntArray209[arg0.anInt788 - 1] * 128 + arg0.anInt786 * 64;
				if (local77 - local53 <= 256 && local77 - local53 >= -256 && local92 - local56 <= 256 && local92 - local56 >= -256) {
					if (local53 < local77) {
						if (local56 < local92) {
							arg0.anInt814 = 1280;
						} else if (local56 > local92) {
							arg0.anInt814 = 1792;
						} else {
							arg0.anInt814 = 1536;
						}
					} else if (local53 > local77) {
						if (local56 < local92) {
							arg0.anInt814 = 768;
						} else if (local56 > local92) {
							arg0.anInt814 = 256;
						} else {
							arg0.anInt814 = 512;
						}
					} else if (local56 < local92) {
						arg0.anInt814 = 1024;
					} else {
						arg0.anInt814 = 0;
					}
					@Pc(186) int local186 = arg0.anInt814 - arg0.anInt780 & 0x7FF;
					if (local186 > 1024) {
						local186 -= 2048;
					}
					@Pc(193) int local193 = arg0.anInt774;
					if (local186 >= -256 && local186 <= 256) {
						local193 = arg0.anInt773;
					} else if (local186 >= 256 && local186 < 768) {
						local193 = arg0.anInt776;
					} else if (local186 >= -768 && local186 <= -256) {
						local193 = arg0.anInt775;
					}
					if (local193 == -1) {
						local193 = arg0.anInt773;
					}
					arg0.anInt797 = local193;
					@Pc(235) int local235 = 4;
					if (arg0.anInt780 != arg0.anInt814 && arg0.anInt782 == -1 && arg0.anInt781 != 0) {
						local235 = 2;
					}
					if (arg0.anInt788 > 2) {
						local235 = 6;
					}
					if (arg0.anInt788 > 3) {
						local235 = 8;
					}
					if (arg0.anInt813 > 0 && arg0.anInt788 > 1) {
						local235 = 8;
						arg0.anInt813--;
					}
					if (arg0.aBooleanArray10[arg0.anInt788 - 1]) {
						local235 <<= 0x1;
					}
					if (local235 >= 8 && arg0.anInt797 == arg0.anInt773 && arg0.anInt803 != -1) {
						arg0.anInt797 = arg0.anInt803;
					}
					if (local53 < local77) {
						arg0.anInt778 += local235;
						if (arg0.anInt778 > local77) {
							arg0.anInt778 = local77;
						}
					} else if (local53 > local77) {
						arg0.anInt778 -= local235;
						if (arg0.anInt778 < local77) {
							arg0.anInt778 = local77;
						}
					}
					if (local56 < local92) {
						arg0.anInt779 += local235;
						if (arg0.anInt779 > local92) {
							arg0.anInt779 = local92;
						}
					} else if (local56 > local92) {
						arg0.anInt779 -= local235;
						if (arg0.anInt779 < local92) {
							arg0.anInt779 = local92;
						}
					}
					if (arg0.anInt778 == local77 && arg0.anInt779 == local92) {
						arg0.anInt788--;
						if (arg0.anInt796 > 0) {
							arg0.anInt796--;
							return;
						}
					}
				} else {
					arg0.anInt778 = local77;
					arg0.anInt779 = local92;
				}
			}
		} catch (@Pc(397) RuntimeException local397) {
			signlink.reporterror("92020, " + arg0 + ", " + true + ", " + local397.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!AQPBLKMD;)V")
	private void method650(@OriginalArg(1) Class2_Sub1_Sub1_Sub2 arg0) {
		try {
			if (this.aByte30 != 3) {
				this.aClass2_Sub1_Sub4_8.method482(99);
			}
			if (arg0.anInt781 != 0) {
				@Pc(35) int local35;
				@Pc(41) int local41;
				if (arg0.anInt782 != -1 && arg0.anInt782 < 32768) {
					@Pc(27) Class2_Sub1_Sub1_Sub2_Sub2 local27 = this.aClass2_Sub1_Sub1_Sub2_Sub2Array1[arg0.anInt782];
					if (local27 != null) {
						local35 = arg0.anInt778 - local27.anInt778;
						local41 = arg0.anInt779 - local27.anInt779;
						if (local35 != 0 || local41 != 0) {
							arg0.anInt814 = (int) (Math.atan2((double) local35, (double) local41) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(66) int local66;
				if (arg0.anInt782 >= 32768) {
					local66 = arg0.anInt782 - 32768;
					if (local66 == this.anInt999) {
						local66 = this.anInt963;
					}
					@Pc(78) Class2_Sub1_Sub1_Sub2_Sub1 local78 = this.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local66];
					if (local78 != null) {
						local41 = arg0.anInt778 - local78.anInt778;
						@Pc(92) int local92 = arg0.anInt779 - local78.anInt779;
						if (local41 != 0 || local92 != 0) {
							arg0.anInt814 = (int) (Math.atan2((double) local41, (double) local92) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt801 != 0 || arg0.anInt802 != 0) && (arg0.anInt788 == 0 || arg0.anInt813 > 0)) {
					local66 = arg0.anInt778 - (arg0.anInt801 - this.anInt870 - this.anInt870) * 64;
					local35 = arg0.anInt779 - (arg0.anInt802 - this.anInt871 - this.anInt871) * 64;
					if (local66 != 0 || local35 != 0) {
						arg0.anInt814 = (int) (Math.atan2((double) local66, (double) local35) * 325.949D) & 0x7FF;
					}
					arg0.anInt801 = 0;
					arg0.anInt802 = 0;
				}
				local66 = arg0.anInt814 - arg0.anInt780 & 0x7FF;
				if (local66 != 0) {
					if (local66 < arg0.anInt781 || local66 > 2048 - arg0.anInt781) {
						arg0.anInt780 = arg0.anInt814;
					} else if (local66 > 1024) {
						arg0.anInt780 -= arg0.anInt781;
					} else {
						arg0.anInt780 += arg0.anInt781;
					}
					arg0.anInt780 &= 0x7FF;
					if (arg0.anInt797 == arg0.anInt804 && arg0.anInt780 != arg0.anInt814) {
						if (arg0.anInt805 != -1) {
							arg0.anInt797 = arg0.anInt805;
							return;
						}
						arg0.anInt797 = arg0.anInt773;
						return;
					}
				}
			}
		} catch (@Pc(246) RuntimeException local246) {
			signlink.reporterror("85561, " + 3 + ", " + arg0 + ", " + local246.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!AQPBLKMD;)V")
	private void method651(@OriginalArg(1) Class2_Sub1_Sub1_Sub2 arg0) {
		try {
			arg0.aBoolean194 = false;
			@Pc(19) Class22 local19;
			if (arg0.anInt797 != -1) {
				local19 = Class22.aClass22Array1[arg0.anInt797];
				arg0.anInt799++;
				if (arg0.anInt798 < local19.anInt372 && arg0.anInt799 > local19.method277(arg0.anInt798)) {
					arg0.anInt799 = 0;
					arg0.anInt798++;
				}
				if (arg0.anInt798 >= local19.anInt372) {
					arg0.anInt799 = 0;
					arg0.anInt798 = 0;
				}
			}
			if (arg0.anInt768 != -1 && anInt993 >= arg0.anInt771) {
				if (arg0.anInt769 < 0) {
					arg0.anInt769 = 0;
				}
				local19 = Class16.aClass16Array1[arg0.anInt768].aClass22_2;
				arg0.anInt770++;
				while (arg0.anInt769 < local19.anInt372 && arg0.anInt770 > local19.method277(arg0.anInt769)) {
					arg0.anInt770 -= local19.method277(arg0.anInt769);
					arg0.anInt769++;
				}
				if (arg0.anInt769 >= local19.anInt372 && (arg0.anInt769 < 0 || arg0.anInt769 >= local19.anInt372)) {
					arg0.anInt768 = -1;
				}
			}
			if (arg0.anInt791 != -1 && arg0.anInt794 <= 1) {
				local19 = Class22.aClass22Array1[arg0.anInt791];
				if (local19.anInt378 == 1 && arg0.anInt796 > 0 && arg0.anInt810 <= anInt993 && arg0.anInt811 < anInt993) {
					arg0.anInt794 = 1;
					return;
				}
			}
			if (arg0.anInt791 != -1 && arg0.anInt794 == 0) {
				local19 = Class22.aClass22Array1[arg0.anInt791];
				arg0.anInt793++;
				while (arg0.anInt792 < local19.anInt372 && arg0.anInt793 > local19.method277(arg0.anInt792)) {
					arg0.anInt793 -= local19.method277(arg0.anInt792);
					arg0.anInt792++;
				}
				if (arg0.anInt792 >= local19.anInt372) {
					arg0.anInt792 -= local19.anInt373;
					arg0.anInt795++;
					if (arg0.anInt795 >= local19.anInt377) {
						arg0.anInt791 = -1;
					}
					if (arg0.anInt792 < 0 || arg0.anInt792 >= local19.anInt372) {
						arg0.anInt791 = -1;
					}
				}
				arg0.aBoolean194 = local19.aBoolean89;
			}
			if (arg0.anInt794 > 0) {
				arg0.anInt794--;
			}
		} catch (@Pc(264) RuntimeException local264) {
			signlink.reporterror("34793, " + 0 + ", " + arg0 + ", " + local264.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method652() {
		try {
			if (this.anInt879 == -1 || this.anInt887 != 2 && super.aClass1_2 == null) {
				if (this.aBoolean209) {
					this.method693();
					this.aBoolean209 = false;
					this.aClass1_3.method2(4, 0, super.aGraphics2);
					this.aClass1_4.method2(357, 0, super.aGraphics2);
					this.aClass1_5.method2(4, 722, super.aGraphics2);
					this.aClass1_6.method2(205, 743, super.aGraphics2);
					this.aClass1_7.method2(0, 0, super.aGraphics2);
					this.aClass1_8.method2(4, 516, super.aGraphics2);
					this.aClass1_9.method2(205, 516, super.aGraphics2);
					this.aClass1_10.method2(357, 496, super.aGraphics2);
					this.aClass1_11.method2(338, 0, super.aGraphics2);
					this.aBoolean214 = true;
					this.aBoolean208 = true;
					this.aBoolean206 = true;
					this.aBoolean232 = true;
					if (this.anInt887 != 2) {
						this.aClass1_17.method2(4, 4, super.aGraphics2);
						this.aClass1_16.method2(4, 550, super.aGraphics2);
					}
				}
				if (this.anInt887 == 2) {
					this.method706((byte) 2);
				}
				if (this.aBoolean233 && this.anInt880 == 1) {
					this.aBoolean214 = true;
				}
				@Pc(279) boolean local279;
				if (this.anInt966 != -1) {
					local279 = this.method677(this.anInt901, (byte) 8, this.anInt966);
					if (local279) {
						this.aBoolean214 = true;
					}
				}
				if (this.anInt977 == 2) {
					this.aBoolean214 = true;
				}
				if (this.anInt986 == 2) {
					this.aBoolean214 = true;
				}
				if (this.aBoolean214) {
					this.method602();
					this.aBoolean214 = false;
				}
				@Pc(364) int local364;
				if (this.anInt980 == -1 && this.anInt1015 == 0) {
					this.aClass19_1.anInt289 = this.anInt917 - this.anInt1012 - 77;
					if (super.anInt830 > 448 && super.anInt830 < 560 && super.anInt831 > 332) {
						this.method690(77, 0, this.anInt917, super.anInt831 - 357, -1, super.anInt830 - 17, 463, this.aClass19_1);
					}
					local364 = this.anInt917 - this.aClass19_1.anInt289 - 77;
					if (local364 < 0) {
						local364 = 0;
					}
					if (local364 > this.anInt917 - 77) {
						local364 = this.anInt917 - 77;
					}
					if (this.anInt1012 != local364) {
						this.anInt1012 = local364;
						this.aBoolean208 = true;
					}
				}
				if (this.anInt980 == -1 && this.anInt1015 == 3) {
					local364 = this.anInt1041 * 14 + 7;
					this.aClass19_1.anInt289 = this.anInt1042;
					if (super.anInt830 > 448 && super.anInt830 < 560 && super.anInt831 > 332) {
						this.method690(77, 0, local364, super.anInt831 - 357, -1, super.anInt830 - 17, 463, this.aClass19_1);
					}
					@Pc(443) int local443 = this.aClass19_1.anInt289;
					if (local443 < 0) {
						local443 = 0;
					}
					if (local443 > local364 - 77) {
						local443 = local364 - 77;
					}
					if (this.anInt1042 != local443) {
						this.anInt1042 = local443;
						this.aBoolean208 = true;
					}
				}
				if (this.anInt980 != -1) {
					local279 = this.method677(this.anInt901, (byte) 8, this.anInt980);
					if (local279) {
						this.aBoolean208 = true;
					}
				}
				if (this.anInt977 == 3) {
					this.aBoolean208 = true;
				}
				if (this.anInt986 == 3) {
					this.aBoolean208 = true;
				}
				if (this.aString27 != null) {
					this.aBoolean208 = true;
				}
				if (this.aBoolean233 && this.anInt880 == 2) {
					this.aBoolean208 = true;
				}
				if (this.aBoolean208) {
					this.method606();
					this.aBoolean208 = false;
				}
				if (this.anInt887 == 2) {
					this.method697();
					this.aClass1_16.method2(4, 550, super.aGraphics2);
					anInt841++;
					if (anInt841 > 69) {
						anInt841 = 0;
						this.aClass2_Sub1_Sub4_8.method481(167);
					}
				}
				if (this.anInt1022 != -1) {
					this.aBoolean206 = true;
				}
				if (this.aBoolean206) {
					if (this.anInt1022 != -1 && this.anInt1022 == this.anInt891) {
						this.anInt1022 = -1;
						this.aClass2_Sub1_Sub4_8.method481(178);
						this.aClass2_Sub1_Sub4_8.method482(this.anInt891);
					}
					this.aBoolean206 = false;
					this.aClass1_14.method1(this.aByte34);
					this.aClass2_Sub1_Sub3_Sub4_8.method369(0, this.anInt908, 0);
					if (this.anInt966 == -1) {
						if (this.anIntArray226[this.anInt891] != -1) {
							if (this.anInt891 == 0) {
								this.aClass2_Sub1_Sub3_Sub4_1.method369(10, this.anInt908, 22);
							}
							if (this.anInt891 == 1) {
								this.aClass2_Sub1_Sub3_Sub4_2.method369(8, this.anInt908, 54);
							}
							if (this.anInt891 == 2) {
								this.aClass2_Sub1_Sub3_Sub4_2.method369(8, this.anInt908, 82);
							}
							if (this.anInt891 == 3) {
								this.aClass2_Sub1_Sub3_Sub4_3.method369(8, this.anInt908, 110);
							}
							if (this.anInt891 == 4) {
								this.aClass2_Sub1_Sub3_Sub4_5.method369(8, this.anInt908, 153);
							}
							if (this.anInt891 == 5) {
								this.aClass2_Sub1_Sub3_Sub4_5.method369(8, this.anInt908, 181);
							}
							if (this.anInt891 == 6) {
								this.aClass2_Sub1_Sub3_Sub4_4.method369(9, this.anInt908, 209);
							}
						}
						if (this.anIntArray226[0] != -1 && (this.anInt1022 != 0 || anInt993 % 20 < 10)) {
							this.aClass2_Sub1_Sub3_Sub4Array5[0].method369(13, this.anInt908, 29);
						}
						if (this.anIntArray226[1] != -1 && (this.anInt1022 != 1 || anInt993 % 20 < 10)) {
							this.aClass2_Sub1_Sub3_Sub4Array5[1].method369(11, this.anInt908, 53);
						}
						if (this.anIntArray226[2] != -1 && (this.anInt1022 != 2 || anInt993 % 20 < 10)) {
							this.aClass2_Sub1_Sub3_Sub4Array5[2].method369(11, this.anInt908, 82);
						}
						if (this.anIntArray226[3] != -1 && (this.anInt1022 != 3 || anInt993 % 20 < 10)) {
							this.aClass2_Sub1_Sub3_Sub4Array5[3].method369(12, this.anInt908, 115);
						}
						if (this.anIntArray226[4] != -1 && (this.anInt1022 != 4 || anInt993 % 20 < 10)) {
							this.aClass2_Sub1_Sub3_Sub4Array5[4].method369(13, this.anInt908, 153);
						}
						if (this.anIntArray226[5] != -1 && (this.anInt1022 != 5 || anInt993 % 20 < 10)) {
							this.aClass2_Sub1_Sub3_Sub4Array5[5].method369(11, this.anInt908, 180);
						}
						if (this.anIntArray226[6] != -1 && (this.anInt1022 != 6 || anInt993 % 20 < 10)) {
							this.aClass2_Sub1_Sub3_Sub4Array5[6].method369(13, this.anInt908, 208);
						}
					}
					this.aClass1_14.method2(160, 516, super.aGraphics2);
					this.aClass1_13.method1(this.aByte34);
					this.aClass2_Sub1_Sub3_Sub4_7.method369(0, this.anInt908, 0);
					if (this.anInt966 == -1) {
						if (this.anIntArray226[this.anInt891] != -1) {
							if (this.anInt891 == 7) {
								this.aClass2_Sub1_Sub3_Sub4_9.method369(0, this.anInt908, 42);
							}
							if (this.anInt891 == 8) {
								this.aClass2_Sub1_Sub3_Sub4_10.method369(0, this.anInt908, 74);
							}
							if (this.anInt891 == 9) {
								this.aClass2_Sub1_Sub3_Sub4_10.method369(0, this.anInt908, 102);
							}
							if (this.anInt891 == 10) {
								this.aClass2_Sub1_Sub3_Sub4_11.method369(1, this.anInt908, 130);
							}
							if (this.anInt891 == 11) {
								this.aClass2_Sub1_Sub3_Sub4_13.method369(0, this.anInt908, 173);
							}
							if (this.anInt891 == 12) {
								this.aClass2_Sub1_Sub3_Sub4_13.method369(0, this.anInt908, 201);
							}
							if (this.anInt891 == 13) {
								this.aClass2_Sub1_Sub3_Sub4_12.method369(0, this.anInt908, 229);
							}
						}
						if (this.anIntArray226[8] != -1 && (this.anInt1022 != 8 || anInt993 % 20 < 10)) {
							this.aClass2_Sub1_Sub3_Sub4Array5[7].method369(2, this.anInt908, 74);
						}
						if (this.anIntArray226[9] != -1 && (this.anInt1022 != 9 || anInt993 % 20 < 10)) {
							this.aClass2_Sub1_Sub3_Sub4Array5[8].method369(3, this.anInt908, 102);
						}
						if (this.anIntArray226[10] != -1 && (this.anInt1022 != 10 || anInt993 % 20 < 10)) {
							this.aClass2_Sub1_Sub3_Sub4Array5[9].method369(4, this.anInt908, 137);
						}
						if (this.anIntArray226[11] != -1 && (this.anInt1022 != 11 || anInt993 % 20 < 10)) {
							this.aClass2_Sub1_Sub3_Sub4Array5[10].method369(2, this.anInt908, 174);
						}
						if (this.anIntArray226[12] != -1 && (this.anInt1022 != 12 || anInt993 % 20 < 10)) {
							this.aClass2_Sub1_Sub3_Sub4Array5[11].method369(2, this.anInt908, 201);
						}
						if (this.anIntArray226[13] != -1 && (this.anInt1022 != 13 || anInt993 % 20 < 10)) {
							this.aClass2_Sub1_Sub3_Sub4Array5[12].method369(2, this.anInt908, 226);
						}
					}
					this.aClass1_13.method2(466, 496, super.aGraphics2);
					this.aClass1_17.method1(this.aByte34);
					Class2_Sub1_Sub3_Sub1.anIntArray53 = this.anIntArray240;
				}
				if (this.aBoolean232) {
					this.aBoolean232 = false;
					this.aClass1_12.method1(this.aByte34);
					this.aClass2_Sub1_Sub3_Sub4_6.method369(0, this.anInt908, 0);
					this.aClass2_Sub1_Sub3_Sub2_3.method301("Public chat", true, 28, 16777215, 55);
					if (this.anInt1033 == 0) {
						this.aClass2_Sub1_Sub3_Sub2_3.method301("On", true, 41, 65280, 55);
					}
					if (this.anInt1033 == 1) {
						this.aClass2_Sub1_Sub3_Sub2_3.method301("Friends", true, 41, 16776960, 55);
					}
					if (this.anInt1033 == 2) {
						this.aClass2_Sub1_Sub3_Sub2_3.method301("Off", true, 41, 16711680, 55);
					}
					if (this.anInt1033 == 3) {
						this.aClass2_Sub1_Sub3_Sub2_3.method301("Hide", true, 41, 65535, 55);
					}
					this.aClass2_Sub1_Sub3_Sub2_3.method301("Private chat", true, 28, 16777215, 184);
					if (this.anInt923 == 0) {
						this.aClass2_Sub1_Sub3_Sub2_3.method301("On", true, 41, 65280, 184);
					}
					if (this.anInt923 == 1) {
						this.aClass2_Sub1_Sub3_Sub2_3.method301("Friends", true, 41, 16776960, 184);
					}
					if (this.anInt923 == 2) {
						this.aClass2_Sub1_Sub3_Sub2_3.method301("Off", true, 41, 16711680, 184);
					}
					this.aClass2_Sub1_Sub3_Sub2_3.method301("Trade/compete", true, 28, 16777215, 324);
					if (this.anInt1010 == 0) {
						this.aClass2_Sub1_Sub3_Sub2_3.method301("On", true, 41, 65280, 324);
					}
					if (this.anInt1010 == 1) {
						this.aClass2_Sub1_Sub3_Sub2_3.method301("Friends", true, 41, 16776960, 324);
					}
					if (this.anInt1010 == 2) {
						this.aClass2_Sub1_Sub3_Sub2_3.method301("Off", true, 41, 16711680, 324);
					}
					this.aClass2_Sub1_Sub3_Sub2_3.method301("Report abuse", true, 33, 16777215, 458);
					this.aClass1_12.method2(453, 0, super.aGraphics2);
					this.aClass1_17.method1(this.aByte34);
					Class2_Sub1_Sub3_Sub1.anIntArray53 = this.anIntArray240;
				}
				this.anInt901 = 0;
			} else {
				if (this.anInt887 == 2) {
					this.method677(this.anInt901, (byte) 8, this.anInt879);
					if (this.anInt895 != -1) {
						this.method677(this.anInt901, (byte) 8, this.anInt895);
					}
					this.anInt901 = 0;
					this.method640();
					super.aClass1_2.method1(this.aByte34);
					Class2_Sub1_Sub3_Sub1.anIntArray53 = this.anIntArray241;
					Class2_Sub1_Sub3.method355();
					this.aBoolean209 = true;
					@Pc(57) Class19 local57 = Class19.method213(this.anInt879);
					if (local57.anInt288 == 512 && local57.anInt302 == 334 && local57.anInt310 == 0) {
						local57.anInt288 = 765;
						local57.anInt302 = 503;
					}
					this.method634(0, 0, 0, local57);
					if (this.anInt895 != -1) {
						local57 = Class19.method213(this.anInt895);
						if (local57.anInt288 == 512 && local57.anInt302 == 334 && local57.anInt310 == 0) {
							local57.anInt288 = 765;
							local57.anInt302 = 503;
						}
						this.method634(0, 0, 0, local57);
					}
					if (this.aBoolean233) {
						this.method605();
					} else {
						this.method633();
						this.method642(this.anInt902);
					}
				}
				super.aClass1_2.method2(0, 0, super.aGraphics2);
			}
		} catch (@Pc(1328) RuntimeException local1328) {
			signlink.reporterror("36445, " + -340 + ", " + local1328.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method653(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			if (this.anInt938 == 2) {
				this.method718((this.anInt850 - this.anInt870 << 7) + this.anInt853, (this.anInt851 - this.anInt871 << 7) + this.anInt854, this.anInt852 * 2);
				if (this.anInt959 > -1 && anInt993 % 20 < 10) {
					this.aClass2_Sub1_Sub3_Sub3Array5[0].method334(this.anInt960 - 28, this.anInt908, this.anInt959 - 12);
				}
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("21908, " + arg0 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method584() {
		try {
			if (this.aBoolean213 || this.aBoolean229 || this.aBoolean200) {
				this.method625();
			} else {
				anInt961++;
				this.anInt865 += 0;
				if (this.aBoolean217) {
					this.method652();
				} else {
					this.method710(false);
				}
				this.anInt931 = 0;
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("64702, " + 0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!TKPFKOXP;II)V")
	private void method655(@OriginalArg(0) Class2_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) int local5 = arg1 + 0;
			@Pc(10) int local10 = arg0.method503(8);
			@Pc(16) int local16;
			if (local10 < this.anInt964) {
				for (local16 = local10; local16 < this.anInt964; local16++) {
					this.anIntArray258[this.anInt1018++] = this.anIntArray243[local16];
				}
			}
			if (local10 > this.anInt964) {
				signlink.reporterror(this.aString21 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt964 = 0;
			for (local16 = 0; local16 < local10; local16++) {
				@Pc(68) int local68 = this.anIntArray243[local16];
				@Pc(73) Class2_Sub1_Sub1_Sub2_Sub1 local73 = this.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local68];
				@Pc(78) int local78 = arg0.method503(1);
				if (local78 == 0) {
					this.anIntArray243[this.anInt964++] = local68;
					local73.anInt777 = anInt993;
				} else {
					@Pc(101) int local101 = arg0.method503(2);
					if (local101 == 0) {
						this.anIntArray243[this.anInt964++] = local68;
						local73.anInt777 = anInt993;
						this.anIntArray244[this.anInt965++] = local68;
					} else {
						@Pc(152) int local152;
						@Pc(162) int local162;
						if (local101 == 1) {
							this.anIntArray243[this.anInt964++] = local68;
							local73.anInt777 = anInt993;
							local152 = arg0.method503(3);
							local73.method569(local152, false);
							local162 = arg0.method503(1);
							if (local162 == 1) {
								this.anIntArray244[this.anInt965++] = local68;
							}
						} else if (local101 == 2) {
							this.anIntArray243[this.anInt964++] = local68;
							local73.anInt777 = anInt993;
							local152 = arg0.method503(3);
							local73.method569(local152, true);
							local162 = arg0.method503(3);
							local73.method569(local162, true);
							@Pc(220) int local220 = arg0.method503(1);
							if (local220 == 1) {
								this.anIntArray244[this.anInt965++] = local68;
							}
						} else if (local101 == 3) {
							this.anIntArray258[this.anInt1018++] = local68;
						}
					}
				}
			}
		} catch (@Pc(257) RuntimeException local257) {
			signlink.reporterror("35377, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local257.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
	private void method656(@OriginalArg(1) int arg0) {
		try {
			if (!aBoolean227) {
				for (@Pc(8) int local8 = 0; local8 < this.anIntArray260.length; local8++) {
					@Pc(15) int local15 = this.anIntArray260[local8];
					if (Class2_Sub1_Sub3_Sub1.anIntArray55[local15] >= arg0) {
						@Pc(24) Class2_Sub1_Sub3_Sub4 local24 = Class2_Sub1_Sub3_Sub1.aClass2_Sub1_Sub3_Sub4Array1[local15];
						@Pc(32) int local32 = local24.anInt474 * local24.anInt475 - 1;
						@Pc(40) int local40 = local24.anInt474 * this.anInt901 * 2;
						@Pc(43) byte[] local43 = local24.aByteArray12;
						@Pc(46) byte[] local46 = this.aByteArray21;
						for (@Pc(48) int local48 = 0; local48 <= local32; local48++) {
							local46[local48] = local43[local48 - local40 & local32];
						}
						local24.aByteArray12 = local46;
						this.aByteArray21 = local43;
						Class2_Sub1_Sub3_Sub1.method139(local15);
					}
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("56914, " + 888 + ", " + arg0 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aClass2_Sub1_Sub3_Sub4_19.method369(arg3, this.anInt908, arg4);
			if (this.anInt1048 <= 2 && this.anInt1048 >= 2) {
				this.aClass2_Sub1_Sub3_Sub4_20.method369(arg3 + arg0 - 16, this.anInt908, arg4);
				Class2_Sub1_Sub3.method357(arg4, 16, arg3 + 16, this.anInt1069, arg0 - 32);
				@Pc(46) int local46 = (arg0 - 32) * arg0 / arg2;
				if (local46 < 8) {
					local46 = 8;
				}
				@Pc(63) int local63 = (arg0 - local46 - 32) * arg1 / (arg2 - arg0);
				Class2_Sub1_Sub3.method357(arg4, 16, arg3 + local63 + 16, this.anInt889, local46);
				Class2_Sub1_Sub3.method362(local46, arg3 + local63 + 16, arg4, this.anInt864);
				Class2_Sub1_Sub3.method362(local46, arg3 + local63 + 16, arg4 + 1, this.anInt864);
				Class2_Sub1_Sub3.method360(16, arg4, arg3 + local63 + 16, this.anInt864, (byte) 3);
				Class2_Sub1_Sub3.method360(16, arg4, arg3 + local63 + 17, this.anInt864, (byte) 3);
				Class2_Sub1_Sub3.method362(local46, arg3 + local63 + 16, arg4 + 15, this.anInt860);
				Class2_Sub1_Sub3.method362(local46 - 1, arg3 + 17 + local63, arg4 + 14, this.anInt860);
				Class2_Sub1_Sub3.method360(16, arg4, arg3 + local63 + local46 + 15, this.anInt860, (byte) 3);
				Class2_Sub1_Sub3.method360(15, arg4 + 1, arg3 + 14 + local63 + local46, this.anInt860, (byte) 3);
			}
		} catch (@Pc(179) RuntimeException local179) {
			signlink.reporterror("90863, " + arg0 + ", " + arg1 + ", " + 2 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local179.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method658() {
		try {
			for (@Pc(14) Class2_Sub2 local14 = (Class2_Sub2) this.aClass38_10.method461(); local14 != null; local14 = (Class2_Sub2) this.aClass38_10.method463()) {
				if (local14.anInt72 == -1) {
					local14.anInt76 = 0;
					this.method617(local14);
				} else {
					local14.method562();
				}
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("37406, " + 1 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method659() {
		try {
			while (true) {
				@Pc(10) int local10 = this.method580((byte) 8);
				if (local10 == -1) {
					return;
				}
				if (this.anInt947 != -1 && this.anInt947 == this.anInt983) {
					if (local10 == 8 && this.aString19.length() > 0) {
						this.aString19 = this.aString19.substring(0, this.aString19.length() - 1);
					}
					if ((local10 >= 97 && local10 <= 122 || local10 >= 65 && local10 <= 90 || local10 >= 48 && local10 <= 57 || local10 == 32) && this.aString19.length() < 12) {
						this.aString19 = this.aString19 + (char) local10;
					}
				} else {
					@Pc(190) int local190;
					if (this.aBoolean236) {
						if (local10 >= 32 && local10 <= 122 && this.aString29.length() < 80) {
							this.aString29 = this.aString29 + (char) local10;
							this.aBoolean208 = true;
						}
						if (local10 == 8 && this.aString29.length() > 0) {
							this.aString29 = this.aString29.substring(0, this.aString29.length() - 1);
							this.aBoolean208 = true;
						}
						if (local10 == 13 || local10 == 10) {
							this.aBoolean236 = false;
							this.aBoolean208 = true;
							@Pc(150) long local150;
							if (this.anInt903 == 1) {
								local150 = Class7.method55(this.aString29);
								this.method689(local150, (byte) 4);
							}
							if (this.anInt903 == 2 && this.anInt954 > 0) {
								local150 = Class7.method55(this.aString29);
								this.method660(local150);
							}
							if (this.anInt903 == 3 && this.aString29.length() > 0) {
								this.aClass2_Sub1_Sub4_8.method481(28);
								this.aClass2_Sub1_Sub4_8.method482(0);
								local190 = this.aClass2_Sub1_Sub4_8.anInt672;
								this.aClass2_Sub1_Sub4_8.method488(this.aLong29, this.anInt863);
								Class47.method552(this.aClass2_Sub1_Sub4_8, this.aByte29, this.aString29);
								this.aClass2_Sub1_Sub4_8.method491(this.aClass2_Sub1_Sub4_8.anInt672 - local190);
								this.aString29 = Class47.method553(this.aString29);
								this.aString29 = Class18.method183(this.aString29);
								this.method663(this.aString29, 6, Class7.method59(Class7.method56(this.aLong29)), this.anInt933);
								if (this.anInt923 == 2) {
									this.anInt923 = 1;
									this.aBoolean232 = true;
									this.aClass2_Sub1_Sub4_8.method481(14);
									this.aClass2_Sub1_Sub4_8.method482(this.anInt1033);
									this.aClass2_Sub1_Sub4_8.method482(this.anInt923);
									this.aClass2_Sub1_Sub4_8.method482(this.anInt1010);
								}
							}
							if (this.anInt903 == 4 && this.anInt1007 < 100) {
								local150 = Class7.method55(this.aString29);
								this.method597(local150);
							}
							if (this.anInt903 == 5 && this.anInt1007 > 0) {
								local150 = Class7.method55(this.aString29);
								this.method620(local150);
							}
						}
					} else if (this.anInt1015 == 1) {
						if (local10 >= 48 && local10 <= 57 && this.aString31.length() < 10) {
							this.aString31 = this.aString31 + (char) local10;
							this.aBoolean208 = true;
						}
						if (local10 == 8 && this.aString31.length() > 0) {
							this.aString31 = this.aString31.substring(0, this.aString31.length() - 1);
							this.aBoolean208 = true;
						}
						if (local10 == 13 || local10 == 10) {
							if (this.aString31.length() > 0) {
								local190 = 0;
								try {
									local190 = Integer.parseInt(this.aString31);
								} catch (@Pc(370) Exception local370) {
								}
								this.aClass2_Sub1_Sub4_8.method481(234);
								this.aClass2_Sub1_Sub4_8.method486(local190);
							}
							this.anInt1015 = 0;
							this.aBoolean208 = true;
						}
					} else if (this.anInt1015 == 2) {
						if (local10 >= 32 && local10 <= 122 && this.aString31.length() < 12) {
							this.aString31 = this.aString31 + (char) local10;
							this.aBoolean208 = true;
						}
						if (local10 == 8 && this.aString31.length() > 0) {
							this.aString31 = this.aString31.substring(0, this.aString31.length() - 1);
							this.aBoolean208 = true;
						}
						if (local10 == 13 || local10 == 10) {
							if (this.aString31.length() > 0) {
								this.aClass2_Sub1_Sub4_8.method481(224);
								this.aClass2_Sub1_Sub4_8.method488(Class7.method55(this.aString31), this.anInt863);
							}
							this.anInt1015 = 0;
							this.aBoolean208 = true;
						}
					} else if (this.anInt1015 == 3) {
						if (local10 >= 32 && local10 <= 122 && this.aString31.length() < 40) {
							this.aString31 = this.aString31 + (char) local10;
							this.aBoolean208 = true;
						}
						if (local10 == 8 && this.aString31.length() > 0) {
							this.aString31 = this.aString31.substring(0, this.aString31.length() - 1);
							this.aBoolean208 = true;
						}
					} else if (this.anInt980 == -1 && this.anInt879 == -1) {
						if (local10 >= 32 && local10 <= 122 && this.aString26.length() < 80) {
							this.aString26 = this.aString26 + (char) local10;
							this.aBoolean208 = true;
						}
						if (local10 == 8 && this.aString26.length() > 0) {
							this.aString26 = this.aString26.substring(0, this.aString26.length() - 1);
							this.aBoolean208 = true;
						}
						if ((local10 == 13 || local10 == 10) && this.aString26.length() > 0) {
							if (this.anInt1046 == 2) {
								if (this.aString26.equals("::clientdrop")) {
									this.method612();
								}
								if (this.aString26.equals("::lag")) {
									this.method638(62);
								}
								if (this.aString26.equals("::prefetchmusic")) {
									for (local190 = 0; local190 < this.aClass14_Sub1_1.method100(2); local190++) {
										this.aClass14_Sub1_1.method92((byte) 1, local190, 2);
									}
								}
								if (this.aString26.equals("::fpson")) {
									aBoolean220 = true;
								}
								if (this.aString26.equals("::fpsoff")) {
									aBoolean220 = false;
								}
								if (this.aString26.equals("::noclip")) {
									for (local190 = 0; local190 < 4; local190++) {
										for (@Pc(656) int local656 = 1; local656 < 103; local656++) {
											for (@Pc(660) int local660 = 1; local660 < 103; local660++) {
												this.aClass42Array1[local190].anIntArrayArray21[local656][local660] = 0;
											}
										}
									}
								}
							}
							if (this.aString26.startsWith("::")) {
								this.aClass2_Sub1_Sub4_8.method481(235);
								this.aClass2_Sub1_Sub4_8.method482(this.aString26.length() - 1);
								this.aClass2_Sub1_Sub4_8.method489(this.aString26.substring(2));
							} else {
								@Pc(715) String local715 = this.aString26.toLowerCase();
								@Pc(717) byte local717 = 0;
								if (local715.startsWith("yellow:")) {
									local717 = 0;
									this.aString26 = this.aString26.substring(7);
								} else if (local715.startsWith("red:")) {
									local717 = 1;
									this.aString26 = this.aString26.substring(4);
								} else if (local715.startsWith("green:")) {
									local717 = 2;
									this.aString26 = this.aString26.substring(6);
								} else if (local715.startsWith("cyan:")) {
									local717 = 3;
									this.aString26 = this.aString26.substring(5);
								} else if (local715.startsWith("purple:")) {
									local717 = 4;
									this.aString26 = this.aString26.substring(7);
								} else if (local715.startsWith("white:")) {
									local717 = 5;
									this.aString26 = this.aString26.substring(6);
								} else if (local715.startsWith("flash1:")) {
									local717 = 6;
									this.aString26 = this.aString26.substring(7);
								} else if (local715.startsWith("flash2:")) {
									local717 = 7;
									this.aString26 = this.aString26.substring(7);
								} else if (local715.startsWith("flash3:")) {
									local717 = 8;
									this.aString26 = this.aString26.substring(7);
								} else if (local715.startsWith("glow1:")) {
									local717 = 9;
									this.aString26 = this.aString26.substring(6);
								} else if (local715.startsWith("glow2:")) {
									local717 = 10;
									this.aString26 = this.aString26.substring(6);
								} else if (local715.startsWith("glow3:")) {
									local717 = 11;
									this.aString26 = this.aString26.substring(6);
								}
								local715 = this.aString26.toLowerCase();
								@Pc(889) byte local889 = 0;
								if (local715.startsWith("wave:")) {
									local889 = 1;
									this.aString26 = this.aString26.substring(5);
								} else if (local715.startsWith("wave2:")) {
									local889 = 2;
									this.aString26 = this.aString26.substring(6);
								} else if (local715.startsWith("shake:")) {
									local889 = 3;
									this.aString26 = this.aString26.substring(6);
								} else if (local715.startsWith("scroll:")) {
									local889 = 4;
									this.aString26 = this.aString26.substring(7);
								} else if (local715.startsWith("slide:")) {
									local889 = 5;
									this.aString26 = this.aString26.substring(6);
								}
								this.aClass2_Sub1_Sub4_8.method481(175);
								this.aClass2_Sub1_Sub4_8.method482(0);
								@Pc(970) int local970 = this.aClass2_Sub1_Sub4_8.anInt672;
								this.aClass2_Sub1_Sub4_8.method482(local717);
								this.aClass2_Sub1_Sub4_7.anInt672 = 0;
								Class47.method552(this.aClass2_Sub1_Sub4_7, this.aByte29, this.aString26);
								this.aClass2_Sub1_Sub4_8.method490(this.aClass2_Sub1_Sub4_7.aByteArray17, this.aClass2_Sub1_Sub4_7.anInt672, this.anInt1068);
								this.aClass2_Sub1_Sub4_8.method508(local889);
								this.aClass2_Sub1_Sub4_8.method491(this.aClass2_Sub1_Sub4_8.anInt672 - local970);
								this.aString26 = Class47.method553(this.aString26);
								this.aString26 = Class18.method183(this.aString26);
								aClass2_Sub1_Sub1_Sub2_Sub1_1.aString16 = this.aString26;
								aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt790 = local717;
								aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt787 = local889;
								aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt789 = 150;
								if (this.anInt1046 == 2) {
									this.method663(aClass2_Sub1_Sub1_Sub2_Sub1_1.aString16, 2, "@cr2@" + aClass2_Sub1_Sub1_Sub2_Sub1_1.aString13, this.anInt933);
								} else if (this.anInt1046 == 1) {
									this.method663(aClass2_Sub1_Sub1_Sub2_Sub1_1.aString16, 2, "@cr1@" + aClass2_Sub1_Sub1_Sub2_Sub1_1.aString13, this.anInt933);
								} else {
									this.method663(aClass2_Sub1_Sub1_Sub2_Sub1_1.aString16, 2, aClass2_Sub1_Sub1_Sub2_Sub1_1.aString13, this.anInt933);
								}
								if (this.anInt1033 == 2) {
									this.anInt1033 = 3;
									this.aBoolean232 = true;
									this.aClass2_Sub1_Sub4_8.method481(14);
									this.aClass2_Sub1_Sub4_8.method482(this.anInt1033);
									this.aClass2_Sub1_Sub4_8.method482(this.anInt923);
									this.aClass2_Sub1_Sub4_8.method482(this.anInt1010);
								}
							}
							this.aString26 = "";
							this.aBoolean208 = true;
						}
					}
				}
			}
		} catch (@Pc(1127) RuntimeException local1127) {
			signlink.reporterror("63632, " + true + ", " + local1127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZJ)V")
	private void method660(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt954; local8++) {
					if (this.aLongArray4[local8] == arg0) {
						this.anInt954--;
						this.aBoolean214 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt954; local28++) {
							this.aStringArray12[local28] = this.aStringArray12[local28 + 1];
							this.anIntArray237[local28] = this.anIntArray237[local28 + 1];
							this.aLongArray4[local28] = this.aLongArray4[local28 + 1];
						}
						this.aClass2_Sub1_Sub4_8.method481(142);
						this.aClass2_Sub1_Sub4_8.method488(arg0, this.anInt863);
						break;
					}
				}
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("24028, " + false + ", " + arg0 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method661() {
		try {
			@Pc(8) int local8;
			if (this.anInt981 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt981 > 768) {
						this.anIntArray273[local8] = this.method684(this.anIntArray274[local8], this.anIntArray275[local8], 1024 - this.anInt981);
					} else if (this.anInt981 > 256) {
						this.anIntArray273[local8] = this.anIntArray275[local8];
					} else {
						this.anIntArray273[local8] = this.method684(this.anIntArray275[local8], this.anIntArray274[local8], 256 - this.anInt981);
					}
				}
			} else if (this.anInt982 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt982 > 768) {
						this.anIntArray273[local8] = this.method684(this.anIntArray274[local8], this.anIntArray276[local8], 1024 - this.anInt982);
					} else if (this.anInt982 > 256) {
						this.anIntArray273[local8] = this.anIntArray276[local8];
					} else {
						this.anIntArray273[local8] = this.method684(this.anIntArray276[local8], this.anIntArray274[local8], 256 - this.anInt982);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray273[local8] = this.anIntArray274[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass1_22.anIntArray1[local8] = this.aClass2_Sub1_Sub3_Sub3_15.anIntArray103[local8];
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
				local198 = this.anIntArray257[local185] * (256 - local185) / 256;
				local202 = local198 + 22;
				if (local202 < 0) {
					local202 = 0;
				}
				local181 += local202;
				for (local212 = local202; local212 < 128; local212++) {
					local220 = this.anIntArray261[local181++];
					if (local220 == 0) {
						local183++;
					} else {
						local224 = local220;
						local228 = 256 - local220;
						local220 = this.anIntArray273[local220];
						local239 = this.aClass1_22.anIntArray1[local183];
						this.aClass1_22.anIntArray1[local183++] = ((local220 & 0xFF00FF) * local224 + (local239 & 0xFF00FF) * local228 & 0xFF00FF00) + ((local220 & 0xFF00) * local224 + (local239 & 0xFF00) * local228 & 0xFF0000) >> 8;
					}
				}
				local183 += local202;
			}
			this.aClass1_22.method2(0, 0, super.aGraphics2);
			for (local198 = 0; local198 < 33920; local198++) {
				this.aClass1_23.anIntArray1[local198] = this.aClass2_Sub1_Sub3_Sub3_16.anIntArray103[local198];
			}
			local181 = 0;
			local183 = 1176;
			for (local202 = 1; local202 < 255; local202++) {
				local212 = this.anIntArray257[local202] * (256 - local202) / 256;
				local220 = 103 - local212;
				local183 += local212;
				for (local224 = 0; local224 < local220; local224++) {
					local228 = this.anIntArray261[local181++];
					if (local228 == 0) {
						local183++;
					} else {
						local239 = local228;
						@Pc(365) int local365 = 256 - local228;
						local228 = this.anIntArray273[local228];
						@Pc(376) int local376 = this.aClass1_23.anIntArray1[local183];
						this.aClass1_23.anIntArray1[local183++] = ((local228 & 0xFF00FF) * local239 + (local376 & 0xFF00FF) * local365 & 0xFF00FF00) + ((local228 & 0xFF00) * local239 + (local376 & 0xFF00) * local365 & 0xFF0000) >> 8;
					}
				}
				local181 += 128 - local220;
				local183 += 128 - local220 - local212;
			}
			this.aClass1_23.method2(0, 637, super.aGraphics2);
		} catch (@Pc(448) RuntimeException local448) {
			signlink.reporterror("24966, " + 0 + ", " + local448.toString());
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
				return new URL("http://127.0.0.1:" + (anInt1014 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	private boolean method662(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(12) int local12 = 0; local12 < this.anInt954; local12++) {
				if (arg0.equalsIgnoreCase(this.aStringArray12[local12])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass2_Sub1_Sub1_Sub2_Sub1_1.aString13);
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("32783, " + arg0 + ", " + 6938 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)V")
	private void method663(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg1 == 0 && this.anInt1072 != -1) {
				this.aString27 = arg0;
				super.anInt835 = 0;
			}
			if (this.anInt980 == -1) {
				this.aBoolean208 = true;
			}
			for (@Pc(22) int local22 = 99; local22 > 0; local22--) {
				this.anIntArray230[local22] = this.anIntArray230[local22 - 1];
				this.aStringArray8[local22] = this.aStringArray8[local22 - 1];
				this.aStringArray9[local22] = this.aStringArray9[local22 - 1];
			}
			this.anIntArray230[0] = arg1;
			this.aStringArray8[0] = arg2;
			if (arg3 != 0) {
				for (@Pc(71) int local71 = 1; local71 > 0; local71++) {
				}
			}
			this.aStringArray9[0] = arg0;
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("39975, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt1013 = Integer.parseInt(this.getParameter("nodeid"));
		anInt1014 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method674();
		} else {
			method668(aByte36);
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean226 = false;
		} else {
			aBoolean226 = true;
		}
		this.method577(anInt994);
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(II)Z")
	private boolean method665(@OriginalArg(1) int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(8) int local8 = this.anIntArray214[arg0];
			if (local8 >= 2000) {
				local8 -= 2000;
			}
			return local8 == 627;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("63670, " + -42569 + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)I")
	private int method666() {
		try {
			@Pc(8) int local8 = 3;
			if (this.anInt846 < 310) {
				@Pc(17) int local17 = this.anInt843 >> 7;
				@Pc(22) int local22 = this.anInt845 >> 7;
				@Pc(27) int local27 = aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt778 >> 7;
				@Pc(32) int local32 = aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt779 >> 7;
				if ((this.aByteArrayArrayArray8[this.anInt953][local17][local22] & 0x4) != 0) {
					local8 = this.anInt953;
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
						if ((this.aByteArrayArrayArray8[this.anInt953][local17][local22] & 0x4) != 0) {
							local8 = this.anInt953;
						}
						local84 += local82;
						if (local84 >= 65536) {
							local84 -= 65536;
							if (local22 < local32) {
								local22++;
							} else if (local22 > local32) {
								local22--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt953][local17][local22] & 0x4) != 0) {
								local8 = this.anInt953;
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
						if ((this.aByteArrayArrayArray8[this.anInt953][local17][local22] & 0x4) != 0) {
							local8 = this.anInt953;
						}
						local84 += local82;
						if (local84 >= 65536) {
							local84 -= 65536;
							if (local17 < local27) {
								local17++;
							} else if (local17 > local27) {
								local17--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt953][local17][local22] & 0x4) != 0) {
								local8 = this.anInt953;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray8[this.anInt953][aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt778 >> 7][aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt779 >> 7] & 0x4) != 0) {
				local8 = this.anInt953;
			}
			return local8;
		} catch (@Pc(250) RuntimeException local250) {
			signlink.reporterror("33111, " + false + ", " + local250.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)I")
	private int method667() {
		try {
			@Pc(16) int local16 = this.method720(this.anInt843, this.anInt953, this.anInt845, this.anInt905);
			return local16 - this.anInt844 >= 800 || (this.aByteArrayArrayArray8[this.anInt953][this.anInt843 >> 7][this.anInt845 >> 7] & 0x4) == 0 ? 3 : this.anInt953;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("76610, " + false + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method669() {
		try {
			if (super.anInt835 == 1) {
				if (super.anInt836 >= 539 && super.anInt836 <= 573 && super.anInt837 >= 169 && super.anInt837 < 205 && this.anIntArray226[0] != -1) {
					this.aBoolean214 = true;
					this.anInt891 = 0;
					this.aBoolean206 = true;
				}
				if (super.anInt836 >= 569 && super.anInt836 <= 599 && super.anInt837 >= 168 && super.anInt837 < 205 && this.anIntArray226[1] != -1) {
					this.aBoolean214 = true;
					this.anInt891 = 1;
					this.aBoolean206 = true;
				}
				if (super.anInt836 >= 597 && super.anInt836 <= 627 && super.anInt837 >= 168 && super.anInt837 < 205 && this.anIntArray226[2] != -1) {
					this.aBoolean214 = true;
					this.anInt891 = 2;
					this.aBoolean206 = true;
				}
				if (super.anInt836 >= 625 && super.anInt836 <= 669 && super.anInt837 >= 168 && super.anInt837 < 203 && this.anIntArray226[3] != -1) {
					this.aBoolean214 = true;
					this.anInt891 = 3;
					this.aBoolean206 = true;
				}
				if (super.anInt836 >= 666 && super.anInt836 <= 696 && super.anInt837 >= 168 && super.anInt837 < 205 && this.anIntArray226[4] != -1) {
					this.aBoolean214 = true;
					this.anInt891 = 4;
					this.aBoolean206 = true;
				}
				if (super.anInt836 >= 694 && super.anInt836 <= 724 && super.anInt837 >= 168 && super.anInt837 < 205 && this.anIntArray226[5] != -1) {
					this.aBoolean214 = true;
					this.anInt891 = 5;
					this.aBoolean206 = true;
				}
				if (super.anInt836 >= 722 && super.anInt836 <= 756 && super.anInt837 >= 169 && super.anInt837 < 205 && this.anIntArray226[6] != -1) {
					this.aBoolean214 = true;
					this.anInt891 = 6;
					this.aBoolean206 = true;
				}
				if (super.anInt836 >= 540 && super.anInt836 <= 574 && super.anInt837 >= 466 && super.anInt837 < 502 && this.anIntArray226[7] != -1) {
					this.aBoolean214 = true;
					this.anInt891 = 7;
					this.aBoolean206 = true;
				}
				if (super.anInt836 >= 572 && super.anInt836 <= 602 && super.anInt837 >= 466 && super.anInt837 < 503 && this.anIntArray226[8] != -1) {
					this.aBoolean214 = true;
					this.anInt891 = 8;
					this.aBoolean206 = true;
				}
				if (super.anInt836 >= 599 && super.anInt836 <= 629 && super.anInt837 >= 466 && super.anInt837 < 503 && this.anIntArray226[9] != -1) {
					this.aBoolean214 = true;
					this.anInt891 = 9;
					this.aBoolean206 = true;
				}
				if (super.anInt836 >= 627 && super.anInt836 <= 671 && super.anInt837 >= 467 && super.anInt837 < 502 && this.anIntArray226[10] != -1) {
					this.aBoolean214 = true;
					this.anInt891 = 10;
					this.aBoolean206 = true;
				}
				if (super.anInt836 >= 669 && super.anInt836 <= 699 && super.anInt837 >= 466 && super.anInt837 < 503 && this.anIntArray226[11] != -1) {
					this.aBoolean214 = true;
					this.anInt891 = 11;
					this.aBoolean206 = true;
				}
				if (super.anInt836 >= 696 && super.anInt836 <= 726 && super.anInt837 >= 466 && super.anInt837 < 503 && this.anIntArray226[12] != -1) {
					this.aBoolean214 = true;
					this.anInt891 = 12;
					this.aBoolean206 = true;
				}
				if (super.anInt836 >= 724 && super.anInt836 <= 758 && super.anInt837 >= 466 && super.anInt837 < 502 && this.anIntArray226[13] != -1) {
					this.aBoolean214 = true;
					this.anInt891 = 13;
					this.aBoolean206 = true;
					return;
				}
			}
		} catch (@Pc(446) RuntimeException local446) {
			signlink.reporterror("19464, " + -388 + ", " + local446.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;I)V")
	@Override
	protected void method588(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			this.anInt973 = arg0;
			this.aString23 = arg1;
			this.method639();
			if (this.aClass21_2 == null) {
				super.method588(arg0, arg1);
			} else {
				this.aClass1_21.method1(this.aByte34);
				this.aClass2_Sub1_Sub3_Sub2_4.method300("RuneScape is loading - please wait...", 180, 54, 16777215);
				this.anInt865 += 0;
				Class2_Sub1_Sub3.method358(28, 62, 34, 304, 9179409, 149);
				Class2_Sub1_Sub3.method358(29, 63, 32, 302, 0, 149);
				Class2_Sub1_Sub3.method357(30, arg0 * 3, 64, 9179409, 30);
				Class2_Sub1_Sub3.method357(arg0 * 3 + 30, 300 - arg0 * 3, 64, 0, 30);
				this.aClass2_Sub1_Sub3_Sub2_4.method300(arg1, 180, 85, 16777215);
				this.aClass1_21.method2(171, 202, super.aGraphics2);
				if (this.aBoolean209) {
					this.aBoolean209 = false;
					if (!this.aBoolean221) {
						this.aClass1_22.method2(0, 0, super.aGraphics2);
						this.aClass1_23.method2(0, 637, super.aGraphics2);
					}
					this.aClass1_19.method2(0, 128, super.aGraphics2);
					this.aClass1_20.method2(371, 202, super.aGraphics2);
					this.aClass1_24.method2(265, 0, super.aGraphics2);
					this.aClass1_25.method2(265, 562, super.aGraphics2);
					this.aClass1_26.method2(171, 128, super.aGraphics2);
					this.aClass1_27.method2(171, 562, super.aGraphics2);
				}
			}
		} catch (@Pc(217) RuntimeException local217) {
			signlink.reporterror("91257, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local217.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!LOVQYTIZ;I)V")
	private void method670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub3_Sub3 arg2) {
		try {
			@Pc(7) int local7 = arg1 * arg1 + arg0 * arg0;
			if (local7 > 4225 && local7 < 90000) {
				@Pc(29) int local29 = this.anInt928 + this.anInt1070 & 0x7FF;
				@Pc(33) int local33 = Class2_Sub1_Sub1_Sub6.anIntArray147[local29];
				@Pc(37) int local37 = Class2_Sub1_Sub1_Sub6.anIntArray148[local29];
				@Pc(46) int local46 = local33 * 256 / (this.anInt991 + 256);
				@Pc(55) int local55 = local37 * 256 / (this.anInt991 + 256);
				@Pc(65) int local65 = arg0 * local46 + arg1 * local55 >> 16;
				@Pc(75) int local75 = arg0 * local55 - arg1 * local46 >> 16;
				@Pc(81) double local81 = Math.atan2((double) local65, (double) local75);
				@Pc(87) int local87 = (int) (Math.sin(local81) * 63.0D);
				@Pc(93) int local93 = (int) (Math.cos(local81) * 57.0D);
				this.aClass2_Sub1_Sub3_Sub3_5.method339(local81, 83 - local93 - 20, local87 + 94 + 4 - 10);
			} else {
				this.method607(arg2, arg1, arg0);
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("37466, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -668 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)Ljava/net/Socket;")
	public Socket method671(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)Ljava/lang/String;")
	private String method672(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("25240, " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method673() {
		try {
			this.method709();
			if (this.anInt878 == 1) {
				this.aClass2_Sub1_Sub3_Sub3Array8[this.anInt877 / 100].method334(this.anInt876 - 8 - 4, this.anInt908, this.anInt875 - 8 - 4);
			}
			if (this.anInt878 == 2) {
				this.aClass2_Sub1_Sub3_Sub3Array8[this.anInt877 / 100 + 4].method334(this.anInt876 - 8 - 4, this.anInt908, this.anInt875 - 8 - 4);
			}
			if (this.anInt1059 != -1) {
				this.method677(this.anInt901, (byte) 8, this.anInt1059);
				this.method634(0, 0, 0, Class19.method213(this.anInt1059));
			}
			if (this.anInt947 != -1) {
				this.method677(this.anInt901, (byte) 8, this.anInt947);
				this.method634(0, 0, 0, Class19.method213(this.anInt947));
			}
			this.method678();
			if (!this.aBoolean233) {
				this.method633();
				this.method642(this.anInt902);
			} else if (this.anInt880 == 0) {
				this.method605();
			}
			if (this.anInt952 == 1) {
				this.aClass2_Sub1_Sub3_Sub3_4.method334(296, this.anInt908, 472);
			}
			@Pc(146) int local146;
			@Pc(178) int local178;
			if (aBoolean220) {
				@Pc(144) byte local144 = 20;
				local146 = 16776960;
				if (super.anInt825 < 30 && aBoolean227) {
					local146 = 16711680;
				}
				if (super.anInt825 < 20 && !aBoolean227) {
					local146 = 16711680;
				}
				this.aClass2_Sub1_Sub3_Sub2_3.method299(local146, 20, "Fps:" + super.anInt825);
				local178 = local144 + 15;
				@Pc(180) Runtime local180 = Runtime.getRuntime();
				@Pc(189) int local189 = (int) ((local180.totalMemory() - local180.freeMemory()) / 1024L);
				if (local189 > 33554432 && aBoolean227) {
				}
				if (local189 > 67108864 && !aBoolean227) {
				}
				this.aClass2_Sub1_Sub3_Sub2_3.method299(16776960, 35, "Mem:" + local189 + "k");
				local178 += 15;
			}
			if (this.anInt924 != 0) {
				@Pc(230) int local230 = this.anInt924 / 50;
				local178 = local230 / 60;
				@Pc(238) int local238 = local230 % 60;
				if (local238 < 10) {
					this.aClass2_Sub1_Sub3_Sub2_3.method304("System update in: " + local178 + ":0" + local238, 329, 4, this.aBoolean207, 16776960);
				} else {
					this.aClass2_Sub1_Sub3_Sub2_3.method304("System update in: " + local178 + ":" + local238, 329, 4, this.aBoolean207, 16776960);
				}
				anInt1049++;
				if (anInt1049 > 1696) {
					anInt1049 = 0;
					this.aClass2_Sub1_Sub4_8.method481(11);
					this.aClass2_Sub1_Sub4_8.method482(0);
					local146 = this.aClass2_Sub1_Sub4_8.anInt672;
					this.aClass2_Sub1_Sub4_8.method483((int) (Math.random() * 65536.0D));
					this.aClass2_Sub1_Sub4_8.method483((int) (Math.random() * 65536.0D));
					this.aClass2_Sub1_Sub4_8.method483((int) (Math.random() * 65536.0D));
					this.aClass2_Sub1_Sub4_8.method483(15088);
					this.aClass2_Sub1_Sub4_8.method483((int) (Math.random() * 65536.0D));
					this.aClass2_Sub1_Sub4_8.method483((int) (Math.random() * 65536.0D));
					this.aClass2_Sub1_Sub4_8.method482(226);
					this.aClass2_Sub1_Sub4_8.method482((int) (Math.random() * 256.0D));
					this.aClass2_Sub1_Sub4_8.method483(61697);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass2_Sub1_Sub4_8.method483(35704);
					}
					this.aClass2_Sub1_Sub4_8.method491(this.aClass2_Sub1_Sub4_8.anInt672 - local146);
					return;
				}
			}
		} catch (@Pc(377) RuntimeException local377) {
			signlink.reporterror("45007, " + -126 + ", " + local377.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method581() {
		this.method588(20, "Starting up");
		if (signlink.sunjava) {
			super.anInt824 = 5;
		}
		if (aBoolean219) {
			this.aBoolean213 = true;
			return;
		}
		aBoolean219 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method672(759);
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
				this.aClass50Array1[local107] = new Class50(signlink.aRandomAccessFile3, signlink.aRandomAccessFileArray1[local107], false, local107 + 1, 500000);
			}
		}
		try {
			this.method698((byte) 9);
			this.aClass21_2 = this.method596(1, "title", 25, "title screen", this.anIntArray236[1]);
			this.aClass2_Sub1_Sub3_Sub2_2 = new Class2_Sub1_Sub3_Sub2(934, this.aClass21_2, "p11_full", false);
			this.aClass2_Sub1_Sub3_Sub2_3 = new Class2_Sub1_Sub3_Sub2(934, this.aClass21_2, "p12_full", false);
			this.aClass2_Sub1_Sub3_Sub2_4 = new Class2_Sub1_Sub3_Sub2(934, this.aClass21_2, "b12_full", false);
			this.aClass2_Sub1_Sub3_Sub2_5 = new Class2_Sub1_Sub3_Sub2(934, this.aClass21_2, "q8_full", true);
			this.method622(anInt1035);
			this.method635();
			@Pc(203) Class21 local203 = this.method596(2, "config", 30, "config", this.anIntArray236[2]);
			@Pc(215) Class21 local215 = this.method596(3, "interface", 35, "interface", this.anIntArray236[3]);
			@Pc(227) Class21 local227 = this.method596(4, "media", 40, "2d graphics", this.anIntArray236[4]);
			@Pc(239) Class21 local239 = this.method596(6, "textures", 45, "textures", this.anIntArray236[6]);
			@Pc(251) Class21 local251 = this.method596(7, "wordenc", 50, "chat system", this.anIntArray236[7]);
			@Pc(263) Class21 local263 = this.method596(8, "sounds", 55, "sound effects", this.anIntArray236[8]);
			this.aByteArrayArrayArray8 = new byte[4][104][104];
			this.anIntArrayArrayArray8 = new int[4][105][105];
			this.aClass20_1 = new Class20(104, this.anIntArrayArrayArray8, 4, 104, (byte) -47);
			for (@Pc(288) int local288 = 0; local288 < 4; local288++) {
				this.aClass42Array1[local288] = new Class42(104, -39368, 104);
			}
			this.aClass2_Sub1_Sub3_Sub3_17 = new Class2_Sub1_Sub3_Sub3(512, 512);
			@Pc(323) Class21 local323 = this.method596(5, "versionlist", 60, "update list", this.anIntArray236[5]);
			this.method588(60, "Connecting to update server");
			this.aClass14_Sub1_1 = new Class14_Sub1();
			this.aClass14_Sub1_1.method85(local323, this);
			Class29.method415(this.aClass14_Sub1_1.method88());
			Class2_Sub1_Sub1_Sub6.method382(this.aClass14_Sub1_1.method100(0), this.aClass14_Sub1_1);
			if (!aBoolean227) {
				this.anInt1009 = 0;
				this.aBoolean225 = true;
				this.aClass14_Sub1_1.method87(2, this.anInt1009);
				while (this.aClass14_Sub1_1.method86() > 0) {
					this.method695();
					try {
						Thread.sleep(100L);
					} catch (@Pc(374) Exception local374) {
					}
					if (this.aClass14_Sub1_1.anInt186 > 3) {
						this.method707("ondemand");
						return;
					}
				}
			}
			this.method588(65, "Requesting animations");
			@Pc(398) int local398 = this.aClass14_Sub1_1.method100(1);
			for (@Pc(400) int local400 = 0; local400 < local398; local400++) {
				this.aClass14_Sub1_1.method87(1, local400);
			}
			@Pc(419) int local419;
			while (this.aClass14_Sub1_1.method86() > 0) {
				local419 = local398 - this.aClass14_Sub1_1.method86();
				if (local419 > 0) {
					this.method588(65, "Loading animations - " + local419 * 100 / local398 + "%");
				}
				this.method695();
				try {
					Thread.sleep(100L);
				} catch (@Pc(445) Exception local445) {
				}
				if (this.aClass14_Sub1_1.anInt186 > 3) {
					this.method707("ondemand");
					return;
				}
			}
			this.method588(70, "Requesting models");
			local398 = this.aClass14_Sub1_1.method100(0);
			@Pc(479) int local479;
			for (local419 = 0; local419 < local398; local419++) {
				local479 = this.aClass14_Sub1_1.method91(local419);
				if ((local479 & 0x1) != 0) {
					this.aClass14_Sub1_1.method87(0, local419);
				}
			}
			local398 = this.aClass14_Sub1_1.method86();
			while (this.aClass14_Sub1_1.method86() > 0) {
				local479 = local398 - this.aClass14_Sub1_1.method86();
				if (local479 > 0) {
					this.method588(70, "Loading models - " + local479 * 100 / local398 + "%");
				}
				this.method695();
				try {
					Thread.sleep(100L);
				} catch (@Pc(530) Exception local530) {
				}
			}
			if (this.aClass50Array1[0] != null) {
				this.method588(75, "Requesting maps");
				this.aClass14_Sub1_1.method87(3, this.aClass14_Sub1_1.method96(0, 48, 47));
				this.aClass14_Sub1_1.method87(3, this.aClass14_Sub1_1.method96(1, 48, 47));
				this.aClass14_Sub1_1.method87(3, this.aClass14_Sub1_1.method96(0, 48, 48));
				this.aClass14_Sub1_1.method87(3, this.aClass14_Sub1_1.method96(1, 48, 48));
				this.aClass14_Sub1_1.method87(3, this.aClass14_Sub1_1.method96(0, 48, 49));
				this.aClass14_Sub1_1.method87(3, this.aClass14_Sub1_1.method96(1, 48, 49));
				this.aClass14_Sub1_1.method87(3, this.aClass14_Sub1_1.method96(0, 47, 47));
				this.aClass14_Sub1_1.method87(3, this.aClass14_Sub1_1.method96(1, 47, 47));
				this.aClass14_Sub1_1.method87(3, this.aClass14_Sub1_1.method96(0, 47, 48));
				this.aClass14_Sub1_1.method87(3, this.aClass14_Sub1_1.method96(1, 47, 48));
				this.aClass14_Sub1_1.method87(3, this.aClass14_Sub1_1.method96(0, 148, 48));
				this.aClass14_Sub1_1.method87(3, this.aClass14_Sub1_1.method96(1, 148, 48));
				local398 = this.aClass14_Sub1_1.method86();
				while (this.aClass14_Sub1_1.method86() > 0) {
					local479 = local398 - this.aClass14_Sub1_1.method86();
					if (local479 > 0) {
						this.method588(75, "Loading maps - " + local479 * 100 / local398 + "%");
					}
					this.method695();
					try {
						Thread.sleep(100L);
					} catch (@Pc(715) Exception local715) {
					}
				}
			}
			local398 = this.aClass14_Sub1_1.method100(0);
			@Pc(736) int local736;
			for (local479 = 0; local479 < local398; local479++) {
				local736 = this.aClass14_Sub1_1.method91(local479);
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
					this.aClass14_Sub1_1.method92(local738, local479, 0);
				}
			}
			this.aClass14_Sub1_1.method95(aBoolean226);
			if (!aBoolean227) {
				local398 = this.aClass14_Sub1_1.method100(2);
				for (local736 = 1; local736 < local398; local736++) {
					if (this.aClass14_Sub1_1.method101(local736)) {
						this.aClass14_Sub1_1.method92((byte) 1, local736, 2);
					}
				}
			}
			this.method588(80, "Unpacking media");
			this.aClass2_Sub1_Sub3_Sub4_16 = new Class2_Sub1_Sub3_Sub4(local227, "invback", 0);
			this.aClass2_Sub1_Sub3_Sub4_18 = new Class2_Sub1_Sub3_Sub4(local227, "chatback", 0);
			this.aClass2_Sub1_Sub3_Sub4_17 = new Class2_Sub1_Sub3_Sub4(local227, "mapback", 0);
			this.aClass2_Sub1_Sub3_Sub4_6 = new Class2_Sub1_Sub3_Sub4(local227, "backbase1", 0);
			this.aClass2_Sub1_Sub3_Sub4_7 = new Class2_Sub1_Sub3_Sub4(local227, "backbase2", 0);
			this.aClass2_Sub1_Sub3_Sub4_8 = new Class2_Sub1_Sub3_Sub4(local227, "backhmid1", 0);
			for (local736 = 0; local736 < 13; local736++) {
				this.aClass2_Sub1_Sub3_Sub4Array5[local736] = new Class2_Sub1_Sub3_Sub4(local227, "sideicons", local736);
			}
			this.aClass2_Sub1_Sub3_Sub3_3 = new Class2_Sub1_Sub3_Sub3(local227, "compass", 0);
			this.aClass2_Sub1_Sub3_Sub3_5 = new Class2_Sub1_Sub3_Sub3(local227, "mapedge", 0);
			this.aClass2_Sub1_Sub3_Sub3_5.method331();
			for (@Pc(938) int local938 = 0; local938 < 72; local938++) {
				this.aClass2_Sub1_Sub3_Sub4Array4[local938] = new Class2_Sub1_Sub3_Sub4(local227, "mapscene", local938);
			}
			for (@Pc(956) int local956 = 0; local956 < 70; local956++) {
				this.aClass2_Sub1_Sub3_Sub3Array9[local956] = new Class2_Sub1_Sub3_Sub3(local227, "mapfunction", local956);
			}
			for (@Pc(974) int local974 = 0; local974 < 5; local974++) {
				this.aClass2_Sub1_Sub3_Sub3Array10[local974] = new Class2_Sub1_Sub3_Sub3(local227, "hitmarks", local974);
			}
			for (@Pc(992) int local992 = 0; local992 < 6; local992++) {
				this.aClass2_Sub1_Sub3_Sub3Array4[local992] = new Class2_Sub1_Sub3_Sub3(local227, "headicons_pk", local992);
			}
			for (@Pc(1010) int local1010 = 0; local1010 < 9; local1010++) {
				this.aClass2_Sub1_Sub3_Sub3Array6[local1010] = new Class2_Sub1_Sub3_Sub3(local227, "headicons_prayer", local1010);
			}
			for (@Pc(1028) int local1028 = 0; local1028 < 6; local1028++) {
				this.aClass2_Sub1_Sub3_Sub3Array5[local1028] = new Class2_Sub1_Sub3_Sub3(local227, "headicons_hint", local1028);
			}
			this.aClass2_Sub1_Sub3_Sub3_4 = new Class2_Sub1_Sub3_Sub3(local227, "overlay_multiway", 0);
			this.aClass2_Sub1_Sub3_Sub3_11 = new Class2_Sub1_Sub3_Sub3(local227, "mapmarker", 0);
			this.aClass2_Sub1_Sub3_Sub3_12 = new Class2_Sub1_Sub3_Sub3(local227, "mapmarker", 1);
			for (@Pc(1070) int local1070 = 0; local1070 < 8; local1070++) {
				this.aClass2_Sub1_Sub3_Sub3Array8[local1070] = new Class2_Sub1_Sub3_Sub3(local227, "cross", local1070);
			}
			this.aClass2_Sub1_Sub3_Sub3_6 = new Class2_Sub1_Sub3_Sub3(local227, "mapdots", 0);
			this.aClass2_Sub1_Sub3_Sub3_7 = new Class2_Sub1_Sub3_Sub3(local227, "mapdots", 1);
			this.aClass2_Sub1_Sub3_Sub3_8 = new Class2_Sub1_Sub3_Sub3(local227, "mapdots", 2);
			this.aClass2_Sub1_Sub3_Sub3_9 = new Class2_Sub1_Sub3_Sub3(local227, "mapdots", 3);
			this.aClass2_Sub1_Sub3_Sub3_10 = new Class2_Sub1_Sub3_Sub3(local227, "mapdots", 4);
			this.aClass2_Sub1_Sub3_Sub4_19 = new Class2_Sub1_Sub3_Sub4(local227, "scrollbar", 0);
			this.aClass2_Sub1_Sub3_Sub4_20 = new Class2_Sub1_Sub3_Sub4(local227, "scrollbar", 1);
			this.aClass2_Sub1_Sub3_Sub4_1 = new Class2_Sub1_Sub3_Sub4(local227, "redstone1", 0);
			this.aClass2_Sub1_Sub3_Sub4_2 = new Class2_Sub1_Sub3_Sub4(local227, "redstone2", 0);
			this.aClass2_Sub1_Sub3_Sub4_3 = new Class2_Sub1_Sub3_Sub4(local227, "redstone3", 0);
			this.aClass2_Sub1_Sub3_Sub4_4 = new Class2_Sub1_Sub3_Sub4(local227, "redstone1", 0);
			this.aClass2_Sub1_Sub3_Sub4_4.method366();
			this.aClass2_Sub1_Sub3_Sub4_5 = new Class2_Sub1_Sub3_Sub4(local227, "redstone2", 0);
			this.aClass2_Sub1_Sub3_Sub4_5.method366();
			this.aClass2_Sub1_Sub3_Sub4_9 = new Class2_Sub1_Sub3_Sub4(local227, "redstone1", 0);
			this.aClass2_Sub1_Sub3_Sub4_9.method367();
			this.aClass2_Sub1_Sub3_Sub4_10 = new Class2_Sub1_Sub3_Sub4(local227, "redstone2", 0);
			this.aClass2_Sub1_Sub3_Sub4_10.method367();
			this.aClass2_Sub1_Sub3_Sub4_11 = new Class2_Sub1_Sub3_Sub4(local227, "redstone3", 0);
			this.aClass2_Sub1_Sub3_Sub4_11.method367();
			this.aClass2_Sub1_Sub3_Sub4_12 = new Class2_Sub1_Sub3_Sub4(local227, "redstone1", 0);
			this.aClass2_Sub1_Sub3_Sub4_12.method366();
			this.aClass2_Sub1_Sub3_Sub4_12.method367();
			this.aClass2_Sub1_Sub3_Sub4_13 = new Class2_Sub1_Sub3_Sub4(local227, "redstone2", 0);
			this.aClass2_Sub1_Sub3_Sub4_13.method366();
			this.aClass2_Sub1_Sub3_Sub4_13.method367();
			for (@Pc(1260) int local1260 = 0; local1260 < 2; local1260++) {
				this.aClass2_Sub1_Sub3_Sub4Array3[local1260] = new Class2_Sub1_Sub3_Sub4(local227, "mod_icons", local1260);
			}
			@Pc(1283) Class2_Sub1_Sub3_Sub3 local1283 = new Class2_Sub1_Sub3_Sub3(local227, "backleft1", 0);
			this.aClass1_3 = new Class1(local1283.anInt437, -826, this.method586(aBoolean205), local1283.anInt436);
			local1283.method332(0, 488, 0);
			@Pc(1308) Class2_Sub1_Sub3_Sub3 local1308 = new Class2_Sub1_Sub3_Sub3(local227, "backleft2", 0);
			this.aClass1_4 = new Class1(local1308.anInt437, -826, this.method586(aBoolean205), local1308.anInt436);
			local1308.method332(0, 488, 0);
			@Pc(1333) Class2_Sub1_Sub3_Sub3 local1333 = new Class2_Sub1_Sub3_Sub3(local227, "backright1", 0);
			this.aClass1_5 = new Class1(local1333.anInt437, -826, this.method586(aBoolean205), local1333.anInt436);
			local1333.method332(0, 488, 0);
			@Pc(1358) Class2_Sub1_Sub3_Sub3 local1358 = new Class2_Sub1_Sub3_Sub3(local227, "backright2", 0);
			this.aClass1_6 = new Class1(local1358.anInt437, -826, this.method586(aBoolean205), local1358.anInt436);
			local1358.method332(0, 488, 0);
			@Pc(1383) Class2_Sub1_Sub3_Sub3 local1383 = new Class2_Sub1_Sub3_Sub3(local227, "backtop1", 0);
			this.aClass1_7 = new Class1(local1383.anInt437, -826, this.method586(aBoolean205), local1383.anInt436);
			local1383.method332(0, 488, 0);
			@Pc(1408) Class2_Sub1_Sub3_Sub3 local1408 = new Class2_Sub1_Sub3_Sub3(local227, "backvmid1", 0);
			this.aClass1_8 = new Class1(local1408.anInt437, -826, this.method586(aBoolean205), local1408.anInt436);
			local1408.method332(0, 488, 0);
			@Pc(1433) Class2_Sub1_Sub3_Sub3 local1433 = new Class2_Sub1_Sub3_Sub3(local227, "backvmid2", 0);
			this.aClass1_9 = new Class1(local1433.anInt437, -826, this.method586(aBoolean205), local1433.anInt436);
			local1433.method332(0, 488, 0);
			@Pc(1458) Class2_Sub1_Sub3_Sub3 local1458 = new Class2_Sub1_Sub3_Sub3(local227, "backvmid3", 0);
			this.aClass1_10 = new Class1(local1458.anInt437, -826, this.method586(aBoolean205), local1458.anInt436);
			local1458.method332(0, 488, 0);
			@Pc(1483) Class2_Sub1_Sub3_Sub3 local1483 = new Class2_Sub1_Sub3_Sub3(local227, "backhmid2", 0);
			this.aClass1_11 = new Class1(local1483.anInt437, -826, this.method586(aBoolean205), local1483.anInt436);
			local1483.method332(0, 488, 0);
			@Pc(1508) int local1508 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1515) int local1515 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1522) int local1522 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1529) int local1529 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1531) int local1531 = 0; local1531 < 100; local1531++) {
				if (this.aClass2_Sub1_Sub3_Sub3Array9[local1531] != null) {
					this.aClass2_Sub1_Sub3_Sub3Array9[local1531].method330(local1522 + local1529, local1515 + local1529, local1508 + local1529);
				}
				if (this.aClass2_Sub1_Sub3_Sub4Array4[local1531] != null) {
					this.aClass2_Sub1_Sub3_Sub4Array4[local1531].method368(local1522 + local1529, local1515 + local1529, local1508 + local1529);
				}
			}
			this.method588(83, "Unpacking textures");
			Class2_Sub1_Sub3_Sub1.method137(local239);
			Class2_Sub1_Sub3_Sub1.method141(694, 0.8D);
			Class2_Sub1_Sub3_Sub1.method136(anInt1045);
			this.method588(86, "Unpacking config");
			Class22.method276(local203);
			Class37.method449(local203);
			Class11.method74(local203);
			Class36.method445(local203);
			Class48.method554(local203);
			Class27.method371(local203);
			Class16.method149(local203);
			Class33.method426(local203);
			Class40.method531(local203);
			Class36.aBoolean146 = aBoolean226;
			if (!aBoolean227) {
				this.method588(90, "Unpacking sounds");
				@Pc(1634) byte[] local1634 = local263.method275("sounds.dat", null);
				@Pc(1640) Class2_Sub1_Sub4 local1640 = new Class2_Sub1_Sub4(859, local1634);
				Class35.method428(local1640);
			}
			this.method588(95, "Unpacking interfaces");
			@Pc(1671) Class2_Sub1_Sub3_Sub2[] local1671 = new Class2_Sub1_Sub3_Sub2[] { this.aClass2_Sub1_Sub3_Sub2_2, this.aClass2_Sub1_Sub3_Sub2_3, this.aClass2_Sub1_Sub3_Sub2_4, this.aClass2_Sub1_Sub3_Sub2_5 };
			Class19.method217(local215, local1671, local227);
			this.method588(100, "Preparing game engine");
			@Pc(1687) int local1687;
			@Pc(1689) int local1689;
			@Pc(1691) int local1691;
			for (@Pc(1683) int local1683 = 0; local1683 < 33; local1683++) {
				local1687 = 999;
				local1689 = 0;
				for (local1691 = 0; local1691 < 34; local1691++) {
					if (this.aClass2_Sub1_Sub3_Sub4_17.aByteArray12[local1691 + local1683 * this.aClass2_Sub1_Sub3_Sub4_17.anInt474] == 0) {
						if (local1687 == 999) {
							local1687 = local1691;
						}
					} else if (local1687 != 999) {
						local1689 = local1691;
						break;
					}
				}
				this.anIntArray229[local1683] = local1687;
				this.anIntArray245[local1683] = local1689 - local1687;
			}
			@Pc(1749) int local1749;
			for (local1687 = 5; local1687 < 156; local1687++) {
				local1689 = 999;
				local1691 = 0;
				for (local1749 = 25; local1749 < 172; local1749++) {
					if (this.aClass2_Sub1_Sub3_Sub4_17.aByteArray12[local1749 + local1687 * this.aClass2_Sub1_Sub3_Sub4_17.anInt474] == 0 && (local1749 > 34 || local1687 > 34)) {
						if (local1689 == 999) {
							local1689 = local1749;
						}
					} else if (local1689 != 999) {
						local1691 = local1749;
						break;
					}
				}
				this.anIntArray234[local1687 - 5] = local1689 - 25;
				this.anIntArray259[local1687 - 5] = local1691 - local1689;
			}
			Class2_Sub1_Sub3_Sub1.method134(765, 503);
			this.anIntArray241 = Class2_Sub1_Sub3_Sub1.anIntArray53;
			Class2_Sub1_Sub3_Sub1.method134(479, 96);
			this.anIntArray238 = Class2_Sub1_Sub3_Sub1.anIntArray53;
			Class2_Sub1_Sub3_Sub1.method134(190, 261);
			this.anIntArray239 = Class2_Sub1_Sub3_Sub1.anIntArray53;
			Class2_Sub1_Sub3_Sub1.method134(512, 334);
			this.anIntArray240 = Class2_Sub1_Sub3_Sub1.anIntArray53;
			@Pc(1840) int[] local1840 = new int[9];
			for (local1691 = 0; local1691 < 9; local1691++) {
				local1749 = local1691 * 32 + 128 + 15;
				@Pc(1858) int local1858 = local1749 * 3 + 600;
				@Pc(1862) int local1862 = Class2_Sub1_Sub3_Sub1.anIntArray51[local1749];
				local1840[local1691] = local1858 * local1862 >> 16;
			}
			Class20.method258(local1840, 736);
			Class18.method173(local251);
			this.aClass31_1 = new Class31(this, 45345);
			this.method587(this.aClass31_1, 10);
			Class2_Sub1_Sub1_Sub3.aClient1 = this;
			Class37.aClient4 = this;
			Class48.aClient5 = this;
		} catch (@Pc(1903) Exception local1903) {
			signlink.reporterror("loaderror " + this.aString23 + " " + this.anInt973);
			this.aBoolean229 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIB)V")
	private void method676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(8) int local8 = this.aClass20_1.method248(arg3, arg2, arg0);
			@Pc(18) int local18;
			@Pc(24) int local24;
			@Pc(28) int local28;
			@Pc(30) int local30;
			@Pc(52) int local52;
			@Pc(58) int local58;
			if (local8 != 0) {
				local18 = this.aClass20_1.method252(arg3, arg2, arg0, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = arg1;
				if (local8 > 0) {
					local30 = arg4;
				}
				@Pc(38) int[] local38 = this.aClass2_Sub1_Sub3_Sub3_17.anIntArray103;
				local52 = arg2 * 4 + (103 - arg0) * 512 * 4 + 24624;
				local58 = local8 >> 14 & 0x7FFF;
				@Pc(61) Class37 local61 = Class37.method451(local58);
				if (local61.anInt587 == -1) {
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
					@Pc(71) Class2_Sub1_Sub3_Sub4 local71 = this.aClass2_Sub1_Sub3_Sub4Array4[local61.anInt587];
					if (local71 != null) {
						@Pc(83) int local83 = (local61.anInt575 * 4 - local71.anInt474) / 2;
						@Pc(93) int local93 = (local61.anInt593 * 4 - local71.anInt475) / 2;
						local71.method369((104 - arg0 - local61.anInt593) * 4 + local93 + 48, this.anInt908, arg2 * 4 + local83 + 48);
					}
				}
			}
			local8 = this.aClass20_1.method250(arg3, arg2, arg0);
			if (local8 != 0) {
				local18 = this.aClass20_1.method252(arg3, arg2, arg0, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = local8 >> 14 & 0x7FFF;
				@Pc(456) Class37 local456 = Class37.method451(local30);
				@Pc(488) int local488;
				if (local456.anInt587 != -1) {
					@Pc(466) Class2_Sub1_Sub3_Sub4 local466 = this.aClass2_Sub1_Sub3_Sub4Array4[local456.anInt587];
					if (local466 != null) {
						local58 = (local456.anInt575 * 4 - local466.anInt474) / 2;
						local488 = (local456.anInt593 * 4 - local466.anInt475) / 2;
						local466.method369((104 - arg0 - local456.anInt593) * 4 + local488 + 48, this.anInt908, arg2 * 4 + local58 + 48);
					}
				} else if (local28 == 9) {
					local52 = 15658734;
					if (local8 > 0) {
						local52 = 15597568;
					}
					@Pc(526) int[] local526 = this.aClass2_Sub1_Sub3_Sub3_17.anIntArray103;
					local488 = arg2 * 4 + (103 - arg0) * 512 * 4 + 24624;
					if (local24 == 0 || local24 == 2) {
						local526[local488 + 1536] = local52;
						local526[local488 + 1024 + 1] = local52;
						local526[local488 + 512 + 2] = local52;
						local526[local488 + 3] = local52;
					} else {
						local526[local488] = local52;
						local526[local488 + 512 + 1] = local52;
						local526[local488 + 1024 + 2] = local52;
						local526[local488 + 1536 + 3] = local52;
					}
				}
			}
			local8 = this.aClass20_1.method251(arg3, arg2, arg0);
			if (local8 != 0) {
				local18 = local8 >> 14 & 0x7FFF;
				@Pc(621) Class37 local621 = Class37.method451(local18);
				if (local621.anInt587 != -1) {
					@Pc(631) Class2_Sub1_Sub3_Sub4 local631 = this.aClass2_Sub1_Sub3_Sub4Array4[local621.anInt587];
					if (local631 != null) {
						local30 = (local621.anInt575 * 4 - local631.anInt474) / 2;
						@Pc(653) int local653 = (local621.anInt593 * 4 - local631.anInt475) / 2;
						local631.method369((104 - arg0 - local621.anInt593) * 4 + local653 + 48, this.anInt908, arg2 * 4 + local30 + 48);
						return;
					}
				}
			}
		} catch (@Pc(678) RuntimeException local678) {
			signlink.reporterror("61969, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 119 + ", " + local678.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBI)Z")
	private boolean method677(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(8) boolean local8 = false;
			@Pc(18) Class19 local18 = Class19.method213(arg2);
			for (@Pc(20) int local20 = 0; local20 < local18.anIntArray66.length && local18.anIntArray66[local20] != -1; local20++) {
				@Pc(34) Class19 local34 = Class19.method213(local18.anIntArray66[local20]);
				if (local34.anInt310 == 0) {
					local3 |= this.method677(arg0, (byte) 8, local34.anInt293);
				}
				@Pc(68) int local68;
				if (local34.anInt310 == 6 && (local34.anInt283 != -1 || local34.anInt284 != -1)) {
					@Pc(63) boolean local63 = this.method699(local34);
					if (local63) {
						local68 = local34.anInt284;
					} else {
						local68 = local34.anInt283;
					}
					if (local68 != -1) {
						@Pc(80) Class22 local80 = Class22.aClass22Array1[local68];
						local34.anInt308 += arg0;
						while (local34.anInt308 > local80.method277(local34.anInt291)) {
							local34.anInt308 -= local80.method277(local34.anInt291) + 1;
							local34.anInt291++;
							if (local34.anInt291 >= local80.anInt372) {
								local34.anInt291 -= local80.anInt373;
								if (local34.anInt291 < 0 || local34.anInt291 >= local80.anInt372) {
									local34.anInt291 = 0;
								}
							}
							local3 = true;
						}
					}
				}
				if (local34.anInt310 == 6 && local34.anInt300 != 0) {
					@Pc(151) int local151 = local34.anInt300 >> 16;
					local68 = local34.anInt300 << 16 >> 16;
					@Pc(162) int local162 = local151 * arg0;
					local68 *= arg0;
					local34.anInt295 = local34.anInt295 + local162 & 0x7FF;
					local34.anInt296 = local34.anInt296 + local68 & 0x7FF;
					local3 = true;
				}
			}
			return local3;
		} catch (@Pc(193) RuntimeException local193) {
			signlink.reporterror("92558, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local193.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
	private void method678() {
		try {
			this.anInt1027 = 0;
			@Pc(21) int local21 = (aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt778 >> 7) + this.anInt870;
			@Pc(29) int local29 = (aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt779 >> 7) + this.anInt871;
			if (local21 >= 3053 && local21 <= 3156 && local29 >= 3056 && local29 <= 3136) {
				this.anInt1027 = 1;
			}
			if (local21 >= 3072 && local21 <= 3118 && local29 >= 9492 && local29 <= 9535) {
				this.anInt1027 = 1;
			}
			if (this.anInt1027 == 1 && local21 >= 3139 && local21 <= 3199 && local29 >= 3008 && local29 <= 3062) {
				this.anInt1027 = 0;
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("68867, " + 23 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZI)V")
	private void method679(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(1) int local1 = 0;
			for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
				if (this.aStringArray9[local3] != null) {
					@Pc(15) int local15 = this.anIntArray230[local3];
					@Pc(26) int local26 = this.anInt1012 + 70 + 4 - local1 * 14;
					if (local26 < -20) {
						break;
					}
					@Pc(34) String local34 = this.aStringArray8[local3];
					if (local34 != null && local34.startsWith("@cr1@")) {
						local34 = local34.substring(5);
					}
					if (local34 != null && local34.startsWith("@cr2@")) {
						local34 = local34.substring(5);
					}
					if (local15 == 0) {
						local1++;
					}
					if ((local15 == 1 || local15 == 2) && (local15 == 1 || this.anInt1033 == 0 || this.anInt1033 == 1 && this.method662(local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26 && !local34.equals(aClass2_Sub1_Sub1_Sub2_Sub1_1.aString13)) {
							if (this.anInt1046 >= 1) {
								this.aStringArray10[this.anInt1053] = "Report abuse @whi@" + local34;
								this.anIntArray214[this.anInt1053] = 471;
								this.anInt1053++;
							}
							this.aStringArray10[this.anInt1053] = "Add ignore @whi@" + local34;
							this.anIntArray214[this.anInt1053] = 608;
							this.anInt1053++;
							this.aStringArray10[this.anInt1053] = "Add friend @whi@" + local34;
							this.anIntArray214[this.anInt1053] = 627;
							this.anInt1053++;
						}
						local1++;
					}
					if ((local15 == 3 || local15 == 7) && this.anInt925 == 0 && (local15 == 7 || this.anInt923 == 0 || this.anInt923 == 1 && this.method662(local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26) {
							if (this.anInt1046 >= 1) {
								this.aStringArray10[this.anInt1053] = "Report abuse @whi@" + local34;
								this.anIntArray214[this.anInt1053] = 471;
								this.anInt1053++;
							}
							this.aStringArray10[this.anInt1053] = "Add ignore @whi@" + local34;
							this.anIntArray214[this.anInt1053] = 608;
							this.anInt1053++;
							this.aStringArray10[this.anInt1053] = "Add friend @whi@" + local34;
							this.anIntArray214[this.anInt1053] = 627;
							this.anInt1053++;
						}
						local1++;
					}
					if (local15 == 4 && (this.anInt1010 == 0 || this.anInt1010 == 1 && this.method662(local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26) {
							this.aStringArray10[this.anInt1053] = "Accept trade @whi@" + local34;
							this.anIntArray214[this.anInt1053] = 404;
							this.anInt1053++;
						}
						local1++;
					}
					if ((local15 == 5 || local15 == 6) && this.anInt925 == 0 && this.anInt923 < 2) {
						local1++;
					}
					if (local15 == 8 && (this.anInt1010 == 0 || this.anInt1010 == 1 && this.method662(local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26) {
							this.aStringArray10[this.anInt1053] = "Accept challenge @whi@" + local34;
							this.anIntArray214[this.anInt1053] = 394;
							this.anInt1053++;
						}
						local1++;
					}
				}
			}
		} catch (@Pc(406) RuntimeException local406) {
			signlink.reporterror("84373, " + arg0 + ", " + false + ", " + arg1 + ", " + local406.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
	private void method680(@OriginalArg(0) boolean arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt957; local3++) {
				@Pc(13) Class2_Sub1_Sub1_Sub2_Sub2 local13 = this.aClass2_Sub1_Sub1_Sub2_Sub2Array1[this.anIntArray242[local3]];
				@Pc(22) int local22 = (this.anIntArray242[local3] << 14) + 536870912;
				if (local13 != null && local13.method568(this.anInt946) && local13.aClass48_2.aBoolean187 == arg0 && local13.aClass48_2.method559()) {
					@Pc(44) int local44 = local13.anInt778 >> 7;
					@Pc(49) int local49 = local13.anInt779 >> 7;
					if (local44 >= 0 && local44 < 104 && local49 >= 0 && local49 < 104) {
						if (local13.anInt786 == 1 && (local13.anInt778 & 0x7F) == 64 && (local13.anInt779 & 0x7F) == 64) {
							if (this.anIntArrayArray25[local44][local49] == this.anInt944) {
								continue;
							}
							this.anIntArrayArray25[local44][local49] = this.anInt944;
						}
						if (!local13.aClass48_2.aBoolean189) {
							local22 += Integer.MIN_VALUE;
						}
						this.aClass20_1.method233(local13.anInt779, this.method720(local13.anInt778, this.anInt953, local13.anInt779, this.anInt905), local13.anInt780, local13.anInt778, this.anInt953, (local13.anInt786 - 1) * 64 + 60, local22, local13.aBoolean194, local13);
					}
				}
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("17524, " + arg0 + ", " + -680 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private void method681() {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray261[local5 + 32512] = 255;
				}
			}
			@Pc(47) int local47;
			@Pc(54) int local54;
			@Pc(60) int local60;
			for (local12 = 0; local12 < 100; local12++) {
				local47 = (int) (Math.random() * 124.0D) + 2;
				local54 = (int) (Math.random() * 128.0D) + 128;
				local60 = local47 + (local54 << 7);
				this.anIntArray261[local60] = 192;
			}
			for (local47 = 1; local47 < 255; local47++) {
				for (local54 = 1; local54 < 127; local54++) {
					local60 = local54 + (local47 << 7);
					this.anIntArray262[local60] = (this.anIntArray261[local60 - 1] + this.anIntArray261[local60 + 1] + this.anIntArray261[local60 - 128] + this.anIntArray261[local60 + 128]) / 4;
				}
			}
			this.anInt951 += 128;
			if (this.anInt951 > this.anIntArray253.length) {
				this.anInt951 -= this.anIntArray253.length;
				local54 = (int) (Math.random() * 12.0D);
				this.method618(this.aClass2_Sub1_Sub3_Sub4Array2[local54]);
			}
			@Pc(172) int local172;
			for (local54 = 1; local54 < 255; local54++) {
				for (local60 = 1; local60 < 127; local60++) {
					local172 = local60 + (local54 << 7);
					@Pc(195) int local195 = this.anIntArray262[local172 + 128] - this.anIntArray253[local172 + this.anInt951 & this.anIntArray253.length - 1] / 5;
					if (local195 < 0) {
						local195 = 0;
					}
					this.anIntArray261[local172] = local195;
				}
			}
			for (local60 = 0; local60 < 255; local60++) {
				this.anIntArray257[local60] = this.anIntArray257[local60 + 1];
			}
			this.anIntArray257[255] = (int) (Math.sin((double) anInt993 / 14.0D) * 16.0D + Math.sin((double) anInt993 / 15.0D) * 14.0D + Math.sin((double) anInt993 / 16.0D) * 12.0D);
			if (this.anInt981 > 0) {
				this.anInt981 -= 4;
			}
			if (this.anInt982 > 0) {
				this.anInt982 -= 4;
			}
			if (this.anInt981 == 0 && this.anInt982 == 0) {
				local172 = (int) (Math.random() * 2000.0D);
				if (local172 == 0) {
					this.anInt981 = 1024;
				}
				if (local172 == 1) {
					this.anInt982 = 1024;
					return;
				}
			}
		} catch (@Pc(306) RuntimeException local306) {
			signlink.reporterror("97406, " + false + ", " + local306.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method682() {
		try {
			this.aBoolean218 = true;
			try {
				@Pc(13) long local13 = System.currentTimeMillis();
				@Pc(15) int local15 = 0;
				@Pc(17) int local17 = 20;
				while (this.aBoolean221) {
					this.anInt898++;
					this.method681();
					this.method681();
					this.method661();
					local15++;
					if (local15 > 10) {
						@Pc(40) long local40 = System.currentTimeMillis();
						@Pc(49) int local49 = (int) (local40 - local13) / 10 - local17;
						local17 = 40 - local49;
						if (local17 < 5) {
							local17 = 5;
						}
						local15 = 0;
						local13 = local40;
					}
					try {
						Thread.sleep((long) local17);
					} catch (@Pc(67) Exception local67) {
					}
				}
			} catch (@Pc(73) Exception local73) {
			}
			this.aBoolean218 = false;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("49433, " + -22666 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private void method683() {
		try {
			this.aBoolean217 &= true;
			signlink.aBoolean241 = false;
			signlink.anInt1082 = 0;
			signlink.midi = "stop";
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("67825, " + true + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIII)I")
	private int method684(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = 256 - arg2;
			this.aBoolean217 &= true;
			return ((arg0 & 0xFF00FF) * local3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * local3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("31556, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)Z")
	private boolean method685() {
		try {
			return signlink.wavereplay();
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("93428, " + 589 + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method686() {
		try {
			if (this.anInt887 == 2) {
				for (@Pc(16) Class2_Sub2 local16 = (Class2_Sub2) this.aClass38_10.method461(); local16 != null; local16 = (Class2_Sub2) this.aClass38_10.method463()) {
					if (local16.anInt72 > 0) {
						local16.anInt72--;
					}
					if (local16.anInt72 != 0) {
						if (local16.anInt76 > 0) {
							local16.anInt76--;
						}
						if (local16.anInt76 == 0 && local16.anInt67 >= 1 && local16.anInt68 >= 1 && local16.anInt67 <= 102 && local16.anInt68 <= 102 && (local16.anInt73 < 0 || Class3.method48(local16.anInt75, local16.anInt73))) {
							this.method598(local16.anInt75, local16.anInt74, local16.anInt73, local16.anInt68, local16.anInt65, local16.anInt67, local16.anInt66);
							local16.anInt76 = -1;
							if (local16.anInt73 == local16.anInt69 && local16.anInt69 == -1) {
								local16.method562();
							} else if (local16.anInt73 == local16.anInt69 && local16.anInt74 == local16.anInt70 && local16.anInt75 == local16.anInt71) {
								local16.method562();
							}
						}
					} else if (local16.anInt69 < 0 || Class3.method48(local16.anInt71, local16.anInt69)) {
						this.method598(local16.anInt71, local16.anInt70, local16.anInt69, local16.anInt68, local16.anInt65, local16.anInt67, local16.anInt66);
						local16.method562();
					}
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("2000, " + 183 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
	private void method687() {
		try {
			try {
				if (this.aClass32_1 != null) {
					this.aClass32_1.method420();
				}
			} catch (@Pc(11) Exception local11) {
			}
			this.aClass32_1 = null;
			this.aBoolean217 = false;
			this.anInt1058 = 0;
			this.aString21 = "";
			this.aString22 = "";
			this.method719();
			this.aClass20_1.method222();
			for (@Pc(35) int local35 = 0; local35 < 4; local35++) {
				this.aClass42Array1[local35].method533();
			}
			System.gc();
			this.method683();
			this.anInt1034 = -1;
			this.anInt1009 = -1;
			this.anInt958 = 0;
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("37108, " + false + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)V")
	private void method688(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(17) int local17;
			if (this.aClass1_17 != null) {
				this.aClass1_17.method1(this.aByte34);
				Class2_Sub1_Sub3_Sub1.anIntArray53 = this.anIntArray240;
				local17 = 151;
				if (arg1 != null) {
					local17 -= 7;
				}
				this.aClass2_Sub1_Sub3_Sub2_3.method300(arg0, 257, local17, 0);
				this.aClass2_Sub1_Sub3_Sub2_3.method300(arg0, 256, local17 - 1, 16777215);
				local17 += 15;
				if (arg1 != null) {
					this.aClass2_Sub1_Sub3_Sub2_3.method300(arg1, 257, local17, 0);
					this.aClass2_Sub1_Sub3_Sub2_3.method300(arg1, 256, local17 - 1, 16777215);
				}
				this.aClass1_17.method2(4, 4, super.aGraphics2);
			} else if (super.aClass1_2 != null) {
				super.aClass1_2.method1(this.aByte34);
				Class2_Sub1_Sub3_Sub1.anIntArray53 = this.anIntArray241;
				local17 = 251;
				Class2_Sub1_Sub3.method357(233, 300, 221, 0, 50);
				Class2_Sub1_Sub3.method358(233, 221, 50, 300, 16777215, 149);
				if (arg1 != null) {
					local17 -= 7;
				}
				this.aClass2_Sub1_Sub3_Sub2_3.method300(arg0, 383, local17, 0);
				this.aClass2_Sub1_Sub3_Sub2_3.method300(arg0, 382, local17 - 1, 16777215);
				local17 += 15;
				if (arg1 != null) {
					this.aClass2_Sub1_Sub3_Sub2_3.method300(arg1, 383, local17, 0);
					this.aClass2_Sub1_Sub3_Sub2_3.method300(arg1, 382, local17 - 1, 16777215);
				}
				super.aClass1_2.method2(0, 0, super.aGraphics2);
			}
		} catch (@Pc(171) RuntimeException local171) {
			signlink.reporterror("36912, " + arg0 + ", " + 51 + ", " + arg1 + ", " + local171.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(JB)V")
	private void method689(@OriginalArg(0) long arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg0 != 0L) {
				if (this.anInt954 >= 100 && this.anInt918 != 1) {
					this.method663("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "", this.anInt933);
				} else if (this.anInt954 >= 200) {
					this.method663("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "", this.anInt933);
				} else {
					@Pc(40) String local40 = Class7.method59(Class7.method56(arg0));
					for (@Pc(42) int local42 = 0; local42 < this.anInt954; local42++) {
						if (this.aLongArray4[local42] == arg0) {
							this.method663(local40 + " is already on your friend list", 0, "", this.anInt933);
							return;
						}
					}
					for (@Pc(73) int local73 = 0; local73 < this.anInt1007; local73++) {
						if (this.aLongArray3[local73] == arg0) {
							this.method663("Please remove " + local40 + " from your ignore list first", 0, "", this.anInt933);
							return;
						}
					}
					if (!local40.equals(aClass2_Sub1_Sub1_Sub2_Sub1_1.aString13)) {
						this.aStringArray12[this.anInt954] = local40;
						this.aLongArray4[this.anInt954] = arg0;
						this.anIntArray237[this.anInt954] = 0;
						this.anInt954++;
						@Pc(138) boolean local138 = false;
						this.aBoolean214 = true;
						this.aClass2_Sub1_Sub4_8.method481(172);
						this.aClass2_Sub1_Sub4_8.method488(arg0, this.anInt863);
					}
				}
			}
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("16484, " + arg0 + ", " + arg1 + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIIIIIIILclient!IJNDWVIL;)V")
	private void method690(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class19 arg7) {
		try {
			if (this.aBoolean237) {
				this.anInt1038 = 32;
			} else {
				this.anInt1038 = 0;
			}
			this.aBoolean237 = false;
			if (arg5 >= arg6 && arg5 < arg6 + 16 && arg3 >= arg1 && arg3 < arg1 + 16) {
				arg7.anInt289 -= this.anInt931 * 4;
				if (arg4 == 1) {
					this.aBoolean214 = true;
				}
				if (arg4 == 2 || arg4 == 3) {
					this.aBoolean208 = true;
				}
			} else if (arg5 >= arg6 && arg5 < arg6 + 16 && arg3 >= arg1 + arg0 - 16 && arg3 < arg1 + arg0) {
				arg7.anInt289 += this.anInt931 * 4;
				if (arg4 == 1) {
					this.aBoolean214 = true;
				}
				if (arg4 == 2 || arg4 == 3) {
					this.aBoolean208 = true;
				}
			} else if (arg5 >= arg6 - this.anInt1038 && arg5 < arg6 + this.anInt1038 + 16 && arg3 >= arg1 + 16 && arg3 < arg1 + arg0 - 16 && this.anInt931 > 0) {
				@Pc(143) int local143 = (arg0 - 32) * arg0 / arg2;
				if (local143 < 8) {
					local143 = 8;
				}
				@Pc(158) int local158 = arg3 - arg1 - local143 / 2 - 16;
				@Pc(164) int local164 = arg0 - local143 - 32;
				arg7.anInt289 = (arg2 - arg0) * local158 / local164;
				if (arg4 == 1) {
					this.aBoolean214 = true;
				}
				if (arg4 == 2 || arg4 == 3) {
					this.aBoolean208 = true;
				}
				this.aBoolean237 = true;
			}
		} catch (@Pc(193) RuntimeException local193) {
			signlink.reporterror("19768, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local193.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILclient!TKPFKOXP;)V")
	private void method691(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub4 arg1) {
		try {
			while (true) {
				if (arg1.anInt673 + 21 < arg0 * 8) {
					@Pc(12) int local12 = arg1.method503(14);
					if (local12 != 16383) {
						if (this.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local12] == null) {
							this.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local12] = new Class2_Sub1_Sub1_Sub2_Sub2();
						}
						@Pc(32) Class2_Sub1_Sub1_Sub2_Sub2 local32 = this.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local12];
						this.anIntArray242[this.anInt957++] = local12;
						local32.anInt777 = anInt993;
						@Pc(51) int local51 = arg1.method503(1);
						if (local51 == 1) {
							this.anIntArray244[this.anInt965++] = local12;
						}
						@Pc(70) int local70 = arg1.method503(1);
						local32.aClass48_2 = Class48.method560(arg1.method503(13));
						@Pc(82) int local82 = arg1.method503(5);
						if (local82 > 15) {
							local82 -= 32;
						}
						@Pc(91) int local91 = arg1.method503(5);
						if (local91 > 15) {
							local91 -= 32;
						}
						local32.anInt786 = local32.aClass48_2.aByte25;
						local32.anInt781 = local32.aClass48_2.anInt744;
						local32.anInt773 = local32.aClass48_2.anInt751;
						local32.anInt774 = local32.aClass48_2.anInt759;
						local32.anInt775 = local32.aClass48_2.anInt758;
						local32.anInt776 = local32.aClass48_2.anInt746;
						local32.anInt804 = local32.aClass48_2.anInt747;
						local32.method567(aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray208[0] + local91, local70 == 1, aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray209[0] + local82);
						continue;
					}
				}
				arg1.method504();
				return;
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("44524, " + 5 + ", " + arg0 + ", " + arg1 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BIIIIII)V")
	private void method692(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(5) int local5 = 2048 - arg3 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg5 & 0x7FF;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = arg1;
			@Pc(23) int local23;
			@Pc(27) int local27;
			@Pc(37) int local37;
			if (local5 != 0) {
				local23 = Class2_Sub1_Sub1_Sub6.anIntArray147[local5];
				local27 = Class2_Sub1_Sub1_Sub6.anIntArray148[local5];
				local37 = local27 * 0 - arg1 * local23 >> 16;
				local17 = local23 * 0 + arg1 * local27 >> 16;
				local15 = local37;
			}
			if (local11 != 0) {
				local23 = Class2_Sub1_Sub1_Sub6.anIntArray147[local11];
				local27 = Class2_Sub1_Sub1_Sub6.anIntArray148[local11];
				local37 = local17 * local23 + local27 * 0 >> 16;
				local17 = local17 * local27 - local23 * 0 >> 16;
				local13 = local37;
			}
			this.anInt843 = arg2 - local13;
			this.anInt844 = arg6 - local15;
			this.anInt845 = arg4 - local17;
			this.anInt846 = arg3;
			if (arg0 != 17) {
				anInt1045 = this.aClass13_2.method78();
			}
			this.anInt847 = arg5;
		} catch (@Pc(111) RuntimeException local111) {
			signlink.reporterror("26877, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
	private void method693() {
		try {
			if (this.aClass1_18 == null) {
				this.method632();
				super.aClass1_2 = null;
				this.aClass1_19 = null;
				this.aClass1_20 = null;
				this.aClass1_21 = null;
				this.aClass1_22 = null;
				this.aClass1_23 = null;
				this.aClass1_24 = null;
				this.aClass1_25 = null;
				this.aClass1_26 = null;
				this.aClass1_27 = null;
				this.aClass1_18 = new Class1(96, -826, this.method586(aBoolean205), 479);
				this.aClass1_16 = new Class1(156, -826, this.method586(aBoolean205), 172);
				Class2_Sub1_Sub3.method355();
				this.aClass2_Sub1_Sub3_Sub4_17.method369(0, this.anInt908, 0);
				this.aClass1_15 = new Class1(261, -826, this.method586(aBoolean205), 190);
				this.aClass1_17 = new Class1(334, -826, this.method586(aBoolean205), 512);
				Class2_Sub1_Sub3.method355();
				this.aClass1_12 = new Class1(50, -826, this.method586(aBoolean205), 496);
				this.aClass1_13 = new Class1(37, -826, this.method586(aBoolean205), 269);
				this.aClass1_14 = new Class1(45, -826, this.method586(aBoolean205), 249);
				this.aBoolean209 = true;
				this.aClass1_17.method1(this.aByte34);
				Class2_Sub1_Sub3_Sub1.anIntArray53 = this.anIntArray240;
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("97495, " + false + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(II)Ljava/lang/String;")
	private String method694(@OriginalArg(0) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("84316, " + arg0 + ", " + 0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(Z)V")
	private void method695() {
		try {
			while (true) {
				@Pc(10) Class2_Sub1_Sub2 local10 = this.aClass14_Sub1_1.method83();
				if (local10 == null) {
					return;
				}
				if (local10.anInt78 == 0) {
					Class2_Sub1_Sub1_Sub6.method383(local10.aByteArray1, local10.anInt80);
					if ((this.aClass14_Sub1_1.method91(local10.anInt80) & 0x62) != 0) {
						this.aBoolean214 = true;
						if (this.anInt980 != -1 || this.anInt1072 != -1) {
							this.aBoolean208 = true;
						}
					}
				}
				if (local10.anInt78 == 1 && local10.aByteArray1 != null) {
					Class29.method416(local10.aByteArray1, 767);
				}
				if (local10.anInt78 == 2 && local10.anInt80 == this.anInt1009 && local10.aByteArray1 != null) {
					this.method599(this.aBoolean225, local10.aByteArray1);
				}
				if (local10.anInt78 == 3 && this.anInt887 == 1) {
					for (@Pc(85) int local85 = 0; local85 < this.aByteArrayArray6.length; local85++) {
						if (this.anIntArray220[local85] == local10.anInt80) {
							this.aByteArrayArray6[local85] = local10.aByteArray1;
							if (local10.aByteArray1 == null) {
								this.anIntArray220[local85] = -1;
							}
							break;
						}
						if (this.anIntArray221[local85] == local10.anInt80) {
							this.aByteArrayArray5[local85] = local10.aByteArray1;
							if (local10.aByteArray1 == null) {
								this.anIntArray221[local85] = -1;
							}
							break;
						}
					}
				}
				if (local10.anInt78 == 93 && this.aClass14_Sub1_1.method98(local10.anInt80)) {
					Class3.method34(new Class2_Sub1_Sub4(859, local10.aByteArray1), this.aClass14_Sub1_1);
				}
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("53842, " + false + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	private void method696(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null || arg0.length() == 0) {
				this.anInt1041 = 0;
			} else {
				@Pc(12) String local12 = arg0;
				@Pc(15) String[] local15 = new String[100];
				@Pc(20) int local20 = 0;
				while (true) {
					@Pc(24) int local24 = local12.indexOf(" ");
					if (local24 == -1) {
						local12 = local12.trim();
						if (local12.length() > 0) {
							local15[local20++] = local12.toLowerCase();
						}
						this.anInt1041 = 0;
						label49: for (local24 = 0; local24 < Class36.anInt543; local24++) {
							@Pc(73) Class36 local73 = Class36.method434(local24);
							if (local73.anInt541 == -1 && local73.aString10 != null) {
								@Pc(84) String local84 = local73.aString10.toLowerCase();
								for (@Pc(86) int local86 = 0; local86 < local20; local86++) {
									if (local84.indexOf(local15[local86]) == -1) {
										continue label49;
									}
								}
								this.aStringArray13[this.anInt1041] = local84;
								this.anIntArray263[this.anInt1041] = local24;
								this.anInt1041++;
								if (this.anInt1041 >= this.aStringArray13.length) {
									return;
								}
							}
						}
						return;
					}
					@Pc(33) String local33 = local12.substring(0, local24).trim();
					if (local33.length() > 0) {
						local15[local20++] = local33.toLowerCase();
					}
					local12 = local12.substring(local24 + 1);
				}
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("71616, " + arg0 + ", " + true + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method582(@OriginalArg(0) int arg0) {
		try {
			if (!this.aBoolean213 && !this.aBoolean229 && !this.aBoolean200) {
				anInt993++;
				@Pc(17) boolean local17 = false;
				if (this.aBoolean217) {
					this.method629(this.anInt989);
				} else {
					this.method600();
				}
				this.method695();
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("65429, " + arg0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method697() {
		try {
			this.aClass1_16.method1(this.aByte34);
			if (this.anInt888 == -24060) {
				@Pc(24) int local24;
				@Pc(26) int local26;
				if (this.anInt861 == 2) {
					@Pc(19) byte[] local19 = this.aClass2_Sub1_Sub3_Sub4_17.aByteArray12;
					@Pc(21) int[] local21 = Class2_Sub1_Sub3.anIntArray104;
					local24 = local19.length;
					for (local26 = 0; local26 < local24; local26++) {
						if (local19[local26] == 0) {
							local21[local26] = 0;
						}
					}
					this.aClass2_Sub1_Sub3_Sub3_3.method338(0, 256, 0, this.anIntArray229, this.anInt928, this.anIntArray245, 33, 33, 25, 25);
					this.aClass1_17.method1(this.aByte34);
					Class2_Sub1_Sub3_Sub1.anIntArray53 = this.anIntArray240;
				} else {
					@Pc(74) int local74 = this.anInt928 + this.anInt1070 & 0x7FF;
					@Pc(81) int local81 = aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt778 / 32 + 48;
					local24 = 464 - aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt779 / 32;
					this.aClass2_Sub1_Sub3_Sub3_17.method338(5, this.anInt991 + 256, 25, this.anIntArray234, local74, this.anIntArray259, 151, 146, local24, local81);
					this.aClass2_Sub1_Sub3_Sub3_3.method338(0, 256, 0, this.anIntArray229, this.anInt928, this.anIntArray245, 33, 33, 25, 25);
					for (local26 = 0; local26 < this.anInt1006; local26++) {
						local81 = this.anIntArray251[local26] * 4 + 2 - aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt778 / 32;
						local24 = this.anIntArray252[local26] * 4 + 2 - aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt779 / 32;
						this.method607(this.aClass2_Sub1_Sub3_Sub3Array7[local26], local81, local24);
					}
					@Pc(176) int local176;
					for (@Pc(172) int local172 = 0; local172 < 104; local172++) {
						for (local176 = 0; local176 < 104; local176++) {
							@Pc(188) Class38 local188 = this.aClass38ArrayArrayArray1[this.anInt953][local172][local176];
							if (local188 != null) {
								local81 = local172 * 4 + 2 - aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt778 / 32;
								local24 = local176 * 4 + 2 - aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt779 / 32;
								this.method607(this.aClass2_Sub1_Sub3_Sub3_6, local81, local24);
							}
						}
					}
					for (local176 = 0; local176 < this.anInt957; local176++) {
						@Pc(239) Class2_Sub1_Sub1_Sub2_Sub2 local239 = this.aClass2_Sub1_Sub1_Sub2_Sub2Array1[this.anIntArray242[local176]];
						if (local239 != null && local239.method568(this.anInt946)) {
							@Pc(249) Class48 local249 = local239.aClass48_2;
							if (local249.anIntArray201 != null) {
								local249 = local249.method555();
							}
							if (local249 != null && local249.aBoolean188 && local249.aBoolean189) {
								local81 = local239.anInt778 / 32 - aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt778 / 32;
								local24 = local239.anInt779 / 32 - aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt779 / 32;
								this.method607(this.aClass2_Sub1_Sub3_Sub3_7, local81, local24);
							}
						}
					}
					@Pc(308) Class2_Sub1_Sub1_Sub2_Sub1 local308;
					for (@Pc(298) int local298 = 0; local298 < this.anInt964; local298++) {
						local308 = this.aClass2_Sub1_Sub1_Sub2_Sub1Array1[this.anIntArray243[local298]];
						if (local308 != null && local308.method568(this.anInt946)) {
							local81 = local308.anInt778 / 32 - aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt778 / 32;
							local24 = local308.anInt779 / 32 - aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt779 / 32;
							@Pc(337) boolean local337 = false;
							@Pc(341) long local341 = Class7.method55(local308.aString13);
							for (@Pc(343) int local343 = 0; local343 < this.anInt954; local343++) {
								if (local341 == this.aLongArray4[local343] && this.anIntArray237[local343] != 0) {
									local337 = true;
									break;
								}
							}
							@Pc(368) boolean local368 = false;
							if (aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt655 != 0 && local308.anInt655 != 0 && aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt655 == local308.anInt655) {
								local368 = true;
							}
							if (local337) {
								this.method607(this.aClass2_Sub1_Sub3_Sub3_9, local81, local24);
							} else if (local368) {
								this.method607(this.aClass2_Sub1_Sub3_Sub3_10, local81, local24);
							} else {
								this.method607(this.aClass2_Sub1_Sub3_Sub3_8, local81, local24);
							}
						}
					}
					if (this.anInt938 != 0 && anInt993 % 20 < 10) {
						if (this.anInt938 == 1 && this.anInt1052 >= 0 && this.anInt1052 < this.aClass2_Sub1_Sub1_Sub2_Sub2Array1.length) {
							@Pc(442) Class2_Sub1_Sub1_Sub2_Sub2 local442 = this.aClass2_Sub1_Sub1_Sub2_Sub2Array1[this.anInt1052];
							if (local442 != null) {
								local81 = local442.anInt778 / 32 - aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt778 / 32;
								local24 = local442.anInt779 / 32 - aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt779 / 32;
								this.method670(local24, local81, this.aClass2_Sub1_Sub3_Sub3_12);
							}
						}
						if (this.anInt938 == 2) {
							local81 = (this.anInt850 - this.anInt870) * 4 + 2 - aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt778 / 32;
							local24 = (this.anInt851 - this.anInt871) * 4 + 2 - aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt779 / 32;
							this.method670(local24, local81, this.aClass2_Sub1_Sub3_Sub3_12);
						}
						if (this.anInt938 == 10 && this.anInt859 >= 0 && this.anInt859 < this.aClass2_Sub1_Sub1_Sub2_Sub1Array1.length) {
							local308 = this.aClass2_Sub1_Sub1_Sub2_Sub1Array1[this.anInt859];
							if (local308 != null) {
								local81 = local308.anInt778 / 32 - aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt778 / 32;
								local24 = local308.anInt779 / 32 - aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt779 / 32;
								this.method670(local24, local81, this.aClass2_Sub1_Sub3_Sub3_12);
							}
						}
					}
					if (this.anInt1073 != 0) {
						local81 = this.anInt1073 * 4 + 2 - aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt778 / 32;
						local24 = this.anInt1074 * 4 + 2 - aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt779 / 32;
						this.method607(this.aClass2_Sub1_Sub3_Sub3_11, local81, local24);
					}
					Class2_Sub1_Sub3.method357(97, 3, 78, 16777215, 3);
					this.aClass1_17.method1(this.aByte34);
					Class2_Sub1_Sub3_Sub1.anIntArray53 = this.anIntArray240;
				}
			}
		} catch (@Pc(611) RuntimeException local611) {
			signlink.reporterror("44167, " + -24060 + ", " + local611.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
	private void method698(@OriginalArg(0) byte arg0) {
		try {
			@Pc(3) int local3 = 5;
			this.anIntArray236[8] = 0;
			@Pc(13) boolean local13 = false;
			@Pc(20) int local20 = 0;
			while (this.anIntArray236[8] == 0) {
				@Pc(24) String local24 = "Unknown problem";
				this.method588(20, "Connecting to web server");
				try {
					@Pc(46) DataInputStream local46 = this.method702("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 366);
					@Pc(53) Class2_Sub1_Sub4 local53 = new Class2_Sub1_Sub4(859, new byte[40]);
					local46.readFully(local53.aByteArray17, 0, 40);
					local46.close();
					for (@Pc(63) int local63 = 0; local63 < 9; local63++) {
						this.anIntArray236[local63] = local53.method497();
					}
					@Pc(78) int local78 = local53.method497();
					@Pc(80) int local80 = 1234;
					for (@Pc(82) int local82 = 0; local82 < 9; local82++) {
						local80 = (local80 << 1) + this.anIntArray236[local82];
					}
					if (local78 != local80) {
						local24 = "checksum problem";
						this.anIntArray236[8] = 0;
					}
				} catch (@Pc(109) EOFException local109) {
					local24 = "EOF problem";
					this.anIntArray236[8] = 0;
				} catch (@Pc(118) IOException local118) {
					local24 = "connection problem";
					this.anIntArray236[8] = 0;
				} catch (@Pc(127) Exception local127) {
					local24 = "logic problem";
					this.anIntArray236[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray236[8] == 0) {
					local20++;
					for (@Pc(145) int local145 = local3; local145 > 0; local145--) {
						if (local20 >= 10) {
							this.method588(10, "Game updated - please reload page");
							local145 = 10;
						} else {
							this.method588(10, local24 + " - Will retry in " + local145 + " secs.");
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(179) Exception local179) {
						}
					}
					local3 *= 2;
					if (local3 > 60) {
						local3 = 60;
					}
					this.aBoolean235 = !this.aBoolean235;
				}
			}
		} catch (@Pc(207) RuntimeException local207) {
			signlink.reporterror("8747, " + arg0 + ", " + local207.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!IJNDWVIL;)Z")
	private boolean method699(@OriginalArg(1) Class19 arg0) {
		try {
			if (arg0.anIntArray71 == null) {
				return false;
			}
			for (@Pc(6) int local6 = 0; local6 < arg0.anIntArray71.length; local6++) {
				@Pc(14) int local14 = this.method630(local6, arg0);
				@Pc(19) int local19 = arg0.anIntArray63[local6];
				if (arg0.anIntArray71[local6] == 2) {
					if (local14 >= local19) {
						return false;
					}
				} else if (arg0.anIntArray71[local6] == 3) {
					if (local14 <= local19) {
						return false;
					}
				} else if (arg0.anIntArray71[local6] == 4) {
					if (local14 == local19) {
						return false;
					}
				} else if (local14 != local19) {
					return false;
				}
			}
			return true;
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("69336, " + 0 + ", " + arg0 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!YXSRFNQD;IBI)V")
	private void method700(@OriginalArg(0) int arg0, @OriginalArg(1) Class48 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (this.anInt1053 < 400) {
				if (arg1.anIntArray201 != null) {
					arg1 = arg1.method555();
				}
				if (arg1 != null && arg1.aBoolean189) {
					@Pc(23) String local23 = arg1.aString15;
					if (arg1.anInt761 != 0) {
						local23 = local23 + method675(arg1.anInt761, aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt661) + " (level-" + arg1.anInt761 + ")";
					}
					if (this.anInt995 == 1) {
						this.aStringArray10[this.anInt1053] = "Use " + this.aString25 + " with @yel@" + local23;
						this.anIntArray214[this.anInt1053] = 229;
						this.anIntArray215[this.anInt1053] = arg3;
						this.anIntArray212[this.anInt1053] = arg0;
						this.anIntArray213[this.anInt1053] = arg2;
						this.anInt1053++;
					} else if (this.anInt913 != 1) {
						@Pc(167) int local167;
						if (arg1.aStringArray6 != null) {
							for (local167 = 4; local167 >= 0; local167--) {
								if (arg1.aStringArray6[local167] != null && !arg1.aStringArray6[local167].equalsIgnoreCase("attack")) {
									this.aStringArray10[this.anInt1053] = arg1.aStringArray6[local167] + " @yel@" + local23;
									if (local167 == 0) {
										this.anIntArray214[this.anInt1053] = 990;
									}
									if (local167 == 1) {
										this.anIntArray214[this.anInt1053] = 553;
									}
									if (local167 == 2) {
										this.anIntArray214[this.anInt1053] = 672;
									}
									if (local167 == 3) {
										this.anIntArray214[this.anInt1053] = 81;
									}
									if (local167 == 4) {
										this.anIntArray214[this.anInt1053] = 227;
									}
									this.anIntArray215[this.anInt1053] = arg3;
									this.anIntArray212[this.anInt1053] = arg0;
									this.anIntArray213[this.anInt1053] = arg2;
									this.anInt1053++;
								}
							}
						}
						if (arg1.aStringArray6 != null) {
							for (local167 = 4; local167 >= 0; local167--) {
								if (arg1.aStringArray6[local167] != null && arg1.aStringArray6[local167].equalsIgnoreCase("attack")) {
									@Pc(291) short local291 = 0;
									if (arg1.anInt761 > aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt661) {
										local291 = 2000;
									}
									this.aStringArray10[this.anInt1053] = arg1.aStringArray6[local167] + " @yel@" + local23;
									if (local167 == 0) {
										this.anIntArray214[this.anInt1053] = local291 + 990;
									}
									if (local167 == 1) {
										this.anIntArray214[this.anInt1053] = local291 + 553;
									}
									if (local167 == 2) {
										this.anIntArray214[this.anInt1053] = local291 + 672;
									}
									if (local167 == 3) {
										this.anIntArray214[this.anInt1053] = local291 + 81;
									}
									if (local167 == 4) {
										this.anIntArray214[this.anInt1053] = local291 + 227;
									}
									this.anIntArray215[this.anInt1053] = arg3;
									this.anIntArray212[this.anInt1053] = arg0;
									this.anIntArray213[this.anInt1053] = arg2;
									this.anInt1053++;
								}
							}
						}
						this.aStringArray10[this.anInt1053] = "Examine @yel@" + local23;
						this.anIntArray214[this.anInt1053] = 1071;
						this.anIntArray215[this.anInt1053] = arg3;
						this.anIntArray212[this.anInt1053] = arg0;
						this.anIntArray213[this.anInt1053] = arg2;
						this.anInt1053++;
					} else if ((this.anInt915 & 0x2) == 2) {
						this.aStringArray10[this.anInt1053] = this.aString20 + " @yel@" + local23;
						this.anIntArray214[this.anInt1053] = 764;
						this.anIntArray215[this.anInt1053] = arg3;
						this.anIntArray212[this.anInt1053] = arg0;
						this.anIntArray213[this.anInt1053] = arg2;
						this.anInt1053++;
						return;
					}
				}
			}
		} catch (@Pc(441) RuntimeException local441) {
			signlink.reporterror("37433, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 120 + ", " + arg3 + ", " + local441.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(II)V")
	private void method701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class38 local9 = this.aClass38ArrayArrayArray1[this.anInt953][arg0][arg1];
		if (local9 == null) {
			this.aClass20_1.method243(this.anInt953, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class2_Sub1_Sub1_Sub4 local23 = null;
		@Pc(27) Class2_Sub1_Sub1_Sub4 local27;
		for (local27 = (Class2_Sub1_Sub1_Sub4) local9.method461(); local27 != null; local27 = (Class2_Sub1_Sub1_Sub4) local9.method463()) {
			@Pc(32) Class36 local32 = Class36.method434(local27.anInt161);
			@Pc(35) int local35 = local32.anInt550;
			if (local32.aBoolean144) {
				local35 *= local27.anInt162 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method459(local23);
		@Pc(65) Class2_Sub1_Sub1_Sub4 local65 = null;
		@Pc(67) Class2_Sub1_Sub1_Sub4 local67 = null;
		for (local27 = (Class2_Sub1_Sub1_Sub4) local9.method461(); local27 != null; local27 = (Class2_Sub1_Sub1_Sub4) local9.method463()) {
			if (local27.anInt161 != local23.anInt161 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt161 != local23.anInt161 && local27.anInt161 != local65.anInt161 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass20_1.method229(arg0, this.anInt953, this.method720(arg0 * 128 + 64, this.anInt953, arg1 * 128 + 64, this.anInt905), local23, local110, local65, arg1, local67);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method702(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean235) {
			if (this.aSocket3 != null) {
				try {
					this.aSocket3.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket3 = null;
			}
			this.aSocket3 = this.method671(43595);
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

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)Z")
	private boolean method703() {
		try {
			if (this.aClass32_1 == null) {
				return false;
			}
			@Pc(1070) String local1070;
			@Pc(312) int local312;
			try {
				@Pc(21) int local21 = this.aClass32_1.method422();
				if (local21 == 0) {
					return false;
				}
				if (this.anInt866 == -1) {
					this.aClass32_1.method423(this.aClass2_Sub1_Sub4_6.aByteArray17, 0, 1);
					this.anInt866 = this.aClass2_Sub1_Sub4_6.aByteArray17[0] & 0xFF;
					if (this.aClass13_2 != null) {
						this.anInt866 = this.anInt866 - this.aClass13_2.method78() & 0xFF;
					}
					this.anInt865 = Class5.anIntArray24[this.anInt866];
					local21--;
				}
				if (this.anInt865 == -1) {
					if (local21 <= 0) {
						return false;
					}
					this.aClass32_1.method423(this.aClass2_Sub1_Sub4_6.aByteArray17, 0, 1);
					this.anInt865 = this.aClass2_Sub1_Sub4_6.aByteArray17[0] & 0xFF;
					local21--;
				}
				if (this.anInt865 == -2) {
					if (local21 <= 1) {
						return false;
					}
					this.aClass32_1.method423(this.aClass2_Sub1_Sub4_6.aByteArray17, 0, 2);
					this.aClass2_Sub1_Sub4_6.anInt672 = 0;
					this.anInt865 = this.aClass2_Sub1_Sub4_6.method494();
					local21 -= 2;
				}
				if (local21 < this.anInt865) {
					return false;
				}
				this.aClass2_Sub1_Sub4_6.anInt672 = 0;
				this.aClass32_1.method423(this.aClass2_Sub1_Sub4_6.aByteArray17, 0, this.anInt865);
				this.anInt867 = 0;
				this.anInt1021 = this.anInt1020;
				this.anInt1020 = this.anInt1019;
				this.anInt1019 = this.anInt866;
				@Pc(166) int local166;
				if (this.anInt866 == 255) {
					local166 = this.aClass2_Sub1_Sub4_6.method520();
					Class19.method213(local166).anInt304 = 3;
					if (aClass2_Sub1_Sub1_Sub2_Sub1_1.aClass48_1 == null) {
						Class19.method213(local166).anInt305 = (aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray193[0] << 25) + (aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray193[4] << 20) + (aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray194[0] << 15) + (aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray194[8] << 10) + (aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray194[11] << 5) + aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray194[1];
					} else {
						Class19.method213(local166).anInt305 = (int) (aClass2_Sub1_Sub1_Sub2_Sub1_1.aClass48_1.aLong25 + 305419896L);
					}
					this.anInt866 = -1;
					return true;
				}
				if (this.anInt866 == 165) {
					this.anInt861 = this.aClass2_Sub1_Sub4_6.method492();
					this.anInt866 = -1;
					return true;
				}
				if (this.anInt866 == 203) {
					this.anInt955 = this.aClass2_Sub1_Sub4_6.method492();
					this.aBoolean214 = true;
					this.anInt866 = -1;
					return true;
				}
				@Pc(324) int local324;
				@Pc(329) int local329;
				@Pc(334) int local334;
				@Pc(339) int local339;
				@Pc(350) int local350;
				if (this.anInt866 == 79) {
					this.aBoolean239 = true;
					this.anInt967 = this.aClass2_Sub1_Sub4_6.method492();
					this.anInt968 = this.aClass2_Sub1_Sub4_6.method492();
					this.anInt969 = this.aClass2_Sub1_Sub4_6.method494();
					this.anInt970 = this.aClass2_Sub1_Sub4_6.method492();
					this.anInt971 = this.aClass2_Sub1_Sub4_6.method492();
					if (this.anInt971 >= 100) {
						local166 = this.anInt967 * 128 + 64;
						local312 = this.anInt968 * 128 + 64;
						local324 = this.method720(local166, this.anInt953, local312, this.anInt905) - this.anInt969;
						local329 = local166 - this.anInt843;
						local334 = local324 - this.anInt844;
						local339 = local312 - this.anInt845;
						local350 = (int) Math.sqrt((double) (local329 * local329 + local339 * local339));
						this.anInt846 = (int) (Math.atan2((double) local334, (double) local350) * 325.949D) & 0x7FF;
						this.anInt847 = (int) (Math.atan2((double) local329, (double) local339) * -325.949D) & 0x7FF;
						if (this.anInt846 < 128) {
							this.anInt846 = 128;
						}
						if (this.anInt846 > 383) {
							this.anInt846 = 383;
						}
					}
					this.anInt866 = -1;
					return true;
				}
				if (this.anInt866 == 37) {
					this.anInt1022 = this.aClass2_Sub1_Sub4_6.method492();
					if (this.anInt1022 == this.anInt891) {
						if (this.anInt1022 == 3) {
							this.anInt891 = 1;
						} else {
							this.anInt891 = 3;
						}
						this.aBoolean214 = true;
					}
					this.anInt866 = -1;
					return true;
				}
				if (this.anInt866 == 66) {
					this.anInt999 = this.aClass2_Sub1_Sub4_6.method494();
					this.anInt918 = this.aClass2_Sub1_Sub4_6.method510(this.aByte37);
					this.anInt866 = -1;
					return true;
				}
				if (this.anInt866 == 72) {
					this.anInt1044 = this.aClass2_Sub1_Sub4_6.method519();
					this.anInt858 = this.aClass2_Sub1_Sub4_6.method519();
					this.anInt956 = this.aClass2_Sub1_Sub4_6.method519();
					this.anInt945 = this.aClass2_Sub1_Sub4_6.method519();
					this.aClass2_Sub1_Sub4_6.method511(435);
					this.anInt921 = this.aClass2_Sub1_Sub4_6.method494();
					this.anInt1008 = this.aClass2_Sub1_Sub4_6.method519();
					this.anInt1002 = this.aClass2_Sub1_Sub4_6.method494();
					this.aClass2_Sub1_Sub4_6.method520();
					this.anInt907 = this.aClass2_Sub1_Sub4_6.method528();
					this.anInt1030 = this.aClass2_Sub1_Sub4_6.method494();
					signlink.dnslookup(Class7.method58(this.anInt907));
					this.anInt866 = -1;
					return true;
				}
				if (this.anInt866 == 148) {
					this.aBoolean236 = false;
					this.anInt1015 = 2;
					this.aString31 = "";
					this.aBoolean208 = true;
					this.anInt866 = -1;
					return true;
				}
				@Pc(558) Class19 local558;
				if (this.anInt866 == 56) {
					this.aBoolean214 = true;
					local166 = this.aClass2_Sub1_Sub4_6.method494();
					local558 = Class19.method213(local166);
					while (this.aClass2_Sub1_Sub4_6.anInt672 < this.anInt865) {
						local324 = this.aClass2_Sub1_Sub4_6.method506();
						local329 = this.aClass2_Sub1_Sub4_6.method494();
						local334 = this.aClass2_Sub1_Sub4_6.method492();
						if (local334 == 255) {
							local334 = this.aClass2_Sub1_Sub4_6.method497();
						}
						if (local324 >= 0 && local324 < local558.anIntArray67.length) {
							local558.anIntArray67[local324] = local329;
							local558.anIntArray64[local324] = local334;
						}
					}
					this.anInt866 = -1;
					return true;
				}
				if (this.anInt866 == 215) {
					this.anInt1057 = this.aClass2_Sub1_Sub4_6.method512();
					this.anInt1056 = this.aClass2_Sub1_Sub4_6.method511(435);
					for (local166 = this.anInt1056; local166 < this.anInt1056 + 8; local166++) {
						for (local312 = this.anInt1057; local312 < this.anInt1057 + 8; local312++) {
							if (this.aClass38ArrayArrayArray1[this.anInt953][local166][local312] != null) {
								this.aClass38ArrayArrayArray1[this.anInt953][local166][local312] = null;
								this.method701(local166, local312);
							}
						}
					}
					for (@Pc(676) Class2_Sub2 local676 = (Class2_Sub2) this.aClass38_10.method461(); local676 != null; local676 = (Class2_Sub2) this.aClass38_10.method463()) {
						if (local676.anInt67 >= this.anInt1056 && local676.anInt67 < this.anInt1056 + 8 && local676.anInt68 >= this.anInt1057 && local676.anInt68 < this.anInt1057 + 8 && local676.anInt65 == this.anInt953) {
							local676.anInt72 = 0;
						}
					}
					this.anInt866 = -1;
					return true;
				}
				if (this.anInt866 == 235) {
					local166 = this.aClass2_Sub1_Sub4_6.method521();
					if (local166 == 65535) {
						local166 = -1;
					}
					if (local166 != this.anInt1034 && this.aBoolean231 && !aBoolean227 && this.anInt958 == 0) {
						this.anInt1009 = local166;
						this.aBoolean225 = true;
						this.aClass14_Sub1_1.method87(2, this.anInt1009);
					}
					this.anInt1034 = local166;
					this.anInt866 = -1;
					return true;
				}
				if (this.anInt866 == 179) {
					local166 = this.aClass2_Sub1_Sub4_6.method521();
					local312 = this.aClass2_Sub1_Sub4_6.method525();
					if (this.aBoolean231 && !aBoolean227) {
						this.anInt1009 = local166;
						this.aBoolean225 = false;
						this.aClass14_Sub1_1.method87(2, this.anInt1009);
						this.anInt958 = local312;
					}
					this.anInt866 = -1;
					return true;
				}
				if (this.anInt866 == 174) {
					local166 = this.aClass2_Sub1_Sub4_6.method519();
					this.method627(local166);
					if (this.anInt966 != -1) {
						this.method705(this.anInt966);
						this.anInt966 = -1;
						this.aBoolean214 = true;
						this.aBoolean206 = true;
					}
					if (this.anInt879 != -1) {
						this.method705(this.anInt879);
						this.anInt879 = -1;
						this.aBoolean209 = true;
					}
					if (this.anInt895 != -1) {
						this.method705(this.anInt895);
						this.anInt895 = -1;
					}
					if (this.anInt947 != -1) {
						this.method705(this.anInt947);
						this.anInt947 = -1;
					}
					if (this.anInt980 != local166) {
						this.method705(this.anInt980);
						this.anInt980 = local166;
					}
					this.aBoolean211 = false;
					this.aBoolean208 = true;
					this.anInt866 = -1;
					return true;
				}
				if (this.anInt866 == 111) {
					this.anInt1007 = this.anInt865 / 8;
					for (local166 = 0; local166 < this.anInt1007; local166++) {
						this.aLongArray3[local166] = this.aClass2_Sub1_Sub4_6.method498();
					}
					this.anInt866 = -1;
					return true;
				}
				if (this.anInt866 != 44 && this.anInt866 != 110 && this.anInt866 != 58 && this.anInt866 != 40 && this.anInt866 != 145 && this.anInt866 != 90 && this.anInt866 != 146 && this.anInt866 != 142 && this.anInt866 != 33 && this.anInt866 != 16 && this.anInt866 != 197) {
					@Pc(1007) Class19 local1007;
					if (this.anInt866 == 64) {
						local166 = this.aClass2_Sub1_Sub4_6.method520();
						local312 = this.aClass2_Sub1_Sub4_6.method520();
						local1007 = Class19.method213(local166);
						if (local1007 != null && local1007.anInt310 == 0) {
							if (local312 < 0) {
								local312 = 0;
							}
							if (local312 > local1007.anInt292 - local1007.anInt302) {
								local312 = local1007.anInt292 - local1007.anInt302;
							}
							local1007.anInt289 = local312;
						}
						this.anInt866 = -1;
						return true;
					}
					if (this.anInt866 == 138) {
						this.aBoolean239 = false;
						for (local166 = 0; local166 < 5; local166++) {
							this.aBooleanArray11[local166] = false;
						}
						this.anInt866 = -1;
						return true;
					}
					@Pc(1081) String local1081;
					@Pc(1086) boolean local1086;
					@Pc(1223) String local1223;
					if (this.anInt866 == 247) {
						local1070 = this.aClass2_Sub1_Sub4_6.method499();
						@Pc(1084) long local1084;
						if (local1070.endsWith(":tradereq:")) {
							local1081 = local1070.substring(0, local1070.indexOf(":"));
							local1084 = Class7.method55(local1081);
							local1086 = false;
							for (local339 = 0; local339 < this.anInt1007; local339++) {
								if (this.aLongArray3[local339] == local1084) {
									local1086 = true;
									break;
								}
							}
							if (!local1086 && this.anInt1027 == 0) {
								this.method663("wishes to trade with you.", 4, local1081, this.anInt933);
							}
						} else if (local1070.endsWith(":duelreq:")) {
							local1081 = local1070.substring(0, local1070.indexOf(":"));
							local1084 = Class7.method55(local1081);
							local1086 = false;
							for (local339 = 0; local339 < this.anInt1007; local339++) {
								if (this.aLongArray3[local339] == local1084) {
									local1086 = true;
									break;
								}
							}
							if (!local1086 && this.anInt1027 == 0) {
								this.method663("wishes to duel with you.", 8, local1081, this.anInt933);
							}
						} else if (local1070.endsWith(":chalreq:")) {
							local1081 = local1070.substring(0, local1070.indexOf(":"));
							local1084 = Class7.method55(local1081);
							local1086 = false;
							for (local339 = 0; local339 < this.anInt1007; local339++) {
								if (this.aLongArray3[local339] == local1084) {
									local1086 = true;
									break;
								}
							}
							if (!local1086 && this.anInt1027 == 0) {
								local1223 = local1070.substring(local1070.indexOf(":") + 1, local1070.length() - 9);
								this.method663(local1223, 8, local1081, this.anInt933);
							}
						} else {
							this.method663(local1070, 0, "", this.anInt933);
						}
						this.anInt866 = -1;
						return true;
					}
					if (this.anInt866 == 120) {
						this.aBoolean236 = false;
						this.anInt1015 = 1;
						this.aString31 = "";
						this.aBoolean208 = true;
						this.anInt866 = -1;
						return true;
					}
					if (this.anInt866 != 211) {
						if (this.anInt866 == 202) {
							this.anInt1056 = this.aClass2_Sub1_Sub4_6.method492();
							this.anInt1057 = this.aClass2_Sub1_Sub4_6.method512();
							this.anInt866 = -1;
							return true;
						}
						if (this.anInt866 == 125) {
							local166 = this.aClass2_Sub1_Sub4_6.method494();
							local558 = Class19.method213(local166);
							for (local324 = 0; local324 < local558.anIntArray67.length; local324++) {
								local558.anIntArray67[local324] = -1;
								local558.anIntArray67[local324] = 0;
							}
							this.anInt866 = -1;
							return true;
						}
						if (this.anInt866 == 204) {
							this.anInt938 = this.aClass2_Sub1_Sub4_6.method492();
							if (this.anInt938 == 1) {
								this.anInt1052 = this.aClass2_Sub1_Sub4_6.method494();
							}
							if (this.anInt938 >= 2 && this.anInt938 <= 6) {
								if (this.anInt938 == 2) {
									this.anInt853 = 64;
									this.anInt854 = 64;
								}
								if (this.anInt938 == 3) {
									this.anInt853 = 0;
									this.anInt854 = 64;
								}
								if (this.anInt938 == 4) {
									this.anInt853 = 128;
									this.anInt854 = 64;
								}
								if (this.anInt938 == 5) {
									this.anInt853 = 64;
									this.anInt854 = 0;
								}
								if (this.anInt938 == 6) {
									this.anInt853 = 64;
									this.anInt854 = 128;
								}
								this.anInt938 = 2;
								this.anInt850 = this.aClass2_Sub1_Sub4_6.method494();
								this.anInt851 = this.aClass2_Sub1_Sub4_6.method494();
								this.anInt852 = this.aClass2_Sub1_Sub4_6.method492();
							}
							if (this.anInt938 == 10) {
								this.anInt859 = this.aClass2_Sub1_Sub4_6.method494();
							}
							this.anInt866 = -1;
							return true;
						}
						if (this.anInt866 == 196) {
							local166 = this.aClass2_Sub1_Sub4_6.method521();
							local312 = this.aClass2_Sub1_Sub4_6.method494();
							local324 = this.aClass2_Sub1_Sub4_6.method494();
							local329 = this.aClass2_Sub1_Sub4_6.method521();
							Class19.method213(local329).anInt295 = local312;
							Class19.method213(local329).anInt296 = local324;
							Class19.method213(local329).anInt294 = local166;
							this.anInt866 = -1;
							return true;
						}
						if (this.anInt866 == 112) {
							this.method687();
							this.anInt866 = -1;
							return false;
						}
						if (this.anInt866 == 129) {
							this.anInt924 = this.aClass2_Sub1_Sub4_6.method519() * 30;
							this.anInt866 = -1;
							return true;
						}
						if (this.anInt866 == 124) {
							local166 = this.aClass2_Sub1_Sub4_6.method494();
							local312 = this.aClass2_Sub1_Sub4_6.method520();
							Class19.method213(local312).anInt304 = 2;
							Class19.method213(local312).anInt305 = local166;
							this.anInt866 = -1;
							return true;
						}
						if (this.anInt866 == 42) {
							@Pc(1634) byte local1634 = this.aClass2_Sub1_Sub4_6.method513();
							local312 = this.aClass2_Sub1_Sub4_6.method521();
							this.anIntArray246[local312] = local1634;
							if (this.anIntArray250[local312] != local1634) {
								this.anIntArray250[local312] = local1634;
								this.method715(local312);
								this.aBoolean214 = true;
								if (this.anInt1072 != -1) {
									this.aBoolean208 = true;
								}
							}
							this.anInt866 = -1;
							return true;
						}
						if (this.anInt866 == 32) {
							local166 = this.aClass2_Sub1_Sub4_6.method523(this.aBoolean212);
							if (local166 >= 0) {
								this.method627(local166);
							}
							if (local166 != this.anInt1059) {
								this.method705(this.anInt1059);
								this.anInt1059 = local166;
							}
							this.anInt866 = -1;
							return true;
						}
						if (this.anInt866 == 81) {
							this.anInt1073 = 0;
							this.anInt866 = -1;
							return true;
						}
						if (this.anInt866 == 39) {
							this.anInt1057 = this.aClass2_Sub1_Sub4_6.method511(435);
							this.anInt1056 = this.aClass2_Sub1_Sub4_6.method512();
							while (this.aClass2_Sub1_Sub4_6.anInt672 < this.anInt865) {
								local166 = this.aClass2_Sub1_Sub4_6.method492();
								this.method712(this.anInt1017, this.aClass2_Sub1_Sub4_6, local166);
							}
							this.anInt866 = -1;
							return true;
						}
						if (this.anInt866 == 73) {
							for (local166 = 0; local166 < this.anIntArray250.length; local166++) {
								if (this.anIntArray250[local166] != this.anIntArray246[local166]) {
									this.anIntArray250[local166] = this.anIntArray246[local166];
									this.method715(local166);
									this.aBoolean214 = true;
								}
							}
							this.anInt866 = -1;
							return true;
						}
						if (this.anInt866 == 95) {
							local166 = this.aClass2_Sub1_Sub4_6.method492();
							local312 = this.aClass2_Sub1_Sub4_6.method520();
							if (local312 == 65535) {
								local312 = -1;
							}
							if (this.anIntArray226[local166] != local312) {
								this.method705(this.anIntArray226[local166]);
								this.anIntArray226[local166] = local312;
							}
							this.aBoolean214 = true;
							this.aBoolean206 = true;
							this.anInt866 = -1;
							return true;
						}
						if (this.anInt866 == 224) {
							this.anInt891 = this.aClass2_Sub1_Sub4_6.method510(this.aByte37);
							this.aBoolean214 = true;
							this.aBoolean206 = true;
							this.anInt866 = -1;
							return true;
						}
						if (this.anInt866 == 149) {
							local166 = this.aClass2_Sub1_Sub4_6.method521();
							local312 = this.aClass2_Sub1_Sub4_6.method494();
							local324 = this.aClass2_Sub1_Sub4_6.method521();
							Class19.method213(local166).anInt300 = (local324 << 16) + local312;
							this.anInt866 = -1;
							return true;
						}
						@Pc(2262) int local2262;
						if (this.anInt866 == 136 || this.anInt866 == 244) {
							local166 = this.anInt855;
							local312 = this.anInt856;
							if (this.anInt866 == 136) {
								local312 = this.aClass2_Sub1_Sub4_6.method494();
								local166 = this.aClass2_Sub1_Sub4_6.method494();
								this.aBoolean223 = false;
							}
							if (this.anInt866 == 244) {
								this.aClass2_Sub1_Sub4_6.method502((byte) 5);
								local324 = 0;
								while (true) {
									if (local324 >= 4) {
										this.aClass2_Sub1_Sub4_6.method504();
										local312 = this.aClass2_Sub1_Sub4_6.method521();
										local166 = this.aClass2_Sub1_Sub4_6.method519();
										this.aBoolean223 = true;
										break;
									}
									for (local329 = 0; local329 < 13; local329++) {
										for (local334 = 0; local334 < 13; local334++) {
											local339 = this.aClass2_Sub1_Sub4_6.method503(1);
											if (local339 == 1) {
												this.anIntArrayArrayArray7[local324][local329][local334] = this.aClass2_Sub1_Sub4_6.method503(26);
											} else {
												this.anIntArrayArrayArray7[local324][local329][local334] = -1;
											}
										}
									}
									local324++;
								}
							}
							if (this.anInt855 == local166 && this.anInt856 == local312 && this.anInt887 == 2) {
								this.anInt866 = -1;
								return true;
							}
							this.anInt855 = local166;
							this.anInt856 = local312;
							this.anInt870 = (this.anInt855 - 6) * 8;
							this.anInt871 = (this.anInt856 - 6) * 8;
							this.aBoolean240 = false;
							if ((this.anInt855 / 8 == 48 || this.anInt855 / 8 == 49) && this.anInt856 / 8 == 48) {
								this.aBoolean240 = true;
							}
							if (this.anInt855 / 8 == 48 && this.anInt856 / 8 == 148) {
								this.aBoolean240 = true;
							}
							this.anInt887 = 1;
							this.aLong31 = System.currentTimeMillis();
							this.method688("Loading - please wait.", null);
							if (this.anInt866 == 136) {
								local324 = 0;
								local329 = (this.anInt855 - 6) / 8;
								label1224: while (true) {
									if (local329 > (this.anInt855 + 6) / 8) {
										this.aByteArrayArray6 = new byte[local324][];
										this.aByteArrayArray5 = new byte[local324][];
										this.anIntArray219 = new int[local324];
										this.anIntArray220 = new int[local324];
										this.anIntArray221 = new int[local324];
										local324 = 0;
										local334 = (this.anInt855 - 6) / 8;
										while (true) {
											if (local334 > (this.anInt855 + 6) / 8) {
												break label1224;
											}
											for (local339 = (this.anInt856 - 6) / 8; local339 <= (this.anInt856 + 6) / 8; local339++) {
												this.anIntArray219[local324] = (local334 << 8) + local339;
												if (this.aBoolean240 && (local339 == 49 || local339 == 149 || local339 == 147 || local334 == 50 || local334 == 49 && local339 == 47)) {
													this.anIntArray220[local324] = -1;
													this.anIntArray221[local324] = -1;
													local324++;
												} else {
													local350 = this.anIntArray220[local324] = this.aClass14_Sub1_1.method96(0, local339, local334);
													if (local350 != -1) {
														this.aClass14_Sub1_1.method87(3, local350);
													}
													local2262 = this.anIntArray221[local324] = this.aClass14_Sub1_1.method96(1, local339, local334);
													if (local2262 != -1) {
														this.aClass14_Sub1_1.method87(3, local2262);
													}
													local324++;
												}
											}
											local334++;
										}
									}
									for (local334 = (this.anInt856 - 6) / 8; local334 <= (this.anInt856 + 6) / 8; local334++) {
										local324++;
									}
									local329++;
								}
							}
							if (this.anInt866 == 244) {
								local324 = 0;
								@Pc(2298) int[] local2298 = new int[676];
								local334 = 0;
								label1185: while (true) {
									@Pc(2344) int local2344;
									@Pc(2328) int local2328;
									@Pc(2334) int local2334;
									if (local334 >= 4) {
										this.aByteArrayArray6 = new byte[local324][];
										this.aByteArrayArray5 = new byte[local324][];
										this.anIntArray219 = new int[local324];
										this.anIntArray220 = new int[local324];
										this.anIntArray221 = new int[local324];
										local339 = 0;
										while (true) {
											if (local339 >= local324) {
												break label1185;
											}
											local350 = this.anIntArray219[local339] = local2298[local339];
											local2262 = local350 >> 8 & 0xFF;
											local2328 = local350 & 0xFF;
											local2334 = this.anIntArray220[local339] = this.aClass14_Sub1_1.method96(0, local2328, local2262);
											if (local2334 != -1) {
												this.aClass14_Sub1_1.method87(3, local2334);
											}
											local2344 = this.anIntArray221[local339] = this.aClass14_Sub1_1.method96(1, local2328, local2262);
											if (local2344 != -1) {
												this.aClass14_Sub1_1.method87(3, local2344);
											}
											local339++;
										}
									}
									for (local339 = 0; local339 < 13; local339++) {
										for (local350 = 0; local350 < 13; local350++) {
											local2262 = this.anIntArrayArrayArray7[local334][local339][local350];
											if (local2262 != -1) {
												local2328 = local2262 >> 14 & 0x3FF;
												local2334 = local2262 >> 3 & 0x7FF;
												local2344 = (local2328 / 8 << 8) + local2334 / 8;
												for (@Pc(2346) int local2346 = 0; local2346 < local324; local2346++) {
													if (local2298[local2346] == local2344) {
														local2344 = -1;
														break;
													}
												}
												if (local2344 != -1) {
													local2298[local324++] = local2344;
												}
											}
										}
									}
									local334++;
								}
							}
							local324 = this.anInt870 - this.anInt872;
							local329 = this.anInt871 - this.anInt873;
							this.anInt872 = this.anInt870;
							this.anInt873 = this.anInt871;
							for (local334 = 0; local334 < 16384; local334++) {
								@Pc(2499) Class2_Sub1_Sub1_Sub2_Sub2 local2499 = this.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local334];
								if (local2499 != null) {
									for (local350 = 0; local350 < 10; local350++) {
										local2499.anIntArray208[local350] -= local324;
										local2499.anIntArray209[local350] -= local329;
									}
									local2499.anInt778 -= local324 * 128;
									local2499.anInt779 -= local329 * 128;
								}
							}
							for (local339 = 0; local339 < this.anInt962; local339++) {
								@Pc(2554) Class2_Sub1_Sub1_Sub2_Sub1 local2554 = this.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local339];
								if (local2554 != null) {
									for (local2262 = 0; local2262 < 10; local2262++) {
										local2554.anIntArray208[local2262] -= local324;
										local2554.anIntArray209[local2262] -= local329;
									}
									local2554.anInt778 -= local324 * 128;
									local2554.anInt779 -= local329 * 128;
								}
							}
							this.aBoolean203 = true;
							@Pc(2606) byte local2606 = 0;
							@Pc(2608) byte local2608 = 104;
							@Pc(2610) byte local2610 = 1;
							if (local324 < 0) {
								local2606 = 103;
								local2608 = -1;
								local2610 = -1;
							}
							@Pc(2620) byte local2620 = 0;
							@Pc(2622) byte local2622 = 104;
							@Pc(2624) byte local2624 = 1;
							if (local329 < 0) {
								local2620 = 103;
								local2622 = -1;
								local2624 = -1;
							}
							for (@Pc(2634) int local2634 = local2606; local2634 != local2608; local2634 += local2610) {
								for (@Pc(2638) int local2638 = local2620; local2638 != local2622; local2638 += local2624) {
									@Pc(2644) int local2644 = local2634 + local324;
									@Pc(2648) int local2648 = local2638 + local329;
									for (@Pc(2650) int local2650 = 0; local2650 < 4; local2650++) {
										if (local2644 >= 0 && local2648 >= 0 && local2644 < 104 && local2648 < 104) {
											this.aClass38ArrayArrayArray1[local2650][local2634][local2638] = this.aClass38ArrayArrayArray1[local2650][local2644][local2648];
										} else {
											this.aClass38ArrayArrayArray1[local2650][local2634][local2638] = null;
										}
									}
								}
							}
							for (@Pc(2712) Class2_Sub2 local2712 = (Class2_Sub2) this.aClass38_10.method461(); local2712 != null; local2712 = (Class2_Sub2) this.aClass38_10.method463()) {
								local2712.anInt67 -= local324;
								local2712.anInt68 -= local329;
								if (local2712.anInt67 < 0 || local2712.anInt68 < 0 || local2712.anInt67 >= 104 || local2712.anInt68 >= 104) {
									local2712.method562();
								}
							}
							if (this.anInt1073 != 0) {
								this.anInt1073 -= local324;
								this.anInt1074 -= local329;
							}
							this.aBoolean239 = false;
							this.anInt866 = -1;
							return true;
						}
						if (this.anInt866 == 246) {
							if (this.anInt891 == 12) {
								this.aBoolean214 = true;
							}
							this.anInt978 = this.aClass2_Sub1_Sub4_6.method492();
							this.anInt866 = -1;
							return true;
						}
						if (this.anInt866 == 243) {
							local166 = this.aClass2_Sub1_Sub4_6.method519();
							this.method627(local166);
							if (this.anInt966 != -1) {
								this.method705(this.anInt966);
								this.anInt966 = -1;
								this.aBoolean214 = true;
								this.aBoolean206 = true;
							}
							if (this.anInt980 != -1) {
								this.method705(this.anInt980);
								this.anInt980 = -1;
								this.aBoolean208 = true;
							}
							if (this.anInt879 != -1) {
								this.method705(this.anInt879);
								this.anInt879 = -1;
								this.aBoolean209 = true;
							}
							if (this.anInt895 != -1) {
								this.method705(this.anInt895);
								this.anInt895 = -1;
							}
							if (this.anInt947 != local166) {
								this.method705(this.anInt947);
								this.anInt947 = local166;
							}
							if (this.anInt1015 != 0) {
								this.anInt1015 = 0;
								this.aBoolean208 = true;
							}
							this.aBoolean211 = false;
							this.anInt866 = -1;
							return true;
						}
						if (this.anInt866 == 70) {
							if (this.anInt966 != -1) {
								this.method705(this.anInt966);
								this.anInt966 = -1;
								this.aBoolean214 = true;
								this.aBoolean206 = true;
							}
							if (this.anInt980 != -1) {
								this.method705(this.anInt980);
								this.anInt980 = -1;
								this.aBoolean208 = true;
							}
							if (this.anInt879 != -1) {
								this.method705(this.anInt879);
								this.anInt879 = -1;
								this.aBoolean209 = true;
							}
							if (this.anInt895 != -1) {
								this.method705(this.anInt895);
								this.anInt895 = -1;
							}
							if (this.anInt947 != -1) {
								this.method705(this.anInt947);
								this.anInt947 = -1;
							}
							if (this.anInt1015 != 0) {
								this.anInt1015 = 0;
								this.aBoolean208 = true;
							}
							this.aBoolean211 = false;
							this.anInt866 = -1;
							return true;
						}
						@Pc(2998) long local2998;
						if (this.anInt866 == 36) {
							local2998 = this.aClass2_Sub1_Sub4_6.method498();
							local324 = this.aClass2_Sub1_Sub4_6.method492();
							@Pc(3008) String local3008 = Class7.method59(Class7.method56(local2998));
							for (local334 = 0; local334 < this.anInt954; local334++) {
								if (local2998 == this.aLongArray4[local334]) {
									if (this.anIntArray237[local334] != local324) {
										this.anIntArray237[local334] = local324;
										this.aBoolean214 = true;
										if (local324 > 0) {
											this.method663(local3008 + " has logged in.", 5, "", this.anInt933);
										}
										if (local324 == 0) {
											this.method663(local3008 + " has logged out.", 5, "", this.anInt933);
										}
									}
									local3008 = null;
									break;
								}
							}
							if (local3008 != null && this.anInt954 < 200) {
								this.aLongArray4[this.anInt954] = local2998;
								this.aStringArray12[this.anInt954] = local3008;
								this.anIntArray237[this.anInt954] = local324;
								this.anInt954++;
								this.aBoolean214 = true;
							}
							@Pc(3108) boolean local3108 = false;
							while (!local3108) {
								local3108 = true;
								for (local350 = 0; local350 < this.anInt954 - 1; local350++) {
									if (this.anIntArray237[local350] != anInt1013 && this.anIntArray237[local350 + 1] == anInt1013 || this.anIntArray237[local350] == 0 && this.anIntArray237[local350 + 1] != 0) {
										local2262 = this.anIntArray237[local350];
										this.anIntArray237[local350] = this.anIntArray237[local350 + 1];
										this.anIntArray237[local350 + 1] = local2262;
										@Pc(3169) String local3169 = this.aStringArray12[local350];
										this.aStringArray12[local350] = this.aStringArray12[local350 + 1];
										this.aStringArray12[local350 + 1] = local3169;
										@Pc(3191) long local3191 = this.aLongArray4[local350];
										this.aLongArray4[local350] = this.aLongArray4[local350 + 1];
										this.aLongArray4[local350 + 1] = local3191;
										this.aBoolean214 = true;
										local3108 = false;
									}
								}
							}
							this.anInt866 = -1;
							return true;
						}
						if (this.anInt866 == 53) {
							local2998 = this.aClass2_Sub1_Sub4_6.method498();
							local324 = this.aClass2_Sub1_Sub4_6.method497();
							local329 = this.aClass2_Sub1_Sub4_6.method492();
							local1086 = false;
							for (local339 = 0; local339 < 100; local339++) {
								if (this.anIntArray225[local339] == local324) {
									local1086 = true;
									break;
								}
							}
							if (local329 <= 1) {
								for (local350 = 0; local350 < this.anInt1007; local350++) {
									if (this.aLongArray3[local350] == local2998) {
										local1086 = true;
										break;
									}
								}
							}
							if (!local1086 && this.anInt1027 == 0) {
								try {
									this.anIntArray225[this.anInt1043] = local324;
									this.anInt1043 = (this.anInt1043 + 1) % 100;
									local1223 = Class47.method551(this.anInt865 - 13, this.aClass2_Sub1_Sub4_6);
									if (local329 != 3) {
										local1223 = Class18.method183(local1223);
									}
									if (local329 == 2 || local329 == 3) {
										this.method663(local1223, 7, "@cr2@" + Class7.method59(Class7.method56(local2998)), this.anInt933);
									} else if (local329 == 1) {
										this.method663(local1223, 7, "@cr1@" + Class7.method59(Class7.method56(local2998)), this.anInt933);
									} else {
										this.method663(local1223, 3, Class7.method59(Class7.method56(local2998)), this.anInt933);
									}
								} catch (@Pc(3382) Exception local3382) {
									signlink.reporterror("cde1");
								}
							}
							this.anInt866 = -1;
							return true;
						}
						if (this.anInt866 == 183) {
							if (this.anInt891 == 12) {
								this.aBoolean214 = true;
							}
							this.anInt893 = this.aClass2_Sub1_Sub4_6.method495();
							this.anInt866 = -1;
							return true;
						}
						if (this.anInt866 == 47) {
							this.aBoolean239 = true;
							this.anInt939 = this.aClass2_Sub1_Sub4_6.method492();
							this.anInt940 = this.aClass2_Sub1_Sub4_6.method492();
							this.anInt941 = this.aClass2_Sub1_Sub4_6.method494();
							this.anInt942 = this.aClass2_Sub1_Sub4_6.method492();
							this.anInt943 = this.aClass2_Sub1_Sub4_6.method492();
							if (this.anInt943 >= 100) {
								this.anInt843 = this.anInt939 * 128 + 64;
								this.anInt845 = this.anInt940 * 128 + 64;
								this.anInt844 = this.method720(this.anInt843, this.anInt953, this.anInt845, this.anInt905) - this.anInt941;
							}
							this.anInt866 = -1;
							return true;
						}
						if (this.anInt866 == 218) {
							this.aBoolean214 = true;
							local166 = this.aClass2_Sub1_Sub4_6.method494();
							local558 = Class19.method213(local166);
							local324 = this.aClass2_Sub1_Sub4_6.method494();
							for (local329 = 0; local329 < local324; local329++) {
								local334 = this.aClass2_Sub1_Sub4_6.method510(this.aByte37);
								if (local334 == 255) {
									local334 = this.aClass2_Sub1_Sub4_6.method527();
								}
								local558.anIntArray67[local329] = this.aClass2_Sub1_Sub4_6.method521();
								local558.anIntArray64[local329] = local334;
							}
							for (local334 = local324; local334 < local558.anIntArray67.length; local334++) {
								local558.anIntArray67[local334] = 0;
								local558.anIntArray64[local334] = 0;
							}
							this.anInt866 = -1;
							return true;
						}
						if (this.anInt866 == 49) {
							this.method592(this.anInt865, this.aClass2_Sub1_Sub4_6);
							this.anInt866 = -1;
							return true;
						}
						if (this.anInt866 == 80) {
							local166 = this.aClass2_Sub1_Sub4_6.method521();
							local312 = this.aClass2_Sub1_Sub4_6.method521();
							local324 = this.aClass2_Sub1_Sub4_6.method519();
							if (local324 == 65535) {
								Class19.method213(local166).anInt304 = 0;
								this.anInt866 = -1;
								return true;
							}
							@Pc(3611) Class36 local3611 = Class36.method434(local324);
							Class19.method213(local166).anInt304 = 4;
							Class19.method213(local166).anInt305 = local324;
							Class19.method213(local166).anInt295 = local3611.anInt557;
							Class19.method213(local166).anInt296 = local3611.anInt545;
							Class19.method213(local166).anInt294 = local3611.anInt560 * 100 / local312;
							this.anInt866 = -1;
							return true;
						}
						if (this.anInt866 == 214) {
							this.anInt1033 = this.aClass2_Sub1_Sub4_6.method492();
							this.anInt923 = this.aClass2_Sub1_Sub4_6.method492();
							this.anInt1010 = this.aClass2_Sub1_Sub4_6.method492();
							this.aBoolean232 = true;
							this.aBoolean208 = true;
							this.anInt866 = -1;
							return true;
						}
						if (this.anInt866 == 175) {
							this.aBoolean214 = true;
							local166 = this.aClass2_Sub1_Sub4_6.method527();
							local312 = this.aClass2_Sub1_Sub4_6.method510(this.aByte37);
							local324 = this.aClass2_Sub1_Sub4_6.method511(435);
							this.anIntArray256[local324] = local166;
							this.anIntArray249[local324] = local312;
							this.anIntArray222[local324] = 1;
							for (local329 = 0; local329 < 98; local329++) {
								if (local166 >= anIntArray232[local329]) {
									this.anIntArray222[local324] = local329 + 2;
								}
							}
							this.anInt866 = -1;
							return true;
						}
						if (this.anInt866 == 172) {
							local166 = this.aClass2_Sub1_Sub4_6.method520();
							local312 = this.aClass2_Sub1_Sub4_6.method521();
							local324 = local166 >> 10 & 0x1F;
							local329 = local166 >> 5 & 0x1F;
							local334 = local166 & 0x1F;
							Class19.method213(local312).anInt301 = (local324 << 19) + (local329 << 11) + (local334 << 3);
							this.anInt866 = -1;
							return true;
						}
						if (this.anInt866 == 134) {
							local166 = this.aClass2_Sub1_Sub4_6.method519();
							@Pc(3804) boolean local3804 = this.aClass2_Sub1_Sub4_6.method511(435) == 1;
							Class19.method213(local166).aBoolean75 = local3804;
							this.anInt866 = -1;
							return true;
						}
						if (this.anInt866 == 189) {
							this.method589(this.anInt865, this.aClass2_Sub1_Sub4_6);
							this.aBoolean203 = false;
							this.anInt866 = -1;
							return true;
						}
						if (this.anInt866 == 223) {
							local166 = this.aClass2_Sub1_Sub4_6.method512();
							local312 = this.aClass2_Sub1_Sub4_6.method512();
							@Pc(3850) String local3850 = this.aClass2_Sub1_Sub4_6.method499();
							if (local312 >= 1 && local312 <= 5) {
								if (local3850.equalsIgnoreCase("null")) {
									local3850 = null;
								}
								this.aStringArray11[local312 - 1] = local3850;
								this.aBooleanArray12[local312 - 1] = local166 == 0;
							}
							this.anInt866 = -1;
							return true;
						}
						if (this.anInt866 == 141) {
							local166 = this.aClass2_Sub1_Sub4_6.method524();
							if (local166 != this.anInt1072) {
								this.method705(this.anInt1072);
								this.anInt1072 = local166;
							}
							this.aBoolean208 = true;
							this.anInt866 = -1;
							return true;
						}
						if (this.anInt866 == 20) {
							local166 = this.aClass2_Sub1_Sub4_6.method494();
							local312 = this.aClass2_Sub1_Sub4_6.method521();
							Class19.method213(local312).anInt304 = 1;
							Class19.method213(local312).anInt305 = local166;
							this.anInt866 = -1;
							return true;
						}
						if (this.anInt866 == 226) {
							local166 = this.aClass2_Sub1_Sub4_6.method494();
							local312 = this.aClass2_Sub1_Sub4_6.method521();
							this.method627(local312);
							if (local166 != -1) {
								this.method627(local166);
							}
							if (this.anInt947 != -1) {
								this.method705(this.anInt947);
								this.anInt947 = -1;
							}
							if (this.anInt966 != -1) {
								this.method705(this.anInt966);
								this.anInt966 = -1;
							}
							if (this.anInt980 != -1) {
								this.method705(this.anInt980);
								this.anInt980 = -1;
							}
							if (this.anInt879 != local312) {
								this.method705(this.anInt879);
								this.anInt879 = local312;
							}
							if (this.anInt895 != local312) {
								this.method705(this.anInt895);
								this.anInt895 = local166;
							}
							this.anInt1015 = 0;
							this.aBoolean211 = false;
							this.anInt866 = -1;
							return true;
						}
						if (this.anInt866 == 167) {
							local166 = this.aClass2_Sub1_Sub4_6.method519();
							local1081 = this.aClass2_Sub1_Sub4_6.method499();
							Class19.method213(local166).aString7 = local1081;
							@Pc(4060) int local4060 = this.anIntArray226[this.anInt891];
							if (Class19.method213(local166).anInt309 == local4060) {
								this.aBoolean214 = true;
							}
							this.anInt866 = -1;
							return true;
						}
						if (this.anInt866 == 131) {
							local166 = this.aClass2_Sub1_Sub4_6.method527();
							local312 = this.aClass2_Sub1_Sub4_6.method521();
							this.anIntArray246[local312] = local166;
							if (this.anIntArray250[local312] != local166) {
								this.anIntArray250[local312] = local166;
								this.method715(local312);
								this.aBoolean214 = true;
								if (this.anInt1072 != -1) {
									this.aBoolean208 = true;
								}
							}
							this.anInt866 = -1;
							return true;
						}
						if (this.anInt866 == 249) {
							local166 = this.aClass2_Sub1_Sub4_6.method494();
							local312 = this.aClass2_Sub1_Sub4_6.method524();
							local324 = this.aClass2_Sub1_Sub4_6.method495();
							@Pc(4138) Class19 local4138 = Class19.method213(local166);
							local4138.anInt287 = local324;
							local4138.anInt290 = local312;
							this.anInt866 = -1;
							return true;
						}
						if (this.anInt866 == 209) {
							for (local166 = 0; local166 < this.aClass2_Sub1_Sub1_Sub2_Sub1Array1.length; local166++) {
								if (this.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local166] != null) {
									this.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local166].anInt791 = -1;
								}
							}
							for (local312 = 0; local312 < this.aClass2_Sub1_Sub1_Sub2_Sub2Array1.length; local312++) {
								if (this.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local312] != null) {
									this.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local312].anInt791 = -1;
								}
							}
							this.anInt866 = -1;
							return true;
						}
						if (this.anInt866 == 239) {
							local166 = this.aClass2_Sub1_Sub4_6.method522();
							local312 = this.aClass2_Sub1_Sub4_6.method494();
							local1007 = Class19.method213(local312);
							if (local1007.anInt283 != local166 || local166 == -1) {
								local1007.anInt283 = local166;
								local1007.anInt291 = 0;
								local1007.anInt308 = 0;
							}
							this.anInt866 = -1;
							return true;
						}
						if (this.anInt866 == 71) {
							this.anInt952 = this.aClass2_Sub1_Sub4_6.method492();
							this.anInt866 = -1;
							return true;
						}
						if (this.anInt866 == 92) {
							local166 = this.aClass2_Sub1_Sub4_6.method492();
							local312 = this.aClass2_Sub1_Sub4_6.method492();
							local324 = this.aClass2_Sub1_Sub4_6.method492();
							local329 = this.aClass2_Sub1_Sub4_6.method492();
							this.aBooleanArray11[local166] = true;
							this.anIntArray231[local166] = local312;
							this.anIntArray217[local166] = local324;
							this.anIntArray224[local166] = local329;
							this.anIntArray218[local166] = 0;
							this.anInt866 = -1;
							return true;
						}
						if (this.anInt866 == 221) {
							local166 = this.aClass2_Sub1_Sub4_6.method520();
							this.method627(local166);
							if (this.anInt980 != -1) {
								this.method705(this.anInt980);
								this.anInt980 = -1;
								this.aBoolean208 = true;
							}
							if (this.anInt879 != -1) {
								this.method705(this.anInt879);
								this.anInt879 = -1;
								this.aBoolean209 = true;
							}
							if (this.anInt895 != -1) {
								this.method705(this.anInt895);
								this.anInt895 = -1;
							}
							if (this.anInt947 != -1) {
								this.method705(this.anInt947);
								this.anInt947 = -1;
							}
							if (this.anInt966 != local166) {
								this.method705(this.anInt966);
								this.anInt966 = local166;
							}
							if (this.anInt1015 != 0) {
								this.anInt1015 = 0;
								this.aBoolean208 = true;
							}
							this.aBoolean214 = true;
							this.aBoolean206 = true;
							this.aBoolean211 = false;
							this.anInt866 = -1;
							return true;
						}
						if (this.anInt866 == 97) {
							local166 = this.aClass2_Sub1_Sub4_6.method494();
							local312 = this.aClass2_Sub1_Sub4_6.method492();
							local324 = this.aClass2_Sub1_Sub4_6.method494();
							if (local324 == 65535) {
								if (this.anInt922 < 50) {
									this.anIntArray216[this.anInt922] = (short) local166;
									this.anIntArray233[this.anInt922] = local312;
									this.anIntArray264[this.anInt922] = 0;
									this.anInt922++;
								}
							} else if (this.aBoolean222 && !aBoolean227 && this.anInt922 < 50) {
								this.anIntArray216[this.anInt922] = local166;
								this.anIntArray233[this.anInt922] = local312;
								this.anIntArray264[this.anInt922] = local324 + Class35.anIntArray158[local166];
								this.anInt922++;
							}
							this.anInt866 = -1;
							return true;
						}
						signlink.reporterror("T1 - " + this.anInt866 + "," + this.anInt865 + " - " + this.anInt1020 + "," + this.anInt1021);
						this.method687();
						return true;
					}
					local166 = this.aClass2_Sub1_Sub4_6.method494();
					local312 = this.aClass2_Sub1_Sub4_6.method520();
					if (this.anInt980 != -1) {
						this.method705(this.anInt980);
						this.anInt980 = -1;
						this.aBoolean208 = true;
					}
					if (this.anInt879 != -1) {
						this.method705(this.anInt879);
						this.anInt879 = -1;
						this.aBoolean209 = true;
					}
					if (this.anInt895 != -1) {
						this.method705(this.anInt895);
						this.anInt895 = -1;
					}
					if (this.anInt947 != local312) {
						this.method705(this.anInt947);
						this.anInt947 = local312;
					}
					if (this.anInt966 != local166) {
						this.method705(this.anInt966);
						this.anInt966 = local166;
					}
					if (this.anInt1015 != 0) {
						this.anInt1015 = 0;
						this.aBoolean208 = true;
					}
					this.aBoolean214 = true;
					this.aBoolean206 = true;
					this.aBoolean211 = false;
					this.anInt866 = -1;
					return true;
				}
				this.method712(this.anInt1017, this.aClass2_Sub1_Sub4_6, this.anInt866);
				this.anInt866 = -1;
				return true;
			} catch (@Pc(4524) IOException local4524) {
				this.method612();
			} catch (@Pc(4529) Exception local4529) {
				local1070 = "T2 - " + this.anInt866 + "," + this.anInt1020 + "," + this.anInt1021 + " - " + this.anInt865 + "," + (this.anInt870 + aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray208[0]) + "," + (this.anInt871 + aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray209[0]) + " - ";
				for (local312 = 0; local312 < this.anInt865 && local312 < 50; local312++) {
					local1070 = local1070 + this.aClass2_Sub1_Sub4_6.aByteArray17[local312] + ",";
				}
				signlink.reporterror(local1070);
				this.method687();
			}
			return true;
		} catch (@Pc(4610) RuntimeException local4610) {
			signlink.reporterror("6714, " + 1 + ", " + local4610.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BZ)V")
	private void method704(@OriginalArg(1) boolean arg0) {
		try {
			if (aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt778 >> 7 == this.anInt1073 && aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt779 >> 7 == this.anInt1074) {
				this.anInt1073 = 0;
			}
			@Pc(21) int local21 = this.anInt964;
			if (arg0) {
				local21 = 1;
			}
			for (@Pc(27) int local27 = 0; local27 < local21; local27++) {
				@Pc(33) Class2_Sub1_Sub1_Sub2_Sub1 local33;
				@Pc(38) int local38;
				if (arg0) {
					local33 = aClass2_Sub1_Sub1_Sub2_Sub1_1;
					local38 = this.anInt963 << 14;
				} else {
					local33 = this.aClass2_Sub1_Sub1_Sub2_Sub1Array1[this.anIntArray243[local27]];
					local38 = this.anIntArray243[local27] << 14;
				}
				if (local33 != null && local33.method568(this.anInt946)) {
					local33.aBoolean169 = false;
					if ((aBoolean227 && this.anInt964 > 50 || this.anInt964 > 200) && !arg0 && local33.anInt797 == local33.anInt804) {
						local33.aBoolean169 = true;
					}
					@Pc(90) int local90 = local33.anInt778 >> 7;
					@Pc(95) int local95 = local33.anInt779 >> 7;
					if (local90 >= 0 && local90 < 104 && local95 >= 0 && local95 < 104) {
						if (local33.aClass2_Sub1_Sub1_Sub6_2 == null || anInt993 < local33.anInt652 || anInt993 >= local33.anInt653) {
							if ((local33.anInt778 & 0x7F) == 64 && (local33.anInt779 & 0x7F) == 64) {
								if (this.anIntArrayArray25[local90][local95] == this.anInt944) {
									continue;
								}
								this.anIntArrayArray25[local90][local95] = this.anInt944;
							}
							local33.anInt663 = this.method720(local33.anInt778, this.anInt953, local33.anInt779, this.anInt905);
							this.aClass20_1.method233(local33.anInt779, local33.anInt663, local33.anInt780, local33.anInt778, this.anInt953, 60, local38, local33.aBoolean194, local33);
						} else {
							local33.aBoolean169 = false;
							local33.anInt663 = this.method720(local33.anInt778, this.anInt953, local33.anInt779, this.anInt905);
							this.aClass20_1.method234(local33.anInt648, local33.anInt779, local33, this.anInt953, local33.anInt663, local38, local33.anInt780, local33.anInt651, local33.anInt778, local33.anInt649, local33.anInt650);
						}
					}
				}
			}
		} catch (@Pc(236) RuntimeException local236) {
			signlink.reporterror("45080, " + 112 + ", " + arg0 + ", " + local236.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean199) {
			this.method682();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(II)V")
	private void method705(@OriginalArg(0) int arg0) {
		try {
			Class19.method215(arg0, 882);
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("52150, " + arg0 + ", " + 882 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(B)V")
	private void method706(@OriginalArg(0) byte arg0) {
		try {
			this.anInt944++;
			this.method704(true);
			this.method680(true);
			this.method704(false);
			this.method680(false);
			@Pc(28) boolean local28 = false;
			this.method603();
			this.method611();
			@Pc(47) int local47;
			@Pc(86) int local86;
			if (!this.aBoolean239) {
				local47 = this.anInt927;
				if (this.anInt1061 / 256 > local47) {
					local47 = this.anInt1061 / 256;
				}
				if (this.aBooleanArray11[4] && this.anIntArray217[4] + 128 > local47) {
					local47 = this.anIntArray217[4] + 128;
				}
				local86 = this.anInt928 + this.anInt949 & 0x7FF;
				this.method692(this.aByte35, local47 * 3 + 600, this.anInt934, local47, this.anInt935, local86, this.method720(aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt778, this.anInt953, aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt779, this.anInt905) - 50);
			}
			if (this.aBoolean239) {
				local47 = this.method667();
			} else {
				local47 = this.method666();
			}
			local86 = this.anInt843;
			@Pc(132) int local132 = this.anInt844;
			@Pc(135) int local135 = this.anInt845;
			@Pc(138) int local138 = this.anInt846;
			@Pc(141) int local141 = this.anInt847;
			@Pc(190) int local190;
			for (@Pc(143) int local143 = 0; local143 < 5; local143++) {
				if (this.aBooleanArray11[local143]) {
					local190 = (int) (Math.random() * (double) (this.anIntArray231[local143] * 2 + 1) - (double) this.anIntArray231[local143] + Math.sin((double) this.anIntArray218[local143] * ((double) this.anIntArray224[local143] / 100.0D)) * (double) this.anIntArray217[local143]);
					if (local143 == 0) {
						this.anInt843 += local190;
					}
					if (local143 == 1) {
						this.anInt844 += local190;
					}
					if (local143 == 2) {
						this.anInt845 += local190;
					}
					if (local143 == 3) {
						this.anInt847 = this.anInt847 + local190 & 0x7FF;
					}
					if (local143 == 4) {
						this.anInt846 += local190;
						if (this.anInt846 < 128) {
							this.anInt846 = 128;
						}
						if (this.anInt846 > 383) {
							this.anInt846 = 383;
						}
					}
				}
			}
			local190 = Class2_Sub1_Sub3_Sub1.anInt230;
			Class2_Sub1_Sub1_Sub6.aBoolean130 = true;
			Class2_Sub1_Sub1_Sub6.anInt506 = 0;
			Class2_Sub1_Sub1_Sub6.anInt504 = super.anInt830 - 4;
			Class2_Sub1_Sub1_Sub6.anInt505 = super.anInt831 - 4;
			Class2_Sub1_Sub3.method355();
			this.aClass20_1.method261(this.anInt846, local47, this.anInt845, this.anInt843, this.anInt847, this.anInt844);
			this.aClass20_1.method236();
			this.method609();
			this.method653((byte) 9);
			this.method656(local190);
			this.method673();
			this.aClass1_17.method2(4, 4, super.aGraphics2);
			this.anInt843 = local86;
			this.anInt844 = local132;
			this.anInt845 = local135;
			this.anInt846 = local138;
			this.anInt847 = local141;
		} catch (@Pc(329) RuntimeException local329) {
			signlink.reporterror("62521, " + arg0 + ", " + local329.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)V")
	private void method707(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!TKPFKOXP;II)V")
	private void method708(@OriginalArg(0) Class2_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			while (true) {
				if (arg0.anInt673 + 10 < arg1 * 8) {
					@Pc(12) int local12 = arg0.method503(11);
					if (local12 != 2047) {
						if (this.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local12] == null) {
							this.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local12] = new Class2_Sub1_Sub1_Sub2_Sub1();
							if (this.aClass2_Sub1_Sub4Array1[local12] != null) {
								this.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local12].method477(this.aClass2_Sub1_Sub4Array1[local12]);
							}
						}
						this.anIntArray243[this.anInt964++] = local12;
						@Pc(58) Class2_Sub1_Sub1_Sub2_Sub1 local58 = this.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local12];
						local58.anInt777 = anInt993;
						@Pc(66) int local66 = arg0.method503(5);
						if (local66 > 15) {
							local66 -= 32;
						}
						@Pc(75) int local75 = arg0.method503(1);
						if (local75 == 1) {
							this.anIntArray244[this.anInt965++] = local12;
						}
						@Pc(94) int local94 = arg0.method503(1);
						@Pc(99) int local99 = arg0.method503(5);
						if (local99 > 15) {
							local99 -= 32;
						}
						local58.method567(aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray208[0] + local99, local94 == 1, aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray209[0] + local66);
						continue;
					}
				}
				arg0.method504();
				return;
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("15964, " + arg0 + ", " + arg1 + ", " + -12914 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method709() {
		try {
			if (this.anInt925 != 0) {
				@Pc(6) Class2_Sub1_Sub3_Sub2 local6 = this.aClass2_Sub1_Sub3_Sub2_3;
				@Pc(8) int local8 = 0;
				if (this.anInt924 != 0) {
					local8 = 1;
				}
				for (@Pc(15) int local15 = 0; local15 < 100; local15++) {
					if (this.aStringArray9[local15] != null) {
						@Pc(27) int local27 = this.anIntArray230[local15];
						@Pc(32) String local32 = this.aStringArray8[local15];
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
						if ((local27 == 3 || local27 == 7) && (local27 == 7 || this.anInt923 == 0 || this.anInt923 == 1 && this.method662(local32))) {
							local85 = 329 - local8 * 13;
							local6.method304("From", local85, 4, this.aBoolean207, 0);
							local6.method304("From", local85 - 1, 4, this.aBoolean207, 65535);
							@Pc(112) int local112 = local6.method302("From ", (byte) 3) + 4;
							if (local34 == 1) {
								this.aClass2_Sub1_Sub3_Sub4Array3[0].method369(local85 - 12, this.anInt908, local112);
								local112 += 14;
							}
							if (local34 == 2) {
								this.aClass2_Sub1_Sub3_Sub4Array3[1].method369(local85 - 12, this.anInt908, local112);
								local112 += 14;
							}
							local6.method304(local32 + ": " + this.aStringArray9[local15], local85, local112, this.aBoolean207, 0);
							local6.method304(local32 + ": " + this.aStringArray9[local15], local85 - 1, local112, this.aBoolean207, 65535);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local27 == 5 && this.anInt923 < 2) {
							local85 = 329 - local8 * 13;
							local6.method304(this.aStringArray9[local15], local85, 4, this.aBoolean207, 0);
							local6.method304(this.aStringArray9[local15], local85 - 1, 4, this.aBoolean207, 65535);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local27 == 6 && this.anInt923 < 2) {
							local85 = 329 - local8 * 13;
							local6.method304("To " + local32 + ": " + this.aStringArray9[local15], local85, 4, this.aBoolean207, 0);
							local6.method304("To " + local32 + ": " + this.aStringArray9[local15], local85 - 1, 4, this.aBoolean207, 65535);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(309) RuntimeException local309) {
			signlink.reporterror("56948, " + 0 + ", " + local309.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZB)V")
	private void method710(@OriginalArg(0) boolean arg0) {
		try {
			this.method639();
			if (this.aByte27 != 0) {
				this.aClass38ArrayArrayArray1 = null;
			}
			this.aClass1_21.method1(this.aByte34);
			this.aClass2_Sub1_Sub3_Sub4_14.method369(0, this.anInt908, 0);
			@Pc(59) byte local59;
			@Pc(71) int local71;
			if (this.anInt1058 == 0) {
				this.aClass2_Sub1_Sub3_Sub2_2.method301(this.aClass14_Sub1_1.aString3, true, 180, 7711145, 180);
				local59 = 80;
				this.aClass2_Sub1_Sub3_Sub2_4.method301("Welcome to RuneScape", true, 80, 16776960, 180);
				local71 = local59 + 30;
				this.aClass2_Sub1_Sub3_Sub4_15.method369(100, this.anInt908, 27);
				this.aClass2_Sub1_Sub3_Sub2_4.method301("New User", true, 125, 16777215, 100);
				this.aClass2_Sub1_Sub3_Sub4_15.method369(100, this.anInt908, 187);
				this.aClass2_Sub1_Sub3_Sub2_4.method301("Existing User", true, 125, 16777215, 260);
			}
			if (this.anInt1058 == 2) {
				local59 = 60;
				if (this.aString17.length() > 0) {
					this.aClass2_Sub1_Sub3_Sub2_4.method301(this.aString17, true, 45, 16776960, 180);
					this.aClass2_Sub1_Sub3_Sub2_4.method301(this.aString18, true, 60, 16776960, 180);
					local71 = local59 + 30;
				} else {
					this.aClass2_Sub1_Sub3_Sub2_4.method301(this.aString18, true, 53, 16776960, 180);
					local71 = local59 + 30;
				}
				this.aClass2_Sub1_Sub3_Sub2_4.method308(90, 90, 16777215, true, "Username: " + this.aString21 + (this.anInt916 == 0 & anInt993 % 40 < 20 ? "@yel@|" : ""));
				local71 += 15;
				this.aClass2_Sub1_Sub3_Sub2_4.method308(92, 105, 16777215, true, "Password: " + Class7.method60(this.aString22) + (this.anInt916 == 1 & anInt993 % 40 < 20 ? "@yel@|" : ""));
				local71 += 15;
				if (!arg0) {
					this.aClass2_Sub1_Sub3_Sub4_15.method369(130, this.anInt908, 27);
					this.aClass2_Sub1_Sub3_Sub2_4.method301("Login", true, 155, 16777215, 100);
					this.aClass2_Sub1_Sub3_Sub4_15.method369(130, this.anInt908, 187);
					this.aClass2_Sub1_Sub3_Sub2_4.method301("Cancel", true, 155, 16777215, 260);
				}
			}
			if (this.anInt1058 == 3) {
				this.aClass2_Sub1_Sub3_Sub2_4.method301("Create a free account", true, 40, 16776960, 180);
				local59 = 65;
				this.aClass2_Sub1_Sub3_Sub2_4.method301("To create a new account you need to", true, 65, 16777215, 180);
				local71 = local59 + 15;
				this.aClass2_Sub1_Sub3_Sub2_4.method301("go back to the main RuneScape webpage", true, 80, 16777215, 180);
				local71 += 15;
				this.aClass2_Sub1_Sub3_Sub2_4.method301("and choose the 'create account'", true, 95, 16777215, 180);
				local71 += 15;
				this.aClass2_Sub1_Sub3_Sub2_4.method301("button near the top of that page.", true, 110, 16777215, 180);
				local71 += 15;
				this.aClass2_Sub1_Sub3_Sub4_15.method369(130, this.anInt908, 107);
				this.aClass2_Sub1_Sub3_Sub2_4.method301("Cancel", true, 155, 16777215, 180);
			}
			this.aClass1_21.method2(171, 202, super.aGraphics2);
			if (this.aBoolean209) {
				this.aBoolean209 = false;
				this.aClass1_19.method2(0, 128, super.aGraphics2);
				this.aClass1_20.method2(371, 202, super.aGraphics2);
				this.aClass1_24.method2(265, 0, super.aGraphics2);
				this.aClass1_25.method2(265, 562, super.aGraphics2);
				this.aClass1_26.method2(171, 128, super.aGraphics2);
				this.aClass1_27.method2(171, 562, super.aGraphics2);
			}
		} catch (@Pc(509) RuntimeException local509) {
			signlink.reporterror("58471, " + arg0 + ", " + 0 + ", " + local509.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private void method711(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt925 != 0) {
				@Pc(5) int local5 = 0;
				@Pc(9) boolean local9 = false;
				if (this.anInt924 != 0) {
					local5 = 1;
				}
				for (@Pc(16) int local16 = 0; local16 < 100; local16++) {
					if (this.aStringArray9[local16] != null) {
						@Pc(28) int local28 = this.anIntArray230[local16];
						@Pc(33) String local33 = this.aStringArray8[local16];
						if (local33 != null && local33.startsWith("@cr1@")) {
							local33 = local33.substring(5);
						}
						if (local33 != null && local33.startsWith("@cr2@")) {
							local33 = local33.substring(5);
						}
						if ((local28 == 3 || local28 == 7) && (local28 == 7 || this.anInt923 == 0 || this.anInt923 == 1 && this.method662(local33))) {
							@Pc(86) int local86 = 329 - local5 * 13;
							if (super.anInt830 > 4 && super.anInt831 - 4 > local86 - 10 && super.anInt831 - 4 <= local86 + 3) {
								@Pc(125) int local125 = this.aClass2_Sub1_Sub3_Sub2_3.method302("From:  " + local33 + this.aStringArray9[local16], (byte) 3) + 25;
								if (local125 > 450) {
									local125 = 450;
								}
								if (super.anInt830 < local125 + 4) {
									if (this.anInt1046 >= 1) {
										this.aStringArray10[this.anInt1053] = "Report abuse @whi@" + local33;
										this.anIntArray214[this.anInt1053] = 2471;
										this.anInt1053++;
									}
									this.aStringArray10[this.anInt1053] = "Add ignore @whi@" + local33;
									this.anIntArray214[this.anInt1053] = 2608;
									this.anInt1053++;
									this.aStringArray10[this.anInt1053] = "Add friend @whi@" + local33;
									this.anIntArray214[this.anInt1053] = 2627;
									this.anInt1053++;
								}
							}
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
						if ((local28 == 5 || local28 == 6) && this.anInt923 < 2) {
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(238) RuntimeException local238) {
			signlink.reporterror("947, " + arg0 + ", " + local238.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!TKPFKOXP;I)V")
	private void method712(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub4 arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt865 += arg0;
			@Pc(14) int local14;
			@Pc(18) int local18;
			@Pc(22) int local22;
			@Pc(26) int local26;
			@Pc(31) int local31;
			@Pc(45) int local45;
			@Pc(52) int local52;
			@Pc(36) int local36;
			if (arg2 == 197) {
				local14 = arg1.method521();
				local18 = arg1.method512();
				local22 = local18 >> 2;
				local26 = local18 & 0x3;
				local31 = this.anIntArray235[local22];
				local36 = arg1.method510(this.aByte37);
				local45 = this.anInt1056 + (local36 >> 4 & 0x7);
				local52 = this.anInt1057 + (local36 & 0x7);
				if (local45 >= 0 && local52 >= 0 && local45 < 104 && local52 < 104) {
					this.method623(local14, local26, 0, -1, local45, local22, local52, this.anInt953, local31);
				}
			} else if (arg2 == 145) {
				local14 = arg1.method492();
				local18 = this.anInt1056 + (local14 >> 4 & 0x7);
				local22 = this.anInt1057 + (local14 & 0x7);
				local26 = arg1.method494();
				local31 = arg1.method492();
				local36 = arg1.method494();
				if (local18 >= 0 && local22 >= 0 && local18 < 104 && local22 < 104) {
					local18 = local18 * 128 + 64;
					local22 = local22 * 128 + 64;
					@Pc(152) Class2_Sub1_Sub1_Sub1 local152 = new Class2_Sub1_Sub1_Sub1(this.method720(local18, this.anInt953, local22, this.anInt905) - local31, anInt993, local26, local22, this.anInt953, this.anInt892, local36, local18);
					this.aClass38_11.method458(local152);
				}
			} else if (arg2 == 110) {
				local14 = arg1.method492();
				local18 = this.anInt1056 + (local14 >> 4 & 0x7);
				local22 = this.anInt1057 + (local14 & 0x7);
				local26 = arg1.method494();
				local31 = arg1.method494();
				local36 = arg1.method494();
				if (local18 >= 0 && local22 >= 0 && local18 < 104 && local22 < 104) {
					@Pc(208) Class38 local208 = this.aClass38ArrayArrayArray1[this.anInt953][local18][local22];
					if (local208 != null) {
						for (@Pc(214) Class2_Sub1_Sub1_Sub4 local214 = (Class2_Sub1_Sub1_Sub4) local208.method461(); local214 != null; local214 = (Class2_Sub1_Sub1_Sub4) local208.method463()) {
							if (local214.anInt161 == (local26 & 0x7FFF) && local214.anInt162 == local31) {
								local214.anInt162 = local36;
								break;
							}
						}
						this.method701(local18, local22);
					}
				}
			} else if (arg2 == 16) {
				local14 = arg1.method511(435);
				local18 = this.anInt1056 + (local14 >> 4 & 0x7);
				local22 = this.anInt1057 + (local14 & 0x7);
				local26 = arg1.method492();
				local31 = local26 >> 2;
				local36 = local26 & 0x3;
				local45 = this.anIntArray235[local31];
				if (local18 >= 0 && local22 >= 0 && local18 < 104 && local22 < 104) {
					this.method623(-1, local36, 0, -1, local18, local31, local22, this.anInt953, local45);
				}
			} else if (arg2 == 40) {
				local14 = arg1.method521();
				local18 = arg1.method494();
				local22 = arg1.method520();
				local26 = arg1.method512();
				local31 = this.anInt1056 + (local26 >> 4 & 0x7);
				local36 = this.anInt1057 + (local26 & 0x7);
				if (local31 >= 0 && local36 >= 0 && local31 < 104 && local36 < 104 && local22 != this.anInt999) {
					@Pc(358) Class2_Sub1_Sub1_Sub4 local358 = new Class2_Sub1_Sub1_Sub4();
					local358.anInt161 = local18;
					local358.anInt162 = local14;
					if (this.aClass38ArrayArrayArray1[this.anInt953][local31][local36] == null) {
						this.aClass38ArrayArrayArray1[this.anInt953][local31][local36] = new Class38(5);
					}
					this.aClass38ArrayArrayArray1[this.anInt953][local31][local36].method458(local358);
					this.method701(local31, local36);
				}
			} else {
				@Pc(449) int local449;
				@Pc(456) int local456;
				@Pc(468) int local468;
				@Pc(472) int local472;
				if (arg2 == 58) {
					local14 = arg1.method520();
					local18 = arg1.method510(this.aByte37);
					local22 = local18 >> 2;
					local26 = local18 & 0x3;
					local31 = this.anIntArray235[local22];
					@Pc(432) byte local432 = arg1.method513();
					local45 = arg1.method494();
					local52 = arg1.method510(this.aByte37);
					local449 = this.anInt1056 + (local52 >> 4 & 0x7);
					local456 = this.anInt1057 + (local52 & 0x7);
					@Pc(460) byte local460 = arg1.method514();
					@Pc(464) byte local464 = arg1.method515();
					local468 = arg1.method519();
					local472 = arg1.method519();
					@Pc(476) byte local476 = arg1.method515();
					@Pc(482) Class2_Sub1_Sub1_Sub2_Sub1 local482;
					if (local14 == this.anInt999) {
						local482 = aClass2_Sub1_Sub1_Sub2_Sub1_1;
					} else {
						local482 = this.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local14];
					}
					if (local482 != null) {
						@Pc(494) Class37 local494 = Class37.method451(local468);
						@Pc(504) int local504 = this.anIntArrayArrayArray8[this.anInt953][local449][local456];
						@Pc(516) int local516 = this.anIntArrayArrayArray8[this.anInt953][local449 + 1][local456];
						@Pc(530) int local530 = this.anIntArrayArrayArray8[this.anInt953][local449 + 1][local456 + 1];
						@Pc(542) int local542 = this.anIntArrayArrayArray8[this.anInt953][local449][local456 + 1];
						@Pc(552) Class2_Sub1_Sub1_Sub6 local552 = local494.method448(local22, local26, local504, local516, local530, local542, -1);
						if (local552 != null) {
							this.method623(-1, 0, local45 + 1, local472 + 1, local449, 0, local456, this.anInt953, local31);
							local482.anInt652 = local45 + anInt993;
							local482.anInt653 = local472 + anInt993;
							local482.aClass2_Sub1_Sub1_Sub6_2 = local552;
							@Pc(587) int local587 = local494.anInt575;
							@Pc(590) int local590 = local494.anInt593;
							if (local26 == 1 || local26 == 3) {
								local587 = local494.anInt593;
								local590 = local494.anInt575;
							}
							local482.anInt658 = local449 * 128 + local587 * 64;
							local482.anInt660 = local456 * 128 + local590 * 64;
							local482.anInt659 = this.method720(local482.anInt658, this.anInt953, local482.anInt660, this.anInt905);
							@Pc(637) byte local637;
							if (local464 > local460) {
								local637 = local464;
								local464 = local460;
								local460 = local637;
							}
							if (local476 > local432) {
								local637 = local476;
								local476 = local432;
								local432 = local637;
							}
							local482.anInt648 = local449 + local464;
							local482.anInt650 = local449 + local460;
							local482.anInt649 = local456 + local476;
							local482.anInt651 = local456 + local432;
						}
					}
				}
				@Pc(714) Class2_Sub1_Sub1_Sub4 local714;
				if (arg2 == 142) {
					local14 = arg1.method494();
					local18 = arg1.method512();
					local22 = this.anInt1056 + (local18 >> 4 & 0x7);
					local26 = this.anInt1057 + (local18 & 0x7);
					local31 = arg1.method519();
					if (local22 >= 0 && local26 >= 0 && local22 < 104 && local26 < 104) {
						local714 = new Class2_Sub1_Sub1_Sub4();
						local714.anInt161 = local31;
						local714.anInt162 = local14;
						if (this.aClass38ArrayArrayArray1[this.anInt953][local22][local26] == null) {
							this.aClass38ArrayArrayArray1[this.anInt953][local22][local26] = new Class38(5);
						}
						this.aClass38ArrayArrayArray1[this.anInt953][local22][local26].method458(local714);
						this.method701(local22, local26);
					}
				} else {
					if (arg2 == 44) {
						local14 = arg1.method492();
						local18 = this.anInt1056 + (local14 >> 4 & 0x7);
						local22 = this.anInt1057 + (local14 & 0x7);
						local26 = arg1.method494();
						local31 = arg1.method492();
						local36 = local31 >> 4 & 0xF;
						local45 = local31 & 0x7;
						if (aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray208[0] >= local18 - local36 && aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray208[0] <= local18 + local36 && aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray209[0] >= local22 - local36 && aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray209[0] <= local22 + local36 && this.aBoolean222 && !aBoolean227 && this.anInt922 < 50) {
							this.anIntArray216[this.anInt922] = local26;
							this.anIntArray233[this.anInt922] = local45;
							this.anIntArray264[this.anInt922] = Class35.anIntArray158[local26];
							this.anInt922++;
						}
					}
					@Pc(955) int local955;
					@Pc(967) int local967;
					if (arg2 == 33) {
						local14 = arg1.method511(435);
						local18 = local14 >> 2;
						local22 = local14 & 0x3;
						local26 = this.anIntArray235[local18];
						local31 = arg1.method521();
						local36 = arg1.method510(this.aByte37);
						local45 = this.anInt1056 + (local36 >> 4 & 0x7);
						local52 = this.anInt1057 + (local36 & 0x7);
						if (local45 >= 0 && local52 >= 0 && local45 < 103 && local52 < 103) {
							local449 = this.anIntArrayArrayArray8[this.anInt953][local45][local52];
							local456 = this.anIntArrayArrayArray8[this.anInt953][local45 + 1][local52];
							local955 = this.anIntArrayArrayArray8[this.anInt953][local45 + 1][local52 + 1];
							local967 = this.anIntArrayArrayArray8[this.anInt953][local45][local52 + 1];
							if (local26 == 0) {
								@Pc(979) Class26 local979 = this.aClass20_1.method244(local52, local45, this.anInt953, this.anInt910);
								if (local979 != null) {
									local472 = local979.anInt456 >> 14 & 0x7FFF;
									if (local18 == 2) {
										local979.aClass2_Sub1_Sub1_6 = new Class2_Sub1_Sub1_Sub3(2, local967, local472, 2, local31, local955, local456, local449, false, local22 + 4);
										local979.aClass2_Sub1_Sub1_7 = new Class2_Sub1_Sub1_Sub3(2, local967, local472, 2, local31, local955, local456, local449, false, local22 + 1 & 0x3);
									} else {
										local979.aClass2_Sub1_Sub1_6 = new Class2_Sub1_Sub1_Sub3(local18, local967, local472, 2, local31, local955, local456, local449, false, local22);
									}
								}
							}
							if (local26 == 1) {
								@Pc(1056) Class15 local1056 = this.aClass20_1.method245(88, local45, local52, this.anInt953);
								if (local1056 != null) {
									local1056.aClass2_Sub1_Sub1_5 = new Class2_Sub1_Sub1_Sub3(4, local967, local1056.anInt236 >> 14 & 0x7FFF, 2, local31, local955, local456, local449, false, 0);
								}
							}
							if (local26 == 2) {
								@Pc(1090) Class9 local1090 = this.aClass20_1.method246(local45, local52, this.anInt953);
								if (local18 == 11) {
									local18 = 10;
								}
								if (local1090 != null) {
									local1090.aClass2_Sub1_Sub1_4 = new Class2_Sub1_Sub1_Sub3(local18, local967, local1090.anInt157 >> 14 & 0x7FFF, 2, local31, local955, local456, local449, false, local22);
								}
							}
							if (local26 == 3) {
								@Pc(1129) Class30 local1129 = this.aClass20_1.method247(local45, this.anInt953, local52);
								if (local1129 != null) {
									local1129.aClass2_Sub1_Sub1_8 = new Class2_Sub1_Sub1_Sub3(22, local967, local1129.anInt516 >> 14 & 0x7FFF, 2, local31, local955, local456, local449, false, local22);
								}
							}
						}
					} else if (arg2 == 90) {
						local14 = arg1.method492();
						local18 = this.anInt1056 + (local14 >> 4 & 0x7);
						local22 = this.anInt1057 + (local14 & 0x7);
						local26 = local18 + arg1.method493();
						local31 = local22 + arg1.method493();
						local36 = arg1.method495();
						local45 = arg1.method494();
						local52 = arg1.method492() * 4;
						local449 = arg1.method492() * 4;
						local456 = arg1.method494();
						local955 = arg1.method494();
						local967 = arg1.method492();
						local468 = arg1.method492();
						if (local18 >= 0 && local22 >= 0 && local18 < 104 && local22 < 104 && local26 >= 0 && local31 >= 0 && local26 < 104 && local31 < 104 && local45 != 65535) {
							local18 = local18 * 128 + 64;
							local22 = local22 * 128 + 64;
							local26 = local26 * 128 + 64;
							local31 = local31 * 128 + 64;
							@Pc(1289) Class2_Sub1_Sub1_Sub5 local1289 = new Class2_Sub1_Sub1_Sub5(this.method720(local18, this.anInt953, local22, this.anInt905) - local52, local45, -940, local955 + anInt993, local468, local449, local967, local18, local456 + anInt993, this.anInt953, local36, local22);
							local1289.method283(local31, this.method720(local26, this.anInt953, local31, this.anInt905) - local449, local26, local456 + anInt993);
							this.aClass38_12.method458(local1289);
						}
					} else if (arg2 == 146) {
						local14 = arg1.method521();
						local18 = arg1.method510(this.aByte37);
						local22 = this.anInt1056 + (local18 >> 4 & 0x7);
						local26 = this.anInt1057 + (local18 & 0x7);
						if (local22 >= 0 && local26 >= 0 && local22 < 104 && local26 < 104) {
							@Pc(1360) Class38 local1360 = this.aClass38ArrayArrayArray1[this.anInt953][local22][local26];
							if (local1360 != null) {
								for (local714 = (Class2_Sub1_Sub1_Sub4) local1360.method461(); local714 != null; local714 = (Class2_Sub1_Sub1_Sub4) local1360.method463()) {
									if (local714.anInt161 == (local14 & 0x7FFF)) {
										local714.method562();
										break;
									}
								}
								if (local1360.method461() == null) {
									this.aClass38ArrayArrayArray1[this.anInt953][local22][local26] = null;
								}
								this.method701(local22, local26);
							}
						}
					}
				}
			}
		} catch (@Pc(1404) RuntimeException local1404) {
			signlink.reporterror("51222, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local1404.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!TKPFKOXP;Lclient!TINBLEHZ;III)V")
	private void method713(@OriginalArg(0) Class2_Sub1_Sub4 arg0, @OriginalArg(1) Class2_Sub1_Sub1_Sub2_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (this.anInt1026 > 1 || this.anInt1026 < 1) {
				this.anInt866 = arg0.method492();
			}
			if ((arg2 & 0x4) != 0) {
				arg1.anInt782 = arg0.method520();
				if (arg1.anInt782 == 65535) {
					arg1.anInt782 = -1;
				}
			}
			@Pc(37) int local37;
			@Pc(46) int local46;
			@Pc(58) int local58;
			if ((arg2 & 0x20) != 0) {
				local37 = arg0.method521();
				if (local37 == 65535) {
					local37 = -1;
				}
				local46 = arg0.method512();
				if (local37 == arg1.anInt791 && local37 != -1) {
					local58 = Class22.aClass22Array1[local37].anInt380;
					if (local58 == 1) {
						arg1.anInt792 = 0;
						arg1.anInt793 = 0;
						arg1.anInt794 = local46;
						arg1.anInt795 = 0;
					}
					if (local58 == 2) {
						arg1.anInt795 = 0;
					}
				} else if (local37 == -1 || arg1.anInt791 == -1 || Class22.aClass22Array1[local37].anInt374 >= Class22.aClass22Array1[arg1.anInt791].anInt374) {
					arg1.anInt791 = local37;
					arg1.anInt792 = 0;
					arg1.anInt793 = 0;
					arg1.anInt794 = local46;
					arg1.anInt795 = 0;
					arg1.anInt796 = arg1.anInt788;
				}
			}
			if ((arg2 & 0x8) != 0) {
				arg1.anInt801 = arg0.method521();
				arg1.anInt802 = arg0.method494();
			}
			if ((arg2 & 0x40) != 0) {
				arg1.aString16 = arg0.method499();
				if (arg1.aString16.charAt(0) == '~') {
					arg1.aString16 = arg1.aString16.substring(1);
					this.method663(arg1.aString16, 2, arg1.aString13, this.anInt933);
				} else if (arg1 == aClass2_Sub1_Sub1_Sub2_Sub1_1) {
					this.method663(arg1.aString16, 2, arg1.aString13, this.anInt933);
				}
				arg1.anInt790 = 0;
				arg1.anInt787 = 0;
				arg1.anInt789 = 150;
			}
			if ((arg2 & 0x2) != 0) {
				local37 = arg0.method520();
				local46 = arg0.method511(435);
				local58 = arg0.method492();
				@Pc(200) int local200 = arg0.anInt672;
				if (arg1.aString13 != null && arg1.aBoolean167) {
					@Pc(210) long local210 = Class7.method55(arg1.aString13);
					@Pc(212) boolean local212 = false;
					if (local46 <= 1) {
						for (@Pc(217) int local217 = 0; local217 < this.anInt1007; local217++) {
							if (this.aLongArray3[local217] == local210) {
								local212 = true;
								break;
							}
						}
					}
					if (!local212 && this.anInt1027 == 0) {
						try {
							this.aClass2_Sub1_Sub4_7.anInt672 = 0;
							arg0.method530(this.aClass2_Sub1_Sub4_7.aByteArray17, local58);
							this.aClass2_Sub1_Sub4_7.anInt672 = 0;
							@Pc(262) String local262 = Class47.method551(local58, this.aClass2_Sub1_Sub4_7);
							@Pc(266) String local266 = Class18.method183(local262);
							arg1.aString16 = local266;
							arg1.anInt790 = local37 >> 8;
							arg1.anInt787 = local37 & 0xFF;
							arg1.anInt789 = 150;
							if (local46 == 2 || local46 == 3) {
								this.method663(local266, 1, "@cr2@" + arg1.aString13, this.anInt933);
							} else if (local46 == 1) {
								this.method663(local266, 1, "@cr1@" + arg1.aString13, this.anInt933);
							} else {
								this.method663(local266, 2, arg1.aString13, this.anInt933);
							}
						} catch (@Pc(333) Exception local333) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg0.anInt672 = local200 + local58;
			}
			if ((arg2 & 0x400) != 0) {
				arg1.anInt768 = arg0.method520();
				local37 = arg0.method529();
				arg1.anInt772 = local37 >> 16;
				arg1.anInt771 = anInt993 + (local37 & 0xFFFF);
				arg1.anInt769 = 0;
				arg1.anInt770 = 0;
				if (arg1.anInt771 > anInt993) {
					arg1.anInt769 = -1;
				}
				if (arg1.anInt768 == 65535) {
					arg1.anInt768 = -1;
				}
			}
			if ((arg2 & 0x200) != 0) {
				arg1.anInt806 = arg0.method492();
				arg1.anInt808 = arg0.method492();
				arg1.anInt807 = arg0.method492();
				arg1.anInt809 = arg0.method512();
				arg1.anInt810 = arg0.method494() + anInt993;
				arg1.anInt811 = arg0.method519() + anInt993;
				arg1.anInt812 = arg0.method492();
				arg1.method566();
			}
			if ((arg2 & 0x10) != 0) {
				local37 = arg0.method510(this.aByte37);
				local46 = arg0.method512();
				arg1.method570(local37, anInt993, local46);
				arg1.anInt783 = anInt993 + 300;
				arg1.anInt784 = arg0.method510(this.aByte37);
				arg1.anInt785 = arg0.method492();
			}
			if ((arg2 & 0x80) != 0) {
				local37 = arg0.method511(435);
				@Pc(472) byte[] local472 = new byte[local37];
				@Pc(478) Class2_Sub1_Sub4 local478 = new Class2_Sub1_Sub4(859, local472);
				arg0.method530(local472, local37);
				this.aClass2_Sub1_Sub4Array1[arg3] = local478;
				arg1.method477(local478);
			}
			if ((arg2 & 0x100) != 0) {
				local37 = arg0.method511(435);
				local46 = arg0.method511(435);
				arg1.method570(local37, anInt993, local46);
				arg1.anInt783 = anInt993 + 300;
				arg1.anInt784 = arg0.method510(this.aByte37);
				arg1.anInt785 = arg0.method512();
			}
		} catch (@Pc(529) RuntimeException local529) {
			signlink.reporterror("17002, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 1 + ", " + arg3 + ", " + local529.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(Z)V")
	private void method714() {
		try {
			this.aBoolean217 &= true;
			this.aClass2_Sub1_Sub4_8.method481(1);
			if (this.anInt966 != -1) {
				this.method705(this.anInt966);
				this.anInt966 = -1;
				this.aBoolean214 = true;
				this.aBoolean211 = false;
				this.aBoolean206 = true;
			}
			if (this.anInt980 != -1) {
				this.method705(this.anInt980);
				this.anInt980 = -1;
				this.aBoolean208 = true;
				this.aBoolean211 = false;
			}
			if (this.anInt879 != -1) {
				this.method705(this.anInt879);
				this.anInt879 = -1;
				this.aBoolean209 = true;
			}
			if (this.anInt895 != -1) {
				this.method705(this.anInt895);
				this.anInt895 = -1;
			}
			if (this.anInt947 != -1) {
				this.method705(this.anInt947);
				this.anInt947 = -1;
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("95381, " + true + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
	private void method715(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) int local4 = Class33.aClass33Array1[arg0].anInt525;
			if (local4 != 0) {
				@Pc(12) int local12 = this.anIntArray250[arg0];
				this.aBoolean217 &= true;
				if (local4 == 1) {
					if (local12 == 1) {
						Class2_Sub1_Sub3_Sub1.method141(694, 0.9D);
					}
					if (local12 == 2) {
						Class2_Sub1_Sub3_Sub1.method141(694, 0.8D);
					}
					if (local12 == 3) {
						Class2_Sub1_Sub3_Sub1.method141(694, 0.7D);
					}
					if (local12 == 4) {
						Class2_Sub1_Sub3_Sub1.method141(694, 0.6D);
					}
					Class36.aClass25_5.method349();
					this.aBoolean209 = true;
				}
				if (local4 == 3) {
					@Pc(56) boolean local56 = this.aBoolean231;
					if (local12 == 0) {
						this.method610(this.aBoolean231, 0);
						this.aBoolean231 = true;
					}
					if (local12 == 1) {
						this.method610(this.aBoolean231, -400);
						this.aBoolean231 = true;
					}
					if (local12 == 2) {
						this.method610(this.aBoolean231, -800);
						this.aBoolean231 = true;
					}
					if (local12 == 3) {
						this.method610(this.aBoolean231, -1200);
						this.aBoolean231 = true;
					}
					if (local12 == 4) {
						this.aBoolean231 = false;
					}
					if (this.aBoolean231 != local56 && !aBoolean227) {
						if (this.aBoolean231) {
							this.anInt1009 = this.anInt1034;
							this.aBoolean225 = true;
							this.aClass14_Sub1_1.method87(2, this.anInt1009);
						} else {
							this.method683();
						}
						this.anInt958 = 0;
					}
				}
				if (local4 == 4) {
					if (local12 == 0) {
						this.aBoolean222 = true;
						this.method621(0);
					}
					if (local12 == 1) {
						this.aBoolean222 = true;
						this.method621(-400);
					}
					if (local12 == 2) {
						this.aBoolean222 = true;
						this.method621(-800);
					}
					if (local12 == 3) {
						this.aBoolean222 = true;
						this.method621(-1200);
					}
					if (local12 == 4) {
						this.aBoolean222 = false;
					}
				}
				if (local4 == 5) {
					this.anInt1037 = local12;
				}
				if (local4 == 6) {
					this.anInt904 = local12;
				}
				if (local4 == 8) {
					this.anInt925 = local12;
					this.aBoolean208 = true;
				}
				if (local4 == 9) {
					this.anInt885 = local12;
				}
			}
		} catch (@Pc(216) RuntimeException local216) {
			signlink.reporterror("43154, " + arg0 + ", " + true + ", " + local216.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method583() {
		try {
			this.aClass1_3 = null;
			this.aClass1_4 = null;
			this.aClass1_5 = null;
			this.aClass1_6 = null;
			this.aClass2_Sub1_Sub4_8 = null;
			this.aClass2_Sub1_Sub4_9 = null;
			this.aClass2_Sub1_Sub4_6 = null;
			this.aStringArray12 = null;
			this.aLongArray4 = null;
			this.anIntArray237 = null;
			this.aClass1_15 = null;
			this.aClass1_16 = null;
			this.aClass1_17 = null;
			this.aClass1_18 = null;
			this.aClass1_22 = null;
			this.aClass1_23 = null;
			this.aClass1_19 = null;
			this.aClass1_20 = null;
			this.aClass1_21 = null;
			this.aClass1_7 = null;
			this.aClass1_8 = null;
			this.aClass1_9 = null;
			this.aClass1_10 = null;
			this.aClass1_11 = null;
			try {
				if (this.aClass32_1 != null) {
					this.aClass32_1.method420();
				}
			} catch (@Pc(83) Exception local83) {
			}
			this.aClass32_1 = null;
			this.method683();
			this.aClass2_Sub1_Sub3_Sub3_4 = null;
			this.aClass2_Sub1_Sub3_Sub3_6 = null;
			this.aClass2_Sub1_Sub3_Sub3_7 = null;
			this.aClass2_Sub1_Sub3_Sub3_8 = null;
			this.aClass2_Sub1_Sub3_Sub3_9 = null;
			this.aClass2_Sub1_Sub3_Sub3_10 = null;
			this.aClass2_Sub1_Sub3_Sub3_17 = null;
			this.anIntArray212 = null;
			this.anIntArray213 = null;
			this.anIntArray214 = null;
			this.anIntArray215 = null;
			this.aStringArray10 = null;
			this.aClass2_Sub1_Sub3_Sub4Array5 = null;
			this.anIntArrayArrayArray8 = null;
			this.aByteArrayArrayArray8 = null;
			this.aClass20_1 = null;
			this.aClass42Array1 = null;
			this.anIntArray251 = null;
			this.anIntArray252 = null;
			this.aClass2_Sub1_Sub3_Sub3Array7 = null;
			this.aClass2_Sub1_Sub1_Sub2_Sub1Array1 = null;
			this.anIntArray243 = null;
			this.anIntArray244 = null;
			this.aClass2_Sub1_Sub4Array1 = null;
			this.anIntArray258 = null;
			this.aClass2_Sub1_Sub4_7 = null;
			this.anIntArray250 = null;
			this.aClass2_Sub1_Sub1_Sub2_Sub2Array1 = null;
			this.anIntArray242 = null;
			this.anIntArrayArray25 = null;
			this.aClass38_12 = null;
			this.aClass38_11 = null;
			this.aClass2_Sub1_Sub3_Sub4_1 = null;
			this.aClass2_Sub1_Sub3_Sub4_2 = null;
			this.aClass2_Sub1_Sub3_Sub4_3 = null;
			this.aClass2_Sub1_Sub3_Sub4_4 = null;
			this.aClass2_Sub1_Sub3_Sub4_5 = null;
			this.aClass2_Sub1_Sub3_Sub4_16 = null;
			this.aClass2_Sub1_Sub3_Sub4_17 = null;
			this.aClass2_Sub1_Sub3_Sub4_18 = null;
			this.aClass2_Sub1_Sub3_Sub4_9 = null;
			this.aClass2_Sub1_Sub3_Sub4_10 = null;
			this.aClass2_Sub1_Sub3_Sub4_11 = null;
			this.aClass2_Sub1_Sub3_Sub4_12 = null;
			this.aClass2_Sub1_Sub3_Sub4_13 = null;
			if (this.aClass14_Sub1_1 != null) {
				this.aClass14_Sub1_1.method89();
			}
			this.aClass14_Sub1_1 = null;
			this.anIntArrayArray24 = null;
			this.anIntArrayArray23 = null;
			this.anIntArray247 = null;
			this.anIntArray248 = null;
			this.aClass1_12 = null;
			this.aClass1_13 = null;
			this.aClass1_14 = null;
			this.aClass2_Sub1_Sub3_Sub3_3 = null;
			this.aClass2_Sub1_Sub3_Sub3Array10 = null;
			this.aClass2_Sub1_Sub3_Sub3Array4 = null;
			this.aClass2_Sub1_Sub3_Sub3Array6 = null;
			this.aClass2_Sub1_Sub3_Sub3Array5 = null;
			this.aClass2_Sub1_Sub3_Sub3Array8 = null;
			this.anIntArray219 = null;
			this.aByteArrayArray6 = null;
			this.aByteArrayArray5 = null;
			this.anIntArray220 = null;
			this.anIntArray221 = null;
			this.aByteArray21 = null;
			this.aClass38ArrayArrayArray1 = null;
			this.aClass38_10 = null;
			this.aClass1_24 = null;
			this.aClass1_25 = null;
			this.aClass1_26 = null;
			this.aClass1_27 = null;
			this.aClass2_Sub1_Sub3_Sub4Array4 = null;
			this.aClass2_Sub1_Sub3_Sub3Array9 = null;
			if (this.aClass31_1 != null) {
				this.aClass31_1.aBoolean131 = false;
			}
			this.aClass31_1 = null;
			this.aClass2_Sub1_Sub3_Sub4_6 = null;
			this.aClass2_Sub1_Sub3_Sub4_7 = null;
			this.aClass2_Sub1_Sub3_Sub4_8 = null;
			this.method632();
			Class37.method447();
			Class48.method556();
			Class36.method437();
			Class19.method220();
			Class11.aClass11Array1 = null;
			Class27.aClass27Array1 = null;
			Class23.aClass23Array1 = null;
			Class22.aClass22Array1 = null;
			Class16.aClass16Array1 = null;
			Class16.aClass25_1 = null;
			Class33.aClass33Array1 = null;
			super.aClass1_2 = null;
			Class2_Sub1_Sub1_Sub2_Sub1.aClass25_8 = null;
			Class2_Sub1_Sub3_Sub1.method132((byte) 7);
			Class20.method221((byte) 7);
			Class2_Sub1_Sub1_Sub6.method381((byte) 7);
			Class29.method417((byte) 7);
			System.gc();
		} catch (@Pc(374) RuntimeException local374) {
			signlink.reporterror("9509, " + -41727 + ", " + local374.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private void method716(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt995 == 0 && this.anInt913 == 0) {
				this.aStringArray10[this.anInt1053] = "Walk here";
				this.anIntArray214[this.anInt1053] = 113;
				this.anIntArray212[this.anInt1053] = super.anInt830;
				this.anIntArray213[this.anInt1053] = super.anInt831;
				this.anInt1053++;
			}
			@Pc(41) int local41 = -1;
			for (@Pc(43) int local43 = 0; local43 < Class2_Sub1_Sub1_Sub6.anInt506; local43++) {
				@Pc(49) int local49 = Class2_Sub1_Sub1_Sub6.anIntArray146[local43];
				@Pc(53) int local53 = local49 & 0x7F;
				@Pc(59) int local59 = local49 >> 7 & 0x7F;
				@Pc(65) int local65 = local49 >> 29 & 0x3;
				@Pc(71) int local71 = local49 >> 14 & 0x7FFF;
				if (local49 != local41) {
					local41 = local49;
					@Pc(218) int local218;
					if (local65 == 2 && this.aClass20_1.method252(this.anInt953, local53, local59, local49) >= 0) {
						@Pc(91) Class37 local91 = Class37.method451(local71);
						if (local91.anIntArray169 != null) {
							local91 = local91.method455(363);
						}
						if (local91 == null) {
							continue;
						}
						if (this.anInt995 == 1) {
							this.aStringArray10[this.anInt1053] = "Use " + this.aString25 + " with @cya@" + local91.aString11;
							this.anIntArray214[this.anInt1053] = 438;
							this.anIntArray215[this.anInt1053] = local49;
							this.anIntArray212[this.anInt1053] = local53;
							this.anIntArray213[this.anInt1053] = local59;
							this.anInt1053++;
						} else if (this.anInt913 != 1) {
							if (local91.aStringArray5 != null) {
								for (local218 = 4; local218 >= 0; local218--) {
									if (local91.aStringArray5[local218] != null) {
										this.aStringArray10[this.anInt1053] = local91.aStringArray5[local218] + " @cya@" + local91.aString11;
										if (local218 == 0) {
											this.anIntArray214[this.anInt1053] = 479;
										}
										if (local218 == 1) {
											this.anIntArray214[this.anInt1053] = 753;
										}
										if (local218 == 2) {
											this.anIntArray214[this.anInt1053] = 202;
										}
										if (local218 == 3) {
											this.anIntArray214[this.anInt1053] = 111;
										}
										if (local218 == 4) {
											this.anIntArray214[this.anInt1053] = 1790;
										}
										this.anIntArray215[this.anInt1053] = local49;
										this.anIntArray212[this.anInt1053] = local53;
										this.anIntArray213[this.anInt1053] = local59;
										this.anInt1053++;
									}
								}
							}
							this.aStringArray10[this.anInt1053] = "Examine @cya@" + local91.aString11;
							this.anIntArray214[this.anInt1053] = 1083;
							this.anIntArray215[this.anInt1053] = local91.anInt581 << 14;
							this.anIntArray212[this.anInt1053] = local53;
							this.anIntArray213[this.anInt1053] = local59;
							this.anInt1053++;
						} else if ((this.anInt915 & 0x4) == 4) {
							this.aStringArray10[this.anInt1053] = this.aString20 + " @cya@" + local91.aString11;
							this.anIntArray214[this.anInt1053] = 918;
							this.anIntArray215[this.anInt1053] = local49;
							this.anIntArray212[this.anInt1053] = local53;
							this.anIntArray213[this.anInt1053] = local59;
							this.anInt1053++;
						}
					}
					@Pc(398) Class2_Sub1_Sub1_Sub2_Sub2 local398;
					@Pc(446) Class2_Sub1_Sub1_Sub2_Sub1 local446;
					@Pc(436) int local436;
					if (local65 == 1) {
						@Pc(369) Class2_Sub1_Sub1_Sub2_Sub2 local369 = this.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local71];
						if (local369.aClass48_2.aByte25 == 1 && (local369.anInt778 & 0x7F) == 64 && (local369.anInt779 & 0x7F) == 64) {
							for (local218 = 0; local218 < this.anInt957; local218++) {
								local398 = this.aClass2_Sub1_Sub1_Sub2_Sub2Array1[this.anIntArray242[local218]];
								if (local398 != null && local398 != local369 && local398.aClass48_2.aByte25 == 1 && local398.anInt778 == local369.anInt778 && local398.anInt779 == local369.anInt779) {
									this.method700(local53, local398.aClass48_2, local59, this.anIntArray242[local218]);
								}
							}
							for (local436 = 0; local436 < this.anInt964; local436++) {
								local446 = this.aClass2_Sub1_Sub1_Sub2_Sub1Array1[this.anIntArray243[local436]];
								if (local446 != null && local446.anInt778 == local369.anInt778 && local446.anInt779 == local369.anInt779) {
									this.method608(local446, local53, this.anIntArray243[local436], this.anInt1011, local59);
								}
							}
						}
						this.method700(local53, local369.aClass48_2, local59, local71);
					}
					if (local65 == 0) {
						@Pc(489) Class2_Sub1_Sub1_Sub2_Sub1 local489 = this.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local71];
						if ((local489.anInt778 & 0x7F) == 64 && (local489.anInt779 & 0x7F) == 64) {
							for (local218 = 0; local218 < this.anInt957; local218++) {
								local398 = this.aClass2_Sub1_Sub1_Sub2_Sub2Array1[this.anIntArray242[local218]];
								if (local398 != null && local398.aClass48_2.aByte25 == 1 && local398.anInt778 == local489.anInt778 && local398.anInt779 == local489.anInt779) {
									this.method700(local53, local398.aClass48_2, local59, this.anIntArray242[local218]);
								}
							}
							for (local436 = 0; local436 < this.anInt964; local436++) {
								local446 = this.aClass2_Sub1_Sub1_Sub2_Sub1Array1[this.anIntArray243[local436]];
								if (local446 != null && local446 != local489 && local446.anInt778 == local489.anInt778 && local446.anInt779 == local489.anInt779) {
									this.method608(local446, local53, this.anIntArray243[local436], this.anInt1011, local59);
								}
							}
						}
						this.method608(local489, local53, local71, this.anInt1011, local59);
					}
					if (local65 == 3) {
						@Pc(610) Class38 local610 = this.aClass38ArrayArrayArray1[this.anInt953][local53][local59];
						if (local610 != null) {
							for (@Pc(617) Class2_Sub1_Sub1_Sub4 local617 = (Class2_Sub1_Sub1_Sub4) local610.method462(); local617 != null; local617 = (Class2_Sub1_Sub1_Sub4) local610.method464(this.aByte28)) {
								@Pc(623) Class36 local623 = Class36.method434(local617.anInt161);
								if (this.anInt995 == 1) {
									this.aStringArray10[this.anInt1053] = "Use " + this.aString25 + " with @lre@" + local623.aString10;
									this.anIntArray214[this.anInt1053] = 469;
									this.anIntArray215[this.anInt1053] = local617.anInt161;
									this.anIntArray212[this.anInt1053] = local53;
									this.anIntArray213[this.anInt1053] = local59;
									this.anInt1053++;
								} else if (this.anInt913 != 1) {
									for (@Pc(740) int local740 = 4; local740 >= 0; local740--) {
										if (local623.aStringArray4 != null && local623.aStringArray4[local740] != null) {
											this.aStringArray10[this.anInt1053] = local623.aStringArray4[local740] + " @lre@" + local623.aString10;
											if (local740 == 0) {
												this.anIntArray214[this.anInt1053] = 882;
											}
											if (local740 == 1) {
												this.anIntArray214[this.anInt1053] = 756;
											}
											if (local740 == 2) {
												this.anIntArray214[this.anInt1053] = 420;
											}
											if (local740 == 3) {
												this.anIntArray214[this.anInt1053] = 618;
											}
											if (local740 == 4) {
												this.anIntArray214[this.anInt1053] = 233;
											}
											this.anIntArray215[this.anInt1053] = local617.anInt161;
											this.anIntArray212[this.anInt1053] = local53;
											this.anIntArray213[this.anInt1053] = local59;
											this.anInt1053++;
										} else if (local740 == 2) {
											this.aStringArray10[this.anInt1053] = "Take @lre@" + local623.aString10;
											this.anIntArray214[this.anInt1053] = 420;
											this.anIntArray215[this.anInt1053] = local617.anInt161;
											this.anIntArray212[this.anInt1053] = local53;
											this.anIntArray213[this.anInt1053] = local59;
											this.anInt1053++;
										}
									}
									this.aStringArray10[this.anInt1053] = "Examine @lre@" + local623.aString10;
									this.anIntArray214[this.anInt1053] = 1936;
									this.anIntArray215[this.anInt1053] = local617.anInt161;
									this.anIntArray212[this.anInt1053] = local53;
									this.anIntArray213[this.anInt1053] = local59;
									this.anInt1053++;
								} else if ((this.anInt915 & 0x1) == 1) {
									this.aStringArray10[this.anInt1053] = this.aString20 + " @lre@" + local623.aString10;
									this.anIntArray214[this.anInt1053] = 978;
									this.anIntArray215[this.anInt1053] = local617.anInt161;
									this.anIntArray212[this.anInt1053] = local53;
									this.anIntArray213[this.anInt1053] = local59;
									this.anInt1053++;
								}
							}
						}
					}
				}
			}
			@Pc(950) boolean local950 = true;
		} catch (@Pc(952) RuntimeException local952) {
			signlink.reporterror("73454, " + arg0 + ", " + local952.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!AQPBLKMD;II)V")
	private void method717(@OriginalArg(0) Class2_Sub1_Sub1_Sub2 arg0, @OriginalArg(1) int arg1) {
		try {
			this.method718(arg0.anInt778, arg0.anInt779, arg1);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("83922, " + arg0 + ", " + arg1 + ", " + -29444 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)V")
	private void method718(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg0 >= 128 && arg1 >= 128 && arg0 <= 13056 && arg1 <= 13056) {
				@Pc(29) int local29 = this.method720(arg0, this.anInt953, arg1, this.anInt905) - arg2;
				@Pc(34) int local34 = arg0 - this.anInt843;
				@Pc(39) int local39 = local29 - this.anInt844;
				@Pc(44) int local44 = arg1 - this.anInt845;
				@Pc(49) int local49 = Class2_Sub1_Sub1_Sub6.anIntArray147[this.anInt846];
				@Pc(54) int local54 = Class2_Sub1_Sub1_Sub6.anIntArray148[this.anInt846];
				@Pc(59) int local59 = Class2_Sub1_Sub1_Sub6.anIntArray147[this.anInt847];
				@Pc(64) int local64 = Class2_Sub1_Sub1_Sub6.anIntArray148[this.anInt847];
				@Pc(74) int local74 = local44 * local59 + local34 * local64 >> 16;
				@Pc(84) int local84 = local44 * local64 - local34 * local59 >> 16;
				@Pc(86) int local86 = local74;
				@Pc(96) int local96 = local39 * local54 - local84 * local49 >> 16;
				@Pc(106) int local106 = local39 * local49 + local84 * local54 >> 16;
				if (local106 >= 50) {
					this.anInt959 = Class2_Sub1_Sub3_Sub1.anInt226 + (local86 << 9) / local106;
					this.anInt960 = Class2_Sub1_Sub3_Sub1.anInt227 + (local96 << 9) / local106;
				} else {
					this.anInt959 = -1;
					this.anInt960 = -1;
				}
			} else {
				this.anInt959 = -1;
				this.anInt960 = -1;
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("34350, " + arg0 + ", " + 4 + ", " + arg1 + ", " + arg2 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(Z)V")
	private void method719() {
		try {
			Class37.aClass25_6.method349();
			this.aBoolean217 &= true;
			Class37.aClass25_7.method349();
			Class48.aClass25_9.method349();
			Class36.aClass25_4.method349();
			Class36.aClass25_5.method349();
			Class2_Sub1_Sub1_Sub2_Sub1.aClass25_8.method349();
			Class16.aClass25_1.method349();
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("8187, " + true + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)I")
	private int method720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) int local3 = arg0 >> 7;
			@Pc(7) int local7 = arg2 >> 7;
			if (local3 < 0 || local7 < 0 || local3 > 103 || local7 > 103) {
				return 0;
			}
			@Pc(21) int local21 = arg1;
			if (arg1 < 3 && (this.aByteArrayArrayArray8[1][local3][local7] & 0x2) == 2) {
				local21 = arg1 + 1;
			}
			@Pc(41) int local41 = arg0 & 0x7F;
			@Pc(45) int local45 = arg2 & 0x7F;
			@Pc(73) int local73 = this.anIntArrayArrayArray8[local21][local3][local7] * (128 - local41) + this.anIntArrayArrayArray8[local21][local3 + 1][local7] * local41 >> 7;
			@Pc(105) int local105 = this.anIntArrayArrayArray8[local21][local3][local7 + 1] * (128 - local41) + this.anIntArrayArrayArray8[local21][local3 + 1][local7 + 1] * local41 >> 7;
			if (arg3 != 0) {
				this.anInt866 = -1;
			}
			return local73 * (128 - local45) + local105 * local45 >> 7;
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("7082, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IIII)Z")
	private boolean method721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(7) int local7 = arg3 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass20_1.method252(this.anInt953, arg0, arg2, arg3);
			if (local16 == -1) {
				return false;
			}
			@Pc(25) int local25 = local16 & 0x1F;
			@Pc(31) int local31 = local16 >> 6 & 0x3;
			if (local25 == 10 || local25 == 11 || local25 == 22) {
				@Pc(43) Class37 local43 = Class37.method451(local7);
				@Pc(51) int local51;
				@Pc(54) int local54;
				if (local31 == 0 || local31 == 2) {
					local51 = local43.anInt575;
					local54 = local43.anInt593;
				} else {
					local51 = local43.anInt593;
					local54 = local43.anInt575;
				}
				@Pc(65) int local65 = local43.anInt592;
				if (local31 != 0) {
					local65 = (local65 << local31 & 0xF) + (local65 >> 4 - local31);
				}
				this.method604(local51, local65, aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray209[0], aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray208[0], 0, arg0, (byte) 9, 0, arg2, 2, local54, true);
			} else {
				this.method604(0, 0, aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray209[0], aClass2_Sub1_Sub1_Sub2_Sub1_1.anIntArray208[0], local31, arg0, (byte) 9, local25 + 1, arg2, 2, 0, true);
			}
			this.anInt875 = super.anInt836;
			this.anInt876 = super.anInt837;
			this.anInt878 = 2;
			this.anInt877 = 0;
			@Pc(143) boolean local143 = false;
			return true;
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("54588, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ILclient!TKPFKOXP;I)V")
	private void method722(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub4 arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt965; local1++) {
				@Pc(8) int local8 = this.anIntArray244[local1];
				@Pc(13) Class2_Sub1_Sub1_Sub2_Sub1 local13 = this.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local8];
				@Pc(16) int local16 = arg1.method492();
				if ((local16 & 0x1) != 0) {
					local16 += arg1.method492() << 8;
				}
				this.method713(arg1, local13, local16, local8);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("1453, " + arg0 + ", " + arg1 + ", " + 585 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(B)V")
	private void method723() {
		try {
			@Pc(7) int local7;
			if (this.aByte26 != -54) {
				for (local7 = 1; local7 > 0; local7++) {
				}
			}
			if (this.anInt986 == 0) {
				local7 = super.anInt835;
				if (this.anInt913 == 1 && super.anInt836 >= 516 && super.anInt837 >= 160 && super.anInt836 <= 765 && super.anInt837 <= 205) {
					local7 = 0;
				}
				@Pc(50) int local50;
				@Pc(53) int local53;
				@Pc(129) int local129;
				if (this.aBoolean233) {
					if (local7 != 1) {
						local50 = super.anInt830;
						local53 = super.anInt831;
						if (this.anInt880 == 0) {
							local50 -= 4;
							local53 -= 4;
						}
						if (this.anInt880 == 1) {
							local50 -= 553;
							local53 -= 205;
						}
						if (this.anInt880 == 2) {
							local50 -= 17;
							local53 -= 357;
						}
						if (local50 < this.anInt881 - 10 || local50 > this.anInt881 + this.anInt883 + 10 || local53 < this.anInt882 - 10 || local53 > this.anInt882 + this.anInt884 + 10) {
							this.aBoolean233 = false;
							if (this.anInt880 == 1) {
								this.aBoolean214 = true;
							}
							if (this.anInt880 == 2) {
								this.aBoolean208 = true;
							}
						}
					}
					if (local7 == 1) {
						local50 = this.anInt881;
						local53 = this.anInt882;
						local129 = this.anInt883;
						@Pc(132) int local132 = super.anInt836;
						@Pc(135) int local135 = super.anInt837;
						if (this.anInt880 == 0) {
							local132 -= 4;
							local135 -= 4;
						}
						if (this.anInt880 == 1) {
							local132 -= 553;
							local135 -= 205;
						}
						if (this.anInt880 == 2) {
							local132 -= 17;
							local135 -= 357;
						}
						@Pc(154) int local154 = -1;
						for (@Pc(156) int local156 = 0; local156 < this.anInt1053; local156++) {
							@Pc(171) int local171 = local53 + (this.anInt1053 - 1 - local156) * 15 + 31;
							if (local132 > local50 && local132 < local50 + local129 && local135 > local171 - 13 && local135 < local171 + 3) {
								local154 = local156;
							}
						}
						if (local154 != -1) {
							this.method616(local154);
						}
						this.aBoolean233 = false;
						if (this.anInt880 == 1) {
							this.aBoolean214 = true;
						}
						if (this.anInt880 == 2) {
							this.aBoolean208 = true;
							return;
						}
					}
				} else {
					if (local7 == 1 && this.anInt1053 > 0) {
						local50 = this.anIntArray214[this.anInt1053 - 1];
						if (local50 == 352 || local50 == 839 || local50 == 561 || local50 == 240 || local50 == 648 || local50 == 724 || local50 == 660 || local50 == 228 || local50 == 633 || local50 == 103 || local50 == 440 || local50 == 1251) {
							local53 = this.anIntArray212[this.anInt1053 - 1];
							local129 = this.anIntArray213[this.anInt1053 - 1];
							@Pc(290) Class19 local290 = Class19.method213(local129);
							if (local290.aBoolean72 || local290.aBoolean73) {
								this.aBoolean202 = false;
								this.anInt1054 = 0;
								this.anInt984 = local129;
								this.anInt985 = local53;
								this.anInt986 = 2;
								this.anInt987 = super.anInt836;
								this.anInt988 = super.anInt837;
								if (Class19.method213(local129).anInt309 == this.anInt947) {
									this.anInt986 = 1;
								}
								if (Class19.method213(local129).anInt309 == this.anInt980) {
									this.anInt986 = 3;
								}
								return;
							}
						}
					}
					if (local7 == 1 && (this.anInt1037 == 1 || this.method665(this.anInt1053 - 1)) && this.anInt1053 > 2) {
						local7 = 2;
					}
					if (local7 == 1 && this.anInt1053 > 0) {
						this.method616(this.anInt1053 - 1);
					}
					if (local7 != 2 || this.anInt1053 <= 0) {
						return;
					}
					this.method590(this.anInt1003);
				}
			}
		} catch (@Pc(384) RuntimeException local384) {
			signlink.reporterror("16794, " + -54 + ", " + local384.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!IJNDWVIL;Z)V")
	private void method724(@OriginalArg(0) Class19 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt307;
			this.aBoolean217 &= true;
			@Pc(66) int local66;
			if ((local4 < 1 || local4 > 100) && (local4 < 701 || local4 > 800)) {
				if (local4 >= 101 && local4 <= 200 || !(local4 < 801 || local4 > 900)) {
					local66 = this.anInt954;
					if (this.anInt955 != 2) {
						local66 = 0;
					}
					if (local4 > 800) {
						local4 -= 701;
					} else {
						local4 -= 101;
					}
					if (local4 >= local66) {
						arg0.aString7 = "";
						arg0.anInt306 = 0;
					} else {
						if (this.anIntArray237[local4] == 0) {
							arg0.aString7 = "@red@Offline";
						} else if (this.anIntArray237[local4] < 200) {
							if (this.anIntArray237[local4] == anInt1013) {
								arg0.aString7 = "@gre@World" + (this.anIntArray237[local4] - 9);
							} else {
								arg0.aString7 = "@yel@World" + (this.anIntArray237[local4] - 9);
							}
						} else if (this.anIntArray237[local4] == anInt1013) {
							arg0.aString7 = "@gre@Classic" + (this.anIntArray237[local4] - 219);
						} else {
							arg0.aString7 = "@yel@Classic" + (this.anIntArray237[local4] - 219);
						}
						arg0.anInt306 = 1;
					}
				} else if (local4 == 203) {
					local66 = this.anInt954;
					if (this.anInt955 != 2) {
						local66 = 0;
					}
					arg0.anInt292 = local66 * 15 + 20;
					if (arg0.anInt292 <= arg0.anInt302) {
						arg0.anInt292 = arg0.anInt302 + 1;
					}
				} else if (local4 >= 401 && local4 <= 500) {
					local4 -= 401;
					if (local4 == 0 && this.anInt955 == 0) {
						arg0.aString7 = "Loading ignore list";
						arg0.anInt306 = 0;
					} else if (local4 == 1 && this.anInt955 == 0) {
						arg0.aString7 = "Please wait...";
						arg0.anInt306 = 0;
					} else {
						local66 = this.anInt1007;
						if (this.anInt955 == 0) {
							local66 = 0;
						}
						if (local4 >= local66) {
							arg0.aString7 = "";
							arg0.anInt306 = 0;
						} else {
							arg0.aString7 = Class7.method59(Class7.method56(this.aLongArray3[local4]));
							arg0.anInt306 = 1;
						}
					}
				} else if (local4 == 503) {
					arg0.anInt292 = this.anInt1007 * 15 + 20;
					if (arg0.anInt292 <= arg0.anInt302) {
						arg0.anInt292 = arg0.anInt302 + 1;
					}
				} else if (local4 == 327) {
					arg0.anInt295 = 150;
					arg0.anInt296 = (int) (Math.sin((double) anInt993 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean234) {
						for (local66 = 0; local66 < 7; local66++) {
							@Pc(379) int local379 = this.anIntArray227[local66];
							if (local379 >= 0 && !Class27.aClass27Array1[local379].method373()) {
								return;
							}
						}
						this.aBoolean234 = false;
						@Pc(398) Class2_Sub1_Sub1_Sub6[] local398 = new Class2_Sub1_Sub1_Sub6[7];
						@Pc(400) int local400 = 0;
						for (@Pc(402) int local402 = 0; local402 < 7; local402++) {
							@Pc(409) int local409 = this.anIntArray227[local402];
							if (local409 >= 0) {
								local398[local400++] = Class27.aClass27Array1[local409].method374();
							}
						}
						@Pc(431) Class2_Sub1_Sub1_Sub6 local431 = new Class2_Sub1_Sub1_Sub6(local400, (byte) -112, local398);
						for (@Pc(433) int local433 = 0; local433 < 5; local433++) {
							if (this.anIntArray228[local433] != 0) {
								local431.method399(anIntArrayArray22[local433][0], anIntArrayArray22[local433][this.anIntArray228[local433]]);
								if (local433 == 1) {
									local431.method399(anIntArray223[0], anIntArray223[this.anIntArray228[local433]]);
								}
							}
						}
						local431.method392();
						local431.method393((byte) 9, Class22.aClass22Array1[aClass2_Sub1_Sub1_Sub2_Sub1_1.anInt804].anIntArray92[0]);
						local431.method402(64, 850, -30, -50, -30, true);
						arg0.anInt304 = 5;
						arg0.anInt305 = 0;
						Class19.method219(local431);
					}
				} else if (local4 == 324) {
					if (this.aClass2_Sub1_Sub3_Sub3_13 == null) {
						this.aClass2_Sub1_Sub3_Sub3_13 = arg0.aClass2_Sub1_Sub3_Sub3_2;
						this.aClass2_Sub1_Sub3_Sub3_14 = arg0.aClass2_Sub1_Sub3_Sub3_1;
					}
					if (this.aBoolean224) {
						arg0.aClass2_Sub1_Sub3_Sub3_2 = this.aClass2_Sub1_Sub3_Sub3_14;
					} else {
						arg0.aClass2_Sub1_Sub3_Sub3_2 = this.aClass2_Sub1_Sub3_Sub3_13;
					}
				} else if (local4 == 325) {
					if (this.aClass2_Sub1_Sub3_Sub3_13 == null) {
						this.aClass2_Sub1_Sub3_Sub3_13 = arg0.aClass2_Sub1_Sub3_Sub3_2;
						this.aClass2_Sub1_Sub3_Sub3_14 = arg0.aClass2_Sub1_Sub3_Sub3_1;
					}
					if (this.aBoolean224) {
						arg0.aClass2_Sub1_Sub3_Sub3_2 = this.aClass2_Sub1_Sub3_Sub3_13;
					} else {
						arg0.aClass2_Sub1_Sub3_Sub3_2 = this.aClass2_Sub1_Sub3_Sub3_14;
					}
				} else if (local4 == 600) {
					arg0.aString7 = this.aString19;
					if (anInt993 % 20 < 10) {
						arg0.aString7 = arg0.aString7 + "|";
					} else {
						arg0.aString7 = arg0.aString7 + " ";
					}
				} else {
					if (local4 == 620) {
						if (this.anInt1046 < 1) {
							arg0.aString7 = "";
						} else if (this.aBoolean230) {
							arg0.anInt301 = 16711680;
							arg0.aString7 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg0.anInt301 = 16777215;
							arg0.aString7 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(638) String local638;
					if (local4 == 660) {
						local66 = this.anInt858 - this.anInt956;
						if (local66 <= 0) {
							local638 = "earlier today";
						} else if (local66 == 1) {
							local638 = "yesterday";
						} else {
							local638 = local66 + " days ago";
						}
						arg0.aString7 = "You last logged in @red@" + local638 + "@bla@ from: @red@" + signlink.dns;
					}
					if (local4 == 661) {
						if (this.anInt1008 == 0) {
							arg0.aString7 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
						} else if (this.anInt1008 <= this.anInt858) {
							arg0.aString7 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method725(this.anInt1008);
						} else {
							local66 = this.anInt858 + 14 - this.anInt1008;
							if (local66 <= 0) {
								local638 = "Earlier today";
							} else if (local66 == 1) {
								local638 = "Yesterday";
							} else {
								local638 = local66 + " days ago";
							}
							arg0.aString7 = local638 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method725(this.anInt1008) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
						}
					}
					if (local4 == 662) {
						@Pc(756) String local756;
						if (this.anInt1030 == 0) {
							local756 = "@yel@0 unread messages";
						} else if (this.anInt1030 == 1) {
							local756 = "@gre@1 unread message";
						} else {
							local756 = "@gre@" + this.anInt1030 + " unread messages";
						}
						arg0.aString7 = "You have " + local756 + "\\nin your message centre.";
					}
					if (local4 == 663) {
						if (this.anInt1002 > 0 && this.anInt1002 <= this.anInt858 + 10) {
							arg0.aString7 = "Last password change:\\n@gre@" + this.method725(this.anInt1002);
						} else {
							arg0.aString7 = "Last password change:\\n@gre@Never changed";
						}
					}
					if (local4 == 665) {
						if (this.anInt945 > 2 && !aBoolean226) {
							arg0.aString7 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
						} else if (this.anInt945 > 2) {
							arg0.aString7 = "\\n\\nYou have @gre@" + this.anInt945 + "@yel@ days of\\nmember credit remaining.";
						} else if (this.anInt945 > 0) {
							arg0.aString7 = "You have @gre@" + this.anInt945 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
						} else {
							arg0.aString7 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
						}
					}
					if (local4 == 667) {
						if (this.anInt945 > 2 && !aBoolean226) {
							arg0.aString7 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
						} else if (this.anInt945 > 0) {
							arg0.aString7 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
						} else {
							arg0.aString7 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
						}
					}
					if (local4 == 668) {
						if (this.anInt1008 > this.anInt858) {
							arg0.aString7 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
						} else {
							arg0.aString7 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
						}
					}
				}
			} else if (local4 == 1 && this.anInt955 == 0) {
				arg0.aString7 = "Loading friend list";
				arg0.anInt306 = 0;
			} else if (local4 == 1 && this.anInt955 == 1) {
				arg0.aString7 = "Connecting to friendserver";
				arg0.anInt306 = 0;
			} else if (local4 == 2 && this.anInt955 != 2) {
				arg0.aString7 = "Please wait...";
				arg0.anInt306 = 0;
			} else {
				local66 = this.anInt954;
				if (this.anInt955 != 2) {
					local66 = 0;
				}
				if (local4 > 700) {
					local4 -= 601;
				} else {
					local4--;
				}
				if (local4 >= local66) {
					arg0.aString7 = "";
					arg0.anInt306 = 0;
				} else {
					arg0.aString7 = this.aStringArray12[local4];
					arg0.anInt306 = 1;
				}
			}
		} catch (@Pc(913) RuntimeException local913) {
			signlink.reporterror("69167, " + arg0 + ", " + true + ", " + local913.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(II)Ljava/lang/String;")
	private String method725(@OriginalArg(1) int arg0) {
		try {
			if (arg0 > this.anInt858 + 10) {
				return "Unknown";
			}
			@Pc(14) long local14 = ((long) arg0 + 11745L) * 86400000L;
			@Pc(16) Calendar local16 = Calendar.getInstance();
			local16.setTime(new Date(local14));
			@Pc(26) int local26 = local16.get(5);
			@Pc(37) int local37 = local16.get(2);
			@Pc(41) int local41 = local16.get(1);
			@Pc(92) String[] local92 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
			return local26 + "-" + local92[local37] + "-" + local41;
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("54839, " + 0 + ", " + arg0 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!TKPFKOXP;)V")
	private void method726(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Class2_Sub1_Sub4 arg2) {
		try {
			if (arg1 != 8) {
				this.aClass2_Sub1_Sub4_8.method482(95);
			}
			arg2.method502((byte) 5);
			@Pc(14) int local14 = arg2.method503(1);
			if (local14 != 0) {
				@Pc(22) int local22 = arg2.method503(2);
				if (local22 == 0) {
					this.anIntArray244[this.anInt965++] = this.anInt963;
				} else {
					@Pc(45) int local45;
					@Pc(55) int local55;
					if (local22 == 1) {
						local45 = arg2.method503(3);
						aClass2_Sub1_Sub1_Sub2_Sub1_1.method569(local45, false);
						local55 = arg2.method503(1);
						if (local55 == 1) {
							this.anIntArray244[this.anInt965++] = this.anInt963;
						}
					} else {
						@Pc(99) int local99;
						if (local22 == 2) {
							local45 = arg2.method503(3);
							aClass2_Sub1_Sub1_Sub2_Sub1_1.method569(local45, true);
							local55 = arg2.method503(3);
							aClass2_Sub1_Sub1_Sub2_Sub1_1.method569(local55, true);
							local99 = arg2.method503(1);
							if (local99 == 1) {
								this.anIntArray244[this.anInt965++] = this.anInt963;
							}
						} else if (local22 == 3) {
							local45 = arg2.method503(7);
							local55 = arg2.method503(1);
							local99 = arg2.method503(1);
							if (local99 == 1) {
								this.anIntArray244[this.anInt965++] = this.anInt963;
							}
							@Pc(153) int local153 = arg2.method503(7);
							this.anInt953 = arg2.method503(2);
							aClass2_Sub1_Sub1_Sub2_Sub1_1.method567(local153, local55 == 1, local45);
						}
					}
				}
			}
		} catch (@Pc(172) RuntimeException local172) {
			signlink.reporterror("78052, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local172.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!IJNDWVIL;IIIIII)V")
	private void method727(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			if (arg1.anInt310 == 0 && arg1.anIntArray66 != null && !arg1.aBoolean75 && (arg6 >= arg0 && arg7 >= arg5 && arg6 <= arg0 + arg1.anInt288 && arg7 <= arg5 + arg1.anInt302)) {
				@Pc(34) int local34 = arg1.anIntArray66.length;
				if (arg4 >= 0) {
					this.aBoolean204 = !this.aBoolean204;
				}
				for (@Pc(46) int local46 = 0; local46 < local34; local46++) {
					@Pc(55) int local55 = arg1.anIntArray65[local46] + arg0;
					@Pc(64) int local64 = arg1.anIntArray68[local46] + arg5 - arg3;
					@Pc(70) Class19 local70 = Class19.method213(arg1.anIntArray66[local46]);
					@Pc(75) int local75 = local55 + local70.anInt287;
					@Pc(80) int local80 = local64 + local70.anInt290;
					if ((local70.anInt299 >= 0 || local70.anInt285 != 0) && arg6 >= local75 && arg7 >= local80 && arg6 < local75 + local70.anInt288 && arg7 < local80 + local70.anInt302) {
						if (local70.anInt299 >= 0) {
							this.anInt857 = local70.anInt299;
						} else {
							this.anInt857 = local70.anInt293;
						}
					}
					if (local70.anInt310 == 8 && arg6 >= local75 && arg7 >= local80 && arg6 < local75 + local70.anInt288 && arg7 < local80 + local70.anInt302) {
						this.anInt874 = local70.anInt293;
					}
					if (local70.anInt310 == 0) {
						this.method727(local75, local70, arg2, local70.anInt289, this.anInt1036, local80, arg6, arg7);
						if (local70.anInt292 > local70.anInt302) {
							this.method690(local70.anInt302, local80, local70.anInt292, arg7, arg2, arg6, local75 + local70.anInt288, local70);
						}
					} else {
						if (local70.anInt306 == 1 && arg6 >= local75 && arg7 >= local80 && arg6 < local75 + local70.anInt288 && arg7 < local80 + local70.anInt302) {
							@Pc(205) boolean local205 = false;
							if (local70.anInt307 != 0) {
								local205 = this.method619(local70);
							}
							if (!local205) {
								this.aStringArray10[this.anInt1053] = local70.aString4;
								this.anIntArray214[this.anInt1053] = 138;
								this.anIntArray213[this.anInt1053] = local70.anInt293;
								this.anInt1053++;
							}
						}
						if (local70.anInt306 == 2 && this.anInt913 == 0 && arg6 >= local75 && arg7 >= local80 && arg6 < local75 + local70.anInt288 && arg7 < local80 + local70.anInt302) {
							@Pc(269) String local269 = local70.aString5;
							if (local269.indexOf(" ") != -1) {
								local269 = local269.substring(0, local269.indexOf(" "));
							}
							this.aStringArray10[this.anInt1053] = local269 + " @gre@" + local70.aString6;
							this.anIntArray214[this.anInt1053] = 266;
							this.anIntArray213[this.anInt1053] = local70.anInt293;
							this.anInt1053++;
						}
						if (local70.anInt306 == 3 && arg6 >= local75 && arg7 >= local80 && arg6 < local75 + local70.anInt288 && arg7 < local80 + local70.anInt302) {
							this.aStringArray10[this.anInt1053] = "Close";
							if (arg2 == 3) {
								this.anIntArray214[this.anInt1053] = 908;
							} else {
								this.anIntArray214[this.anInt1053] = 768;
							}
							this.anIntArray213[this.anInt1053] = local70.anInt293;
							this.anInt1053++;
						}
						if (local70.anInt306 == 4 && arg6 >= local75 && arg7 >= local80 && arg6 < local75 + local70.anInt288 && arg7 < local80 + local70.anInt302) {
							this.aStringArray10[this.anInt1053] = local70.aString4;
							this.anIntArray214[this.anInt1053] = 98;
							this.anIntArray213[this.anInt1053] = local70.anInt293;
							this.anInt1053++;
						}
						if (local70.anInt306 == 5 && arg6 >= local75 && arg7 >= local80 && arg6 < local75 + local70.anInt288 && arg7 < local80 + local70.anInt302) {
							this.aStringArray10[this.anInt1053] = local70.aString4;
							this.anIntArray214[this.anInt1053] = 436;
							this.anIntArray213[this.anInt1053] = local70.anInt293;
							this.anInt1053++;
						}
						if (local70.anInt306 == 6 && !this.aBoolean211 && arg6 >= local75 && arg7 >= local80 && arg6 < local75 + local70.anInt288 && arg7 < local80 + local70.anInt302) {
							this.aStringArray10[this.anInt1053] = local70.aString4;
							this.anIntArray214[this.anInt1053] = 221;
							this.anIntArray213[this.anInt1053] = local70.anInt293;
							this.anInt1053++;
						}
						if (local70.anInt310 == 2) {
							@Pc(528) int local528 = 0;
							for (@Pc(530) int local530 = 0; local530 < local70.anInt302; local530++) {
								for (@Pc(534) int local534 = 0; local534 < local70.anInt288; local534++) {
									@Pc(545) int local545 = local75 + local534 * (local70.anInt303 + 32);
									@Pc(554) int local554 = local80 + local530 * (local70.anInt297 + 32);
									if (local528 < 20) {
										local545 += local70.anIntArray69[local528];
										local554 += local70.anIntArray70[local528];
									}
									if (arg6 >= local545 && arg7 >= local554 && arg6 < local545 + 32 && arg7 < local554 + 32) {
										this.anInt919 = local528;
										this.anInt920 = local70.anInt293;
										if (local70.anIntArray67[local528] > 0) {
											@Pc(607) Class36 local607 = Class36.method434(local70.anIntArray67[local528] - 1);
											if (this.anInt995 == 1 && local70.aBoolean74) {
												if (local70.anInt293 != this.anInt997 || local528 != this.anInt996) {
													this.aStringArray10[this.anInt1053] = "Use " + this.aString25 + " with @lre@" + local607.aString10;
													this.anIntArray214[this.anInt1053] = 280;
													this.anIntArray215[this.anInt1053] = local607.anInt551;
													this.anIntArray212[this.anInt1053] = local528;
													this.anIntArray213[this.anInt1053] = local70.anInt293;
													this.anInt1053++;
												}
											} else if (this.anInt913 != 1 || !local70.aBoolean74) {
												@Pc(744) int local744;
												if (local70.aBoolean74) {
													for (local744 = 4; local744 >= 3; local744--) {
														if (local607.aStringArray3 != null && local607.aStringArray3[local744] != null) {
															this.aStringArray10[this.anInt1053] = local607.aStringArray3[local744] + " @lre@" + local607.aString10;
															if (local744 == 3) {
																this.anIntArray214[this.anInt1053] = 633;
															}
															if (local744 == 4) {
																this.anIntArray214[this.anInt1053] = 103;
															}
															this.anIntArray215[this.anInt1053] = local607.anInt551;
															this.anIntArray212[this.anInt1053] = local528;
															this.anIntArray213[this.anInt1053] = local70.anInt293;
															this.anInt1053++;
														} else if (local744 == 4) {
															this.aStringArray10[this.anInt1053] = "Drop @lre@" + local607.aString10;
															this.anIntArray214[this.anInt1053] = 103;
															this.anIntArray215[this.anInt1053] = local607.anInt551;
															this.anIntArray212[this.anInt1053] = local528;
															this.anIntArray213[this.anInt1053] = local70.anInt293;
															this.anInt1053++;
														}
													}
												}
												if (local70.aBoolean70) {
													this.aStringArray10[this.anInt1053] = "Use @lre@" + local607.aString10;
													this.anIntArray214[this.anInt1053] = 440;
													this.anIntArray215[this.anInt1053] = local607.anInt551;
													this.anIntArray212[this.anInt1053] = local528;
													this.anIntArray213[this.anInt1053] = local70.anInt293;
													this.anInt1053++;
												}
												if (local70.aBoolean74 && local607.aStringArray3 != null) {
													for (local744 = 2; local744 >= 0; local744--) {
														if (local607.aStringArray3[local744] != null) {
															this.aStringArray10[this.anInt1053] = local607.aStringArray3[local744] + " @lre@" + local607.aString10;
															if (local744 == 0) {
																this.anIntArray214[this.anInt1053] = 724;
															}
															if (local744 == 1) {
																this.anIntArray214[this.anInt1053] = 660;
															}
															if (local744 == 2) {
																this.anIntArray214[this.anInt1053] = 228;
															}
															this.anIntArray215[this.anInt1053] = local607.anInt551;
															this.anIntArray212[this.anInt1053] = local528;
															this.anIntArray213[this.anInt1053] = local70.anInt293;
															this.anInt1053++;
														}
													}
												}
												if (local70.aStringArray2 != null) {
													for (local744 = 4; local744 >= 0; local744--) {
														if (local70.aStringArray2[local744] != null) {
															this.aStringArray10[this.anInt1053] = local70.aStringArray2[local744] + " @lre@" + local607.aString10;
															if (local744 == 0) {
																this.anIntArray214[this.anInt1053] = 352;
															}
															if (local744 == 1) {
																this.anIntArray214[this.anInt1053] = 839;
															}
															if (local744 == 2) {
																this.anIntArray214[this.anInt1053] = 561;
															}
															if (local744 == 3) {
																this.anIntArray214[this.anInt1053] = 240;
															}
															if (local744 == 4) {
																this.anIntArray214[this.anInt1053] = 648;
															}
															this.anIntArray215[this.anInt1053] = local607.anInt551;
															this.anIntArray212[this.anInt1053] = local528;
															this.anIntArray213[this.anInt1053] = local70.anInt293;
															this.anInt1053++;
														}
													}
												}
												this.aStringArray10[this.anInt1053] = "Examine @lre@" + local607.aString10;
												this.anIntArray214[this.anInt1053] = 1251;
												this.anIntArray215[this.anInt1053] = local607.anInt551;
												this.anIntArray212[this.anInt1053] = local528;
												this.anIntArray213[this.anInt1053] = local70.anInt293;
												this.anInt1053++;
											} else if ((this.anInt915 & 0x10) == 16) {
												this.aStringArray10[this.anInt1053] = this.aString20 + " @lre@" + local607.aString10;
												this.anIntArray214[this.anInt1053] = 417;
												this.anIntArray215[this.anInt1053] = local607.anInt551;
												this.anIntArray212[this.anInt1053] = local528;
												this.anIntArray213[this.anInt1053] = local70.anInt293;
												this.anInt1053++;
											}
										}
									}
									local528++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1174) RuntimeException local1174) {
			signlink.reporterror("2395, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local1174.toString());
			throw new RuntimeException();
		}
	}
}
