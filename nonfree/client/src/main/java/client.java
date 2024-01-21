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

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "Lclient!AHUILQJH;")
	public static Class1_Sub1_Sub1_Sub1_Sub1 aClass1_Sub1_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "I")
	private static int anInt890;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "Z")
	private static boolean aBoolean224;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "I")
	private static int anInt893;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "I")
	private static int anInt895;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "I")
	private static int anInt903;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "I")
	private static int anInt904;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "I")
	private static int anInt906;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "I")
	private static int anInt912;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "Z")
	private static boolean aBoolean231;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "Z")
	private static boolean aBoolean233;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "I")
	private static int anInt930;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "I")
	public static int anInt931;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "I")
	private static int anInt936;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "I")
	private static int anInt962;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
	private static int anInt984;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "I")
	private static int anInt985;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "I")
	private static int anInt1013;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "I")
	public static int anInt1018;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "Z")
	private static boolean aBoolean253;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "I")
	private static int anInt1041;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "Z")
	private static boolean aBoolean258;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "I")
	private static int anInt1050;

	@OriginalMember(owner = "client!client", name = "Wj", descriptor = "I")
	private static int anInt1065;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "Z")
	private static boolean aBoolean220 = true;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "I")
	private static int anInt876 = 22279;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "[I")
	public static int[] anIntArray232 = new int[32];

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "[[I")
	public static final int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "I")
	private static int anInt933;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "I")
	private static int anInt941;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "Ljava/lang/String;")
	private static String aString25;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "I")
	private static int anInt974;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "I")
	private static int anInt1017;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "Z")
	private static boolean aBoolean252;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "[I")
	public static final int[] anIntArray263;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "[I")
	private static int[] anIntArray266;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "I")
	private int anInt845;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "I")
	private int anInt846;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "I")
	private int anInt847;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "I")
	private int anInt848;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "I")
	private int anInt849;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "I")
	private int anInt850;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
	private int anInt851;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "Ljava/lang/String;")
	private String aString17;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "Lclient!LKEIRLLI;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_1;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "Lclient!LKEIRLLI;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_2;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "Lclient!LKEIRLLI;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_3;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
	private int anInt853;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
	private int anInt854;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
	private int anInt855;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
	private int anInt856;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "Ljava/lang/String;")
	private String aString18;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
	private int anInt857;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
	private int anInt858;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "Lclient!TWKZMYGD;")
	private Class36 aClass36_3;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "Lclient!TWKZMYGD;")
	private Class36 aClass36_4;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "Lclient!TWKZMYGD;")
	private Class36 aClass36_5;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "Lclient!TWKZMYGD;")
	private Class36 aClass36_6;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Lclient!TWKZMYGD;")
	private Class36 aClass36_7;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "Lclient!TWKZMYGD;")
	private Class36 aClass36_8;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "Lclient!TWKZMYGD;")
	private Class36 aClass36_9;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "Lclient!TWKZMYGD;")
	private Class36 aClass36_10;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "Lclient!TWKZMYGD;")
	private Class36 aClass36_11;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
	private int anInt859;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "Ljava/lang/String;")
	private String aString19;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
	private int anInt860;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
	private int anInt864;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
	private int anInt865;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
	private int anInt866;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
	private int anInt867;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "Lclient!TWKZMYGD;")
	private Class36 aClass36_12;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "Lclient!TWKZMYGD;")
	private Class36 aClass36_13;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "Lclient!TWKZMYGD;")
	private Class36 aClass36_14;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "Lclient!TWKZMYGD;")
	private Class36 aClass36_15;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
	private int anInt871;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "Lclient!DUMEPGRH;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_3;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "Lclient!DUMEPGRH;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_4;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "I")
	private int anInt872;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "Lclient!GLPUEKVZ;")
	private Class16_Sub1 aClass16_Sub1_1;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "I")
	private int anInt875;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "I")
	private int anInt877;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "Lclient!LKEIRLLI;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_4;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "Lclient!LKEIRLLI;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_5;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "Lclient!LKEIRLLI;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_6;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "Lclient!LKEIRLLI;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_7;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "Lclient!LKEIRLLI;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_8;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "I")
	private int anInt879;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "I")
	private int anInt880;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "I")
	private int anInt881;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "I")
	private int anInt882;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "I")
	private int anInt883;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "I")
	private int anInt884;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "I")
	private int anInt886;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "I")
	private int anInt887;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "I")
	private int anInt891;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "I")
	private int anInt892;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "I")
	private int anInt894;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "I")
	private int anInt896;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "I")
	private int anInt898;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
	private int anInt899;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "[I")
	private int[] anIntArray226;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "[I")
	private int[] anIntArray227;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "I")
	private int anInt901;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "[[B")
	private byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "Lclient!DLDGGHZP;")
	private Class5 aClass5_1;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "[I")
	private int[] anIntArray233;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "[I")
	private int[] anIntArray234;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "[I")
	private int[] anIntArray235;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "[I")
	private int[] anIntArray236;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "I")
	private int anInt905;

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "I")
	private int anInt908;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "Lclient!DUMEPGRH;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_5;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "Lclient!DUMEPGRH;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_6;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "I")
	private int anInt910;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "I")
	private int anInt911;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "I")
	private int anInt913;

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "I")
	private int anInt914;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "I")
	private int anInt915;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "I")
	private int anInt917;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "I")
	private int anInt918;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "I")
	private int anInt919;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
	private int anInt920;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "I")
	private int anInt921;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "Lclient!DUMEPGRH;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_7;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "[I")
	private int[] anIntArray239;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "[I")
	private int[] anIntArray240;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "[I")
	private int[] anIntArray241;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "I")
	private int anInt922;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "I")
	private int anInt924;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "I")
	private int anInt925;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
	private int anInt926;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "I")
	private int anInt927;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "I")
	private int anInt928;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
	private int anInt929;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "Lclient!SPZBTZXL;")
	private Class35 aClass35_1;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "Lclient!LKEIRLLI;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_9;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "Lclient!LKEIRLLI;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_10;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "Lclient!LKEIRLLI;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_11;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "I")
	private int anInt932;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "I")
	private int anInt934;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
	private int anInt935;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "I")
	private int anInt939;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "I")
	private int anInt940;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "I")
	private int anInt944;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
	private int anInt946;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
	private int anInt947;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "I")
	private int anInt949;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "I")
	private int anInt951;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "I")
	private int anInt952;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "I")
	private int anInt953;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "I")
	private int anInt954;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "I")
	private int anInt955;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "I")
	private int anInt956;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "I")
	private int anInt957;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "Lclient!EDOAEAIN;")
	private Class9 aClass9_1;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "Lclient!DUMEPGRH;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_8;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
	private int anInt960;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "I")
	private int anInt961;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "I")
	private int anInt964;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "I")
	private int anInt965;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "I")
	private int anInt966;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "Lclient!DUMEPGRH;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_9;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "I")
	private int anInt967;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "I")
	private int anInt968;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
	private int anInt969;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "I")
	private int anInt970;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "I")
	private int anInt971;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "I")
	private int anInt972;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "Lclient!LKEIRLLI;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_12;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "Lclient!LKEIRLLI;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_13;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "Lclient!LKEIRLLI;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_14;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "Lclient!LKEIRLLI;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_15;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "Lclient!LKEIRLLI;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_16;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
	private int anInt975;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "Lclient!TWKZMYGD;")
	private Class36 aClass36_16;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "Lclient!TWKZMYGD;")
	private Class36 aClass36_17;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "Lclient!TWKZMYGD;")
	private Class36 aClass36_18;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "Lclient!LKEIRLLI;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_17;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "Lclient!LKEIRLLI;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_18;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "I")
	private int anInt977;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "I")
	private int anInt978;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "I")
	private int anInt979;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "I")
	private int anInt980;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "I")
	private int anInt981;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "Lclient!DUMEPGRH;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_10;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "Lclient!DUMEPGRH;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_11;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "[Lclient!LKEIRLLI;")
	private Class1_Sub1_Sub2_Sub4[] aClass1_Sub1_Sub2_Sub4Array5;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
	private int anInt983;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
	private int anInt986;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "I")
	private int anInt987;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "I")
	private int anInt988;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "I")
	private int anInt989;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "I")
	private int anInt990;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
	private int anInt991;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "Lclient!LKEIRLLI;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_19;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "Lclient!LKEIRLLI;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_20;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "I")
	private int anInt994;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "I")
	private int anInt995;

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "I")
	private int anInt996;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "I")
	private int anInt997;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "I")
	private int anInt998;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "I")
	private int anInt1000;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "I")
	private int anInt1001;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "I")
	private int anInt1002;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "I")
	private int anInt1003;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "I")
	private int anInt1004;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "I")
	private int anInt1005;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "I")
	private int anInt1006;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "[I")
	private int[] anIntArray256;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "[I")
	private int[] anIntArray257;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "[I")
	private int[] anIntArray258;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "Lclient!EYHVDWTF;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "Lclient!EYHVDWTF;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_3;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "Lclient!EYHVDWTF;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_4;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "Lclient!EYHVDWTF;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_5;

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "I")
	private int anInt1008;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "I")
	private int anInt1009;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "I")
	private int anInt1011;

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "I")
	private int anInt1012;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "I")
	private int anInt1014;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "I")
	private int anInt1019;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "I")
	private int anInt1020;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
	private int anInt1021;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
	private int anInt1024;

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "I")
	private int anInt1025;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "I")
	private int anInt1026;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
	private int anInt1028;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "I")
	private int anInt1029;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "I")
	private int anInt1030;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "I")
	private int anInt1031;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
	private int anInt1032;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "I")
	private int anInt1033;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "I")
	private int anInt1034;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "I")
	private int anInt1035;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
	private int anInt1036;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "I")
	private int anInt1037;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "I")
	private int anInt1038;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "Lclient!KUQMNLGP;")
	private Class22 aClass22_2;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "I")
	private int anInt1039;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "I")
	private int anInt1040;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "I")
	private int anInt1043;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "I")
	private int anInt1044;

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "Lclient!TWKZMYGD;")
	private Class36 aClass36_19;

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "Lclient!TWKZMYGD;")
	private Class36 aClass36_20;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "Lclient!TWKZMYGD;")
	private Class36 aClass36_21;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "Lclient!TWKZMYGD;")
	private Class36 aClass36_22;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "Lclient!TWKZMYGD;")
	private Class36 aClass36_23;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "Lclient!TWKZMYGD;")
	private Class36 aClass36_24;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "Lclient!TWKZMYGD;")
	private Class36 aClass36_25;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "Lclient!TWKZMYGD;")
	private Class36 aClass36_26;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "Lclient!TWKZMYGD;")
	private Class36 aClass36_27;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "I")
	private int anInt1045;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "I")
	private int anInt1046;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "I")
	private int anInt1047;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "Lclient!DUMEPGRH;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_12;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "Lclient!DUMEPGRH;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_13;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "Lclient!DUMEPGRH;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_14;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "Lclient!DUMEPGRH;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_15;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "Lclient!DUMEPGRH;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_16;

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "I")
	private int anInt1048;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "I")
	private int anInt1049;

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "I")
	private int anInt1051;

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "I")
	private int anInt1054;

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "I")
	private int anInt1056;

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "I")
	private int anInt1058;

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "I")
	private int anInt1059;

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "I")
	private int anInt1061;

	@OriginalMember(owner = "client!client", name = "Jj", descriptor = "Ljava/lang/String;")
	private String aString29;

	@OriginalMember(owner = "client!client", name = "Nj", descriptor = "I")
	private int anInt1063;

	@OriginalMember(owner = "client!client", name = "Pj", descriptor = "[I")
	private int[] anIntArray271;

	@OriginalMember(owner = "client!client", name = "Qj", descriptor = "[I")
	private int[] anIntArray272;

	@OriginalMember(owner = "client!client", name = "Rj", descriptor = "I")
	private int anInt1064;

	@OriginalMember(owner = "client!client", name = "Tj", descriptor = "Lclient!JHNSGCOV;")
	private Class20 aClass20_1;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "Lclient!ULLVQOAK;")
	private Class39 aClass39_1 = new Class39();

	@OriginalMember(owner = "client!client", name = "W", descriptor = "Z")
	private boolean aBoolean214 = false;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "I")
	private int anInt852 = 9776;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "[I")
	private int[] anIntArray212 = new int[5];

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7 = new int[4][13][13];

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "[Lclient!LKEIRLLI;")
	private Class1_Sub1_Sub2_Sub4[] aClass1_Sub1_Sub2_Sub4Array2 = new Class1_Sub1_Sub2_Sub4[13];

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "[I")
	private int[] anIntArray213 = new int[50];

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "Z")
	private boolean aBoolean215 = false;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "[I")
	private int[] anIntArray214 = new int[Class32.anInt585];

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
	private int anInt861 = 2;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
	private int anInt862 = -1;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
	private int anInt863 = 128;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "Z")
	private boolean aBoolean216 = true;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "I")
	private int anInt869 = -1;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "I")
	private int anInt870 = -1;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "[B")
	private byte[] aByteArray21 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "Z")
	private boolean aBoolean217 = false;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "[Lclient!DUMEPGRH;")
	private Class1_Sub1_Sub2_Sub1[] aClass1_Sub1_Sub2_Sub1Array4 = new Class1_Sub1_Sub2_Sub1[20];

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "Z")
	private boolean aBoolean218 = false;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "Z")
	private boolean aBoolean219 = true;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "[I")
	private int[] anIntArray215 = new int[5];

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "Ljava/lang/String;")
	private String aString20 = "";

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "Ljava/lang/String;")
	private String aString21 = "";

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "B")
	private byte aByte37 = -44;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "Ljava/lang/String;")
	private String aString22 = "";

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "Z")
	private volatile boolean aBoolean221 = false;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "[I")
	private int[] anIntArray216 = new int[200];

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "I")
	private int anInt873 = 7759444;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "I")
	private int anInt874 = -1;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
	private int anInt878 = -139;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "[I")
	private int[] anIntArray217 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "Z")
	private boolean aBoolean222 = false;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
	private int anInt885 = -1;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "Z")
	private boolean aBoolean223 = false;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "[I")
	private int[] anIntArray218 = new int[151];

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "I")
	private int anInt889 = -1;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "I")
	private int anInt897 = 50;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "[I")
	private int[] anIntArray219 = new int[this.anInt897];

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "[I")
	private int[] anIntArray220 = new int[this.anInt897];

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "[I")
	private int[] anIntArray221 = new int[this.anInt897];

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "[I")
	private int[] anIntArray222 = new int[this.anInt897];

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "[I")
	private int[] anIntArray223 = new int[this.anInt897];

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "[I")
	private int[] anIntArray224 = new int[this.anInt897];

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "[I")
	private int[] anIntArray225 = new int[this.anInt897];

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8 = new String[this.anInt897];

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "Ljava/lang/String;")
	private String aString23 = "";

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "I")
	private int anInt900 = 341;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "[I")
	private int[] anIntArray228 = new int[Class32.anInt585];

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "Z")
	private boolean aBoolean225 = true;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "[I")
	private int[] anIntArray229 = new int[5];

	@OriginalMember(owner = "client!client", name = "id", descriptor = "I")
	private final int anInt902 = 100;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "[I")
	private int[] anIntArray230 = new int[100];

	@OriginalMember(owner = "client!client", name = "md", descriptor = "[Lclient!SJIXUDLP;")
	public Class34[] aClass34Array1 = new Class34[5];

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "Z")
	private boolean aBoolean226 = false;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "[I")
	private int[] anIntArray231 = new int[Class32.anInt585];

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "Z")
	private boolean aBoolean227 = false;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "Z")
	private volatile boolean aBoolean228 = false;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9 = new String[500];

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "I")
	private int anInt907 = -1;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "I")
	private int anInt909 = 1;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "[I")
	private int[] anIntArray237 = new int[33];

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "Ljava/lang/String;")
	private String aString24 = "";

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray10 = new String[200];

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "B")
	private byte aByte38 = 1;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "[Lclient!DUMEPGRH;")
	private Class1_Sub1_Sub2_Sub1[] aClass1_Sub1_Sub2_Sub1Array5 = new Class1_Sub1_Sub2_Sub1[100];

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11 = new String[5];

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "[Z")
	private boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "B")
	private byte aByte39 = 3;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "[I")
	private int[] anIntArray238 = new int[100];

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12 = new String[100];

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13 = new String[100];

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "[Z")
	private boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
	private int anInt916 = 982;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "Z")
	private boolean aBoolean229 = false;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "Z")
	private boolean aBoolean230 = false;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "I")
	private int anInt923 = 78;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "[[I")
	private int[][] anIntArrayArray22 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "te", descriptor = "Z")
	private boolean aBoolean232 = true;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "[I")
	private int[] anIntArray242 = new int[1000];

	@OriginalMember(owner = "client!client", name = "we", descriptor = "[I")
	private int[] anIntArray243 = new int[1000];

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "B")
	private byte aByte40 = -111;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "[I")
	private int[] anIntArray244 = new int[33];

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "[Lclient!LKEIRLLI;")
	private Class1_Sub1_Sub2_Sub4[] aClass1_Sub1_Sub2_Sub4Array3 = new Class1_Sub1_Sub2_Sub4[2];

	@OriginalMember(owner = "client!client", name = "He", descriptor = "Z")
	private boolean aBoolean234 = true;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "Z")
	private boolean aBoolean235 = true;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "Lclient!LOISKKJJ;")
	private Class23 aClass23_10 = new Class23(6);

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
	private int anInt937 = 5063219;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "I")
	private int anInt938 = -1;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "B")
	private byte aByte41 = 45;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "Z")
	private boolean aBoolean236 = false;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
	private int anInt942 = 18224;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "Z")
	private boolean aBoolean237 = false;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "I")
	private int anInt943 = 549;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "[Lclient!LKEIRLLI;")
	private Class1_Sub1_Sub2_Sub4[] aClass1_Sub1_Sub2_Sub4Array4 = new Class1_Sub1_Sub2_Sub4[100];

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
	private int anInt945 = 8754;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "Z")
	private boolean aBoolean238 = false;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
	private int anInt948 = 1;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "[I")
	private int[] anIntArray245 = new int[50];

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "I")
	private int anInt950 = 2301979;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "I")
	private int anInt958 = 2048;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "I")
	private int anInt959 = 2047;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "[Lclient!AHUILQJH;")
	private Class1_Sub1_Sub1_Sub1_Sub1[] aClass1_Sub1_Sub1_Sub1_Sub1Array1 = new Class1_Sub1_Sub1_Sub1_Sub1[this.anInt958];

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "[I")
	private int[] anIntArray246 = new int[this.anInt958];

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "[I")
	private int[] anIntArray247 = new int[this.anInt958];

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "[Lclient!LDILQFVA;")
	private Class1_Sub1_Sub3[] aClass1_Sub1_Sub3Array1 = new Class1_Sub1_Sub3[this.anInt958];

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
	private int anInt963 = -1;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "B")
	private byte aByte42 = -15;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "[I")
	private int[] anIntArray248 = new int[5];

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "Ljava/lang/String;")
	private String aString26 = "";

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
	private int anInt973 = -1;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "Z")
	private boolean aBoolean239 = false;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "B")
	private byte aByte43 = 5;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "Lclient!LOISKKJJ;")
	private Class23 aClass23_11 = new Class23(6);

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "Z")
	private boolean aBoolean240 = true;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "Z")
	public boolean aBoolean241 = false;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "[I")
	private int[] anIntArray249 = new int[256];

	@OriginalMember(owner = "client!client", name = "og", descriptor = "Z")
	private boolean aBoolean242 = false;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "Lclient!LDILQFVA;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_6 = Class1_Sub1_Sub3.method347();

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "I")
	private int anInt976 = 43417;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "I")
	private int anInt982 = 582;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "[J")
	private long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "Z")
	private boolean aBoolean243 = false;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "Z")
	private boolean aBoolean244 = false;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "B")
	private byte aByte44 = 0;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "Z")
	private boolean aBoolean245 = false;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "I")
	private int anInt992 = 3;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "[I")
	private int[] anIntArray250 = new int[500];

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "[I")
	private int[] anIntArray251 = new int[500];

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "[I")
	private int[] anIntArray252 = new int[500];

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "[I")
	private int[] anIntArray253 = new int[500];

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "I")
	private int anInt993 = 9;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "Z")
	private boolean aBoolean246 = false;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "Z")
	private boolean aBoolean247 = false;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "[I")
	private int[] anIntArray254 = new int[9];

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "[Lclient!DUMEPGRH;")
	private Class1_Sub1_Sub2_Sub1[] aClass1_Sub1_Sub2_Sub1Array6 = new Class1_Sub1_Sub2_Sub1[8];

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "I")
	private int anInt999 = -1;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "Lclient!LOISKKJJ;")
	private Class23 aClass23_12 = new Class23(6);

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "Z")
	private boolean aBoolean248 = false;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "[I")
	private int[] anIntArray255 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "[I")
	private int[] anIntArray259 = new int[4000];

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "[I")
	private int[] anIntArray260 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
	private int anInt1007 = 3353893;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "I")
	private int anInt1010 = 2;

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "Z")
	private boolean aBoolean249 = true;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "Z")
	private volatile boolean aBoolean250 = false;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "[I")
	private int[] anIntArray261 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "Z")
	private boolean aBoolean251 = false;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "I")
	private int anInt1016 = -353;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "B")
	private byte aByte45 = 0;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "Lclient!LDILQFVA;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_7 = Class1_Sub1_Sub3.method347();

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "B")
	private byte aByte46 = 5;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "[I")
	private int[] anIntArray262 = new int[50];

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "[[[Lclient!LOISKKJJ;")
	private Class23[][][] aClass23ArrayArrayArray1 = new Class23[4][104][104];

	@OriginalMember(owner = "client!client", name = "di", descriptor = "[Lclient!DUMEPGRH;")
	private Class1_Sub1_Sub2_Sub1[] aClass1_Sub1_Sub2_Sub1Array7 = new Class1_Sub1_Sub2_Sub1[1000];

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "[Lclient!DUMEPGRH;")
	private Class1_Sub1_Sub2_Sub1[] aClass1_Sub1_Sub2_Sub1Array8 = new Class1_Sub1_Sub2_Sub1[20];

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "I")
	private int anInt1022 = 23829;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "Z")
	private boolean aBoolean254 = true;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "[I")
	private final int[] anIntArray264 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "I")
	private int anInt1023 = 1;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "Z")
	private boolean aBoolean255 = false;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "I")
	private int anInt1027 = 2;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "Lclient!LDILQFVA;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_8 = new Class1_Sub1_Sub3(new byte[5000], anInt1013);

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "[Lclient!TVKIEQYR;")
	private Class1_Sub1_Sub1_Sub1_Sub2[] aClass1_Sub1_Sub1_Sub1_Sub2Array1 = new Class1_Sub1_Sub1_Sub1_Sub2[16384];

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "[I")
	private int[] anIntArray265 = new int[16384];

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "Z")
	private boolean aBoolean256 = false;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "[I")
	public int[] anIntArray267 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "I")
	private int anInt1042 = -1;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "Z")
	private boolean aBoolean257 = false;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "Z")
	private boolean aBoolean259 = false;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "Z")
	private boolean aBoolean260 = false;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "Z")
	private boolean aBoolean261 = false;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "Ljava/lang/String;")
	private String aString27 = "";

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "Ljava/lang/String;")
	private String aString28 = "";

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "Z")
	private boolean aBoolean262 = true;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "[Lclient!EXLGBZBR;")
	private Class14[] aClass14Array1 = new Class14[4];

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "[I")
	private int[] anIntArray268 = new int[5];

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "[J")
	private long[] aLongArray4 = new long[200];

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "I")
	private int anInt1052 = -1;

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "I")
	private int anInt1053 = 1;

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "Lclient!LDILQFVA;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_9 = Class1_Sub1_Sub3.method347();

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "Z")
	private boolean aBoolean263 = false;

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "I")
	private int anInt1055 = -1;

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "I")
	private int anInt1060 = 7;

	@OriginalMember(owner = "client!client", name = "Kj", descriptor = "[I")
	private int[] anIntArray269 = new int[151];

	@OriginalMember(owner = "client!client", name = "Lj", descriptor = "I")
	private int anInt1062 = 670;

	@OriginalMember(owner = "client!client", name = "Mj", descriptor = "B")
	private byte aByte47 = 76;

	@OriginalMember(owner = "client!client", name = "Oj", descriptor = "[I")
	private int[] anIntArray270 = new int[7];

	@OriginalMember(owner = "client!client", name = "Sj", descriptor = "Z")
	private boolean aBoolean264 = false;

	@OriginalMember(owner = "client!client", name = "Uj", descriptor = "Ljava/lang/String;")
	private String aString30 = "";

	@OriginalMember(owner = "client!client", name = "Vj", descriptor = "[I")
	private int[] anIntArray273 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Xj", descriptor = "[[I")
	private int[][] anIntArrayArray25 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Yj", descriptor = "B")
	private byte aByte48 = 7;

	static {
		@Pc(13) int local13 = 2;
		@Pc(15) int local15;
		for (local15 = 0; local15 < 32; local15++) {
			anIntArray232[local15] = local13 - 1;
			local13 += local13;
		}
		anIntArrayArray23 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
		anInt933 = 507;
		anInt941 = 603;
		aString25 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		anInt974 = 7129;
		anInt1017 = 10;
		aBoolean252 = true;
		aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
		anIntArray263 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		anIntArray266 = new int[99];
		local13 = 0;
		for (local15 = 0; local15 < 99; local15++) {
			@Pc(386) int local386 = local15 + 1;
			@Pc(399) int local399 = (int) ((double) local386 + Math.pow(2.0D, (double) local386 / 7.0D) * 300.0D);
			local13 += local399;
			anIntArray266[local15] = local13 / 4;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	private static String method590(@OriginalArg(1) int arg0) {
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
			signlink.reporterror("84767, " + true + ", " + arg0 + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private static void method629() {
		try {
			Class5.aBoolean30 = true;
			Class1_Sub1_Sub2_Sub3.aBoolean87 = true;
			aBoolean253 = true;
			Class19.aBoolean99 = true;
			Class40.aBoolean172 = true;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("45785, " + 9 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private static void method630() {
		try {
			Class5.aBoolean30 = false;
			Class1_Sub1_Sub2_Sub3.aBoolean87 = false;
			aBoolean253 = false;
			Class19.aBoolean99 = false;
			Class40.aBoolean172 = false;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("23175, " + -208 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 327);
			if (arg0.length == 5) {
				anInt1017 = Integer.parseInt(arg0[0]);
				anInt1018 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method629();
				} else if (arg0[2].equals("highmem")) {
					method630();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean252 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean252 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt1068 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method569();
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(III)Ljava/lang/String;")
	private static String method651(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
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
			signlink.reporterror("26121, " + arg0 + ", " + 462 + ", " + arg1 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)Ljava/lang/String;")
	private static String method694(@OriginalArg(1) int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("54966, " + -37821 + ", " + arg0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	private void method582() {
		try {
			this.aClass1_Sub1_Sub2_Sub4_17 = new Class1_Sub1_Sub2_Sub4(this.aClass35_1, "titlebox", 0);
			this.aClass1_Sub1_Sub2_Sub4_18 = new Class1_Sub1_Sub2_Sub4(this.aClass35_1, "titlebutton", 0);
			this.aClass1_Sub1_Sub2_Sub4Array5 = new Class1_Sub1_Sub2_Sub4[12];
			@Pc(25) int local25 = 0;
			try {
				local25 = Integer.parseInt(this.getParameter("fl_icon"));
			} catch (@Pc(41) Exception local41) {
			}
			@Pc(45) int local45;
			if (local25 == 0) {
				for (local45 = 0; local45 < 12; local45++) {
					this.aClass1_Sub1_Sub2_Sub4Array5[local45] = new Class1_Sub1_Sub2_Sub4(this.aClass35_1, "runes", local45);
				}
			} else {
				for (local45 = 0; local45 < 12; local45++) {
					this.aClass1_Sub1_Sub2_Sub4Array5[local45] = new Class1_Sub1_Sub2_Sub4(this.aClass35_1, "runes", (local45 & 0x3) + 12);
				}
			}
			this.aClass1_Sub1_Sub2_Sub1_10 = new Class1_Sub1_Sub2_Sub1(128, 265);
			this.aClass1_Sub1_Sub2_Sub1_11 = new Class1_Sub1_Sub2_Sub1(128, 265);
			for (local45 = 0; local45 < 33920; local45++) {
				this.aClass1_Sub1_Sub2_Sub1_10.anIntArray30[local45] = this.aClass36_22.anIntArray145[local45];
			}
			for (@Pc(121) int local121 = 0; local121 < 33920; local121++) {
				this.aClass1_Sub1_Sub2_Sub1_11.anIntArray30[local121] = this.aClass36_23.anIntArray145[local121];
			}
			this.anIntArray234 = new int[256];
			for (@Pc(143) int local143 = 0; local143 < 64; local143++) {
				this.anIntArray234[local143] = local143 * 262144;
			}
			for (@Pc(158) int local158 = 0; local158 < 64; local158++) {
				this.anIntArray234[local158 + 64] = local158 * 1024 + 16711680;
			}
			for (@Pc(177) int local177 = 0; local177 < 64; local177++) {
				this.anIntArray234[local177 + 128] = local177 * 4 + 16776960;
			}
			for (@Pc(196) int local196 = 0; local196 < 64; local196++) {
				this.anIntArray234[local196 + 192] = 16777215;
			}
			this.anIntArray235 = new int[256];
			for (@Pc(215) int local215 = 0; local215 < 64; local215++) {
				this.anIntArray235[local215] = local215 * 1024;
			}
			for (@Pc(230) int local230 = 0; local230 < 64; local230++) {
				this.anIntArray235[local230 + 64] = local230 * 4 + 65280;
			}
			for (@Pc(249) int local249 = 0; local249 < 64; local249++) {
				this.anIntArray235[local249 + 128] = local249 * 262144 + 65535;
			}
			for (@Pc(268) int local268 = 0; local268 < 64; local268++) {
				this.anIntArray235[local268 + 192] = 16777215;
			}
			this.anIntArray236 = new int[256];
			for (@Pc(287) int local287 = 0; local287 < 64; local287++) {
				this.anIntArray236[local287] = local287 * 4;
			}
			for (@Pc(302) int local302 = 0; local302 < 64; local302++) {
				this.anIntArray236[local302 + 64] = local302 * 262144 + 255;
			}
			for (@Pc(321) int local321 = 0; local321 < 64; local321++) {
				this.anIntArray236[local321 + 128] = local321 * 1024 + 16711935;
			}
			for (@Pc(340) int local340 = 0; local340 < 64; local340++) {
				this.anIntArray236[local340 + 192] = 16777215;
			}
			this.anIntArray233 = new int[256];
			this.anIntArray271 = new int[32768];
			this.anIntArray272 = new int[32768];
			this.method690(null);
			this.anIntArray226 = new int[32768];
			this.anIntArray227 = new int[32768];
			this.method581("Connecting to fileserver", 10);
			if (!this.aBoolean250) {
				this.aBoolean221 = true;
				this.aBoolean250 = true;
				this.method580(this, 2);
			}
		} catch (@Pc(397) RuntimeException local397) {
			signlink.reporterror("57270, " + 7 + ", " + local397.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method577() {
		try {
			if (this.aBoolean214 || this.aBoolean217 || this.aBoolean229) {
				this.method583();
			} else {
				anInt930++;
				if (this.aBoolean241) {
					this.method603();
				} else {
					this.method633(false);
				}
				this.anInt1024 = 0;
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("64961, " + -90 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	private void method583() {
		try {
			@Pc(6) Graphics local6 = this.method579(anInt974).getGraphics();
			local6.setColor(Color.black);
			local6.fillRect(0, 0, 765, 503);
			this.method572();
			@Pc(49) byte local49;
			@Pc(55) int local55;
			if (this.aBoolean217) {
				this.aBoolean250 = false;
				local6.setFont(new Font("Helvetica", 1, 16));
				local6.setColor(Color.yellow);
				local49 = 35;
				local6.drawString("Sorry, an error has occured whilst loading RuneScape", 30, 35);
				local55 = local49 + 50;
				local6.setColor(Color.white);
				local6.drawString("To fix this try the following (in order):", 30, 85);
				@Pc(64) int local64 = local55 + 50;
				local6.setColor(Color.white);
				local6.setFont(new Font("Helvetica", 1, 12));
				local6.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				@Pc(81) int local81 = local64 + 30;
				local6.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, 165);
				@Pc(87) int local87 = local81 + 30;
				local6.drawString("3: Try using a different game-world", 30, 195);
				@Pc(93) int local93 = local87 + 30;
				local6.drawString("4: Try rebooting your computer", 30, 225);
				@Pc(99) int local99 = local93 + 30;
				local6.drawString("5: Try selecting a different version of Java from the play-game menu", 30, 255);
			}
			if (this.aBoolean229) {
				this.aBoolean250 = false;
				local6.setFont(new Font("Helvetica", 1, 20));
				local6.setColor(Color.white);
				local6.drawString("Error - unable to load game!", 50, 50);
				local6.drawString("To play RuneScape make sure you play from", 50, 100);
				local6.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean214) {
				this.aBoolean250 = false;
				local6.setColor(Color.yellow);
				local49 = 35;
				local6.drawString("Error a copy of RuneScape already appears to be loaded", 30, 35);
				local55 = local49 + 50;
				local6.setColor(Color.white);
				local6.drawString("To fix this try the following (in order):", 30, 85);
				local55 += 50;
				local6.setColor(Color.white);
				local6.setFont(new Font("Helvetica", 1, 12));
				local6.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				local55 += 30;
				local6.drawString("2: Try rebooting your computer, and reloading", 30, 165);
				local55 += 30;
			}
		} catch (@Pc(187) RuntimeException local187) {
			signlink.reporterror("44036, " + -995 + ", " + local187.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method584() {
		try {
			if (this.anInt1035 > 0) {
				this.method640();
			} else {
				this.aClass36_14.method503();
				this.aClass1_Sub1_Sub2_Sub2_3.method179("Connection lost", 257, 144, 0, this.anInt943);
				this.aClass1_Sub1_Sub2_Sub2_3.method179("Connection lost", 256, 143, 16777215, this.anInt943);
				this.aClass1_Sub1_Sub2_Sub2_3.method179("Please wait - attempting to reestablish", 257, 159, 0, this.anInt943);
				this.aClass1_Sub1_Sub2_Sub2_3.method179("Please wait - attempting to reestablish", 256, 158, 16777215, this.anInt943);
				this.aClass36_14.method504((byte) 9, 4, 4, super.aGraphics2);
				this.anInt857 = 0;
				this.anInt965 = 0;
				@Pc(74) Class9 local74 = this.aClass9_1;
				this.aBoolean241 = false;
				this.anInt1048 = 0;
				this.method643(this.aString20, this.aString21, true);
				if (!this.aBoolean241) {
					this.method640();
				}
				try {
					local74.method139();
				} catch (@Pc(97) Exception local97) {
				}
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("22651, " + 37 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	private void method585() {
		try {
			this.anInt997 = 0;
			@Pc(16) int local16 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt620 >> 7) + this.anInt924;
			@Pc(24) int local24 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt621 >> 7) + this.anInt925;
			if (local16 >= 3053 && local16 <= 3156 && local24 >= 3056 && local24 <= 3136) {
				this.anInt997 = 1;
			}
			if (local16 >= 3072 && local16 <= 3118 && local24 >= 9492 && local24 <= 9535) {
				this.anInt997 = 1;
			}
			if (this.anInt997 == 1 && local16 >= 3139 && local16 <= 3199 && local24 >= 3008 && local24 <= 3062) {
				this.anInt997 = 0;
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("75780, " + 792 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!ULLVQOAK;)V")
	private void method586(@OriginalArg(1) Class39 arg0) {
		try {
			@Pc(9) int local9 = arg0.anInt701;
			@Pc(65) int local65;
			if ((local9 < 1 || local9 > 100) && (local9 < 701 || local9 > 800)) {
				if (local9 >= 101 && local9 <= 200 || local9 >= 801 && local9 <= 900) {
					local65 = this.anInt1037;
					if (this.anInt1038 != 2) {
						local65 = 0;
					}
					if (local9 > 800) {
						local9 -= 701;
					} else {
						local9 -= 101;
					}
					if (local9 >= local65) {
						arg0.aString11 = "";
						arg0.anInt694 = 0;
					} else {
						if (this.anIntArray216[local9] == 0) {
							arg0.aString11 = "@red@Offline";
						} else if (this.anIntArray216[local9] == anInt1017) {
							arg0.aString11 = "@gre@World-" + (this.anIntArray216[local9] - 9);
						} else {
							arg0.aString11 = "@yel@World-" + (this.anIntArray216[local9] - 9);
						}
						arg0.anInt694 = 1;
					}
				} else if (local9 == 203) {
					local65 = this.anInt1037;
					if (this.anInt1038 != 2) {
						local65 = 0;
					}
					arg0.anInt688 = local65 * 15 + 20;
					if (arg0.anInt688 <= arg0.anInt715) {
						arg0.anInt688 = arg0.anInt715 + 1;
					}
				} else if (local9 >= 401 && local9 <= 500) {
					local9 -= 401;
					if (local9 == 0 && this.anInt1038 == 0) {
						arg0.aString11 = "Loading ignore list";
						arg0.anInt694 = 0;
					} else if (local9 == 1 && this.anInt1038 == 0) {
						arg0.aString11 = "Please wait...";
						arg0.anInt694 = 0;
					} else {
						local65 = this.anInt935;
						if (this.anInt1038 == 0) {
							local65 = 0;
						}
						if (local9 >= local65) {
							arg0.aString11 = "";
							arg0.anInt694 = 0;
						} else {
							arg0.aString11 = Class15.method198(Class15.method195(this.aLongArray3[local9]));
							arg0.anInt694 = 1;
						}
					}
				} else if (local9 == 503) {
					arg0.anInt688 = this.anInt935 * 15 + 20;
					if (arg0.anInt688 <= arg0.anInt715) {
						arg0.anInt688 = arg0.anInt715 + 1;
					}
				} else if (local9 == 327) {
					arg0.anInt697 = 150;
					arg0.anInt698 = (int) (Math.sin((double) anInt931 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean248) {
						for (local65 = 0; local65 < 7; local65++) {
							@Pc(334) int local334 = this.anIntArray270[local65];
							if (local334 >= 0 && !Class47.aClass47Array1[local334].method550()) {
								return;
							}
						}
						this.aBoolean248 = false;
						@Pc(353) Class1_Sub1_Sub1_Sub4[] local353 = new Class1_Sub1_Sub1_Sub4[7];
						@Pc(355) int local355 = 0;
						for (@Pc(357) int local357 = 0; local357 < 7; local357++) {
							@Pc(364) int local364 = this.anIntArray270[local357];
							if (local364 >= 0) {
								local353[local355++] = Class47.aClass47Array1[local364].method551(173);
							}
						}
						@Pc(386) Class1_Sub1_Sub1_Sub4 local386 = new Class1_Sub1_Sub1_Sub4((byte) 6, local355, local353);
						for (@Pc(388) int local388 = 0; local388 < 5; local388++) {
							if (this.anIntArray215[local388] != 0) {
								local386.method284(anIntArrayArray23[local388][0], anIntArrayArray23[local388][this.anIntArray215[local388]]);
								if (local388 == 1) {
									local386.method284(anIntArray263[0], anIntArray263[this.anIntArray215[local388]]);
								}
							}
						}
						local386.method277();
						local386.method278(Class46.aClass46Array1[aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt630].anIntArray196[0]);
						local386.method287(64, 850, -30, -50, -30, true);
						arg0.anInt706 = 5;
						arg0.anInt707 = 0;
						Class39.method515(local386);
					}
				} else if (local9 == 324) {
					if (this.aClass1_Sub1_Sub2_Sub1_3 == null) {
						this.aClass1_Sub1_Sub2_Sub1_3 = arg0.aClass1_Sub1_Sub2_Sub1_2;
						this.aClass1_Sub1_Sub2_Sub1_4 = arg0.aClass1_Sub1_Sub2_Sub1_1;
					}
					if (this.aBoolean249) {
						arg0.aClass1_Sub1_Sub2_Sub1_2 = this.aClass1_Sub1_Sub2_Sub1_4;
					} else {
						arg0.aClass1_Sub1_Sub2_Sub1_2 = this.aClass1_Sub1_Sub2_Sub1_3;
					}
				} else if (local9 == 325) {
					if (this.aClass1_Sub1_Sub2_Sub1_3 == null) {
						this.aClass1_Sub1_Sub2_Sub1_3 = arg0.aClass1_Sub1_Sub2_Sub1_2;
						this.aClass1_Sub1_Sub2_Sub1_4 = arg0.aClass1_Sub1_Sub2_Sub1_1;
					}
					if (this.aBoolean249) {
						arg0.aClass1_Sub1_Sub2_Sub1_2 = this.aClass1_Sub1_Sub2_Sub1_3;
					} else {
						arg0.aClass1_Sub1_Sub2_Sub1_2 = this.aClass1_Sub1_Sub2_Sub1_4;
					}
				} else if (local9 == 600) {
					arg0.aString11 = this.aString22;
					if (anInt931 % 20 < 10) {
						arg0.aString11 = arg0.aString11 + "|";
					} else {
						arg0.aString11 = arg0.aString11 + " ";
					}
				} else {
					if (local9 == 613) {
						if (this.anInt894 < 1) {
							arg0.aString11 = "";
						} else if (this.aBoolean264) {
							arg0.anInt689 = 16711680;
							arg0.aString11 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg0.anInt689 = 16777215;
							arg0.aString11 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(594) String local594;
					if (local9 == 650 || local9 == 655) {
						if (this.anInt946 == 0) {
							arg0.aString11 = "";
						} else {
							if (this.anInt922 == 0) {
								local594 = "earlier today";
							} else if (this.anInt922 == 1) {
								local594 = "yesterday";
							} else {
								local594 = this.anInt922 + " days ago";
							}
							arg0.aString11 = "You last logged in " + local594 + " from: " + signlink.dns;
						}
					}
					if (local9 == 651) {
						if (this.anInt932 == 0) {
							arg0.aString11 = "0 unread messages";
							arg0.anInt689 = 16776960;
						}
						if (this.anInt932 == 1) {
							arg0.aString11 = "1 unread message";
							arg0.anInt689 = 65280;
						}
						if (this.anInt932 > 1) {
							arg0.aString11 = this.anInt932 + " unread messages";
							arg0.anInt689 = 65280;
						}
					}
					if (local9 == 652) {
						if (this.anInt964 == 201) {
							if (this.anInt1058 == 1) {
								arg0.aString11 = "@yel@This is a non-members world: @whi@Since you are a member we";
							} else {
								arg0.aString11 = "";
							}
						} else if (this.anInt964 == 200) {
							arg0.aString11 = "You have not yet set any password recovery questions.";
						} else {
							if (this.anInt964 == 0) {
								local594 = "Earlier today";
							} else if (this.anInt964 == 1) {
								local594 = "Yesterday";
							} else {
								local594 = this.anInt964 + " days ago";
							}
							arg0.aString11 = local594 + " you changed your recovery questions";
						}
					}
					if (local9 == 653) {
						if (this.anInt964 == 201) {
							if (this.anInt1058 == 1) {
								arg0.aString11 = "@whi@recommend you use a members world instead. You may use";
							} else {
								arg0.aString11 = "";
							}
						} else if (this.anInt964 == 200) {
							arg0.aString11 = "We strongly recommend you do so now to secure your account.";
						} else {
							arg0.aString11 = "If you do not remember making this change then cancel it immediately";
						}
					}
					if (local9 == 654) {
						if (this.anInt964 == 201) {
							if (this.anInt1058 == 1) {
								arg0.aString11 = "@whi@this world but member benefits are unavailable whilst here.";
							} else {
								arg0.aString11 = "";
							}
						} else if (this.anInt964 == 200) {
							arg0.aString11 = "Do this from the 'account management' area on our front webpage";
						} else {
							arg0.aString11 = "Do this from the 'account management' area on our front webpage";
						}
					}
				}
			} else if (local9 == 1 && this.anInt1038 == 0) {
				arg0.aString11 = "Loading friend list";
				arg0.anInt694 = 0;
			} else if (local9 == 1 && this.anInt1038 == 1) {
				arg0.aString11 = "Connecting to friendserver";
				arg0.anInt694 = 0;
			} else if (local9 == 2 && this.anInt1038 != 2) {
				arg0.aString11 = "Please wait...";
				arg0.anInt694 = 0;
			} else {
				local65 = this.anInt1037;
				if (this.anInt1038 != 2) {
					local65 = 0;
				}
				if (local9 > 700) {
					local9 -= 601;
				} else {
					local9--;
				}
				if (local9 >= local65) {
					arg0.aString11 = "";
					arg0.anInt694 = 0;
				} else {
					arg0.aString11 = this.aStringArray10[local9];
					arg0.anInt694 = 1;
				}
			}
		} catch (@Pc(802) RuntimeException local802) {
			signlink.reporterror("66339, " + 0 + ", " + arg0 + ", " + local802.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method587() {
		try {
			if (super.anInt839 == 1) {
				if (super.anInt840 >= 539 && super.anInt840 <= 573 && super.anInt841 >= 169 && super.anInt841 < 205 && this.anIntArray255[0] != -1) {
					this.aBoolean227 = true;
					this.anInt992 = 0;
					this.aBoolean223 = true;
				}
				if (super.anInt840 >= 569 && super.anInt840 <= 599 && super.anInt841 >= 168 && super.anInt841 < 205 && this.anIntArray255[1] != -1) {
					this.aBoolean227 = true;
					this.anInt992 = 1;
					this.aBoolean223 = true;
				}
				if (super.anInt840 >= 597 && super.anInt840 <= 627 && super.anInt841 >= 168 && super.anInt841 < 205 && this.anIntArray255[2] != -1) {
					this.aBoolean227 = true;
					this.anInt992 = 2;
					this.aBoolean223 = true;
				}
				if (super.anInt840 >= 625 && super.anInt840 <= 669 && super.anInt841 >= 168 && super.anInt841 < 203 && this.anIntArray255[3] != -1) {
					this.aBoolean227 = true;
					this.anInt992 = 3;
					this.aBoolean223 = true;
				}
				if (super.anInt840 >= 666 && super.anInt840 <= 696 && super.anInt841 >= 168 && super.anInt841 < 205 && this.anIntArray255[4] != -1) {
					this.aBoolean227 = true;
					this.anInt992 = 4;
					this.aBoolean223 = true;
				}
				if (super.anInt840 >= 694 && super.anInt840 <= 724 && super.anInt841 >= 168 && super.anInt841 < 205 && this.anIntArray255[5] != -1) {
					this.aBoolean227 = true;
					this.anInt992 = 5;
					this.aBoolean223 = true;
				}
				if (super.anInt840 >= 722 && super.anInt840 <= 756 && super.anInt841 >= 169 && super.anInt841 < 205 && this.anIntArray255[6] != -1) {
					this.aBoolean227 = true;
					this.anInt992 = 6;
					this.aBoolean223 = true;
				}
				if (super.anInt840 >= 540 && super.anInt840 <= 574 && super.anInt841 >= 466 && super.anInt841 < 502 && this.anIntArray255[7] != -1) {
					this.aBoolean227 = true;
					this.anInt992 = 7;
					this.aBoolean223 = true;
				}
				if (super.anInt840 >= 572 && super.anInt840 <= 602 && super.anInt841 >= 466 && super.anInt841 < 503 && this.anIntArray255[8] != -1) {
					this.aBoolean227 = true;
					this.anInt992 = 8;
					this.aBoolean223 = true;
				}
				if (super.anInt840 >= 599 && super.anInt840 <= 629 && super.anInt841 >= 466 && super.anInt841 < 503 && this.anIntArray255[9] != -1) {
					this.aBoolean227 = true;
					this.anInt992 = 9;
					this.aBoolean223 = true;
				}
				if (super.anInt840 >= 627 && super.anInt840 <= 671 && super.anInt841 >= 467 && super.anInt841 < 502 && this.anIntArray255[10] != -1) {
					this.aBoolean227 = true;
					this.anInt992 = 10;
					this.aBoolean223 = true;
				}
				if (super.anInt840 >= 669 && super.anInt840 <= 699 && super.anInt841 >= 466 && super.anInt841 < 503 && this.anIntArray255[11] != -1) {
					this.aBoolean227 = true;
					this.anInt992 = 11;
					this.aBoolean223 = true;
				}
				if (super.anInt840 >= 696 && super.anInt840 <= 726 && super.anInt841 >= 466 && super.anInt841 < 503 && this.anIntArray255[12] != -1) {
					this.aBoolean227 = true;
					this.anInt992 = 12;
					this.aBoolean223 = true;
				}
				if (super.anInt840 >= 724 && super.anInt840 <= 758 && super.anInt841 >= 466 && super.anInt841 < 502 && this.anIntArray255[13] != -1) {
					this.aBoolean227 = true;
					this.anInt992 = 13;
					this.aBoolean223 = true;
				}
				anInt906++;
				if (anInt906 > 184) {
					anInt906 = 0;
					this.aClass1_Sub1_Sub3_6.method348(213);
					this.aClass1_Sub1_Sub3_6.method350(6488);
					return;
				}
			}
		} catch (@Pc(467) RuntimeException local467) {
			signlink.reporterror("69701, " + 33812 + ", " + local467.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIBLclient!ULLVQOAK;II)V")
	private void method588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class39 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg3.anInt693 == 0 && arg3.anIntArray154 != null && !arg3.aBoolean167 && (arg2 >= arg4 && arg5 >= arg1 && arg2 <= arg4 + arg3.anInt714 && arg5 <= arg1 + arg3.anInt715)) {
				@Pc(34) int local34 = arg3.anIntArray154.length;
				@Pc(45) int local45;
				for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
					local45 = arg3.anIntArray158[local36] + arg4;
					@Pc(54) int local54 = arg3.anIntArray160[local36] + arg1 - arg0;
					@Pc(61) Class39 local61 = Class39.aClass39Array1[arg3.anIntArray154[local36]];
					@Pc(66) int local66 = local45 + local61.anInt691;
					@Pc(71) int local71 = local54 + local61.anInt702;
					if ((local61.anInt699 >= 0 || local61.anInt686 != 0) && arg2 >= local66 && arg5 >= local71 && arg2 < local66 + local61.anInt714 && arg5 < local71 + local61.anInt715) {
						if (local61.anInt699 >= 0) {
							this.anInt871 = local61.anInt699;
						} else {
							this.anInt871 = local61.anInt716;
						}
					}
					if (local61.anInt693 == 0) {
						this.method588(local61.anInt712, local71, arg2, local61, local66, arg5);
						if (local61.anInt688 > local61.anInt715) {
							this.method686(arg2, local71, arg5, local66 + local61.anInt714, local61.anInt715, local61, true, local61.anInt688);
						}
					} else {
						if (local61.anInt694 == 1 && arg2 >= local66 && arg5 >= local71 && arg2 < local66 + local61.anInt714 && arg5 < local71 + local61.anInt715) {
							@Pc(168) boolean local168 = false;
							if (local61.anInt701 != 0) {
								local168 = this.method625(local61);
							}
							if (!local168) {
								this.aStringArray9[this.anInt1019] = local61.aString13;
								this.anIntArray252[this.anInt1019] = 158;
								this.anIntArray251[this.anInt1019] = local61.anInt716;
								this.anInt1019++;
							}
						}
						if (local61.anInt694 == 2 && this.anInt849 == 0 && arg2 >= local66 && arg5 >= local71 && arg2 < local66 + local61.anInt714 && arg5 < local71 + local61.anInt715) {
							@Pc(232) String local232 = local61.aString10;
							if (local232.indexOf(" ") != -1) {
								local232 = local232.substring(0, local232.indexOf(" "));
							}
							this.aStringArray9[this.anInt1019] = local232 + " @gre@" + local61.aString9;
							this.anIntArray252[this.anInt1019] = 358;
							this.anIntArray251[this.anInt1019] = local61.anInt716;
							this.anInt1019++;
						}
						if (local61.anInt694 == 3 && arg2 >= local66 && arg5 >= local71 && arg2 < local66 + local61.anInt714 && arg5 < local71 + local61.anInt715) {
							this.aStringArray9[this.anInt1019] = "Close";
							this.anIntArray252[this.anInt1019] = 242;
							this.anIntArray251[this.anInt1019] = local61.anInt716;
							this.anInt1019++;
						}
						if (local61.anInt694 == 4 && arg2 >= local66 && arg5 >= local71 && arg2 < local66 + local61.anInt714 && arg5 < local71 + local61.anInt715) {
							this.aStringArray9[this.anInt1019] = local61.aString13;
							this.anIntArray252[this.anInt1019] = 682;
							this.anIntArray251[this.anInt1019] = local61.anInt716;
							this.anInt1019++;
						}
						if (local61.anInt694 == 5 && arg2 >= local66 && arg5 >= local71 && arg2 < local66 + local61.anInt714 && arg5 < local71 + local61.anInt715) {
							this.aStringArray9[this.anInt1019] = local61.aString13;
							this.anIntArray252[this.anInt1019] = 552;
							this.anIntArray251[this.anInt1019] = local61.anInt716;
							this.anInt1019++;
						}
						if (local61.anInt694 == 6 && !this.aBoolean255 && arg2 >= local66 && arg5 >= local71 && arg2 < local66 + local61.anInt714 && arg5 < local71 + local61.anInt715) {
							this.aStringArray9[this.anInt1019] = local61.aString13;
							this.anIntArray252[this.anInt1019] = 622;
							this.anIntArray251[this.anInt1019] = local61.anInt716;
							this.anInt1019++;
						}
						if (local61.anInt693 == 2) {
							@Pc(480) int local480 = 0;
							for (@Pc(482) int local482 = 0; local482 < local61.anInt715; local482++) {
								for (@Pc(486) int local486 = 0; local486 < local61.anInt714; local486++) {
									@Pc(497) int local497 = local66 + local486 * (local61.anInt685 + 32);
									@Pc(506) int local506 = local71 + local482 * (local61.anInt710 + 32);
									if (local480 < 20) {
										local497 += local61.anIntArray159[local480];
										local506 += local61.anIntArray153[local480];
									}
									if (arg2 >= local497 && arg5 >= local506 && arg2 < local497 + 32 && arg5 < local506 + 32) {
										this.anInt1043 = local480;
										this.anInt1044 = local61.anInt716;
										if (local61.anIntArray152[local480] > 0) {
											@Pc(559) Class21 local559 = Class21.method335(local61.anIntArray152[local480] - 1);
											if (this.anInt853 == 1 && local61.aBoolean171) {
												if (local61.anInt716 != this.anInt855 || local480 != this.anInt854) {
													this.aStringArray9[this.anInt1019] = "Use " + this.aString18 + " with @lre@" + local559.aString6;
													this.anIntArray252[this.anInt1019] = 829;
													this.anIntArray253[this.anInt1019] = local559.anInt423;
													this.anIntArray250[this.anInt1019] = local480;
													this.anIntArray251[this.anInt1019] = local61.anInt716;
													this.anInt1019++;
												}
											} else if (this.anInt849 != 1 || !local61.aBoolean171) {
												@Pc(696) int local696;
												if (local61.aBoolean171) {
													for (local696 = 4; local696 >= 3; local696--) {
														if (local559.aStringArray2 != null && local559.aStringArray2[local696] != null) {
															this.aStringArray9[this.anInt1019] = local559.aStringArray2[local696] + " @lre@" + local559.aString6;
															if (local696 == 3) {
																this.anIntArray252[this.anInt1019] = 598;
															}
															if (local696 == 4) {
																this.anIntArray252[this.anInt1019] = 975;
															}
															this.anIntArray253[this.anInt1019] = local559.anInt423;
															this.anIntArray250[this.anInt1019] = local480;
															this.anIntArray251[this.anInt1019] = local61.anInt716;
															this.anInt1019++;
														} else if (local696 == 4) {
															this.aStringArray9[this.anInt1019] = "Drop @lre@" + local559.aString6;
															this.anIntArray252[this.anInt1019] = 975;
															this.anIntArray253[this.anInt1019] = local559.anInt423;
															this.anIntArray250[this.anInt1019] = local480;
															this.anIntArray251[this.anInt1019] = local61.anInt716;
															this.anInt1019++;
														}
													}
												}
												if (local61.aBoolean164) {
													this.aStringArray9[this.anInt1019] = "Use @lre@" + local559.aString6;
													this.anIntArray252[this.anInt1019] = 787;
													this.anIntArray253[this.anInt1019] = local559.anInt423;
													this.anIntArray250[this.anInt1019] = local480;
													this.anIntArray251[this.anInt1019] = local61.anInt716;
													this.anInt1019++;
												}
												if (local61.aBoolean171 && local559.aStringArray2 != null) {
													for (local696 = 2; local696 >= 0; local696--) {
														if (local559.aStringArray2[local696] != null) {
															this.aStringArray9[this.anInt1019] = local559.aStringArray2[local696] + " @lre@" + local559.aString6;
															if (local696 == 0) {
																this.anIntArray252[this.anInt1019] = 579;
															}
															if (local696 == 1) {
																this.anIntArray252[this.anInt1019] = 540;
															}
															if (local696 == 2) {
																this.anIntArray252[this.anInt1019] = 422;
															}
															this.anIntArray253[this.anInt1019] = local559.anInt423;
															this.anIntArray250[this.anInt1019] = local480;
															this.anIntArray251[this.anInt1019] = local61.anInt716;
															this.anInt1019++;
														}
													}
												}
												if (local61.aStringArray5 != null) {
													for (local696 = 4; local696 >= 0; local696--) {
														if (local61.aStringArray5[local696] != null) {
															this.aStringArray9[this.anInt1019] = local61.aStringArray5[local696] + " @lre@" + local559.aString6;
															if (local696 == 0) {
																this.anIntArray252[this.anInt1019] = 855;
															}
															if (local696 == 1) {
																this.anIntArray252[this.anInt1019] = 822;
															}
															if (local696 == 2) {
																this.anIntArray252[this.anInt1019] = 589;
															}
															if (local696 == 3) {
																this.anIntArray252[this.anInt1019] = 914;
															}
															if (local696 == 4) {
																this.anIntArray252[this.anInt1019] = 568;
															}
															this.anIntArray253[this.anInt1019] = local559.anInt423;
															this.anIntArray250[this.anInt1019] = local480;
															this.anIntArray251[this.anInt1019] = local61.anInt716;
															this.anInt1019++;
														}
													}
												}
												this.aStringArray9[this.anInt1019] = "Examine @lre@" + local559.aString6;
												this.anIntArray252[this.anInt1019] = 1186;
												this.anIntArray253[this.anInt1019] = local559.anInt423;
												this.anIntArray250[this.anInt1019] = local480;
												this.anIntArray251[this.anInt1019] = local61.anInt716;
												this.anInt1019++;
											} else if ((this.anInt851 & 0x10) == 16) {
												this.aStringArray9[this.anInt1019] = this.aString17 + " @lre@" + local559.aString6;
												this.anIntArray252[this.anInt1019] = 943;
												this.anIntArray253[this.anInt1019] = local559.anInt423;
												this.anIntArray250[this.anInt1019] = local480;
												this.anIntArray251[this.anInt1019] = local61.anInt716;
												this.anInt1019++;
											}
										}
									}
									local480++;
								}
							}
						}
					}
				}
				if (this.aByte44 != 0) {
					for (local45 = 1; local45 > 0; local45++) {
					}
				}
			}
		} catch (@Pc(1140) RuntimeException local1140) {
			signlink.reporterror("82086, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local1140.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!LDILQFVA;I)V")
	private void method589(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			arg0.method369();
			@Pc(9) int local9 = arg0.method370(8);
			this.aBoolean241 &= true;
			@Pc(21) int local21;
			if (local9 < this.anInt1036) {
				for (local21 = local9; local21 < this.anInt1036; local21++) {
					this.anIntArray261[this.anInt1014++] = this.anIntArray265[local21];
				}
			}
			if (local9 > this.anInt1036) {
				signlink.reporterror(this.aString20 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt1036 = 0;
			for (local21 = 0; local21 < local9; local21++) {
				@Pc(73) int local73 = this.anIntArray265[local21];
				@Pc(78) Class1_Sub1_Sub1_Sub1_Sub2 local78 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local73];
				@Pc(83) int local83 = arg0.method370(1);
				if (local83 == 0) {
					this.anIntArray265[this.anInt1036++] = local73;
					local78.anInt665 = anInt931;
				} else {
					@Pc(106) int local106 = arg0.method370(2);
					if (local106 == 0) {
						this.anIntArray265[this.anInt1036++] = local73;
						local78.anInt665 = anInt931;
						this.anIntArray247[this.anInt961++] = local73;
					} else {
						@Pc(157) int local157;
						@Pc(167) int local167;
						if (local106 == 1) {
							this.anIntArray265[this.anInt1036++] = local73;
							local78.anInt665 = anInt931;
							local157 = arg0.method370(3);
							local78.method497(local157, false);
							local167 = arg0.method370(1);
							if (local167 == 1) {
								this.anIntArray247[this.anInt961++] = local73;
							}
						} else if (local106 == 2) {
							this.anIntArray265[this.anInt1036++] = local73;
							local78.anInt665 = anInt931;
							local157 = arg0.method370(3);
							local78.method497(local157, true);
							local167 = arg0.method370(3);
							local78.method497(local167, true);
							@Pc(225) int local225 = arg0.method370(1);
							if (local225 == 1) {
								this.anIntArray247[this.anInt961++] = local73;
							}
						} else if (local106 == 3) {
							this.anIntArray261[this.anInt1014++] = local73;
						}
					}
				}
			}
		} catch (@Pc(262) RuntimeException local262) {
			signlink.reporterror("12422, " + true + ", " + arg0 + ", " + arg1 + ", " + local262.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(III)Z")
	private boolean method591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(7) Class39 local7 = Class39.aClass39Array1[arg0];
			for (@Pc(9) int local9 = 0; local9 < local7.anIntArray154.length && local7.anIntArray154[local9] != -1; local9++) {
				@Pc(24) Class39 local24 = Class39.aClass39Array1[local7.anIntArray154[local9]];
				if (local24.anInt693 == 1) {
					local3 |= this.method591(local24.anInt716, arg1);
				}
				@Pc(59) int local59;
				if (local24.anInt693 == 6 && (local24.anInt704 != -1 || local24.anInt705 != -1)) {
					@Pc(54) boolean local54 = this.method655(local24);
					if (local54) {
						local59 = local24.anInt705;
					} else {
						local59 = local24.anInt704;
					}
					if (local59 != -1) {
						@Pc(71) Class46 local71 = Class46.aClass46Array1[local59];
						local24.anInt708 += arg1;
						while (local24.anInt708 > local71.method542(local24.anInt711, (byte) 2)) {
							local24.anInt708 -= local71.method542(local24.anInt711, (byte) 2) + 1;
							local24.anInt711++;
							if (local24.anInt711 >= local71.anInt775) {
								local24.anInt711 -= local71.anInt776;
								if (local24.anInt711 < 0 || local24.anInt711 >= local71.anInt775) {
									local24.anInt711 = 0;
								}
							}
							local3 = true;
						}
					}
				}
				if (local24.anInt693 == 6 && local24.anInt695 != 0) {
					@Pc(142) int local142 = local24.anInt695 >> 16;
					local59 = local24.anInt695 << 16 >> 16;
					@Pc(153) int local153 = local142 * arg1;
					local59 *= arg1;
					local24.anInt697 = local24.anInt697 + local153 & 0x7FF;
					local24.anInt698 = local24.anInt698 + local59 & 0x7FF;
					local3 = true;
				}
			}
			return local3;
		} catch (@Pc(190) RuntimeException local190) {
			signlink.reporterror("60017, " + arg0 + ", " + arg1 + ", " + -208 + ", " + local190.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method592() {
		try {
			anInt890++;
			if (anInt890 > 178) {
				anInt890 = 0;
				this.aClass1_Sub1_Sub3_6.method348(128);
				this.aClass1_Sub1_Sub3_6.method353(0);
			}
			while (true) {
				@Pc(31) int local31;
				do {
					while (true) {
						local31 = this.method573(this.aBoolean261);
						if (local31 == -1) {
							return;
						}
						if (this.anInt938 != -1 && this.anInt938 == this.anInt1055) {
							if (local31 == 8 && this.aString22.length() > 0) {
								this.aString22 = this.aString22.substring(0, this.aString22.length() - 1);
							}
							break;
						}
						@Pc(211) int local211;
						if (this.aBoolean259) {
							if (local31 >= 32 && local31 <= 122 && this.aString24.length() < 80) {
								this.aString24 = this.aString24 + (char) local31;
								this.aBoolean236 = true;
							}
							if (local31 == 8 && this.aString24.length() > 0) {
								this.aString24 = this.aString24.substring(0, this.aString24.length() - 1);
								this.aBoolean236 = true;
							}
							if (local31 == 13 || local31 == 10) {
								this.aBoolean259 = false;
								this.aBoolean236 = true;
								@Pc(171) long local171;
								if (this.anInt886 == 1) {
									local171 = Class15.method194(this.aString24);
									this.method636(local171, 641);
								}
								if (this.anInt886 == 2 && this.anInt1037 > 0) {
									local171 = Class15.method194(this.aString24);
									this.method615(local171);
								}
								if (this.anInt886 == 3 && this.aString24.length() > 0) {
									this.aClass1_Sub1_Sub3_6.method348(226);
									this.aClass1_Sub1_Sub3_6.method349(0);
									local211 = this.aClass1_Sub1_Sub3_6.anInt443;
									this.aClass1_Sub1_Sub3_6.method355(this.aLong32);
									Class18.method260(this.aClass1_Sub1_Sub3_6, this.aString24);
									this.aClass1_Sub1_Sub3_6.method358(this.aBoolean245, this.aClass1_Sub1_Sub3_6.anInt443 - local211);
									this.aString24 = Class18.method261(this.aString24);
									this.aString24 = Class25.method445(this.aString24);
									this.method695(Class15.method198(Class15.method195(this.aLong32)), 6, this.aString24);
									if (this.anInt1021 == 2) {
										this.anInt1021 = 1;
										this.aBoolean218 = true;
										this.aClass1_Sub1_Sub3_6.method348(39);
										this.aClass1_Sub1_Sub3_6.method349(this.anInt859);
										this.aClass1_Sub1_Sub3_6.method349(this.anInt1021);
										this.aClass1_Sub1_Sub3_6.method349(this.anInt1054);
									}
								}
								if (this.anInt886 == 4 && this.anInt935 < 100) {
									local171 = Class15.method194(this.aString24);
									this.method715(local171);
								}
								if (this.anInt886 == 5 && this.anInt935 > 0) {
									local171 = Class15.method194(this.aString24);
									this.method626(local171);
								}
							}
						} else if (this.anInt877 == 1) {
							if (local31 >= 48 && local31 <= 57 && this.aString30.length() < 10) {
								this.aString30 = this.aString30 + (char) local31;
								this.aBoolean236 = true;
							}
							if (local31 == 8 && this.aString30.length() > 0) {
								this.aString30 = this.aString30.substring(0, this.aString30.length() - 1);
								this.aBoolean236 = true;
							}
							if (local31 == 13 || local31 == 10) {
								if (this.aString30.length() > 0) {
									local211 = 0;
									try {
										local211 = Integer.parseInt(this.aString30);
									} catch (@Pc(389) Exception local389) {
									}
									this.aClass1_Sub1_Sub3_6.method348(98);
									this.aClass1_Sub1_Sub3_6.method353(local211);
								}
								this.anInt877 = 0;
								this.aBoolean236 = true;
							}
						} else if (this.anInt877 == 2) {
							if (local31 >= 32 && local31 <= 122 && this.aString30.length() < 12) {
								this.aString30 = this.aString30 + (char) local31;
								this.aBoolean236 = true;
							}
							if (local31 == 8 && this.aString30.length() > 0) {
								this.aString30 = this.aString30.substring(0, this.aString30.length() - 1);
								this.aBoolean236 = true;
							}
							if (local31 == 13 || local31 == 10) {
								if (this.aString30.length() > 0) {
									this.aClass1_Sub1_Sub3_6.method348(13);
									this.aClass1_Sub1_Sub3_6.method355(Class15.method194(this.aString30));
								}
								this.anInt877 = 0;
								this.aBoolean236 = true;
							}
						} else if (this.anInt885 == -1) {
							if (local31 >= 32 && local31 <= 122 && this.aString23.length() < 80) {
								this.aString23 = this.aString23 + (char) local31;
								this.aBoolean236 = true;
							}
							if (local31 == 8 && this.aString23.length() > 0) {
								this.aString23 = this.aString23.substring(0, this.aString23.length() - 1);
								this.aBoolean236 = true;
							}
							if ((local31 == 13 || local31 == 10) && this.aString23.length() > 0) {
								if (this.anInt894 == 2) {
									if (this.aString23.equals("::clientdrop")) {
										this.method584();
									}
									if (this.aString23.equals("::lag")) {
										this.method637();
									}
									if (this.aString23.equals("::prefetchmusic")) {
										for (local211 = 0; local211 < this.aClass16_Sub1_1.method225(2); local211++) {
											this.aClass16_Sub1_1.method213(local211, (byte) 1, 2);
										}
									}
									if (this.aString23.equals("::fpson")) {
										aBoolean233 = true;
									}
									if (this.aString23.equals("::fpsoff")) {
										aBoolean233 = false;
									}
									if (this.aString23.equals("::noclip")) {
										for (local211 = 0; local211 < 4; local211++) {
											for (@Pc(617) int local617 = 1; local617 < 103; local617++) {
												for (@Pc(621) int local621 = 1; local621 < 103; local621++) {
													this.aClass14Array1[local211].anIntArrayArray5[local617][local621] = 0;
												}
											}
										}
									}
								}
								if (this.aString23.startsWith("::")) {
									this.aClass1_Sub1_Sub3_6.method348(135);
									this.aClass1_Sub1_Sub3_6.method349(this.aString23.length() - 1);
									this.aClass1_Sub1_Sub3_6.method356(this.aString23.substring(2));
								} else {
									@Pc(676) String local676 = this.aString23.toLowerCase();
									@Pc(678) byte local678 = 0;
									if (local676.startsWith("yellow:")) {
										local678 = 0;
										this.aString23 = this.aString23.substring(7);
									} else if (local676.startsWith("red:")) {
										local678 = 1;
										this.aString23 = this.aString23.substring(4);
									} else if (local676.startsWith("green:")) {
										local678 = 2;
										this.aString23 = this.aString23.substring(6);
									} else if (local676.startsWith("cyan:")) {
										local678 = 3;
										this.aString23 = this.aString23.substring(5);
									} else if (local676.startsWith("purple:")) {
										local678 = 4;
										this.aString23 = this.aString23.substring(7);
									} else if (local676.startsWith("white:")) {
										local678 = 5;
										this.aString23 = this.aString23.substring(6);
									} else if (local676.startsWith("flash1:")) {
										local678 = 6;
										this.aString23 = this.aString23.substring(7);
									} else if (local676.startsWith("flash2:")) {
										local678 = 7;
										this.aString23 = this.aString23.substring(7);
									} else if (local676.startsWith("flash3:")) {
										local678 = 8;
										this.aString23 = this.aString23.substring(7);
									} else if (local676.startsWith("glow1:")) {
										local678 = 9;
										this.aString23 = this.aString23.substring(6);
									} else if (local676.startsWith("glow2:")) {
										local678 = 10;
										this.aString23 = this.aString23.substring(6);
									} else if (local676.startsWith("glow3:")) {
										local678 = 11;
										this.aString23 = this.aString23.substring(6);
									}
									local676 = this.aString23.toLowerCase();
									@Pc(850) byte local850 = 0;
									if (local676.startsWith("wave:")) {
										local850 = 1;
										this.aString23 = this.aString23.substring(5);
									} else if (local676.startsWith("wave2:")) {
										local850 = 2;
										this.aString23 = this.aString23.substring(6);
									} else if (local676.startsWith("shake:")) {
										local850 = 3;
										this.aString23 = this.aString23.substring(6);
									} else if (local676.startsWith("scroll:")) {
										local850 = 4;
										this.aString23 = this.aString23.substring(7);
									} else if (local676.startsWith("slide:")) {
										local850 = 5;
										this.aString23 = this.aString23.substring(6);
									}
									this.aClass1_Sub1_Sub3_6.method348(100);
									this.aClass1_Sub1_Sub3_6.method349(0);
									@Pc(931) int local931 = this.aClass1_Sub1_Sub3_6.anInt443;
									this.aClass1_Sub1_Sub3_8.anInt443 = 0;
									Class18.method260(this.aClass1_Sub1_Sub3_8, this.aString23);
									this.aClass1_Sub1_Sub3_6.method395(this.aClass1_Sub1_Sub3_8.anInt443, this.aClass1_Sub1_Sub3_8.aByteArray6);
									this.aClass1_Sub1_Sub3_6.method376(local850);
									this.aClass1_Sub1_Sub3_6.method376(local678);
									this.aClass1_Sub1_Sub3_6.method358(this.aBoolean245, this.aClass1_Sub1_Sub3_6.anInt443 - local931);
									this.aString23 = Class18.method261(this.aString23);
									this.aString23 = Class25.method445(this.aString23);
									aClass1_Sub1_Sub1_Sub1_Sub1_1.aString8 = this.aString23;
									aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt655 = local678;
									aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt619 = local850;
									aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt664 = 150;
									if (this.anInt894 == 2) {
										this.method695("@cr2@" + aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3, 2, aClass1_Sub1_Sub1_Sub1_Sub1_1.aString8);
									} else if (this.anInt894 == 1) {
										this.method695("@cr1@" + aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3, 2, aClass1_Sub1_Sub1_Sub1_Sub1_1.aString8);
									} else {
										this.method695(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3, 2, aClass1_Sub1_Sub1_Sub1_Sub1_1.aString8);
									}
									if (this.anInt859 == 2) {
										this.anInt859 = 3;
										this.aBoolean218 = true;
										this.aClass1_Sub1_Sub3_6.method348(39);
										this.aClass1_Sub1_Sub3_6.method349(this.anInt859);
										this.aClass1_Sub1_Sub3_6.method349(this.anInt1021);
										this.aClass1_Sub1_Sub3_6.method349(this.anInt1054);
									}
								}
								this.aString23 = "";
								this.aBoolean236 = true;
							}
						}
					}
				} while ((local31 < 97 || local31 > 122) && (local31 < 65 || local31 > 90) && (local31 < 48 || local31 > 57) && local31 != 32);
				if (this.aString22.length() < 12) {
					this.aString22 = this.aString22 + (char) local31;
				}
			}
		} catch (@Pc(1085) RuntimeException local1085) {
			signlink.reporterror("62972, " + false + ", " + local1085.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[BB)V")
	private void method593(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		try {
			if (this.aBoolean225) {
				signlink.anInt1073 = arg0 ? 1 : 0;
				signlink.midisave(arg1, arg1.length);
			}
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("24801, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;I)V")
	@Override
	protected void method581(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt1040 = arg1;
			this.aString29 = arg0;
			this.method620(696);
			if (this.aClass35_1 == null) {
				super.method581(arg0, arg1);
			} else {
				this.aClass36_21.method503();
				this.aClass1_Sub1_Sub2_Sub2_4.method179("RuneScape is loading - please wait...", 180, 54, 16777215, this.anInt943);
				Class1_Sub1_Sub2.method406(9179409, 28, 304, this.anInt1022, 34, 62);
				Class1_Sub1_Sub2.method406(0, 29, 302, this.anInt1022, 32, 63);
				Class1_Sub1_Sub2.method405(9179409, arg1 * 3, 30, 64, 30);
				Class1_Sub1_Sub2.method405(0, 300 - arg1 * 3, arg1 * 3 + 30, 64, 30);
				this.aClass1_Sub1_Sub2_Sub2_4.method179(arg0, 180, 85, 16777215, this.anInt943);
				this.aClass36_21.method504((byte) 9, 171, 202, super.aGraphics2);
				if (this.aBoolean256) {
					this.aBoolean256 = false;
					if (!this.aBoolean250) {
						this.aClass36_22.method504((byte) 9, 0, 0, super.aGraphics2);
						this.aClass36_23.method504((byte) 9, 0, 637, super.aGraphics2);
					}
					this.aClass36_19.method504((byte) 9, 0, 128, super.aGraphics2);
					this.aClass36_20.method504((byte) 9, 371, 202, super.aGraphics2);
					this.aClass36_24.method504((byte) 9, 265, 0, super.aGraphics2);
					this.aClass36_25.method504((byte) 9, 265, 562, super.aGraphics2);
					this.aClass36_26.method504((byte) 9, 171, 128, super.aGraphics2);
					this.aClass36_27.method504((byte) 9, 171, 562, super.aGraphics2);
				}
			}
		} catch (@Pc(221) RuntimeException local221) {
			signlink.reporterror("18705, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local221.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method594() {
		try {
			signlink.aBoolean265 = false;
			signlink.anInt1073 = 0;
			signlink.midi = "stop";
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("25948, " + false + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
	private void method595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg4 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg3 & 0x7FF;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = arg1;
			@Pc(23) int local23;
			@Pc(27) int local27;
			@Pc(37) int local37;
			if (local5 != 0) {
				local23 = Class1_Sub1_Sub1_Sub4.anIntArray96[local5];
				local27 = Class1_Sub1_Sub1_Sub4.anIntArray97[local5];
				local37 = local27 * 0 - arg1 * local23 >> 16;
				local17 = local23 * 0 + arg1 * local27 >> 16;
				local15 = local37;
			}
			if (local11 != 0) {
				local23 = Class1_Sub1_Sub1_Sub4.anIntArray96[local11];
				local27 = Class1_Sub1_Sub1_Sub4.anIntArray97[local11];
				local37 = local17 * local23 + local27 * 0 >> 16;
				local17 = local17 * local27 - local23 * 0 >> 16;
				local13 = local37;
			}
			this.anInt879 = arg2 - local13;
			this.anInt880 = arg5 - local15;
			this.anInt881 = arg0 - local17;
			this.anInt882 = arg4;
			this.anInt883 = arg3;
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("73972, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + arg5 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method596() {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt1036; local1++) {
				@Pc(8) int local8 = this.anIntArray265[local1];
				@Pc(13) Class1_Sub1_Sub1_Sub1_Sub2 local13 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local8];
				if (local13 != null) {
					this.method597(local13.aClass49_2.aByte35, local13);
				}
			}
			if (this.aByte41 != 45) {
				this.aClass23ArrayArrayArray1 = null;
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("84476, " + 45 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLclient!ZGJLFNLC;)V")
	private void method597(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub1_Sub1 arg1) {
		try {
			if (arg1.anInt620 < 128 || arg1.anInt621 < 128 || arg1.anInt620 >= 13184 || arg1.anInt621 >= 13184) {
				arg1.anInt659 = -1;
				arg1.anInt634 = -1;
				arg1.anInt645 = 0;
				arg1.anInt646 = 0;
				arg1.anInt620 = arg1.anIntArray140[0] * 128 + arg1.anInt639 * 64;
				arg1.anInt621 = arg1.anIntArray141[0] * 128 + arg1.anInt639 * 64;
				arg1.method499();
			}
			if (arg1 == aClass1_Sub1_Sub1_Sub1_Sub1_1 && (arg1.anInt620 < 1536 || arg1.anInt621 < 1536 || arg1.anInt620 >= 11776 || arg1.anInt621 >= 11776)) {
				arg1.anInt659 = -1;
				arg1.anInt634 = -1;
				arg1.anInt645 = 0;
				arg1.anInt646 = 0;
				arg1.anInt620 = arg1.anIntArray140[0] * 128 + arg1.anInt639 * 64;
				arg1.anInt621 = arg1.anIntArray141[0] * 128 + arg1.anInt639 * 64;
				arg1.method499();
			}
			if (arg1.anInt645 > anInt931) {
				this.method598(arg1);
			} else if (arg1.anInt646 >= anInt931) {
				this.method599(arg1);
			} else {
				this.method600(arg1);
			}
			this.method601(arg1);
			this.aBoolean241 &= true;
			this.method602(arg1);
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("56558, " + arg0 + ", " + true + ", " + arg1 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ZGJLFNLC;I)V")
	private void method598(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			@Pc(10) int local10 = arg0.anInt645 - anInt931;
			@Pc(20) int local20 = arg0.anInt641 * 128 + arg0.anInt639 * 64;
			@Pc(30) int local30 = arg0.anInt643 * 128 + arg0.anInt639 * 64;
			arg0.anInt620 += (local20 - arg0.anInt620) / local10;
			arg0.anInt621 += (local30 - arg0.anInt621) / local10;
			arg0.anInt640 = 0;
			if (arg0.anInt647 == 0) {
				arg0.anInt658 = 1024;
			}
			if (arg0.anInt647 == 1) {
				arg0.anInt658 = 1536;
			}
			if (arg0.anInt647 == 2) {
				arg0.anInt658 = 0;
			}
			if (arg0.anInt647 == 3) {
				arg0.anInt658 = 512;
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("66886, " + arg0 + ", " + 3 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ZGJLFNLC;B)V")
	private void method599(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			if (arg0.anInt646 == anInt931 || arg0.anInt659 == -1 || arg0.anInt662 != 0 || arg0.anInt661 + 1 > Class46.aClass46Array1[arg0.anInt659].method542(arg0.anInt660, (byte) 2)) {
				@Pc(40) int local40 = arg0.anInt646 - arg0.anInt645;
				@Pc(45) int local45 = anInt931 - arg0.anInt645;
				@Pc(55) int local55 = arg0.anInt641 * 128 + arg0.anInt639 * 64;
				@Pc(65) int local65 = arg0.anInt643 * 128 + arg0.anInt639 * 64;
				@Pc(75) int local75 = arg0.anInt642 * 128 + arg0.anInt639 * 64;
				@Pc(85) int local85 = arg0.anInt644 * 128 + arg0.anInt639 * 64;
				arg0.anInt620 = (local55 * (local40 - local45) + local75 * local45) / local40;
				arg0.anInt621 = (local65 * (local40 - local45) + local85 * local45) / local40;
			}
			arg0.anInt640 = 0;
			if (arg0.anInt647 == 0) {
				arg0.anInt658 = 1024;
			}
			if (arg0.anInt647 == 1) {
				arg0.anInt658 = 1536;
			}
			if (arg0.anInt647 == 2) {
				arg0.anInt658 = 0;
			}
			if (arg0.anInt647 == 3) {
				arg0.anInt658 = 512;
			}
			arg0.anInt622 = arg0.anInt658;
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("27691, " + arg0 + ", " + 7 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!ZGJLFNLC;)V")
	private void method600(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			arg0.anInt624 = arg0.anInt630;
			if (arg0.anInt623 == 0) {
				arg0.anInt640 = 0;
			} else {
				if (arg0.anInt659 != -1 && arg0.anInt662 == 0) {
					@Pc(31) Class46 local31 = Class46.aClass46Array1[arg0.anInt659];
					if (arg0.anInt657 > 0 && local31.anInt781 == 0) {
						arg0.anInt640++;
						return;
					}
					if (arg0.anInt657 <= 0 && local31.anInt782 == 0) {
						arg0.anInt640++;
						return;
					}
				}
				@Pc(60) int local60 = arg0.anInt620;
				@Pc(63) int local63 = arg0.anInt621;
				@Pc(78) int local78 = arg0.anIntArray140[arg0.anInt623 - 1] * 128 + arg0.anInt639 * 64;
				@Pc(93) int local93 = arg0.anIntArray141[arg0.anInt623 - 1] * 128 + arg0.anInt639 * 64;
				if (local78 - local60 <= 256 && local78 - local60 >= -256 && local93 - local63 <= 256 && local93 - local63 >= -256) {
					if (local60 < local78) {
						if (local63 < local93) {
							arg0.anInt658 = 1280;
						} else if (local63 > local93) {
							arg0.anInt658 = 1792;
						} else {
							arg0.anInt658 = 1536;
						}
					} else if (local60 > local78) {
						if (local63 < local93) {
							arg0.anInt658 = 768;
						} else if (local63 > local93) {
							arg0.anInt658 = 256;
						} else {
							arg0.anInt658 = 512;
						}
					} else if (local63 < local93) {
						arg0.anInt658 = 1024;
					} else {
						arg0.anInt658 = 0;
					}
					@Pc(187) int local187 = arg0.anInt658 - arg0.anInt622 & 0x7FF;
					if (local187 > 1024) {
						local187 -= 2048;
					}
					@Pc(194) int local194 = arg0.anInt649;
					if (local187 >= -256 && local187 <= 256) {
						local194 = arg0.anInt648;
					} else if (local187 >= 256 && local187 < 768) {
						local194 = arg0.anInt651;
					} else if (local187 >= -768 && local187 <= -256) {
						local194 = arg0.anInt650;
					}
					if (local194 == -1) {
						local194 = arg0.anInt648;
					}
					arg0.anInt624 = local194;
					@Pc(236) int local236 = 4;
					if (arg0.anInt622 != arg0.anInt658 && arg0.anInt656 == -1 && arg0.anInt633 != 0) {
						local236 = 2;
					}
					if (arg0.anInt623 > 2) {
						local236 = 6;
					}
					if (arg0.anInt623 > 3) {
						local236 = 8;
					}
					if (arg0.anInt640 > 0 && arg0.anInt623 > 1) {
						local236 = 8;
						arg0.anInt640--;
					}
					if (arg0.aBooleanArray9[arg0.anInt623 - 1]) {
						local236 <<= 0x1;
					}
					if (local236 >= 8 && arg0.anInt624 == arg0.anInt648 && arg0.anInt652 != -1) {
						arg0.anInt624 = arg0.anInt652;
					}
					if (local60 < local78) {
						arg0.anInt620 += local236;
						if (arg0.anInt620 > local78) {
							arg0.anInt620 = local78;
						}
					} else if (local60 > local78) {
						arg0.anInt620 -= local236;
						if (arg0.anInt620 < local78) {
							arg0.anInt620 = local78;
						}
					}
					if (local63 < local93) {
						arg0.anInt621 += local236;
						if (arg0.anInt621 > local93) {
							arg0.anInt621 = local93;
						}
					} else if (local63 > local93) {
						arg0.anInt621 -= local236;
						if (arg0.anInt621 < local93) {
							arg0.anInt621 = local93;
						}
					}
					if (arg0.anInt620 == local78 && arg0.anInt621 == local93) {
						arg0.anInt623--;
						if (arg0.anInt657 > 0) {
							arg0.anInt657--;
							return;
						}
					}
				} else {
					arg0.anInt620 = local78;
					arg0.anInt621 = local93;
				}
			}
		} catch (@Pc(398) RuntimeException local398) {
			signlink.reporterror("9275, " + 7 + ", " + arg0 + ", " + local398.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!ZGJLFNLC;B)V")
	private void method601(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			if (this.aByte37 != -44) {
				this.method574();
			}
			if (arg0.anInt633 != 0) {
				@Pc(33) int local33;
				@Pc(39) int local39;
				if (arg0.anInt656 != -1 && arg0.anInt656 < 32768) {
					@Pc(25) Class1_Sub1_Sub1_Sub1_Sub2 local25 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[arg0.anInt656];
					if (local25 != null) {
						local33 = arg0.anInt620 - local25.anInt620;
						local39 = arg0.anInt621 - local25.anInt621;
						if (local33 != 0 || local39 != 0) {
							arg0.anInt658 = (int) (Math.atan2((double) local33, (double) local39) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(64) int local64;
				if (arg0.anInt656 >= 32768) {
					local64 = arg0.anInt656 - 32768;
					if (local64 == this.anInt862) {
						local64 = this.anInt959;
					}
					@Pc(76) Class1_Sub1_Sub1_Sub1_Sub1 local76 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local64];
					if (local76 != null) {
						local39 = arg0.anInt620 - local76.anInt620;
						@Pc(90) int local90 = arg0.anInt621 - local76.anInt621;
						if (local39 != 0 || local90 != 0) {
							arg0.anInt658 = (int) (Math.atan2((double) local39, (double) local90) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt653 != 0 || arg0.anInt654 != 0) && (arg0.anInt623 == 0 || arg0.anInt640 > 0)) {
					local64 = arg0.anInt620 - (arg0.anInt653 - this.anInt924 - this.anInt924) * 64;
					local33 = arg0.anInt621 - (arg0.anInt654 - this.anInt925 - this.anInt925) * 64;
					if (local64 != 0 || local33 != 0) {
						arg0.anInt658 = (int) (Math.atan2((double) local64, (double) local33) * 325.949D) & 0x7FF;
					}
					arg0.anInt653 = 0;
					arg0.anInt654 = 0;
				}
				local64 = arg0.anInt658 - arg0.anInt622 & 0x7FF;
				if (local64 != 0) {
					if (local64 < arg0.anInt633 || local64 > 2048 - arg0.anInt633) {
						arg0.anInt622 = arg0.anInt658;
					} else if (local64 > 1024) {
						arg0.anInt622 -= arg0.anInt633;
					} else {
						arg0.anInt622 += arg0.anInt633;
					}
					arg0.anInt622 &= 0x7FF;
					if (arg0.anInt624 == arg0.anInt630 && arg0.anInt622 != arg0.anInt658) {
						if (arg0.anInt631 != -1) {
							arg0.anInt624 = arg0.anInt631;
							return;
						}
						arg0.anInt624 = arg0.anInt648;
						return;
					}
				}
			}
		} catch (@Pc(244) RuntimeException local244) {
			signlink.reporterror("65724, " + arg0 + ", " + -44 + ", " + local244.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!ZGJLFNLC;)V")
	private void method602(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			arg0.aBoolean159 = false;
			@Pc(18) Class46 local18;
			if (arg0.anInt624 != -1) {
				local18 = Class46.aClass46Array1[arg0.anInt624];
				arg0.anInt626++;
				if (arg0.anInt625 < local18.anInt775 && arg0.anInt626 > local18.method542(arg0.anInt625, (byte) 2)) {
					arg0.anInt626 = 0;
					arg0.anInt625++;
				}
				if (arg0.anInt625 >= local18.anInt775) {
					arg0.anInt626 = 0;
					arg0.anInt625 = 0;
				}
			}
			if (arg0.anInt634 != -1 && anInt931 >= arg0.anInt637) {
				if (arg0.anInt635 < 0) {
					arg0.anInt635 = 0;
				}
				local18 = Class38.aClass38Array1[arg0.anInt634].aClass46_2;
				arg0.anInt636++;
				while (arg0.anInt635 < local18.anInt775 && arg0.anInt636 > local18.method542(arg0.anInt635, (byte) 2)) {
					arg0.anInt636 -= local18.method542(arg0.anInt635, (byte) 2);
					arg0.anInt635++;
				}
				if (arg0.anInt635 >= local18.anInt775 && (arg0.anInt635 < 0 || arg0.anInt635 >= local18.anInt775)) {
					arg0.anInt634 = -1;
				}
			}
			if (arg0.anInt659 != -1 && arg0.anInt662 <= 1) {
				local18 = Class46.aClass46Array1[arg0.anInt659];
				if (local18.anInt781 == 1 && arg0.anInt657 > 0 && arg0.anInt645 <= anInt931 && arg0.anInt646 < anInt931) {
					arg0.anInt662 = 1;
					return;
				}
			}
			if (arg0.anInt659 != -1 && arg0.anInt662 == 0) {
				local18 = Class46.aClass46Array1[arg0.anInt659];
				arg0.anInt661++;
				while (arg0.anInt660 < local18.anInt775 && arg0.anInt661 > local18.method542(arg0.anInt660, (byte) 2)) {
					arg0.anInt661 -= local18.method542(arg0.anInt660, (byte) 2);
					arg0.anInt660++;
				}
				if (arg0.anInt660 >= local18.anInt775) {
					arg0.anInt660 -= local18.anInt776;
					arg0.anInt663++;
					if (arg0.anInt663 >= local18.anInt780) {
						arg0.anInt659 = -1;
					}
					if (arg0.anInt660 < 0 || arg0.anInt660 >= local18.anInt775) {
						arg0.anInt659 = -1;
					}
				}
				arg0.aBoolean159 = local18.aBoolean198;
			}
			if (arg0.anInt662 > 0) {
				arg0.anInt662--;
			}
		} catch (@Pc(263) RuntimeException local263) {
			signlink.reporterror("74981, " + false + ", " + arg0 + ", " + local263.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method603() {
		try {
			if (this.aBoolean256) {
				this.aBoolean256 = false;
				this.aClass36_3.method504((byte) 9, 4, 0, super.aGraphics2);
				this.aClass36_4.method504((byte) 9, 357, 0, super.aGraphics2);
				this.aClass36_5.method504((byte) 9, 4, 722, super.aGraphics2);
				this.aClass36_6.method504((byte) 9, 205, 743, super.aGraphics2);
				this.aClass36_7.method504((byte) 9, 0, 0, super.aGraphics2);
				this.aClass36_8.method504((byte) 9, 4, 516, super.aGraphics2);
				this.aClass36_9.method504((byte) 9, 205, 516, super.aGraphics2);
				this.aClass36_10.method504((byte) 9, 357, 496, super.aGraphics2);
				this.aClass36_11.method504((byte) 9, 338, 0, super.aGraphics2);
				this.aBoolean227 = true;
				this.aBoolean236 = true;
				this.aBoolean223 = true;
				this.aBoolean218 = true;
				if (this.anInt1025 != 2) {
					this.aClass36_14.method504((byte) 9, 4, 4, super.aGraphics2);
					this.aClass36_13.method504((byte) 9, 4, 550, super.aGraphics2);
				}
			}
			if (this.anInt1025 == 2) {
				this.method693(this.anInt1016);
			}
			if (this.aBoolean244 && this.anInt977 == 1) {
				this.aBoolean227 = true;
			}
			@Pc(145) boolean local145;
			if (this.anInt889 != -1) {
				local145 = this.method591(this.anInt889, this.anInt1020);
				if (local145) {
					this.aBoolean227 = true;
				}
			}
			if (this.anInt991 == 2) {
				this.aBoolean227 = true;
			}
			if (this.anInt919 == 2) {
				this.aBoolean227 = true;
			}
			if (this.aBoolean227) {
				this.method660((byte) 5);
				this.aBoolean227 = false;
			}
			if (this.anInt885 == -1) {
				this.aClass39_1.anInt712 = this.anInt923 - this.anInt939 - 77;
				if (super.anInt834 > 448 && super.anInt834 < 560 && super.anInt835 > 332) {
					this.method686(super.anInt834 - 17, 0, super.anInt835 - 357, 463, 77, this.aClass39_1, false, this.anInt923);
				}
				@Pc(227) int local227 = this.anInt923 - this.aClass39_1.anInt712 - 77;
				if (local227 < 0) {
					local227 = 0;
				}
				if (local227 > this.anInt923 - 77) {
					local227 = this.anInt923 - 77;
				}
				if (this.anInt939 != local227) {
					this.anInt939 = local227;
					this.aBoolean236 = true;
				}
			}
			if (this.anInt885 != -1) {
				local145 = this.method591(this.anInt885, this.anInt1020);
				if (local145) {
					this.aBoolean236 = true;
				}
			}
			if (this.anInt991 == 3) {
				this.aBoolean236 = true;
			}
			if (this.anInt919 == 3) {
				this.aBoolean236 = true;
			}
			if (this.aString19 != null) {
				this.aBoolean236 = true;
			}
			if (this.aBoolean244 && this.anInt977 == 2) {
				this.aBoolean236 = true;
			}
			if (this.aBoolean236) {
				this.method708((byte) 5);
				this.aBoolean236 = false;
			}
			if (this.anInt1025 == 2) {
				this.method657();
				this.aClass36_13.method504((byte) 9, 4, 550, super.aGraphics2);
			}
			if (this.anInt1042 != -1) {
				this.aBoolean223 = true;
			}
			if (this.aBoolean223) {
				if (this.anInt1042 != -1 && this.anInt1042 == this.anInt992) {
					this.anInt1042 = -1;
					this.aClass1_Sub1_Sub3_6.method348(37);
					this.aClass1_Sub1_Sub3_6.method349(this.anInt992);
				}
				this.aBoolean223 = false;
				this.aClass36_18.method503();
				this.aClass1_Sub1_Sub2_Sub4_11.method417(448, 0, 0);
				if (this.anInt889 == -1) {
					if (this.anIntArray255[this.anInt992] != -1) {
						if (this.anInt992 == 0) {
							this.aClass1_Sub1_Sub2_Sub4_4.method417(448, 10, 22);
						}
						if (this.anInt992 == 1) {
							this.aClass1_Sub1_Sub2_Sub4_5.method417(448, 8, 54);
						}
						if (this.anInt992 == 2) {
							this.aClass1_Sub1_Sub2_Sub4_5.method417(448, 8, 82);
						}
						if (this.anInt992 == 3) {
							this.aClass1_Sub1_Sub2_Sub4_6.method417(448, 8, 110);
						}
						if (this.anInt992 == 4) {
							this.aClass1_Sub1_Sub2_Sub4_8.method417(448, 8, 153);
						}
						if (this.anInt992 == 5) {
							this.aClass1_Sub1_Sub2_Sub4_8.method417(448, 8, 181);
						}
						if (this.anInt992 == 6) {
							this.aClass1_Sub1_Sub2_Sub4_7.method417(448, 9, 209);
						}
					}
					if (this.anIntArray255[0] != -1 && (this.anInt1042 != 0 || anInt931 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub4Array2[0].method417(448, 13, 29);
					}
					if (this.anIntArray255[1] != -1 && (this.anInt1042 != 1 || anInt931 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub4Array2[1].method417(448, 11, 53);
					}
					if (this.anIntArray255[2] != -1 && (this.anInt1042 != 2 || anInt931 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub4Array2[2].method417(448, 11, 82);
					}
					if (this.anIntArray255[3] != -1 && (this.anInt1042 != 3 || anInt931 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub4Array2[3].method417(448, 12, 115);
					}
					if (this.anIntArray255[4] != -1 && (this.anInt1042 != 4 || anInt931 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub4Array2[4].method417(448, 13, 153);
					}
					if (this.anIntArray255[5] != -1 && (this.anInt1042 != 5 || anInt931 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub4Array2[5].method417(448, 11, 180);
					}
					if (this.anIntArray255[6] != -1 && (this.anInt1042 != 6 || anInt931 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub4Array2[6].method417(448, 13, 208);
					}
				}
				this.aClass36_18.method504((byte) 9, 160, 516, super.aGraphics2);
				anInt1041++;
				if (anInt1041 > 88) {
					anInt1041 = 0;
					this.aClass1_Sub1_Sub3_6.method348(222);
				}
				this.aClass36_17.method503();
				this.aClass1_Sub1_Sub2_Sub4_10.method417(448, 0, 0);
				if (this.anInt889 == -1) {
					if (this.anIntArray255[this.anInt992] != -1) {
						if (this.anInt992 == 7) {
							this.aClass1_Sub1_Sub2_Sub4_12.method417(448, 0, 42);
						}
						if (this.anInt992 == 8) {
							this.aClass1_Sub1_Sub2_Sub4_13.method417(448, 0, 74);
						}
						if (this.anInt992 == 9) {
							this.aClass1_Sub1_Sub2_Sub4_13.method417(448, 0, 102);
						}
						if (this.anInt992 == 10) {
							this.aClass1_Sub1_Sub2_Sub4_14.method417(448, 1, 130);
						}
						if (this.anInt992 == 11) {
							this.aClass1_Sub1_Sub2_Sub4_16.method417(448, 0, 173);
						}
						if (this.anInt992 == 12) {
							this.aClass1_Sub1_Sub2_Sub4_16.method417(448, 0, 201);
						}
						if (this.anInt992 == 13) {
							this.aClass1_Sub1_Sub2_Sub4_15.method417(448, 0, 229);
						}
					}
					if (this.anIntArray255[8] != -1 && (this.anInt1042 != 8 || anInt931 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub4Array2[7].method417(448, 2, 74);
					}
					if (this.anIntArray255[9] != -1 && (this.anInt1042 != 9 || anInt931 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub4Array2[8].method417(448, 3, 102);
					}
					if (this.anIntArray255[10] != -1 && (this.anInt1042 != 10 || anInt931 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub4Array2[9].method417(448, 4, 137);
					}
					if (this.anIntArray255[11] != -1 && (this.anInt1042 != 11 || anInt931 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub4Array2[10].method417(448, 2, 174);
					}
					if (this.anIntArray255[12] != -1 && (this.anInt1042 != 12 || anInt931 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub4Array2[11].method417(448, 2, 201);
					}
					if (this.anIntArray255[13] != -1 && (this.anInt1042 != 13 || anInt931 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub4Array2[12].method417(448, 2, 226);
					}
				}
				this.aClass36_17.method504((byte) 9, 466, 496, super.aGraphics2);
				this.aClass36_14.method503();
			}
			if (this.aBoolean218) {
				this.aBoolean218 = false;
				this.aClass36_16.method503();
				this.aClass1_Sub1_Sub2_Sub4_9.method417(448, 0, 0);
				this.aClass1_Sub1_Sub2_Sub2_3.method180(55, 28, 16777215, "Public chat", true);
				if (this.anInt859 == 0) {
					this.aClass1_Sub1_Sub2_Sub2_3.method180(55, 41, 65280, "On", true);
				}
				if (this.anInt859 == 1) {
					this.aClass1_Sub1_Sub2_Sub2_3.method180(55, 41, 16776960, "Friends", true);
				}
				if (this.anInt859 == 2) {
					this.aClass1_Sub1_Sub2_Sub2_3.method180(55, 41, 16711680, "Off", true);
				}
				if (this.anInt859 == 3) {
					this.aClass1_Sub1_Sub2_Sub2_3.method180(55, 41, 65535, "Hide", true);
				}
				this.aClass1_Sub1_Sub2_Sub2_3.method180(184, 28, 16777215, "Private chat", true);
				if (this.anInt1021 == 0) {
					this.aClass1_Sub1_Sub2_Sub2_3.method180(184, 41, 65280, "On", true);
				}
				if (this.anInt1021 == 1) {
					this.aClass1_Sub1_Sub2_Sub2_3.method180(184, 41, 16776960, "Friends", true);
				}
				if (this.anInt1021 == 2) {
					this.aClass1_Sub1_Sub2_Sub2_3.method180(184, 41, 16711680, "Off", true);
				}
				this.aClass1_Sub1_Sub2_Sub2_3.method180(324, 28, 16777215, "Trade/compete", true);
				if (this.anInt1054 == 0) {
					this.aClass1_Sub1_Sub2_Sub2_3.method180(324, 41, 65280, "On", true);
				}
				if (this.anInt1054 == 1) {
					this.aClass1_Sub1_Sub2_Sub2_3.method180(324, 41, 16776960, "Friends", true);
				}
				if (this.anInt1054 == 2) {
					this.aClass1_Sub1_Sub2_Sub2_3.method180(324, 41, 16711680, "Off", true);
				}
				this.aClass1_Sub1_Sub2_Sub2_3.method180(458, 33, 16777215, "Report abuse", true);
				this.aClass36_16.method504((byte) 9, 453, 0, super.aGraphics2);
				this.aClass36_14.method503();
			}
			this.anInt1020 = 0;
		} catch (@Pc(1067) RuntimeException local1067) {
			signlink.reporterror("11088, " + 49857 + ", " + local1067.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
	private void method604(@OriginalArg(1) int arg0) {
		try {
			if (!aBoolean253) {
				@Pc(22) Class1_Sub1_Sub2_Sub4 local22;
				@Pc(30) int local30;
				@Pc(38) int local38;
				@Pc(41) byte[] local41;
				@Pc(44) byte[] local44;
				@Pc(46) int local46;
				if (Class1_Sub1_Sub2_Sub3.anIntArray57[17] >= arg0) {
					local22 = Class1_Sub1_Sub2_Sub3.aClass1_Sub1_Sub2_Sub4Array1[17];
					local30 = local22.anInt465 * local22.anInt466 - 1;
					local38 = local22.anInt465 * this.anInt1020 * 2;
					local41 = local22.aByteArray7;
					local44 = this.aByteArray21;
					for (local46 = 0; local46 <= local30; local46++) {
						local44[local46] = local41[local46 - local38 & local30];
					}
					local22.aByteArray7 = local44;
					this.aByteArray21 = local41;
					Class1_Sub1_Sub2_Sub3.method249(17);
				}
				if (Class1_Sub1_Sub2_Sub3.anIntArray57[24] >= arg0) {
					local22 = Class1_Sub1_Sub2_Sub3.aClass1_Sub1_Sub2_Sub4Array1[24];
					local30 = local22.anInt465 * local22.anInt466 - 1;
					local38 = local22.anInt465 * this.anInt1020 * 2;
					local41 = local22.aByteArray7;
					local44 = this.aByteArray21;
					for (local46 = 0; local46 <= local30; local46++) {
						local44[local46] = local41[local46 - local38 & local30];
					}
					local22.aByteArray7 = local44;
					this.aByteArray21 = local41;
					Class1_Sub1_Sub2_Sub3.method249(24);
				}
				if (Class1_Sub1_Sub2_Sub3.anIntArray57[34] >= arg0) {
					local22 = Class1_Sub1_Sub2_Sub3.aClass1_Sub1_Sub2_Sub4Array1[34];
					local30 = local22.anInt465 * local22.anInt466 - 1;
					local38 = local22.anInt465 * this.anInt1020 * 2;
					local41 = local22.aByteArray7;
					local44 = this.aByteArray21;
					for (local46 = 0; local46 <= local30; local46++) {
						local44[local46] = local41[local46 - local38 & local30];
					}
					local22.aByteArray7 = local44;
					this.aByteArray21 = local41;
					Class1_Sub1_Sub2_Sub3.method249(34);
					return;
				}
			}
		} catch (@Pc(189) RuntimeException local189) {
			signlink.reporterror("40712, " + false + ", " + arg0 + ", " + local189.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(III)V")
	private void method605(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(1) int local1 = 0;
			this.anInt1031 += 0;
			for (@Pc(9) int local9 = 0; local9 < 100; local9++) {
				if (this.aStringArray13[local9] != null) {
					@Pc(21) int local21 = this.anIntArray238[local9];
					@Pc(32) int local32 = this.anInt939 + 70 + 4 - local1 * 14;
					if (local32 < -20) {
						break;
					}
					@Pc(40) String local40 = this.aStringArray12[local9];
					if (local40 != null && local40.startsWith("@cr1@")) {
						local40 = local40.substring(5);
					}
					if (local40 != null && local40.startsWith("@cr2@")) {
						local40 = local40.substring(5);
					}
					if (local21 == 0) {
						local1++;
					}
					if ((local21 == 1 || local21 == 2) && (local21 == 1 || this.anInt859 == 0 || this.anInt859 == 1 && this.method606(local40, this.aBoolean234))) {
						if (arg1 > local32 - 14 && arg1 <= local32 && !local40.equals(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3)) {
							if (this.anInt894 >= 1) {
								this.aStringArray9[this.anInt1019] = "Report abuse @whi@" + local40;
								this.anIntArray252[this.anInt1019] = 200;
								this.anInt1019++;
							}
							this.aStringArray9[this.anInt1019] = "Add ignore @whi@" + local40;
							this.anIntArray252[this.anInt1019] = 76;
							this.anInt1019++;
							this.aStringArray9[this.anInt1019] = "Add friend @whi@" + local40;
							this.anIntArray252[this.anInt1019] = 394;
							this.anInt1019++;
						}
						local1++;
					}
					if ((local21 == 3 || local21 == 7) && this.anInt1061 == 0 && (local21 == 7 || this.anInt1021 == 0 || this.anInt1021 == 1 && this.method606(local40, this.aBoolean234))) {
						if (arg1 > local32 - 14 && arg1 <= local32) {
							if (this.anInt894 >= 1) {
								this.aStringArray9[this.anInt1019] = "Report abuse @whi@" + local40;
								this.anIntArray252[this.anInt1019] = 200;
								this.anInt1019++;
							}
							this.aStringArray9[this.anInt1019] = "Add ignore @whi@" + local40;
							this.anIntArray252[this.anInt1019] = 76;
							this.anInt1019++;
							this.aStringArray9[this.anInt1019] = "Add friend @whi@" + local40;
							this.anIntArray252[this.anInt1019] = 394;
							this.anInt1019++;
						}
						local1++;
					}
					if (local21 == 4 && (this.anInt1054 == 0 || this.anInt1054 == 1 && this.method606(local40, this.aBoolean234))) {
						if (arg1 > local32 - 14 && arg1 <= local32) {
							this.aStringArray9[this.anInt1019] = "Accept trade @whi@" + local40;
							this.anIntArray252[this.anInt1019] = 762;
							this.anInt1019++;
						}
						local1++;
					}
					if ((local21 == 5 || local21 == 6) && this.anInt1061 == 0 && this.anInt1021 < 2) {
						local1++;
					}
					if (local21 == 8 && (this.anInt1054 == 0 || this.anInt1054 == 1 && this.method606(local40, this.aBoolean234))) {
						if (arg1 > local32 - 14 && arg1 <= local32) {
							this.aStringArray9[this.anInt1019] = "Accept challenge @whi@" + local40;
							this.anIntArray252[this.anInt1019] = 680;
							this.anInt1019++;
						}
						local1++;
					}
				}
			}
		} catch (@Pc(409) RuntimeException local409) {
			signlink.reporterror("21920, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local409.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	private boolean method606(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(5) int local5 = 0; local5 < this.anInt1037; local5++) {
				if (arg0.equalsIgnoreCase(this.aStringArray10[local5])) {
					return true;
				}
			}
			this.aBoolean241 &= arg1;
			return arg0.equalsIgnoreCase(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("82702, " + arg0 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method576() {
		try {
			signlink.reporterror = false;
			try {
				if (this.aClass9_1 != null) {
					this.aClass9_1.method139();
				}
			} catch (@Pc(11) Exception local11) {
			}
			this.aClass9_1 = null;
			this.method594();
			if (this.aClass20_1 != null) {
				this.aClass20_1.aBoolean108 = false;
			}
			this.aClass20_1 = null;
			this.aClass16_Sub1_1.method212();
			this.aClass16_Sub1_1 = null;
			this.aClass1_Sub1_Sub3_8 = null;
			this.aClass1_Sub1_Sub3_6 = null;
			this.aClass1_Sub1_Sub3_9 = null;
			this.aClass1_Sub1_Sub3_7 = null;
			this.anIntArray256 = null;
			this.aByteArrayArray4 = null;
			this.aByteArrayArray5 = null;
			this.anIntArray257 = null;
			this.anIntArray258 = null;
			this.anIntArrayArrayArray8 = null;
			this.aByteArrayArrayArray8 = null;
			this.aClass5_1 = null;
			this.aClass14Array1 = null;
			this.anIntArrayArray25 = null;
			this.anIntArrayArray24 = null;
			this.anIntArray259 = null;
			this.anIntArray260 = null;
			this.aByteArray21 = null;
			this.aClass36_12 = null;
			this.aClass36_13 = null;
			this.aClass36_14 = null;
			this.aClass36_15 = null;
			this.aClass36_16 = null;
			this.aClass36_17 = null;
			this.aClass36_18 = null;
			this.aClass36_3 = null;
			this.aClass36_4 = null;
			this.aClass36_5 = null;
			this.aClass36_6 = null;
			this.aClass36_7 = null;
			this.aClass36_8 = null;
			this.aClass36_9 = null;
			this.aClass36_10 = null;
			this.aClass36_11 = null;
			this.aClass1_Sub1_Sub2_Sub4_1 = null;
			this.aClass1_Sub1_Sub2_Sub4_2 = null;
			this.aClass1_Sub1_Sub2_Sub4_3 = null;
			this.aClass1_Sub1_Sub2_Sub4_9 = null;
			this.aClass1_Sub1_Sub2_Sub4_10 = null;
			this.aClass1_Sub1_Sub2_Sub4_11 = null;
			this.aClass1_Sub1_Sub2_Sub4Array2 = null;
			this.aClass1_Sub1_Sub2_Sub4_4 = null;
			this.aClass1_Sub1_Sub2_Sub4_5 = null;
			this.aClass1_Sub1_Sub2_Sub4_6 = null;
			this.aClass1_Sub1_Sub2_Sub4_7 = null;
			this.aClass1_Sub1_Sub2_Sub4_8 = null;
			this.aClass1_Sub1_Sub2_Sub4_12 = null;
			this.aClass1_Sub1_Sub2_Sub4_13 = null;
			this.aClass1_Sub1_Sub2_Sub4_14 = null;
			this.aClass1_Sub1_Sub2_Sub4_15 = null;
			this.aClass1_Sub1_Sub2_Sub4_16 = null;
			this.aClass1_Sub1_Sub2_Sub1_7 = null;
			this.aClass1_Sub1_Sub2_Sub1Array4 = null;
			this.aClass1_Sub1_Sub2_Sub1Array8 = null;
			this.aClass1_Sub1_Sub2_Sub1Array6 = null;
			this.aClass1_Sub1_Sub2_Sub1_12 = null;
			this.aClass1_Sub1_Sub2_Sub1_13 = null;
			this.aClass1_Sub1_Sub2_Sub1_14 = null;
			this.aClass1_Sub1_Sub2_Sub1_15 = null;
			this.aClass1_Sub1_Sub2_Sub1_16 = null;
			this.aClass1_Sub1_Sub2_Sub4Array4 = null;
			this.aClass1_Sub1_Sub2_Sub1Array5 = null;
			this.anIntArrayArray22 = null;
			this.aClass1_Sub1_Sub1_Sub1_Sub1Array1 = null;
			this.anIntArray246 = null;
			this.anIntArray247 = null;
			this.aClass1_Sub1_Sub3Array1 = null;
			this.anIntArray261 = null;
			this.aClass1_Sub1_Sub1_Sub1_Sub2Array1 = null;
			this.anIntArray265 = null;
			this.aClass23ArrayArrayArray1 = null;
			this.aClass23_10 = null;
			this.aClass23_12 = null;
			this.aClass23_11 = null;
			this.anIntArray250 = null;
			this.anIntArray251 = null;
			this.anIntArray252 = null;
			this.anIntArray253 = null;
			this.aStringArray9 = null;
			this.anIntArray267 = null;
			this.anIntArray242 = null;
			this.anIntArray243 = null;
			this.aClass1_Sub1_Sub2_Sub1Array7 = null;
			this.aClass1_Sub1_Sub2_Sub1_9 = null;
			this.aStringArray10 = null;
			this.aLongArray4 = null;
			this.anIntArray216 = null;
			this.aClass36_22 = null;
			this.aClass36_23 = null;
			this.aClass36_19 = null;
			this.aClass36_20 = null;
			this.aClass36_21 = null;
			this.aClass36_24 = null;
			this.aClass36_25 = null;
			this.aClass36_26 = null;
			this.aClass36_27 = null;
			this.method698();
			Class40.method527();
			Class49.method568();
			Class21.method339();
			Class43.aClass43Array1 = null;
			Class47.aClass47Array1 = null;
			Class39.aClass39Array1 = null;
			Class44.aClass44Array1 = null;
			Class46.aClass46Array1 = null;
			Class38.aClass38Array1 = null;
			Class38.aClass4_4 = null;
			Class10.aClass10Array1 = null;
			super.aClass36_2 = null;
			Class1_Sub1_Sub1_Sub1_Sub1.aClass4_1 = null;
			Class1_Sub1_Sub2_Sub3.method242();
			Class5.method41();
			Class1_Sub1_Sub1_Sub4.method266();
			Class37.method508();
			System.gc();
		} catch (@Pc(373) RuntimeException local373) {
			signlink.reporterror("87712, " + 1 + ", " + local373.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method607(@OriginalArg(0) byte arg0) {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray226[local5 + 32512] = 255;
				}
			}
			@Pc(41) int local41;
			@Pc(48) int local48;
			@Pc(54) int local54;
			for (local12 = 0; local12 < 100; local12++) {
				local41 = (int) (Math.random() * 124.0D) + 2;
				local48 = (int) (Math.random() * 128.0D) + 128;
				local54 = local41 + (local48 << 7);
				this.anIntArray226[local54] = 192;
			}
			for (local41 = 1; local41 < 255; local41++) {
				for (local48 = 1; local48 < 127; local48++) {
					local54 = local48 + (local41 << 7);
					this.anIntArray227[local54] = (this.anIntArray226[local54 - 1] + this.anIntArray226[local54 + 1] + this.anIntArray226[local54 - 128] + this.anIntArray226[local54 + 128]) / 4;
				}
			}
			this.anInt898 += 128;
			if (this.anInt898 > this.anIntArray271.length) {
				this.anInt898 -= this.anIntArray271.length;
				local48 = (int) (Math.random() * 12.0D);
				this.method690(this.aClass1_Sub1_Sub2_Sub4Array5[local48]);
			}
			@Pc(166) int local166;
			for (local48 = 1; local48 < 255; local48++) {
				for (local54 = 1; local54 < 127; local54++) {
					local166 = local54 + (local48 << 7);
					@Pc(189) int local189 = this.anIntArray227[local166 + 128] - this.anIntArray271[local166 + this.anInt898 & this.anIntArray271.length - 1] / 5;
					if (local189 < 0) {
						local189 = 0;
					}
					this.anIntArray226[local166] = local189;
				}
			}
			@Pc(213) boolean local213 = false;
			for (local54 = 0; local54 < 255; local54++) {
				this.anIntArray249[local54] = this.anIntArray249[local54 + 1];
			}
			this.anIntArray249[255] = (int) (Math.sin((double) anInt931 / 14.0D) * 16.0D + Math.sin((double) anInt931 / 15.0D) * 14.0D + Math.sin((double) anInt931 / 16.0D) * 12.0D);
			if (this.anInt986 > 0) {
				this.anInt986 -= 4;
			}
			if (this.anInt987 > 0) {
				this.anInt987 -= 4;
			}
			if (this.anInt986 == 0 && this.anInt987 == 0) {
				local166 = (int) (Math.random() * 2000.0D);
				if (local166 == 0) {
					this.anInt986 = 1024;
				}
				if (local166 == 1) {
					this.anInt987 = 1024;
					return;
				}
			}
		} catch (@Pc(309) RuntimeException local309) {
			signlink.reporterror("18517, " + arg0 + ", " + local309.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			this.aClass1_Sub1_Sub2_Sub4_19.method417(448, arg5, arg3);
			this.aClass1_Sub1_Sub2_Sub4_20.method417(448, arg5 + arg4 - 16, arg3);
			Class1_Sub1_Sub2.method405(this.anInt950, 16, arg3, arg5 + 16, arg4 - 32);
			@Pc(35) int local35 = (arg4 - 32) * arg4 / arg1;
			if (local35 < 8) {
				local35 = 8;
			}
			@Pc(52) int local52 = (arg4 - local35 - 32) * arg2 / (arg1 - arg4);
			Class1_Sub1_Sub2.method405(this.anInt937, 16, arg3, arg5 + local52 + 16, local35);
			Class1_Sub1_Sub2.method410(this.anInt873, local35, arg3, arg5 + local52 + 16);
			Class1_Sub1_Sub2.method410(this.anInt873, local35, arg3 + 1, arg5 + 16 + local52);
			Class1_Sub1_Sub2.method408(arg5 + local52 + 16, arg3, this.anInt873, 16);
			Class1_Sub1_Sub2.method408(arg5 + local52 + 17, arg3, this.anInt873, 16);
			Class1_Sub1_Sub2.method410(this.anInt1007, local35, arg3 + 15, arg5 + 16 + local52);
			Class1_Sub1_Sub2.method410(this.anInt1007, local35 - 1, arg3 + 14, arg5 + local52 + 17);
			@Pc(142) boolean local142 = false;
			Class1_Sub1_Sub2.method408(arg5 + local52 + local35 + 15, arg3, this.anInt1007, 16);
			Class1_Sub1_Sub2.method408(arg5 + local52 + local35 + 14, arg3 + 1, this.anInt1007, 15);
		} catch (@Pc(172) RuntimeException local172) {
			signlink.reporterror("82130, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local172.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BZI)V")
	private void method609(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		try {
			signlink.anInt1072 = arg1;
			if (arg0) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("42811, " + 5 + ", " + arg0 + ", " + arg1 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method610() {
		try {
			if (this.anInt867 > 1) {
				this.anInt867--;
			}
			if (this.anInt1035 > 0) {
				this.anInt1035--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method681(); local22++) {
			}
			if (this.aBoolean241) {
				@Pc(41) Object local41 = this.aClass20_1.anObject1;
				@Pc(66) int local66;
				@Pc(68) int local68;
				@Pc(70) int local70;
				@Pc(103) int local103;
				synchronized (this.aClass20_1.anObject1) {
					if (!aBoolean231) {
						this.aClass20_1.anInt395 = 0;
					} else if (super.anInt839 != 0 || this.aClass20_1.anInt395 >= 40) {
						this.aClass1_Sub1_Sub3_6.method348(129);
						this.aClass1_Sub1_Sub3_6.method349(0);
						local66 = this.aClass1_Sub1_Sub3_6.anInt443;
						local68 = 0;
						@Pc(86) int local86;
						for (local70 = 0; local70 < this.aClass20_1.anInt395 && local66 - this.aClass1_Sub1_Sub3_6.anInt443 < 240; local70++) {
							local68++;
							local86 = this.aClass20_1.anIntArray112[local70];
							if (local86 < 0) {
								local86 = 0;
							} else if (local86 > 502) {
								local86 = 502;
							}
							local103 = this.aClass20_1.anIntArray111[local70];
							if (local103 < 0) {
								local103 = 0;
							} else if (local103 > 764) {
								local103 = 764;
							}
							@Pc(120) int local120 = local86 * 765 + local103;
							if (this.aClass20_1.anIntArray112[local70] == -1 && this.aClass20_1.anIntArray111[local70] == -1) {
								local103 = -1;
								local86 = -1;
								local120 = 524287;
							}
							if (local103 != this.anInt891 || local86 != this.anInt892) {
								@Pc(165) int local165 = local103 - this.anInt891;
								this.anInt891 = local103;
								@Pc(173) int local173 = local86 - this.anInt892;
								this.anInt892 = local86;
								if (this.anInt1029 < 8 && local165 >= -32 && local165 <= 31 && local173 >= -32 && local173 <= 31) {
									local165 += 32;
									local173 += 32;
									this.aClass1_Sub1_Sub3_6.method350((this.anInt1029 << 12) + (local165 << 6) + local173);
									this.anInt1029 = 0;
								} else if (this.anInt1029 < 8) {
									this.aClass1_Sub1_Sub3_6.method352((this.anInt1029 << 19) + local120 + 8388608);
									this.anInt1029 = 0;
								} else {
									this.aClass1_Sub1_Sub3_6.method353((this.anInt1029 << 19) + local120 - 1073741824);
									this.anInt1029 = 0;
								}
							} else if (this.anInt1029 < 2047) {
								this.anInt1029++;
							}
						}
						this.aClass1_Sub1_Sub3_6.method358(this.aBoolean245, this.aClass1_Sub1_Sub3_6.anInt443 - local66);
						if (local68 >= this.aClass20_1.anInt395) {
							this.aClass20_1.anInt395 = 0;
						} else {
							this.aClass20_1.anInt395 -= local68;
							for (local86 = 0; local86 < this.aClass20_1.anInt395; local86++) {
								this.aClass20_1.anIntArray111[local86] = this.aClass20_1.anIntArray111[local86 + local68];
								this.aClass20_1.anIntArray112[local86] = this.aClass20_1.anIntArray112[local86 + local68];
							}
						}
					}
				}
				if (super.anInt839 != 0) {
					@Pc(337) long local337 = (super.aLong28 - this.aLong30) / 50L;
					if (local337 > 4095L) {
						local337 = 4095L;
					}
					this.aLong30 = super.aLong28;
					local66 = super.anInt841;
					if (local66 < 0) {
						local66 = 0;
					} else if (local66 > 502) {
						local66 = 502;
					}
					local68 = super.anInt840;
					if (local68 < 0) {
						local68 = 0;
					} else if (local68 > 764) {
						local68 = 764;
					}
					local70 = local66 * 765 + local68;
					@Pc(383) byte local383 = 0;
					if (super.anInt839 == 2) {
						local383 = 1;
					}
					local103 = (int) local337;
					this.aClass1_Sub1_Sub3_6.method348(96);
					this.aClass1_Sub1_Sub3_6.method353((local103 << 20) + (local383 << 19) + local70);
				}
				if (this.anInt996 > 0) {
					this.anInt996--;
				}
				if (super.anIntArray210[1] == 1 || super.anIntArray210[2] == 1 || super.anIntArray210[3] == 1 || super.anIntArray210[4] == 1) {
					this.aBoolean247 = true;
				}
				if (this.aBoolean247 && this.anInt996 <= 0) {
					this.anInt996 = 20;
					this.aBoolean247 = false;
					this.aClass1_Sub1_Sub3_6.method348(35);
					this.aClass1_Sub1_Sub3_6.method350(this.anInt864);
					this.aClass1_Sub1_Sub3_6.method350(this.anInt863);
				}
				if (super.aBoolean213 && !this.aBoolean254) {
					this.aBoolean254 = true;
					this.aClass1_Sub1_Sub3_6.method348(103);
					this.aClass1_Sub1_Sub3_6.method349(1);
				}
				if (!super.aBoolean213 && this.aBoolean254) {
					this.aBoolean254 = false;
					this.aClass1_Sub1_Sub3_6.method348(103);
					this.aClass1_Sub1_Sub3_6.method349(0);
				}
				this.method617();
				this.method622();
				this.method682((byte) 5);
				anInt984++;
				@Pc(543) int local543;
				if (anInt984 > 1607) {
					anInt984 = 0;
					this.aClass1_Sub1_Sub3_6.method348(155);
					this.aClass1_Sub1_Sub3_6.method349(0);
					local543 = this.aClass1_Sub1_Sub3_6.anInt443;
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub3_6.method350(29516);
					}
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub3_6.method349(34);
					}
					this.aClass1_Sub1_Sub3_6.method350((int) (Math.random() * 65536.0D));
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub3_6.method349(192);
					}
					this.aClass1_Sub1_Sub3_6.method349(228);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub3_6.method350(16924);
					}
					this.aClass1_Sub1_Sub3_6.method349(78);
					this.aClass1_Sub1_Sub3_6.method349((int) (Math.random() * 256.0D));
					this.aClass1_Sub1_Sub3_6.method349(88);
					this.aClass1_Sub1_Sub3_6.method350(38427);
					this.aClass1_Sub1_Sub3_6.method358(this.aBoolean245, this.aClass1_Sub1_Sub3_6.anInt443 - local543);
				}
				this.anInt1033++;
				if (this.anInt1033 > 750) {
					this.method584();
				}
				this.method653();
				this.method596();
				this.method619();
				this.anInt1020++;
				if (this.anInt848 != 0) {
					this.anInt847 += 20;
					if (this.anInt847 >= 400) {
						this.anInt848 = 0;
					}
				}
				if (this.anInt991 != 0) {
					this.anInt988++;
					if (this.anInt988 >= 15) {
						if (this.anInt991 == 2) {
							this.aBoolean227 = true;
						}
						if (this.anInt991 == 3) {
							this.aBoolean236 = true;
						}
						this.anInt991 = 0;
					}
				}
				if (this.anInt919 != 0) {
					this.anInt940++;
					if (super.anInt834 > this.anInt920 + 5 || super.anInt834 < this.anInt920 - 5 || super.anInt835 > this.anInt921 + 5 || super.anInt835 < this.anInt921 - 5) {
						this.aBoolean239 = true;
					}
					if (super.anInt833 == 0) {
						if (this.anInt919 == 2) {
							this.aBoolean227 = true;
						}
						if (this.anInt919 == 3) {
							this.aBoolean236 = true;
						}
						this.anInt919 = 0;
						if (this.aBoolean239 && this.anInt940 >= 5) {
							this.anInt1044 = -1;
							this.method659();
							if (this.anInt1044 == this.anInt917 && this.anInt1043 != this.anInt918) {
								@Pc(781) Class39 local781 = Class39.aClass39Array1[this.anInt917];
								@Pc(783) byte local783 = 0;
								if (this.anInt1063 == 1 && local781.anInt701 == 206) {
									local783 = 1;
								}
								if (local781.anIntArray152[this.anInt1043] <= 0) {
									local783 = 0;
								}
								if (local781.aBoolean163) {
									local66 = this.anInt918;
									local68 = this.anInt1043;
									local781.anIntArray152[local68] = local781.anIntArray152[local66];
									local781.anIntArray157[local68] = local781.anIntArray157[local66];
									local781.anIntArray152[local66] = -1;
									local781.anIntArray157[local66] = 0;
								} else if (local783 == 1) {
									local66 = this.anInt918;
									local68 = this.anInt1043;
									while (local66 != local68) {
										if (local66 > local68) {
											local781.method516(local66, this.aByte40, local66 - 1);
											local66--;
										} else if (local66 < local68) {
											local781.method516(local66, this.aByte40, local66 + 1);
											local66++;
										}
									}
								} else {
									local781.method516(this.anInt918, this.aByte40, this.anInt1043);
								}
								this.aClass1_Sub1_Sub3_6.method348(63);
								this.aClass1_Sub1_Sub3_6.method375(local783);
								this.aClass1_Sub1_Sub3_6.method350(this.anInt1043);
								this.aClass1_Sub1_Sub3_6.method384(this.anInt917);
								this.aClass1_Sub1_Sub3_6.method385(this.anInt918);
							}
						} else if ((this.anInt875 == 1 || this.method712(this.anInt1019 - 1)) && this.anInt1019 > 2) {
							this.method666(this.anInt1049);
						} else if (this.anInt1019 > 0) {
							this.method664(this.anInt1019 - 1);
						}
						this.anInt988 = 10;
						super.anInt839 = 0;
					}
				}
				@Pc(962) int local962;
				if (Class5.anInt171 != -1) {
					local543 = Class5.anInt171;
					local962 = Class5.anInt172;
					@Pc(984) boolean local984 = this.method662(local543, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray140[0], this.aByte38, 0, 0, 0, true, 0, 0, local962, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray141[0]);
					Class5.anInt171 = -1;
					if (local984) {
						this.anInt845 = super.anInt840;
						this.anInt846 = super.anInt841;
						this.anInt848 = 1;
						this.anInt847 = 0;
					}
				}
				if (super.anInt839 == 1 && this.aString19 != null) {
					this.aString19 = null;
					this.aBoolean236 = true;
					super.anInt839 = 0;
				}
				this.method674();
				this.method627();
				this.method587();
				this.method696();
				if (super.anInt833 == 1 || super.anInt839 == 1) {
					this.anInt1024++;
				}
				if (this.anInt1025 == 2) {
					this.method685();
				}
				if (this.anInt1025 == 2 && this.aBoolean246) {
					this.method665(this.anInt905);
				}
				for (local543 = 0; local543 < 5; local543++) {
					@Pc(1071) int local1071 = this.anIntArray212[local543]++;
				}
				this.method592();
				super.anInt832++;
				if (super.anInt832 > 4500) {
					this.anInt1035 = 250;
					super.anInt832 -= 500;
					this.aClass1_Sub1_Sub3_6.method348(86);
				}
				this.anInt957++;
				if (this.anInt957 > 500) {
					this.anInt957 = 0;
					local962 = (int) (Math.random() * 8.0D);
					if ((local962 & 0x1) == 1) {
						this.anInt1009 += this.anInt1010;
					}
					if ((local962 & 0x2) == 2) {
						this.anInt860 += this.anInt861;
					}
					if ((local962 & 0x4) == 4) {
						this.anInt908 += this.anInt909;
					}
				}
				if (this.anInt1009 < -50) {
					this.anInt1010 = 2;
				}
				if (this.anInt1009 > 50) {
					this.anInt1010 = -2;
				}
				if (this.anInt860 < -55) {
					this.anInt861 = 2;
				}
				if (this.anInt860 > 55) {
					this.anInt861 = -2;
				}
				if (this.anInt908 < -40) {
					this.anInt909 = 1;
				}
				if (this.anInt908 > 40) {
					this.anInt909 = -1;
				}
				this.anInt1039++;
				if (this.anInt1039 > 500) {
					this.anInt1039 = 0;
					local962 = (int) (Math.random() * 8.0D);
					if ((local962 & 0x1) == 1) {
						this.anInt1026 += this.anInt1027;
					}
					if ((local962 & 0x2) == 2) {
						this.anInt947 += this.anInt948;
					}
				}
				if (this.anInt1026 < -60) {
					this.anInt1027 = 2;
				}
				if (this.anInt1026 > 60) {
					this.anInt1027 = -2;
				}
				if (this.anInt947 < -20) {
					this.anInt948 = 1;
				}
				if (this.anInt947 > 10) {
					this.anInt948 = -1;
				}
				anInt985++;
				if (anInt985 > 107) {
					anInt985 = 0;
					this.aClass1_Sub1_Sub3_6.method348(45);
					this.aClass1_Sub1_Sub3_6.method349(4);
				}
				this.anInt1034++;
				if (this.anInt1034 > 50) {
					this.aClass1_Sub1_Sub3_6.method348(184);
				}
				try {
					if (this.aClass9_1 != null && this.aClass1_Sub1_Sub3_6.anInt443 > 0) {
						this.aClass9_1.method143(this.aClass1_Sub1_Sub3_6.aByteArray6, this.aClass1_Sub1_Sub3_6.anInt443);
						this.aClass1_Sub1_Sub3_6.anInt443 = 0;
						this.anInt1034 = 0;
					}
				} catch (@Pc(1335) IOException local1335) {
					this.method584();
				} catch (@Pc(1340) Exception local1340) {
					this.method640();
				}
			}
		} catch (@Pc(1345) RuntimeException local1345) {
			signlink.reporterror("90089, " + -558 + ", " + local1345.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ULLVQOAK;I)Z")
	private boolean method611(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = arg0.anInt701;
			if (arg1 != 0) {
				throw new NullPointerException();
			}
			if (this.anInt1038 == 2) {
				if (local4 == 201) {
					this.aBoolean236 = true;
					this.anInt877 = 0;
					this.aBoolean259 = true;
					this.aString24 = "";
					this.anInt886 = 1;
					this.aString26 = "Enter name of friend to add to list";
				}
				if (local4 == 202) {
					this.aBoolean236 = true;
					this.anInt877 = 0;
					this.aBoolean259 = true;
					this.aString24 = "";
					this.anInt886 = 2;
					this.aString26 = "Enter name of friend to delete from list";
				}
			}
			if (local4 == 205) {
				this.anInt1035 = 250;
				return true;
			}
			if (local4 == 501) {
				this.aBoolean236 = true;
				this.anInt877 = 0;
				this.aBoolean259 = true;
				this.aString24 = "";
				this.anInt886 = 4;
				this.aString26 = "Enter name of player to add to list";
			}
			if (local4 == 502) {
				this.aBoolean236 = true;
				this.anInt877 = 0;
				this.aBoolean259 = true;
				this.aString24 = "";
				this.anInt886 = 5;
				this.aString26 = "Enter name of player to delete from list";
			}
			@Pc(118) int local118;
			@Pc(122) int local122;
			@Pc(127) int local127;
			if (local4 >= 300 && local4 <= 313) {
				local118 = (local4 - 300) / 2;
				local122 = local4 & 0x1;
				local127 = this.anIntArray270[local118];
				if (local127 != -1) {
					while (true) {
						if (local122 == 0) {
							local127--;
							if (local127 < 0) {
								local127 = Class47.anInt794 - 1;
							}
						}
						if (local122 == 1) {
							local127++;
							if (local127 >= Class47.anInt794) {
								local127 = 0;
							}
						}
						if (!Class47.aClass47Array1[local127].aBoolean204 && Class47.aClass47Array1[local127].anInt795 == local118 + (this.aBoolean249 ? 0 : 7)) {
							this.anIntArray270[local118] = local127;
							this.aBoolean248 = true;
							break;
						}
					}
				}
			}
			if (local4 >= 314 && local4 <= 323) {
				local118 = (local4 - 314) / 2;
				local122 = local4 & 0x1;
				local127 = this.anIntArray215[local118];
				if (local122 == 0) {
					local127--;
					if (local127 < 0) {
						local127 = anIntArrayArray23[local118].length - 1;
					}
				}
				if (local122 == 1) {
					local127++;
					if (local127 >= anIntArrayArray23[local118].length) {
						local127 = 0;
					}
				}
				this.anIntArray215[local118] = local127;
				this.aBoolean248 = true;
			}
			if (local4 == 324 && !this.aBoolean249) {
				this.aBoolean249 = true;
				this.method692(this.aBoolean230);
			}
			if (local4 == 325 && this.aBoolean249) {
				this.aBoolean249 = false;
				this.method692(this.aBoolean230);
			}
			if (local4 == 326) {
				this.aClass1_Sub1_Sub3_6.method348(76);
				this.aClass1_Sub1_Sub3_6.method349(this.aBoolean249 ? 0 : 1);
				for (local118 = 0; local118 < 7; local118++) {
					this.aClass1_Sub1_Sub3_6.method349(this.anIntArray270[local118]);
				}
				for (local122 = 0; local122 < 5; local122++) {
					this.aClass1_Sub1_Sub3_6.method349(this.anIntArray215[local122]);
				}
				return true;
			}
			if (local4 == 613) {
				this.aBoolean264 = !this.aBoolean264;
			}
			if (local4 >= 601 && local4 <= 612) {
				this.method654(this.anInt942);
				if (this.aString22.length() > 0) {
					this.aClass1_Sub1_Sub3_6.method348(66);
					this.aClass1_Sub1_Sub3_6.method355(Class15.method194(this.aString22));
					this.aClass1_Sub1_Sub3_6.method349(local4 - 601);
					this.aClass1_Sub1_Sub3_6.method349(this.aBoolean264 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(358) RuntimeException local358) {
			signlink.reporterror("7037, " + arg0 + ", " + arg1 + ", " + local358.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method612(@OriginalArg(0) boolean arg0) {
		try {
			this.aBoolean241 &= arg0;
			@Pc(28) int local28;
			@Pc(41) int local41;
			@Pc(45) int local45;
			@Pc(49) int local49;
			@Pc(98) int local98;
			@Pc(112) int local112;
			@Pc(124) int local124;
			@Pc(183) int local183;
			try {
				this.anInt999 = -1;
				this.aClass23_11.method426();
				this.aClass23_12.method426();
				Class1_Sub1_Sub2_Sub3.method245();
				this.method679();
				this.aClass5_1.method42();
				System.gc();
				for (local28 = 0; local28 < 4; local28++) {
					this.aClass14Array1[local28].method152();
				}
				for (local41 = 0; local41 < 4; local41++) {
					for (local45 = 0; local45 < 104; local45++) {
						for (local49 = 0; local49 < 104; local49++) {
							this.aByteArrayArrayArray8[local41][local45][local49] = 0;
						}
					}
				}
				@Pc(84) Class19 local84 = new Class19(this.aByteArrayArrayArray8, this.aByte39, 104, this.anIntArrayArrayArray8, 104);
				local49 = this.aByteArrayArray4.length;
				this.aClass1_Sub1_Sub3_6.method348(184);
				@Pc(245) int local245;
				@Pc(233) int local233;
				if (!this.aBoolean226) {
					@Pc(129) byte[] local129;
					for (local98 = 0; local98 < local49; local98++) {
						local112 = (this.anIntArray256[local98] >> 8) * 64 - this.anInt924;
						local124 = (this.anIntArray256[local98] & 0xFF) * 64 - this.anInt925;
						local129 = this.aByteArrayArray4[local98];
						if (local129 != null) {
							local84.method312(this.aClass14Array1, local129, local112, (this.anInt914 - 6) * 8, (this.anInt913 - 6) * 8, local124);
						}
					}
					for (local112 = 0; local112 < local49; local112++) {
						local124 = (this.anIntArray256[local112] >> 8) * 64 - this.anInt924;
						local183 = (this.anIntArray256[local112] & 0xFF) * 64 - this.anInt925;
						@Pc(188) byte[] local188 = this.aByteArrayArray4[local112];
						if (local188 == null && this.anInt914 < 800) {
							local84.method310(64, 64, local183, local124);
						}
					}
					this.aClass1_Sub1_Sub3_6.method348(184);
					for (local124 = 0; local124 < local49; local124++) {
						local129 = this.aByteArrayArray5[local124];
						if (local129 != null) {
							local233 = (this.anIntArray256[local124] >> 8) * 64 - this.anInt924;
							local245 = (this.anIntArray256[local124] & 0xFF) * 64 - this.anInt925;
							local84.method295(local233, this.aClass5_1, local129, this.aClass14Array1, local245);
						}
					}
				}
				if (this.aBoolean226) {
					local98 = 0;
					label251: while (true) {
						@Pc(304) int local304;
						@Pc(310) int local310;
						@Pc(320) int local320;
						@Pc(322) int local322;
						if (local98 >= 4) {
							for (local112 = 0; local112 < 13; local112++) {
								for (local124 = 0; local124 < 13; local124++) {
									local183 = this.anIntArrayArrayArray7[0][local112][local124];
									if (local183 == -1) {
										local84.method310(8, 8, local124 * 8, local112 * 8);
									}
								}
							}
							this.aClass1_Sub1_Sub3_6.method348(184);
							local124 = 0;
							while (true) {
								if (local124 >= 4) {
									break label251;
								}
								for (local183 = 0; local183 < 13; local183++) {
									for (local233 = 0; local233 < 13; local233++) {
										local245 = this.anIntArrayArrayArray7[local124][local183][local233];
										if (local245 != -1) {
											local304 = local245 >> 24 & 0x3;
											local310 = local245 >> 1 & 0x3;
											local320 = local245 >> 14 & 0x3FF;
											local322 = local245 >> 3 & 0x7FF;
											@Pc(485) int local485 = (local320 / 8 << 8) + local322 / 8;
											for (@Pc(487) int local487 = 0; local487 < this.anIntArray256.length; local487++) {
												if (this.anIntArray256[local487] == local485 && this.aByteArrayArray5[local487] != null) {
													local84.method306((local320 & 0x7) * 8, this.aClass14Array1, local310, local124, this.aClass5_1, (local322 & 0x7) * 8, local183 * 8, this.aByteArrayArray5[local487], local233 * 8, local304);
													break;
												}
											}
										}
									}
								}
								local124++;
							}
						}
						for (local112 = 0; local112 < 13; local112++) {
							for (local124 = 0; local124 < 13; local124++) {
								local183 = this.anIntArrayArrayArray7[local98][local112][local124];
								if (local183 != -1) {
									local233 = local183 >> 24 & 0x3;
									local245 = local183 >> 1 & 0x3;
									local304 = local183 >> 14 & 0x3FF;
									local310 = local183 >> 3 & 0x7FF;
									local320 = (local304 / 8 << 8) + local310 / 8;
									for (local322 = 0; local322 < this.anIntArray256.length; local322++) {
										if (this.anIntArray256[local322] == local320 && this.aByteArrayArray4[local322] != null) {
											local84.method315(this.aClass14Array1, this.aByteArrayArray4[local322], local124 * 8, local112 * 8, local98, local233, (local310 & 0x7) * 8, local245, (local304 & 0x7) * 8);
											break;
										}
									}
								}
							}
						}
						local98++;
					}
				}
				this.aClass1_Sub1_Sub3_6.method348(184);
				local84.method296(this.aClass5_1, this.aClass14Array1);
				this.aClass36_14.method503();
				this.aClass1_Sub1_Sub3_6.method348(184);
				local98 = Class19.anInt366;
				if (local98 > this.anInt972) {
					local98 = this.anInt972;
				}
				if (local98 < this.anInt972 - 1) {
					local98 = this.anInt972 - 1;
				}
				if (aBoolean253) {
					this.aClass5_1.method43(Class19.anInt366, 160);
				} else {
					this.aClass5_1.method43(0, 160);
				}
				for (local112 = 0; local112 < 104; local112++) {
					for (local124 = 0; local124 < 104; local124++) {
						this.method623(local112, local124);
					}
				}
				anInt962++;
				if (anInt962 > 126) {
					anInt962 = 0;
					this.aClass1_Sub1_Sub3_6.method348(121);
					this.aClass1_Sub1_Sub3_6.method349(109);
				}
				this.method714();
			} catch (@Pc(648) Exception local648) {
			}
			Class40.aClass4_7.method35();
			if (super.aFrame_Sub1_2 != null) {
				this.aClass1_Sub1_Sub3_6.method348(119);
				this.aClass1_Sub1_Sub3_6.method353(1057001181);
			}
			if (aBoolean253 && signlink.aRandomAccessFile3 != null) {
				local28 = this.aClass16_Sub1_1.method225(0);
				for (local41 = 0; local41 < local28; local41++) {
					local45 = this.aClass16_Sub1_1.method209(anInt933, local41);
					if ((local45 & 0x79) == 0) {
						Class1_Sub1_Sub1_Sub4.method269(local41);
					}
				}
			}
			System.gc();
			Class1_Sub1_Sub2_Sub3.method246();
			this.aClass16_Sub1_1.method221(this.anInt901);
			local28 = (this.anInt913 - 6) / 8 - 1;
			local41 = (this.anInt913 + 6) / 8 + 1;
			local45 = (this.anInt914 - 6) / 8 - 1;
			local49 = (this.anInt914 + 6) / 8 + 1;
			if (this.aBoolean237) {
				local28 = 49;
				local41 = 50;
				local45 = 49;
				local49 = 50;
			}
			for (local98 = local28; local98 <= local41; local98++) {
				for (local112 = local45; local112 <= local49; local112++) {
					if (local98 == local28 || local98 == local41 || local112 == local45 || local112 == local49) {
						local124 = this.aClass16_Sub1_1.method215(local112, 0, local98, aBoolean220);
						if (local124 != -1) {
							this.aClass16_Sub1_1.method226(3, local124);
						}
						local183 = this.aClass16_Sub1_1.method215(local112, 1, local98, aBoolean220);
						if (local183 != -1) {
							this.aClass16_Sub1_1.method226(3, local183);
						}
					}
				}
			}
		} catch (@Pc(813) RuntimeException local813) {
			signlink.reporterror("24944, " + arg0 + ", " + local813.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method613() {
		try {
			this.method616();
			if (this.anInt848 == 1) {
				this.aClass1_Sub1_Sub2_Sub1Array6[this.anInt847 / 100].method131(this.anInt846 - 8 - 4, this.anInt845 - 8 - 4);
			}
			if (this.anInt848 == 2) {
				this.aClass1_Sub1_Sub2_Sub1Array6[this.anInt847 / 100 + 4].method131(this.anInt846 - 8 - 4, this.anInt845 - 8 - 4);
			}
			if (this.anInt874 != -1) {
				this.method591(this.anInt874, this.anInt1020);
				this.method704(0, Class39.aClass39Array1[this.anInt874], 0, 0);
			}
			if (this.anInt938 != -1) {
				this.method591(this.anInt938, this.anInt1020);
				this.method704(0, Class39.aClass39Array1[this.anInt938], 0, 0);
			}
			this.method585();
			if (!this.aBoolean244) {
				this.method659();
				this.method632();
			} else if (this.anInt977 == 0) {
				this.method668();
			}
			if (this.anInt983 == 1) {
				this.aClass1_Sub1_Sub2_Sub1Array8[1].method131(296, 472);
			}
			@Pc(167) int local167;
			if (aBoolean233) {
				@Pc(143) byte local143 = 20;
				@Pc(145) int local145 = 16776960;
				if (super.anInt829 < 15) {
					local145 = 16711680;
				}
				this.aClass1_Sub1_Sub2_Sub2_3.method178("Fps:" + super.anInt829, local145, 20);
				local167 = local143 + 15;
				@Pc(169) Runtime local169 = Runtime.getRuntime();
				@Pc(178) int local178 = (int) ((local169.totalMemory() - local169.freeMemory()) / 1024L);
				if (local178 > 33554432 && aBoolean253) {
				}
				this.aClass1_Sub1_Sub2_Sub2_3.method178("Mem:" + local178 + "k", 16776960, 35);
				local167 += 15;
			}
			if (this.anInt867 != 0) {
				@Pc(212) int local212 = this.anInt867 / 50;
				local167 = local212 / 60;
				@Pc(220) int local220 = local212 % 60;
				if (local220 < 10) {
					this.aClass1_Sub1_Sub2_Sub2_3.method183(4, "System update in: " + local167 + ":0" + local220, 329, 16776960);
				} else {
					this.aClass1_Sub1_Sub2_Sub2_3.method183(4, "System update in: " + local167 + ":" + local220, 329, 16776960);
				}
			}
		} catch (@Pc(262) RuntimeException local262) {
			signlink.reporterror("58449, " + -114 + ", " + local262.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method614() {
		try {
			@Pc(18) int local18;
			@Pc(25) int local25;
			if (this.anInt934 == 0) {
				local18 = super.anInt830 / 2 - 80;
				local25 = super.anInt831 / 2 + 20;
				local25 += 20;
				if (super.anInt839 == 1 && super.anInt840 >= local18 - 75 && super.anInt840 <= local18 + 75 && super.anInt841 >= local25 - 20 && super.anInt841 <= local25 + 20) {
					this.anInt934 = 3;
					this.anInt956 = 0;
				}
				local18 = super.anInt830 / 2 + 80;
				if (super.anInt839 == 1 && super.anInt840 >= local18 - 75 && super.anInt840 <= local18 + 75 && super.anInt841 >= local25 - 20 && super.anInt841 <= local25 + 20) {
					this.aString27 = "";
					this.aString28 = "Enter your username & password.";
					this.anInt934 = 2;
					this.anInt956 = 0;
				}
			} else if (this.anInt934 == 2) {
				local18 = super.anInt831 / 2 - 40;
				local18 += 30;
				local18 += 25;
				if (super.anInt839 == 1 && super.anInt841 >= local18 - 15 && super.anInt841 < local18) {
					this.anInt956 = 0;
				}
				local18 += 15;
				if (super.anInt839 == 1 && super.anInt841 >= local18 - 15 && super.anInt841 < local18) {
					this.anInt956 = 1;
				}
				local18 += 15;
				local25 = super.anInt830 / 2 - 80;
				@Pc(171) int local171 = super.anInt831 / 2 + 50;
				@Pc(172) int local172 = local171 + 20;
				if (super.anInt839 == 1 && super.anInt840 >= local25 - 75 && super.anInt840 <= local25 + 75 && super.anInt841 >= local172 - 20 && super.anInt841 <= local172 + 20) {
					this.anInt1048 = 0;
					this.method643(this.aString20, this.aString21, false);
					if (this.aBoolean241) {
						return;
					}
				}
				local25 = super.anInt830 / 2 + 80;
				if (super.anInt839 == 1 && super.anInt840 >= local25 - 75 && super.anInt840 <= local25 + 75 && super.anInt841 >= local172 - 20 && super.anInt841 <= local172 + 20) {
					this.anInt934 = 0;
					this.aString20 = "";
					this.aString21 = "";
				}
				while (true) {
					while (true) {
						@Pc(263) int local263 = this.method573(this.aBoolean261);
						if (local263 == -1) {
							return;
						}
						@Pc(268) boolean local268 = false;
						for (@Pc(270) int local270 = 0; local270 < aString25.length(); local270++) {
							if (local263 == aString25.charAt(local270)) {
								local268 = true;
								break;
							}
						}
						if (this.anInt956 == 0) {
							if (local263 == 8 && this.aString20.length() > 0) {
								this.aString20 = this.aString20.substring(0, this.aString20.length() - 1);
							}
							if (local263 == 9 || local263 == 10 || local263 == 13) {
								this.anInt956 = 1;
							}
							if (local268) {
								this.aString20 = this.aString20 + (char) local263;
							}
							if (this.aString20.length() > 12) {
								this.aString20 = this.aString20.substring(0, 12);
							}
						} else if (this.anInt956 == 1) {
							if (local263 == 8 && this.aString21.length() > 0) {
								this.aString21 = this.aString21.substring(0, this.aString21.length() - 1);
							}
							if (local263 == 9 || local263 == 10 || local263 == 13) {
								this.anInt956 = 0;
							}
							if (local268) {
								this.aString21 = this.aString21 + (char) local263;
							}
							if (this.aString21.length() > 20) {
								this.aString21 = this.aString21.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt934 == 3) {
				local18 = super.anInt830 / 2;
				local25 = super.anInt831 / 2 + 50;
				@Pc(427) int local427 = local25 + 20;
				if (super.anInt839 == 1 && super.anInt840 >= local18 - 75 && super.anInt840 <= local18 + 75 && super.anInt841 >= local427 - 20 && super.anInt841 <= local427 + 20) {
					this.anInt934 = 0;
					return;
				}
			}
		} catch (@Pc(460) RuntimeException local460) {
			signlink.reporterror("29258, " + 0 + ", " + local460.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JZ)V")
	private void method615(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(15) int local15 = 0; local15 < this.anInt1037; local15++) {
					if (this.aLongArray4[local15] == arg0) {
						this.anInt1037--;
						this.aBoolean227 = true;
						for (@Pc(35) int local35 = local15; local35 < this.anInt1037; local35++) {
							this.aStringArray10[local35] = this.aStringArray10[local35 + 1];
							this.anIntArray216[local35] = this.anIntArray216[local35 + 1];
							this.aLongArray4[local35] = this.aLongArray4[local35 + 1];
						}
						this.aClass1_Sub1_Sub3_6.method348(205);
						this.aClass1_Sub1_Sub3_6.method355(arg0);
						return;
					}
				}
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("60653, " + arg0 + ", " + true + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method616() {
		try {
			if (this.anInt1061 != 0) {
				@Pc(6) Class1_Sub1_Sub2_Sub2 local6 = this.aClass1_Sub1_Sub2_Sub2_3;
				@Pc(14) int local14 = 0;
				if (this.anInt867 != 0) {
					local14 = 1;
				}
				for (@Pc(21) int local21 = 0; local21 < 100; local21++) {
					if (this.aStringArray13[local21] != null) {
						@Pc(33) int local33 = this.anIntArray238[local21];
						@Pc(38) String local38 = this.aStringArray12[local21];
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
						if ((local33 == 3 || local33 == 7) && (local33 == 7 || this.anInt1021 == 0 || this.anInt1021 == 1 && this.method606(local38, this.aBoolean234))) {
							local92 = 329 - local14 * 13;
							local6.method183(4, "From", local92, 0);
							local6.method183(4, "From", local92 - 1, 65535);
							@Pc(117) int local117 = local6.method181("From ") + 4;
							if (local40 == 1) {
								this.aClass1_Sub1_Sub2_Sub4Array3[0].method417(448, local92 - 12, local117);
								local117 += 14;
							}
							if (local40 == 2) {
								this.aClass1_Sub1_Sub2_Sub4Array3[1].method417(448, local92 - 12, local117);
								local117 += 14;
							}
							local6.method183(local117, local38 + ": " + this.aStringArray13[local21], local92, 0);
							local6.method183(local117, local38 + ": " + this.aStringArray13[local21], local92 - 1, 65535);
							local14++;
							if (local14 >= 5) {
								return;
							}
						}
						if (local33 == 5 && this.anInt1021 < 2) {
							local92 = 329 - local14 * 13;
							local6.method183(4, this.aStringArray13[local21], local92, 0);
							local6.method183(4, this.aStringArray13[local21], local92 - 1, 65535);
							local14++;
							if (local14 >= 5) {
								return;
							}
						}
						if (local33 == 6 && this.anInt1021 < 2) {
							local92 = 329 - local14 * 13;
							local6.method183(4, "To " + local38 + ": " + this.aStringArray13[local21], local92, 0);
							local6.method183(4, "To " + local38 + ": " + this.aStringArray13[local21], local92 - 1, 65535);
							local14++;
							if (local14 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(296) RuntimeException local296) {
			signlink.reporterror("95368, " + 3 + ", " + local296.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method617() {
		try {
			if (aBoolean253 && this.anInt1025 == 2 && Class19.anInt372 != this.anInt972) {
				this.aClass36_14.method503();
				this.aClass1_Sub1_Sub2_Sub2_3.method179("Loading - please wait.", 257, 151, 0, this.anInt943);
				this.aClass1_Sub1_Sub2_Sub2_3.method179("Loading - please wait.", 256, 150, 16777215, this.anInt943);
				this.aClass36_14.method504((byte) 9, 4, 4, super.aGraphics2);
				this.anInt1025 = 1;
				this.aLong33 = System.currentTimeMillis();
			}
			if (this.anInt1025 == 1) {
				@Pc(58) int local58 = this.method618();
				if (local58 != 0 && System.currentTimeMillis() - this.aLong33 > 360000L) {
					signlink.reporterror(this.aString20 + " glcfb " + this.aLong29 + "," + local58 + "," + aBoolean253 + "," + this.aClass34Array1[0] + "," + this.aClass16_Sub1_1.method210() + "," + this.anInt972 + "," + this.anInt913 + "," + this.anInt914);
					this.aLong33 = System.currentTimeMillis();
				}
			}
			if (this.anInt1025 == 2 && this.anInt972 != this.anInt999) {
				this.anInt999 = this.anInt972;
				this.method661(this.anInt972);
			}
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("10552, " + -161 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)I")
	private int method618() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray4.length; local3++) {
				if (this.aByteArrayArray4[local3] == null && this.anIntArray257[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray5[local3] == null && this.anIntArray258[local3] != -1) {
					return -2;
				}
			}
			@Pc(39) boolean local39 = true;
			for (@Pc(41) int local41 = 0; local41 < this.aByteArrayArray4.length; local41++) {
				@Pc(48) byte[] local48 = this.aByteArrayArray5[local41];
				if (local48 != null) {
					@Pc(62) int local62 = (this.anIntArray256[local41] >> 8) * 64 - this.anInt924;
					@Pc(74) int local74 = (this.anIntArray256[local41] & 0xFF) * 64 - this.anInt925;
					if (this.aBoolean226) {
						local62 = 10;
						local74 = 10;
					}
					local39 &= Class19.method302(local48, local62, local74);
				}
			}
			if (!local39) {
				return -3;
			} else if (this.aBoolean260) {
				return -4;
			} else {
				this.anInt1025 = 2;
				Class19.anInt372 = this.anInt972;
				this.method612(this.aBoolean240);
				this.aClass1_Sub1_Sub3_6.method348(132);
				return 0;
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("66076, " + -45 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method619() {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt960; local3++) {
				if (local3 == -1) {
					local11 = this.anInt959;
				} else {
					local11 = this.anIntArray246[local3];
				}
				@Pc(23) Class1_Sub1_Sub1_Sub1_Sub1 local23 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local11];
				if (local23 != null && local23.anInt664 > 0) {
					local23.anInt664--;
					if (local23.anInt664 == 0) {
						local23.aString8 = null;
					}
				}
			}
			for (local11 = 0; local11 < this.anInt1036; local11++) {
				@Pc(57) int local57 = this.anIntArray265[local11];
				@Pc(62) Class1_Sub1_Sub1_Sub1_Sub2 local62 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local57];
				if (local62 != null && local62.anInt664 > 0) {
					local62.anInt664--;
					if (local62.anInt664 == 0) {
						local62.aString8 = null;
					}
				}
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("87762, " + 0 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean221) {
			this.method706();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method620(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			if (this.aClass36_19 == null) {
				super.aClass36_2 = null;
				this.aClass36_15 = null;
				this.aClass36_13 = null;
				this.aClass36_12 = null;
				this.aClass36_14 = null;
				this.aClass36_16 = null;
				this.aClass36_17 = null;
				this.aClass36_18 = null;
				this.aClass36_22 = new Class36(265, 128, (byte) 22, this.method579(anInt974));
				Class1_Sub1_Sub2.method403();
				this.aClass36_23 = new Class36(265, 128, (byte) 22, this.method579(anInt974));
				Class1_Sub1_Sub2.method403();
				this.aClass36_19 = new Class36(171, 509, (byte) 22, this.method579(anInt974));
				Class1_Sub1_Sub2.method403();
				this.aClass36_20 = new Class36(132, 360, (byte) 22, this.method579(anInt974));
				Class1_Sub1_Sub2.method403();
				this.aClass36_21 = new Class36(200, 360, (byte) 22, this.method579(anInt974));
				Class1_Sub1_Sub2.method403();
				this.aClass36_24 = new Class36(238, 202, (byte) 22, this.method579(anInt974));
				Class1_Sub1_Sub2.method403();
				this.aClass36_25 = new Class36(238, 203, (byte) 22, this.method579(anInt974));
				Class1_Sub1_Sub2.method403();
				this.aClass36_26 = new Class36(94, 74, (byte) 22, this.method579(anInt974));
				Class1_Sub1_Sub2.method403();
				this.aClass36_27 = new Class36(94, 75, (byte) 22, this.method579(anInt974));
				Class1_Sub1_Sub2.method403();
				if (this.aClass35_1 != null) {
					this.method713();
					this.method582();
				}
				this.aBoolean256 = true;
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("46895, " + arg0 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method621(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) int local4 = Class10.aClass10Array1[arg0].anInt244;
			if (local4 != 0) {
				@Pc(17) int local17 = this.anIntArray267[arg0];
				if (local4 == 1) {
					if (local17 == 1) {
						Class1_Sub1_Sub2_Sub3.method251(0.9D);
					}
					if (local17 == 2) {
						Class1_Sub1_Sub2_Sub3.method251(0.8D);
					}
					if (local17 == 3) {
						Class1_Sub1_Sub2_Sub3.method251(0.7D);
					}
					if (local17 == 4) {
						Class1_Sub1_Sub2_Sub3.method251(0.6D);
					}
					Class21.aClass4_2.method35();
					this.aBoolean256 = true;
				}
				if (local4 == 3) {
					@Pc(55) boolean local55 = this.aBoolean225;
					if (local17 == 0) {
						this.method609(this.aBoolean225, 0);
						this.aBoolean225 = true;
					}
					if (local17 == 1) {
						this.method609(this.aBoolean225, -400);
						this.aBoolean225 = true;
					}
					if (local17 == 2) {
						this.method609(this.aBoolean225, -800);
						this.aBoolean225 = true;
					}
					if (local17 == 3) {
						this.method609(this.aBoolean225, -1200);
						this.aBoolean225 = true;
					}
					if (local17 == 4) {
						this.aBoolean225 = false;
					}
					if (this.aBoolean225 != local55 && !aBoolean253) {
						if (this.aBoolean225) {
							this.anInt872 = this.anInt1052;
							this.aBoolean219 = true;
							this.aClass16_Sub1_1.method214(2, this.anInt872);
						} else {
							this.method594();
						}
						this.anInt858 = 0;
					}
				}
				if (local4 == 4) {
					if (local17 == 0) {
						this.aBoolean216 = true;
						this.method678(0);
					}
					if (local17 == 1) {
						this.aBoolean216 = true;
						this.method678(-400);
					}
					if (local17 == 2) {
						this.aBoolean216 = true;
						this.method678(-800);
					}
					if (local17 == 3) {
						this.aBoolean216 = true;
						this.method678(-1200);
					}
					if (local17 == 4) {
						this.aBoolean216 = false;
					}
				}
				if (local4 == 5) {
					this.anInt875 = local17;
				}
				if (local4 == 6) {
					this.anInt915 = local17;
				}
				if (local4 == 8) {
					this.anInt1061 = local17;
					this.aBoolean236 = true;
				}
				if (local4 == 9) {
					this.anInt1063 = local17;
				}
			}
		} catch (@Pc(215) RuntimeException local215) {
			signlink.reporterror("32401, " + arg0 + ", " + 503 + ", " + local215.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method622() {
		try {
			if (this.anInt1025 == 2) {
				for (@Pc(16) Class1_Sub2 local16 = (Class1_Sub2) this.aClass23_10.method422(); local16 != null; local16 = (Class1_Sub2) this.aClass23_10.method424((byte) 5)) {
					if (local16.anInt597 > 0) {
						local16.anInt597--;
					}
					if (local16.anInt597 != 0) {
						if (local16.anInt593 > 0) {
							local16.anInt593--;
						}
						if (local16.anInt593 == 0 && local16.anInt591 >= 1 && local16.anInt592 >= 1 && local16.anInt591 <= 102 && local16.anInt592 <= 102 && (local16.anInt594 < 0 || Class19.method308(local16.anInt596, local16.anInt594))) {
							this.method642(local16.anInt595, local16.anInt592, local16.anInt589, local16.anInt590, local16.anInt596, local16.anInt594, local16.anInt591);
							local16.anInt593 = -1;
							if (local16.anInt594 == local16.anInt586 && local16.anInt586 == -1) {
								local16.method544();
							} else if (local16.anInt594 == local16.anInt586 && local16.anInt595 == local16.anInt587 && local16.anInt596 == local16.anInt588) {
								local16.method544();
							}
						}
					} else if (local16.anInt586 < 0 || Class19.method308(local16.anInt588, local16.anInt586)) {
						this.method642(local16.anInt587, local16.anInt592, local16.anInt589, local16.anInt590, local16.anInt588, local16.anInt586, local16.anInt591);
						local16.method544();
					}
				}
				anInt1065++;
				if (anInt1065 > 55) {
					anInt1065 = 0;
					this.aClass1_Sub1_Sub3_6.method348(139);
					return;
				}
			}
		} catch (@Pc(173) RuntimeException local173) {
			signlink.reporterror("35199, " + 9891 + ", " + local173.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class23 local9 = this.aClass23ArrayArrayArray1[this.anInt972][arg0][arg1];
		if (local9 == null) {
			this.aClass5_1.method63(this.anInt972, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class1_Sub1_Sub1_Sub6 local23 = null;
		@Pc(27) Class1_Sub1_Sub1_Sub6 local27;
		for (local27 = (Class1_Sub1_Sub1_Sub6) local9.method422(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub6) local9.method424((byte) 5)) {
			@Pc(32) Class21 local32 = Class21.method335(local27.anInt789);
			@Pc(35) int local35 = local32.anInt410;
			if (local32.aBoolean109) {
				local35 *= local27.anInt790 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method420(local23, this.aBoolean238);
		@Pc(66) Class1_Sub1_Sub1_Sub6 local66 = null;
		@Pc(68) Class1_Sub1_Sub1_Sub6 local68 = null;
		for (local27 = (Class1_Sub1_Sub1_Sub6) local9.method422(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub6) local9.method424((byte) 5)) {
			if (local27.anInt789 != local23.anInt789 && local66 == null) {
				local66 = local27;
			}
			if (local27.anInt789 != local23.anInt789 && local27.anInt789 != local66.anInt789 && local68 == null) {
				local68 = local27;
			}
		}
		@Pc(111) int local111 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass5_1.method49(local111, local23, this.method705(arg1 * 128 + 64, this.anInt972, arg0 * 128 + 64), local66, arg0, this.anInt972, local68, arg1);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZILclient!DUMEPGRH;)V")
	private void method624(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub1_Sub2_Sub1 arg2) {
		try {
			@Pc(7) int local7 = arg0 * arg0 + arg1 * arg1;
			if (local7 > 4225 && local7 < 90000) {
				@Pc(30) int local30 = this.anInt864 + this.anInt1026 & 0x7FF;
				@Pc(34) int local34 = Class1_Sub1_Sub1_Sub4.anIntArray96[local30];
				@Pc(38) int local38 = Class1_Sub1_Sub1_Sub4.anIntArray97[local30];
				@Pc(47) int local47 = local34 * 256 / (this.anInt947 + 256);
				@Pc(56) int local56 = local38 * 256 / (this.anInt947 + 256);
				@Pc(66) int local66 = arg1 * local47 + arg0 * local56 >> 16;
				@Pc(76) int local76 = arg1 * local56 - arg0 * local47 >> 16;
				@Pc(82) double local82 = Math.atan2((double) local66, (double) local76);
				@Pc(88) int local88 = (int) (Math.sin(local82) * 63.0D);
				@Pc(94) int local94 = (int) (Math.cos(local82) * 57.0D);
				this.aClass1_Sub1_Sub2_Sub1_8.method136(83 - local94 - 20, local88 + 94 + 4 - 10, local82);
			} else {
				this.method647(arg0, arg1, arg2);
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("16377, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ULLVQOAK;B)Z")
	private boolean method625(@OriginalArg(0) Class39 arg0) {
		try {
			@Pc(10) int local10 = arg0.anInt701;
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
				this.aStringArray9[this.anInt1019] = "Remove @whi@" + this.aStringArray10[local10];
				this.anIntArray252[this.anInt1019] = 484;
				this.anInt1019++;
				this.aStringArray9[this.anInt1019] = "Message @whi@" + this.aStringArray10[local10];
				this.anIntArray252[this.anInt1019] = 403;
				this.anInt1019++;
				return true;
			} else if (local10 >= 401 && local10 <= 500) {
				this.aStringArray9[this.anInt1019] = "Remove @whi@" + arg0.aString11;
				this.anIntArray252[this.anInt1019] = 215;
				this.anInt1019++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("8590, " + arg0 + ", " + 95 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
	private void method626(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt935; local8++) {
					if (this.aLongArray3[local8] == arg0) {
						this.anInt935--;
						this.aBoolean227 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt935; local28++) {
							this.aLongArray3[local28] = this.aLongArray3[local28 + 1];
						}
						this.aClass1_Sub1_Sub3_6.method348(97);
						this.aClass1_Sub1_Sub3_6.method355(arg0);
						break;
					}
				}
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("71586, " + 0 + ", " + arg0 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method627() {
		try {
			if (this.anInt857 == 0 && super.anInt839 == 1) {
				@Pc(21) int local21 = super.anInt840 - 25 - 550;
				@Pc(28) int local28 = super.anInt841 - 5 - 4;
				if (local21 >= 0 && local28 >= 0 && local21 < 146 && local28 < 151) {
					local21 -= 73;
					local28 -= 75;
					@Pc(48) int local48 = this.anInt864 + this.anInt1026 & 0x7FF;
					@Pc(52) int local52 = Class1_Sub1_Sub2_Sub3.anIntArray53[local48];
					@Pc(56) int local56 = Class1_Sub1_Sub2_Sub3.anIntArray54[local48];
					@Pc(65) int local65 = local52 * (this.anInt947 + 256) >> 8;
					@Pc(74) int local74 = local56 * (this.anInt947 + 256) >> 8;
					@Pc(84) int local84 = local28 * local65 + local21 * local74 >> 11;
					@Pc(94) int local94 = local28 * local74 - local21 * local65 >> 11;
					@Pc(101) int local101 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt620 + local84 >> 7;
					@Pc(108) int local108 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt621 - local94 >> 7;
					@Pc(130) boolean local130 = this.method662(local101, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray140[0], this.aByte38, 0, 0, 0, true, 1, 0, local108, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray141[0]);
					if (local130) {
						this.aClass1_Sub1_Sub3_6.method349(local21);
						this.aClass1_Sub1_Sub3_6.method349(local28);
						this.aClass1_Sub1_Sub3_6.method350(this.anInt864);
						this.aClass1_Sub1_Sub3_6.method349(57);
						this.aClass1_Sub1_Sub3_6.method349(this.anInt1026);
						this.aClass1_Sub1_Sub3_6.method349(this.anInt947);
						this.aClass1_Sub1_Sub3_6.method349(89);
						this.aClass1_Sub1_Sub3_6.method350(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt620);
						this.aClass1_Sub1_Sub3_6.method350(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt621);
						this.aClass1_Sub1_Sub3_6.method349(this.anInt1059);
						this.aClass1_Sub1_Sub3_6.method349(63);
						return;
					}
				}
			}
		} catch (@Pc(184) RuntimeException local184) {
			signlink.reporterror("12647, " + true + ", " + local184.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)Ljava/lang/String;")
	private String method628(@OriginalArg(1) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("14636, " + 7 + ", " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt1017 = Integer.parseInt(this.getParameter("nodeid"));
		anInt1018 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method629();
		} else {
			method630();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean252 = false;
		} else {
			aBoolean252 = true;
		}
		this.method570();
	}

	@OriginalMember(owner = "client!client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}
		try {
			if (super.aFrame_Sub1_2 != null) {
				return new URL("http://127.0.0.1:" + (anInt1018 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method575() {
		try {
			this.aBoolean241 &= true;
			if (!this.aBoolean214 && !this.aBoolean217 && !this.aBoolean229) {
				anInt931++;
				if (this.aBoolean241) {
					this.method610();
				} else {
					this.method614();
				}
				this.method658();
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("30528, " + true + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method631() {
		try {
			if (this.anInt1008 == 2) {
				this.method650((this.anInt952 - this.anInt925 << 7) + this.anInt955, this.anInt953 * 2, (this.anInt951 - this.anInt924 << 7) + this.anInt954);
				this.anInt1031 += 0;
				if (this.anInt869 > -1 && anInt931 % 20 < 10) {
					this.aClass1_Sub1_Sub2_Sub1Array8[2].method131(this.anInt870 - 28, this.anInt869 - 12);
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("29325, " + 0 + ", " + local62.toString());
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

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method632() {
		try {
			if (this.anInt1019 >= 2 || this.anInt853 != 0 || this.anInt849 != 0) {
				this.anInt1031 += 0;
				@Pc(37) String local37;
				if (this.anInt853 == 1 && this.anInt1019 < 2) {
					local37 = "Use " + this.aString18 + " with...";
				} else if (this.anInt849 == 1 && this.anInt1019 < 2) {
					local37 = this.aString17 + "...";
				} else {
					local37 = this.aStringArray9[this.anInt1019 - 1];
				}
				if (this.anInt1019 > 2) {
					local37 = local37 + "@whi@ / " + (this.anInt1019 - 2) + " more options";
				}
				this.aClass1_Sub1_Sub2_Sub2_4.method188(16777215, local37, 4, anInt931 / 1000, 15);
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("16752, " + 0 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZZ)V")
	private void method633(@OriginalArg(1) boolean arg0) {
		try {
			this.method620(696);
			this.aClass36_21.method503();
			this.aClass1_Sub1_Sub2_Sub4_17.method417(448, 0, 0);
			@Pc(50) byte local50;
			@Pc(62) int local62;
			if (this.anInt934 == 0) {
				this.aClass1_Sub1_Sub2_Sub2_2.method180(180, 180, 7711145, this.aClass16_Sub1_1.aString5, true);
				local50 = 80;
				this.aClass1_Sub1_Sub2_Sub2_4.method180(180, 80, 16776960, "Welcome to RuneScape", true);
				local62 = local50 + 30;
				this.aClass1_Sub1_Sub2_Sub4_18.method417(448, 100, 27);
				this.aClass1_Sub1_Sub2_Sub2_4.method180(100, 125, 16777215, "New User", true);
				this.aClass1_Sub1_Sub2_Sub4_18.method417(448, 100, 187);
				this.aClass1_Sub1_Sub2_Sub2_4.method180(260, 125, 16777215, "Existing User", true);
			}
			if (this.anInt934 == 2) {
				local50 = 60;
				if (this.aString27.length() > 0) {
					this.aClass1_Sub1_Sub2_Sub2_4.method180(180, 45, 16776960, this.aString27, true);
					this.aClass1_Sub1_Sub2_Sub2_4.method180(180, 60, 16776960, this.aString28, true);
					local62 = local50 + 30;
				} else {
					this.aClass1_Sub1_Sub2_Sub2_4.method180(180, 53, 16776960, this.aString28, true);
					local62 = local50 + 30;
				}
				this.aClass1_Sub1_Sub2_Sub2_4.method187(16777215, 90, true, "Username: " + this.aString20 + (this.anInt956 == 0 & anInt931 % 40 < 20 ? "@yel@|" : ""), 90);
				local62 += 15;
				this.aClass1_Sub1_Sub2_Sub2_4.method187(16777215, 92, true, "Password: " + Class15.method199(this.aString21) + (this.anInt956 == 1 & anInt931 % 40 < 20 ? "@yel@|" : ""), 105);
				local62 += 15;
				if (!arg0) {
					this.aClass1_Sub1_Sub2_Sub4_18.method417(448, 130, 27);
					this.aClass1_Sub1_Sub2_Sub2_4.method180(100, 155, 16777215, "Login", true);
					this.aClass1_Sub1_Sub2_Sub4_18.method417(448, 130, 187);
					this.aClass1_Sub1_Sub2_Sub2_4.method180(260, 155, 16777215, "Cancel", true);
				}
			}
			if (this.anInt934 == 3) {
				this.aClass1_Sub1_Sub2_Sub2_4.method180(180, 40, 16776960, "Create a free account", true);
				local50 = 65;
				this.aClass1_Sub1_Sub2_Sub2_4.method180(180, 65, 16777215, "To create a new account you need to", true);
				local62 = local50 + 15;
				this.aClass1_Sub1_Sub2_Sub2_4.method180(180, 80, 16777215, "go back to the main RuneScape webpage", true);
				local62 += 15;
				this.aClass1_Sub1_Sub2_Sub2_4.method180(180, 95, 16777215, "and choose the red 'create account'", true);
				local62 += 15;
				this.aClass1_Sub1_Sub2_Sub2_4.method180(180, 110, 16777215, "button at the top right of that page.", true);
				local62 += 15;
				this.aClass1_Sub1_Sub2_Sub4_18.method417(448, 130, 107);
				this.aClass1_Sub1_Sub2_Sub2_4.method180(180, 155, 16777215, "Cancel", true);
			}
			this.aClass36_21.method504((byte) 9, 171, 202, super.aGraphics2);
			if (this.aBoolean256) {
				this.aBoolean256 = false;
				this.aClass36_19.method504((byte) 9, 0, 128, super.aGraphics2);
				this.aClass36_20.method504((byte) 9, 371, 202, super.aGraphics2);
				this.aClass36_24.method504((byte) 9, 265, 0, super.aGraphics2);
				this.aClass36_25.method504((byte) 9, 265, 562, super.aGraphics2);
				this.aClass36_26.method504((byte) 9, 171, 128, super.aGraphics2);
				this.aClass36_27.method504((byte) 9, 171, 562, super.aGraphics2);
			}
		} catch (@Pc(495) RuntimeException local495) {
			signlink.reporterror("98285, " + false + ", " + arg0 + ", " + local495.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method634() {
		try {
			if (this.aClass36_15 == null) {
				this.method698();
				super.aClass36_2 = null;
				this.aClass36_19 = null;
				this.aClass36_20 = null;
				this.aClass36_21 = null;
				this.aClass36_22 = null;
				this.aClass36_23 = null;
				this.aClass36_24 = null;
				this.aClass36_25 = null;
				this.aClass36_26 = null;
				this.aClass36_27 = null;
				this.aClass36_15 = new Class36(96, 479, (byte) 22, this.method579(anInt974));
				this.aClass36_13 = new Class36(156, 172, (byte) 22, this.method579(anInt974));
				Class1_Sub1_Sub2.method403();
				this.aClass1_Sub1_Sub2_Sub4_2.method417(448, 0, 0);
				this.aClass36_12 = new Class36(261, 190, (byte) 22, this.method579(anInt974));
				this.aClass36_14 = new Class36(334, 512, (byte) 22, this.method579(anInt974));
				Class1_Sub1_Sub2.method403();
				this.aClass36_16 = new Class36(50, 496, (byte) 22, this.method579(anInt974));
				this.aClass36_17 = new Class36(37, 269, (byte) 22, this.method579(anInt974));
				this.aClass36_18 = new Class36(45, 249, (byte) 22, this.method579(anInt974));
				this.aBoolean256 = true;
			}
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("49566, " + -3619 + ", " + local137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!LDILQFVA;I)V")
	private void method635(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				if (arg0.anInt444 + 10 < arg1 * 8) {
					@Pc(19) int local19 = arg0.method370(11);
					if (local19 != 2047) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local19] == null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local19] = new Class1_Sub1_Sub1_Sub1_Sub1();
							if (this.aClass1_Sub1_Sub3Array1[local19] != null) {
								this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local19].method27(this.aClass1_Sub1_Sub3Array1[local19]);
							}
						}
						this.anIntArray246[this.anInt960++] = local19;
						@Pc(65) Class1_Sub1_Sub1_Sub1_Sub1 local65 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local19];
						local65.anInt665 = anInt931;
						@Pc(73) int local73 = arg0.method370(5);
						if (local73 > 15) {
							local73 -= 32;
						}
						@Pc(82) int local82 = arg0.method370(1);
						@Pc(87) int local87 = arg0.method370(1);
						if (local87 == 1) {
							this.anIntArray247[this.anInt961++] = local19;
						}
						@Pc(106) int local106 = arg0.method370(5);
						if (local106 > 15) {
							local106 -= 32;
						}
						local65.method501(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray141[0] + local106, local82 == 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray140[0] + local73);
						continue;
					}
				}
				arg0.method371();
				return;
			}
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("88582, " + 17449 + ", " + arg0 + ", " + arg1 + ", " + local138.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method636(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 != 0L) {
				if (this.anInt1037 >= 100 && this.anInt899 != 1) {
					this.method695("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
				} else if (this.anInt1037 >= 200) {
					this.method695("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
				} else {
					@Pc(38) String local38 = Class15.method198(Class15.method195(arg0));
					for (@Pc(40) int local40 = 0; local40 < this.anInt1037; local40++) {
						if (this.aLongArray4[local40] == arg0) {
							this.method695("", 0, local38 + " is already on your friend list");
							return;
						}
					}
					for (@Pc(70) int local70 = 0; local70 < this.anInt935; local70++) {
						if (this.aLongArray3[local70] == arg0) {
							this.method695("", 0, "Please remove " + local38 + " from your ignore list first");
							return;
						}
					}
					if (!local38.equals(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3)) {
						this.aStringArray10[this.anInt1037] = local38;
						this.aLongArray4[this.anInt1037] = arg0;
						this.anIntArray216[this.anInt1037] = 0;
						this.anInt1037++;
						this.aBoolean227 = true;
						@Pc(136) boolean local136 = false;
						this.aClass1_Sub1_Sub3_6.method348(125);
						this.aClass1_Sub1_Sub3_6.method355(arg0);
					}
				}
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("18270, " + arg0 + ", " + arg1 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method637() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt1028);
			if (this.aClass16_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass16_Sub1_1.anInt302);
			}
			System.out.println("loop-cycle:" + anInt931);
			this.aBoolean241 &= true;
			System.out.println("draw-cycle:" + anInt930);
			System.out.println("ptype:" + this.anInt1032);
			System.out.println("psize:" + this.anInt1031);
			if (this.aClass9_1 != null) {
				this.aClass9_1.method144();
			}
			super.aBoolean211 = true;
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("65918, " + true + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)Ljava/awt/Component;")
	@Override
	protected Component method579(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 7129) {
				this.method574();
			}
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("34143, " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBII)I")
	private int method638(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(13) int local13 = 256 - arg0;
			return ((arg1 & 0xFF00FF) * local13 + (arg2 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg1 & 0xFF00) * local13 + (arg2 & 0xFF00) * arg0 & 0xFF0000) >> 8;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("69946, " + arg0 + ", " + -118 + ", " + arg1 + ", " + arg2 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ULLVQOAK;IZ)I")
	private int method639(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0.anIntArrayArray19 == null || arg1 >= arg0.anIntArrayArray19.length) {
				return -2;
			}
			try {
				@Pc(21) int[] local21 = arg0.anIntArrayArray19[arg1];
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
						local34 = this.anIntArray231[local21[local25++]];
					}
					if (local32 == 2) {
						local34 = this.anIntArray228[local21[local25++]];
					}
					if (local32 == 3) {
						local34 = this.anIntArray214[local21[local25++]];
					}
					@Pc(83) Class39 local83;
					@Pc(88) int local88;
					@Pc(101) int local101;
					if (local32 == 4) {
						local83 = Class39.aClass39Array1[local21[local25++]];
						local88 = local21[local25++];
						if (local88 >= 0 && local88 < Class21.anInt398 && (!Class21.method335(local88).aBoolean112 || aBoolean252)) {
							for (local101 = 0; local101 < local83.anIntArray152.length; local101++) {
								if (local83.anIntArray152[local101] == local88 + 1) {
									local34 += local83.anIntArray157[local101];
								}
							}
						}
					}
					if (local32 == 5) {
						local34 = this.anIntArray267[local21[local25++]];
					}
					if (local32 == 6) {
						local34 = anIntArray266[this.anIntArray228[local21[local25++]] - 1];
					}
					if (local32 == 7) {
						local34 = this.anIntArray267[local21[local25++]] * 100 / 46875;
					}
					if (local32 == 8) {
						local34 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt111;
					}
					@Pc(176) int local176;
					if (local32 == 9) {
						for (local176 = 0; local176 < Class32.anInt585; local176++) {
							if (Class32.aBooleanArray8[local176]) {
								local34 += this.anIntArray228[local176];
							}
						}
					}
					if (local32 == 10) {
						local83 = Class39.aClass39Array1[local21[local25++]];
						local88 = local21[local25++] + 1;
						if (local88 >= 0 && local88 < Class21.anInt398 && (!Class21.method335(local88).aBoolean112 || aBoolean252)) {
							for (local101 = 0; local101 < local83.anIntArray152.length; local101++) {
								if (local83.anIntArray152[local101] == local88) {
									local34 = 999999999;
									break;
								}
							}
						}
					}
					if (local32 == 11) {
						local34 = this.anInt928;
					}
					if (local32 == 12) {
						local34 = this.anInt887;
					}
					if (local32 == 13) {
						local176 = this.anIntArray267[local21[local25++]];
						local88 = local21[local25++];
						local34 = (local176 & 0x1 << local88) == 0 ? 0 : 1;
					}
					if (local32 == 14) {
						local176 = local21[local25++];
						@Pc(291) Class24 local291 = Class24.aClass24Array1[local176];
						local101 = local291.anInt474;
						@Pc(297) int local297 = local291.anInt475;
						@Pc(300) int local300 = local291.anInt476;
						@Pc(306) int local306 = anIntArray232[local300 - local297];
						local34 = this.anIntArray267[local101] >> local297 & local306;
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
						local34 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt620 >> 7) + this.anInt924;
					}
					if (local32 == 19) {
						local34 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt621 >> 7) + this.anInt925;
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
			signlink.reporterror("61578, " + arg0 + ", " + arg1 + ", " + false + ", " + local402.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method640() {
		try {
			try {
				if (this.aClass9_1 != null) {
					this.aClass9_1.method139();
				}
			} catch (@Pc(7) Exception local7) {
			}
			this.aClass9_1 = null;
			this.aBoolean241 = false;
			this.anInt934 = 0;
			this.aString20 = "";
			this.aString21 = "";
			this.method679();
			this.aClass5_1.method42();
			for (@Pc(36) int local36 = 0; local36 < 4; local36++) {
				this.aClass14Array1[local36].method152();
			}
			System.gc();
			this.method594();
			this.anInt1052 = -1;
			this.anInt872 = -1;
			this.anInt858 = 0;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("71257, " + -10 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIIIII)V")
	private void method641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(8) int local8 = this.aClass5_1.method68(arg2, arg0, arg4);
			@Pc(18) int local18;
			@Pc(24) int local24;
			@Pc(28) int local28;
			@Pc(30) int local30;
			@Pc(52) int local52;
			@Pc(58) int local58;
			if (local8 != 0) {
				local18 = this.aClass5_1.method72(arg2, arg0, arg4, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = arg1;
				if (local8 > 0) {
					local30 = arg3;
				}
				@Pc(38) int[] local38 = this.aClass1_Sub1_Sub2_Sub1_9.anIntArray30;
				local52 = arg0 * 4 + (103 - arg4) * 512 * 4 + 24624;
				local58 = local8 >> 14 & 0x7FFF;
				@Pc(61) Class40 local61 = Class40.method529(local58);
				if (local61.anInt735 == -1) {
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
					@Pc(71) Class1_Sub1_Sub2_Sub4 local71 = this.aClass1_Sub1_Sub2_Sub4Array4[local61.anInt735];
					if (local71 != null) {
						@Pc(83) int local83 = (local61.anInt736 * 4 - local71.anInt465) / 2;
						@Pc(93) int local93 = (local61.anInt722 * 4 - local71.anInt466) / 2;
						local71.method417(448, (104 - arg4 - local61.anInt722) * 4 + local93 + 48, arg0 * 4 + 48 + local83);
					}
				}
			}
			local8 = this.aClass5_1.method70(arg2, arg0, arg4);
			if (local8 != 0) {
				local18 = this.aClass5_1.method72(arg2, arg0, arg4, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = local8 >> 14 & 0x7FFF;
				@Pc(450) Class40 local450 = Class40.method529(local30);
				@Pc(482) int local482;
				if (local450.anInt735 != -1) {
					@Pc(460) Class1_Sub1_Sub2_Sub4 local460 = this.aClass1_Sub1_Sub2_Sub4Array4[local450.anInt735];
					if (local460 != null) {
						local58 = (local450.anInt736 * 4 - local460.anInt465) / 2;
						local482 = (local450.anInt722 * 4 - local460.anInt466) / 2;
						local460.method417(448, (104 - arg4 - local450.anInt722) * 4 + local482 + 48, arg0 * 4 + 48 + local58);
					}
				} else if (local28 == 9) {
					local52 = 15658734;
					if (local8 > 0) {
						local52 = 15597568;
					}
					@Pc(519) int[] local519 = this.aClass1_Sub1_Sub2_Sub1_9.anIntArray30;
					local482 = arg0 * 4 + (103 - arg4) * 512 * 4 + 24624;
					if (local24 == 0 || local24 == 2) {
						local519[local482 + 1536] = local52;
						local519[local482 + 1024 + 1] = local52;
						local519[local482 + 512 + 2] = local52;
						local519[local482 + 3] = local52;
					} else {
						local519[local482] = local52;
						local519[local482 + 512 + 1] = local52;
						local519[local482 + 1024 + 2] = local52;
						local519[local482 + 1536 + 3] = local52;
					}
				}
			}
			local8 = this.aClass5_1.method71(arg2, arg0, arg4);
			if (local8 != 0) {
				local18 = local8 >> 14 & 0x7FFF;
				@Pc(614) Class40 local614 = Class40.method529(local18);
				if (local614.anInt735 != -1) {
					@Pc(624) Class1_Sub1_Sub2_Sub4 local624 = this.aClass1_Sub1_Sub2_Sub4Array4[local614.anInt735];
					if (local624 != null) {
						local30 = (local614.anInt736 * 4 - local624.anInt465) / 2;
						@Pc(646) int local646 = (local614.anInt722 * 4 - local624.anInt466) / 2;
						local624.method417(448, (104 - arg4 - local614.anInt722) * 4 + local646 + 48, arg0 * 4 + 48 + local30);
						return;
					}
				}
			}
		} catch (@Pc(670) RuntimeException local670) {
			signlink.reporterror("21935, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -94 + ", " + local670.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
	private void method642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg6 >= 1 && arg1 >= 1 && arg6 <= 102 && arg1 <= 102) {
				if (aBoolean253 && arg2 != this.anInt972) {
					return;
				}
				@Pc(26) int local26 = 0;
				if (arg3 == 0) {
					local26 = this.aClass5_1.method68(arg2, arg6, arg1);
				}
				if (arg3 == 1) {
					local26 = this.aClass5_1.method69(arg2, arg6, arg1);
				}
				if (arg3 == 2) {
					local26 = this.aClass5_1.method70(arg2, arg6, arg1);
				}
				if (arg3 == 3) {
					local26 = this.aClass5_1.method71(arg2, arg6, arg1);
				}
				@Pc(82) int local82;
				if (local26 != 0) {
					local82 = this.aClass5_1.method72(arg2, arg6, arg1, local26);
					@Pc(88) int local88 = local26 >> 14 & 0x7FFF;
					@Pc(92) int local92 = local82 & 0x1F;
					@Pc(96) int local96 = local82 >> 6;
					@Pc(108) Class40 local108;
					if (arg3 == 0) {
						this.aClass5_1.method59(arg1, arg6, arg2);
						local108 = Class40.method529(local88);
						if (local108.aBoolean176) {
							this.aClass14Array1[arg2].method157(arg1, local108.aBoolean179, arg6, local92, local96);
						}
					}
					if (arg3 == 1) {
						this.aClass5_1.method60(arg6, arg2, arg1);
					}
					if (arg3 == 2) {
						this.aClass5_1.method61(arg2, arg1, arg6);
						local108 = Class40.method529(local88);
						if (arg6 + local108.anInt736 > 103 || arg1 + local108.anInt736 > 103 || arg6 + local108.anInt722 > 103 || arg1 + local108.anInt722 > 103) {
							return;
						}
						if (local108.aBoolean176) {
							this.aClass14Array1[arg2].method158(local108.aBoolean179, local108.anInt736, local108.anInt722, arg6, local96, arg1);
						}
					}
					if (arg3 == 3) {
						this.aClass5_1.method62(arg6, arg2, arg1);
						local108 = Class40.method529(local88);
						if (local108.aBoolean176 && local108.aBoolean175) {
							this.aClass14Array1[arg2].method160(arg1, (byte) 3, arg6);
						}
					}
				}
				if (arg5 >= 0) {
					local82 = arg2;
					if (arg2 < 3 && (this.aByteArrayArrayArray8[1][arg6][arg1] & 0x2) == 2) {
						local82 = arg2 + 1;
					}
					Class19.method298(this.anIntArrayArrayArray8, arg2, arg1, local82, arg4, this.anInt852, this.aClass5_1, arg0, arg5, arg6, this.aClass14Array1[arg2]);
					return;
				}
			}
		} catch (@Pc(256) RuntimeException local256) {
			signlink.reporterror("48608, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + -23954 + ", " + local256.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method643(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString27 = "";
				this.aString28 = "Connecting to server...";
				this.method633(true);
			}
			this.aClass9_1 = new Class9(this.method669(anInt1018 + 43594), this, (byte) -89);
			@Pc(30) long local30 = Class15.method194(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass1_Sub1_Sub3_6.anInt443 = 0;
			this.aClass1_Sub1_Sub3_6.method349(14);
			this.aClass1_Sub1_Sub3_6.method349(local37);
			this.aClass9_1.method143(this.aClass1_Sub1_Sub3_6.aByteArray6, 2);
			for (@Pc(60) int local60 = 0; local60 < 8; local60++) {
				this.aClass9_1.method140();
			}
			@Pc(74) int local74 = this.aClass9_1.method140();
			@Pc(76) int local76 = local74;
			@Pc(225) int local225;
			@Pc(259) int local259;
			if (local74 == 0) {
				this.aClass9_1.method142(this.aClass1_Sub1_Sub3_7.aByteArray6, 0, 8);
				this.aClass1_Sub1_Sub3_7.anInt443 = 0;
				this.aLong29 = this.aClass1_Sub1_Sub3_7.method365();
				@Pc(99) int[] local99 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong29 >> 32), (int) this.aLong29 };
				this.aClass1_Sub1_Sub3_6.anInt443 = 0;
				this.aClass1_Sub1_Sub3_6.method349(10);
				this.aClass1_Sub1_Sub3_6.method353(local99[0]);
				this.aClass1_Sub1_Sub3_6.method353(local99[1]);
				this.aClass1_Sub1_Sub3_6.method353(local99[2]);
				this.aClass1_Sub1_Sub3_6.method353(local99[3]);
				this.aClass1_Sub1_Sub3_6.method353(signlink.anInt1067);
				this.aClass1_Sub1_Sub3_6.method356(arg0);
				this.aClass1_Sub1_Sub3_6.method356(arg1);
				this.aClass1_Sub1_Sub3_6.method374(aBigInteger2, aBigInteger1);
				this.aClass1_Sub1_Sub3_9.anInt443 = 0;
				if (arg2) {
					this.aClass1_Sub1_Sub3_9.method349(18);
				} else {
					this.aClass1_Sub1_Sub3_9.method349(16);
				}
				this.aClass1_Sub1_Sub3_9.method349(this.aClass1_Sub1_Sub3_6.anInt443 + 36 + 1 + 1 + 2);
				this.aClass1_Sub1_Sub3_9.method349(255);
				this.aClass1_Sub1_Sub3_9.method350(327);
				this.aClass1_Sub1_Sub3_9.method349(aBoolean253 ? 1 : 0);
				for (local225 = 0; local225 < 9; local225++) {
					this.aClass1_Sub1_Sub3_9.method353(this.anIntArray254[local225]);
				}
				this.aClass1_Sub1_Sub3_9.method357(this.aClass1_Sub1_Sub3_6.anInt443, this.aClass1_Sub1_Sub3_6.aByteArray6);
				this.aClass1_Sub1_Sub3_6.aClass22_1 = new Class22(-317, local99);
				for (local259 = 0; local259 < 4; local259++) {
					local99[local259] += 50;
				}
				this.aClass22_2 = new Class22(-317, local99);
				this.aClass9_1.method143(this.aClass1_Sub1_Sub3_9.aByteArray6, this.aClass1_Sub1_Sub3_9.anInt443);
				local74 = this.aClass9_1.method140();
			}
			if (local74 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(301) Exception local301) {
				}
				this.method643(arg0, arg1, arg2);
			} else {
				@Pc(389) int local389;
				if (local74 == 2) {
					this.anInt894 = this.aClass9_1.method140();
					aBoolean231 = this.aClass9_1.method140() == 1;
					this.aLong30 = 0L;
					this.anInt1029 = 0;
					this.aClass20_1.anInt395 = 0;
					super.aBoolean213 = true;
					this.aBoolean254 = true;
					this.aBoolean241 = true;
					this.aClass1_Sub1_Sub3_6.anInt443 = 0;
					this.aClass1_Sub1_Sub3_7.anInt443 = 0;
					this.anInt1032 = -1;
					this.anInt1045 = -1;
					this.anInt1046 = -1;
					this.anInt1047 = -1;
					this.anInt1031 = 0;
					this.anInt1033 = 0;
					this.anInt867 = 0;
					this.anInt1035 = 0;
					this.anInt1008 = 0;
					this.anInt1019 = 0;
					this.aBoolean244 = false;
					super.anInt832 = 0;
					for (local389 = 0; local389 < 100; local389++) {
						this.aStringArray13[local389] = null;
					}
					this.anInt853 = 0;
					this.anInt849 = 0;
					this.anInt1025 = 0;
					this.anInt1030 = 0;
					this.anInt1009 = (int) (Math.random() * 100.0D) - 50;
					this.anInt860 = (int) (Math.random() * 110.0D) - 55;
					this.anInt908 = (int) (Math.random() * 80.0D) - 40;
					this.anInt1026 = (int) (Math.random() * 120.0D) - 60;
					this.anInt947 = (int) (Math.random() * 30.0D) - 20;
					this.anInt864 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt857 = 0;
					this.anInt999 = -1;
					this.anInt965 = 0;
					this.anInt966 = 0;
					this.anInt960 = 0;
					this.anInt1036 = 0;
					for (local225 = 0; local225 < this.anInt958; local225++) {
						this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local225] = null;
						this.aClass1_Sub1_Sub3Array1[local225] = null;
					}
					for (local259 = 0; local259 < 16384; local259++) {
						this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local259] = null;
					}
					aClass1_Sub1_Sub1_Sub1_Sub1_1 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anInt959] = new Class1_Sub1_Sub1_Sub1_Sub1();
					this.aClass23_12.method426();
					this.aClass23_11.method426();
					@Pc(534) int local534;
					@Pc(538) int local538;
					for (@Pc(530) int local530 = 0; local530 < 4; local530++) {
						for (local534 = 0; local534 < 104; local534++) {
							for (local538 = 0; local538 < 104; local538++) {
								this.aClass23ArrayArrayArray1[local530][local534][local538] = null;
							}
						}
					}
					this.aClass23_10 = new Class23(6);
					this.anInt1038 = 0;
					this.anInt1037 = 0;
					this.anInt907 = -1;
					this.anInt885 = -1;
					this.anInt938 = -1;
					this.anInt889 = -1;
					this.anInt874 = -1;
					this.aBoolean255 = false;
					this.anInt992 = 3;
					this.anInt877 = 0;
					this.aBoolean244 = false;
					this.aBoolean259 = false;
					this.aString19 = null;
					this.anInt983 = 0;
					this.anInt1042 = -1;
					this.aBoolean249 = true;
					this.method692(this.aBoolean230);
					for (local534 = 0; local534 < 5; local534++) {
						this.anIntArray215[local534] = 0;
					}
					for (local538 = 0; local538 < 5; local538++) {
						this.aStringArray11[local538] = null;
						this.aBooleanArray11[local538] = false;
					}
					anInt912 = 0;
					anInt903 = 0;
					anInt904 = 0;
					anInt893 = 0;
					anInt936 = 0;
					anInt1050 = 0;
					this.method634();
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
				} else if (local74 == 11) {
					this.aString28 = "Login server rejected session.";
					this.aString28 = "Please try again.";
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
					this.aBoolean241 = true;
					this.aClass1_Sub1_Sub3_6.anInt443 = 0;
					this.aClass1_Sub1_Sub3_7.anInt443 = 0;
					this.anInt1032 = -1;
					this.anInt1045 = -1;
					this.anInt1046 = -1;
					this.anInt1047 = -1;
					this.anInt1031 = 0;
					this.anInt1033 = 0;
					this.anInt867 = 0;
					this.anInt1019 = 0;
					this.aBoolean244 = false;
					this.aLong33 = System.currentTimeMillis();
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
					local389 = this.aClass9_1.method140();
					for (@Pc(877) int local877 = local389 + 3; local877 >= 0; local877--) {
						this.aString27 = "You have only just left another world";
						this.aString28 = "Your profile will be transferred in: " + local877;
						this.method633(true);
						try {
							Thread.sleep(1200L);
						} catch (@Pc(899) Exception local899) {
						}
					}
					this.method643(arg0, arg1, arg2);
				} else if (local74 != -1) {
					System.out.println("response:" + local74);
					this.aString27 = "Unexpected server response";
					this.aString28 = "Please try using a different world.";
				} else if (local76 != 0) {
					this.aString27 = "No response from server";
					this.aString28 = "Please try using a different world.";
				} else if (this.anInt1048 < 2) {
					try {
						Thread.sleep(2000L);
					} catch (@Pc(921) Exception local921) {
					}
					this.anInt1048++;
					this.method643(arg0, arg1, arg2);
				} else {
					this.aString27 = "No response from loginserver";
					this.aString28 = "Please wait 1 minute and try again.";
				}
			}
		} catch (@Pc(964) IOException local964) {
			this.aString27 = "";
			this.aString28 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BII)Z")
	private boolean method644(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			return arg0 == null ? true : signlink.wavesave(arg0, arg1);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("33560, " + arg0 + ", " + arg1 + ", " + -24435 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!LDILQFVA;II)V")
	private void method645(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			arg0.method369();
			@Pc(13) int local13 = arg0.method370(1);
			if (local13 != 0) {
				@Pc(21) int local21 = arg0.method370(2);
				if (local21 == 0) {
					this.anIntArray247[this.anInt961++] = this.anInt959;
				} else {
					@Pc(44) int local44;
					@Pc(54) int local54;
					if (local21 == 1) {
						local44 = arg0.method370(3);
						aClass1_Sub1_Sub1_Sub1_Sub1_1.method497(local44, false);
						local54 = arg0.method370(1);
						if (local54 == 1) {
							this.anIntArray247[this.anInt961++] = this.anInt959;
						}
					} else {
						@Pc(98) int local98;
						if (local21 == 2) {
							local44 = arg0.method370(3);
							aClass1_Sub1_Sub1_Sub1_Sub1_1.method497(local44, true);
							local54 = arg0.method370(3);
							aClass1_Sub1_Sub1_Sub1_Sub1_1.method497(local54, true);
							local98 = arg0.method370(1);
							if (local98 == 1) {
								this.anIntArray247[this.anInt961++] = this.anInt959;
							}
						} else if (local21 == 3) {
							local44 = arg0.method370(1);
							local54 = arg0.method370(1);
							if (local54 == 1) {
								this.anIntArray247[this.anInt961++] = this.anInt959;
							}
							this.anInt972 = arg0.method370(2);
							local98 = arg0.method370(7);
							@Pc(158) int local158 = arg0.method370(7);
							aClass1_Sub1_Sub1_Sub1_Sub1_1.method501(local98, local44 == 1, local158);
						}
					}
				}
			}
		} catch (@Pc(171) RuntimeException local171) {
			signlink.reporterror("716, " + arg0 + ", " + arg1 + ", " + 5103 + ", " + local171.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
	private void method646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			@Pc(1) Class1_Sub2 local1 = null;
			for (@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) this.aClass23_10.method422(); local6 != null; local6 = (Class1_Sub2) this.aClass23_10.method424((byte) 5)) {
				if (local6.anInt589 == arg0 && local6.anInt591 == arg6 && local6.anInt592 == arg4 && local6.anInt590 == arg5) {
					local1 = local6;
					break;
				}
			}
			if (local1 == null) {
				local1 = new Class1_Sub2();
				local1.anInt589 = arg0;
				local1.anInt590 = arg5;
				local1.anInt591 = arg6;
				local1.anInt592 = arg4;
				this.method648(local1);
				this.aClass23_10.method419(local1);
			}
			local1.anInt594 = arg8;
			local1.anInt596 = arg1;
			local1.anInt595 = arg9;
			if (arg2 >= 1 && arg2 <= 1) {
				local1.anInt593 = arg3;
				local1.anInt597 = arg7;
			}
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("64356, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!DUMEPGRH;)V")
	private void method647(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub1_Sub2_Sub1 arg2) {
		try {
			@Pc(7) int local7 = this.anInt864 + this.anInt1026 & 0x7FF;
			@Pc(15) int local15 = arg0 * arg0 + arg1 * arg1;
			if (local15 <= 6400) {
				@Pc(23) int local23 = Class1_Sub1_Sub1_Sub4.anIntArray96[local7];
				@Pc(27) int local27 = Class1_Sub1_Sub1_Sub4.anIntArray97[local7];
				@Pc(36) int local36 = local23 * 256 / (this.anInt947 + 256);
				@Pc(50) int local50 = local27 * 256 / (this.anInt947 + 256);
				@Pc(60) int local60 = arg1 * local36 + arg0 * local50 >> 16;
				@Pc(70) int local70 = arg1 * local50 - arg0 * local36 >> 16;
				if (local15 > 2500) {
					arg2.method137(83 - local70 - arg2.anInt218 / 2 - 4, local60 + 94 - arg2.anInt217 / 2 + 4, this.aClass1_Sub1_Sub2_Sub4_2, this.aBoolean232);
				} else {
					arg2.method131(83 - local70 - arg2.anInt218 / 2 - 4, local60 + 94 - arg2.anInt217 / 2 + 4);
				}
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("7126, " + arg0 + ", " + 225 + ", " + arg1 + ", " + arg2 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!QXQLENZA;I)V")
	private void method648(@OriginalArg(0) Class1_Sub2 arg0) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			if (arg0.anInt590 == 0) {
				local1 = this.aClass5_1.method68(arg0.anInt589, arg0.anInt591, arg0.anInt592);
			}
			if (arg0.anInt590 == 1) {
				local1 = this.aClass5_1.method69(arg0.anInt589, arg0.anInt591, arg0.anInt592);
			}
			if (arg0.anInt590 == 2) {
				local1 = this.aClass5_1.method70(arg0.anInt589, arg0.anInt591, arg0.anInt592);
			}
			if (arg0.anInt590 == 3) {
				local1 = this.aClass5_1.method71(arg0.anInt589, arg0.anInt591, arg0.anInt592);
			}
			if (local1 != 0) {
				@Pc(76) int local76 = this.aClass5_1.method72(arg0.anInt589, arg0.anInt591, arg0.anInt592, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local76 & 0x1F;
				local7 = local76 >> 6;
			}
			arg0.anInt586 = local3;
			arg0.anInt588 = local5;
			arg0.anInt587 = local7;
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("26512, " + arg0 + ", " + 17905 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method574() {
		this.method581("Starting up", 20);
		if (signlink.sunjava) {
			super.anInt828 = 5;
		}
		if (aBoolean224) {
			this.aBoolean214 = true;
			return;
		}
		aBoolean224 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method683();
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
			this.aBoolean229 = true;
			return;
		}
		if (signlink.aRandomAccessFile3 != null) {
			for (@Pc(83) int local83 = 0; local83 < 5; local83++) {
				this.aClass34Array1[local83] = new Class34(500000, signlink.aRandomAccessFileArray1[local83], local83 + 1, signlink.aRandomAccessFile3, anInt876);
			}
		}
		try {
			this.method687();
			this.aClass35_1 = this.method663(1, this.anIntArray254[1], "title screen", 25, "title");
			this.aClass1_Sub1_Sub2_Sub2_2 = new Class1_Sub1_Sub2_Sub2(this.aClass35_1, 101, false, "p11_full");
			this.aClass1_Sub1_Sub2_Sub2_3 = new Class1_Sub1_Sub2_Sub2(this.aClass35_1, 101, false, "p12_full");
			this.aClass1_Sub1_Sub2_Sub2_4 = new Class1_Sub1_Sub2_Sub2(this.aClass35_1, 101, false, "b12_full");
			this.aClass1_Sub1_Sub2_Sub2_5 = new Class1_Sub1_Sub2_Sub2(this.aClass35_1, 101, true, "q8_full");
			this.method713();
			this.method582();
			@Pc(179) Class35 local179 = this.method663(2, this.anIntArray254[2], "config", 30, "config");
			@Pc(191) Class35 local191 = this.method663(3, this.anIntArray254[3], "interface", 35, "interface");
			@Pc(203) Class35 local203 = this.method663(4, this.anIntArray254[4], "2d graphics", 40, "media");
			@Pc(215) Class35 local215 = this.method663(6, this.anIntArray254[6], "textures", 45, "textures");
			@Pc(227) Class35 local227 = this.method663(7, this.anIntArray254[7], "chat system", 50, "wordenc");
			@Pc(239) Class35 local239 = this.method663(8, this.anIntArray254[8], "sound effects", 55, "sounds");
			this.aByteArrayArrayArray8 = new byte[4][104][104];
			this.anIntArrayArrayArray8 = new int[4][105][105];
			this.aClass5_1 = new Class5((byte) 7, this.anIntArrayArrayArray8, 104, 104, 4);
			for (@Pc(264) int local264 = 0; local264 < 4; local264++) {
				this.aClass14Array1[local264] = new Class14(722, 104, 104);
			}
			this.aClass1_Sub1_Sub2_Sub1_9 = new Class1_Sub1_Sub2_Sub1(512, 512);
			@Pc(299) Class35 local299 = this.method663(5, this.anIntArray254[5], "update list", 60, "versionlist");
			this.method581("Connecting to update server", 60);
			this.aClass16_Sub1_1 = new Class16_Sub1();
			this.aClass16_Sub1_1.method217(local299, this);
			Class37.method506(this.aClass16_Sub1_1.method227());
			Class1_Sub1_Sub1_Sub4.method267(this.aClass16_Sub1_1.method225(0), this.aClass16_Sub1_1);
			if (!aBoolean253) {
				this.anInt872 = 0;
				try {
					this.anInt872 = Integer.parseInt(this.getParameter("music"));
				} catch (@Pc(340) Exception local340) {
				}
				this.aBoolean219 = true;
				this.aClass16_Sub1_1.method214(2, this.anInt872);
				while (this.aClass16_Sub1_1.method210() > 0) {
					this.method658();
					try {
						Thread.sleep(100L);
					} catch (@Pc(358) Exception local358) {
					}
					if (this.aClass16_Sub1_1.anInt298 > 3) {
						this.method710("ondemand");
						return;
					}
				}
			}
			this.method581("Requesting animations", 65);
			@Pc(382) int local382 = this.aClass16_Sub1_1.method225(1);
			for (@Pc(384) int local384 = 0; local384 < local382; local384++) {
				this.aClass16_Sub1_1.method214(1, local384);
			}
			@Pc(403) int local403;
			while (this.aClass16_Sub1_1.method210() > 0) {
				local403 = local382 - this.aClass16_Sub1_1.method210();
				if (local403 > 0) {
					this.method581("Loading animations - " + local403 * 100 / local382 + "%", 65);
				}
				this.method658();
				try {
					Thread.sleep(100L);
				} catch (@Pc(429) Exception local429) {
				}
				if (this.aClass16_Sub1_1.anInt298 > 3) {
					this.method710("ondemand");
					return;
				}
			}
			this.method581("Requesting models", 70);
			local382 = this.aClass16_Sub1_1.method225(0);
			@Pc(463) int local463;
			for (local403 = 0; local403 < local382; local403++) {
				local463 = this.aClass16_Sub1_1.method209(anInt933, local403);
				if ((local463 & 0x1) != 0) {
					this.aClass16_Sub1_1.method214(0, local403);
				}
			}
			local382 = this.aClass16_Sub1_1.method210();
			while (this.aClass16_Sub1_1.method210() > 0) {
				local463 = local382 - this.aClass16_Sub1_1.method210();
				if (local463 > 0) {
					this.method581("Loading models - " + local463 * 100 / local382 + "%", 70);
				}
				this.method658();
				try {
					Thread.sleep(100L);
				} catch (@Pc(514) Exception local514) {
				}
			}
			if (this.aClass34Array1[0] != null) {
				this.method581("Requesting maps", 75);
				this.aClass16_Sub1_1.method214(3, this.aClass16_Sub1_1.method215(48, 0, 47, aBoolean220));
				this.aClass16_Sub1_1.method214(3, this.aClass16_Sub1_1.method215(48, 1, 47, aBoolean220));
				this.aClass16_Sub1_1.method214(3, this.aClass16_Sub1_1.method215(48, 0, 48, aBoolean220));
				this.aClass16_Sub1_1.method214(3, this.aClass16_Sub1_1.method215(48, 1, 48, aBoolean220));
				this.aClass16_Sub1_1.method214(3, this.aClass16_Sub1_1.method215(48, 0, 49, aBoolean220));
				this.aClass16_Sub1_1.method214(3, this.aClass16_Sub1_1.method215(48, 1, 49, aBoolean220));
				this.aClass16_Sub1_1.method214(3, this.aClass16_Sub1_1.method215(47, 0, 47, aBoolean220));
				this.aClass16_Sub1_1.method214(3, this.aClass16_Sub1_1.method215(47, 1, 47, aBoolean220));
				this.aClass16_Sub1_1.method214(3, this.aClass16_Sub1_1.method215(47, 0, 48, aBoolean220));
				this.aClass16_Sub1_1.method214(3, this.aClass16_Sub1_1.method215(47, 1, 48, aBoolean220));
				this.aClass16_Sub1_1.method214(3, this.aClass16_Sub1_1.method215(148, 0, 48, aBoolean220));
				this.aClass16_Sub1_1.method214(3, this.aClass16_Sub1_1.method215(148, 1, 48, aBoolean220));
				local382 = this.aClass16_Sub1_1.method210();
				while (this.aClass16_Sub1_1.method210() > 0) {
					local463 = local382 - this.aClass16_Sub1_1.method210();
					if (local463 > 0) {
						this.method581("Loading maps - " + local463 * 100 / local382 + "%", 75);
					}
					this.method658();
					try {
						Thread.sleep(100L);
					} catch (@Pc(699) Exception local699) {
					}
				}
			}
			local382 = this.aClass16_Sub1_1.method225(0);
			@Pc(720) int local720;
			for (local463 = 0; local463 < local382; local463++) {
				local720 = this.aClass16_Sub1_1.method209(anInt933, local463);
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
					this.aClass16_Sub1_1.method213(local463, local722, 0);
				}
			}
			this.aClass16_Sub1_1.method222(aBoolean252);
			if (!aBoolean253) {
				local382 = this.aClass16_Sub1_1.method225(2);
				for (local720 = 1; local720 < local382; local720++) {
					if (this.aClass16_Sub1_1.method218(local720)) {
						this.aClass16_Sub1_1.method213(local720, (byte) 1, 2);
					}
				}
			}
			this.method581("Unpacking media", 80);
			this.aClass1_Sub1_Sub2_Sub4_1 = new Class1_Sub1_Sub2_Sub4(local203, "invback", 0);
			this.aClass1_Sub1_Sub2_Sub4_3 = new Class1_Sub1_Sub2_Sub4(local203, "chatback", 0);
			this.aClass1_Sub1_Sub2_Sub4_2 = new Class1_Sub1_Sub2_Sub4(local203, "mapback", 0);
			this.aClass1_Sub1_Sub2_Sub4_9 = new Class1_Sub1_Sub2_Sub4(local203, "backbase1", 0);
			this.aClass1_Sub1_Sub2_Sub4_10 = new Class1_Sub1_Sub2_Sub4(local203, "backbase2", 0);
			this.aClass1_Sub1_Sub2_Sub4_11 = new Class1_Sub1_Sub2_Sub4(local203, "backhmid1", 0);
			for (local720 = 0; local720 < 13; local720++) {
				this.aClass1_Sub1_Sub2_Sub4Array2[local720] = new Class1_Sub1_Sub2_Sub4(local203, "sideicons", local720);
			}
			this.aClass1_Sub1_Sub2_Sub1_7 = new Class1_Sub1_Sub2_Sub1(local203, "compass", 0);
			this.aClass1_Sub1_Sub2_Sub1_8 = new Class1_Sub1_Sub2_Sub1(local203, "mapedge", 0);
			this.aClass1_Sub1_Sub2_Sub1_8.method128();
			@Pc(922) int local922;
			try {
				for (local922 = 0; local922 < 100; local922++) {
					this.aClass1_Sub1_Sub2_Sub4Array4[local922] = new Class1_Sub1_Sub2_Sub4(local203, "mapscene", local922);
				}
			} catch (@Pc(940) Exception local940) {
			}
			try {
				for (local922 = 0; local922 < 100; local922++) {
					this.aClass1_Sub1_Sub2_Sub1Array5[local922] = new Class1_Sub1_Sub2_Sub1(local203, "mapfunction", local922);
				}
			} catch (@Pc(960) Exception local960) {
			}
			try {
				for (local922 = 0; local922 < 20; local922++) {
					this.aClass1_Sub1_Sub2_Sub1Array4[local922] = new Class1_Sub1_Sub2_Sub1(local203, "hitmarks", local922);
				}
			} catch (@Pc(980) Exception local980) {
			}
			try {
				for (local922 = 0; local922 < 20; local922++) {
					this.aClass1_Sub1_Sub2_Sub1Array8[local922] = new Class1_Sub1_Sub2_Sub1(local203, "headicons", local922);
				}
			} catch (@Pc(1000) Exception local1000) {
			}
			this.aClass1_Sub1_Sub2_Sub1_5 = new Class1_Sub1_Sub2_Sub1(local203, "mapmarker", 0);
			this.aClass1_Sub1_Sub2_Sub1_6 = new Class1_Sub1_Sub2_Sub1(local203, "mapmarker", 1);
			for (local922 = 0; local922 < 8; local922++) {
				this.aClass1_Sub1_Sub2_Sub1Array6[local922] = new Class1_Sub1_Sub2_Sub1(local203, "cross", local922);
			}
			this.aClass1_Sub1_Sub2_Sub1_12 = new Class1_Sub1_Sub2_Sub1(local203, "mapdots", 0);
			this.aClass1_Sub1_Sub2_Sub1_13 = new Class1_Sub1_Sub2_Sub1(local203, "mapdots", 1);
			this.aClass1_Sub1_Sub2_Sub1_14 = new Class1_Sub1_Sub2_Sub1(local203, "mapdots", 2);
			this.aClass1_Sub1_Sub2_Sub1_15 = new Class1_Sub1_Sub2_Sub1(local203, "mapdots", 3);
			this.aClass1_Sub1_Sub2_Sub1_16 = new Class1_Sub1_Sub2_Sub1(local203, "mapdots", 4);
			this.aClass1_Sub1_Sub2_Sub4_19 = new Class1_Sub1_Sub2_Sub4(local203, "scrollbar", 0);
			this.aClass1_Sub1_Sub2_Sub4_20 = new Class1_Sub1_Sub2_Sub4(local203, "scrollbar", 1);
			this.aClass1_Sub1_Sub2_Sub4_4 = new Class1_Sub1_Sub2_Sub4(local203, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub4_5 = new Class1_Sub1_Sub2_Sub4(local203, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub4_6 = new Class1_Sub1_Sub2_Sub4(local203, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub4_7 = new Class1_Sub1_Sub2_Sub4(local203, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub4_7.method414();
			this.aClass1_Sub1_Sub2_Sub4_8 = new Class1_Sub1_Sub2_Sub4(local203, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub4_8.method414();
			this.aClass1_Sub1_Sub2_Sub4_12 = new Class1_Sub1_Sub2_Sub4(local203, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub4_12.method415();
			this.aClass1_Sub1_Sub2_Sub4_13 = new Class1_Sub1_Sub2_Sub4(local203, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub4_13.method415();
			this.aClass1_Sub1_Sub2_Sub4_14 = new Class1_Sub1_Sub2_Sub4(local203, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub4_14.method415();
			this.aClass1_Sub1_Sub2_Sub4_15 = new Class1_Sub1_Sub2_Sub4(local203, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub4_15.method414();
			this.aClass1_Sub1_Sub2_Sub4_15.method415();
			this.aClass1_Sub1_Sub2_Sub4_16 = new Class1_Sub1_Sub2_Sub4(local203, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub4_16.method414();
			this.aClass1_Sub1_Sub2_Sub4_16.method415();
			for (@Pc(1208) int local1208 = 0; local1208 < 2; local1208++) {
				this.aClass1_Sub1_Sub2_Sub4Array3[local1208] = new Class1_Sub1_Sub2_Sub4(local203, "mod_icons", local1208);
			}
			@Pc(1231) Class1_Sub1_Sub2_Sub1 local1231 = new Class1_Sub1_Sub2_Sub1(local203, "backleft1", 0);
			this.aClass36_3 = new Class36(local1231.anInt214, local1231.anInt213, (byte) 22, this.method579(anInt974));
			local1231.method129(0, 0);
			@Pc(1256) Class1_Sub1_Sub2_Sub1 local1256 = new Class1_Sub1_Sub2_Sub1(local203, "backleft2", 0);
			this.aClass36_4 = new Class36(local1256.anInt214, local1256.anInt213, (byte) 22, this.method579(anInt974));
			local1256.method129(0, 0);
			@Pc(1281) Class1_Sub1_Sub2_Sub1 local1281 = new Class1_Sub1_Sub2_Sub1(local203, "backright1", 0);
			this.aClass36_5 = new Class36(local1281.anInt214, local1281.anInt213, (byte) 22, this.method579(anInt974));
			local1281.method129(0, 0);
			@Pc(1306) Class1_Sub1_Sub2_Sub1 local1306 = new Class1_Sub1_Sub2_Sub1(local203, "backright2", 0);
			this.aClass36_6 = new Class36(local1306.anInt214, local1306.anInt213, (byte) 22, this.method579(anInt974));
			local1306.method129(0, 0);
			@Pc(1331) Class1_Sub1_Sub2_Sub1 local1331 = new Class1_Sub1_Sub2_Sub1(local203, "backtop1", 0);
			this.aClass36_7 = new Class36(local1331.anInt214, local1331.anInt213, (byte) 22, this.method579(anInt974));
			local1331.method129(0, 0);
			@Pc(1356) Class1_Sub1_Sub2_Sub1 local1356 = new Class1_Sub1_Sub2_Sub1(local203, "backvmid1", 0);
			this.aClass36_8 = new Class36(local1356.anInt214, local1356.anInt213, (byte) 22, this.method579(anInt974));
			local1356.method129(0, 0);
			@Pc(1381) Class1_Sub1_Sub2_Sub1 local1381 = new Class1_Sub1_Sub2_Sub1(local203, "backvmid2", 0);
			this.aClass36_9 = new Class36(local1381.anInt214, local1381.anInt213, (byte) 22, this.method579(anInt974));
			local1381.method129(0, 0);
			@Pc(1406) Class1_Sub1_Sub2_Sub1 local1406 = new Class1_Sub1_Sub2_Sub1(local203, "backvmid3", 0);
			this.aClass36_10 = new Class36(local1406.anInt214, local1406.anInt213, (byte) 22, this.method579(anInt974));
			local1406.method129(0, 0);
			@Pc(1431) Class1_Sub1_Sub2_Sub1 local1431 = new Class1_Sub1_Sub2_Sub1(local203, "backhmid2", 0);
			this.aClass36_11 = new Class36(local1431.anInt214, local1431.anInt213, (byte) 22, this.method579(anInt974));
			local1431.method129(0, 0);
			@Pc(1456) int local1456 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1463) int local1463 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1470) int local1470 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1477) int local1477 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1479) int local1479 = 0; local1479 < 100; local1479++) {
				if (this.aClass1_Sub1_Sub2_Sub1Array5[local1479] != null) {
					this.aClass1_Sub1_Sub2_Sub1Array5[local1479].method127(local1463 + local1477, local1456 + local1477, local1470 + local1477);
				}
				if (this.aClass1_Sub1_Sub2_Sub4Array4[local1479] != null) {
					this.aClass1_Sub1_Sub2_Sub4Array4[local1479].method416(local1463 + local1477, local1456 + local1477, local1470 + local1477);
				}
			}
			this.method581("Unpacking textures", 83);
			Class1_Sub1_Sub2_Sub3.method247(local215);
			Class1_Sub1_Sub2_Sub3.method251(0.8D);
			Class1_Sub1_Sub2_Sub3.method246();
			this.method581("Unpacking config", 86);
			Class46.method541(local179);
			Class40.method520(local179);
			Class43.method537(local179);
			Class21.method338(local179);
			Class49.method564(local179);
			Class47.method548(local179);
			Class38.method511(local179);
			Class10.method145(local179);
			Class24.method427(68, local179);
			Class21.aBoolean111 = aBoolean252;
			if (!aBoolean253) {
				this.method581("Unpacking sounds", 90);
				@Pc(1582) byte[] local1582 = local239.method491("sounds.dat", null);
				@Pc(1588) Class1_Sub1_Sub3 local1588 = new Class1_Sub1_Sub3(local1582, anInt1013);
				Class31.method477(local1588);
			}
			this.method581("Unpacking interfaces", 95);
			@Pc(1619) Class1_Sub1_Sub2_Sub2[] local1619 = new Class1_Sub1_Sub2_Sub2[] { this.aClass1_Sub1_Sub2_Sub2_2, this.aClass1_Sub1_Sub2_Sub2_3, this.aClass1_Sub1_Sub2_Sub2_4, this.aClass1_Sub1_Sub2_Sub2_5 };
			Class39.method514(local1619, local203, local191);
			this.method581("Preparing game engine", 100);
			@Pc(1635) int local1635;
			@Pc(1637) int local1637;
			@Pc(1639) int local1639;
			for (@Pc(1631) int local1631 = 0; local1631 < 33; local1631++) {
				local1635 = 999;
				local1637 = 0;
				for (local1639 = 0; local1639 < 34; local1639++) {
					if (this.aClass1_Sub1_Sub2_Sub4_2.aByteArray7[local1639 + local1631 * this.aClass1_Sub1_Sub2_Sub4_2.anInt465] == 0) {
						if (local1635 == 999) {
							local1635 = local1639;
						}
					} else if (local1635 != 999) {
						local1637 = local1639;
						break;
					}
				}
				this.anIntArray244[local1631] = local1635;
				this.anIntArray237[local1631] = local1637 - local1635;
			}
			@Pc(1697) int local1697;
			for (local1635 = 5; local1635 < 156; local1635++) {
				local1637 = 999;
				local1639 = 0;
				for (local1697 = 25; local1697 < 172; local1697++) {
					if (this.aClass1_Sub1_Sub2_Sub4_2.aByteArray7[local1697 + local1635 * this.aClass1_Sub1_Sub2_Sub4_2.anInt465] == 0 && (local1697 > 34 || local1635 > 34)) {
						if (local1637 == 999) {
							local1637 = local1697;
						}
					} else if (local1637 != 999) {
						local1639 = local1697;
						break;
					}
				}
				this.anIntArray218[local1635 - 5] = local1637 - 25;
				this.anIntArray269[local1635 - 5] = local1639 - local1637;
			}
			Class1_Sub1_Sub2_Sub3.method244(96, 479);
			this.anIntArray239 = Class1_Sub1_Sub2_Sub3.anIntArray55;
			Class1_Sub1_Sub2_Sub3.method244(261, 190);
			this.anIntArray240 = Class1_Sub1_Sub2_Sub3.anIntArray55;
			Class1_Sub1_Sub2_Sub3.method244(334, 512);
			this.anIntArray241 = Class1_Sub1_Sub2_Sub3.anIntArray55;
			@Pc(1781) int[] local1781 = new int[9];
			for (local1639 = 0; local1639 < 9; local1639++) {
				local1697 = local1639 * 32 + 128 + 15;
				@Pc(1799) int local1799 = local1697 * 3 + 600;
				@Pc(1803) int local1803 = Class1_Sub1_Sub2_Sub3.anIntArray53[local1697];
				local1781[local1639] = local1799 * local1803 >> 16;
			}
			Class5.method78(local1781);
			Class25.method435(local227);
			this.aClass20_1 = new Class20(this, -346);
			this.method580(this.aClass20_1, 10);
			Class1_Sub1_Sub1_Sub3.aClient1 = this;
			Class40.aClient4 = this;
			Class49.aClient5 = this;
		} catch (@Pc(1844) Exception local1844) {
			signlink.reporterror("loaderror " + this.aString29 + " " + this.anInt1040);
			this.aBoolean217 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ZGJLFNLC;IB)V")
	private void method649(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		try {
			this.method650(arg0.anInt621, arg1, arg0.anInt620);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("19670, " + arg0 + ", " + arg1 + ", " + -38 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IBII)V")
	private void method650(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 >= 128 && arg0 >= 128 && arg2 <= 13056 && arg0 <= 13056) {
				@Pc(28) int local28 = this.method705(arg0, this.anInt972, arg2) - arg1;
				@Pc(33) int local33 = arg2 - this.anInt879;
				@Pc(42) int local42 = local28 - this.anInt880;
				@Pc(47) int local47 = arg0 - this.anInt881;
				@Pc(52) int local52 = Class1_Sub1_Sub1_Sub4.anIntArray96[this.anInt882];
				@Pc(57) int local57 = Class1_Sub1_Sub1_Sub4.anIntArray97[this.anInt882];
				@Pc(62) int local62 = Class1_Sub1_Sub1_Sub4.anIntArray96[this.anInt883];
				@Pc(67) int local67 = Class1_Sub1_Sub1_Sub4.anIntArray97[this.anInt883];
				@Pc(77) int local77 = local47 * local62 + local33 * local67 >> 16;
				@Pc(87) int local87 = local47 * local67 - local33 * local62 >> 16;
				@Pc(89) int local89 = local77;
				@Pc(99) int local99 = local42 * local57 - local87 * local52 >> 16;
				@Pc(109) int local109 = local42 * local52 + local87 * local57 >> 16;
				if (local109 >= 50) {
					this.anInt869 = Class1_Sub1_Sub2_Sub3.anInt330 + (local89 << 9) / local109;
					this.anInt870 = Class1_Sub1_Sub2_Sub3.anInt331 + (local99 << 9) / local109;
				} else {
					this.anInt869 = -1;
					this.anInt870 = -1;
				}
			} else {
				this.anInt869 = -1;
				this.anInt870 = -1;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("4883, " + arg0 + ", " + 72 + ", " + arg1 + ", " + arg2 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method652() {
		try {
			@Pc(8) int local8;
			if (this.anInt986 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt986 > 768) {
						this.anIntArray233[local8] = this.method638(1024 - this.anInt986, this.anIntArray234[local8], this.anIntArray235[local8]);
					} else if (this.anInt986 > 256) {
						this.anIntArray233[local8] = this.anIntArray235[local8];
					} else {
						this.anIntArray233[local8] = this.method638(256 - this.anInt986, this.anIntArray235[local8], this.anIntArray234[local8]);
					}
				}
			} else if (this.anInt987 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt987 > 768) {
						this.anIntArray233[local8] = this.method638(1024 - this.anInt987, this.anIntArray234[local8], this.anIntArray236[local8]);
					} else if (this.anInt987 > 256) {
						this.anIntArray233[local8] = this.anIntArray236[local8];
					} else {
						this.anIntArray233[local8] = this.method638(256 - this.anInt987, this.anIntArray236[local8], this.anIntArray234[local8]);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray233[local8] = this.anIntArray234[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass36_22.anIntArray145[local8] = this.aClass1_Sub1_Sub2_Sub1_10.anIntArray30[local8];
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
				local198 = this.anIntArray249[local185] * (256 - local185) / 256;
				local202 = local198 + 22;
				if (local202 < 0) {
					local202 = 0;
				}
				local181 += local202;
				for (local212 = local202; local212 < 128; local212++) {
					local220 = this.anIntArray226[local181++];
					if (local220 == 0) {
						local183++;
					} else {
						local224 = local220;
						local228 = 256 - local220;
						local220 = this.anIntArray233[local220];
						local239 = this.aClass36_22.anIntArray145[local183];
						this.aClass36_22.anIntArray145[local183++] = ((local220 & 0xFF00FF) * local224 + (local239 & 0xFF00FF) * local228 & 0xFF00FF00) + ((local220 & 0xFF00) * local224 + (local239 & 0xFF00) * local228 & 0xFF0000) >> 8;
					}
				}
				local183 += local202;
			}
			this.aClass36_22.method504((byte) 9, 0, 0, super.aGraphics2);
			for (local198 = 0; local198 < 33920; local198++) {
				this.aClass36_23.anIntArray145[local198] = this.aClass1_Sub1_Sub2_Sub1_11.anIntArray30[local198];
			}
			local181 = 0;
			local183 = 1176;
			for (local202 = 1; local202 < 255; local202++) {
				local212 = this.anIntArray249[local202] * (256 - local202) / 256;
				local220 = 103 - local212;
				local183 += local212;
				for (local224 = 0; local224 < local220; local224++) {
					local228 = this.anIntArray226[local181++];
					if (local228 == 0) {
						local183++;
					} else {
						local239 = local228;
						@Pc(369) int local369 = 256 - local228;
						local228 = this.anIntArray233[local228];
						@Pc(380) int local380 = this.aClass36_23.anIntArray145[local183];
						this.aClass36_23.anIntArray145[local183++] = ((local228 & 0xFF00FF) * local239 + (local380 & 0xFF00FF) * local369 & 0xFF00FF00) + ((local228 & 0xFF00) * local239 + (local380 & 0xFF00) * local369 & 0xFF0000) >> 8;
					}
				}
				local181 += 128 - local220;
				local183 += 128 - local220 - local212;
			}
			this.aClass36_23.method504((byte) 9, 0, 637, super.aGraphics2);
		} catch (@Pc(452) RuntimeException local452) {
			signlink.reporterror("44586, " + 0 + ", " + local452.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method653() {
		try {
			for (@Pc(3) int local3 = -1; local3 < this.anInt960; local3++) {
				@Pc(11) int local11;
				if (local3 == -1) {
					local11 = this.anInt959;
				} else {
					local11 = this.anIntArray246[local3];
				}
				@Pc(23) Class1_Sub1_Sub1_Sub1_Sub1 local23 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local11];
				if (local23 != null) {
					this.method597(1, local23);
				}
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("96955, " + 16835 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method654(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 18224) {
				this.anInt1032 = -1;
			}
			this.aClass1_Sub1_Sub3_6.method348(120);
			if (this.anInt889 != -1) {
				this.anInt889 = -1;
				this.aBoolean227 = true;
				this.aBoolean255 = false;
				this.aBoolean223 = true;
			}
			if (this.anInt885 != -1) {
				this.anInt885 = -1;
				this.aBoolean236 = true;
				this.aBoolean255 = false;
			}
			this.anInt938 = -1;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("40194, " + arg0 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method578() {
		try {
			this.aBoolean256 = true;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("62283, " + 0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!ULLVQOAK;)Z")
	private boolean method655(@OriginalArg(1) Class39 arg0) {
		try {
			if (arg0.anIntArray156 == null) {
				return false;
			}
			for (@Pc(6) int local6 = 0; local6 < arg0.anIntArray156.length; local6++) {
				@Pc(14) int local14 = this.method639(arg0, local6);
				@Pc(19) int local19 = arg0.anIntArray155[local6];
				if (arg0.anIntArray156[local6] == 2) {
					if (local14 >= local19) {
						return false;
					}
				} else if (arg0.anIntArray156[local6] == 3) {
					if (local14 <= local19) {
						return false;
					}
				} else if (arg0.anIntArray156[local6] == 4) {
					if (local14 == local19) {
						return false;
					}
				} else if (local14 != local19) {
					return false;
				}
			}
			return true;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("15642, " + false + ", " + arg0 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZZ)V")
	private void method656(@OriginalArg(0) boolean arg0) {
		try {
			if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt620 >> 7 == this.anInt965 && aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt621 >> 7 == this.anInt966) {
				this.anInt965 = 0;
			}
			@Pc(21) int local21 = this.anInt960;
			if (arg0) {
				local21 = 1;
			}
			for (@Pc(34) int local34 = 0; local34 < local21; local34++) {
				@Pc(40) Class1_Sub1_Sub1_Sub1_Sub1 local40;
				@Pc(45) int local45;
				if (arg0) {
					local40 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
					local45 = this.anInt959 << 14;
				} else {
					local40 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray246[local34]];
					local45 = this.anIntArray246[local34] << 14;
				}
				if (local40 != null && local40.method498()) {
					local40.aBoolean18 = false;
					if ((aBoolean253 && this.anInt960 > 50 || this.anInt960 > 200) && !arg0 && local40.anInt624 == local40.anInt630) {
						local40.aBoolean18 = true;
					}
					@Pc(96) int local96 = local40.anInt620 >> 7;
					@Pc(101) int local101 = local40.anInt621 >> 7;
					if (local96 >= 0 && local96 < 104 && local101 >= 0 && local101 < 104) {
						if (local40.aClass1_Sub1_Sub1_Sub4_1 == null || anInt931 < local40.anInt109 || anInt931 >= local40.anInt110) {
							if ((local40.anInt620 & 0x7F) == 64 && (local40.anInt621 & 0x7F) == 64) {
								if (this.anIntArrayArray22[local96][local101] == this.anInt910) {
									continue;
								}
								this.anIntArrayArray22[local96][local101] = this.anInt910;
							}
							local40.anInt113 = this.method705(local40.anInt621, this.anInt972, local40.anInt620);
							this.aClass5_1.method53(this.anInt972, 60, local40.anInt620, (byte) 7, local40.anInt113, local45, local40.anInt621, local40.aBoolean159, local40.anInt622, local40);
						} else {
							local40.aBoolean18 = false;
							local40.anInt113 = this.method705(local40.anInt621, this.anInt972, local40.anInt620);
							this.aClass5_1.method54(local40.anInt116, local40, local40.anInt118, local40.anInt119, local40.anInt113, local40.anInt621, this.anInt972, local40.anInt117, local40.anInt622, local45, local40.anInt620);
						}
					}
				}
			}
		} catch (@Pc(230) RuntimeException local230) {
			signlink.reporterror("9669, " + arg0 + ", " + true + ", " + local230.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method657() {
		try {
			this.aClass36_13.method503();
			@Pc(18) int local18;
			@Pc(20) int local20;
			if (this.anInt857 == 2) {
				@Pc(13) byte[] local13 = this.aClass1_Sub1_Sub2_Sub4_2.aByteArray7;
				@Pc(15) int[] local15 = Class1_Sub1_Sub2.anIntArray122;
				local18 = local13.length;
				for (local20 = 0; local20 < local18; local20++) {
					if (local13[local20] == 0) {
						local15[local20] = 0;
					}
				}
				this.aClass1_Sub1_Sub2_Sub1_7.method135(0, this.anInt864, 33, 25, 25, this.anIntArray244, 33, 0, this.anIntArray237, 256);
				this.aClass36_14.method503();
			} else {
				@Pc(64) int local64 = this.anInt864 + this.anInt1026 & 0x7FF;
				@Pc(71) int local71 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt620 / 32 + 48;
				local18 = 464 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt621 / 32;
				this.aClass1_Sub1_Sub2_Sub1_9.method135(25, local64, 151, local71, local18, this.anIntArray218, 146, 5, this.anIntArray269, this.anInt947 + 256);
				this.aClass1_Sub1_Sub2_Sub1_7.method135(0, this.anInt864, 33, 25, 25, this.anIntArray244, 33, 0, this.anIntArray237, 256);
				for (local20 = 0; local20 < this.anInt929; local20++) {
					local71 = this.anIntArray242[local20] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt620 / 32;
					local18 = this.anIntArray243[local20] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt621 / 32;
					this.method647(local71, local18, this.aClass1_Sub1_Sub2_Sub1Array7[local20]);
				}
				@Pc(171) int local171;
				for (@Pc(167) int local167 = 0; local167 < 104; local167++) {
					for (local171 = 0; local171 < 104; local171++) {
						@Pc(183) Class23 local183 = this.aClass23ArrayArrayArray1[this.anInt972][local167][local171];
						if (local183 != null) {
							local71 = local167 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt620 / 32;
							local18 = local171 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt621 / 32;
							this.method647(local71, local18, this.aClass1_Sub1_Sub2_Sub1_12);
						}
					}
				}
				for (local171 = 0; local171 < this.anInt1036; local171++) {
					@Pc(234) Class1_Sub1_Sub1_Sub1_Sub2 local234 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray265[local171]];
					if (local234 != null && local234.method498()) {
						@Pc(243) Class49 local243 = local234.aClass49_2;
						if (local243.anIntArray207 != null) {
							local243 = local243.method567();
						}
						if (local243 != null && local243.aBoolean207 && local243.aBoolean206) {
							local71 = local234.anInt620 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt620 / 32;
							local18 = local234.anInt621 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt621 / 32;
							this.method647(local71, local18, this.aClass1_Sub1_Sub2_Sub1_13);
						}
					}
				}
				@Pc(302) Class1_Sub1_Sub1_Sub1_Sub1 local302;
				for (@Pc(292) int local292 = 0; local292 < this.anInt960; local292++) {
					local302 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray246[local292]];
					if (local302 != null && local302.method498()) {
						local71 = local302.anInt620 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt620 / 32;
						local18 = local302.anInt621 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt621 / 32;
						@Pc(330) boolean local330 = false;
						@Pc(334) long local334 = Class15.method194(local302.aString3);
						for (@Pc(336) int local336 = 0; local336 < this.anInt1037; local336++) {
							if (local334 == this.aLongArray4[local336] && this.anIntArray216[local336] != 0) {
								local330 = true;
								break;
							}
						}
						@Pc(361) boolean local361 = false;
						if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt112 != 0 && local302.anInt112 != 0 && aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt112 == local302.anInt112) {
							local361 = true;
						}
						if (local330) {
							this.method647(local71, local18, this.aClass1_Sub1_Sub2_Sub1_15);
						} else if (local361) {
							this.method647(local71, local18, this.aClass1_Sub1_Sub2_Sub1_16);
						} else {
							this.method647(local71, local18, this.aClass1_Sub1_Sub2_Sub1_14);
						}
					}
				}
				if (this.anInt1008 != 0 && anInt931 % 20 < 10) {
					if (this.anInt1008 == 1 && this.anInt944 >= 0 && this.anInt944 < this.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length) {
						@Pc(435) Class1_Sub1_Sub1_Sub1_Sub2 local435 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anInt944];
						if (local435 != null) {
							local71 = local435.anInt620 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt620 / 32;
							local18 = local435.anInt621 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt621 / 32;
							this.method624(local71, local18, this.aClass1_Sub1_Sub2_Sub1_6);
						}
					}
					if (this.anInt1008 == 2) {
						local71 = (this.anInt951 - this.anInt924) * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt620 / 32;
						local18 = (this.anInt952 - this.anInt925) * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt621 / 32;
						this.method624(local71, local18, this.aClass1_Sub1_Sub2_Sub1_6);
					}
					if (this.anInt1008 == 10 && this.anInt1000 >= 0 && this.anInt1000 < this.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length) {
						local302 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anInt1000];
						if (local302 != null) {
							local71 = local302.anInt620 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt620 / 32;
							local18 = local302.anInt621 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt621 / 32;
							this.method624(local71, local18, this.aClass1_Sub1_Sub2_Sub1_6);
						}
					}
				}
				if (this.anInt965 != 0) {
					local71 = this.anInt965 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt620 / 32;
					local18 = this.anInt966 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt621 / 32;
					this.method647(local71, local18, this.aClass1_Sub1_Sub2_Sub1_5);
				}
				Class1_Sub1_Sub2.method405(16777215, 3, 97, 78, 3);
				this.aClass36_14.method503();
			}
		} catch (@Pc(600) RuntimeException local600) {
			signlink.reporterror("88971, " + false + ", " + local600.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method658() {
		try {
			this.anInt1031 += 0;
			while (true) {
				@Pc(11) Class1_Sub1_Sub4 local11 = this.aClass16_Sub1_1.method224();
				if (local11 == null) {
					return;
				}
				if (local11.anInt743 == 0) {
					Class1_Sub1_Sub1_Sub4.method268(local11.aByteArray19, local11.anInt742);
					if ((this.aClass16_Sub1_1.method209(anInt933, local11.anInt742) & 0x62) != 0) {
						this.aBoolean227 = true;
						if (this.anInt885 != -1) {
							this.aBoolean236 = true;
						}
					}
				}
				if (local11.anInt743 == 1 && local11.aByteArray19 != null) {
					Class37.method507(local11.aByteArray19);
				}
				if (local11.anInt743 == 2 && local11.anInt742 == this.anInt872 && local11.aByteArray19 != null) {
					this.method593(this.aBoolean219, local11.aByteArray19);
				}
				if (local11.anInt743 == 3 && this.anInt1025 == 1) {
					for (@Pc(82) int local82 = 0; local82 < this.aByteArrayArray4.length; local82++) {
						if (this.anIntArray257[local82] == local11.anInt742) {
							this.aByteArrayArray4[local82] = local11.aByteArray19;
							if (local11.aByteArray19 == null) {
								this.anIntArray257[local82] = -1;
							}
							break;
						}
						if (this.anIntArray258[local82] == local11.anInt742) {
							this.aByteArrayArray5[local82] = local11.aByteArray19;
							if (local11.aByteArray19 == null) {
								this.anIntArray258[local82] = -1;
							}
							break;
						}
					}
				}
				if (local11.anInt743 == 93 && this.aClass16_Sub1_1.method219(local11.anInt742)) {
					Class19.method304(new Class1_Sub1_Sub3(local11.aByteArray19, anInt1013), this.aClass16_Sub1_1);
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("34971, " + 0 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method659() {
		try {
			if (this.anInt919 == 0) {
				this.aStringArray9[0] = "Cancel";
				this.anIntArray252[0] = 1845;
				this.anInt1019 = 1;
				this.method684(this.aBoolean251);
				this.anInt871 = 0;
				if (super.anInt834 > 4 && super.anInt835 > 4 && super.anInt834 < 516 && super.anInt835 < 338) {
					if (this.anInt938 == -1) {
						this.method697();
					} else {
						this.method588(0, 4, super.anInt834, Class39.aClass39Array1[this.anInt938], 4, super.anInt835);
					}
				}
				if (this.anInt871 != this.anInt975) {
					this.anInt975 = this.anInt871;
				}
				this.anInt871 = 0;
				if (super.anInt834 > 553 && super.anInt835 > 205 && super.anInt834 < 743 && super.anInt835 < 466) {
					if (this.anInt889 != -1) {
						this.method588(0, 205, super.anInt834, Class39.aClass39Array1[this.anInt889], 553, super.anInt835);
					} else if (this.anIntArray255[this.anInt992] != -1) {
						this.method588(0, 205, super.anInt834, Class39.aClass39Array1[this.anIntArray255[this.anInt992]], 553, super.anInt835);
					}
				}
				if (this.anInt871 != this.anInt998) {
					this.aBoolean227 = true;
					this.anInt998 = this.anInt871;
				}
				this.anInt871 = 0;
				if (super.anInt834 > 17 && super.anInt835 > 357 && super.anInt834 < 496 && super.anInt835 < 453) {
					if (this.anInt885 != -1) {
						this.method588(0, 357, super.anInt834, Class39.aClass39Array1[this.anInt885], 17, super.anInt835);
					} else if (super.anInt835 < 434 && super.anInt834 < 426) {
						this.method605(super.anInt834 - 17, super.anInt835 - 357);
					}
				}
				if (this.anInt885 != -1 && this.anInt871 != this.anInt1051) {
					this.aBoolean236 = true;
					this.anInt1051 = this.anInt871;
				}
				@Pc(230) boolean local230 = false;
				while (!local230) {
					local230 = true;
					for (@Pc(236) int local236 = 0; local236 < this.anInt1019 - 1; local236++) {
						if (this.anIntArray252[local236] < 1000 && this.anIntArray252[local236 + 1] > 1000) {
							@Pc(257) String local257 = this.aStringArray9[local236];
							this.aStringArray9[local236] = this.aStringArray9[local236 + 1];
							this.aStringArray9[local236 + 1] = local257;
							@Pc(279) int local279 = this.anIntArray252[local236];
							this.anIntArray252[local236] = this.anIntArray252[local236 + 1];
							this.anIntArray252[local236 + 1] = local279;
							@Pc(301) int local301 = this.anIntArray250[local236];
							this.anIntArray250[local236] = this.anIntArray250[local236 + 1];
							this.anIntArray250[local236 + 1] = local301;
							@Pc(323) int local323 = this.anIntArray251[local236];
							this.anIntArray251[local236] = this.anIntArray251[local236 + 1];
							this.anIntArray251[local236 + 1] = local323;
							@Pc(345) int local345 = this.anIntArray253[local236];
							this.anIntArray253[local236] = this.anIntArray253[local236 + 1];
							this.anIntArray253[local236 + 1] = local345;
							local230 = false;
						}
					}
				}
			}
		} catch (@Pc(375) RuntimeException local375) {
			signlink.reporterror("39050, " + -110 + ", " + local375.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method660(@OriginalArg(0) byte arg0) {
		try {
			this.aClass36_12.method503();
			if (this.aByte46 == 5) {
				@Pc(11) boolean local11 = false;
			} else {
				this.anInt1032 = this.aClass1_Sub1_Sub3_7.method359();
			}
			Class1_Sub1_Sub2_Sub3.anIntArray55 = this.anIntArray240;
			this.aClass1_Sub1_Sub2_Sub4_1.method417(448, 0, 0);
			if (this.anInt889 != -1) {
				this.method704(0, Class39.aClass39Array1[this.anInt889], 0, 0);
			} else if (this.anIntArray255[this.anInt992] != -1) {
				this.method704(0, Class39.aClass39Array1[this.anIntArray255[this.anInt992]], 0, 0);
			}
			if (this.aBoolean244 && this.anInt977 == 1) {
				this.method668();
			}
			this.aClass36_12.method504((byte) 9, 205, 553, super.aGraphics2);
			this.aClass36_14.method503();
			Class1_Sub1_Sub2_Sub3.anIntArray55 = this.anIntArray241;
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("56032, " + arg0 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
	private void method661(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass1_Sub1_Sub2_Sub1_9.anIntArray30;
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
						this.aClass5_1.method77(local5, local34, arg0, local36, local22);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local36][local22] & 0x8) != 0) {
						this.aClass5_1.method77(local5, local34, arg0 + 1, local36, local22);
					}
					local34 += 4;
				}
			}
			local34 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			this.aBoolean241 &= true;
			local36 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass1_Sub1_Sub2_Sub1_9.method126();
			@Pc(152) int local152;
			for (@Pc(148) int local148 = 1; local148 < 103; local148++) {
				for (local152 = 1; local152 < 103; local152++) {
					if ((this.aByteArrayArrayArray8[arg0][local152][local148] & 0x18) == 0) {
						this.method641(local152, local34, arg0, local36, local148);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local152][local148] & 0x8) != 0) {
						this.method641(local152, local34, arg0 + 1, local36, local148);
					}
				}
			}
			this.aClass36_14.method503();
			this.anInt929 = 0;
			for (local152 = 0; local152 < 104; local152++) {
				for (@Pc(220) int local220 = 0; local220 < 104; local220++) {
					@Pc(230) int local230 = this.aClass5_1.method71(this.anInt972, local152, local220);
					if (local230 != 0) {
						local230 = local230 >> 14 & 0x7FFF;
						@Pc(242) int local242 = Class40.method529(local230).anInt725;
						if (local242 >= 0) {
							@Pc(246) int local246 = local152;
							@Pc(248) int local248 = local220;
							if (local242 != 22 && local242 != 29 && local242 != 34 && local242 != 36 && local242 != 46 && local242 != 47 && local242 != 48) {
								@Pc(280) int[][] local280 = this.aClass14Array1[this.anInt972].anIntArrayArray5;
								for (@Pc(282) int local282 = 0; local282 < 10; local282++) {
									@Pc(289) int local289 = (int) (Math.random() * 4.0D);
									if (local289 == 0 && local246 > 0 && local246 > local152 - 3 && (local280[local246 - 1][local248] & 0x1280108) == 0) {
										local246--;
									}
									if (local289 == 1 && local246 < 103 && local246 < local152 + 3 && (local280[local246 + 1][local248] & 0x1280180) == 0) {
										local246++;
									}
									if (local289 == 2 && local248 > 0 && local248 > local220 - 3 && (local280[local246][local248 - 1] & 0x1280102) == 0) {
										local248--;
									}
									if (local289 == 3 && local248 < 103 && local248 < local220 + 3 && (local280[local246][local248 + 1] & 0x1280120) == 0) {
										local248++;
									}
								}
							}
							this.aClass1_Sub1_Sub2_Sub1Array7[this.anInt929] = this.aClass1_Sub1_Sub2_Sub1Array5[local242];
							this.anIntArray242[this.anInt929] = local246;
							this.anIntArray243[this.anInt929] = local248;
							this.anInt929++;
						}
					}
				}
			}
		} catch (@Pc(419) RuntimeException local419) {
			signlink.reporterror("90920, " + arg0 + ", " + true + ", " + local419.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBIIIZIIIII)Z")
	private boolean method662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray25[local7][local11] = 0;
					this.anIntArrayArray24[local7][local11] = 99999999;
				}
			}
			local11 = arg1;
			@Pc(39) int local39 = arg11;
			this.anIntArrayArray25[arg1][arg11] = 99;
			if (arg2 != 1) {
				throw new NullPointerException();
			}
			@Pc(51) boolean local51 = false;
			this.anIntArrayArray24[arg1][arg11] = 0;
			@Pc(65) byte local65 = 0;
			@Pc(67) int local67 = 0;
			this.anIntArray259[0] = arg1;
			int var30 = local65 + 1;
			this.anIntArray260[0] = arg11;
			@Pc(80) boolean local80 = false;
			@Pc(84) int local84 = this.anIntArray259.length;
			@Pc(91) int[][] local91 = this.aClass14Array1[this.anInt972].anIntArrayArray5;
			@Pc(203) int local203;
			while (local67 != var30) {
				local11 = this.anIntArray259[local67];
				local39 = this.anIntArray260[local67];
				local67 = (local67 + 1) % local84;
				if (local11 == arg0 && local39 == arg9) {
					local80 = true;
					break;
				}
				if (arg10 != 0) {
					if ((arg10 < 5 || arg10 == 10) && this.aClass14Array1[this.anInt972].method161(local39, arg9, arg10 - 1, arg0, local11, arg3)) {
						local80 = true;
						break;
					}
					if (arg10 < 10 && this.aClass14Array1[this.anInt972].method162(arg9, arg3, arg10 - 1, local39, arg0, local11)) {
						local80 = true;
						break;
					}
				}
				if (arg4 != 0 && arg8 != 0 && this.aClass14Array1[this.anInt972].method163(arg8, 86, arg0, arg5, local11, arg4, local39, arg9)) {
					local80 = true;
					break;
				}
				local203 = this.anIntArrayArray24[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray25[local11 - 1][local39] == 0 && (local91[local11 - 1][local39] & 0x1280108) == 0) {
					this.anIntArray259[var30] = local11 - 1;
					this.anIntArray260[var30] = local39;
					var30 = (var30 + 1) % local84;
					this.anIntArrayArray25[local11 - 1][local39] = 2;
					this.anIntArrayArray24[local11 - 1][local39] = local203;
				}
				if (local11 < 103 && this.anIntArrayArray25[local11 + 1][local39] == 0 && (local91[local11 + 1][local39] & 0x1280180) == 0) {
					this.anIntArray259[var30] = local11 + 1;
					this.anIntArray260[var30] = local39;
					var30 = (var30 + 1) % local84;
					this.anIntArrayArray25[local11 + 1][local39] = 8;
					this.anIntArrayArray24[local11 + 1][local39] = local203;
				}
				if (local39 > 0 && this.anIntArrayArray25[local11][local39 - 1] == 0 && (local91[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray259[var30] = local11;
					this.anIntArray260[var30] = local39 - 1;
					var30 = (var30 + 1) % local84;
					this.anIntArrayArray25[local11][local39 - 1] = 1;
					this.anIntArrayArray24[local11][local39 - 1] = local203;
				}
				if (local39 < 103 && this.anIntArrayArray25[local11][local39 + 1] == 0 && (local91[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray259[var30] = local11;
					this.anIntArray260[var30] = local39 + 1;
					var30 = (var30 + 1) % local84;
					this.anIntArrayArray25[local11][local39 + 1] = 4;
					this.anIntArrayArray24[local11][local39 + 1] = local203;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray25[local11 - 1][local39 - 1] == 0 && (local91[local11 - 1][local39 - 1] & 0x128010E) == 0 && (local91[local11 - 1][local39] & 0x1280108) == 0 && (local91[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray259[var30] = local11 - 1;
					this.anIntArray260[var30] = local39 - 1;
					var30 = (var30 + 1) % local84;
					this.anIntArrayArray25[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray24[local11 - 1][local39 - 1] = local203;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray25[local11 + 1][local39 - 1] == 0 && (local91[local11 + 1][local39 - 1] & 0x1280183) == 0 && (local91[local11 + 1][local39] & 0x1280180) == 0 && (local91[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray259[var30] = local11 + 1;
					this.anIntArray260[var30] = local39 - 1;
					var30 = (var30 + 1) % local84;
					this.anIntArrayArray25[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray24[local11 + 1][local39 - 1] = local203;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray25[local11 - 1][local39 + 1] == 0 && (local91[local11 - 1][local39 + 1] & 0x1280138) == 0 && (local91[local11 - 1][local39] & 0x1280108) == 0 && (local91[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray259[var30] = local11 - 1;
					this.anIntArray260[var30] = local39 + 1;
					var30 = (var30 + 1) % local84;
					this.anIntArrayArray25[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray24[local11 - 1][local39 + 1] = local203;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray25[local11 + 1][local39 + 1] == 0 && (local91[local11 + 1][local39 + 1] & 0x12801E0) == 0 && (local91[local11 + 1][local39] & 0x1280180) == 0 && (local91[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray259[var30] = local11 + 1;
					this.anIntArray260[var30] = local39 + 1;
					var30 = (var30 + 1) % local84;
					this.anIntArrayArray25[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray24[local11 + 1][local39 + 1] = local203;
				}
			}
			this.anInt1059 = 0;
			@Pc(819) int local819;
			@Pc(825) int local825;
			@Pc(831) int local831;
			if (!local80) {
				if (arg6) {
					local203 = 100;
					for (local819 = 1; local819 < 2; local819++) {
						for (local825 = arg0 - local819; local825 <= arg0 + local819; local825++) {
							for (local831 = arg9 - local819; local831 <= arg9 + local819; local831++) {
								if (local825 >= 0 && local831 >= 0 && local825 < 104 && local831 < 104 && this.anIntArrayArray24[local825][local831] < local203) {
									local203 = this.anIntArrayArray24[local825][local831];
									local11 = local825;
									local39 = local831;
									this.anInt1059 = 1;
									local80 = true;
								}
							}
						}
						if (local80) {
							break;
						}
					}
				}
				if (!local80) {
					return false;
				}
			}
			@Pc(892) byte local892 = 0;
			this.anIntArray259[0] = local11;
			local67 = local892 + 1;
			this.anIntArray260[0] = local39;
			local203 = local819 = this.anIntArrayArray25[local11][local39];
			while (local11 != arg1 || local39 != arg11) {
				if (local203 != local819) {
					local819 = local203;
					this.anIntArray259[local67] = local11;
					this.anIntArray260[local67++] = local39;
				}
				if ((local203 & 0x2) != 0) {
					local11++;
				} else if ((local203 & 0x8) != 0) {
					local11--;
				}
				if ((local203 & 0x1) != 0) {
					local39++;
				} else if ((local203 & 0x4) != 0) {
					local39--;
				}
				local203 = this.anIntArrayArray25[local11][local39];
			}
			if (local67 > 0) {
				local84 = local67;
				if (local67 > 25) {
					local84 = 25;
				}
				local67--;
				local825 = this.anIntArray259[local67];
				local831 = this.anIntArray260[local67];
				anInt912++;
				if (anInt912 >= 133) {
					this.aClass1_Sub1_Sub3_6.method348(229);
					this.aClass1_Sub1_Sub3_6.method350(47151);
					anInt912 = 0;
				}
				if (arg7 == 0) {
					this.aClass1_Sub1_Sub3_6.method348(22);
					this.aClass1_Sub1_Sub3_6.method349(local84 + local84 + 3);
				}
				if (arg7 == 1) {
					this.aClass1_Sub1_Sub3_6.method348(212);
					this.aClass1_Sub1_Sub3_6.method349(local84 + local84 + 3 + 14);
				}
				if (arg7 == 2) {
					this.aClass1_Sub1_Sub3_6.method348(162);
					this.aClass1_Sub1_Sub3_6.method349(local84 + local84 + 3);
				}
				this.aClass1_Sub1_Sub3_6.method349(super.anIntArray210[5] == 1 ? 1 : 0);
				this.anInt965 = this.anIntArray259[0];
				this.anInt966 = this.anIntArray260[0];
				for (@Pc(1080) int local1080 = 1; local1080 < local84; local1080++) {
					local67--;
					this.aClass1_Sub1_Sub3_6.method349(this.anIntArray259[local67] - local825);
					this.aClass1_Sub1_Sub3_6.method349(this.anIntArray260[local67] - local831);
				}
				this.aClass1_Sub1_Sub3_6.method385(local825 + this.anInt924);
				this.aClass1_Sub1_Sub3_6.method385(local831 + this.anInt925);
				return true;
			} else if (arg7 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1131) RuntimeException local1131) {
			signlink.reporterror("57054, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local1131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BIILjava/lang/String;ILjava/lang/String;)Lclient!SPZBTZXL;")
	private Class35 method663(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			@Pc(3) byte[] local3 = null;
			@Pc(5) int local5 = 5;
			try {
				if (this.aClass34Array1[0] != null) {
					local3 = this.aClass34Array1[0].method486(arg0);
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
				return new Class35(local3, 603);
			}
			local34 = 0;
			while (local3 == null) {
				@Pc(55) String local55 = "Unknown error";
				this.method581("Requesting " + arg2, arg3);
				@Pc(70) int local70;
				try {
					local70 = 0;
					@Pc(81) DataInputStream local81 = this.method670(arg4 + arg1);
					@Pc(84) byte[] local84 = new byte[6];
					local81.readFully(local84, 0, 6);
					@Pc(95) Class1_Sub1_Sub3 local95 = new Class1_Sub1_Sub3(local84, anInt1013);
					local95.anInt443 = 3;
					@Pc(103) int local103 = local95.method363() + 6;
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
							this.method581("Loading " + arg2 + " - " + local168 + "%", arg3);
						}
						local70 = local168;
					}
					local81.close();
					try {
						if (this.aClass34Array1[0] != null) {
							this.aClass34Array1[0].method487(local3, arg0, 103, local3.length);
						}
					} catch (@Pc(213) Exception local213) {
						this.aClass34Array1[0] = null;
					}
					if (local3 != null) {
						this.aCRC32_2.reset();
						this.aCRC32_2.update(local3);
						local128 = (int) this.aCRC32_2.getValue();
						if (local128 != arg1) {
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
							this.method581("Game updated - please reload page", arg3);
							local70 = 10;
						} else {
							this.method581(local55 + " - Retrying in " + local70, arg3);
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
					this.aBoolean242 = !this.aBoolean242;
				}
			}
			@Pc(349) Class35 local349 = new Class35(local3, 603);
			if (this.aByte45 != 0) {
				throw new NullPointerException();
			}
			return local349;
		} catch (@Pc(360) RuntimeException local360) {
			signlink.reporterror("16221, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local360.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V")
	private void method664(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				if (this.anInt877 != 0) {
					this.anInt877 = 0;
					this.aBoolean236 = true;
				}
				@Pc(18) int local18 = this.anIntArray250[arg0];
				@Pc(23) int local23 = this.anIntArray251[arg0];
				@Pc(28) int local28 = this.anIntArray252[arg0];
				@Pc(33) int local33 = this.anIntArray253[arg0];
				if (local28 >= 2000) {
					local28 -= 2000;
				}
				if (local28 == 584 && this.method703(local18, local23, local33)) {
					this.aClass1_Sub1_Sub3_6.method348(65);
					this.aClass1_Sub1_Sub3_6.method384(local33 >> 14 & 0x7FFF);
					this.aClass1_Sub1_Sub3_6.method384(this.anInt855);
					this.aClass1_Sub1_Sub3_6.method383(this.anInt949, this.anInt854);
					this.aClass1_Sub1_Sub3_6.method383(this.anInt949, local18 + this.anInt924);
					this.aClass1_Sub1_Sub3_6.method385(this.anInt856);
					this.aClass1_Sub1_Sub3_6.method383(this.anInt949, local23 + this.anInt925);
				}
				@Pc(114) Class39 local114;
				@Pc(132) int local132;
				if (local28 == 682) {
					this.aClass1_Sub1_Sub3_6.method348(188);
					this.aClass1_Sub1_Sub3_6.method350(local23);
					local114 = Class39.aClass39Array1[local23];
					if (local114.anIntArrayArray19 != null && local114.anIntArrayArray19[0][0] == 5) {
						local132 = local114.anIntArrayArray19[0][1];
						this.anIntArray267[local132] = 1 - this.anIntArray267[local132];
						this.method621(local132);
						this.aBoolean227 = true;
					}
				}
				if (local28 == 822) {
					this.aClass1_Sub1_Sub3_6.method348(88);
					this.aClass1_Sub1_Sub3_6.method385(local18);
					this.aClass1_Sub1_Sub3_6.method383(this.anInt949, local33);
					this.aClass1_Sub1_Sub3_6.method384(local23);
					this.anInt988 = 0;
					this.anInt989 = local23;
					this.anInt990 = local18;
					this.anInt991 = 2;
					if (Class39.aClass39Array1[local23].anInt703 == this.anInt938) {
						this.anInt991 = 1;
					}
					if (Class39.aClass39Array1[local23].anInt703 == this.anInt885) {
						this.anInt991 = 3;
					}
				}
				@Pc(230) boolean local230;
				if (local28 == 978) {
					local230 = this.method662(local18, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray140[0], this.aByte38, 0, 0, 0, false, 2, 0, local23, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray141[0]);
					if (!local230) {
						this.method662(local18, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray140[0], this.aByte38, 0, 1, 0, false, 2, 1, local23, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray141[0]);
					}
					this.anInt845 = super.anInt840;
					this.anInt846 = super.anInt841;
					this.anInt848 = 2;
					this.anInt847 = 0;
					this.aClass1_Sub1_Sub3_6.method348(204);
					this.aClass1_Sub1_Sub3_6.method383(this.anInt949, local23 + this.anInt925);
					this.aClass1_Sub1_Sub3_6.method385(local18 + this.anInt924);
					this.aClass1_Sub1_Sub3_6.method350(local33);
				}
				@Pc(302) Class1_Sub1_Sub1_Sub1_Sub1 local302;
				if (local28 == 345) {
					local302 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
					if (local302 != null) {
						this.method662(local302.anIntArray140[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray140[0], this.aByte38, 0, 1, 0, false, 2, 1, local302.anIntArray141[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray141[0]);
						this.anInt845 = super.anInt840;
						this.anInt846 = super.anInt841;
						this.anInt848 = 2;
						this.anInt847 = 0;
						this.aClass1_Sub1_Sub3_6.method348(154);
						this.aClass1_Sub1_Sub3_6.method350(local33);
					}
				}
				if (local28 == 329) {
					this.method703(local18, local23, local33);
					this.aClass1_Sub1_Sub3_6.method348(233);
					this.aClass1_Sub1_Sub3_6.method350(local33 >> 14 & 0x7FFF);
					this.aClass1_Sub1_Sub3_6.method383(this.anInt949, local23 + this.anInt925);
					this.aClass1_Sub1_Sub3_6.method384(local18 + this.anInt924);
				}
				if (local28 == 787) {
					this.anInt853 = 1;
					this.anInt854 = local18;
					this.anInt855 = local23;
					this.anInt856 = local33;
					this.aString18 = Class21.method335(local33).aString6;
					this.anInt849 = 0;
					this.aBoolean227 = true;
				} else {
					if (local28 == 84) {
						if (this.aBoolean244) {
							this.aClass5_1.method80(local18 - 4, local23 - 4);
						} else {
							this.aClass5_1.method80(super.anInt840 - 4, super.anInt841 - 4);
						}
					}
					if (local28 == 348) {
						local302 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
						if (local302 != null) {
							this.method662(local302.anIntArray140[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray140[0], this.aByte38, 0, 1, 0, false, 2, 1, local302.anIntArray141[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray141[0]);
							this.anInt845 = super.anInt840;
							this.anInt846 = super.anInt841;
							this.anInt848 = 2;
							this.anInt847 = 0;
							this.aClass1_Sub1_Sub3_6.method348(70);
							this.aClass1_Sub1_Sub3_6.method385(this.anInt850);
							this.aClass1_Sub1_Sub3_6.method383(this.anInt949, local33);
						}
					}
					if (local28 == 914) {
						this.aClass1_Sub1_Sub3_6.method348(6);
						this.aClass1_Sub1_Sub3_6.method385(local23);
						this.aClass1_Sub1_Sub3_6.method350(local33);
						this.aClass1_Sub1_Sub3_6.method383(this.anInt949, local18);
						this.anInt988 = 0;
						this.anInt989 = local23;
						this.anInt990 = local18;
						this.anInt991 = 2;
						if (Class39.aClass39Array1[local23].anInt703 == this.anInt938) {
							this.anInt991 = 1;
						}
						if (Class39.aClass39Array1[local23].anInt703 == this.anInt885) {
							this.anInt991 = 3;
						}
					}
					if (local28 == 568) {
						this.aClass1_Sub1_Sub3_6.method348(60);
						this.aClass1_Sub1_Sub3_6.method385(local23);
						this.aClass1_Sub1_Sub3_6.method383(this.anInt949, local33);
						this.aClass1_Sub1_Sub3_6.method384(local18);
						this.anInt988 = 0;
						this.anInt989 = local23;
						this.anInt990 = local18;
						this.anInt991 = 2;
						if (Class39.aClass39Array1[local23].anInt703 == this.anInt938) {
							this.anInt991 = 1;
						}
						if (Class39.aClass39Array1[local23].anInt703 == this.anInt885) {
							this.anInt991 = 3;
						}
					}
					if (local28 == 492) {
						local302 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
						if (local302 != null) {
							this.method662(local302.anIntArray140[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray140[0], this.aByte38, 0, 1, 0, false, 2, 1, local302.anIntArray141[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray141[0]);
							this.anInt845 = super.anInt840;
							this.anInt846 = super.anInt841;
							this.anInt848 = 2;
							this.anInt847 = 0;
							this.aClass1_Sub1_Sub3_6.method348(55);
							this.aClass1_Sub1_Sub3_6.method383(this.anInt949, local33);
						}
					}
					if (local28 == 589) {
						this.aClass1_Sub1_Sub3_6.method348(192);
						this.aClass1_Sub1_Sub3_6.method385(local23);
						this.aClass1_Sub1_Sub3_6.method350(local33);
						this.aClass1_Sub1_Sub3_6.method383(this.anInt949, local18);
						this.anInt988 = 0;
						this.anInt989 = local23;
						this.anInt990 = local18;
						this.anInt991 = 2;
						if (Class39.aClass39Array1[local23].anInt703 == this.anInt938) {
							this.anInt991 = 1;
						}
						if (Class39.aClass39Array1[local23].anInt703 == this.anInt885) {
							this.anInt991 = 3;
						}
					}
					@Pc(781) String local781;
					@Pc(758) Class1_Sub1_Sub1_Sub1_Sub2 local758;
					if (local28 == 1713) {
						local758 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
						if (local758 != null) {
							@Pc(763) Class49 local763 = local758.aClass49_2;
							if (local763.anIntArray207 != null) {
								local763 = local763.method567();
							}
							if (local763 != null) {
								if (local763.aByteArray20 == null) {
									local781 = "It's a " + local763.aString16 + ".";
								} else {
									local781 = new String(local763.aByteArray20);
								}
								this.method695("", 0, local781);
							}
						}
					}
					if (local28 == 100) {
						local230 = this.method662(local18, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray140[0], this.aByte38, 0, 0, 0, false, 2, 0, local23, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray141[0]);
						if (!local230) {
							this.method662(local18, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray140[0], this.aByte38, 0, 1, 0, false, 2, 1, local23, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray141[0]);
						}
						this.anInt845 = super.anInt840;
						this.anInt846 = super.anInt841;
						this.anInt848 = 2;
						this.anInt847 = 0;
						this.aClass1_Sub1_Sub3_6.method348(199);
						this.aClass1_Sub1_Sub3_6.method350(local33);
						this.aClass1_Sub1_Sub3_6.method384(local23 + this.anInt925);
						this.aClass1_Sub1_Sub3_6.method385(local18 + this.anInt924);
					}
					if (local28 == 552) {
						this.aClass1_Sub1_Sub3_6.method348(188);
						this.aClass1_Sub1_Sub3_6.method350(local23);
						local114 = Class39.aClass39Array1[local23];
						if (local114.anIntArrayArray19 != null && local114.anIntArrayArray19[0][0] == 5) {
							local132 = local114.anIntArrayArray19[0][1];
							if (this.anIntArray267[local132] != local114.anIntArray155[0]) {
								this.anIntArray267[local132] = local114.anIntArray155[0];
								this.method621(local132);
								this.aBoolean227 = true;
							}
						}
					}
					@Pc(971) int local971;
					@Pc(954) String local954;
					@Pc(969) long local969;
					if (local28 == 403) {
						local954 = this.aStringArray9[arg0];
						local132 = local954.indexOf("@whi@");
						if (local132 != -1) {
							local969 = Class15.method194(local954.substring(local132 + 5).trim());
							local971 = -1;
							for (@Pc(973) int local973 = 0; local973 < this.anInt1037; local973++) {
								if (this.aLongArray4[local973] == local969) {
									local971 = local973;
									break;
								}
							}
							if (local971 != -1 && this.anIntArray216[local971] > 0) {
								this.aBoolean236 = true;
								this.anInt877 = 0;
								this.aBoolean259 = true;
								this.aString24 = "";
								this.anInt886 = 3;
								this.aLong32 = this.aLongArray4[local971];
								this.aString26 = "Enter message to send to " + this.aStringArray10[local971];
							}
						}
					}
					if (local28 == 174) {
						local230 = this.method662(local18, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray140[0], this.aByte38, 0, 0, 0, false, 2, 0, local23, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray141[0]);
						if (!local230) {
							this.method662(local18, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray140[0], this.aByte38, 0, 1, 0, false, 2, 1, local23, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray141[0]);
						}
						this.anInt845 = super.anInt840;
						this.anInt846 = super.anInt841;
						this.anInt848 = 2;
						this.anInt847 = 0;
						this.aClass1_Sub1_Sub3_6.method348(137);
						this.aClass1_Sub1_Sub3_6.method385(local23 + this.anInt925);
						this.aClass1_Sub1_Sub3_6.method350(this.anInt850);
						this.aClass1_Sub1_Sub3_6.method384(local33);
						this.aClass1_Sub1_Sub3_6.method383(this.anInt949, local18 + this.anInt924);
					}
					if (local28 == 622 && !this.aBoolean255) {
						this.aClass1_Sub1_Sub3_6.method348(109);
						this.aClass1_Sub1_Sub3_6.method350(local23);
						this.aBoolean255 = true;
					}
					if (local28 == 943) {
						this.aClass1_Sub1_Sub3_6.method348(87);
						this.aClass1_Sub1_Sub3_6.method350(local33);
						this.aClass1_Sub1_Sub3_6.method384(local18);
						this.aClass1_Sub1_Sub3_6.method350(this.anInt850);
						this.aClass1_Sub1_Sub3_6.method350(local23);
						this.anInt988 = 0;
						this.anInt989 = local23;
						this.anInt990 = local18;
						this.anInt991 = 2;
						if (Class39.aClass39Array1[local23].anInt703 == this.anInt938) {
							this.anInt991 = 1;
						}
						if (Class39.aClass39Array1[local23].anInt703 == this.anInt885) {
							this.anInt991 = 3;
						}
					}
					if (local28 == 422) {
						if ((local18 & 0x3) == 0) {
							anInt903++;
						}
						if (anInt903 >= 132) {
							this.aClass1_Sub1_Sub3_6.method348(48);
							this.aClass1_Sub1_Sub3_6.method349(205);
							anInt903 = 0;
						}
						this.aClass1_Sub1_Sub3_6.method348(78);
						this.aClass1_Sub1_Sub3_6.method384(local33);
						this.aClass1_Sub1_Sub3_6.method383(this.anInt949, local18);
						this.aClass1_Sub1_Sub3_6.method384(local23);
						this.anInt988 = 0;
						this.anInt989 = local23;
						this.anInt990 = local18;
						this.anInt991 = 2;
						if (Class39.aClass39Array1[local23].anInt703 == this.anInt938) {
							this.anInt991 = 1;
						}
						if (Class39.aClass39Array1[local23].anInt703 == this.anInt885) {
							this.anInt991 = 3;
						}
					}
					if (local28 == 747) {
						local758 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
						if (local758 != null) {
							this.method662(local758.anIntArray140[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray140[0], this.aByte38, 0, 1, 0, false, 2, 1, local758.anIntArray141[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray141[0]);
							this.anInt845 = super.anInt840;
							this.anInt846 = super.anInt841;
							this.anInt848 = 2;
							this.anInt847 = 0;
							this.aClass1_Sub1_Sub3_6.method348(246);
							this.aClass1_Sub1_Sub3_6.method385(local33);
						}
					}
					if (local28 == 746) {
						local758 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
						if (local758 != null) {
							this.method662(local758.anIntArray140[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray140[0], this.aByte38, 0, 1, 0, false, 2, 1, local758.anIntArray141[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray141[0]);
							this.anInt845 = super.anInt840;
							this.anInt846 = super.anInt841;
							this.anInt848 = 2;
							this.anInt847 = 0;
							this.aClass1_Sub1_Sub3_6.method348(24);
							this.aClass1_Sub1_Sub3_6.method385(local33);
						}
					}
					if (local28 == 45) {
						local302 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
						if (local302 != null) {
							this.method662(local302.anIntArray140[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray140[0], this.aByte38, 0, 1, 0, false, 2, 1, local302.anIntArray141[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray141[0]);
							this.anInt845 = super.anInt840;
							this.anInt846 = super.anInt841;
							this.anInt848 = 2;
							this.anInt847 = 0;
							this.aClass1_Sub1_Sub3_6.method348(168);
							this.aClass1_Sub1_Sub3_6.method383(this.anInt949, local33);
						}
					}
					if (local28 == 200) {
						local954 = this.aStringArray9[arg0];
						local132 = local954.indexOf("@whi@");
						if (local132 != -1) {
							if (this.anInt938 == -1) {
								this.method654(this.anInt942);
								this.aString22 = local954.substring(local132 + 5).trim();
								this.aBoolean264 = false;
								for (@Pc(1504) int local1504 = 0; local1504 < Class39.aClass39Array1.length; local1504++) {
									if (Class39.aClass39Array1[local1504] != null && Class39.aClass39Array1[local1504].anInt701 == 600) {
										this.anInt1055 = this.anInt938 = Class39.aClass39Array1[local1504].anInt703;
										break;
									}
								}
							} else {
								this.method695("", 0, "Please close the interface you have open before using 'report abuse'");
							}
						}
					}
					if (local28 == 829) {
						this.aClass1_Sub1_Sub3_6.method348(61);
						this.aClass1_Sub1_Sub3_6.method350(this.anInt855);
						this.aClass1_Sub1_Sub3_6.method385(this.anInt856);
						this.aClass1_Sub1_Sub3_6.method385(this.anInt854);
						this.aClass1_Sub1_Sub3_6.method350(local23);
						this.aClass1_Sub1_Sub3_6.method385(local18);
						this.aClass1_Sub1_Sub3_6.method384(local33);
						this.anInt988 = 0;
						this.anInt989 = local23;
						this.anInt990 = local18;
						this.anInt991 = 2;
						if (Class39.aClass39Array1[local23].anInt703 == this.anInt938) {
							this.anInt991 = 1;
						}
						if (Class39.aClass39Array1[local23].anInt703 == this.anInt885) {
							this.anInt991 = 3;
						}
					}
					if (local28 == 718) {
						local758 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
						if (local758 != null) {
							this.method662(local758.anIntArray140[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray140[0], this.aByte38, 0, 1, 0, false, 2, 1, local758.anIntArray141[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray141[0]);
							this.anInt845 = super.anInt840;
							this.anInt846 = super.anInt841;
							this.anInt848 = 2;
							this.anInt847 = 0;
							this.aClass1_Sub1_Sub3_6.method348(110);
							this.aClass1_Sub1_Sub3_6.method350(local33);
							this.aClass1_Sub1_Sub3_6.method385(this.anInt855);
							this.aClass1_Sub1_Sub3_6.method383(this.anInt949, this.anInt856);
							this.aClass1_Sub1_Sub3_6.method350(this.anInt854);
						}
					}
					if (local28 == 1951) {
						@Pc(1699) int local1699 = local33 >> 14 & 0x7FFF;
						@Pc(1702) Class40 local1702 = Class40.method529(local1699);
						if (local1702.aByteArray18 == null) {
							local781 = "It's a " + local1702.aString14 + ".";
						} else {
							local781 = new String(local1702.aByteArray18);
						}
						this.method695("", 0, local781);
					}
					if (local28 == 748) {
						local230 = this.method662(local18, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray140[0], this.aByte38, 0, 0, 0, false, 2, 0, local23, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray141[0]);
						if (!local230) {
							this.method662(local18, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray140[0], this.aByte38, 0, 1, 0, false, 2, 1, local23, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray141[0]);
						}
						this.anInt845 = super.anInt840;
						this.anInt846 = super.anInt841;
						this.anInt848 = 2;
						this.anInt847 = 0;
						this.aClass1_Sub1_Sub3_6.method348(146);
						this.aClass1_Sub1_Sub3_6.method384(local33);
						this.aClass1_Sub1_Sub3_6.method383(this.anInt949, local18 + this.anInt924);
						this.aClass1_Sub1_Sub3_6.method383(this.anInt949, local23 + this.anInt925);
					}
					if (local28 == 144 && this.method703(local18, local23, local33)) {
						this.aClass1_Sub1_Sub3_6.method348(53);
						this.aClass1_Sub1_Sub3_6.method384(local23 + this.anInt925);
						this.aClass1_Sub1_Sub3_6.method385(local33 >> 14 & 0x7FFF);
						this.aClass1_Sub1_Sub3_6.method384(this.anInt850);
						this.aClass1_Sub1_Sub3_6.method385(local18 + this.anInt924);
					}
					if (local28 == 253) {
						local230 = this.method662(local18, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray140[0], this.aByte38, 0, 0, 0, false, 2, 0, local23, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray141[0]);
						if (!local230) {
							this.method662(local18, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray140[0], this.aByte38, 0, 1, 0, false, 2, 1, local23, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray141[0]);
						}
						this.anInt845 = super.anInt840;
						this.anInt846 = super.anInt841;
						this.anInt848 = 2;
						this.anInt847 = 0;
						this.aClass1_Sub1_Sub3_6.method348(252);
						this.aClass1_Sub1_Sub3_6.method384(local23 + this.anInt925);
						this.aClass1_Sub1_Sub3_6.method383(this.anInt949, local33);
						this.aClass1_Sub1_Sub3_6.method385(local18 + this.anInt924);
					}
					if (local28 == 394 || local28 == 76 || local28 == 484 || local28 == 215) {
						local954 = this.aStringArray9[arg0];
						local132 = local954.indexOf("@whi@");
						if (local132 != -1) {
							local969 = Class15.method194(local954.substring(local132 + 5).trim());
							if (local28 == 394) {
								this.method636(local969, 641);
							}
							if (local28 == 76) {
								this.method715(local969);
							}
							if (local28 == 484) {
								this.method615(local969);
							}
							if (local28 == 215) {
								this.method626(local969);
							}
						}
					}
					if (local28 == 726) {
						local230 = this.method662(local18, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray140[0], this.aByte38, 0, 0, 0, false, 2, 0, local23, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray141[0]);
						if (!local230) {
							this.method662(local18, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray140[0], this.aByte38, 0, 1, 0, false, 2, 1, local23, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray141[0]);
						}
						this.anInt845 = super.anInt840;
						this.anInt846 = super.anInt841;
						this.anInt848 = 2;
						this.anInt847 = 0;
						this.aClass1_Sub1_Sub3_6.method348(171);
						this.aClass1_Sub1_Sub3_6.method384(this.anInt854);
						this.aClass1_Sub1_Sub3_6.method350(local23 + this.anInt925);
						this.aClass1_Sub1_Sub3_6.method385(local33);
						this.aClass1_Sub1_Sub3_6.method384(this.anInt856);
						this.aClass1_Sub1_Sub3_6.method385(local18 + this.anInt924);
						this.aClass1_Sub1_Sub3_6.method350(this.anInt855);
					}
					if (local28 == 762 || local28 == 680) {
						local954 = this.aStringArray9[arg0];
						local132 = local954.indexOf("@whi@");
						if (local132 != -1) {
							local954 = local954.substring(local132 + 5).trim();
							local781 = Class15.method198(Class15.method195(Class15.method194(local954)));
							@Pc(2156) boolean local2156 = false;
							for (local971 = 0; local971 < this.anInt960; local971++) {
								@Pc(2168) Class1_Sub1_Sub1_Sub1_Sub1 local2168 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray246[local971]];
								if (local2168 != null && local2168.aString3 != null && local2168.aString3.equalsIgnoreCase(local781)) {
									this.method662(local2168.anIntArray140[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray140[0], this.aByte38, 0, 1, 0, false, 2, 1, local2168.anIntArray141[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray141[0]);
									if (local28 == 762) {
										this.aClass1_Sub1_Sub3_6.method348(168);
										this.aClass1_Sub1_Sub3_6.method383(this.anInt949, this.anIntArray246[local971]);
									}
									if (local28 == 680) {
										this.aClass1_Sub1_Sub3_6.method348(154);
										this.aClass1_Sub1_Sub3_6.method350(this.anIntArray246[local971]);
									}
									local2156 = true;
									break;
								}
							}
							if (!local2156) {
								this.method695("", 0, "Unable to find " + local781);
							}
						}
					}
					if (local28 == 975) {
						this.aClass1_Sub1_Sub3_6.method348(216);
						this.aClass1_Sub1_Sub3_6.method383(this.anInt949, local23);
						this.aClass1_Sub1_Sub3_6.method350(local33);
						this.aClass1_Sub1_Sub3_6.method384(local18);
						this.anInt988 = 0;
						this.anInt989 = local23;
						this.anInt990 = local18;
						this.anInt991 = 2;
						if (Class39.aClass39Array1[local23].anInt703 == this.anInt938) {
							this.anInt991 = 1;
						}
						if (Class39.aClass39Array1[local23].anInt703 == this.anInt885) {
							this.anInt991 = 3;
						}
					}
					if (local28 == 447) {
						local302 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
						if (local302 != null) {
							this.method662(local302.anIntArray140[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray140[0], this.aByte38, 0, 1, 0, false, 2, 1, local302.anIntArray141[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray141[0]);
							this.anInt845 = super.anInt840;
							this.anInt846 = super.anInt841;
							this.anInt848 = 2;
							this.anInt847 = 0;
							this.aClass1_Sub1_Sub3_6.method348(126);
							this.aClass1_Sub1_Sub3_6.method383(this.anInt949, local33);
							this.aClass1_Sub1_Sub3_6.method385(this.anInt854);
							this.aClass1_Sub1_Sub3_6.method385(this.anInt856);
							this.aClass1_Sub1_Sub3_6.method350(this.anInt855);
						}
					}
					if (local28 == 499) {
						anInt1050++;
						if (anInt1050 >= 109) {
							this.aClass1_Sub1_Sub3_6.method348(185);
							this.aClass1_Sub1_Sub3_6.method352(715994);
							anInt1050 = 0;
						}
						this.method703(local18, local23, local33);
						this.aClass1_Sub1_Sub3_6.method348(50);
						this.aClass1_Sub1_Sub3_6.method350(local18 + this.anInt924);
						this.aClass1_Sub1_Sub3_6.method350(local23 + this.anInt925);
						this.aClass1_Sub1_Sub3_6.method385(local33 >> 14 & 0x7FFF);
					}
					@Pc(2485) String local2485;
					@Pc(2458) Class21 local2458;
					if (local28 == 1186) {
						local2458 = Class21.method335(local33);
						@Pc(2462) Class39 local2462 = Class39.aClass39Array1[local23];
						if (local2462 != null && local2462.anIntArray157[local18] >= 100000) {
							local2485 = local2462.anIntArray157[local18] + " x " + local2458.aString6;
						} else if (local2458.aByteArray5 == null) {
							local2485 = "It's a " + local2458.aString6 + ".";
						} else {
							local2485 = new String(local2458.aByteArray5);
						}
						this.method695("", 0, local2485);
					}
					if (local28 == 891) {
						local758 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
						if (local758 != null) {
							this.method662(local758.anIntArray140[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray140[0], this.aByte38, 0, 1, 0, false, 2, 1, local758.anIntArray141[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray141[0]);
							this.anInt845 = super.anInt840;
							this.anInt846 = super.anInt841;
							this.anInt848 = 2;
							this.anInt847 = 0;
							this.aClass1_Sub1_Sub3_6.method348(227);
							this.aClass1_Sub1_Sub3_6.method384(local33);
						}
					}
					if (local28 == 855) {
						this.aClass1_Sub1_Sub3_6.method348(164);
						this.aClass1_Sub1_Sub3_6.method385(local18);
						this.aClass1_Sub1_Sub3_6.method350(local23);
						this.aClass1_Sub1_Sub3_6.method385(local33);
						this.anInt988 = 0;
						this.anInt989 = local23;
						this.anInt990 = local18;
						this.anInt991 = 2;
						if (Class39.aClass39Array1[local23].anInt703 == this.anInt938) {
							this.anInt991 = 1;
						}
						if (Class39.aClass39Array1[local23].anInt703 == this.anInt885) {
							this.anInt991 = 3;
						}
					}
					if (local28 == 1174) {
						anInt893++;
						if (anInt893 >= 87) {
							this.aClass1_Sub1_Sub3_6.method348(167);
							anInt893 = 0;
						}
						this.method703(local18, local23, local33);
						this.aClass1_Sub1_Sub3_6.method348(182);
						this.aClass1_Sub1_Sub3_6.method384(local33 >> 14 & 0x7FFF);
						this.aClass1_Sub1_Sub3_6.method383(this.anInt949, local23 + this.anInt925);
						this.aClass1_Sub1_Sub3_6.method385(local18 + this.anInt924);
					}
					if (local28 == 664) {
						local758 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
						if (local758 != null) {
							this.method662(local758.anIntArray140[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray140[0], this.aByte38, 0, 1, 0, false, 2, 1, local758.anIntArray141[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray141[0]);
							this.anInt845 = super.anInt840;
							this.anInt846 = super.anInt841;
							this.anInt848 = 2;
							this.anInt847 = 0;
							this.aClass1_Sub1_Sub3_6.method348(113);
							this.aClass1_Sub1_Sub3_6.method383(this.anInt949, local33);
						}
					}
					if (local28 == 598) {
						this.aClass1_Sub1_Sub3_6.method348(214);
						this.aClass1_Sub1_Sub3_6.method383(this.anInt949, local18);
						this.aClass1_Sub1_Sub3_6.method383(this.anInt949, local23);
						this.aClass1_Sub1_Sub3_6.method383(this.anInt949, local33);
						this.anInt988 = 0;
						this.anInt989 = local23;
						this.anInt990 = local18;
						this.anInt991 = 2;
						if (Class39.aClass39Array1[local23].anInt703 == this.anInt938) {
							this.anInt991 = 1;
						}
						if (Class39.aClass39Array1[local23].anInt703 == this.anInt885) {
							this.anInt991 = 3;
						}
					}
					if (local28 == 478) {
						this.method703(local18, local23, local33);
						this.aClass1_Sub1_Sub3_6.method348(228);
						this.aClass1_Sub1_Sub3_6.method385(local33 >> 14 & 0x7FFF);
						this.aClass1_Sub1_Sub3_6.method350(local18 + this.anInt924);
						this.aClass1_Sub1_Sub3_6.method384(local23 + this.anInt925);
					}
					if (local28 == 382) {
						local758 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
						if (local758 != null) {
							this.method662(local758.anIntArray140[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray140[0], this.aByte38, 0, 1, 0, false, 2, 1, local758.anIntArray141[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray141[0]);
							this.anInt845 = super.anInt840;
							this.anInt846 = super.anInt841;
							this.anInt848 = 2;
							this.anInt847 = 0;
							this.aClass1_Sub1_Sub3_6.method348(43);
							this.aClass1_Sub1_Sub3_6.method350(local33);
							this.aClass1_Sub1_Sub3_6.method350(this.anInt850);
						}
					}
					if (local28 == 1022) {
						local2458 = Class21.method335(local33);
						if (local2458.aByteArray5 == null) {
							local2485 = "It's a " + local2458.aString6 + ".";
						} else {
							local2485 = new String(local2458.aByteArray5);
						}
						this.method695("", 0, local2485);
					}
					if (local28 == 358) {
						local114 = Class39.aClass39Array1[local23];
						this.anInt849 = 1;
						this.anInt850 = local23;
						this.anInt851 = local114.anInt700;
						this.anInt853 = 0;
						this.aBoolean227 = true;
						local2485 = local114.aString10;
						if (local2485.indexOf(" ") != -1) {
							local2485 = local2485.substring(0, local2485.indexOf(" "));
						}
						local781 = local114.aString10;
						if (local781.indexOf(" ") != -1) {
							local781 = local781.substring(local781.indexOf(" ") + 1);
						}
						this.aString17 = local2485 + " " + local114.aString9 + " " + local781;
						if (this.anInt851 == 16) {
							this.aBoolean227 = true;
							this.anInt992 = 3;
							this.aBoolean223 = true;
						}
					} else {
						if (local28 == 131) {
							local758 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
							if (local758 != null) {
								this.method662(local758.anIntArray140[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray140[0], this.aByte38, 0, 1, 0, false, 2, 1, local758.anIntArray141[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray141[0]);
								this.anInt845 = super.anInt840;
								this.anInt846 = super.anInt841;
								this.anInt848 = 2;
								this.anInt847 = 0;
								this.aClass1_Sub1_Sub3_6.method348(107);
								this.aClass1_Sub1_Sub3_6.method383(this.anInt949, local33);
							}
						}
						if (local28 == 320) {
							local302 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
							if (local302 != null) {
								this.method662(local302.anIntArray140[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray140[0], this.aByte38, 0, 1, 0, false, 2, 1, local302.anIntArray141[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray141[0]);
								this.anInt845 = super.anInt840;
								this.anInt846 = super.anInt841;
								this.anInt848 = 2;
								this.anInt847 = 0;
								this.aClass1_Sub1_Sub3_6.method348(240);
								this.aClass1_Sub1_Sub3_6.method350(local33);
							}
						}
						if (local28 == 863) {
							local302 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
							if (local302 != null) {
								this.method662(local302.anIntArray140[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray140[0], this.aByte38, 0, 1, 0, false, 2, 1, local302.anIntArray141[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray141[0]);
								this.anInt845 = super.anInt840;
								this.anInt846 = super.anInt841;
								this.anInt848 = 2;
								this.anInt847 = 0;
								this.aClass1_Sub1_Sub3_6.method348(249);
								this.aClass1_Sub1_Sub3_6.method350(local33);
							}
						}
						if (local28 == 242) {
							this.method654(this.anInt942);
						}
						if (local28 == 698) {
							local230 = this.method662(local18, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray140[0], this.aByte38, 0, 0, 0, false, 2, 0, local23, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray141[0]);
							if (!local230) {
								this.method662(local18, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray140[0], this.aByte38, 0, 1, 0, false, 2, 1, local23, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray141[0]);
							}
							this.anInt845 = super.anInt840;
							this.anInt846 = super.anInt841;
							this.anInt848 = 2;
							this.anInt847 = 0;
							this.aClass1_Sub1_Sub3_6.method348(219);
							this.aClass1_Sub1_Sub3_6.method383(this.anInt949, local33);
							this.aClass1_Sub1_Sub3_6.method385(local18 + this.anInt924);
							this.aClass1_Sub1_Sub3_6.method384(local23 + this.anInt925);
						}
						if (local28 == 579) {
							anInt936 += local33;
							if (anInt936 >= 64) {
								this.aClass1_Sub1_Sub3_6.method348(31);
								this.aClass1_Sub1_Sub3_6.method349(4);
								anInt936 = 0;
							}
							this.aClass1_Sub1_Sub3_6.method348(32);
							this.aClass1_Sub1_Sub3_6.method385(local23);
							this.aClass1_Sub1_Sub3_6.method384(local18);
							this.aClass1_Sub1_Sub3_6.method385(local33);
							this.anInt988 = 0;
							this.anInt989 = local23;
							this.anInt990 = local18;
							this.anInt991 = 2;
							if (Class39.aClass39Array1[local23].anInt703 == this.anInt938) {
								this.anInt991 = 1;
							}
							if (Class39.aClass39Array1[local23].anInt703 == this.anInt885) {
								this.anInt991 = 3;
							}
						}
						if (local28 == 549) {
							anInt904++;
							if (anInt904 >= 56) {
								this.aClass1_Sub1_Sub3_6.method348(242);
								this.aClass1_Sub1_Sub3_6.method350(22200);
								anInt904 = 0;
							}
							this.method703(local18, local23, local33);
							this.aClass1_Sub1_Sub3_6.method348(141);
							this.aClass1_Sub1_Sub3_6.method385(local33 >> 14 & 0x7FFF);
							this.aClass1_Sub1_Sub3_6.method383(this.anInt949, local23 + this.anInt925);
							this.aClass1_Sub1_Sub3_6.method385(local18 + this.anInt924);
						}
						if (local28 == 158) {
							local114 = Class39.aClass39Array1[local23];
							@Pc(3454) boolean local3454 = true;
							if (local114.anInt701 > 0) {
								local3454 = this.method611(local114, this.anInt1056);
							}
							if (local3454) {
								this.aClass1_Sub1_Sub3_6.method348(188);
								this.aClass1_Sub1_Sub3_6.method350(local23);
							}
						}
						if (local28 == 540) {
							this.aClass1_Sub1_Sub3_6.method348(180);
							this.aClass1_Sub1_Sub3_6.method384(local33);
							this.aClass1_Sub1_Sub3_6.method350(local23);
							this.aClass1_Sub1_Sub3_6.method350(local18);
							this.anInt988 = 0;
							this.anInt989 = local23;
							this.anInt990 = local18;
							this.anInt991 = 2;
							if (Class39.aClass39Array1[local23].anInt703 == this.anInt938) {
								this.anInt991 = 1;
							}
							if (Class39.aClass39Array1[local23].anInt703 == this.anInt885) {
								this.anInt991 = 3;
							}
						}
						this.anInt853 = 0;
						this.anInt849 = 0;
						this.aBoolean227 = true;
					}
				}
			}
		} catch (@Pc(3545) RuntimeException local3545) {
			signlink.reporterror("55842, " + arg0 + ", " + false + ", " + local3545.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method665(@OriginalArg(0) int arg0) {
		try {
			@Pc(6) int local6 = this.anInt1001 * 128 + 64;
			@Pc(13) int local13 = this.anInt1002 * 128 + 64;
			@Pc(24) int local24 = this.method705(local13, this.anInt972, local6) - this.anInt1003;
			if (this.anInt879 < local6) {
				this.anInt879 += this.anInt1004 + (local6 - this.anInt879) * this.anInt1005 / 1000;
				if (this.anInt879 > local6) {
					this.anInt879 = local6;
				}
			}
			if (this.anInt879 > local6) {
				this.anInt879 -= this.anInt1004 + (this.anInt879 - local6) * this.anInt1005 / 1000;
				if (this.anInt879 < local6) {
					this.anInt879 = local6;
				}
			}
			if (this.anInt880 < local24) {
				this.anInt880 += this.anInt1004 + (local24 - this.anInt880) * this.anInt1005 / 1000;
				if (this.anInt880 > local24) {
					this.anInt880 = local24;
				}
			}
			if (this.anInt880 > local24) {
				this.anInt880 -= this.anInt1004 + (this.anInt880 - local24) * this.anInt1005 / 1000;
				if (this.anInt880 < local24) {
					this.anInt880 = local24;
				}
			}
			if (this.anInt881 < local13) {
				this.anInt881 += this.anInt1004 + (local13 - this.anInt881) * this.anInt1005 / 1000;
				if (this.anInt881 > local13) {
					this.anInt881 = local13;
				}
			}
			if (this.anInt881 > local13) {
				this.anInt881 -= this.anInt1004 + (this.anInt881 - local13) * this.anInt1005 / 1000;
				if (this.anInt881 < local13) {
					this.anInt881 = local13;
				}
			}
			local6 = this.anInt967 * 128 + 64;
			local13 = this.anInt968 * 128 + 64;
			this.anInt1031 += arg0;
			local24 = this.method705(local13, this.anInt972, local6) - this.anInt969;
			@Pc(228) int local228 = local6 - this.anInt879;
			@Pc(233) int local233 = local24 - this.anInt880;
			@Pc(238) int local238 = local13 - this.anInt881;
			@Pc(249) int local249 = (int) Math.sqrt((double) (local228 * local228 + local238 * local238));
			@Pc(260) int local260 = (int) (Math.atan2((double) local233, (double) local249) * 325.949D) & 0x7FF;
			@Pc(271) int local271 = (int) (Math.atan2((double) local228, (double) local238) * -325.949D) & 0x7FF;
			if (local260 < 128) {
				local260 = 128;
			}
			if (local260 > 383) {
				local260 = 383;
			}
			if (this.anInt882 < local260) {
				this.anInt882 += this.anInt970 + (local260 - this.anInt882) * this.anInt971 / 1000;
				if (this.anInt882 > local260) {
					this.anInt882 = local260;
				}
			}
			if (this.anInt882 > local260) {
				this.anInt882 -= this.anInt970 + (this.anInt882 - local260) * this.anInt971 / 1000;
				if (this.anInt882 < local260) {
					this.anInt882 = local260;
				}
			}
			@Pc(342) int local342 = local271 - this.anInt883;
			if (local342 > 1024) {
				local342 -= 2048;
			}
			if (local342 < -1024) {
				local342 += 2048;
			}
			if (local342 > 0) {
				this.anInt883 += this.anInt970 + local342 * this.anInt971 / 1000;
				this.anInt883 &= 0x7FF;
			}
			if (local342 < 0) {
				this.anInt883 -= this.anInt970 + -local342 * this.anInt971 / 1000;
				this.anInt883 &= 0x7FF;
			}
			@Pc(400) int local400 = local271 - this.anInt883;
			if (local400 > 1024) {
				local400 -= 2048;
			}
			if (local400 < -1024) {
				local400 += 2048;
			}
			if (local400 < 0 && local342 > 0 || local400 > 0 && local342 < 0) {
				this.anInt883 = local271;
			}
		} catch (@Pc(421) RuntimeException local421) {
			signlink.reporterror("98284, " + arg0 + ", " + local421.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method666(@OriginalArg(0) int arg0) {
		try {
			@Pc(7) int local7 = this.aClass1_Sub1_Sub2_Sub2_4.method181("Choose Option");
			this.anInt1031 += arg0;
			@Pc(26) int local26;
			for (@Pc(15) int local15 = 0; local15 < this.anInt1019; local15++) {
				local26 = this.aClass1_Sub1_Sub2_Sub2_4.method181(this.aStringArray9[local15]);
				if (local26 > local7) {
					local7 = local26;
				}
			}
			local7 += 8;
			local26 = this.anInt1019 * 15 + 21;
			@Pc(69) int local69;
			@Pc(87) int local87;
			if (super.anInt840 > 4 && super.anInt841 > 4 && super.anInt840 < 516 && super.anInt841 < 338) {
				local69 = super.anInt840 - local7 / 2 - 4;
				if (local69 + local7 > 512) {
					local69 = 512 - local7;
				}
				if (local69 < 0) {
					local69 = 0;
				}
				local87 = super.anInt841 - 4;
				if (local87 + local26 > 334) {
					local87 = 334 - local26;
				}
				if (local87 < 0) {
					local87 = 0;
				}
				this.aBoolean244 = true;
				this.anInt977 = 0;
				this.anInt978 = local69;
				this.anInt979 = local87;
				this.anInt980 = local7;
				this.anInt981 = this.anInt1019 * 15 + 22;
			}
			if (super.anInt840 > 553 && super.anInt841 > 205 && super.anInt840 < 743 && super.anInt841 < 466) {
				local69 = super.anInt840 - local7 / 2 - 553;
				if (local69 < 0) {
					local69 = 0;
				} else if (local69 + local7 > 190) {
					local69 = 190 - local7;
				}
				local87 = super.anInt841 - 205;
				if (local87 < 0) {
					local87 = 0;
				} else if (local87 + local26 > 261) {
					local87 = 261 - local26;
				}
				this.aBoolean244 = true;
				this.anInt977 = 1;
				this.anInt978 = local69;
				this.anInt979 = local87;
				this.anInt980 = local7;
				this.anInt981 = this.anInt1019 * 15 + 22;
			}
			if (super.anInt840 > 17 && super.anInt841 > 357 && super.anInt840 < 496 && super.anInt841 < 453) {
				local69 = super.anInt840 - local7 / 2 - 17;
				if (local69 < 0) {
					local69 = 0;
				} else if (local69 + local7 > 479) {
					local69 = 479 - local7;
				}
				local87 = super.anInt841 - 357;
				if (local87 < 0) {
					local87 = 0;
				} else if (local87 + local26 > 96) {
					local87 = 96 - local26;
				}
				this.aBoolean244 = true;
				this.anInt977 = 2;
				this.anInt978 = local69;
				this.anInt979 = local87;
				this.anInt980 = local7;
				this.anInt981 = this.anInt1019 * 15 + 22;
			}
		} catch (@Pc(291) RuntimeException local291) {
			signlink.reporterror("40104, " + arg0 + ", " + local291.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!LDILQFVA;I)V")
	private void method667(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt1014 = 0;
			this.anInt961 = 0;
			this.method589(arg0, arg1);
			this.method689(arg1, arg0);
			this.method707(arg1, arg0);
			@Pc(34) int local34;
			for (@Pc(27) int local27 = 0; local27 < this.anInt1014; local27++) {
				local34 = this.anIntArray261[local27];
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local34].anInt665 != anInt931) {
					this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local34].aClass49_2 = null;
					this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local34] = null;
				}
			}
			if (arg0.anInt443 != arg1) {
				signlink.reporterror(this.aString20 + " size mismatch in getnpcpos - pos:" + arg0.anInt443 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local34 = 0; local34 < this.anInt1036; local34++) {
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray265[local34]] == null) {
					signlink.reporterror(this.aString20 + " null entry in npc list - pos:" + local34 + " size:" + this.anInt1036);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("26323, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method668() {
		try {
			this.aBoolean241 &= true;
			@Pc(8) int local8 = this.anInt978;
			@Pc(11) int local11 = this.anInt979;
			@Pc(14) int local14 = this.anInt980;
			@Pc(17) int local17 = this.anInt981;
			Class1_Sub1_Sub2.method405(6116423, local14, local8, local11, local17);
			Class1_Sub1_Sub2.method405(0, local14 - 2, local8 + 1, local11 + 1, 16);
			Class1_Sub1_Sub2.method406(0, local8 + 1, local14 - 2, this.anInt1022, local17 - 19, local11 + 18);
			this.aClass1_Sub1_Sub2_Sub2_4.method183(local8 + 3, "Choose Option", local11 + 14, 6116423);
			@Pc(70) int local70 = super.anInt834;
			@Pc(73) int local73 = super.anInt835;
			if (this.anInt977 == 0) {
				local70 -= 4;
				local73 -= 4;
			}
			if (this.anInt977 == 1) {
				local70 -= 553;
				local73 -= 205;
			}
			if (this.anInt977 == 2) {
				local70 -= 17;
				local73 -= 357;
			}
			for (@Pc(92) int local92 = 0; local92 < this.anInt1019; local92++) {
				@Pc(107) int local107 = local11 + (this.anInt1019 - 1 - local92) * 15 + 31;
				@Pc(109) int local109 = 16777215;
				if (local70 > local8 && local70 < local8 + local14 && local73 > local107 - 13 && local73 < local107 + 3) {
					local109 = 16776960;
				}
				this.aClass1_Sub1_Sub2_Sub2_4.method187(local109, local8 + 3, true, this.aStringArray9[local92], local107);
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("78038, " + true + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)Ljava/net/Socket;")
	public Socket method669(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method670(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean242) {
			if (this.aSocket3 != null) {
				try {
					this.aSocket3.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket3 = null;
			}
			this.aSocket3 = this.method669(43595);
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

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)I")
	private int method671() {
		try {
			@Pc(11) int local11 = 3;
			if (this.anInt882 < 310) {
				@Pc(20) int local20 = this.anInt879 >> 7;
				@Pc(25) int local25 = this.anInt881 >> 7;
				@Pc(30) int local30 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt620 >> 7;
				@Pc(35) int local35 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt621 >> 7;
				if ((this.aByteArrayArrayArray8[this.anInt972][local20][local25] & 0x4) != 0) {
					local11 = this.anInt972;
				}
				@Pc(57) int local57;
				if (local30 > local20) {
					local57 = local30 - local20;
				} else {
					local57 = local20 - local30;
				}
				@Pc(70) int local70;
				if (local35 > local25) {
					local70 = local35 - local25;
				} else {
					local70 = local25 - local35;
				}
				@Pc(85) int local85;
				@Pc(87) int local87;
				if (local57 > local70) {
					local85 = local70 * 65536 / local57;
					local87 = 32768;
					while (local20 != local30) {
						if (local20 < local30) {
							local20++;
						} else if (local20 > local30) {
							local20--;
						}
						if ((this.aByteArrayArrayArray8[this.anInt972][local20][local25] & 0x4) != 0) {
							local11 = this.anInt972;
						}
						local87 += local85;
						if (local87 >= 65536) {
							local87 -= 65536;
							if (local25 < local35) {
								local25++;
							} else if (local25 > local35) {
								local25--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt972][local20][local25] & 0x4) != 0) {
								local11 = this.anInt972;
							}
						}
					}
				} else {
					local85 = local57 * 65536 / local70;
					local87 = 32768;
					while (local25 != local35) {
						if (local25 < local35) {
							local25++;
						} else if (local25 > local35) {
							local25--;
						}
						if ((this.aByteArrayArrayArray8[this.anInt972][local20][local25] & 0x4) != 0) {
							local11 = this.anInt972;
						}
						local87 += local85;
						if (local87 >= 65536) {
							local87 -= 65536;
							if (local20 < local30) {
								local20++;
							} else if (local20 > local30) {
								local20--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt972][local20][local25] & 0x4) != 0) {
								local11 = this.anInt972;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray8[this.anInt972][aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt620 >> 7][aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt621 >> 7] & 0x4) != 0) {
				local11 = this.anInt972;
			}
			return local11;
		} catch (@Pc(253) RuntimeException local253) {
			signlink.reporterror("36770, " + 165 + ", " + local253.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)I")
	private int method672() {
		try {
			@Pc(9) int local9 = this.method705(this.anInt881, this.anInt972, this.anInt879);
			return local9 - this.anInt880 >= 800 || (this.aByteArrayArrayArray8[this.anInt972][this.anInt879 >> 7][this.anInt881 >> 7] & 0x4) == 0 ? 3 : this.anInt972;
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("40457, " + 4 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!AHUILQJH;II)V")
	private void method673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub1_Sub1_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(5) boolean local5 = false;
			if (arg2 != aClass1_Sub1_Sub1_Sub1_Sub1_1 && this.anInt1019 < 400) {
				@Pc(39) String local39;
				if (arg2.anInt121 == 0) {
					local39 = arg2.aString3 + method651(arg2.anInt111, aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt111) + " (level-" + arg2.anInt111 + ")";
				} else {
					local39 = arg2.aString3 + " (skill-" + arg2.anInt121 + ")";
				}
				@Pc(169) int local169;
				if (this.anInt853 == 1) {
					this.aStringArray9[this.anInt1019] = "Use " + this.aString18 + " with @whi@" + local39;
					this.anIntArray252[this.anInt1019] = 447;
					this.anIntArray253[this.anInt1019] = arg0;
					this.anIntArray250[this.anInt1019] = arg3;
					this.anIntArray251[this.anInt1019] = arg1;
					this.anInt1019++;
				} else if (this.anInt849 != 1) {
					for (local169 = 4; local169 >= 0; local169--) {
						if (this.aStringArray11[local169] != null) {
							this.aStringArray9[this.anInt1019] = this.aStringArray11[local169] + " @whi@" + local39;
							@Pc(196) short local196 = 0;
							if (this.aStringArray11[local169].equalsIgnoreCase("attack")) {
								if (arg2.anInt111 > aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt111) {
									local196 = 2000;
								}
								if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt112 != 0 && arg2.anInt112 != 0) {
									if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt112 == arg2.anInt112) {
										local196 = 2000;
									} else {
										local196 = 0;
									}
								}
							} else if (this.aBooleanArray11[local169]) {
								local196 = 2000;
							}
							if (local169 == 0) {
								this.anIntArray252[this.anInt1019] = local196 + 345;
							}
							if (local169 == 1) {
								this.anIntArray252[this.anInt1019] = local196 + 492;
							}
							if (local169 == 2) {
								this.anIntArray252[this.anInt1019] = local196 + 863;
							}
							if (local169 == 3) {
								this.anIntArray252[this.anInt1019] = local196 + 45;
							}
							if (local169 == 4) {
								this.anIntArray252[this.anInt1019] = local196 + 320;
							}
							this.anIntArray253[this.anInt1019] = arg0;
							this.anIntArray250[this.anInt1019] = arg3;
							this.anIntArray251[this.anInt1019] = arg1;
							this.anInt1019++;
						}
					}
				} else if ((this.anInt851 & 0x8) == 8) {
					this.aStringArray9[this.anInt1019] = this.aString17 + " @whi@" + local39;
					this.anIntArray252[this.anInt1019] = 348;
					this.anIntArray253[this.anInt1019] = arg0;
					this.anIntArray250[this.anInt1019] = arg3;
					this.anIntArray251[this.anInt1019] = arg1;
					this.anInt1019++;
				}
				for (local169 = 0; local169 < this.anInt1019; local169++) {
					if (this.anIntArray252[local169] == 84) {
						this.aStringArray9[local169] = "Walk here @whi@" + local39;
						return;
					}
				}
			}
		} catch (@Pc(346) RuntimeException local346) {
			signlink.reporterror("15859, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local346.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method674() {
		try {
			if (this.anInt919 == 0) {
				@Pc(6) int local6 = super.anInt839;
				if (this.anInt849 == 1 && super.anInt840 >= 516 && super.anInt841 >= 160 && super.anInt840 <= 765 && super.anInt841 <= 205) {
					local6 = 0;
				}
				@Pc(41) int local41;
				@Pc(44) int local44;
				@Pc(120) int local120;
				if (this.aBoolean244) {
					if (local6 != 1) {
						local41 = super.anInt834;
						local44 = super.anInt835;
						if (this.anInt977 == 0) {
							local41 -= 4;
							local44 -= 4;
						}
						if (this.anInt977 == 1) {
							local41 -= 553;
							local44 -= 205;
						}
						if (this.anInt977 == 2) {
							local41 -= 17;
							local44 -= 357;
						}
						if (local41 < this.anInt978 - 10 || local41 > this.anInt978 + this.anInt980 + 10 || local44 < this.anInt979 - 10 || local44 > this.anInt979 + this.anInt981 + 10) {
							this.aBoolean244 = false;
							if (this.anInt977 == 1) {
								this.aBoolean227 = true;
							}
							if (this.anInt977 == 2) {
								this.aBoolean236 = true;
							}
						}
					}
					if (local6 == 1) {
						local41 = this.anInt978;
						local44 = this.anInt979;
						local120 = this.anInt980;
						@Pc(123) int local123 = super.anInt840;
						@Pc(126) int local126 = super.anInt841;
						if (this.anInt977 == 0) {
							local123 -= 4;
							local126 -= 4;
						}
						if (this.anInt977 == 1) {
							local123 -= 553;
							local126 -= 205;
						}
						if (this.anInt977 == 2) {
							local123 -= 17;
							local126 -= 357;
						}
						@Pc(145) int local145 = -1;
						for (@Pc(147) int local147 = 0; local147 < this.anInt1019; local147++) {
							@Pc(162) int local162 = local44 + (this.anInt1019 - 1 - local147) * 15 + 31;
							if (local123 > local41 && local123 < local41 + local120 && local126 > local162 - 13 && local126 < local162 + 3) {
								local145 = local147;
							}
						}
						if (local145 != -1) {
							this.method664(local145);
						}
						this.aBoolean244 = false;
						if (this.anInt977 == 1) {
							this.aBoolean227 = true;
						}
						if (this.anInt977 == 2) {
							this.aBoolean236 = true;
							return;
						}
					}
				} else {
					if (local6 == 1 && this.anInt1019 > 0) {
						local41 = this.anIntArray252[this.anInt1019 - 1];
						if (local41 == 855 || local41 == 822 || local41 == 589 || local41 == 914 || local41 == 568 || local41 == 579 || local41 == 540 || local41 == 422 || local41 == 598 || local41 == 975 || local41 == 787 || local41 == 1186) {
							local44 = this.anIntArray250[this.anInt1019 - 1];
							local120 = this.anIntArray251[this.anInt1019 - 1];
							@Pc(282) Class39 local282 = Class39.aClass39Array1[local120];
							if (local282.aBoolean169 || local282.aBoolean163) {
								this.aBoolean239 = false;
								this.anInt940 = 0;
								this.anInt917 = local120;
								this.anInt918 = local44;
								this.anInt919 = 2;
								this.anInt920 = super.anInt840;
								this.anInt921 = super.anInt841;
								if (Class39.aClass39Array1[local120].anInt703 == this.anInt938) {
									this.anInt919 = 1;
								}
								if (Class39.aClass39Array1[local120].anInt703 == this.anInt885) {
									this.anInt919 = 3;
								}
								return;
							}
						}
					}
					if (local6 == 1 && (this.anInt875 == 1 || this.method712(this.anInt1019 - 1)) && this.anInt1019 > 2) {
						local6 = 2;
					}
					if (local6 == 1 && this.anInt1019 > 0) {
						this.method664(this.anInt1019 - 1);
					}
					if (local6 != 2 || this.anInt1019 <= 0) {
						return;
					}
					this.method666(this.anInt1049);
				}
			}
		} catch (@Pc(378) RuntimeException local378) {
			signlink.reporterror("6698, " + -655 + ", " + local378.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!LDILQFVA;II)V")
	private void method675(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(6) int local6 = arg0.method370(8);
			@Pc(12) int local12;
			if (local6 < this.anInt960) {
				for (local12 = local6; local12 < this.anInt960; local12++) {
					this.anIntArray261[this.anInt1014++] = this.anIntArray246[local12];
				}
			}
			if (local6 > this.anInt960) {
				signlink.reporterror(this.aString20 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt960 = 0;
			for (local12 = 0; local12 < local6; local12++) {
				@Pc(69) int local69 = this.anIntArray246[local12];
				@Pc(74) Class1_Sub1_Sub1_Sub1_Sub1 local74 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local69];
				@Pc(79) int local79 = arg0.method370(1);
				if (local79 == 0) {
					this.anIntArray246[this.anInt960++] = local69;
					local74.anInt665 = anInt931;
				} else {
					@Pc(102) int local102 = arg0.method370(2);
					if (local102 == 0) {
						this.anIntArray246[this.anInt960++] = local69;
						local74.anInt665 = anInt931;
						this.anIntArray247[this.anInt961++] = local69;
					} else {
						@Pc(153) int local153;
						@Pc(163) int local163;
						if (local102 == 1) {
							this.anIntArray246[this.anInt960++] = local69;
							local74.anInt665 = anInt931;
							local153 = arg0.method370(3);
							local74.method497(local153, false);
							local163 = arg0.method370(1);
							if (local163 == 1) {
								this.anIntArray247[this.anInt961++] = local69;
							}
						} else if (local102 == 2) {
							this.anIntArray246[this.anInt960++] = local69;
							local74.anInt665 = anInt931;
							local153 = arg0.method370(3);
							local74.method497(local153, true);
							local163 = arg0.method370(3);
							local74.method497(local163, true);
							@Pc(221) int local221 = arg0.method370(1);
							if (local221 == 1) {
								this.anIntArray247[this.anInt961++] = local69;
							}
						} else if (local102 == 3) {
							this.anIntArray261[this.anInt1014++] = local69;
						}
					}
				}
			}
		} catch (@Pc(258) RuntimeException local258) {
			signlink.reporterror("58618, " + arg0 + ", " + arg1 + ", " + 22339 + ", " + local258.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ZI)V")
	private void method676(@OriginalArg(1) int arg0) {
		try {
			@Pc(10) Class39 local10 = Class39.aClass39Array1[arg0];
			for (@Pc(12) int local12 = 0; local12 < local10.anIntArray154.length && local10.anIntArray154[local12] != -1; local12++) {
				@Pc(27) Class39 local27 = Class39.aClass39Array1[local10.anIntArray154[local12]];
				if (local27.anInt693 == 1) {
					this.method676(local27.anInt716);
				}
				local27.anInt711 = 0;
				local27.anInt708 = 0;
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("9829, " + true + ", " + arg0 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZLclient!LDILQFVA;I)V")
	private void method677(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt1014 = 0;
			this.anInt961 = 0;
			this.method645(arg0, arg1);
			this.method675(arg0, arg1);
			this.method635(arg0, arg1);
			this.method688(arg1, arg0);
			@Pc(36) int local36;
			for (@Pc(29) int local29 = 0; local29 < this.anInt1014; local29++) {
				local36 = this.anIntArray261[local29];
				if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local36].anInt665 != anInt931) {
					this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local36] = null;
				}
			}
			this.aBoolean241 &= true;
			if (arg0.anInt443 != arg1) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.anInt443 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local36 = 0; local36 < this.anInt960; local36++) {
				if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray246[local36]] == null) {
					signlink.reporterror(this.aString20 + " null entry in pl list - pos:" + local36 + " size:" + this.anInt960);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("98648, " + true + ", " + arg0 + ", " + arg1 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
	private void method678(@OriginalArg(0) int arg0) {
		try {
			signlink.anInt1075 = arg0;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("79368, " + arg0 + ", " + 1 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method679() {
		try {
			Class40.aClass4_7.method35();
			Class40.aClass4_8.method35();
			Class49.aClass4_9.method35();
			Class21.aClass4_3.method35();
			Class21.aClass4_2.method35();
			this.aBoolean241 &= true;
			Class1_Sub1_Sub1_Sub1_Sub1.aClass4_1.method35();
			Class38.aClass4_4.method35();
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("96205, " + true + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZB)V")
	private void method680(@OriginalArg(0) boolean arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt1036; local1++) {
				@Pc(11) Class1_Sub1_Sub1_Sub1_Sub2 local11 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray265[local1]];
				@Pc(20) int local20 = (this.anIntArray265[local1] << 14) + 536870912;
				if (local11 != null && local11.method498() && local11.aClass49_2.aBoolean208 == arg0) {
					@Pc(36) int local36 = local11.anInt620 >> 7;
					@Pc(41) int local41 = local11.anInt621 >> 7;
					if (local36 >= 0 && local36 < 104 && local41 >= 0 && local41 < 104) {
						if (local11.anInt639 == 1 && (local11.anInt620 & 0x7F) == 64 && (local11.anInt621 & 0x7F) == 64) {
							if (this.anIntArrayArray22[local36][local41] == this.anInt910) {
								continue;
							}
							this.anIntArrayArray22[local36][local41] = this.anInt910;
						}
						if (!local11.aClass49_2.aBoolean206) {
							local20 += Integer.MIN_VALUE;
						}
						this.aClass5_1.method53(this.anInt972, (local11.anInt639 - 1) * 64 + 60, local11.anInt620, (byte) 7, this.method705(local11.anInt621, this.anInt972, local11.anInt620), local20, local11.anInt621, local11.aBoolean159, local11.anInt622, local11);
					}
				}
			}
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("93565, " + arg0 + ", " + -85 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)Z")
	private boolean method681() {
		try {
			this.anInt1031 += 0;
			if (this.aClass9_1 == null) {
				return false;
			}
			@Pc(2417) String local2417;
			@Pc(274) int local274;
			try {
				@Pc(16) int local16 = this.aClass9_1.method141();
				if (local16 == 0) {
					return false;
				}
				if (this.anInt1032 == -1) {
					this.aClass9_1.method142(this.aClass1_Sub1_Sub3_7.aByteArray6, 0, 1);
					this.anInt1032 = this.aClass1_Sub1_Sub3_7.aByteArray6[0] & 0xFF;
					if (this.aClass22_2 != null) {
						this.anInt1032 = this.anInt1032 - this.aClass22_2.method342() & 0xFF;
					}
					this.anInt1031 = Class11.anIntArray33[this.anInt1032];
					local16--;
				}
				if (this.anInt1031 == -1) {
					if (local16 <= 0) {
						return false;
					}
					this.aClass9_1.method142(this.aClass1_Sub1_Sub3_7.aByteArray6, 0, 1);
					this.anInt1031 = this.aClass1_Sub1_Sub3_7.aByteArray6[0] & 0xFF;
					local16--;
				}
				if (this.anInt1031 == -2) {
					if (local16 <= 1) {
						return false;
					}
					this.aClass9_1.method142(this.aClass1_Sub1_Sub3_7.aByteArray6, 0, 2);
					this.aClass1_Sub1_Sub3_7.anInt443 = 0;
					this.anInt1031 = this.aClass1_Sub1_Sub3_7.method361();
					local16 -= 2;
				}
				if (local16 < this.anInt1031) {
					return false;
				}
				this.aClass1_Sub1_Sub3_7.anInt443 = 0;
				this.aClass9_1.method142(this.aClass1_Sub1_Sub3_7.aByteArray6, 0, this.anInt1031);
				this.anInt1033 = 0;
				this.anInt1047 = this.anInt1046;
				this.anInt1046 = this.anInt1045;
				this.anInt1045 = this.anInt1032;
				if (this.anInt1032 == 188) {
					this.anInt1008 = this.aClass1_Sub1_Sub3_7.method359();
					if (this.anInt1008 == 1) {
						this.anInt944 = this.aClass1_Sub1_Sub3_7.method361();
					}
					if (this.anInt1008 >= 2 && this.anInt1008 <= 6) {
						if (this.anInt1008 == 2) {
							this.anInt954 = 64;
							this.anInt955 = 64;
						}
						if (this.anInt1008 == 3) {
							this.anInt954 = 0;
							this.anInt955 = 64;
						}
						if (this.anInt1008 == 4) {
							this.anInt954 = 128;
							this.anInt955 = 64;
						}
						if (this.anInt1008 == 5) {
							this.anInt954 = 64;
							this.anInt955 = 0;
						}
						if (this.anInt1008 == 6) {
							this.anInt954 = 64;
							this.anInt955 = 128;
						}
						this.anInt1008 = 2;
						this.anInt951 = this.aClass1_Sub1_Sub3_7.method361();
						this.anInt952 = this.aClass1_Sub1_Sub3_7.method361();
						this.anInt953 = this.aClass1_Sub1_Sub3_7.method359();
					}
					if (this.anInt1008 == 10) {
						this.anInt1000 = this.aClass1_Sub1_Sub3_7.method361();
					}
					this.anInt1032 = -1;
					return true;
				}
				@Pc(269) int local269;
				if (this.anInt1032 == 34) {
					local269 = this.aClass1_Sub1_Sub3_7.method388();
					local274 = this.aClass1_Sub1_Sub3_7.method386();
					Class39.aClass39Array1[local274].anInt706 = 2;
					Class39.aClass39Array1[local274].anInt707 = local269;
					this.anInt1032 = -1;
					return true;
				}
				if (this.anInt1032 == 103) {
					this.anInt1012 = this.aClass1_Sub1_Sub3_7.method378(anInt941);
					this.anInt1011 = this.aClass1_Sub1_Sub3_7.method379();
					while (this.aClass1_Sub1_Sub3_7.anInt443 < this.anInt1031) {
						local269 = this.aClass1_Sub1_Sub3_7.method359();
						this.method700(this.aClass1_Sub1_Sub3_7, local269);
					}
					this.anInt1032 = -1;
					return true;
				}
				if (this.anInt1032 == 53) {
					local269 = this.aClass1_Sub1_Sub3_7.method388();
					Class39.aClass39Array1[local269].anInt706 = 3;
					if (aClass1_Sub1_Sub1_Sub1_Sub1_1.aClass49_1 == null) {
						Class39.aClass39Array1[local269].anInt707 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray11[0] << 25) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray11[4] << 20) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray12[0] << 15) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray12[8] << 10) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray12[11] << 5) + aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray12[1];
					} else {
						Class39.aClass39Array1[local269].anInt707 = (int) (aClass1_Sub1_Sub1_Sub1_Sub1_1.aClass49_1.aLong26 + 305419896L);
					}
					this.anInt1032 = -1;
					return true;
				}
				if (this.anInt1032 == 118) {
					this.anInt1042 = this.aClass1_Sub1_Sub3_7.method377();
					if (this.anInt1042 == this.anInt992) {
						if (this.anInt1042 == 3) {
							this.anInt992 = 1;
						} else {
							this.anInt992 = 3;
						}
						this.aBoolean227 = true;
					}
					this.anInt1032 = -1;
					return true;
				}
				@Pc(458) Class39 local458;
				if (this.anInt1032 == 222) {
					local269 = this.aClass1_Sub1_Sub3_7.method389(this.anInt945);
					local274 = this.aClass1_Sub1_Sub3_7.method361();
					local458 = Class39.aClass39Array1[local274];
					local458.anInt704 = local269;
					if (local269 == -1) {
						local458.anInt711 = 0;
						local458.anInt708 = 0;
					}
					this.anInt1032 = -1;
					return true;
				}
				@Pc(494) int local494;
				@Pc(496) int local496;
				@Pc(510) int local510;
				@Pc(490) Class39 local490;
				if (this.anInt1032 == 110) {
					this.aBoolean227 = true;
					local269 = this.aClass1_Sub1_Sub3_7.method361();
					local490 = Class39.aClass39Array1[local269];
					local494 = this.aClass1_Sub1_Sub3_7.method361();
					for (local496 = 0; local496 < local494; local496++) {
						local490.anIntArray152[local496] = this.aClass1_Sub1_Sub3_7.method387();
						local510 = this.aClass1_Sub1_Sub3_7.method359();
						if (local510 == 255) {
							local510 = this.aClass1_Sub1_Sub3_7.method393((byte) 5);
						}
						local490.anIntArray157[local496] = local510;
					}
					for (local510 = local494; local510 < local490.anIntArray152.length; local510++) {
						local490.anIntArray152[local510] = 0;
						local490.anIntArray157[local510] = 0;
					}
					this.anInt1032 = -1;
					return true;
				}
				if (this.anInt1032 == 52) {
					this.aBoolean259 = false;
					this.anInt877 = 2;
					this.aString30 = "";
					this.aBoolean236 = true;
					this.anInt1032 = -1;
					return true;
				}
				if (this.anInt1032 == 248) {
					for (local269 = 0; local269 < this.anIntArray267.length; local269++) {
						if (this.anIntArray267[local269] != this.anIntArray273[local269]) {
							this.anIntArray267[local269] = this.anIntArray273[local269];
							this.method621(local269);
							this.aBoolean227 = true;
						}
					}
					this.anInt1032 = -1;
					return true;
				}
				if (this.anInt1032 == 159) {
					this.method667(this.aClass1_Sub1_Sub3_7, this.anInt1031);
					this.anInt1032 = -1;
					return true;
				}
				if (this.anInt1032 == 92) {
					local269 = this.aClass1_Sub1_Sub3_7.method391(this.aBoolean222);
					if (local269 >= 0) {
						this.method676(local269);
					}
					this.anInt874 = local269;
					this.anInt1032 = -1;
					return true;
				}
				if (this.anInt1032 == 193) {
					local269 = this.aClass1_Sub1_Sub3_7.method389(this.anInt945);
					local274 = this.aClass1_Sub1_Sub3_7.method388();
					local494 = this.aClass1_Sub1_Sub3_7.method390();
					@Pc(680) Class39 local680 = Class39.aClass39Array1[local274];
					local680.anInt691 = local494;
					local680.anInt702 = local269;
					this.anInt1032 = -1;
					return true;
				}
				if (this.anInt1032 == 237) {
					local269 = this.aClass1_Sub1_Sub3_7.method388();
					local274 = this.aClass1_Sub1_Sub3_7.method361();
					local458 = Class39.aClass39Array1[local274];
					if (local458 != null && local458.anInt693 == 0) {
						if (local269 < 0) {
							local269 = 0;
						}
						if (local269 > local458.anInt688 - local458.anInt715) {
							local269 = local458.anInt688 - local458.anInt715;
						}
						local458.anInt712 = local269;
					}
					this.anInt1032 = -1;
					return true;
				}
				if (this.anInt1032 == 114) {
					local269 = this.aClass1_Sub1_Sub3_7.method390();
					this.anInt907 = local269;
					this.aBoolean236 = true;
					this.anInt1032 = -1;
					return true;
				}
				if (this.anInt1032 == 5) {
					if (this.anInt992 == 12) {
						this.aBoolean227 = true;
					}
					this.anInt887 = this.aClass1_Sub1_Sub3_7.method362();
					this.anInt1032 = -1;
					return true;
				}
				if (this.anInt1032 == 246) {
					this.anInt1038 = this.aClass1_Sub1_Sub3_7.method359();
					this.aBoolean227 = true;
					this.anInt1032 = -1;
					return true;
				}
				if (this.anInt1032 == 226) {
					local269 = this.aClass1_Sub1_Sub3_7.method388();
					@Pc(815) boolean local815 = this.aClass1_Sub1_Sub3_7.method379() == 1;
					Class39.aClass39Array1[local269].aBoolean167 = local815;
					this.anInt1032 = -1;
					return true;
				}
				if (this.anInt1032 == 121) {
					this.anInt1012 = this.aClass1_Sub1_Sub3_7.method379();
					this.anInt1011 = this.aClass1_Sub1_Sub3_7.method377();
					for (local269 = this.anInt1011; local269 < this.anInt1011 + 8; local269++) {
						for (local274 = this.anInt1012; local274 < this.anInt1012 + 8; local274++) {
							if (this.aClass23ArrayArrayArray1[this.anInt972][local269][local274] != null) {
								this.aClass23ArrayArrayArray1[this.anInt972][local269][local274] = null;
								this.method623(local269, local274);
							}
						}
					}
					for (@Pc(894) Class1_Sub2 local894 = (Class1_Sub2) this.aClass23_10.method422(); local894 != null; local894 = (Class1_Sub2) this.aClass23_10.method424((byte) 5)) {
						if (local894.anInt591 >= this.anInt1011 && local894.anInt591 < this.anInt1011 + 8 && local894.anInt592 >= this.anInt1012 && local894.anInt592 < this.anInt1012 + 8 && local894.anInt589 == this.anInt972) {
							local894.anInt597 = 0;
						}
					}
					this.anInt1032 = -1;
					return true;
				}
				if (this.anInt1032 == 229) {
					this.method640();
					this.anInt1032 = -1;
					return false;
				}
				if (this.anInt1032 == 22) {
					local269 = this.aClass1_Sub1_Sub3_7.method387();
					local274 = this.aClass1_Sub1_Sub3_7.method361();
					local494 = this.aClass1_Sub1_Sub3_7.method361();
					if (local269 == 65535) {
						Class39.aClass39Array1[local274].anInt706 = 0;
						this.anInt1032 = -1;
						return true;
					}
					@Pc(986) Class21 local986 = Class21.method335(local269);
					Class39.aClass39Array1[local274].anInt706 = 4;
					Class39.aClass39Array1[local274].anInt707 = local269;
					Class39.aClass39Array1[local274].anInt697 = local986.anInt403;
					Class39.aClass39Array1[local274].anInt698 = local986.anInt420;
					Class39.aClass39Array1[local274].anInt696 = local986.anInt422 * 100 / local494;
					this.anInt1032 = -1;
					return true;
				}
				if (this.anInt1032 == 54) {
					if (this.anInt889 != -1) {
						this.anInt889 = -1;
						this.aBoolean227 = true;
						this.aBoolean223 = true;
					}
					if (this.anInt885 != -1) {
						this.anInt885 = -1;
						this.aBoolean236 = true;
					}
					if (this.anInt877 != 0) {
						this.anInt877 = 0;
						this.aBoolean236 = true;
					}
					this.anInt938 = -1;
					this.aBoolean255 = false;
					this.anInt1032 = -1;
					return true;
				}
				@Pc(1136) int local1136;
				@Pc(1435) int local1435;
				@Pc(1456) int local1456;
				if (this.anInt1032 != 169 && this.anInt1032 != 243) {
					if (this.anInt1032 == 155) {
						this.aBoolean246 = true;
						this.anInt967 = this.aClass1_Sub1_Sub3_7.method359();
						this.anInt968 = this.aClass1_Sub1_Sub3_7.method359();
						this.anInt969 = this.aClass1_Sub1_Sub3_7.method361();
						this.anInt970 = this.aClass1_Sub1_Sub3_7.method359();
						this.anInt971 = this.aClass1_Sub1_Sub3_7.method359();
						if (this.anInt971 >= 100) {
							local269 = this.anInt967 * 128 + 64;
							local274 = this.anInt968 * 128 + 64;
							local494 = this.method705(local274, this.anInt972, local269) - this.anInt969;
							local496 = local269 - this.anInt879;
							local510 = local494 - this.anInt880;
							local1136 = local274 - this.anInt881;
							local1435 = (int) Math.sqrt((double) (local496 * local496 + local1136 * local1136));
							this.anInt882 = (int) (Math.atan2((double) local510, (double) local1435) * 325.949D) & 0x7FF;
							this.anInt883 = (int) (Math.atan2((double) local496, (double) local1136) * -325.949D) & 0x7FF;
							if (this.anInt882 < 128) {
								this.anInt882 = 128;
							}
							if (this.anInt882 > 383) {
								this.anInt882 = 383;
							}
						}
						this.anInt1032 = -1;
						return true;
					}
					if (this.anInt1032 == 37) {
						for (local269 = 0; local269 < this.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length; local269++) {
							if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local269] != null) {
								this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local269].anInt659 = -1;
							}
						}
						for (local274 = 0; local274 < this.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length; local274++) {
							if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local274] != null) {
								this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local274].anInt659 = -1;
							}
						}
						this.anInt1032 = -1;
						return true;
					}
					@Pc(2161) String local2161;
					if (this.anInt1032 == 99) {
						local269 = this.aClass1_Sub1_Sub3_7.method388();
						local2161 = this.aClass1_Sub1_Sub3_7.method366();
						Class39.aClass39Array1[local269].aString11 = local2161;
						if (Class39.aClass39Array1[local269].anInt703 == this.anIntArray255[this.anInt992]) {
							this.aBoolean227 = true;
						}
						this.anInt1032 = -1;
						return true;
					}
					if (this.anInt1032 == 26) {
						if (this.anInt992 == 12) {
							this.aBoolean227 = true;
						}
						this.anInt928 = this.aClass1_Sub1_Sub3_7.method359();
						this.anInt1032 = -1;
						return true;
					}
					if (this.anInt1032 == 195) {
						this.aBoolean227 = true;
						local269 = this.aClass1_Sub1_Sub3_7.method361();
						local490 = Class39.aClass39Array1[local269];
						while (this.aClass1_Sub1_Sub3_7.anInt443 < this.anInt1031) {
							local494 = this.aClass1_Sub1_Sub3_7.method373();
							local496 = this.aClass1_Sub1_Sub3_7.method361();
							local510 = this.aClass1_Sub1_Sub3_7.method359();
							if (local510 == 255) {
								local510 = this.aClass1_Sub1_Sub3_7.method364();
							}
							if (local494 >= 0 && local494 < local490.anIntArray152.length) {
								local490.anIntArray152[local494] = local496;
								local490.anIntArray157[local494] = local510;
							}
						}
						this.anInt1032 = -1;
						return true;
					}
					if (this.anInt1032 == 23) {
						local269 = this.aClass1_Sub1_Sub3_7.method361();
						local274 = this.aClass1_Sub1_Sub3_7.method387();
						local494 = this.aClass1_Sub1_Sub3_7.method386();
						Class39.aClass39Array1[local274].anInt695 = (local494 << 16) + local269;
						this.anInt1032 = -1;
						return true;
					}
					if (this.anInt1032 == 65) {
						this.anInt857 = this.aClass1_Sub1_Sub3_7.method359();
						this.anInt1032 = -1;
						return true;
					}
					if (this.anInt1032 == 74) {
						local269 = this.aClass1_Sub1_Sub3_7.method386();
						this.method676(local269);
						if (this.anInt885 != -1) {
							this.anInt885 = -1;
							this.aBoolean236 = true;
						}
						if (this.anInt877 != 0) {
							this.anInt877 = 0;
							this.aBoolean236 = true;
						}
						this.anInt889 = local269;
						this.aBoolean227 = true;
						this.aBoolean223 = true;
						this.anInt938 = -1;
						this.aBoolean255 = false;
						this.anInt1032 = -1;
						return true;
					}
					if (this.anInt1032 == 64) {
						this.anInt867 = this.aClass1_Sub1_Sub3_7.method386() * 30;
						this.anInt1032 = -1;
						return true;
					}
					if (this.anInt1032 != 76) {
						@Pc(2433) boolean local2433;
						@Pc(2568) String local2568;
						if (this.anInt1032 == 78) {
							local2417 = this.aClass1_Sub1_Sub3_7.method366();
							@Pc(2431) long local2431;
							if (local2417.endsWith(":tradereq:")) {
								local2161 = local2417.substring(0, local2417.indexOf(":"));
								local2431 = Class15.method194(local2161);
								local2433 = false;
								for (local1136 = 0; local1136 < this.anInt935; local1136++) {
									if (this.aLongArray3[local1136] == local2431) {
										local2433 = true;
										break;
									}
								}
								if (!local2433 && this.anInt997 == 0) {
									this.method695(local2161, 4, "wishes to trade with you.");
								}
							} else if (local2417.endsWith(":duelreq:")) {
								local2161 = local2417.substring(0, local2417.indexOf(":"));
								local2431 = Class15.method194(local2161);
								local2433 = false;
								for (local1136 = 0; local1136 < this.anInt935; local1136++) {
									if (this.aLongArray3[local1136] == local2431) {
										local2433 = true;
										break;
									}
								}
								if (!local2433 && this.anInt997 == 0) {
									this.method695(local2161, 8, "wishes to duel with you.");
								}
							} else if (local2417.endsWith(":chalreq:")) {
								local2161 = local2417.substring(0, local2417.indexOf(":"));
								local2431 = Class15.method194(local2161);
								local2433 = false;
								for (local1136 = 0; local1136 < this.anInt935; local1136++) {
									if (this.aLongArray3[local1136] == local2431) {
										local2433 = true;
										break;
									}
								}
								if (!local2433 && this.anInt997 == 0) {
									local2568 = local2417.substring(local2417.indexOf(":") + 1, local2417.length() - 9);
									this.method695(local2161, 8, local2568);
								}
							} else {
								this.method695("", 0, local2417);
							}
							this.anInt1032 = -1;
							return true;
						}
						if (this.anInt1032 == 95) {
							local269 = this.aClass1_Sub1_Sub3_7.method393((byte) 5);
							local274 = this.aClass1_Sub1_Sub3_7.method387();
							this.anIntArray273[local274] = local269;
							if (this.anIntArray267[local274] != local269) {
								this.anIntArray267[local274] = local269;
								this.method621(local274);
								this.aBoolean227 = true;
								if (this.anInt907 != -1) {
									this.aBoolean236 = true;
								}
							}
							this.anInt1032 = -1;
							return true;
						}
						if (this.anInt1032 == 135) {
							local269 = this.aClass1_Sub1_Sub3_7.method386();
							if (local269 == 65535) {
								local269 = -1;
							}
							if (local269 != this.anInt1052 && this.aBoolean225 && !aBoolean253 && this.anInt858 == 0) {
								this.anInt872 = local269;
								this.aBoolean219 = true;
								this.aClass16_Sub1_1.method214(2, this.anInt872);
							}
							this.anInt1052 = local269;
							this.anInt1032 = -1;
							return true;
						}
						if (this.anInt1032 == 137) {
							local269 = this.aClass1_Sub1_Sub3_7.method386();
							local274 = this.aClass1_Sub1_Sub3_7.method392(this.aByte48);
							if (this.aBoolean225 && !aBoolean253) {
								this.anInt872 = local269;
								this.aBoolean219 = false;
								this.aClass16_Sub1_1.method214(2, this.anInt872);
								this.anInt858 = local274;
							}
							this.anInt1032 = -1;
							return true;
						}
						if (this.anInt1032 == 179) {
							local269 = this.aClass1_Sub1_Sub3_7.method361();
							local274 = this.aClass1_Sub1_Sub3_7.method359();
							local494 = this.aClass1_Sub1_Sub3_7.method361();
							if (this.aBoolean216 && !aBoolean253 && this.anInt1030 < 50) {
								this.anIntArray213[this.anInt1030] = local269;
								this.anIntArray245[this.anInt1030] = local274;
								this.anIntArray262[this.anInt1030] = local494 + Class31.anIntArray134[local269];
								this.anInt1030++;
							}
							this.anInt1032 = -1;
							return true;
						}
						if (this.anInt1032 == 239) {
							local269 = this.aClass1_Sub1_Sub3_7.method359();
							local274 = this.aClass1_Sub1_Sub3_7.method359();
							local494 = this.aClass1_Sub1_Sub3_7.method359();
							local496 = this.aClass1_Sub1_Sub3_7.method359();
							this.aBooleanArray12[local269] = true;
							this.anIntArray248[local269] = local274;
							this.anIntArray229[local269] = local494;
							this.anIntArray268[local269] = local496;
							this.anIntArray212[local269] = 0;
							this.anInt1032 = -1;
							return true;
						}
						if (this.anInt1032 == 21) {
							this.anInt965 = 0;
							this.anInt1032 = -1;
							return true;
						}
						if (this.anInt1032 == 131) {
							local269 = this.aClass1_Sub1_Sub3_7.method388();
							local490 = Class39.aClass39Array1[local269];
							for (local494 = 0; local494 < local490.anIntArray152.length; local494++) {
								local490.anIntArray152[local494] = -1;
								local490.anIntArray152[local494] = 0;
							}
							this.anInt1032 = -1;
							return true;
						}
						if (this.anInt1032 == 57) {
							this.aBoolean227 = true;
							local269 = this.aClass1_Sub1_Sub3_7.method359();
							local274 = this.aClass1_Sub1_Sub3_7.method379();
							local494 = this.aClass1_Sub1_Sub3_7.method364();
							this.anIntArray214[local274] = local494;
							this.anIntArray231[local274] = local269;
							this.anIntArray228[local274] = 1;
							for (local496 = 0; local496 < 98; local496++) {
								if (local494 >= anIntArray266[local496]) {
									this.anIntArray228[local274] = local496 + 2;
								}
							}
							this.anInt1032 = -1;
							return true;
						}
						if (this.anInt1032 == 255) {
							this.anInt1011 = this.aClass1_Sub1_Sub3_7.method359();
							this.anInt1012 = this.aClass1_Sub1_Sub3_7.method359();
							this.anInt1032 = -1;
							return true;
						}
						if (this.anInt1032 == 185) {
							local269 = this.aClass1_Sub1_Sub3_7.method386();
							local274 = this.aClass1_Sub1_Sub3_7.method388();
							local494 = this.aClass1_Sub1_Sub3_7.method387();
							local496 = this.aClass1_Sub1_Sub3_7.method387();
							Class39.aClass39Array1[local269].anInt697 = local494;
							Class39.aClass39Array1[local269].anInt698 = local496;
							Class39.aClass39Array1[local269].anInt696 = local274;
							this.anInt1032 = -1;
							return true;
						}
						if (this.anInt1032 == 197) {
							this.aBoolean259 = false;
							this.anInt877 = 1;
							this.aString30 = "";
							this.aBoolean236 = true;
							this.anInt1032 = -1;
							return true;
						}
						if (this.anInt1032 == 141) {
							local269 = this.aClass1_Sub1_Sub3_7.method387();
							local274 = this.aClass1_Sub1_Sub3_7.method377();
							if (local269 == 65535) {
								local269 = -1;
							}
							this.anIntArray255[local274] = local269;
							this.aBoolean227 = true;
							this.aBoolean223 = true;
							this.anInt1032 = -1;
							return true;
						}
						@Pc(3068) long local3068;
						if (this.anInt1032 == 88) {
							local3068 = this.aClass1_Sub1_Sub3_7.method365();
							local494 = this.aClass1_Sub1_Sub3_7.method359();
							@Pc(3078) String local3078 = Class15.method198(Class15.method195(local3068));
							for (local510 = 0; local510 < this.anInt1037; local510++) {
								if (local3068 == this.aLongArray4[local510]) {
									if (this.anIntArray216[local510] != local494) {
										this.anIntArray216[local510] = local494;
										this.aBoolean227 = true;
										if (local494 > 0) {
											this.method695("", 5, local3078 + " has logged in.");
										}
										if (local494 == 0) {
											this.method695("", 5, local3078 + " has logged out.");
										}
									}
									local3078 = null;
									break;
								}
							}
							if (local3078 != null && this.anInt1037 < 200) {
								this.aLongArray4[this.anInt1037] = local3068;
								this.aStringArray10[this.anInt1037] = local3078;
								this.anIntArray216[this.anInt1037] = local494;
								this.anInt1037++;
								this.aBoolean227 = true;
							}
							@Pc(3176) boolean local3176 = false;
							while (!local3176) {
								local3176 = true;
								for (local1435 = 0; local1435 < this.anInt1037 - 1; local1435++) {
									if (this.anIntArray216[local1435] != anInt1017 && this.anIntArray216[local1435 + 1] == anInt1017 || this.anIntArray216[local1435] == 0 && this.anIntArray216[local1435 + 1] != 0) {
										local1456 = this.anIntArray216[local1435];
										this.anIntArray216[local1435] = this.anIntArray216[local1435 + 1];
										this.anIntArray216[local1435 + 1] = local1456;
										@Pc(3237) String local3237 = this.aStringArray10[local1435];
										this.aStringArray10[local1435] = this.aStringArray10[local1435 + 1];
										this.aStringArray10[local1435 + 1] = local3237;
										@Pc(3259) long local3259 = this.aLongArray4[local1435];
										this.aLongArray4[local1435] = this.aLongArray4[local1435 + 1];
										this.aLongArray4[local1435 + 1] = local3259;
										this.aBoolean227 = true;
										local3176 = false;
									}
								}
							}
							this.anInt1032 = -1;
							return true;
						}
						if (this.anInt1032 == 228) {
							this.anInt935 = this.anInt1031 / 8;
							for (local269 = 0; local269 < this.anInt935; local269++) {
								this.aLongArray3[local269] = this.aClass1_Sub1_Sub3_7.method365();
							}
							this.anInt1032 = -1;
							return true;
						}
						if (this.anInt1032 == 160) {
							local269 = this.aClass1_Sub1_Sub3_7.method387();
							this.method676(local269);
							if (this.anInt889 != -1) {
								this.anInt889 = -1;
								this.aBoolean227 = true;
								this.aBoolean223 = true;
							}
							if (this.anInt885 != -1) {
								this.anInt885 = -1;
								this.aBoolean236 = true;
							}
							if (this.anInt877 != 0) {
								this.anInt877 = 0;
								this.aBoolean236 = true;
							}
							this.anInt938 = local269;
							this.aBoolean255 = false;
							this.anInt1032 = -1;
							return true;
						}
						if (this.anInt1032 == 116) {
							local3068 = this.aClass1_Sub1_Sub3_7.method365();
							local494 = this.aClass1_Sub1_Sub3_7.method364();
							local496 = this.aClass1_Sub1_Sub3_7.method359();
							local2433 = false;
							for (local1136 = 0; local1136 < 100; local1136++) {
								if (this.anIntArray230[local1136] == local494) {
									local2433 = true;
									break;
								}
							}
							if (local496 <= 1) {
								for (local1435 = 0; local1435 < this.anInt935; local1435++) {
									if (this.aLongArray3[local1435] == local3068) {
										local2433 = true;
										break;
									}
								}
							}
							if (!local2433 && this.anInt997 == 0) {
								try {
									this.anIntArray230[this.anInt911] = local494;
									this.anInt911 = (this.anInt911 + 1) % 100;
									local2568 = Class18.method259(this.anInt1031 - 13, this.aClass1_Sub1_Sub3_7);
									if (local496 != 3) {
										local2568 = Class25.method445(local2568);
									}
									if (local496 == 2 || local496 == 3) {
										this.method695("@cr2@" + Class15.method198(Class15.method195(local3068)), 7, local2568);
									} else if (local496 == 1) {
										this.method695("@cr1@" + Class15.method198(Class15.method195(local3068)), 7, local2568);
									} else {
										this.method695(Class15.method198(Class15.method195(local3068)), 3, local2568);
									}
								} catch (@Pc(3535) Exception local3535) {
									signlink.reporterror("cde1");
								}
							}
							this.anInt1032 = -1;
							return true;
						}
						if (this.anInt1032 == 113) {
							this.anInt899 = this.aClass1_Sub1_Sub3_7.method359();
							this.anInt862 = this.aClass1_Sub1_Sub3_7.method387();
							this.anInt1032 = -1;
							return true;
						}
						if (this.anInt1032 == 71) {
							local269 = this.aClass1_Sub1_Sub3_7.method388();
							this.method676(local269);
							if (this.anInt889 != -1) {
								this.anInt889 = -1;
								this.aBoolean227 = true;
								this.aBoolean223 = true;
							}
							this.anInt885 = local269;
							this.aBoolean236 = true;
							this.anInt938 = -1;
							this.aBoolean255 = false;
							this.anInt1032 = -1;
							return true;
						}
						if (this.anInt1032 == 55) {
							this.anInt859 = this.aClass1_Sub1_Sub3_7.method359();
							this.anInt1021 = this.aClass1_Sub1_Sub3_7.method359();
							this.anInt1054 = this.aClass1_Sub1_Sub3_7.method359();
							this.aBoolean218 = true;
							this.aBoolean236 = true;
							this.anInt1032 = -1;
							return true;
						}
						if (this.anInt1032 == 109) {
							local269 = this.aClass1_Sub1_Sub3_7.method378(anInt941);
							local274 = this.aClass1_Sub1_Sub3_7.method359();
							@Pc(3653) String local3653 = this.aClass1_Sub1_Sub3_7.method366();
							if (local269 >= 1 && local269 <= 5) {
								if (local3653.equalsIgnoreCase("null")) {
									local3653 = null;
								}
								this.aStringArray11[local269 - 1] = local3653;
								this.aBooleanArray11[local269 - 1] = local274 == 0;
							}
							this.anInt1032 = -1;
							return true;
						}
						if (this.anInt1032 == 216) {
							this.aBoolean246 = true;
							this.anInt1001 = this.aClass1_Sub1_Sub3_7.method359();
							this.anInt1002 = this.aClass1_Sub1_Sub3_7.method359();
							this.anInt1003 = this.aClass1_Sub1_Sub3_7.method361();
							this.anInt1004 = this.aClass1_Sub1_Sub3_7.method359();
							this.anInt1005 = this.aClass1_Sub1_Sub3_7.method359();
							if (this.anInt1005 >= 100) {
								this.anInt879 = this.anInt1001 * 128 + 64;
								this.anInt881 = this.anInt1002 * 128 + 64;
								this.anInt880 = this.method705(this.anInt881, this.anInt972, this.anInt879) - this.anInt1003;
							}
							this.anInt1032 = -1;
							return true;
						}
						if (this.anInt1032 == 3) {
							this.method677(this.aClass1_Sub1_Sub3_7, this.anInt1031);
							this.aBoolean260 = false;
							this.anInt1032 = -1;
							return true;
						}
						if (this.anInt1032 == 196) {
							this.anInt992 = this.aClass1_Sub1_Sub3_7.method359();
							this.aBoolean227 = true;
							this.aBoolean223 = true;
							this.anInt1032 = -1;
							return true;
						}
						if (this.anInt1032 == 8) {
							this.anInt922 = this.aClass1_Sub1_Sub3_7.method386();
							this.anInt946 = this.aClass1_Sub1_Sub3_7.method393((byte) 5);
							this.anInt964 = this.aClass1_Sub1_Sub3_7.method378(anInt941);
							this.anInt1058 = this.aClass1_Sub1_Sub3_7.method377();
							this.anInt932 = this.aClass1_Sub1_Sub3_7.method386();
							if (this.anInt946 != 0 && this.anInt938 == -1) {
								signlink.dnslookup(Class15.method197(this.anInt946));
								this.method654(this.anInt942);
								@Pc(3850) short local3850 = 650;
								if (this.anInt964 != 201 || this.anInt1058 == 1) {
									local3850 = 655;
								}
								this.aString22 = "";
								this.aBoolean264 = false;
								for (local274 = 0; local274 < Class39.aClass39Array1.length; local274++) {
									if (Class39.aClass39Array1[local274] != null && Class39.aClass39Array1[local274].anInt701 == local3850) {
										this.anInt938 = Class39.aClass39Array1[local274].anInt703;
										break;
									}
								}
							}
							this.anInt1032 = -1;
							return true;
						}
						if (this.anInt1032 == 192) {
							this.anInt983 = this.aClass1_Sub1_Sub3_7.method359();
							this.anInt1032 = -1;
							return true;
						}
						if (this.anInt1032 == 205) {
							local269 = this.aClass1_Sub1_Sub3_7.method386();
							local274 = this.aClass1_Sub1_Sub3_7.method388();
							local494 = local269 >> 10 & 0x1F;
							local496 = local269 >> 5 & 0x1F;
							local510 = local269 & 0x1F;
							Class39.aClass39Array1[local274].anInt689 = (local494 << 19) + (local496 << 11) + (local510 << 3);
							this.anInt1032 = -1;
							return true;
						}
						if (this.anInt1032 == 152 || this.anInt1032 == 120 || this.anInt1032 == 194 || this.anInt1032 == 127 || this.anInt1032 == 47 || this.anInt1032 == 81 || this.anInt1032 == 170 || this.anInt1032 == 86 || this.anInt1032 == 254 || this.anInt1032 == 75 || this.anInt1032 == 124) {
							this.method700(this.aClass1_Sub1_Sub3_7, this.anInt1032);
							this.anInt1032 = -1;
							return true;
						}
						if (this.anInt1032 == 140) {
							local269 = this.aClass1_Sub1_Sub3_7.method361();
							@Pc(4031) byte local4031 = this.aClass1_Sub1_Sub3_7.method381();
							this.anIntArray273[local269] = local4031;
							if (this.anIntArray267[local269] != local4031) {
								this.anIntArray267[local269] = local4031;
								this.method621(local269);
								this.aBoolean227 = true;
								if (this.anInt907 != -1) {
									this.aBoolean236 = true;
								}
							}
							this.anInt1032 = -1;
							return true;
						}
						if (this.anInt1032 == 145) {
							local269 = this.aClass1_Sub1_Sub3_7.method387();
							local274 = this.aClass1_Sub1_Sub3_7.method388();
							Class39.aClass39Array1[local269].anInt706 = 1;
							Class39.aClass39Array1[local269].anInt707 = local274;
							this.anInt1032 = -1;
							return true;
						}
						if (this.anInt1032 == 206) {
							local269 = this.aClass1_Sub1_Sub3_7.method386();
							local274 = this.aClass1_Sub1_Sub3_7.method386();
							if (this.anInt885 != -1) {
								this.anInt885 = -1;
								this.aBoolean236 = true;
							}
							if (this.anInt877 != 0) {
								this.anInt877 = 0;
								this.aBoolean236 = true;
							}
							this.anInt938 = local269;
							this.anInt889 = local274;
							this.aBoolean227 = true;
							this.aBoolean223 = true;
							this.aBoolean255 = false;
							this.anInt1032 = -1;
							return true;
						}
						signlink.reporterror("T1 - " + this.anInt1032 + "," + this.anInt1031 + " - " + this.anInt1046 + "," + this.anInt1047);
						this.method640();
						return true;
					}
					this.aBoolean246 = false;
					for (local269 = 0; local269 < 5; local269++) {
						this.aBooleanArray12[local269] = false;
					}
					this.anInt1032 = -1;
					return true;
				}
				local269 = this.anInt913;
				local274 = this.anInt914;
				if (this.anInt1032 == 169) {
					local274 = this.aClass1_Sub1_Sub3_7.method387();
					local269 = this.aClass1_Sub1_Sub3_7.method386();
					this.aBoolean226 = false;
				}
				if (this.anInt1032 == 243) {
					local269 = this.aClass1_Sub1_Sub3_7.method388();
					local274 = this.aClass1_Sub1_Sub3_7.method361();
					this.aClass1_Sub1_Sub3_7.method369();
					local494 = 0;
					while (true) {
						if (local494 >= 4) {
							this.aClass1_Sub1_Sub3_7.method371();
							this.aBoolean226 = true;
							break;
						}
						for (local496 = 0; local496 < 13; local496++) {
							for (local510 = 0; local510 < 13; local510++) {
								local1136 = this.aClass1_Sub1_Sub3_7.method370(1);
								if (local1136 == 1) {
									this.anIntArrayArrayArray7[local494][local496][local510] = this.aClass1_Sub1_Sub3_7.method370(26);
								} else {
									this.anIntArrayArrayArray7[local494][local496][local510] = -1;
								}
							}
						}
						local494++;
					}
				}
				if (this.anInt913 == local269 && this.anInt914 == local274 && this.anInt1025 == 2) {
					this.anInt1032 = -1;
					return true;
				}
				this.anInt913 = local269;
				this.anInt914 = local274;
				this.anInt924 = (this.anInt913 - 6) * 8;
				this.anInt925 = (this.anInt914 - 6) * 8;
				this.aBoolean237 = false;
				if ((this.anInt913 / 8 == 48 || this.anInt913 / 8 == 49) && this.anInt914 / 8 == 48) {
					this.aBoolean237 = true;
				}
				if (this.anInt913 / 8 == 48 && this.anInt914 / 8 == 148) {
					this.aBoolean237 = true;
				}
				this.anInt1025 = 1;
				this.aLong33 = System.currentTimeMillis();
				this.aClass36_14.method503();
				this.aClass1_Sub1_Sub2_Sub2_3.method179("Loading - please wait.", 257, 151, 0, this.anInt943);
				this.aClass1_Sub1_Sub2_Sub2_3.method179("Loading - please wait.", 256, 150, 16777215, this.anInt943);
				this.aClass36_14.method504((byte) 9, 4, 4, super.aGraphics2);
				if (this.anInt1032 == 169) {
					local494 = 0;
					local496 = (this.anInt913 - 6) / 8;
					label1096: while (true) {
						if (local496 > (this.anInt913 + 6) / 8) {
							this.aByteArrayArray4 = new byte[local494][];
							this.aByteArrayArray5 = new byte[local494][];
							this.anIntArray256 = new int[local494];
							this.anIntArray257 = new int[local494];
							this.anIntArray258 = new int[local494];
							local494 = 0;
							local510 = (this.anInt913 - 6) / 8;
							while (true) {
								if (local510 > (this.anInt913 + 6) / 8) {
									break label1096;
								}
								for (local1136 = (this.anInt914 - 6) / 8; local1136 <= (this.anInt914 + 6) / 8; local1136++) {
									this.anIntArray256[local494] = (local510 << 8) + local1136;
									if (this.aBoolean237 && (local1136 == 49 || local1136 == 149 || local1136 == 147 || local510 == 50 || local510 == 49 && local1136 == 47)) {
										this.anIntArray257[local494] = -1;
										this.anIntArray258[local494] = -1;
										local494++;
									} else {
										local1435 = this.anIntArray257[local494] = this.aClass16_Sub1_1.method215(local1136, 0, local510, aBoolean220);
										if (local1435 != -1) {
											this.aClass16_Sub1_1.method214(3, local1435);
										}
										local1456 = this.anIntArray258[local494] = this.aClass16_Sub1_1.method215(local1136, 1, local510, aBoolean220);
										if (local1456 != -1) {
											this.aClass16_Sub1_1.method214(3, local1456);
										}
										local494++;
									}
								}
								local510++;
							}
						}
						for (local510 = (this.anInt914 - 6) / 8; local510 <= (this.anInt914 + 6) / 8; local510++) {
							local494++;
						}
						local496++;
					}
				}
				if (this.anInt1032 == 243) {
					local494 = 0;
					@Pc(1492) int[] local1492 = new int[676];
					local510 = 0;
					label1057: while (true) {
						@Pc(1522) int local1522;
						@Pc(1528) int local1528;
						@Pc(1538) int local1538;
						if (local510 >= 4) {
							this.aByteArrayArray4 = new byte[local494][];
							this.aByteArrayArray5 = new byte[local494][];
							this.anIntArray256 = new int[local494];
							this.anIntArray257 = new int[local494];
							this.anIntArray258 = new int[local494];
							local1136 = 0;
							while (true) {
								if (local1136 >= local494) {
									break label1057;
								}
								local1435 = this.anIntArray256[local1136] = local1492[local1136];
								local1456 = local1435 >> 8 & 0xFF;
								local1522 = local1435 & 0xFF;
								local1528 = this.anIntArray257[local1136] = this.aClass16_Sub1_1.method215(local1522, 0, local1456, aBoolean220);
								if (local1528 != -1) {
									this.aClass16_Sub1_1.method214(3, local1528);
								}
								local1538 = this.anIntArray258[local1136] = this.aClass16_Sub1_1.method215(local1522, 1, local1456, aBoolean220);
								if (local1538 != -1) {
									this.aClass16_Sub1_1.method214(3, local1538);
								}
								local1136++;
							}
						}
						for (local1136 = 0; local1136 < 13; local1136++) {
							for (local1435 = 0; local1435 < 13; local1435++) {
								local1456 = this.anIntArrayArrayArray7[local510][local1136][local1435];
								if (local1456 != -1) {
									local1522 = local1456 >> 14 & 0x3FF;
									local1528 = local1456 >> 3 & 0x7FF;
									local1538 = (local1522 / 8 << 8) + local1528 / 8;
									for (@Pc(1540) int local1540 = 0; local1540 < local494; local1540++) {
										if (local1492[local1540] == local1538) {
											local1538 = -1;
											break;
										}
									}
									if (local1538 != -1) {
										local1492[local494++] = local1538;
									}
								}
							}
						}
						local510++;
					}
				}
				local494 = this.anInt924 - this.anInt926;
				local496 = this.anInt925 - this.anInt927;
				this.anInt926 = this.anInt924;
				this.anInt927 = this.anInt925;
				for (local510 = 0; local510 < 16384; local510++) {
					@Pc(1693) Class1_Sub1_Sub1_Sub1_Sub2 local1693 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local510];
					if (local1693 != null) {
						for (local1435 = 0; local1435 < 10; local1435++) {
							local1693.anIntArray140[local1435] -= local494;
							local1693.anIntArray141[local1435] -= local496;
						}
						local1693.anInt620 -= local494 * 128;
						local1693.anInt621 -= local496 * 128;
					}
				}
				for (local1136 = 0; local1136 < this.anInt958; local1136++) {
					@Pc(1748) Class1_Sub1_Sub1_Sub1_Sub1 local1748 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local1136];
					if (local1748 != null) {
						for (local1456 = 0; local1456 < 10; local1456++) {
							local1748.anIntArray140[local1456] -= local494;
							local1748.anIntArray141[local1456] -= local496;
						}
						local1748.anInt620 -= local494 * 128;
						local1748.anInt621 -= local496 * 128;
					}
				}
				this.aBoolean260 = true;
				@Pc(1800) byte local1800 = 0;
				@Pc(1802) byte local1802 = 104;
				@Pc(1804) byte local1804 = 1;
				if (local494 < 0) {
					local1800 = 103;
					local1802 = -1;
					local1804 = -1;
				}
				@Pc(1814) byte local1814 = 0;
				@Pc(1816) byte local1816 = 104;
				@Pc(1818) byte local1818 = 1;
				if (local496 < 0) {
					local1814 = 103;
					local1816 = -1;
					local1818 = -1;
				}
				for (@Pc(1828) int local1828 = local1800; local1828 != local1802; local1828 += local1804) {
					for (@Pc(1832) int local1832 = local1814; local1832 != local1816; local1832 += local1818) {
						@Pc(1838) int local1838 = local1828 + local494;
						@Pc(1842) int local1842 = local1832 + local496;
						for (@Pc(1844) int local1844 = 0; local1844 < 4; local1844++) {
							if (local1838 >= 0 && local1842 >= 0 && local1838 < 104 && local1842 < 104) {
								this.aClass23ArrayArrayArray1[local1844][local1828][local1832] = this.aClass23ArrayArrayArray1[local1844][local1838][local1842];
							} else {
								this.aClass23ArrayArrayArray1[local1844][local1828][local1832] = null;
							}
						}
					}
				}
				for (@Pc(1906) Class1_Sub2 local1906 = (Class1_Sub2) this.aClass23_10.method422(); local1906 != null; local1906 = (Class1_Sub2) this.aClass23_10.method424((byte) 5)) {
					local1906.anInt591 -= local494;
					local1906.anInt592 -= local496;
					if (local1906.anInt591 < 0 || local1906.anInt592 < 0 || local1906.anInt591 >= 104 || local1906.anInt592 >= 104) {
						local1906.method544();
					}
				}
				if (this.anInt965 != 0) {
					this.anInt965 -= local494;
					this.anInt966 -= local496;
				}
				this.aBoolean246 = false;
				this.anInt1032 = -1;
				return true;
			} catch (@Pc(4177) IOException local4177) {
				this.method584();
			} catch (@Pc(4182) Exception local4182) {
				local2417 = "T2 - " + this.anInt1032 + "," + this.anInt1046 + "," + this.anInt1047 + " - " + this.anInt1031 + "," + (this.anInt924 + aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray140[0]) + "," + (this.anInt925 + aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray141[0]) + " - ";
				for (local274 = 0; local274 < this.anInt1031 && local274 < 50; local274++) {
					local2417 = local2417 + this.aClass1_Sub1_Sub3_7.aByteArray6[local274] + ",";
				}
				signlink.reporterror(local2417);
				this.method640();
			}
			return true;
		} catch (@Pc(4263) RuntimeException local4263) {
			signlink.reporterror("33197, " + 0 + ", " + local4263.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method682(@OriginalArg(0) byte arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt1030; local3++) {
				if (this.anIntArray262[local3] <= 0) {
					@Pc(12) boolean local12 = false;
					try {
						if (this.anIntArray213[local3] != this.anInt973 || this.anIntArray245[local3] != this.anInt963) {
							@Pc(45) Class1_Sub1_Sub3 local45 = Class31.method478(this.anIntArray213[local3], this.anIntArray245[local3]);
							if (System.currentTimeMillis() + (long) (local45.anInt443 / 22) > this.aLong31 + (long) (this.anInt884 / 22)) {
								this.anInt884 = local45.anInt443;
								this.aLong31 = System.currentTimeMillis();
								if (this.method644(local45.aByteArray6, local45.anInt443)) {
									this.anInt973 = this.anIntArray213[local3];
									this.anInt963 = this.anIntArray245[local3];
								} else {
									local12 = true;
								}
							}
						} else if (!this.method709(443)) {
							local12 = true;
						}
					} catch (@Pc(95) Exception local95) {
					}
					if (local12 && this.anIntArray262[local3] != -5) {
						this.anIntArray262[local3] = -5;
					} else {
						this.anInt1030--;
						for (@Pc(111) int local111 = local3; local111 < this.anInt1030; local111++) {
							this.anIntArray213[local111] = this.anIntArray213[local111 + 1];
							this.anIntArray245[local111] = this.anIntArray245[local111 + 1];
							this.anIntArray262[local111] = this.anIntArray262[local111 + 1];
						}
						local3--;
					}
				} else {
					@Pc(163) int local163 = this.anIntArray262[local3]--;
				}
			}
			@Pc(176) boolean local176 = false;
			if (this.anInt858 > 0) {
				this.anInt858 -= 20;
				if (this.anInt858 < 0) {
					this.anInt858 = 0;
				}
				if (this.anInt858 == 0 && this.aBoolean225 && !aBoolean253) {
					this.anInt872 = this.anInt1052;
					this.aBoolean219 = true;
					this.aClass16_Sub1_1.method214(2, this.anInt872);
					return;
				}
			}
		} catch (@Pc(217) RuntimeException local217) {
			signlink.reporterror("31096, " + arg0 + ", " + local217.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)Ljava/lang/String;")
	private String method683() {
		try {
			this.anInt1031 += 0;
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("52213, " + 0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method684(@OriginalArg(0) boolean arg0) {
		try {
			if (this.anInt1061 != 0) {
				@Pc(5) int local5 = 0;
				if (this.anInt867 != 0) {
					local5 = 1;
				}
				for (@Pc(12) int local12 = 0; local12 < 100; local12++) {
					if (this.aStringArray13[local12] != null) {
						@Pc(24) int local24 = this.anIntArray238[local12];
						@Pc(29) String local29 = this.aStringArray12[local12];
						if (local29 != null && local29.startsWith("@cr1@")) {
							local29 = local29.substring(5);
						}
						if (local29 != null && local29.startsWith("@cr2@")) {
							local29 = local29.substring(5);
						}
						if ((local24 == 3 || local24 == 7) && (local24 == 7 || this.anInt1021 == 0 || this.anInt1021 == 1 && this.method606(local29, this.aBoolean234))) {
							@Pc(83) int local83 = 329 - local5 * 13;
							if (super.anInt834 > 4 && super.anInt835 - 4 > local83 - 10 && super.anInt835 - 4 <= local83 + 3) {
								@Pc(122) int local122 = this.aClass1_Sub1_Sub2_Sub2_3.method181("From:  " + local29 + this.aStringArray13[local12]) + 25;
								if (local122 > 450) {
									local122 = 450;
								}
								if (super.anInt834 < local122 + 4) {
									if (this.anInt894 >= 1) {
										this.aStringArray9[this.anInt1019] = "Report abuse @whi@" + local29;
										this.anIntArray252[this.anInt1019] = 2200;
										this.anInt1019++;
									}
									this.aStringArray9[this.anInt1019] = "Add ignore @whi@" + local29;
									this.anIntArray252[this.anInt1019] = 2076;
									this.anInt1019++;
									this.aStringArray9[this.anInt1019] = "Add friend @whi@" + local29;
									this.anIntArray252[this.anInt1019] = 2394;
									this.anInt1019++;
								}
							}
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
						if ((local24 == 5 || local24 == 6) && this.anInt1021 < 2) {
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
					}
				}
				if (arg0) {
					this.aClass23ArrayArrayArray1 = null;
				}
			}
		} catch (@Pc(240) RuntimeException local240) {
			signlink.reporterror("50658, " + arg0 + ", " + local240.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method685() {
		try {
			this.anInt1031 += 0;
			try {
				@Pc(13) int local13 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt620 + this.anInt1009;
				@Pc(19) int local19 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt621 + this.anInt860;
				if (this.anInt994 - local13 < -500 || this.anInt994 - local13 > 500 || this.anInt995 - local19 < -500 || this.anInt995 - local19 > 500) {
					this.anInt994 = local13;
					this.anInt995 = local19;
				}
				if (this.anInt994 != local13) {
					this.anInt994 += (local13 - this.anInt994) / 16;
				}
				if (this.anInt995 != local19) {
					this.anInt995 += (local19 - this.anInt995) / 16;
				}
				if (super.anIntArray210[1] == 1) {
					this.anInt865 += (-this.anInt865 - 24) / 2;
				} else if (super.anIntArray210[2] == 1) {
					this.anInt865 += (24 - this.anInt865) / 2;
				} else {
					this.anInt865 /= 2;
				}
				if (super.anIntArray210[3] == 1) {
					this.anInt866 += (12 - this.anInt866) / 2;
				} else if (super.anIntArray210[4] == 1) {
					this.anInt866 += (-this.anInt866 - 12) / 2;
				} else {
					this.anInt866 /= 2;
				}
				this.anInt864 = this.anInt864 + this.anInt865 / 2 & 0x7FF;
				this.anInt863 += this.anInt866 / 2;
				if (this.anInt863 < 128) {
					this.anInt863 = 128;
				}
				if (this.anInt863 > 383) {
					this.anInt863 = 383;
				}
				@Pc(206) int local206 = this.anInt994 >> 7;
				@Pc(211) int local211 = this.anInt995 >> 7;
				@Pc(221) int local221 = this.method705(this.anInt995, this.anInt972, this.anInt994);
				@Pc(223) int local223 = 0;
				@Pc(239) int local239;
				if (local206 > 3 && local211 > 3 && local206 < 100 && local211 < 100) {
					for (local239 = local206 - 4; local239 <= local206 + 4; local239++) {
						for (@Pc(245) int local245 = local211 - 4; local245 <= local211 + 4; local245++) {
							@Pc(250) int local250 = this.anInt972;
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
				if (local239 > this.anInt1006) {
					this.anInt1006 += (local239 - this.anInt1006) / 24;
				} else if (local239 < this.anInt1006) {
					this.anInt1006 += (local239 - this.anInt1006) / 80;
				}
			} catch (@Pc(341) Exception local341) {
				signlink.reporterror("glfc_ex " + aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt620 + "," + aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt621 + "," + this.anInt994 + "," + this.anInt995 + "," + this.anInt913 + "," + this.anInt914 + "," + this.anInt924 + "," + this.anInt925);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(391) RuntimeException local391) {
			signlink.reporterror("99394, " + 0 + ", " + local391.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIILclient!ULLVQOAK;ZI)V")
	private void method686(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class39 arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7) {
		try {
			if (this.aBoolean243) {
				this.anInt1064 = 32;
			} else {
				this.anInt1064 = 0;
			}
			this.aBoolean243 = false;
			if (arg0 >= arg3 && arg0 < arg3 + 16 && arg2 >= arg1 && arg2 < arg1 + 16) {
				arg5.anInt712 -= this.anInt1024 * 4;
				if (arg6) {
					this.aBoolean227 = true;
					return;
				}
			} else if (arg0 >= arg3 && arg0 < arg3 + 16 && arg2 >= arg1 + arg4 - 16 && arg2 < arg1 + arg4) {
				arg5.anInt712 += this.anInt1024 * 4;
				if (arg6) {
					this.aBoolean227 = true;
					return;
				}
			} else if (arg0 >= arg3 - this.anInt1064 && arg0 < arg3 + this.anInt1064 + 16 && arg2 >= arg1 + 16 && arg2 < arg1 + arg4 - 16 && this.anInt1024 > 0) {
				@Pc(125) int local125 = (arg4 - 32) * arg4 / arg7;
				if (local125 < 8) {
					local125 = 8;
				}
				@Pc(140) int local140 = arg2 - arg1 - local125 / 2 - 16;
				@Pc(146) int local146 = arg4 - local125 - 32;
				arg5.anInt712 = (arg7 - arg4) * local140 / local146;
				if (arg6) {
					this.aBoolean227 = true;
				}
				this.aBoolean243 = true;
			} else {
				return;
			}
		} catch (@Pc(165) RuntimeException local165) {
			signlink.reporterror("91823, " + arg0 + ", " + 4 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local165.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method687() {
		try {
			@Pc(13) int local13 = 5;
			this.anIntArray254[8] = 0;
			@Pc(20) int local20 = 0;
			while (this.anIntArray254[8] == 0) {
				@Pc(24) String local24 = "Unknown problem";
				this.method581("Connecting to web server", 20);
				try {
					@Pc(46) DataInputStream local46 = this.method670("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 327);
					@Pc(53) Class1_Sub1_Sub3 local53 = new Class1_Sub1_Sub3(new byte[40], anInt1013);
					local46.readFully(local53.aByteArray6, 0, 40);
					local46.close();
					for (@Pc(63) int local63 = 0; local63 < 9; local63++) {
						this.anIntArray254[local63] = local53.method364();
					}
					@Pc(78) int local78 = local53.method364();
					@Pc(80) int local80 = 1234;
					for (@Pc(82) int local82 = 0; local82 < 9; local82++) {
						local80 = (local80 << 1) + this.anIntArray254[local82];
					}
					if (local78 != local80) {
						local24 = "checksum problem";
						this.anIntArray254[8] = 0;
					}
				} catch (@Pc(109) EOFException local109) {
					local24 = "EOF problem";
					this.anIntArray254[8] = 0;
				} catch (@Pc(118) IOException local118) {
					local24 = "connection problem";
					this.anIntArray254[8] = 0;
				} catch (@Pc(127) Exception local127) {
					local24 = "logic problem";
					this.anIntArray254[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray254[8] == 0) {
					local20++;
					for (@Pc(145) int local145 = local13; local145 > 0; local145--) {
						if (local20 >= 10) {
							this.method581("Game updated - please reload page", 10);
							local145 = 10;
						} else {
							this.method581(local24 + " - Will retry in " + local145 + " secs.", 10);
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
					this.aBoolean242 = !this.aBoolean242;
				}
			}
		} catch (@Pc(207) RuntimeException local207) {
			signlink.reporterror("32966, " + 982 + ", " + local207.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!LDILQFVA;)V")
	private void method688(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			for (@Pc(10) int local10 = 0; local10 < this.anInt961; local10++) {
				@Pc(17) int local17 = this.anIntArray247[local10];
				@Pc(22) Class1_Sub1_Sub1_Sub1_Sub1 local22 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local17];
				@Pc(25) int local25 = arg1.method359();
				if ((local25 & 0x20) != 0) {
					local25 += arg1.method359() << 8;
				}
				this.method691(local17, arg1, local25, local22);
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("94835, " + arg0 + ", " + -139 + ", " + arg1 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ILclient!LDILQFVA;I)V")
	private void method689(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			while (true) {
				if (arg1.anInt444 + 21 < arg0 * 8) {
					@Pc(12) int local12 = arg1.method370(14);
					if (local12 != 16383) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12] == null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12] = new Class1_Sub1_Sub1_Sub1_Sub2();
						}
						@Pc(32) Class1_Sub1_Sub1_Sub1_Sub2 local32 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12];
						this.anIntArray265[this.anInt1036++] = local12;
						local32.anInt665 = anInt931;
						@Pc(51) int local51 = arg1.method370(1);
						if (local51 == 1) {
							this.anIntArray247[this.anInt961++] = local12;
						}
						local32.aClass49_2 = Class49.method565(arg1.method370(12));
						@Pc(77) int local77 = arg1.method370(5);
						if (local77 > 15) {
							local77 -= 32;
						}
						@Pc(86) int local86 = arg1.method370(5);
						if (local86 > 15) {
							local86 -= 32;
						}
						@Pc(95) int local95 = arg1.method370(1);
						local32.anInt639 = local32.aClass49_2.aByte35;
						local32.anInt633 = local32.aClass49_2.anInt815;
						local32.anInt648 = local32.aClass49_2.anInt805;
						local32.anInt649 = local32.aClass49_2.anInt812;
						local32.anInt650 = local32.aClass49_2.anInt803;
						local32.anInt651 = local32.aClass49_2.anInt799;
						local32.anInt630 = local32.aClass49_2.anInt807;
						local32.method501(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray141[0] + local86, local95 == 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray140[0] + local77);
						continue;
					}
				}
				arg1.method371();
				if (this.anInt1060 != 7) {
					this.anInt945 = -103;
					return;
				}
				return;
			}
		} catch (@Pc(165) RuntimeException local165) {
			signlink.reporterror("1155, " + arg0 + ", " + arg1 + ", " + 7 + ", " + local165.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!LKEIRLLI;)V")
	private void method690(@OriginalArg(1) Class1_Sub1_Sub2_Sub4 arg0) {
		try {
			for (@Pc(9) int local9 = 0; local9 < this.anIntArray271.length; local9++) {
				this.anIntArray271[local9] = 0;
			}
			@Pc(34) int local34;
			for (@Pc(24) int local24 = 0; local24 < 5000; local24++) {
				local34 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray271[local34] = (int) (Math.random() * 256.0D);
			}
			@Pc(52) int local52;
			@Pc(56) int local56;
			@Pc(64) int local64;
			for (local34 = 0; local34 < 20; local34++) {
				for (local52 = 1; local52 < 255; local52++) {
					for (local56 = 1; local56 < 127; local56++) {
						local64 = local56 + (local52 << 7);
						this.anIntArray272[local64] = (this.anIntArray271[local64 - 1] + this.anIntArray271[local64 + 1] + this.anIntArray271[local64 - 128] + this.anIntArray271[local64 + 128]) / 4;
					}
				}
				@Pc(110) int[] local110 = this.anIntArray271;
				this.anIntArray271 = this.anIntArray272;
				this.anIntArray272 = local110;
			}
			if (arg0 != null) {
				local52 = 0;
				for (local56 = 0; local56 < arg0.anInt466; local56++) {
					for (local64 = 0; local64 < arg0.anInt465; local64++) {
						if (arg0.aByteArray7[local52++] != 0) {
							@Pc(146) int local146 = local64 + arg0.anInt467 + 16;
							@Pc(153) int local153 = local56 + arg0.anInt468 + 16;
							@Pc(159) int local159 = local146 + (local153 << 7);
							this.anIntArray271[local159] = 0;
						}
					}
				}
			}
		} catch (@Pc(176) RuntimeException local176) {
			signlink.reporterror("10453, " + 5 + ", " + arg0 + ", " + local176.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!LDILQFVA;ILclient!AHUILQJH;B)V")
	private void method691(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub1_Sub1_Sub1_Sub1 arg3) {
		try {
			@Pc(15) int local15;
			@Pc(19) int local19;
			if ((arg2 & 0x4) != 0) {
				local15 = arg1.method379();
				local19 = arg1.method379();
				arg3.method500(local19, local15, anInt931);
				arg3.anInt627 = anInt931 + 300;
				arg3.anInt628 = arg1.method377();
				arg3.anInt629 = arg1.method379();
			}
			@Pc(69) int local69;
			if ((arg2 & 0x10) != 0) {
				local15 = arg1.method387();
				if (local15 == 65535) {
					local15 = -1;
				}
				local19 = arg1.method378(anInt941);
				if (local15 == arg3.anInt659 && local15 != -1) {
					local69 = Class46.aClass46Array1[local15].anInt783;
					if (local69 == 1) {
						arg3.anInt660 = 0;
						arg3.anInt661 = 0;
						arg3.anInt662 = local19;
						arg3.anInt663 = 0;
					}
					if (local69 == 2) {
						arg3.anInt663 = 0;
					}
				} else if (local15 == -1 || arg3.anInt659 == -1 || Class46.aClass46Array1[local15].anInt777 >= Class46.aClass46Array1[arg3.anInt659].anInt777) {
					arg3.anInt659 = local15;
					arg3.anInt660 = 0;
					arg3.anInt661 = 0;
					arg3.anInt662 = local19;
					arg3.anInt663 = 0;
					arg3.anInt657 = arg3.anInt623;
				}
			}
			if ((arg2 & 0x80) != 0) {
				arg3.aString8 = arg1.method366();
				if (arg3.aString8.charAt(0) == '~') {
					arg3.aString8 = arg3.aString8.substring(1);
					this.method695(arg3.aString3, 2, arg3.aString8);
				} else if (arg3 == aClass1_Sub1_Sub1_Sub1_Sub1_1) {
					this.method695(arg3.aString3, 2, arg3.aString8);
				}
				arg3.anInt655 = 0;
				arg3.anInt619 = 0;
				arg3.anInt664 = 150;
			}
			if ((arg2 & 0x200) != 0) {
				local15 = arg1.method378(anInt941);
				local19 = arg1.method379();
				arg3.method500(local19, local15, anInt931);
				arg3.anInt627 = anInt931 + 300;
				arg3.anInt628 = arg1.method359();
				arg3.anInt629 = arg1.method379();
			}
			if ((arg2 & 0x40) != 0) {
				local15 = arg1.method361();
				local19 = arg1.method378(anInt941);
				local69 = arg1.method359();
				@Pc(227) int local227 = arg1.anInt443;
				if (arg3.aString3 != null && arg3.aBoolean19) {
					@Pc(237) long local237 = Class15.method194(arg3.aString3);
					@Pc(239) boolean local239 = false;
					if (local19 <= 1) {
						for (@Pc(244) int local244 = 0; local244 < this.anInt935; local244++) {
							if (this.aLongArray3[local244] == local237) {
								local239 = true;
								break;
							}
						}
					}
					if (!local239 && this.anInt997 == 0) {
						try {
							this.aClass1_Sub1_Sub3_8.anInt443 = 0;
							arg1.method397(local69, this.aClass1_Sub1_Sub3_8.aByteArray6, this.aBoolean257);
							this.aClass1_Sub1_Sub3_8.anInt443 = 0;
							@Pc(290) String local290 = Class18.method259(local69, this.aClass1_Sub1_Sub3_8);
							@Pc(294) String local294 = Class25.method445(local290);
							arg3.aString8 = local294;
							arg3.anInt655 = local15 >> 8;
							arg3.anInt619 = local15 & 0xFF;
							arg3.anInt664 = 150;
							if (local19 == 2 || local19 == 3) {
								this.method695("@cr2@" + arg3.aString3, 1, local294);
							} else if (local19 == 1) {
								this.method695("@cr1@" + arg3.aString3, 1, local294);
							} else {
								this.method695(arg3.aString3, 2, local294);
							}
						} catch (@Pc(358) Exception local358) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg1.anInt443 = local227 + local69;
			}
			if ((arg2 & 0x2) != 0) {
				arg3.anInt653 = arg1.method388();
				arg3.anInt654 = arg1.method387();
			}
			if ((arg2 & 0x8) != 0) {
				arg3.anInt656 = arg1.method387();
				if (arg3.anInt656 == 65535) {
					arg3.anInt656 = -1;
				}
			}
			if ((arg2 & 0x1) != 0) {
				local15 = arg1.method378(anInt941);
				@Pc(407) byte[] local407 = new byte[local15];
				@Pc(413) Class1_Sub1_Sub3 local413 = new Class1_Sub1_Sub3(local407, anInt1013);
				arg1.method396(local15, local407);
				this.aClass1_Sub1_Sub3Array1[arg0] = local413;
				arg3.method27(local413);
			}
			if ((arg2 & 0x400) != 0) {
				arg3.anInt641 = arg1.method378(anInt941);
				arg3.anInt643 = arg1.method377();
				arg3.anInt642 = arg1.method378(anInt941);
				arg3.anInt644 = arg1.method359();
				arg3.anInt645 = arg1.method388() + anInt931;
				arg3.anInt646 = arg1.method388() + anInt931;
				arg3.anInt647 = arg1.method378(anInt941);
				arg3.method499();
			}
			if ((arg2 & 0x100) != 0) {
				arg3.anInt634 = arg1.method361();
				local15 = arg1.method393((byte) 5);
				arg3.anInt638 = local15 >> 16;
				arg3.anInt637 = anInt931 + (local15 & 0xFFFF);
				arg3.anInt635 = 0;
				arg3.anInt636 = 0;
				if (arg3.anInt637 > anInt931) {
					arg3.anInt635 = -1;
				}
				if (arg3.anInt634 == 65535) {
					arg3.anInt634 = -1;
					return;
				}
			}
		} catch (@Pc(519) RuntimeException local519) {
			signlink.reporterror("66905, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -48 + ", " + local519.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private void method692(@OriginalArg(0) boolean arg0) {
		try {
			this.aBoolean248 = true;
			for (@Pc(6) int local6 = 0; local6 < 7; local6++) {
				this.anIntArray270[local6] = -1;
				for (@Pc(15) int local15 = 0; local15 < Class47.anInt794; local15++) {
					if (!Class47.aClass47Array1[local15].aBoolean204 && Class47.aClass47Array1[local15].anInt795 == local6 + (this.aBoolean249 ? 0 : 7)) {
						this.anIntArray270[local6] = local15;
						break;
					}
				}
			}
			if (arg0) {
				this.anInt1032 = this.aClass1_Sub1_Sub3_7.method359();
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("13418, " + arg0 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method693(@OriginalArg(0) int arg0) {
		try {
			while (arg0 >= 0) {
				this.anInt1032 = -1;
			}
			this.anInt910++;
			this.method656(true);
			this.method680(true);
			this.method656(false);
			this.method680(false);
			this.method701();
			this.method702();
			@Pc(42) int local42;
			@Pc(81) int local81;
			if (!this.aBoolean246) {
				local42 = this.anInt863;
				if (this.anInt1006 / 256 > local42) {
					local42 = this.anInt1006 / 256;
				}
				if (this.aBooleanArray12[4] && this.anIntArray229[4] + 128 > local42) {
					local42 = this.anIntArray229[4] + 128;
				}
				local81 = this.anInt864 + this.anInt908 & 0x7FF;
				this.method595(this.anInt995, local42 * 3 + 600, this.anInt994, local81, local42, this.method705(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt621, this.anInt972, aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt620) - 50);
			}
			if (this.aBoolean246) {
				local42 = this.method672();
			} else {
				local42 = this.method671();
			}
			local81 = this.anInt879;
			@Pc(125) int local125 = this.anInt880;
			@Pc(128) int local128 = this.anInt881;
			@Pc(131) int local131 = this.anInt882;
			@Pc(134) int local134 = this.anInt883;
			@Pc(183) int local183;
			for (@Pc(136) int local136 = 0; local136 < 5; local136++) {
				if (this.aBooleanArray12[local136]) {
					local183 = (int) (Math.random() * (double) (this.anIntArray248[local136] * 2 + 1) - (double) this.anIntArray248[local136] + Math.sin((double) this.anIntArray212[local136] * ((double) this.anIntArray268[local136] / 100.0D)) * (double) this.anIntArray229[local136]);
					if (local136 == 0) {
						this.anInt879 += local183;
					}
					if (local136 == 1) {
						this.anInt880 += local183;
					}
					if (local136 == 2) {
						this.anInt881 += local183;
					}
					if (local136 == 3) {
						this.anInt883 = this.anInt883 + local183 & 0x7FF;
					}
					if (local136 == 4) {
						this.anInt882 += local183;
						if (this.anInt882 < 128) {
							this.anInt882 = 128;
						}
						if (this.anInt882 > 383) {
							this.anInt882 = 383;
						}
					}
				}
			}
			local183 = Class1_Sub1_Sub2_Sub3.anInt334;
			Class1_Sub1_Sub1_Sub4.aBoolean98 = true;
			Class1_Sub1_Sub1_Sub4.anInt362 = 0;
			Class1_Sub1_Sub1_Sub4.anInt360 = super.anInt834 - 4;
			Class1_Sub1_Sub1_Sub4.anInt361 = super.anInt835 - 4;
			Class1_Sub1_Sub2.method403();
			this.aClass5_1.method81(this.anInt881, this.anInt879, local42, this.anInt883, this.anInt880, this.anInt882);
			this.aClass5_1.method56();
			this.method699();
			this.method631();
			this.method604(local183);
			this.method613();
			this.aClass36_14.method504((byte) 9, 4, 4, super.aGraphics2);
			this.anInt879 = local81;
			this.anInt880 = local125;
			this.anInt881 = local128;
			this.anInt882 = local131;
			this.anInt883 = local134;
		} catch (@Pc(322) RuntimeException local322) {
			signlink.reporterror("87502, " + arg0 + ", " + local322.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLjava/lang/String;ILjava/lang/String;)V")
	private void method695(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		try {
			if (arg1 == 0 && this.anInt907 != -1) {
				this.aString19 = arg2;
				super.anInt839 = 0;
			}
			if (this.anInt885 == -1) {
				this.aBoolean236 = true;
			}
			for (@Pc(20) int local20 = 99; local20 > 0; local20--) {
				this.anIntArray238[local20] = this.anIntArray238[local20 - 1];
				this.aStringArray12[local20] = this.aStringArray12[local20 - 1];
				this.aStringArray13[local20] = this.aStringArray13[local20 - 1];
			}
			this.anIntArray238[0] = arg1;
			this.aStringArray12[0] = arg0;
			this.aStringArray13[0] = arg2;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("45081, " + -32 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private void method696() {
		try {
			if (super.anInt839 == 1) {
				if (super.anInt840 >= 6 && super.anInt840 <= 106 && super.anInt841 >= 467 && super.anInt841 <= 499) {
					this.anInt859 = (this.anInt859 + 1) % 4;
					this.aBoolean218 = true;
					this.aBoolean236 = true;
					this.aClass1_Sub1_Sub3_6.method348(39);
					this.aClass1_Sub1_Sub3_6.method349(this.anInt859);
					this.aClass1_Sub1_Sub3_6.method349(this.anInt1021);
					this.aClass1_Sub1_Sub3_6.method349(this.anInt1054);
				}
				if (super.anInt840 >= 135 && super.anInt840 <= 235 && super.anInt841 >= 467 && super.anInt841 <= 499) {
					this.anInt1021 = (this.anInt1021 + 1) % 3;
					this.aBoolean218 = true;
					this.aBoolean236 = true;
					this.aClass1_Sub1_Sub3_6.method348(39);
					this.aClass1_Sub1_Sub3_6.method349(this.anInt859);
					this.aClass1_Sub1_Sub3_6.method349(this.anInt1021);
					this.aClass1_Sub1_Sub3_6.method349(this.anInt1054);
				}
				if (super.anInt840 >= 273 && super.anInt840 <= 373 && super.anInt841 >= 467 && super.anInt841 <= 499) {
					this.anInt1054 = (this.anInt1054 + 1) % 3;
					this.aBoolean218 = true;
					this.aBoolean236 = true;
					this.aClass1_Sub1_Sub3_6.method348(39);
					this.aClass1_Sub1_Sub3_6.method349(this.anInt859);
					this.aClass1_Sub1_Sub3_6.method349(this.anInt1021);
					this.aClass1_Sub1_Sub3_6.method349(this.anInt1054);
				}
				if (super.anInt840 >= 412 && super.anInt840 <= 512 && super.anInt841 >= 467 && super.anInt841 <= 499) {
					if (this.anInt938 == -1) {
						this.method654(this.anInt942);
						this.aString22 = "";
						this.aBoolean264 = false;
						for (@Pc(198) int local198 = 0; local198 < Class39.aClass39Array1.length; local198++) {
							if (Class39.aClass39Array1[local198] != null && Class39.aClass39Array1[local198].anInt701 == 600) {
								this.anInt1055 = this.anInt938 = Class39.aClass39Array1[local198].anInt703;
								return;
							}
						}
						return;
					}
					this.method695("", 0, "Please close the interface you have open before using 'report abuse'");
					return;
				}
			}
		} catch (@Pc(234) RuntimeException local234) {
			signlink.reporterror("18774, " + -5 + ", " + local234.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private void method697() {
		try {
			if (this.anInt853 == 0 && this.anInt849 == 0) {
				this.aStringArray9[this.anInt1019] = "Walk here";
				this.anIntArray252[this.anInt1019] = 84;
				this.anIntArray250[this.anInt1019] = super.anInt834;
				this.anIntArray251[this.anInt1019] = super.anInt835;
				this.anInt1019++;
			}
			@Pc(50) int local50 = -1;
			for (@Pc(52) int local52 = 0; local52 < Class1_Sub1_Sub1_Sub4.anInt362; local52++) {
				@Pc(58) int local58 = Class1_Sub1_Sub1_Sub4.anIntArray95[local52];
				@Pc(62) int local62 = local58 & 0x7F;
				@Pc(68) int local68 = local58 >> 7 & 0x7F;
				@Pc(74) int local74 = local58 >> 29 & 0x3;
				@Pc(80) int local80 = local58 >> 14 & 0x7FFF;
				if (local58 != local50) {
					local50 = local58;
					@Pc(227) int local227;
					if (local74 == 2 && this.aClass5_1.method72(this.anInt972, local62, local68, local58) >= 0) {
						@Pc(100) Class40 local100 = Class40.method529(local80);
						if (local100.anIntArray164 != null) {
							local100 = local100.method521();
						}
						if (local100 == null) {
							continue;
						}
						if (this.anInt853 == 1) {
							this.aStringArray9[this.anInt1019] = "Use " + this.aString18 + " with @cya@" + local100.aString14;
							this.anIntArray252[this.anInt1019] = 584;
							this.anIntArray253[this.anInt1019] = local58;
							this.anIntArray250[this.anInt1019] = local62;
							this.anIntArray251[this.anInt1019] = local68;
							this.anInt1019++;
						} else if (this.anInt849 != 1) {
							if (local100.aStringArray6 != null) {
								for (local227 = 4; local227 >= 0; local227--) {
									if (local100.aStringArray6[local227] != null) {
										this.aStringArray9[this.anInt1019] = local100.aStringArray6[local227] + " @cya@" + local100.aString14;
										if (local227 == 0) {
											this.anIntArray252[this.anInt1019] = 329;
										}
										if (local227 == 1) {
											this.anIntArray252[this.anInt1019] = 549;
										}
										if (local227 == 2) {
											this.anIntArray252[this.anInt1019] = 478;
										}
										if (local227 == 3) {
											this.anIntArray252[this.anInt1019] = 499;
										}
										if (local227 == 4) {
											this.anIntArray252[this.anInt1019] = 1174;
										}
										this.anIntArray253[this.anInt1019] = local58;
										this.anIntArray250[this.anInt1019] = local62;
										this.anIntArray251[this.anInt1019] = local68;
										this.anInt1019++;
									}
								}
							}
							this.aStringArray9[this.anInt1019] = "Examine @cya@" + local100.aString14;
							this.anIntArray252[this.anInt1019] = 1951;
							this.anIntArray253[this.anInt1019] = local100.anInt734 << 14;
							this.anIntArray250[this.anInt1019] = local62;
							this.anIntArray251[this.anInt1019] = local68;
							this.anInt1019++;
						} else if ((this.anInt851 & 0x4) == 4) {
							this.aStringArray9[this.anInt1019] = this.aString17 + " @cya@" + local100.aString14;
							this.anIntArray252[this.anInt1019] = 144;
							this.anIntArray253[this.anInt1019] = local58;
							this.anIntArray250[this.anInt1019] = local62;
							this.anIntArray251[this.anInt1019] = local68;
							this.anInt1019++;
						}
					}
					@Pc(407) Class1_Sub1_Sub1_Sub1_Sub2 local407;
					@Pc(455) Class1_Sub1_Sub1_Sub1_Sub1 local455;
					@Pc(445) int local445;
					if (local74 == 1) {
						@Pc(378) Class1_Sub1_Sub1_Sub1_Sub2 local378 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local80];
						if (local378.aClass49_2.aByte35 == 1 && (local378.anInt620 & 0x7F) == 64 && (local378.anInt621 & 0x7F) == 64) {
							for (local227 = 0; local227 < this.anInt1036; local227++) {
								local407 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray265[local227]];
								if (local407 != null && local407 != local378 && local407.aClass49_2.aByte35 == 1 && local407.anInt620 == local378.anInt620 && local407.anInt621 == local378.anInt621) {
									this.method711(local68, local407.aClass49_2, this.anIntArray265[local227], local62);
								}
							}
							for (local445 = 0; local445 < this.anInt960; local445++) {
								local455 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray246[local445]];
								if (local455 != null && local455.anInt620 == local378.anInt620 && local455.anInt621 == local378.anInt621) {
									this.method673(this.anIntArray246[local445], local68, local455, local62, 582);
								}
							}
						}
						this.method711(local68, local378.aClass49_2, local80, local62);
					}
					if (local74 == 0) {
						@Pc(497) Class1_Sub1_Sub1_Sub1_Sub1 local497 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local80];
						if ((local497.anInt620 & 0x7F) == 64 && (local497.anInt621 & 0x7F) == 64) {
							for (local227 = 0; local227 < this.anInt1036; local227++) {
								local407 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray265[local227]];
								if (local407 != null && local407.aClass49_2.aByte35 == 1 && local407.anInt620 == local497.anInt620 && local407.anInt621 == local497.anInt621) {
									this.method711(local68, local407.aClass49_2, this.anIntArray265[local227], local62);
								}
							}
							for (local445 = 0; local445 < this.anInt960; local445++) {
								local455 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray246[local445]];
								if (local455 != null && local455 != local497 && local455.anInt620 == local497.anInt620 && local455.anInt621 == local497.anInt621) {
									this.method673(this.anIntArray246[local445], local68, local455, local62, 582);
								}
							}
						}
						this.method673(local80, local68, local497, local62, 582);
					}
					if (local74 == 3) {
						@Pc(616) Class23 local616 = this.aClass23ArrayArrayArray1[this.anInt972][local62][local68];
						if (local616 != null) {
							for (@Pc(623) Class1_Sub1_Sub1_Sub6 local623 = (Class1_Sub1_Sub1_Sub6) local616.method423(); local623 != null; local623 = (Class1_Sub1_Sub1_Sub6) local616.method425()) {
								@Pc(629) Class21 local629 = Class21.method335(local623.anInt789);
								if (this.anInt853 == 1) {
									this.aStringArray9[this.anInt1019] = "Use " + this.aString18 + " with @lre@" + local629.aString6;
									this.anIntArray252[this.anInt1019] = 726;
									this.anIntArray253[this.anInt1019] = local623.anInt789;
									this.anIntArray250[this.anInt1019] = local62;
									this.anIntArray251[this.anInt1019] = local68;
									this.anInt1019++;
								} else if (this.anInt849 != 1) {
									for (@Pc(746) int local746 = 4; local746 >= 0; local746--) {
										if (local629.aStringArray1 != null && local629.aStringArray1[local746] != null) {
											this.aStringArray9[this.anInt1019] = local629.aStringArray1[local746] + " @lre@" + local629.aString6;
											if (local746 == 0) {
												this.anIntArray252[this.anInt1019] = 748;
											}
											if (local746 == 1) {
												this.anIntArray252[this.anInt1019] = 253;
											}
											if (local746 == 2) {
												this.anIntArray252[this.anInt1019] = 978;
											}
											if (local746 == 3) {
												this.anIntArray252[this.anInt1019] = 100;
											}
											if (local746 == 4) {
												this.anIntArray252[this.anInt1019] = 698;
											}
											this.anIntArray253[this.anInt1019] = local623.anInt789;
											this.anIntArray250[this.anInt1019] = local62;
											this.anIntArray251[this.anInt1019] = local68;
											this.anInt1019++;
										} else if (local746 == 2) {
											this.aStringArray9[this.anInt1019] = "Take @lre@" + local629.aString6;
											this.anIntArray252[this.anInt1019] = 978;
											this.anIntArray253[this.anInt1019] = local623.anInt789;
											this.anIntArray250[this.anInt1019] = local62;
											this.anIntArray251[this.anInt1019] = local68;
											this.anInt1019++;
										}
									}
									this.aStringArray9[this.anInt1019] = "Examine @lre@" + local629.aString6;
									this.anIntArray252[this.anInt1019] = 1022;
									this.anIntArray253[this.anInt1019] = local623.anInt789;
									this.anIntArray250[this.anInt1019] = local62;
									this.anIntArray251[this.anInt1019] = local68;
									this.anInt1019++;
								} else if ((this.anInt851 & 0x1) == 1) {
									this.aStringArray9[this.anInt1019] = this.aString17 + " @lre@" + local629.aString6;
									this.anIntArray252[this.anInt1019] = 174;
									this.anIntArray253[this.anInt1019] = local623.anInt789;
									this.anIntArray250[this.anInt1019] = local62;
									this.anIntArray251[this.anInt1019] = local68;
									this.anInt1019++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(953) RuntimeException local953) {
			signlink.reporterror("77240, " + 155 + ", " + local953.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
	private void method698() {
		try {
			this.aBoolean250 = false;
			while (this.aBoolean228) {
				this.aBoolean250 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(11) Exception local11) {
				}
			}
			this.aClass1_Sub1_Sub2_Sub4_17 = null;
			this.aClass1_Sub1_Sub2_Sub4_18 = null;
			this.aClass1_Sub1_Sub2_Sub4Array5 = null;
			this.anIntArray233 = null;
			this.anIntArray234 = null;
			this.anInt1031 += 0;
			this.anIntArray235 = null;
			this.anIntArray236 = null;
			this.anIntArray271 = null;
			this.anIntArray272 = null;
			this.anIntArray226 = null;
			this.anIntArray227 = null;
			this.aClass1_Sub1_Sub2_Sub1_10 = null;
			this.aClass1_Sub1_Sub2_Sub1_11 = null;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("72588, " + 0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
	private void method699() {
		try {
			this.anInt896 = 0;
			@Pc(100) int local100;
			@Pc(80) int local80;
			for (@Pc(16) int local16 = -1; local16 < this.anInt960 + this.anInt1036; local16++) {
				@Pc(23) Class1_Sub1_Sub1_Sub1 local23;
				if (local16 == -1) {
					local23 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
				} else if (local16 < this.anInt960) {
					local23 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray246[local16]];
				} else {
					local23 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray265[local16 - this.anInt960]];
				}
				if (local23 != null && local23.method498()) {
					@Pc(64) Class49 local64;
					if (local23 instanceof Class1_Sub1_Sub1_Sub1_Sub2) {
						local64 = ((Class1_Sub1_Sub1_Sub1_Sub2) local23).aClass49_2;
						if (local64.anIntArray207 != null) {
							local64 = local64.method567();
						}
						if (local64 == null) {
							continue;
						}
					}
					if (local16 >= this.anInt960) {
						local64 = ((Class1_Sub1_Sub1_Sub1_Sub2) local23).aClass49_2;
						if (local64.anInt804 >= 0 && local64.anInt804 < this.aClass1_Sub1_Sub2_Sub1Array8.length) {
							this.method649(local23, local23.anInt632 + 15);
							if (this.anInt869 > -1) {
								this.aClass1_Sub1_Sub2_Sub1Array8[local64.anInt804].method131(this.anInt870 - 30, this.anInt869 - 12);
							}
						}
						if (this.anInt1008 == 1 && this.anInt944 == this.anIntArray265[local16 - this.anInt960] && anInt931 % 20 < 10) {
							this.method649(local23, local23.anInt632 + 15);
							if (this.anInt869 > -1) {
								this.aClass1_Sub1_Sub2_Sub1Array8[2].method131(this.anInt870 - 28, this.anInt869 - 12);
							}
						}
					} else {
						local80 = 30;
						@Pc(83) Class1_Sub1_Sub1_Sub1_Sub1 local83 = (Class1_Sub1_Sub1_Sub1_Sub1) local23;
						if (local83.anInt115 != 0) {
							this.method649(local23, local23.anInt632 + 15);
							if (this.anInt869 > -1) {
								for (local100 = 0; local100 < 8; local100++) {
									if ((local83.anInt115 & 0x1 << local100) != 0) {
										this.aClass1_Sub1_Sub2_Sub1Array8[local100].method131(this.anInt870 - local80, this.anInt869 - 12);
										local80 -= 25;
									}
								}
							}
						}
						if (local16 >= 0 && this.anInt1008 == 10 && this.anInt1000 == this.anIntArray246[local16]) {
							this.method649(local23, local23.anInt632 + 15);
							if (this.anInt869 > -1) {
								this.aClass1_Sub1_Sub2_Sub1Array8[7].method131(this.anInt870 - local80, this.anInt869 - 12);
							}
						}
					}
					if (local23.aString8 != null && (local16 >= this.anInt960 || this.anInt859 == 0 || this.anInt859 == 3 || this.anInt859 == 1 && this.method606(((Class1_Sub1_Sub1_Sub1_Sub1) local23).aString3, this.aBoolean234))) {
						this.method649(local23, local23.anInt632);
						if (this.anInt869 > -1 && this.anInt896 < this.anInt897) {
							this.anIntArray222[this.anInt896] = this.aClass1_Sub1_Sub2_Sub2_4.method182(local23.aString8) / 2;
							this.anIntArray221[this.anInt896] = this.aClass1_Sub1_Sub2_Sub2_4.anInt274;
							this.anIntArray219[this.anInt896] = this.anInt869;
							this.anIntArray220[this.anInt896] = this.anInt870;
							this.anIntArray223[this.anInt896] = local23.anInt655;
							this.anIntArray224[this.anInt896] = local23.anInt619;
							this.anIntArray225[this.anInt896] = local23.anInt664;
							this.aStringArray8[this.anInt896++] = local23.aString8;
							if (this.anInt915 == 0 && local23.anInt619 >= 1 && local23.anInt619 <= 3) {
								this.anIntArray221[this.anInt896] += 10;
								this.anIntArray220[this.anInt896] += 5;
							}
							if (this.anInt915 == 0 && local23.anInt619 == 4) {
								this.anIntArray222[this.anInt896] = 60;
							}
							if (this.anInt915 == 0 && local23.anInt619 == 5) {
								this.anIntArray221[this.anInt896] += 5;
							}
						}
					}
					if (local23.anInt627 > anInt931) {
						this.method649(local23, local23.anInt632 + 15);
						if (this.anInt869 > -1) {
							local80 = local23.anInt628 * 30 / local23.anInt629;
							if (local80 > 30) {
								local80 = 30;
							}
							Class1_Sub1_Sub2.method405(65280, local80, this.anInt869 - 15, this.anInt870 - 3, 5);
							Class1_Sub1_Sub2.method405(16711680, 30 - local80, this.anInt869 - 15 + local80, this.anInt870 - 3, 5);
						}
					}
					for (local80 = 0; local80 < 4; local80++) {
						if (local23.anIntArray144[local80] > anInt931) {
							this.method649(local23, local23.anInt632 / 2);
							if (this.anInt869 > -1) {
								if (local80 == 1) {
									this.anInt870 -= 20;
								}
								if (local80 == 2) {
									this.anInt869 -= 15;
									this.anInt870 -= 10;
								}
								if (local80 == 3) {
									this.anInt869 += 15;
									this.anInt870 -= 10;
								}
								this.aClass1_Sub1_Sub2_Sub1Array4[local23.anIntArray143[local80]].method131(this.anInt870 - 12, this.anInt869 - 12);
								this.aClass1_Sub1_Sub2_Sub2_2.method179(String.valueOf(local23.anIntArray142[local80]), this.anInt869, this.anInt870 + 4, 0, this.anInt943);
								this.aClass1_Sub1_Sub2_Sub2_2.method179(String.valueOf(local23.anIntArray142[local80]), this.anInt869 - 1, this.anInt870 + 3, 16777215, this.anInt943);
							}
						}
					}
				}
			}
			for (@Pc(608) int local608 = 0; local608 < this.anInt896; local608++) {
				local80 = this.anIntArray219[local608];
				@Pc(620) int local620 = this.anIntArray220[local608];
				local100 = this.anIntArray222[local608];
				@Pc(630) int local630 = this.anIntArray221[local608];
				@Pc(632) boolean local632 = true;
				while (local632) {
					local632 = false;
					for (@Pc(638) int local638 = 0; local638 < local608; local638++) {
						if (local620 + 2 > this.anIntArray220[local638] - this.anIntArray221[local638] && local620 - local630 < this.anIntArray220[local638] + 2 && local80 - local100 < this.anIntArray219[local638] + this.anIntArray222[local638] && local80 + local100 > this.anIntArray219[local638] - this.anIntArray222[local638] && this.anIntArray220[local638] - this.anIntArray221[local638] < local620) {
							local620 = this.anIntArray220[local638] - this.anIntArray221[local638];
							local632 = true;
						}
					}
				}
				this.anInt869 = this.anIntArray219[local608];
				this.anInt870 = this.anIntArray220[local608] = local620;
				@Pc(737) String local737 = this.aStringArray8[local608];
				if (this.anInt915 == 0) {
					@Pc(742) int local742 = 16776960;
					if (this.anIntArray223[local608] < 6) {
						local742 = this.anIntArray217[this.anIntArray223[local608]];
					}
					if (this.anIntArray223[local608] == 6) {
						local742 = this.anInt910 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray223[local608] == 7) {
						local742 = this.anInt910 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray223[local608] == 8) {
						local742 = this.anInt910 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(817) int local817;
					if (this.anIntArray223[local608] == 9) {
						local817 = 150 - this.anIntArray225[local608];
						if (local817 < 50) {
							local742 = local817 * 1280 + 16711680;
						} else if (local817 < 100) {
							local742 = 16776960 - (local817 - 50) * 327680;
						} else if (local817 < 150) {
							local742 = (local817 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray223[local608] == 10) {
						local817 = 150 - this.anIntArray225[local608];
						if (local817 < 50) {
							local742 = local817 * 5 + 16711680;
						} else if (local817 < 100) {
							local742 = 16711935 - (local817 - 50) * 327680;
						} else if (local817 < 150) {
							local742 = (local817 - 100) * 327680 + 255 - (local817 - 100) * 5;
						}
					}
					if (this.anIntArray223[local608] == 11) {
						local817 = 150 - this.anIntArray225[local608];
						if (local817 < 50) {
							local742 = 16777215 - local817 * 327685;
						} else if (local817 < 100) {
							local742 = (local817 - 50) * 327685 + 65280;
						} else if (local817 < 150) {
							local742 = 16777215 - (local817 - 100) * 327680;
						}
					}
					if (this.anIntArray224[local608] == 0) {
						this.aClass1_Sub1_Sub2_Sub2_4.method179(local737, this.anInt869, this.anInt870 + 1, 0, this.anInt943);
						this.aClass1_Sub1_Sub2_Sub2_4.method179(local737, this.anInt869, this.anInt870, local742, this.anInt943);
					}
					if (this.anIntArray224[local608] == 1) {
						this.aClass1_Sub1_Sub2_Sub2_4.method184(local737, this.anInt910, 0, this.anInt870 + 1, this.anInt869);
						this.aClass1_Sub1_Sub2_Sub2_4.method184(local737, this.anInt910, local742, this.anInt870, this.anInt869);
					}
					if (this.anIntArray224[local608] == 2) {
						this.aClass1_Sub1_Sub2_Sub2_4.method185(local737, 0, this.anInt910, this.anInt869, this.anInt870 + 1);
						this.aClass1_Sub1_Sub2_Sub2_4.method185(local737, local742, this.anInt910, this.anInt869, this.anInt870);
					}
					if (this.anIntArray224[local608] == 3) {
						this.aClass1_Sub1_Sub2_Sub2_4.method186(local737, this.anInt870 + 1, this.anInt869, 0, 150 - this.anIntArray225[local608], this.anInt910);
						this.aClass1_Sub1_Sub2_Sub2_4.method186(local737, this.anInt870, this.anInt869, local742, 150 - this.anIntArray225[local608], this.anInt910);
					}
					@Pc(1116) int local1116;
					if (this.anIntArray224[local608] == 4) {
						local817 = this.aClass1_Sub1_Sub2_Sub2_4.method182(local737);
						local1116 = (150 - this.anIntArray225[local608]) * (local817 + 100) / 150;
						Class1_Sub1_Sub2.method402(0, this.anInt869 + 50, 334, this.anInt869 - 50);
						this.aClass1_Sub1_Sub2_Sub2_4.method183(this.anInt869 + 50 - local1116, local737, this.anInt870 + 1, 0);
						this.aClass1_Sub1_Sub2_Sub2_4.method183(this.anInt869 + 50 - local1116, local737, this.anInt870, local742);
						Class1_Sub1_Sub2.method401();
					}
					if (this.anIntArray224[local608] == 5) {
						local817 = 150 - this.anIntArray225[local608];
						local1116 = 0;
						if (local817 < 25) {
							local1116 = local817 - 25;
						} else if (local817 > 125) {
							local1116 = local817 - 125;
						}
						Class1_Sub1_Sub2.method402(this.anInt870 - this.aClass1_Sub1_Sub2_Sub2_4.anInt274 - 1, 512, this.anInt870 + 5, 0);
						this.aClass1_Sub1_Sub2_Sub2_4.method179(local737, this.anInt869, this.anInt870 + local1116 + 1, 0, this.anInt943);
						this.aClass1_Sub1_Sub2_Sub2_4.method179(local737, this.anInt869, this.anInt870 + local1116, local742, this.anInt943);
						Class1_Sub1_Sub2.method401();
					}
				} else {
					this.aClass1_Sub1_Sub2_Sub2_4.method179(local737, this.anInt869, this.anInt870 + 1, 0, this.anInt943);
					this.aClass1_Sub1_Sub2_Sub2_4.method179(local737, this.anInt869, this.anInt870, 16776960, this.anInt943);
				}
			}
		} catch (@Pc(1270) RuntimeException local1270) {
			signlink.reporterror("51368, " + 5 + ", " + local1270.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ZLclient!LDILQFVA;I)V")
	private void method700(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(10) int local10;
			@Pc(19) int local19;
			@Pc(26) int local26;
			@Pc(31) int local31;
			@Pc(36) int local36;
			@Pc(39) int local39;
			@Pc(42) int local42;
			@Pc(47) int local47;
			@Pc(52) int local52;
			@Pc(55) int local55;
			@Pc(61) int local61;
			@Pc(64) int local64;
			@Pc(58) int local58;
			if (arg1 == 81) {
				local10 = arg0.method359();
				local19 = this.anInt1011 + (local10 >> 4 & 0x7);
				local26 = this.anInt1012 + (local10 & 0x7);
				local31 = local19 + arg0.method360();
				local36 = local26 + arg0.method360();
				local39 = arg0.method362();
				local42 = arg0.method361();
				local47 = arg0.method359() * 4;
				local52 = arg0.method359() * 4;
				local55 = arg0.method361();
				local58 = arg0.method361();
				local61 = arg0.method359();
				local64 = arg0.method359();
				if (local19 >= 0 && local26 >= 0 && local19 < 104 && local26 < 104 && local31 >= 0 && local36 >= 0 && local31 < 104 && local36 < 104 && local42 != 65535) {
					local19 = local19 * 128 + 64;
					local26 = local26 * 128 + 64;
					local31 = local31 * 128 + 64;
					local36 = local36 * 128 + 64;
					@Pc(140) Class1_Sub1_Sub1_Sub5 local140 = new Class1_Sub1_Sub1_Sub5(local42, this.anInt972, false, this.method705(local26, this.anInt972, local19) - local47, local39, local52, local55 + anInt931, local58 + anInt931, local19, local26, local64, local61);
					local140.method433(local36, this.method705(local36, this.anInt972, local31) - local52, local31, local55 + anInt931, this.aByte42);
					this.aClass23_12.method419(local140);
				}
			} else {
				if (arg1 == 152) {
					local10 = arg0.method359();
					local19 = this.anInt1011 + (local10 >> 4 & 0x7);
					local26 = this.anInt1012 + (local10 & 0x7);
					local31 = arg0.method361();
					local36 = arg0.method359();
					local39 = local36 >> 4 & 0xF;
					local42 = local36 & 0x7;
					if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray140[0] >= local19 - local39 && aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray140[0] <= local19 + local39 && aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray141[0] >= local26 - local39 && aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray141[0] <= local26 + local39 && this.aBoolean216 && !aBoolean253 && this.anInt1030 < 50) {
						this.anIntArray213[this.anInt1030] = local31;
						this.anIntArray245[this.anInt1030] = local42;
						this.anIntArray262[this.anInt1030] = Class31.anIntArray134[local31];
						this.anInt1030++;
					}
				}
				@Pc(321) Class1_Sub1_Sub1_Sub6 local321;
				if (arg1 == 170) {
					local10 = arg0.method377();
					local19 = this.anInt1011 + (local10 >> 4 & 0x7);
					local26 = this.anInt1012 + (local10 & 0x7);
					local31 = arg0.method387();
					if (local19 >= 0 && local26 >= 0 && local19 < 104 && local26 < 104) {
						@Pc(315) Class23 local315 = this.aClass23ArrayArrayArray1[this.anInt972][local19][local26];
						if (local315 != null) {
							for (local321 = (Class1_Sub1_Sub1_Sub6) local315.method422(); local321 != null; local321 = (Class1_Sub1_Sub1_Sub6) local315.method424((byte) 5)) {
								if (local321.anInt789 == (local31 & 0x7FFF)) {
									local321.method544();
									break;
								}
							}
							if (local315.method422() == null) {
								this.aClass23ArrayArrayArray1[this.anInt972][local19][local26] = null;
							}
							this.method623(local19, local26);
						}
					}
				} else {
					@Pc(479) int local479;
					if (arg1 == 254) {
						local10 = arg0.method378(anInt941);
						local19 = local10 >> 2;
						local26 = local10 & 0x3;
						local31 = this.anIntArray264[local19];
						local36 = arg0.method379();
						local39 = this.anInt1011 + (local36 >> 4 & 0x7);
						local42 = this.anInt1012 + (local36 & 0x7);
						local47 = arg0.method361();
						if (local39 >= 0 && local42 >= 0 && local39 < 103 && local42 < 103) {
							local52 = this.anIntArrayArrayArray8[this.anInt972][local39][local42];
							local55 = this.anIntArrayArrayArray8[this.anInt972][local39 + 1][local42];
							local58 = this.anIntArrayArrayArray8[this.anInt972][local39 + 1][local42 + 1];
							local61 = this.anIntArrayArrayArray8[this.anInt972][local39][local42 + 1];
							if (local31 == 0) {
								@Pc(470) Class8 local470 = this.aClass5_1.method64(914, local42, this.anInt972, local39);
								if (local470 != null) {
									local479 = local470.anInt236 >> 14 & 0x7FFF;
									if (local19 == 2) {
										local470.aClass1_Sub1_Sub1_5 = new Class1_Sub1_Sub1_Sub3(local26 + 4, local55, false, local47, local479, 2, local52, (byte) 5, local58, local61);
										local470.aClass1_Sub1_Sub1_6 = new Class1_Sub1_Sub1_Sub3(local26 + 1 & 0x3, local55, false, local47, local479, 2, local52, (byte) 5, local58, local61);
									} else {
										local470.aClass1_Sub1_Sub1_5 = new Class1_Sub1_Sub1_Sub3(local26, local55, false, local47, local479, local19, local52, (byte) 5, local58, local61);
									}
								}
							}
							if (local31 == 1) {
								@Pc(547) Class29 local547 = this.aClass5_1.method65(this.anInt972, local39, local42);
								if (local547 != null) {
									local547.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub3(0, local55, false, local47, local547.anInt551 >> 14 & 0x7FFF, 4, local52, (byte) 5, local58, local61);
								}
							}
							if (local31 == 2) {
								@Pc(581) Class7 local581 = this.aClass5_1.method66(this.anInt972, local39, local42);
								if (local19 == 11) {
									local19 = 10;
								}
								if (local581 != null) {
									local581.aClass1_Sub1_Sub1_4 = new Class1_Sub1_Sub1_Sub3(local26, local55, false, local47, local581.anInt230 >> 14 & 0x7FFF, local19, local52, (byte) 5, local58, local61);
								}
							}
							if (local31 == 3) {
								@Pc(620) Class45 local620 = this.aClass5_1.method67(this.anInt972, local39, local42);
								if (local620 != null) {
									local620.aClass1_Sub1_Sub1_8 = new Class1_Sub1_Sub1_Sub3(local26, local55, false, local47, local620.anInt771 >> 14 & 0x7FFF, 22, local52, (byte) 5, local58, local61);
								}
							}
						}
					} else if (arg1 == 47) {
						local10 = arg0.method359();
						local19 = this.anInt1011 + (local10 >> 4 & 0x7);
						local26 = this.anInt1012 + (local10 & 0x7);
						local31 = arg0.method361();
						local36 = arg0.method359();
						local39 = arg0.method361();
						if (local19 >= 0 && local26 >= 0 && local19 < 104 && local26 < 104) {
							local19 = local19 * 128 + 64;
							local26 = local26 * 128 + 64;
							@Pc(717) Class1_Sub1_Sub1_Sub2 local717 = new Class1_Sub1_Sub1_Sub2(local39, local31, this.method705(local26, this.anInt972, local19) - local36, anInt931, local26, (byte) 7, local19, this.anInt972);
							this.aClass23_11.method419(local717);
						}
					} else if (arg1 == 120) {
						local10 = arg0.method359();
						local19 = this.anInt1011 + (local10 >> 4 & 0x7);
						local26 = this.anInt1012 + (local10 & 0x7);
						local31 = arg0.method361();
						local36 = arg0.method361();
						local39 = arg0.method361();
						if (local19 >= 0 && local26 >= 0 && local19 < 104 && local26 < 104) {
							@Pc(773) Class23 local773 = this.aClass23ArrayArrayArray1[this.anInt972][local19][local26];
							if (local773 != null) {
								for (@Pc(779) Class1_Sub1_Sub1_Sub6 local779 = (Class1_Sub1_Sub1_Sub6) local773.method422(); local779 != null; local779 = (Class1_Sub1_Sub1_Sub6) local773.method424((byte) 5)) {
									if (local779.anInt789 == (local31 & 0x7FFF) && local779.anInt790 == local36) {
										local779.anInt790 = local39;
										break;
									}
								}
								this.method623(local19, local26);
							}
						}
					} else if (arg1 == 75) {
						local10 = arg0.method378(anInt941);
						local19 = local10 >> 2;
						local26 = local10 & 0x3;
						local31 = this.anIntArray264[local19];
						local36 = arg0.method359();
						local39 = this.anInt1011 + (local36 >> 4 & 0x7);
						local42 = this.anInt1012 + (local36 & 0x7);
						if (local39 >= 0 && local42 >= 0 && local39 < 104 && local42 < 104) {
							this.method646(this.anInt972, local19, this.anInt1053, 0, local42, local31, local39, -1, -1, local26);
						}
					} else if (arg1 == 124) {
						local10 = arg0.method379();
						local19 = this.anInt1011 + (local10 >> 4 & 0x7);
						local26 = this.anInt1012 + (local10 & 0x7);
						local31 = arg0.method378(anInt941);
						local36 = local31 >> 2;
						local39 = local31 & 0x3;
						local42 = this.anIntArray264[local36];
						local47 = arg0.method387();
						if (local19 >= 0 && local26 >= 0 && local19 < 104 && local26 < 104) {
							this.method646(this.anInt972, local36, this.anInt1053, 0, local26, local42, local19, -1, local47, local39);
						}
					} else {
						if (arg1 == 194) {
							@Pc(948) byte local948 = arg0.method382();
							local19 = arg0.method378(anInt941);
							local26 = local19 >> 2;
							local31 = local19 & 0x3;
							local36 = this.anIntArray264[local26];
							local39 = arg0.method388();
							@Pc(973) byte local973 = arg0.method382();
							local47 = arg0.method361();
							local52 = arg0.method361();
							local55 = arg0.method386();
							@Pc(987) byte local987 = arg0.method382();
							local61 = arg0.method359();
							local64 = this.anInt1011 + (local61 >> 4 & 0x7);
							local479 = this.anInt1012 + (local61 & 0x7);
							@Pc(1010) byte local1010 = arg0.method380();
							@Pc(1016) Class1_Sub1_Sub1_Sub1_Sub1 local1016;
							if (local47 == this.anInt862) {
								local1016 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
							} else {
								local1016 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local47];
							}
							if (local1016 != null) {
								@Pc(1028) Class40 local1028 = Class40.method529(local55);
								@Pc(1038) int local1038 = this.anIntArrayArrayArray8[this.anInt972][local64][local479];
								@Pc(1050) int local1050 = this.anIntArrayArrayArray8[this.anInt972][local64 + 1][local479];
								@Pc(1064) int local1064 = this.anIntArrayArrayArray8[this.anInt972][local64 + 1][local479 + 1];
								@Pc(1076) int local1076 = this.anIntArrayArrayArray8[this.anInt972][local64][local479 + 1];
								@Pc(1086) Class1_Sub1_Sub1_Sub4 local1086 = local1028.method522(local26, local31, local1038, local1050, local1064, local1076, -1);
								if (local1086 != null) {
									this.method646(this.anInt972, 0, this.anInt1053, local39 + 1, local479, local36, local64, local52 + 1, -1, 0);
									local1016.anInt109 = local39 + anInt931;
									local1016.anInt110 = local52 + anInt931;
									local1016.aClass1_Sub1_Sub1_Sub4_1 = local1086;
									@Pc(1122) int local1122 = local1028.anInt736;
									@Pc(1125) int local1125 = local1028.anInt722;
									if (local31 == 1 || local31 == 3) {
										local1122 = local1028.anInt722;
										local1125 = local1028.anInt736;
									}
									local1016.anInt105 = local64 * 128 + local1122 * 64;
									local1016.anInt107 = local479 * 128 + local1125 * 64;
									local1016.anInt106 = this.method705(local1016.anInt107, this.anInt972, local1016.anInt105);
									@Pc(1171) byte local1171;
									if (local1010 > local987) {
										local1171 = local1010;
										local1010 = local987;
										local987 = local1171;
									}
									if (local948 > local973) {
										local1171 = local948;
										local948 = local973;
										local973 = local1171;
									}
									local1016.anInt116 = local64 + local1010;
									local1016.anInt118 = local64 + local987;
									local1016.anInt117 = local479 + local948;
									local1016.anInt119 = local479 + local973;
								}
							}
						}
						if (arg1 == 127) {
							local10 = arg0.method377();
							local19 = this.anInt1011 + (local10 >> 4 & 0x7);
							local26 = this.anInt1012 + (local10 & 0x7);
							local31 = arg0.method387();
							local36 = arg0.method361();
							local39 = arg0.method361();
							if (local19 >= 0 && local26 >= 0 && local19 < 104 && local26 < 104 && local39 != this.anInt862) {
								@Pc(1255) Class1_Sub1_Sub1_Sub6 local1255 = new Class1_Sub1_Sub1_Sub6();
								local1255.anInt789 = local31;
								local1255.anInt790 = local36;
								if (this.aClass23ArrayArrayArray1[this.anInt972][local19][local26] == null) {
									this.aClass23ArrayArrayArray1[this.anInt972][local19][local26] = new Class23(6);
								}
								this.aClass23ArrayArrayArray1[this.anInt972][local19][local26].method419(local1255);
								this.method623(local19, local26);
							}
						} else if (arg1 == 86) {
							local10 = arg0.method386();
							local19 = arg0.method386();
							local26 = arg0.method359();
							local31 = this.anInt1011 + (local26 >> 4 & 0x7);
							local36 = this.anInt1012 + (local26 & 0x7);
							if (local31 >= 0 && local36 >= 0 && local31 < 104 && local36 < 104) {
								local321 = new Class1_Sub1_Sub1_Sub6();
								local321.anInt789 = local19;
								local321.anInt790 = local10;
								if (this.aClass23ArrayArrayArray1[this.anInt972][local31][local36] == null) {
									this.aClass23ArrayArrayArray1[this.anInt972][local31][local36] = new Class23(6);
								}
								this.aClass23ArrayArrayArray1[this.anInt972][local31][local36].method419(local321);
								this.method623(local31, local36);
							}
						}
					}
				}
			}
		} catch (@Pc(1390) RuntimeException local1390) {
			signlink.reporterror("30491, " + false + ", " + arg0 + ", " + arg1 + ", " + local1390.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
	private void method701() {
		try {
			for (@Pc(14) Class1_Sub1_Sub1_Sub5 local14 = (Class1_Sub1_Sub1_Sub5) this.aClass23_12.method422(); local14 != null; local14 = (Class1_Sub1_Sub1_Sub5) this.aClass23_12.method424((byte) 5)) {
				if (local14.anInt482 != this.anInt972 || anInt931 > local14.anInt486) {
					local14.method544();
				} else if (anInt931 >= local14.anInt485) {
					if (local14.anInt496 > 0) {
						@Pc(44) Class1_Sub1_Sub1_Sub1_Sub2 local44 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local14.anInt496 - 1];
						if (local44 != null && local44.anInt620 >= 0 && local44.anInt620 < 13312 && local44.anInt621 >= 0 && local44.anInt621 < 13312) {
							local14.method433(local44.anInt621, this.method705(local44.anInt621, local14.anInt482, local44.anInt620) - local14.anInt490, local44.anInt620, anInt931, this.aByte42);
						}
					}
					if (local14.anInt496 < 0) {
						@Pc(90) int local90 = -local14.anInt496 - 1;
						@Pc(96) Class1_Sub1_Sub1_Sub1_Sub1 local96;
						if (local90 == this.anInt862) {
							local96 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
						} else {
							local96 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local90];
						}
						if (local96 != null && local96.anInt620 >= 0 && local96.anInt620 < 13312 && local96.anInt621 >= 0 && local96.anInt621 < 13312) {
							local14.method433(local96.anInt621, this.method705(local96.anInt621, local14.anInt482, local96.anInt620) - local14.anInt490, local96.anInt620, anInt931, this.aByte42);
						}
					}
					local14.method434(this.anInt1020);
					this.aClass5_1.method53(this.anInt972, 60, (int) local14.aDouble5, (byte) 7, (int) local14.aDouble7, -1, (int) local14.aDouble6, false, local14.anInt492, local14);
				}
			}
		} catch (@Pc(177) RuntimeException local177) {
			signlink.reporterror("34338, " + 499 + ", " + local177.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private void method702() {
		try {
			for (@Pc(9) Class1_Sub1_Sub1_Sub2 local9 = (Class1_Sub1_Sub1_Sub2) this.aClass23_11.method422(); local9 != null; local9 = (Class1_Sub1_Sub1_Sub2) this.aClass23_11.method424((byte) 5)) {
				if (local9.anInt138 != this.anInt972 || local9.aBoolean24) {
					local9.method544();
				} else if (anInt931 >= local9.anInt137) {
					local9.method40(this.anInt1020, 565);
					if (local9.aBoolean24) {
						local9.method544();
					} else {
						this.aClass5_1.method53(local9.anInt138, 60, local9.anInt139, (byte) 7, local9.anInt141, -1, local9.anInt140, false, 0, local9);
					}
				}
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("30717, " + true + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)Z")
	private boolean method703(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = arg2 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass5_1.method72(this.anInt972, arg0, arg1, arg2);
			if (local16 == -1) {
				return false;
			}
			@Pc(25) int local25 = local16 & 0x1F;
			@Pc(31) int local31 = local16 >> 6 & 0x3;
			anInt895++;
			if (anInt895 > 99) {
				anInt895 = 0;
				this.aClass1_Sub1_Sub3_6.method348(217);
			}
			if (local25 == 10 || local25 == 11 || local25 == 22) {
				@Pc(57) Class40 local57 = Class40.method529(local7);
				@Pc(65) int local65;
				@Pc(68) int local68;
				if (local31 == 0 || local31 == 2) {
					local65 = local57.anInt736;
					local68 = local57.anInt722;
				} else {
					local65 = local57.anInt722;
					local68 = local57.anInt736;
				}
				@Pc(79) int local79 = local57.anInt737;
				if (local31 != 0) {
					local79 = (local79 << local31 & 0xF) + (local79 >> 4 - local31);
				}
				this.method662(arg0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray140[0], this.aByte38, 0, local65, local79, false, 2, local68, arg1, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray141[0]);
			} else {
				this.method662(arg0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray140[0], this.aByte38, local31, 0, 0, false, 2, 0, arg1, local25 + 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray141[0]);
			}
			this.anInt845 = super.anInt840;
			this.anInt846 = super.anInt841;
			this.anInt848 = 2;
			this.anInt847 = 0;
			return true;
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("11613, " + arg0 + ", " + 2 + ", " + arg1 + ", " + arg2 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!ULLVQOAK;III)V")
	private void method704(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1.anInt693 == 0 && arg1.anIntArray154 != null && (!arg1.aBoolean167 || this.anInt975 == arg1.anInt716 || this.anInt998 == arg1.anInt716 || this.anInt1051 == arg1.anInt716)) {
				@Pc(29) int local29 = Class1_Sub1_Sub2.anInt457;
				@Pc(31) int local31 = Class1_Sub1_Sub2.anInt455;
				@Pc(33) int local33 = Class1_Sub1_Sub2.anInt458;
				@Pc(35) int local35 = Class1_Sub1_Sub2.anInt456;
				if (this.anInt1023 == 1) {
					Class1_Sub1_Sub2.method402(arg3, arg0 + arg1.anInt714, arg3 + arg1.anInt715, arg0);
					@Pc(56) int local56 = arg1.anIntArray154.length;
					for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
						@Pc(67) int local67 = arg1.anIntArray158[local58] + arg0;
						@Pc(76) int local76 = arg1.anIntArray160[local58] + arg3 - arg2;
						@Pc(83) Class39 local83 = Class39.aClass39Array1[arg1.anIntArray154[local58]];
						@Pc(88) int local88 = local67 + local83.anInt691;
						@Pc(93) int local93 = local76 + local83.anInt702;
						if (local83.anInt701 > 0) {
							this.method586(local83);
						}
						if (local83.anInt693 == 0) {
							if (local83.anInt712 > local83.anInt688 - local83.anInt715) {
								local83.anInt712 = local83.anInt688 - local83.anInt715;
							}
							if (local83.anInt712 < 0) {
								local83.anInt712 = 0;
							}
							this.method704(local88, local83, local83.anInt712, local93);
							if (local83.anInt688 > local83.anInt715) {
								this.method608(405, local83.anInt688, local83.anInt712, local88 + local83.anInt714, local83.anInt715, local93);
							}
						} else if (local83.anInt693 != 1) {
							@Pc(165) int local165;
							@Pc(169) int local169;
							@Pc(180) int local180;
							@Pc(215) int local215;
							@Pc(222) int local222;
							@Pc(163) int local163;
							@Pc(213) int local213;
							if (local83.anInt693 == 2) {
								local163 = 0;
								for (local165 = 0; local165 < local83.anInt715; local165++) {
									for (local169 = 0; local169 < local83.anInt714; local169++) {
										local180 = local88 + local169 * (local83.anInt685 + 32);
										@Pc(189) int local189 = local93 + local165 * (local83.anInt710 + 32);
										if (local163 < 20) {
											local180 += local83.anIntArray159[local163];
											local189 += local83.anIntArray153[local163];
										}
										if (local83.anIntArray152[local163] > 0) {
											local213 = 0;
											local215 = 0;
											local222 = local83.anIntArray152[local163] - 1;
											if (local180 > Class1_Sub1_Sub2.anInt457 - 32 && local180 < Class1_Sub1_Sub2.anInt458 && local189 > Class1_Sub1_Sub2.anInt455 - 32 && local189 < Class1_Sub1_Sub2.anInt456 || this.anInt919 != 0 && this.anInt918 == local163) {
												@Pc(247) int local247 = 0;
												if (this.anInt853 == 1 && this.anInt854 == local163 && this.anInt855 == local83.anInt716) {
													local247 = 16777215;
												}
												@Pc(272) Class1_Sub1_Sub2_Sub1 local272 = Class21.method332(local83.anIntArray157[local163], this.anInt900, local222, local247);
												if (local272 != null) {
													@Pc(351) int local351;
													if (this.anInt919 != 0 && this.anInt918 == local163 && this.anInt917 == local83.anInt716) {
														local213 = super.anInt834 - this.anInt920;
														local215 = super.anInt835 - this.anInt921;
														if (local213 < 5 && local213 > -5) {
															local213 = 0;
														}
														if (local215 < 5 && local215 > -5) {
															local215 = 0;
														}
														if (this.anInt940 < 5) {
															local213 = 0;
															local215 = 0;
														}
														local272.method133(local180 + local213, local189 + local215);
														if (local189 + local215 < Class1_Sub1_Sub2.anInt455 && arg1.anInt712 > 0) {
															local351 = this.anInt1020 * (Class1_Sub1_Sub2.anInt455 - local189 - local215) / 3;
															if (local351 > this.anInt1020 * 10) {
																local351 = this.anInt1020 * 10;
															}
															if (local351 > arg1.anInt712) {
																local351 = arg1.anInt712;
															}
															arg1.anInt712 -= local351;
															this.anInt921 += local351;
														}
														if (local189 + local215 + 32 > Class1_Sub1_Sub2.anInt456 && arg1.anInt712 < arg1.anInt688 - arg1.anInt715) {
															local351 = this.anInt1020 * (local189 + local215 + 32 - Class1_Sub1_Sub2.anInt456) / 3;
															if (local351 > this.anInt1020 * 10) {
																local351 = this.anInt1020 * 10;
															}
															if (local351 > arg1.anInt688 - arg1.anInt715 - arg1.anInt712) {
																local351 = arg1.anInt688 - arg1.anInt715 - arg1.anInt712;
															}
															arg1.anInt712 += local351;
															this.anInt921 -= local351;
														}
													} else if (this.anInt991 != 0 && this.anInt990 == local163 && this.anInt989 == local83.anInt716) {
														local272.method133(local180, local189);
													} else {
														local272.method131(local189, local180);
													}
													if (local272.anInt217 == 33 || local83.anIntArray157[local163] != 1) {
														local351 = local83.anIntArray157[local163];
														this.aClass1_Sub1_Sub2_Sub2_2.method183(local180 + local213 + 1, method694(local351), local189 + local215 + 10, 0);
														this.aClass1_Sub1_Sub2_Sub2_2.method183(local180 + local213, method694(local351), local189 + local215 + 9, 16776960);
													}
												}
											}
										} else if (local83.aClass1_Sub1_Sub2_Sub1Array2 != null && local163 < 20) {
											@Pc(540) Class1_Sub1_Sub2_Sub1 local540 = local83.aClass1_Sub1_Sub2_Sub1Array2[local163];
											if (local540 != null) {
												local540.method131(local189, local180);
											}
										}
										local163++;
									}
								}
							} else if (local83.anInt693 == 3) {
								@Pc(565) boolean local565 = false;
								if (this.anInt1051 == local83.anInt716 || this.anInt998 == local83.anInt716 || this.anInt975 == local83.anInt716) {
									local565 = true;
								}
								if (this.method655(local83)) {
									local163 = local83.anInt713;
									if (local565 && local83.anInt709 != 0) {
										local163 = local83.anInt709;
									}
								} else {
									local163 = local83.anInt689;
									if (local565 && local83.anInt686 != 0) {
										local163 = local83.anInt686;
									}
								}
								if (local83.aByte30 == 0) {
									if (local83.aBoolean168) {
										Class1_Sub1_Sub2.method405(local163, local83.anInt714, local88, local93, local83.anInt715);
									} else {
										Class1_Sub1_Sub2.method406(local163, local88, local83.anInt714, this.anInt1022, local83.anInt715, local93);
									}
								} else if (local83.aBoolean168) {
									Class1_Sub1_Sub2.method404(local163, local93, this.anInt1062, local83.anInt715, 256 - (local83.aByte30 & 0xFF), local83.anInt714, local88);
								} else {
									Class1_Sub1_Sub2.method407(local88, local163, 256 - (local83.aByte30 & 0xFF), local83.anInt714, local93, local83.anInt715);
								}
							} else {
								@Pc(685) Class1_Sub1_Sub2_Sub2 local685;
								if (local83.anInt693 == 4) {
									local685 = local83.aClass1_Sub1_Sub2_Sub2_1;
									@Pc(688) String local688 = local83.aString11;
									@Pc(690) boolean local690 = false;
									if (this.anInt1051 == local83.anInt716 || this.anInt998 == local83.anInt716 || this.anInt975 == local83.anInt716) {
										local690 = true;
									}
									if (this.method655(local83)) {
										local165 = local83.anInt713;
										if (local690 && local83.anInt709 != 0) {
											local165 = local83.anInt709;
										}
										if (local83.aString12.length() > 0) {
											local688 = local83.aString12;
										}
									} else {
										local165 = local83.anInt689;
										if (local690 && local83.anInt686 != 0) {
											local165 = local83.anInt686;
										}
									}
									if (local83.anInt694 == 6 && this.aBoolean255) {
										local688 = "Please wait...";
										local165 = local83.anInt689;
									}
									if (Class1_Sub1_Sub2.anInt453 == 479) {
										if (local165 == 16776960) {
											local165 = 255;
										}
										if (local165 == 49152) {
											local165 = 16777215;
										}
									}
									local213 = local93 + local685.anInt274;
									while (local688.length() > 0) {
										if (local688.indexOf("%") != -1) {
											label352: while (true) {
												local215 = local688.indexOf("%1");
												if (local215 == -1) {
													while (true) {
														local215 = local688.indexOf("%2");
														if (local215 == -1) {
															while (true) {
																local215 = local688.indexOf("%3");
																if (local215 == -1) {
																	while (true) {
																		local215 = local688.indexOf("%4");
																		if (local215 == -1) {
																			while (true) {
																				local215 = local688.indexOf("%5");
																				if (local215 == -1) {
																					break label352;
																				}
																				local688 = local688.substring(0, local215) + this.method628(this.method639(local83, 4)) + local688.substring(local215 + 2);
																			}
																		}
																		local688 = local688.substring(0, local215) + this.method628(this.method639(local83, 3)) + local688.substring(local215 + 2);
																	}
																}
																local688 = local688.substring(0, local215) + this.method628(this.method639(local83, 2)) + local688.substring(local215 + 2);
															}
														}
														local688 = local688.substring(0, local215) + this.method628(this.method639(local83, 1)) + local688.substring(local215 + 2);
													}
												}
												local688 = local688.substring(0, local215) + this.method628(this.method639(local83, 0)) + local688.substring(local215 + 2);
											}
										}
										local215 = local688.indexOf("\\n");
										@Pc(962) String local962;
										if (local215 == -1) {
											local962 = local688;
											local688 = "";
										} else {
											local962 = local688.substring(0, local215);
											local688 = local688.substring(local215 + 2);
										}
										if (local83.aBoolean170) {
											local685.method180(local88 + local83.anInt714 / 2, local213, local165, local962, local83.aBoolean166);
										} else {
											local685.method187(local165, local88, local83.aBoolean166, local962, local213);
										}
										local213 += local685.anInt274;
									}
								} else if (local83.anInt693 == 5) {
									@Pc(1023) Class1_Sub1_Sub2_Sub1 local1023;
									if (this.method655(local83)) {
										local1023 = local83.aClass1_Sub1_Sub2_Sub1_1;
									} else {
										local1023 = local83.aClass1_Sub1_Sub2_Sub1_2;
									}
									if (local1023 != null) {
										local1023.method131(local93, local88);
									}
								} else if (local83.anInt693 == 6) {
									local163 = Class1_Sub1_Sub2_Sub3.anInt330;
									local165 = Class1_Sub1_Sub2_Sub3.anInt331;
									Class1_Sub1_Sub2_Sub3.anInt330 = local88 + local83.anInt714 / 2;
									Class1_Sub1_Sub2_Sub3.anInt331 = local93 + local83.anInt715 / 2;
									local169 = Class1_Sub1_Sub2_Sub3.anIntArray53[local83.anInt697] * local83.anInt696 >> 16;
									local180 = Class1_Sub1_Sub2_Sub3.anIntArray54[local83.anInt697] * local83.anInt696 >> 16;
									@Pc(1084) boolean local1084 = this.method655(local83);
									if (local1084) {
										local213 = local83.anInt705;
									} else {
										local213 = local83.anInt704;
									}
									@Pc(1104) Class1_Sub1_Sub1_Sub4 local1104;
									if (local213 == -1) {
										local1104 = local83.method518(local1084, -1, -1);
									} else {
										@Pc(1110) Class46 local1110 = Class46.aClass46Array1[local213];
										local1104 = local83.method518(local1084, local1110.anIntArray197[local83.anInt711], local1110.anIntArray196[local83.anInt711]);
									}
									if (local1104 != null) {
										local1104.method290(local83.anInt698, 0, local83.anInt697, 0, local169, local180);
									}
									Class1_Sub1_Sub2_Sub3.anInt330 = local163;
									Class1_Sub1_Sub2_Sub3.anInt331 = local165;
								} else if (local83.anInt693 == 7) {
									local685 = local83.aClass1_Sub1_Sub2_Sub2_1;
									local165 = 0;
									for (local169 = 0; local169 < local83.anInt715; local169++) {
										for (local180 = 0; local180 < local83.anInt714; local180++) {
											if (local83.anIntArray152[local165] > 0) {
												@Pc(1174) Class21 local1174 = Class21.method335(local83.anIntArray152[local165] - 1);
												@Pc(1177) String local1177 = local1174.aString6;
												if (local1174.aBoolean109 || local83.anIntArray157[local165] != 1) {
													local1177 = local1177 + " x" + method590(local83.anIntArray157[local165]);
												}
												local215 = local88 + local180 * (local83.anInt685 + 115);
												local222 = local93 + local169 * (local83.anInt710 + 12);
												if (local83.aBoolean170) {
													local685.method180(local215 + local83.anInt714 / 2, local222, local83.anInt689, local1177, local83.aBoolean166);
												} else {
													local685.method187(local83.anInt689, local215, local83.aBoolean166, local1177, local222);
												}
											}
											local165++;
										}
									}
								}
							}
						}
					}
					Class1_Sub1_Sub2.method402(local31, local33, local35, local29);
				}
			}
		} catch (@Pc(1273) RuntimeException local1273) {
			signlink.reporterror("70943, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 1 + ", " + arg3 + ", " + local1273.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BIII)I")
	private int method705(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.aByte47 != 76) {
				return anInt876;
			}
			@Pc(9) int local9 = arg2 >> 7;
			@Pc(13) int local13 = arg0 >> 7;
			if (local9 < 0 || local13 < 0 || local9 > 103 || local13 > 103) {
				return 0;
			}
			@Pc(27) int local27 = arg1;
			if (arg1 < 3 && (this.aByteArrayArrayArray8[1][local9][local13] & 0x2) == 2) {
				local27 = arg1 + 1;
			}
			@Pc(47) int local47 = arg2 & 0x7F;
			@Pc(51) int local51 = arg0 & 0x7F;
			@Pc(79) int local79 = this.anIntArrayArrayArray8[local27][local9][local13] * (128 - local47) + this.anIntArrayArrayArray8[local27][local9 + 1][local13] * local47 >> 7;
			@Pc(111) int local111 = this.anIntArrayArrayArray8[local27][local9][local13 + 1] * (128 - local47) + this.anIntArrayArrayArray8[local27][local9 + 1][local13 + 1] * local47 >> 7;
			return local79 * (128 - local51) + local111 * local51 >> 7;
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("20823, " + 76 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "M", descriptor = "(I)V")
	private void method706() {
		try {
			this.aBoolean228 = true;
			try {
				@Pc(10) long local10 = System.currentTimeMillis();
				@Pc(12) int local12 = 0;
				@Pc(14) int local14 = 20;
				while (this.aBoolean250) {
					this.anInt1028++;
					this.method607((byte) 8);
					this.method607((byte) 8);
					this.method652();
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
			this.aBoolean228 = false;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("93307, " + 0 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(ILclient!LDILQFVA;I)V")
	private void method707(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			if (this.anInt993 > 9 || this.anInt993 < 9) {
				this.anInt1032 = -1;
			}
			for (@Pc(14) int local14 = 0; local14 < this.anInt961; local14++) {
				@Pc(21) int local21 = this.anIntArray247[local14];
				@Pc(26) Class1_Sub1_Sub1_Sub1_Sub2 local26 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local21];
				@Pc(29) int local29 = arg1.method359();
				if ((local29 & 0x8) != 0) {
					local26.aString8 = arg1.method366();
					local26.anInt664 = 100;
				}
				if ((local29 & 0x10) != 0) {
					local26.anInt653 = arg1.method386();
					local26.anInt654 = arg1.method361();
				}
				@Pc(61) int local61;
				@Pc(65) int local65;
				if ((local29 & 0x4) != 0) {
					local61 = arg1.method378(anInt941);
					local65 = arg1.method378(anInt941);
					local26.method500(local65, local61, anInt931);
					local26.anInt627 = anInt931 + 300;
					local26.anInt628 = arg1.method379();
					local26.anInt629 = arg1.method359();
				}
				if ((local29 & 0x1) != 0) {
					local61 = arg1.method379();
					local65 = arg1.method378(anInt941);
					local26.method500(local65, local61, anInt931);
					local26.anInt627 = anInt931 + 300;
					local26.anInt628 = arg1.method377();
					local26.anInt629 = arg1.method377();
				}
				if ((local29 & 0x40) != 0) {
					local26.anInt634 = arg1.method361();
					local61 = arg1.method394((byte) 2);
					local26.anInt638 = local61 >> 16;
					local26.anInt637 = anInt931 + (local61 & 0xFFFF);
					local26.anInt635 = 0;
					local26.anInt636 = 0;
					if (local26.anInt637 > anInt931) {
						local26.anInt635 = -1;
					}
					if (local26.anInt634 == 65535) {
						local26.anInt634 = -1;
					}
				}
				if ((local29 & 0x2) != 0) {
					local26.anInt656 = arg1.method387();
					if (local26.anInt656 == 65535) {
						local26.anInt656 = -1;
					}
				}
				if ((local29 & 0x20) != 0) {
					local61 = arg1.method387();
					if (local61 == 65535) {
						local61 = -1;
					}
					local65 = arg1.method377();
					if (local61 == local26.anInt659 && local61 != -1) {
						@Pc(207) int local207 = Class46.aClass46Array1[local61].anInt783;
						if (local207 == 1) {
							local26.anInt660 = 0;
							local26.anInt661 = 0;
							local26.anInt662 = local65;
							local26.anInt663 = 0;
						}
						if (local207 == 2) {
							local26.anInt663 = 0;
						}
					} else if (local61 == -1 || local26.anInt659 == -1 || Class46.aClass46Array1[local61].anInt777 >= Class46.aClass46Array1[local26.anInt659].anInt777) {
						local26.anInt659 = local61;
						local26.anInt660 = 0;
						local26.anInt661 = 0;
						local26.anInt662 = local65;
						local26.anInt663 = 0;
						local26.anInt657 = local26.anInt623;
					}
				}
				if ((local29 & 0x80) != 0) {
					local26.aClass49_2 = Class49.method565(arg1.method387());
					local26.anInt639 = local26.aClass49_2.aByte35;
					local26.anInt633 = local26.aClass49_2.anInt815;
					local26.anInt648 = local26.aClass49_2.anInt805;
					local26.anInt649 = local26.aClass49_2.anInt812;
					local26.anInt650 = local26.aClass49_2.anInt803;
					local26.anInt651 = local26.aClass49_2.anInt799;
					local26.anInt630 = local26.aClass49_2.anInt807;
				}
			}
		} catch (@Pc(318) RuntimeException local318) {
			signlink.reporterror("27767, " + arg0 + ", " + arg1 + ", " + 9 + ", " + local318.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
	private void method708(@OriginalArg(0) byte arg0) {
		try {
			this.aClass36_15.method503();
			Class1_Sub1_Sub2_Sub3.anIntArray55 = this.anIntArray239;
			if (this.aByte43 == 5) {
				@Pc(14) boolean local14 = false;
			} else {
				this.method574();
			}
			this.aClass1_Sub1_Sub2_Sub4_3.method417(448, 0, 0);
			if (this.aBoolean259) {
				this.aClass1_Sub1_Sub2_Sub2_4.method179(this.aString26, 239, 40, 0, this.anInt943);
				this.aClass1_Sub1_Sub2_Sub2_4.method179(this.aString24 + "*", 239, 60, 128, this.anInt943);
			} else if (this.anInt877 == 1) {
				this.aClass1_Sub1_Sub2_Sub2_4.method179("Enter amount:", 239, 40, 0, this.anInt943);
				this.aClass1_Sub1_Sub2_Sub2_4.method179(this.aString30 + "*", 239, 60, 128, this.anInt943);
			} else if (this.anInt877 == 2) {
				this.aClass1_Sub1_Sub2_Sub2_4.method179("Enter name:", 239, 40, 0, this.anInt943);
				this.aClass1_Sub1_Sub2_Sub2_4.method179(this.aString30 + "*", 239, 60, 128, this.anInt943);
			} else if (this.aString19 != null) {
				this.aClass1_Sub1_Sub2_Sub2_4.method179(this.aString19, 239, 40, 0, this.anInt943);
				this.aClass1_Sub1_Sub2_Sub2_4.method179("Click to continue", 239, 60, 128, this.anInt943);
			} else if (this.anInt885 != -1) {
				this.method704(0, Class39.aClass39Array1[this.anInt885], 0, 0);
			} else if (this.anInt907 == -1) {
				@Pc(179) Class1_Sub1_Sub2_Sub2 local179 = this.aClass1_Sub1_Sub2_Sub2_3;
				@Pc(181) int local181 = 0;
				Class1_Sub1_Sub2.method402(0, 463, 77, 0);
				for (@Pc(189) int local189 = 0; local189 < 100; local189++) {
					if (this.aStringArray13[local189] != null) {
						@Pc(201) int local201 = this.anIntArray238[local189];
						@Pc(210) int local210 = this.anInt939 + 70 - local181 * 14;
						@Pc(215) String local215 = this.aStringArray12[local189];
						@Pc(217) byte local217 = 0;
						if (local215 != null && local215.startsWith("@cr1@")) {
							local215 = local215.substring(5);
							local217 = 1;
						}
						if (local215 != null && local215.startsWith("@cr2@")) {
							local215 = local215.substring(5);
							local217 = 2;
						}
						if (local201 == 0) {
							if (local210 > 0 && local210 < 110) {
								local179.method183(4, this.aStringArray13[local189], local210, 0);
							}
							local181++;
						}
						@Pc(288) int local288;
						if ((local201 == 1 || local201 == 2) && (local201 == 1 || this.anInt859 == 0 || this.anInt859 == 1 && this.method606(local215, this.aBoolean234))) {
							if (local210 > 0 && local210 < 110) {
								local288 = 4;
								if (local217 == 1) {
									this.aClass1_Sub1_Sub2_Sub4Array3[0].method417(448, local210 - 12, 4);
									local288 += 14;
								}
								if (local217 == 2) {
									this.aClass1_Sub1_Sub2_Sub4Array3[1].method417(448, local210 - 12, local288);
									local288 += 14;
								}
								local179.method183(local288, local215 + ":", local210, 0);
								local288 += local179.method181(local215) + 8;
								local179.method183(local288, this.aStringArray13[local189], local210, 255);
							}
							local181++;
						}
						if ((local201 == 3 || local201 == 7) && this.anInt1061 == 0 && (local201 == 7 || this.anInt1021 == 0 || this.anInt1021 == 1 && this.method606(local215, this.aBoolean234))) {
							if (local210 > 0 && local210 < 110) {
								local179.method183(4, "From", local210, 0);
								local288 = local179.method181("From ") + 4;
								if (local217 == 1) {
									this.aClass1_Sub1_Sub2_Sub4Array3[0].method417(448, local210 - 12, local288);
									local288 += 14;
								}
								if (local217 == 2) {
									this.aClass1_Sub1_Sub2_Sub4Array3[1].method417(448, local210 - 12, local288);
									local288 += 14;
								}
								local179.method183(local288, local215 + ":", local210, 0);
								local288 += local179.method181(local215) + 8;
								local179.method183(local288, this.aStringArray13[local189], local210, 8388608);
							}
							local181++;
						}
						if (local201 == 4 && (this.anInt1054 == 0 || this.anInt1054 == 1 && this.method606(local215, this.aBoolean234))) {
							if (local210 > 0 && local210 < 110) {
								local179.method183(4, local215 + " " + this.aStringArray13[local189], local210, 8388736);
							}
							local181++;
						}
						if (local201 == 5 && this.anInt1061 == 0 && this.anInt1021 < 2) {
							if (local210 > 0 && local210 < 110) {
								local179.method183(4, this.aStringArray13[local189], local210, 8388608);
							}
							local181++;
						}
						if (local201 == 6 && this.anInt1061 == 0 && this.anInt1021 < 2) {
							if (local210 > 0 && local210 < 110) {
								local179.method183(4, "To " + local215 + ":", local210, 0);
								local179.method183(local179.method181("To " + local215) + 12, this.aStringArray13[local189], local210, 8388608);
							}
							local181++;
						}
						if (local201 == 8 && (this.anInt1054 == 0 || this.anInt1054 == 1 && this.method606(local215, this.aBoolean234))) {
							if (local210 > 0 && local210 < 110) {
								local179.method183(4, local215 + " " + this.aStringArray13[local189], local210, 8270336);
							}
							local181++;
						}
					}
				}
				Class1_Sub1_Sub2.method401();
				this.anInt923 = local181 * 14 + 7;
				if (this.anInt923 < 78) {
					this.anInt923 = 78;
				}
				this.method608(405, this.anInt923, this.anInt923 - this.anInt939 - 77, 463, 77, 0);
				@Pc(661) String local661;
				if (aClass1_Sub1_Sub1_Sub1_Sub1_1 == null || aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3 == null) {
					local661 = Class15.method198(this.aString20);
				} else {
					local661 = aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3;
				}
				local179.method183(4, local661 + ":", 90, 0);
				local179.method183(local179.method181(local661 + ": ") + 6, this.aString23 + "*", 90, 255);
				Class1_Sub1_Sub2.method408(77, 0, 0, 479);
			} else {
				this.method704(0, Class39.aClass39Array1[this.anInt907], 0, 0);
			}
			if (this.aBoolean244 && this.anInt977 == 2) {
				this.method668();
			}
			this.aClass36_15.method504((byte) 9, 357, 17, super.aGraphics2);
			this.aClass36_14.method503();
			Class1_Sub1_Sub2_Sub3.anIntArray55 = this.anIntArray241;
		} catch (@Pc(742) RuntimeException local742) {
			signlink.reporterror("84426, " + arg0 + ", " + local742.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "N", descriptor = "(I)Z")
	private boolean method709(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			return signlink.wavereplay();
		} catch (@Pc(6) RuntimeException local6) {
			signlink.reporterror("3270, " + arg0 + ", " + local6.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)V")
	private void method710(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!ZNUYRYPY;IZI)V")
	private void method711(@OriginalArg(0) int arg0, @OriginalArg(1) Class49 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			this.aBoolean241 &= true;
			if (this.anInt1019 < 400) {
				if (arg1.anIntArray207 != null) {
					arg1 = arg1.method567();
				}
				if (arg1 != null && arg1.aBoolean206) {
					@Pc(29) String local29 = arg1.aString16;
					if (arg1.anInt816 != 0) {
						local29 = local29 + method651(arg1.anInt816, aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt111) + " (level-" + arg1.anInt816 + ")";
					}
					if (this.anInt853 == 1) {
						this.aStringArray9[this.anInt1019] = "Use " + this.aString18 + " with @yel@" + local29;
						this.anIntArray252[this.anInt1019] = 718;
						this.anIntArray253[this.anInt1019] = arg2;
						this.anIntArray250[this.anInt1019] = arg3;
						this.anIntArray251[this.anInt1019] = arg0;
						this.anInt1019++;
					} else if (this.anInt849 != 1) {
						@Pc(167) int local167;
						if (arg1.aStringArray7 != null) {
							for (local167 = 4; local167 >= 0; local167--) {
								if (arg1.aStringArray7[local167] != null && !arg1.aStringArray7[local167].equalsIgnoreCase("attack")) {
									this.aStringArray9[this.anInt1019] = arg1.aStringArray7[local167] + " @yel@" + local29;
									if (local167 == 0) {
										this.anIntArray252[this.anInt1019] = 747;
									}
									if (local167 == 1) {
										this.anIntArray252[this.anInt1019] = 891;
									}
									if (local167 == 2) {
										this.anIntArray252[this.anInt1019] = 664;
									}
									if (local167 == 3) {
										this.anIntArray252[this.anInt1019] = 746;
									}
									if (local167 == 4) {
										this.anIntArray252[this.anInt1019] = 131;
									}
									this.anIntArray253[this.anInt1019] = arg2;
									this.anIntArray250[this.anInt1019] = arg3;
									this.anIntArray251[this.anInt1019] = arg0;
									this.anInt1019++;
								}
							}
						}
						if (arg1.aStringArray7 != null) {
							for (local167 = 4; local167 >= 0; local167--) {
								if (arg1.aStringArray7[local167] != null && arg1.aStringArray7[local167].equalsIgnoreCase("attack")) {
									@Pc(291) short local291 = 0;
									if (arg1.anInt816 > aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt111) {
										local291 = 2000;
									}
									this.aStringArray9[this.anInt1019] = arg1.aStringArray7[local167] + " @yel@" + local29;
									if (local167 == 0) {
										this.anIntArray252[this.anInt1019] = local291 + 747;
									}
									if (local167 == 1) {
										this.anIntArray252[this.anInt1019] = local291 + 891;
									}
									if (local167 == 2) {
										this.anIntArray252[this.anInt1019] = local291 + 664;
									}
									if (local167 == 3) {
										this.anIntArray252[this.anInt1019] = local291 + 746;
									}
									if (local167 == 4) {
										this.anIntArray252[this.anInt1019] = local291 + 131;
									}
									this.anIntArray253[this.anInt1019] = arg2;
									this.anIntArray250[this.anInt1019] = arg3;
									this.anIntArray251[this.anInt1019] = arg0;
									this.anInt1019++;
								}
							}
						}
						this.aStringArray9[this.anInt1019] = "Examine @yel@" + local29;
						this.anIntArray252[this.anInt1019] = 1713;
						this.anIntArray253[this.anInt1019] = arg2;
						this.anIntArray250[this.anInt1019] = arg3;
						this.anIntArray251[this.anInt1019] = arg0;
						this.anInt1019++;
					} else if ((this.anInt851 & 0x2) == 2) {
						this.aStringArray9[this.anInt1019] = this.aString17 + " @yel@" + local29;
						this.anIntArray252[this.anInt1019] = 382;
						this.anIntArray253[this.anInt1019] = arg2;
						this.anIntArray250[this.anInt1019] = arg3;
						this.anIntArray251[this.anInt1019] = arg0;
						this.anInt1019++;
						return;
					}
				}
			}
		} catch (@Pc(441) RuntimeException local441) {
			signlink.reporterror("64973, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + local441.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)Z")
	private boolean method712(@OriginalArg(1) int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(17) int local17 = this.anIntArray252[arg0];
			if (local17 >= 2000) {
				local17 -= 2000;
			}
			return local17 == 394;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("96534, " + 8 + ", " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "O", descriptor = "(I)V")
	private void method713() {
		try {
			@Pc(7) byte[] local7 = this.aClass35_1.method491("title.dat", null);
			@Pc(13) Class1_Sub1_Sub2_Sub1 local13 = new Class1_Sub1_Sub2_Sub1(local7, this);
			this.aClass36_22.method503();
			local13.method129(0, 0);
			this.aClass36_23.method503();
			local13.method129(-637, 0);
			this.aClass36_19.method503();
			local13.method129(-128, 0);
			this.aClass36_20.method503();
			local13.method129(-202, -371);
			this.aClass36_21.method503();
			local13.method129(-202, -171);
			this.aClass36_24.method503();
			local13.method129(0, -265);
			this.aClass36_25.method503();
			local13.method129(-562, -265);
			this.aClass36_26.method503();
			local13.method129(-128, -171);
			this.aClass36_27.method503();
			local13.method129(-562, -171);
			@Pc(98) int[] local98 = new int[local13.anInt213];
			for (@Pc(100) int local100 = 0; local100 < local13.anInt214; local100++) {
				for (@Pc(104) int local104 = 0; local104 < local13.anInt213; local104++) {
					local98[local104] = local13.anIntArray30[local13.anInt213 + local13.anInt213 * local100 - local104 - 1];
				}
				for (@Pc(130) int local130 = 0; local130 < local13.anInt213; local130++) {
					local13.anIntArray30[local130 + local13.anInt213 * local100] = local98[local130];
				}
			}
			this.aClass36_22.method503();
			local13.method129(382, 0);
			this.aClass36_23.method503();
			local13.method129(-255, 0);
			this.aClass36_19.method503();
			local13.method129(254, 0);
			this.aClass36_20.method503();
			local13.method129(180, -371);
			this.aClass36_21.method503();
			local13.method129(180, -171);
			this.aClass36_24.method503();
			local13.method129(382, -265);
			this.aClass36_25.method503();
			local13.method129(-180, -265);
			this.aClass36_26.method503();
			local13.method129(254, -171);
			this.aClass36_27.method503();
			local13.method129(-180, -171);
			local13 = new Class1_Sub1_Sub2_Sub1(this.aClass35_1, "logo", 0);
			this.aClass36_19.method503();
			local13.method131(18, 382 - local13.anInt213 / 2 - 128);
			System.gc();
		} catch (@Pc(275) RuntimeException local275) {
			signlink.reporterror("58411, " + 6 + ", " + local275.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
	private void method714() {
		try {
			for (@Pc(13) Class1_Sub2 local13 = (Class1_Sub2) this.aClass23_10.method422(); local13 != null; local13 = (Class1_Sub2) this.aClass23_10.method424((byte) 5)) {
				if (local13.anInt597 == -1) {
					local13.anInt593 = 0;
					this.method648(local13);
				} else {
					local13.method544();
				}
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("19509, " + false + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JB)V")
	private void method715(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt935 >= 100) {
					this.method695("", 0, "Your ignore list is full. Max of 100 hit");
				} else {
					@Pc(23) String local23 = Class15.method198(Class15.method195(arg0));
					for (@Pc(25) int local25 = 0; local25 < this.anInt935; local25++) {
						if (this.aLongArray3[local25] == arg0) {
							this.method695("", 0, local23 + " is already on your ignore list");
							return;
						}
					}
					for (@Pc(55) int local55 = 0; local55 < this.anInt1037; local55++) {
						if (this.aLongArray4[local55] == arg0) {
							this.method695("", 0, "Please remove " + local23 + " from your friend list first");
							return;
						}
					}
					this.aLongArray3[this.anInt935++] = arg0;
					this.aBoolean227 = true;
					this.aClass1_Sub1_Sub3_6.method348(142);
					this.aClass1_Sub1_Sub3_6.method355(arg0);
				}
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("45869, " + arg0 + ", " + -93 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}
}
