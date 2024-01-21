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

	@OriginalMember(owner = "client!client", name = "P", descriptor = "I")
	private static int anInt865;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
	private static int anInt877;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "I")
	private static int anInt881;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "I")
	private static int anInt894;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "Lclient!FHQGDDHF;")
	public static Class1_Sub1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "Z")
	private static boolean aBoolean228;

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "I")
	public static int anInt903;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "I")
	private static int anInt911;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "I")
	private static int anInt935;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "I")
	private static int anInt940;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "I")
	private static int anInt946;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "Z")
	private static boolean aBoolean236;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "I")
	public static int anInt971;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "Z")
	private static boolean aBoolean247;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "Z")
	private static boolean aBoolean248;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "I")
	private static int anInt987;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "I")
	private static int anInt990;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "I")
	private static int anInt1005;

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "Z")
	private static boolean aBoolean260;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "I")
	private static int anInt1057;

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "I")
	private static int anInt1078;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "[I")
	private static int[] anIntArray215 = new int[99];

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "B")
	private static byte aByte35;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "Ljava/lang/String;")
	private static String aString18;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "Z")
	private static boolean aBoolean229;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "I")
	private static int anInt933;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "B")
	private static byte aByte36;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
	private static int anInt941;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "Z")
	private static boolean aBoolean241;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "I")
	private static int anInt970;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "Z")
	private static boolean aBoolean246;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "I")
	private static int anInt972;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "[I")
	public static final int[] anIntArray237;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "Z")
	private static boolean aBoolean253;

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "[[I")
	public static final int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "[I")
	public static int[] anIntArray269;

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "I")
	private static int anInt1075;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "I")
	private int anInt863;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "I")
	private int anInt867;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "I")
	private int anInt868;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
	private int anInt871;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
	private int anInt872;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "Lclient!EDCVNWGU;")
	private Class12 aClass12_3;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "Lclient!EDCVNWGU;")
	private Class12 aClass12_4;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "Lclient!EDCVNWGU;")
	private Class12 aClass12_5;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "Lclient!EDCVNWGU;")
	private Class12 aClass12_6;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "Lclient!EDCVNWGU;")
	private Class12 aClass12_7;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "Lclient!EDCVNWGU;")
	private Class12 aClass12_8;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "Lclient!EDCVNWGU;")
	private Class12 aClass12_9;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Lclient!EDCVNWGU;")
	private Class12 aClass12_10;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "Lclient!EDCVNWGU;")
	private Class12 aClass12_11;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
	private int anInt873;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
	private int anInt874;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
	private int anInt875;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
	private int anInt876;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
	private int anInt878;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "Lclient!CUKAGIIJ;")
	private Class1_Sub1_Sub3_Sub1 aClass1_Sub1_Sub3_Sub1_3;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "Lclient!CUKAGIIJ;")
	private Class1_Sub1_Sub3_Sub1 aClass1_Sub1_Sub3_Sub1_4;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "I")
	private int anInt882;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "I")
	private int anInt883;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "I")
	private int anInt884;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "I")
	private int anInt885;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "I")
	private int anInt886;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
	private int anInt887;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
	private int anInt888;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
	private int anInt889;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "Lclient!CUKAGIIJ;")
	private Class1_Sub1_Sub3_Sub1 aClass1_Sub1_Sub3_Sub1_5;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "[[B")
	private byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "I")
	private int anInt890;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "I")
	private int anInt893;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "Lclient!SIPXLNWG;")
	private Class40 aClass40_1;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "I")
	private int anInt896;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "I")
	private int anInt897;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "I")
	private int anInt898;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "I")
	private int anInt899;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "Lclient!FDCAWVRL;")
	private Class1_Sub1_Sub3_Sub2 aClass1_Sub1_Sub3_Sub2_1;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "Lclient!FDCAWVRL;")
	private Class1_Sub1_Sub3_Sub2 aClass1_Sub1_Sub3_Sub2_2;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "Lclient!FDCAWVRL;")
	private Class1_Sub1_Sub3_Sub2 aClass1_Sub1_Sub3_Sub2_3;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "I")
	private int anInt900;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "I")
	private int anInt901;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "I")
	private int anInt904;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "I")
	private int anInt905;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "I")
	private int anInt907;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "I")
	private int anInt908;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "Lclient!EDCVNWGU;")
	private Class12 aClass12_12;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "Lclient!EDCVNWGU;")
	private Class12 aClass12_13;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "Lclient!EDCVNWGU;")
	private Class12 aClass12_14;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "Lclient!CUKAGIIJ;")
	private Class1_Sub1_Sub3_Sub1 aClass1_Sub1_Sub3_Sub1_6;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "I")
	private int anInt909;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "I")
	private int anInt912;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "I")
	private int anInt913;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "I")
	private int anInt914;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "[I")
	private int[] anIntArray227;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "[I")
	private int[] anIntArray228;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "Lclient!EDCVNWGU;")
	private Class12 aClass12_15;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "Lclient!EDCVNWGU;")
	private Class12 aClass12_16;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "Lclient!EDCVNWGU;")
	private Class12 aClass12_17;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "Lclient!EDCVNWGU;")
	private Class12 aClass12_18;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "Lclient!EDCVNWGU;")
	private Class12 aClass12_19;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "Lclient!EDCVNWGU;")
	private Class12 aClass12_20;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "Lclient!EDCVNWGU;")
	private Class12 aClass12_21;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "Lclient!EDCVNWGU;")
	private Class12 aClass12_22;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "Lclient!EDCVNWGU;")
	private Class12 aClass12_23;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "I")
	private int anInt915;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "I")
	private int anInt916;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "I")
	private int anInt917;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "I")
	private int anInt918;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "I")
	private int anInt919;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "Ljava/lang/String;")
	private String aString20;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
	private int anInt920;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "I")
	private int anInt921;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "I")
	private int anInt922;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "I")
	private int anInt923;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "I")
	private int anInt924;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "I")
	private int anInt925;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "I")
	private int anInt926;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "Lclient!EIPZGSZT;")
	private Class14 aClass14_1;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "I")
	private int anInt929;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "I")
	private int anInt930;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "I")
	private int anInt931;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "I")
	private int anInt932;

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "I")
	private int anInt934;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
	private int anInt937;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "I")
	private int anInt938;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "I")
	private int anInt939;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "Lclient!CUKAGIIJ;")
	private Class1_Sub1_Sub3_Sub1 aClass1_Sub1_Sub3_Sub1_7;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "Lclient!CUKAGIIJ;")
	private Class1_Sub1_Sub3_Sub1 aClass1_Sub1_Sub3_Sub1_8;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
	private int anInt942;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "I")
	private int anInt943;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "I")
	private int anInt944;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "Ljava/lang/String;")
	private String aString23;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "Ljava/lang/String;")
	private String aString24;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "Lclient!FDMAFIMR;")
	private Class1_Sub1_Sub3_Sub3 aClass1_Sub1_Sub3_Sub3_2;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "Lclient!FDMAFIMR;")
	private Class1_Sub1_Sub3_Sub3 aClass1_Sub1_Sub3_Sub3_3;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "Lclient!FDMAFIMR;")
	private Class1_Sub1_Sub3_Sub3 aClass1_Sub1_Sub3_Sub3_4;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "Lclient!FDMAFIMR;")
	private Class1_Sub1_Sub3_Sub3 aClass1_Sub1_Sub3_Sub3_5;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "I")
	private int anInt948;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "I")
	private int anInt949;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "I")
	private int anInt950;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "I")
	private int anInt951;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "I")
	private int anInt952;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
	private int anInt953;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "Ljava/lang/String;")
	private String aString25;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "I")
	private int anInt954;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "I")
	private int anInt957;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "I")
	private int anInt958;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "I")
	private int anInt959;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
	private int anInt961;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "I")
	private int anInt962;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
	private int anInt963;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
	private int anInt964;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "I")
	private int anInt965;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "Lclient!EDCVNWGU;")
	private Class12 aClass12_24;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "Lclient!EDCVNWGU;")
	private Class12 aClass12_25;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "Lclient!EDCVNWGU;")
	private Class12 aClass12_26;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "Lclient!EDCVNWGU;")
	private Class12 aClass12_27;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "I")
	private int anInt966;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "Lclient!QHZQTTDB;")
	private Class36 aClass36_1;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "I")
	private int anInt967;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
	private int anInt968;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
	private int anInt969;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "I")
	private int anInt973;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "I")
	private int anInt975;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "I")
	private int anInt976;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "I")
	private int anInt977;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "I")
	private int anInt978;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
	private int anInt979;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "I")
	private int anInt980;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "I")
	private int anInt981;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "Lclient!OBRIXRSB;")
	private Class20_Sub1 aClass20_Sub1_1;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "I")
	private int anInt984;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "I")
	private int anInt985;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
	private int anInt986;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
	private int anInt988;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
	private int anInt992;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "I")
	private int anInt993;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "I")
	private int anInt994;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "I")
	private int anInt997;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
	private int anInt998;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "I")
	private int anInt999;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
	private int anInt1000;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "I")
	private int anInt1001;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "Lclient!CUKAGIIJ;")
	private Class1_Sub1_Sub3_Sub1 aClass1_Sub1_Sub3_Sub1_9;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "I")
	private int anInt1003;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "I")
	private int anInt1004;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "Lclient!FDCAWVRL;")
	private Class1_Sub1_Sub3_Sub2 aClass1_Sub1_Sub3_Sub2_4;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "Lclient!FDCAWVRL;")
	private Class1_Sub1_Sub3_Sub2 aClass1_Sub1_Sub3_Sub2_5;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "I")
	private int anInt1007;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "I")
	private int anInt1008;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "I")
	private int anInt1009;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "I")
	private int anInt1010;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
	private int anInt1011;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
	private int anInt1012;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
	private int anInt1013;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
	private int anInt1014;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
	private int anInt1016;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "Lclient!FDCAWVRL;")
	private Class1_Sub1_Sub3_Sub2 aClass1_Sub1_Sub3_Sub2_6;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "Lclient!FDCAWVRL;")
	private Class1_Sub1_Sub3_Sub2 aClass1_Sub1_Sub3_Sub2_7;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "Lclient!FDCAWVRL;")
	private Class1_Sub1_Sub3_Sub2 aClass1_Sub1_Sub3_Sub2_8;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "Lclient!FDCAWVRL;")
	private Class1_Sub1_Sub3_Sub2 aClass1_Sub1_Sub3_Sub2_9;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "Lclient!FDCAWVRL;")
	private Class1_Sub1_Sub3_Sub2 aClass1_Sub1_Sub3_Sub2_10;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "Lclient!FDCAWVRL;")
	private Class1_Sub1_Sub3_Sub2 aClass1_Sub1_Sub3_Sub2_11;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "Lclient!FDCAWVRL;")
	private Class1_Sub1_Sub3_Sub2 aClass1_Sub1_Sub3_Sub2_12;

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "Lclient!FDCAWVRL;")
	private Class1_Sub1_Sub3_Sub2 aClass1_Sub1_Sub3_Sub2_13;

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "Lclient!FDCAWVRL;")
	private Class1_Sub1_Sub3_Sub2 aClass1_Sub1_Sub3_Sub2_14;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "Lclient!FDCAWVRL;")
	private Class1_Sub1_Sub3_Sub2 aClass1_Sub1_Sub3_Sub2_15;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "I")
	private int anInt1021;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "[I")
	private int[] anIntArray244;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "[I")
	private int[] anIntArray245;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "[I")
	private int[] anIntArray246;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "I")
	private int anInt1022;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "I")
	private int anInt1023;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "I")
	private int anInt1024;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "I")
	private int anInt1025;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "I")
	private int anInt1026;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "I")
	private int anInt1027;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "I")
	private int anInt1028;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "I")
	private int anInt1029;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "I")
	private int anInt1030;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "I")
	private int anInt1031;

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
	private int anInt1032;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "I")
	private int anInt1033;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "I")
	private int anInt1035;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "I")
	private int anInt1037;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "I")
	private int anInt1038;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "I")
	private int anInt1039;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "I")
	private int anInt1040;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "I")
	private int anInt1041;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "I")
	private int anInt1042;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "I")
	private int anInt1043;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "I")
	private int anInt1044;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "I")
	private int anInt1045;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "I")
	private int anInt1046;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "I")
	private int anInt1047;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "Lclient!QKKVGPGN;")
	private Class37 aClass37_2;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "I")
	private int anInt1049;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "I")
	private int anInt1051;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
	private int anInt1052;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "[Lclient!FDCAWVRL;")
	private Class1_Sub1_Sub3_Sub2[] aClass1_Sub1_Sub3_Sub2Array5;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "I")
	private int anInt1055;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "[I")
	private int[] anIntArray260;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "[I")
	private int[] anIntArray261;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "I")
	private int anInt1058;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "I")
	private int anInt1059;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "I")
	private int anInt1060;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "I")
	private int anInt1061;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "Lclient!CUKAGIIJ;")
	private Class1_Sub1_Sub3_Sub1 aClass1_Sub1_Sub3_Sub1_10;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "Lclient!CUKAGIIJ;")
	private Class1_Sub1_Sub3_Sub1 aClass1_Sub1_Sub3_Sub1_11;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "Lclient!CUKAGIIJ;")
	private Class1_Sub1_Sub3_Sub1 aClass1_Sub1_Sub3_Sub1_12;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "Lclient!CUKAGIIJ;")
	private Class1_Sub1_Sub3_Sub1 aClass1_Sub1_Sub3_Sub1_13;

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "Lclient!CUKAGIIJ;")
	private Class1_Sub1_Sub3_Sub1 aClass1_Sub1_Sub3_Sub1_14;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "I")
	private int anInt1063;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "[I")
	private int[] anIntArray265;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "[I")
	private int[] anIntArray266;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "[I")
	private int[] anIntArray267;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "[I")
	private int[] anIntArray268;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "I")
	private int anInt1064;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "Lclient!CUKAGIIJ;")
	private Class1_Sub1_Sub3_Sub1 aClass1_Sub1_Sub3_Sub1_15;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "Lclient!CUKAGIIJ;")
	private Class1_Sub1_Sub3_Sub1 aClass1_Sub1_Sub3_Sub1_16;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "I")
	private int anInt1068;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "I")
	private int anInt1069;

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "Lclient!FDCAWVRL;")
	private Class1_Sub1_Sub3_Sub2 aClass1_Sub1_Sub3_Sub2_16;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "Lclient!FDCAWVRL;")
	private Class1_Sub1_Sub3_Sub2 aClass1_Sub1_Sub3_Sub2_17;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "Lclient!FDCAWVRL;")
	private Class1_Sub1_Sub3_Sub2 aClass1_Sub1_Sub3_Sub2_18;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "I")
	private int anInt1070;

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "Lclient!FDCAWVRL;")
	private Class1_Sub1_Sub3_Sub2 aClass1_Sub1_Sub3_Sub2_19;

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "Lclient!FDCAWVRL;")
	private Class1_Sub1_Sub3_Sub2 aClass1_Sub1_Sub3_Sub2_20;

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "I")
	private int anInt1072;

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "I")
	private int anInt1076;

	@OriginalMember(owner = "client!client", name = "Kj", descriptor = "[I")
	private int[] anIntArray271;

	@OriginalMember(owner = "client!client", name = "Lj", descriptor = "[I")
	private int[] anIntArray272;

	@OriginalMember(owner = "client!client", name = "Mj", descriptor = "[I")
	private int[] anIntArray273;

	@OriginalMember(owner = "client!client", name = "Nj", descriptor = "Lclient!VSUYIIVA;")
	private Class42 aClass42_1;

	@OriginalMember(owner = "client!client", name = "Oj", descriptor = "I")
	private int anInt1080;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "Z")
	private boolean aBoolean223 = false;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "Z")
	private boolean aBoolean224 = true;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "I")
	private int anInt864 = 3353893;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "[[I")
	private int[][] anIntArrayArray22 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "[Lclient!CUKAGIIJ;")
	private Class1_Sub1_Sub3_Sub1[] aClass1_Sub1_Sub3_Sub1Array4 = new Class1_Sub1_Sub3_Sub1[20];

	@OriginalMember(owner = "client!client", name = "R", descriptor = "I")
	private int anInt866 = 3;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "[I")
	private int[] anIntArray212 = new int[100];

	@OriginalMember(owner = "client!client", name = "V", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8 = new String[100];

	@OriginalMember(owner = "client!client", name = "W", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9 = new String[100];

	@OriginalMember(owner = "client!client", name = "X", descriptor = "I")
	private int anInt869 = 2048;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
	private int anInt870 = 2047;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "[Lclient!FHQGDDHF;")
	private Class1_Sub1_Sub1_Sub1_Sub2[] aClass1_Sub1_Sub1_Sub1_Sub2Array1 = new Class1_Sub1_Sub1_Sub1_Sub2[this.anInt869];

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "[I")
	private int[] anIntArray213 = new int[this.anInt869];

	@OriginalMember(owner = "client!client", name = "db", descriptor = "[I")
	private int[] anIntArray214 = new int[this.anInt869];

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "[Lclient!CFARFRSG;")
	private Class1_Sub1_Sub2[] aClass1_Sub1_Sub2Array1 = new Class1_Sub1_Sub2[this.anInt869];

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "[[[Lclient!CLCMCMIN;")
	private Class7[][][] aClass7ArrayArrayArray1 = new Class7[4][104][104];

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "Z")
	private boolean aBoolean225 = false;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "[I")
	private int[] anIntArray216 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray10 = new String[200];

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "[I")
	private int[] anIntArray217 = new int[50];

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "Lclient!CLCMCMIN;")
	private Class7 aClass7_10 = new Class7(anInt972);

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
	private int anInt879 = 232;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
	private int anInt880 = -1;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "[I")
	private int[] anIntArray218 = new int[151];

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "[I")
	private int[] anIntArray219 = new int[5];

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "I")
	private int anInt892 = 4;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "I")
	private int anInt895 = -1;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "[I")
	private int[] anIntArray220 = new int[1000];

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "[I")
	private int[] anIntArray221 = new int[1000];

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11 = new String[5];

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "[Z")
	private boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "Z")
	private boolean aBoolean226 = false;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "Ljava/lang/String;")
	private String aString17 = "";

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "[Lclient!CUKAGIIJ;")
	private Class1_Sub1_Sub3_Sub1[] aClass1_Sub1_Sub3_Sub1Array5 = new Class1_Sub1_Sub3_Sub1[1000];

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "[I")
	private int[] anIntArray222 = new int[5];

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "Z")
	private boolean aBoolean227 = false;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7 = new int[4][13][13];

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "[I")
	private int[] anIntArray223 = new int[1000];

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "I")
	private int anInt902 = 394;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "[I")
	private int[] anIntArray224 = new int[Class25.anInt479];

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "I")
	private int anInt906 = -3381;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "Ljava/lang/String;")
	private String aString19 = "";

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "Z")
	private boolean aBoolean230 = false;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "[I")
	private int[] anIntArray225 = new int[200];

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "Lclient!OPFNUBIN;")
	private Class32 aClass32_1 = new Class32();

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "Z")
	private boolean aBoolean231 = false;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "[I")
	private int[] anIntArray226 = new int[151];

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "Z")
	private boolean aBoolean232 = false;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "Ljava/lang/String;")
	private String aString21 = "";

	@OriginalMember(owner = "client!client", name = "td", descriptor = "Ljava/lang/String;")
	private String aString22 = "";

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "[I")
	private int[] anIntArray229 = new int[7];

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "[B")
	private byte[] aByteArray21 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "Z")
	private boolean aBoolean233 = true;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "[I")
	private int[] anIntArray230 = new int[Class25.anInt479];

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "Z")
	private boolean aBoolean234 = false;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "I")
	private int anInt927 = 17845;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "I")
	private int anInt928 = -1;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "[Lclient!FDCAWVRL;")
	private Class1_Sub1_Sub3_Sub2[] aClass1_Sub1_Sub3_Sub2Array2 = new Class1_Sub1_Sub3_Sub2[13];

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "Z")
	private boolean aBoolean235 = false;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "[I")
	private int[] anIntArray231 = new int[5];

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
	private int anInt947 = 9177;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "Z")
	private boolean aBoolean237 = true;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
	private int anInt955 = 1;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "Z")
	private boolean aBoolean238 = false;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "I")
	private int anInt956 = -1;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "Z")
	private boolean aBoolean239 = false;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "Z")
	private volatile boolean aBoolean240 = false;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "Z")
	private boolean aBoolean242 = false;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "Z")
	private boolean aBoolean243 = true;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "B")
	private byte aByte37 = 1;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "[I")
	private int[] anIntArray232 = new int[5];

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "I")
	private int anInt960 = -1;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "[I")
	private int[] anIntArray233 = new int[33];

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "Z")
	private volatile boolean aBoolean244 = false;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "[J")
	private long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "Z")
	private boolean aBoolean245 = true;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "[I")
	private int[] anIntArray234 = new int[50];

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "[Lclient!FDCAWVRL;")
	private Class1_Sub1_Sub3_Sub2[] aClass1_Sub1_Sub3_Sub2Array3 = new Class1_Sub1_Sub3_Sub2[2];

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "[Lclient!PJMJGLFE;")
	public Class34[] aClass34Array1 = new Class34[5];

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "[J")
	private long[] aLongArray4 = new long[200];

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
	private int anInt974 = 2;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "[I")
	private int[] anIntArray235 = new int[5];

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "[Lclient!CUKAGIIJ;")
	private Class1_Sub1_Sub3_Sub1[] aClass1_Sub1_Sub3_Sub1Array6 = new Class1_Sub1_Sub3_Sub1[8];

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "B")
	private byte aByte38 = 23;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "Z")
	private volatile boolean aBoolean249 = false;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
	private int anInt982 = -1;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "Z")
	private boolean aBoolean250 = true;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "I")
	private int anInt983 = 128;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "Lclient!CFARFRSG;")
	private Class1_Sub1_Sub2 aClass1_Sub1_Sub2_6 = new Class1_Sub1_Sub2(new byte[5000], 792);

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "[Lclient!ADGLALPC;")
	private Class1_Sub1_Sub1_Sub1_Sub1[] aClass1_Sub1_Sub1_Sub1_Sub1Array1 = new Class1_Sub1_Sub1_Sub1_Sub1[16384];

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "[I")
	private int[] anIntArray236 = new int[16384];

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "I")
	private int anInt989 = -962;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "I")
	private int anInt991 = -1;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "[Lclient!FDCAWVRL;")
	private Class1_Sub1_Sub3_Sub2[] aClass1_Sub1_Sub3_Sub2Array4 = new Class1_Sub1_Sub3_Sub2[100];

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "Z")
	private boolean aBoolean251 = false;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "I")
	private int anInt995 = 2301979;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "Z")
	private boolean aBoolean252 = false;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "[Z")
	private boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
	private final int anInt996 = 100;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "[I")
	private int[] anIntArray238 = new int[100];

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "[Lclient!CUKAGIIJ;")
	private Class1_Sub1_Sub3_Sub1[] aClass1_Sub1_Sub3_Sub1Array7 = new Class1_Sub1_Sub3_Sub1[20];

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "I")
	private int anInt1002 = -1;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "[I")
	private int[] anIntArray239 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "B")
	private byte aByte39 = -17;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "I")
	private int anInt1006 = -1;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "[I")
	private int[] anIntArray240 = new int[9];

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "[I")
	private int[] anIntArray241 = new int[33];

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "[I")
	private int[] anIntArray242 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "I")
	private int anInt1015 = -631;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "Ljava/lang/String;")
	private String aString26 = "";

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "[I")
	public int[] anIntArray243 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "B")
	private byte aByte40 = 2;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "I")
	private int anInt1017 = 190;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "I")
	private int anInt1018 = 5063219;

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "B")
	private byte aByte41 = 6;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "I")
	private int anInt1019 = -1;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "I")
	private int anInt1020 = -1;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "Z")
	private boolean aBoolean254 = false;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "Z")
	private boolean aBoolean255 = false;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "Z")
	private boolean aBoolean256 = false;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12 = new String[500];

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "Lclient!CFARFRSG;")
	private Class1_Sub1_Sub2 aClass1_Sub1_Sub2_7 = Class1_Sub1_Sub2.method47();

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "Ljava/lang/String;")
	private String aString27 = "";

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "Z")
	private boolean aBoolean257 = false;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "[I")
	private int[] anIntArray247 = new int[256];

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "Z")
	private boolean aBoolean258 = false;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "I")
	private int anInt1034 = 1;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "Z")
	private boolean aBoolean259 = false;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "I")
	private int anInt1036 = -68;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "Z")
	private boolean aBoolean261 = true;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "Ljava/lang/String;")
	private String aString28 = "";

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "Ljava/lang/String;")
	private String aString29 = "";

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "Z")
	private boolean aBoolean262 = false;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "B")
	private byte aByte42 = 19;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "I")
	private int anInt1048 = -1;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "[I")
	private int[] anIntArray248 = new int[500];

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "[I")
	private int[] anIntArray249 = new int[500];

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "[I")
	private int[] anIntArray250 = new int[500];

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "[I")
	private int[] anIntArray251 = new int[500];

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "I")
	private int anInt1050 = 78;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "Lclient!CFARFRSG;")
	private Class1_Sub1_Sub2 aClass1_Sub1_Sub2_8 = Class1_Sub1_Sub2.method47();

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "I")
	private int anInt1053 = -1;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "[I")
	private int[] anIntArray252 = new int[50];

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "I")
	private int anInt1054 = -3747;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
	private int anInt1056 = 50;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "[I")
	private int[] anIntArray253 = new int[this.anInt1056];

	@OriginalMember(owner = "client!client", name = "si", descriptor = "[I")
	private int[] anIntArray254 = new int[this.anInt1056];

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "[I")
	private int[] anIntArray255 = new int[this.anInt1056];

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "[I")
	private int[] anIntArray256 = new int[this.anInt1056];

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "[I")
	private int[] anIntArray257 = new int[this.anInt1056];

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "[I")
	private int[] anIntArray258 = new int[this.anInt1056];

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "[I")
	private int[] anIntArray259 = new int[this.anInt1056];

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13 = new String[this.anInt1056];

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "Ljava/lang/String;")
	private String aString30 = "";

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "Z")
	private boolean aBoolean263 = false;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "[Lclient!CUKAGIIJ;")
	private Class1_Sub1_Sub3_Sub1[] aClass1_Sub1_Sub3_Sub1Array8 = new Class1_Sub1_Sub3_Sub1[100];

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "Z")
	public boolean aBoolean264 = false;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "[I")
	private final int[] anIntArray262 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "Lclient!CLCMCMIN;")
	private Class7 aClass7_11 = new Class7(anInt972);

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "[I")
	private int[] anIntArray263 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "[I")
	private int[] anIntArray264 = new int[4000];

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "I")
	private int anInt1065 = -1;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "Lclient!CLCMCMIN;")
	private Class7 aClass7_12 = new Class7(anInt972);

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "Z")
	private boolean aBoolean265 = false;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "[[I")
	private int[][] anIntArrayArray25 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "[Lclient!HQFIXEZL;")
	private Class18[] aClass18Array1 = new Class18[4];

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "I")
	private int anInt1066 = -7889;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "I")
	private int anInt1067 = -1;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "Z")
	private boolean aBoolean266 = false;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "Z")
	private boolean aBoolean267 = true;

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "I")
	private int anInt1071 = 7759444;

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "I")
	private int anInt1073 = 2;

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "Z")
	private boolean aBoolean268 = false;

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "[I")
	private int[] anIntArray270 = new int[Class25.anInt479];

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "I")
	private int anInt1074 = -71;

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "Z")
	private boolean aBoolean269 = false;

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "Lclient!CFARFRSG;")
	private Class1_Sub1_Sub2 aClass1_Sub1_Sub2_9 = Class1_Sub1_Sub2.method47();

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "I")
	private int anInt1077 = 2;

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "I")
	private int anInt1079 = 47773;

	@OriginalMember(owner = "client!client", name = "Jj", descriptor = "Z")
	private boolean aBoolean270 = false;

	static {
		@Pc(9) int local9 = 0;
		@Pc(11) int local11;
		for (local11 = 0; local11 < 99; local11++) {
			@Pc(16) int local16 = local11 + 1;
			@Pc(29) int local29 = (int) ((double) local16 + Math.pow(2.0D, (double) local16 / 7.0D) * 300.0D);
			local9 += local29;
			anIntArray215[local11] = local9 / 4;
		}
		aByte35 = 3;
		aString18 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		aBoolean229 = true;
		anInt933 = -731;
		aByte36 = 3;
		anInt941 = 687;
		aBoolean241 = true;
		aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		anInt970 = 10;
		aBoolean246 = true;
		anInt972 = -524;
		anIntArray237 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		aBoolean253 = true;
		anIntArrayArray23 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
		anIntArray269 = new int[32];
		local9 = 2;
		for (local11 = 0; local11 < 32; local11++) {
			anIntArray269[local11] = local9 - 1;
			local9 += local9;
		}
		anInt1075 = -288;
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private static void method626() {
		try {
			Class40.aBoolean193 = false;
			Class1_Sub1_Sub3_Sub4.aBoolean203 = false;
			aBoolean247 = false;
			Class9.aBoolean59 = false;
			Class38.aBoolean173 = false;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("85811, " + -296 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 332);
			if (arg0.length == 5) {
				anInt970 = Integer.parseInt(arg0[0]);
				anInt971 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method712(anInt946);
				} else if (arg0[2].equals("highmem")) {
					method626();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean246 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean246 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt1083 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method569();
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)Ljava/lang/String;")
	private static String method687(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) String local4 = String.valueOf(arg0);
			for (@Pc(9) int local9 = local4.length() - 3; local9 > 0; local9 -= 3) {
				local4 = local4.substring(0, local9) + "," + local4.substring(local9);
			}
			if (aByte35 != 3) {
				aBoolean253 = !aBoolean253;
			}
			if (local4.length() > 8) {
				local4 = "@gre@" + local4.substring(0, local4.length() - 8) + " million @whi@(" + local4 + ")";
			} else if (local4.length() > 4) {
				local4 = "@cya@" + local4.substring(0, local4.length() - 4) + "K @whi@(" + local4 + ")";
			}
			return " " + local4;
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("42731, " + arg0 + ", " + 3 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(III)Ljava/lang/String;")
	private static String method688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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
			signlink.reporterror("6612, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)Ljava/lang/String;")
	private static String method700(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("75096, " + arg0 + ", " + 7 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "M", descriptor = "(I)V")
	private static void method712(@OriginalArg(0) int arg0) {
		try {
			Class40.aBoolean193 = true;
			Class1_Sub1_Sub3_Sub4.aBoolean203 = true;
			if (arg0 != 0) {
				aBoolean241 = !aBoolean241;
			}
			aBoolean247 = true;
			Class9.aBoolean59 = true;
			Class38.aBoolean173 = true;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("71756, " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)V")
	private void method582(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
	private void method583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (this.anInt947 != 9177) {
				this.aClass7ArrayArrayArray1 = null;
			}
			if (arg4 >= 1 && arg2 >= 1 && arg4 <= 102 && arg2 <= 102) {
				if (aBoolean247 && arg0 != this.anInt961) {
					return;
				}
				@Pc(27) int local27 = 0;
				if (arg6 == 0) {
					local27 = this.aClass40_1.method482(arg0, arg4, arg2);
				}
				if (arg6 == 1) {
					local27 = this.aClass40_1.method483(arg2, arg0, arg4);
				}
				if (arg6 == 2) {
					local27 = this.aClass40_1.method484(arg0, arg4, arg2);
				}
				if (arg6 == 3) {
					local27 = this.aClass40_1.method485(arg0, arg4, arg2);
				}
				@Pc(83) int local83;
				if (local27 != 0) {
					local83 = this.aClass40_1.method486(arg0, arg4, arg2, local27);
					@Pc(89) int local89 = local27 >> 14 & 0x7FFF;
					@Pc(93) int local93 = local83 & 0x1F;
					@Pc(97) int local97 = local83 >> 6;
					@Pc(109) Class38 local109;
					if (arg6 == 0) {
						this.aClass40_1.method473(arg0, arg2, arg4);
						local109 = Class38.method442(local89);
						if (local109.aBoolean178) {
							this.aClass18Array1[arg0].method261(local109.aBoolean176, local93, local97, arg4, arg2);
						}
					}
					if (arg6 == 1) {
						this.aClass40_1.method474(arg2, arg0, arg4);
					}
					if (arg6 == 2) {
						this.aClass40_1.method475(arg4, arg0, arg2);
						local109 = Class38.method442(local89);
						if (arg4 + local109.anInt664 > 103 || arg2 + local109.anInt664 > 103 || arg4 + local109.anInt647 > 103 || arg2 + local109.anInt647 > 103) {
							return;
						}
						if (local109.aBoolean178) {
							this.aClass18Array1[arg0].method262(local109.anInt664, local109.aBoolean176, local97, arg4, arg2, local109.anInt647);
						}
					}
					if (arg6 == 3) {
						this.aClass40_1.method476(arg2, arg4, arg0);
						local109 = Class38.method442(local89);
						if (local109.aBoolean178 && local109.aBoolean175) {
							this.aClass18Array1[arg0].method264(arg4, arg2);
						}
					}
				}
				if (arg1 >= 0) {
					local83 = arg0;
					if (arg0 < 3 && (this.aByteArrayArrayArray8[1][arg4][arg2] & 0x2) == 2) {
						local83 = arg0 + 1;
					}
					Class9.method160(arg5, arg1, this.anIntArrayArrayArray8, arg2, arg4, arg0, local83, this.aClass18Array1[arg0], arg3, this.aClass40_1);
					return;
				}
			}
		} catch (@Pc(256) RuntimeException local256) {
			signlink.reporterror("11079, " + arg0 + ", " + arg1 + ", " + 9177 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local256.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method584() {
		try {
			signlink.aBoolean271 = false;
			signlink.anInt1088 = 0;
			signlink.midi = "stop";
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("94972, " + 81 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!IFXJSFHR;I)V")
	private void method585(@OriginalArg(0) Class1_Sub3 arg0) {
		try {
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = -1;
			@Pc(9) int local9 = 0;
			@Pc(11) int local11 = 0;
			if (arg0.anInt380 == 0) {
				local5 = this.aClass40_1.method482(arg0.anInt379, arg0.anInt381, arg0.anInt382);
			}
			if (arg0.anInt380 == 1) {
				local5 = this.aClass40_1.method483(arg0.anInt382, arg0.anInt379, arg0.anInt381);
			}
			if (arg0.anInt380 == 2) {
				local5 = this.aClass40_1.method484(arg0.anInt379, arg0.anInt381, arg0.anInt382);
			}
			if (arg0.anInt380 == 3) {
				local5 = this.aClass40_1.method485(arg0.anInt379, arg0.anInt381, arg0.anInt382);
			}
			if (local5 != 0) {
				@Pc(80) int local80 = this.aClass40_1.method486(arg0.anInt379, arg0.anInt381, arg0.anInt382, local5);
				local7 = local5 >> 14 & 0x7FFF;
				local9 = local80 & 0x1F;
				local11 = local80 >> 6;
			}
			arg0.anInt376 = local7;
			arg0.anInt378 = local9;
			arg0.anInt377 = local11;
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("56941, " + arg0 + ", " + 41195 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method586(@OriginalArg(1) int arg0) {
		try {
			if (arg0 >= 0) {
				if (this.anInt925 != 0) {
					this.anInt925 = 0;
					this.aBoolean232 = true;
				}
				@Pc(22) int local22 = this.anIntArray248[arg0];
				@Pc(27) int local27 = this.anIntArray249[arg0];
				@Pc(32) int local32 = this.anIntArray250[arg0];
				@Pc(37) int local37 = this.anIntArray251[arg0];
				if (local32 >= 2000) {
					local32 -= 2000;
				}
				if (local32 == 534) {
					this.aClass1_Sub1_Sub2_8.method48(176);
					this.aClass1_Sub1_Sub2_8.method50(local27);
					this.aClass1_Sub1_Sub2_8.method50(local37);
					this.aClass1_Sub1_Sub2_8.method83(local22);
					this.anInt1058 = 0;
					this.anInt1059 = local27;
					this.anInt1060 = local22;
					this.anInt1061 = 2;
					if (Class32.aClass32Array1[local27].anInt592 == this.anInt1053) {
						this.anInt1061 = 1;
					}
					if (Class32.aClass32Array1[local27].anInt592 == this.anInt1065) {
						this.anInt1061 = 3;
					}
				}
				if (local32 == 500) {
					this.aClass1_Sub1_Sub2_8.method48(198);
					this.aClass1_Sub1_Sub2_8.method84(local37);
					this.aClass1_Sub1_Sub2_8.method85(local22, 599);
					this.aClass1_Sub1_Sub2_8.method84(local27);
					this.anInt1058 = 0;
					this.anInt1059 = local27;
					this.anInt1060 = local22;
					this.anInt1061 = 2;
					if (Class32.aClass32Array1[local27].anInt592 == this.anInt1053) {
						this.anInt1061 = 1;
					}
					if (Class32.aClass32Array1[local27].anInt592 == this.anInt1065) {
						this.anInt1061 = 3;
					}
				}
				@Pc(174) boolean local174;
				if (local32 == 343) {
					local174 = this.method691(local22, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray48[0], 0, 0, local27, 2, 0, false, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray49[0], this.anInt892);
					if (!local174) {
						this.method691(local22, 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray48[0], 0, 0, local27, 2, 1, false, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray49[0], this.anInt892);
					}
					this.anInt962 = super.anInt858;
					this.anInt963 = super.anInt859;
					this.anInt965 = 2;
					this.anInt964 = 0;
					this.aClass1_Sub1_Sub2_8.method48(106);
					this.aClass1_Sub1_Sub2_8.method84(local37);
					this.aClass1_Sub1_Sub2_8.method85(local27 + this.anInt1038, 599);
					this.aClass1_Sub1_Sub2_8.method83(local22 + this.anInt1037);
					this.aClass1_Sub1_Sub2_8.method85(this.anInt951, 599);
					this.aClass1_Sub1_Sub2_8.method84(this.anInt952);
					this.aClass1_Sub1_Sub2_8.method84(this.anInt953);
				}
				@Pc(264) Class1_Sub1_Sub1_Sub1_Sub1 local264;
				if (local32 == 31) {
					local264 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local37];
					if (local264 != null) {
						this.method691(local264.anIntArray48[0], 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray48[0], 0, 0, local264.anIntArray49[0], 2, 1, false, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray49[0], this.anInt892);
						this.anInt962 = super.anInt858;
						this.anInt963 = super.anInt859;
						this.anInt965 = 2;
						this.anInt964 = 0;
						this.aClass1_Sub1_Sub2_8.method48(7);
						this.aClass1_Sub1_Sub2_8.method83(this.anInt943);
						this.aClass1_Sub1_Sub2_8.method83(local37);
					}
				}
				if (local32 == 751) {
					this.aClass1_Sub1_Sub2_8.method48(133);
					this.aClass1_Sub1_Sub2_8.method83(this.anInt951);
					this.aClass1_Sub1_Sub2_8.method85(this.anInt953, 599);
					this.aClass1_Sub1_Sub2_8.method84(local22);
					this.aClass1_Sub1_Sub2_8.method83(this.anInt952);
					this.aClass1_Sub1_Sub2_8.method84(local27);
					this.aClass1_Sub1_Sub2_8.method85(local37, 599);
					this.anInt1058 = 0;
					this.anInt1059 = local27;
					this.anInt1060 = local22;
					this.anInt1061 = 2;
					if (Class32.aClass32Array1[local27].anInt592 == this.anInt1053) {
						this.anInt1061 = 1;
					}
					if (Class32.aClass32Array1[local27].anInt592 == this.anInt1065) {
						this.anInt1061 = 3;
					}
				}
				@Pc(405) Class1_Sub1_Sub1_Sub1_Sub2 local405;
				if (local32 == 137) {
					local405 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local37];
					if (local405 != null) {
						this.method691(local405.anIntArray48[0], 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray48[0], 0, 0, local405.anIntArray49[0], 2, 1, false, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray49[0], this.anInt892);
						this.anInt962 = super.anInt858;
						this.anInt963 = super.anInt859;
						this.anInt965 = 2;
						this.anInt964 = 0;
						this.aClass1_Sub1_Sub2_8.method48(39);
						this.aClass1_Sub1_Sub2_8.method84(local37);
					}
				}
				if (local32 == 694) {
					this.aClass1_Sub1_Sub2_8.method48(148);
					this.aClass1_Sub1_Sub2_8.method50(local27);
					this.aClass1_Sub1_Sub2_8.method83(local22);
					this.aClass1_Sub1_Sub2_8.method50(local37);
					this.anInt1058 = 0;
					this.anInt1059 = local27;
					this.anInt1060 = local22;
					this.anInt1061 = 2;
					if (Class32.aClass32Array1[local27].anInt592 == this.anInt1053) {
						this.anInt1061 = 1;
					}
					if (Class32.aClass32Array1[local27].anInt592 == this.anInt1065) {
						this.anInt1061 = 3;
					}
				}
				if (local32 == 390) {
					local405 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local37];
					if (local405 != null) {
						this.method691(local405.anIntArray48[0], 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray48[0], 0, 0, local405.anIntArray49[0], 2, 1, false, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray49[0], this.anInt892);
						this.anInt962 = super.anInt858;
						this.anInt963 = super.anInt859;
						this.anInt965 = 2;
						this.anInt964 = 0;
						this.aClass1_Sub1_Sub2_8.method48(25);
						this.aClass1_Sub1_Sub2_8.method50(local37);
					}
				}
				if (local32 == 800) {
					local264 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local37];
					if (local264 != null) {
						this.method691(local264.anIntArray48[0], 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray48[0], 0, 0, local264.anIntArray49[0], 2, 1, false, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray49[0], this.anInt892);
						this.anInt962 = super.anInt858;
						this.anInt963 = super.anInt859;
						this.anInt965 = 2;
						this.anInt964 = 0;
						this.aClass1_Sub1_Sub2_8.method48(242);
						this.aClass1_Sub1_Sub2_8.method50(local37);
					}
				}
				if (local32 == 248) {
					local174 = this.method691(local22, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray48[0], 0, 0, local27, 2, 0, false, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray49[0], this.anInt892);
					if (!local174) {
						this.method691(local22, 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray48[0], 0, 0, local27, 2, 1, false, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray49[0], this.anInt892);
					}
					this.anInt962 = super.anInt858;
					this.anInt963 = super.anInt859;
					this.anInt965 = 2;
					this.anInt964 = 0;
					this.aClass1_Sub1_Sub2_8.method48(119);
					this.aClass1_Sub1_Sub2_8.method83(local27 + this.anInt1038);
					this.aClass1_Sub1_Sub2_8.method85(local22 + this.anInt1037, 599);
					this.aClass1_Sub1_Sub2_8.method83(local37);
				}
				if (local32 == 184) {
					local405 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local37];
					if (local405 != null) {
						this.method691(local405.anIntArray48[0], 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray48[0], 0, 0, local405.anIntArray49[0], 2, 1, false, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray49[0], this.anInt892);
						this.anInt962 = super.anInt858;
						this.anInt963 = super.anInt859;
						this.anInt965 = 2;
						this.anInt964 = 0;
						anInt1078 += local37;
						if (anInt1078 >= 88) {
							this.aClass1_Sub1_Sub2_8.method48(91);
							this.aClass1_Sub1_Sub2_8.method52(12777488);
							anInt1078 = 0;
						}
						this.aClass1_Sub1_Sub2_8.method48(126);
						this.aClass1_Sub1_Sub2_8.method84(local37);
					}
				}
				@Pc(834) String local834;
				if (local32 == 1561) {
					local264 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local37];
					if (local264 != null) {
						@Pc(816) Class31 local816 = local264.aClass31_1;
						if (local816.anIntArray133 != null) {
							local816 = local816.method402();
						}
						if (local816 != null) {
							if (local816.aByteArray15 == null) {
								local834 = "It's a " + local816.aString8 + ".";
							} else {
								local834 = new String(local816.aByteArray15);
							}
							this.method624(local834, "", 0);
						}
					}
				}
				if (local32 == 766) {
					this.aClass1_Sub1_Sub2_8.method48(44);
					this.aClass1_Sub1_Sub2_8.method50(local37);
					this.aClass1_Sub1_Sub2_8.method83(local22);
					this.aClass1_Sub1_Sub2_8.method84(local27);
					this.anInt1058 = 0;
					this.anInt1059 = local27;
					this.anInt1060 = local22;
					this.anInt1061 = 2;
					if (Class32.aClass32Array1[local27].anInt592 == this.anInt1053) {
						this.anInt1061 = 1;
					}
					if (Class32.aClass32Array1[local27].anInt592 == this.anInt1065) {
						this.anInt1061 = 3;
					}
				}
				@Pc(941) int local941;
				@Pc(923) Class32 local923;
				if (local32 == 293) {
					this.aClass1_Sub1_Sub2_8.method48(200);
					this.aClass1_Sub1_Sub2_8.method50(local27);
					local923 = Class32.aClass32Array1[local27];
					if (local923.anIntArrayArray14 != null && local923.anIntArrayArray14[0][0] == 5) {
						local941 = local923.anIntArrayArray14[0][1];
						this.anIntArray243[local941] = 1 - this.anIntArray243[local941];
						this.method701(local941);
						this.aBoolean223 = true;
					}
				}
				if (local32 == 668) {
					local264 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local37];
					if (local264 != null) {
						this.method691(local264.anIntArray48[0], 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray48[0], 0, 0, local264.anIntArray49[0], 2, 1, false, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray49[0], this.anInt892);
						this.anInt962 = super.anInt858;
						this.anInt963 = super.anInt859;
						this.anInt965 = 2;
						this.anInt964 = 0;
						this.aClass1_Sub1_Sub2_8.method48(76);
						this.aClass1_Sub1_Sub2_8.method50(local37);
					}
				}
				if (local32 == 401) {
					local174 = this.method691(local22, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray48[0], 0, 0, local27, 2, 0, false, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray49[0], this.anInt892);
					if (!local174) {
						this.method691(local22, 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray48[0], 0, 0, local27, 2, 1, false, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray49[0], this.anInt892);
					}
					this.anInt962 = super.anInt858;
					this.anInt963 = super.anInt859;
					this.anInt965 = 2;
					this.anInt964 = 0;
					this.aClass1_Sub1_Sub2_8.method48(83);
					this.aClass1_Sub1_Sub2_8.method84(local27 + this.anInt1038);
					this.aClass1_Sub1_Sub2_8.method50(local22 + this.anInt1037);
					this.aClass1_Sub1_Sub2_8.method83(local37);
				}
				if (local32 == 233) {
					this.aClass1_Sub1_Sub2_8.method48(102);
					this.aClass1_Sub1_Sub2_8.method50(local27);
					this.aClass1_Sub1_Sub2_8.method85(local37, 599);
					this.aClass1_Sub1_Sub2_8.method85(local22, 599);
					this.aClass1_Sub1_Sub2_8.method83(this.anInt943);
					this.anInt1058 = 0;
					this.anInt1059 = local27;
					this.anInt1060 = local22;
					this.anInt1061 = 2;
					if (Class32.aClass32Array1[local27].anInt592 == this.anInt1053) {
						this.anInt1061 = 1;
					}
					if (Class32.aClass32Array1[local27].anInt592 == this.anInt1065) {
						this.anInt1061 = 3;
					}
				}
				if (local32 == 220) {
					local264 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local37];
					if (local264 != null) {
						this.method691(local264.anIntArray48[0], 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray48[0], 0, 0, local264.anIntArray49[0], 2, 1, false, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray49[0], this.anInt892);
						this.anInt962 = super.anInt858;
						this.anInt963 = super.anInt859;
						this.anInt965 = 2;
						this.anInt964 = 0;
						anInt987 += local37;
						if (anInt987 >= 92) {
							this.aClass1_Sub1_Sub2_8.method48(161);
							this.aClass1_Sub1_Sub2_8.method50(64442);
							anInt987 = 0;
						}
						this.aClass1_Sub1_Sub2_8.method48(183);
						this.aClass1_Sub1_Sub2_8.method84(local37);
					}
				}
				if (local32 == 406) {
					this.aClass1_Sub1_Sub2_8.method48(27);
					this.aClass1_Sub1_Sub2_8.method50(local27);
					this.aClass1_Sub1_Sub2_8.method83(local37);
					this.aClass1_Sub1_Sub2_8.method50(local22);
					this.anInt1058 = 0;
					this.anInt1059 = local27;
					this.anInt1060 = local22;
					this.anInt1061 = 2;
					if (Class32.aClass32Array1[local27].anInt592 == this.anInt1053) {
						this.anInt1061 = 1;
					}
					if (Class32.aClass32Array1[local27].anInt592 == this.anInt1065) {
						this.anInt1061 = 3;
					}
				}
				@Pc(1326) String local1326;
				if (local32 == 542) {
					local923 = Class32.aClass32Array1[local27];
					this.anInt942 = 1;
					this.anInt943 = local27;
					this.anInt944 = local923.anInt608;
					this.anInt950 = 0;
					this.aBoolean223 = true;
					local1326 = local923.aString12;
					if (local1326.indexOf(" ") != -1) {
						local1326 = local1326.substring(0, local1326.indexOf(" "));
					}
					local834 = local923.aString12;
					if (local834.indexOf(" ") != -1) {
						local834 = local834.substring(local834.indexOf(" ") + 1);
					}
					this.aString23 = local1326 + " " + local923.aString11 + " " + local834;
					if (this.anInt944 == 16) {
						this.aBoolean223 = true;
						this.anInt866 = 3;
						this.aBoolean256 = true;
					}
				} else if (local32 == 34) {
					this.anInt950 = 1;
					this.anInt951 = local22;
					this.anInt952 = local27;
					this.anInt953 = local37;
					this.aString25 = Class23.method286(local37).aString6;
					this.anInt942 = 0;
					this.aBoolean223 = true;
				} else {
					if (local32 == 1741) {
						@Pc(1421) int local1421 = local37 >> 14 & 0x7FFF;
						@Pc(1424) Class38 local1424 = Class38.method442(local1421);
						if (local1424.aByteArray18 == null) {
							local834 = "It's a " + local1424.aString15 + ".";
						} else {
							local834 = new String(local1424.aByteArray18);
						}
						this.method624(local834, "", 0);
					}
					if (local32 == 921) {
						this.method694(local27, local22, local37);
						this.aClass1_Sub1_Sub2_8.method48(246);
						this.aClass1_Sub1_Sub2_8.method84(local37 >> 14 & 0x7FFF);
						this.aClass1_Sub1_Sub2_8.method84(local22 + this.anInt1037);
						this.aClass1_Sub1_Sub2_8.method84(local27 + this.anInt1038);
					}
					if (local32 == 277) {
						this.method694(local27, local22, local37);
						this.aClass1_Sub1_Sub2_8.method48(4);
						this.aClass1_Sub1_Sub2_8.method84(local27 + this.anInt1038);
						this.aClass1_Sub1_Sub2_8.method84(local22 + this.anInt1037);
						this.aClass1_Sub1_Sub2_8.method83(local37 >> 14 & 0x7FFF);
					}
					if (local32 == 635) {
						this.method678();
					}
					if (local32 == 754) {
						this.aClass1_Sub1_Sub2_8.method48(200);
						this.aClass1_Sub1_Sub2_8.method50(local27);
						local923 = Class32.aClass32Array1[local27];
						if (local923.anIntArrayArray14 != null && local923.anIntArrayArray14[0][0] == 5) {
							local941 = local923.anIntArrayArray14[0][1];
							if (this.anIntArray243[local941] != local923.anIntArray146[0]) {
								this.anIntArray243[local941] = local923.anIntArray146[0];
								this.method701(local941);
								this.aBoolean223 = true;
							}
						}
					}
					if (local32 == 189) {
						if (this.aBoolean259) {
							this.aClass40_1.method494(local27 - 4, local22 - 4);
						} else {
							this.aClass40_1.method494(super.anInt859 - 4, super.anInt858 - 4);
						}
					}
					@Pc(1632) Class23 local1632;
					if (local32 == 1491) {
						local1632 = Class23.method286(local37);
						if (local1632.aByteArray9 == null) {
							local1326 = "It's a " + local1632.aString6 + ".";
						} else {
							local1326 = new String(local1632.aByteArray9);
						}
						this.method624(local1326, "", 0);
					}
					if (local32 == 803) {
						local264 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local37];
						if (local264 != null) {
							this.method691(local264.anIntArray48[0], 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray48[0], 0, 0, local264.anIntArray49[0], 2, 1, false, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray49[0], this.anInt892);
							this.anInt962 = super.anInt858;
							this.anInt963 = super.anInt859;
							this.anInt965 = 2;
							this.anInt964 = 0;
							this.aClass1_Sub1_Sub2_8.method48(164);
							this.aClass1_Sub1_Sub2_8.method85(local37, 599);
						}
					}
					if (local32 == 4) {
						local174 = this.method691(local22, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray48[0], 0, 0, local27, 2, 0, false, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray49[0], this.anInt892);
						if (!local174) {
							this.method691(local22, 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray48[0], 0, 0, local27, 2, 1, false, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray49[0], this.anInt892);
						}
						this.anInt962 = super.anInt858;
						this.anInt963 = super.anInt859;
						this.anInt965 = 2;
						this.anInt964 = 0;
						this.aClass1_Sub1_Sub2_8.method48(235);
						this.aClass1_Sub1_Sub2_8.method83(local27 + this.anInt1038);
						this.aClass1_Sub1_Sub2_8.method50(local37);
						this.aClass1_Sub1_Sub2_8.method84(this.anInt943);
						this.aClass1_Sub1_Sub2_8.method84(local22 + this.anInt1037);
					}
					if (local32 == 1881) {
						local1632 = Class23.method286(local37);
						@Pc(1826) Class32 local1826 = Class32.aClass32Array1[local27];
						if (local1826 != null && local1826.anIntArray145[local22] >= 100000) {
							local1326 = local1826.anIntArray145[local22] + " x " + local1632.aString6;
						} else if (local1632.aByteArray9 == null) {
							local1326 = "It's a " + local1632.aString6 + ".";
						} else {
							local1326 = new String(local1632.aByteArray9);
						}
						this.method624(local1326, "", 0);
					}
					if (local32 == 371) {
						local405 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local37];
						if (local405 != null) {
							this.method691(local405.anIntArray48[0], 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray48[0], 0, 0, local405.anIntArray49[0], 2, 1, false, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray49[0], this.anInt892);
							this.anInt962 = super.anInt858;
							this.anInt963 = super.anInt859;
							this.anInt965 = 2;
							this.anInt964 = 0;
							this.aClass1_Sub1_Sub2_8.method48(201);
							this.aClass1_Sub1_Sub2_8.method83(local37);
						}
					}
					if (local32 == 995) {
						local405 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local37];
						if (local405 != null) {
							this.method691(local405.anIntArray48[0], 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray48[0], 0, 0, local405.anIntArray49[0], 2, 1, false, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray49[0], this.anInt892);
							this.anInt962 = super.anInt858;
							this.anInt963 = super.anInt859;
							this.anInt965 = 2;
							this.anInt964 = 0;
							this.aClass1_Sub1_Sub2_8.method48(16);
							this.aClass1_Sub1_Sub2_8.method83(this.anInt951);
							this.aClass1_Sub1_Sub2_8.method85(this.anInt953, 599);
							this.aClass1_Sub1_Sub2_8.method85(this.anInt952, 599);
							this.aClass1_Sub1_Sub2_8.method84(local37);
						}
					}
					if (local32 == 604) {
						local174 = this.method691(local22, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray48[0], 0, 0, local27, 2, 0, false, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray49[0], this.anInt892);
						if (!local174) {
							this.method691(local22, 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray48[0], 0, 0, local27, 2, 1, false, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray49[0], this.anInt892);
						}
						this.anInt962 = super.anInt858;
						this.anInt963 = super.anInt859;
						this.anInt965 = 2;
						this.anInt964 = 0;
						this.aClass1_Sub1_Sub2_8.method48(63);
						this.aClass1_Sub1_Sub2_8.method84(local37);
						this.aClass1_Sub1_Sub2_8.method50(local22 + this.anInt1037);
						this.aClass1_Sub1_Sub2_8.method84(local27 + this.anInt1038);
					}
					if (local32 == 82) {
						local923 = Class32.aClass32Array1[local27];
						@Pc(2118) boolean local2118 = true;
						if (local923.anInt607 > 0) {
							local2118 = this.method653(local923);
						}
						if (local2118) {
							this.aClass1_Sub1_Sub2_8.method48(200);
							this.aClass1_Sub1_Sub2_8.method50(local27);
						}
					}
					if (local32 == 615) {
						this.aClass1_Sub1_Sub2_8.method48(193);
						this.aClass1_Sub1_Sub2_8.method85(local37, 599);
						this.aClass1_Sub1_Sub2_8.method84(local27);
						this.aClass1_Sub1_Sub2_8.method84(local22);
						this.anInt1058 = 0;
						this.anInt1059 = local27;
						this.anInt1060 = local22;
						this.anInt1061 = 2;
						if (Class32.aClass32Array1[local27].anInt592 == this.anInt1053) {
							this.anInt1061 = 1;
						}
						if (Class32.aClass32Array1[local27].anInt592 == this.anInt1065) {
							this.anInt1061 = 3;
						}
					}
					if (local32 == 63) {
						local174 = this.method691(local22, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray48[0], 0, 0, local27, 2, 0, false, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray49[0], this.anInt892);
						if (!local174) {
							this.method691(local22, 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray48[0], 0, 0, local27, 2, 1, false, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray49[0], this.anInt892);
						}
						this.anInt962 = super.anInt858;
						this.anInt963 = super.anInt859;
						this.anInt965 = 2;
						this.anInt964 = 0;
						this.aClass1_Sub1_Sub2_8.method48(90);
						this.aClass1_Sub1_Sub2_8.method83(local22 + this.anInt1037);
						this.aClass1_Sub1_Sub2_8.method83(local27 + this.anInt1038);
						this.aClass1_Sub1_Sub2_8.method84(local37);
					}
					if (local32 == 860) {
						if ((this.anInt1037 & 0x3) == 0) {
							anInt990++;
						}
						if (anInt990 >= 93) {
							this.aClass1_Sub1_Sub2_8.method48(204);
							this.aClass1_Sub1_Sub2_8.method52(160113);
							anInt990 = 0;
						}
						this.method694(local27, local22, local37);
						this.aClass1_Sub1_Sub2_8.method48(169);
						this.aClass1_Sub1_Sub2_8.method85(local27 + this.anInt1038, 599);
						this.aClass1_Sub1_Sub2_8.method83(local22 + this.anInt1037);
						this.aClass1_Sub1_Sub2_8.method85(local37 >> 14 & 0x7FFF, 599);
					}
					if (local32 == 71 && !this.aBoolean257) {
						this.aClass1_Sub1_Sub2_8.method48(236);
						this.aClass1_Sub1_Sub2_8.method50(local27);
						this.aBoolean257 = true;
					}
					if (local32 == 263) {
						this.aClass1_Sub1_Sub2_8.method48(105);
						this.aClass1_Sub1_Sub2_8.method50(local27);
						this.aClass1_Sub1_Sub2_8.method85(local22, 599);
						this.aClass1_Sub1_Sub2_8.method50(local37);
						this.anInt1058 = 0;
						this.anInt1059 = local27;
						this.anInt1060 = local22;
						this.anInt1061 = 2;
						if (Class32.aClass32Array1[local27].anInt592 == this.anInt1053) {
							this.anInt1061 = 1;
						}
						if (Class32.aClass32Array1[local27].anInt592 == this.anInt1065) {
							this.anInt1061 = 3;
						}
					}
					if (local32 == 255) {
						local264 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local37];
						if (local264 != null) {
							this.method691(local264.anIntArray48[0], 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray48[0], 0, 0, local264.anIntArray49[0], 2, 1, false, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray49[0], this.anInt892);
							this.anInt962 = super.anInt858;
							this.anInt963 = super.anInt859;
							this.anInt965 = 2;
							this.anInt964 = 0;
							this.aClass1_Sub1_Sub2_8.method48(47);
							this.aClass1_Sub1_Sub2_8.method85(local37, 599);
						}
					}
					@Pc(2502) int local2502;
					@Pc(2500) long local2500;
					@Pc(2485) String local2485;
					if (local32 == 382) {
						local2485 = this.aStringArray12[arg0];
						local941 = local2485.indexOf("@whi@");
						if (local941 != -1) {
							local2500 = Class49.method563(local2485.substring(local941 + 5).trim());
							local2502 = -1;
							for (@Pc(2504) int local2504 = 0; local2504 < this.anInt1000; local2504++) {
								if (this.aLongArray4[local2504] == local2500) {
									local2502 = local2504;
									break;
								}
							}
							if (local2502 != -1 && this.anIntArray225[local2502] > 0) {
								this.aBoolean232 = true;
								this.anInt925 = 0;
								this.aBoolean225 = true;
								this.aString30 = "";
								this.anInt926 = 3;
								this.aLong33 = this.aLongArray4[local2502];
								this.aString17 = "Enter message to send to " + this.aStringArray10[local2502];
							}
						}
					}
					if (local32 == 279) {
						local174 = this.method691(local22, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray48[0], 0, 0, local27, 2, 0, false, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray49[0], this.anInt892);
						if (!local174) {
							this.method691(local22, 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray48[0], 0, 0, local27, 2, 1, false, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray49[0], this.anInt892);
						}
						this.anInt962 = super.anInt858;
						this.anInt963 = super.anInt859;
						this.anInt965 = 2;
						this.anInt964 = 0;
						this.aClass1_Sub1_Sub2_8.method48(220);
						this.aClass1_Sub1_Sub2_8.method85(local22 + this.anInt1037, 599);
						this.aClass1_Sub1_Sub2_8.method84(local37);
						this.aClass1_Sub1_Sub2_8.method85(local27 + this.anInt1038, 599);
					}
					if (local32 == 475) {
						local405 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local37];
						if (local405 != null) {
							this.method691(local405.anIntArray48[0], 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray48[0], 0, 0, local405.anIntArray49[0], 2, 1, false, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray49[0], this.anInt892);
							this.anInt962 = super.anInt858;
							this.anInt963 = super.anInt859;
							this.anInt965 = 2;
							this.anInt964 = 0;
							this.aClass1_Sub1_Sub2_8.method48(115);
							this.aClass1_Sub1_Sub2_8.method84(local37);
							this.aClass1_Sub1_Sub2_8.method85(this.anInt943, 599);
						}
					}
					if (local32 == 28 && this.method694(local27, local22, local37)) {
						this.aClass1_Sub1_Sub2_8.method48(167);
						this.aClass1_Sub1_Sub2_8.method85(local27 + this.anInt1038, 599);
						this.aClass1_Sub1_Sub2_8.method83(local37 >> 14 & 0x7FFF);
						this.aClass1_Sub1_Sub2_8.method50(this.anInt952);
						this.aClass1_Sub1_Sub2_8.method83(local22 + this.anInt1037);
						this.aClass1_Sub1_Sub2_8.method84(this.anInt953);
						this.aClass1_Sub1_Sub2_8.method83(this.anInt951);
					}
					if (local32 == 917 || local32 == 235) {
						local2485 = this.aStringArray12[arg0];
						local941 = local2485.indexOf("@whi@");
						if (local941 != -1) {
							local2485 = local2485.substring(local941 + 5).trim();
							local834 = Class49.method567(Class49.method564(Class49.method563(local2485)));
							@Pc(2811) boolean local2811 = false;
							for (local2502 = 0; local2502 < this.anInt871; local2502++) {
								@Pc(2823) Class1_Sub1_Sub1_Sub1_Sub2 local2823 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray213[local2502]];
								if (local2823 != null && local2823.aString5 != null && local2823.aString5.equalsIgnoreCase(local834)) {
									this.method691(local2823.anIntArray48[0], 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray48[0], 0, 0, local2823.anIntArray49[0], 2, 1, false, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray49[0], this.anInt892);
									if (local32 == 917) {
										this.aClass1_Sub1_Sub2_8.method48(39);
										this.aClass1_Sub1_Sub2_8.method84(this.anIntArray213[local2502]);
									}
									if (local32 == 235) {
										this.aClass1_Sub1_Sub2_8.method48(201);
										this.aClass1_Sub1_Sub2_8.method83(this.anIntArray213[local2502]);
									}
									local2811 = true;
									break;
								}
							}
							if (!local2811) {
								this.method624("Unable to find " + local834, "", 0);
							}
						}
					}
					if (local32 == 471) {
						this.aClass1_Sub1_Sub2_8.method48(226);
						this.aClass1_Sub1_Sub2_8.method83(local22);
						this.aClass1_Sub1_Sub2_8.method84(local37);
						this.aClass1_Sub1_Sub2_8.method84(local27);
						this.anInt1058 = 0;
						this.anInt1059 = local27;
						this.anInt1060 = local22;
						this.anInt1061 = 2;
						if (Class32.aClass32Array1[local27].anInt592 == this.anInt1053) {
							this.anInt1061 = 1;
						}
						if (Class32.aClass32Array1[local27].anInt592 == this.anInt1065) {
							this.anInt1061 = 3;
						}
					}
					if (local32 == 1485) {
						anInt911++;
						if (anInt911 >= 136) {
							this.aClass1_Sub1_Sub2_8.method48(103);
							this.aClass1_Sub1_Sub2_8.method49(183);
							anInt911 = 0;
						}
						this.method694(local27, local22, local37);
						this.aClass1_Sub1_Sub2_8.method48(36);
						this.aClass1_Sub1_Sub2_8.method84(local22 + this.anInt1037);
						this.aClass1_Sub1_Sub2_8.method84(local27 + this.anInt1038);
						this.aClass1_Sub1_Sub2_8.method84(local37 >> 14 & 0x7FFF);
					}
					if (local32 == 101) {
						local405 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local37];
						if (local405 != null) {
							this.method691(local405.anIntArray48[0], 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray48[0], 0, 0, local405.anIntArray49[0], 2, 1, false, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray49[0], this.anInt892);
							this.anInt962 = super.anInt858;
							this.anInt963 = super.anInt859;
							this.anInt965 = 2;
							this.anInt964 = 0;
							this.aClass1_Sub1_Sub2_8.method48(12);
							this.aClass1_Sub1_Sub2_8.method50(local37);
						}
					}
					if (local32 == 48) {
						anInt935 += local37;
						if (anInt935 >= 90) {
							this.aClass1_Sub1_Sub2_8.method48(243);
							this.aClass1_Sub1_Sub2_8.method50(8335);
							anInt935 = 0;
						}
						this.aClass1_Sub1_Sub2_8.method48(94);
						this.aClass1_Sub1_Sub2_8.method85(local22, 599);
						this.aClass1_Sub1_Sub2_8.method50(local27);
						this.aClass1_Sub1_Sub2_8.method85(local37, 599);
						this.anInt1058 = 0;
						this.anInt1059 = local27;
						this.anInt1060 = local22;
						this.anInt1061 = 2;
						if (Class32.aClass32Array1[local27].anInt592 == this.anInt1053) {
							this.anInt1061 = 1;
						}
						if (Class32.aClass32Array1[local27].anInt592 == this.anInt1065) {
							this.anInt1061 = 3;
						}
					}
					if (local32 == 693) {
						local264 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local37];
						if (local264 != null) {
							this.method691(local264.anIntArray48[0], 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray48[0], 0, 0, local264.anIntArray49[0], 2, 1, false, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray49[0], this.anInt892);
							this.anInt962 = super.anInt858;
							this.anInt963 = super.anInt859;
							this.anInt965 = 2;
							this.anInt964 = 0;
							this.aClass1_Sub1_Sub2_8.method48(223);
							this.aClass1_Sub1_Sub2_8.method83(this.anInt953);
							this.aClass1_Sub1_Sub2_8.method85(local37, 599);
							this.aClass1_Sub1_Sub2_8.method84(this.anInt951);
							this.aClass1_Sub1_Sub2_8.method83(this.anInt952);
						}
					}
					if (local32 == 50 || local32 == 992 || local32 == 748 || local32 == 806) {
						local2485 = this.aStringArray12[arg0];
						local941 = local2485.indexOf("@whi@");
						if (local941 != -1) {
							local2500 = Class49.method563(local2485.substring(local941 + 5).trim());
							if (local32 == 50) {
								this.method699(local2500);
							}
							if (local32 == 992) {
								this.method621(local2500);
							}
							if (local32 == 748) {
								this.method622(local2500);
							}
							if (local32 == 806) {
								this.method713(local2500);
							}
						}
					}
					if (local32 == 464 && this.method694(local27, local22, local37)) {
						this.aClass1_Sub1_Sub2_8.method48(51);
						this.aClass1_Sub1_Sub2_8.method83(local37 >> 14 & 0x7FFF);
						this.aClass1_Sub1_Sub2_8.method84(local27 + this.anInt1038);
						this.aClass1_Sub1_Sub2_8.method85(local22 + this.anInt1037, 599);
						this.aClass1_Sub1_Sub2_8.method85(this.anInt943, 599);
					}
					if (local32 == 215) {
						this.method694(local27, local22, local37);
						this.aClass1_Sub1_Sub2_8.method48(245);
						this.aClass1_Sub1_Sub2_8.method50(local22 + this.anInt1037);
						this.aClass1_Sub1_Sub2_8.method84(local27 + this.anInt1038);
						this.aClass1_Sub1_Sub2_8.method85(local37 >> 14 & 0x7FFF, 599);
					}
					if (local32 == 853) {
						local2485 = this.aStringArray12[arg0];
						local941 = local2485.indexOf("@whi@");
						if (local941 != -1) {
							if (this.anInt1053 == -1) {
								this.method678();
								this.aString27 = local2485.substring(local941 + 5).trim();
								this.aBoolean251 = false;
								for (@Pc(3422) int local3422 = 0; local3422 < Class32.aClass32Array1.length; local3422++) {
									if (Class32.aClass32Array1[local3422] != null && Class32.aClass32Array1[local3422].anInt607 == 600) {
										this.anInt895 = this.anInt1053 = Class32.aClass32Array1[local3422].anInt592;
										break;
									}
								}
							} else {
								this.method624("Please close the interface you have open before using 'report abuse'", "", 0);
							}
						}
					}
					if (local32 == 607) {
						this.aClass1_Sub1_Sub2_8.method48(233);
						this.aClass1_Sub1_Sub2_8.method84(local27);
						this.aClass1_Sub1_Sub2_8.method84(local37);
						this.aClass1_Sub1_Sub2_8.method85(local22, 599);
						this.anInt1058 = 0;
						this.anInt1059 = local27;
						this.anInt1060 = local22;
						this.anInt1061 = 2;
						if (Class32.aClass32Array1[local27].anInt592 == this.anInt1053) {
							this.anInt1061 = 1;
						}
						if (Class32.aClass32Array1[local27].anInt592 == this.anInt1065) {
							this.anInt1061 = 3;
						}
					}
					this.anInt950 = 0;
					this.anInt942 = 0;
					this.aBoolean223 = true;
				}
			}
		} catch (@Pc(3524) RuntimeException local3524) {
			signlink.reporterror("20548, " + 7 + ", " + arg0 + ", " + local3524.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	private void method587() {
		try {
			@Pc(2) int local2 = this.anInt916;
			@Pc(5) int local5 = this.anInt917;
			@Pc(8) int local8 = this.anInt918;
			@Pc(11) int local11 = this.anInt919;
			Class1_Sub1_Sub3.method514(local2, local5, 6116423, local8, local11);
			Class1_Sub1_Sub3.method514(local2 + 1, local5 + 1, 0, local8 - 2, 16);
			Class1_Sub1_Sub3.method515(local11 - 19, local5 + 18, local2 + 1, 0, local8 - 2);
			this.aClass1_Sub1_Sub3_Sub3_4.method229("Choose Option", local2 + 3, 6116423, 619, local5 + 14);
			@Pc(68) int local68 = super.anInt852;
			@Pc(71) int local71 = super.anInt853;
			if (this.anInt915 == 0) {
				local68 -= 4;
				local71 -= 4;
			}
			if (this.anInt915 == 1) {
				local68 -= 553;
				local71 -= 205;
			}
			if (this.anInt915 == 2) {
				local68 -= 17;
				local71 -= 357;
			}
			for (@Pc(90) int local90 = 0; local90 < this.anInt949; local90++) {
				@Pc(105) int local105 = local5 + (this.anInt949 - 1 - local90) * 15 + 31;
				@Pc(107) int local107 = 16777215;
				if (local68 > local2 && local68 < local2 + local8 && local71 > local105 - 13 && local71 < local105 + 3) {
					local107 = 16776960;
				}
				this.aClass1_Sub1_Sub3_Sub3_4.method233(local107, this.aStringArray12[local90], local2 + 3, true, local105);
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("76364, " + -14011 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method588(@OriginalArg(0) boolean arg0) {
		try {
			if (arg0) {
				this.aClass7ArrayArrayArray1 = null;
			}
			while (true) {
				@Pc(10) int local10;
				do {
					while (true) {
						local10 = this.method573();
						if (local10 == -1) {
							return;
						}
						if (this.anInt1053 != -1 && this.anInt1053 == this.anInt895) {
							if (local10 == 8 && this.aString27.length() > 0) {
								this.aString27 = this.aString27.substring(0, this.aString27.length() - 1);
							}
							break;
						}
						@Pc(190) int local190;
						if (this.aBoolean225) {
							if (local10 >= 32 && local10 <= 122 && this.aString30.length() < 80) {
								this.aString30 = this.aString30 + (char) local10;
								this.aBoolean232 = true;
							}
							if (local10 == 8 && this.aString30.length() > 0) {
								this.aString30 = this.aString30.substring(0, this.aString30.length() - 1);
								this.aBoolean232 = true;
							}
							if (local10 == 13 || local10 == 10) {
								this.aBoolean225 = false;
								this.aBoolean232 = true;
								@Pc(150) long local150;
								if (this.anInt926 == 1) {
									local150 = Class49.method563(this.aString30);
									this.method699(local150);
								}
								if (this.anInt926 == 2 && this.anInt1000 > 0) {
									local150 = Class49.method563(this.aString30);
									this.method622(local150);
								}
								if (this.anInt926 == 3 && this.aString30.length() > 0) {
									this.aClass1_Sub1_Sub2_8.method48(74);
									this.aClass1_Sub1_Sub2_8.method49(0);
									local190 = this.aClass1_Sub1_Sub2_8.anInt153;
									this.aClass1_Sub1_Sub2_8.method55((byte) 9, this.aLong33);
									Class13.method186(this.aString30, (byte) 6, this.aClass1_Sub1_Sub2_8);
									this.aClass1_Sub1_Sub2_8.method58(this.aClass1_Sub1_Sub2_8.anInt153 - local190);
									this.aString30 = Class13.method187(this.aString30);
									this.aString30 = Class30.method347(this.aString30);
									this.method624(this.aString30, Class49.method567(Class49.method564(this.aLong33)), 6);
									if (this.anInt900 == 2) {
										this.anInt900 = 1;
										this.aBoolean269 = true;
										this.aClass1_Sub1_Sub2_8.method48(55);
										this.aClass1_Sub1_Sub2_8.method49(this.anInt1026);
										this.aClass1_Sub1_Sub2_8.method49(this.anInt900);
										this.aClass1_Sub1_Sub2_8.method49(this.anInt893);
									}
								}
								if (this.anInt926 == 4 && this.anInt1004 < 100) {
									local150 = Class49.method563(this.aString30);
									this.method621(local150);
								}
								if (this.anInt926 == 5 && this.anInt1004 > 0) {
									local150 = Class49.method563(this.aString30);
									this.method713(local150);
								}
							}
						} else if (this.anInt925 == 1) {
							if (local10 >= 48 && local10 <= 57 && this.aString19.length() < 10) {
								this.aString19 = this.aString19 + (char) local10;
								this.aBoolean232 = true;
							}
							if (local10 == 8 && this.aString19.length() > 0) {
								this.aString19 = this.aString19.substring(0, this.aString19.length() - 1);
								this.aBoolean232 = true;
							}
							if (local10 == 13 || local10 == 10) {
								if (this.aString19.length() > 0) {
									local190 = 0;
									try {
										local190 = Integer.parseInt(this.aString19);
									} catch (@Pc(367) Exception local367) {
									}
									this.aClass1_Sub1_Sub2_8.method48(116);
									this.aClass1_Sub1_Sub2_8.method53(local190);
								}
								this.anInt925 = 0;
								this.aBoolean232 = true;
							}
						} else if (this.anInt925 == 2) {
							if (local10 >= 32 && local10 <= 122 && this.aString19.length() < 12) {
								this.aString19 = this.aString19 + (char) local10;
								this.aBoolean232 = true;
							}
							if (local10 == 8 && this.aString19.length() > 0) {
								this.aString19 = this.aString19.substring(0, this.aString19.length() - 1);
								this.aBoolean232 = true;
							}
							if (local10 == 13 || local10 == 10) {
								if (this.aString19.length() > 0) {
									this.aClass1_Sub1_Sub2_8.method48(209);
									this.aClass1_Sub1_Sub2_8.method55((byte) 9, Class49.method563(this.aString19));
								}
								this.anInt925 = 0;
								this.aBoolean232 = true;
							}
						} else if (this.anInt1065 == -1) {
							if (local10 >= 32 && local10 <= 122 && this.aString26.length() < 80) {
								this.aString26 = this.aString26 + (char) local10;
								this.aBoolean232 = true;
							}
							if (local10 == 8 && this.aString26.length() > 0) {
								this.aString26 = this.aString26.substring(0, this.aString26.length() - 1);
								this.aBoolean232 = true;
							}
							if ((local10 == 13 || local10 == 10) && this.aString26.length() > 0) {
								if (this.anInt981 == 2) {
									if (this.aString26.equals("::clientdrop")) {
										this.method594();
									}
									if (this.aString26.equals("::lag")) {
										this.method651();
									}
									if (this.aString26.equals("::prefetchmusic")) {
										for (local190 = 0; local190 < this.aClass20_Sub1_1.method387(2, aBoolean236); local190++) {
											this.aClass20_Sub1_1.method381((byte) 1, 2, local190);
										}
									}
									if (this.aString26.equals("::fpson")) {
										aBoolean228 = true;
									}
									if (this.aString26.equals("::fpsoff")) {
										aBoolean228 = false;
									}
									if (this.aString26.equals("::noclip")) {
										for (local190 = 0; local190 < 4; local190++) {
											for (@Pc(595) int local595 = 1; local595 < 103; local595++) {
												for (@Pc(599) int local599 = 1; local599 < 103; local599++) {
													this.aClass18Array1[local190].anIntArrayArray4[local595][local599] = 0;
												}
											}
										}
									}
								}
								if (this.aString26.startsWith("::")) {
									this.aClass1_Sub1_Sub2_8.method48(221);
									this.aClass1_Sub1_Sub2_8.method49(this.aString26.length() - 1);
									this.aClass1_Sub1_Sub2_8.method56(this.aString26.substring(2));
								} else {
									@Pc(654) String local654 = this.aString26.toLowerCase();
									@Pc(656) byte local656 = 0;
									if (local654.startsWith("yellow:")) {
										local656 = 0;
										this.aString26 = this.aString26.substring(7);
									} else if (local654.startsWith("red:")) {
										local656 = 1;
										this.aString26 = this.aString26.substring(4);
									} else if (local654.startsWith("green:")) {
										local656 = 2;
										this.aString26 = this.aString26.substring(6);
									} else if (local654.startsWith("cyan:")) {
										local656 = 3;
										this.aString26 = this.aString26.substring(5);
									} else if (local654.startsWith("purple:")) {
										local656 = 4;
										this.aString26 = this.aString26.substring(7);
									} else if (local654.startsWith("white:")) {
										local656 = 5;
										this.aString26 = this.aString26.substring(6);
									} else if (local654.startsWith("flash1:")) {
										local656 = 6;
										this.aString26 = this.aString26.substring(7);
									} else if (local654.startsWith("flash2:")) {
										local656 = 7;
										this.aString26 = this.aString26.substring(7);
									} else if (local654.startsWith("flash3:")) {
										local656 = 8;
										this.aString26 = this.aString26.substring(7);
									} else if (local654.startsWith("glow1:")) {
										local656 = 9;
										this.aString26 = this.aString26.substring(6);
									} else if (local654.startsWith("glow2:")) {
										local656 = 10;
										this.aString26 = this.aString26.substring(6);
									} else if (local654.startsWith("glow3:")) {
										local656 = 11;
										this.aString26 = this.aString26.substring(6);
									}
									local654 = this.aString26.toLowerCase();
									@Pc(828) byte local828 = 0;
									if (local654.startsWith("wave:")) {
										local828 = 1;
										this.aString26 = this.aString26.substring(5);
									} else if (local654.startsWith("wave2:")) {
										local828 = 2;
										this.aString26 = this.aString26.substring(6);
									} else if (local654.startsWith("shake:")) {
										local828 = 3;
										this.aString26 = this.aString26.substring(6);
									} else if (local654.startsWith("scroll:")) {
										local828 = 4;
										this.aString26 = this.aString26.substring(7);
									} else if (local654.startsWith("slide:")) {
										local828 = 5;
										this.aString26 = this.aString26.substring(6);
									}
									this.aClass1_Sub1_Sub2_8.method48(92);
									this.aClass1_Sub1_Sub2_8.method49(0);
									@Pc(909) int local909 = this.aClass1_Sub1_Sub2_8.anInt153;
									this.aClass1_Sub1_Sub2_6.anInt153 = 0;
									Class13.method186(this.aString26, (byte) 6, this.aClass1_Sub1_Sub2_6);
									this.aClass1_Sub1_Sub2_8.method95(this.aClass1_Sub1_Sub2_6.anInt153, this.aClass1_Sub1_Sub2_6.aByteArray1);
									this.aClass1_Sub1_Sub2_8.method76(local828);
									this.aClass1_Sub1_Sub2_8.method75(local656);
									this.aClass1_Sub1_Sub2_8.method58(this.aClass1_Sub1_Sub2_8.anInt153 - local909);
									this.aString26 = Class13.method187(this.aString26);
									this.aString26 = Class30.method347(this.aString26);
									aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4 = this.aString26;
									aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt301 = local656;
									aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt294 = local828;
									aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt322 = 150;
									if (this.anInt981 == 2) {
										this.method624(aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4, "@cr2@" + aClass1_Sub1_Sub1_Sub1_Sub2_1.aString5, 2);
									} else if (this.anInt981 == 1) {
										this.method624(aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4, "@cr1@" + aClass1_Sub1_Sub1_Sub1_Sub2_1.aString5, 2);
									} else {
										this.method624(aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4, aClass1_Sub1_Sub1_Sub1_Sub2_1.aString5, 2);
									}
									if (this.anInt1026 == 2) {
										this.anInt1026 = 3;
										this.aBoolean269 = true;
										this.aClass1_Sub1_Sub2_8.method48(55);
										this.aClass1_Sub1_Sub2_8.method49(this.anInt1026);
										this.aClass1_Sub1_Sub2_8.method49(this.anInt900);
										this.aClass1_Sub1_Sub2_8.method49(this.anInt893);
									}
								}
								this.aString26 = "";
								this.aBoolean232 = true;
							}
						}
					}
				} while ((local10 < 97 || local10 > 122) && (local10 < 65 || local10 > 90) && (local10 < 48 || local10 > 57) && local10 != 32);
				if (this.aString27.length() < 12) {
					this.aString27 = this.aString27 + (char) local10;
				}
			}
		} catch (@Pc(1062) RuntimeException local1062) {
			signlink.reporterror("84997, " + arg0 + ", " + local1062.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!OMIIKHIV;IIII)V")
	private void method589(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(5) boolean local5 = false;
			if (this.anInt949 < 400) {
				if (arg0.anIntArray133 != null) {
					arg0 = arg0.method402();
				}
				if (arg0 != null && arg0.aBoolean149) {
					@Pc(27) String local27 = arg0.aString8;
					if (arg0.anInt566 != 0) {
						local27 = local27 + method688(arg0.anInt566, aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt342) + " (level-" + arg0.anInt566 + ")";
					}
					if (this.anInt950 == 1) {
						this.aStringArray12[this.anInt949] = "Use " + this.aString25 + " with @yel@" + local27;
						this.anIntArray250[this.anInt949] = 693;
						this.anIntArray251[this.anInt949] = arg3;
						this.anIntArray248[this.anInt949] = arg1;
						this.anIntArray249[this.anInt949] = arg4;
						this.anInt949++;
					} else if (this.anInt942 != 1) {
						@Pc(165) int local165;
						if (arg0.aStringArray5 != null) {
							for (local165 = 4; local165 >= 0; local165--) {
								if (arg0.aStringArray5[local165] != null && !arg0.aStringArray5[local165].equalsIgnoreCase("attack")) {
									this.aStringArray12[this.anInt949] = arg0.aStringArray5[local165] + " @yel@" + local27;
									if (local165 == 0) {
										this.anIntArray250[this.anInt949] = 803;
									}
									if (local165 == 1) {
										this.anIntArray250[this.anInt949] = 220;
									}
									if (local165 == 2) {
										this.anIntArray250[this.anInt949] = 668;
									}
									if (local165 == 3) {
										this.anIntArray250[this.anInt949] = 800;
									}
									if (local165 == 4) {
										this.anIntArray250[this.anInt949] = 255;
									}
									this.anIntArray251[this.anInt949] = arg3;
									this.anIntArray248[this.anInt949] = arg1;
									this.anIntArray249[this.anInt949] = arg4;
									this.anInt949++;
								}
							}
						}
						if (arg0.aStringArray5 != null) {
							for (local165 = 4; local165 >= 0; local165--) {
								if (arg0.aStringArray5[local165] != null && arg0.aStringArray5[local165].equalsIgnoreCase("attack")) {
									@Pc(289) short local289 = 0;
									if (arg0.anInt566 > aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt342) {
										local289 = 2000;
									}
									this.aStringArray12[this.anInt949] = arg0.aStringArray5[local165] + " @yel@" + local27;
									if (local165 == 0) {
										this.anIntArray250[this.anInt949] = local289 + 803;
									}
									if (local165 == 1) {
										this.anIntArray250[this.anInt949] = local289 + 220;
									}
									if (local165 == 2) {
										this.anIntArray250[this.anInt949] = local289 + 668;
									}
									if (local165 == 3) {
										this.anIntArray250[this.anInt949] = local289 + 800;
									}
									if (local165 == 4) {
										this.anIntArray250[this.anInt949] = local289 + 255;
									}
									this.anIntArray251[this.anInt949] = arg3;
									this.anIntArray248[this.anInt949] = arg1;
									this.anIntArray249[this.anInt949] = arg4;
									this.anInt949++;
								}
							}
						}
						this.aStringArray12[this.anInt949] = "Examine @yel@" + local27;
						this.anIntArray250[this.anInt949] = 1561;
						this.anIntArray251[this.anInt949] = arg3;
						this.anIntArray248[this.anInt949] = arg1;
						this.anIntArray249[this.anInt949] = arg4;
						this.anInt949++;
					} else if ((this.anInt944 & 0x2) == 2) {
						this.aStringArray12[this.anInt949] = this.aString23 + " @yel@" + local27;
						this.anIntArray250[this.anInt949] = 31;
						this.anIntArray251[this.anInt949] = arg3;
						this.anIntArray248[this.anInt949] = arg1;
						this.anIntArray249[this.anInt949] = arg4;
						this.anInt949++;
						return;
					}
				}
			}
		} catch (@Pc(439) RuntimeException local439) {
			signlink.reporterror("1381, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local439.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZII)V")
	private void method590(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		try {
			signlink.anInt1087 = arg1;
			if (arg0) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("19926, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method591(@OriginalArg(0) byte arg0) {
		try {
			this.aBoolean240 = false;
			while (this.aBoolean244) {
				this.aBoolean240 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(13) Exception local13) {
				}
			}
			this.aClass1_Sub1_Sub3_Sub2_4 = null;
			this.aClass1_Sub1_Sub3_Sub2_5 = null;
			this.aClass1_Sub1_Sub3_Sub2Array5 = null;
			this.anIntArray265 = null;
			@Pc(34) boolean local34 = false;
			this.anIntArray266 = null;
			this.anIntArray267 = null;
			this.anIntArray268 = null;
			this.anIntArray227 = null;
			this.anIntArray228 = null;
			this.anIntArray260 = null;
			this.anIntArray261 = null;
			this.aClass1_Sub1_Sub3_Sub1_7 = null;
			this.aClass1_Sub1_Sub3_Sub1_8 = null;
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("82666, " + arg0 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!FDCAWVRL;)V")
	private void method592(@OriginalArg(1) Class1_Sub1_Sub3_Sub2 arg0) {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anIntArray227.length; local5++) {
				this.anIntArray227[local5] = 0;
			}
			@Pc(30) int local30;
			for (@Pc(20) int local20 = 0; local20 < 5000; local20++) {
				local30 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray227[local30] = (int) (Math.random() * 256.0D);
			}
			this.anInt920 += 0;
			@Pc(54) int local54;
			@Pc(58) int local58;
			@Pc(66) int local66;
			for (local30 = 0; local30 < 20; local30++) {
				for (local54 = 1; local54 < 255; local54++) {
					for (local58 = 1; local58 < 127; local58++) {
						local66 = local58 + (local54 << 7);
						this.anIntArray228[local66] = (this.anIntArray227[local66 - 1] + this.anIntArray227[local66 + 1] + this.anIntArray227[local66 - 128] + this.anIntArray227[local66 + 128]) / 4;
					}
				}
				@Pc(112) int[] local112 = this.anIntArray227;
				this.anIntArray227 = this.anIntArray228;
				this.anIntArray228 = local112;
			}
			if (arg0 != null) {
				local54 = 0;
				for (local58 = 0; local58 < arg0.anInt267; local58++) {
					for (local66 = 0; local66 < arg0.anInt266; local66++) {
						if (arg0.aByteArray2[local54++] != 0) {
							@Pc(148) int local148 = local66 + arg0.anInt268 + 16;
							@Pc(155) int local155 = local58 + arg0.anInt269 + 16;
							@Pc(161) int local161 = local148 + (local155 << 7);
							this.anIntArray227[local161] = 0;
						}
					}
				}
			}
		} catch (@Pc(178) RuntimeException local178) {
			signlink.reporterror("53656, " + 0 + ", " + arg0 + ", " + local178.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)Ljava/net/Socket;")
	public Socket method593(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method594() {
		try {
			if (this.anInt924 > 0) {
				this.method656();
			} else {
				this.aClass12_26.method182(this.anInt1054);
				this.aClass1_Sub1_Sub3_Sub3_3.method225(144, "Connection lost", 0, 257);
				this.aClass1_Sub1_Sub3_Sub3_3.method225(143, "Connection lost", 16777215, 256);
				this.aClass1_Sub1_Sub3_Sub3_3.method225(159, "Please wait - attempting to reestablish", 0, 257);
				this.aClass1_Sub1_Sub3_Sub3_3.method225(158, "Please wait - attempting to reestablish", 16777215, 256);
				this.aClass12_26.method183(4, 4, super.aGraphics2);
				this.anInt1063 = 0;
				this.anInt888 = 0;
				@Pc(67) Class36 local67 = this.aClass36_1;
				this.aBoolean264 = false;
				this.anInt909 = 0;
				this.method619(this.aString28, this.aString29, true);
				if (!this.aBoolean264) {
					this.method656();
				}
				try {
					local67.method425();
				} catch (@Pc(90) Exception local90) {
				}
			}
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("57415, " + true + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt970 = Integer.parseInt(this.getParameter("nodeid"));
		anInt971 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method712(anInt946);
		} else {
			method626();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean246 = false;
		} else {
			aBoolean246 = true;
		}
		this.method570();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	private String method595(@OriginalArg(0) int arg0) {
		try {
			this.aBoolean264 &= true;
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("39827, " + arg0 + ", " + true + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(III)Z")
	private boolean method596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(13) Class32 local13 = Class32.aClass32Array1[arg1];
			for (@Pc(15) int local15 = 0; local15 < local13.anIntArray141.length && local13.anIntArray141[local15] != -1; local15++) {
				@Pc(30) Class32 local30 = Class32.aClass32Array1[local13.anIntArray141[local15]];
				if (local30.anInt618 == 1) {
					local3 |= this.method596(arg0, local30.anInt587);
				}
				@Pc(65) int local65;
				if (local30.anInt618 == 6 && (local30.anInt610 != -1 || local30.anInt611 != -1)) {
					@Pc(60) boolean local60 = this.method703(local30, 232);
					if (local60) {
						local65 = local30.anInt611;
					} else {
						local65 = local30.anInt610;
					}
					if (local65 != -1) {
						@Pc(77) Class21 local77 = Class21.aClass21Array1[local65];
						local30.anInt596 += arg0;
						while (local30.anInt596 > local77.method279(local30.anInt619)) {
							local30.anInt596 -= local77.method279(local30.anInt619) + 1;
							local30.anInt619++;
							if (local30.anInt619 >= local77.anInt390) {
								local30.anInt619 -= local77.anInt391;
								if (local30.anInt619 < 0 || local30.anInt619 >= local77.anInt390) {
									local30.anInt619 = 0;
								}
							}
							local3 = true;
						}
					}
				}
				if (local30.anInt618 == 6 && local30.anInt595 != 0) {
					@Pc(148) int local148 = local30.anInt595 >> 16;
					local65 = local30.anInt595 << 16 >> 16;
					@Pc(159) int local159 = local148 * arg0;
					local65 *= arg0;
					local30.anInt600 = local30.anInt600 + local159 & 0x7FF;
					local30.anInt601 = local30.anInt601 + local65 & 0x7FF;
					local3 = true;
				}
			}
			return local3;
		} catch (@Pc(190) RuntimeException local190) {
			signlink.reporterror("14284, " + arg0 + ", " + arg1 + ", " + 44494 + ", " + local190.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method597() {
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
				this.anInt1067 = -1;
				this.aClass7_10.method104();
				this.aClass7_11.method104();
				Class1_Sub1_Sub3_Sub4.method524();
				this.method702();
				this.aClass40_1.method456();
				System.gc();
				for (local22 = 0; local22 < 4; local22++) {
					this.aClass18Array1[local22].method256();
				}
				for (local35 = 0; local35 < 4; local35++) {
					for (local39 = 0; local39 < 104; local39++) {
						for (local43 = 0; local43 < 104; local43++) {
							this.aByteArrayArrayArray8[local35][local39][local43] = 0;
						}
					}
				}
				@Pc(77) Class9 local77 = new Class9(104, 104, this.anIntArrayArrayArray8, 123, this.aByteArrayArrayArray8);
				local43 = this.aByteArrayArray5.length;
				this.aClass1_Sub1_Sub2_8.method48(241);
				@Pc(256) int local256;
				@Pc(244) int local244;
				if (!this.aBoolean262) {
					@Pc(122) byte[] local122;
					for (local91 = 0; local91 < local43; local91++) {
						local105 = (this.anIntArray271[local91] >> 8) * 64 - this.anInt1037;
						local117 = (this.anIntArray271[local91] & 0xFF) * 64 - this.anInt1038;
						local122 = this.aByteArrayArray5[local91];
						if (local122 != null) {
							local77.method164(local105, local122, (this.anInt1024 - 6) * 8, (this.anInt1025 - 6) * 8, local117, this.aClass18Array1);
						}
					}
					for (local105 = 0; local105 < local43; local105++) {
						local117 = (this.anIntArray271[local105] >> 8) * 64 - this.anInt1037;
						local176 = (this.anIntArray271[local105] & 0xFF) * 64 - this.anInt1038;
						@Pc(181) byte[] local181 = this.aByteArrayArray5[local105];
						if (local181 == null && this.anInt1025 < 800) {
							local77.method154(local176, 64, 64, local117);
						}
					}
					anInt894++;
					if (anInt894 > 138) {
						anInt894 = 0;
						this.aClass1_Sub1_Sub2_8.method48(180);
						this.aClass1_Sub1_Sub2_8.method52(13980256);
					}
					this.aClass1_Sub1_Sub2_8.method48(241);
					for (local117 = 0; local117 < local43; local117++) {
						local122 = this.aByteArrayArray4[local117];
						if (local122 != null) {
							local244 = (this.anIntArray271[local117] >> 8) * 64 - this.anInt1037;
							local256 = (this.anIntArray271[local117] & 0xFF) * 64 - this.anInt1038;
							local77.method171(this.aClass40_1, this.aClass18Array1, local122, local256, local244);
						}
					}
				}
				if (this.aBoolean262) {
					local91 = 0;
					label250: while (true) {
						@Pc(315) int local315;
						@Pc(321) int local321;
						@Pc(331) int local331;
						@Pc(333) int local333;
						if (local91 >= 4) {
							for (local105 = 0; local105 < 13; local105++) {
								for (local117 = 0; local117 < 13; local117++) {
									local176 = this.anIntArrayArrayArray7[0][local105][local117];
									if (local176 == -1) {
										local77.method154(local117 * 8, 8, 8, local105 * 8);
									}
								}
							}
							this.aClass1_Sub1_Sub2_8.method48(241);
							local117 = 0;
							while (true) {
								if (local117 >= 4) {
									break label250;
								}
								for (local176 = 0; local176 < 13; local176++) {
									for (local244 = 0; local244 < 13; local244++) {
										local256 = this.anIntArrayArrayArray7[local117][local176][local244];
										if (local256 != -1) {
											local315 = local256 >> 24 & 0x3;
											local321 = local256 >> 1 & 0x3;
											local331 = local256 >> 14 & 0x3FF;
											local333 = local256 >> 3 & 0x7FF;
											@Pc(496) int local496 = (local331 / 8 << 8) + local333 / 8;
											for (@Pc(498) int local498 = 0; local498 < this.anIntArray271.length; local498++) {
												if (this.anIntArray271[local498] == local496 && this.aByteArrayArray4[local498] != null) {
													local77.method169(this.aByteArrayArray4[local498], (local333 & 0x7) * 8, this.aClass18Array1, local117, local315, local176 * 8, this.aClass40_1, local244 * 8, local321, (local331 & 0x7) * 8);
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
								local176 = this.anIntArrayArrayArray7[local91][local105][local117];
								if (local176 != -1) {
									local244 = local176 >> 24 & 0x3;
									local256 = local176 >> 1 & 0x3;
									local315 = local176 >> 14 & 0x3FF;
									local321 = local176 >> 3 & 0x7FF;
									local331 = (local315 / 8 << 8) + local321 / 8;
									for (local333 = 0; local333 < this.anIntArray271.length; local333++) {
										if (this.anIntArray271[local333] == local331 && this.aByteArrayArray5[local333] != null) {
											local77.method170(local244, 868, (local321 & 0x7) * 8, this.aByteArrayArray5[local333], local91, (local315 & 0x7) * 8, this.aClass18Array1, local256, local105 * 8, local117 * 8);
											break;
										}
									}
								}
							}
						}
						local91++;
					}
				}
				this.aClass1_Sub1_Sub2_8.method48(241);
				local77.method165(this.aClass40_1, this.aClass18Array1, this.aByte42);
				this.aClass12_26.method182(this.anInt1054);
				this.aClass1_Sub1_Sub2_8.method48(241);
				local91 = Class9.anInt211;
				if (local91 > this.anInt961) {
					local91 = this.anInt961;
				}
				if (local91 < this.anInt961 - 1) {
					local91 = this.anInt961 - 1;
				}
				if (aBoolean247) {
					this.aClass40_1.method457(Class9.anInt211);
				} else {
					this.aClass40_1.method457(0);
				}
				for (local105 = 0; local105 < 104; local105++) {
					for (local117 = 0; local117 < 104; local117++) {
						this.method652(local105, local117);
					}
				}
				this.method668();
			} catch (@Pc(643) Exception local643) {
			}
			Class38.aClass29_9.method336();
			if (super.aFrame_Sub1_2 != null) {
				this.aClass1_Sub1_Sub2_8.method48(128);
				this.aClass1_Sub1_Sub2_8.method53(1057001181);
			}
			if (aBoolean247 && signlink.aRandomAccessFile3 != null) {
				local22 = this.aClass20_Sub1_1.method387(0, aBoolean236);
				for (local35 = 0; local35 < local22; local35++) {
					local39 = this.aClass20_Sub1_1.method390(local35);
					if ((local39 & 0x79) == 0) {
						Class1_Sub1_Sub1_Sub4.method301(local35);
					}
				}
			}
			System.gc();
			Class1_Sub1_Sub3_Sub4.method525();
			this.aClass20_Sub1_1.method393();
			local22 = (this.anInt1024 - 6) / 8 - 1;
			local35 = (this.anInt1024 + 6) / 8 + 1;
			local39 = (this.anInt1025 - 6) / 8 - 1;
			local43 = (this.anInt1025 + 6) / 8 + 1;
			this.aBoolean264 &= true;
			if (this.aBoolean265) {
				local22 = 49;
				local35 = 50;
				local39 = 49;
				local43 = 50;
			}
			for (local91 = local22; local91 <= local35; local91++) {
				for (local105 = local39; local105 <= local43; local105++) {
					if (local91 == local22 || local91 == local35 || local105 == local39 || local105 == local43) {
						local117 = this.aClass20_Sub1_1.method392(0, local105, local91, (byte) 5);
						if (local117 != -1) {
							this.aClass20_Sub1_1.method389(local117, 3);
						}
						local176 = this.aClass20_Sub1_1.method392(1, local105, local91, (byte) 5);
						if (local176 != -1) {
							this.aClass20_Sub1_1.method389(local176, 3);
						}
					}
				}
			}
		} catch (@Pc(813) RuntimeException local813) {
			signlink.reporterror("39691, " + true + ", " + local813.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBILclient!CUKAGIIJ;)V")
	private void method598(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub1_Sub3_Sub1 arg3) {
		try {
			@Pc(4) boolean local4 = false;
			@Pc(19) int local19 = arg0 * arg0 + arg2 * arg2;
			if (local19 > 4225 && local19 < 90000) {
				@Pc(33) int local33 = this.anInt984 + this.anInt973 & 0x7FF;
				@Pc(37) int local37 = Class1_Sub1_Sub1_Sub4.anIntArray120[local33];
				@Pc(41) int local41 = Class1_Sub1_Sub1_Sub4.anIntArray121[local33];
				@Pc(50) int local50 = local37 * 256 / (this.anInt954 + 256);
				@Pc(59) int local59 = local41 * 256 / (this.anInt954 + 256);
				@Pc(69) int local69 = arg2 * local50 + arg0 * local59 >> 16;
				@Pc(79) int local79 = arg2 * local59 - arg0 * local50 >> 16;
				@Pc(85) double local85 = Math.atan2((double) local69, (double) local79);
				@Pc(91) int local91 = (int) (Math.sin(local85) * 63.0D);
				@Pc(97) int local97 = (int) (Math.cos(local85) * 57.0D);
				this.aClass1_Sub1_Sub3_Sub1_9.method143(83 - local97 - 20, local85, local91 + 94 + 4 - 10);
			} else {
				this.method661(arg0, arg3, arg2);
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("35906, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
	private void method599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(1) Class1_Sub3 local1 = null;
			for (@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) this.aClass7_12.method100(); local6 != null; local6 = (Class1_Sub3) this.aClass7_12.method102()) {
				if (local6.anInt379 == arg7 && local6.anInt381 == arg2 && local6.anInt382 == arg5 && local6.anInt380 == arg3) {
					local1 = local6;
					break;
				}
			}
			if (local1 == null) {
				local1 = new Class1_Sub3();
				local1.anInt379 = arg7;
				local1.anInt380 = arg3;
				local1.anInt381 = arg2;
				local1.anInt382 = arg5;
				this.method585(local1);
				this.aClass7_12.method97(local1);
			}
			local1.anInt373 = arg6;
			local1.anInt375 = arg0;
			local1.anInt374 = arg1;
			local1.anInt384 = arg8;
			local1.anInt383 = arg4;
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("25719, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + 918 + ", " + arg8 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)I")
	private int method600() {
		try {
			@Pc(3) int local3 = 3;
			if (this.anInt1031 < 310) {
				@Pc(18) int local18 = this.anInt1028 >> 7;
				@Pc(23) int local23 = this.anInt1030 >> 7;
				@Pc(28) int local28 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt319 >> 7;
				@Pc(33) int local33 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt320 >> 7;
				if ((this.aByteArrayArrayArray8[this.anInt961][local18][local23] & 0x4) != 0) {
					local3 = this.anInt961;
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
						if ((this.aByteArrayArrayArray8[this.anInt961][local18][local23] & 0x4) != 0) {
							local3 = this.anInt961;
						}
						local85 += local83;
						if (local85 >= 65536) {
							local85 -= 65536;
							if (local23 < local33) {
								local23++;
							} else if (local23 > local33) {
								local23--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt961][local18][local23] & 0x4) != 0) {
								local3 = this.anInt961;
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
						if ((this.aByteArrayArrayArray8[this.anInt961][local18][local23] & 0x4) != 0) {
							local3 = this.anInt961;
						}
						local85 += local83;
						if (local85 >= 65536) {
							local85 -= 65536;
							if (local18 < local28) {
								local18++;
							} else if (local18 > local28) {
								local18--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt961][local18][local23] & 0x4) != 0) {
								local3 = this.anInt961;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray8[this.anInt961][aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt319 >> 7][aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt320 >> 7] & 0x4) != 0) {
				local3 = this.anInt961;
			}
			return local3;
		} catch (@Pc(251) RuntimeException local251) {
			signlink.reporterror("48195, " + 26935 + ", " + local251.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)I")
	private int method601() {
		try {
			@Pc(9) int local9 = this.method696(this.anInt1028, this.anInt961, this.anInt1030);
			return local9 - this.anInt1029 >= 800 || (this.aByteArrayArrayArray8[this.anInt961][this.anInt1028 >> 7][this.anInt1030 >> 7] & 0x4) == 0 ? 3 : this.anInt961;
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("1785, " + 651 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!OPFNUBIN;Z)Z")
	private boolean method602(@OriginalArg(0) Class32 arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.aBoolean264 &= arg1;
			@Pc(10) int local10 = arg0.anInt607;
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
				this.aStringArray12[this.anInt949] = "Remove @whi@" + this.aStringArray10[local10];
				this.anIntArray250[this.anInt949] = 748;
				this.anInt949++;
				this.aStringArray12[this.anInt949] = "Message @whi@" + this.aStringArray10[local10];
				this.anIntArray250[this.anInt949] = 382;
				this.anInt949++;
				return true;
			} else if (local10 >= 401 && local10 <= 500) {
				this.aStringArray12[this.anInt949] = "Remove @whi@" + arg0.aString13;
				this.anIntArray250[this.anInt949] = 806;
				this.anInt949++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("19146, " + arg0 + ", " + arg1 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method603() {
		try {
			while (true) {
				@Pc(13) Class1_Sub1_Sub4 local13 = this.aClass20_Sub1_1.method385();
				if (local13 == null) {
					return;
				}
				if (local13.anInt547 == 0) {
					Class1_Sub1_Sub1_Sub4.method300(local13.anInt548, local13.aByteArray11, (byte) 3);
					if ((this.aClass20_Sub1_1.method390(local13.anInt548) & 0x62) != 0) {
						this.aBoolean223 = true;
						if (this.anInt1065 != -1) {
							this.aBoolean232 = true;
						}
					}
				}
				if (local13.anInt547 == 1 && local13.aByteArray11 != null) {
					Class6.method41(local13.aByteArray11);
				}
				if (local13.anInt547 == 2 && local13.anInt548 == this.anInt958 && local13.aByteArray11 != null) {
					this.method605(local13.aByteArray11, this.aBoolean243);
				}
				if (local13.anInt547 == 3 && this.anInt966 == 1) {
					for (@Pc(84) int local84 = 0; local84 < this.aByteArrayArray5.length; local84++) {
						if (this.anIntArray272[local84] == local13.anInt548) {
							this.aByteArrayArray5[local84] = local13.aByteArray11;
							if (local13.aByteArray11 == null) {
								this.anIntArray272[local84] = -1;
							}
							break;
						}
						if (this.anIntArray273[local84] == local13.anInt548) {
							this.aByteArrayArray4[local84] = local13.aByteArray11;
							if (local13.aByteArray11 == null) {
								this.anIntArray273[local84] = -1;
							}
							break;
						}
					}
				}
				if (local13.anInt547 == 93 && this.aClass20_Sub1_1.method382(local13.anInt548)) {
					Class9.method162(new Class1_Sub1_Sub2(local13.aByteArray11, 792), this.aClass20_Sub1_1);
				}
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("12571, " + false + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method604() {
		try {
			try {
				@Pc(15) int local15 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt319 + this.anInt1072;
				@Pc(21) int local21 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt320 + this.anInt1076;
				if (this.anInt897 - local15 < -500 || this.anInt897 - local15 > 500 || this.anInt898 - local21 < -500 || this.anInt898 - local21 > 500) {
					this.anInt897 = local15;
					this.anInt898 = local21;
				}
				if (this.anInt897 != local15) {
					this.anInt897 += (local15 - this.anInt897) / 16;
				}
				if (this.anInt898 != local21) {
					this.anInt898 += (local21 - this.anInt898) / 16;
				}
				if (super.anIntArray210[1] == 1) {
					this.anInt985 += (-this.anInt985 - 24) / 2;
				} else if (super.anIntArray210[2] == 1) {
					this.anInt985 += (24 - this.anInt985) / 2;
				} else {
					this.anInt985 /= 2;
				}
				if (super.anIntArray210[3] == 1) {
					this.anInt986 += (12 - this.anInt986) / 2;
				} else if (super.anIntArray210[4] == 1) {
					this.anInt986 += (-this.anInt986 - 12) / 2;
				} else {
					this.anInt986 /= 2;
				}
				this.anInt984 = this.anInt984 + this.anInt985 / 2 & 0x7FF;
				this.anInt983 += this.anInt986 / 2;
				if (this.anInt983 < 128) {
					this.anInt983 = 128;
				}
				if (this.anInt983 > 383) {
					this.anInt983 = 383;
				}
				anInt1057++;
				if (anInt1057 > 60) {
					anInt1057 = 0;
					this.aClass1_Sub1_Sub2_8.method48(64);
				}
				@Pc(222) int local222 = this.anInt897 >> 7;
				@Pc(227) int local227 = this.anInt898 >> 7;
				@Pc(237) int local237 = this.method696(this.anInt897, this.anInt961, this.anInt898);
				@Pc(239) int local239 = 0;
				@Pc(255) int local255;
				if (local222 > 3 && local227 > 3 && local222 < 100 && local227 < 100) {
					for (local255 = local222 - 4; local255 <= local222 + 4; local255++) {
						for (@Pc(261) int local261 = local227 - 4; local261 <= local227 + 4; local261++) {
							@Pc(266) int local266 = this.anInt961;
							if (local266 < 3 && (this.aByteArrayArrayArray8[1][local255][local261] & 0x2) == 2) {
								local266++;
							}
							@Pc(293) int local293 = local237 - this.anIntArrayArrayArray8[local266][local255][local261];
							if (local293 > local239) {
								local239 = local293;
							}
						}
					}
				}
				local255 = local239 * 192;
				if (local255 > 98048) {
					local255 = 98048;
				}
				if (local255 < 32768) {
					local255 = 32768;
				}
				if (local255 > this.anInt968) {
					this.anInt968 += (local255 - this.anInt968) / 24;
				} else if (local255 < this.anInt968) {
					this.anInt968 += (local255 - this.anInt968) / 80;
				}
			} catch (@Pc(357) Exception local357) {
				signlink.reporterror("glfc_ex " + aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt319 + "," + aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt320 + "," + this.anInt897 + "," + this.anInt898 + "," + this.anInt1024 + "," + this.anInt1025 + "," + this.anInt1037 + "," + this.anInt1038);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(407) RuntimeException local407) {
			signlink.reporterror("68303, " + 8 + ", " + local407.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method577(@OriginalArg(0) int arg0) {
		try {
			if (this.aBoolean235 || this.aBoolean234 || this.aBoolean255) {
				this.method666();
			} else {
				anInt940++;
				@Pc(20) boolean local20 = false;
				if (this.aBoolean264) {
					this.method676(this.anInt1015);
				} else {
					this.method709(false);
				}
				this.anInt1070 = 0;
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("65858, " + arg0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BIZ)V")
	private void method605(@OriginalArg(0) byte[] arg0, @OriginalArg(2) boolean arg1) {
		try {
			if (this.aBoolean250) {
				signlink.anInt1088 = arg1 ? 1 : 0;
				signlink.midisave(arg0, arg0.length);
			}
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("48067, " + arg0 + ", " + 49435 + ", " + arg1 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method606() {
		try {
			if (this.anInt949 >= 2 || this.anInt950 != 0 || this.anInt942 != 0) {
				@Pc(35) String local35;
				if (this.anInt950 == 1 && this.anInt949 < 2) {
					local35 = "Use " + this.aString25 + " with...";
				} else if (this.anInt942 == 1 && this.anInt949 < 2) {
					local35 = this.aString23 + "...";
				} else {
					local35 = this.aStringArray12[this.anInt949 - 1];
				}
				if (this.anInt949 > 2) {
					local35 = local35 + "@whi@ / " + (this.anInt949 - 2) + " more options";
				}
				this.aClass1_Sub1_Sub3_Sub3_4.method234(local35, 15, anInt903 / 1000, 16777215, 4);
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("83961, " + -24513 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method607(@OriginalArg(0) byte arg0) {
		try {
			if (this.aByte40 == 2) {
				@Pc(5) boolean local5 = false;
			} else {
				anInt972 = this.aClass37_2.method431();
			}
			if (super.anInt857 == 1) {
				if (super.anInt858 >= 539 && super.anInt858 <= 573 && super.anInt859 >= 169 && super.anInt859 < 205 && this.anIntArray216[0] != -1) {
					this.aBoolean223 = true;
					this.anInt866 = 0;
					this.aBoolean256 = true;
				}
				if (super.anInt858 >= 569 && super.anInt858 <= 599 && super.anInt859 >= 168 && super.anInt859 < 205 && this.anIntArray216[1] != -1) {
					this.aBoolean223 = true;
					this.anInt866 = 1;
					this.aBoolean256 = true;
				}
				if (super.anInt858 >= 597 && super.anInt858 <= 627 && super.anInt859 >= 168 && super.anInt859 < 205 && this.anIntArray216[2] != -1) {
					this.aBoolean223 = true;
					this.anInt866 = 2;
					this.aBoolean256 = true;
				}
				if (super.anInt858 >= 625 && super.anInt858 <= 669 && super.anInt859 >= 168 && super.anInt859 < 203 && this.anIntArray216[3] != -1) {
					this.aBoolean223 = true;
					this.anInt866 = 3;
					this.aBoolean256 = true;
				}
				if (super.anInt858 >= 666 && super.anInt858 <= 696 && super.anInt859 >= 168 && super.anInt859 < 205 && this.anIntArray216[4] != -1) {
					this.aBoolean223 = true;
					this.anInt866 = 4;
					this.aBoolean256 = true;
				}
				if (super.anInt858 >= 694 && super.anInt858 <= 724 && super.anInt859 >= 168 && super.anInt859 < 205 && this.anIntArray216[5] != -1) {
					this.aBoolean223 = true;
					this.anInt866 = 5;
					this.aBoolean256 = true;
				}
				if (super.anInt858 >= 722 && super.anInt858 <= 756 && super.anInt859 >= 169 && super.anInt859 < 205 && this.anIntArray216[6] != -1) {
					this.aBoolean223 = true;
					this.anInt866 = 6;
					this.aBoolean256 = true;
				}
				if (super.anInt858 >= 540 && super.anInt858 <= 574 && super.anInt859 >= 466 && super.anInt859 < 502 && this.anIntArray216[7] != -1) {
					this.aBoolean223 = true;
					this.anInt866 = 7;
					this.aBoolean256 = true;
				}
				if (super.anInt858 >= 572 && super.anInt858 <= 602 && super.anInt859 >= 466 && super.anInt859 < 503 && this.anIntArray216[8] != -1) {
					this.aBoolean223 = true;
					this.anInt866 = 8;
					this.aBoolean256 = true;
				}
				if (super.anInt858 >= 599 && super.anInt858 <= 629 && super.anInt859 >= 466 && super.anInt859 < 503 && this.anIntArray216[9] != -1) {
					this.aBoolean223 = true;
					this.anInt866 = 9;
					this.aBoolean256 = true;
				}
				if (super.anInt858 >= 627 && super.anInt858 <= 671 && super.anInt859 >= 467 && super.anInt859 < 502 && this.anIntArray216[10] != -1) {
					this.aBoolean223 = true;
					this.anInt866 = 10;
					this.aBoolean256 = true;
				}
				if (super.anInt858 >= 669 && super.anInt858 <= 699 && super.anInt859 >= 466 && super.anInt859 < 503 && this.anIntArray216[11] != -1) {
					this.aBoolean223 = true;
					this.anInt866 = 11;
					this.aBoolean256 = true;
				}
				if (super.anInt858 >= 696 && super.anInt858 <= 726 && super.anInt859 >= 466 && super.anInt859 < 503 && this.anIntArray216[12] != -1) {
					this.aBoolean223 = true;
					this.anInt866 = 12;
					this.aBoolean256 = true;
				}
				if (super.anInt858 >= 724 && super.anInt858 <= 758 && super.anInt859 >= 466 && super.anInt859 < 502 && this.anIntArray216[13] != -1) {
					this.aBoolean223 = true;
					this.anInt866 = 13;
					this.aBoolean256 = true;
					return;
				}
			}
		} catch (@Pc(451) RuntimeException local451) {
			signlink.reporterror("31205, " + arg0 + ", " + local451.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method608() {
		try {
			if (this.anInt980 != 0) {
				@Pc(11) int local11 = 0;
				if (this.anInt1052 != 0) {
					local11 = 1;
				}
				for (@Pc(18) int local18 = 0; local18 < 100; local18++) {
					if (this.aStringArray9[local18] != null) {
						@Pc(30) int local30 = this.anIntArray212[local18];
						@Pc(35) String local35 = this.aStringArray8[local18];
						if (local35 != null && local35.startsWith("@cr1@")) {
							local35 = local35.substring(5);
						}
						if (local35 != null && local35.startsWith("@cr2@")) {
							local35 = local35.substring(5);
						}
						if ((local30 == 3 || local30 == 7) && (local30 == 7 || this.anInt900 == 0 || this.anInt900 == 1 && this.method660(this.aBoolean252, local35))) {
							@Pc(89) int local89 = 329 - local11 * 13;
							if (super.anInt852 > 4 && super.anInt853 - 4 > local89 - 10 && super.anInt853 - 4 <= local89 + 3) {
								@Pc(128) int local128 = this.aClass1_Sub1_Sub3_Sub3_3.method227("From:  " + local35 + this.aStringArray9[local18]) + 25;
								if (local128 > 450) {
									local128 = 450;
								}
								if (super.anInt852 < local128 + 4) {
									if (this.anInt981 >= 1) {
										this.aStringArray12[this.anInt949] = "Report abuse @whi@" + local35;
										this.anIntArray250[this.anInt949] = 2853;
										this.anInt949++;
									}
									this.aStringArray12[this.anInt949] = "Add ignore @whi@" + local35;
									this.anIntArray250[this.anInt949] = 2992;
									this.anInt949++;
									this.aStringArray12[this.anInt949] = "Add friend @whi@" + local35;
									this.anIntArray250[this.anInt949] = 2050;
									this.anInt949++;
								}
							}
							local11++;
							if (local11 >= 5) {
								return;
							}
						}
						if ((local30 == 5 || local30 == 6) && this.anInt900 < 2) {
							local11++;
							if (local11 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(241) RuntimeException local241) {
			signlink.reporterror("39837, " + -47591 + ", " + local241.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method609() {
		try {
			this.aBoolean264 &= true;
			@Pc(17) int local17;
			@Pc(24) int local24;
			if (this.anInt882 == 0) {
				local17 = super.anInt848 / 2 - 80;
				local24 = super.anInt849 / 2 + 20;
				local24 += 20;
				if (super.anInt857 == 1 && super.anInt858 >= local17 - 75 && super.anInt858 <= local17 + 75 && super.anInt859 >= local24 - 20 && super.anInt859 <= local24 + 20) {
					this.anInt882 = 3;
					this.anInt993 = 0;
				}
				local17 = super.anInt848 / 2 + 80;
				if (super.anInt857 == 1 && super.anInt858 >= local17 - 75 && super.anInt858 <= local17 + 75 && super.anInt859 >= local24 - 20 && super.anInt859 <= local24 + 20) {
					this.aString21 = "";
					this.aString22 = "Enter your username & password.";
					this.anInt882 = 2;
					this.anInt993 = 0;
				}
			} else if (this.anInt882 == 2) {
				local17 = super.anInt849 / 2 - 40;
				local17 += 30;
				local17 += 25;
				if (super.anInt857 == 1 && super.anInt859 >= local17 - 15 && super.anInt859 < local17) {
					this.anInt993 = 0;
				}
				local17 += 15;
				if (super.anInt857 == 1 && super.anInt859 >= local17 - 15 && super.anInt859 < local17) {
					this.anInt993 = 1;
				}
				local17 += 15;
				local24 = super.anInt848 / 2 - 80;
				@Pc(170) int local170 = super.anInt849 / 2 + 50;
				@Pc(171) int local171 = local170 + 20;
				if (super.anInt857 == 1 && super.anInt858 >= local24 - 75 && super.anInt858 <= local24 + 75 && super.anInt859 >= local171 - 20 && super.anInt859 <= local171 + 20) {
					this.anInt909 = 0;
					this.method619(this.aString28, this.aString29, false);
					if (this.aBoolean264) {
						return;
					}
				}
				local24 = super.anInt848 / 2 + 80;
				if (super.anInt857 == 1 && super.anInt858 >= local24 - 75 && super.anInt858 <= local24 + 75 && super.anInt859 >= local171 - 20 && super.anInt859 <= local171 + 20) {
					this.anInt882 = 0;
					this.aString28 = "";
					this.aString29 = "";
				}
				while (true) {
					while (true) {
						@Pc(261) int local261 = this.method573();
						if (local261 == -1) {
							return;
						}
						@Pc(266) boolean local266 = false;
						for (@Pc(268) int local268 = 0; local268 < aString18.length(); local268++) {
							if (local261 == aString18.charAt(local268)) {
								local266 = true;
								break;
							}
						}
						if (this.anInt993 == 0) {
							if (local261 == 8 && this.aString28.length() > 0) {
								this.aString28 = this.aString28.substring(0, this.aString28.length() - 1);
							}
							if (local261 == 9 || local261 == 10 || local261 == 13) {
								this.anInt993 = 1;
							}
							if (local266) {
								this.aString28 = this.aString28 + (char) local261;
							}
							if (this.aString28.length() > 12) {
								this.aString28 = this.aString28.substring(0, 12);
							}
						} else if (this.anInt993 == 1) {
							if (local261 == 8 && this.aString29.length() > 0) {
								this.aString29 = this.aString29.substring(0, this.aString29.length() - 1);
							}
							if (local261 == 9 || local261 == 10 || local261 == 13) {
								this.anInt993 = 0;
							}
							if (local266) {
								this.aString29 = this.aString29 + (char) local261;
							}
							if (this.aString29.length() > 20) {
								this.aString29 = this.aString29.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt882 == 3) {
				local17 = super.anInt848 / 2;
				local24 = super.anInt849 / 2 + 50;
				@Pc(425) int local425 = local24 + 20;
				if (super.anInt857 == 1 && super.anInt858 >= local17 - 75 && super.anInt858 <= local17 + 75 && super.anInt859 >= local425 - 20 && super.anInt859 <= local425 + 20) {
					this.anInt882 = 0;
					return;
				}
			}
		} catch (@Pc(458) RuntimeException local458) {
			signlink.reporterror("78060, " + true + ", " + local458.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!VNAWUDPP;I)V")
	private void method610(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg1) {
		try {
			this.method611(arg1.anInt319, arg0, arg1.anInt320);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("15145, " + arg0 + ", " + arg1 + ", " + -90 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)V")
	private void method611(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg0 >= 128 && arg2 >= 128 && arg0 <= 13056 && arg2 <= 13056) {
				@Pc(28) int local28 = this.method696(arg0, this.anInt961, arg2) - arg1;
				@Pc(33) int local33 = arg0 - this.anInt1028;
				@Pc(38) int local38 = local28 - this.anInt1029;
				@Pc(43) int local43 = arg2 - this.anInt1030;
				@Pc(48) int local48 = Class1_Sub1_Sub1_Sub4.anIntArray120[this.anInt1031];
				@Pc(53) int local53 = Class1_Sub1_Sub1_Sub4.anIntArray121[this.anInt1031];
				@Pc(58) int local58 = Class1_Sub1_Sub1_Sub4.anIntArray120[this.anInt1032];
				@Pc(63) int local63 = Class1_Sub1_Sub1_Sub4.anIntArray121[this.anInt1032];
				@Pc(73) int local73 = local43 * local58 + local33 * local63 >> 16;
				@Pc(83) int local83 = local43 * local63 - local33 * local58 >> 16;
				@Pc(85) int local85 = local73;
				@Pc(95) int local95 = local38 * local53 - local83 * local48 >> 16;
				@Pc(105) int local105 = local38 * local48 + local83 * local53 >> 16;
				if (local105 >= 50) {
					this.anInt1019 = Class1_Sub1_Sub3_Sub4.anInt746 + (local85 << 9) / local105;
					this.anInt1020 = Class1_Sub1_Sub3_Sub4.anInt747 + (local95 << 9) / local105;
				} else {
					this.anInt1019 = -1;
					this.anInt1020 = -1;
				}
			} else {
				this.anInt1019 = -1;
				this.anInt1020 = -1;
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("67812, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZZ)V")
	private void method612(@OriginalArg(0) boolean arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt988; local1++) {
				@Pc(11) Class1_Sub1_Sub1_Sub1_Sub1 local11 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray236[local1]];
				@Pc(20) int local20 = (this.anIntArray236[local1] << 14) + 536870912;
				if (local11 != null && local11.method247() && local11.aClass31_1.aBoolean146 == arg0 && local11.aClass31_1.method403()) {
					@Pc(41) int local41 = local11.anInt319 >> 7;
					@Pc(46) int local46 = local11.anInt320 >> 7;
					if (local41 >= 0 && local41 < 104 && local46 >= 0 && local46 < 104) {
						if (local11.anInt326 == 1 && (local11.anInt319 & 0x7F) == 64 && (local11.anInt320 & 0x7F) == 64) {
							if (this.anIntArrayArray22[local41][local46] == this.anInt1035) {
								continue;
							}
							this.anIntArrayArray22[local41][local46] = this.anInt1035;
						}
						if (!local11.aClass31_1.aBoolean149) {
							local20 += Integer.MIN_VALUE;
						}
						this.aClass40_1.method467(local11, local11.anInt321, local11.aBoolean89, local11.anInt319, this.anInt961, (local11.anInt326 - 1) * 64 + 60, local11.anInt320, local20, this.method696(local11.anInt319, this.anInt961, local11.anInt320));
					}
				}
			}
			this.aBoolean264 &= true;
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("70030, " + arg0 + ", " + true + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method613() {
		try {
			if (aBoolean247 && this.anInt966 == 2 && Class9.anInt209 != this.anInt961) {
				this.aClass12_26.method182(this.anInt1054);
				this.aClass1_Sub1_Sub3_Sub3_3.method225(151, "Loading - please wait.", 0, 257);
				this.aClass1_Sub1_Sub3_Sub3_3.method225(150, "Loading - please wait.", 16777215, 256);
				this.aClass12_26.method183(4, 4, super.aGraphics2);
				this.anInt966 = 1;
				this.aLong30 = System.currentTimeMillis();
			}
			if (this.anInt966 == 1) {
				@Pc(56) int local56 = this.method614(this.aByte38);
				if (local56 != 0 && System.currentTimeMillis() - this.aLong30 > 360000L) {
					signlink.reporterror(this.aString28 + " glcfb " + this.aLong29 + "," + local56 + "," + aBoolean247 + "," + this.aClass34Array1[0] + "," + this.aClass20_Sub1_1.method378() + "," + this.anInt961 + "," + this.anInt1024 + "," + this.anInt1025);
					this.aLong30 = System.currentTimeMillis();
				}
			}
			if (this.anInt966 == 2 && this.anInt961 != this.anInt1067) {
				this.anInt1067 = this.anInt961;
				this.method639(this.anInt961);
			}
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("97876, " + 699 + ", " + local137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)I")
	private int method614(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != 23) {
				this.method574();
			}
			for (@Pc(8) int local8 = 0; local8 < this.aByteArrayArray5.length; local8++) {
				if (this.aByteArrayArray5[local8] == null && this.anIntArray272[local8] != -1) {
					return -1;
				}
				if (this.aByteArrayArray4[local8] == null && this.anIntArray273[local8] != -1) {
					return -2;
				}
			}
			@Pc(44) boolean local44 = true;
			for (@Pc(46) int local46 = 0; local46 < this.aByteArrayArray5.length; local46++) {
				@Pc(53) byte[] local53 = this.aByteArrayArray4[local46];
				if (local53 != null) {
					@Pc(67) int local67 = (this.anIntArray271[local46] >> 8) * 64 - this.anInt1037;
					@Pc(79) int local79 = (this.anIntArray271[local46] & 0xFF) * 64 - this.anInt1038;
					if (this.aBoolean262) {
						local67 = 10;
						local79 = 10;
					}
					local44 &= Class9.method158(local79, this.aBoolean267, local67, local53);
				}
			}
			if (!local44) {
				return -3;
			} else if (this.aBoolean270) {
				return -4;
			} else {
				this.anInt966 = 2;
				Class9.anInt209 = this.anInt961;
				this.method597();
				this.aClass1_Sub1_Sub2_8.method48(212);
				return 0;
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("95307, " + arg0 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!CFARFRSG;)V")
	private void method615(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub2 arg1) {
		try {
			this.anInt901 = 0;
			this.anInt872 = 0;
			this.method632(arg0, arg1);
			this.method683(arg0, arg1);
			this.method631(arg0, arg1);
			this.method650(arg1, arg0);
			@Pc(36) int local36;
			for (@Pc(29) int local29 = 0; local29 < this.anInt901; local29++) {
				local36 = this.anIntArray223[local29];
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local36].anInt304 != anInt903) {
					this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local36] = null;
				}
			}
			@Pc(57) int local57 = arg0 + 0;
			if (arg1.anInt153 != local57) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.anInt153 + " psize:" + local57);
				throw new RuntimeException("eek");
			}
			for (local36 = 0; local36 < this.anInt871; local36++) {
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray213[local36]] == null) {
					signlink.reporterror(this.aString28 + " null entry in pl list - pos:" + local36 + " size:" + this.anInt871);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("29865, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method616(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			if (super.anInt857 == 1) {
				if (super.anInt858 >= 6 && super.anInt858 <= 106 && super.anInt859 >= 467 && super.anInt859 <= 499) {
					this.anInt1026 = (this.anInt1026 + 1) % 4;
					this.aBoolean269 = true;
					this.aBoolean232 = true;
					this.aClass1_Sub1_Sub2_8.method48(55);
					this.aClass1_Sub1_Sub2_8.method49(this.anInt1026);
					this.aClass1_Sub1_Sub2_8.method49(this.anInt900);
					this.aClass1_Sub1_Sub2_8.method49(this.anInt893);
				}
				if (super.anInt858 >= 135 && super.anInt858 <= 235 && super.anInt859 >= 467 && super.anInt859 <= 499) {
					this.anInt900 = (this.anInt900 + 1) % 3;
					this.aBoolean269 = true;
					this.aBoolean232 = true;
					this.aClass1_Sub1_Sub2_8.method48(55);
					this.aClass1_Sub1_Sub2_8.method49(this.anInt1026);
					this.aClass1_Sub1_Sub2_8.method49(this.anInt900);
					this.aClass1_Sub1_Sub2_8.method49(this.anInt893);
				}
				if (super.anInt858 >= 273 && super.anInt858 <= 373 && super.anInt859 >= 467 && super.anInt859 <= 499) {
					this.anInt893 = (this.anInt893 + 1) % 3;
					this.aBoolean269 = true;
					this.aBoolean232 = true;
					this.aClass1_Sub1_Sub2_8.method48(55);
					this.aClass1_Sub1_Sub2_8.method49(this.anInt1026);
					this.aClass1_Sub1_Sub2_8.method49(this.anInt900);
					this.aClass1_Sub1_Sub2_8.method49(this.anInt893);
				}
				if (super.anInt858 >= 412 && super.anInt858 <= 512 && super.anInt859 >= 467 && super.anInt859 <= 499) {
					if (this.anInt1053 == -1) {
						this.method678();
						this.aString27 = "";
						this.aBoolean251 = false;
						for (@Pc(188) int local188 = 0; local188 < Class32.aClass32Array1.length; local188++) {
							if (Class32.aClass32Array1[local188] != null && Class32.aClass32Array1[local188].anInt607 == 600) {
								this.anInt895 = this.anInt1053 = Class32.aClass32Array1[local188].anInt592;
								return;
							}
						}
						return;
					}
					this.method624("Please close the interface you have open before using 'report abuse'", "", 0);
					return;
				}
			}
		} catch (@Pc(224) RuntimeException local224) {
			signlink.reporterror("22285, " + arg0 + ", " + local224.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method617() {
		try {
			if (this.aClass12_3 == null) {
				super.aClass12_2 = null;
				this.aClass12_27 = null;
				this.aClass12_25 = null;
				this.aClass12_24 = null;
				this.aClass12_26 = null;
				this.aClass12_12 = null;
				this.aClass12_13 = null;
				this.aClass12_14 = null;
				this.aClass12_6 = new Class12(this.method579(), -4368, 265, 128);
				Class1_Sub1_Sub3.method512();
				this.aClass12_7 = new Class12(this.method579(), -4368, 265, 128);
				Class1_Sub1_Sub3.method512();
				this.aClass12_3 = new Class12(this.method579(), -4368, 171, 509);
				Class1_Sub1_Sub3.method512();
				this.aClass12_4 = new Class12(this.method579(), -4368, 132, 360);
				Class1_Sub1_Sub3.method512();
				this.aClass12_5 = new Class12(this.method579(), -4368, 200, 360);
				Class1_Sub1_Sub3.method512();
				this.aClass12_8 = new Class12(this.method579(), -4368, 238, 202);
				Class1_Sub1_Sub3.method512();
				this.aClass12_9 = new Class12(this.method579(), -4368, 238, 203);
				Class1_Sub1_Sub3.method512();
				this.aClass12_10 = new Class12(this.method579(), -4368, 94, 74);
				Class1_Sub1_Sub3.method512();
				this.aClass12_11 = new Class12(this.method579(), -4368, 94, 75);
				Class1_Sub1_Sub3.method512();
				if (this.aClass42_1 != null) {
					this.method665();
					this.method667();
				}
				this.aBoolean231 = true;
			}
		} catch (@Pc(170) RuntimeException local170) {
			signlink.reporterror("61842, " + 5 + ", " + local170.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method618(@OriginalArg(0) int arg0) {
		try {
			@Pc(9) Class32 local9 = Class32.aClass32Array1[arg0];
			for (@Pc(11) int local11 = 0; local11 < local9.anIntArray141.length && local9.anIntArray141[local11] != -1; local11++) {
				@Pc(26) Class32 local26 = Class32.aClass32Array1[local9.anIntArray141[local11]];
				if (local26.anInt618 == 1) {
					this.method618(local26.anInt587);
				}
				local26.anInt619 = 0;
				local26.anInt596 = 0;
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("8592, " + arg0 + ", " + 314 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method619(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString21 = "";
				this.aString22 = "Connecting to server...";
				this.method709(true);
			}
			this.aClass36_1 = new Class36(this.method593(anInt971 + 43594), this, this.aByte41);
			@Pc(31) long local31 = Class49.method563(arg0);
			@Pc(38) int local38 = (int) (local31 >> 16 & 0x1FL);
			this.aClass1_Sub1_Sub2_8.anInt153 = 0;
			this.aClass1_Sub1_Sub2_8.method49(14);
			this.aClass1_Sub1_Sub2_8.method49(local38);
			this.aClass36_1.method429(this.aClass1_Sub1_Sub2_8.aByteArray1, 2, this.anInt906);
			for (@Pc(62) int local62 = 0; local62 < 8; local62++) {
				this.aClass36_1.method426();
			}
			@Pc(76) int local76 = this.aClass36_1.method426();
			@Pc(78) int local78 = local76;
			@Pc(227) int local227;
			@Pc(261) int local261;
			if (local76 == 0) {
				this.aClass36_1.method428(this.aClass1_Sub1_Sub2_7.aByteArray1, 0, 8);
				this.aClass1_Sub1_Sub2_7.anInt153 = 0;
				this.aLong29 = this.aClass1_Sub1_Sub2_7.method65();
				@Pc(101) int[] local101 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong29 >> 32), (int) this.aLong29 };
				this.aClass1_Sub1_Sub2_8.anInt153 = 0;
				this.aClass1_Sub1_Sub2_8.method49(10);
				this.aClass1_Sub1_Sub2_8.method53(local101[0]);
				this.aClass1_Sub1_Sub2_8.method53(local101[1]);
				this.aClass1_Sub1_Sub2_8.method53(local101[2]);
				this.aClass1_Sub1_Sub2_8.method53(local101[3]);
				this.aClass1_Sub1_Sub2_8.method53(signlink.anInt1082);
				this.aClass1_Sub1_Sub2_8.method56(arg0);
				this.aClass1_Sub1_Sub2_8.method56(arg1);
				this.aClass1_Sub1_Sub2_8.method74(aBigInteger1, (byte) 3, aBigInteger2);
				this.aClass1_Sub1_Sub2_9.anInt153 = 0;
				if (arg2) {
					this.aClass1_Sub1_Sub2_9.method49(18);
				} else {
					this.aClass1_Sub1_Sub2_9.method49(16);
				}
				this.aClass1_Sub1_Sub2_9.method49(this.aClass1_Sub1_Sub2_8.anInt153 + 36 + 1 + 1 + 2);
				this.aClass1_Sub1_Sub2_9.method49(255);
				this.aClass1_Sub1_Sub2_9.method50(332);
				this.aClass1_Sub1_Sub2_9.method49(aBoolean247 ? 1 : 0);
				for (local227 = 0; local227 < 9; local227++) {
					this.aClass1_Sub1_Sub2_9.method53(this.anIntArray240[local227]);
				}
				this.aClass1_Sub1_Sub2_9.method57(this.aClass1_Sub1_Sub2_8.anInt153, this.aClass1_Sub1_Sub2_8.aByteArray1);
				this.aClass1_Sub1_Sub2_8.aClass37_1 = new Class37(local101, true);
				for (local261 = 0; local261 < 4; local261++) {
					local101[local261] += 50;
				}
				this.aClass37_2 = new Class37(local101, true);
				this.aClass36_1.method429(this.aClass1_Sub1_Sub2_9.aByteArray1, this.aClass1_Sub1_Sub2_9.anInt153, this.anInt906);
				local76 = this.aClass36_1.method426();
			}
			if (local76 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(304) Exception local304) {
				}
				this.method619(arg0, arg1, arg2);
			} else {
				@Pc(392) int local392;
				if (local76 == 2) {
					this.anInt981 = this.aClass36_1.method426();
					aBoolean260 = this.aClass36_1.method426() == 1;
					this.aLong31 = 0L;
					this.anInt912 = 0;
					this.aClass14_1.anInt235 = 0;
					super.aBoolean222 = true;
					this.aBoolean233 = true;
					this.aBoolean264 = true;
					this.aClass1_Sub1_Sub2_8.anInt153 = 0;
					this.aClass1_Sub1_Sub2_7.anInt153 = 0;
					this.anInt921 = -1;
					this.anInt937 = -1;
					this.anInt938 = -1;
					this.anInt939 = -1;
					this.anInt920 = 0;
					this.anInt922 = 0;
					this.anInt1052 = 0;
					this.anInt924 = 0;
					this.anInt1023 = 0;
					this.anInt949 = 0;
					this.aBoolean259 = false;
					super.anInt850 = 0;
					for (local392 = 0; local392 < 100; local392++) {
						this.aStringArray9[local392] = null;
					}
					this.anInt950 = 0;
					this.anInt942 = 0;
					this.anInt966 = 0;
					this.anInt904 = 0;
					this.anInt1072 = (int) (Math.random() * 100.0D) - 50;
					this.anInt1076 = (int) (Math.random() * 110.0D) - 55;
					this.anInt1033 = (int) (Math.random() * 80.0D) - 40;
					this.anInt973 = (int) (Math.random() * 120.0D) - 60;
					this.anInt954 = (int) (Math.random() * 30.0D) - 20;
					this.anInt984 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt1063 = 0;
					this.anInt1067 = -1;
					this.anInt888 = 0;
					this.anInt889 = 0;
					this.anInt871 = 0;
					this.anInt988 = 0;
					for (local227 = 0; local227 < this.anInt869; local227++) {
						this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local227] = null;
						this.aClass1_Sub1_Sub2Array1[local227] = null;
					}
					for (local261 = 0; local261 < 16384; local261++) {
						this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local261] = null;
					}
					aClass1_Sub1_Sub1_Sub1_Sub2_1 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anInt870] = new Class1_Sub1_Sub1_Sub1_Sub2();
					this.aClass7_11.method104();
					this.aClass7_10.method104();
					@Pc(537) int local537;
					@Pc(541) int local541;
					for (@Pc(533) int local533 = 0; local533 < 4; local533++) {
						for (local537 = 0; local537 < 104; local537++) {
							for (local541 = 0; local541 < 104; local541++) {
								this.aClass7ArrayArrayArray1[local533][local537][local541] = null;
							}
						}
					}
					this.aClass7_12 = new Class7(anInt972);
					this.anInt1001 = 0;
					this.anInt1000 = 0;
					this.anInt982 = -1;
					this.anInt1065 = -1;
					this.anInt1053 = -1;
					this.anInt960 = -1;
					this.anInt1006 = -1;
					this.anInt928 = -1;
					this.aBoolean257 = false;
					this.anInt866 = 3;
					this.anInt925 = 0;
					this.aBoolean259 = false;
					this.aBoolean225 = false;
					this.aString20 = null;
					this.anInt1049 = 0;
					this.anInt1048 = -1;
					this.aBoolean261 = true;
					this.method641(932);
					for (local537 = 0; local537 < 5; local537++) {
						this.anIntArray232[local537] = 0;
					}
					for (local541 = 0; local541 < 5; local541++) {
						this.aStringArray11[local541] = null;
						this.aBooleanArray11[local541] = false;
					}
					anInt911 = 0;
					anInt935 = 0;
					anInt1078 = 0;
					anInt987 = 0;
					anInt990 = 0;
					this.method685(this.aBoolean254);
				} else if (local76 == 3) {
					this.aString21 = "";
					this.aString22 = "Invalid username or password.";
				} else if (local76 == 4) {
					this.aString21 = "Your account has been disabled.";
					this.aString22 = "Please check your message-centre for details.";
				} else if (local76 == 5) {
					this.aString21 = "Your account is already logged in.";
					this.aString22 = "Try again in 60 secs...";
				} else if (local76 == 6) {
					this.aString21 = "RuneScape has been updated!";
					this.aString22 = "Please reload this page.";
				} else if (local76 == 7) {
					this.aString21 = "This world is full.";
					this.aString22 = "Please use a different world.";
				} else if (local76 == 8) {
					this.aString21 = "Unable to connect.";
					this.aString22 = "Login server offline.";
				} else if (local76 == 9) {
					this.aString21 = "Login limit exceeded.";
					this.aString22 = "Too many connections from your address.";
				} else if (local76 == 10) {
					this.aString21 = "Unable to connect.";
					this.aString22 = "Bad session id.";
				} else if (local76 == 11) {
					this.aString21 = "Login server rejected session.";
					this.aString22 = "Please try again.";
				} else if (local76 == 12) {
					this.aString21 = "You need a members account to login to this world.";
					this.aString22 = "Please subscribe, or use a different world.";
				} else if (local76 == 13) {
					this.aString21 = "Could not complete login.";
					this.aString22 = "Please try using a different world.";
				} else if (local76 == 14) {
					this.aString21 = "The server is being updated.";
					this.aString22 = "Please wait 1 minute and try again.";
				} else if (local76 == 15) {
					this.aBoolean264 = true;
					this.aClass1_Sub1_Sub2_8.anInt153 = 0;
					this.aClass1_Sub1_Sub2_7.anInt153 = 0;
					this.anInt921 = -1;
					this.anInt937 = -1;
					this.anInt938 = -1;
					this.anInt939 = -1;
					this.anInt920 = 0;
					this.anInt922 = 0;
					this.anInt1052 = 0;
					this.anInt949 = 0;
					this.aBoolean259 = false;
					this.aLong30 = System.currentTimeMillis();
				} else if (local76 == 16) {
					this.aString21 = "Login attempts exceeded.";
					this.aString22 = "Please wait 1 minute and try again.";
				} else if (local76 == 17) {
					this.aString21 = "You are standing in a members-only area.";
					this.aString22 = "To play on this world move to a free area first";
				} else if (local76 == 20) {
					this.aString21 = "Invalid loginserver requested";
					this.aString22 = "Please try using a different world.";
				} else if (local76 == 21) {
					local392 = this.aClass36_1.method426();
					for (@Pc(883) int local883 = local392 + 3; local883 >= 0; local883--) {
						this.aString21 = "You have only just left another world";
						this.aString22 = "Your profile will be transferred in: " + local883;
						this.method709(true);
						try {
							Thread.sleep(1200L);
						} catch (@Pc(905) Exception local905) {
						}
					}
					this.method619(arg0, arg1, arg2);
				} else if (local76 == 22) {
					this.aString21 = "Malformed login packet.";
					this.aString22 = "Please try again.";
				} else if (local76 != -1) {
					System.out.println("response:" + local76);
					this.aString21 = "Unexpected server response";
					this.aString22 = "Please try using a different world.";
				} else if (local78 != 0) {
					this.aString21 = "No response from server";
					this.aString22 = "Please try using a different world.";
				} else if (this.anInt909 < 2) {
					try {
						Thread.sleep(2000L);
					} catch (@Pc(937) Exception local937) {
					}
					this.anInt909++;
					this.method619(arg0, arg1, arg2);
				} else {
					this.aString21 = "No response from loginserver";
					this.aString22 = "Please wait 1 minute and try again.";
				}
			}
		} catch (@Pc(980) IOException local980) {
			this.aString21 = "";
			this.aString22 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method620(@OriginalArg(0) int arg0) {
		try {
			for (@Pc(3) int local3 = -1; local3 < this.anInt871; local3++) {
				@Pc(11) int local11;
				if (local3 == -1) {
					local11 = this.anInt870;
				} else {
					local11 = this.anIntArray213[local3];
				}
				@Pc(23) Class1_Sub1_Sub1_Sub1_Sub2 local23 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local11];
				if (local23 != null) {
					this.method670(1, local23);
				}
			}
			anInt1005++;
			@Pc(43) boolean local43 = false;
			if (anInt1005 > 198) {
				anInt1005 = 0;
				this.aClass1_Sub1_Sub2_8.method48(152);
				this.aClass1_Sub1_Sub2_8.method49(137);
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("26567, " + arg0 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
	private void method621(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt1004 >= 100) {
					this.method624("Your ignore list is full. Max of 100 hit", "", 0);
				} else {
					@Pc(23) String local23 = Class49.method567(Class49.method564(arg0));
					for (@Pc(25) int local25 = 0; local25 < this.anInt1004; local25++) {
						if (this.aLongArray3[local25] == arg0) {
							this.method624(local23 + " is already on your ignore list", "", 0);
							return;
						}
					}
					for (@Pc(63) int local63 = 0; local63 < this.anInt1000; local63++) {
						if (this.aLongArray4[local63] == arg0) {
							this.method624("Please remove " + local23 + " from your friend list first", "", 0);
							return;
						}
					}
					this.aLongArray3[this.anInt1004++] = arg0;
					this.aBoolean223 = true;
					this.aClass1_Sub1_Sub2_8.method48(35);
					this.aClass1_Sub1_Sub2_8.method55((byte) 9, arg0);
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("97726, " + 4 + ", " + arg0 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method622(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt1000; local8++) {
					if (this.aLongArray4[local8] == arg0) {
						this.anInt1000--;
						this.aBoolean223 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt1000; local28++) {
							this.aStringArray10[local28] = this.aStringArray10[local28 + 1];
							this.anIntArray225[local28] = this.anIntArray225[local28 + 1];
							this.aLongArray4[local28] = this.aLongArray4[local28 + 1];
						}
						this.aClass1_Sub1_Sub2_8.method48(215);
						this.aClass1_Sub1_Sub2_8.method55((byte) 9, arg0);
						break;
					}
				}
			}
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("57111, " + arg0 + ", " + 44593 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method575() {
		try {
			if (!this.aBoolean235 && !this.aBoolean234 && !this.aBoolean255) {
				anInt903++;
				if (this.aBoolean264) {
					this.method692();
				} else {
					this.method609();
				}
				this.method603();
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("64428, " + 4 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method623() {
		try {
			if (this.anInt966 == 2) {
				for (@Pc(16) Class1_Sub3 local16 = (Class1_Sub3) this.aClass7_12.method100(); local16 != null; local16 = (Class1_Sub3) this.aClass7_12.method102()) {
					if (local16.anInt383 > 0) {
						local16.anInt383--;
					}
					if (local16.anInt383 != 0) {
						if (local16.anInt384 > 0) {
							local16.anInt384--;
						}
						if (local16.anInt384 == 0 && local16.anInt381 >= 1 && local16.anInt382 >= 1 && local16.anInt381 <= 102 && local16.anInt382 <= 102 && (local16.anInt373 < 0 || Class9.method161(local16.anInt373, local16.anInt375))) {
							this.method583(local16.anInt379, local16.anInt373, local16.anInt382, local16.anInt375, local16.anInt381, local16.anInt374, local16.anInt380);
							local16.anInt384 = -1;
							if (local16.anInt373 == local16.anInt376 && local16.anInt376 == -1) {
								local16.method507();
							} else if (local16.anInt373 == local16.anInt376 && local16.anInt374 == local16.anInt377 && local16.anInt375 == local16.anInt378) {
								local16.method507();
							}
						}
					} else if (local16.anInt376 < 0 || Class9.method161(local16.anInt376, local16.anInt378)) {
						this.method583(local16.anInt379, local16.anInt376, local16.anInt382, local16.anInt378, local16.anInt381, local16.anInt377, local16.anInt380);
						local16.method507();
					}
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("54481, " + -44524 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)V")
	private void method624(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 0 && this.anInt982 != -1) {
				this.aString20 = arg0;
				super.anInt857 = 0;
			}
			if (this.anInt1065 == -1) {
				this.aBoolean232 = true;
			}
			for (@Pc(20) int local20 = 99; local20 > 0; local20--) {
				this.anIntArray212[local20] = this.anIntArray212[local20 - 1];
				this.aStringArray8[local20] = this.aStringArray8[local20 - 1];
				this.aStringArray9[local20] = this.aStringArray9[local20 - 1];
			}
			this.anIntArray212[0] = arg2;
			this.aStringArray8[0] = arg1;
			this.aStringArray9[0] = arg0;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("48004, " + arg0 + ", " + arg1 + ", " + 2 + ", " + arg2 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method625() {
		try {
			@Pc(6) int local6 = this.anInt1007 * 128 + 64;
			@Pc(13) int local13 = this.anInt1008 * 128 + 64;
			@Pc(24) int local24 = this.method696(local6, this.anInt961, local13) - this.anInt1009;
			if (this.anInt1028 < local6) {
				this.anInt1028 += this.anInt1010 + (local6 - this.anInt1028) * this.anInt1011 / 1000;
				if (this.anInt1028 > local6) {
					this.anInt1028 = local6;
				}
			}
			if (this.anInt1028 > local6) {
				this.anInt1028 -= this.anInt1010 + (this.anInt1028 - local6) * this.anInt1011 / 1000;
				if (this.anInt1028 < local6) {
					this.anInt1028 = local6;
				}
			}
			if (this.anInt1029 < local24) {
				this.anInt1029 += this.anInt1010 + (local24 - this.anInt1029) * this.anInt1011 / 1000;
				if (this.anInt1029 > local24) {
					this.anInt1029 = local24;
				}
			}
			if (this.anInt1029 > local24) {
				this.anInt1029 -= this.anInt1010 + (this.anInt1029 - local24) * this.anInt1011 / 1000;
				if (this.anInt1029 < local24) {
					this.anInt1029 = local24;
				}
			}
			if (this.anInt1030 < local13) {
				this.anInt1030 += this.anInt1010 + (local13 - this.anInt1030) * this.anInt1011 / 1000;
				if (this.anInt1030 > local13) {
					this.anInt1030 = local13;
				}
			}
			if (this.anInt1030 > local13) {
				this.anInt1030 -= this.anInt1010 + (this.anInt1030 - local13) * this.anInt1011 / 1000;
				if (this.anInt1030 < local13) {
					this.anInt1030 = local13;
				}
			}
			local6 = this.anInt1043 * 128 + 64;
			local13 = this.anInt1044 * 128 + 64;
			local24 = this.method696(local6, this.anInt961, local13) - this.anInt1045;
			@Pc(233) int local233 = local6 - this.anInt1028;
			@Pc(238) int local238 = local24 - this.anInt1029;
			@Pc(243) int local243 = local13 - this.anInt1030;
			@Pc(254) int local254 = (int) Math.sqrt((double) (local233 * local233 + local243 * local243));
			@Pc(265) int local265 = (int) (Math.atan2((double) local238, (double) local254) * 325.949D) & 0x7FF;
			@Pc(276) int local276 = (int) (Math.atan2((double) local233, (double) local243) * -325.949D) & 0x7FF;
			if (local265 < 128) {
				local265 = 128;
			}
			if (local265 > 383) {
				local265 = 383;
			}
			if (this.anInt1031 < local265) {
				this.anInt1031 += this.anInt1046 + (local265 - this.anInt1031) * this.anInt1047 / 1000;
				if (this.anInt1031 > local265) {
					this.anInt1031 = local265;
				}
			}
			if (this.anInt1031 > local265) {
				this.anInt1031 -= this.anInt1046 + (this.anInt1031 - local265) * this.anInt1047 / 1000;
				if (this.anInt1031 < local265) {
					this.anInt1031 = local265;
				}
			}
			@Pc(347) int local347 = local276 - this.anInt1032;
			if (local347 > 1024) {
				local347 -= 2048;
			}
			if (local347 < -1024) {
				local347 += 2048;
			}
			if (local347 > 0) {
				this.anInt1032 += this.anInt1046 + local347 * this.anInt1047 / 1000;
				this.anInt1032 &= 0x7FF;
			}
			if (local347 < 0) {
				this.anInt1032 -= this.anInt1046 + -local347 * this.anInt1047 / 1000;
				this.anInt1032 &= 0x7FF;
			}
			@Pc(405) int local405 = local276 - this.anInt1032;
			if (local405 > 1024) {
				local405 -= 2048;
			}
			if (local405 < -1024) {
				local405 += 2048;
			}
			if (local405 < 0 && local347 > 0 || local405 > 0 && local347 < 0) {
				this.anInt1032 = local276;
			}
		} catch (@Pc(426) RuntimeException local426) {
			signlink.reporterror("44248, " + 31346 + ", " + local426.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method627() {
		try {
			this.aBoolean244 = true;
			try {
				@Pc(9) long local9 = System.currentTimeMillis();
				@Pc(11) int local11 = 0;
				@Pc(13) int local13 = 20;
				while (this.aBoolean240) {
					this.anInt873++;
					this.method679();
					this.method679();
					this.method704();
					local11++;
					if (local11 > 10) {
						@Pc(36) long local36 = System.currentTimeMillis();
						@Pc(45) int local45 = (int) (local36 - local9) / 10 - local13;
						local13 = 40 - local45;
						if (local13 < 5) {
							local13 = 5;
						}
						local11 = 0;
						local9 = local36;
					}
					try {
						Thread.sleep((long) local13);
					} catch (@Pc(63) Exception local63) {
					}
				}
			} catch (@Pc(69) Exception local69) {
			}
			this.aBoolean244 = false;
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("43578, " + false + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method628() {
		try {
			if (this.anInt980 != 0) {
				@Pc(8) Class1_Sub1_Sub3_Sub3 local8 = this.aClass1_Sub1_Sub3_Sub3_3;
				@Pc(10) int local10 = 0;
				if (this.anInt1052 != 0) {
					local10 = 1;
				}
				for (@Pc(22) int local22 = 0; local22 < 100; local22++) {
					if (this.aStringArray9[local22] != null) {
						@Pc(34) int local34 = this.anIntArray212[local22];
						@Pc(39) String local39 = this.aStringArray8[local22];
						@Pc(41) byte local41 = 0;
						if (local39 != null && local39.startsWith("@cr1@")) {
							local39 = local39.substring(5);
							local41 = 1;
						}
						if (local39 != null && local39.startsWith("@cr2@")) {
							local39 = local39.substring(5);
							local41 = 2;
						}
						@Pc(93) int local93;
						if ((local34 == 3 || local34 == 7) && (local34 == 7 || this.anInt900 == 0 || this.anInt900 == 1 && this.method660(this.aBoolean252, local39))) {
							local93 = 329 - local10 * 13;
							local8.method229("From", 4, 0, 619, local93);
							local8.method229("From", 4, 65535, 619, local93 - 1);
							@Pc(118) int local118 = local8.method227("From ") + 4;
							if (local41 == 1) {
								this.aClass1_Sub1_Sub3_Sub2Array3[0].method208(local118, local93 - 12);
								local118 += 14;
							}
							if (local41 == 2) {
								this.aClass1_Sub1_Sub3_Sub2Array3[1].method208(local118, local93 - 12);
								local118 += 14;
							}
							local8.method229(local39 + ": " + this.aStringArray9[local22], local118, 0, 619, local93);
							local8.method229(local39 + ": " + this.aStringArray9[local22], local118, 65535, 619, local93 - 1);
							local10++;
							if (local10 >= 5) {
								return;
							}
						}
						if (local34 == 5 && this.anInt900 < 2) {
							local93 = 329 - local10 * 13;
							local8.method229(this.aStringArray9[local22], 4, 0, 619, local93);
							local8.method229(this.aStringArray9[local22], 4, 65535, 619, local93 - 1);
							local10++;
							if (local10 >= 5) {
								return;
							}
						}
						if (local34 == 6 && this.anInt900 < 2) {
							local93 = 329 - local10 * 13;
							local8.method229("To " + local39 + ": " + this.aStringArray9[local22], 4, 0, 619, local93);
							local8.method229("To " + local39 + ": " + this.aStringArray9[local22], 4, 65535, 619, local93 - 1);
							local10++;
							if (local10 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(297) RuntimeException local297) {
			signlink.reporterror("43070, " + -893 + ", " + local297.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!OPFNUBIN;IIIII)V")
	private void method629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg2.anInt618 == 0 && arg2.anIntArray141 != null && !arg2.aBoolean157 && (arg3 >= arg1 && arg6 >= arg5 && arg3 <= arg1 + arg2.anInt593 && arg6 <= arg5 + arg2.anInt598)) {
				@Pc(34) int local34 = arg2.anIntArray141.length;
				this.anInt920 += 0;
				for (@Pc(42) int local42 = 0; local42 < local34; local42++) {
					@Pc(51) int local51 = arg2.anIntArray147[local42] + arg1;
					@Pc(60) int local60 = arg2.anIntArray143[local42] + arg5 - arg4;
					@Pc(67) Class32 local67 = Class32.aClass32Array1[arg2.anIntArray141[local42]];
					@Pc(72) int local72 = local51 + local67.anInt616;
					@Pc(77) int local77 = local60 + local67.anInt615;
					if ((local67.anInt588 >= 0 || local67.anInt597 != 0) && arg3 >= local72 && arg6 >= local77 && arg3 < local72 + local67.anInt593 && arg6 < local77 + local67.anInt598) {
						if (local67.anInt588 >= 0) {
							this.anInt994 = local67.anInt588;
						} else {
							this.anInt994 = local67.anInt587;
						}
					}
					if (local67.anInt618 == 8 && arg3 >= local72 && arg6 >= local77 && arg3 < local72 + local67.anInt593 && arg6 < local77 + local67.anInt598) {
						this.anInt1016 = local67.anInt587;
					}
					if (local67.anInt618 == 0) {
						this.method629(arg0, local72, local67, arg3, local67.anInt613, local77, arg6);
						if (local67.anInt612 > local67.anInt598) {
							this.method657(local67, arg3, local77, local67.anInt598, local72 + local67.anInt593, arg0, arg6, local67.anInt612);
						}
					} else {
						if (local67.anInt606 == 1 && arg3 >= local72 && arg6 >= local77 && arg3 < local72 + local67.anInt593 && arg6 < local77 + local67.anInt598) {
							@Pc(201) boolean local201 = false;
							if (local67.anInt607 != 0) {
								local201 = this.method602(local67, this.aBoolean224);
							}
							if (!local201) {
								this.aStringArray12[this.anInt949] = local67.aString9;
								this.anIntArray250[this.anInt949] = 82;
								this.anIntArray249[this.anInt949] = local67.anInt587;
								this.anInt949++;
							}
						}
						if (local67.anInt606 == 2 && this.anInt942 == 0 && arg3 >= local72 && arg6 >= local77 && arg3 < local72 + local67.anInt593 && arg6 < local77 + local67.anInt598) {
							@Pc(266) String local266 = local67.aString12;
							if (local266.indexOf(" ") != -1) {
								local266 = local266.substring(0, local266.indexOf(" "));
							}
							this.aStringArray12[this.anInt949] = local266 + " @gre@" + local67.aString11;
							this.anIntArray250[this.anInt949] = 542;
							this.anIntArray249[this.anInt949] = local67.anInt587;
							this.anInt949++;
						}
						if (local67.anInt606 == 3 && arg3 >= local72 && arg6 >= local77 && arg3 < local72 + local67.anInt593 && arg6 < local77 + local67.anInt598) {
							this.aStringArray12[this.anInt949] = "Close";
							this.anIntArray250[this.anInt949] = 635;
							this.anIntArray249[this.anInt949] = local67.anInt587;
							this.anInt949++;
						}
						if (local67.anInt606 == 4 && arg3 >= local72 && arg6 >= local77 && arg3 < local72 + local67.anInt593 && arg6 < local77 + local67.anInt598) {
							this.aStringArray12[this.anInt949] = local67.aString9;
							this.anIntArray250[this.anInt949] = 293;
							this.anIntArray249[this.anInt949] = local67.anInt587;
							this.anInt949++;
						}
						if (local67.anInt606 == 5 && arg3 >= local72 && arg6 >= local77 && arg3 < local72 + local67.anInt593 && arg6 < local77 + local67.anInt598) {
							this.aStringArray12[this.anInt949] = local67.aString9;
							this.anIntArray250[this.anInt949] = 754;
							this.anIntArray249[this.anInt949] = local67.anInt587;
							this.anInt949++;
						}
						if (local67.anInt606 == 6 && !this.aBoolean257 && arg3 >= local72 && arg6 >= local77 && arg3 < local72 + local67.anInt593 && arg6 < local77 + local67.anInt598) {
							this.aStringArray12[this.anInt949] = local67.aString9;
							this.anIntArray250[this.anInt949] = 71;
							this.anIntArray249[this.anInt949] = local67.anInt587;
							this.anInt949++;
						}
						if (local67.anInt618 == 2) {
							@Pc(514) int local514 = 0;
							for (@Pc(516) int local516 = 0; local516 < local67.anInt598; local516++) {
								for (@Pc(520) int local520 = 0; local520 < local67.anInt593; local520++) {
									@Pc(531) int local531 = local72 + local520 * (local67.anInt594 + 32);
									@Pc(540) int local540 = local77 + local516 * (local67.anInt589 + 32);
									if (local514 < 20) {
										local531 += local67.anIntArray139[local514];
										local540 += local67.anIntArray144[local514];
									}
									if (arg3 >= local531 && arg6 >= local540 && arg3 < local531 + 32 && arg6 < local540 + 32) {
										this.anInt1041 = local514;
										this.anInt1042 = local67.anInt587;
										if (local67.anIntArray142[local514] > 0) {
											@Pc(593) Class23 local593 = Class23.method286(local67.anIntArray142[local514] - 1);
											if (this.anInt950 == 1 && local67.aBoolean150) {
												if (local67.anInt587 != this.anInt952 || local514 != this.anInt951) {
													this.aStringArray12[this.anInt949] = "Use " + this.aString25 + " with @lre@" + local593.aString6;
													this.anIntArray250[this.anInt949] = 751;
													this.anIntArray251[this.anInt949] = local593.anInt445;
													this.anIntArray248[this.anInt949] = local514;
													this.anIntArray249[this.anInt949] = local67.anInt587;
													this.anInt949++;
												}
											} else if (this.anInt942 != 1 || !local67.aBoolean150) {
												@Pc(730) int local730;
												if (local67.aBoolean150) {
													for (local730 = 4; local730 >= 3; local730--) {
														if (local593.aStringArray2 != null && local593.aStringArray2[local730] != null) {
															this.aStringArray12[this.anInt949] = local593.aStringArray2[local730] + " @lre@" + local593.aString6;
															if (local730 == 3) {
																this.anIntArray250[this.anInt949] = 471;
															}
															if (local730 == 4) {
																this.anIntArray250[this.anInt949] = 694;
															}
															this.anIntArray251[this.anInt949] = local593.anInt445;
															this.anIntArray248[this.anInt949] = local514;
															this.anIntArray249[this.anInt949] = local67.anInt587;
															this.anInt949++;
														} else if (local730 == 4) {
															this.aStringArray12[this.anInt949] = "Drop @lre@" + local593.aString6;
															this.anIntArray250[this.anInt949] = 694;
															this.anIntArray251[this.anInt949] = local593.anInt445;
															this.anIntArray248[this.anInt949] = local514;
															this.anIntArray249[this.anInt949] = local67.anInt587;
															this.anInt949++;
														}
													}
												}
												if (local67.aBoolean155) {
													this.aStringArray12[this.anInt949] = "Use @lre@" + local593.aString6;
													this.anIntArray250[this.anInt949] = 34;
													this.anIntArray251[this.anInt949] = local593.anInt445;
													this.anIntArray248[this.anInt949] = local514;
													this.anIntArray249[this.anInt949] = local67.anInt587;
													this.anInt949++;
												}
												if (local67.aBoolean150 && local593.aStringArray2 != null) {
													for (local730 = 2; local730 >= 0; local730--) {
														if (local593.aStringArray2[local730] != null) {
															this.aStringArray12[this.anInt949] = local593.aStringArray2[local730] + " @lre@" + local593.aString6;
															if (local730 == 0) {
																this.anIntArray250[this.anInt949] = 766;
															}
															if (local730 == 1) {
																this.anIntArray250[this.anInt949] = 406;
															}
															if (local730 == 2) {
																this.anIntArray250[this.anInt949] = 263;
															}
															this.anIntArray251[this.anInt949] = local593.anInt445;
															this.anIntArray248[this.anInt949] = local514;
															this.anIntArray249[this.anInt949] = local67.anInt587;
															this.anInt949++;
														}
													}
												}
												if (local67.aStringArray6 != null) {
													for (local730 = 4; local730 >= 0; local730--) {
														if (local67.aStringArray6[local730] != null) {
															this.aStringArray12[this.anInt949] = local67.aStringArray6[local730] + " @lre@" + local593.aString6;
															if (local730 == 0) {
																this.anIntArray250[this.anInt949] = 607;
															}
															if (local730 == 1) {
																this.anIntArray250[this.anInt949] = 48;
															}
															if (local730 == 2) {
																this.anIntArray250[this.anInt949] = 615;
															}
															if (local730 == 3) {
																this.anIntArray250[this.anInt949] = 500;
															}
															if (local730 == 4) {
																this.anIntArray250[this.anInt949] = 534;
															}
															this.anIntArray251[this.anInt949] = local593.anInt445;
															this.anIntArray248[this.anInt949] = local514;
															this.anIntArray249[this.anInt949] = local67.anInt587;
															this.anInt949++;
														}
													}
												}
												this.aStringArray12[this.anInt949] = "Examine @lre@" + local593.aString6;
												this.anIntArray250[this.anInt949] = 1881;
												this.anIntArray251[this.anInt949] = local593.anInt445;
												this.anIntArray248[this.anInt949] = local514;
												this.anIntArray249[this.anInt949] = local67.anInt587;
												this.anInt949++;
											} else if ((this.anInt944 & 0x10) == 16) {
												this.aStringArray12[this.anInt949] = this.aString23 + " @lre@" + local593.aString6;
												this.anIntArray250[this.anInt949] = 233;
												this.anIntArray251[this.anInt949] = local593.anInt445;
												this.anIntArray248[this.anInt949] = local514;
												this.anIntArray249[this.anInt949] = local67.anInt587;
												this.anInt949++;
											}
										}
									}
									local514++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1160) RuntimeException local1160) {
			signlink.reporterror("95651, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + arg5 + ", " + arg6 + ", " + local1160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!OPFNUBIN;B)V")
	private void method630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class32 arg3) {
		try {
			if (arg3.anInt618 == 0 && arg3.anIntArray141 != null && (!arg3.aBoolean157 || this.anInt1064 == arg3.anInt587 || this.anInt868 == arg3.anInt587 || this.anInt1069 == arg3.anInt587)) {
				@Pc(29) int local29 = Class1_Sub1_Sub3.anInt739;
				@Pc(31) int local31 = Class1_Sub1_Sub3.anInt737;
				@Pc(33) int local33 = Class1_Sub1_Sub3.anInt740;
				@Pc(35) int local35 = Class1_Sub1_Sub3.anInt738;
				Class1_Sub1_Sub3.method511(arg0 + arg3.anInt593, arg2 + arg3.anInt598, arg0, arg2);
				@Pc(56) int local56 = arg3.anIntArray141.length;
				for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
					@Pc(67) int local67 = arg3.anIntArray147[local58] + arg0;
					@Pc(76) int local76 = arg3.anIntArray143[local58] + arg2 - arg1;
					@Pc(83) Class32 local83 = Class32.aClass32Array1[arg3.anIntArray141[local58]];
					@Pc(88) int local88 = local67 + local83.anInt616;
					@Pc(93) int local93 = local76 + local83.anInt615;
					if (local83.anInt607 > 0) {
						this.method677(local83);
					}
					if (local83.anInt618 == 0) {
						if (local83.anInt613 > local83.anInt612 - local83.anInt598) {
							local83.anInt613 = local83.anInt612 - local83.anInt598;
						}
						if (local83.anInt613 < 0) {
							local83.anInt613 = 0;
						}
						this.method630(local88, local83.anInt613, local93, local83);
						if (local83.anInt612 > local83.anInt598) {
							this.method663(local93, local83.anInt612, local83.anInt613, local88 + local83.anInt593, local83.anInt598);
						}
					} else if (local83.anInt618 != 1) {
						@Pc(165) int local165;
						@Pc(169) int local169;
						@Pc(180) int local180;
						@Pc(215) int local215;
						@Pc(222) int local222;
						@Pc(247) int local247;
						@Pc(163) int local163;
						@Pc(213) int local213;
						if (local83.anInt618 == 2) {
							local163 = 0;
							for (local165 = 0; local165 < local83.anInt598; local165++) {
								for (local169 = 0; local169 < local83.anInt593; local169++) {
									local180 = local88 + local169 * (local83.anInt594 + 32);
									@Pc(189) int local189 = local93 + local165 * (local83.anInt589 + 32);
									if (local163 < 20) {
										local180 += local83.anIntArray139[local163];
										local189 += local83.anIntArray144[local163];
									}
									if (local83.anIntArray142[local163] > 0) {
										local213 = 0;
										local215 = 0;
										local222 = local83.anIntArray142[local163] - 1;
										if (local180 > Class1_Sub1_Sub3.anInt739 - 32 && local180 < Class1_Sub1_Sub3.anInt740 && local189 > Class1_Sub1_Sub3.anInt737 - 32 && local189 < Class1_Sub1_Sub3.anInt738 || this.anInt885 != 0 && this.anInt884 == local163) {
											local247 = 0;
											if (this.anInt950 == 1 && this.anInt951 == local163 && this.anInt952 == local83.anInt587) {
												local247 = 16777215;
											}
											@Pc(271) Class1_Sub1_Sub3_Sub1 local271 = Class23.method293(local247, local222, local83.anIntArray145[local163], (byte) 7);
											if (local271 != null) {
												@Pc(350) int local350;
												if (this.anInt885 != 0 && this.anInt884 == local163 && this.anInt883 == local83.anInt587) {
													local213 = super.anInt852 - this.anInt886;
													local215 = super.anInt853 - this.anInt887;
													if (local213 < 5 && local213 > -5) {
														local213 = 0;
													}
													if (local215 < 5 && local215 > -5) {
														local215 = 0;
													}
													if (this.anInt878 < 5) {
														local213 = 0;
														local215 = 0;
													}
													local271.method140(local189 + local215, local180 + local213);
													if (local189 + local215 < Class1_Sub1_Sub3.anInt737 && arg3.anInt613 > 0) {
														local350 = this.anInt1003 * (Class1_Sub1_Sub3.anInt737 - local189 - local215) / 3;
														if (local350 > this.anInt1003 * 10) {
															local350 = this.anInt1003 * 10;
														}
														if (local350 > arg3.anInt613) {
															local350 = arg3.anInt613;
														}
														arg3.anInt613 -= local350;
														this.anInt887 += local350;
													}
													if (local189 + local215 + 32 > Class1_Sub1_Sub3.anInt738 && arg3.anInt613 < arg3.anInt612 - arg3.anInt598) {
														local350 = this.anInt1003 * (local189 + local215 + 32 - Class1_Sub1_Sub3.anInt738) / 3;
														if (local350 > this.anInt1003 * 10) {
															local350 = this.anInt1003 * 10;
														}
														if (local350 > arg3.anInt612 - arg3.anInt598 - arg3.anInt613) {
															local350 = arg3.anInt612 - arg3.anInt598 - arg3.anInt613;
														}
														arg3.anInt613 += local350;
														this.anInt887 -= local350;
													}
												} else if (this.anInt1061 != 0 && this.anInt1060 == local163 && this.anInt1059 == local83.anInt587) {
													local271.method140(local189, local180);
												} else {
													local271.method138(local180, local189);
												}
												if (local271.anInt195 == 33 || local83.anIntArray145[local163] != 1) {
													local350 = local83.anIntArray145[local163];
													this.aClass1_Sub1_Sub3_Sub3_2.method229(method700(local350), local180 + local213 + 1, 0, 619, local189 + local215 + 10);
													this.aClass1_Sub1_Sub3_Sub3_2.method229(method700(local350), local180 + local213, 16776960, 619, local189 + local215 + 9);
												}
											}
										}
									} else if (local83.aClass1_Sub1_Sub3_Sub1Array1 != null && local163 < 20) {
										@Pc(539) Class1_Sub1_Sub3_Sub1 local539 = local83.aClass1_Sub1_Sub3_Sub1Array1[local163];
										if (local539 != null) {
											local539.method138(local180, local189);
										}
									}
									local163++;
								}
							}
						} else if (local83.anInt618 == 3) {
							@Pc(565) boolean local565 = false;
							if (this.anInt1069 == local83.anInt587 || this.anInt868 == local83.anInt587 || this.anInt1064 == local83.anInt587) {
								local565 = true;
							}
							if (this.method703(local83, 232)) {
								local163 = local83.anInt609;
								if (local565 && local83.anInt621 != 0) {
									local163 = local83.anInt621;
								}
							} else {
								local163 = local83.anInt605;
								if (local565 && local83.anInt597 != 0) {
									local163 = local83.anInt597;
								}
							}
							if (local83.aByte24 == 0) {
								if (local83.aBoolean156) {
									Class1_Sub1_Sub3.method514(local88, local93, local163, local83.anInt593, local83.anInt598);
								} else {
									Class1_Sub1_Sub3.method515(local83.anInt598, local93, local88, local163, local83.anInt593);
								}
							} else if (local83.aBoolean156) {
								Class1_Sub1_Sub3.method513(local83.anInt598, this.aByte37, local163, local88, local83.anInt593, local93, 256 - (local83.aByte24 & 0xFF));
							} else {
								Class1_Sub1_Sub3.method516(local93, local88, local163, 256 - (local83.aByte24 & 0xFF), local83.anInt593, local83.anInt598);
							}
						} else {
							@Pc(684) Class1_Sub1_Sub3_Sub3 local684;
							@Pc(961) String local961;
							if (local83.anInt618 == 4) {
								local684 = local83.aClass1_Sub1_Sub3_Sub3_1;
								@Pc(687) String local687 = local83.aString13;
								@Pc(689) boolean local689 = false;
								if (this.anInt1069 == local83.anInt587 || this.anInt868 == local83.anInt587 || this.anInt1064 == local83.anInt587) {
									local689 = true;
								}
								if (this.method703(local83, 232)) {
									local165 = local83.anInt609;
									if (local689 && local83.anInt621 != 0) {
										local165 = local83.anInt621;
									}
									if (local83.aString10.length() > 0) {
										local687 = local83.aString10;
									}
								} else {
									local165 = local83.anInt605;
									if (local689 && local83.anInt597 != 0) {
										local165 = local83.anInt597;
									}
								}
								if (local83.anInt606 == 6 && this.aBoolean257) {
									local687 = "Please wait...";
									local165 = local83.anInt605;
								}
								if (Class1_Sub1_Sub3.anInt735 == 479) {
									if (local165 == 16776960) {
										local165 = 255;
									}
									if (local165 == 49152) {
										local165 = 16777215;
									}
								}
								local213 = local93 + local684.anInt290;
								while (local687.length() > 0) {
									if (local687.indexOf("%") != -1) {
										label379: while (true) {
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
																				break label379;
																			}
																			local687 = local687.substring(0, local215) + this.method595(this.method693(4, local83, 353)) + local687.substring(local215 + 2);
																		}
																	}
																	local687 = local687.substring(0, local215) + this.method595(this.method693(3, local83, 353)) + local687.substring(local215 + 2);
																}
															}
															local687 = local687.substring(0, local215) + this.method595(this.method693(2, local83, 353)) + local687.substring(local215 + 2);
														}
													}
													local687 = local687.substring(0, local215) + this.method595(this.method693(1, local83, 353)) + local687.substring(local215 + 2);
												}
											}
											local687 = local687.substring(0, local215) + this.method595(this.method693(0, local83, 353)) + local687.substring(local215 + 2);
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
									if (local83.aBoolean158) {
										local684.method226(local165, local961, 744, local213, local83.aBoolean151, local88 + local83.anInt593 / 2);
									} else {
										local684.method233(local165, local961, local88, local83.aBoolean151, local213);
									}
									local213 += local684.anInt290;
								}
							} else if (local83.anInt618 == 5) {
								@Pc(1023) Class1_Sub1_Sub3_Sub1 local1023;
								if (this.method703(local83, 232)) {
									local1023 = local83.aClass1_Sub1_Sub3_Sub1_1;
								} else {
									local1023 = local83.aClass1_Sub1_Sub3_Sub1_2;
								}
								if (local1023 != null) {
									local1023.method138(local88, local93);
								}
							} else if (local83.anInt618 == 6) {
								local163 = Class1_Sub1_Sub3_Sub4.anInt746;
								local165 = Class1_Sub1_Sub3_Sub4.anInt747;
								Class1_Sub1_Sub3_Sub4.anInt746 = local88 + local83.anInt593 / 2;
								Class1_Sub1_Sub3_Sub4.anInt747 = local93 + local83.anInt598 / 2;
								local169 = Class1_Sub1_Sub3_Sub4.anIntArray179[local83.anInt600] * local83.anInt599 >> 16;
								local180 = Class1_Sub1_Sub3_Sub4.anIntArray180[local83.anInt600] * local83.anInt599 >> 16;
								@Pc(1084) boolean local1084 = this.method703(local83, 232);
								if (local1084) {
									local213 = local83.anInt611;
								} else {
									local213 = local83.anInt610;
								}
								@Pc(1104) Class1_Sub1_Sub1_Sub4 local1104;
								if (local213 == -1) {
									local1104 = local83.method409(local1084, -1, -1);
								} else {
									@Pc(1110) Class21 local1110 = Class21.aClass21Array1[local213];
									local1104 = local83.method409(local1084, local1110.anIntArray69[local83.anInt619], local1110.anIntArray68[local83.anInt619]);
								}
								if (local1104 != null) {
									local1104.method322(local83.anInt601, 0, local83.anInt600, 0, local169, local180);
								}
								Class1_Sub1_Sub3_Sub4.anInt746 = local163;
								Class1_Sub1_Sub3_Sub4.anInt747 = local165;
							} else {
								if (local83.anInt618 == 7) {
									local684 = local83.aClass1_Sub1_Sub3_Sub3_1;
									local165 = 0;
									for (local169 = 0; local169 < local83.anInt598; local169++) {
										for (local180 = 0; local180 < local83.anInt593; local180++) {
											if (local83.anIntArray142[local165] > 0) {
												@Pc(1174) Class23 local1174 = Class23.method286(local83.anIntArray142[local165] - 1);
												@Pc(1177) String local1177 = local1174.aString6;
												if (local1174.aBoolean103 || local83.anIntArray145[local165] != 1) {
													local1177 = local1177 + " x" + method687(local83.anIntArray145[local165]);
												}
												local215 = local88 + local180 * (local83.anInt594 + 115);
												local222 = local93 + local169 * (local83.anInt589 + 12);
												if (local83.aBoolean158) {
													local684.method226(local83.anInt605, local1177, 744, local222, local83.aBoolean151, local215 + local83.anInt593 / 2);
												} else {
													local684.method233(local83.anInt605, local1177, local215, local83.aBoolean151, local222);
												}
											}
											local165++;
										}
									}
								}
								if (local83.anInt618 == 8 && (this.anInt1022 == local83.anInt587 || this.anInt957 == local83.anInt587 || this.anInt890 == local83.anInt587)) {
									local163 = 0;
									local165 = 0;
									@Pc(1287) Class1_Sub1_Sub3_Sub3 local1287 = this.aClass1_Sub1_Sub3_Sub3_3;
									@Pc(1290) String local1290 = local83.aString13;
									while (local1290.length() > 0) {
										local213 = local1290.indexOf("\\n");
										if (local213 == -1) {
											local961 = local1290;
											local1290 = "";
										} else {
											local961 = local1290.substring(0, local213);
											local1290 = local1290.substring(local213 + 2);
										}
										local215 = local1287.method227(local961);
										if (local215 > local163) {
											local163 = local215;
										}
										local165 += local1287.anInt290 + 1;
									}
									local163 += 6;
									local165 += 7;
									local213 = local88 + local83.anInt593 - local163 - 5;
									local215 = local93 + local83.anInt598 + 5;
									if (local213 < local88 + 5) {
										local213 = this.anInt951 + 5;
									}
									Class1_Sub1_Sub3.method514(local213, local215, 16777120, local163, local165);
									Class1_Sub1_Sub3.method515(local165, local215, local213, 0, local163);
									local1290 = local83.aString13;
									local222 = local215 + local1287.anInt290 + 2;
									while (local1290.length() > 0) {
										local247 = local1290.indexOf("\\n");
										if (local247 == -1) {
											local961 = local1290;
											local1290 = "";
										} else {
											local961 = local1290.substring(0, local247);
											local1290 = local1290.substring(local247 + 2);
										}
										local1287.method233(0, local961, local213 + 3, false, local222);
										local222 += local1287.anInt290 + 1;
									}
								}
							}
						}
					}
				}
				Class1_Sub1_Sub3.method511(local33, local35, local29, local31);
			}
		} catch (@Pc(1446) RuntimeException local1446) {
			signlink.reporterror("59400, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -125 + ", " + local1446.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!CFARFRSG;Z)V")
	private void method631(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub2 arg1) {
		try {
			while (true) {
				if (arg1.anInt154 + 10 < arg0 * 8) {
					@Pc(12) int local12 = arg1.method70(881, 11);
					if (local12 != 2047) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12] == null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12] = new Class1_Sub1_Sub1_Sub1_Sub2();
							if (this.aClass1_Sub1_Sub2Array1[local12] != null) {
								this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12].method251(this.aClass1_Sub1_Sub2Array1[local12]);
							}
						}
						this.anIntArray213[this.anInt871++] = local12;
						@Pc(58) Class1_Sub1_Sub1_Sub1_Sub2 local58 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12];
						local58.anInt304 = anInt903;
						@Pc(66) int local66 = arg1.method70(881, 1);
						if (local66 == 1) {
							this.anIntArray214[this.anInt872++] = local12;
						}
						@Pc(85) int local85 = arg1.method70(881, 5);
						if (local85 > 15) {
							local85 -= 32;
						}
						@Pc(94) int local94 = arg1.method70(881, 5);
						if (local94 > 15) {
							local94 -= 32;
						}
						@Pc(103) int local103 = arg1.method70(881, 1);
						local58.method244(local103 == 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray49[0] + local85, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray48[0] + local94);
						continue;
					}
				}
				arg1.method71();
				this.aBoolean264 &= true;
				return;
			}
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("40731, " + arg0 + ", " + arg1 + ", " + true + ", " + local137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IILclient!CFARFRSG;)V")
	private void method632(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub2 arg1) {
		try {
			arg1.method69();
			@Pc(10) int local10 = arg1.method70(881, 1);
			if (local10 != 0) {
				@Pc(18) int local18 = arg1.method70(881, 2);
				if (local18 == 0) {
					this.anIntArray214[this.anInt872++] = this.anInt870;
				} else {
					@Pc(41) int local41;
					@Pc(51) int local51;
					if (local18 == 1) {
						local41 = arg1.method70(881, 3);
						aClass1_Sub1_Sub1_Sub1_Sub2_1.method245(local41, false);
						local51 = arg1.method70(881, 1);
						if (local51 == 1) {
							this.anIntArray214[this.anInt872++] = this.anInt870;
						}
					} else {
						@Pc(95) int local95;
						if (local18 == 2) {
							local41 = arg1.method70(881, 3);
							aClass1_Sub1_Sub1_Sub1_Sub2_1.method245(local41, true);
							local51 = arg1.method70(881, 3);
							aClass1_Sub1_Sub1_Sub1_Sub2_1.method245(local51, true);
							local95 = arg1.method70(881, 1);
							if (local95 == 1) {
								this.anIntArray214[this.anInt872++] = this.anInt870;
							}
						} else if (local18 == 3) {
							local41 = arg1.method70(881, 1);
							local51 = arg1.method70(881, 7);
							local95 = arg1.method70(881, 7);
							@Pc(134) int local134 = arg1.method70(881, 1);
							if (local134 == 1) {
								this.anIntArray214[this.anInt872++] = this.anInt870;
							}
							this.anInt961 = arg1.method70(881, 2);
							aClass1_Sub1_Sub1_Sub1_Sub2_1.method244(local41 == 1, local95, local51);
						}
					}
				}
			}
		} catch (@Pc(168) RuntimeException local168) {
			signlink.reporterror("13456, " + -428 + ", " + arg0 + ", " + arg1 + ", " + local168.toString());
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method633(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			this.aBoolean264 &= arg0;
			if (!aBoolean247) {
				@Pc(18) Class1_Sub1_Sub3_Sub2 local18;
				@Pc(26) int local26;
				@Pc(34) int local34;
				@Pc(37) byte[] local37;
				@Pc(40) byte[] local40;
				@Pc(42) int local42;
				if (Class1_Sub1_Sub3_Sub4.anIntArray183[17] >= arg1) {
					local18 = Class1_Sub1_Sub3_Sub4.aClass1_Sub1_Sub3_Sub2Array1[17];
					local26 = local18.anInt266 * local18.anInt267 - 1;
					local34 = local18.anInt266 * this.anInt1003 * 2;
					local37 = local18.aByteArray2;
					local40 = this.aByteArray21;
					for (local42 = 0; local42 <= local26; local42++) {
						local40[local42] = local37[local42 - local34 & local26];
					}
					local18.aByteArray2 = local40;
					this.aByteArray21 = local37;
					Class1_Sub1_Sub3_Sub4.method528(17);
				}
				if (Class1_Sub1_Sub3_Sub4.anIntArray183[24] >= arg1) {
					local18 = Class1_Sub1_Sub3_Sub4.aClass1_Sub1_Sub3_Sub2Array1[24];
					local26 = local18.anInt266 * local18.anInt267 - 1;
					local34 = local18.anInt266 * this.anInt1003 * 2;
					local37 = local18.aByteArray2;
					local40 = this.aByteArray21;
					for (local42 = 0; local42 <= local26; local42++) {
						local40[local42] = local37[local42 - local34 & local26];
					}
					local18.aByteArray2 = local40;
					this.aByteArray21 = local37;
					Class1_Sub1_Sub3_Sub4.method528(24);
				}
				if (Class1_Sub1_Sub3_Sub4.anIntArray183[34] >= arg1) {
					local18 = Class1_Sub1_Sub3_Sub4.aClass1_Sub1_Sub3_Sub2Array1[34];
					local26 = local18.anInt266 * local18.anInt267 - 1;
					local34 = local18.anInt266 * this.anInt1003 * 2;
					local37 = local18.aByteArray2;
					local40 = this.aByteArray21;
					for (local42 = 0; local42 <= local26; local42++) {
						local40[local42] = local37[local42 - local34 & local26];
					}
					local18.aByteArray2 = local40;
					this.aByteArray21 = local37;
					Class1_Sub1_Sub3_Sub4.method528(34);
					return;
				}
			}
		} catch (@Pc(185) RuntimeException local185) {
			signlink.reporterror("19618, " + arg0 + ", " + arg1 + ", " + local185.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!CFARFRSG;ZI)V")
	private void method634(@OriginalArg(0) Class1_Sub1_Sub2 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt901 = 0;
			this.anInt872 = 0;
			this.method647(arg1, arg0);
			this.method710(arg0, arg1);
			this.method682(arg0, arg1);
			@Pc(40) int local40;
			for (@Pc(33) int local33 = 0; local33 < this.anInt901; local33++) {
				local40 = this.anIntArray223[local33];
				if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local40].anInt304 != anInt903) {
					this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local40].aClass31_1 = null;
					this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local40] = null;
				}
			}
			if (arg0.anInt153 != arg1) {
				signlink.reporterror(this.aString28 + " size mismatch in getnpcpos - pos:" + arg0.anInt153 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local40 = 0; local40 < this.anInt988; local40++) {
				if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray236[local40]] == null) {
					signlink.reporterror(this.aString28 + " null entry in npc list - pos:" + local40 + " size:" + this.anInt988);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("59728, " + arg0 + ", " + false + ", " + arg1 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method635() {
		try {
			this.method628();
			if (this.anInt965 == 1) {
				this.aClass1_Sub1_Sub3_Sub1Array6[this.anInt964 / 100].method138(this.anInt962 - 8 - 4, this.anInt963 - 8 - 4);
			}
			if (this.anInt965 == 2) {
				this.aClass1_Sub1_Sub3_Sub1Array6[this.anInt964 / 100 + 4].method138(this.anInt962 - 8 - 4, this.anInt963 - 8 - 4);
				anInt865++;
				if (anInt865 > 64) {
					anInt865 = 0;
					this.aClass1_Sub1_Sub2_8.method48(109);
				}
			}
			if (this.anInt928 != -1) {
				this.method596(this.anInt1003, this.anInt928);
				this.method630(0, 0, 0, Class32.aClass32Array1[this.anInt928]);
			}
			if (this.anInt1053 != -1) {
				this.method596(this.anInt1003, this.anInt1053);
				this.method630(0, 0, 0, Class32.aClass32Array1[this.anInt1053]);
			}
			this.method636();
			if (!this.aBoolean259) {
				this.method637();
				this.method606();
			} else if (this.anInt915 == 0) {
				this.method587();
			}
			if (this.anInt1049 == 1) {
				this.aClass1_Sub1_Sub3_Sub1Array7[1].method138(472, 296);
			}
			@Pc(181) int local181;
			if (aBoolean228) {
				@Pc(157) byte local157 = 20;
				@Pc(159) int local159 = 16776960;
				if (super.anInt847 < 15) {
					local159 = 16711680;
				}
				this.aClass1_Sub1_Sub3_Sub3_3.method224(20, "Fps:" + super.anInt847, local159);
				local181 = local157 + 15;
				@Pc(183) Runtime local183 = Runtime.getRuntime();
				@Pc(192) int local192 = (int) ((local183.totalMemory() - local183.freeMemory()) / 1024L);
				if (local192 > 33554432 && aBoolean247) {
				}
				if (local192 > 67108864 && !aBoolean247) {
				}
				this.aClass1_Sub1_Sub3_Sub3_3.method224(35, "Mem:" + local192 + "k", 16776960);
				local181 += 15;
			}
			if (this.anInt1052 != 0) {
				@Pc(233) int local233 = this.anInt1052 / 50;
				local181 = local233 / 60;
				@Pc(241) int local241 = local233 % 60;
				if (local241 < 10) {
					this.aClass1_Sub1_Sub3_Sub3_3.method229("System update in: " + local181 + ":0" + local241, 4, 16776960, 619, 329);
				} else {
					this.aClass1_Sub1_Sub3_Sub3_3.method229("System update in: " + local181 + ":" + local241, 4, 16776960, 619, 329);
				}
			}
		} catch (@Pc(283) RuntimeException local283) {
			signlink.reporterror("51908, " + 1915 + ", " + local283.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method636() {
		try {
			this.anInt1013 = 0;
			@Pc(10) int local10 = (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt319 >> 7) + this.anInt1037;
			@Pc(18) int local18 = (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt320 >> 7) + this.anInt1038;
			if (local10 >= 3053 && local10 <= 3156 && local18 >= 3056 && local18 <= 3136) {
				this.anInt1013 = 1;
			}
			if (local10 >= 3072 && local10 <= 3118 && local18 >= 9492 && local18 <= 9535) {
				this.anInt1013 = 1;
			}
			if (this.anInt1013 == 1 && local10 >= 3139 && local10 <= 3199 && local18 >= 3008 && local18 <= 3062) {
				this.anInt1013 = 0;
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("39482, " + 7 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method637() {
		try {
			if (this.anInt885 == 0) {
				this.aStringArray12[0] = "Cancel";
				this.anIntArray250[0] = 1822;
				this.anInt949 = 1;
				this.method608();
				this.anInt994 = 0;
				this.anInt1016 = 0;
				if (super.anInt852 > 4 && super.anInt853 > 4 && super.anInt852 < 516 && super.anInt853 < 338) {
					if (this.anInt1053 == -1) {
						this.method681(111);
					} else {
						this.method629(0, 4, Class32.aClass32Array1[this.anInt1053], super.anInt852, 0, 4, super.anInt853);
					}
				}
				if (this.anInt994 != this.anInt1064) {
					this.anInt1064 = this.anInt994;
				}
				if (this.anInt1016 != this.anInt890) {
					this.anInt890 = this.anInt1016;
				}
				this.anInt994 = 0;
				this.anInt1016 = 0;
				if (super.anInt852 > 553 && super.anInt853 > 205 && super.anInt852 < 743 && super.anInt853 < 466) {
					if (this.anInt1006 != -1) {
						this.method629(1, 553, Class32.aClass32Array1[this.anInt1006], super.anInt852, 0, 205, super.anInt853);
					} else if (this.anIntArray216[this.anInt866] != -1) {
						this.method629(1, 553, Class32.aClass32Array1[this.anIntArray216[this.anInt866]], super.anInt852, 0, 205, super.anInt853);
					}
				}
				if (this.anInt994 != this.anInt868) {
					this.aBoolean223 = true;
					this.anInt868 = this.anInt994;
				}
				if (this.anInt1016 != this.anInt957) {
					this.aBoolean223 = true;
					this.anInt957 = this.anInt1016;
				}
				this.anInt994 = 0;
				this.anInt1016 = 0;
				if (super.anInt852 > 17 && super.anInt853 > 357 && super.anInt852 < 496 && super.anInt853 < 453) {
					if (this.anInt1065 != -1) {
						this.method629(2, 17, Class32.aClass32Array1[this.anInt1065], super.anInt852, 0, 357, super.anInt853);
					} else if (this.anInt982 != -1) {
						this.method629(2, 17, Class32.aClass32Array1[this.anInt982], super.anInt852, 0, 357, super.anInt853);
					} else if (super.anInt853 < 434 && super.anInt852 < 426) {
						this.method680(super.anInt853 - 357, super.anInt852 - 17);
					}
				}
				if (this.anInt1065 != -1 && this.anInt994 != this.anInt1069) {
					this.aBoolean232 = true;
					this.anInt1069 = this.anInt994;
				}
				if (this.anInt1065 != -1 && this.anInt1016 != this.anInt1022) {
					this.aBoolean232 = true;
					this.anInt1022 = this.anInt1016;
				}
				@Pc(298) boolean local298 = false;
				while (!local298) {
					local298 = true;
					for (@Pc(304) int local304 = 0; local304 < this.anInt949 - 1; local304++) {
						if (this.anIntArray250[local304] < 1000 && this.anIntArray250[local304 + 1] > 1000) {
							@Pc(325) String local325 = this.aStringArray12[local304];
							this.aStringArray12[local304] = this.aStringArray12[local304 + 1];
							this.aStringArray12[local304 + 1] = local325;
							@Pc(347) int local347 = this.anIntArray250[local304];
							this.anIntArray250[local304] = this.anIntArray250[local304 + 1];
							this.anIntArray250[local304 + 1] = local347;
							@Pc(369) int local369 = this.anIntArray248[local304];
							this.anIntArray248[local304] = this.anIntArray248[local304 + 1];
							this.anIntArray248[local304 + 1] = local369;
							@Pc(391) int local391 = this.anIntArray249[local304];
							this.anIntArray249[local304] = this.anIntArray249[local304 + 1];
							this.anIntArray249[local304 + 1] = local391;
							@Pc(413) int local413 = this.anIntArray251[local304];
							this.anIntArray251[local304] = this.anIntArray251[local304 + 1];
							this.anIntArray251[local304 + 1] = local413;
							local298 = false;
						}
					}
				}
			}
		} catch (@Pc(443) RuntimeException local443) {
			signlink.reporterror("40575, " + 0 + ", " + local443.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;II)Lclient!VSUYIIVA;")
	private Class42 method638(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(3) byte[] local3 = null;
			@Pc(5) int local5 = 5;
			try {
				if (this.aClass34Array1[0] != null) {
					local3 = this.aClass34Array1[0].method415(arg0);
				}
			} catch (@Pc(20) Exception local20) {
			}
			@Pc(34) int local34;
			if (local3 != null) {
				this.aCRC32_2.reset();
				this.aCRC32_2.update(local3);
				local34 = (int) this.aCRC32_2.getValue();
				if (local34 != arg3) {
					local3 = null;
				}
			}
			if (local3 != null) {
				return new Class42(local3, false);
			}
			local34 = 0;
			while (local3 == null) {
				@Pc(61) String local61 = "Unknown error";
				this.method581(arg4, "Requesting " + arg1);
				@Pc(76) int local76;
				try {
					local76 = 0;
					@Pc(87) DataInputStream local87 = this.method643(arg2 + arg3);
					@Pc(90) byte[] local90 = new byte[6];
					local87.readFully(local90, 0, 6);
					@Pc(101) Class1_Sub1_Sub2 local101 = new Class1_Sub1_Sub2(local90, 792);
					local101.anInt153 = 3;
					@Pc(109) int local109 = local101.method63() + 6;
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
							this.method581(arg4, "Loading " + arg1 + " - " + local174 + "%");
						}
						local76 = local174;
					}
					local87.close();
					try {
						if (this.aClass34Array1[0] != null) {
							this.aClass34Array1[0].method416(arg0, local3.length, local3, aBoolean253);
						}
					} catch (@Pc(219) Exception local219) {
						this.aClass34Array1[0] = null;
					}
					if (local3 != null) {
						this.aCRC32_2.reset();
						this.aCRC32_2.update(local3);
						local134 = (int) this.aCRC32_2.getValue();
						if (local134 != arg3) {
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
							this.method581(arg4, "Game updated - please reload page");
							local76 = 10;
						} else {
							this.method581(arg4, local61 + " - Retrying in " + local76);
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
					this.aBoolean242 = !this.aBoolean242;
				}
			}
			return new Class42(local3, false);
		} catch (@Pc(358) RuntimeException local358) {
			signlink.reporterror("89108, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local358.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method639(@OriginalArg(1) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass1_Sub1_Sub3_Sub1_5.anIntArray22;
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
						this.aClass40_1.method491(local5, local34, arg0, local36, local22);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local36][local22] & 0x8) != 0) {
						this.aClass40_1.method491(local5, local34, arg0 + 1, local36, local22);
					}
					local34 += 4;
				}
			}
			local34 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local36 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass1_Sub1_Sub3_Sub1_5.method133(this.anInt1054);
			@Pc(147) int local147;
			for (@Pc(143) int local143 = 1; local143 < 103; local143++) {
				for (local147 = 1; local147 < 103; local147++) {
					if ((this.aByteArrayArrayArray8[arg0][local147][local143] & 0x18) == 0) {
						this.method689(arg0, local34, local147, local36, local143);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local147][local143] & 0x8) != 0) {
						this.method689(arg0 + 1, local34, local147, local36, local143);
					}
				}
			}
			this.aClass12_26.method182(this.anInt1054);
			this.anInt896 = 0;
			for (local147 = 0; local147 < 104; local147++) {
				for (@Pc(216) int local216 = 0; local216 < 104; local216++) {
					@Pc(226) int local226 = this.aClass40_1.method485(this.anInt961, local147, local216);
					if (local226 != 0) {
						local226 = local226 >> 14 & 0x7FFF;
						@Pc(238) int local238 = Class38.method442(local226).anInt656;
						if (local238 >= 0) {
							@Pc(242) int local242 = local147;
							@Pc(244) int local244 = local216;
							if (local238 != 22 && local238 != 29 && local238 != 34 && local238 != 36 && local238 != 46 && local238 != 47 && local238 != 48) {
								@Pc(276) int[][] local276 = this.aClass18Array1[this.anInt961].anIntArrayArray4;
								for (@Pc(278) int local278 = 0; local278 < 10; local278++) {
									@Pc(285) int local285 = (int) (Math.random() * 4.0D);
									if (local285 == 0 && local242 > 0 && local242 > local147 - 3 && (local276[local242 - 1][local244] & 0x1280108) == 0) {
										local242--;
									}
									if (local285 == 1 && local242 < 103 && local242 < local147 + 3 && (local276[local242 + 1][local244] & 0x1280180) == 0) {
										local242++;
									}
									if (local285 == 2 && local244 > 0 && local244 > local216 - 3 && (local276[local242][local244 - 1] & 0x1280102) == 0) {
										local244--;
									}
									if (local285 == 3 && local244 < 103 && local244 < local216 + 3 && (local276[local242][local244 + 1] & 0x1280120) == 0) {
										local244++;
									}
								}
							}
							this.aClass1_Sub1_Sub3_Sub1Array5[this.anInt896] = this.aClass1_Sub1_Sub3_Sub1Array8[local238];
							this.anIntArray220[this.anInt896] = local242;
							this.anIntArray221[this.anInt896] = local244;
							this.anInt896++;
						}
					}
				}
			}
		} catch (@Pc(421) RuntimeException local421) {
			signlink.reporterror("83335, " + -893 + ", " + arg0 + ", " + local421.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)Ljava/lang/String;")
	private String method640() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("86285, " + 7 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method641(@OriginalArg(0) int arg0) {
		try {
			this.aBoolean239 = true;
			@Pc(8) boolean local8 = false;
			for (@Pc(10) int local10 = 0; local10 < 7; local10++) {
				this.anIntArray229[local10] = -1;
				for (@Pc(19) int local19 = 0; local19 < Class35.anInt636; local19++) {
					if (!Class35.aClass35Array1[local19].aBoolean166 && Class35.aClass35Array1[local19].anInt637 == local10 + (this.aBoolean261 ? 0 : 7)) {
						this.anIntArray229[local10] = local19;
						break;
					}
				}
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("74118, " + arg0 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
	private void method642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(9) int local9 = 2048 - arg2 & 0x7FF;
			@Pc(15) int local15 = 2048 - arg4 & 0x7FF;
			@Pc(17) int local17 = 0;
			@Pc(19) int local19 = 0;
			@Pc(21) int local21 = arg3;
			@Pc(27) int local27;
			@Pc(31) int local31;
			@Pc(41) int local41;
			if (local9 != 0) {
				local27 = Class1_Sub1_Sub1_Sub4.anIntArray120[local9];
				local31 = Class1_Sub1_Sub1_Sub4.anIntArray121[local9];
				local41 = local31 * 0 - arg3 * local27 >> 16;
				local21 = local27 * 0 + arg3 * local31 >> 16;
				local19 = local41;
			}
			if (local15 != 0) {
				local27 = Class1_Sub1_Sub1_Sub4.anIntArray120[local15];
				local31 = Class1_Sub1_Sub1_Sub4.anIntArray121[local15];
				local41 = local21 * local27 + local31 * 0 >> 16;
				local21 = local21 * local31 - local27 * 0 >> 16;
				local17 = local41;
			}
			this.anInt1028 = arg5 - local17;
			this.anInt1029 = arg1 - local19;
			this.anInt1030 = arg0 - local21;
			this.anInt1031 = arg2;
			this.anInt1032 = arg4;
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("89287, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 26554 + ", " + arg5 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method643(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean242) {
			if (this.aSocket3 != null) {
				try {
					this.aSocket3.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket3 = null;
			}
			this.aSocket3 = this.method593(43595);
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

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method644(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = false;
			for (@Pc(10) Class1_Sub1_Sub1_Sub6 local10 = (Class1_Sub1_Sub1_Sub6) this.aClass7_11.method100(); local10 != null; local10 = (Class1_Sub1_Sub1_Sub6) this.aClass7_11.method102()) {
				if (local10.anInt680 != this.anInt961 || anInt903 > local10.anInt677) {
					local10.method507();
				} else if (anInt903 >= local10.anInt676) {
					if (local10.anInt673 > 0) {
						@Pc(40) Class1_Sub1_Sub1_Sub1_Sub1 local40 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local10.anInt673 - 1];
						if (local40 != null && local40.anInt319 >= 0 && local40.anInt319 < 13312 && local40.anInt320 >= 0 && local40.anInt320 < 13312) {
							local10.method450(local40.anInt320, local40.anInt319, anInt903, (byte) 9, this.method696(local40.anInt319, local10.anInt680, local40.anInt320) - local10.anInt684);
						}
					}
					if (local10.anInt673 < 0) {
						@Pc(85) int local85 = -local10.anInt673 - 1;
						@Pc(91) Class1_Sub1_Sub1_Sub1_Sub2 local91;
						if (local85 == this.anInt1002) {
							local91 = aClass1_Sub1_Sub1_Sub1_Sub2_1;
						} else {
							local91 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local85];
						}
						if (local91 != null && local91.anInt319 >= 0 && local91.anInt319 < 13312 && local91.anInt320 >= 0 && local91.anInt320 < 13312) {
							local10.method450(local91.anInt320, local91.anInt319, anInt903, (byte) 9, this.method696(local91.anInt319, local10.anInt680, local91.anInt320) - local10.anInt684);
						}
					}
					local10.method449(this.anInt1003);
					this.aClass40_1.method467(local10, local10.anInt674, false, (int) local10.aDouble2, this.anInt961, 60, (int) local10.aDouble3, -1, (int) local10.aDouble4);
				}
			}
		} catch (@Pc(171) RuntimeException local171) {
			signlink.reporterror("84544, " + arg0 + ", " + local171.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IILclient!CFARFRSG;)V")
	private void method645(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub2 arg1) {
		try {
			@Pc(17) int local17;
			@Pc(38) int local38;
			@Pc(26) int local26;
			@Pc(33) int local33;
			@Pc(64) Class1_Sub1_Sub1_Sub3 local64;
			if (arg0 == 128) {
				local17 = arg1.method79();
				local26 = this.anInt931 + (local17 >> 4 & 0x7);
				local33 = this.anInt932 + (local17 & 0x7);
				local38 = arg1.method88(this.anInt1074);
				if (local26 >= 0 && local33 >= 0 && local26 < 104 && local33 < 104) {
					@Pc(58) Class7 local58 = this.aClass7ArrayArrayArray1[this.anInt961][local26][local33];
					if (local58 != null) {
						for (local64 = (Class1_Sub1_Sub1_Sub3) local58.method100(); local64 != null; local64 = (Class1_Sub1_Sub1_Sub3) local58.method102()) {
							if (local64.anInt200 == (local38 & 0x7FFF)) {
								local64.method507();
								break;
							}
						}
						if (local58.method100() == null) {
							this.aClass7ArrayArrayArray1[this.anInt961][local26][local33] = null;
						}
						this.method652(local26, local33);
					}
				}
			} else {
				@Pc(125) int local125;
				@Pc(134) int local134;
				@Pc(141) int local141;
				if (arg0 == 160) {
					local17 = arg1.method78(887);
					local26 = local17 >> 2;
					local33 = local17 & 0x3;
					local38 = this.anIntArray262[local26];
					local125 = arg1.method79();
					local134 = this.anInt931 + (local125 >> 4 & 0x7);
					local141 = this.anInt932 + (local125 & 0x7);
					if (local134 >= 0 && local141 >= 0 && local134 < 104 && local141 < 104) {
						this.method599(local26, local33, local134, local38, -1, local141, -1, this.anInt961, 0);
					}
				} else {
					@Pc(207) int local207;
					if (arg0 == 82) {
						local17 = arg1.method61();
						local26 = arg1.method80();
						local33 = this.anInt931 + (local26 >> 4 & 0x7);
						local38 = this.anInt932 + (local26 & 0x7);
						local125 = arg1.method59();
						local134 = local125 >> 2;
						local141 = local125 & 0x3;
						local207 = this.anIntArray262[local134];
						if (local33 >= 0 && local38 >= 0 && local33 < 104 && local38 < 104) {
							this.method599(local134, local141, local33, local207, -1, local38, local17, this.anInt961, 0);
						}
					} else {
						@Pc(269) int local269;
						@Pc(278) int local278;
						@Pc(285) int local285;
						@Pc(289) int local289;
						@Pc(293) int local293;
						@Pc(297) int local297;
						if (arg0 == 202) {
							local17 = arg1.method88(this.anInt1074);
							@Pc(243) byte local243 = arg1.method82((byte) 4);
							@Pc(246) byte local246 = arg1.method60();
							local38 = arg1.method61();
							local125 = arg1.method88(this.anInt1074);
							@Pc(258) byte local258 = arg1.method82((byte) 4);
							@Pc(262) byte local262 = arg1.method81();
							local207 = arg1.method87(405);
							local269 = arg1.method59();
							local278 = this.anInt931 + (local269 >> 4 & 0x7);
							local285 = this.anInt932 + (local269 & 0x7);
							local289 = arg1.method80();
							local293 = local289 >> 2;
							local297 = local289 & 0x3;
							@Pc(302) int local302 = this.anIntArray262[local293];
							@Pc(308) Class1_Sub1_Sub1_Sub1_Sub2 local308;
							if (local125 == this.anInt1002) {
								local308 = aClass1_Sub1_Sub1_Sub1_Sub2_1;
							} else {
								local308 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local125];
							}
							if (local308 != null) {
								@Pc(320) Class38 local320 = Class38.method442(local17);
								@Pc(330) int local330 = this.anIntArrayArrayArray8[this.anInt961][local278][local285];
								@Pc(342) int local342 = this.anIntArrayArrayArray8[this.anInt961][local278 + 1][local285];
								@Pc(356) int local356 = this.anIntArrayArrayArray8[this.anInt961][local278 + 1][local285 + 1];
								@Pc(368) int local368 = this.anIntArrayArrayArray8[this.anInt961][local278][local285 + 1];
								@Pc(378) Class1_Sub1_Sub1_Sub4 local378 = local320.method434(local293, local297, local330, local342, local356, local368, -1);
								if (local378 != null) {
									this.method599(0, 0, local278, local302, local38 + 1, local285, -1, this.anInt961, local207 + 1);
									local308.anInt354 = local207 + anInt903;
									local308.anInt355 = local38 + anInt903;
									local308.aClass1_Sub1_Sub1_Sub4_1 = local378;
									@Pc(413) int local413 = local320.anInt664;
									@Pc(416) int local416 = local320.anInt647;
									if (local297 == 1 || local297 == 3) {
										local413 = local320.anInt647;
										local416 = local320.anInt664;
									}
									local308.anInt345 = local278 * 128 + local413 * 64;
									local308.anInt347 = local285 * 128 + local416 * 64;
									local308.anInt346 = this.method696(local308.anInt345, this.anInt961, local308.anInt347);
									@Pc(462) byte local462;
									if (local262 > local243) {
										local462 = local262;
										local262 = local243;
										local243 = local462;
									}
									if (local246 > local258) {
										local462 = local246;
										local246 = local258;
										local258 = local462;
									}
									local308.anInt348 = local278 + local262;
									local308.anInt350 = local278 + local243;
									local308.anInt349 = local285 + local246;
									local308.anInt351 = local285 + local258;
								}
							}
						}
						if (arg0 == 177) {
							local17 = arg1.method59();
							local26 = this.anInt931 + (local17 >> 4 & 0x7);
							local33 = this.anInt932 + (local17 & 0x7);
							local38 = local26 + arg1.method60();
							local125 = local33 + arg1.method60();
							local134 = arg1.method62();
							local141 = arg1.method61();
							local207 = arg1.method59() * 4;
							local269 = arg1.method59() * 4;
							local278 = arg1.method61();
							local285 = arg1.method61();
							local289 = arg1.method59();
							local293 = arg1.method59();
							if (local26 >= 0 && local33 >= 0 && local26 < 104 && local33 < 104 && local38 >= 0 && local125 >= 0 && local38 < 104 && local125 < 104 && local141 != 65535) {
								local26 = local26 * 128 + 64;
								local33 = local33 * 128 + 64;
								local38 = local38 * 128 + 64;
								local125 = local125 * 128 + 64;
								@Pc(631) Class1_Sub1_Sub1_Sub6 local631 = new Class1_Sub1_Sub1_Sub6(local141, local26, this.method696(local26, this.anInt961, local33) - local207, local33, -578, local134, local269, local289, this.anInt961, local285 + anInt903, local293, local278 + anInt903);
								local631.method450(local125, local38, local278 + anInt903, (byte) 9, this.method696(local38, this.anInt961, local125) - local269);
								this.aClass7_11.method97(local631);
							}
						} else if (arg0 == 176) {
							local17 = arg1.method88(this.anInt1074);
							local26 = arg1.method80();
							local33 = local26 >> 2;
							local38 = local26 & 0x3;
							local125 = this.anIntArray262[local33];
							local134 = arg1.method59();
							local141 = this.anInt931 + (local134 >> 4 & 0x7);
							local207 = this.anInt932 + (local134 & 0x7);
							if (local141 >= 0 && local207 >= 0 && local141 < 103 && local207 < 103) {
								local269 = this.anIntArrayArrayArray8[this.anInt961][local141][local207];
								local278 = this.anIntArrayArrayArray8[this.anInt961][local141 + 1][local207];
								local285 = this.anIntArrayArrayArray8[this.anInt961][local141 + 1][local207 + 1];
								local289 = this.anIntArrayArrayArray8[this.anInt961][local141][local207 + 1];
								if (local125 == 0) {
									@Pc(766) Class50 local766 = this.aClass40_1.method478(local207, this.anInt961, (byte) 9, local141);
									if (local766 != null) {
										local297 = local766.anInt839 >> 14 & 0x7FFF;
										if (local33 == 2) {
											local766.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub5((byte) 1, false, local289, local269, local278, local297, 2, local38 + 4, local285, local17);
											local766.aClass1_Sub1_Sub1_8 = new Class1_Sub1_Sub1_Sub5((byte) 1, false, local289, local269, local278, local297, 2, local38 + 1 & 0x3, local285, local17);
										} else {
											local766.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub5((byte) 1, false, local289, local269, local278, local297, local33, local38, local285, local17);
										}
									}
								}
								if (local125 == 1) {
									@Pc(843) Class28 local843 = this.aClass40_1.method479(local141, local207, this.anInt961);
									if (local843 != null) {
										local843.aClass1_Sub1_Sub1_2 = new Class1_Sub1_Sub1_Sub5((byte) 1, false, local289, local269, local278, local843.anInt517 >> 14 & 0x7FFF, 4, 0, local285, local17);
									}
								}
								if (local125 == 2) {
									@Pc(877) Class47 local877 = this.aClass40_1.method480(this.anInt961, local207, local141, (byte) 6);
									if (local33 == 11) {
										local33 = 10;
									}
									if (local877 != null) {
										local877.aClass1_Sub1_Sub1_6 = new Class1_Sub1_Sub1_Sub5((byte) 1, false, local289, local269, local278, local877.anInt820 >> 14 & 0x7FFF, local33, local38, local285, local17);
									}
								}
								if (local125 == 3) {
									@Pc(916) Class15 local916 = this.aClass40_1.method481(local207, this.anInt961, local141);
									if (local916 != null) {
										local916.aClass1_Sub1_Sub1_1 = new Class1_Sub1_Sub1_Sub5((byte) 1, false, local289, local269, local278, local916.anInt360 >> 14 & 0x7FFF, 22, local38, local285, local17);
									}
								}
							}
						} else {
							if (arg0 == 244) {
								local17 = arg1.method59();
								local26 = this.anInt931 + (local17 >> 4 & 0x7);
								local33 = this.anInt932 + (local17 & 0x7);
								local38 = arg1.method61();
								local125 = arg1.method59();
								local134 = local125 >> 4 & 0xF;
								local141 = local125 & 0x7;
								if (aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray48[0] >= local26 - local134 && aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray48[0] <= local26 + local134 && aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray49[0] >= local33 - local134 && aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray49[0] <= local33 + local134 && this.aBoolean245 && !aBoolean247 && this.anInt904 < 50) {
									this.anIntArray234[this.anInt904] = local38;
									this.anIntArray217[this.anInt904] = local141;
									this.anIntArray252[this.anInt904] = Class43.anIntArray189[local38];
									this.anInt904++;
								}
							}
							if (arg0 == 230) {
								local17 = arg1.method59();
								local26 = this.anInt931 + (local17 >> 4 & 0x7);
								local33 = this.anInt932 + (local17 & 0x7);
								local38 = arg1.method61();
								local125 = arg1.method61();
								local134 = arg1.method61();
								if (local26 >= 0 && local33 >= 0 && local26 < 104 && local33 < 104) {
									@Pc(1095) Class7 local1095 = this.aClass7ArrayArrayArray1[this.anInt961][local26][local33];
									if (local1095 != null) {
										for (@Pc(1101) Class1_Sub1_Sub1_Sub3 local1101 = (Class1_Sub1_Sub1_Sub3) local1095.method100(); local1101 != null; local1101 = (Class1_Sub1_Sub1_Sub3) local1095.method102()) {
											if (local1101.anInt200 == (local38 & 0x7FFF) && local1101.anInt201 == local125) {
												local1101.anInt201 = local134;
												break;
											}
										}
										this.method652(local26, local33);
									}
								}
							} else if (arg0 == 95) {
								local17 = arg1.method59();
								local26 = this.anInt931 + (local17 >> 4 & 0x7);
								local33 = this.anInt932 + (local17 & 0x7);
								local38 = arg1.method61();
								local125 = arg1.method59();
								local134 = arg1.method61();
								if (local26 >= 0 && local33 >= 0 && local26 < 104 && local33 < 104) {
									local26 = local26 * 128 + 64;
									local33 = local33 * 128 + 64;
									@Pc(1204) Class1_Sub1_Sub1_Sub2 local1204 = new Class1_Sub1_Sub1_Sub2(0, this.method696(local26, this.anInt961, local33) - local125, local33, local38, local26, local134, anInt903, this.anInt961);
									this.aClass7_10.method97(local1204);
								}
							} else if (arg0 == 1) {
								local17 = arg1.method79();
								local26 = this.anInt931 + (local17 >> 4 & 0x7);
								local33 = this.anInt932 + (local17 & 0x7);
								local38 = arg1.method86((byte) 1);
								local125 = arg1.method86((byte) 1);
								local134 = arg1.method86((byte) 1);
								if (local26 >= 0 && local33 >= 0 && local26 < 104 && local33 < 104 && local38 != this.anInt1002) {
									@Pc(1262) Class1_Sub1_Sub1_Sub3 local1262 = new Class1_Sub1_Sub1_Sub3();
									local1262.anInt200 = local134;
									local1262.anInt201 = local125;
									if (this.aClass7ArrayArrayArray1[this.anInt961][local26][local33] == null) {
										this.aClass7ArrayArrayArray1[this.anInt961][local26][local33] = new Class7(anInt972);
									}
									this.aClass7ArrayArrayArray1[this.anInt961][local26][local33].method97(local1262);
									this.method652(local26, local33);
								}
							} else if (arg0 == 55) {
								local17 = arg1.method59();
								local26 = this.anInt931 + (local17 >> 4 & 0x7);
								local33 = this.anInt932 + (local17 & 0x7);
								local38 = arg1.method86((byte) 1);
								local125 = arg1.method87(405);
								if (local26 >= 0 && local33 >= 0 && local26 < 104 && local33 < 104) {
									local64 = new Class1_Sub1_Sub1_Sub3();
									local64.anInt200 = local38;
									local64.anInt201 = local125;
									if (this.aClass7ArrayArrayArray1[this.anInt961][local26][local33] == null) {
										this.aClass7ArrayArrayArray1[this.anInt961][local26][local33] = new Class7(anInt972);
									}
									this.aClass7ArrayArrayArray1[this.anInt961][local26][local33].method97(local64);
									this.method652(local26, local33);
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1397) RuntimeException local1397) {
			signlink.reporterror("11222, " + arg0 + ", " + 2 + ", " + arg1 + ", " + local1397.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method646() {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt871; local3++) {
				if (local3 == -1) {
					local11 = this.anInt870;
				} else {
					local11 = this.anIntArray213[local3];
				}
				@Pc(23) Class1_Sub1_Sub1_Sub1_Sub2 local23 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local11];
				if (local23 != null && local23.anInt322 > 0) {
					local23.anInt322--;
					if (local23.anInt322 == 0) {
						local23.aString4 = null;
					}
				}
			}
			for (local11 = 0; local11 < this.anInt988; local11++) {
				@Pc(57) int local57 = this.anIntArray236[local11];
				@Pc(62) Class1_Sub1_Sub1_Sub1_Sub1 local62 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local57];
				if (local62 != null && local62.anInt322 > 0) {
					local62.anInt322--;
					if (local62.anInt322 == 0) {
						local62.aString4 = null;
					}
				}
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("61281, " + -87 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILclient!CFARFRSG;)V")
	private void method647(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub2 arg1) {
		try {
			arg1.method69();
			@Pc(9) int local9 = arg1.method70(881, 8);
			@Pc(21) int local21;
			if (local9 < this.anInt988) {
				for (local21 = local9; local21 < this.anInt988; local21++) {
					this.anIntArray223[this.anInt901++] = this.anIntArray236[local21];
				}
			}
			if (local9 > this.anInt988) {
				signlink.reporterror(this.aString28 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt988 = 0;
			for (local21 = 0; local21 < local9; local21++) {
				@Pc(73) int local73 = this.anIntArray236[local21];
				@Pc(78) Class1_Sub1_Sub1_Sub1_Sub1 local78 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local73];
				@Pc(83) int local83 = arg1.method70(881, 1);
				if (local83 == 0) {
					this.anIntArray236[this.anInt988++] = local73;
					local78.anInt304 = anInt903;
				} else {
					@Pc(106) int local106 = arg1.method70(881, 2);
					if (local106 == 0) {
						this.anIntArray236[this.anInt988++] = local73;
						local78.anInt304 = anInt903;
						this.anIntArray214[this.anInt872++] = local73;
					} else {
						@Pc(157) int local157;
						@Pc(167) int local167;
						if (local106 == 1) {
							this.anIntArray236[this.anInt988++] = local73;
							local78.anInt304 = anInt903;
							local157 = arg1.method70(881, 3);
							local78.method245(local157, false);
							local167 = arg1.method70(881, 1);
							if (local167 == 1) {
								this.anIntArray214[this.anInt872++] = local73;
							}
						} else if (local106 == 2) {
							this.anIntArray236[this.anInt988++] = local73;
							local78.anInt304 = anInt903;
							local157 = arg1.method70(881, 3);
							local78.method245(local157, true);
							local167 = arg1.method70(881, 3);
							local78.method245(local167, true);
							@Pc(225) int local225 = arg1.method70(881, 1);
							if (local225 == 1) {
								this.anIntArray214[this.anInt872++] = local73;
							}
						} else if (local106 == 3) {
							this.anIntArray223[this.anInt901++] = local73;
						}
					}
				}
			}
		} catch (@Pc(262) RuntimeException local262) {
			signlink.reporterror("31200, " + false + ", " + arg0 + ", " + arg1 + ", " + local262.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method648() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt904; local3++) {
				if (this.anIntArray252[local3] <= 0) {
					@Pc(12) boolean local12 = false;
					try {
						if (this.anIntArray234[local3] != this.anInt956 || this.anIntArray217[local3] != this.anInt991) {
							@Pc(45) Class1_Sub1_Sub2 local45 = Class43.method541(this.anIntArray234[local3], this.anIntArray217[local3]);
							if (System.currentTimeMillis() + (long) (local45.anInt153 / 22) > this.aLong32 + (long) (this.anInt913 / 22)) {
								this.anInt913 = local45.anInt153;
								this.aLong32 = System.currentTimeMillis();
								if (this.method697(local45.aByteArray1, local45.anInt153)) {
									this.anInt956 = this.anIntArray234[local3];
									this.anInt991 = this.anIntArray217[local3];
								} else {
									local12 = true;
								}
							}
						} else if (!this.method708()) {
							local12 = true;
						}
					} catch (@Pc(95) Exception local95) {
					}
					if (local12 && this.anIntArray252[local3] != -5) {
						this.anIntArray252[local3] = -5;
					} else {
						this.anInt904--;
						for (@Pc(111) int local111 = local3; local111 < this.anInt904; local111++) {
							this.anIntArray234[local111] = this.anIntArray234[local111 + 1];
							this.anIntArray217[local111] = this.anIntArray217[local111 + 1];
							this.anIntArray252[local111] = this.anIntArray252[local111 + 1];
						}
						local3--;
					}
				} else {
					@Pc(163) int local163 = this.anIntArray252[local3]--;
				}
			}
			if (this.anInt1014 > 0) {
				this.anInt1014 -= 20;
				if (this.anInt1014 < 0) {
					this.anInt1014 = 0;
				}
				if (this.anInt1014 == 0 && this.aBoolean250 && !aBoolean247) {
					this.anInt958 = this.anInt880;
					this.aBoolean243 = true;
					this.aClass20_Sub1_1.method394(2, this.anInt958);
					return;
				}
			}
		} catch (@Pc(213) RuntimeException local213) {
			signlink.reporterror("90824, " + -17 + ", " + local213.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!FHQGDDHF;IIII)V")
	private void method649(@OriginalArg(0) Class1_Sub1_Sub1_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 != aClass1_Sub1_Sub1_Sub1_Sub2_1 && this.anInt949 < 400) {
				@Pc(38) String local38;
				if (arg0.anInt344 == 0) {
					local38 = arg0.aString5 + method688(arg0.anInt342, aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt342) + " (level-" + arg0.anInt342 + ")";
				} else {
					local38 = arg0.aString5 + " (skill-" + arg0.anInt344 + ")";
				}
				@Pc(168) int local168;
				if (this.anInt950 == 1) {
					this.aStringArray12[this.anInt949] = "Use " + this.aString25 + " with @whi@" + local38;
					this.anIntArray250[this.anInt949] = 995;
					this.anIntArray251[this.anInt949] = arg3;
					this.anIntArray248[this.anInt949] = arg1;
					this.anIntArray249[this.anInt949] = arg2;
					this.anInt949++;
				} else if (this.anInt942 != 1) {
					for (local168 = 4; local168 >= 0; local168--) {
						if (this.aStringArray11[local168] != null) {
							this.aStringArray12[this.anInt949] = this.aStringArray11[local168] + " @whi@" + local38;
							@Pc(195) short local195 = 0;
							if (this.aStringArray11[local168].equalsIgnoreCase("attack")) {
								if (arg0.anInt342 > aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt342) {
									local195 = 2000;
								}
								if (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt356 != 0 && arg0.anInt356 != 0) {
									if (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt356 == arg0.anInt356) {
										local195 = 2000;
									} else {
										local195 = 0;
									}
								}
							} else if (this.aBooleanArray11[local168]) {
								local195 = 2000;
							}
							if (local168 == 0) {
								this.anIntArray250[this.anInt949] = local195 + 371;
							}
							if (local168 == 1) {
								this.anIntArray250[this.anInt949] = local195 + 101;
							}
							if (local168 == 2) {
								this.anIntArray250[this.anInt949] = local195 + 184;
							}
							if (local168 == 3) {
								this.anIntArray250[this.anInt949] = local195 + 137;
							}
							if (local168 == 4) {
								this.anIntArray250[this.anInt949] = local195 + 390;
							}
							this.anIntArray251[this.anInt949] = arg3;
							this.anIntArray248[this.anInt949] = arg1;
							this.anIntArray249[this.anInt949] = arg2;
							this.anInt949++;
						}
					}
				} else if ((this.anInt944 & 0x8) == 8) {
					this.aStringArray12[this.anInt949] = this.aString23 + " @whi@" + local38;
					this.anIntArray250[this.anInt949] = 475;
					this.anIntArray251[this.anInt949] = arg3;
					this.anIntArray248[this.anInt949] = arg1;
					this.anIntArray249[this.anInt949] = arg2;
					this.anInt949++;
				}
				for (local168 = 0; local168 < this.anInt949; local168++) {
					if (this.anIntArray250[local168] == 189) {
						this.aStringArray12[local168] = "Walk here @whi@" + local38;
						return;
					}
				}
			}
		} catch (@Pc(345) RuntimeException local345) {
			signlink.reporterror("11773, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + local345.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!CFARFRSG;I)V")
	private void method650(@OriginalArg(1) Class1_Sub1_Sub2 arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt872; local1++) {
				@Pc(8) int local8 = this.anIntArray214[local1];
				@Pc(13) Class1_Sub1_Sub1_Sub1_Sub2 local13 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local8];
				@Pc(16) int local16 = arg0.method59();
				if ((local16 & 0x4) != 0) {
					local16 += arg0.method59() << 8;
				}
				this.method715(this.anInt927, local8, local16, arg0, local13);
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("74163, " + -695 + ", " + arg0 + ", " + arg1 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method651() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt873);
			if (this.aClass20_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass20_Sub1_1.anInt558);
			}
			System.out.println("loop-cycle:" + anInt903);
			System.out.println("draw-cycle:" + anInt940);
			System.out.println("ptype:" + this.anInt921);
			System.out.println("psize:" + this.anInt920);
			if (this.aClass36_1 != null) {
				this.aClass36_1.method430();
			}
			super.aBoolean220 = true;
			this.aBoolean264 &= true;
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("39538, " + true + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)Ljava/awt/Component;")
	@Override
	protected Component method579() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("18288, " + true + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
	private void method652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class7 local9 = this.aClass7ArrayArrayArray1[this.anInt961][arg0][arg1];
		if (local9 == null) {
			this.aClass40_1.method477(this.anInt961, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class1_Sub1_Sub1_Sub3 local23 = null;
		@Pc(27) Class1_Sub1_Sub1_Sub3 local27;
		for (local27 = (Class1_Sub1_Sub1_Sub3) local9.method100(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub3) local9.method102()) {
			@Pc(32) Class23 local32 = Class23.method286(local27.anInt200);
			@Pc(35) int local35 = local32.anInt430;
			if (local32.aBoolean103) {
				local35 *= local27.anInt201 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method98(local23);
		@Pc(65) Class1_Sub1_Sub1_Sub3 local65 = null;
		@Pc(67) Class1_Sub1_Sub1_Sub3 local67 = null;
		for (local27 = (Class1_Sub1_Sub1_Sub3) local9.method100(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub3) local9.method102()) {
			if (local27.anInt200 != local23.anInt200 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt200 != local23.anInt200 && local27.anInt200 != local65.anInt200 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass40_1.method463(local65, arg0, local67, local110, this.method696(arg0 * 128 + 64, this.anInt961, arg1 * 128 + 64), arg1, local23, this.anInt961);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!OPFNUBIN;B)Z")
	private boolean method653(@OriginalArg(0) Class32 arg0) {
		try {
			@Pc(11) int local11 = arg0.anInt607;
			if (this.anInt1001 == 2) {
				if (local11 == 201) {
					this.aBoolean232 = true;
					this.anInt925 = 0;
					this.aBoolean225 = true;
					this.aString30 = "";
					this.anInt926 = 1;
					this.aString17 = "Enter name of friend to add to list";
				}
				if (local11 == 202) {
					this.aBoolean232 = true;
					this.anInt925 = 0;
					this.aBoolean225 = true;
					this.aString30 = "";
					this.anInt926 = 2;
					this.aString17 = "Enter name of friend to delete from list";
				}
			}
			if (local11 == 205) {
				this.anInt924 = 250;
				return true;
			}
			if (local11 == 501) {
				this.aBoolean232 = true;
				this.anInt925 = 0;
				this.aBoolean225 = true;
				this.aString30 = "";
				this.anInt926 = 4;
				this.aString17 = "Enter name of player to add to list";
			}
			if (local11 == 502) {
				this.aBoolean232 = true;
				this.anInt925 = 0;
				this.aBoolean225 = true;
				this.aString30 = "";
				this.anInt926 = 5;
				this.aString17 = "Enter name of player to delete from list";
			}
			@Pc(119) int local119;
			@Pc(123) int local123;
			@Pc(128) int local128;
			if (local11 >= 300 && local11 <= 313) {
				local119 = (local11 - 300) / 2;
				local123 = local11 & 0x1;
				local128 = this.anIntArray229[local119];
				if (local128 != -1) {
					while (true) {
						if (local123 == 0) {
							local128--;
							if (local128 < 0) {
								local128 = Class35.anInt636 - 1;
							}
						}
						if (local123 == 1) {
							local128++;
							if (local128 >= Class35.anInt636) {
								local128 = 0;
							}
						}
						if (!Class35.aClass35Array1[local128].aBoolean166 && Class35.aClass35Array1[local128].anInt637 == local119 + (this.aBoolean261 ? 0 : 7)) {
							this.anIntArray229[local119] = local128;
							this.aBoolean239 = true;
							break;
						}
					}
				}
			}
			if (local11 >= 314 && local11 <= 323) {
				local119 = (local11 - 314) / 2;
				local123 = local11 & 0x1;
				local128 = this.anIntArray232[local119];
				if (local123 == 0) {
					local128--;
					if (local128 < 0) {
						local128 = anIntArrayArray23[local119].length - 1;
					}
				}
				if (local123 == 1) {
					local128++;
					if (local128 >= anIntArrayArray23[local119].length) {
						local128 = 0;
					}
				}
				this.anIntArray232[local119] = local128;
				this.aBoolean239 = true;
			}
			if (local11 == 324 && !this.aBoolean261) {
				this.aBoolean261 = true;
				this.method641(932);
			}
			if (local11 == 325 && this.aBoolean261) {
				this.aBoolean261 = false;
				this.method641(932);
			}
			if (local11 == 326) {
				this.aClass1_Sub1_Sub2_8.method48(251);
				this.aClass1_Sub1_Sub2_8.method49(this.aBoolean261 ? 0 : 1);
				for (local119 = 0; local119 < 7; local119++) {
					this.aClass1_Sub1_Sub2_8.method49(this.anIntArray229[local119]);
				}
				for (local123 = 0; local123 < 5; local123++) {
					this.aClass1_Sub1_Sub2_8.method49(this.anIntArray232[local123]);
				}
				return true;
			}
			if (local11 == 620) {
				this.aBoolean251 = !this.aBoolean251;
			}
			if (local11 >= 601 && local11 <= 613) {
				this.method678();
				if (this.aString27.length() > 0) {
					this.aClass1_Sub1_Sub2_8.method48(38);
					this.aClass1_Sub1_Sub2_8.method55((byte) 9, Class49.method563(this.aString27));
					this.aClass1_Sub1_Sub2_8.method49(local11 - 601);
					this.aClass1_Sub1_Sub2_8.method49(this.aBoolean251 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(356) RuntimeException local356) {
			signlink.reporterror("19568, " + arg0 + ", " + -105 + ", " + local356.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)Z")
	private boolean method654() {
		try {
			if (this.aClass36_1 == null) {
				return false;
			}
			@Pc(268) String local268;
			@Pc(166) int local166;
			try {
				@Pc(16) int local16 = this.aClass36_1.method427();
				if (local16 == 0) {
					return false;
				}
				if (this.anInt921 == -1) {
					this.aClass36_1.method428(this.aClass1_Sub1_Sub2_7.aByteArray1, 0, 1);
					this.anInt921 = this.aClass1_Sub1_Sub2_7.aByteArray1[0] & 0xFF;
					if (this.aClass37_2 != null) {
						this.anInt921 = this.anInt921 - this.aClass37_2.method431() & 0xFF;
					}
					this.anInt920 = Class17.anIntArray67[this.anInt921];
					local16--;
				}
				if (this.anInt920 == -1) {
					if (local16 <= 0) {
						return false;
					}
					this.aClass36_1.method428(this.aClass1_Sub1_Sub2_7.aByteArray1, 0, 1);
					this.anInt920 = this.aClass1_Sub1_Sub2_7.aByteArray1[0] & 0xFF;
					local16--;
				}
				if (this.anInt920 == -2) {
					if (local16 <= 1) {
						return false;
					}
					this.aClass36_1.method428(this.aClass1_Sub1_Sub2_7.aByteArray1, 0, 2);
					this.aClass1_Sub1_Sub2_7.anInt153 = 0;
					this.anInt920 = this.aClass1_Sub1_Sub2_7.method61();
					local16 -= 2;
				}
				if (local16 < this.anInt920) {
					return false;
				}
				this.aClass1_Sub1_Sub2_7.anInt153 = 0;
				this.aClass36_1.method428(this.aClass1_Sub1_Sub2_7.aByteArray1, 0, this.anInt920);
				this.anInt922 = 0;
				this.anInt939 = this.anInt938;
				this.anInt938 = this.anInt937;
				this.anInt937 = this.anInt921;
				@Pc(170) int local170;
				@Pc(162) int local162;
				if (this.anInt921 == 117) {
					local162 = this.aClass1_Sub1_Sub2_7.method88(this.anInt1074);
					local166 = this.aClass1_Sub1_Sub2_7.method61();
					local170 = this.aClass1_Sub1_Sub2_7.method61();
					Class32.aClass32Array1[local166].anInt595 = (local170 << 16) + local162;
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 58) {
					this.anInt1001 = this.aClass1_Sub1_Sub2_7.method59();
					this.aBoolean223 = true;
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 70) {
					this.aBoolean225 = false;
					this.anInt925 = 2;
					this.aString19 = "";
					this.aBoolean232 = true;
					this.anInt921 = -1;
					return true;
				}
				@Pc(235) Class32 local235;
				if (this.anInt921 == 153) {
					local162 = this.aClass1_Sub1_Sub2_7.method86((byte) 1);
					local235 = Class32.aClass32Array1[local162];
					for (local170 = 0; local170 < local235.anIntArray142.length; local170++) {
						local235.anIntArray142[local170] = -1;
						local235.anIntArray142[local170] = 0;
					}
					this.anInt921 = -1;
					return true;
				}
				@Pc(286) int local286;
				@Pc(419) String local419;
				@Pc(284) boolean local284;
				@Pc(279) String local279;
				if (this.anInt921 == 17) {
					local268 = this.aClass1_Sub1_Sub2_7.method66();
					@Pc(282) long local282;
					if (local268.endsWith(":tradereq:")) {
						local279 = local268.substring(0, local268.indexOf(":"));
						local282 = Class49.method563(local279);
						local284 = false;
						for (local286 = 0; local286 < this.anInt1004; local286++) {
							if (this.aLongArray3[local286] == local282) {
								local284 = true;
								break;
							}
						}
						if (!local284 && this.anInt1013 == 0) {
							this.method624("wishes to trade with you.", local279, 4);
						}
					} else if (local268.endsWith(":duelreq:")) {
						local279 = local268.substring(0, local268.indexOf(":"));
						local282 = Class49.method563(local279);
						local284 = false;
						for (local286 = 0; local286 < this.anInt1004; local286++) {
							if (this.aLongArray3[local286] == local282) {
								local284 = true;
								break;
							}
						}
						if (!local284 && this.anInt1013 == 0) {
							this.method624("wishes to duel with you.", local279, 8);
						}
					} else if (local268.endsWith(":chalreq:")) {
						local279 = local268.substring(0, local268.indexOf(":"));
						local282 = Class49.method563(local279);
						local284 = false;
						for (local286 = 0; local286 < this.anInt1004; local286++) {
							if (this.aLongArray3[local286] == local282) {
								local284 = true;
								break;
							}
						}
						if (!local284 && this.anInt1013 == 0) {
							local419 = local268.substring(local268.indexOf(":") + 1, local268.length() - 9);
							this.method624(local419, local279, 8);
						}
					} else {
						this.method624(local268, "", 0);
					}
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 166) {
					this.anInt1052 = this.aClass1_Sub1_Sub2_7.method87(405) * 30;
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 113) {
					this.method656();
					this.anInt921 = -1;
					return false;
				}
				if (this.anInt921 == 143) {
					local162 = this.aClass1_Sub1_Sub2_7.method90();
					local166 = this.aClass1_Sub1_Sub2_7.method88(this.anInt1074);
					local170 = this.aClass1_Sub1_Sub2_7.method90();
					@Pc(491) Class32 local491 = Class32.aClass32Array1[local166];
					local491.anInt616 = local170;
					local491.anInt615 = local162;
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 253) {
					local162 = this.aClass1_Sub1_Sub2_7.method86((byte) 1);
					local166 = this.aClass1_Sub1_Sub2_7.method86((byte) 1);
					Class32.aClass32Array1[local166].anInt602 = 2;
					Class32.aClass32Array1[local166].anInt603 = local162;
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 228) {
					this.anInt932 = this.aClass1_Sub1_Sub2_7.method80();
					this.anInt931 = this.aClass1_Sub1_Sub2_7.method79();
					while (this.aClass1_Sub1_Sub2_7.anInt153 < this.anInt920) {
						local162 = this.aClass1_Sub1_Sub2_7.method59();
						this.method645(local162, this.aClass1_Sub1_Sub2_7);
					}
					this.anInt921 = -1;
					return true;
				}
				@Pc(591) int local591;
				@Pc(693) int local693;
				@Pc(726) int local726;
				@Pc(579) long local579;
				if (this.anInt921 == 251) {
					local579 = this.aClass1_Sub1_Sub2_7.method65();
					local170 = this.aClass1_Sub1_Sub2_7.method59();
					@Pc(589) String local589 = Class49.method567(Class49.method564(local579));
					for (local591 = 0; local591 < this.anInt1000; local591++) {
						if (local579 == this.aLongArray4[local591]) {
							if (this.anIntArray225[local591] != local170) {
								this.anIntArray225[local591] = local170;
								this.aBoolean223 = true;
								if (local170 > 0) {
									this.method624(local589 + " has logged in.", "", 5);
								}
								if (local170 == 0) {
									this.method624(local589 + " has logged out.", "", 5);
								}
							}
							local589 = null;
							break;
						}
					}
					if (local589 != null && this.anInt1000 < 200) {
						this.aLongArray4[this.anInt1000] = local579;
						this.aStringArray10[this.anInt1000] = local589;
						this.anIntArray225[this.anInt1000] = local170;
						this.anInt1000++;
						this.aBoolean223 = true;
					}
					@Pc(687) boolean local687 = false;
					while (!local687) {
						local687 = true;
						for (local693 = 0; local693 < this.anInt1000 - 1; local693++) {
							if (this.anIntArray225[local693] != anInt970 && this.anIntArray225[local693 + 1] == anInt970 || this.anIntArray225[local693] == 0 && this.anIntArray225[local693 + 1] != 0) {
								local726 = this.anIntArray225[local693];
								this.anIntArray225[local693] = this.anIntArray225[local693 + 1];
								this.anIntArray225[local693 + 1] = local726;
								@Pc(748) String local748 = this.aStringArray10[local693];
								this.aStringArray10[local693] = this.aStringArray10[local693 + 1];
								this.aStringArray10[local693 + 1] = local748;
								@Pc(770) long local770 = this.aLongArray4[local693];
								this.aLongArray4[local693] = this.aLongArray4[local693 + 1];
								this.aLongArray4[local693 + 1] = local770;
								this.aBoolean223 = true;
								local687 = false;
							}
						}
					}
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 59) {
					local162 = this.aClass1_Sub1_Sub2_7.method89();
					this.anInt982 = local162;
					this.aBoolean232 = true;
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 181) {
					local162 = this.aClass1_Sub1_Sub2_7.method88(this.anInt1074);
					local166 = this.aClass1_Sub1_Sub2_7.method59();
					if (local162 == 65535) {
						local162 = -1;
					}
					this.anIntArray216[local166] = local162;
					this.aBoolean223 = true;
					this.aBoolean256 = true;
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 86) {
					this.anInt1026 = this.aClass1_Sub1_Sub2_7.method59();
					this.anInt900 = this.aClass1_Sub1_Sub2_7.method59();
					this.anInt893 = this.aClass1_Sub1_Sub2_7.method59();
					this.aBoolean269 = true;
					this.aBoolean232 = true;
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 66) {
					for (local162 = 0; local162 < this.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length; local162++) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local162] != null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local162].anInt332 = -1;
						}
					}
					for (local166 = 0; local166 < this.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length; local166++) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local166] != null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local166].anInt332 = -1;
						}
					}
					this.anInt921 = -1;
					return true;
				}
				@Pc(959) int local959;
				if (this.anInt921 == 88) {
					local579 = this.aClass1_Sub1_Sub2_7.method65();
					local170 = this.aClass1_Sub1_Sub2_7.method64();
					local959 = this.aClass1_Sub1_Sub2_7.method59();
					local284 = false;
					for (local286 = 0; local286 < 100; local286++) {
						if (this.anIntArray238[local286] == local170) {
							local284 = true;
							break;
						}
					}
					if (local959 <= 1) {
						for (local693 = 0; local693 < this.anInt1004; local693++) {
							if (this.aLongArray3[local693] == local579) {
								local284 = true;
								break;
							}
						}
					}
					if (!local284 && this.anInt1013 == 0) {
						try {
							this.anIntArray238[this.anInt999] = local170;
							this.anInt999 = (this.anInt999 + 1) % 100;
							local419 = Class13.method185(this.anInt920 - 13, this.aClass1_Sub1_Sub2_7);
							if (local959 != 3) {
								local419 = Class30.method347(local419);
							}
							if (local959 == 2 || local959 == 3) {
								this.method624(local419, "@cr2@" + Class49.method567(Class49.method564(local579)), 7);
							} else if (local959 == 1) {
								this.method624(local419, "@cr1@" + Class49.method567(Class49.method564(local579)), 7);
							} else {
								this.method624(local419, Class49.method567(Class49.method564(local579)), 3);
							}
						} catch (@Pc(1094) Exception local1094) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 216) {
					local162 = this.aClass1_Sub1_Sub2_7.method89();
					if (local162 >= 0) {
						this.method618(local162);
					}
					this.anInt928 = local162;
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 129) {
					local162 = this.aClass1_Sub1_Sub2_7.method86((byte) 1);
					this.method618(local162);
					if (this.anInt1006 != -1) {
						this.anInt1006 = -1;
						this.aBoolean223 = true;
						this.aBoolean256 = true;
					}
					if (this.anInt1065 != -1) {
						this.anInt1065 = -1;
						this.aBoolean232 = true;
					}
					if (this.anInt960 != -1) {
						this.anInt960 = -1;
						this.aBoolean231 = true;
					}
					if (this.anInt925 != 0) {
						this.anInt925 = 0;
						this.aBoolean232 = true;
					}
					this.anInt1053 = local162;
					this.aBoolean257 = false;
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 18) {
					local162 = this.aClass1_Sub1_Sub2_7.method86((byte) 1);
					local166 = this.aClass1_Sub1_Sub2_7.method61();
					Class32.aClass32Array1[local162].anInt602 = 1;
					Class32.aClass32Array1[local162].anInt603 = local166;
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 3) {
					local162 = this.aClass1_Sub1_Sub2_7.method87(405);
					local166 = this.aClass1_Sub1_Sub2_7.method88(this.anInt1074);
					local170 = this.aClass1_Sub1_Sub2_7.method87(405);
					local959 = this.aClass1_Sub1_Sub2_7.method87(405);
					Class32.aClass32Array1[local162].anInt600 = local166;
					Class32.aClass32Array1[local162].anInt601 = local959;
					Class32.aClass32Array1[local162].anInt599 = local170;
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 65) {
					this.anInt866 = this.aClass1_Sub1_Sub2_7.method79();
					this.aBoolean223 = true;
					this.aBoolean256 = true;
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 101) {
					this.aBoolean223 = true;
					local162 = this.aClass1_Sub1_Sub2_7.method59();
					local166 = this.aClass1_Sub1_Sub2_7.method64();
					local170 = this.aClass1_Sub1_Sub2_7.method59();
					this.anIntArray270[local170] = local166;
					this.anIntArray224[local170] = local162;
					this.anIntArray230[local170] = 1;
					for (local959 = 0; local959 < 98; local959++) {
						if (local166 >= anIntArray215[local959]) {
							this.anIntArray230[local170] = local959 + 2;
						}
					}
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 27) {
					local162 = this.aClass1_Sub1_Sub2_7.method86((byte) 1);
					local166 = this.aClass1_Sub1_Sub2_7.method86((byte) 1);
					local170 = this.aClass1_Sub1_Sub2_7.method88(this.anInt1074);
					if (local166 == 65535) {
						Class32.aClass32Array1[local170].anInt602 = 0;
						this.anInt921 = -1;
						return true;
					}
					@Pc(1380) Class23 local1380 = Class23.method286(local166);
					Class32.aClass32Array1[local170].anInt602 = 4;
					Class32.aClass32Array1[local170].anInt603 = local166;
					Class32.aClass32Array1[local170].anInt600 = local1380.anInt454;
					Class32.aClass32Array1[local170].anInt601 = local1380.anInt441;
					Class32.aClass32Array1[local170].anInt599 = local1380.anInt452 * 100 / local162;
					this.anInt921 = -1;
					return true;
				}
				@Pc(1435) Class32 local1435;
				if (this.anInt921 == 126) {
					local162 = this.aClass1_Sub1_Sub2_7.method87(405);
					local166 = this.aClass1_Sub1_Sub2_7.method89();
					local1435 = Class32.aClass32Array1[local162];
					local1435.anInt610 = local166;
					if (local166 == -1) {
						local1435.anInt619 = 0;
						local1435.anInt596 = 0;
					}
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 246) {
					this.anInt934 = this.aClass1_Sub1_Sub2_7.method79();
					this.anInt1002 = this.aClass1_Sub1_Sub2_7.method61();
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 208) {
					local162 = this.aClass1_Sub1_Sub2_7.method61();
					this.method618(local162);
					this.anInt1053 = -1;
					this.anInt1006 = -1;
					this.anInt1065 = -1;
					this.anInt925 = 0;
					this.aBoolean257 = false;
					this.anInt960 = local162;
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 223) {
					@Pc(1520) boolean local1520 = this.aClass1_Sub1_Sub2_7.method59() == 1;
					local166 = this.aClass1_Sub1_Sub2_7.method86((byte) 1);
					Class32.aClass32Array1[local166].aBoolean157 = local1520;
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 94) {
					local162 = this.aClass1_Sub1_Sub2_7.method79();
					local279 = this.aClass1_Sub1_Sub2_7.method66();
					local170 = this.aClass1_Sub1_Sub2_7.method79();
					if (local162 >= 1 && local162 <= 5) {
						if (local279.equalsIgnoreCase("null")) {
							local279 = null;
						}
						this.aStringArray11[local162 - 1] = local279;
						this.aBooleanArray11[local162 - 1] = local170 == 0;
					}
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 155) {
					local162 = this.aClass1_Sub1_Sub2_7.method88(this.anInt1074);
					this.method618(local162);
					if (this.anInt1006 != -1) {
						this.anInt1006 = -1;
						this.aBoolean223 = true;
						this.aBoolean256 = true;
					}
					if (this.anInt960 != -1) {
						this.anInt960 = -1;
						this.aBoolean231 = true;
					}
					this.anInt1065 = local162;
					this.aBoolean232 = true;
					this.anInt1053 = -1;
					this.aBoolean257 = false;
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 179) {
					this.method615(this.anInt920, this.aClass1_Sub1_Sub2_7);
					this.aBoolean270 = false;
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 111) {
					local162 = this.aClass1_Sub1_Sub2_7.method86((byte) 1);
					local166 = this.aClass1_Sub1_Sub2_7.method88(this.anInt1074);
					if (this.anInt1065 != -1) {
						this.anInt1065 = -1;
						this.aBoolean232 = true;
					}
					if (this.anInt925 != 0) {
						this.anInt925 = 0;
						this.aBoolean232 = true;
					}
					this.anInt1053 = local162;
					this.anInt1006 = local166;
					this.aBoolean223 = true;
					this.aBoolean256 = true;
					this.aBoolean257 = false;
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 52) {
					if (this.anInt866 == 12) {
						this.aBoolean223 = true;
					}
					this.anInt1068 = this.aClass1_Sub1_Sub2_7.method59();
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 109) {
					this.aBoolean238 = false;
					for (local162 = 0; local162 < 5; local162++) {
						this.aBooleanArray12[local162] = false;
					}
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 241) {
					this.aBoolean225 = false;
					this.anInt925 = 1;
					this.aString19 = "";
					this.aBoolean232 = true;
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 4) {
					local162 = this.aClass1_Sub1_Sub2_7.method64();
					local166 = this.aClass1_Sub1_Sub2_7.method88(this.anInt1074);
					this.anIntArray242[local166] = local162;
					if (this.anIntArray243[local166] != local162) {
						this.anIntArray243[local166] = local162;
						this.method701(local166);
						this.aBoolean223 = true;
						if (this.anInt982 != -1) {
							this.aBoolean232 = true;
						}
					}
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 244 || this.anInt921 == 230 || this.anInt921 == 202 || this.anInt921 == 1 || this.anInt921 == 95 || this.anInt921 == 177 || this.anInt921 == 128 || this.anInt921 == 55 || this.anInt921 == 176 || this.anInt921 == 160 || this.anInt921 == 82) {
					this.method645(this.anInt921, this.aClass1_Sub1_Sub2_7);
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 235) {
					this.anInt931 = this.aClass1_Sub1_Sub2_7.method78(887);
					this.anInt932 = this.aClass1_Sub1_Sub2_7.method59();
					for (local162 = this.anInt931; local162 < this.anInt931 + 8; local162++) {
						for (local166 = this.anInt932; local166 < this.anInt932 + 8; local166++) {
							if (this.aClass7ArrayArrayArray1[this.anInt961][local162][local166] != null) {
								this.aClass7ArrayArrayArray1[this.anInt961][local162][local166] = null;
								this.method652(local162, local166);
							}
						}
					}
					for (@Pc(1955) Class1_Sub3 local1955 = (Class1_Sub3) this.aClass7_12.method100(); local1955 != null; local1955 = (Class1_Sub3) this.aClass7_12.method102()) {
						if (local1955.anInt381 >= this.anInt931 && local1955.anInt381 < this.anInt931 + 8 && local1955.anInt382 >= this.anInt932 && local1955.anInt382 < this.anInt932 + 8 && local1955.anInt379 == this.anInt961) {
							local1955.anInt383 = 0;
						}
					}
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 130) {
					if (this.anInt1006 != -1) {
						this.anInt1006 = -1;
						this.aBoolean223 = true;
						this.aBoolean256 = true;
					}
					if (this.anInt1065 != -1) {
						this.anInt1065 = -1;
						this.aBoolean232 = true;
					}
					if (this.anInt960 != -1) {
						this.anInt960 = -1;
						this.aBoolean231 = true;
					}
					if (this.anInt925 != 0) {
						this.anInt925 = 0;
						this.aBoolean232 = true;
					}
					this.anInt1053 = -1;
					this.aBoolean257 = false;
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 192) {
					local268 = this.aClass1_Sub1_Sub2_7.method66();
					local166 = this.aClass1_Sub1_Sub2_7.method88(this.anInt1074);
					Class32.aClass32Array1[local166].aString13 = local268;
					if (Class32.aClass32Array1[local166].anInt592 == this.anIntArray216[this.anInt866]) {
						this.aBoolean223 = true;
					}
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 60) {
					local162 = this.aClass1_Sub1_Sub2_7.method61();
					@Pc(2109) byte local2109 = this.aClass1_Sub1_Sub2_7.method81();
					this.anIntArray242[local162] = local2109;
					if (this.anIntArray243[local162] != local2109) {
						this.anIntArray243[local162] = local2109;
						this.method701(local162);
						this.aBoolean223 = true;
						if (this.anInt982 != -1) {
							this.aBoolean232 = true;
						}
					}
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 28) {
					local162 = this.aClass1_Sub1_Sub2_7.method87(405);
					Class32.aClass32Array1[local162].anInt602 = 3;
					if (aClass1_Sub1_Sub1_Sub1_Sub2_1.aClass31_2 == null) {
						Class32.aClass32Array1[local162].anInt603 = (aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray53[0] << 25) + (aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray53[4] << 20) + (aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray54[0] << 15) + (aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray54[8] << 10) + (aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray54[11] << 5) + aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray54[1];
					} else {
						Class32.aClass32Array1[local162].anInt603 = (int) (aClass1_Sub1_Sub1_Sub1_Sub2_1.aClass31_2.aLong22 + 305419896L);
					}
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 201) {
					this.anInt932 = this.aClass1_Sub1_Sub2_7.method79();
					this.anInt931 = this.aClass1_Sub1_Sub2_7.method78(887);
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 110) {
					for (local162 = 0; local162 < this.anIntArray243.length; local162++) {
						if (this.anIntArray243[local162] != this.anIntArray242[local162]) {
							this.anIntArray243[local162] = this.anIntArray242[local162];
							this.method701(local162);
							this.aBoolean223 = true;
						}
					}
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 87) {
					this.anInt1049 = this.aClass1_Sub1_Sub2_7.method59();
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 24) {
					this.aBoolean223 = true;
					local162 = this.aClass1_Sub1_Sub2_7.method61();
					local235 = Class32.aClass32Array1[local162];
					local170 = this.aClass1_Sub1_Sub2_7.method61();
					for (local959 = 0; local959 < local170; local959++) {
						local591 = this.aClass1_Sub1_Sub2_7.method79();
						if (local591 == 255) {
							local591 = this.aClass1_Sub1_Sub2_7.method64();
						}
						local235.anIntArray142[local959] = this.aClass1_Sub1_Sub2_7.method86((byte) 1);
						local235.anIntArray145[local959] = local591;
					}
					for (local591 = local170; local591 < local235.anIntArray142.length; local591++) {
						local235.anIntArray142[local591] = 0;
						local235.anIntArray145[local591] = 0;
					}
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 212) {
					this.anInt1048 = this.aClass1_Sub1_Sub2_7.method78(887);
					if (this.anInt1048 == this.anInt866) {
						if (this.anInt1048 == 3) {
							this.anInt866 = 1;
						} else {
							this.anInt866 = 3;
						}
						this.aBoolean223 = true;
					}
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 9) {
					local162 = this.aClass1_Sub1_Sub2_7.method87(405);
					local166 = this.aClass1_Sub1_Sub2_7.method86((byte) 1);
					local170 = local166 >> 10 & 0x1F;
					local959 = local166 >> 5 & 0x1F;
					local591 = local166 & 0x1F;
					Class32.aClass32Array1[local162].anInt605 = (local170 << 19) + (local959 << 11) + (local591 << 3);
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 78) {
					this.anInt888 = 0;
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 236) {
					local162 = this.aClass1_Sub1_Sub2_7.method61();
					local166 = this.aClass1_Sub1_Sub2_7.method59();
					local170 = this.aClass1_Sub1_Sub2_7.method61();
					if (this.aBoolean245 && !aBoolean247 && this.anInt904 < 50) {
						this.anIntArray234[this.anInt904] = local162;
						this.anIntArray217[this.anInt904] = local166;
						this.anIntArray252[this.anInt904] = local170 + Class43.anIntArray189[local162];
						this.anInt904++;
					}
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 89) {
					if (this.anInt866 == 12) {
						this.aBoolean223 = true;
					}
					this.anInt967 = this.aClass1_Sub1_Sub2_7.method62();
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 168) {
					local162 = this.aClass1_Sub1_Sub2_7.method86((byte) 1);
					if (local162 == 65535) {
						local162 = -1;
					}
					if (local162 != this.anInt880 && this.aBoolean250 && !aBoolean247 && this.anInt1014 == 0) {
						this.anInt958 = local162;
						this.aBoolean243 = true;
						this.aClass20_Sub1_1.method394(2, this.anInt958);
					}
					this.anInt880 = local162;
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 83) {
					local162 = this.aClass1_Sub1_Sub2_7.method88(this.anInt1074);
					local166 = this.aClass1_Sub1_Sub2_7.method91();
					if (this.aBoolean250 && !aBoolean247) {
						this.anInt958 = local162;
						this.aBoolean243 = false;
						this.aClass20_Sub1_1.method394(2, this.anInt958);
						this.anInt1014 = local166;
					}
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 249) {
					this.method634(this.aClass1_Sub1_Sub2_7, this.anInt920);
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 96 || this.anInt921 == 44) {
					local162 = this.anInt1024;
					local166 = this.anInt1025;
					if (this.anInt921 == 96) {
						local162 = this.aClass1_Sub1_Sub2_7.method61();
						local166 = this.aClass1_Sub1_Sub2_7.method88(this.anInt1074);
						this.aBoolean262 = false;
					}
					if (this.anInt921 == 44) {
						local166 = this.aClass1_Sub1_Sub2_7.method88(this.anInt1074);
						this.aClass1_Sub1_Sub2_7.method69();
						local170 = 0;
						while (true) {
							if (local170 >= 4) {
								this.aClass1_Sub1_Sub2_7.method71();
								local162 = this.aClass1_Sub1_Sub2_7.method87(405);
								this.aBoolean262 = true;
								break;
							}
							for (local959 = 0; local959 < 13; local959++) {
								for (local591 = 0; local591 < 13; local591++) {
									local286 = this.aClass1_Sub1_Sub2_7.method70(881, 1);
									if (local286 == 1) {
										this.anIntArrayArrayArray7[local170][local959][local591] = this.aClass1_Sub1_Sub2_7.method70(881, 26);
									} else {
										this.anIntArrayArrayArray7[local170][local959][local591] = -1;
									}
								}
							}
							local170++;
						}
					}
					if (this.anInt1024 == local162 && this.anInt1025 == local166 && this.anInt966 == 2) {
						this.anInt921 = -1;
						return true;
					}
					this.anInt1024 = local162;
					this.anInt1025 = local166;
					this.anInt1037 = (this.anInt1024 - 6) * 8;
					this.anInt1038 = (this.anInt1025 - 6) * 8;
					this.aBoolean265 = false;
					if ((this.anInt1024 / 8 == 48 || this.anInt1024 / 8 == 49) && this.anInt1025 / 8 == 48) {
						this.aBoolean265 = true;
					}
					if (this.anInt1024 / 8 == 48 && this.anInt1025 / 8 == 148) {
						this.aBoolean265 = true;
					}
					this.anInt966 = 1;
					this.aLong30 = System.currentTimeMillis();
					this.aClass12_26.method182(this.anInt1054);
					this.aClass1_Sub1_Sub3_Sub3_3.method225(151, "Loading - please wait.", 0, 257);
					this.aClass1_Sub1_Sub3_Sub3_3.method225(150, "Loading - please wait.", 16777215, 256);
					this.aClass12_26.method183(4, 4, super.aGraphics2);
					if (this.anInt921 == 96) {
						local170 = 0;
						local959 = (this.anInt1024 - 6) / 8;
						label1127: while (true) {
							if (local959 > (this.anInt1024 + 6) / 8) {
								this.aByteArrayArray5 = new byte[local170][];
								this.aByteArrayArray4 = new byte[local170][];
								this.anIntArray271 = new int[local170];
								this.anIntArray272 = new int[local170];
								this.anIntArray273 = new int[local170];
								local170 = 0;
								local591 = (this.anInt1024 - 6) / 8;
								while (true) {
									if (local591 > (this.anInt1024 + 6) / 8) {
										break label1127;
									}
									for (local286 = (this.anInt1025 - 6) / 8; local286 <= (this.anInt1025 + 6) / 8; local286++) {
										this.anIntArray271[local170] = (local591 << 8) + local286;
										if (this.aBoolean265 && (local286 == 49 || local286 == 149 || local286 == 147 || local591 == 50 || local591 == 49 && local286 == 47)) {
											this.anIntArray272[local170] = -1;
											this.anIntArray273[local170] = -1;
											local170++;
										} else {
											local693 = this.anIntArray272[local170] = this.aClass20_Sub1_1.method392(0, local286, local591, (byte) 5);
											if (local693 != -1) {
												this.aClass20_Sub1_1.method394(3, local693);
											}
											local726 = this.anIntArray273[local170] = this.aClass20_Sub1_1.method392(1, local286, local591, (byte) 5);
											if (local726 != -1) {
												this.aClass20_Sub1_1.method394(3, local726);
											}
											local170++;
										}
									}
									local591++;
								}
							}
							for (local591 = (this.anInt1025 - 6) / 8; local591 <= (this.anInt1025 + 6) / 8; local591++) {
								local170++;
							}
							local959++;
						}
					}
					if (this.anInt921 == 44) {
						local170 = 0;
						@Pc(3077) int[] local3077 = new int[676];
						local591 = 0;
						label1086: while (true) {
							@Pc(3107) int local3107;
							@Pc(3113) int local3113;
							@Pc(3123) int local3123;
							if (local591 >= 4) {
								this.aByteArrayArray5 = new byte[local170][];
								this.aByteArrayArray4 = new byte[local170][];
								this.anIntArray271 = new int[local170];
								this.anIntArray272 = new int[local170];
								this.anIntArray273 = new int[local170];
								local286 = 0;
								while (true) {
									if (local286 >= local170) {
										break label1086;
									}
									local693 = this.anIntArray271[local286] = local3077[local286];
									local726 = local693 >> 8 & 0xFF;
									local3107 = local693 & 0xFF;
									local3113 = this.anIntArray272[local286] = this.aClass20_Sub1_1.method392(0, local3107, local726, (byte) 5);
									if (local3113 != -1) {
										this.aClass20_Sub1_1.method394(3, local3113);
									}
									local3123 = this.anIntArray273[local286] = this.aClass20_Sub1_1.method392(1, local3107, local726, (byte) 5);
									if (local3123 != -1) {
										this.aClass20_Sub1_1.method394(3, local3123);
									}
									local286++;
								}
							}
							for (local286 = 0; local286 < 13; local286++) {
								for (local693 = 0; local693 < 13; local693++) {
									local726 = this.anIntArrayArrayArray7[local591][local286][local693];
									if (local726 != -1) {
										local3107 = local726 >> 14 & 0x3FF;
										local3113 = local726 >> 3 & 0x7FF;
										local3123 = (local3107 / 8 << 8) + local3113 / 8;
										for (@Pc(3125) int local3125 = 0; local3125 < local170; local3125++) {
											if (local3077[local3125] == local3123) {
												local3123 = -1;
												break;
											}
										}
										if (local3123 != -1) {
											local3077[local170++] = local3123;
										}
									}
								}
							}
							local591++;
						}
					}
					local170 = this.anInt1037 - this.anInt1039;
					local959 = this.anInt1038 - this.anInt1040;
					this.anInt1039 = this.anInt1037;
					this.anInt1040 = this.anInt1038;
					for (local591 = 0; local591 < 16384; local591++) {
						@Pc(3278) Class1_Sub1_Sub1_Sub1_Sub1 local3278 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local591];
						if (local3278 != null) {
							for (local693 = 0; local693 < 10; local693++) {
								local3278.anIntArray48[local693] -= local170;
								local3278.anIntArray49[local693] -= local959;
							}
							local3278.anInt319 -= local170 * 128;
							local3278.anInt320 -= local959 * 128;
						}
					}
					for (local286 = 0; local286 < this.anInt869; local286++) {
						@Pc(3333) Class1_Sub1_Sub1_Sub1_Sub2 local3333 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local286];
						if (local3333 != null) {
							for (local726 = 0; local726 < 10; local726++) {
								local3333.anIntArray48[local726] -= local170;
								local3333.anIntArray49[local726] -= local959;
							}
							local3333.anInt319 -= local170 * 128;
							local3333.anInt320 -= local959 * 128;
						}
					}
					this.aBoolean270 = true;
					@Pc(3385) byte local3385 = 0;
					@Pc(3387) byte local3387 = 104;
					@Pc(3389) byte local3389 = 1;
					if (local170 < 0) {
						local3385 = 103;
						local3387 = -1;
						local3389 = -1;
					}
					@Pc(3399) byte local3399 = 0;
					@Pc(3401) byte local3401 = 104;
					@Pc(3403) byte local3403 = 1;
					if (local959 < 0) {
						local3399 = 103;
						local3401 = -1;
						local3403 = -1;
					}
					for (@Pc(3413) int local3413 = local3385; local3413 != local3387; local3413 += local3389) {
						for (@Pc(3417) int local3417 = local3399; local3417 != local3401; local3417 += local3403) {
							@Pc(3423) int local3423 = local3413 + local170;
							@Pc(3427) int local3427 = local3417 + local959;
							for (@Pc(3429) int local3429 = 0; local3429 < 4; local3429++) {
								if (local3423 >= 0 && local3427 >= 0 && local3423 < 104 && local3427 < 104) {
									this.aClass7ArrayArrayArray1[local3429][local3413][local3417] = this.aClass7ArrayArrayArray1[local3429][local3423][local3427];
								} else {
									this.aClass7ArrayArrayArray1[local3429][local3413][local3417] = null;
								}
							}
						}
					}
					for (@Pc(3491) Class1_Sub3 local3491 = (Class1_Sub3) this.aClass7_12.method100(); local3491 != null; local3491 = (Class1_Sub3) this.aClass7_12.method102()) {
						local3491.anInt381 -= local170;
						local3491.anInt382 -= local959;
						if (local3491.anInt381 < 0 || local3491.anInt382 < 0 || local3491.anInt381 >= 104 || local3491.anInt382 >= 104) {
							local3491.method507();
						}
					}
					if (this.anInt888 != 0) {
						this.anInt888 -= local170;
						this.anInt889 -= local959;
					}
					this.aBoolean238 = false;
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 150) {
					this.anInt1004 = this.anInt920 / 8;
					for (local162 = 0; local162 < this.anInt1004; local162++) {
						this.aLongArray3[local162] = this.aClass1_Sub1_Sub2_7.method65();
					}
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 145) {
					this.aBoolean238 = true;
					this.anInt1007 = this.aClass1_Sub1_Sub2_7.method59();
					this.anInt1008 = this.aClass1_Sub1_Sub2_7.method59();
					this.anInt1009 = this.aClass1_Sub1_Sub2_7.method61();
					this.anInt1010 = this.aClass1_Sub1_Sub2_7.method59();
					this.anInt1011 = this.aClass1_Sub1_Sub2_7.method59();
					if (this.anInt1011 >= 100) {
						this.anInt1028 = this.anInt1007 * 128 + 64;
						this.anInt1030 = this.anInt1008 * 128 + 64;
						this.anInt1029 = this.method696(this.anInt1028, this.anInt961, this.anInt1030) - this.anInt1009;
					}
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 206) {
					local162 = this.aClass1_Sub1_Sub2_7.method88(this.anInt1074);
					local166 = this.aClass1_Sub1_Sub2_7.method87(405);
					local1435 = Class32.aClass32Array1[local162];
					if (local1435 != null && local1435.anInt618 == 0) {
						if (local166 < 0) {
							local166 = 0;
						}
						if (local166 > local1435.anInt612 - local1435.anInt598) {
							local166 = local1435.anInt612 - local1435.anInt598;
						}
						local1435.anInt613 = local166;
					}
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 106) {
					local162 = this.aClass1_Sub1_Sub2_7.method59();
					local166 = this.aClass1_Sub1_Sub2_7.method59();
					local170 = this.aClass1_Sub1_Sub2_7.method59();
					local959 = this.aClass1_Sub1_Sub2_7.method59();
					this.aBooleanArray12[local162] = true;
					this.anIntArray222[local162] = local166;
					this.anIntArray231[local162] = local170;
					this.anIntArray235[local162] = local959;
					this.anIntArray219[local162] = 0;
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 156) {
					this.anInt874 = this.aClass1_Sub1_Sub2_7.method59();
					this.anInt863 = this.aClass1_Sub1_Sub2_7.method78(887);
					this.anInt1051 = this.aClass1_Sub1_Sub2_7.method87(405);
					this.anInt867 = this.aClass1_Sub1_Sub2_7.method88(this.anInt1074);
					this.anInt905 = this.aClass1_Sub1_Sub2_7.method93();
					if (this.anInt905 != 0 && this.anInt1053 == -1) {
						signlink.dnslookup(Class49.method566(this.anInt905));
						this.method678();
						@Pc(3805) short local3805 = 650;
						if (this.anInt874 != 201 || this.anInt863 == 1) {
							local3805 = 655;
						}
						this.aString27 = "";
						this.aBoolean251 = false;
						for (local166 = 0; local166 < Class32.aClass32Array1.length; local166++) {
							if (Class32.aClass32Array1[local166] != null && Class32.aClass32Array1[local166].anInt607 == local3805) {
								this.anInt1053 = Class32.aClass32Array1[local166].anInt592;
								break;
							}
						}
					}
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 172) {
					this.aBoolean238 = true;
					this.anInt1043 = this.aClass1_Sub1_Sub2_7.method59();
					this.anInt1044 = this.aClass1_Sub1_Sub2_7.method59();
					this.anInt1045 = this.aClass1_Sub1_Sub2_7.method61();
					this.anInt1046 = this.aClass1_Sub1_Sub2_7.method59();
					this.anInt1047 = this.aClass1_Sub1_Sub2_7.method59();
					if (this.anInt1047 >= 100) {
						local162 = this.anInt1043 * 128 + 64;
						local166 = this.anInt1044 * 128 + 64;
						local170 = this.method696(local162, this.anInt961, local166) - this.anInt1045;
						local959 = local162 - this.anInt1028;
						local591 = local170 - this.anInt1029;
						local286 = local166 - this.anInt1030;
						local693 = (int) Math.sqrt((double) (local959 * local959 + local286 * local286));
						this.anInt1031 = (int) (Math.atan2((double) local591, (double) local693) * 325.949D) & 0x7FF;
						this.anInt1032 = (int) (Math.atan2((double) local959, (double) local286) * -325.949D) & 0x7FF;
						if (this.anInt1031 < 128) {
							this.anInt1031 = 128;
						}
						if (this.anInt1031 > 383) {
							this.anInt1031 = 383;
						}
					}
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 40) {
					this.aBoolean223 = true;
					local162 = this.aClass1_Sub1_Sub2_7.method61();
					local235 = Class32.aClass32Array1[local162];
					while (this.aClass1_Sub1_Sub2_7.anInt153 < this.anInt920) {
						local170 = this.aClass1_Sub1_Sub2_7.method73();
						local959 = this.aClass1_Sub1_Sub2_7.method61();
						local591 = this.aClass1_Sub1_Sub2_7.method59();
						if (local591 == 255) {
							local591 = this.aClass1_Sub1_Sub2_7.method64();
						}
						if (local170 >= 0 && local170 < local235.anIntArray142.length) {
							local235.anIntArray142[local170] = local959;
							local235.anIntArray145[local170] = local591;
						}
					}
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 154) {
					this.anInt1023 = this.aClass1_Sub1_Sub2_7.method59();
					if (this.anInt1023 == 1) {
						this.anInt1012 = this.aClass1_Sub1_Sub2_7.method61();
					}
					if (this.anInt1023 >= 2 && this.anInt1023 <= 6) {
						if (this.anInt1023 == 2) {
							this.anInt978 = 64;
							this.anInt979 = 64;
						}
						if (this.anInt1023 == 3) {
							this.anInt978 = 0;
							this.anInt979 = 64;
						}
						if (this.anInt1023 == 4) {
							this.anInt978 = 128;
							this.anInt979 = 64;
						}
						if (this.anInt1023 == 5) {
							this.anInt978 = 64;
							this.anInt979 = 0;
						}
						if (this.anInt1023 == 6) {
							this.anInt978 = 64;
							this.anInt979 = 128;
						}
						this.anInt1023 = 2;
						this.anInt975 = this.aClass1_Sub1_Sub2_7.method61();
						this.anInt976 = this.aClass1_Sub1_Sub2_7.method61();
						this.anInt977 = this.aClass1_Sub1_Sub2_7.method59();
					}
					if (this.anInt1023 == 10) {
						this.anInt876 = this.aClass1_Sub1_Sub2_7.method61();
					}
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 90) {
					local162 = this.aClass1_Sub1_Sub2_7.method88(this.anInt1074);
					this.method618(local162);
					if (this.anInt1065 != -1) {
						this.anInt1065 = -1;
						this.aBoolean232 = true;
					}
					if (this.anInt925 != 0) {
						this.anInt925 = 0;
						this.aBoolean232 = true;
					}
					if (this.anInt960 != -1) {
						this.anInt960 = -1;
						this.aBoolean231 = true;
					}
					this.anInt1006 = local162;
					this.aBoolean223 = true;
					this.aBoolean256 = true;
					this.anInt1053 = -1;
					this.aBoolean257 = false;
					this.anInt921 = -1;
					return true;
				}
				if (this.anInt921 == 173) {
					this.anInt1063 = this.aClass1_Sub1_Sub2_7.method59();
					this.anInt921 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt921 + "," + this.anInt920 + " - " + this.anInt938 + "," + this.anInt939);
				this.method656();
			} catch (@Pc(4261) IOException local4261) {
				this.method594();
			} catch (@Pc(4266) Exception local4266) {
				local268 = "T2 - " + this.anInt921 + "," + this.anInt938 + "," + this.anInt939 + " - " + this.anInt920 + "," + (this.anInt1037 + aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray48[0]) + "," + (this.anInt1038 + aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray49[0]) + " - ";
				for (local166 = 0; local166 < this.anInt920 && local166 < 50; local166++) {
					local268 = local268 + this.aClass1_Sub1_Sub2_7.aByteArray1[local166] + ",";
				}
				signlink.reporterror(local268);
				this.method656();
			}
			return true;
		} catch (@Pc(4347) RuntimeException local4347) {
			signlink.reporterror("99872, " + 0 + ", " + local4347.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method655() {
		try {
			this.aClass12_24.method182(this.anInt1054);
			Class1_Sub1_Sub3_Sub4.anIntArray181 = this.anIntArray245;
			this.aClass1_Sub1_Sub3_Sub2_1.method208(0, 0);
			if (this.anInt1006 != -1) {
				this.method630(0, 0, 0, Class32.aClass32Array1[this.anInt1006]);
			} else if (this.anIntArray216[this.anInt866] != -1) {
				this.method630(0, 0, 0, Class32.aClass32Array1[this.anIntArray216[this.anInt866]]);
			}
			if (this.aBoolean259 && this.anInt915 == 1) {
				this.method587();
			}
			this.aClass12_24.method183(205, 553, super.aGraphics2);
			this.aClass12_26.method182(this.anInt1054);
			Class1_Sub1_Sub3_Sub4.anIntArray181 = this.anIntArray246;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("18242, " + -96 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method656() {
		try {
			try {
				if (this.aClass36_1 != null) {
					this.aClass36_1.method425();
				}
			} catch (@Pc(7) Exception local7) {
			}
			this.aClass36_1 = null;
			this.aBoolean264 = false;
			this.anInt882 = 0;
			this.aString28 = "";
			this.aString29 = "";
			this.method702();
			this.aClass40_1.method456();
			for (@Pc(41) int local41 = 0; local41 < 4; local41++) {
				this.aClass18Array1[local41].method256();
			}
			System.gc();
			this.method584();
			this.anInt880 = -1;
			this.anInt958 = -1;
			this.anInt1014 = 0;
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("29744, " + 190 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!OPFNUBIN;IIIIIIII)V")
	private void method657(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (this.aBoolean266) {
				this.anInt948 = 32;
			} else {
				this.anInt948 = 0;
			}
			this.aBoolean266 = false;
			if (arg1 >= arg4 && arg1 < arg4 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
				arg0.anInt613 -= this.anInt1070 * 4;
				if (arg5 == 1) {
					this.aBoolean223 = true;
				}
				if (arg5 == 2) {
					this.aBoolean232 = true;
					return;
				}
			} else if (arg1 >= arg4 && arg1 < arg4 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
				arg0.anInt613 += this.anInt1070 * 4;
				if (arg5 == 1) {
					this.aBoolean223 = true;
				}
				if (arg5 == 2) {
					this.aBoolean232 = true;
					return;
				}
			} else if (arg1 >= arg4 - this.anInt948 && arg1 < arg4 + this.anInt948 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16 && this.anInt1070 > 0) {
				@Pc(144) int local144 = (arg3 - 32) * arg3 / arg7;
				if (local144 < 8) {
					local144 = 8;
				}
				@Pc(159) int local159 = arg6 - arg2 - local144 / 2 - 16;
				@Pc(165) int local165 = arg3 - local144 - 32;
				arg0.anInt613 = (arg7 - arg3) * local159 / local165;
				if (arg5 == 1) {
					this.aBoolean223 = true;
				}
				if (arg5 == 2) {
					this.aBoolean232 = true;
				}
				this.aBoolean266 = true;
			} else {
				return;
			}
		} catch (@Pc(191) RuntimeException local191) {
			signlink.reporterror("41028, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -720 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local191.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)Z")
	private boolean method658(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(14) int local14 = this.anIntArray250[arg0];
			if (local14 >= 2000) {
				local14 -= 2000;
			}
			return local14 == 50;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("43654, " + arg0 + ", " + true + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
	private void method659(@OriginalArg(0) boolean arg0) {
		try {
			if (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt319 >> 7 == this.anInt888 && aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt320 >> 7 == this.anInt889) {
				this.anInt888 = 0;
			}
			@Pc(21) int local21 = this.anInt871;
			if (arg0) {
				local21 = 1;
			}
			for (@Pc(27) int local27 = 0; local27 < local21; local27++) {
				@Pc(33) Class1_Sub1_Sub1_Sub1_Sub2 local33;
				@Pc(38) int local38;
				if (arg0) {
					local33 = aClass1_Sub1_Sub1_Sub1_Sub2_1;
					local38 = this.anInt870 << 14;
				} else {
					local33 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray213[local27]];
					local38 = this.anIntArray213[local27] << 14;
				}
				if (local33 != null && local33.method247()) {
					local33.aBoolean90 = false;
					if ((aBoolean247 && this.anInt871 > 50 || this.anInt871 > 200) && !arg0 && local33.anInt339 == local33.anInt327) {
						local33.aBoolean90 = true;
					}
					@Pc(89) int local89 = local33.anInt319 >> 7;
					@Pc(94) int local94 = local33.anInt320 >> 7;
					if (local89 >= 0 && local89 < 104 && local94 >= 0 && local94 < 104) {
						if (local33.aClass1_Sub1_Sub1_Sub4_1 == null || anInt903 < local33.anInt354 || anInt903 >= local33.anInt355) {
							if ((local33.anInt319 & 0x7F) == 64 && (local33.anInt320 & 0x7F) == 64) {
								if (this.anIntArrayArray22[local89][local94] == this.anInt1035) {
									continue;
								}
								this.anIntArrayArray22[local89][local94] = this.anInt1035;
							}
							local33.anInt352 = this.method696(local33.anInt319, this.anInt961, local33.anInt320);
							this.aClass40_1.method467(local33, local33.anInt321, local33.aBoolean89, local33.anInt319, this.anInt961, 60, local33.anInt320, local38, local33.anInt352);
						} else {
							local33.aBoolean90 = false;
							local33.anInt352 = this.method696(local33.anInt319, this.anInt961, local33.anInt320);
							this.aClass40_1.method468(local33.anInt350, local38, local33, local33.anInt319, local33.anInt320, this.anInt961, local33.anInt349, local33.anInt321, local33.anInt352, local33.anInt348, local33.anInt351);
						}
					}
				}
			}
			this.anInt920 += 0;
		} catch (@Pc(229) RuntimeException local229) {
			signlink.reporterror("29056, " + arg0 + ", " + 0 + ", " + local229.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	private boolean method660(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg0) {
				this.anInt1074 = 0;
			}
			if (arg1 == null) {
				return false;
			}
			for (@Pc(10) int local10 = 0; local10 < this.anInt1000; local10++) {
				if (arg1.equalsIgnoreCase(this.aStringArray10[local10])) {
					return true;
				}
			}
			return arg1.equalsIgnoreCase(aClass1_Sub1_Sub1_Sub1_Sub2_1.aString5);
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("81905, " + arg0 + ", " + arg1 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!CUKAGIIJ;I)V")
	private void method661(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3_Sub1 arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = this.anInt984 + this.anInt973 & 0x7FF;
			@Pc(18) int local18 = arg0 * arg0 + arg2 * arg2;
			if (local18 <= 6400) {
				@Pc(26) int local26 = Class1_Sub1_Sub1_Sub4.anIntArray120[local7];
				@Pc(30) int local30 = Class1_Sub1_Sub1_Sub4.anIntArray121[local7];
				@Pc(39) int local39 = local26 * 256 / (this.anInt954 + 256);
				@Pc(48) int local48 = local30 * 256 / (this.anInt954 + 256);
				@Pc(58) int local58 = arg2 * local39 + arg0 * local48 >> 16;
				@Pc(68) int local68 = arg2 * local48 - arg0 * local39 >> 16;
				if (local18 > 2500) {
					arg1.method144(this.aClass1_Sub1_Sub3_Sub2_2, 83 - local68 - arg1.anInt196 / 2 - 4, local58 + 94 - arg1.anInt195 / 2 + 4);
				} else {
					arg1.method138(local58 + 94 + 4 - arg1.anInt195 / 2, 83 - local68 - arg1.anInt196 / 2 - 4);
				}
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("21658, " + 610 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method662() {
		try {
			if (this.anInt1063 == 0 && super.anInt857 == 1) {
				@Pc(20) int local20 = super.anInt858 - 25 - 550;
				@Pc(27) int local27 = super.anInt859 - 5 - 4;
				if (local20 >= 0 && local27 >= 0 && local20 < 146 && local27 < 151) {
					local20 -= 73;
					local27 -= 75;
					@Pc(47) int local47 = this.anInt984 + this.anInt973 & 0x7FF;
					@Pc(51) int local51 = Class1_Sub1_Sub3_Sub4.anIntArray179[local47];
					@Pc(55) int local55 = Class1_Sub1_Sub3_Sub4.anIntArray180[local47];
					@Pc(64) int local64 = local51 * (this.anInt954 + 256) >> 8;
					@Pc(73) int local73 = local55 * (this.anInt954 + 256) >> 8;
					@Pc(83) int local83 = local27 * local64 + local20 * local73 >> 11;
					@Pc(93) int local93 = local27 * local73 - local20 * local64 >> 11;
					@Pc(100) int local100 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt319 + local83 >> 7;
					@Pc(107) int local107 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt320 - local93 >> 7;
					@Pc(129) boolean local129 = this.method691(local100, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray48[0], 0, 0, local107, 1, 0, true, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray49[0], this.anInt892);
					if (local129) {
						this.aClass1_Sub1_Sub2_8.method49(local20);
						this.aClass1_Sub1_Sub2_8.method49(local27);
						this.aClass1_Sub1_Sub2_8.method50(this.anInt984);
						this.aClass1_Sub1_Sub2_8.method49(57);
						this.aClass1_Sub1_Sub2_8.method49(this.anInt973);
						this.aClass1_Sub1_Sub2_8.method49(this.anInt954);
						this.aClass1_Sub1_Sub2_8.method49(89);
						this.aClass1_Sub1_Sub2_8.method50(aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt319);
						this.aClass1_Sub1_Sub2_8.method50(aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt320);
						this.aClass1_Sub1_Sub2_8.method49(this.anInt1021);
						this.aClass1_Sub1_Sub2_8.method49(63);
						return;
					}
				}
			}
		} catch (@Pc(183) RuntimeException local183) {
			signlink.reporterror("62273, " + 47759 + ", " + local183.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIZ)V")
	private void method663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			this.aBoolean264 &= true;
			this.aClass1_Sub1_Sub3_Sub2_19.method208(arg3, arg0);
			this.aClass1_Sub1_Sub3_Sub2_20.method208(arg3, arg0 + arg4 - 16);
			Class1_Sub1_Sub3.method514(arg3, arg0 + 16, this.anInt995, 16, arg4 - 32);
			@Pc(41) int local41 = (arg4 - 32) * arg4 / arg1;
			if (local41 < 8) {
				local41 = 8;
			}
			@Pc(58) int local58 = (arg4 - local41 - 32) * arg2 / (arg1 - arg4);
			Class1_Sub1_Sub3.method514(arg3, arg0 + local58 + 16, this.anInt1018, 16, local41);
			Class1_Sub1_Sub3.method519(arg3, 185, arg0 + local58 + 16, this.anInt1071, local41);
			Class1_Sub1_Sub3.method519(arg3 + 1, 185, arg0 + local58 + 16, this.anInt1071, local41);
			Class1_Sub1_Sub3.method517(16, arg0 + local58 + 16, this.anInt1071, arg3);
			Class1_Sub1_Sub3.method517(16, arg0 + local58 + 17, this.anInt1071, arg3);
			Class1_Sub1_Sub3.method519(arg3 + 15, 185, arg0 + local58 + 16, this.anInt864, local41);
			Class1_Sub1_Sub3.method519(arg3 + 14, 185, arg0 + local58 + 17, this.anInt864, local41 - 1);
			Class1_Sub1_Sub3.method517(16, arg0 + local58 + local41 + 15, this.anInt864, arg3);
			Class1_Sub1_Sub3.method517(15, arg0 + local58 + local41 + 14, this.anInt864, arg3 + 1);
		} catch (@Pc(174) RuntimeException local174) {
			signlink.reporterror("80373, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + true + ", " + local174.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method664() {
		try {
			@Pc(7) int local7 = this.aClass1_Sub1_Sub3_Sub3_4.method227("Choose Option");
			@Pc(20) int local20;
			for (@Pc(9) int local9 = 0; local9 < this.anInt949; local9++) {
				local20 = this.aClass1_Sub1_Sub3_Sub3_4.method227(this.aStringArray12[local9]);
				if (local20 > local7) {
					local7 = local20;
				}
			}
			local7 += 8;
			local20 = this.anInt949 * 15 + 21;
			@Pc(70) int local70;
			@Pc(88) int local88;
			if (super.anInt858 > 4 && super.anInt859 > 4 && super.anInt858 < 516 && super.anInt859 < 338) {
				local70 = super.anInt858 - local7 / 2 - 4;
				if (local70 + local7 > 512) {
					local70 = 512 - local7;
				}
				if (local70 < 0) {
					local70 = 0;
				}
				local88 = super.anInt859 - 4;
				if (local88 + local20 > 334) {
					local88 = 334 - local20;
				}
				if (local88 < 0) {
					local88 = 0;
				}
				this.aBoolean259 = true;
				this.anInt915 = 0;
				this.anInt916 = local70;
				this.anInt917 = local88;
				this.anInt918 = local7;
				this.anInt919 = this.anInt949 * 15 + 22;
			}
			if (super.anInt858 > 553 && super.anInt859 > 205 && super.anInt858 < 743 && super.anInt859 < 466) {
				local70 = super.anInt858 - local7 / 2 - 553;
				if (local70 < 0) {
					local70 = 0;
				} else if (local70 + local7 > 190) {
					local70 = 190 - local7;
				}
				local88 = super.anInt859 - 205;
				if (local88 < 0) {
					local88 = 0;
				} else if (local88 + local20 > 261) {
					local88 = 261 - local20;
				}
				this.aBoolean259 = true;
				this.anInt915 = 1;
				this.anInt916 = local70;
				this.anInt917 = local88;
				this.anInt918 = local7;
				this.anInt919 = this.anInt949 * 15 + 22;
			}
			if (super.anInt858 > 17 && super.anInt859 > 357 && super.anInt858 < 496 && super.anInt859 < 453) {
				local70 = super.anInt858 - local7 / 2 - 17;
				if (local70 < 0) {
					local70 = 0;
				} else if (local70 + local7 > 479) {
					local70 = 479 - local7;
				}
				local88 = super.anInt859 - 357;
				if (local88 < 0) {
					local88 = 0;
				} else if (local88 + local20 > 96) {
					local88 = 96 - local20;
				}
				this.aBoolean259 = true;
				this.anInt915 = 2;
				this.anInt916 = local70;
				this.anInt917 = local88;
				this.anInt918 = local7;
				this.anInt919 = this.anInt949 * 15 + 22;
			}
		} catch (@Pc(292) RuntimeException local292) {
			signlink.reporterror("78855, " + false + ", " + local292.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method576(@OriginalArg(0) byte arg0) {
		try {
			signlink.reporterror = false;
			try {
				if (this.aClass36_1 != null) {
					this.aClass36_1.method425();
				}
			} catch (@Pc(11) Exception local11) {
			}
			this.aClass36_1 = null;
			this.method584();
			if (this.aClass14_1 != null) {
				this.aClass14_1.aBoolean62 = false;
			}
			this.aClass14_1 = null;
			this.aClass20_Sub1_1.method386();
			this.aClass20_Sub1_1 = null;
			this.aClass1_Sub1_Sub2_6 = null;
			this.aClass1_Sub1_Sub2_8 = null;
			this.aClass1_Sub1_Sub2_9 = null;
			this.aClass1_Sub1_Sub2_7 = null;
			this.anIntArray271 = null;
			this.aByteArrayArray5 = null;
			this.aByteArrayArray4 = null;
			this.anIntArray272 = null;
			this.anIntArray273 = null;
			this.anIntArrayArrayArray8 = null;
			this.aByteArrayArrayArray8 = null;
			this.aClass40_1 = null;
			this.aClass18Array1 = null;
			this.anIntArrayArray25 = null;
			this.anIntArrayArray24 = null;
			this.anIntArray263 = null;
			this.anIntArray264 = null;
			this.aByteArray21 = null;
			this.aClass12_24 = null;
			this.aClass12_25 = null;
			this.aClass12_26 = null;
			this.aClass12_27 = null;
			this.aClass12_12 = null;
			this.aClass12_13 = null;
			this.aClass12_14 = null;
			this.aClass12_15 = null;
			this.aClass12_16 = null;
			this.aClass12_17 = null;
			this.aClass12_18 = null;
			this.aClass12_19 = null;
			this.aClass12_20 = null;
			this.aClass12_21 = null;
			this.aClass12_22 = null;
			this.aClass12_23 = null;
			this.aClass1_Sub1_Sub3_Sub2_1 = null;
			this.aClass1_Sub1_Sub3_Sub2_2 = null;
			this.aClass1_Sub1_Sub3_Sub2_3 = null;
			this.aClass1_Sub1_Sub3_Sub2_16 = null;
			this.aClass1_Sub1_Sub3_Sub2_17 = null;
			this.aClass1_Sub1_Sub3_Sub2_18 = null;
			this.aClass1_Sub1_Sub3_Sub2Array2 = null;
			this.aClass1_Sub1_Sub3_Sub2_6 = null;
			this.aClass1_Sub1_Sub3_Sub2_7 = null;
			this.aClass1_Sub1_Sub3_Sub2_8 = null;
			this.aClass1_Sub1_Sub3_Sub2_9 = null;
			this.aClass1_Sub1_Sub3_Sub2_10 = null;
			this.aClass1_Sub1_Sub3_Sub2_11 = null;
			this.aClass1_Sub1_Sub3_Sub2_12 = null;
			this.aClass1_Sub1_Sub3_Sub2_13 = null;
			this.aClass1_Sub1_Sub3_Sub2_14 = null;
			this.aClass1_Sub1_Sub3_Sub2_15 = null;
			this.aClass1_Sub1_Sub3_Sub1_6 = null;
			this.aClass1_Sub1_Sub3_Sub1Array4 = null;
			this.aClass1_Sub1_Sub3_Sub1Array7 = null;
			this.aClass1_Sub1_Sub3_Sub1Array6 = null;
			this.aClass1_Sub1_Sub3_Sub1_10 = null;
			this.aClass1_Sub1_Sub3_Sub1_11 = null;
			this.aClass1_Sub1_Sub3_Sub1_12 = null;
			this.aClass1_Sub1_Sub3_Sub1_13 = null;
			this.aClass1_Sub1_Sub3_Sub1_14 = null;
			this.aClass1_Sub1_Sub3_Sub2Array4 = null;
			this.aClass1_Sub1_Sub3_Sub1Array8 = null;
			this.anIntArrayArray22 = null;
			this.aClass1_Sub1_Sub1_Sub1_Sub2Array1 = null;
			this.anIntArray213 = null;
			this.anIntArray214 = null;
			this.aClass1_Sub1_Sub2Array1 = null;
			this.anIntArray223 = null;
			this.aClass1_Sub1_Sub1_Sub1_Sub1Array1 = null;
			this.anIntArray236 = null;
			this.aClass7ArrayArrayArray1 = null;
			this.aClass7_12 = null;
			this.aClass7_11 = null;
			this.aClass7_10 = null;
			this.anIntArray248 = null;
			this.anIntArray249 = null;
			this.anIntArray250 = null;
			this.anIntArray251 = null;
			this.aStringArray12 = null;
			this.anIntArray243 = null;
			this.anIntArray220 = null;
			this.anIntArray221 = null;
			this.aClass1_Sub1_Sub3_Sub1Array5 = null;
			this.aClass1_Sub1_Sub3_Sub1_5 = null;
			this.aStringArray10 = null;
			this.aLongArray4 = null;
			this.anIntArray225 = null;
			this.aClass12_6 = null;
			this.aClass12_7 = null;
			this.aClass12_3 = null;
			this.aClass12_4 = null;
			this.aClass12_5 = null;
			this.aClass12_8 = null;
			this.aClass12_9 = null;
			this.aClass12_10 = null;
			this.aClass12_11 = null;
			this.method591((byte) 4);
			Class38.method440();
			Class31.method406();
			Class23.method290();
			Class48.aClass48Array1 = null;
			Class35.aClass35Array1 = null;
			Class32.aClass32Array1 = null;
			Class27.aClass27Array1 = null;
			Class21.aClass21Array1 = null;
			Class4.aClass4Array1 = null;
			Class4.aClass29_1 = null;
			Class33.aClass33Array1 = null;
			super.aClass12_2 = null;
			Class1_Sub1_Sub1_Sub1_Sub2.aClass29_2 = null;
			Class1_Sub1_Sub3_Sub4.method521();
			Class40.method455();
			Class1_Sub1_Sub1_Sub4.method298();
			Class6.method42();
			System.gc();
		} catch (@Pc(376) RuntimeException local376) {
			signlink.reporterror("62743, " + 1 + ", " + local376.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method665() {
		try {
			@Pc(7) byte[] local7 = this.aClass42_1.method539("title.dat", null);
			@Pc(13) Class1_Sub1_Sub3_Sub1 local13 = new Class1_Sub1_Sub3_Sub1(local7, this);
			this.aClass12_6.method182(this.anInt1054);
			local13.method136((byte) 3, 0, 0);
			this.aClass12_7.method182(this.anInt1054);
			local13.method136((byte) 3, 0, -637);
			this.aClass12_3.method182(this.anInt1054);
			local13.method136((byte) 3, 0, -128);
			this.aClass12_4.method182(this.anInt1054);
			local13.method136((byte) 3, -371, -202);
			this.aClass12_5.method182(this.anInt1054);
			local13.method136((byte) 3, -171, -202);
			this.aClass12_8.method182(this.anInt1054);
			local13.method136((byte) 3, -265, 0);
			this.aClass12_9.method182(this.anInt1054);
			local13.method136((byte) 3, -265, -562);
			this.aClass12_10.method182(this.anInt1054);
			local13.method136((byte) 3, -171, -128);
			this.aClass12_11.method182(this.anInt1054);
			local13.method136((byte) 3, -171, -562);
			@Pc(111) int[] local111 = new int[local13.anInt191];
			for (@Pc(113) int local113 = 0; local113 < local13.anInt192; local113++) {
				for (@Pc(117) int local117 = 0; local117 < local13.anInt191; local117++) {
					local111[local117] = local13.anIntArray22[local13.anInt191 + local13.anInt191 * local113 - local117 - 1];
				}
				for (@Pc(143) int local143 = 0; local143 < local13.anInt191; local143++) {
					local13.anIntArray22[local143 + local13.anInt191 * local113] = local111[local143];
				}
			}
			this.aClass12_6.method182(this.anInt1054);
			local13.method136((byte) 3, 0, 382);
			this.aClass12_7.method182(this.anInt1054);
			local13.method136((byte) 3, 0, -255);
			this.aClass12_3.method182(this.anInt1054);
			local13.method136((byte) 3, 0, 254);
			this.aClass12_4.method182(this.anInt1054);
			local13.method136((byte) 3, -371, 180);
			this.aClass12_5.method182(this.anInt1054);
			local13.method136((byte) 3, -171, 180);
			this.aClass12_8.method182(this.anInt1054);
			local13.method136((byte) 3, -265, 382);
			this.aClass12_9.method182(this.anInt1054);
			local13.method136((byte) 3, -265, -180);
			this.aClass12_10.method182(this.anInt1054);
			local13.method136((byte) 3, -171, 254);
			this.aClass12_11.method182(this.anInt1054);
			local13.method136((byte) 3, -171, -180);
			local13 = new Class1_Sub1_Sub3_Sub1(this.aClass42_1, "logo", 0);
			this.aClass12_3.method182(this.anInt1054);
			local13.method138(382 - local13.anInt191 / 2 - 128, 18);
			System.gc();
		} catch (@Pc(291) RuntimeException local291) {
			signlink.reporterror("13782, " + 624 + ", " + local291.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method666() {
		try {
			@Pc(4) Graphics local4 = this.method579().getGraphics();
			local4.setColor(Color.black);
			local4.fillRect(0, 0, 765, 503);
			this.method572();
			this.aBoolean264 &= true;
			@Pc(42) byte local42;
			@Pc(48) int local48;
			if (this.aBoolean234) {
				this.aBoolean240 = false;
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
			if (this.aBoolean255) {
				this.aBoolean240 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean235) {
				this.aBoolean240 = false;
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
			signlink.reporterror("66094, " + true + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method667() {
		try {
			this.aClass1_Sub1_Sub3_Sub2_4 = new Class1_Sub1_Sub3_Sub2(this.aClass42_1, "titlebox", 0);
			this.aClass1_Sub1_Sub3_Sub2_5 = new Class1_Sub1_Sub3_Sub2(this.aClass42_1, "titlebutton", 0);
			this.aClass1_Sub1_Sub3_Sub2Array5 = new Class1_Sub1_Sub3_Sub2[12];
			@Pc(25) int local25 = 0;
			try {
				local25 = Integer.parseInt(this.getParameter("fl_icon"));
			} catch (@Pc(32) Exception local32) {
			}
			@Pc(36) int local36;
			if (local25 == 0) {
				for (local36 = 0; local36 < 12; local36++) {
					this.aClass1_Sub1_Sub3_Sub2Array5[local36] = new Class1_Sub1_Sub3_Sub2(this.aClass42_1, "runes", local36);
				}
			} else {
				for (local36 = 0; local36 < 12; local36++) {
					this.aClass1_Sub1_Sub3_Sub2Array5[local36] = new Class1_Sub1_Sub3_Sub2(this.aClass42_1, "runes", (local36 & 0x3) + 12);
				}
			}
			this.aClass1_Sub1_Sub3_Sub1_7 = new Class1_Sub1_Sub3_Sub1(128, 265);
			this.aClass1_Sub1_Sub3_Sub1_8 = new Class1_Sub1_Sub3_Sub1(128, 265);
			for (local36 = 0; local36 < 33920; local36++) {
				this.aClass1_Sub1_Sub3_Sub1_7.anIntArray22[local36] = this.aClass12_6.anIntArray36[local36];
			}
			for (@Pc(119) int local119 = 0; local119 < 33920; local119++) {
				this.aClass1_Sub1_Sub3_Sub1_8.anIntArray22[local119] = this.aClass12_7.anIntArray36[local119];
			}
			this.anIntArray266 = new int[256];
			for (@Pc(141) int local141 = 0; local141 < 64; local141++) {
				this.anIntArray266[local141] = local141 * 262144;
			}
			for (@Pc(156) int local156 = 0; local156 < 64; local156++) {
				this.anIntArray266[local156 + 64] = local156 * 1024 + 16711680;
			}
			for (@Pc(175) int local175 = 0; local175 < 64; local175++) {
				this.anIntArray266[local175 + 128] = local175 * 4 + 16776960;
			}
			for (@Pc(194) int local194 = 0; local194 < 64; local194++) {
				this.anIntArray266[local194 + 192] = 16777215;
			}
			this.anIntArray267 = new int[256];
			for (@Pc(213) int local213 = 0; local213 < 64; local213++) {
				this.anIntArray267[local213] = local213 * 1024;
			}
			for (@Pc(228) int local228 = 0; local228 < 64; local228++) {
				this.anIntArray267[local228 + 64] = local228 * 4 + 65280;
			}
			for (@Pc(247) int local247 = 0; local247 < 64; local247++) {
				this.anIntArray267[local247 + 128] = local247 * 262144 + 65535;
			}
			for (@Pc(266) int local266 = 0; local266 < 64; local266++) {
				this.anIntArray267[local266 + 192] = 16777215;
			}
			this.anIntArray268 = new int[256];
			for (@Pc(285) int local285 = 0; local285 < 64; local285++) {
				this.anIntArray268[local285] = local285 * 4;
			}
			for (@Pc(300) int local300 = 0; local300 < 64; local300++) {
				this.anIntArray268[local300 + 64] = local300 * 262144 + 255;
			}
			for (@Pc(319) int local319 = 0; local319 < 64; local319++) {
				this.anIntArray268[local319 + 128] = local319 * 1024 + 16711935;
			}
			for (@Pc(338) int local338 = 0; local338 < 64; local338++) {
				this.anIntArray268[local338 + 192] = 16777215;
			}
			this.anIntArray265 = new int[256];
			this.anIntArray227 = new int[32768];
			this.anIntArray228 = new int[32768];
			this.method592(null);
			this.anIntArray260 = new int[32768];
			this.anIntArray261 = new int[32768];
			this.method581(10, "Connecting to fileserver");
			if (!this.aBoolean240) {
				this.aBoolean249 = true;
				this.aBoolean240 = true;
				this.method580(this, 2);
			}
		} catch (@Pc(395) RuntimeException local395) {
			signlink.reporterror("45460, " + -21557 + ", " + local395.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private void method668() {
		try {
			for (@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) this.aClass7_12.method100(); local6 != null; local6 = (Class1_Sub3) this.aClass7_12.method102()) {
				if (local6.anInt383 == -1) {
					local6.anInt384 = 0;
					this.method585(local6);
				} else {
					local6.method507();
				}
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("91014, " + true + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private void method669() {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt988; local1++) {
				@Pc(8) int local8 = this.anIntArray236[local1];
				@Pc(13) Class1_Sub1_Sub1_Sub1_Sub1 local13 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local8];
				if (local13 != null) {
					this.method670(local13.aClass31_1.aByte23, local13);
				}
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("69402, " + true + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!VNAWUDPP;I)V")
	private void method670(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg1) {
		try {
			if (arg1.anInt319 < 128 || arg1.anInt320 < 128 || arg1.anInt319 >= 13184 || arg1.anInt320 >= 13184) {
				arg1.anInt332 = -1;
				arg1.anInt296 = -1;
				arg1.anInt314 = 0;
				arg1.anInt315 = 0;
				arg1.anInt319 = arg1.anIntArray48[0] * 128 + arg1.anInt326 * 64;
				arg1.anInt320 = arg1.anIntArray49[0] * 128 + arg1.anInt326 * 64;
				arg1.method246();
			}
			if (arg1 == aClass1_Sub1_Sub1_Sub1_Sub2_1 && (arg1.anInt319 < 1536 || arg1.anInt320 < 1536 || arg1.anInt319 >= 11776 || arg1.anInt320 >= 11776)) {
				arg1.anInt332 = -1;
				arg1.anInt296 = -1;
				arg1.anInt314 = 0;
				arg1.anInt315 = 0;
				arg1.anInt319 = arg1.anIntArray48[0] * 128 + arg1.anInt326 * 64;
				arg1.anInt320 = arg1.anIntArray49[0] * 128 + arg1.anInt326 * 64;
				arg1.method246();
			}
			if (arg1.anInt314 > anInt903) {
				this.method671(arg1);
			} else if (arg1.anInt315 >= anInt903) {
				this.method672(arg1);
			} else {
				this.method673((byte) 7, arg1);
			}
			this.method674(arg1);
			this.method675(arg1);
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("91259, " + arg0 + ", " + arg1 + ", " + -68 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!VNAWUDPP;I)V")
	private void method671(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt314 - anInt903;
			@Pc(14) int local14 = arg0.anInt310 * 128 + arg0.anInt326 * 64;
			@Pc(24) int local24 = arg0.anInt312 * 128 + arg0.anInt326 * 64;
			arg0.anInt319 += (local14 - arg0.anInt319) / local4;
			arg0.anInt320 += (local24 - arg0.anInt320) / local4;
			arg0.anInt338 = 0;
			if (arg0.anInt316 == 0) {
				arg0.anInt324 = 1024;
			}
			if (arg0.anInt316 == 1) {
				arg0.anInt324 = 1536;
			}
			if (arg0.anInt316 == 2) {
				arg0.anInt324 = 0;
			}
			if (arg0.anInt316 == 3) {
				arg0.anInt324 = 512;
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("79679, " + arg0 + ", " + 11544 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!VNAWUDPP;)V")
	private void method672(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			if (arg0.anInt315 == anInt903 || arg0.anInt332 == -1 || arg0.anInt335 != 0 || arg0.anInt334 + 1 > Class21.aClass21Array1[arg0.anInt332].method279(arg0.anInt333)) {
				@Pc(29) int local29 = arg0.anInt315 - arg0.anInt314;
				@Pc(34) int local34 = anInt903 - arg0.anInt314;
				@Pc(44) int local44 = arg0.anInt310 * 128 + arg0.anInt326 * 64;
				@Pc(54) int local54 = arg0.anInt312 * 128 + arg0.anInt326 * 64;
				@Pc(64) int local64 = arg0.anInt311 * 128 + arg0.anInt326 * 64;
				@Pc(74) int local74 = arg0.anInt313 * 128 + arg0.anInt326 * 64;
				arg0.anInt319 = (local44 * (local29 - local34) + local64 * local34) / local29;
				arg0.anInt320 = (local54 * (local29 - local34) + local74 * local34) / local29;
			}
			arg0.anInt338 = 0;
			if (arg0.anInt316 == 0) {
				arg0.anInt324 = 1024;
			}
			if (arg0.anInt316 == 1) {
				arg0.anInt324 = 1536;
			}
			if (arg0.anInt316 == 2) {
				arg0.anInt324 = 0;
			}
			if (arg0.anInt316 == 3) {
				arg0.anInt324 = 512;
			}
			arg0.anInt321 = arg0.anInt324;
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("51148, " + true + ", " + arg0 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!VNAWUDPP;)V")
	private void method673(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg1) {
		try {
			arg1.anInt339 = arg1.anInt327;
			@Pc(10) boolean local10 = false;
			if (arg1.anInt317 == 0) {
				arg1.anInt338 = 0;
			} else {
				if (arg1.anInt332 != -1 && arg1.anInt335 == 0) {
					@Pc(35) Class21 local35 = Class21.aClass21Array1[arg1.anInt332];
					if (arg1.anInt323 > 0 && local35.anInt396 == 0) {
						arg1.anInt338++;
						return;
					}
					if (arg1.anInt323 <= 0 && local35.anInt397 == 0) {
						arg1.anInt338++;
						return;
					}
				}
				@Pc(64) int local64 = arg1.anInt319;
				@Pc(67) int local67 = arg1.anInt320;
				@Pc(82) int local82 = arg1.anIntArray48[arg1.anInt317 - 1] * 128 + arg1.anInt326 * 64;
				@Pc(97) int local97 = arg1.anIntArray49[arg1.anInt317 - 1] * 128 + arg1.anInt326 * 64;
				if (local82 - local64 <= 256 && local82 - local64 >= -256 && local97 - local67 <= 256 && local97 - local67 >= -256) {
					if (local64 < local82) {
						if (local67 < local97) {
							arg1.anInt324 = 1280;
						} else if (local67 > local97) {
							arg1.anInt324 = 1792;
						} else {
							arg1.anInt324 = 1536;
						}
					} else if (local64 > local82) {
						if (local67 < local97) {
							arg1.anInt324 = 768;
						} else if (local67 > local97) {
							arg1.anInt324 = 256;
						} else {
							arg1.anInt324 = 512;
						}
					} else if (local67 < local97) {
						arg1.anInt324 = 1024;
					} else {
						arg1.anInt324 = 0;
					}
					@Pc(191) int local191 = arg1.anInt324 - arg1.anInt321 & 0x7FF;
					if (local191 > 1024) {
						local191 -= 2048;
					}
					@Pc(198) int local198 = arg1.anInt306;
					if (local191 >= -256 && local191 <= 256) {
						local198 = arg1.anInt305;
					} else if (local191 >= 256 && local191 < 768) {
						local198 = arg1.anInt308;
					} else if (local191 >= -768 && local191 <= -256) {
						local198 = arg1.anInt307;
					}
					if (local198 == -1) {
						local198 = arg1.anInt305;
					}
					arg1.anInt339 = local198;
					@Pc(240) int local240 = 4;
					if (arg1.anInt321 != arg1.anInt324 && arg1.anInt337 == -1 && arg1.anInt295 != 0) {
						local240 = 2;
					}
					if (arg1.anInt317 > 2) {
						local240 = 6;
					}
					if (arg1.anInt317 > 3) {
						local240 = 8;
					}
					if (arg1.anInt338 > 0 && arg1.anInt317 > 1) {
						local240 = 8;
						arg1.anInt338--;
					}
					if (arg1.aBooleanArray4[arg1.anInt317 - 1]) {
						local240 <<= 0x1;
					}
					if (local240 >= 8 && arg1.anInt339 == arg1.anInt305 && arg1.anInt309 != -1) {
						arg1.anInt339 = arg1.anInt309;
					}
					if (local64 < local82) {
						arg1.anInt319 += local240;
						if (arg1.anInt319 > local82) {
							arg1.anInt319 = local82;
						}
					} else if (local64 > local82) {
						arg1.anInt319 -= local240;
						if (arg1.anInt319 < local82) {
							arg1.anInt319 = local82;
						}
					}
					if (local67 < local97) {
						arg1.anInt320 += local240;
						if (arg1.anInt320 > local97) {
							arg1.anInt320 = local97;
						}
					} else if (local67 > local97) {
						arg1.anInt320 -= local240;
						if (arg1.anInt320 < local97) {
							arg1.anInt320 = local97;
						}
					}
					if (arg1.anInt319 == local82 && arg1.anInt320 == local97) {
						arg1.anInt317--;
						if (arg1.anInt323 > 0) {
							arg1.anInt323--;
							return;
						}
					}
				} else {
					arg1.anInt319 = local82;
					arg1.anInt320 = local97;
				}
			}
		} catch (@Pc(402) RuntimeException local402) {
			signlink.reporterror("79421, " + arg0 + ", " + arg1 + ", " + local402.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BLclient!VNAWUDPP;)V")
	private void method674(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			if (arg0.anInt295 != 0) {
				@Pc(34) int local34;
				@Pc(40) int local40;
				if (arg0.anInt337 != -1 && arg0.anInt337 < 32768) {
					@Pc(26) Class1_Sub1_Sub1_Sub1_Sub1 local26 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[arg0.anInt337];
					if (local26 != null) {
						local34 = arg0.anInt319 - local26.anInt319;
						local40 = arg0.anInt320 - local26.anInt320;
						if (local34 != 0 || local40 != 0) {
							arg0.anInt324 = (int) (Math.atan2((double) local34, (double) local40) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(65) int local65;
				if (arg0.anInt337 >= 32768) {
					local65 = arg0.anInt337 - 32768;
					if (local65 == this.anInt1002) {
						local65 = this.anInt870;
					}
					@Pc(77) Class1_Sub1_Sub1_Sub1_Sub2 local77 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local65];
					if (local77 != null) {
						local40 = arg0.anInt319 - local77.anInt319;
						@Pc(91) int local91 = arg0.anInt320 - local77.anInt320;
						if (local40 != 0 || local91 != 0) {
							arg0.anInt324 = (int) (Math.atan2((double) local40, (double) local91) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt302 != 0 || arg0.anInt303 != 0) && (arg0.anInt317 == 0 || arg0.anInt338 > 0)) {
					local65 = arg0.anInt319 - (arg0.anInt302 - this.anInt1037 - this.anInt1037) * 64;
					local34 = arg0.anInt320 - (arg0.anInt303 - this.anInt1038 - this.anInt1038) * 64;
					if (local65 != 0 || local34 != 0) {
						arg0.anInt324 = (int) (Math.atan2((double) local65, (double) local34) * 325.949D) & 0x7FF;
					}
					arg0.anInt302 = 0;
					arg0.anInt303 = 0;
				}
				local65 = arg0.anInt324 - arg0.anInt321 & 0x7FF;
				if (local65 != 0) {
					if (local65 < arg0.anInt295 || local65 > 2048 - arg0.anInt295) {
						arg0.anInt321 = arg0.anInt324;
					} else if (local65 > 1024) {
						arg0.anInt321 -= arg0.anInt295;
					} else {
						arg0.anInt321 += arg0.anInt295;
					}
					arg0.anInt321 &= 0x7FF;
					if (arg0.anInt339 == arg0.anInt327 && arg0.anInt321 != arg0.anInt324) {
						if (arg0.anInt328 != -1) {
							arg0.anInt339 = arg0.anInt328;
							return;
						}
						arg0.anInt339 = arg0.anInt305;
						return;
					}
				}
			}
		} catch (@Pc(245) RuntimeException local245) {
			signlink.reporterror("78775, " + -120 + ", " + arg0 + ", " + local245.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!VNAWUDPP;)V")
	private void method675(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			arg0.aBoolean89 = false;
			@Pc(23) Class21 local23;
			if (arg0.anInt339 != -1) {
				local23 = Class21.aClass21Array1[arg0.anInt339];
				arg0.anInt341++;
				if (arg0.anInt340 < local23.anInt390 && arg0.anInt341 > local23.method279(arg0.anInt340)) {
					arg0.anInt341 = 0;
					arg0.anInt340++;
				}
				if (arg0.anInt340 >= local23.anInt390) {
					arg0.anInt341 = 0;
					arg0.anInt340 = 0;
				}
			}
			if (arg0.anInt296 != -1 && anInt903 >= arg0.anInt299) {
				if (arg0.anInt297 < 0) {
					arg0.anInt297 = 0;
				}
				local23 = Class4.aClass4Array1[arg0.anInt296].aClass21_1;
				arg0.anInt298++;
				while (arg0.anInt297 < local23.anInt390 && arg0.anInt298 > local23.method279(arg0.anInt297)) {
					arg0.anInt298 -= local23.method279(arg0.anInt297);
					arg0.anInt297++;
				}
				if (arg0.anInt297 >= local23.anInt390 && (arg0.anInt297 < 0 || arg0.anInt297 >= local23.anInt390)) {
					arg0.anInt296 = -1;
				}
			}
			if (arg0.anInt332 != -1 && arg0.anInt335 <= 1) {
				local23 = Class21.aClass21Array1[arg0.anInt332];
				if (local23.anInt396 == 1 && arg0.anInt323 > 0 && arg0.anInt314 <= anInt903 && arg0.anInt315 < anInt903) {
					arg0.anInt335 = 1;
					return;
				}
			}
			if (arg0.anInt332 != -1 && arg0.anInt335 == 0) {
				local23 = Class21.aClass21Array1[arg0.anInt332];
				arg0.anInt334++;
				while (arg0.anInt333 < local23.anInt390 && arg0.anInt334 > local23.method279(arg0.anInt333)) {
					arg0.anInt334 -= local23.method279(arg0.anInt333);
					arg0.anInt333++;
				}
				if (arg0.anInt333 >= local23.anInt390) {
					arg0.anInt333 -= local23.anInt391;
					arg0.anInt336++;
					if (arg0.anInt336 >= local23.anInt395) {
						arg0.anInt332 = -1;
					}
					if (arg0.anInt333 < 0 || arg0.anInt333 >= local23.anInt390) {
						arg0.anInt332 = -1;
					}
				}
				arg0.aBoolean89 = local23.aBoolean99;
			}
			if (arg0.anInt335 > 0) {
				arg0.anInt335--;
			}
		} catch (@Pc(268) RuntimeException local268) {
			signlink.reporterror("84729, " + 9 + ", " + arg0 + ", " + local268.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method676(@OriginalArg(0) int arg0) {
		try {
			if (this.aBoolean231) {
				this.aBoolean231 = false;
				this.aClass12_15.method183(4, 0, super.aGraphics2);
				this.aClass12_16.method183(357, 0, super.aGraphics2);
				this.aClass12_17.method183(4, 722, super.aGraphics2);
				this.aClass12_18.method183(205, 743, super.aGraphics2);
				this.aClass12_19.method183(0, 0, super.aGraphics2);
				this.aClass12_20.method183(4, 516, super.aGraphics2);
				this.aClass12_21.method183(205, 516, super.aGraphics2);
				this.aClass12_22.method183(357, 496, super.aGraphics2);
				this.aClass12_23.method183(338, 0, super.aGraphics2);
				this.aBoolean223 = true;
				this.aBoolean232 = true;
				this.aBoolean256 = true;
				this.aBoolean269 = true;
				if (this.anInt966 != 2) {
					this.aClass12_26.method183(4, 4, super.aGraphics2);
					this.aClass12_25.method183(4, 550, super.aGraphics2);
				}
			}
			if (this.anInt966 == 2) {
				this.method705();
			}
			if (this.aBoolean259 && this.anInt915 == 1) {
				this.aBoolean223 = true;
			}
			@Pc(138) boolean local138;
			if (this.anInt1006 != -1) {
				local138 = this.method596(this.anInt1003, this.anInt1006);
				if (local138) {
					this.aBoolean223 = true;
				}
			}
			if (this.anInt1061 == 2) {
				this.aBoolean223 = true;
			}
			if (this.anInt885 == 2) {
				this.aBoolean223 = true;
			}
			if (this.aBoolean223) {
				this.method655();
				this.aBoolean223 = false;
			}
			if (this.anInt1065 == -1) {
				this.aClass32_1.anInt613 = this.anInt1050 - this.anInt1027 - 77;
				if (super.anInt852 > 448 && super.anInt852 < 560 && super.anInt853 > 332) {
					this.method657(this.aClass32_1, super.anInt852 - 17, 0, 77, 463, -1, super.anInt853 - 357, this.anInt1050);
				}
				@Pc(220) int local220 = this.anInt1050 - this.aClass32_1.anInt613 - 77;
				if (local220 < 0) {
					local220 = 0;
				}
				if (local220 > this.anInt1050 - 77) {
					local220 = this.anInt1050 - 77;
				}
				if (this.anInt1027 != local220) {
					this.anInt1027 = local220;
					this.aBoolean232 = true;
				}
			}
			if (this.anInt1065 != -1) {
				local138 = this.method596(this.anInt1003, this.anInt1065);
				if (local138) {
					this.aBoolean232 = true;
				}
			}
			if (this.anInt1061 == 3) {
				this.aBoolean232 = true;
			}
			if (this.anInt885 == 3) {
				this.aBoolean232 = true;
			}
			if (this.aString20 != null) {
				this.aBoolean232 = true;
			}
			if (this.aBoolean259 && this.anInt915 == 2) {
				this.aBoolean232 = true;
			}
			if (this.aBoolean232) {
				this.method690();
				this.aBoolean232 = false;
			}
			if (this.anInt966 == 2) {
				this.method711();
				this.aClass12_25.method183(4, 550, super.aGraphics2);
			}
			if (this.anInt1048 != -1) {
				this.aBoolean256 = true;
			}
			if (this.aBoolean256) {
				if (this.anInt1048 != -1 && this.anInt1048 == this.anInt866) {
					this.anInt1048 = -1;
					this.aClass1_Sub1_Sub2_8.method48(211);
					this.aClass1_Sub1_Sub2_8.method49(this.anInt866);
				}
				this.aBoolean256 = false;
				this.aClass12_14.method182(this.anInt1054);
				this.aClass1_Sub1_Sub3_Sub2_18.method208(0, 0);
				if (this.anInt1006 == -1) {
					if (this.anIntArray216[this.anInt866] != -1) {
						if (this.anInt866 == 0) {
							this.aClass1_Sub1_Sub3_Sub2_6.method208(22, 10);
						}
						if (this.anInt866 == 1) {
							this.aClass1_Sub1_Sub3_Sub2_7.method208(54, 8);
						}
						if (this.anInt866 == 2) {
							this.aClass1_Sub1_Sub3_Sub2_7.method208(82, 8);
						}
						if (this.anInt866 == 3) {
							this.aClass1_Sub1_Sub3_Sub2_8.method208(110, 8);
						}
						if (this.anInt866 == 4) {
							this.aClass1_Sub1_Sub3_Sub2_10.method208(153, 8);
						}
						if (this.anInt866 == 5) {
							this.aClass1_Sub1_Sub3_Sub2_10.method208(181, 8);
						}
						if (this.anInt866 == 6) {
							this.aClass1_Sub1_Sub3_Sub2_9.method208(209, 9);
						}
					}
					if (this.anIntArray216[0] != -1 && (this.anInt1048 != 0 || anInt903 % 20 < 10)) {
						this.aClass1_Sub1_Sub3_Sub2Array2[0].method208(29, 13);
					}
					if (this.anIntArray216[1] != -1 && (this.anInt1048 != 1 || anInt903 % 20 < 10)) {
						this.aClass1_Sub1_Sub3_Sub2Array2[1].method208(53, 11);
					}
					if (this.anIntArray216[2] != -1 && (this.anInt1048 != 2 || anInt903 % 20 < 10)) {
						this.aClass1_Sub1_Sub3_Sub2Array2[2].method208(82, 11);
					}
					if (this.anIntArray216[3] != -1 && (this.anInt1048 != 3 || anInt903 % 20 < 10)) {
						this.aClass1_Sub1_Sub3_Sub2Array2[3].method208(115, 12);
					}
					if (this.anIntArray216[4] != -1 && (this.anInt1048 != 4 || anInt903 % 20 < 10)) {
						this.aClass1_Sub1_Sub3_Sub2Array2[4].method208(153, 13);
					}
					if (this.anIntArray216[5] != -1 && (this.anInt1048 != 5 || anInt903 % 20 < 10)) {
						this.aClass1_Sub1_Sub3_Sub2Array2[5].method208(180, 11);
					}
					if (this.anIntArray216[6] != -1 && (this.anInt1048 != 6 || anInt903 % 20 < 10)) {
						this.aClass1_Sub1_Sub3_Sub2Array2[6].method208(208, 13);
					}
				}
				this.aClass12_14.method183(160, 516, super.aGraphics2);
				this.aClass12_13.method182(this.anInt1054);
				this.aClass1_Sub1_Sub3_Sub2_17.method208(0, 0);
				if (this.anInt1006 == -1) {
					if (this.anIntArray216[this.anInt866] != -1) {
						if (this.anInt866 == 7) {
							this.aClass1_Sub1_Sub3_Sub2_11.method208(42, 0);
						}
						if (this.anInt866 == 8) {
							this.aClass1_Sub1_Sub3_Sub2_12.method208(74, 0);
						}
						if (this.anInt866 == 9) {
							this.aClass1_Sub1_Sub3_Sub2_12.method208(102, 0);
						}
						if (this.anInt866 == 10) {
							this.aClass1_Sub1_Sub3_Sub2_13.method208(130, 1);
						}
						if (this.anInt866 == 11) {
							this.aClass1_Sub1_Sub3_Sub2_15.method208(173, 0);
						}
						if (this.anInt866 == 12) {
							this.aClass1_Sub1_Sub3_Sub2_15.method208(201, 0);
						}
						if (this.anInt866 == 13) {
							this.aClass1_Sub1_Sub3_Sub2_14.method208(229, 0);
						}
					}
					if (this.anIntArray216[8] != -1 && (this.anInt1048 != 8 || anInt903 % 20 < 10)) {
						this.aClass1_Sub1_Sub3_Sub2Array2[7].method208(74, 2);
					}
					if (this.anIntArray216[9] != -1 && (this.anInt1048 != 9 || anInt903 % 20 < 10)) {
						this.aClass1_Sub1_Sub3_Sub2Array2[8].method208(102, 3);
					}
					if (this.anIntArray216[10] != -1 && (this.anInt1048 != 10 || anInt903 % 20 < 10)) {
						this.aClass1_Sub1_Sub3_Sub2Array2[9].method208(137, 4);
					}
					if (this.anIntArray216[11] != -1 && (this.anInt1048 != 11 || anInt903 % 20 < 10)) {
						this.aClass1_Sub1_Sub3_Sub2Array2[10].method208(174, 2);
					}
					if (this.anIntArray216[12] != -1 && (this.anInt1048 != 12 || anInt903 % 20 < 10)) {
						this.aClass1_Sub1_Sub3_Sub2Array2[11].method208(201, 2);
					}
					if (this.anIntArray216[13] != -1 && (this.anInt1048 != 13 || anInt903 % 20 < 10)) {
						this.aClass1_Sub1_Sub3_Sub2Array2[12].method208(226, 2);
					}
				}
				this.aClass12_13.method183(466, 496, super.aGraphics2);
				this.aClass12_26.method182(this.anInt1054);
			}
			if (this.aBoolean269) {
				this.aBoolean269 = false;
				this.aClass12_12.method182(this.anInt1054);
				this.aClass1_Sub1_Sub3_Sub2_16.method208(0, 0);
				this.aClass1_Sub1_Sub3_Sub3_3.method226(16777215, "Public chat", 744, 28, true, 55);
				if (this.anInt1026 == 0) {
					this.aClass1_Sub1_Sub3_Sub3_3.method226(65280, "On", 744, 41, true, 55);
				}
				if (this.anInt1026 == 1) {
					this.aClass1_Sub1_Sub3_Sub3_3.method226(16776960, "Friends", 744, 41, true, 55);
				}
				if (this.anInt1026 == 2) {
					this.aClass1_Sub1_Sub3_Sub3_3.method226(16711680, "Off", 744, 41, true, 55);
				}
				if (this.anInt1026 == 3) {
					this.aClass1_Sub1_Sub3_Sub3_3.method226(65535, "Hide", 744, 41, true, 55);
				}
				this.aClass1_Sub1_Sub3_Sub3_3.method226(16777215, "Private chat", 744, 28, true, 184);
				if (this.anInt900 == 0) {
					this.aClass1_Sub1_Sub3_Sub3_3.method226(65280, "On", 744, 41, true, 184);
				}
				if (this.anInt900 == 1) {
					this.aClass1_Sub1_Sub3_Sub3_3.method226(16776960, "Friends", 744, 41, true, 184);
				}
				if (this.anInt900 == 2) {
					this.aClass1_Sub1_Sub3_Sub3_3.method226(16711680, "Off", 744, 41, true, 184);
				}
				this.aClass1_Sub1_Sub3_Sub3_3.method226(16777215, "Trade/compete", 744, 28, true, 324);
				if (this.anInt893 == 0) {
					this.aClass1_Sub1_Sub3_Sub3_3.method226(65280, "On", 744, 41, true, 324);
				}
				if (this.anInt893 == 1) {
					this.aClass1_Sub1_Sub3_Sub3_3.method226(16776960, "Friends", 744, 41, true, 324);
				}
				if (this.anInt893 == 2) {
					this.aClass1_Sub1_Sub3_Sub3_3.method226(16711680, "Off", 744, 41, true, 324);
				}
				this.aClass1_Sub1_Sub3_Sub3_3.method226(16777215, "Report abuse", 744, 33, true, 458);
				this.aClass12_12.method183(453, 0, super.aGraphics2);
				this.aClass12_26.method182(this.anInt1054);
			}
			this.anInt1003 = 0;
			if (arg0 >= 0) {
				anInt972 = 267;
			}
		} catch (@Pc(1055) RuntimeException local1055) {
			signlink.reporterror("27362, " + arg0 + ", " + local1055.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!OPFNUBIN;B)V")
	private void method677(@OriginalArg(0) Class32 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt607;
			@Pc(66) int local66;
			if ((local4 < 1 || local4 > 100) && (local4 < 701 || local4 > 800)) {
				if (local4 >= 101 && local4 <= 200 || local4 >= 801 && local4 <= 900) {
					local66 = this.anInt1000;
					if (this.anInt1001 != 2) {
						local66 = 0;
					}
					if (local4 > 800) {
						local4 -= 701;
					} else {
						local4 -= 101;
					}
					if (local4 >= local66) {
						arg0.aString13 = "";
						arg0.anInt606 = 0;
					} else {
						if (this.anIntArray225[local4] == 0) {
							arg0.aString13 = "@red@Offline";
						} else if (this.anIntArray225[local4] < 200) {
							if (this.anIntArray225[local4] == anInt970) {
								arg0.aString13 = "@gre@World-" + (this.anIntArray225[local4] - 9);
							} else {
								arg0.aString13 = "@yel@World-" + (this.anIntArray225[local4] - 9);
							}
						} else if (this.anIntArray225[local4] == anInt970) {
							arg0.aString13 = "@gre@Classic" + (this.anIntArray225[local4] - 219);
						} else {
							arg0.aString13 = "@yel@Classic" + (this.anIntArray225[local4] - 219);
						}
						arg0.anInt606 = 1;
					}
				} else if (local4 == 203) {
					local66 = this.anInt1000;
					if (this.anInt1001 != 2) {
						local66 = 0;
					}
					arg0.anInt612 = local66 * 15 + 20;
					if (arg0.anInt612 <= arg0.anInt598) {
						arg0.anInt612 = arg0.anInt598 + 1;
					}
				} else if (local4 >= 401 && local4 <= 500) {
					local4 -= 401;
					if (local4 == 0 && this.anInt1001 == 0) {
						arg0.aString13 = "Loading ignore list";
						arg0.anInt606 = 0;
					} else if (local4 == 1 && this.anInt1001 == 0) {
						arg0.aString13 = "Please wait...";
						arg0.anInt606 = 0;
					} else {
						local66 = this.anInt1004;
						if (this.anInt1001 == 0) {
							local66 = 0;
						}
						if (local4 >= local66) {
							arg0.aString13 = "";
							arg0.anInt606 = 0;
						} else {
							arg0.aString13 = Class49.method567(Class49.method564(this.aLongArray3[local4]));
							arg0.anInt606 = 1;
						}
					}
				} else if (local4 == 503) {
					arg0.anInt612 = this.anInt1004 * 15 + 20;
					if (arg0.anInt612 <= arg0.anInt598) {
						arg0.anInt612 = arg0.anInt598 + 1;
					}
				} else if (local4 == 327) {
					arg0.anInt600 = 150;
					arg0.anInt601 = (int) (Math.sin((double) anInt903 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean239) {
						for (local66 = 0; local66 < 7; local66++) {
							@Pc(379) int local379 = this.anIntArray229[local66];
							if (local379 >= 0 && !Class35.aClass35Array1[local379].method421(506)) {
								return;
							}
						}
						this.aBoolean239 = false;
						@Pc(398) Class1_Sub1_Sub1_Sub4[] local398 = new Class1_Sub1_Sub1_Sub4[7];
						@Pc(400) int local400 = 0;
						for (@Pc(402) int local402 = 0; local402 < 7; local402++) {
							@Pc(409) int local409 = this.anIntArray229[local402];
							if (local409 >= 0) {
								local398[local400++] = Class35.aClass35Array1[local409].method422();
							}
						}
						@Pc(431) Class1_Sub1_Sub1_Sub4 local431 = new Class1_Sub1_Sub1_Sub4(local400, 698, local398);
						for (@Pc(433) int local433 = 0; local433 < 5; local433++) {
							if (this.anIntArray232[local433] != 0) {
								local431.method316(anIntArrayArray23[local433][0], anIntArrayArray23[local433][this.anIntArray232[local433]]);
								if (local433 == 1) {
									local431.method316(anIntArray237[0], anIntArray237[this.anIntArray232[local433]]);
								}
							}
						}
						local431.method309();
						local431.method310(Class21.aClass21Array1[aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt327].anIntArray68[0]);
						local431.method319(64, 850, -30, -50, -30, true);
						arg0.anInt602 = 5;
						arg0.anInt603 = 0;
						Class32.method407(local431);
					}
				} else if (local4 == 324) {
					if (this.aClass1_Sub1_Sub3_Sub1_15 == null) {
						this.aClass1_Sub1_Sub3_Sub1_15 = arg0.aClass1_Sub1_Sub3_Sub1_2;
						this.aClass1_Sub1_Sub3_Sub1_16 = arg0.aClass1_Sub1_Sub3_Sub1_1;
					}
					if (this.aBoolean261) {
						arg0.aClass1_Sub1_Sub3_Sub1_2 = this.aClass1_Sub1_Sub3_Sub1_16;
					} else {
						arg0.aClass1_Sub1_Sub3_Sub1_2 = this.aClass1_Sub1_Sub3_Sub1_15;
					}
				} else if (local4 == 325) {
					if (this.aClass1_Sub1_Sub3_Sub1_15 == null) {
						this.aClass1_Sub1_Sub3_Sub1_15 = arg0.aClass1_Sub1_Sub3_Sub1_2;
						this.aClass1_Sub1_Sub3_Sub1_16 = arg0.aClass1_Sub1_Sub3_Sub1_1;
					}
					if (this.aBoolean261) {
						arg0.aClass1_Sub1_Sub3_Sub1_2 = this.aClass1_Sub1_Sub3_Sub1_15;
					} else {
						arg0.aClass1_Sub1_Sub3_Sub1_2 = this.aClass1_Sub1_Sub3_Sub1_16;
					}
				} else if (local4 == 600) {
					arg0.aString13 = this.aString27;
					if (anInt903 % 20 < 10) {
						arg0.aString13 = arg0.aString13 + "|";
					} else {
						arg0.aString13 = arg0.aString13 + " ";
					}
				} else {
					if (local4 == 620) {
						if (this.anInt981 < 1) {
							arg0.aString13 = "";
						} else if (this.aBoolean251) {
							arg0.anInt605 = 16711680;
							arg0.aString13 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg0.anInt605 = 16777215;
							arg0.aString13 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(639) String local639;
					if (local4 == 650 || local4 == 655) {
						if (this.anInt905 == 0) {
							arg0.aString13 = "";
						} else {
							if (this.anInt867 == 0) {
								local639 = "earlier today";
							} else if (this.anInt867 == 1) {
								local639 = "yesterday";
							} else {
								local639 = this.anInt867 + " days ago";
							}
							arg0.aString13 = "You last logged in " + local639 + " from: " + signlink.dns;
						}
					}
					if (local4 == 651) {
						if (this.anInt1051 == 0) {
							arg0.aString13 = "0 unread messages";
							arg0.anInt605 = 16776960;
						}
						if (this.anInt1051 == 1) {
							arg0.aString13 = "1 unread message";
							arg0.anInt605 = 65280;
						}
						if (this.anInt1051 > 1) {
							arg0.aString13 = this.anInt1051 + " unread messages";
							arg0.anInt605 = 65280;
						}
					}
					if (local4 == 652) {
						if (this.anInt874 == 201) {
							if (this.anInt863 == 1) {
								arg0.aString13 = "@yel@This is a non-members world: @whi@Since you are a member we";
							} else {
								arg0.aString13 = "";
							}
						} else if (this.anInt874 == 200) {
							arg0.aString13 = "You have not yet set any password recovery questions.";
						} else {
							if (this.anInt874 == 0) {
								local639 = "Earlier today";
							} else if (this.anInt874 == 1) {
								local639 = "Yesterday";
							} else {
								local639 = this.anInt874 + " days ago";
							}
							arg0.aString13 = local639 + " you changed your recovery questions";
						}
					}
					if (local4 == 653) {
						if (this.anInt874 == 201) {
							if (this.anInt863 == 1) {
								arg0.aString13 = "@whi@recommend you use a members world instead. You may use";
							} else {
								arg0.aString13 = "";
							}
						} else if (this.anInt874 == 200) {
							arg0.aString13 = "We strongly recommend you do so now to secure your account.";
						} else {
							arg0.aString13 = "If you do not remember making this change then cancel it immediately";
						}
					}
					if (local4 == 654) {
						if (this.anInt874 == 201) {
							if (this.anInt863 == 1) {
								arg0.aString13 = "@whi@this world but member benefits are unavailable whilst here.";
							} else {
								arg0.aString13 = "";
							}
						} else if (this.anInt874 == 200) {
							arg0.aString13 = "Do this from the 'account management' area on our front webpage";
						} else {
							arg0.aString13 = "Do this from the 'account management' area on our front webpage";
						}
					}
				}
			} else if (local4 == 1 && this.anInt1001 == 0) {
				arg0.aString13 = "Loading friend list";
				arg0.anInt606 = 0;
			} else if (local4 == 1 && this.anInt1001 == 1) {
				arg0.aString13 = "Connecting to friendserver";
				arg0.anInt606 = 0;
			} else if (local4 == 2 && this.anInt1001 != 2) {
				arg0.aString13 = "Please wait...";
				arg0.anInt606 = 0;
			} else {
				local66 = this.anInt1000;
				if (this.anInt1001 != 2) {
					local66 = 0;
				}
				if (local4 > 700) {
					local4 -= 601;
				} else {
					local4--;
				}
				if (local4 >= local66) {
					arg0.aString13 = "";
					arg0.anInt606 = 0;
				} else {
					arg0.aString13 = this.aStringArray10[local4];
					arg0.anInt606 = 1;
				}
			}
		} catch (@Pc(847) RuntimeException local847) {
			signlink.reporterror("66671, " + arg0 + ", " + -35 + ", " + local847.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method578() {
		try {
			this.aBoolean231 = true;
			this.anInt920 += 0;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("80682, " + 0 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method574() {
		this.method581(20, "Starting up");
		if (signlink.sunjava) {
			super.anInt846 = 5;
		}
		if (aBoolean248) {
			this.aBoolean235 = true;
			return;
		}
		aBoolean248 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method640();
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
			this.aBoolean255 = true;
			return;
		}
		if (signlink.aRandomAccessFile3 != null) {
			for (@Pc(89) int local89 = 0; local89 < 5; local89++) {
				this.aClass34Array1[local89] = new Class34(0, 500000, signlink.aRandomAccessFileArray1[local89], local89 + 1, signlink.aRandomAccessFile3);
			}
		}
		try {
			this.method714();
			this.aClass42_1 = this.method638(1, "title screen", "title", this.anIntArray240[1], 25);
			this.aClass1_Sub1_Sub3_Sub3_2 = new Class1_Sub1_Sub3_Sub3(this.aClass42_1, "p11_full", false, true);
			this.aClass1_Sub1_Sub3_Sub3_3 = new Class1_Sub1_Sub3_Sub3(this.aClass42_1, "p12_full", false, true);
			this.aClass1_Sub1_Sub3_Sub3_4 = new Class1_Sub1_Sub3_Sub3(this.aClass42_1, "b12_full", false, true);
			this.aClass1_Sub1_Sub3_Sub3_5 = new Class1_Sub1_Sub3_Sub3(this.aClass42_1, "q8_full", true, true);
			this.method665();
			this.method667();
			@Pc(185) Class42 local185 = this.method638(2, "config", "config", this.anIntArray240[2], 30);
			@Pc(197) Class42 local197 = this.method638(3, "interface", "interface", this.anIntArray240[3], 35);
			@Pc(209) Class42 local209 = this.method638(4, "2d graphics", "media", this.anIntArray240[4], 40);
			@Pc(221) Class42 local221 = this.method638(6, "textures", "textures", this.anIntArray240[6], 45);
			@Pc(233) Class42 local233 = this.method638(7, "chat system", "wordenc", this.anIntArray240[7], 50);
			@Pc(245) Class42 local245 = this.method638(8, "sound effects", "sounds", this.anIntArray240[8], 55);
			this.aByteArrayArrayArray8 = new byte[4][104][104];
			this.anIntArrayArrayArray8 = new int[4][105][105];
			this.aClass40_1 = new Class40(104, (byte) -97, 104, 4, this.anIntArrayArrayArray8);
			for (@Pc(270) int local270 = 0; local270 < 4; local270++) {
				this.aClass18Array1[local270] = new Class18(104, 104, true);
			}
			this.aClass1_Sub1_Sub3_Sub1_5 = new Class1_Sub1_Sub3_Sub1(512, 512);
			@Pc(305) Class42 local305 = this.method638(5, "update list", "versionlist", this.anIntArray240[5], 60);
			this.method581(60, "Connecting to update server");
			this.aClass20_Sub1_1 = new Class20_Sub1();
			this.aClass20_Sub1_1.method397(local305, this);
			Class6.method40(this.aClass20_Sub1_1.method383());
			Class1_Sub1_Sub1_Sub4.method299(this.aClass20_Sub1_1.method387(0, aBoolean236), this.aClass20_Sub1_1);
			if (!aBoolean247) {
				this.anInt958 = 0;
				try {
					this.anInt958 = Integer.parseInt(this.getParameter("music"));
				} catch (@Pc(346) Exception local346) {
				}
				this.aBoolean243 = true;
				this.aClass20_Sub1_1.method394(2, this.anInt958);
				while (this.aClass20_Sub1_1.method378() > 0) {
					this.method603();
					try {
						Thread.sleep(100L);
					} catch (@Pc(364) Exception local364) {
					}
					if (this.aClass20_Sub1_1.anInt554 > 3) {
						this.method582("ondemand");
						return;
					}
				}
			}
			this.method581(65, "Requesting animations");
			@Pc(388) int local388 = this.aClass20_Sub1_1.method387(1, aBoolean236);
			for (@Pc(390) int local390 = 0; local390 < local388; local390++) {
				this.aClass20_Sub1_1.method394(1, local390);
			}
			@Pc(409) int local409;
			while (this.aClass20_Sub1_1.method378() > 0) {
				local409 = local388 - this.aClass20_Sub1_1.method378();
				if (local409 > 0) {
					this.method581(65, "Loading animations - " + local409 * 100 / local388 + "%");
				}
				this.method603();
				try {
					Thread.sleep(100L);
				} catch (@Pc(435) Exception local435) {
				}
				if (this.aClass20_Sub1_1.anInt554 > 3) {
					this.method582("ondemand");
					return;
				}
			}
			this.method581(70, "Requesting models");
			local388 = this.aClass20_Sub1_1.method387(0, aBoolean236);
			@Pc(469) int local469;
			for (local409 = 0; local409 < local388; local409++) {
				local469 = this.aClass20_Sub1_1.method390(local409);
				if ((local469 & 0x1) != 0) {
					this.aClass20_Sub1_1.method394(0, local409);
				}
			}
			local388 = this.aClass20_Sub1_1.method378();
			while (this.aClass20_Sub1_1.method378() > 0) {
				local469 = local388 - this.aClass20_Sub1_1.method378();
				if (local469 > 0) {
					this.method581(70, "Loading models - " + local469 * 100 / local388 + "%");
				}
				this.method603();
				try {
					Thread.sleep(100L);
				} catch (@Pc(520) Exception local520) {
				}
			}
			if (this.aClass34Array1[0] != null) {
				this.method581(75, "Requesting maps");
				this.aClass20_Sub1_1.method394(3, this.aClass20_Sub1_1.method392(0, 48, 47, (byte) 5));
				this.aClass20_Sub1_1.method394(3, this.aClass20_Sub1_1.method392(1, 48, 47, (byte) 5));
				this.aClass20_Sub1_1.method394(3, this.aClass20_Sub1_1.method392(0, 48, 48, (byte) 5));
				this.aClass20_Sub1_1.method394(3, this.aClass20_Sub1_1.method392(1, 48, 48, (byte) 5));
				this.aClass20_Sub1_1.method394(3, this.aClass20_Sub1_1.method392(0, 48, 49, (byte) 5));
				this.aClass20_Sub1_1.method394(3, this.aClass20_Sub1_1.method392(1, 48, 49, (byte) 5));
				this.aClass20_Sub1_1.method394(3, this.aClass20_Sub1_1.method392(0, 47, 47, (byte) 5));
				this.aClass20_Sub1_1.method394(3, this.aClass20_Sub1_1.method392(1, 47, 47, (byte) 5));
				this.aClass20_Sub1_1.method394(3, this.aClass20_Sub1_1.method392(0, 47, 48, (byte) 5));
				this.aClass20_Sub1_1.method394(3, this.aClass20_Sub1_1.method392(1, 47, 48, (byte) 5));
				this.aClass20_Sub1_1.method394(3, this.aClass20_Sub1_1.method392(0, 148, 48, (byte) 5));
				this.aClass20_Sub1_1.method394(3, this.aClass20_Sub1_1.method392(1, 148, 48, (byte) 5));
				local388 = this.aClass20_Sub1_1.method378();
				while (this.aClass20_Sub1_1.method378() > 0) {
					local469 = local388 - this.aClass20_Sub1_1.method378();
					if (local469 > 0) {
						this.method581(75, "Loading maps - " + local469 * 100 / local388 + "%");
					}
					this.method603();
					try {
						Thread.sleep(100L);
					} catch (@Pc(705) Exception local705) {
					}
				}
			}
			local388 = this.aClass20_Sub1_1.method387(0, aBoolean236);
			@Pc(726) int local726;
			for (local469 = 0; local469 < local388; local469++) {
				local726 = this.aClass20_Sub1_1.method390(local469);
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
					this.aClass20_Sub1_1.method381(local728, 0, local469);
				}
			}
			this.aClass20_Sub1_1.method396(aBoolean246);
			if (!aBoolean247) {
				local388 = this.aClass20_Sub1_1.method387(2, aBoolean236);
				for (local726 = 1; local726 < local388; local726++) {
					if (this.aClass20_Sub1_1.method391(anInt941, local726)) {
						this.aClass20_Sub1_1.method381((byte) 1, 2, local726);
					}
				}
			}
			this.method581(80, "Unpacking media");
			this.aClass1_Sub1_Sub3_Sub2_1 = new Class1_Sub1_Sub3_Sub2(local209, "invback", 0);
			this.aClass1_Sub1_Sub3_Sub2_3 = new Class1_Sub1_Sub3_Sub2(local209, "chatback", 0);
			this.aClass1_Sub1_Sub3_Sub2_2 = new Class1_Sub1_Sub3_Sub2(local209, "mapback", 0);
			this.aClass1_Sub1_Sub3_Sub2_16 = new Class1_Sub1_Sub3_Sub2(local209, "backbase1", 0);
			this.aClass1_Sub1_Sub3_Sub2_17 = new Class1_Sub1_Sub3_Sub2(local209, "backbase2", 0);
			this.aClass1_Sub1_Sub3_Sub2_18 = new Class1_Sub1_Sub3_Sub2(local209, "backhmid1", 0);
			for (local726 = 0; local726 < 13; local726++) {
				this.aClass1_Sub1_Sub3_Sub2Array2[local726] = new Class1_Sub1_Sub3_Sub2(local209, "sideicons", local726);
			}
			this.aClass1_Sub1_Sub3_Sub1_6 = new Class1_Sub1_Sub3_Sub1(local209, "compass", 0);
			this.aClass1_Sub1_Sub3_Sub1_9 = new Class1_Sub1_Sub3_Sub1(local209, "mapedge", 0);
			this.aClass1_Sub1_Sub3_Sub1_9.method135();
			@Pc(928) int local928;
			try {
				for (local928 = 0; local928 < 100; local928++) {
					this.aClass1_Sub1_Sub3_Sub2Array4[local928] = new Class1_Sub1_Sub3_Sub2(local209, "mapscene", local928);
				}
			} catch (@Pc(946) Exception local946) {
			}
			try {
				for (local928 = 0; local928 < 100; local928++) {
					this.aClass1_Sub1_Sub3_Sub1Array8[local928] = new Class1_Sub1_Sub3_Sub1(local209, "mapfunction", local928);
				}
			} catch (@Pc(966) Exception local966) {
			}
			try {
				for (local928 = 0; local928 < 20; local928++) {
					this.aClass1_Sub1_Sub3_Sub1Array4[local928] = new Class1_Sub1_Sub3_Sub1(local209, "hitmarks", local928);
				}
			} catch (@Pc(986) Exception local986) {
			}
			try {
				for (local928 = 0; local928 < 20; local928++) {
					this.aClass1_Sub1_Sub3_Sub1Array7[local928] = new Class1_Sub1_Sub3_Sub1(local209, "headicons", local928);
				}
			} catch (@Pc(1006) Exception local1006) {
			}
			this.aClass1_Sub1_Sub3_Sub1_3 = new Class1_Sub1_Sub3_Sub1(local209, "mapmarker", 0);
			this.aClass1_Sub1_Sub3_Sub1_4 = new Class1_Sub1_Sub3_Sub1(local209, "mapmarker", 1);
			for (local928 = 0; local928 < 8; local928++) {
				this.aClass1_Sub1_Sub3_Sub1Array6[local928] = new Class1_Sub1_Sub3_Sub1(local209, "cross", local928);
			}
			this.aClass1_Sub1_Sub3_Sub1_10 = new Class1_Sub1_Sub3_Sub1(local209, "mapdots", 0);
			this.aClass1_Sub1_Sub3_Sub1_11 = new Class1_Sub1_Sub3_Sub1(local209, "mapdots", 1);
			this.aClass1_Sub1_Sub3_Sub1_12 = new Class1_Sub1_Sub3_Sub1(local209, "mapdots", 2);
			this.aClass1_Sub1_Sub3_Sub1_13 = new Class1_Sub1_Sub3_Sub1(local209, "mapdots", 3);
			this.aClass1_Sub1_Sub3_Sub1_14 = new Class1_Sub1_Sub3_Sub1(local209, "mapdots", 4);
			this.aClass1_Sub1_Sub3_Sub2_19 = new Class1_Sub1_Sub3_Sub2(local209, "scrollbar", 0);
			this.aClass1_Sub1_Sub3_Sub2_20 = new Class1_Sub1_Sub3_Sub2(local209, "scrollbar", 1);
			this.aClass1_Sub1_Sub3_Sub2_6 = new Class1_Sub1_Sub3_Sub2(local209, "redstone1", 0);
			this.aClass1_Sub1_Sub3_Sub2_7 = new Class1_Sub1_Sub3_Sub2(local209, "redstone2", 0);
			this.aClass1_Sub1_Sub3_Sub2_8 = new Class1_Sub1_Sub3_Sub2(local209, "redstone3", 0);
			this.aClass1_Sub1_Sub3_Sub2_9 = new Class1_Sub1_Sub3_Sub2(local209, "redstone1", 0);
			this.aClass1_Sub1_Sub3_Sub2_9.method205(anInt1075);
			this.aClass1_Sub1_Sub3_Sub2_10 = new Class1_Sub1_Sub3_Sub2(local209, "redstone2", 0);
			this.aClass1_Sub1_Sub3_Sub2_10.method205(anInt1075);
			this.aClass1_Sub1_Sub3_Sub2_11 = new Class1_Sub1_Sub3_Sub2(local209, "redstone1", 0);
			this.aClass1_Sub1_Sub3_Sub2_11.method206(anInt933);
			this.aClass1_Sub1_Sub3_Sub2_12 = new Class1_Sub1_Sub3_Sub2(local209, "redstone2", 0);
			this.aClass1_Sub1_Sub3_Sub2_12.method206(anInt933);
			this.aClass1_Sub1_Sub3_Sub2_13 = new Class1_Sub1_Sub3_Sub2(local209, "redstone3", 0);
			this.aClass1_Sub1_Sub3_Sub2_13.method206(anInt933);
			this.aClass1_Sub1_Sub3_Sub2_14 = new Class1_Sub1_Sub3_Sub2(local209, "redstone1", 0);
			this.aClass1_Sub1_Sub3_Sub2_14.method205(anInt1075);
			this.aClass1_Sub1_Sub3_Sub2_14.method206(anInt933);
			this.aClass1_Sub1_Sub3_Sub2_15 = new Class1_Sub1_Sub3_Sub2(local209, "redstone2", 0);
			this.aClass1_Sub1_Sub3_Sub2_15.method205(anInt1075);
			this.aClass1_Sub1_Sub3_Sub2_15.method206(anInt933);
			for (@Pc(1214) int local1214 = 0; local1214 < 2; local1214++) {
				this.aClass1_Sub1_Sub3_Sub2Array3[local1214] = new Class1_Sub1_Sub3_Sub2(local209, "mod_icons", local1214);
			}
			@Pc(1237) Class1_Sub1_Sub3_Sub1 local1237 = new Class1_Sub1_Sub3_Sub1(local209, "backleft1", 0);
			this.aClass12_15 = new Class12(this.method579(), -4368, local1237.anInt192, local1237.anInt191);
			local1237.method136((byte) 3, 0, 0);
			@Pc(1262) Class1_Sub1_Sub3_Sub1 local1262 = new Class1_Sub1_Sub3_Sub1(local209, "backleft2", 0);
			this.aClass12_16 = new Class12(this.method579(), -4368, local1262.anInt192, local1262.anInt191);
			local1262.method136((byte) 3, 0, 0);
			@Pc(1287) Class1_Sub1_Sub3_Sub1 local1287 = new Class1_Sub1_Sub3_Sub1(local209, "backright1", 0);
			this.aClass12_17 = new Class12(this.method579(), -4368, local1287.anInt192, local1287.anInt191);
			local1287.method136((byte) 3, 0, 0);
			@Pc(1312) Class1_Sub1_Sub3_Sub1 local1312 = new Class1_Sub1_Sub3_Sub1(local209, "backright2", 0);
			this.aClass12_18 = new Class12(this.method579(), -4368, local1312.anInt192, local1312.anInt191);
			local1312.method136((byte) 3, 0, 0);
			@Pc(1337) Class1_Sub1_Sub3_Sub1 local1337 = new Class1_Sub1_Sub3_Sub1(local209, "backtop1", 0);
			this.aClass12_19 = new Class12(this.method579(), -4368, local1337.anInt192, local1337.anInt191);
			local1337.method136((byte) 3, 0, 0);
			@Pc(1362) Class1_Sub1_Sub3_Sub1 local1362 = new Class1_Sub1_Sub3_Sub1(local209, "backvmid1", 0);
			this.aClass12_20 = new Class12(this.method579(), -4368, local1362.anInt192, local1362.anInt191);
			local1362.method136((byte) 3, 0, 0);
			@Pc(1387) Class1_Sub1_Sub3_Sub1 local1387 = new Class1_Sub1_Sub3_Sub1(local209, "backvmid2", 0);
			this.aClass12_21 = new Class12(this.method579(), -4368, local1387.anInt192, local1387.anInt191);
			local1387.method136((byte) 3, 0, 0);
			@Pc(1412) Class1_Sub1_Sub3_Sub1 local1412 = new Class1_Sub1_Sub3_Sub1(local209, "backvmid3", 0);
			this.aClass12_22 = new Class12(this.method579(), -4368, local1412.anInt192, local1412.anInt191);
			local1412.method136((byte) 3, 0, 0);
			@Pc(1437) Class1_Sub1_Sub3_Sub1 local1437 = new Class1_Sub1_Sub3_Sub1(local209, "backhmid2", 0);
			this.aClass12_23 = new Class12(this.method579(), -4368, local1437.anInt192, local1437.anInt191);
			local1437.method136((byte) 3, 0, 0);
			@Pc(1462) int local1462 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1469) int local1469 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1476) int local1476 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1483) int local1483 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1485) int local1485 = 0; local1485 < 100; local1485++) {
				if (this.aClass1_Sub1_Sub3_Sub1Array8[local1485] != null) {
					this.aClass1_Sub1_Sub3_Sub1Array8[local1485].method134(local1476 + local1483, local1462 + local1483, aByte36, local1469 + local1483);
				}
				if (this.aClass1_Sub1_Sub3_Sub2Array4[local1485] != null) {
					this.aClass1_Sub1_Sub3_Sub2Array4[local1485].method207(local1476 + local1483, local1462 + local1483, aByte36, local1469 + local1483);
				}
			}
			this.method581(83, "Unpacking textures");
			Class1_Sub1_Sub3_Sub4.method526(local221);
			Class1_Sub1_Sub3_Sub4.method530(0.8D, (byte) 1);
			Class1_Sub1_Sub3_Sub4.method525();
			this.method581(86, "Unpacking config");
			Class21.method278(local185);
			Class38.method441(local185);
			Class48.method559(local185, 236);
			Class23.method291(local185);
			Class31.method404(local185);
			Class35.method419(local185, 236);
			Class4.method32(local185);
			Class33.method413(local185);
			Class8.method150(local185);
			Class23.aBoolean102 = aBoolean246;
			if (!aBoolean247) {
				this.method581(90, "Unpacking sounds");
				@Pc(1588) byte[] local1588 = local245.method539("sounds.dat", null);
				@Pc(1594) Class1_Sub1_Sub2 local1594 = new Class1_Sub1_Sub2(local1588, 792);
				Class43.method540(local1594, 236);
			}
			this.method581(95, "Unpacking interfaces");
			@Pc(1625) Class1_Sub1_Sub3_Sub3[] local1625 = new Class1_Sub1_Sub3_Sub3[] { this.aClass1_Sub1_Sub3_Sub3_2, this.aClass1_Sub1_Sub3_Sub3_3, this.aClass1_Sub1_Sub3_Sub3_4, this.aClass1_Sub1_Sub3_Sub3_5 };
			Class32.method408(local209, local197, local1625);
			this.method581(100, "Preparing game engine");
			@Pc(1641) int local1641;
			@Pc(1643) int local1643;
			@Pc(1645) int local1645;
			for (@Pc(1637) int local1637 = 0; local1637 < 33; local1637++) {
				local1641 = 999;
				local1643 = 0;
				for (local1645 = 0; local1645 < 34; local1645++) {
					if (this.aClass1_Sub1_Sub3_Sub2_2.aByteArray2[local1645 + local1637 * this.aClass1_Sub1_Sub3_Sub2_2.anInt266] == 0) {
						if (local1641 == 999) {
							local1641 = local1645;
						}
					} else if (local1641 != 999) {
						local1643 = local1645;
						break;
					}
				}
				this.anIntArray233[local1637] = local1641;
				this.anIntArray241[local1637] = local1643 - local1641;
			}
			@Pc(1703) int local1703;
			for (local1641 = 5; local1641 < 156; local1641++) {
				local1643 = 999;
				local1645 = 0;
				for (local1703 = 25; local1703 < 172; local1703++) {
					if (this.aClass1_Sub1_Sub3_Sub2_2.aByteArray2[local1703 + local1641 * this.aClass1_Sub1_Sub3_Sub2_2.anInt266] == 0 && (local1703 > 34 || local1641 > 34)) {
						if (local1643 == 999) {
							local1643 = local1703;
						}
					} else if (local1643 != 999) {
						local1645 = local1703;
						break;
					}
				}
				this.anIntArray226[local1641 - 5] = local1643 - 25;
				this.anIntArray218[local1641 - 5] = local1645 - local1643;
			}
			Class1_Sub1_Sub3_Sub4.method523(96, 479);
			this.anIntArray244 = Class1_Sub1_Sub3_Sub4.anIntArray181;
			Class1_Sub1_Sub3_Sub4.method523(261, 190);
			this.anIntArray245 = Class1_Sub1_Sub3_Sub4.anIntArray181;
			Class1_Sub1_Sub3_Sub4.method523(334, 512);
			this.anIntArray246 = Class1_Sub1_Sub3_Sub4.anIntArray181;
			@Pc(1787) int[] local1787 = new int[9];
			for (local1645 = 0; local1645 < 9; local1645++) {
				local1703 = local1645 * 32 + 128 + 15;
				@Pc(1805) int local1805 = local1703 * 3 + 600;
				@Pc(1809) int local1809 = Class1_Sub1_Sub3_Sub4.anIntArray179[local1703];
				local1787[local1645] = local1805 * local1809 >> 16;
			}
			Class40.method492(local1787, 636);
			Class30.method337(local233);
			this.aClass14_1 = new Class14(this, -13743);
			this.method580(this.aClass14_1, 10);
			Class1_Sub1_Sub1_Sub5.aClient2 = this;
			Class38.aClient5 = this;
			Class31.aClient4 = this;
		} catch (@Pc(1850) Exception local1850) {
			signlink.reporterror("loaderror " + this.aString24 + " " + this.anInt908);
			this.aBoolean234 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
	private void method678() {
		try {
			this.aClass1_Sub1_Sub2_8.method48(31);
			if (this.anInt1006 != -1) {
				this.anInt1006 = -1;
				this.aBoolean223 = true;
				this.aBoolean257 = false;
				this.aBoolean256 = true;
			}
			if (this.anInt1065 != -1) {
				this.anInt1065 = -1;
				this.aBoolean232 = true;
				this.aBoolean257 = false;
			}
			if (this.anInt960 != -1) {
				this.anInt960 = -1;
				this.aBoolean231 = true;
			}
			this.anInt1053 = -1;
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("76993, " + true + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method679() {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray260[local5 + 32512] = 255;
				}
			}
			@Pc(41) int local41;
			@Pc(48) int local48;
			@Pc(54) int local54;
			for (local12 = 0; local12 < 100; local12++) {
				local41 = (int) (Math.random() * 124.0D) + 2;
				local48 = (int) (Math.random() * 128.0D) + 128;
				local54 = local41 + (local48 << 7);
				this.anIntArray260[local54] = 192;
			}
			for (local41 = 1; local41 < 255; local41++) {
				for (local48 = 1; local48 < 127; local48++) {
					local54 = local48 + (local41 << 7);
					this.anIntArray261[local54] = (this.anIntArray260[local54 - 1] + this.anIntArray260[local54 + 1] + this.anIntArray260[local54 - 128] + this.anIntArray260[local54 + 128]) / 4;
				}
			}
			this.anInt1080 += 128;
			if (this.anInt1080 > this.anIntArray227.length) {
				this.anInt1080 -= this.anIntArray227.length;
				local48 = (int) (Math.random() * 12.0D);
				this.method592(this.aClass1_Sub1_Sub3_Sub2Array5[local48]);
			}
			@Pc(166) int local166;
			for (local48 = 1; local48 < 255; local48++) {
				for (local54 = 1; local54 < 127; local54++) {
					local166 = local54 + (local48 << 7);
					@Pc(189) int local189 = this.anIntArray261[local166 + 128] - this.anIntArray227[local166 + this.anInt1080 & this.anIntArray227.length - 1] / 5;
					if (local189 < 0) {
						local189 = 0;
					}
					this.anIntArray260[local166] = local189;
				}
			}
			for (local54 = 0; local54 < 255; local54++) {
				this.anIntArray247[local54] = this.anIntArray247[local54 + 1];
			}
			this.anIntArray247[255] = (int) (Math.sin((double) anInt903 / 14.0D) * 16.0D + Math.sin((double) anInt903 / 15.0D) * 14.0D + Math.sin((double) anInt903 / 16.0D) * 12.0D);
			if (this.anInt929 > 0) {
				this.anInt929 -= 4;
			}
			if (this.anInt930 > 0) {
				this.anInt930 -= 4;
			}
			if (this.anInt929 == 0 && this.anInt930 == 0) {
				local166 = (int) (Math.random() * 2000.0D);
				if (local166 == 0) {
					this.anInt929 = 1024;
				}
				if (local166 == 1) {
					this.anInt930 = 1024;
					return;
				}
			}
		} catch (@Pc(305) RuntimeException local305) {
			signlink.reporterror("12307, " + 114 + ", " + local305.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(III)V")
	private void method680(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(6) int local6 = 0;
			for (@Pc(8) int local8 = 0; local8 < 100; local8++) {
				if (this.aStringArray9[local8] != null) {
					@Pc(20) int local20 = this.anIntArray212[local8];
					@Pc(31) int local31 = this.anInt1027 + 70 + 4 - local6 * 14;
					if (local31 < -20) {
						break;
					}
					@Pc(39) String local39 = this.aStringArray8[local8];
					if (local39 != null && local39.startsWith("@cr1@")) {
						local39 = local39.substring(5);
					}
					if (local39 != null && local39.startsWith("@cr2@")) {
						local39 = local39.substring(5);
					}
					if (local20 == 0) {
						local6++;
					}
					if ((local20 == 1 || local20 == 2) && (local20 == 1 || this.anInt1026 == 0 || this.anInt1026 == 1 && this.method660(this.aBoolean252, local39))) {
						if (arg0 > local31 - 14 && arg0 <= local31 && !local39.equals(aClass1_Sub1_Sub1_Sub1_Sub2_1.aString5)) {
							if (this.anInt981 >= 1) {
								this.aStringArray12[this.anInt949] = "Report abuse @whi@" + local39;
								this.anIntArray250[this.anInt949] = 853;
								this.anInt949++;
							}
							this.aStringArray12[this.anInt949] = "Add ignore @whi@" + local39;
							this.anIntArray250[this.anInt949] = 992;
							this.anInt949++;
							this.aStringArray12[this.anInt949] = "Add friend @whi@" + local39;
							this.anIntArray250[this.anInt949] = 50;
							this.anInt949++;
						}
						local6++;
					}
					if ((local20 == 3 || local20 == 7) && this.anInt980 == 0 && (local20 == 7 || this.anInt900 == 0 || this.anInt900 == 1 && this.method660(this.aBoolean252, local39))) {
						if (arg0 > local31 - 14 && arg0 <= local31) {
							if (this.anInt981 >= 1) {
								this.aStringArray12[this.anInt949] = "Report abuse @whi@" + local39;
								this.anIntArray250[this.anInt949] = 853;
								this.anInt949++;
							}
							this.aStringArray12[this.anInt949] = "Add ignore @whi@" + local39;
							this.anIntArray250[this.anInt949] = 992;
							this.anInt949++;
							this.aStringArray12[this.anInt949] = "Add friend @whi@" + local39;
							this.anIntArray250[this.anInt949] = 50;
							this.anInt949++;
						}
						local6++;
					}
					if (local20 == 4 && (this.anInt893 == 0 || this.anInt893 == 1 && this.method660(this.aBoolean252, local39))) {
						if (arg0 > local31 - 14 && arg0 <= local31) {
							this.aStringArray12[this.anInt949] = "Accept trade @whi@" + local39;
							this.anIntArray250[this.anInt949] = 917;
							this.anInt949++;
						}
						local6++;
					}
					if ((local20 == 5 || local20 == 6) && this.anInt980 == 0 && this.anInt900 < 2) {
						local6++;
					}
					if (local20 == 8 && (this.anInt893 == 0 || this.anInt893 == 1 && this.method660(this.aBoolean252, local39))) {
						if (arg0 > local31 - 14 && arg0 <= local31) {
							this.aStringArray12[this.anInt949] = "Accept challenge @whi@" + local39;
							this.anIntArray250[this.anInt949] = 235;
							this.anInt949++;
						}
						local6++;
					}
				}
			}
		} catch (@Pc(408) RuntimeException local408) {
			signlink.reporterror("2985, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local408.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method681(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = false;
			if (this.anInt950 == 0 && this.anInt942 == 0) {
				this.aStringArray12[this.anInt949] = "Walk here";
				this.anIntArray250[this.anInt949] = 189;
				this.anIntArray248[this.anInt949] = super.anInt852;
				this.anIntArray249[this.anInt949] = super.anInt853;
				this.anInt949++;
			}
			@Pc(45) int local45 = -1;
			for (@Pc(47) int local47 = 0; local47 < Class1_Sub1_Sub1_Sub4.anInt506; local47++) {
				@Pc(53) int local53 = Class1_Sub1_Sub1_Sub4.anIntArray119[local47];
				@Pc(57) int local57 = local53 & 0x7F;
				@Pc(63) int local63 = local53 >> 7 & 0x7F;
				@Pc(69) int local69 = local53 >> 29 & 0x3;
				@Pc(75) int local75 = local53 >> 14 & 0x7FFF;
				if (local53 != local45) {
					local45 = local53;
					@Pc(222) int local222;
					if (local69 == 2 && this.aClass40_1.method486(this.anInt961, local57, local63, local53) >= 0) {
						@Pc(95) Class38 local95 = Class38.method442(local75);
						if (local95.anIntArray155 != null) {
							local95 = local95.method443();
						}
						if (local95 == null) {
							continue;
						}
						if (this.anInt950 == 1) {
							this.aStringArray12[this.anInt949] = "Use " + this.aString25 + " with @cya@" + local95.aString15;
							this.anIntArray250[this.anInt949] = 28;
							this.anIntArray251[this.anInt949] = local53;
							this.anIntArray248[this.anInt949] = local57;
							this.anIntArray249[this.anInt949] = local63;
							this.anInt949++;
						} else if (this.anInt942 != 1) {
							if (local95.aStringArray7 != null) {
								for (local222 = 4; local222 >= 0; local222--) {
									if (local95.aStringArray7[local222] != null) {
										this.aStringArray12[this.anInt949] = local95.aStringArray7[local222] + " @cya@" + local95.aString15;
										if (local222 == 0) {
											this.anIntArray250[this.anInt949] = 921;
										}
										if (local222 == 1) {
											this.anIntArray250[this.anInt949] = 215;
										}
										if (local222 == 2) {
											this.anIntArray250[this.anInt949] = 860;
										}
										if (local222 == 3) {
											this.anIntArray250[this.anInt949] = 277;
										}
										if (local222 == 4) {
											this.anIntArray250[this.anInt949] = 1485;
										}
										this.anIntArray251[this.anInt949] = local53;
										this.anIntArray248[this.anInt949] = local57;
										this.anIntArray249[this.anInt949] = local63;
										this.anInt949++;
									}
								}
							}
							this.aStringArray12[this.anInt949] = "Examine @cya@" + local95.aString15;
							this.anIntArray250[this.anInt949] = 1741;
							this.anIntArray251[this.anInt949] = local95.anInt663 << 14;
							this.anIntArray248[this.anInt949] = local57;
							this.anIntArray249[this.anInt949] = local63;
							this.anInt949++;
						} else if ((this.anInt944 & 0x4) == 4) {
							this.aStringArray12[this.anInt949] = this.aString23 + " @cya@" + local95.aString15;
							this.anIntArray250[this.anInt949] = 464;
							this.anIntArray251[this.anInt949] = local53;
							this.anIntArray248[this.anInt949] = local57;
							this.anIntArray249[this.anInt949] = local63;
							this.anInt949++;
						}
					}
					@Pc(402) Class1_Sub1_Sub1_Sub1_Sub1 local402;
					@Pc(450) Class1_Sub1_Sub1_Sub1_Sub2 local450;
					@Pc(440) int local440;
					if (local69 == 1) {
						@Pc(373) Class1_Sub1_Sub1_Sub1_Sub1 local373 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local75];
						if (local373.aClass31_1.aByte23 == 1 && (local373.anInt319 & 0x7F) == 64 && (local373.anInt320 & 0x7F) == 64) {
							for (local222 = 0; local222 < this.anInt988; local222++) {
								local402 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray236[local222]];
								if (local402 != null && local402 != local373 && local402.aClass31_1.aByte23 == 1 && local402.anInt319 == local373.anInt319 && local402.anInt320 == local373.anInt320) {
									this.method589(local402.aClass31_1, local57, 318, this.anIntArray236[local222], local63);
								}
							}
							for (local440 = 0; local440 < this.anInt871; local440++) {
								local450 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray213[local440]];
								if (local450 != null && local450.anInt319 == local373.anInt319 && local450.anInt320 == local373.anInt320) {
									this.method649(local450, local57, local63, this.anIntArray213[local440]);
								}
							}
						}
						this.method589(local373.aClass31_1, local57, 318, local75, local63);
					}
					if (local69 == 0) {
						@Pc(492) Class1_Sub1_Sub1_Sub1_Sub2 local492 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local75];
						if ((local492.anInt319 & 0x7F) == 64 && (local492.anInt320 & 0x7F) == 64) {
							for (local222 = 0; local222 < this.anInt988; local222++) {
								local402 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray236[local222]];
								if (local402 != null && local402.aClass31_1.aByte23 == 1 && local402.anInt319 == local492.anInt319 && local402.anInt320 == local492.anInt320) {
									this.method589(local402.aClass31_1, local57, 318, this.anIntArray236[local222], local63);
								}
							}
							for (local440 = 0; local440 < this.anInt871; local440++) {
								local450 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray213[local440]];
								if (local450 != null && local450 != local492 && local450.anInt319 == local492.anInt319 && local450.anInt320 == local492.anInt320) {
									this.method649(local450, local57, local63, this.anIntArray213[local440]);
								}
							}
						}
						this.method649(local492, local57, local63, local75);
					}
					if (local69 == 3) {
						@Pc(611) Class7 local611 = this.aClass7ArrayArrayArray1[this.anInt961][local57][local63];
						if (local611 != null) {
							for (@Pc(618) Class1_Sub1_Sub1_Sub3 local618 = (Class1_Sub1_Sub1_Sub3) local611.method101(); local618 != null; local618 = (Class1_Sub1_Sub1_Sub3) local611.method103()) {
								@Pc(624) Class23 local624 = Class23.method286(local618.anInt200);
								if (this.anInt950 == 1) {
									this.aStringArray12[this.anInt949] = "Use " + this.aString25 + " with @lre@" + local624.aString6;
									this.anIntArray250[this.anInt949] = 343;
									this.anIntArray251[this.anInt949] = local618.anInt200;
									this.anIntArray248[this.anInt949] = local57;
									this.anIntArray249[this.anInt949] = local63;
									this.anInt949++;
								} else if (this.anInt942 != 1) {
									for (@Pc(741) int local741 = 4; local741 >= 0; local741--) {
										if (local624.aStringArray1 != null && local624.aStringArray1[local741] != null) {
											this.aStringArray12[this.anInt949] = local624.aStringArray1[local741] + " @lre@" + local624.aString6;
											if (local741 == 0) {
												this.anIntArray250[this.anInt949] = 279;
											}
											if (local741 == 1) {
												this.anIntArray250[this.anInt949] = 604;
											}
											if (local741 == 2) {
												this.anIntArray250[this.anInt949] = 248;
											}
											if (local741 == 3) {
												this.anIntArray250[this.anInt949] = 63;
											}
											if (local741 == 4) {
												this.anIntArray250[this.anInt949] = 401;
											}
											this.anIntArray251[this.anInt949] = local618.anInt200;
											this.anIntArray248[this.anInt949] = local57;
											this.anIntArray249[this.anInt949] = local63;
											this.anInt949++;
										} else if (local741 == 2) {
											this.aStringArray12[this.anInt949] = "Take @lre@" + local624.aString6;
											this.anIntArray250[this.anInt949] = 248;
											this.anIntArray251[this.anInt949] = local618.anInt200;
											this.anIntArray248[this.anInt949] = local57;
											this.anIntArray249[this.anInt949] = local63;
											this.anInt949++;
										}
									}
									this.aStringArray12[this.anInt949] = "Examine @lre@" + local624.aString6;
									this.anIntArray250[this.anInt949] = 1491;
									this.anIntArray251[this.anInt949] = local618.anInt200;
									this.anIntArray248[this.anInt949] = local57;
									this.anIntArray249[this.anInt949] = local63;
									this.anInt949++;
								} else if ((this.anInt944 & 0x1) == 1) {
									this.aStringArray12[this.anInt949] = this.aString23 + " @lre@" + local624.aString6;
									this.anIntArray250[this.anInt949] = 4;
									this.anIntArray251[this.anInt949] = local618.anInt200;
									this.anIntArray248[this.anInt949] = local57;
									this.anIntArray249[this.anInt949] = local63;
									this.anInt949++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(948) RuntimeException local948) {
			signlink.reporterror("44434, " + arg0 + ", " + local948.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!CFARFRSG;I)V")
	private void method682(@OriginalArg(1) Class1_Sub1_Sub2 arg0, @OriginalArg(2) int arg1) {
		try {
			this.aBoolean264 &= true;
			for (@Pc(9) int local9 = 0; local9 < this.anInt872; local9++) {
				@Pc(16) int local16 = this.anIntArray214[local9];
				@Pc(21) Class1_Sub1_Sub1_Sub1_Sub1 local21 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local16];
				@Pc(24) int local24 = arg0.method59();
				@Pc(33) int local33;
				@Pc(42) int local42;
				if ((local24 & 0x8) != 0) {
					local33 = arg0.method88(this.anInt1074);
					if (local33 == 65535) {
						local33 = -1;
					}
					local42 = arg0.method79();
					if (local33 == local21.anInt332 && local33 != -1) {
						@Pc(54) int local54 = Class21.aClass21Array1[local33].anInt398;
						if (local54 == 1) {
							local21.anInt333 = 0;
							local21.anInt334 = 0;
							local21.anInt335 = local42;
							local21.anInt336 = 0;
						}
						if (local54 == 2) {
							local21.anInt336 = 0;
						}
					} else if (local33 == -1 || local21.anInt332 == -1 || Class21.aClass21Array1[local33].anInt392 >= Class21.aClass21Array1[local21.anInt332].anInt392) {
						local21.anInt332 = local33;
						local21.anInt333 = 0;
						local21.anInt334 = 0;
						local21.anInt335 = local42;
						local21.anInt336 = 0;
						local21.anInt323 = local21.anInt317;
					}
				}
				if ((local24 & 0x20) != 0) {
					local33 = arg0.method79();
					local42 = arg0.method80();
					local21.method248(local33, local42, anInt903, 491);
					local21.anInt329 = anInt903 + 300;
					local21.anInt330 = arg0.method78(887);
					local21.anInt331 = arg0.method80();
				}
				if ((local24 & 0x1) != 0) {
					local21.aClass31_1 = Class31.method400(arg0.method88(this.anInt1074));
					local21.anInt326 = local21.aClass31_1.aByte23;
					local21.anInt295 = local21.aClass31_1.anInt582;
					local21.anInt305 = local21.aClass31_1.anInt573;
					local21.anInt306 = local21.aClass31_1.anInt584;
					local21.anInt307 = local21.aClass31_1.anInt570;
					local21.anInt308 = local21.aClass31_1.anInt577;
					local21.anInt327 = local21.aClass31_1.anInt578;
				}
				if ((local24 & 0x10) != 0) {
					local21.anInt337 = arg0.method61();
					if (local21.anInt337 == 65535) {
						local21.anInt337 = -1;
					}
				}
				if ((local24 & 0x2) != 0) {
					local21.aString4 = arg0.method66();
					local21.anInt322 = 100;
				}
				if ((local24 & 0x40) != 0) {
					local21.anInt302 = arg0.method87(405);
					local21.anInt303 = arg0.method61();
				}
				if ((local24 & 0x4) != 0) {
					local21.anInt296 = arg0.method61();
					local33 = arg0.method94(this.anInt989);
					local21.anInt300 = local33 >> 16;
					local21.anInt299 = anInt903 + (local33 & 0xFFFF);
					local21.anInt297 = 0;
					local21.anInt298 = 0;
					if (local21.anInt299 > anInt903) {
						local21.anInt297 = -1;
					}
					if (local21.anInt296 == 65535) {
						local21.anInt296 = -1;
					}
				}
				if ((local24 & 0x80) != 0) {
					local33 = arg0.method78(887);
					local42 = arg0.method79();
					local21.method248(local33, local42, anInt903, 491);
					local21.anInt329 = anInt903 + 300;
					local21.anInt330 = arg0.method59();
					local21.anInt331 = arg0.method59();
				}
			}
		} catch (@Pc(314) RuntimeException local314) {
			signlink.reporterror("50681, " + true + ", " + arg0 + ", " + arg1 + ", " + local314.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(IILclient!CFARFRSG;)V")
	private void method683(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub2 arg1) {
		try {
			@Pc(6) int local6 = arg1.method70(881, 8);
			@Pc(12) int local12;
			if (local6 < this.anInt871) {
				for (local12 = local6; local12 < this.anInt871; local12++) {
					this.anIntArray223[this.anInt901++] = this.anIntArray213[local12];
				}
			}
			if (local6 > this.anInt871) {
				signlink.reporterror(this.aString28 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt871 = 0;
			for (local12 = 0; local12 < local6; local12++) {
				@Pc(64) int local64 = this.anIntArray213[local12];
				@Pc(69) Class1_Sub1_Sub1_Sub1_Sub2 local69 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local64];
				@Pc(74) int local74 = arg1.method70(881, 1);
				if (local74 == 0) {
					this.anIntArray213[this.anInt871++] = local64;
					local69.anInt304 = anInt903;
				} else {
					@Pc(97) int local97 = arg1.method70(881, 2);
					if (local97 == 0) {
						this.anIntArray213[this.anInt871++] = local64;
						local69.anInt304 = anInt903;
						this.anIntArray214[this.anInt872++] = local64;
					} else {
						@Pc(148) int local148;
						@Pc(158) int local158;
						if (local97 == 1) {
							this.anIntArray213[this.anInt871++] = local64;
							local69.anInt304 = anInt903;
							local148 = arg1.method70(881, 3);
							local69.method245(local148, false);
							local158 = arg1.method70(881, 1);
							if (local158 == 1) {
								this.anIntArray214[this.anInt872++] = local64;
							}
						} else if (local97 == 2) {
							this.anIntArray213[this.anInt871++] = local64;
							local69.anInt304 = anInt903;
							local148 = arg1.method70(881, 3);
							local69.method245(local148, true);
							local158 = arg1.method70(881, 3);
							local69.method245(local158, true);
							@Pc(216) int local216 = arg1.method70(881, 1);
							if (local216 == 1) {
								this.anIntArray214[this.anInt872++] = local64;
							}
						} else if (local97 == 3) {
							this.anIntArray223[this.anInt901++] = local64;
						}
					}
				}
			}
		} catch (@Pc(260) RuntimeException local260) {
			signlink.reporterror("34347, " + 623 + ", " + arg0 + ", " + arg1 + ", " + local260.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method684(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			if (this.anInt1023 == 2) {
				this.method611((this.anInt975 - this.anInt1037 << 7) + this.anInt978, this.anInt977 * 2, (this.anInt976 - this.anInt1038 << 7) + this.anInt979);
				if (this.anInt1019 > -1 && anInt903 % 20 < 10) {
					this.aClass1_Sub1_Sub3_Sub1Array7[2].method138(this.anInt1019 - 12, this.anInt1020 - 28);
				}
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("13532, " + arg0 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
	private void method685(@OriginalArg(0) boolean arg0) {
		try {
			if (this.aClass12_27 == null) {
				this.method591((byte) 4);
				super.aClass12_2 = null;
				this.aClass12_3 = null;
				this.aClass12_4 = null;
				this.aClass12_5 = null;
				this.aClass12_6 = null;
				this.aClass12_7 = null;
				this.aClass12_8 = null;
				this.aClass12_9 = null;
				if (arg0) {
					this.anInt1015 = 129;
				}
				this.aClass12_10 = null;
				this.aClass12_11 = null;
				this.aClass12_27 = new Class12(this.method579(), -4368, 96, 479);
				this.aClass12_25 = new Class12(this.method579(), -4368, 156, 172);
				Class1_Sub1_Sub3.method512();
				this.aClass1_Sub1_Sub3_Sub2_2.method208(0, 0);
				this.aClass12_24 = new Class12(this.method579(), -4368, 261, 190);
				this.aClass12_26 = new Class12(this.method579(), -4368, 334, 512);
				Class1_Sub1_Sub3.method512();
				this.aClass12_12 = new Class12(this.method579(), -4368, 50, 496);
				this.aClass12_13 = new Class12(this.method579(), -4368, 37, 269);
				this.aClass12_14 = new Class12(this.method579(), -4368, 45, 249);
				this.aBoolean231 = true;
			}
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("70625, " + arg0 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)I")
	private int method686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) int local3 = 256 - arg1;
			if (arg2 != 47773) {
				this.method574();
			}
			return ((arg3 & 0xFF00FF) * local3 + (arg0 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg3 & 0xFF00) * local3 + (arg0 & 0xFF00) * arg1 & 0xFF0000) >> 8;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("33420, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIZII)V")
	private void method689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(8) int local8 = this.aClass40_1.method482(arg0, arg2, arg4);
			@Pc(23) int local23;
			@Pc(29) int local29;
			@Pc(33) int local33;
			@Pc(35) int local35;
			@Pc(57) int local57;
			@Pc(63) int local63;
			if (local8 != 0) {
				local23 = this.aClass40_1.method486(arg0, arg2, arg4, local8);
				local29 = local23 >> 6 & 0x3;
				local33 = local23 & 0x1F;
				local35 = arg1;
				if (local8 > 0) {
					local35 = arg3;
				}
				@Pc(43) int[] local43 = this.aClass1_Sub1_Sub3_Sub1_5.anIntArray22;
				local57 = arg2 * 4 + (103 - arg4) * 512 * 4 + 24624;
				local63 = local8 >> 14 & 0x7FFF;
				@Pc(66) Class38 local66 = Class38.method442(local63);
				if (local66.anInt646 == -1) {
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
					@Pc(76) Class1_Sub1_Sub3_Sub2 local76 = this.aClass1_Sub1_Sub3_Sub2Array4[local66.anInt646];
					if (local76 != null) {
						@Pc(88) int local88 = (local66.anInt664 * 4 - local76.anInt266) / 2;
						@Pc(98) int local98 = (local66.anInt647 * 4 - local76.anInt267) / 2;
						local76.method208(arg2 * 4 + local88 + 48, (104 - arg4 - local66.anInt647) * 4 + 48 + local98);
					}
				}
			}
			local8 = this.aClass40_1.method484(arg0, arg2, arg4);
			if (local8 != 0) {
				local23 = this.aClass40_1.method486(arg0, arg2, arg4, local8);
				local29 = local23 >> 6 & 0x3;
				local33 = local23 & 0x1F;
				local35 = local8 >> 14 & 0x7FFF;
				@Pc(452) Class38 local452 = Class38.method442(local35);
				@Pc(484) int local484;
				if (local452.anInt646 != -1) {
					@Pc(462) Class1_Sub1_Sub3_Sub2 local462 = this.aClass1_Sub1_Sub3_Sub2Array4[local452.anInt646];
					if (local462 != null) {
						local63 = (local452.anInt664 * 4 - local462.anInt266) / 2;
						local484 = (local452.anInt647 * 4 - local462.anInt267) / 2;
						local462.method208(arg2 * 4 + local63 + 48, (104 - arg4 - local452.anInt647) * 4 + 48 + local484);
					}
				} else if (local33 == 9) {
					local57 = 15658734;
					if (local8 > 0) {
						local57 = 15597568;
					}
					@Pc(521) int[] local521 = this.aClass1_Sub1_Sub3_Sub1_5.anIntArray22;
					local484 = arg2 * 4 + (103 - arg4) * 512 * 4 + 24624;
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
			local8 = this.aClass40_1.method485(arg0, arg2, arg4);
			if (local8 != 0) {
				local23 = local8 >> 14 & 0x7FFF;
				@Pc(616) Class38 local616 = Class38.method442(local23);
				if (local616.anInt646 != -1) {
					@Pc(626) Class1_Sub1_Sub3_Sub2 local626 = this.aClass1_Sub1_Sub3_Sub2Array4[local616.anInt646];
					if (local626 != null) {
						local35 = (local616.anInt664 * 4 - local626.anInt266) / 2;
						@Pc(648) int local648 = (local616.anInt647 * 4 - local626.anInt267) / 2;
						local626.method208(arg2 * 4 + local35 + 48, (104 - arg4 - local616.anInt647) * 4 + 48 + local648);
						return;
					}
				}
			}
		} catch (@Pc(672) RuntimeException local672) {
			signlink.reporterror("43486, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + arg4 + ", " + local672.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method690() {
		try {
			this.aClass12_27.method182(this.anInt1054);
			Class1_Sub1_Sub3_Sub4.anIntArray181 = this.anIntArray244;
			this.aClass1_Sub1_Sub3_Sub2_3.method208(0, 0);
			if (this.aBoolean225) {
				this.aClass1_Sub1_Sub3_Sub3_4.method225(40, this.aString17, 0, 239);
				this.aClass1_Sub1_Sub3_Sub3_4.method225(60, this.aString30 + "*", 128, 239);
			} else if (this.anInt925 == 1) {
				this.aClass1_Sub1_Sub3_Sub3_4.method225(40, "Enter amount:", 0, 239);
				this.aClass1_Sub1_Sub3_Sub3_4.method225(60, this.aString19 + "*", 128, 239);
			} else if (this.anInt925 == 2) {
				this.aClass1_Sub1_Sub3_Sub3_4.method225(40, "Enter name:", 0, 239);
				this.aClass1_Sub1_Sub3_Sub3_4.method225(60, this.aString19 + "*", 128, 239);
			} else if (this.aString20 != null) {
				this.aClass1_Sub1_Sub3_Sub3_4.method225(40, this.aString20, 0, 239);
				this.aClass1_Sub1_Sub3_Sub3_4.method225(60, "Click to continue", 128, 239);
			} else if (this.anInt1065 != -1) {
				this.method630(0, 0, 0, Class32.aClass32Array1[this.anInt1065]);
			} else if (this.anInt982 == -1) {
				@Pc(162) Class1_Sub1_Sub3_Sub3 local162 = this.aClass1_Sub1_Sub3_Sub3_3;
				@Pc(164) int local164 = 0;
				Class1_Sub1_Sub3.method511(463, 77, 0, 0);
				for (@Pc(172) int local172 = 0; local172 < 100; local172++) {
					if (this.aStringArray9[local172] != null) {
						@Pc(184) int local184 = this.anIntArray212[local172];
						@Pc(193) int local193 = this.anInt1027 + 70 - local164 * 14;
						@Pc(198) String local198 = this.aStringArray8[local172];
						@Pc(200) byte local200 = 0;
						if (local198 != null && local198.startsWith("@cr1@")) {
							local198 = local198.substring(5);
							local200 = 1;
						}
						if (local198 != null && local198.startsWith("@cr2@")) {
							local198 = local198.substring(5);
							local200 = 2;
						}
						if (local184 == 0) {
							if (local193 > 0 && local193 < 110) {
								local162.method229(this.aStringArray9[local172], 4, 0, 619, local193);
							}
							local164++;
						}
						@Pc(271) int local271;
						if ((local184 == 1 || local184 == 2) && (local184 == 1 || this.anInt1026 == 0 || this.anInt1026 == 1 && this.method660(this.aBoolean252, local198))) {
							if (local193 > 0 && local193 < 110) {
								local271 = 4;
								if (local200 == 1) {
									this.aClass1_Sub1_Sub3_Sub2Array3[0].method208(4, local193 - 12);
									local271 += 14;
								}
								if (local200 == 2) {
									this.aClass1_Sub1_Sub3_Sub2Array3[1].method208(local271, local193 - 12);
									local271 += 14;
								}
								local162.method229(local198 + ":", local271, 0, 619, local193);
								local271 += local162.method227(local198) + 8;
								local162.method229(this.aStringArray9[local172], local271, 255, 619, local193);
							}
							local164++;
						}
						if ((local184 == 3 || local184 == 7) && this.anInt980 == 0 && (local184 == 7 || this.anInt900 == 0 || this.anInt900 == 1 && this.method660(this.aBoolean252, local198))) {
							if (local193 > 0 && local193 < 110) {
								local162.method229("From", 4, 0, 619, local193);
								local271 = local162.method227("From ") + 4;
								if (local200 == 1) {
									this.aClass1_Sub1_Sub3_Sub2Array3[0].method208(local271, local193 - 12);
									local271 += 14;
								}
								if (local200 == 2) {
									this.aClass1_Sub1_Sub3_Sub2Array3[1].method208(local271, local193 - 12);
									local271 += 14;
								}
								local162.method229(local198 + ":", local271, 0, 619, local193);
								local271 += local162.method227(local198) + 8;
								local162.method229(this.aStringArray9[local172], local271, 8388608, 619, local193);
							}
							local164++;
						}
						if (local184 == 4 && (this.anInt893 == 0 || this.anInt893 == 1 && this.method660(this.aBoolean252, local198))) {
							if (local193 > 0 && local193 < 110) {
								local162.method229(local198 + " " + this.aStringArray9[local172], 4, 8388736, 619, local193);
							}
							local164++;
						}
						if (local184 == 5 && this.anInt980 == 0 && this.anInt900 < 2) {
							if (local193 > 0 && local193 < 110) {
								local162.method229(this.aStringArray9[local172], 4, 8388608, 619, local193);
							}
							local164++;
						}
						if (local184 == 6 && this.anInt980 == 0 && this.anInt900 < 2) {
							if (local193 > 0 && local193 < 110) {
								local162.method229("To " + local198 + ":", 4, 0, 619, local193);
								local162.method229(this.aStringArray9[local172], local162.method227("To " + local198) + 12, 8388608, 619, local193);
							}
							local164++;
						}
						if (local184 == 8 && (this.anInt893 == 0 || this.anInt893 == 1 && this.method660(this.aBoolean252, local198))) {
							if (local193 > 0 && local193 < 110) {
								local162.method229(local198 + " " + this.aStringArray9[local172], 4, 8270336, 619, local193);
							}
							local164++;
						}
					}
				}
				Class1_Sub1_Sub3.method510();
				this.anInt1050 = local164 * 14 + 7;
				if (this.anInt1050 < 78) {
					this.anInt1050 = 78;
				}
				this.method663(0, this.anInt1050, this.anInt1050 - this.anInt1027 - 77, 463, 77);
				@Pc(644) String local644;
				if (aClass1_Sub1_Sub1_Sub1_Sub2_1 == null || aClass1_Sub1_Sub1_Sub1_Sub2_1.aString5 == null) {
					local644 = Class49.method567(this.aString28);
				} else {
					local644 = aClass1_Sub1_Sub1_Sub1_Sub2_1.aString5;
				}
				local162.method229(local644 + ":", 4, 0, 619, 90);
				local162.method229(this.aString26 + "*", local162.method227(local644 + ": ") + 6, 255, 619, 90);
				Class1_Sub1_Sub3.method517(479, 77, 0, 0);
			} else {
				this.method630(0, 0, 0, Class32.aClass32Array1[this.anInt982]);
			}
			if (this.aBoolean259 && this.anInt915 == 2) {
				this.method587();
			}
			this.aClass12_27.method183(357, 17, super.aGraphics2);
			this.aClass12_26.method182(this.anInt1054);
			Class1_Sub1_Sub3_Sub4.anIntArray181 = this.anIntArray246;
		} catch (@Pc(736) RuntimeException local736) {
			signlink.reporterror("93031, " + 1 + ", " + local736.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIZIII)Z")
	private boolean method691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray25[local7][local11] = 0;
					this.anIntArrayArray24[local7][local11] = 99999999;
				}
			}
			local11 = arg2;
			@Pc(39) int local39 = arg10;
			this.anIntArrayArray25[arg2][arg10] = 99;
			this.anIntArrayArray24[arg2][arg10] = 0;
			@Pc(55) byte local55 = 0;
			@Pc(57) int local57 = 0;
			this.anIntArray263[0] = arg2;
			if (arg11 < 4 || arg11 > 4) {
				throw new NullPointerException();
			}
			@Pc(76) int local76 = local55 + 1;
			this.anIntArray264[0] = arg10;
			@Pc(80) boolean local80 = false;
			@Pc(84) int local84 = this.anIntArray263.length;
			@Pc(91) int[][] local91 = this.aClass18Array1[this.anInt961].anIntArrayArray4;
			@Pc(202) int local202;
			while (local57 != local76) {
				local11 = this.anIntArray263[local57];
				local39 = this.anIntArray264[local57];
				local57 = (local57 + 1) % local84;
				if (local11 == arg0 && local39 == arg5) {
					local80 = true;
					break;
				}
				if (arg4 != 0) {
					if ((arg4 < 5 || arg4 == 10) && this.aClass18Array1[this.anInt961].method265(arg4 - 1, local11, arg3, arg5, arg0, local39)) {
						local80 = true;
						break;
					}
					if (arg4 < 10 && this.aClass18Array1[this.anInt961].method266(local11, arg0, arg3, local39, arg4 - 1, arg5)) {
						local80 = true;
						break;
					}
				}
				if (arg7 != 0 && arg1 != 0 && this.aClass18Array1[this.anInt961].method267(arg5, arg1, arg9, arg7, local39, local11, arg0)) {
					local80 = true;
					break;
				}
				local202 = this.anIntArrayArray24[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray25[local11 - 1][local39] == 0 && (local91[local11 - 1][local39] & 0x1280108) == 0) {
					this.anIntArray263[local76] = local11 - 1;
					this.anIntArray264[local76] = local39;
					local76 = (local76 + 1) % local84;
					this.anIntArrayArray25[local11 - 1][local39] = 2;
					this.anIntArrayArray24[local11 - 1][local39] = local202;
				}
				if (local11 < 103 && this.anIntArrayArray25[local11 + 1][local39] == 0 && (local91[local11 + 1][local39] & 0x1280180) == 0) {
					this.anIntArray263[local76] = local11 + 1;
					this.anIntArray264[local76] = local39;
					local76 = (local76 + 1) % local84;
					this.anIntArrayArray25[local11 + 1][local39] = 8;
					this.anIntArrayArray24[local11 + 1][local39] = local202;
				}
				if (local39 > 0 && this.anIntArrayArray25[local11][local39 - 1] == 0 && (local91[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray263[local76] = local11;
					this.anIntArray264[local76] = local39 - 1;
					local76 = (local76 + 1) % local84;
					this.anIntArrayArray25[local11][local39 - 1] = 1;
					this.anIntArrayArray24[local11][local39 - 1] = local202;
				}
				if (local39 < 103 && this.anIntArrayArray25[local11][local39 + 1] == 0 && (local91[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray263[local76] = local11;
					this.anIntArray264[local76] = local39 + 1;
					local76 = (local76 + 1) % local84;
					this.anIntArrayArray25[local11][local39 + 1] = 4;
					this.anIntArrayArray24[local11][local39 + 1] = local202;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray25[local11 - 1][local39 - 1] == 0 && (local91[local11 - 1][local39 - 1] & 0x128010E) == 0 && (local91[local11 - 1][local39] & 0x1280108) == 0 && (local91[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray263[local76] = local11 - 1;
					this.anIntArray264[local76] = local39 - 1;
					local76 = (local76 + 1) % local84;
					this.anIntArrayArray25[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray24[local11 - 1][local39 - 1] = local202;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray25[local11 + 1][local39 - 1] == 0 && (local91[local11 + 1][local39 - 1] & 0x1280183) == 0 && (local91[local11 + 1][local39] & 0x1280180) == 0 && (local91[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray263[local76] = local11 + 1;
					this.anIntArray264[local76] = local39 - 1;
					local76 = (local76 + 1) % local84;
					this.anIntArrayArray25[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray24[local11 + 1][local39 - 1] = local202;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray25[local11 - 1][local39 + 1] == 0 && (local91[local11 - 1][local39 + 1] & 0x1280138) == 0 && (local91[local11 - 1][local39] & 0x1280108) == 0 && (local91[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray263[local76] = local11 - 1;
					this.anIntArray264[local76] = local39 + 1;
					local76 = (local76 + 1) % local84;
					this.anIntArrayArray25[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray24[local11 - 1][local39 + 1] = local202;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray25[local11 + 1][local39 + 1] == 0 && (local91[local11 + 1][local39 + 1] & 0x12801E0) == 0 && (local91[local11 + 1][local39] & 0x1280180) == 0 && (local91[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray263[local76] = local11 + 1;
					this.anIntArray264[local76] = local39 + 1;
					local76 = (local76 + 1) % local84;
					this.anIntArrayArray25[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray24[local11 + 1][local39 + 1] = local202;
				}
			}
			this.anInt1021 = 0;
			@Pc(818) int local818;
			@Pc(824) int local824;
			@Pc(830) int local830;
			if (!local80) {
				if (arg8) {
					local202 = 100;
					for (local818 = 1; local818 < 2; local818++) {
						for (local824 = arg0 - local818; local824 <= arg0 + local818; local824++) {
							for (local830 = arg5 - local818; local830 <= arg5 + local818; local830++) {
								if (local824 >= 0 && local830 >= 0 && local824 < 104 && local830 < 104 && this.anIntArrayArray24[local824][local830] < local202) {
									local202 = this.anIntArrayArray24[local824][local830];
									local11 = local824;
									local39 = local830;
									this.anInt1021 = 1;
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
			@Pc(891) byte local891 = 0;
			this.anIntArray263[0] = local11;
			local57 = local891 + 1;
			this.anIntArray264[0] = local39;
			local202 = local818 = this.anIntArrayArray25[local11][local39];
			while (local11 != arg2 || local39 != arg10) {
				if (local202 != local818) {
					local818 = local202;
					this.anIntArray263[local57] = local11;
					this.anIntArray264[local57++] = local39;
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
				local202 = this.anIntArrayArray25[local11][local39];
			}
			if (local57 > 0) {
				local84 = local57;
				if (local57 > 25) {
					local84 = 25;
				}
				local57--;
				local824 = this.anIntArray263[local57];
				local830 = this.anIntArray264[local57];
				if (arg6 == 0) {
					this.aClass1_Sub1_Sub2_8.method48(48);
					this.aClass1_Sub1_Sub2_8.method49(local84 + local84 + 3);
				}
				if (arg6 == 1) {
					this.aClass1_Sub1_Sub2_8.method48(72);
					this.aClass1_Sub1_Sub2_8.method49(local84 + local84 + 3 + 14);
				}
				if (arg6 == 2) {
					this.aClass1_Sub1_Sub2_8.method48(213);
					this.aClass1_Sub1_Sub2_8.method49(local84 + local84 + 3);
				}
				this.anInt888 = this.anIntArray263[0];
				this.anInt889 = this.anIntArray264[0];
				for (@Pc(1049) int local1049 = 1; local1049 < local84; local1049++) {
					local57--;
					this.aClass1_Sub1_Sub2_8.method49(this.anIntArray263[local57] - local824);
					this.aClass1_Sub1_Sub2_8.method77(215, this.anIntArray264[local57] - local830);
				}
				this.aClass1_Sub1_Sub2_8.method49(super.anIntArray210[5] == 1 ? 1 : 0);
				this.aClass1_Sub1_Sub2_8.method83(local824 + this.anInt1037);
				this.aClass1_Sub1_Sub2_8.method85(local830 + this.anInt1038, 599);
				return true;
			} else if (arg6 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1113) RuntimeException local1113) {
			signlink.reporterror("83045, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local1113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method692() {
		try {
			if (this.anInt1052 > 1) {
				this.anInt1052--;
			}
			if (this.anInt924 > 0) {
				this.anInt924--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method654(); local22++) {
			}
			if (this.aBoolean264) {
				@Pc(41) Object local41 = this.aClass14_1.anObject1;
				@Pc(66) int local66;
				@Pc(68) int local68;
				@Pc(70) int local70;
				@Pc(103) int local103;
				synchronized (this.aClass14_1.anObject1) {
					if (!aBoolean260) {
						this.aClass14_1.anInt235 = 0;
					} else if (super.anInt857 != 0 || this.aClass14_1.anInt235 >= 40) {
						this.aClass1_Sub1_Sub2_8.method48(78);
						this.aClass1_Sub1_Sub2_8.method49(0);
						local66 = this.aClass1_Sub1_Sub2_8.anInt153;
						local68 = 0;
						@Pc(86) int local86;
						for (local70 = 0; local70 < this.aClass14_1.anInt235 && local66 - this.aClass1_Sub1_Sub2_8.anInt153 < 240; local70++) {
							local68++;
							local86 = this.aClass14_1.anIntArray37[local70];
							if (local86 < 0) {
								local86 = 0;
							} else if (local86 > 502) {
								local86 = 502;
							}
							local103 = this.aClass14_1.anIntArray38[local70];
							if (local103 < 0) {
								local103 = 0;
							} else if (local103 > 764) {
								local103 = 764;
							}
							@Pc(120) int local120 = local86 * 765 + local103;
							if (this.aClass14_1.anIntArray37[local70] == -1 && this.aClass14_1.anIntArray38[local70] == -1) {
								local103 = -1;
								local86 = -1;
								local120 = 524287;
							}
							if (local103 != this.anInt997 || local86 != this.anInt998) {
								@Pc(165) int local165 = local103 - this.anInt997;
								this.anInt997 = local103;
								@Pc(173) int local173 = local86 - this.anInt998;
								this.anInt998 = local86;
								if (this.anInt912 < 8 && local165 >= -32 && local165 <= 31 && local173 >= -32 && local173 <= 31) {
									local165 += 32;
									local173 += 32;
									this.aClass1_Sub1_Sub2_8.method50((this.anInt912 << 12) + (local165 << 6) + local173);
									this.anInt912 = 0;
								} else if (this.anInt912 < 8) {
									this.aClass1_Sub1_Sub2_8.method52((this.anInt912 << 19) + local120 + 8388608);
									this.anInt912 = 0;
								} else {
									this.aClass1_Sub1_Sub2_8.method53((this.anInt912 << 19) + local120 - 1073741824);
									this.anInt912 = 0;
								}
							} else if (this.anInt912 < 2047) {
								this.anInt912++;
							}
						}
						this.aClass1_Sub1_Sub2_8.method58(this.aClass1_Sub1_Sub2_8.anInt153 - local66);
						if (local68 >= this.aClass14_1.anInt235) {
							this.aClass14_1.anInt235 = 0;
						} else {
							this.aClass14_1.anInt235 -= local68;
							for (local86 = 0; local86 < this.aClass14_1.anInt235; local86++) {
								this.aClass14_1.anIntArray38[local86] = this.aClass14_1.anIntArray38[local86 + local68];
								this.aClass14_1.anIntArray37[local86] = this.aClass14_1.anIntArray37[local86 + local68];
							}
						}
					}
				}
				if (super.anInt857 != 0) {
					@Pc(335) long local335 = (super.aLong28 - this.aLong31) / 50L;
					if (local335 > 4095L) {
						local335 = 4095L;
					}
					this.aLong31 = super.aLong28;
					local66 = super.anInt859;
					if (local66 < 0) {
						local66 = 0;
					} else if (local66 > 502) {
						local66 = 502;
					}
					local68 = super.anInt858;
					if (local68 < 0) {
						local68 = 0;
					} else if (local68 > 764) {
						local68 = 764;
					}
					local70 = local66 * 765 + local68;
					@Pc(381) byte local381 = 0;
					if (super.anInt857 == 2) {
						local381 = 1;
					}
					local103 = (int) local335;
					this.aClass1_Sub1_Sub2_8.method48(97);
					this.aClass1_Sub1_Sub2_8.method92((local103 << 20) + (local381 << 19) + local70);
				}
				if (this.anInt899 > 0) {
					this.anInt899--;
				}
				if (super.anIntArray210[1] == 1 || super.anIntArray210[2] == 1 || super.anIntArray210[3] == 1 || super.anIntArray210[4] == 1) {
					this.aBoolean226 = true;
				}
				if (this.aBoolean226 && this.anInt899 <= 0) {
					this.anInt899 = 20;
					this.aBoolean226 = false;
					this.aClass1_Sub1_Sub2_8.method48(13);
					this.aClass1_Sub1_Sub2_8.method83(this.anInt984);
					this.aClass1_Sub1_Sub2_8.method50(this.anInt983);
				}
				if (super.aBoolean222 && !this.aBoolean233) {
					this.aBoolean233 = true;
					this.aClass1_Sub1_Sub2_8.method48(96);
					this.aClass1_Sub1_Sub2_8.method49(1);
				}
				if (!super.aBoolean222 && this.aBoolean233) {
					this.aBoolean233 = false;
					this.aClass1_Sub1_Sub2_8.method48(96);
					this.aClass1_Sub1_Sub2_8.method49(0);
				}
				this.method613();
				this.method623();
				this.method648();
				this.anInt922++;
				if (this.anInt922 > 750) {
					this.method594();
				}
				this.method620(364);
				this.method669();
				this.method646();
				anInt877++;
				@Pc(565) int local565;
				if (anInt877 > 1741) {
					anInt877 = 0;
					this.aClass1_Sub1_Sub2_8.method48(114);
					this.aClass1_Sub1_Sub2_8.method49(0);
					local565 = this.aClass1_Sub1_Sub2_8.anInt153;
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub2_8.method49(35);
					}
					this.aClass1_Sub1_Sub2_8.method49((int) (Math.random() * 256.0D));
					this.aClass1_Sub1_Sub2_8.method50(35712);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub2_8.method49(61);
					}
					this.aClass1_Sub1_Sub2_8.method50(49891);
					this.aClass1_Sub1_Sub2_8.method50(38132);
					this.aClass1_Sub1_Sub2_8.method49(66);
					this.aClass1_Sub1_Sub2_8.method50(64387);
					this.aClass1_Sub1_Sub2_8.method49(66);
					this.aClass1_Sub1_Sub2_8.method50(1665);
					this.aClass1_Sub1_Sub2_8.method58(this.aClass1_Sub1_Sub2_8.anInt153 - local565);
				}
				this.anInt1003++;
				if (this.anInt965 != 0) {
					this.anInt964 += 20;
					if (this.anInt964 >= 400) {
						this.anInt965 = 0;
					}
				}
				if (this.anInt1061 != 0) {
					this.anInt1058++;
					if (this.anInt1058 >= 15) {
						if (this.anInt1061 == 2) {
							this.aBoolean223 = true;
						}
						if (this.anInt1061 == 3) {
							this.aBoolean232 = true;
						}
						this.anInt1061 = 0;
					}
				}
				if (this.anInt885 != 0) {
					this.anInt878++;
					if (super.anInt852 > this.anInt886 + 5 || super.anInt852 < this.anInt886 - 5 || super.anInt853 > this.anInt887 + 5 || super.anInt853 < this.anInt887 - 5) {
						this.aBoolean258 = true;
					}
					if (super.anInt851 == 0) {
						if (this.anInt885 == 2) {
							this.aBoolean223 = true;
						}
						if (this.anInt885 == 3) {
							this.aBoolean232 = true;
						}
						this.anInt885 = 0;
						if (this.aBoolean258 && this.anInt878 >= 5) {
							this.anInt1042 = -1;
							this.method637();
							if (this.anInt1042 == this.anInt883 && this.anInt1041 != this.anInt884) {
								@Pc(767) Class32 local767 = Class32.aClass32Array1[this.anInt883];
								@Pc(769) byte local769 = 0;
								if (this.anInt875 == 1 && local767.anInt607 == 206) {
									local769 = 1;
								}
								if (local767.anIntArray142[this.anInt1041] <= 0) {
									local769 = 0;
								}
								if (local767.aBoolean152) {
									local66 = this.anInt884;
									local68 = this.anInt1041;
									local767.anIntArray142[local68] = local767.anIntArray142[local66];
									local767.anIntArray145[local68] = local767.anIntArray145[local66];
									local767.anIntArray142[local66] = -1;
									local767.anIntArray145[local66] = 0;
								} else if (local769 == 1) {
									local66 = this.anInt884;
									local68 = this.anInt1041;
									while (local66 != local68) {
										if (local66 > local68) {
											local767.method412(980, local66, local66 - 1);
											local66--;
										} else if (local66 < local68) {
											local767.method412(980, local66, local66 + 1);
											local66++;
										}
									}
								} else {
									local767.method412(980, this.anInt884, this.anInt1041);
								}
								this.aClass1_Sub1_Sub2_8.method48(175);
								this.aClass1_Sub1_Sub2_8.method84(this.anInt1041);
								this.aClass1_Sub1_Sub2_8.method83(this.anInt883);
								this.aClass1_Sub1_Sub2_8.method77(215, local769);
								this.aClass1_Sub1_Sub2_8.method84(this.anInt884);
							}
						} else if ((this.anInt969 == 1 || this.method658(this.anInt949 - 1)) && this.anInt949 > 2) {
							this.method664();
						} else if (this.anInt949 > 0) {
							this.method586(this.anInt949 - 1);
						}
						this.anInt1058 = 10;
						super.anInt857 = 0;
					}
				}
				@Pc(944) int local944;
				if (Class40.anInt713 != -1) {
					local565 = Class40.anInt713;
					local944 = Class40.anInt714;
					@Pc(966) boolean local966 = this.method691(local565, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray48[0], 0, 0, local944, 0, 0, true, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray49[0], this.anInt892);
					Class40.anInt713 = -1;
					if (local966) {
						this.anInt962 = super.anInt858;
						this.anInt963 = super.anInt859;
						this.anInt965 = 1;
						this.anInt964 = 0;
					}
				}
				if (super.anInt857 == 1 && this.aString20 != null) {
					this.aString20 = null;
					this.aBoolean232 = true;
					super.anInt857 = 0;
				}
				this.method695();
				this.method662();
				this.method607((byte) 2);
				this.method616(682);
				if (super.anInt851 == 1 || super.anInt857 == 1) {
					this.anInt1070++;
				}
				if (this.anInt966 == 2) {
					this.method604();
				}
				if (this.anInt966 == 2 && this.aBoolean238) {
					this.method625();
				}
				for (local565 = 0; local565 < 5; local565++) {
					@Pc(1052) int local1052 = this.anIntArray219[local565]++;
				}
				this.method588(this.aBoolean227);
				super.anInt850++;
				if (super.anInt850 > 4500) {
					this.anInt924 = 250;
					super.anInt850 -= 500;
					this.aClass1_Sub1_Sub2_8.method48(40);
				}
				this.anInt992++;
				if (this.anInt992 > 500) {
					this.anInt992 = 0;
					local944 = (int) (Math.random() * 8.0D);
					if ((local944 & 0x1) == 1) {
						this.anInt1072 += this.anInt1073;
					}
					if ((local944 & 0x2) == 2) {
						this.anInt1076 += this.anInt1077;
					}
					if ((local944 & 0x4) == 4) {
						this.anInt1033 += this.anInt1034;
					}
				}
				if (this.anInt1072 < -50) {
					this.anInt1073 = 2;
				}
				if (this.anInt1072 > 50) {
					this.anInt1073 = -2;
				}
				if (this.anInt1076 < -55) {
					this.anInt1077 = 2;
				}
				if (this.anInt1076 > 55) {
					this.anInt1077 = -2;
				}
				if (this.anInt1033 < -40) {
					this.anInt1034 = 1;
				}
				if (this.anInt1033 > 40) {
					this.anInt1034 = -1;
				}
				this.anInt914++;
				if (this.anInt914 > 500) {
					this.anInt914 = 0;
					local944 = (int) (Math.random() * 8.0D);
					if ((local944 & 0x1) == 1) {
						this.anInt973 += this.anInt974;
					}
					if ((local944 & 0x2) == 2) {
						this.anInt954 += this.anInt955;
					}
				}
				if (this.anInt973 < -60) {
					this.anInt974 = 2;
				}
				if (this.anInt973 > 60) {
					this.anInt974 = -2;
				}
				if (this.anInt954 < -20) {
					this.anInt955 = 1;
				}
				if (this.anInt954 > 10) {
					this.anInt955 = -1;
				}
				this.anInt923++;
				if (this.anInt923 > 50) {
					this.aClass1_Sub1_Sub2_8.method48(241);
				}
				try {
					if (this.aClass36_1 != null && this.aClass1_Sub1_Sub2_8.anInt153 > 0) {
						this.aClass36_1.method429(this.aClass1_Sub1_Sub2_8.aByteArray1, this.aClass1_Sub1_Sub2_8.anInt153, this.anInt906);
						this.aClass1_Sub1_Sub2_8.anInt153 = 0;
						this.anInt923 = 0;
					}
				} catch (@Pc(1299) IOException local1299) {
					this.method594();
				} catch (@Pc(1304) Exception local1304) {
					this.method656();
				}
			}
		} catch (@Pc(1309) RuntimeException local1309) {
			signlink.reporterror("91076, " + 0 + ", " + local1309.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!OPFNUBIN;I)I")
	private int method693(@OriginalArg(0) int arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(5) boolean local5 = false;
			if (arg1.anIntArrayArray14 == null || arg0 >= arg1.anIntArrayArray14.length) {
				return -2;
			}
			try {
				@Pc(20) int[] local20 = arg1.anIntArrayArray14[arg0];
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
						local33 = this.anIntArray224[local20[local24++]];
					}
					if (local31 == 2) {
						local33 = this.anIntArray230[local20[local24++]];
					}
					if (local31 == 3) {
						local33 = this.anIntArray270[local20[local24++]];
					}
					@Pc(82) Class32 local82;
					@Pc(87) int local87;
					@Pc(100) int local100;
					if (local31 == 4) {
						local82 = Class32.aClass32Array1[local20[local24++]];
						local87 = local20[local24++];
						if (local87 >= 0 && local87 < Class23.anInt440 && (!Class23.method286(local87).aBoolean101 || aBoolean246)) {
							for (local100 = 0; local100 < local82.anIntArray142.length; local100++) {
								if (local82.anIntArray142[local100] == local87 + 1) {
									local33 += local82.anIntArray145[local100];
								}
							}
						}
					}
					if (local31 == 5) {
						local33 = this.anIntArray243[local20[local24++]];
					}
					if (local31 == 6) {
						local33 = anIntArray215[this.anIntArray230[local20[local24++]] - 1];
					}
					if (local31 == 7) {
						local33 = this.anIntArray243[local20[local24++]] * 100 / 46875;
					}
					if (local31 == 8) {
						local33 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt342;
					}
					@Pc(175) int local175;
					if (local31 == 9) {
						for (local175 = 0; local175 < Class25.anInt479; local175++) {
							if (Class25.aBooleanArray7[local175]) {
								local33 += this.anIntArray230[local175];
							}
						}
					}
					if (local31 == 10) {
						local82 = Class32.aClass32Array1[local20[local24++]];
						local87 = local20[local24++] + 1;
						if (local87 >= 0 && local87 < Class23.anInt440 && (!Class23.method286(local87).aBoolean101 || aBoolean246)) {
							for (local100 = 0; local100 < local82.anIntArray142.length; local100++) {
								if (local82.anIntArray142[local100] == local87) {
									local33 = 999999999;
									break;
								}
							}
						}
					}
					if (local31 == 11) {
						local33 = this.anInt1068;
					}
					if (local31 == 12) {
						local33 = this.anInt967;
					}
					if (local31 == 13) {
						local175 = this.anIntArray243[local20[local24++]];
						local87 = local20[local24++];
						local33 = (local175 & 0x1 << local87) == 0 ? 0 : 1;
					}
					if (local31 == 14) {
						local175 = local20[local24++];
						@Pc(290) Class8 local290 = Class8.aClass8Array1[local175];
						local100 = local290.anInt203;
						@Pc(296) int local296 = local290.anInt204;
						@Pc(299) int local299 = local290.anInt205;
						@Pc(305) int local305 = anIntArray269[local299 - local296];
						local33 = this.anIntArray243[local100] >> local296 & local305;
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
						local33 = (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt319 >> 7) + this.anInt1037;
					}
					if (local31 == 19) {
						local33 = (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt320 >> 7) + this.anInt1038;
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
			} catch (@Pc(398) Exception local398) {
				return -1;
			}
		} catch (@Pc(401) RuntimeException local401) {
			signlink.reporterror("29927, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local401.toString());
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
				return new URL("http://127.0.0.1:" + (anInt971 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IIII)Z")
	private boolean method694(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = arg2 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass40_1.method486(this.anInt961, arg1, arg0, arg2);
			if (local16 == -1) {
				return false;
			}
			@Pc(25) int local25 = local16 & 0x1F;
			@Pc(31) int local31 = local16 >> 6 & 0x3;
			if (local25 == 10 || local25 == 11 || local25 == 22) {
				@Pc(43) Class38 local43 = Class38.method442(local7);
				@Pc(51) int local51;
				@Pc(54) int local54;
				if (local31 == 0 || local31 == 2) {
					local51 = local43.anInt664;
					local54 = local43.anInt647;
				} else {
					local51 = local43.anInt647;
					local54 = local43.anInt664;
				}
				@Pc(65) int local65 = local43.anInt660;
				if (local31 != 0) {
					local65 = (local65 << local31 & 0xF) + (local65 >> 4 - local31);
				}
				this.method691(arg1, local54, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray48[0], 0, 0, arg0, 2, local51, false, local65, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray49[0], this.anInt892);
			} else {
				this.method691(arg1, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray48[0], local31, local25 + 1, arg0, 2, 0, false, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray49[0], this.anInt892);
			}
			this.anInt962 = super.anInt858;
			this.anInt963 = super.anInt859;
			this.anInt965 = 2;
			this.anInt964 = 0;
			return true;
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("92283, " + 394 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(Z)V")
	private void method695() {
		try {
			if (this.anInt885 == 0) {
				@Pc(8) int local8 = super.anInt857;
				if (this.anInt942 == 1 && super.anInt858 >= 516 && super.anInt859 >= 160 && super.anInt858 <= 765 && super.anInt859 <= 205) {
					local8 = 0;
				}
				@Pc(48) int local48;
				@Pc(51) int local51;
				@Pc(127) int local127;
				if (this.aBoolean259) {
					if (local8 != 1) {
						local48 = super.anInt852;
						local51 = super.anInt853;
						if (this.anInt915 == 0) {
							local48 -= 4;
							local51 -= 4;
						}
						if (this.anInt915 == 1) {
							local48 -= 553;
							local51 -= 205;
						}
						if (this.anInt915 == 2) {
							local48 -= 17;
							local51 -= 357;
						}
						if (local48 < this.anInt916 - 10 || local48 > this.anInt916 + this.anInt918 + 10 || local51 < this.anInt917 - 10 || local51 > this.anInt917 + this.anInt919 + 10) {
							this.aBoolean259 = false;
							if (this.anInt915 == 1) {
								this.aBoolean223 = true;
							}
							if (this.anInt915 == 2) {
								this.aBoolean232 = true;
							}
						}
					}
					if (local8 == 1) {
						local48 = this.anInt916;
						local51 = this.anInt917;
						local127 = this.anInt918;
						@Pc(130) int local130 = super.anInt858;
						@Pc(133) int local133 = super.anInt859;
						if (this.anInt915 == 0) {
							local130 -= 4;
							local133 -= 4;
						}
						if (this.anInt915 == 1) {
							local130 -= 553;
							local133 -= 205;
						}
						if (this.anInt915 == 2) {
							local130 -= 17;
							local133 -= 357;
						}
						@Pc(152) int local152 = -1;
						for (@Pc(154) int local154 = 0; local154 < this.anInt949; local154++) {
							@Pc(169) int local169 = local51 + (this.anInt949 - 1 - local154) * 15 + 31;
							if (local130 > local48 && local130 < local48 + local127 && local133 > local169 - 13 && local133 < local169 + 3) {
								local152 = local154;
							}
						}
						if (local152 != -1) {
							this.method586(local152);
						}
						this.aBoolean259 = false;
						if (this.anInt915 == 1) {
							this.aBoolean223 = true;
						}
						if (this.anInt915 == 2) {
							this.aBoolean232 = true;
							return;
						}
					}
				} else {
					if (local8 == 1 && this.anInt949 > 0) {
						local48 = this.anIntArray250[this.anInt949 - 1];
						if (local48 == 607 || local48 == 48 || local48 == 615 || local48 == 500 || local48 == 534 || local48 == 766 || local48 == 406 || local48 == 263 || local48 == 471 || local48 == 694 || local48 == 34 || local48 == 1881) {
							local51 = this.anIntArray248[this.anInt949 - 1];
							local127 = this.anIntArray249[this.anInt949 - 1];
							@Pc(289) Class32 local289 = Class32.aClass32Array1[local127];
							if (local289.aBoolean153 || local289.aBoolean152) {
								this.aBoolean258 = false;
								this.anInt878 = 0;
								this.anInt883 = local127;
								this.anInt884 = local51;
								this.anInt885 = 2;
								this.anInt886 = super.anInt858;
								this.anInt887 = super.anInt859;
								if (Class32.aClass32Array1[local127].anInt592 == this.anInt1053) {
									this.anInt885 = 1;
								}
								if (Class32.aClass32Array1[local127].anInt592 == this.anInt1065) {
									this.anInt885 = 3;
								}
								return;
							}
						}
					}
					if (local8 == 1 && (this.anInt969 == 1 || this.method658(this.anInt949 - 1)) && this.anInt949 > 2) {
						local8 = 2;
					}
					if (local8 == 1 && this.anInt949 > 0) {
						this.method586(this.anInt949 - 1);
					}
					if (local8 != 2 || this.anInt949 <= 0) {
						return;
					}
					this.method664();
				}
			}
		} catch (@Pc(384) RuntimeException local384) {
			signlink.reporterror("67648, " + false + ", " + local384.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(IIII)I")
	private int method696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
			@Pc(77) int local77 = this.anIntArrayArrayArray8[local21][local3][local7] * (128 - local41) + this.anIntArrayArrayArray8[local21][local3 + 1][local7] * local41 >> 7;
			@Pc(109) int local109 = this.anIntArrayArrayArray8[local21][local3][local7 + 1] * (128 - local41) + this.anIntArrayArrayArray8[local21][local3 + 1][local7 + 1] * local41 >> 7;
			return local77 * (128 - local45) + local109 * local45 >> 7;
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("39275, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -235 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I[BI)Z")
	private boolean method697(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			return arg0 == null ? true : signlink.wavesave(arg0, arg1);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("76552, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method698() {
		try {
			@Pc(6) Class1_Sub1_Sub1_Sub2 local6 = (Class1_Sub1_Sub1_Sub2) this.aClass7_10.method100();
			if (this.anInt907 != 0) {
				for (@Pc(12) int local12 = 1; local12 > 0; local12++) {
				}
			}
			while (local6 != null) {
				if (local6.anInt130 != this.anInt961 || local6.aBoolean25) {
					local6.method507();
				} else if (anInt903 >= local6.anInt136) {
					local6.method39(this.anInt1003);
					if (local6.aBoolean25) {
						local6.method507();
					} else {
						this.aClass40_1.method467(local6, 0, false, local6.anInt131, local6.anInt130, 60, local6.anInt132, -1, local6.anInt133);
					}
				}
				local6 = (Class1_Sub1_Sub1_Sub2) this.aClass7_10.method102();
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("8040, " + 0 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(JI)V")
	private void method699(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt1000 >= 100 && this.anInt934 != 1) {
					this.method624("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0);
				} else if (this.anInt1000 >= 200) {
					this.method624("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0);
				} else {
					@Pc(38) String local38 = Class49.method567(Class49.method564(arg0));
					for (@Pc(40) int local40 = 0; local40 < this.anInt1000; local40++) {
						if (this.aLongArray4[local40] == arg0) {
							this.method624(local38 + " is already on your friend list", "", 0);
							return;
						}
					}
					for (@Pc(70) int local70 = 0; local70 < this.anInt1004; local70++) {
						if (this.aLongArray3[local70] == arg0) {
							this.method624("Please remove " + local38 + " from your ignore list first", "", 0);
							return;
						}
					}
					if (!local38.equals(aClass1_Sub1_Sub1_Sub1_Sub2_1.aString5)) {
						this.aStringArray10[this.anInt1000] = local38;
						this.aLongArray4[this.anInt1000] = arg0;
						this.anIntArray225[this.anInt1000] = 0;
						this.anInt1000++;
						this.aBoolean223 = true;
						this.aClass1_Sub1_Sub2_8.method48(118);
						this.aClass1_Sub1_Sub2_8.method55((byte) 9, arg0);
					}
				}
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("95565, " + arg0 + ", " + 858 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
	private void method701(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) int local4 = Class33.aClass33Array1[arg0].anInt626;
			if (local4 != 0) {
				@Pc(17) int local17 = this.anIntArray243[arg0];
				if (local4 == 1) {
					if (local17 == 1) {
						Class1_Sub1_Sub3_Sub4.method530(0.9D, (byte) 1);
					}
					if (local17 == 2) {
						Class1_Sub1_Sub3_Sub4.method530(0.8D, (byte) 1);
					}
					if (local17 == 3) {
						Class1_Sub1_Sub3_Sub4.method530(0.7D, (byte) 1);
					}
					if (local17 == 4) {
						Class1_Sub1_Sub3_Sub4.method530(0.6D, (byte) 1);
					}
					Class23.aClass29_4.method336();
					this.aBoolean231 = true;
				}
				if (local4 == 3) {
					@Pc(55) boolean local55 = this.aBoolean250;
					if (local17 == 0) {
						this.method590(this.aBoolean250, 0);
						this.aBoolean250 = true;
					}
					if (local17 == 1) {
						this.method590(this.aBoolean250, -400);
						this.aBoolean250 = true;
					}
					if (local17 == 2) {
						this.method590(this.aBoolean250, -800);
						this.aBoolean250 = true;
					}
					if (local17 == 3) {
						this.method590(this.aBoolean250, -1200);
						this.aBoolean250 = true;
					}
					if (local17 == 4) {
						this.aBoolean250 = false;
					}
					if (this.aBoolean250 != local55 && !aBoolean247) {
						if (this.aBoolean250) {
							this.anInt958 = this.anInt880;
							this.aBoolean243 = true;
							this.aClass20_Sub1_1.method394(2, this.anInt958);
						} else {
							this.method584();
						}
						this.anInt1014 = 0;
					}
				}
				if (local4 == 4) {
					if (local17 == 0) {
						this.aBoolean245 = true;
						this.method706(0);
					}
					if (local17 == 1) {
						this.aBoolean245 = true;
						this.method706(-400);
					}
					if (local17 == 2) {
						this.aBoolean245 = true;
						this.method706(-800);
					}
					if (local17 == 3) {
						this.aBoolean245 = true;
						this.method706(-1200);
					}
					if (local17 == 4) {
						this.aBoolean245 = false;
					}
				}
				if (local4 == 5) {
					this.anInt969 = local17;
				}
				if (local4 == 6) {
					this.anInt959 = local17;
				}
				if (local4 == 8) {
					this.anInt980 = local17;
					this.aBoolean232 = true;
				}
				if (local4 == 9) {
					this.anInt875 = local17;
				}
			}
		} catch (@Pc(215) RuntimeException local215) {
			signlink.reporterror("46430, " + arg0 + ", " + 0 + ", " + local215.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method702() {
		try {
			Class38.aClass29_9.method336();
			Class38.aClass29_8.method336();
			Class31.aClass29_5.method336();
			Class23.aClass29_3.method336();
			Class23.aClass29_4.method336();
			Class1_Sub1_Sub1_Sub1_Sub2.aClass29_2.method336();
			Class4.aClass29_1.method336();
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("60655, " + 56 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!OPFNUBIN;I)Z")
	private boolean method703(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			if (arg0.anIntArray140 == null) {
				return false;
			}
			for (@Pc(10) int local10 = 0; local10 < arg0.anIntArray140.length; local10++) {
				@Pc(18) int local18 = this.method693(local10, arg0, 353);
				@Pc(23) int local23 = arg0.anIntArray146[local10];
				if (arg0.anIntArray140[local10] == 2) {
					if (local18 >= local23) {
						return false;
					}
				} else if (arg0.anIntArray140[local10] == 3) {
					if (local18 <= local23) {
						return false;
					}
				} else if (arg0.anIntArray140[local10] == 4) {
					if (local18 == local23) {
						return false;
					}
				} else if (local18 != local23) {
					return false;
				}
			}
			return true;
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("58427, " + arg0 + ", " + arg1 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private void method704() {
		try {
			@Pc(8) int local8;
			if (this.anInt929 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt929 > 768) {
						this.anIntArray265[local8] = this.method686(this.anIntArray267[local8], 1024 - this.anInt929, this.anInt1079, this.anIntArray266[local8]);
					} else if (this.anInt929 > 256) {
						this.anIntArray265[local8] = this.anIntArray267[local8];
					} else {
						this.anIntArray265[local8] = this.method686(this.anIntArray266[local8], 256 - this.anInt929, this.anInt1079, this.anIntArray267[local8]);
					}
				}
			} else if (this.anInt930 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt930 > 768) {
						this.anIntArray265[local8] = this.method686(this.anIntArray268[local8], 1024 - this.anInt930, this.anInt1079, this.anIntArray266[local8]);
					} else if (this.anInt930 > 256) {
						this.anIntArray265[local8] = this.anIntArray268[local8];
					} else {
						this.anIntArray265[local8] = this.method686(this.anIntArray266[local8], 256 - this.anInt930, this.anInt1079, this.anIntArray268[local8]);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray265[local8] = this.anIntArray266[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass12_6.anIntArray36[local8] = this.aClass1_Sub1_Sub3_Sub1_7.anIntArray22[local8];
			}
			@Pc(183) int local183 = 0;
			@Pc(185) int local185 = 1152;
			@Pc(200) int local200;
			@Pc(204) int local204;
			@Pc(214) int local214;
			@Pc(222) int local222;
			@Pc(226) int local226;
			@Pc(230) int local230;
			@Pc(241) int local241;
			for (@Pc(187) int local187 = 1; local187 < 255; local187++) {
				local200 = this.anIntArray247[local187] * (256 - local187) / 256;
				local204 = local200 + 22;
				if (local204 < 0) {
					local204 = 0;
				}
				local183 += local204;
				for (local214 = local204; local214 < 128; local214++) {
					local222 = this.anIntArray260[local183++];
					if (local222 == 0) {
						local185++;
					} else {
						local226 = local222;
						local230 = 256 - local222;
						local222 = this.anIntArray265[local222];
						local241 = this.aClass12_6.anIntArray36[local185];
						this.aClass12_6.anIntArray36[local185++] = ((local222 & 0xFF00FF) * local226 + (local241 & 0xFF00FF) * local230 & 0xFF00FF00) + ((local222 & 0xFF00) * local226 + (local241 & 0xFF00) * local230 & 0xFF0000) >> 8;
					}
				}
				local185 += local204;
			}
			this.aClass12_6.method183(0, 0, super.aGraphics2);
			for (local200 = 0; local200 < 33920; local200++) {
				this.aClass12_7.anIntArray36[local200] = this.aClass1_Sub1_Sub3_Sub1_8.anIntArray22[local200];
			}
			local183 = 0;
			local185 = 1176;
			for (local204 = 1; local204 < 255; local204++) {
				local214 = this.anIntArray247[local204] * (256 - local204) / 256;
				local222 = 103 - local214;
				local185 += local214;
				for (local226 = 0; local226 < local222; local226++) {
					local230 = this.anIntArray260[local183++];
					if (local230 == 0) {
						local185++;
					} else {
						local241 = local230;
						@Pc(364) int local364 = 256 - local230;
						local230 = this.anIntArray265[local230];
						@Pc(375) int local375 = this.aClass12_7.anIntArray36[local185];
						this.aClass12_7.anIntArray36[local185++] = ((local230 & 0xFF00FF) * local241 + (local375 & 0xFF00FF) * local364 & 0xFF00FF00) + ((local230 & 0xFF00) * local241 + (local375 & 0xFF00) * local364 & 0xFF0000) >> 8;
					}
				}
				local183 += 128 - local222;
				local185 += 128 - local222 - local214;
			}
			this.aClass12_7.method183(0, 637, super.aGraphics2);
		} catch (@Pc(453) RuntimeException local453) {
			signlink.reporterror("53007, " + 7 + ", " + local453.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILjava/lang/String;)V")
	@Override
	protected void method581(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		try {
			this.anInt908 = arg0;
			this.aString24 = arg1;
			this.method617();
			if (this.aClass42_1 == null) {
				super.method581(arg0, arg1);
			} else {
				this.aClass12_5.method182(this.anInt1054);
				this.aClass1_Sub1_Sub3_Sub3_4.method225(54, "RuneScape is loading - please wait...", 16777215, 180);
				Class1_Sub1_Sub3.method515(34, 62, 28, 9179409, 304);
				Class1_Sub1_Sub3.method515(32, 63, 29, 0, 302);
				Class1_Sub1_Sub3.method514(30, 64, 9179409, arg0 * 3, 30);
				Class1_Sub1_Sub3.method514(arg0 * 3 + 30, 64, 0, 300 - arg0 * 3, 30);
				this.aClass1_Sub1_Sub3_Sub3_4.method225(85, arg1, 16777215, 180);
				this.aClass12_5.method183(171, 202, super.aGraphics2);
				if (this.aBoolean231) {
					this.aBoolean231 = false;
					if (!this.aBoolean240) {
						this.aClass12_6.method183(0, 0, super.aGraphics2);
						this.aClass12_7.method183(0, 637, super.aGraphics2);
					}
					this.aClass12_3.method183(0, 128, super.aGraphics2);
					this.aClass12_4.method183(371, 202, super.aGraphics2);
					this.aClass12_8.method183(265, 0, super.aGraphics2);
					this.aClass12_9.method183(265, 562, super.aGraphics2);
					this.aClass12_10.method183(171, 128, super.aGraphics2);
					this.aClass12_11.method183(171, 562, super.aGraphics2);
				}
			}
		} catch (@Pc(215) RuntimeException local215) {
			signlink.reporterror("91486, " + 9 + ", " + arg0 + ", " + arg1 + ", " + local215.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private void method705() {
		try {
			this.anInt1035++;
			this.method659(true);
			this.method612(true);
			this.method659(false);
			this.method612(false);
			this.method644(508);
			if (this.anInt1066 != -7889) {
				this.anInt921 = this.aClass1_Sub1_Sub2_7.method59();
			}
			this.method698();
			@Pc(44) int local44;
			@Pc(83) int local83;
			if (!this.aBoolean238) {
				local44 = this.anInt983;
				if (this.anInt968 / 256 > local44) {
					local44 = this.anInt968 / 256;
				}
				if (this.aBooleanArray12[4] && this.anIntArray231[4] + 128 > local44) {
					local44 = this.anIntArray231[4] + 128;
				}
				local83 = this.anInt984 + this.anInt1033 & 0x7FF;
				this.method642(this.anInt898, this.method696(aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt319, this.anInt961, aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt320) - 50, local44, local44 * 3 + 600, local83, this.anInt897);
				anInt881++;
				if (anInt881 > 158) {
					anInt881 = 0;
					this.aClass1_Sub1_Sub2_8.method48(23);
					this.aClass1_Sub1_Sub2_8.method52(2661924);
				}
			}
			if (this.aBoolean238) {
				local44 = this.method601();
			} else {
				local44 = this.method600();
			}
			local83 = this.anInt1028;
			@Pc(145) int local145 = this.anInt1029;
			@Pc(148) int local148 = this.anInt1030;
			@Pc(151) int local151 = this.anInt1031;
			@Pc(154) int local154 = this.anInt1032;
			@Pc(203) int local203;
			for (@Pc(156) int local156 = 0; local156 < 5; local156++) {
				if (this.aBooleanArray12[local156]) {
					local203 = (int) (Math.random() * (double) (this.anIntArray222[local156] * 2 + 1) - (double) this.anIntArray222[local156] + Math.sin((double) this.anIntArray219[local156] * ((double) this.anIntArray235[local156] / 100.0D)) * (double) this.anIntArray231[local156]);
					if (local156 == 0) {
						this.anInt1028 += local203;
					}
					if (local156 == 1) {
						this.anInt1029 += local203;
					}
					if (local156 == 2) {
						this.anInt1030 += local203;
					}
					if (local156 == 3) {
						this.anInt1032 = this.anInt1032 + local203 & 0x7FF;
					}
					if (local156 == 4) {
						this.anInt1031 += local203;
						if (this.anInt1031 < 128) {
							this.anInt1031 = 128;
						}
						if (this.anInt1031 > 383) {
							this.anInt1031 = 383;
						}
					}
				}
			}
			local203 = Class1_Sub1_Sub3_Sub4.anInt750;
			Class1_Sub1_Sub1_Sub4.aBoolean112 = true;
			Class1_Sub1_Sub1_Sub4.anInt506 = 0;
			Class1_Sub1_Sub1_Sub4.anInt504 = super.anInt852 - 4;
			Class1_Sub1_Sub1_Sub4.anInt505 = super.anInt853 - 4;
			Class1_Sub1_Sub3.method512();
			this.aClass40_1.method495(this.anInt1031, local44, this.anInt1029, this.anInt1030, this.anInt1032, this.anInt1028);
			this.aClass40_1.method470();
			this.method707();
			this.method684((byte) 5);
			this.method633(this.aBoolean237, local203);
			this.method635();
			this.aClass12_26.method183(4, 4, super.aGraphics2);
			this.anInt1028 = local83;
			this.anInt1029 = local145;
			this.anInt1030 = local148;
			this.anInt1031 = local151;
			this.anInt1032 = local154;
		} catch (@Pc(343) RuntimeException local343) {
			signlink.reporterror("5740, " + -7889 + ", " + local343.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(II)V")
	private void method706(@OriginalArg(0) int arg0) {
		try {
			signlink.anInt1090 = arg0;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("66503, " + arg0 + ", " + 12065 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
	private void method707() {
		try {
			this.anInt1055 = 0;
			@Pc(96) int local96;
			@Pc(76) int local76;
			for (@Pc(12) int local12 = -1; local12 < this.anInt871 + this.anInt988; local12++) {
				@Pc(19) Class1_Sub1_Sub1_Sub1 local19;
				if (local12 == -1) {
					local19 = aClass1_Sub1_Sub1_Sub1_Sub2_1;
				} else if (local12 < this.anInt871) {
					local19 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray213[local12]];
				} else {
					local19 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray236[local12 - this.anInt871]];
				}
				if (local19 != null && local19.method247()) {
					@Pc(60) Class31 local60;
					if (local19 instanceof Class1_Sub1_Sub1_Sub1_Sub1) {
						local60 = ((Class1_Sub1_Sub1_Sub1_Sub1) local19).aClass31_1;
						if (local60.anIntArray133 != null) {
							local60 = local60.method402();
						}
						if (local60 == null) {
							continue;
						}
					}
					if (local12 >= this.anInt871) {
						local60 = ((Class1_Sub1_Sub1_Sub1_Sub1) local19).aClass31_1;
						if (local60.anInt576 >= 0 && local60.anInt576 < this.aClass1_Sub1_Sub3_Sub1Array7.length) {
							this.method610(local19.anInt325 + 15, local19);
							if (this.anInt1019 > -1) {
								this.aClass1_Sub1_Sub3_Sub1Array7[local60.anInt576].method138(this.anInt1019 - 12, this.anInt1020 - 30);
							}
						}
						if (this.anInt1023 == 1 && this.anInt1012 == this.anIntArray236[local12 - this.anInt871] && anInt903 % 20 < 10) {
							this.method610(local19.anInt325 + 15, local19);
							if (this.anInt1019 > -1) {
								this.aClass1_Sub1_Sub3_Sub1Array7[2].method138(this.anInt1019 - 12, this.anInt1020 - 28);
							}
						}
					} else {
						local76 = 30;
						@Pc(79) Class1_Sub1_Sub1_Sub1_Sub2 local79 = (Class1_Sub1_Sub1_Sub1_Sub2) local19;
						if (local79.anInt353 != 0) {
							this.method610(local19.anInt325 + 15, local19);
							if (this.anInt1019 > -1) {
								for (local96 = 0; local96 < 8; local96++) {
									if ((local79.anInt353 & 0x1 << local96) != 0) {
										this.aClass1_Sub1_Sub3_Sub1Array7[local96].method138(this.anInt1019 - 12, this.anInt1020 - local76);
										local76 -= 25;
									}
								}
							}
						}
						if (local12 >= 0 && this.anInt1023 == 10 && this.anInt876 == this.anIntArray213[local12]) {
							this.method610(local19.anInt325 + 15, local19);
							if (this.anInt1019 > -1) {
								this.aClass1_Sub1_Sub3_Sub1Array7[7].method138(this.anInt1019 - 12, this.anInt1020 - local76);
							}
						}
					}
					if (local19.aString4 != null && (local12 >= this.anInt871 || this.anInt1026 == 0 || this.anInt1026 == 3 || this.anInt1026 == 1 && this.method660(this.aBoolean252, ((Class1_Sub1_Sub1_Sub1_Sub2) local19).aString5))) {
						this.method610(local19.anInt325, local19);
						if (this.anInt1019 > -1 && this.anInt1055 < this.anInt1056) {
							this.anIntArray256[this.anInt1055] = this.aClass1_Sub1_Sub3_Sub3_4.method228(local19.aString4, 987) / 2;
							this.anIntArray255[this.anInt1055] = this.aClass1_Sub1_Sub3_Sub3_4.anInt290;
							this.anIntArray253[this.anInt1055] = this.anInt1019;
							this.anIntArray254[this.anInt1055] = this.anInt1020;
							this.anIntArray257[this.anInt1055] = local19.anInt301;
							this.anIntArray258[this.anInt1055] = local19.anInt294;
							this.anIntArray259[this.anInt1055] = local19.anInt322;
							this.aStringArray13[this.anInt1055++] = local19.aString4;
							if (this.anInt959 == 0 && local19.anInt294 >= 1 && local19.anInt294 <= 3) {
								this.anIntArray255[this.anInt1055] += 10;
								this.anIntArray254[this.anInt1055] += 5;
							}
							if (this.anInt959 == 0 && local19.anInt294 == 4) {
								this.anIntArray256[this.anInt1055] = 60;
							}
							if (this.anInt959 == 0 && local19.anInt294 == 5) {
								this.anIntArray255[this.anInt1055] += 5;
							}
						}
					}
					if (local19.anInt329 > anInt903) {
						this.method610(local19.anInt325 + 15, local19);
						if (this.anInt1019 > -1) {
							local76 = local19.anInt330 * 30 / local19.anInt331;
							if (local76 > 30) {
								local76 = 30;
							}
							Class1_Sub1_Sub3.method514(this.anInt1019 - 15, this.anInt1020 - 3, 65280, local76, 5);
							Class1_Sub1_Sub3.method514(this.anInt1019 + local76 - 15, this.anInt1020 - 3, 16711680, 30 - local76, 5);
						}
					}
					for (local76 = 0; local76 < 4; local76++) {
						if (local19.anIntArray52[local76] > anInt903) {
							this.method610(local19.anInt325 / 2, local19);
							if (this.anInt1019 > -1) {
								if (local76 == 1) {
									this.anInt1020 -= 20;
								}
								if (local76 == 2) {
									this.anInt1019 -= 15;
									this.anInt1020 -= 10;
								}
								if (local76 == 3) {
									this.anInt1019 += 15;
									this.anInt1020 -= 10;
								}
								this.aClass1_Sub1_Sub3_Sub1Array4[local19.anIntArray51[local76]].method138(this.anInt1019 - 12, this.anInt1020 - 12);
								this.aClass1_Sub1_Sub3_Sub3_2.method225(this.anInt1020 + 4, String.valueOf(local19.anIntArray50[local76]), 0, this.anInt1019);
								this.aClass1_Sub1_Sub3_Sub3_2.method225(this.anInt1020 + 3, String.valueOf(local19.anIntArray50[local76]), 16777215, this.anInt1019 - 1);
							}
						}
					}
				}
			}
			for (@Pc(602) int local602 = 0; local602 < this.anInt1055; local602++) {
				local76 = this.anIntArray253[local602];
				@Pc(614) int local614 = this.anIntArray254[local602];
				local96 = this.anIntArray256[local602];
				@Pc(624) int local624 = this.anIntArray255[local602];
				@Pc(626) boolean local626 = true;
				while (local626) {
					local626 = false;
					for (@Pc(632) int local632 = 0; local632 < local602; local632++) {
						if (local614 + 2 > this.anIntArray254[local632] - this.anIntArray255[local632] && local614 - local624 < this.anIntArray254[local632] + 2 && local76 - local96 < this.anIntArray253[local632] + this.anIntArray256[local632] && local76 + local96 > this.anIntArray253[local632] - this.anIntArray256[local632] && this.anIntArray254[local632] - this.anIntArray255[local632] < local614) {
							local614 = this.anIntArray254[local632] - this.anIntArray255[local632];
							local626 = true;
						}
					}
				}
				this.anInt1019 = this.anIntArray253[local602];
				this.anInt1020 = this.anIntArray254[local602] = local614;
				@Pc(731) String local731 = this.aStringArray13[local602];
				if (this.anInt959 == 0) {
					@Pc(736) int local736 = 16776960;
					if (this.anIntArray257[local602] < 6) {
						local736 = this.anIntArray239[this.anIntArray257[local602]];
					}
					if (this.anIntArray257[local602] == 6) {
						local736 = this.anInt1035 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray257[local602] == 7) {
						local736 = this.anInt1035 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray257[local602] == 8) {
						local736 = this.anInt1035 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(811) int local811;
					if (this.anIntArray257[local602] == 9) {
						local811 = 150 - this.anIntArray259[local602];
						if (local811 < 50) {
							local736 = local811 * 1280 + 16711680;
						} else if (local811 < 100) {
							local736 = 16776960 - (local811 - 50) * 327680;
						} else if (local811 < 150) {
							local736 = (local811 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray257[local602] == 10) {
						local811 = 150 - this.anIntArray259[local602];
						if (local811 < 50) {
							local736 = local811 * 5 + 16711680;
						} else if (local811 < 100) {
							local736 = 16711935 - (local811 - 50) * 327680;
						} else if (local811 < 150) {
							local736 = (local811 - 100) * 327680 + 255 - (local811 - 100) * 5;
						}
					}
					if (this.anIntArray257[local602] == 11) {
						local811 = 150 - this.anIntArray259[local602];
						if (local811 < 50) {
							local736 = 16777215 - local811 * 327685;
						} else if (local811 < 100) {
							local736 = (local811 - 50) * 327685 + 65280;
						} else if (local811 < 150) {
							local736 = 16777215 - (local811 - 100) * 327680;
						}
					}
					if (this.anIntArray258[local602] == 0) {
						this.aClass1_Sub1_Sub3_Sub3_4.method225(this.anInt1020 + 1, local731, 0, this.anInt1019);
						this.aClass1_Sub1_Sub3_Sub3_4.method225(this.anInt1020, local731, local736, this.anInt1019);
					}
					if (this.anIntArray258[local602] == 1) {
						this.aClass1_Sub1_Sub3_Sub3_4.method230(local731, 0, this.anInt1019, this.anInt1035, this.anInt1020 + 1);
						this.aClass1_Sub1_Sub3_Sub3_4.method230(local731, local736, this.anInt1019, this.anInt1035, this.anInt1020);
					}
					if (this.anIntArray258[local602] == 2) {
						this.aClass1_Sub1_Sub3_Sub3_4.method231(local731, this.anInt1019, 0, this.anInt1020 + 1, this.anInt1035);
						this.aClass1_Sub1_Sub3_Sub3_4.method231(local731, this.anInt1019, local736, this.anInt1020, this.anInt1035);
					}
					if (this.anIntArray258[local602] == 3) {
						this.aClass1_Sub1_Sub3_Sub3_4.method232(this.anInt1019, 0, 150 - this.anIntArray259[local602], this.anInt1035, this.anInt1020 + 1, local731);
						this.aClass1_Sub1_Sub3_Sub3_4.method232(this.anInt1019, local736, 150 - this.anIntArray259[local602], this.anInt1035, this.anInt1020, local731);
					}
					@Pc(1108) int local1108;
					if (this.anIntArray258[local602] == 4) {
						local811 = this.aClass1_Sub1_Sub3_Sub3_4.method228(local731, 987);
						local1108 = (150 - this.anIntArray259[local602]) * (local811 + 100) / 150;
						Class1_Sub1_Sub3.method511(this.anInt1019 + 50, 334, this.anInt1019 - 50, 0);
						this.aClass1_Sub1_Sub3_Sub3_4.method229(local731, this.anInt1019 + 50 - local1108, 0, 619, this.anInt1020 + 1);
						this.aClass1_Sub1_Sub3_Sub3_4.method229(local731, this.anInt1019 + 50 - local1108, local736, 619, this.anInt1020);
						Class1_Sub1_Sub3.method510();
					}
					if (this.anIntArray258[local602] == 5) {
						local811 = 150 - this.anIntArray259[local602];
						local1108 = 0;
						if (local811 < 25) {
							local1108 = local811 - 25;
						} else if (local811 > 125) {
							local1108 = local811 - 125;
						}
						Class1_Sub1_Sub3.method511(512, this.anInt1020 + 5, 0, this.anInt1020 - this.aClass1_Sub1_Sub3_Sub3_4.anInt290 - 1);
						this.aClass1_Sub1_Sub3_Sub3_4.method225(this.anInt1020 + local1108 + 1, local731, 0, this.anInt1019);
						this.aClass1_Sub1_Sub3_Sub3_4.method225(this.anInt1020 + local1108, local731, local736, this.anInt1019);
						Class1_Sub1_Sub3.method510();
					}
				} else {
					this.aClass1_Sub1_Sub3_Sub3_4.method225(this.anInt1020 + 1, local731, 0, this.anInt1019);
					this.aClass1_Sub1_Sub3_Sub3_4.method225(this.anInt1020, local731, 16776960, this.anInt1019);
				}
			}
		} catch (@Pc(1258) RuntimeException local1258) {
			signlink.reporterror("67944, " + 92 + ", " + local1258.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "K", descriptor = "(I)Z")
	private boolean method708() {
		try {
			return signlink.wavereplay();
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("62462, " + 106 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BZ)V")
	private void method709(@OriginalArg(1) boolean arg0) {
		try {
			this.method617();
			this.aClass12_5.method182(this.anInt1054);
			this.aClass1_Sub1_Sub3_Sub2_4.method208(0, 0);
			@Pc(45) byte local45;
			@Pc(57) int local57;
			if (this.anInt882 == 0) {
				this.aClass1_Sub1_Sub3_Sub3_2.method226(7711145, this.aClass20_Sub1_1.aString7, 744, 180, true, 180);
				local45 = 80;
				this.aClass1_Sub1_Sub3_Sub3_4.method226(16776960, "Welcome to RuneScape", 744, 80, true, 180);
				local57 = local45 + 30;
				this.aClass1_Sub1_Sub3_Sub2_5.method208(27, 100);
				this.aClass1_Sub1_Sub3_Sub3_4.method226(16777215, "New User", 744, 125, true, 100);
				this.aClass1_Sub1_Sub3_Sub2_5.method208(187, 100);
				this.aClass1_Sub1_Sub3_Sub3_4.method226(16777215, "Existing User", 744, 125, true, 260);
			}
			if (this.anInt882 == 2) {
				local45 = 60;
				if (this.aString21.length() > 0) {
					this.aClass1_Sub1_Sub3_Sub3_4.method226(16776960, this.aString21, 744, 45, true, 180);
					this.aClass1_Sub1_Sub3_Sub3_4.method226(16776960, this.aString22, 744, 60, true, 180);
					local57 = local45 + 30;
				} else {
					this.aClass1_Sub1_Sub3_Sub3_4.method226(16776960, this.aString22, 744, 53, true, 180);
					local57 = local45 + 30;
				}
				this.aClass1_Sub1_Sub3_Sub3_4.method233(16777215, "Username: " + this.aString28 + (this.anInt993 == 0 & anInt903 % 40 < 20 ? "@yel@|" : ""), 90, true, 90);
				local57 += 15;
				this.aClass1_Sub1_Sub3_Sub3_4.method233(16777215, "Password: " + Class49.method568(this.aString29) + (this.anInt993 == 1 & anInt903 % 40 < 20 ? "@yel@|" : ""), 92, true, 105);
				local57 += 15;
				if (!arg0) {
					this.aClass1_Sub1_Sub3_Sub2_5.method208(27, 130);
					this.aClass1_Sub1_Sub3_Sub3_4.method226(16777215, "Login", 744, 155, true, 100);
					this.aClass1_Sub1_Sub3_Sub2_5.method208(187, 130);
					this.aClass1_Sub1_Sub3_Sub3_4.method226(16777215, "Cancel", 744, 155, true, 260);
				}
			}
			if (this.anInt882 == 3) {
				this.aClass1_Sub1_Sub3_Sub3_4.method226(16776960, "Create a free account", 744, 40, true, 180);
				local45 = 65;
				this.aClass1_Sub1_Sub3_Sub3_4.method226(16777215, "To create a new account you need to", 744, 65, true, 180);
				local57 = local45 + 15;
				this.aClass1_Sub1_Sub3_Sub3_4.method226(16777215, "go back to the main RuneScape webpage", 744, 80, true, 180);
				local57 += 15;
				this.aClass1_Sub1_Sub3_Sub3_4.method226(16777215, "and choose the red 'create account'", 744, 95, true, 180);
				local57 += 15;
				this.aClass1_Sub1_Sub3_Sub3_4.method226(16777215, "button at the top right of that page.", 744, 110, true, 180);
				local57 += 15;
				this.aClass1_Sub1_Sub3_Sub2_5.method208(107, 130);
				this.aClass1_Sub1_Sub3_Sub3_4.method226(16777215, "Cancel", 744, 155, true, 180);
			}
			this.aClass12_5.method183(171, 202, super.aGraphics2);
			if (this.aBoolean231) {
				this.aBoolean231 = false;
				this.aClass12_3.method183(0, 128, super.aGraphics2);
				this.aClass12_4.method183(371, 202, super.aGraphics2);
				this.aClass12_8.method183(265, 0, super.aGraphics2);
				this.aClass12_9.method183(265, 562, super.aGraphics2);
				this.aClass12_10.method183(171, 128, super.aGraphics2);
				this.aClass12_11.method183(171, 562, super.aGraphics2);
			}
		} catch (@Pc(499) RuntimeException local499) {
			signlink.reporterror("11364, " + -128 + ", " + arg0 + ", " + local499.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!CFARFRSG;II)V")
	private void method710(@OriginalArg(0) Class1_Sub1_Sub2 arg0, @OriginalArg(1) int arg1) {
		try {
			while (true) {
				if (arg0.anInt154 + 21 < arg1 * 8) {
					@Pc(12) int local12 = arg0.method70(881, 14);
					if (local12 != 16383) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local12] == null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local12] = new Class1_Sub1_Sub1_Sub1_Sub1();
						}
						@Pc(32) Class1_Sub1_Sub1_Sub1_Sub1 local32 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local12];
						this.anIntArray236[this.anInt988++] = local12;
						local32.anInt304 = anInt903;
						local32.aClass31_1 = Class31.method400(arg0.method70(881, 12));
						@Pc(58) int local58 = arg0.method70(881, 1);
						if (local58 == 1) {
							this.anIntArray214[this.anInt872++] = local12;
						}
						@Pc(77) int local77 = arg0.method70(881, 1);
						@Pc(82) int local82 = arg0.method70(881, 5);
						if (local82 > 15) {
							local82 -= 32;
						}
						@Pc(91) int local91 = arg0.method70(881, 5);
						if (local91 > 15) {
							local91 -= 32;
						}
						local32.anInt326 = local32.aClass31_1.aByte23;
						local32.anInt295 = local32.aClass31_1.anInt582;
						local32.anInt305 = local32.aClass31_1.anInt573;
						local32.anInt306 = local32.aClass31_1.anInt584;
						local32.anInt307 = local32.aClass31_1.anInt570;
						local32.anInt308 = local32.aClass31_1.anInt577;
						local32.anInt327 = local32.aClass31_1.anInt578;
						local32.method244(local77 == 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray49[0] + local82, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray48[0] + local91);
						continue;
					}
				}
				arg0.method71();
				return;
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("67994, " + arg0 + ", " + arg1 + ", " + 684 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
	private void method711() {
		try {
			this.aClass12_25.method182(this.anInt1054);
			@Pc(19) int local19;
			@Pc(21) int local21;
			if (this.anInt1063 == 2) {
				@Pc(14) byte[] local14 = this.aClass1_Sub1_Sub3_Sub2_2.aByteArray2;
				@Pc(16) int[] local16 = Class1_Sub1_Sub3.anIntArray176;
				local19 = local14.length;
				for (local21 = 0; local21 < local19; local21++) {
					if (local14[local21] == 0) {
						local16[local21] = 0;
					}
				}
				this.aClass1_Sub1_Sub3_Sub1_6.method142(this.anIntArray241, 25, this.anIntArray233, 0, 256, this.anInt984, 25, 33, 33, 0);
				this.aClass12_26.method182(this.anInt1054);
			} else {
				@Pc(66) int local66 = this.anInt984 + this.anInt973 & 0x7FF;
				@Pc(73) int local73 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt319 / 32 + 48;
				local19 = 464 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt320 / 32;
				this.aClass1_Sub1_Sub3_Sub1_5.method142(this.anIntArray218, local73, this.anIntArray226, 25, this.anInt954 + 256, local66, local19, 151, 146, 5);
				this.aClass1_Sub1_Sub3_Sub1_6.method142(this.anIntArray241, 25, this.anIntArray233, 0, 256, this.anInt984, 25, 33, 33, 0);
				for (local21 = 0; local21 < this.anInt896; local21++) {
					local73 = this.anIntArray220[local21] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt319 / 32;
					local19 = this.anIntArray221[local21] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt320 / 32;
					this.method661(local73, this.aClass1_Sub1_Sub3_Sub1Array5[local21], local19);
				}
				@Pc(168) int local168;
				for (@Pc(164) int local164 = 0; local164 < 104; local164++) {
					for (local168 = 0; local168 < 104; local168++) {
						@Pc(180) Class7 local180 = this.aClass7ArrayArrayArray1[this.anInt961][local164][local168];
						if (local180 != null) {
							local73 = local164 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt319 / 32;
							local19 = local168 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt320 / 32;
							this.method661(local73, this.aClass1_Sub1_Sub3_Sub1_10, local19);
						}
					}
				}
				for (local168 = 0; local168 < this.anInt988; local168++) {
					@Pc(231) Class1_Sub1_Sub1_Sub1_Sub1 local231 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray236[local168]];
					if (local231 != null && local231.method247()) {
						@Pc(240) Class31 local240 = local231.aClass31_1;
						if (local240.anIntArray133 != null) {
							local240 = local240.method402();
						}
						if (local240 != null && local240.aBoolean147 && local240.aBoolean149) {
							local73 = local231.anInt319 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt319 / 32;
							local19 = local231.anInt320 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt320 / 32;
							this.method661(local73, this.aClass1_Sub1_Sub3_Sub1_11, local19);
						}
					}
				}
				@Pc(299) Class1_Sub1_Sub1_Sub1_Sub2 local299;
				for (@Pc(289) int local289 = 0; local289 < this.anInt871; local289++) {
					local299 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray213[local289]];
					if (local299 != null && local299.method247()) {
						local73 = local299.anInt319 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt319 / 32;
						local19 = local299.anInt320 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt320 / 32;
						@Pc(327) boolean local327 = false;
						@Pc(331) long local331 = Class49.method563(local299.aString5);
						for (@Pc(333) int local333 = 0; local333 < this.anInt1000; local333++) {
							if (local331 == this.aLongArray4[local333] && this.anIntArray225[local333] != 0) {
								local327 = true;
								break;
							}
						}
						@Pc(358) boolean local358 = false;
						if (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt356 != 0 && local299.anInt356 != 0 && aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt356 == local299.anInt356) {
							local358 = true;
						}
						if (local327) {
							this.method661(local73, this.aClass1_Sub1_Sub3_Sub1_13, local19);
						} else if (local358) {
							this.method661(local73, this.aClass1_Sub1_Sub3_Sub1_14, local19);
						} else {
							this.method661(local73, this.aClass1_Sub1_Sub3_Sub1_12, local19);
						}
					}
				}
				if (this.anInt1023 != 0 && anInt903 % 20 < 10) {
					if (this.anInt1023 == 1 && this.anInt1012 >= 0 && this.anInt1012 < this.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length) {
						@Pc(432) Class1_Sub1_Sub1_Sub1_Sub1 local432 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anInt1012];
						if (local432 != null) {
							local73 = local432.anInt319 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt319 / 32;
							local19 = local432.anInt320 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt320 / 32;
							this.method598(local73, (byte) 4, local19, this.aClass1_Sub1_Sub3_Sub1_4);
						}
					}
					if (this.anInt1023 == 2) {
						local73 = (this.anInt975 - this.anInt1037) * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt319 / 32;
						local19 = (this.anInt976 - this.anInt1038) * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt320 / 32;
						this.method598(local73, (byte) 4, local19, this.aClass1_Sub1_Sub3_Sub1_4);
					}
					if (this.anInt1023 == 10 && this.anInt876 >= 0 && this.anInt876 < this.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length) {
						local299 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anInt876];
						if (local299 != null) {
							local73 = local299.anInt319 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt319 / 32;
							local19 = local299.anInt320 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt320 / 32;
							this.method598(local73, (byte) 4, local19, this.aClass1_Sub1_Sub3_Sub1_4);
						}
					}
				}
				if (this.anInt888 != 0) {
					local73 = this.anInt888 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt319 / 32;
					local19 = this.anInt889 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt320 / 32;
					this.method661(local73, this.aClass1_Sub1_Sub3_Sub1_3, local19);
				}
				Class1_Sub1_Sub3.method514(97, 78, 16777215, 3, 3);
				this.aClass12_26.method182(this.anInt1054);
			}
		} catch (@Pc(602) RuntimeException local602) {
			signlink.reporterror("59915, " + 26351 + ", " + local602.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(JI)V")
	private void method713(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(18) int local18 = 0; local18 < this.anInt1004; local18++) {
					if (this.aLongArray3[local18] == arg0) {
						this.anInt1004--;
						this.aBoolean223 = true;
						for (@Pc(38) int local38 = local18; local38 < this.anInt1004; local38++) {
							this.aLongArray3[local38] = this.aLongArray3[local38 + 1];
						}
						this.aClass1_Sub1_Sub2_8.method48(5);
						this.aClass1_Sub1_Sub2_8.method55((byte) 9, arg0);
						return;
					}
				}
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("69105, " + arg0 + ", " + 0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
	private void method714() {
		try {
			@Pc(3) int local3 = 5;
			this.anIntArray240[8] = 0;
			if (this.aByte39 != -17) {
				this.aClass7ArrayArrayArray1 = null;
			}
			@Pc(17) int local17 = 0;
			while (this.anIntArray240[8] == 0) {
				@Pc(21) String local21 = "Unknown problem";
				this.method581(20, "Connecting to web server");
				try {
					@Pc(43) DataInputStream local43 = this.method643("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 332);
					@Pc(50) Class1_Sub1_Sub2 local50 = new Class1_Sub1_Sub2(new byte[40], 792);
					local43.readFully(local50.aByteArray1, 0, 40);
					local43.close();
					for (@Pc(60) int local60 = 0; local60 < 9; local60++) {
						this.anIntArray240[local60] = local50.method64();
					}
					@Pc(75) int local75 = local50.method64();
					@Pc(77) int local77 = 1234;
					for (@Pc(79) int local79 = 0; local79 < 9; local79++) {
						local77 = (local77 << 1) + this.anIntArray240[local79];
					}
					if (local75 != local77) {
						local21 = "checksum problem";
						this.anIntArray240[8] = 0;
					}
				} catch (@Pc(106) EOFException local106) {
					local21 = "EOF problem";
					this.anIntArray240[8] = 0;
				} catch (@Pc(115) IOException local115) {
					local21 = "connection problem";
					this.anIntArray240[8] = 0;
				} catch (@Pc(124) Exception local124) {
					local21 = "logic problem";
					this.anIntArray240[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray240[8] == 0) {
					local17++;
					for (@Pc(142) int local142 = local3; local142 > 0; local142--) {
						if (local17 >= 10) {
							this.method581(10, "Game updated - please reload page");
							local142 = 10;
						} else {
							this.method581(10, local21 + " - Will retry in " + local142 + " secs.");
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(176) Exception local176) {
						}
					}
					local3 *= 2;
					if (local3 > 60) {
						local3 = 60;
					}
					this.aBoolean242 = !this.aBoolean242;
				}
			}
		} catch (@Pc(204) RuntimeException local204) {
			signlink.reporterror("20362, " + -17 + ", " + local204.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean249) {
			this.method627();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!CFARFRSG;Lclient!FHQGDDHF;)V")
	private void method715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub1_Sub2 arg3, @OriginalArg(4) Class1_Sub1_Sub1_Sub1_Sub2 arg4) {
		try {
			if (arg0 != 17845) {
				this.aBoolean267 = !this.aBoolean267;
			}
			@Pc(20) int local20;
			@Pc(24) int local24;
			if ((arg2 & 0x80) != 0) {
				local20 = arg3.method80();
				local24 = arg3.method78(887);
				arg4.method248(local20, local24, anInt903, 491);
				arg4.anInt329 = anInt903 + 300;
				arg4.anInt330 = arg3.method59();
				arg4.anInt331 = arg3.method80();
			}
			if ((arg2 & 0x10) != 0) {
				arg4.aString4 = arg3.method66();
				if (arg4.aString4.charAt(0) == '~') {
					arg4.aString4 = arg4.aString4.substring(1);
					this.method624(arg4.aString4, arg4.aString5, 2);
				} else if (arg4 == aClass1_Sub1_Sub1_Sub1_Sub2_1) {
					this.method624(arg4.aString4, arg4.aString5, 2);
				}
				arg4.anInt301 = 0;
				arg4.anInt294 = 0;
				arg4.anInt322 = 150;
			}
			@Pc(122) int local122;
			if ((arg2 & 0x40) != 0) {
				local20 = arg3.method86((byte) 1);
				if (local20 == 65535) {
					local20 = -1;
				}
				local24 = arg3.method59();
				if (local20 == arg4.anInt332 && local20 != -1) {
					local122 = Class21.aClass21Array1[local20].anInt398;
					if (local122 == 1) {
						arg4.anInt333 = 0;
						arg4.anInt334 = 0;
						arg4.anInt335 = local24;
						arg4.anInt336 = 0;
					}
					if (local122 == 2) {
						arg4.anInt336 = 0;
					}
				} else if (local20 == -1 || arg4.anInt332 == -1 || Class21.aClass21Array1[local20].anInt392 >= Class21.aClass21Array1[arg4.anInt332].anInt392) {
					arg4.anInt332 = local20;
					arg4.anInt333 = 0;
					arg4.anInt334 = 0;
					arg4.anInt335 = local24;
					arg4.anInt336 = 0;
					arg4.anInt323 = arg4.anInt317;
				}
			}
			if ((arg2 & 0x100) != 0) {
				arg4.anInt296 = arg3.method61();
				local20 = arg3.method64();
				arg4.anInt300 = local20 >> 16;
				arg4.anInt299 = anInt903 + (local20 & 0xFFFF);
				arg4.anInt297 = 0;
				arg4.anInt298 = 0;
				if (arg4.anInt299 > anInt903) {
					arg4.anInt297 = -1;
				}
				if (arg4.anInt296 == 65535) {
					arg4.anInt296 = -1;
				}
			}
			if ((arg2 & 0x20) != 0) {
				arg4.anInt337 = arg3.method86((byte) 1);
				if (arg4.anInt337 == 65535) {
					arg4.anInt337 = -1;
				}
			}
			if ((arg2 & 0x200) != 0) {
				local20 = arg3.method59();
				local24 = arg3.method78(887);
				arg4.method248(local20, local24, anInt903, 491);
				arg4.anInt329 = anInt903 + 300;
				arg4.anInt330 = arg3.method80();
				arg4.anInt331 = arg3.method79();
			}
			if ((arg2 & 0x8) != 0) {
				arg4.anInt302 = arg3.method86((byte) 1);
				arg4.anInt303 = arg3.method61();
			}
			if ((arg2 & 0x1) != 0) {
				local20 = arg3.method59();
				@Pc(295) byte[] local295 = new byte[local20];
				@Pc(301) Class1_Sub1_Sub2 local301 = new Class1_Sub1_Sub2(local295, 792);
				arg3.method96(local295, local20);
				this.aClass1_Sub1_Sub2Array1[arg1] = local301;
				arg4.method251(local301);
			}
			if ((arg2 & 0x2) != 0) {
				local20 = arg3.method61();
				local24 = arg3.method79();
				local122 = arg3.method80();
				@Pc(334) int local334 = arg3.anInt153;
				if (arg4.aString5 != null && arg4.aBoolean92) {
					@Pc(344) long local344 = Class49.method563(arg4.aString5);
					@Pc(346) boolean local346 = false;
					if (local24 <= 1) {
						for (@Pc(351) int local351 = 0; local351 < this.anInt1004; local351++) {
							if (this.aLongArray3[local351] == local344) {
								local346 = true;
								break;
							}
						}
					}
					if (!local346 && this.anInt1013 == 0) {
						try {
							this.aClass1_Sub1_Sub2_6.anInt153 = 0;
							arg3.method68(local122, this.aClass1_Sub1_Sub2_6.aByteArray1);
							this.aClass1_Sub1_Sub2_6.anInt153 = 0;
							@Pc(396) String local396 = Class13.method185(local122, this.aClass1_Sub1_Sub2_6);
							@Pc(400) String local400 = Class30.method347(local396);
							arg4.aString4 = local400;
							arg4.anInt301 = local20 >> 8;
							arg4.anInt294 = local20 & 0xFF;
							arg4.anInt322 = 150;
							if (local24 == 2 || local24 == 3) {
								this.method624(local400, "@cr2@" + arg4.aString5, 1);
							} else if (local24 == 1) {
								this.method624(local400, "@cr1@" + arg4.aString5, 1);
							} else {
								this.method624(local400, arg4.aString5, 2);
							}
						} catch (@Pc(464) Exception local464) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg3.anInt153 = local334 + local122;
			}
			if ((arg2 & 0x400) != 0) {
				arg4.anInt310 = arg3.method80();
				arg4.anInt312 = arg3.method80();
				arg4.anInt311 = arg3.method80();
				arg4.anInt313 = arg3.method59();
				arg4.anInt314 = arg3.method86((byte) 1) + anInt903;
				arg4.anInt315 = arg3.method88(this.anInt1074) + anInt903;
				arg4.anInt316 = arg3.method78(887);
				arg4.method246();
			}
		} catch (@Pc(520) RuntimeException local520) {
			signlink.reporterror("7269, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local520.toString());
			throw new RuntimeException();
		}
	}
}
