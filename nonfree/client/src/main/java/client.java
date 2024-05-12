import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.io.DataInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.zip.CRC32;
import sign.signlink;

public final class client extends Applet_Sub1 {

	private static int anInt143;

	private static String aString4 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	private int anInt144;

	private int anInt145;

	private int anInt146;

	private int anInt147;

	private int anInt148;

	private int anInt149;

	private int anInt150;

	private int anInt151 = 24676;

	private int anInt152 = -1;

	private int[] anIntArray30;

	private int[] anIntArray31;

	private int[] anIntArray32;

	private int anInt153;

	private int anInt154;

	private int anInt155;

	private int anInt156;

	private int[] anIntArray33 = new int[5];

	private Class1_Sub3_Sub3 aClass1_Sub3_Sub3_4 = Class1_Sub3_Sub3.method378(1, -737);

	private int anInt157;

	private int anInt158;

	private int anInt159;

	private int anInt160;

	private int anInt161;

	private int anInt162;

	private int anInt163;

	private boolean aBoolean37 = false;

	private Class28 aClass28_1 = new Class28(0);

	private Class38 aClass38_1;

	private boolean[] aBooleanArray1 = new boolean[5];

	private int anInt164;

	private int anInt165 = 9;

	private int anInt166 = 3;

	private int[][] anIntArrayArray2 = new int[104][104];

	private int anInt167 = 997;

	private int anInt168;

	private int anInt169;

	private int anInt170;

	private int anInt171;

	private int anInt172;

	private String aString5 = "";

	private byte aByte8 = 106;

	private Class28 aClass28_2 = new Class28(0);

	private long[] aLongArray3 = new long[100];

	private int anInt173;

	private byte[][] aByteArrayArray1;

	private int anInt174 = 723;

	private static int anInt175;

	private int[] anIntArray34 = new int[100];

	private int anInt176 = -1;

	private String aString6 = "";

	private Class1_Sub3_Sub2_Sub2[] aClass1_Sub3_Sub2_Sub2Array3 = new Class1_Sub3_Sub2_Sub2[20];

	private long aLong7;

	private int anInt177 = 332;

	private int anInt178;

	private int anInt179;

	private int anInt180;

	private int anInt181;

	private int anInt182;

	private String aString7 = "";

	private int anInt183;

	private int anInt184 = -1;

	private boolean aBoolean38 = true;

	private boolean aBoolean39 = false;

	private int[] anIntArray35 = new int[7];

	private byte aByte9 = 8;

	private Class1_Sub3_Sub2_Sub2[] aClass1_Sub3_Sub2_Sub2Array4 = new Class1_Sub3_Sub2_Sub2[1000];

	private int anInt185 = 78;

	private int anInt186;

	private int[][][] anIntArrayArrayArray3;

	private Class1_Sub3_Sub3 aClass1_Sub3_Sub3_5 = Class1_Sub3_Sub3.method378(1, -737);

	private int anInt187;

	private static int anInt188;

	private Class1_Sub3_Sub3 aClass1_Sub3_Sub3_6 = Class1_Sub3_Sub3.method378(1, -737);

	private boolean aBoolean40 = false;

	private int anInt189;

	private int anInt190;

	private int anInt191;

	private int anInt192 = 3;

	private static int anInt193;

	private int anInt194 = -655;

	private static int anInt195;

	private int[] anIntArray36 = new int[50];

	private Class15 aClass15_1 = new Class15();

	private int[] anIntArray37 = new int[50];

	private int anInt196;

	private int[] anIntArray38 = new int[9];

	private boolean aBoolean41 = true;

	private int anInt197 = 4277;

	private Class1_Sub3_Sub2_Sub3[] aClass1_Sub3_Sub2_Sub3Array1 = new Class1_Sub3_Sub2_Sub3[13];

	private int anInt198;

	private int anInt199 = 128;

	private int anInt200;

	private int anInt201;

	private int anInt202;

	private int anInt203 = 2048;

	private int anInt204 = 2047;

	private Class1_Sub1_Sub3_Sub2[] aClass1_Sub1_Sub3_Sub2Array1 = new Class1_Sub1_Sub3_Sub2[this.anInt203];

	private int anInt205;

	int[] anIntArray39 = new int[this.anInt203];

	private int anInt206;

	private int[] anIntArray40 = new int[this.anInt203];

	private Class1_Sub3_Sub3[] aClass1_Sub3_Sub3Array1 = new Class1_Sub3_Sub3[this.anInt203];

	private int anInt207;

	private int anInt208;

	private int anInt209;

	private Class33 aClass33_1;

	private Class28 aClass28_3 = new Class28(0);

	private int anInt210;

	private String[] aStringArray5 = new String[500];

	private boolean aBoolean42 = true;

	private boolean aBoolean43 = true;

	private int anInt211;

	private int anInt212;

	private int anInt213;

	private byte[][][] aByteArrayArrayArray7;

	private int[] anIntArray41;

	private int[] anIntArray42;

	private byte aByte10 = 4;

	private int anInt214;

	private int anInt215;

	private int anInt216;

	private int anInt217;

	private int anInt218;

	private boolean aBoolean44 = false;

	private int[] anIntArray43 = new int[256];

	private byte aByte11 = 2;

	private Class32 aClass32_3;

	private Class32 aClass32_4;

	private Class32 aClass32_5;

	private int anInt219;

	private int[] anIntArray44 = new int[33];

	private static int anInt220;

	private int[] anIntArray45 = new int[50];

	private int anInt221;

	private boolean aBoolean45 = false;

	private int[] anIntArray46 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	private int anInt222;

	private int anInt223;

	private static int[] anIntArray47 = new int[99];

	private boolean aBoolean46 = false;

	private byte aByte12 = 99;

	private static int anInt224;

	private int anInt225;

	private boolean aBoolean47 = false;

	private static boolean aBoolean48;

	private static byte aByte13;

	private boolean aBoolean49 = false;

	private int anInt226;

	private int anInt227;

	private int anInt228;

	private static int anInt229;

	private final int anInt230 = 100;

	private int[] anIntArray48 = new int[100];

	private boolean aBoolean50 = false;

	private int anInt231;

	private boolean aBoolean51 = false;

	private static int anInt232;

	private int anInt233 = -655;

	private Class28 aClass28_4 = new Class28(0);

	private int anInt234;

	private static int anInt235;

	private static int anInt236;

	private static boolean aBoolean52;

	private static boolean aBoolean53;

	private static int anInt237;

	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_1;

	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_2;

	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_3;

	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_4;

	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_5;

	private int[] anIntArray49 = new int[100];

	private String[] aStringArray6 = new String[100];

	private String[] aStringArray7 = new String[100];

	private static int anInt238;

	private long aLong8;

	private int anInt239;

	private boolean aBoolean54 = false;

	private int[] anIntArray50;

	private int[] anIntArray51;

	private int[] anIntArray52;

	private int[] anIntArray53;

	private int anInt240 = -1;

	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_6;

	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_7;

	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_8;

	private int anInt241;

	private boolean aBoolean55 = false;

	private static int anInt242;

	private int anInt243;

	private int anInt244;

	private int anInt245;

	private int anInt246;

	private int[] anIntArray54 = new int[1000];

	private int[] anIntArray55 = new int[1000];

	private int[][] anIntArrayArray3 = new int[104][104];

	private boolean aBoolean56 = false;

	private static BigInteger aBigInteger1;

	private boolean aBoolean57 = false;

	private int anInt247;

	private int[] anIntArray56;

	private int[] anIntArray57 = new int[50];

	private Class1_Sub1_Sub3_Sub1[] aClass1_Sub1_Sub3_Sub1Array1 = new Class1_Sub1_Sub3_Sub1[8192];

	private int anInt248;

	int[] anIntArray58 = new int[8192];

	private int anInt249;

	private int anInt250 = 1;

	private int anInt251;

	private int anInt252;

	private int anInt253;

	private byte aByte14 = -46;

	private String aString8;

	private static int anInt254;

	private int[] anIntArray59 = new int[2000];

	private int anInt255;

	int[] anIntArray60 = new int[1000];

	private int anInt256;

	static final int[][] anIntArrayArray4;

	private long[] aLongArray4 = new long[100];

	private int anInt257;

	private int anInt258;

	private int anInt259;

	private int anInt260;

	private int anInt261;

	private int anInt262;

	private int anInt263;

	private int anInt264;

	private int anInt265;

	private int[] anIntArray61 = new int[151];

	private Class9[] aClass9Array1 = new Class9[4];

	static int anInt266;

	private Class1_Sub3_Sub2_Sub2[] aClass1_Sub3_Sub2_Sub2Array5 = new Class1_Sub3_Sub2_Sub2[20];

	private int anInt267;

	private static int anInt268;

	private int[] anIntArray62 = new int[5];

	private boolean aBoolean58 = false;

	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_1;

	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_2;

	private int anInt269;

	private boolean aBoolean59 = false;

	private boolean aBoolean60 = false;

	private int[] anIntArray63 = new int[5];

	private Class1_Sub1_Sub3_Sub2 aClass1_Sub1_Sub3_Sub2_1;

	private boolean aBoolean61 = false;

	private int anInt270;

	private String aString9 = "";

	private int anInt271 = -1;

	private int anInt272;

	private Class1_Sub3_Sub2_Sub3[] aClass1_Sub3_Sub2_Sub3Array2;

	private boolean aBoolean62 = false;

	private boolean aBoolean63 = false;

	private int anInt273;

	private int anInt274;

	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_3;

	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_4;

	private int anInt275 = 3353893;

	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_9;

	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_10;

	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_11;

	private int anInt276;

	private Class1_Sub3_Sub2_Sub4 aClass1_Sub3_Sub2_Sub4_1;

	private Class1_Sub3_Sub2_Sub4 aClass1_Sub3_Sub2_Sub4_2;

	private Class1_Sub3_Sub2_Sub4 aClass1_Sub3_Sub2_Sub4_3;

	private Class1_Sub3_Sub2_Sub4 aClass1_Sub3_Sub2_Sub4_4;

	private int anInt277;

	private boolean aBoolean64 = false;

	private int[] anIntArray64;

	private int[] anIntArray65;

	private int anInt278 = 7759444;

	private int[] anIntArray66 = new int[4000];

	private int[] anIntArray67 = new int[4000];

	private CRC32 aCRC32_1 = new CRC32();

	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_5;

	private static int anInt279;

	private Class6 aClass6_1;

	private byte[][] aByteArrayArray2;

	private int anInt280 = -1;

	private int anInt281;

	private int anInt282;

	private int anInt283;

	private int anInt284;

	String aString10;

	private Class32 aClass32_6;

	private Class32 aClass32_7;

	private Class32 aClass32_8;

	private Class32 aClass32_9;

	private Class32 aClass32_10;

	private Class32 aClass32_11;

	private Class32 aClass32_12;

	private Class32 aClass32_13;

	private Class32 aClass32_14;

	private Class32 aClass32_15;

	private static int anInt285;

	private int anInt286;

	private int anInt287 = -1;

	private int anInt288 = -1;

	private int anInt289 = -1;

	private int anInt290;

	private boolean aBoolean65 = false;

	private int[] anIntArray68 = new int[5];

	private int anInt291;

	private int anInt292;

	private int anInt293;

	String aString11;

	private Class32 aClass32_16;

	private Class32 aClass32_17;

	private Class32 aClass32_18;

	private Class32 aClass32_19;

	private Class32 aClass32_20;

	private Class32 aClass32_21;

	private Class32 aClass32_22;

	private Class32 aClass32_23;

	private Class32 aClass32_24;

	private Class1_Sub3_Sub2_Sub3[] aClass1_Sub3_Sub2_Sub3Array3 = new Class1_Sub3_Sub2_Sub3[50];

	private int anInt294 = 27808;

	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_12;

	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_13;

	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_14;

	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_15;

	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_16;

	private int[] anIntArray69 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	private Class32 aClass32_25;

	private Class32 aClass32_26;

	private Class32 aClass32_27;

	private Class32 aClass32_28;

	private int anInt295 = 2301979;

	private int anInt296;

	private int anInt297;

	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_6;

	private int anInt298;

	private boolean aBoolean66 = false;

	private Class28 aClass28_5 = new Class28(0);

	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_7;

	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_8;

	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_9;

	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_10;

	private int anInt299;

	private static BigInteger aBigInteger2;

	private int anInt300;

	private String aString12;

	private int anInt301 = -1;

	private String aString13 = "";

	private String aString14 = "";

	private byte aByte15 = 7;

	private byte[] aByteArray4 = new byte[16384];

	private boolean aBoolean67 = false;

	private int anInt302 = 242;

	private int anInt303;

	static final int[] anIntArray70;

	private int anInt304;

	private int[] anIntArray71 = new int[2000];

	private int anInt305;

	private int anInt306;

	private int anInt307;

	private int[] anIntArray72 = new int[50];

	private boolean aBoolean68 = false;

	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_17;

	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_18;

	private String aString15 = "";

	private String aString16 = "";

	private int anInt308;

	private int anInt309 = 2;

	private int anInt310;

	private int anInt311;

	private int anInt312;

	private static int anInt313;

	private int anInt314;

	private int anInt315 = 50;

	private int[] anIntArray73 = new int[this.anInt315];

	private int[] anIntArray74 = new int[this.anInt315];

	private int[] anIntArray75 = new int[this.anInt315];

	private int[] anIntArray76 = new int[this.anInt315];

	private int[] anIntArray77 = new int[this.anInt315];

	private int[] anIntArray78 = new int[this.anInt315];

	private int[] anIntArray79 = new int[this.anInt315];

	private String[] aStringArray8 = new String[this.anInt315];

	private int anInt316;

	private static boolean aBoolean69;

	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_19;

	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_20;

	private int anInt317 = -986;

	private int anInt318 = -35388;

	private final int[] anIntArray80 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	private static int anInt319;

	private int anInt320;

	private int anInt321;

	private int anInt322;

	private int anInt323;

	private int anInt324;

	private int anInt325;

	private int anInt326;

	private static byte aByte16;

	private int[] anIntArray81 = new int[33];

	private int[][] anIntArrayArray5 = new int[104][104];

	private String aString17;

	private Class1_Sub3_Sub2_Sub2[] aClass1_Sub3_Sub2_Sub2Array6 = new Class1_Sub3_Sub2_Sub2[8];

	private boolean aBoolean70 = false;

	private byte aByte17 = 94;

	private Object anObject1 = new Object();

	private int[] anIntArray82 = new int[50];

	private int anInt327;

	private int anInt328 = 2;

	private String[] aStringArray9 = new String[100];

	private int anInt329 = -1;

	private int anInt330 = -1;

	private int anInt331;

	private int anInt332 = 2;

	private int anInt333 = 29286;

	private int[] anIntArray83 = new int[151];

	private int anInt334;

	private int anInt335 = 1;

	private Class39 aClass39_1;

	private String aString18 = "";

	private Class1_Sub3_Sub2_Sub2[] aClass1_Sub3_Sub2_Sub2Array7 = new Class1_Sub3_Sub2_Sub2[50];

	private int[] anIntArray84 = new int[500];

	private int[] anIntArray85 = new int[500];

	private int[] anIntArray86 = new int[500];

	private int[] anIntArray87 = new int[500];

	private int anInt336 = 701;

	private boolean aBoolean71 = false;

	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_11;

	private long aLong9;

	private boolean aBoolean72 = true;

	private int anInt337;

	private int anInt338;

	private int anInt339;

	private int anInt340;

	private int anInt341;

	private boolean aBoolean73 = true;

	private int anInt342;

	private int anInt343;

	private int anInt344;

	private Class28[][][] aClass28ArrayArrayArray1 = new Class28[4][104][104];

	private int anInt345 = 5063219;

	private int[] anIntArray88 = new int[5];

	private int anInt346 = -676;

	public final void method75(boolean arg0, int arg1, String arg2, int arg3) {
		try {
			if (arg2 != null) {
				Object var5 = this.anObject1;
				synchronized (this.anObject1) {
					this.aString12 = arg2;
					this.anInt269 = arg1;
					this.anInt144 = arg3;
				}
				if (arg0) {
					this.anInt179 = -1;
				}
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("88096, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	public final void method76(int arg0) {
		try {
			this.anInt314 = 0;
			while (arg0 >= 0) {
				this.anInt233 = this.aClass38_1.method532();
			}
			int var4;
			int var6;
			for (int var2 = -1; var2 < this.anInt205 + this.anInt248; ++var2) {
				Class1_Sub1_Sub3 var3;
				if (var2 == -1) {
					var3 = this.aClass1_Sub1_Sub3_Sub2_1;
				} else if (var2 < this.anInt205) {
					var3 = this.aClass1_Sub1_Sub3_Sub2Array1[this.anIntArray39[var2]];
				} else {
					var3 = this.aClass1_Sub1_Sub3_Sub1Array1[this.anIntArray58[var2 - this.anInt205]];
				}
				if (var3 != null && var3.method571(false)) {
					if (var2 >= this.anInt205) {
						if (this.anInt241 == 1 && this.anInt190 == this.anIntArray58[var2 - this.anInt205] && anInt266 % 20 < 10) {
							this.method151(var3.anInt933 + 15, this.aBoolean45, var3);
							if (this.anInt287 > -1) {
								this.aClass1_Sub3_Sub2_Sub2Array5[2].method322(this.anInt288 - 28, this.anInt287 - 12, false);
							}
						}
					} else {
						var4 = 30;
						Class1_Sub1_Sub3_Sub2 var5 = (Class1_Sub1_Sub3_Sub2) var3;
						if (var5.anInt939 != 0) {
							this.method151(var3.anInt933 + 15, this.aBoolean45, var3);
							if (this.anInt287 > -1) {
								for (var6 = 0; var6 < 8; ++var6) {
									if ((var5.anInt939 & 1 << var6) != 0) {
										this.aClass1_Sub3_Sub2_Sub2Array5[var6].method322(this.anInt288 - var4, this.anInt287 - 12, false);
										var4 -= 25;
									}
								}
							}
						}
						if (var2 >= 0 && this.anInt241 == 10 && this.anInt305 == this.anIntArray39[var2]) {
							this.method151(var3.anInt933 + 15, this.aBoolean45, var3);
							if (this.anInt287 > -1) {
								this.aClass1_Sub3_Sub2_Sub2Array5[7].method322(this.anInt288 - var4, this.anInt287 - 12, false);
							}
						}
					}
					if (var3.aString29 != null && (var2 >= this.anInt205 || this.anInt273 == 0 || this.anInt273 == 3 || this.anInt273 == 1 && this.method199(-20, ((Class1_Sub1_Sub3_Sub2) var3).aString30))) {
						this.method151(var3.anInt933, this.aBoolean45, var3);
						if (this.anInt287 > -1 && this.anInt314 < this.anInt315) {
							this.anIntArray76[this.anInt314] = this.aClass1_Sub3_Sub2_Sub4_3.method364(false, var3.aString29) / 2;
							this.anIntArray75[this.anInt314] = this.aClass1_Sub3_Sub2_Sub4_3.anInt540;
							this.anIntArray73[this.anInt314] = this.anInt287;
							this.anIntArray74[this.anInt314] = this.anInt288;
							this.anIntArray77[this.anInt314] = var3.anInt902;
							this.anIntArray78[this.anInt314] = var3.anInt903;
							this.anIntArray79[this.anInt314] = var3.anInt901;
							this.aStringArray8[this.anInt314++] = var3.aString29;
							if (this.anInt189 == 0 && var3.anInt903 == 1) {
								this.anIntArray75[this.anInt314] += 10;
								this.anIntArray74[this.anInt314] += 5;
							}
							if (this.anInt189 == 0 && var3.anInt903 == 2) {
								this.anIntArray76[this.anInt314] = 60;
							}
						}
					}
					if (var3.anInt906 > anInt266 + 100) {
						this.method151(var3.anInt933 + 15, this.aBoolean45, var3);
						if (this.anInt287 > -1) {
							var4 = var3.anInt907 * 30 / var3.anInt908;
							if (var4 > 30) {
								var4 = 30;
							}
							Class1_Sub3_Sub2.method358(this.anInt288 - 3, this.anInt287 - 15, 65280, (byte) 93, var4, 5);
							Class1_Sub3_Sub2.method358(this.anInt288 - 3, this.anInt287 - 15 + var4, 16711680, (byte) 93, 30 - var4, 5);
						}
					}
					if (var3.anInt906 > anInt266 + 330) {
						this.method151(var3.anInt933 / 2, this.aBoolean45, var3);
						if (this.anInt287 > -1) {
							this.aClass1_Sub3_Sub2_Sub2Array3[var3.anInt905].method322(this.anInt288 - 12, this.anInt287 - 12, false);
							this.aClass1_Sub3_Sub2_Sub4_1.method362(this.anInt288 + 4, (byte) 6, 0, String.valueOf(var3.anInt904), this.anInt287);
							this.aClass1_Sub3_Sub2_Sub4_1.method362(this.anInt288 + 3, (byte) 6, 16777215, String.valueOf(var3.anInt904), this.anInt287 - 1);
						}
					}
				}
			}
			for (int var14 = 0; var14 < this.anInt314; ++var14) {
				var4 = this.anIntArray73[var14];
				int var15 = this.anIntArray74[var14];
				var6 = this.anIntArray76[var14];
				int var7 = this.anIntArray75[var14];
				boolean var8 = true;
				while (var8) {
					var8 = false;
					for (int var9 = 0; var9 < var14; ++var9) {
						if (var15 + 2 > this.anIntArray74[var9] - this.anIntArray75[var9] && var15 - var7 < this.anIntArray74[var9] + 2 && var4 - var6 < this.anIntArray73[var9] + this.anIntArray76[var9] && var4 + var6 > this.anIntArray73[var9] - this.anIntArray76[var9] && this.anIntArray74[var9] - this.anIntArray75[var9] < var15) {
							var15 = this.anIntArray74[var9] - this.anIntArray75[var9];
							var8 = true;
						}
					}
				}
				this.anInt287 = this.anIntArray73[var14];
				this.anInt288 = this.anIntArray74[var14] = var15;
				String var16 = this.aStringArray8[var14];
				if (this.anInt189 == 0) {
					int var10 = 16776960;
					if (this.anIntArray77[var14] < 6) {
						var10 = this.anIntArray69[this.anIntArray77[var14]];
					}
					if (this.anIntArray77[var14] == 6) {
						var10 = this.anInt211 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray77[var14] == 7) {
						var10 = this.anInt211 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray77[var14] == 8) {
						var10 = this.anInt211 % 20 < 10 ? 45056 : 8454016;
					}
					int var11;
					if (this.anIntArray77[var14] == 9) {
						var11 = 150 - this.anIntArray79[var14];
						if (var11 < 50) {
							var10 = 16711680 + 1280 * var11;
						} else if (var11 < 100) {
							var10 = 16776960 - 327680 * (var11 - 50);
						} else if (var11 < 150) {
							var10 = 65280 + 5 * (var11 - 100);
						}
					}
					if (this.anIntArray77[var14] == 10) {
						var11 = 150 - this.anIntArray79[var14];
						if (var11 < 50) {
							var10 = 16711680 + 5 * var11;
						} else if (var11 < 100) {
							var10 = 16711935 - 327680 * (var11 - 50);
						} else if (var11 < 150) {
							var10 = 255 + 327680 * (var11 - 100) - 5 * (var11 - 100);
						}
					}
					if (this.anIntArray77[var14] == 11) {
						var11 = 150 - this.anIntArray79[var14];
						if (var11 < 50) {
							var10 = 16777215 - 327685 * var11;
						} else if (var11 < 100) {
							var10 = 65280 + 327685 * (var11 - 50);
						} else if (var11 < 150) {
							var10 = 16777215 - 327680 * (var11 - 100);
						}
					}
					if (this.anIntArray78[var14] == 0) {
						this.aClass1_Sub3_Sub2_Sub4_3.method362(this.anInt288 + 1, (byte) 6, 0, var16, this.anInt287);
						this.aClass1_Sub3_Sub2_Sub4_3.method362(this.anInt288, (byte) 6, var10, var16, this.anInt287);
					}
					if (this.anIntArray78[var14] == 1) {
						this.aClass1_Sub3_Sub2_Sub4_3.method366(this.anInt211, (byte) 8, this.anInt287, this.anInt288 + 1, 0, var16);
						this.aClass1_Sub3_Sub2_Sub4_3.method366(this.anInt211, (byte) 8, this.anInt287, this.anInt288, var10, var16);
					}
					if (this.anIntArray78[var14] == 2) {
						var11 = this.aClass1_Sub3_Sub2_Sub4_3.method364(false, var16);
						int var12 = (150 - this.anIntArray79[var14]) * (var11 + 100) / 150;
						Class1_Sub3_Sub2.method356(334, 0, this.anInt287 + 50, 789, this.anInt287 - 50);
						this.aClass1_Sub3_Sub2_Sub4_3.method365(this.anInt287 + 50 - var12, this.anInt288 + 1, false, 0, var16);
						this.aClass1_Sub3_Sub2_Sub4_3.method365(this.anInt287 + 50 - var12, this.anInt288, false, var10, var16);
						Class1_Sub3_Sub2.method355(0);
					}
				} else {
					this.aClass1_Sub3_Sub2_Sub4_3.method362(this.anInt288 + 1, (byte) 6, 0, var16, this.anInt287);
					this.aClass1_Sub3_Sub2_Sub4_3.method362(this.anInt288, (byte) 6, 16776960, var16, this.anInt287);
				}
			}
		} catch (RuntimeException var13) {
			signlink.reporterror("83588, " + arg0 + ", " + var13.toString());
			throw new RuntimeException();
		}
	}

	public final void method77(byte arg0) {
		try {
			if (arg0 != -60) {
				this.aClass28ArrayArrayArray1 = null;
			}
			this.aClass1_Sub3_Sub3_6.method380((byte) -34, 231);
			if (this.anInt330 != -1) {
				this.anInt330 = -1;
				this.aBoolean59 = true;
				this.aBoolean49 = false;
				this.aBoolean68 = true;
			}
			if (this.anInt280 != -1) {
				this.anInt280 = -1;
				this.aBoolean60 = true;
				this.aBoolean49 = false;
			}
			this.anInt271 = -1;
		} catch (RuntimeException var3) {
			signlink.reporterror("46537, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public final void method78(int arg0) {
		try {
			if (arg0 != 0) {
				this.method67();
			}
			signlink.anInt761 = 0;
			signlink.midi = "stop";
		} catch (RuntimeException var3) {
			signlink.reporterror("44297, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public final void method79(int arg0) {
		try {
			int var2 = (this.aClass1_Sub1_Sub3_Sub2_1.anInt890 >> 7) + this.anInt169;
			int var3 = (this.aClass1_Sub1_Sub3_Sub2_1.anInt891 >> 7) + this.anInt170;
			if (arg0 != 39734) {
				this.aBoolean55 = !this.aBoolean55;
			}
			if (var2 >= 2944 && var2 < 3392 && var3 >= 3520 && var3 < 6400) {
				this.anInt316 = 1 + (var3 - 3520) / 8;
			} else if (var2 >= 2944 && var2 < 3392 && var3 >= 9920 && var3 < 12800) {
				this.anInt316 = 1 + (var3 - 9920) / 8;
			} else {
				this.anInt316 = 0;
			}
			this.anInt252 = 0;
			if (var2 >= 3328 && var2 < 3392 && var3 >= 3200 && var3 < 3264) {
				int var4 = var2 & 63;
				int var5 = var3 & 63;
				if (var4 >= 4 && var4 <= 29 && var5 >= 44 && var5 <= 58) {
					this.anInt252 = 1;
				}
				if (var4 >= 36 && var4 <= 61 && var5 >= 44 && var5 <= 58) {
					this.anInt252 = 1;
				}
				if (var4 >= 4 && var4 <= 29 && var5 >= 25 && var5 <= 39) {
					this.anInt252 = 1;
				}
				if (var4 >= 36 && var4 <= 61 && var5 >= 25 && var5 <= 39) {
					this.anInt252 = 1;
				}
				if (var4 >= 4 && var4 <= 29 && var5 >= 6 && var5 <= 20) {
					this.anInt252 = 1;
				}
				if (var4 >= 36 && var4 <= 61 && var5 >= 6 && var5 <= 20) {
					this.anInt252 = 1;
				}
			}
			if (this.anInt252 == 0 && var2 >= 3328 && var2 <= 3393 && var3 >= 3203 && var3 <= 3325) {
				this.anInt252 = 2;
			}
			this.anInt191 = 0;
			if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
				this.anInt191 = 1;
			}
			if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
				this.anInt191 = 1;
			}
			if (this.anInt191 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
				this.anInt191 = 0;
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("93797, " + arg0 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	public final void method80(int arg0) {
		try {
			if (arg0 > 0) {
				if (this.anInt210 != 0) {
					Class1_Sub3_Sub2_Sub4 var2 = this.aClass1_Sub3_Sub2_Sub4_2;
					int var3 = 0;
					if (this.anInt267 != 0) {
						var3 = 1;
					}
					for (int var4 = 0; var4 < 100; ++var4) {
						if (this.aStringArray7[var4] != null) {
							int var5 = this.anIntArray49[var4];
							int var6;
							if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.anInt164 == 0 || this.anInt164 == 1 && this.method199(-20, this.aStringArray6[var4]))) {
								var6 = 329 - var3 * 13;
								var2.method365(4, var6, false, 0, "From " + this.aStringArray6[var4] + ": " + this.aStringArray7[var4]);
								var2.method365(4, var6 - 1, false, 65535, "From " + this.aStringArray6[var4] + ": " + this.aStringArray7[var4]);
								++var3;
								if (var3 >= 5) {
									return;
								}
							}
							if (var5 == 5 && this.anInt164 < 2) {
								var6 = 329 - var3 * 13;
								var2.method365(4, var6, false, 0, this.aStringArray7[var4]);
								var2.method365(4, var6 - 1, false, 65535, this.aStringArray7[var4]);
								++var3;
								if (var3 >= 5) {
									return;
								}
							}
							if (var5 == 6 && this.anInt164 < 2) {
								var6 = 329 - var3 * 13;
								var2.method365(4, var6, false, 0, "To " + this.aStringArray6[var4] + ": " + this.aStringArray7[var4]);
								var2.method365(4, var6 - 1, false, 65535, "To " + this.aStringArray6[var4] + ": " + this.aStringArray7[var4]);
								++var3;
								if (var3 >= 5) {
									return;
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("71214, " + arg0 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	private final void method81(Class1_Sub3_Sub3 arg0, int arg1, int arg2) {
		try {
			for (int var4 = 0; var4 < this.anInt206; ++var4) {
				int var5 = this.anIntArray40[var4];
				Class1_Sub1_Sub3_Sub1 var6 = this.aClass1_Sub1_Sub3_Sub1Array1[var5];
				int var7 = arg0.method391();
				int var8;
				if ((var7 & 2) == 2) {
					var8 = arg0.method393();
					if (var8 == 65535) {
						var8 = -1;
					}
					if (var8 == var6.anInt915) {
						var6.anInt919 = 0;
					}
					int var9 = arg0.method391();
					if (var8 == -1 || var6.anInt915 == -1 || Class19.aClass19Array1[var8].anInt545 > Class19.aClass19Array1[var6.anInt915].anInt545 || Class19.aClass19Array1[var6.anInt915].anInt545 == 0) {
						var6.anInt915 = var8;
						var6.anInt916 = 0;
						var6.anInt917 = 0;
						var6.anInt918 = var9;
						var6.anInt919 = 0;
					}
				}
				if ((var7 & 4) == 4) {
					var6.anInt909 = arg0.method393();
					if (var6.anInt909 == 65535) {
						var6.anInt909 = -1;
					}
				}
				if ((var7 & 8) == 8) {
					var6.aString29 = arg0.method398();
					var6.anInt901 = 100;
				}
				if ((var7 & 16) == 16) {
					var6.anInt904 = arg0.method391();
					var6.anInt905 = arg0.method391();
					var6.anInt906 = anInt266 + 400;
					var6.anInt907 = arg0.method391();
					var6.anInt908 = arg0.method391();
				}
				if ((var7 & 32) == 32) {
					var6.aClass3_1 = Class3.method32(arg0.method393());
					var6.anInt896 = var6.aClass3_1.anInt70;
					var6.anInt897 = var6.aClass3_1.anInt71;
					var6.anInt898 = var6.aClass3_1.anInt72;
					var6.anInt899 = var6.aClass3_1.anInt73;
					var6.anInt894 = var6.aClass3_1.anInt69;
				}
				if ((var7 & 64) == 64) {
					var6.anInt920 = arg0.method393();
					var8 = arg0.method396();
					var6.anInt924 = var8 >> 16;
					var6.anInt923 = anInt266 + (var8 & 65535);
					var6.anInt921 = 0;
					var6.anInt922 = 0;
					if (var6.anInt923 > anInt266) {
						var6.anInt921 = -1;
					}
					if (var6.anInt920 == 65535) {
						var6.anInt920 = -1;
					}
				}
				if ((var7 & 128) == 128) {
					var6.anInt910 = arg0.method393();
					var6.anInt911 = arg0.method393();
				}
			}
			if (arg2 <= 0) {
				this.anInt165 = this.aClass38_1.method532();
			}
		} catch (RuntimeException var10) {
			signlink.reporterror("52952, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var10.toString());
			throw new RuntimeException();
		}
	}

	public final void method82(long arg0, byte arg1) {
		try {
			if (arg0 != 0L) {
				if (this.anInt186 >= 100) {
					this.method172(0, "Your ignore list is full. Max of 100 hit", (byte) 4, "");
				} else {
					String var4 = Class40.method542(0, Class40.method539(arg0, false));
					for (int var5 = 0; var5 < this.anInt186; ++var5) {
						if (this.aLongArray3[var5] == arg0) {
							this.method172(0, var4 + " is already on your ignore list", (byte) 4, "");
							return;
						}
					}
					for (int var6 = 0; var6 < this.anInt312; ++var6) {
						if (this.aLongArray4[var6] == arg0) {
							this.method172(0, "Please remove " + var4 + " from your friend list first", (byte) 4, "");
							return;
						}
					}
					this.aLongArray3[this.anInt186++] = arg0;
					this.aBoolean59 = true;
					if (arg1 == 3) {
						this.aClass1_Sub3_Sub3_6.method380((byte) -34, 79);
						this.aClass1_Sub3_Sub3_6.method387(true, arg0);
					}
				}
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("96582, " + arg0 + ", " + arg1 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	public final void method83(byte arg0, Class1_Sub3_Sub3 arg1, int arg2) {
		try {
			if (arg0 != -45) {
				this.method67();
			}
			int var4;
			int var5;
			int var6;
			int var7;
			int var8;
			int var9;
			int var10;
			int var11;
			int var14;
			int var15;
			int var16;
			if (arg2 != 59 && arg2 != 76) {
				if (arg2 == 42) {
					var4 = arg1.method391();
					var5 = this.anInt222 + (var4 >> 4 & 7);
					var6 = this.anInt223 + (var4 & 7);
					var7 = arg1.method391();
					var8 = var7 >> 2;
					var9 = this.anIntArray80[var8];
					var10 = arg1.method393();
					if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
						var11 = 0;
						if (var9 == 0) {
							var11 = this.aClass33_1.method494(this.anInt231, var5, var6);
						}
						if (var9 == 1) {
							var11 = this.aClass33_1.method495(this.anInt231, var6, 3, var5);
						}
						if (var9 == 2) {
							var11 = this.aClass33_1.method496(this.anInt231, var5, var6);
						}
						if (var9 == 3) {
							var11 = this.aClass33_1.method497(this.anInt231, var5, var6);
						}
						if (var11 != 0) {
							Class1_Sub6 var39 = new Class1_Sub6(false, var11 >> 14 & 32767, this.anInt231, 0, var9, Class19.aClass19Array1[var10], var6, var5);
							this.aClass28_1.method453(var39);
						}
					}
				} else {
					Class1_Sub7 var33;
					if (arg2 == 223) {
						var4 = arg1.method391();
						var5 = this.anInt222 + (var4 >> 4 & 7);
						var6 = this.anInt223 + (var4 & 7);
						var7 = arg1.method393();
						var8 = arg1.method393();
						if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
							var33 = new Class1_Sub7();
							var33.anInt773 = var7;
							var33.anInt774 = var8;
							if (this.aClass28ArrayArrayArray1[this.anInt231][var5][var6] == null) {
								this.aClass28ArrayArrayArray1[this.anInt231][var5][var6] = new Class28(0);
							}
							this.aClass28ArrayArrayArray1[this.anInt231][var5][var6].method453(var33);
							this.method184(var5, var6);
						}
					} else if (arg2 == 49) {
						var4 = arg1.method391();
						var5 = this.anInt222 + (var4 >> 4 & 7);
						var6 = this.anInt223 + (var4 & 7);
						var7 = arg1.method393();
						if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
							Class28 var31 = this.aClass28ArrayArrayArray1[this.anInt231][var5][var6];
							if (var31 != null) {
								for (var33 = (Class1_Sub7) var31.method456(); var33 != null; var33 = (Class1_Sub7) var31.method458(551)) {
									if (var33.anInt773 == (var7 & 32767)) {
										var33.method567();
										break;
									}
								}
								if (var31.method456() == null) {
									this.aClass28ArrayArrayArray1[this.anInt231][var5][var6] = null;
								}
								this.method184(var5, var6);
							}
						}
					} else {
						int var37;
						int var38;
						if (arg2 == 69) {
							var4 = arg1.method391();
							var5 = this.anInt222 + (var4 >> 4 & 7);
							var6 = this.anInt223 + (var4 & 7);
							var7 = var5 + arg1.method392();
							var8 = var6 + arg1.method392();
							var9 = arg1.method394();
							var10 = arg1.method393();
							var11 = arg1.method391();
							var37 = arg1.method391();
							var38 = arg1.method393();
							var14 = arg1.method393();
							var15 = arg1.method391();
							var16 = arg1.method391();
							if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104 && var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
								var5 = var5 * 128 + 64;
								var6 = var6 * 128 + 64;
								var7 = var7 * 128 + 64;
								var8 = var8 * 128 + 64;
								Class1_Sub1_Sub1 var44 = new Class1_Sub1_Sub1(var37, var15, var6, var14 + anInt266, this.anInt231, var9, var38 + anInt266, var16, 0, this.method94(this.anInt231, var5, (byte) 5, var6) - var11, var10, var5);
								var44.method19(this.method94(this.anInt231, var7, (byte) 5, var8) - var37, var8, var7, -855, var38 + anInt266);
								this.aClass28_3.method453(var44);
							}
						} else if (arg2 == 191) {
							var4 = arg1.method391();
							var5 = this.anInt222 + (var4 >> 4 & 7);
							var6 = this.anInt223 + (var4 & 7);
							var7 = arg1.method393();
							var8 = arg1.method391();
							var9 = arg1.method393();
							if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
								var5 = var5 * 128 + 64;
								var6 = var6 * 128 + 64;
								Class1_Sub1_Sub2 var35 = new Class1_Sub1_Sub2(var5, var7, false, var6, var9, this.method94(this.anInt231, var5, (byte) 5, var6) - var8, this.anInt231, anInt266);
								this.aClass28_5.method453(var35);
							}
						} else if (arg2 == 50) {
							var4 = arg1.method391();
							var5 = this.anInt222 + (var4 >> 4 & 7);
							var6 = this.anInt223 + (var4 & 7);
							var7 = arg1.method393();
							var8 = arg1.method393();
							var9 = arg1.method393();
							if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104 && var9 != this.anInt152) {
								Class1_Sub7 var34 = new Class1_Sub7();
								var34.anInt773 = var7;
								var34.anInt774 = var8;
								if (this.aClass28ArrayArrayArray1[this.anInt231][var5][var6] == null) {
									this.aClass28ArrayArrayArray1[this.anInt231][var5][var6] = new Class28(0);
								}
								this.aClass28ArrayArrayArray1[this.anInt231][var5][var6].method453(var34);
								this.method184(var5, var6);
							}
						} else {
							if (arg2 == 23) {
								var4 = arg1.method391();
								var5 = this.anInt222 + (var4 >> 4 & 7);
								var6 = this.anInt223 + (var4 & 7);
								var7 = arg1.method391();
								var8 = var7 >> 2;
								var9 = var7 & 3;
								var10 = this.anIntArray80[var8];
								var11 = arg1.method393();
								var37 = arg1.method393();
								var38 = arg1.method393();
								var14 = arg1.method393();
								byte var40 = arg1.method392();
								byte var41 = arg1.method392();
								byte var42 = arg1.method392();
								byte var43 = arg1.method392();
								Class1_Sub1_Sub3_Sub2 var19;
								if (var14 == this.anInt152) {
									var19 = this.aClass1_Sub1_Sub3_Sub2_1;
								} else {
									var19 = this.aClass1_Sub1_Sub3_Sub2Array1[var14];
								}
								if (var19 != null) {
									Class1_Sub5 var20 = new Class1_Sub5(this.anInt231, var9, var6, var37 + anInt266, 2, var8, -1, var5, var10);
									this.aClass28_2.method453(var20);
									Class1_Sub5 var21 = new Class1_Sub5(this.anInt231, var9, var6, var38 + anInt266, 2, var8, var11, var5, var10);
									this.aClass28_2.method453(var21);
									int var22 = this.anIntArrayArrayArray3[this.anInt231][var5][var6];
									int var23 = this.anIntArrayArrayArray3[this.anInt231][var5 + 1][var6];
									int var24 = this.anIntArrayArrayArray3[this.anInt231][var5 + 1][var6 + 1];
									int var25 = this.anIntArrayArrayArray3[this.anInt231][var5][var6 + 1];
									Class2 var26 = Class2.method23(var11);
									var19.anInt942 = var37 + anInt266;
									var19.anInt943 = var38 + anInt266;
									var19.aClass1_Sub3_Sub1_11 = var26.method26(var8, var9, var22, var23, var24, var25, -1);
									int var27 = var26.anInt43;
									int var28 = var26.anInt44;
									if (var9 == 1 || var9 == 3) {
										var27 = var26.anInt44;
										var28 = var26.anInt43;
									}
									var19.anInt944 = var5 * 128 + var27 * 64;
									var19.anInt946 = var6 * 128 + var28 * 64;
									var19.anInt945 = this.method94(this.anInt231, var19.anInt944, (byte) 5, var19.anInt946);
									byte var29;
									if (var40 > var42) {
										var29 = var40;
										var40 = var42;
										var42 = var29;
									}
									if (var41 > var43) {
										var29 = var41;
										var41 = var43;
										var43 = var29;
									}
									var19.anInt947 = var5 + var40;
									var19.anInt949 = var5 + var42;
									var19.anInt948 = var6 + var41;
									var19.anInt950 = var6 + var43;
								}
							}
							if (arg2 == 151) {
								var4 = arg1.method391();
								var5 = this.anInt222 + (var4 >> 4 & 7);
								var6 = this.anInt223 + (var4 & 7);
								var7 = arg1.method393();
								var8 = arg1.method393();
								var9 = arg1.method393();
								if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
									Class28 var32 = this.aClass28ArrayArrayArray1[this.anInt231][var5][var6];
									if (var32 != null) {
										for (Class1_Sub7 var36 = (Class1_Sub7) var32.method456(); var36 != null; var36 = (Class1_Sub7) var32.method458(551)) {
											if (var36.anInt773 == (var7 & 32767) && var36.anInt774 == var8) {
												var36.anInt774 = var9;
												break;
											}
										}
										this.method184(var5, var6);
									}
								}
							}
						}
					}
				}
			} else {
				var4 = arg1.method391();
				var5 = this.anInt222 + (var4 >> 4 & 7);
				var6 = this.anInt223 + (var4 & 7);
				var7 = arg1.method391();
				var8 = var7 >> 2;
				var9 = var7 & 3;
				var10 = this.anIntArray80[var8];
				if (arg2 == 76) {
					var11 = -1;
				} else {
					var11 = arg1.method393();
				}
				if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
					Class1_Sub4 var12 = null;
					for (Class1_Sub4 var13 = (Class1_Sub4) this.aClass28_4.method456(); var13 != null; var13 = (Class1_Sub4) this.aClass28_4.method458(551)) {
						if (var13.anInt593 == this.anInt231 && var13.anInt595 == var5 && var13.anInt596 == var6 && var13.anInt594 == var10) {
							var12 = var13;
							break;
						}
					}
					if (var12 == null) {
						var14 = 0;
						var15 = -1;
						var16 = 0;
						int var17 = 0;
						if (var10 == 0) {
							var14 = this.aClass33_1.method494(this.anInt231, var5, var6);
						}
						if (var10 == 1) {
							var14 = this.aClass33_1.method495(this.anInt231, var6, 3, var5);
						}
						if (var10 == 2) {
							var14 = this.aClass33_1.method496(this.anInt231, var5, var6);
						}
						if (var10 == 3) {
							var14 = this.aClass33_1.method497(this.anInt231, var5, var6);
						}
						if (var14 != 0) {
							int var18 = this.aClass33_1.method498(this.anInt231, var5, var6, var14);
							var15 = var14 >> 14 & 32767;
							var16 = var18 & 31;
							var17 = var18 >> 6;
						}
						var12 = new Class1_Sub4();
						var12.anInt593 = this.anInt231;
						var12.anInt594 = var10;
						var12.anInt595 = var5;
						var12.anInt596 = var6;
						var12.anInt600 = var15;
						var12.anInt602 = var16;
						var12.anInt601 = var17;
						this.aClass28_4.method453(var12);
					}
					var12.anInt597 = var11;
					var12.anInt599 = var8;
					var12.anInt598 = var9;
					this.method160(var9, var5, var6, var10, var11, var8, -27819, this.anInt231);
				}
			}
		} catch (RuntimeException var30) {
			signlink.reporterror("90582, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var30.toString());
			throw new RuntimeException();
		}
	}

	public final int method84(byte arg0) {
		try {
			if (arg0 != 106) {
				this.anInt179 = this.aClass1_Sub3_Sub3_5.method391();
			}
			int var2 = 3;
			if (this.anInt325 < 310) {
				int var3 = this.anInt322 >> 7;
				int var4 = this.anInt324 >> 7;
				int var5 = this.aClass1_Sub1_Sub3_Sub2_1.anInt890 >> 7;
				int var6 = this.aClass1_Sub1_Sub3_Sub2_1.anInt891 >> 7;
				if ((this.aByteArrayArrayArray7[this.anInt231][var3][var4] & 4) != 0) {
					var2 = this.anInt231;
				}
				int var7;
				if (var5 > var3) {
					var7 = var5 - var3;
				} else {
					var7 = var3 - var5;
				}
				int var8;
				if (var6 > var4) {
					var8 = var6 - var4;
				} else {
					var8 = var4 - var6;
				}
				int var9;
				int var10;
				if (var7 > var8) {
					var9 = var8 * 65536 / var7;
					var10 = 32768;
					while (var3 != var5) {
						if (var3 < var5) {
							++var3;
						} else if (var3 > var5) {
							--var3;
						}
						if ((this.aByteArrayArrayArray7[this.anInt231][var3][var4] & 4) != 0) {
							var2 = this.anInt231;
						}
						var10 += var9;
						if (var10 >= 65536) {
							var10 -= 65536;
							if (var4 < var6) {
								++var4;
							} else if (var4 > var6) {
								--var4;
							}
							if ((this.aByteArrayArrayArray7[this.anInt231][var3][var4] & 4) != 0) {
								var2 = this.anInt231;
							}
						}
					}
				} else {
					var9 = var7 * 65536 / var8;
					var10 = 32768;
					while (var4 != var6) {
						if (var4 < var6) {
							++var4;
						} else if (var4 > var6) {
							--var4;
						}
						if ((this.aByteArrayArrayArray7[this.anInt231][var3][var4] & 4) != 0) {
							var2 = this.anInt231;
						}
						var10 += var9;
						if (var10 >= 65536) {
							var10 -= 65536;
							if (var3 < var5) {
								++var3;
							} else if (var3 > var5) {
								--var3;
							}
							if ((this.aByteArrayArrayArray7[this.anInt231][var3][var4] & 4) != 0) {
								var2 = this.anInt231;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray7[this.anInt231][this.aClass1_Sub1_Sub3_Sub2_1.anInt890 >> 7][this.aClass1_Sub1_Sub3_Sub2_1.anInt891 >> 7] & 4) != 0) {
				var2 = this.anInt231;
			}
			return var2;
		} catch (RuntimeException var11) {
			signlink.reporterror("50986, " + arg0 + ", " + var11.toString());
			throw new RuntimeException();
		}
	}

	public final int method85(int arg0) {
		try {
			int var2 = this.method94(this.anInt231, this.anInt322, (byte) 5, this.anInt324);
			this.anInt178 += arg0;
			return var2 - this.anInt323 < 800 && (this.aByteArrayArrayArray7[this.anInt231][this.anInt322 >> 7][this.anInt324 >> 7] & 4) != 0 ? this.anInt231 : 3;
		} catch (RuntimeException var3) {
			signlink.reporterror("97355, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public final void method86(int arg0) {
		try {
			++this.anInt211;
			this.method93(284);
			this.method114(false);
			this.anInt178 += arg0;
			this.method147((byte) -26);
			this.method166((byte) 106);
			this.method190(254);
			int var2;
			int var3;
			int var4;
			if (!this.aBoolean61) {
				var2 = this.anInt199;
				if (this.anInt251 / 256 > var2) {
					var2 = this.anInt251 / 256;
				}
				if (this.aBooleanArray1[4] && this.anIntArray63[4] + 128 > var2) {
					var2 = this.anIntArray63[4] + 128;
				}
				var3 = this.anInt200 + this.anInt334 & 2047;
				this.method100(this.method94(this.anInt231, this.aClass1_Sub1_Sub3_Sub2_1.anInt890, (byte) 5, this.aClass1_Sub1_Sub3_Sub2_1.anInt891) - 50, this.anInt243, var3, var2, 16418, this.anInt244, 600 + var2 * 3);
				++anInt193;
				if (anInt193 > 1802) {
					anInt193 = 0;
					this.aClass1_Sub3_Sub3_6.method380((byte) -34, 146);
					this.aClass1_Sub3_Sub3_6.method381(0);
					var4 = this.aClass1_Sub3_Sub3_6.anInt561;
					this.aClass1_Sub3_Sub3_6.method382(29711);
					this.aClass1_Sub3_Sub3_6.method381(70);
					this.aClass1_Sub3_Sub3_6.method381((int) (Math.random() * 256.0D));
					this.aClass1_Sub3_Sub3_6.method381(242);
					this.aClass1_Sub3_Sub3_6.method381(186);
					this.aClass1_Sub3_Sub3_6.method381(39);
					this.aClass1_Sub3_Sub3_6.method381(61);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub3_Sub3_6.method381(13);
					}
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub3_Sub3_6.method382(57856);
					}
					this.aClass1_Sub3_Sub3_6.method382((int) (Math.random() * 65536.0D));
					this.aClass1_Sub3_Sub3_6.method390(0, this.aClass1_Sub3_Sub3_6.anInt561 - var4);
				}
			}
			if (!this.aBoolean61) {
				var2 = this.method84((byte) 106);
			} else {
				var2 = this.method85(0);
			}
			var3 = this.anInt322;
			var4 = this.anInt323;
			int var5 = this.anInt324;
			int var6 = this.anInt325;
			int var7 = this.anInt326;
			int var9;
			for (int var8 = 0; var8 < 5; ++var8) {
				if (this.aBooleanArray1[var8]) {
					var9 = (int) (Math.random() * (double) (this.anIntArray62[var8] * 2 + 1) - (double) this.anIntArray62[var8] + Math.sin((double) this.anIntArray68[var8] * ((double) this.anIntArray88[var8] / 100.0D)) * (double) this.anIntArray63[var8]);
					if (var8 == 0) {
						this.anInt322 += var9;
					}
					if (var8 == 1) {
						this.anInt323 += var9;
					}
					if (var8 == 2) {
						this.anInt324 += var9;
					}
					if (var8 == 3) {
						this.anInt326 = this.anInt326 + var9 & 2047;
					}
					if (var8 == 4) {
						this.anInt325 += var9;
						if (this.anInt325 < 128) {
							this.anInt325 = 128;
						}
						if (this.anInt325 > 383) {
							this.anInt325 = 383;
						}
					}
				}
			}
			var9 = Class1_Sub3_Sub2_Sub1.anInt434;
			Class1_Sub3_Sub1.aBoolean85 = true;
			Class1_Sub3_Sub1.anInt378 = 0;
			Class1_Sub3_Sub1.anInt376 = super.anInt135 - 8;
			Class1_Sub3_Sub1.anInt377 = super.anInt136 - 11;
			Class1_Sub3_Sub2.method357(this.anInt336);
			this.aClass33_1.method507(this.anInt326, this.anInt322, var2, this.anInt325, this.anInt323, this.anInt324, 0);
			this.aClass33_1.method481(0);
			this.method76(this.anInt194);
			this.method194((byte) -11);
			this.method102(var9, true);
			this.method145(9);
			this.aClass32_27.method464(11, super.aGraphics2, 8, 5193);
			this.anInt322 = var3;
			this.anInt323 = var4;
			this.anInt324 = var5;
			this.anInt325 = var6;
			this.anInt326 = var7;
		} catch (RuntimeException var10) {
			signlink.reporterror("36672, " + arg0 + ", " + var10.toString());
			throw new RuntimeException();
		}
	}

	public final void method87(boolean arg0) {
		try {
			this.aBoolean40 = false;
			if (arg0) {
				while (this.aBoolean41) {
					try {
						Thread.sleep(50L);
					} catch (Exception var12) {
					}
					Object var5 = this.anObject1;
					String var2;
					int var3;
					int var4;
					synchronized (this.anObject1) {
						var2 = this.aString12;
						var3 = this.anInt269;
						var4 = this.anInt144;
						this.aString12 = null;
						this.anInt269 = 0;
						this.anInt144 = 0;
					}
					if (var2 != null) {
						byte[] var15 = signlink.cacheload(var2 + ".mid");
						int var6;
						if (var15 != null && var3 != 12345678) {
							this.aCRC32_1.reset();
							this.aCRC32_1.update(var15);
							var6 = (int) this.aCRC32_1.getValue();
							if (var6 != var3) {
								var15 = null;
							}
						}
						if (var15 == null) {
							try {
								DataInputStream var16 = this.method155(var2 + "_" + var3 + ".mid");
								var15 = new byte[var4];
								int var8;
								for (int var7 = 0; var7 < var4; var7 += var8) {
									var8 = var16.read(var15, var7, var4 - var7);
									if (var8 == -1) {
										byte[] var9 = new byte[var7];
										for (int var10 = 0; var10 < var7; ++var10) {
											var9[var10] = var15[var10];
										}
										var15 = var9;
										var4 = var7;
										break;
									}
								}
								var16.close();
								signlink.cachesave(var2 + ".mid", var15);
							} catch (Exception var13) {
							}
						}
						if (var15 == null) {
							return;
						}
						var6 = (new Class1_Sub3_Sub3(363, var15)).method396();
						byte[] var17 = new byte[var6];
						Class34.method519(var17, var6, var15, var4, 4);
						this.method113(var17, 625, var6, true);
					}
				}
			}
		} catch (RuntimeException var14) {
			signlink.reporterror("94943, " + arg0 + ", " + var14.toString());
			throw new RuntimeException();
		}
	}

	public static final void method88(boolean arg0) {
		try {
			if (!arg0) {
				aBoolean48 = !aBoolean48;
			}
			Class33.aBoolean143 = true;
			Class1_Sub3_Sub2_Sub1.aBoolean96 = true;
			aBoolean53 = true;
			Class4.aBoolean23 = true;
		} catch (RuntimeException var2) {
			signlink.reporterror("70501, " + arg0 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	public final void method89(boolean arg0) {
		try {
			short var2 = 256;
			int var3;
			if (this.anInt227 > 0) {
				for (var3 = 0; var3 < 256; ++var3) {
					if (this.anInt227 > 768) {
						this.anIntArray50[var3] = this.method149(this.anIntArray51[var3], 1024 - this.anInt227, this.anIntArray52[var3], 997);
					} else if (this.anInt227 > 256) {
						this.anIntArray50[var3] = this.anIntArray52[var3];
					} else {
						this.anIntArray50[var3] = this.method149(this.anIntArray52[var3], 256 - this.anInt227, this.anIntArray51[var3], 997);
					}
				}
			} else if (this.anInt228 > 0) {
				for (var3 = 0; var3 < 256; ++var3) {
					if (this.anInt228 > 768) {
						this.anIntArray50[var3] = this.method149(this.anIntArray51[var3], 1024 - this.anInt228, this.anIntArray53[var3], 997);
					} else if (this.anInt228 > 256) {
						this.anIntArray50[var3] = this.anIntArray53[var3];
					} else {
						this.anIntArray50[var3] = this.method149(this.anIntArray53[var3], 256 - this.anInt228, this.anIntArray51[var3], 997);
					}
				}
			} else {
				for (var3 = 0; var3 < 256; ++var3) {
					this.anIntArray50[var3] = this.anIntArray51[var3];
				}
			}
			for (var3 = 0; var3 < 33920; ++var3) {
				this.aClass32_19.anIntArray197[var3] = this.aClass1_Sub3_Sub2_Sub2_3.anIntArray148[var3];
			}
			int var4 = 0;
			int var5 = 1152;
			int var7;
			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			int var13;
			for (int var6 = 1; var6 < var2 - 1; ++var6) {
				var7 = this.anIntArray43[var6] * (var2 - var6) / var2;
				var8 = 22 + var7;
				if (var8 < 0) {
					var8 = 0;
				}
				var4 += var8;
				for (var9 = var8; var9 < 128; ++var9) {
					var10 = this.anIntArray64[var4++];
					if (var10 != 0) {
						var11 = var10;
						var12 = 256 - var10;
						var10 = this.anIntArray50[var10];
						var13 = this.aClass32_19.anIntArray197[var5];
						this.aClass32_19.anIntArray197[var5++] = ((var10 & 16711935) * var11 + (var13 & 16711935) * var12 & -16711936) + ((var10 & 65280) * var11 + (var13 & 65280) * var12 & 16711680) >> 8;
					} else {
						++var5;
					}
				}
				var5 += var8;
			}
			this.aClass32_19.method464(0, super.aGraphics2, 0, 5193);
			for (var7 = 0; var7 < 33920; ++var7) {
				this.aClass32_20.anIntArray197[var7] = this.aClass1_Sub3_Sub2_Sub2_4.anIntArray148[var7];
			}
			var4 = 0;
			var5 = 1176;
			for (var8 = 1; var8 < var2 - 1; ++var8) {
				var9 = this.anIntArray43[var8] * (var2 - var8) / var2;
				var10 = 103 - var9;
				var5 += var9;
				for (var11 = 0; var11 < var10; ++var11) {
					var12 = this.anIntArray64[var4++];
					if (var12 != 0) {
						var13 = var12;
						int var14 = 256 - var12;
						var12 = this.anIntArray50[var12];
						int var15 = this.aClass32_20.anIntArray197[var5];
						this.aClass32_20.anIntArray197[var5++] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & 65280) * var13 + (var15 & 65280) * var14 & 16711680) >> 8;
					} else {
						++var5;
					}
				}
				var4 += 128 - var10;
				var5 += 128 - var10 - var9;
			}
			if (!arg0) {
				anInt268 = 281;
			}
			this.aClass32_20.method464(0, super.aGraphics2, 661, 5193);
		} catch (RuntimeException var16) {
			signlink.reporterror("82128, " + arg0 + ", " + var16.toString());
			throw new RuntimeException();
		}
	}

	public final void method90(int arg0, int arg1, int arg2, Class15 arg3, int arg4, int arg5, int arg6) {
		try {
			if (arg3.anInt472 == 0 && arg3.anIntArray153 != null && !arg3.aBoolean106) {
				if (arg1 >= arg5 && arg0 >= arg2 && arg1 <= arg5 + arg3.anInt475 && arg0 <= arg2 + arg3.anInt476) {
					int var8 = arg3.anIntArray153.length;
					if (arg4 != 5082) {
						this.anInt179 = this.aClass1_Sub3_Sub3_5.method391();
					}
					for (int var9 = 0; var9 < var8; ++var9) {
						int var10 = arg3.anIntArray154[var9] + arg5;
						int var11 = arg3.anIntArray155[var9] + arg2 - arg6;
						Class15 var12 = Class15.aClass15Array1[arg3.anIntArray153[var9]];
						int var21 = var10 + var12.anInt477;
						int var22 = var11 + var12.anInt478;
						if ((var12.anInt479 >= 0 || var12.anInt487 != 0) && arg1 >= var21 && arg0 >= var22 && arg1 < var21 + var12.anInt475 && arg0 < var22 + var12.anInt476) {
							if (var12.anInt479 >= 0) {
								this.anInt225 = var12.anInt479;
							} else {
								this.anInt225 = var12.anInt470;
							}
						}
						if (var12.anInt472 == 0) {
							this.method90(arg0, arg1, var22, var12, 5082, var21, var12.anInt481);
							if (var12.anInt480 > var12.anInt476) {
								this.method158(arg1, 0, arg0, var12.anInt480, var12.anInt476, true, var21 + var12.anInt475, var22, var12);
							}
						} else {
							if (var12.anInt473 == 1 && arg1 >= var21 && arg0 >= var22 && arg1 < var21 + var12.anInt475 && arg0 < var22 + var12.anInt476) {
								boolean var13 = false;
								if (var12.anInt474 != 0) {
									var13 = this.method180(var12, (byte) 8);
								}
								if (!var13) {
									this.aStringArray5[this.anInt304] = var12.aString24;
									this.anIntArray86[this.anInt304] = 951;
									this.anIntArray85[this.anInt304] = var12.anInt470;
									++this.anInt304;
								}
							}
							if (var12.anInt473 == 2 && this.anInt291 == 0 && arg1 >= var21 && arg0 >= var22 && arg1 < var21 + var12.anInt475 && arg0 < var22 + var12.anInt476) {
								String var23 = var12.aString22;
								if (var23.indexOf(" ") != -1) {
									var23 = var23.substring(0, var23.indexOf(" "));
								}
								this.aStringArray5[this.anInt304] = var23 + " @gre@" + var12.aString23;
								this.anIntArray86[this.anInt304] = 930;
								this.anIntArray85[this.anInt304] = var12.anInt470;
								++this.anInt304;
							}
							if (var12.anInt473 == 3 && arg1 >= var21 && arg0 >= var22 && arg1 < var21 + var12.anInt475 && arg0 < var22 + var12.anInt476) {
								this.aStringArray5[this.anInt304] = "Close";
								this.anIntArray86[this.anInt304] = 947;
								this.anIntArray85[this.anInt304] = var12.anInt470;
								++this.anInt304;
							}
							if (var12.anInt473 == 4 && arg1 >= var21 && arg0 >= var22 && arg1 < var21 + var12.anInt475 && arg0 < var22 + var12.anInt476) {
								this.aStringArray5[this.anInt304] = var12.aString24;
								this.anIntArray86[this.anInt304] = 465;
								this.anIntArray85[this.anInt304] = var12.anInt470;
								++this.anInt304;
							}
							if (var12.anInt473 == 5 && arg1 >= var21 && arg0 >= var22 && arg1 < var21 + var12.anInt475 && arg0 < var22 + var12.anInt476) {
								this.aStringArray5[this.anInt304] = var12.aString24;
								this.anIntArray86[this.anInt304] = 960;
								this.anIntArray85[this.anInt304] = var12.anInt470;
								++this.anInt304;
							}
							if (var12.anInt473 == 6 && !this.aBoolean49 && arg1 >= var21 && arg0 >= var22 && arg1 < var21 + var12.anInt475 && arg0 < var22 + var12.anInt476) {
								this.aStringArray5[this.anInt304] = var12.aString24;
								this.anIntArray86[this.anInt304] = 44;
								this.anIntArray85[this.anInt304] = var12.anInt470;
								++this.anInt304;
							}
							if (var12.anInt472 == 2) {
								int var24 = 0;
								for (int var14 = 0; var14 < var12.anInt476; ++var14) {
									for (int var15 = 0; var15 < var12.anInt475; ++var15) {
										int var16 = var21 + var15 * (32 + var12.anInt483);
										int var17 = var22 + var14 * (32 + var12.anInt484);
										if (var24 < 20) {
											var16 += var12.anIntArray156[var24];
											var17 += var12.anIntArray157[var24];
										}
										if (arg1 >= var16 && arg0 >= var17 && arg1 < var16 + 32 && arg0 < var17 + 32) {
											this.anInt310 = var24;
											this.anInt311 = var12.anInt470;
											if (var12.anIntArray149[var24] > 0) {
												Class5 var18 = Class5.method54(var12.anIntArray149[var24] - 1);
												if (this.anInt281 == 1 && var12.aBoolean109) {
													if (var12.anInt470 != this.anInt283 || var24 != this.anInt282) {
														this.aStringArray5[this.anInt304] = "Use " + this.aString10 + " with @lre@" + var18.aString3;
														this.anIntArray86[this.anInt304] = 881;
														this.anIntArray87[this.anInt304] = var18.anInt103;
														this.anIntArray84[this.anInt304] = var24;
														this.anIntArray85[this.anInt304] = var12.anInt470;
														++this.anInt304;
													}
												} else if (this.anInt291 == 1 && var12.aBoolean109) {
													if ((this.anInt293 & 16) == 16) {
														this.aStringArray5[this.anInt304] = this.aString11 + " @lre@" + var18.aString3;
														this.anIntArray86[this.anInt304] = 391;
														this.anIntArray87[this.anInt304] = var18.anInt103;
														this.anIntArray84[this.anInt304] = var24;
														this.anIntArray85[this.anInt304] = var12.anInt470;
														++this.anInt304;
													}
												} else {
													int var19;
													if (var12.aBoolean109) {
														for (var19 = 4; var19 >= 3; --var19) {
															if (var18.aStringArray4 != null && var18.aStringArray4[var19] != null) {
																this.aStringArray5[this.anInt304] = var18.aStringArray4[var19] + " @lre@" + var18.aString3;
																if (var19 == 3) {
																	this.anIntArray86[this.anInt304] = 478;
																}
																if (var19 == 4) {
																	this.anIntArray86[this.anInt304] = 347;
																}
																this.anIntArray87[this.anInt304] = var18.anInt103;
																this.anIntArray84[this.anInt304] = var24;
																this.anIntArray85[this.anInt304] = var12.anInt470;
																++this.anInt304;
															} else if (var19 == 4) {
																this.aStringArray5[this.anInt304] = "Drop @lre@" + var18.aString3;
																this.anIntArray86[this.anInt304] = 347;
																this.anIntArray87[this.anInt304] = var18.anInt103;
																this.anIntArray84[this.anInt304] = var24;
																this.anIntArray85[this.anInt304] = var12.anInt470;
																++this.anInt304;
															}
														}
													}
													if (var12.aBoolean110) {
														this.aStringArray5[this.anInt304] = "Use @lre@" + var18.aString3;
														this.anIntArray86[this.anInt304] = 188;
														this.anIntArray87[this.anInt304] = var18.anInt103;
														this.anIntArray84[this.anInt304] = var24;
														this.anIntArray85[this.anInt304] = var12.anInt470;
														++this.anInt304;
													}
													if (var12.aBoolean109 && var18.aStringArray4 != null) {
														for (var19 = 2; var19 >= 0; --var19) {
															if (var18.aStringArray4[var19] != null) {
																this.aStringArray5[this.anInt304] = var18.aStringArray4[var19] + " @lre@" + var18.aString3;
																if (var19 == 0) {
																	this.anIntArray86[this.anInt304] = 405;
																}
																if (var19 == 1) {
																	this.anIntArray86[this.anInt304] = 38;
																}
																if (var19 == 2) {
																	this.anIntArray86[this.anInt304] = 422;
																}
																this.anIntArray87[this.anInt304] = var18.anInt103;
																this.anIntArray84[this.anInt304] = var24;
																this.anIntArray85[this.anInt304] = var12.anInt470;
																++this.anInt304;
															}
														}
													}
													if (var12.aStringArray10 != null) {
														for (var19 = 4; var19 >= 0; --var19) {
															if (var12.aStringArray10[var19] != null) {
																this.aStringArray5[this.anInt304] = var12.aStringArray10[var19] + " @lre@" + var18.aString3;
																if (var19 == 0) {
																	this.anIntArray86[this.anInt304] = 602;
																}
																if (var19 == 1) {
																	this.anIntArray86[this.anInt304] = 596;
																}
																if (var19 == 2) {
																	this.anIntArray86[this.anInt304] = 22;
																}
																if (var19 == 3) {
																	this.anIntArray86[this.anInt304] = 892;
																}
																if (var19 == 4) {
																	this.anIntArray86[this.anInt304] = 415;
																}
																this.anIntArray87[this.anInt304] = var18.anInt103;
																this.anIntArray84[this.anInt304] = var24;
																this.anIntArray85[this.anInt304] = var12.anInt470;
																++this.anInt304;
															}
														}
													}
													this.aStringArray5[this.anInt304] = "Examine @lre@" + var18.aString3;
													this.anIntArray86[this.anInt304] = 1773;
													this.anIntArray87[this.anInt304] = var18.anInt103;
													this.anIntArray85[this.anInt304] = var12.anIntArray150[var24];
													++this.anInt304;
												}
											}
										}
										++var24;
									}
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException var20) {
			signlink.reporterror("35323, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + var20.toString());
			throw new RuntimeException();
		}
	}

	public final void method91(int arg0) {
		try {
			this.anInt178 += arg0;
			if (super.anInt137 == 1) {
				if (super.anInt138 >= 8 && super.anInt138 <= 108 && super.anInt139 >= 490 && super.anInt139 <= 522) {
					this.anInt273 = (this.anInt273 + 1) % 4;
					this.aBoolean56 = true;
					this.aBoolean60 = true;
					this.aClass1_Sub3_Sub3_6.method380((byte) -34, 244);
					this.aClass1_Sub3_Sub3_6.method381(this.anInt273);
					this.aClass1_Sub3_Sub3_6.method381(this.anInt164);
					this.aClass1_Sub3_Sub3_6.method381(this.anInt234);
				}
				if (super.anInt138 >= 137 && super.anInt138 <= 237 && super.anInt139 >= 490 && super.anInt139 <= 522) {
					this.anInt164 = (this.anInt164 + 1) % 3;
					this.aBoolean56 = true;
					this.aBoolean60 = true;
					this.aClass1_Sub3_Sub3_6.method380((byte) -34, 244);
					this.aClass1_Sub3_Sub3_6.method381(this.anInt273);
					this.aClass1_Sub3_Sub3_6.method381(this.anInt164);
					this.aClass1_Sub3_Sub3_6.method381(this.anInt234);
				}
				if (super.anInt138 >= 275 && super.anInt138 <= 375 && super.anInt139 >= 490 && super.anInt139 <= 522) {
					this.anInt234 = (this.anInt234 + 1) % 3;
					this.aBoolean56 = true;
					this.aBoolean60 = true;
					this.aClass1_Sub3_Sub3_6.method380((byte) -34, 244);
					this.aClass1_Sub3_Sub3_6.method381(this.anInt273);
					this.aClass1_Sub3_Sub3_6.method381(this.anInt164);
					this.aClass1_Sub3_Sub3_6.method381(this.anInt234);
				}
				if (super.anInt138 >= 416 && super.anInt138 <= 516 && super.anInt139 >= 490 && super.anInt139 <= 522) {
					this.method77((byte) -60);
					this.aString9 = "";
					this.aBoolean51 = false;
					for (int var2 = 0; var2 < Class15.aClass15Array1.length; ++var2) {
						if (Class15.aClass15Array1[var2] != null && Class15.aClass15Array1[var2].anInt474 == 600) {
							this.anInt240 = this.anInt271 = Class15.aClass15Array1[var2].anInt471;
							return;
						}
					}
					return;
				}
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("26269, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public final void method92(int arg0, int arg1, int arg2) {
		try {
			int var4 = 0;
			for (int var5 = 0; var5 < 100; ++var5) {
				if (this.aStringArray7[var5] != null) {
					int var6 = this.anIntArray49[var5];
					int var7 = 70 - var4 * 14 + this.anInt274 + 4;
					if (var7 < -20) {
						break;
					}
					if (var6 == 0) {
						++var4;
					}
					if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.anInt273 == 0 || this.anInt273 == 1 && this.method199(-20, this.aStringArray6[var5]))) {
						if (arg0 > var7 - 14 && arg0 <= var7 && !this.aStringArray6[var5].equals(this.aClass1_Sub1_Sub3_Sub2_1.aString30)) {
							if (this.aBoolean65) {
								this.aStringArray5[this.anInt304] = "Report abuse @whi@" + this.aStringArray6[var5];
								this.anIntArray86[this.anInt304] = 34;
								++this.anInt304;
							}
							this.aStringArray5[this.anInt304] = "Add ignore @whi@" + this.aStringArray6[var5];
							this.anIntArray86[this.anInt304] = 436;
							++this.anInt304;
							this.aStringArray5[this.anInt304] = "Add friend @whi@" + this.aStringArray6[var5];
							this.anIntArray86[this.anInt304] = 406;
							++this.anInt304;
						}
						++var4;
					}
					if ((var6 == 3 || var6 == 7) && this.anInt210 == 0 && (var6 == 7 || this.anInt164 == 0 || this.anInt164 == 1 && this.method199(-20, this.aStringArray6[var5]))) {
						if (arg0 > var7 - 14 && arg0 <= var7) {
							if (this.aBoolean65) {
								this.aStringArray5[this.anInt304] = "Report abuse @whi@" + this.aStringArray6[var5];
								this.anIntArray86[this.anInt304] = 34;
								++this.anInt304;
							}
							this.aStringArray5[this.anInt304] = "Add ignore @whi@" + this.aStringArray6[var5];
							this.anIntArray86[this.anInt304] = 436;
							++this.anInt304;
							this.aStringArray5[this.anInt304] = "Add friend @whi@" + this.aStringArray6[var5];
							this.anIntArray86[this.anInt304] = 406;
							++this.anInt304;
						}
						++var4;
					}
					if (var6 == 4 && (this.anInt234 == 0 || this.anInt234 == 1 && this.method199(-20, this.aStringArray6[var5]))) {
						if (arg0 > var7 - 14 && arg0 <= var7) {
							this.aStringArray5[this.anInt304] = "Accept trade @whi@" + this.aStringArray6[var5];
							this.anIntArray86[this.anInt304] = 903;
							++this.anInt304;
						}
						++var4;
					}
					if ((var6 == 5 || var6 == 6) && this.anInt210 == 0 && this.anInt164 < 2) {
						++var4;
					}
					if (var6 == 8 && (this.anInt234 == 0 || this.anInt234 == 1 && this.method199(-20, this.aStringArray6[var5]))) {
						if (arg0 > var7 - 14 && arg0 <= var7) {
							this.aStringArray5[this.anInt304] = "Accept duel @whi@" + this.aStringArray6[var5];
							this.anIntArray86[this.anInt304] = 363;
							++this.anInt304;
						}
						++var4;
					}
				}
			}
			this.anInt178 += arg1;
		} catch (RuntimeException var8) {
			signlink.reporterror("24152, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	public final void method93(int arg0) {
		try {
			if (this.aClass1_Sub1_Sub3_Sub2_1.anInt890 >> 7 == this.anInt296 && this.aClass1_Sub1_Sub3_Sub2_1.anInt891 >> 7 == this.anInt297) {
				this.anInt296 = 0;
			}
			for (int var2 = -1; var2 < this.anInt205; ++var2) {
				Class1_Sub1_Sub3_Sub2 var3;
				int var4;
				if (var2 == -1) {
					var3 = this.aClass1_Sub1_Sub3_Sub2_1;
					var4 = this.anInt204 << 14;
				} else {
					var3 = this.aClass1_Sub1_Sub3_Sub2Array1[this.anIntArray39[var2]];
					var4 = this.anIntArray39[var2] << 14;
				}
				if (var3 != null && var3.method571(false)) {
					var3.aBoolean165 = false;
					if ((aBoolean53 && this.anInt205 > 50 || this.anInt205 > 200) && var2 != -1 && var3.anInt912 == var3.anInt894) {
						var3.aBoolean165 = true;
					}
					int var5 = var3.anInt890 >> 7;
					int var6 = var3.anInt891 >> 7;
					if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
						if (var3.aClass1_Sub3_Sub1_11 != null && anInt266 >= var3.anInt942 && anInt266 < var3.anInt943) {
							var3.aBoolean165 = false;
							var3.anInt941 = this.method94(this.anInt231, var3.anInt890, (byte) 5, var3.anInt891);
							this.aClass33_1.method479(var3.anInt949, 60, (Class1_Sub3_Sub1) null, var3.anInt891, var3.anInt941, var4, var3.anInt892, var3.anInt948, var3.anInt947, var3, false, this.anInt231, var3.anInt950, var3.anInt890);
						} else {
							if ((var3.anInt890 & 127) == 64 && (var3.anInt891 & 127) == 64) {
								if (this.anIntArrayArray3[var5][var6] == this.anInt211) {
									continue;
								}
								this.anIntArrayArray3[var5][var6] = this.anInt211;
							}
							var3.anInt941 = this.method94(this.anInt231, var3.anInt890, (byte) 5, var3.anInt891);
							this.aClass33_1.method478(-44713, var3.anInt891, 60, var3.anInt892, var3.anInt890, var4, var3.aBoolean162, (Class1_Sub3_Sub1) null, var3, var3.anInt941, this.anInt231);
						}
					}
				}
			}
			if (arg0 <= 0) {
				this.aClass1_Sub3_Sub3_6.method381(210);
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("13213, " + arg0 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	public final int method94(int arg0, int arg1, byte arg2, int arg3) {
		try {
			if (arg2 != 5) {
				this.anInt179 = this.aClass1_Sub3_Sub3_5.method391();
			}
			int var5 = arg1 >> 7;
			int var6 = arg3 >> 7;
			int var7 = arg0;
			if (arg0 < 3 && (this.aByteArrayArrayArray7[1][var5][var6] & 2) == 2) {
				var7 = arg0 + 1;
			}
			int var8 = arg1 & 127;
			int var9 = arg3 & 127;
			int var10 = this.anIntArrayArrayArray3[var7][var5][var6] * (128 - var8) + this.anIntArrayArrayArray3[var7][var5 + 1][var6] * var8 >> 7;
			int var11 = this.anIntArrayArrayArray3[var7][var5][var6 + 1] * (128 - var8) + this.anIntArrayArrayArray3[var7][var5 + 1][var6 + 1] * var8 >> 7;
			return var10 * (128 - var9) + var11 * var9 >> 7;
		} catch (RuntimeException var12) {
			signlink.reporterror("41583, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var12.toString());
			throw new RuntimeException();
		}
	}

	public final void method95(Class3 arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			while (arg1 >= 0) {
				this.anInt179 = -1;
			}
			if (this.anInt304 < 400) {
				String var6 = arg0.aString2;
				if (arg0.anInt77 != 0) {
					var6 = var6 + method133(this.aClass1_Sub1_Sub3_Sub2_1.anInt940, false, arg0.anInt77) + " (level-" + arg0.anInt77 + ")";
				}
				if (this.anInt281 == 1) {
					this.aStringArray5[this.anInt304] = "Use " + this.aString10 + " with @yel@" + var6;
					this.anIntArray86[this.anInt304] = 900;
					this.anIntArray87[this.anInt304] = arg4;
					this.anIntArray84[this.anInt304] = arg3;
					this.anIntArray85[this.anInt304] = arg2;
					++this.anInt304;
				} else {
					if (this.anInt291 == 1) {
						if ((this.anInt293 & 2) == 2) {
							this.aStringArray5[this.anInt304] = this.aString11 + " @yel@" + var6;
							this.anIntArray86[this.anInt304] = 265;
							this.anIntArray87[this.anInt304] = arg4;
							this.anIntArray84[this.anInt304] = arg3;
							this.anIntArray85[this.anInt304] = arg2;
							++this.anInt304;
							return;
						}
					} else {
						int var7;
						if (arg0.aStringArray2 != null) {
							for (var7 = 4; var7 >= 0; --var7) {
								if (arg0.aStringArray2[var7] != null && !arg0.aStringArray2[var7].equalsIgnoreCase("attack")) {
									this.aStringArray5[this.anInt304] = arg0.aStringArray2[var7] + " @yel@" + var6;
									if (var7 == 0) {
										this.anIntArray86[this.anInt304] = 728;
									}
									if (var7 == 1) {
										this.anIntArray86[this.anInt304] = 542;
									}
									if (var7 == 2) {
										this.anIntArray86[this.anInt304] = 6;
									}
									if (var7 == 3) {
										this.anIntArray86[this.anInt304] = 963;
									}
									if (var7 == 4) {
										this.anIntArray86[this.anInt304] = 245;
									}
									this.anIntArray87[this.anInt304] = arg4;
									this.anIntArray84[this.anInt304] = arg3;
									this.anIntArray85[this.anInt304] = arg2;
									++this.anInt304;
								}
							}
						}
						if (arg0.aStringArray2 != null) {
							for (var7 = 4; var7 >= 0; --var7) {
								if (arg0.aStringArray2[var7] != null && arg0.aStringArray2[var7].equalsIgnoreCase("attack")) {
									short var8 = 0;
									if (arg0.anInt77 > this.aClass1_Sub1_Sub3_Sub2_1.anInt940) {
										var8 = 2000;
									}
									this.aStringArray5[this.anInt304] = arg0.aStringArray2[var7] + " @yel@" + var6;
									if (var7 == 0) {
										this.anIntArray86[this.anInt304] = 728 + var8;
									}
									if (var7 == 1) {
										this.anIntArray86[this.anInt304] = 542 + var8;
									}
									if (var7 == 2) {
										this.anIntArray86[this.anInt304] = 6 + var8;
									}
									if (var7 == 3) {
										this.anIntArray86[this.anInt304] = 963 + var8;
									}
									if (var7 == 4) {
										this.anIntArray86[this.anInt304] = 245 + var8;
									}
									this.anIntArray87[this.anInt304] = arg4;
									this.anIntArray84[this.anInt304] = arg3;
									this.anIntArray85[this.anInt304] = arg2;
									++this.anInt304;
								}
							}
						}
						this.aStringArray5[this.anInt304] = "Examine @yel@" + var6;
						this.anIntArray86[this.anInt304] = 1607;
						this.anIntArray87[this.anInt304] = arg4;
						this.anIntArray84[this.anInt304] = arg3;
						this.anIntArray85[this.anInt304] = arg2;
						++this.anInt304;
					}
				}
			}
		} catch (RuntimeException var9) {
			signlink.reporterror("93342, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + var9.toString());
			throw new RuntimeException();
		}
	}

	public final void method96(int arg0) {
		try {
			if (arg0 != 7) {
				this.anInt333 = this.aClass38_1.method532();
			}
			while (true) {
				int var2;
				do {
					while (true) {
						var2 = this.method66(false);
						if (var2 == -1) {
							return;
						}
						if (this.anInt271 != -1 && this.anInt271 == this.anInt240) {
							if (var2 == 8 && this.aString9.length() > 0) {
								this.aString9 = this.aString9.substring(0, this.aString9.length() - 1);
							}
							break;
						}
						int var8;
						if (this.aBoolean47) {
							if (var2 >= 32 && var2 <= 122 && this.aString5.length() < 80) {
								this.aString5 = this.aString5 + (char) var2;
								this.aBoolean60 = true;
							}
							if (var2 == 8 && this.aString5.length() > 0) {
								this.aString5 = this.aString5.substring(0, this.aString5.length() - 1);
								this.aBoolean60 = true;
							}
							if (var2 == 13 || var2 == 10) {
								this.aBoolean47 = false;
								this.aBoolean60 = true;
								long var9;
								if (this.anInt168 == 1) {
									var9 = Class40.method538(this.aString5);
									this.method161(var9, -460);
								}
								if (this.anInt168 == 2 && this.anInt312 > 0) {
									var9 = Class40.method538(this.aString5);
									this.method174(43808, var9);
								}
								if (this.anInt168 == 3 && this.aString5.length() > 0) {
									this.aClass1_Sub3_Sub3_6.method380((byte) -34, 148);
									this.aClass1_Sub3_Sub3_6.method381(0);
									var8 = this.aClass1_Sub3_Sub3_6.anInt561;
									this.aClass1_Sub3_Sub3_6.method387(true, this.aLong8);
									Class41.method546(this.aClass1_Sub3_Sub3_6, true, this.aString5);
									this.aClass1_Sub3_Sub3_6.method390(0, this.aClass1_Sub3_Sub3_6.anInt561 - var8);
									this.aString5 = Class40.method543(this.aString5, 0);
									this.aString5 = Class25.method424(this.aString5, 0);
									this.method172(6, this.aString5, (byte) 4, Class40.method542(0, Class40.method539(this.aLong8, false)));
									if (this.anInt164 == 2) {
										this.anInt164 = 1;
										this.aBoolean56 = true;
										this.aClass1_Sub3_Sub3_6.method380((byte) -34, 244);
										this.aClass1_Sub3_Sub3_6.method381(this.anInt273);
										this.aClass1_Sub3_Sub3_6.method381(this.anInt164);
										this.aClass1_Sub3_Sub3_6.method381(this.anInt234);
									}
								}
								if (this.anInt168 == 4 && this.anInt186 < 100) {
									var9 = Class40.method538(this.aString5);
									this.method82(var9, (byte) 3);
								}
								if (this.anInt168 == 5 && this.anInt186 > 0) {
									var9 = Class40.method538(this.aString5);
									this.method191(1, var9);
								}
							}
						} else if (this.aBoolean66) {
							if (var2 >= 48 && var2 <= 57 && this.aString7.length() < 10) {
								this.aString7 = this.aString7 + (char) var2;
								this.aBoolean60 = true;
							}
							if (var2 == 8 && this.aString7.length() > 0) {
								this.aString7 = this.aString7.substring(0, this.aString7.length() - 1);
								this.aBoolean60 = true;
							}
							if (var2 == 13 || var2 == 10) {
								if (this.aString7.length() > 0) {
									var8 = 0;
									try {
										var8 = Integer.parseInt(this.aString7);
									} catch (Exception var6) {
									}
									this.aClass1_Sub3_Sub3_6.method380((byte) -34, 237);
									this.aClass1_Sub3_Sub3_6.method385(var8);
								}
								this.aBoolean66 = false;
								this.aBoolean60 = true;
							}
						} else if (this.anInt280 == -1) {
							if (var2 >= 32 && var2 <= 122 && this.aString18.length() < 80) {
								this.aString18 = this.aString18 + (char) var2;
								this.aBoolean60 = true;
							}
							if (var2 == 8 && this.aString18.length() > 0) {
								this.aString18 = this.aString18.substring(0, this.aString18.length() - 1);
								this.aBoolean60 = true;
							}
							if ((var2 == 13 || var2 == 10) && this.aString18.length() > 0) {
								if (this.aString18.equals("::clientdrop") && (super.aFrame_Sub1_2 != null || this.method134(-7437).indexOf("192.168.1.") != -1)) {
									this.method182(false);
								} else if (this.aString18.startsWith("::")) {
									this.aClass1_Sub3_Sub3_6.method380((byte) -34, 4);
									this.aClass1_Sub3_Sub3_6.method381(this.aString18.length() - 1);
									this.aClass1_Sub3_Sub3_6.method388(this.aString18.substring(2));
								} else {
									byte var3 = 0;
									if (this.aString18.startsWith("yellow:")) {
										var3 = 0;
										this.aString18 = this.aString18.substring(7);
									}
									if (this.aString18.startsWith("red:")) {
										var3 = 1;
										this.aString18 = this.aString18.substring(4);
									}
									if (this.aString18.startsWith("green:")) {
										var3 = 2;
										this.aString18 = this.aString18.substring(6);
									}
									if (this.aString18.startsWith("cyan:")) {
										var3 = 3;
										this.aString18 = this.aString18.substring(5);
									}
									if (this.aString18.startsWith("purple:")) {
										var3 = 4;
										this.aString18 = this.aString18.substring(7);
									}
									if (this.aString18.startsWith("white:")) {
										var3 = 5;
										this.aString18 = this.aString18.substring(6);
									}
									if (this.aString18.startsWith("flash1:")) {
										var3 = 6;
										this.aString18 = this.aString18.substring(7);
									}
									if (this.aString18.startsWith("flash2:")) {
										var3 = 7;
										this.aString18 = this.aString18.substring(7);
									}
									if (this.aString18.startsWith("flash3:")) {
										var3 = 8;
										this.aString18 = this.aString18.substring(7);
									}
									if (this.aString18.startsWith("glow1:")) {
										var3 = 9;
										this.aString18 = this.aString18.substring(6);
									}
									if (this.aString18.startsWith("glow2:")) {
										var3 = 10;
										this.aString18 = this.aString18.substring(6);
									}
									if (this.aString18.startsWith("glow3:")) {
										var3 = 11;
										this.aString18 = this.aString18.substring(6);
									}
									byte var4 = 0;
									if (this.aString18.startsWith("wave:")) {
										var4 = 1;
										this.aString18 = this.aString18.substring(5);
									}
									if (this.aString18.startsWith("scroll:")) {
										var4 = 2;
										this.aString18 = this.aString18.substring(7);
									}
									this.aClass1_Sub3_Sub3_6.method380((byte) -34, 158);
									this.aClass1_Sub3_Sub3_6.method381(0);
									int var5 = this.aClass1_Sub3_Sub3_6.anInt561;
									this.aClass1_Sub3_Sub3_6.method381(var3);
									this.aClass1_Sub3_Sub3_6.method381(var4);
									Class41.method546(this.aClass1_Sub3_Sub3_6, true, this.aString18);
									this.aClass1_Sub3_Sub3_6.method390(0, this.aClass1_Sub3_Sub3_6.anInt561 - var5);
									this.aString18 = Class40.method543(this.aString18, 0);
									this.aString18 = Class25.method424(this.aString18, 0);
									this.aClass1_Sub1_Sub3_Sub2_1.aString29 = this.aString18;
									this.aClass1_Sub1_Sub3_Sub2_1.anInt902 = var3;
									this.aClass1_Sub1_Sub3_Sub2_1.anInt903 = var4;
									this.aClass1_Sub1_Sub3_Sub2_1.anInt901 = 150;
									this.method172(2, this.aClass1_Sub1_Sub3_Sub2_1.aString29, (byte) 4, this.aClass1_Sub1_Sub3_Sub2_1.aString30);
									if (this.anInt273 == 2) {
										this.anInt273 = 3;
										this.aBoolean56 = true;
										this.aClass1_Sub3_Sub3_6.method380((byte) -34, 244);
										this.aClass1_Sub3_Sub3_6.method381(this.anInt273);
										this.aClass1_Sub3_Sub3_6.method381(this.anInt164);
										this.aClass1_Sub3_Sub3_6.method381(this.anInt234);
									}
								}
								this.aString18 = "";
								this.aBoolean60 = true;
							}
						}
					}
				} while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
				if (this.aString9.length() < 12) {
					this.aString9 = this.aString9 + (char) var2;
				}
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("2927, " + arg0 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	public final void method70(boolean arg0) {
		try {
			if (arg0) {
				this.anInt187 = -398;
			}
			if (!this.aBoolean67 && !this.aBoolean46 && !this.aBoolean57) {
				if (!this.aBoolean62) {
					this.method116(4);
				} else {
					this.method130(29510);
				}
				this.anInt253 = 0;
			} else {
				this.method188(false);
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("57311, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public final void method97(byte arg0) {
		try {
			if (arg0 != -70) {
				this.aClass28ArrayArrayArray1 = null;
			}
			int var2;
			int var3;
			if (this.anInt320 == 0) {
				var2 = super.anInt131 / 2 - 80;
				var3 = super.anInt132 / 2 + 20;
				var3 += 20;
				if (super.anInt137 == 1 && super.anInt138 >= var2 - 75 && super.anInt138 <= var2 + 75 && super.anInt139 >= var3 - 20 && super.anInt139 <= var3 + 20) {
					this.anInt320 = 3;
					this.anInt272 = 0;
				}
				var2 = super.anInt131 / 2 + 80;
				if (super.anInt137 == 1 && super.anInt138 >= var2 - 75 && super.anInt138 <= var2 + 75 && super.anInt139 >= var3 - 20 && super.anInt139 <= var3 + 20) {
					this.aString15 = "";
					this.aString16 = "Enter your username & password.";
					this.anInt320 = 2;
					this.anInt272 = 0;
				}
			} else if (this.anInt320 == 2) {
				var2 = super.anInt132 / 2 - 40;
				var2 += 30;
				var2 += 25;
				if (super.anInt137 == 1 && super.anInt139 >= var2 - 15 && super.anInt139 < var2) {
					this.anInt272 = 0;
				}
				var2 += 15;
				if (super.anInt137 == 1 && super.anInt139 >= var2 - 15 && super.anInt139 < var2) {
					this.anInt272 = 1;
				}
				var2 += 15;
				var3 = super.anInt131 / 2 - 80;
				int var4 = super.anInt132 / 2 + 50;
				int var10 = var4 + 20;
				if (super.anInt137 == 1 && super.anInt138 >= var3 - 75 && super.anInt138 <= var3 + 75 && super.anInt139 >= var10 - 20 && super.anInt139 <= var10 + 20) {
					this.method159(this.aString13, this.aString14, false);
				}
				var3 = super.anInt131 / 2 + 80;
				if (super.anInt137 == 1 && super.anInt138 >= var3 - 75 && super.anInt138 <= var3 + 75 && super.anInt139 >= var10 - 20 && super.anInt139 <= var10 + 20) {
					this.anInt320 = 0;
					this.aString13 = "";
					this.aString14 = "";
				}
				while (true) {
					while (true) {
						int var5 = this.method66(false);
						if (var5 == -1) {
							return;
						}
						boolean var6 = false;
						for (int var7 = 0; var7 < aString4.length(); ++var7) {
							if (var5 == aString4.charAt(var7)) {
								var6 = true;
								break;
							}
						}
						if (this.anInt272 == 0) {
							if (var5 == 8 && this.aString13.length() > 0) {
								this.aString13 = this.aString13.substring(0, this.aString13.length() - 1);
							}
							if (var5 == 9 || var5 == 10 || var5 == 13) {
								this.anInt272 = 1;
							}
							if (var6) {
								this.aString13 = this.aString13 + (char) var5;
							}
							if (this.aString13.length() > 12) {
								this.aString13 = this.aString13.substring(0, 12);
							}
						} else if (this.anInt272 == 1) {
							if (var5 == 8 && this.aString14.length() > 0) {
								this.aString14 = this.aString14.substring(0, this.aString14.length() - 1);
							}
							if (var5 == 9 || var5 == 10 || var5 == 13) {
								this.anInt272 = 0;
							}
							if (var6) {
								this.aString14 = this.aString14 + (char) var5;
							}
							if (this.aString14.length() > 20) {
								this.aString14 = this.aString14.substring(0, 20);
							}
						}
					}
				}
			} else {
				if (this.anInt320 == 3) {
					var2 = super.anInt131 / 2;
					var3 = super.anInt132 / 2 + 50;
					int var9 = var3 + 20;
					if (super.anInt137 == 1 && super.anInt138 >= var2 - 75 && super.anInt138 <= var2 + 75 && super.anInt139 >= var9 - 20 && super.anInt139 <= var9 + 20) {
						this.anInt320 = 0;
						return;
					}
				}
			}
		} catch (RuntimeException var8) {
			signlink.reporterror("38328, " + arg0 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	public final Class39 method98(String arg0, int arg1, String arg2, int arg3, int arg4) {
		try {
			int var7 = 5;
			byte[] var6 = signlink.cacheload(arg2);
			int var8;
			if (var6 != null) {
				this.aCRC32_1.reset();
				this.aCRC32_1.update(var6);
				var8 = (int) this.aCRC32_1.getValue();
				if (var8 != arg1) {
					var6 = null;
				}
			}
			if (var6 != null) {
				return new Class39(var6, this.aBoolean55);
			} else {
				while (var6 == null) {
					this.method74(true, "Requesting " + arg0, arg3);
					try {
						var8 = 0;
						DataInputStream var9 = this.method155(arg2 + arg1);
						byte[] var10 = new byte[6];
						var9.readFully(var10, 0, 6);
						Class1_Sub3_Sub3 var11 = new Class1_Sub3_Sub3(363, var10);
						var11.anInt561 = 3;
						int var12 = var11.method395() + 6;
						int var13 = 6;
						var6 = new byte[var12];
						for (int var14 = 0; var14 < 6; ++var14) {
							var6[var14] = var10[var14];
						}
						while (var13 < var12) {
							int var15 = var12 - var13;
							if (var15 > 1000) {
								var15 = 1000;
							}
							var13 += var9.read(var6, var13, var15);
							int var16 = var13 * 100 / var12;
							if (var16 != var8) {
								this.method74(true, "Loading " + arg0 + " - " + var16 + "%", arg3);
							}
							var8 = var16;
						}
						var9.close();
					} catch (IOException var18) {
						var6 = null;
						for (var8 = var7; var8 > 0; --var8) {
							this.method74(true, "Error loading - Will retry in " + var8 + " secs.", arg3);
							try {
								Thread.sleep(1000L);
							} catch (Exception var17) {
							}
						}
						var7 *= 2;
						if (var7 > 60) {
							var7 = 60;
						}
					}
				}
				signlink.cachesave(arg2, var6);
				if (arg4 != 0) {
					for (var8 = 1; var8 > 0; ++var8) {
					}
				}
				return new Class39(var6, this.aBoolean55);
			}
		} catch (RuntimeException var19) {
			signlink.reporterror("37683, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + var19.toString());
			throw new RuntimeException();
		}
	}

	public final void method99(boolean arg0) {
		try {
			this.aBoolean54 = false;
			while (this.aBoolean70) {
				this.aBoolean54 = false;
				try {
					Thread.sleep(50L);
				} catch (Exception var3) {
				}
			}
			this.aClass1_Sub3_Sub2_Sub3_19 = null;
			this.aClass1_Sub3_Sub2_Sub3_20 = null;
			this.aClass1_Sub3_Sub2_Sub3Array2 = null;
			this.anIntArray50 = null;
			this.anIntArray51 = null;
			this.anIntArray52 = null;
			this.anIntArray53 = null;
			this.anIntArray41 = null;
			this.anIntArray42 = null;
			if (!arg0) {
				for (int var2 = 1; var2 > 0; ++var2) {
				}
			}
			this.anIntArray64 = null;
			this.anIntArray65 = null;
			this.aClass1_Sub3_Sub2_Sub2_3 = null;
			this.aClass1_Sub3_Sub2_Sub2_4 = null;
		} catch (RuntimeException var4) {
			signlink.reporterror("17778, " + arg0 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	public final void method100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		try {
			int var8 = 2048 - arg3 & 2047;
			int var9 = 2048 - arg2 & 2047;
			int var10 = 0;
			int var11 = 0;
			int var12 = arg6;
			int var13;
			int var14;
			int var15;
			if (var8 != 0) {
				var13 = Class1_Sub3_Sub1.anIntArray124[var8];
				var14 = Class1_Sub3_Sub1.anIntArray125[var8];
				var15 = var11 * var14 - arg6 * var13 >> 16;
				var12 = var11 * var13 + arg6 * var14 >> 16;
				var11 = var15;
			}
			if (var9 != 0) {
				var13 = Class1_Sub3_Sub1.anIntArray124[var9];
				var14 = Class1_Sub3_Sub1.anIntArray125[var9];
				var15 = var12 * var13 + var10 * var14 >> 16;
				var12 = var12 * var14 - var10 * var13 >> 16;
				var10 = var15;
			}
			this.anInt322 = arg1 - var10;
			this.anInt323 = arg0 - var11;
			this.anInt324 = arg5 - var12;
			this.anInt325 = arg3;
			if (arg4 != 16418) {
				this.aClass28ArrayArrayArray1 = null;
			}
			this.anInt326 = arg2;
		} catch (RuntimeException var16) {
			signlink.reporterror("79526, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + var16.toString());
			throw new RuntimeException();
		}
	}

	private static final String method101(int arg0, int arg1) {
		try {
			String var2 = String.valueOf(arg0);
			for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
				var2 = var2.substring(0, var3) + "," + var2.substring(var3);
			}
			if (arg1 != 0) {
				throw new NullPointerException();
			} else {
				if (var2.length() > 8) {
					var2 = "@gre@" + var2.substring(0, var2.length() - 8) + " million @whi@(" + var2 + ")";
				} else if (var2.length() > 4) {
					var2 = "@cya@" + var2.substring(0, var2.length() - 4) + "K @whi@(" + var2 + ")";
				}
				return " " + var2;
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("92962, " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	public final void method102(int arg0, boolean arg1) {
		try {
			if (!arg1) {
				this.anInt179 = -1;
			}
			if (!aBoolean53) {
				Class1_Sub3_Sub2_Sub3 var3;
				int var4;
				int var5;
				byte[] var6;
				byte[] var7;
				int var8;
				if (Class1_Sub3_Sub2_Sub1.anIntArray141[17] >= arg0) {
					var3 = Class1_Sub3_Sub2_Sub1.aClass1_Sub3_Sub2_Sub3Array4[17];
					var4 = var3.anInt513 * var3.anInt514 - 1;
					var5 = var3.anInt513 * this.anInt270 * 2;
					var6 = var3.aByteArray6;
					var7 = this.aByteArray4;
					for (var8 = 0; var8 <= var4; ++var8) {
						var7[var8] = var6[var8 - var5 & var4];
					}
					var3.aByteArray6 = var7;
					this.aByteArray4 = var6;
					Class1_Sub3_Sub2_Sub1.method294(17, 150);
				}
				if (Class1_Sub3_Sub2_Sub1.anIntArray141[24] >= arg0) {
					var3 = Class1_Sub3_Sub2_Sub1.aClass1_Sub3_Sub2_Sub3Array4[24];
					var4 = var3.anInt513 * var3.anInt514 - 1;
					var5 = var3.anInt513 * this.anInt270 * 2;
					var6 = var3.aByteArray6;
					var7 = this.aByteArray4;
					for (var8 = 0; var8 <= var4; ++var8) {
						var7[var8] = var6[var8 - var5 & var4];
					}
					var3.aByteArray6 = var7;
					this.aByteArray4 = var6;
					Class1_Sub3_Sub2_Sub1.method294(24, 150);
					return;
				}
			}
		} catch (RuntimeException var9) {
			signlink.reporterror("14523, " + arg0 + ", " + arg1 + ", " + var9.toString());
			throw new RuntimeException();
		}
	}

	public final void method103(boolean arg0) {
		try {
			short var2 = 256;
			int var4;
			for (int var3 = 10; var3 < 117; ++var3) {
				var4 = (int) (Math.random() * 100.0D);
				if (var4 < 50) {
					this.anIntArray64[var3 + (var2 - 2 << 7)] = 255;
				}
			}
			int var5;
			int var6;
			int var7;
			for (var4 = 0; var4 < 100; ++var4) {
				var5 = (int) (Math.random() * 124.0D) + 2;
				var6 = (int) (Math.random() * 128.0D) + 128;
				var7 = var5 + (var6 << 7);
				this.anIntArray64[var7] = 192;
			}
			if (!arg0) {
				this.anInt179 = this.aClass1_Sub3_Sub3_5.method391();
			}
			for (var5 = 1; var5 < var2 - 1; ++var5) {
				for (var6 = 1; var6 < 127; ++var6) {
					var7 = var6 + (var5 << 7);
					this.anIntArray65[var7] = (this.anIntArray64[var7 - 1] + this.anIntArray64[var7 + 1] + this.anIntArray64[var7 - 128] + this.anIntArray64[var7 + 128]) / 4;
				}
			}
			this.anInt344 += 128;
			if (this.anInt344 > this.anIntArray41.length) {
				this.anInt344 -= this.anIntArray41.length;
				var6 = (int) (Math.random() * 12.0D);
				this.method183(578, this.aClass1_Sub3_Sub2_Sub3Array2[var6]);
			}
			int var8;
			for (var6 = 1; var6 < var2 - 1; ++var6) {
				for (var7 = 1; var7 < 127; ++var7) {
					var8 = var7 + (var6 << 7);
					int var9 = this.anIntArray65[var8 + 128] - this.anIntArray41[var8 + this.anInt344 & this.anIntArray41.length - 1] / 5;
					if (var9 < 0) {
						var9 = 0;
					}
					this.anIntArray64[var8] = var9;
				}
			}
			for (var7 = 0; var7 < var2 - 1; ++var7) {
				this.anIntArray43[var7] = this.anIntArray43[var7 + 1];
			}
			this.anIntArray43[var2 - 1] = (int) (Math.sin((double) anInt266 / 14.0D) * 16.0D + Math.sin((double) anInt266 / 15.0D) * 14.0D + Math.sin((double) anInt266 / 16.0D) * 12.0D);
			if (this.anInt227 > 0) {
				this.anInt227 -= 4;
			}
			if (this.anInt228 > 0) {
				this.anInt228 -= 4;
			}
			if (this.anInt227 == 0 && this.anInt228 == 0) {
				var8 = (int) (Math.random() * 2000.0D);
				if (var8 == 0) {
					this.anInt227 = 1024;
				}
				if (var8 == 1) {
					this.anInt228 = 1024;
					return;
				}
			}
		} catch (RuntimeException var10) {
			signlink.reporterror("55623, " + arg0 + ", " + var10.toString());
			throw new RuntimeException();
		}
	}

	public final void method104(byte arg0) {
		try {
			this.aClass32_26.method463((byte) 62);
			if (arg0 != -46) {
				this.method67();
			}
			int var2 = this.anInt200 + this.anInt308 & 2047;
			int var3 = 48 + this.aClass1_Sub1_Sub3_Sub2_1.anInt890 / 32;
			int var4 = 464 - this.aClass1_Sub1_Sub3_Sub2_1.anInt891 / 32;
			this.aClass1_Sub3_Sub2_Sub2_6.method328(var2, 146, this.anIntArray83, 151, var4, 256 + this.anInt249, var3, 21, 9, false, this.anIntArray61);
			this.aClass1_Sub3_Sub2_Sub2_11.method328(this.anInt200, 33, this.anIntArray44, 33, 25, 256, 25, 0, 0, false, this.anIntArray81);
			for (int var5 = 0; var5 < this.anInt246; ++var5) {
				var3 = this.anIntArray54[var5] * 4 + 2 - this.aClass1_Sub1_Sub3_Sub2_1.anInt890 / 32;
				var4 = this.anIntArray55[var5] * 4 + 2 - this.aClass1_Sub1_Sub3_Sub2_1.anInt891 / 32;
				this.method148(var4, 4, this.aClass1_Sub3_Sub2_Sub2Array4[var5], var3);
			}
			int var7;
			for (int var6 = 0; var6 < 104; ++var6) {
				for (var7 = 0; var7 < 104; ++var7) {
					Class28 var8 = this.aClass28ArrayArrayArray1[this.anInt231][var6][var7];
					if (var8 != null) {
						var3 = var6 * 4 + 2 - this.aClass1_Sub1_Sub3_Sub2_1.anInt890 / 32;
						var4 = var7 * 4 + 2 - this.aClass1_Sub1_Sub3_Sub2_1.anInt891 / 32;
						this.method148(var4, 4, this.aClass1_Sub3_Sub2_Sub2_7, var3);
					}
				}
			}
			for (var7 = 0; var7 < this.anInt248; ++var7) {
				Class1_Sub1_Sub3_Sub1 var15 = this.aClass1_Sub1_Sub3_Sub1Array1[this.anIntArray58[var7]];
				if (var15 != null && var15.method571(false) && var15.aClass3_1.aBoolean20) {
					var3 = var15.anInt890 / 32 - this.aClass1_Sub1_Sub3_Sub2_1.anInt890 / 32;
					var4 = var15.anInt891 / 32 - this.aClass1_Sub1_Sub3_Sub2_1.anInt891 / 32;
					this.method148(var4, 4, this.aClass1_Sub3_Sub2_Sub2_8, var3);
				}
			}
			for (int var16 = 0; var16 < this.anInt205; ++var16) {
				Class1_Sub1_Sub3_Sub2 var9 = this.aClass1_Sub1_Sub3_Sub2Array1[this.anIntArray39[var16]];
				if (var9 != null && var9.method571(false)) {
					var3 = var9.anInt890 / 32 - this.aClass1_Sub1_Sub3_Sub2_1.anInt890 / 32;
					var4 = var9.anInt891 / 32 - this.aClass1_Sub1_Sub3_Sub2_1.anInt891 / 32;
					boolean var10 = false;
					long var11 = Class40.method538(var9.aString30);
					for (int var13 = 0; var13 < this.anInt312; ++var13) {
						if (var11 == this.aLongArray4[var13] && this.anIntArray34[var13] != 0) {
							var10 = true;
							break;
						}
					}
					if (var10) {
						this.method148(var4, 4, this.aClass1_Sub3_Sub2_Sub2_10, var3);
					} else {
						this.method148(var4, 4, this.aClass1_Sub3_Sub2_Sub2_9, var3);
					}
				}
			}
			if (this.anInt296 != 0) {
				var3 = this.anInt296 * 4 + 2 - this.aClass1_Sub1_Sub3_Sub2_1.anInt890 / 32;
				var4 = this.anInt297 * 4 + 2 - this.aClass1_Sub1_Sub3_Sub2_1.anInt891 / 32;
				this.method148(var4, 4, this.aClass1_Sub3_Sub2_Sub2_5, var3);
			}
			Class1_Sub3_Sub2.method358(82, 93, 16777215, (byte) 93, 3, 3);
			this.aClass32_27.method463((byte) 62);
		} catch (RuntimeException var14) {
			signlink.reporterror("54096, " + arg0 + ", " + var14.toString());
			throw new RuntimeException();
		}
	}

	public final Component method72(byte arg0) {
		try {
			if (arg0 != 3) {
				this.anInt167 = 260;
			}
			if (signlink.mainapp != null) {
				return signlink.mainapp;
			} else {
				return super.aFrame_Sub1_2 != null ? super.aFrame_Sub1_2 : this;
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("31136, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public final void method105(int arg0) {
		try {
			if (arg0 <= 0) {
				this.method67();
			}
			if (this.anInt307 == 2) {
				for (Class1_Sub5 var2 = (Class1_Sub5) this.aClass28_2.method456(); var2 != null; var2 = (Class1_Sub5) this.aClass28_2.method458(551)) {
					if (anInt266 >= var2.anInt638) {
						this.method160(var2.anInt636, var2.anInt633, var2.anInt634, var2.anInt632, var2.anInt635, var2.anInt637, -27819, var2.anInt631);
						var2.method567();
					}
				}
				++anInt319;
				if (anInt319 > 85) {
					anInt319 = 0;
					this.aClass1_Sub3_Sub3_6.method380((byte) -34, 85);
					return;
				}
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("93334, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public final void method106(int arg0, int arg1) {
		try {
			int[] var3 = this.aClass1_Sub3_Sub2_Sub2_6.anIntArray148;
			if (arg1 < 0) {
				int var4 = var3.length;
				for (int var5 = 0; var5 < var4; ++var5) {
					var3[var5] = 0;
				}
				int var7;
				int var8;
				for (int var6 = 1; var6 < 103; ++var6) {
					var7 = 24628 + (103 - var6) * 512 * 4;
					for (var8 = 1; var8 < 103; ++var8) {
						if ((this.aByteArrayArrayArray7[arg0][var8][var6] & 24) == 0) {
							this.aClass33_1.method503(var3, var7, 512, arg0, var8, var6);
						}
						if (arg0 < 3 && (this.aByteArrayArrayArray7[arg0 + 1][var8][var6] & 8) != 0) {
							this.aClass33_1.method503(var3, var7, 512, arg0 + 1, var8, var6);
						}
						var7 += 4;
					}
				}
				var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
				var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
				this.aClass1_Sub3_Sub2_Sub2_6.method318((byte) 62);
				int var10;
				for (int var9 = 1; var9 < 103; ++var9) {
					for (var10 = 1; var10 < 103; ++var10) {
						if ((this.aByteArrayArrayArray7[arg0][var10][var9] & 24) == 0) {
							this.method107(anInt238, arg0, var7, var10, var8, var9);
						}
						if (arg0 < 3 && (this.aByteArrayArrayArray7[arg0 + 1][var10][var9] & 8) != 0) {
							this.method107(anInt238, arg0 + 1, var7, var10, var8, var9);
						}
					}
				}
				this.aClass32_27.method463((byte) 62);
				this.anInt246 = 0;
				for (var10 = 0; var10 < 104; ++var10) {
					for (int var11 = 0; var11 < 104; ++var11) {
						int var12 = this.aClass33_1.method497(this.anInt231, var10, var11);
						if (var12 != 0) {
							var12 = var12 >> 14 & 32767;
							int var13 = Class2.method23(var12).anInt47;
							if (var13 >= 0) {
								int var14 = var10;
								int var15 = var11;
								if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
									byte var16 = 104;
									byte var17 = 104;
									int[][] var18 = this.aClass9Array1[this.anInt231].anIntArrayArray10;
									for (int var19 = 0; var19 < 10; ++var19) {
										int var20 = (int) (Math.random() * 4.0D);
										if (var20 == 0 && var14 > 0 && var14 > var10 - 3 && (var18[var14 - 1][var15] & 2621704) == 0) {
											--var14;
										}
										if (var20 == 1 && var14 < var16 - 1 && var14 < var10 + 3 && (var18[var14 + 1][var15] & 2621824) == 0) {
											++var14;
										}
										if (var20 == 2 && var15 > 0 && var15 > var11 - 3 && (var18[var14][var15 - 1] & 2621698) == 0) {
											--var15;
										}
										if (var20 == 3 && var15 < var17 - 1 && var15 < var11 + 3 && (var18[var14][var15 + 1] & 2621728) == 0) {
											++var15;
										}
									}
								}
								this.aClass1_Sub3_Sub2_Sub2Array4[this.anInt246] = this.aClass1_Sub3_Sub2_Sub2Array7[var13];
								this.anIntArray54[this.anInt246] = var14;
								this.anIntArray55[this.anInt246] = var15;
								++this.anInt246;
							}
						}
					}
				}
			}
		} catch (RuntimeException var21) {
			signlink.reporterror("23407, " + arg0 + ", " + arg1 + ", " + var21.toString());
			throw new RuntimeException();
		}
	}

	public final void method107(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		try {
			int var7 = this.aClass33_1.method494(arg1, arg3, arg5);
			int var8;
			int var9;
			int var10;
			int var11;
			int var13;
			int var14;
			if (var7 != 0) {
				var8 = this.aClass33_1.method498(arg1, arg3, arg5, var7);
				var9 = var8 >> 6 & 3;
				var10 = var8 & 31;
				var11 = arg2;
				if (var7 > 0) {
					var11 = arg4;
				}
				int[] var12 = this.aClass1_Sub3_Sub2_Sub2_6.anIntArray148;
				var13 = 24624 + arg3 * 4 + (103 - arg5) * 512 * 4;
				var14 = var7 >> 14 & 32767;
				Class2 var15 = Class2.method23(var14);
				if (var15.anInt48 != -1) {
					Class1_Sub3_Sub2_Sub3 var16 = this.aClass1_Sub3_Sub2_Sub3Array3[var15.anInt48];
					if (var16 != null) {
						int var17 = (var15.anInt43 * 4 - var16.anInt513) / 2;
						int var18 = (var15.anInt44 * 4 - var16.anInt514) / 2;
						var16.method350(48 + (104 - arg5 - var15.anInt44) * 4 + var18, 48 + arg3 * 4 + var17, false);
					}
				} else {
					if (var10 == 0 || var10 == 2) {
						if (var9 == 0) {
							var12[var13] = var11;
							var12[var13 + 512] = var11;
							var12[var13 + 1024] = var11;
							var12[var13 + 1536] = var11;
						} else if (var9 == 1) {
							var12[var13] = var11;
							var12[var13 + 1] = var11;
							var12[var13 + 2] = var11;
							var12[var13 + 3] = var11;
						} else if (var9 == 2) {
							var12[var13 + 3] = var11;
							var12[var13 + 3 + 512] = var11;
							var12[var13 + 3 + 1024] = var11;
							var12[var13 + 3 + 1536] = var11;
						} else if (var9 == 3) {
							var12[var13 + 1536] = var11;
							var12[var13 + 1536 + 1] = var11;
							var12[var13 + 1536 + 2] = var11;
							var12[var13 + 1536 + 3] = var11;
						}
					}
					if (var10 == 3) {
						if (var9 == 0) {
							var12[var13] = var11;
						} else if (var9 == 1) {
							var12[var13 + 3] = var11;
						} else if (var9 == 2) {
							var12[var13 + 3 + 1536] = var11;
						} else if (var9 == 3) {
							var12[var13 + 1536] = var11;
						}
					}
					if (var10 == 2) {
						if (var9 == 3) {
							var12[var13] = var11;
							var12[var13 + 512] = var11;
							var12[var13 + 1024] = var11;
							var12[var13 + 1536] = var11;
						} else if (var9 == 0) {
							var12[var13] = var11;
							var12[var13 + 1] = var11;
							var12[var13 + 2] = var11;
							var12[var13 + 3] = var11;
						} else if (var9 == 1) {
							var12[var13 + 3] = var11;
							var12[var13 + 3 + 512] = var11;
							var12[var13 + 3 + 1024] = var11;
							var12[var13 + 3 + 1536] = var11;
						} else if (var9 == 2) {
							var12[var13 + 1536] = var11;
							var12[var13 + 1536 + 1] = var11;
							var12[var13 + 1536 + 2] = var11;
							var12[var13 + 1536 + 3] = var11;
						}
					}
				}
			}
			var7 = this.aClass33_1.method496(arg1, arg3, arg5);
			int var20 = 56 / arg0;
			if (var7 != 0) {
				var8 = this.aClass33_1.method498(arg1, arg3, arg5, var7);
				var9 = var8 >> 6 & 3;
				var10 = var8 & 31;
				var11 = var7 >> 14 & 32767;
				Class2 var23 = Class2.method23(var11);
				int var27;
				if (var23.anInt48 != -1) {
					Class1_Sub3_Sub2_Sub3 var25 = this.aClass1_Sub3_Sub2_Sub3Array3[var23.anInt48];
					if (var25 != null) {
						var14 = (var23.anInt43 * 4 - var25.anInt513) / 2;
						var27 = (var23.anInt44 * 4 - var25.anInt514) / 2;
						var25.method350(48 + (104 - arg5 - var23.anInt44) * 4 + var27, 48 + arg3 * 4 + var14, false);
					}
				} else if (var10 == 9) {
					var13 = 15658734;
					if (var7 > 0) {
						var13 = 15597568;
					}
					int[] var26 = this.aClass1_Sub3_Sub2_Sub2_6.anIntArray148;
					var27 = 24624 + arg3 * 4 + (103 - arg5) * 512 * 4;
					if (var9 != 0 && var9 != 2) {
						var26[var27] = var13;
						var26[var27 + 512 + 1] = var13;
						var26[var27 + 1024 + 2] = var13;
						var26[var27 + 1536 + 3] = var13;
					} else {
						var26[var27 + 1536] = var13;
						var26[var27 + 1024 + 1] = var13;
						var26[var27 + 512 + 2] = var13;
						var26[var27 + 3] = var13;
					}
				}
			}
			var7 = this.aClass33_1.method497(arg1, arg3, arg5);
			if (var7 != 0) {
				var8 = var7 >> 14 & 32767;
				Class2 var21 = Class2.method23(var8);
				if (var21.anInt48 != -1) {
					Class1_Sub3_Sub2_Sub3 var22 = this.aClass1_Sub3_Sub2_Sub3Array3[var21.anInt48];
					if (var22 != null) {
						var11 = (var21.anInt43 * 4 - var22.anInt513) / 2;
						int var24 = (var21.anInt44 * 4 - var22.anInt514) / 2;
						var22.method350(48 + (104 - arg5 - var21.anInt44) * 4 + var24, 48 + arg3 * 4 + var11, false);
						return;
					}
				}
			}
		} catch (RuntimeException var19) {
			signlink.reporterror("84395, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + var19.toString());
			throw new RuntimeException();
		}
	}

	private final void method108(Class1_Sub3_Sub3 arg0, int arg1, boolean arg2) {
		try {
			this.anInt255 = 0;
			this.anInt206 = 0;
			this.method181(-542, arg0, arg1);
			this.method141(false, arg0, arg1);
			this.method81(arg0, arg1, this.anInt302);
			if (arg2) {
				anInt268 = 338;
			}
			int var5;
			for (int var4 = 0; var4 < this.anInt255; ++var4) {
				var5 = this.anIntArray60[var4];
				if (this.aClass1_Sub1_Sub3_Sub1Array1[var5].anInt932 != anInt266) {
					this.aClass1_Sub1_Sub3_Sub1Array1[var5].aClass3_1 = null;
					this.aClass1_Sub1_Sub3_Sub1Array1[var5] = null;
				}
			}
			if (arg0.anInt561 != arg1) {
				signlink.reporterror(this.aString13 + " size mismatch in getnpcpos - pos:" + arg0.anInt561 + " psize:" + arg1);
				throw new RuntimeException("eek");
			} else {
				for (var5 = 0; var5 < this.anInt248; ++var5) {
					if (this.aClass1_Sub1_Sub3_Sub1Array1[this.anIntArray58[var5]] == null) {
						signlink.reporterror(this.aString13 + " null entry in npc list - pos:" + var5 + " size:" + this.anInt248);
						throw new RuntimeException("eek");
					}
				}
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("3750, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	public final void method73(Runnable arg0, int arg1) {
		if (signlink.mainapp != null) {
			signlink.startthread(arg0, arg1);
		} else {
			super.method73(arg0, arg1);
		}
	}

	public final void method109(int arg0) {
		try {
			this.aClass1_Sub3_Sub2_Sub3_19 = new Class1_Sub3_Sub2_Sub3(this.aClass39_1, "titlebox", 0);
			this.aClass1_Sub3_Sub2_Sub3_20 = new Class1_Sub3_Sub2_Sub3(this.aClass39_1, "titlebutton", 0);
			if (arg0 != 0) {
				this.anInt179 = this.aClass1_Sub3_Sub3_5.method391();
			}
			this.aClass1_Sub3_Sub2_Sub3Array2 = new Class1_Sub3_Sub2_Sub3[12];
			for (int var2 = 0; var2 < 12; ++var2) {
				this.aClass1_Sub3_Sub2_Sub3Array2[var2] = new Class1_Sub3_Sub2_Sub3(this.aClass39_1, "runes", var2);
			}
			this.aClass1_Sub3_Sub2_Sub2_3 = new Class1_Sub3_Sub2_Sub2(128, 265);
			this.aClass1_Sub3_Sub2_Sub2_4 = new Class1_Sub3_Sub2_Sub2(128, 265);
			for (int var3 = 0; var3 < 33920; ++var3) {
				this.aClass1_Sub3_Sub2_Sub2_3.anIntArray148[var3] = this.aClass32_19.anIntArray197[var3];
			}
			for (int var4 = 0; var4 < 33920; ++var4) {
				this.aClass1_Sub3_Sub2_Sub2_4.anIntArray148[var4] = this.aClass32_20.anIntArray197[var4];
			}
			this.anIntArray51 = new int[256];
			for (int var5 = 0; var5 < 64; ++var5) {
				this.anIntArray51[var5] = var5 * 262144;
			}
			for (int var6 = 0; var6 < 64; ++var6) {
				this.anIntArray51[var6 + 64] = 16711680 + 1024 * var6;
			}
			for (int var7 = 0; var7 < 64; ++var7) {
				this.anIntArray51[var7 + 128] = 16776960 + 4 * var7;
			}
			for (int var8 = 0; var8 < 64; ++var8) {
				this.anIntArray51[var8 + 192] = 16777215;
			}
			this.anIntArray52 = new int[256];
			for (int var9 = 0; var9 < 64; ++var9) {
				this.anIntArray52[var9] = var9 * 1024;
			}
			for (int var10 = 0; var10 < 64; ++var10) {
				this.anIntArray52[var10 + 64] = 65280 + 4 * var10;
			}
			for (int var11 = 0; var11 < 64; ++var11) {
				this.anIntArray52[var11 + 128] = 65535 + 262144 * var11;
			}
			for (int var12 = 0; var12 < 64; ++var12) {
				this.anIntArray52[var12 + 192] = 16777215;
			}
			this.anIntArray53 = new int[256];
			for (int var13 = 0; var13 < 64; ++var13) {
				this.anIntArray53[var13] = var13 * 4;
			}
			for (int var14 = 0; var14 < 64; ++var14) {
				this.anIntArray53[var14 + 64] = 255 + 262144 * var14;
			}
			for (int var15 = 0; var15 < 64; ++var15) {
				this.anIntArray53[var15 + 128] = 16711935 + 1024 * var15;
			}
			for (int var16 = 0; var16 < 64; ++var16) {
				this.anIntArray53[var16 + 192] = 16777215;
			}
			this.anIntArray50 = new int[256];
			this.anIntArray41 = new int[32768];
			this.anIntArray42 = new int[32768];
			this.method183(578, (Class1_Sub3_Sub2_Sub3) null);
			this.anIntArray64 = new int[32768];
			this.anIntArray65 = new int[32768];
			this.method74(true, "Connecting to fileserver", 10);
			if (!this.aBoolean54) {
				this.aBoolean63 = true;
				this.aBoolean54 = true;
				this.method73(this, 2);
			}
		} catch (RuntimeException var17) {
			signlink.reporterror("57688, " + arg0 + ", " + var17.toString());
			throw new RuntimeException();
		}
	}

	private final void method110(int arg0, Class1_Sub3_Sub3 arg1, int arg2) {
		try {
			int var4 = arg1.method402(9, 8);
			int var5;
			if (arg2 != 0) {
				for (var5 = 1; var5 > 0; ++var5) {
				}
			}
			if (var4 < this.anInt205) {
				for (var5 = var4; var5 < this.anInt205; ++var5) {
					this.anIntArray60[this.anInt255++] = this.anIntArray39[var5];
				}
			}
			if (var4 > this.anInt205) {
				signlink.reporterror(this.aString13 + " Too many players");
				throw new RuntimeException("eek");
			} else {
				this.anInt205 = 0;
				for (var5 = 0; var5 < var4; ++var5) {
					int var6 = this.anIntArray39[var5];
					Class1_Sub1_Sub3_Sub2 var7 = this.aClass1_Sub1_Sub3_Sub2Array1[var6];
					int var8 = arg1.method402(9, 1);
					if (var8 == 0) {
						this.anIntArray39[this.anInt205++] = var6;
						var7.anInt932 = anInt266;
					} else {
						int var9 = arg1.method402(9, 2);
						if (var9 == 0) {
							this.anIntArray39[this.anInt205++] = var6;
							var7.anInt932 = anInt266;
							this.anIntArray40[this.anInt206++] = var6;
						} else {
							int var10;
							int var11;
							if (var9 == 1) {
								this.anIntArray39[this.anInt205++] = var6;
								var7.anInt932 = anInt266;
								var10 = arg1.method402(9, 3);
								var7.method570(false, var10, (byte) 6);
								var11 = arg1.method402(9, 1);
								if (var11 == 1) {
									this.anIntArray40[this.anInt206++] = var6;
								}
							} else if (var9 == 2) {
								this.anIntArray39[this.anInt205++] = var6;
								var7.anInt932 = anInt266;
								var10 = arg1.method402(9, 3);
								var7.method570(true, var10, (byte) 6);
								var11 = arg1.method402(9, 3);
								var7.method570(true, var11, (byte) 6);
								int var12 = arg1.method402(9, 1);
								if (var12 == 1) {
									this.anIntArray40[this.anInt206++] = var6;
								}
							} else if (var9 == 3) {
								this.anIntArray60[this.anInt255++] = var6;
							}
						}
					}
				}
			}
		} catch (RuntimeException var13) {
			signlink.reporterror("65167, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var13.toString());
			throw new RuntimeException();
		}
	}

	public final void method111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		try {
			this.aClass1_Sub3_Sub2_Sub3_17.method350(arg2, arg1, false);
			this.aClass1_Sub3_Sub2_Sub3_18.method350(arg2 + arg5 - 16, arg1, false);
			Class1_Sub3_Sub2.method358(arg2 + 16, arg1, this.anInt295, (byte) 93, 16, arg5 - 32);
			int var7 = (arg5 - 32) * arg5 / arg4;
			if (var7 < 8) {
				var7 = 8;
			}
			int var8 = (arg5 - 32 - var7) * arg3 / (arg4 - arg5);
			if (arg0 <= 0) {
				this.anInt179 = -1;
			}
			Class1_Sub3_Sub2.method358(arg2 + 16 + var8, arg1, this.anInt345, (byte) 93, 16, var7);
			Class1_Sub3_Sub2.method361(this.anInt278, this.anInt145, arg2 + 16 + var8, var7, arg1);
			Class1_Sub3_Sub2.method361(this.anInt278, this.anInt145, arg2 + 16 + var8, var7, arg1 + 1);
			Class1_Sub3_Sub2.method360(this.anInt278, 0, arg2 + 16 + var8, 16, arg1);
			Class1_Sub3_Sub2.method360(this.anInt278, 0, arg2 + 17 + var8, 16, arg1);
			Class1_Sub3_Sub2.method361(this.anInt275, this.anInt145, arg2 + 16 + var8, var7, arg1 + 15);
			Class1_Sub3_Sub2.method361(this.anInt275, this.anInt145, arg2 + 17 + var8, var7 - 1, arg1 + 14);
			Class1_Sub3_Sub2.method360(this.anInt275, 0, arg2 + 15 + var8 + var7, 16, arg1);
			Class1_Sub3_Sub2.method360(this.anInt275, 0, arg2 + 14 + var8 + var7, 15, arg1 + 1);
		} catch (RuntimeException var9) {
			signlink.reporterror("15221, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + var9.toString());
			throw new RuntimeException();
		}
	}

	public final void method112(byte arg0) {
		try {
			this.aBoolean39 = true;
			if (arg0 != -6) {
				this.aClass28ArrayArrayArray1 = null;
			}
			for (int var2 = 0; var2 < 7; ++var2) {
				this.anIntArray35[var2] = -1;
				for (int var3 = 0; var3 < Class13.anInt437; ++var3) {
					if (!Class13.aClass13Array1[var3].aBoolean101 && Class13.aClass13Array1[var3].anInt438 == var2 + (this.aBoolean43 ? 0 : 7)) {
						this.anIntArray35[var2] = var3;
						break;
					}
				}
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("82165, " + arg0 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	public final void method113(byte[] arg0, int arg1, int arg2, boolean arg3) {
		try {
			if (arg1 <= 0) {
				this.aBoolean44 = !this.aBoolean44;
			}
			signlink.anInt761 = arg3 ? 1 : 0;
			signlink.midisave(arg0, arg2);
		} catch (RuntimeException var6) {
			signlink.reporterror("21924, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	public final void method114(boolean arg0) {
		try {
			for (int var2 = 0; var2 < this.anInt248; ++var2) {
				Class1_Sub1_Sub3_Sub1 var3 = this.aClass1_Sub1_Sub3_Sub1Array1[this.anIntArray58[var2]];
				int var4 = 536870912 + (this.anIntArray58[var2] << 14);
				if (var3 != null && var3.method571(false)) {
					int var5 = var3.anInt890 >> 7;
					int var6 = var3.anInt891 >> 7;
					if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
						if (var3.anInt893 == 1 && (var3.anInt890 & 127) == 64 && (var3.anInt891 & 127) == 64) {
							if (this.anIntArrayArray3[var5][var6] == this.anInt211) {
								continue;
							}
							this.anIntArrayArray3[var5][var6] = this.anInt211;
						}
						this.aClass33_1.method478(-44713, var3.anInt891, (var3.anInt893 - 1) * 64 + 60, var3.anInt892, var3.anInt890, var4, var3.aBoolean162, (Class1_Sub3_Sub1) null, var3, this.method94(this.anInt231, var3.anInt890, (byte) 5, var3.anInt891), this.anInt231);
					}
				}
			}
			if (arg0) {
				this.anInt179 = -1;
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("90018, " + arg0 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	public final void method115(int arg0, int arg1, boolean arg2) {
		try {
			signlink.anInt760 = arg1;
			this.anInt178 += arg0;
			if (arg2) {
				signlink.midi = "voladjust";
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("59417, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	public final void method116(int arg0) {
		try {
			this.method156((byte) 99);
			this.aClass32_18.method463((byte) 62);
			if (arg0 >= 4 && arg0 <= 4) {
				this.aClass1_Sub3_Sub2_Sub3_19.method350(0, 0, false);
				short var2 = 360;
				short var3 = 200;
				int var4;
				int var5;
				int var6;
				if (this.anInt320 == 0) {
					var4 = var3 / 2 - 20;
					this.aClass1_Sub3_Sub2_Sub4_3.method363(var2 / 2, 16776960, true, var4, "Welcome to RuneScape", 0);
					int var8 = var4 + 30;
					var5 = var2 / 2 - 80;
					var6 = var3 / 2 + 20;
					this.aClass1_Sub3_Sub2_Sub3_20.method350(var6 - 20, var5 - 73, false);
					this.aClass1_Sub3_Sub2_Sub4_3.method363(var5, 16777215, true, var6 + 5, "New user", 0);
					int var9 = var2 / 2 + 80;
					this.aClass1_Sub3_Sub2_Sub3_20.method350(var6 - 20, var9 - 73, false);
					this.aClass1_Sub3_Sub2_Sub4_3.method363(var9, 16777215, true, var6 + 5, "Existing User", 0);
				}
				if (this.anInt320 == 2) {
					var4 = var3 / 2 - 40;
					if (this.aString15.length() > 0) {
						this.aClass1_Sub3_Sub2_Sub4_3.method363(var2 / 2, 16776960, true, var4 - 15, this.aString15, 0);
						this.aClass1_Sub3_Sub2_Sub4_3.method363(var2 / 2, 16776960, true, var4, this.aString16, 0);
						var4 += 30;
					} else {
						this.aClass1_Sub3_Sub2_Sub4_3.method363(var2 / 2, 16776960, true, var4 - 7, this.aString16, 0);
						var4 += 30;
					}
					this.aClass1_Sub3_Sub2_Sub4_3.method367(var2 / 2 - 90, 6, var4, "Username: " + this.aString13 + (this.anInt272 == 0 & anInt266 % 40 < 20 ? "@yel@|" : ""), true, 16777215);
					var4 += 15;
					this.aClass1_Sub3_Sub2_Sub4_3.method367(var2 / 2 - 88, 6, var4, "Password: " + Class40.method544(7, this.aString14) + (this.anInt272 == 1 & anInt266 % 40 < 20 ? "@yel@|" : ""), true, 16777215);
					var4 += 15;
					var5 = var2 / 2 - 80;
					var6 = var3 / 2 + 50;
					this.aClass1_Sub3_Sub2_Sub3_20.method350(var6 - 20, var5 - 73, false);
					this.aClass1_Sub3_Sub2_Sub4_3.method363(var5, 16777215, true, var6 + 5, "Login", 0);
					var5 = var2 / 2 + 80;
					this.aClass1_Sub3_Sub2_Sub3_20.method350(var6 - 20, var5 - 73, false);
					this.aClass1_Sub3_Sub2_Sub4_3.method363(var5, 16777215, true, var6 + 5, "Cancel", 0);
				}
				if (this.anInt320 == 3) {
					this.aClass1_Sub3_Sub2_Sub4_3.method363(var2 / 2, 16776960, true, var3 / 2 - 60, "Create a free account", 0);
					var4 = var3 / 2 - 35;
					this.aClass1_Sub3_Sub2_Sub4_3.method363(var2 / 2, 16777215, true, var4, "To create a new account you need to", 0);
					var4 += 15;
					this.aClass1_Sub3_Sub2_Sub4_3.method363(var2 / 2, 16777215, true, var4, "go back to the main RuneScape webpage", 0);
					var4 += 15;
					this.aClass1_Sub3_Sub2_Sub4_3.method363(var2 / 2, 16777215, true, var4, "and choose the red 'create account'", 0);
					var4 += 15;
					this.aClass1_Sub3_Sub2_Sub4_3.method363(var2 / 2, 16777215, true, var4, "button at the top right of that page.", 0);
					var4 += 15;
					var5 = var2 / 2;
					var6 = var3 / 2 + 50;
					this.aClass1_Sub3_Sub2_Sub3_20.method350(var6 - 20, var5 - 73, false);
					this.aClass1_Sub3_Sub2_Sub4_3.method363(var5, 16777215, true, var6 + 5, "Cancel", 0);
				}
				this.aClass32_18.method464(186, super.aGraphics2, 214, 5193);
				if (this.aBoolean37) {
					this.aBoolean37 = false;
					this.aClass32_16.method464(0, super.aGraphics2, 128, 5193);
					this.aClass32_17.method464(386, super.aGraphics2, 214, 5193);
					this.aClass32_21.method464(265, super.aGraphics2, 0, 5193);
					this.aClass32_22.method464(265, super.aGraphics2, 574, 5193);
					this.aClass32_23.method464(186, super.aGraphics2, 128, 5193);
					this.aClass32_24.method464(186, super.aGraphics2, 574, 5193);
				}
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("76487, " + arg0 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	public final void method117(int arg0) {
		try {
			if (this.aClass32_28 == null) {
				this.method99(true);
				super.aClass32_2 = null;
				this.aClass32_16 = null;
				this.aClass32_17 = null;
				this.aClass32_18 = null;
				this.aClass32_19 = null;
				if (arg0 == -7185) {
					this.aClass32_20 = null;
					this.aClass32_21 = null;
					this.aClass32_22 = null;
					this.aClass32_23 = null;
					this.aClass32_24 = null;
					this.aClass32_28 = new Class32(this.method72(aByte16), 479, 299, 96);
					this.aClass32_26 = new Class32(this.method72(aByte16), 168, 299, 160);
					Class1_Sub3_Sub2.method357(this.anInt336);
					this.aClass1_Sub3_Sub2_Sub3_10.method350(0, 0, false);
					this.aClass32_25 = new Class32(this.method72(aByte16), 190, 299, 261);
					this.aClass32_27 = new Class32(this.method72(aByte16), 512, 299, 334);
					Class1_Sub3_Sub2.method357(this.anInt336);
					this.aClass32_3 = new Class32(this.method72(aByte16), 501, 299, 61);
					this.aClass32_4 = new Class32(this.method72(aByte16), 288, 299, 40);
					this.aClass32_5 = new Class32(this.method72(aByte16), 269, 299, 66);
					this.aBoolean37 = true;
				}
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("20178, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	private final void method118(int arg0, int arg1, Class1_Sub3_Sub3 arg2) {
		try {
			int var4;
			if (arg0 < 2 || arg0 > 2) {
				for (var4 = 1; var4 > 0; ++var4) {
				}
			}
			while (arg2.anInt562 + 10 < arg1 * 8) {
				var4 = arg2.method402(9, 11);
				if (var4 == 2047) {
					break;
				}
				if (this.aClass1_Sub1_Sub3_Sub2Array1[var4] == null) {
					this.aClass1_Sub1_Sub3_Sub2Array1[var4] = new Class1_Sub1_Sub3_Sub2();
					if (this.aClass1_Sub3_Sub3Array1[var4] != null) {
						this.aClass1_Sub1_Sub3_Sub2Array1[var4].method572(false, this.aClass1_Sub3_Sub3Array1[var4]);
					}
				}
				this.anIntArray39[this.anInt205++] = var4;
				Class1_Sub1_Sub3_Sub2 var5 = this.aClass1_Sub1_Sub3_Sub2Array1[var4];
				var5.anInt932 = anInt266;
				int var6 = arg2.method402(9, 5);
				if (var6 > 15) {
					var6 -= 32;
				}
				int var7 = arg2.method402(9, 5);
				if (var7 > 15) {
					var7 -= 32;
				}
				int var8 = arg2.method402(9, 1);
				var5.method569(false, var8 == 1, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0] + var6, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0] + var7);
				int var9 = arg2.method402(9, 1);
				if (var9 == 1) {
					this.anIntArray40[this.anInt206++] = var4;
				}
			}
			arg2.method403(this.anInt197);
		} catch (RuntimeException var10) {
			signlink.reporterror("52149, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var10.toString());
			throw new RuntimeException();
		}
	}

	public final void method119(int arg0) {
		try {
			try {
				if (this.aClass6_1 != null) {
					this.aClass6_1.method201();
				}
			} catch (Exception var3) {
			}
			this.aClass6_1 = null;
			this.aBoolean62 = false;
			this.anInt320 = 0;
			this.aString13 = "";
			this.aString14 = "";
			Class8.method209((byte) 65);
			this.method144(this.aByte10);
			if (arg0 < 0) {
				this.aClass33_1.method467(742);
				for (int var2 = 0; var2 < 4; ++var2) {
					this.aClass9Array1[var2].method249((byte) 74);
				}
				System.gc();
				this.method78(0);
				this.aString17 = null;
				this.anInt157 = 0;
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("36279, " + arg0 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	public final void method120(int arg0, int arg1, int arg2, Class15 arg3, int arg4) {
		try {
			if (arg3.anInt472 == 0 && arg3.anIntArray153 != null) {
				if (!arg3.aBoolean106 || this.anInt300 == arg3.anInt470 || this.anInt256 == arg3.anInt470 || this.anInt221 == arg3.anInt470) {
					int var6 = Class1_Sub3_Sub2.anInt532;
					int var7 = Class1_Sub3_Sub2.anInt530;
					int var8 = Class1_Sub3_Sub2.anInt533;
					int var9 = Class1_Sub3_Sub2.anInt531;
					if (arg2 != 38682) {
						this.anInt179 = -1;
					}
					Class1_Sub3_Sub2.method356(arg0 + arg3.anInt476, arg0, arg1 + arg3.anInt475, 789, arg1);
					int var10 = arg3.anIntArray153.length;
					for (int var11 = 0; var11 < var10; ++var11) {
						int var12 = arg3.anIntArray154[var11] + arg1;
						int var13 = arg3.anIntArray155[var11] + arg0 - arg4;
						Class15 var14 = Class15.aClass15Array1[arg3.anIntArray153[var11]];
						int var26 = var12 + var14.anInt477;
						int var27 = var13 + var14.anInt478;
						if (var14.anInt474 > 0) {
							this.method137(0, var14);
						}
						if (var14.anInt472 == 0) {
							if (var14.anInt481 > var14.anInt480 - var14.anInt476) {
								var14.anInt481 = var14.anInt480 - var14.anInt476;
							}
							if (var14.anInt481 < 0) {
								var14.anInt481 = 0;
							}
							this.method120(var27, var26, 38682, var14, var14.anInt481);
							if (var14.anInt480 > var14.anInt476) {
								this.method111(this.anInt192, var26 + var14.anInt475, var27, var14.anInt481, var14.anInt480, var14.anInt476);
							}
						} else if (var14.anInt472 != 1) {
							int var16;
							int var17;
							int var18;
							int var21;
							int var22;
							int var28;
							int var33;
							int var34;
							if (var14.anInt472 == 2) {
								var28 = 0;
								for (var16 = 0; var16 < var14.anInt476; ++var16) {
									for (var17 = 0; var17 < var14.anInt475; ++var17) {
										var18 = var26 + var17 * (32 + var14.anInt483);
										var33 = var27 + var16 * (32 + var14.anInt484);
										if (var28 < 20) {
											var18 += var14.anIntArray156[var28];
											var33 += var14.anIntArray157[var28];
										}
										if (var14.anIntArray149[var28] <= 0) {
											if (var14.aClass1_Sub3_Sub2_Sub2Array8 != null && var28 < 20) {
												Class1_Sub3_Sub2_Sub2 var37 = var14.aClass1_Sub3_Sub2_Sub2Array8[var28];
												if (var37 != null) {
													var37.method322(var33, var18, false);
												}
											}
										} else {
											var34 = 0;
											var21 = 0;
											var22 = var14.anIntArray149[var28] - 1;
											if (var18 >= -32 && var18 <= 512 && var33 >= -32 && var33 <= 334 || this.anInt216 != 0 && this.anInt215 == var28) {
												Class1_Sub3_Sub2_Sub2 var23 = Class5.method59(var22, 24638, var14.anIntArray150[var28]);
												if (this.anInt216 != 0 && this.anInt215 == var28 && this.anInt214 == var14.anInt470) {
													var34 = super.anInt135 - this.anInt217;
													var21 = super.anInt136 - this.anInt218;
													if (var34 < 5 && var34 > -5) {
														var34 = 0;
													}
													if (var21 < 5 && var21 > -5) {
														var21 = 0;
													}
													if (this.anInt247 < 5) {
														var34 = 0;
														var21 = 0;
													}
													var23.method326(128, var18 + var34, var33 + var21, (byte) -26);
												} else if (this.anInt260 != 0 && this.anInt259 == var28 && this.anInt258 == var14.anInt470) {
													var23.method326(128, var18, var33, (byte) -26);
												} else {
													var23.method322(var33, var18, false);
												}
												if (var23.anInt465 == 33 || var14.anIntArray150[var28] != 1) {
													int var24 = var14.anIntArray150[var28];
													this.aClass1_Sub3_Sub2_Sub4_1.method365(var18 + 1 + var34, var33 + 10 + var21, false, 0, method169(true, var24));
													this.aClass1_Sub3_Sub2_Sub4_1.method365(var18 + var34, var33 + 9 + var21, false, 16776960, method169(true, var24));
												}
											}
										}
										++var28;
									}
								}
							} else if (var14.anInt472 == 3) {
								if (var14.aBoolean111) {
									Class1_Sub3_Sub2.method358(var27, var26, var14.anInt485, (byte) 93, var14.anInt475, var14.anInt476);
								} else {
									Class1_Sub3_Sub2.method359(3, var26, var14.anInt485, var14.anInt476, var27, var14.anInt475);
								}
							} else {
								Class1_Sub3_Sub2_Sub4 var15;
								if (var14.anInt472 == 4) {
									var15 = var14.aClass1_Sub3_Sub2_Sub4_5;
									var16 = var14.anInt485;
									String var30 = var14.aString20;
									if ((this.anInt221 == var14.anInt470 || this.anInt256 == var14.anInt470 || this.anInt300 == var14.anInt470) && var14.anInt487 != 0) {
										var16 = var14.anInt487;
									}
									if (this.method175(var14, 65)) {
										var16 = var14.anInt486;
										if (var14.aString21.length() > 0) {
											var30 = var14.aString21;
										}
									}
									if (var14.anInt473 == 6 && this.aBoolean49) {
										var30 = "Please wait...";
										var16 = var14.anInt485;
									}
									var33 = var27 + var15.anInt540;
									while (var30.length() > 0) {
										if (var30.indexOf("%") != -1) {
											label264: while (true) {
												var34 = var30.indexOf("%1");
												if (var34 == -1) {
													while (true) {
														var34 = var30.indexOf("%2");
														if (var34 == -1) {
															while (true) {
																var34 = var30.indexOf("%3");
																if (var34 == -1) {
																	while (true) {
																		var34 = var30.indexOf("%4");
																		if (var34 == -1) {
																			while (true) {
																				var34 = var30.indexOf("%5");
																				if (var34 == -1) {
																					break label264;
																				}
																				var30 = var30.substring(0, var34) + this.method150(this.method187(var14, false, 4), -676) + var30.substring(var34 + 2);
																			}
																		}
																		var30 = var30.substring(0, var34) + this.method150(this.method187(var14, false, 3), -676) + var30.substring(var34 + 2);
																	}
																}
																var30 = var30.substring(0, var34) + this.method150(this.method187(var14, false, 2), -676) + var30.substring(var34 + 2);
															}
														}
														var30 = var30.substring(0, var34) + this.method150(this.method187(var14, false, 1), -676) + var30.substring(var34 + 2);
													}
												}
												var30 = var30.substring(0, var34) + this.method150(this.method187(var14, false, 0), -676) + var30.substring(var34 + 2);
											}
										}
										var34 = var30.indexOf("\\n");
										String var31;
										if (var34 != -1) {
											var31 = var30.substring(0, var34);
											var30 = var30.substring(var34 + 2);
										} else {
											var31 = var30;
											var30 = "";
										}
										if (var14.aBoolean112) {
											var15.method363(var26 + var14.anInt475 / 2, var16, var14.aBoolean113, var33, var31, 0);
										} else {
											var15.method367(var26, 6, var33, var31, var14.aBoolean113, var16);
										}
										var33 += var15.anInt540;
									}
								} else if (var14.anInt472 == 5) {
									Class1_Sub3_Sub2_Sub2 var29;
									if (this.method175(var14, 65)) {
										var29 = var14.aClass1_Sub3_Sub2_Sub2_13;
									} else {
										var29 = var14.aClass1_Sub3_Sub2_Sub2_12;
									}
									if (var29 != null) {
										var29.method322(var27, var26, false);
									}
								} else if (var14.anInt472 == 6) {
									var28 = Class1_Sub3_Sub2_Sub1.anInt430;
									var16 = Class1_Sub3_Sub2_Sub1.anInt431;
									Class1_Sub3_Sub2_Sub1.anInt430 = var26 + var14.anInt475 / 2;
									Class1_Sub3_Sub2_Sub1.anInt431 = var27 + var14.anInt476 / 2;
									var17 = Class1_Sub3_Sub2_Sub1.anIntArray137[var14.anInt491] * var14.anInt490 >> 16;
									var18 = Class1_Sub3_Sub2_Sub1.anIntArray138[var14.anInt491] * var14.anInt490 >> 16;
									boolean var32 = this.method175(var14, 65);
									if (var32) {
										var34 = var14.anInt489;
									} else {
										var34 = var14.anInt488;
									}
									Class1_Sub3_Sub1 var35;
									if (var34 == -1) {
										var35 = var14.method332(-1, -1, var32);
									} else {
										Class19 var36 = Class19.aClass19Array1[var34];
										var35 = var14.method332(var36.anIntArray186[var14.anInt468], var36.anIntArray187[var14.anInt468], var32);
									}
									if (var35 != null) {
										var35.method243(0, var14.anInt492, 0, var14.anInt491, 0, var17, var18);
									}
									Class1_Sub3_Sub2_Sub1.anInt430 = var28;
									Class1_Sub3_Sub2_Sub1.anInt431 = var16;
								} else if (var14.anInt472 == 7) {
									var15 = var14.aClass1_Sub3_Sub2_Sub4_5;
									var16 = 0;
									for (var17 = 0; var17 < var14.anInt476; ++var17) {
										for (var18 = 0; var18 < var14.anInt475; ++var18) {
											if (var14.anIntArray149[var16] > 0) {
												Class5 var19 = Class5.method54(var14.anIntArray149[var16] - 1);
												String var20 = var19.aString3;
												if (var19.aBoolean31 || var14.anIntArray150[var16] != 1) {
													var20 = var20 + " x" + method101(var14.anIntArray150[var16], 0);
												}
												var21 = var26 + var18 * (115 + var14.anInt483);
												var22 = var27 + var17 * (12 + var14.anInt484);
												if (var14.aBoolean112) {
													var15.method363(var21 + var14.anInt475 / 2, var14.anInt485, var14.aBoolean113, var22, var20, 0);
												} else {
													var15.method367(var21, 6, var22, var20, var14.aBoolean113, var14.anInt485);
												}
											}
											++var16;
										}
									}
								}
							}
						}
					}
					Class1_Sub3_Sub2.method356(var9, var7, var8, 789, var6);
				}
			}
		} catch (RuntimeException var25) {
			signlink.reporterror("44309, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + var25.toString());
			throw new RuntimeException();
		}
	}

	private final void method121(boolean arg0, int arg1, Class1_Sub3_Sub3 arg2) {
		try {
			for (int var4 = 0; var4 < this.anInt206; ++var4) {
				int var5 = this.anIntArray40[var4];
				Class1_Sub1_Sub3_Sub2 var6 = this.aClass1_Sub1_Sub3_Sub2Array1[var5];
				int var7 = arg2.method391();
				if ((var7 & 128) == 128) {
					var7 += arg2.method391() << 8;
				}
				this.method200(true, var5, var7, arg2, var6);
			}
			this.aBoolean62 &= arg0;
		} catch (RuntimeException var8) {
			signlink.reporterror("96435, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	public final void method122(int arg0, int arg1) {
		try {
			int var7 = 19 / arg1;
			int var3 = Class23.aClass23Array1[arg0].anInt609;
			if (var3 != 0) {
				int var4 = this.anIntArray59[arg0];
				if (var3 == 1) {
					if (var4 == 1) {
						Class1_Sub3_Sub2_Sub1.method296(true, 0.9D);
					}
					if (var4 == 2) {
						Class1_Sub3_Sub2_Sub1.method296(true, 0.8D);
					}
					if (var4 == 3) {
						Class1_Sub3_Sub2_Sub1.method296(true, 0.7D);
					}
					if (var4 == 4) {
						Class1_Sub3_Sub2_Sub1.method296(true, 0.6D);
					}
					Class5.aClass35_5.method529();
					this.aBoolean37 = true;
				}
				if (var3 == 3) {
					boolean var5 = this.aBoolean42;
					if (var4 == 0) {
						this.method115(0, 0, this.aBoolean42);
						this.aBoolean42 = true;
					}
					if (var4 == 1) {
						this.method115(0, -400, this.aBoolean42);
						this.aBoolean42 = true;
					}
					if (var4 == 2) {
						this.method115(0, -800, this.aBoolean42);
						this.aBoolean42 = true;
					}
					if (var4 == 3) {
						this.method115(0, -1200, this.aBoolean42);
						this.aBoolean42 = true;
					}
					if (var4 == 4) {
						this.aBoolean42 = false;
					}
					if (this.aBoolean42 != var5) {
						if (this.aBoolean42) {
							this.method75(false, this.anInt321, this.aString17, this.anInt343);
						} else {
							this.method78(0);
						}
						this.anInt157 = 0;
					}
				}
				if (var3 == 4) {
					if (var4 == 0) {
						this.aBoolean73 = true;
						this.method140(0, 0);
					}
					if (var4 == 1) {
						this.aBoolean73 = true;
						this.method140(-400, 0);
					}
					if (var4 == 2) {
						this.aBoolean73 = true;
						this.method140(-800, 0);
					}
					if (var4 == 3) {
						this.aBoolean73 = true;
						this.method140(-1200, 0);
					}
					if (var4 == 4) {
						this.aBoolean73 = false;
					}
				}
				if (var3 == 5) {
					this.anInt196 = var4;
				}
				if (var3 == 6) {
					this.anInt189 = var4;
				}
				if (var3 == 8) {
					this.anInt210 = var4;
					this.aBoolean60 = true;
				}
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("71764, " + arg0 + ", " + arg1 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	public final void method123(boolean arg0) {
		try {
			this.aBoolean62 &= arg0;
			for (int var2 = 0; var2 < this.anInt248; ++var2) {
				int var3 = this.anIntArray58[var2];
				Class1_Sub1_Sub3_Sub1 var4 = this.aClass1_Sub1_Sub3_Sub1Array1[var3];
				if (var4 != null) {
					this.method124(var4, (byte) -128, var4.aClass3_1.aByte4);
				}
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("3061, " + arg0 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	public final void method124(Class1_Sub1_Sub3 arg0, byte arg1, int arg2) {
		try {
			if (arg0.anInt890 < 128 || arg0.anInt891 < 128 || arg0.anInt890 >= 13184 || arg0.anInt891 >= 13184) {
				arg0.anInt915 = -1;
				arg0.anInt920 = -1;
				arg0.anInt929 = 0;
				arg0.anInt930 = 0;
				arg0.anInt890 = arg0.anIntArray232[0] * 128 + arg0.anInt893 * 64;
				arg0.anInt891 = arg0.anIntArray233[0] * 128 + arg0.anInt893 * 64;
				arg0.anInt935 = 0;
			}
			if (arg0 == this.aClass1_Sub1_Sub3_Sub2_1 && (arg0.anInt890 < 1536 || arg0.anInt891 < 1536 || arg0.anInt890 >= 11776 || arg0.anInt891 >= 11776)) {
				arg0.anInt915 = -1;
				arg0.anInt920 = -1;
				arg0.anInt929 = 0;
				arg0.anInt930 = 0;
				arg0.anInt890 = arg0.anIntArray232[0] * 128 + arg0.anInt893 * 64;
				arg0.anInt891 = arg0.anIntArray233[0] * 128 + arg0.anInt893 * 64;
				arg0.anInt935 = 0;
			}
			if (arg0.anInt929 > anInt266) {
				this.method125(arg0, -25115);
			} else if (arg0.anInt930 >= anInt266) {
				this.method126(arg0, 0);
			} else {
				this.method127(598, arg0);
			}
			this.method128(arg0, (byte) 117);
			if (arg1 != -128) {
				this.aClass1_Sub3_Sub3_6.method381(11);
			}
			this.method129(this.aBoolean38, arg0);
		} catch (RuntimeException var5) {
			signlink.reporterror("58564, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	public final void method125(Class1_Sub1_Sub3 arg0, int arg1) {
		try {
			int var3 = arg0.anInt929 - anInt266;
			int var4 = arg0.anInt925 * 128 + arg0.anInt893 * 64;
			int var5 = arg0.anInt927 * 128 + arg0.anInt893 * 64;
			arg0.anInt890 += (var4 - arg0.anInt890) / var3;
			if (arg1 != -25115) {
				this.anInt151 = this.aClass38_1.method532();
			}
			arg0.anInt891 += (var5 - arg0.anInt891) / var3;
			arg0.anInt936 = 0;
			if (arg0.anInt931 == 0) {
				arg0.anInt934 = 1024;
			}
			if (arg0.anInt931 == 1) {
				arg0.anInt934 = 1536;
			}
			if (arg0.anInt931 == 2) {
				arg0.anInt934 = 0;
			}
			if (arg0.anInt931 == 3) {
				arg0.anInt934 = 512;
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("13971, " + arg0 + ", " + arg1 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	public final void method126(Class1_Sub1_Sub3 arg0, int arg1) {
		try {
			this.anInt178 += arg1;
			if (arg0.anInt930 == anInt266 || arg0.anInt915 == -1 || arg0.anInt918 != 0 || arg0.anInt917 + 1 > Class19.aClass19Array1[arg0.anInt915].anIntArray188[arg0.anInt916]) {
				int var3 = arg0.anInt930 - arg0.anInt929;
				int var4 = anInt266 - arg0.anInt929;
				int var5 = arg0.anInt925 * 128 + arg0.anInt893 * 64;
				int var6 = arg0.anInt927 * 128 + arg0.anInt893 * 64;
				int var7 = arg0.anInt926 * 128 + arg0.anInt893 * 64;
				int var8 = arg0.anInt928 * 128 + arg0.anInt893 * 64;
				arg0.anInt890 = (var5 * (var3 - var4) + var7 * var4) / var3;
				arg0.anInt891 = (var6 * (var3 - var4) + var8 * var4) / var3;
			}
			arg0.anInt936 = 0;
			if (arg0.anInt931 == 0) {
				arg0.anInt934 = 1024;
			}
			if (arg0.anInt931 == 1) {
				arg0.anInt934 = 1536;
			}
			if (arg0.anInt931 == 2) {
				arg0.anInt934 = 0;
			}
			if (arg0.anInt931 == 3) {
				arg0.anInt934 = 512;
			}
			arg0.anInt892 = arg0.anInt934;
		} catch (RuntimeException var9) {
			signlink.reporterror("86706, " + arg0 + ", " + arg1 + ", " + var9.toString());
			throw new RuntimeException();
		}
	}

	public final void method127(int arg0, Class1_Sub1_Sub3 arg1) {
		try {
			arg1.anInt912 = arg1.anInt894;
			int var11 = 56 / arg0;
			if (arg1.anInt935 == 0) {
				arg1.anInt936 = 0;
			} else {
				if (arg1.anInt915 != -1 && arg1.anInt918 == 0) {
					Class19 var3 = Class19.aClass19Array1[arg1.anInt915];
					if (var3.anIntArray189 == null) {
						++arg1.anInt936;
						return;
					}
				}
				int var12 = arg1.anInt890;
				int var4 = arg1.anInt891;
				int var5 = arg1.anIntArray232[arg1.anInt935 - 1] * 128 + arg1.anInt893 * 64;
				int var6 = arg1.anIntArray233[arg1.anInt935 - 1] * 128 + arg1.anInt893 * 64;
				if (var5 - var12 <= 256 && var5 - var12 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
					if (var12 < var5) {
						if (var4 < var6) {
							arg1.anInt934 = 1280;
						} else if (var4 > var6) {
							arg1.anInt934 = 1792;
						} else {
							arg1.anInt934 = 1536;
						}
					} else if (var12 > var5) {
						if (var4 < var6) {
							arg1.anInt934 = 768;
						} else if (var4 > var6) {
							arg1.anInt934 = 256;
						} else {
							arg1.anInt934 = 512;
						}
					} else if (var4 < var6) {
						arg1.anInt934 = 1024;
					} else {
						arg1.anInt934 = 0;
					}
					int var7 = arg1.anInt934 - arg1.anInt892 & 2047;
					if (var7 > 1024) {
						var7 -= 2048;
					}
					int var8 = arg1.anInt897;
					if (var7 >= -256 && var7 <= 256) {
						var8 = arg1.anInt896;
					} else if (var7 >= 256 && var7 < 768) {
						var8 = arg1.anInt899;
					} else if (var7 >= -768 && var7 <= -256) {
						var8 = arg1.anInt898;
					}
					if (var8 == -1) {
						var8 = arg1.anInt896;
					}
					arg1.anInt912 = var8;
					int var9 = 4;
					if (arg1.anInt892 != arg1.anInt934 && arg1.anInt909 == -1) {
						var9 = 2;
					}
					if (arg1.anInt935 > 2) {
						var9 = 6;
					}
					if (arg1.anInt935 > 3) {
						var9 = 8;
					}
					if (arg1.anInt936 > 0 && arg1.anInt935 > 1) {
						var9 = 8;
						--arg1.anInt936;
					}
					if (arg1.aBooleanArray9[arg1.anInt935 - 1]) {
						var9 <<= 1;
					}
					if (var9 >= 8 && arg1.anInt912 == arg1.anInt896 && arg1.anInt900 != -1) {
						arg1.anInt912 = arg1.anInt900;
					}
					if (var12 < var5) {
						arg1.anInt890 += var9;
						if (arg1.anInt890 > var5) {
							arg1.anInt890 = var5;
						}
					} else if (var12 > var5) {
						arg1.anInt890 -= var9;
						if (arg1.anInt890 < var5) {
							arg1.anInt890 = var5;
						}
					}
					if (var4 < var6) {
						arg1.anInt891 += var9;
						if (arg1.anInt891 > var6) {
							arg1.anInt891 = var6;
						}
					} else if (var4 > var6) {
						arg1.anInt891 -= var9;
						if (arg1.anInt891 < var6) {
							arg1.anInt891 = var6;
						}
					}
					if (arg1.anInt890 == var5 && arg1.anInt891 == var6) {
						--arg1.anInt935;
					}
				} else {
					arg1.anInt890 = var5;
					arg1.anInt891 = var6;
				}
			}
		} catch (RuntimeException var10) {
			signlink.reporterror("70559, " + arg0 + ", " + arg1 + ", " + var10.toString());
			throw new RuntimeException();
		}
	}

	public final void method128(Class1_Sub1_Sub3 arg0, byte arg1) {
		try {
			if (arg1 != 117) {
				this.aClass1_Sub3_Sub3_6.method381(89);
			}
			int var4;
			int var5;
			if (arg0.anInt909 != -1 && arg0.anInt909 < 32768) {
				Class1_Sub1_Sub3_Sub1 var3 = this.aClass1_Sub1_Sub3_Sub1Array1[arg0.anInt909];
				if (var3 != null) {
					var4 = arg0.anInt890 - var3.anInt890;
					var5 = arg0.anInt891 - var3.anInt891;
					if (var4 != 0 || var5 != 0) {
						arg0.anInt934 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
					}
				}
			}
			int var8;
			if (arg0.anInt909 >= 32768) {
				var8 = arg0.anInt909 - 32768;
				if (var8 == this.anInt152) {
					var8 = this.anInt204;
				}
				Class1_Sub1_Sub3_Sub2 var9 = this.aClass1_Sub1_Sub3_Sub2Array1[var8];
				if (var9 != null) {
					var5 = arg0.anInt890 - var9.anInt890;
					int var6 = arg0.anInt891 - var9.anInt891;
					if (var5 != 0 || var6 != 0) {
						arg0.anInt934 = (int) (Math.atan2((double) var5, (double) var6) * 325.949D) & 2047;
					}
				}
			}
			if ((arg0.anInt910 != 0 || arg0.anInt911 != 0) && (arg0.anInt935 == 0 || arg0.anInt936 > 0)) {
				var8 = arg0.anInt890 - (arg0.anInt910 - this.anInt169 - this.anInt169) * 64;
				var4 = arg0.anInt891 - (arg0.anInt911 - this.anInt170 - this.anInt170) * 64;
				if (var8 != 0 || var4 != 0) {
					arg0.anInt934 = (int) (Math.atan2((double) var8, (double) var4) * 325.949D) & 2047;
				}
				arg0.anInt910 = 0;
				arg0.anInt911 = 0;
			}
			var8 = arg0.anInt934 - arg0.anInt892 & 2047;
			if (var8 != 0) {
				if (var8 >= 32 && var8 <= 2016) {
					if (var8 > 1024) {
						arg0.anInt892 -= 32;
					} else {
						arg0.anInt892 += 32;
					}
				} else {
					arg0.anInt892 = arg0.anInt934;
				}
				arg0.anInt892 &= 2047;
				if (arg0.anInt912 == arg0.anInt894 && arg0.anInt892 != arg0.anInt934) {
					if (arg0.anInt895 != -1) {
						arg0.anInt912 = arg0.anInt895;
						return;
					}
					arg0.anInt912 = arg0.anInt896;
					return;
				}
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("29025, " + arg0 + ", " + arg1 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	public final void method129(boolean arg0, Class1_Sub1_Sub3 arg1) {
		try {
			if (arg0) {
				arg1.aBoolean162 = false;
				Class19 var3;
				if (arg1.anInt912 != -1) {
					var3 = Class19.aClass19Array1[arg1.anInt912];
					++arg1.anInt914;
					if (arg1.anInt913 < var3.anInt543 && arg1.anInt914 > var3.anIntArray188[arg1.anInt913]) {
						arg1.anInt914 = 0;
						++arg1.anInt913;
					}
					if (arg1.anInt913 >= var3.anInt543) {
						arg1.anInt914 = 0;
						arg1.anInt913 = 0;
					}
				}
				if (arg1.anInt915 != -1 && arg1.anInt918 == 0) {
					var3 = Class19.aClass19Array1[arg1.anInt915];
					++arg1.anInt917;
					while (arg1.anInt916 < var3.anInt543 && arg1.anInt917 > var3.anIntArray188[arg1.anInt916]) {
						arg1.anInt917 -= var3.anIntArray188[arg1.anInt916];
						++arg1.anInt916;
					}
					if (arg1.anInt916 >= var3.anInt543) {
						arg1.anInt916 -= var3.anInt544;
						++arg1.anInt919;
						if (arg1.anInt919 >= var3.anInt548) {
							arg1.anInt915 = -1;
						}
						if (arg1.anInt916 < 0 || arg1.anInt916 >= var3.anInt543) {
							arg1.anInt915 = -1;
						}
					}
					arg1.aBoolean162 = var3.aBoolean126;
				}
				if (arg1.anInt918 > 0) {
					--arg1.anInt918;
				}
				if (arg1.anInt920 != -1 && anInt266 >= arg1.anInt923) {
					if (arg1.anInt921 < 0) {
						arg1.anInt921 = 0;
					}
					var3 = Class21.aClass21Array1[arg1.anInt920].aClass19_1;
					++arg1.anInt922;
					while (arg1.anInt921 < var3.anInt543 && arg1.anInt922 > var3.anIntArray188[arg1.anInt921]) {
						arg1.anInt922 -= var3.anIntArray188[arg1.anInt921];
						++arg1.anInt921;
					}
					if (arg1.anInt921 >= var3.anInt543) {
						if (arg1.anInt921 < 0 || arg1.anInt921 >= var3.anInt543) {
							arg1.anInt920 = -1;
						}
						return;
					}
				}
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("65300, " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	public final void method130(int arg0) {
		try {
			if (arg0 != 29510) {
				this.anInt333 = 411;
			}
			if (this.aBoolean37) {
				this.aBoolean37 = false;
				this.aClass32_6.method464(11, super.aGraphics2, 0, 5193);
				this.aClass32_7.method464(375, super.aGraphics2, 0, 5193);
				this.aClass32_8.method464(5, super.aGraphics2, 729, 5193);
				this.aClass32_9.method464(231, super.aGraphics2, 752, 5193);
				this.aClass32_10.method464(0, super.aGraphics2, 0, 5193);
				this.aClass32_11.method464(0, super.aGraphics2, 561, 5193);
				this.aClass32_12.method464(11, super.aGraphics2, 520, 5193);
				this.aClass32_13.method464(231, super.aGraphics2, 520, 5193);
				this.aClass32_14.method464(375, super.aGraphics2, 501, 5193);
				this.aClass32_15.method464(345, super.aGraphics2, 0, 5193);
				this.aBoolean59 = true;
				this.aBoolean60 = true;
				this.aBoolean68 = true;
				this.aBoolean56 = true;
				if (this.anInt307 != 2) {
					this.aClass32_27.method464(11, super.aGraphics2, 8, 5193);
					this.aClass32_26.method464(5, super.aGraphics2, 561, 5193);
				}
			}
			if (this.anInt307 == 2) {
				this.method86(0);
			}
			if (this.aBoolean50 && this.anInt337 == 1) {
				this.aBoolean59 = true;
			}
			boolean var2;
			if (this.anInt330 != -1) {
				var2 = this.method171(this.anInt330, this.anInt270, 623);
				if (var2) {
					this.aBoolean59 = true;
				}
			}
			if (this.anInt260 == 2) {
				this.aBoolean59 = true;
			}
			if (this.anInt216 == 2) {
				this.aBoolean59 = true;
			}
			if (this.aBoolean59) {
				this.method198((byte) 2);
				this.aBoolean59 = false;
			}
			if (this.anInt280 == -1) {
				this.aClass15_1.anInt481 = this.anInt185 - this.anInt274 - 77;
				if (super.anInt135 > 453 && super.anInt135 < 565 && super.anInt136 > 350) {
					this.method158(super.anInt135 - 22, 0, super.anInt136 - 375, this.anInt185, 77, false, 463, 0, this.aClass15_1);
				}
				int var4 = this.anInt185 - 77 - this.aClass15_1.anInt481;
				if (var4 < 0) {
					var4 = 0;
				}
				if (var4 > this.anInt185 - 77) {
					var4 = this.anInt185 - 77;
				}
				if (this.anInt274 != var4) {
					this.anInt274 = var4;
					this.aBoolean60 = true;
				}
			}
			if (this.anInt280 != -1) {
				var2 = this.method171(this.anInt280, this.anInt270, 623);
				if (var2) {
					this.aBoolean60 = true;
				}
			}
			if (this.anInt260 == 3) {
				this.aBoolean60 = true;
			}
			if (this.anInt216 == 3) {
				this.aBoolean60 = true;
			}
			if (this.aString8 != null) {
				this.aBoolean60 = true;
			}
			if (this.aBoolean50 && this.anInt337 == 2) {
				this.aBoolean60 = true;
			}
			if (this.aBoolean60) {
				this.method196(false);
				this.aBoolean60 = false;
			}
			if (this.anInt307 == 2) {
				this.method104(this.aByte14);
				this.aClass32_26.method464(5, super.aGraphics2, 561, 5193);
			}
			if (this.anInt329 != -1) {
				this.aBoolean68 = true;
			}
			if (this.aBoolean68) {
				if (this.anInt329 != -1 && this.anInt329 == this.anInt166) {
					this.anInt329 = -1;
					this.aClass1_Sub3_Sub3_6.method380((byte) -34, 175);
					this.aClass1_Sub3_Sub3_6.method381(this.anInt166);
				}
				this.aBoolean68 = false;
				this.aClass32_5.method463((byte) 62);
				this.aClass1_Sub3_Sub2_Sub3_8.method350(0, 0, false);
				if (this.anInt330 == -1) {
					if (this.anIntArray46[this.anInt166] != -1) {
						if (this.anInt166 == 0) {
							this.aClass1_Sub3_Sub2_Sub3_1.method350(30, 29, false);
						}
						if (this.anInt166 == 1) {
							this.aClass1_Sub3_Sub2_Sub3_2.method350(29, 59, false);
						}
						if (this.anInt166 == 2) {
							this.aClass1_Sub3_Sub2_Sub3_2.method350(29, 87, false);
						}
						if (this.anInt166 == 3) {
							this.aClass1_Sub3_Sub2_Sub3_3.method350(29, 115, false);
						}
						if (this.anInt166 == 4) {
							this.aClass1_Sub3_Sub2_Sub3_5.method350(29, 156, false);
						}
						if (this.anInt166 == 5) {
							this.aClass1_Sub3_Sub2_Sub3_5.method350(29, 184, false);
						}
						if (this.anInt166 == 6) {
							this.aClass1_Sub3_Sub2_Sub3_4.method350(30, 212, false);
						}
					}
					if (this.anIntArray46[0] != -1 && (this.anInt329 != 0 || anInt266 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array1[0].method350(34, 35, false);
					}
					if (this.anIntArray46[1] != -1 && (this.anInt329 != 1 || anInt266 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array1[1].method350(32, 59, false);
					}
					if (this.anIntArray46[2] != -1 && (this.anInt329 != 2 || anInt266 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array1[2].method350(32, 86, false);
					}
					if (this.anIntArray46[3] != -1 && (this.anInt329 != 3 || anInt266 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array1[3].method350(33, 121, false);
					}
					if (this.anIntArray46[4] != -1 && (this.anInt329 != 4 || anInt266 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array1[4].method350(34, 157, false);
					}
					if (this.anIntArray46[5] != -1 && (this.anInt329 != 5 || anInt266 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array1[5].method350(32, 185, false);
					}
					if (this.anIntArray46[6] != -1 && (this.anInt329 != 6 || anInt266 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array1[6].method350(34, 212, false);
					}
				}
				this.aClass32_5.method464(165, super.aGraphics2, 520, 5193);
				this.aClass32_4.method463((byte) 62);
				this.aClass1_Sub3_Sub2_Sub3_7.method350(0, 0, false);
				if (this.anInt330 == -1) {
					if (this.anIntArray46[this.anInt166] != -1) {
						if (this.anInt166 == 7) {
							this.aClass1_Sub3_Sub2_Sub3_12.method350(0, 49, false);
						}
						if (this.anInt166 == 8) {
							this.aClass1_Sub3_Sub2_Sub3_13.method350(0, 81, false);
						}
						if (this.anInt166 == 9) {
							this.aClass1_Sub3_Sub2_Sub3_13.method350(0, 108, false);
						}
						if (this.anInt166 == 10) {
							this.aClass1_Sub3_Sub2_Sub3_14.method350(1, 136, false);
						}
						if (this.anInt166 == 11) {
							this.aClass1_Sub3_Sub2_Sub3_16.method350(0, 178, false);
						}
						if (this.anInt166 == 12) {
							this.aClass1_Sub3_Sub2_Sub3_16.method350(0, 205, false);
						}
						if (this.anInt166 == 13) {
							this.aClass1_Sub3_Sub2_Sub3_15.method350(0, 233, false);
						}
					}
					if (this.anIntArray46[8] != -1 && (this.anInt329 != 8 || anInt266 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array1[7].method350(2, 80, false);
					}
					if (this.anIntArray46[9] != -1 && (this.anInt329 != 9 || anInt266 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array1[8].method350(3, 107, false);
					}
					if (this.anIntArray46[10] != -1 && (this.anInt329 != 10 || anInt266 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array1[9].method350(4, 142, false);
					}
					if (this.anIntArray46[11] != -1 && (this.anInt329 != 11 || anInt266 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array1[10].method350(2, 179, false);
					}
					if (this.anIntArray46[12] != -1 && (this.anInt329 != 12 || anInt266 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array1[11].method350(2, 206, false);
					}
					if (this.anIntArray46[13] != -1 && (this.anInt329 != 13 || anInt266 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array1[12].method350(2, 230, false);
					}
				}
				this.aClass32_4.method464(492, super.aGraphics2, 501, 5193);
				this.aClass32_27.method463((byte) 62);
			}
			if (this.aBoolean56) {
				this.aBoolean56 = false;
				this.aClass32_3.method463((byte) 62);
				this.aClass1_Sub3_Sub2_Sub3_6.method350(0, 0, false);
				this.aClass1_Sub3_Sub2_Sub4_2.method363(57, 16777215, true, 33, "Public chat", 0);
				if (this.anInt273 == 0) {
					this.aClass1_Sub3_Sub2_Sub4_2.method363(57, 65280, true, 46, "On", 0);
				}
				if (this.anInt273 == 1) {
					this.aClass1_Sub3_Sub2_Sub4_2.method363(57, 16776960, true, 46, "Friends", 0);
				}
				if (this.anInt273 == 2) {
					this.aClass1_Sub3_Sub2_Sub4_2.method363(57, 16711680, true, 46, "Off", 0);
				}
				if (this.anInt273 == 3) {
					this.aClass1_Sub3_Sub2_Sub4_2.method363(57, 65535, true, 46, "Hide", 0);
				}
				this.aClass1_Sub3_Sub2_Sub4_2.method363(186, 16777215, true, 33, "Private chat", 0);
				if (this.anInt164 == 0) {
					this.aClass1_Sub3_Sub2_Sub4_2.method363(186, 65280, true, 46, "On", 0);
				}
				if (this.anInt164 == 1) {
					this.aClass1_Sub3_Sub2_Sub4_2.method363(186, 16776960, true, 46, "Friends", 0);
				}
				if (this.anInt164 == 2) {
					this.aClass1_Sub3_Sub2_Sub4_2.method363(186, 16711680, true, 46, "Off", 0);
				}
				this.aClass1_Sub3_Sub2_Sub4_2.method363(326, 16777215, true, 33, "Trade/duel", 0);
				if (this.anInt234 == 0) {
					this.aClass1_Sub3_Sub2_Sub4_2.method363(326, 65280, true, 46, "On", 0);
				}
				if (this.anInt234 == 1) {
					this.aClass1_Sub3_Sub2_Sub4_2.method363(326, 16776960, true, 46, "Friends", 0);
				}
				if (this.anInt234 == 2) {
					this.aClass1_Sub3_Sub2_Sub4_2.method363(326, 16711680, true, 46, "Off", 0);
				}
				this.aClass1_Sub3_Sub2_Sub4_2.method363(462, 16777215, true, 38, "Report abuse", 0);
				this.aClass32_3.method464(471, super.aGraphics2, 0, 5193);
				this.aClass32_27.method463((byte) 62);
			}
			this.anInt270 = 0;
		} catch (RuntimeException var3) {
			signlink.reporterror("48371, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public final boolean method131(int arg0, int arg1) {
		try {
			if (arg1 < 0) {
				return false;
			} else {
				int var3 = this.anIntArray86[arg1];
				if (arg0 <= 0) {
					throw new NullPointerException();
				} else {
					if (var3 >= 2000) {
						var3 -= 2000;
					}
					return var3 == 406;
				}
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("6950, " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	public final void method132(int arg0, int arg1) {
		try {
			if (arg1 >= 0) {
				if (this.aBoolean66) {
					this.aBoolean66 = false;
					this.aBoolean60 = true;
				}
				int var3 = this.anIntArray84[arg1];
				int var4 = this.anIntArray85[arg1];
				int var5 = this.anIntArray86[arg1];
				int var6 = this.anIntArray87[arg1];
				if (var5 >= 2000) {
					var5 -= 2000;
				}
				String var7;
				int var8;
				String var9;
				int var11;
				if (var5 == 903 || var5 == 363) {
					var7 = this.aStringArray5[arg1];
					var8 = var7.indexOf("@whi@");
					if (var8 != -1) {
						var7 = var7.substring(var8 + 5).trim();
						var9 = Class40.method542(0, Class40.method539(Class40.method538(var7), false));
						boolean var10 = false;
						for (var11 = 0; var11 < this.anInt205; ++var11) {
							Class1_Sub1_Sub3_Sub2 var12 = this.aClass1_Sub1_Sub3_Sub2Array1[this.anIntArray39[var11]];
							if (var12 != null && var12.aString30 != null && var12.aString30.equalsIgnoreCase(var9)) {
								this.method168(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 1, false, var12.anIntArray232[0], this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 2, 1, var12.anIntArray233[0], 0, 0, 0);
								if (var5 == 903) {
									this.aClass1_Sub3_Sub3_6.method380((byte) -34, 206);
								}
								if (var5 == 363) {
									this.aClass1_Sub3_Sub3_6.method380((byte) -34, 164);
								}
								this.aClass1_Sub3_Sub3_6.method382(this.anIntArray39[var11]);
								var10 = true;
								break;
							}
						}
						if (!var10) {
							this.method172(0, "Unable to find " + var9, (byte) 4, "");
						}
					}
				}
				if (var5 == 450 && this.method153(75, var3, var4, var6, true)) {
					this.aClass1_Sub3_Sub3_6.method382(this.anInt284);
					this.aClass1_Sub3_Sub3_6.method382(this.anInt282);
					this.aClass1_Sub3_Sub3_6.method382(this.anInt283);
				}
				if (var5 == 405 || var5 == 38 || var5 == 422 || var5 == 478 || var5 == 347) {
					if (var5 == 478) {
						if ((var3 & 3) == 0) {
							++anInt143;
						}
						if (anInt143 >= 90) {
							this.aClass1_Sub3_Sub3_6.method380((byte) -34, 220);
						}
						this.aClass1_Sub3_Sub3_6.method380((byte) -34, 157);
					}
					if (var5 == 347) {
						this.aClass1_Sub3_Sub3_6.method380((byte) -34, 211);
					}
					if (var5 == 422) {
						this.aClass1_Sub3_Sub3_6.method380((byte) -34, 133);
					}
					if (var5 == 405) {
						anInt195 += var6;
						if (anInt195 >= 97) {
							this.aClass1_Sub3_Sub3_6.method380((byte) -34, 30);
							this.aClass1_Sub3_Sub3_6.method384(14953816);
						}
						this.aClass1_Sub3_Sub3_6.method380((byte) -34, 195);
					}
					if (var5 == 38) {
						this.aClass1_Sub3_Sub3_6.method380((byte) -34, 71);
					}
					this.aClass1_Sub3_Sub3_6.method382(var6);
					this.aClass1_Sub3_Sub3_6.method382(var3);
					this.aClass1_Sub3_Sub3_6.method382(var4);
					this.anInt257 = 0;
					this.anInt258 = var4;
					this.anInt259 = var3;
					this.anInt260 = 2;
					if (Class15.aClass15Array1[var4].anInt471 == this.anInt271) {
						this.anInt260 = 1;
					}
					if (Class15.aClass15Array1[var4].anInt471 == this.anInt280) {
						this.anInt260 = 3;
					}
				}
				Class1_Sub1_Sub3_Sub1 var14;
				if (var5 == 728 || var5 == 542 || var5 == 6 || var5 == 963 || var5 == 245) {
					var14 = this.aClass1_Sub1_Sub3_Sub1Array1[var6];
					if (var14 != null) {
						this.method168(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 1, false, var14.anIntArray232[0], this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 2, 1, var14.anIntArray233[0], 0, 0, 0);
						this.anInt153 = super.anInt138;
						this.anInt154 = super.anInt139;
						this.anInt156 = 2;
						this.anInt155 = 0;
						if (var5 == 542) {
							this.aClass1_Sub3_Sub3_6.method380((byte) -34, 8);
						}
						if (var5 == 6) {
							if ((var6 & 3) == 0) {
								++anInt224;
							}
							if (anInt224 >= 124) {
								this.aClass1_Sub3_Sub3_6.method380((byte) -34, 88);
								this.aClass1_Sub3_Sub3_6.method385(0);
							}
							this.aClass1_Sub3_Sub3_6.method380((byte) -34, 27);
						}
						if (var5 == 963) {
							this.aClass1_Sub3_Sub3_6.method380((byte) -34, 113);
						}
						if (var5 == 728) {
							this.aClass1_Sub3_Sub3_6.method380((byte) -34, 194);
						}
						if (var5 == 245) {
							if ((var6 & 3) == 0) {
								++anInt188;
							}
							if (anInt188 >= 85) {
								this.aClass1_Sub3_Sub3_6.method380((byte) -34, 176);
								this.aClass1_Sub3_Sub3_6.method382(39596);
							}
							this.aClass1_Sub3_Sub3_6.method380((byte) -34, 100);
						}
						this.aClass1_Sub3_Sub3_6.method382(var6);
					}
				}
				boolean var15;
				if (var5 == 217) {
					var15 = this.method168(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 0, false, var3, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 2, 0, var4, 0, 0, 0);
					if (!var15) {
						this.method168(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 1, false, var3, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 2, 1, var4, 0, 0, 0);
					}
					this.anInt153 = super.anInt138;
					this.anInt154 = super.anInt139;
					this.anInt156 = 2;
					this.anInt155 = 0;
					this.aClass1_Sub3_Sub3_6.method380((byte) -34, 239);
					this.aClass1_Sub3_Sub3_6.method382(var3 + this.anInt169);
					this.aClass1_Sub3_Sub3_6.method382(var4 + this.anInt170);
					this.aClass1_Sub3_Sub3_6.method382(var6);
					this.aClass1_Sub3_Sub3_6.method382(this.anInt284);
					this.aClass1_Sub3_Sub3_6.method382(this.anInt282);
					this.aClass1_Sub3_Sub3_6.method382(this.anInt283);
				}
				if (var5 == 1175) {
					int var16 = var6 >> 14 & 32767;
					Class2 var17 = Class2.method23(var16);
					if (var17.aByteArray1 != null) {
						var9 = new String(var17.aByteArray1);
					} else {
						var9 = "It's a " + var17.aString1 + ".";
					}
					this.method172(0, var9, (byte) 4, "");
				}
				if (var5 == 285) {
					this.method153(245, var3, var4, var6, true);
				}
				if (var5 == 881) {
					this.aClass1_Sub3_Sub3_6.method380((byte) -34, 130);
					this.aClass1_Sub3_Sub3_6.method382(var6);
					this.aClass1_Sub3_Sub3_6.method382(var3);
					this.aClass1_Sub3_Sub3_6.method382(var4);
					this.aClass1_Sub3_Sub3_6.method382(this.anInt284);
					this.aClass1_Sub3_Sub3_6.method382(this.anInt282);
					this.aClass1_Sub3_Sub3_6.method382(this.anInt283);
					this.anInt257 = 0;
					this.anInt258 = var4;
					this.anInt259 = var3;
					this.anInt260 = 2;
					if (Class15.aClass15Array1[var4].anInt471 == this.anInt271) {
						this.anInt260 = 1;
					}
					if (Class15.aClass15Array1[var4].anInt471 == this.anInt280) {
						this.anInt260 = 3;
					}
				}
				if (var5 == 391) {
					this.aClass1_Sub3_Sub3_6.method380((byte) -34, 48);
					this.aClass1_Sub3_Sub3_6.method382(var6);
					this.aClass1_Sub3_Sub3_6.method382(var3);
					this.aClass1_Sub3_Sub3_6.method382(var4);
					this.aClass1_Sub3_Sub3_6.method382(this.anInt292);
					this.anInt257 = 0;
					this.anInt258 = var4;
					this.anInt259 = var3;
					this.anInt260 = 2;
					if (Class15.aClass15Array1[var4].anInt471 == this.anInt271) {
						this.anInt260 = 1;
					}
					if (Class15.aClass15Array1[var4].anInt471 == this.anInt280) {
						this.anInt260 = 3;
					}
				}
				if (var5 == 660) {
					if (!this.aBoolean50) {
						this.aClass33_1.method506(4, super.anInt139 - 11, super.anInt138 - 8);
					} else {
						this.aClass33_1.method506(4, var4 - 11, var3 - 8);
					}
				}
				if (var5 == 188) {
					this.anInt281 = 1;
					this.anInt282 = var3;
					this.anInt283 = var4;
					this.anInt284 = var6;
					this.aString10 = Class5.method54(var6).aString3;
					this.anInt291 = 0;
				} else {
					if (var5 == 44 && !this.aBoolean49) {
						this.aClass1_Sub3_Sub3_6.method380((byte) -34, 235);
						this.aClass1_Sub3_Sub3_6.method382(var4);
						this.aBoolean49 = true;
					}
					Class5 var18;
					String var19;
					if (var5 == 1773) {
						var18 = Class5.method54(var6);
						if (var4 >= 100000) {
							var19 = var4 + " x " + var18.aString3;
						} else if (var18.aByteArray3 != null) {
							var19 = new String(var18.aByteArray3);
						} else {
							var19 = "It's a " + var18.aString3 + ".";
						}
						this.method172(0, var19, (byte) 4, "");
					}
					if (var5 == 900) {
						var14 = this.aClass1_Sub1_Sub3_Sub1Array1[var6];
						if (var14 != null) {
							this.method168(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 1, false, var14.anIntArray232[0], this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 2, 1, var14.anIntArray233[0], 0, 0, 0);
							this.anInt153 = super.anInt138;
							this.anInt154 = super.anInt139;
							this.anInt156 = 2;
							this.anInt155 = 0;
							this.aClass1_Sub3_Sub3_6.method380((byte) -34, 202);
							this.aClass1_Sub3_Sub3_6.method382(var6);
							this.aClass1_Sub3_Sub3_6.method382(this.anInt284);
							this.aClass1_Sub3_Sub3_6.method382(this.anInt282);
							this.aClass1_Sub3_Sub3_6.method382(this.anInt283);
						}
					}
					Class1_Sub1_Sub3_Sub2 var20;
					if (var5 == 1373 || var5 == 1544 || var5 == 151 || var5 == 1101) {
						var20 = this.aClass1_Sub1_Sub3_Sub2Array1[var6];
						if (var20 != null) {
							this.method168(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 1, false, var20.anIntArray232[0], this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 2, 1, var20.anIntArray233[0], 0, 0, 0);
							this.anInt153 = super.anInt138;
							this.anInt154 = super.anInt139;
							this.anInt156 = 2;
							this.anInt155 = 0;
							if (var5 == 1101) {
								this.aClass1_Sub3_Sub3_6.method380((byte) -34, 164);
							}
							if (var5 == 151) {
								++anInt237;
								if (anInt237 >= 90) {
									this.aClass1_Sub3_Sub3_6.method380((byte) -34, 2);
									this.aClass1_Sub3_Sub3_6.method382(31114);
								}
								this.aClass1_Sub3_Sub3_6.method380((byte) -34, 53);
							}
							if (var5 == 1373) {
								this.aClass1_Sub3_Sub3_6.method380((byte) -34, 206);
							}
							if (var5 == 1544) {
								this.aClass1_Sub3_Sub3_6.method380((byte) -34, 185);
							}
							this.aClass1_Sub3_Sub3_6.method382(var6);
						}
					}
					if (var5 == 265) {
						var14 = this.aClass1_Sub1_Sub3_Sub1Array1[var6];
						if (var14 != null) {
							this.method168(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 1, false, var14.anIntArray232[0], this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 2, 1, var14.anIntArray233[0], 0, 0, 0);
							this.anInt153 = super.anInt138;
							this.anInt154 = super.anInt139;
							this.anInt156 = 2;
							this.anInt155 = 0;
							this.aClass1_Sub3_Sub3_6.method380((byte) -34, 134);
							this.aClass1_Sub3_Sub3_6.method382(var6);
							this.aClass1_Sub3_Sub3_6.method382(this.anInt292);
						}
					}
					long var21;
					if (var5 == 679) {
						var7 = this.aStringArray5[arg1];
						var8 = var7.indexOf("@whi@");
						if (var8 != -1) {
							var21 = Class40.method538(var7.substring(var8 + 5).trim());
							var11 = -1;
							for (int var25 = 0; var25 < this.anInt312; ++var25) {
								if (this.aLongArray4[var25] == var21) {
									var11 = var25;
									break;
								}
							}
							if (var11 != -1 && this.anIntArray34[var11] > 0) {
								this.aBoolean60 = true;
								this.aBoolean66 = false;
								this.aBoolean47 = true;
								this.aString5 = "";
								this.anInt168 = 3;
								this.aLong8 = this.aLongArray4[var11];
								this.aString6 = "Enter message to send to " + this.aStringArray9[var11];
							}
						}
					}
					if (var5 == 55 && this.method153(9, var3, var4, var6, true)) {
						this.aClass1_Sub3_Sub3_6.method382(this.anInt292);
					}
					if (var5 == 224 || var5 == 993 || var5 == 99 || var5 == 746 || var5 == 877) {
						var15 = this.method168(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 0, false, var3, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 2, 0, var4, 0, 0, 0);
						if (!var15) {
							this.method168(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 1, false, var3, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 2, 1, var4, 0, 0, 0);
						}
						this.anInt153 = super.anInt138;
						this.anInt154 = super.anInt139;
						this.anInt156 = 2;
						this.anInt155 = 0;
						if (var5 == 224) {
							this.aClass1_Sub3_Sub3_6.method380((byte) -34, 140);
						}
						if (var5 == 746) {
							this.aClass1_Sub3_Sub3_6.method380((byte) -34, 178);
						}
						if (var5 == 877) {
							this.aClass1_Sub3_Sub3_6.method380((byte) -34, 247);
						}
						if (var5 == 99) {
							this.aClass1_Sub3_Sub3_6.method380((byte) -34, 200);
						}
						if (var5 == 993) {
							this.aClass1_Sub3_Sub3_6.method380((byte) -34, 40);
						}
						this.aClass1_Sub3_Sub3_6.method382(var3 + this.anInt169);
						this.aClass1_Sub3_Sub3_6.method382(var4 + this.anInt170);
						this.aClass1_Sub3_Sub3_6.method382(var6);
					}
					if (var5 == 1607) {
						var14 = this.aClass1_Sub1_Sub3_Sub1Array1[var6];
						if (var14 != null) {
							if (var14.aClass3_1.aByteArray2 != null) {
								var19 = new String(var14.aClass3_1.aByteArray2);
							} else {
								var19 = "It's a " + var14.aClass3_1.aString2 + ".";
							}
							this.method172(0, var19, (byte) 4, "");
						}
					}
					if (var5 == 504) {
						this.method153(172, var3, var4, var6, true);
					}
					Class15 var23;
					if (var5 == 930) {
						var23 = Class15.aClass15Array1[var4];
						this.anInt291 = 1;
						this.anInt292 = var4;
						this.anInt293 = var23.anInt493;
						this.anInt281 = 0;
						var19 = var23.aString22;
						if (var19.indexOf(" ") != -1) {
							var19 = var19.substring(0, var19.indexOf(" "));
						}
						var9 = var23.aString22;
						if (var9.indexOf(" ") != -1) {
							var9 = var9.substring(var9.indexOf(" ") + 1);
						}
						this.aString11 = var19 + " " + var23.aString23 + " " + var9;
						if (this.anInt293 == 16) {
							this.aBoolean59 = true;
							this.anInt166 = 3;
							this.aBoolean68 = true;
						}
					} else {
						if (var5 == 951) {
							var23 = Class15.aClass15Array1[var4];
							boolean var24 = true;
							if (var23.anInt474 > 0) {
								var24 = this.method142(false, var23);
							}
							if (var24) {
								this.aClass1_Sub3_Sub3_6.method380((byte) -34, 155);
								this.aClass1_Sub3_Sub3_6.method382(var4);
							}
						}
						if (var5 == 602 || var5 == 596 || var5 == 22 || var5 == 892 || var5 == 415) {
							if (var5 == 22) {
								this.aClass1_Sub3_Sub3_6.method380((byte) -34, 212);
							}
							if (var5 == 415) {
								if ((var4 & 3) == 0) {
									++anInt254;
								}
								if (anInt254 >= 55) {
									this.aClass1_Sub3_Sub3_6.method380((byte) -34, 17);
									this.aClass1_Sub3_Sub3_6.method385(0);
								}
								this.aClass1_Sub3_Sub3_6.method380((byte) -34, 6);
							}
							if (var5 == 602) {
								this.aClass1_Sub3_Sub3_6.method380((byte) -34, 31);
							}
							if (var5 == 892) {
								if ((var3 & 3) == 0) {
									++anInt229;
								}
								if (anInt229 >= 130) {
									this.aClass1_Sub3_Sub3_6.method380((byte) -34, 238);
									this.aClass1_Sub3_Sub3_6.method381(177);
								}
								this.aClass1_Sub3_Sub3_6.method380((byte) -34, 38);
							}
							if (var5 == 596) {
								this.aClass1_Sub3_Sub3_6.method380((byte) -34, 59);
							}
							this.aClass1_Sub3_Sub3_6.method382(var6);
							this.aClass1_Sub3_Sub3_6.method382(var3);
							this.aClass1_Sub3_Sub3_6.method382(var4);
							this.anInt257 = 0;
							this.anInt258 = var4;
							this.anInt259 = var3;
							this.anInt260 = 2;
							if (Class15.aClass15Array1[var4].anInt471 == this.anInt271) {
								this.anInt260 = 1;
							}
							if (Class15.aClass15Array1[var4].anInt471 == this.anInt280) {
								this.anInt260 = 3;
							}
						}
						if (var5 == 581) {
							if ((var6 & 3) == 0) {
								++anInt175;
							}
							if (anInt175 >= 99) {
								this.aClass1_Sub3_Sub3_6.method380((byte) -34, 7);
								this.aClass1_Sub3_Sub3_6.method385(0);
							}
							this.method153(97, var3, var4, var6, true);
						}
						if (var5 == 965) {
							var15 = this.method168(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 0, false, var3, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 2, 0, var4, 0, 0, 0);
							if (!var15) {
								this.method168(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 1, false, var3, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 2, 1, var4, 0, 0, 0);
							}
							this.anInt153 = super.anInt138;
							this.anInt154 = super.anInt139;
							this.anInt156 = 2;
							this.anInt155 = 0;
							this.aClass1_Sub3_Sub3_6.method380((byte) -34, 138);
							this.aClass1_Sub3_Sub3_6.method382(var3 + this.anInt169);
							this.aClass1_Sub3_Sub3_6.method382(var4 + this.anInt170);
							this.aClass1_Sub3_Sub3_6.method382(var6);
							this.aClass1_Sub3_Sub3_6.method382(this.anInt292);
						}
						if (var5 == 1501) {
							anInt220 += this.anInt170;
							if (anInt220 >= 92) {
								this.aClass1_Sub3_Sub3_6.method380((byte) -34, 66);
								this.aClass1_Sub3_Sub3_6.method385(0);
							}
							this.method153(116, var3, var4, var6, true);
						}
						if (var5 == 364) {
							this.method153(96, var3, var4, var6, true);
						}
						if (var5 == 1102) {
							var18 = Class5.method54(var6);
							if (var18.aByteArray3 != null) {
								var19 = new String(var18.aByteArray3);
							} else {
								var19 = "It's a " + var18.aString3 + ".";
							}
							this.method172(0, var19, (byte) 4, "");
						}
						if (var5 == 960) {
							this.aClass1_Sub3_Sub3_6.method380((byte) -34, 155);
							this.aClass1_Sub3_Sub3_6.method382(var4);
							var23 = Class15.aClass15Array1[var4];
							if (var23.anIntArrayArray15 != null && var23.anIntArrayArray15[0][0] == 5) {
								var8 = var23.anIntArrayArray15[0][1];
								if (this.anIntArray59[var8] != var23.anIntArray152[0]) {
									this.anIntArray59[var8] = var23.anIntArray152[0];
									this.method122(var8, 49);
									this.aBoolean59 = true;
								}
							}
						}
						if (var5 == 34) {
							var7 = this.aStringArray5[arg1];
							var8 = var7.indexOf("@whi@");
							if (var8 != -1) {
								this.method77((byte) -60);
								this.aString9 = var7.substring(var8 + 5).trim();
								this.aBoolean51 = false;
								for (int var22 = 0; var22 < Class15.aClass15Array1.length; ++var22) {
									if (Class15.aClass15Array1[var22] != null && Class15.aClass15Array1[var22].anInt474 == 600) {
										this.anInt240 = this.anInt271 = Class15.aClass15Array1[var22].anInt471;
										break;
									}
								}
							}
						}
						if (var5 == 947) {
							this.method77((byte) -60);
						}
						if (var5 == 367) {
							var20 = this.aClass1_Sub1_Sub3_Sub2Array1[var6];
							if (var20 != null) {
								this.method168(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 1, false, var20.anIntArray232[0], this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 2, 1, var20.anIntArray233[0], 0, 0, 0);
								this.anInt153 = super.anInt138;
								this.anInt154 = super.anInt139;
								this.anInt156 = 2;
								this.anInt155 = 0;
								this.aClass1_Sub3_Sub3_6.method380((byte) -34, 248);
								this.aClass1_Sub3_Sub3_6.method382(var6);
								this.aClass1_Sub3_Sub3_6.method382(this.anInt284);
								this.aClass1_Sub3_Sub3_6.method382(this.anInt282);
								this.aClass1_Sub3_Sub3_6.method382(this.anInt283);
							}
						}
						if (var5 == 465) {
							this.aClass1_Sub3_Sub3_6.method380((byte) -34, 155);
							this.aClass1_Sub3_Sub3_6.method382(var4);
							var23 = Class15.aClass15Array1[var4];
							if (var23.anIntArrayArray15 != null && var23.anIntArrayArray15[0][0] == 5) {
								var8 = var23.anIntArrayArray15[0][1];
								this.anIntArray59[var8] = 1 - this.anIntArray59[var8];
								this.method122(var8, 49);
								this.aBoolean59 = true;
							}
						}
						if (var5 == 406 || var5 == 436 || var5 == 557 || var5 == 556) {
							var7 = this.aStringArray5[arg1];
							var8 = var7.indexOf("@whi@");
							if (var8 != -1) {
								var21 = Class40.method538(var7.substring(var8 + 5).trim());
								if (var5 == 406) {
									this.method161(var21, -460);
								}
								if (var5 == 436) {
									this.method82(var21, (byte) 3);
								}
								if (var5 == 557) {
									this.method174(43808, var21);
								}
								if (var5 == 556) {
									this.method191(1, var21);
								}
							}
						}
						if (var5 == 651) {
							var20 = this.aClass1_Sub1_Sub3_Sub2Array1[var6];
							if (var20 != null) {
								this.method168(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 1, false, var20.anIntArray232[0], this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 2, 1, var20.anIntArray233[0], 0, 0, 0);
								this.anInt153 = super.anInt138;
								this.anInt154 = super.anInt139;
								this.anInt156 = 2;
								this.anInt155 = 0;
								this.aClass1_Sub3_Sub3_6.method380((byte) -34, 177);
								this.aClass1_Sub3_Sub3_6.method382(var6);
								this.aClass1_Sub3_Sub3_6.method382(this.anInt292);
							}
						}
						this.anInt281 = 0;
						if (arg0 != 6412) {
							this.method67();
						}
						this.anInt291 = 0;
					}
				}
			}
		} catch (RuntimeException var13) {
			signlink.reporterror("53215, " + arg0 + ", " + arg1 + ", " + var13.toString());
			throw new RuntimeException();
		}
	}

	public static final String method133(int arg0, boolean arg1, int arg2) {
		try {
			if (arg1) {
				throw new NullPointerException();
			} else {
				int var3 = arg0 - arg2;
				if (var3 < -9) {
					return "@red@";
				} else if (var3 < -6) {
					return "@or3@";
				} else if (var3 < -3) {
					return "@or2@";
				} else if (var3 < 0) {
					return "@or1@";
				} else if (var3 > 9) {
					return "@gre@";
				} else if (var3 > 6) {
					return "@gr3@";
				} else if (var3 > 3) {
					return "@gr2@";
				} else {
					return var3 > 0 ? "@gr1@" : "@yel@";
				}
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("26325, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	public final String method134(int arg0) {
		try {
			if (arg0 != -7437) {
				this.aClass1_Sub3_Sub3_6.method381(216);
			}
			if (signlink.mainapp != null) {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			} else {
				return super.aFrame_Sub1_2 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("57946, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public final void method135(int arg0) {
		try {
			int var2 = this.anInt338;
			int var3 = this.anInt339;
			int var4 = this.anInt340;
			int var5 = this.anInt341;
			int var6 = 6116423;
			Class1_Sub3_Sub2.method358(var3, var2, var6, (byte) 93, var4, var5);
			Class1_Sub3_Sub2.method358(var3 + 1, var2 + 1, 0, (byte) 93, var4 - 2, 16);
			Class1_Sub3_Sub2.method359(3, var2 + 1, 0, var5 - 19, var3 + 18, var4 - 2);
			this.aClass1_Sub3_Sub2_Sub4_3.method365(var2 + 3, var3 + 14, false, var6, "Choose Option");
			int var7 = super.anInt135;
			int var8 = super.anInt136;
			if (this.anInt337 == 0) {
				var7 -= 8;
				var8 -= 11;
			}
			if (this.anInt337 == 1) {
				var7 -= 562;
				var8 -= 231;
			}
			if (this.anInt337 == 2) {
				var7 -= 22;
				var8 -= 375;
			}
			for (int var9 = 0; var9 < this.anInt304; ++var9) {
				int var10 = var3 + 31 + (this.anInt304 - 1 - var9) * 15;
				int var11 = 16777215;
				if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
					var11 = 16776960;
				}
				this.aClass1_Sub3_Sub2_Sub4_3.method367(var2 + 3, 6, var10, this.aStringArray5[var9], true, var11);
			}
			if (arg0 >= 0) {
				this.anInt179 = this.aClass1_Sub3_Sub3_5.method391();
			}
		} catch (RuntimeException var12) {
			signlink.reporterror("42520, " + arg0 + ", " + var12.toString());
			throw new RuntimeException();
		}
	}

	public final void method136(int arg0, int arg1, int arg2) {
		try {
			if (this.anInt210 != 0) {
				int var4 = 0;
				if (this.anInt267 != 0) {
					var4 = 1;
				}
				for (int var5 = 0; var5 < 100; ++var5) {
					if (this.aStringArray7[var5] != null) {
						int var6 = this.anIntArray49[var5];
						if ((var6 == 3 || var6 == 7) && (var6 == 7 || this.anInt164 == 0 || this.anInt164 == 1 && this.method199(-20, this.aStringArray6[var5]))) {
							int var7 = 329 - var4 * 13;
							if (super.anInt135 > 8 && super.anInt135 < 520 && arg2 - 11 > var7 - 10 && arg2 - 11 <= var7 + 3) {
								if (this.aBoolean65) {
									this.aStringArray5[this.anInt304] = "Report abuse @whi@" + this.aStringArray6[var5];
									this.anIntArray86[this.anInt304] = 2034;
									++this.anInt304;
								}
								this.aStringArray5[this.anInt304] = "Add ignore @whi@" + this.aStringArray6[var5];
								this.anIntArray86[this.anInt304] = 2436;
								++this.anInt304;
								this.aStringArray5[this.anInt304] = "Add friend @whi@" + this.aStringArray6[var5];
								this.anIntArray86[this.anInt304] = 2406;
								++this.anInt304;
							}
							++var4;
							if (var4 >= 5) {
								return;
							}
						}
						if ((var6 == 5 || var6 == 6) && this.anInt164 < 2) {
							++var4;
							if (var4 >= 5) {
								return;
							}
						}
					}
				}
				if (arg1 != 27078) {
					this.aBoolean38 = !this.aBoolean38;
				}
			}
		} catch (RuntimeException var8) {
			signlink.reporterror("26899, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	public final void method137(int arg0, Class15 arg1) {
		try {
			int var3 = arg1.anInt474;
			if (arg0 != 0) {
				anInt268 = -68;
			}
			if (var3 >= 1 && var3 <= 100) {
				--var3;
				if (var3 >= this.anInt312) {
					arg1.aString20 = "";
					arg1.anInt473 = 0;
				} else {
					arg1.aString20 = this.aStringArray9[var3];
					arg1.anInt473 = 1;
				}
			} else if (var3 >= 101 && var3 <= 200) {
				var3 -= 101;
				if (var3 >= this.anInt312) {
					arg1.aString20 = "";
					arg1.anInt473 = 0;
				} else {
					if (this.anIntArray34[var3] == 0) {
						arg1.aString20 = "@red@Offline";
					} else if (this.anIntArray34[var3] == anInt235) {
						arg1.aString20 = "@gre@World-" + (this.anIntArray34[var3] - 9);
					} else {
						arg1.aString20 = "@yel@World-" + (this.anIntArray34[var3] - 9);
					}
					arg1.anInt473 = 1;
				}
			} else if (var3 == 203) {
				arg1.anInt480 = this.anInt312 * 15 + 20;
				if (arg1.anInt480 <= arg1.anInt476) {
					arg1.anInt480 = arg1.anInt476 + 1;
				}
			} else if (var3 >= 401 && var3 <= 500) {
				var3 -= 401;
				if (var3 >= this.anInt186) {
					arg1.aString20 = "";
					arg1.anInt473 = 0;
				} else {
					arg1.aString20 = Class40.method542(0, Class40.method539(this.aLongArray3[var3], false));
					arg1.anInt473 = 1;
				}
			} else if (var3 == 503) {
				arg1.anInt480 = this.anInt186 * 15 + 20;
				if (arg1.anInt480 <= arg1.anInt476) {
					arg1.anInt480 = arg1.anInt476 + 1;
				}
			} else if (var3 == 327) {
				arg1.anInt491 = 150;
				arg1.anInt492 = (int) (Math.sin((double) anInt266 / 40.0D) * 256.0D) & 2047;
				if (this.aBoolean39) {
					this.aBoolean39 = false;
					Class1_Sub3_Sub1[] var10 = new Class1_Sub3_Sub1[7];
					int var5 = 0;
					for (int var6 = 0; var6 < 7; ++var6) {
						int var7 = this.anIntArray35[var6];
						if (var7 >= 0) {
							var10[var5++] = Class13.aClass13Array1[var7].method306();
						}
					}
					Class1_Sub3_Sub1 var11 = new Class1_Sub3_Sub1(0, var10, var5);
					for (int var8 = 0; var8 < 5; ++var8) {
						if (this.anIntArray33[var8] != 0) {
							var11.method237(anIntArrayArray4[var8][0], anIntArrayArray4[var8][this.anIntArray33[var8]]);
							if (var8 == 1) {
								var11.method237(anIntArray70[0], anIntArray70[this.anIntArray33[var8]]);
							}
						}
					}
					var11.method230(4);
					var11.method231(-16599, Class19.aClass19Array1[this.aClass1_Sub1_Sub3_Sub2_1.anInt894].anIntArray186[0]);
					var11.method240(64, 850, -30, -50, -30, true);
					arg1.aClass1_Sub3_Sub1_2 = var11;
				}
			} else if (var3 == 324) {
				if (this.aClass1_Sub3_Sub2_Sub2_1 == null) {
					this.aClass1_Sub3_Sub2_Sub2_1 = arg1.aClass1_Sub3_Sub2_Sub2_12;
					this.aClass1_Sub3_Sub2_Sub2_2 = arg1.aClass1_Sub3_Sub2_Sub2_13;
				}
				if (this.aBoolean43) {
					arg1.aClass1_Sub3_Sub2_Sub2_12 = this.aClass1_Sub3_Sub2_Sub2_2;
				} else {
					arg1.aClass1_Sub3_Sub2_Sub2_12 = this.aClass1_Sub3_Sub2_Sub2_1;
				}
			} else if (var3 == 325) {
				if (this.aClass1_Sub3_Sub2_Sub2_1 == null) {
					this.aClass1_Sub3_Sub2_Sub2_1 = arg1.aClass1_Sub3_Sub2_Sub2_12;
					this.aClass1_Sub3_Sub2_Sub2_2 = arg1.aClass1_Sub3_Sub2_Sub2_13;
				}
				if (this.aBoolean43) {
					arg1.aClass1_Sub3_Sub2_Sub2_12 = this.aClass1_Sub3_Sub2_Sub2_1;
				} else {
					arg1.aClass1_Sub3_Sub2_Sub2_12 = this.aClass1_Sub3_Sub2_Sub2_2;
				}
			} else if (var3 == 600) {
				arg1.aString20 = this.aString9;
				if (anInt266 % 20 < 10) {
					arg1.aString20 = arg1.aString20 + "|";
				} else {
					arg1.aString20 = arg1.aString20 + " ";
				}
			} else {
				if (var3 == 613) {
					if (this.aBoolean65) {
						if (this.aBoolean51) {
							arg1.anInt485 = 16711680;
							arg1.aString20 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg1.anInt485 = 16777215;
							arg1.aString20 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					} else {
						arg1.aString20 = "";
					}
				}
				String var4;
				if (var3 == 650 || var3 == 655) {
					if (this.anInt299 != 0) {
						if (this.anInt226 == 0) {
							var4 = "earlier today";
						} else if (this.anInt226 == 1) {
							var4 = "yesterday";
						} else {
							var4 = this.anInt226 + " days ago";
						}
						arg1.aString20 = "You last logged in " + var4 + " from: " + signlink.dns;
					} else {
						arg1.aString20 = "";
					}
				}
				if (var3 == 651) {
					if (this.anInt298 == 0) {
						arg1.aString20 = "0 unread messages";
						arg1.anInt485 = 16776960;
					}
					if (this.anInt298 == 1) {
						arg1.aString20 = "1 unread message";
						arg1.anInt485 = 65280;
					}
					if (this.anInt298 > 1) {
						arg1.aString20 = this.anInt298 + " unread messages";
						arg1.anInt485 = 65280;
					}
				}
				if (var3 == 652) {
					if (this.anInt239 == 201) {
						arg1.aString20 = "";
					} else if (this.anInt239 == 200) {
						arg1.aString20 = "You have not yet set any password recovery questions.";
					} else {
						if (this.anInt239 == 0) {
							var4 = "Earlier today";
						} else if (this.anInt239 == 1) {
							var4 = "Yesterday";
						} else {
							var4 = this.anInt239 + " days ago";
						}
						arg1.aString20 = var4 + " you changed your recovery questions";
					}
				}
				if (var3 == 653) {
					if (this.anInt239 == 201) {
						arg1.aString20 = "";
					} else if (this.anInt239 == 200) {
						arg1.aString20 = "We strongly recommend you do so now to secure your account.";
					} else {
						arg1.aString20 = "If you do not remember making this change then cancel it immediately";
					}
				}
				if (var3 == 654) {
					if (this.anInt239 == 201) {
						arg1.aString20 = "";
					} else if (this.anInt239 == 200) {
						arg1.aString20 = "Do this from the 'account management' area on our front webpage";
					} else {
						arg1.aString20 = "Do this from the 'account management' area on our front webpage";
					}
				}
			}
		} catch (RuntimeException var9) {
			signlink.reporterror("10984, " + arg0 + ", " + arg1 + ", " + var9.toString());
			throw new RuntimeException();
		}
	}

	public final boolean method138(byte[] arg0, int arg1, int arg2) {
		try {
			if (arg2 != 0) {
				this.anInt179 = -1;
			}
			return arg0 == null ? true : signlink.wavesave(arg0, arg1);
		} catch (RuntimeException var5) {
			signlink.reporterror("94307, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	public final boolean method139(int arg0) {
		try {
			if (arg0 <= 0) {
				this.aClass1_Sub3_Sub3_6.method381(77);
			}
			return signlink.wavereplay();
		} catch (RuntimeException var3) {
			signlink.reporterror("495, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public final void method140(int arg0, int arg1) {
		try {
			if (arg1 != 0) {
				this.aClass28ArrayArrayArray1 = null;
			}
			signlink.anInt763 = arg0;
		} catch (RuntimeException var4) {
			signlink.reporterror("63786, " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	private final void method141(boolean arg0, Class1_Sub3_Sub3 arg1, int arg2) {
		try {
			if (arg0) {
				this.method67();
			}
			while (arg1.anInt562 + 21 < arg2 * 8) {
				int var4 = arg1.method402(9, 13);
				if (var4 == 8191) {
					break;
				}
				if (this.aClass1_Sub1_Sub3_Sub1Array1[var4] == null) {
					this.aClass1_Sub1_Sub3_Sub1Array1[var4] = new Class1_Sub1_Sub3_Sub1();
				}
				Class1_Sub1_Sub3_Sub1 var5 = this.aClass1_Sub1_Sub3_Sub1Array1[var4];
				this.anIntArray58[this.anInt248++] = var4;
				var5.anInt932 = anInt266;
				var5.aClass3_1 = Class3.method32(arg1.method402(9, 11));
				var5.anInt893 = var5.aClass3_1.aByte4;
				var5.anInt896 = var5.aClass3_1.anInt70;
				var5.anInt897 = var5.aClass3_1.anInt71;
				var5.anInt898 = var5.aClass3_1.anInt72;
				var5.anInt899 = var5.aClass3_1.anInt73;
				var5.anInt894 = var5.aClass3_1.anInt69;
				int var6 = arg1.method402(9, 5);
				if (var6 > 15) {
					var6 -= 32;
				}
				int var7 = arg1.method402(9, 5);
				if (var7 > 15) {
					var7 -= 32;
				}
				var5.method569(false, false, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0] + var6, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0] + var7);
				int var8 = arg1.method402(9, 1);
				if (var8 == 1) {
					this.anIntArray40[this.anInt206++] = var4;
				}
			}
			arg1.method403(this.anInt197);
		} catch (RuntimeException var9) {
			signlink.reporterror("14259, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var9.toString());
			throw new RuntimeException();
		}
	}

	public final boolean method142(boolean arg0, Class15 arg1) {
		try {
			int var3 = arg1.anInt474;
			if (arg0) {
				this.method67();
			}
			if (var3 == 201) {
				this.aBoolean60 = true;
				this.aBoolean66 = false;
				this.aBoolean47 = true;
				this.aString5 = "";
				this.anInt168 = 1;
				this.aString6 = "Enter name of friend to add to list";
			}
			if (var3 == 202) {
				this.aBoolean60 = true;
				this.aBoolean66 = false;
				this.aBoolean47 = true;
				this.aString5 = "";
				this.anInt168 = 2;
				this.aString6 = "Enter name of friend to delete from list";
			}
			if (var3 == 205) {
				this.anInt182 = 250;
				return true;
			} else {
				if (var3 == 501) {
					this.aBoolean60 = true;
					this.aBoolean66 = false;
					this.aBoolean47 = true;
					this.aString5 = "";
					this.anInt168 = 4;
					this.aString6 = "Enter name of player to add to list";
				}
				if (var3 == 502) {
					this.aBoolean60 = true;
					this.aBoolean66 = false;
					this.aBoolean47 = true;
					this.aString5 = "";
					this.anInt168 = 5;
					this.aString6 = "Enter name of player to delete from list";
				}
				int var4;
				int var5;
				int var6;
				if (var3 >= 300 && var3 <= 313) {
					var4 = (var3 - 300) / 2;
					var5 = var3 & 1;
					var6 = this.anIntArray35[var4];
					if (var6 != -1) {
						while (true) {
							if (var5 == 0) {
								--var6;
								if (var6 < 0) {
									var6 = Class13.anInt437 - 1;
								}
							}
							if (var5 == 1) {
								++var6;
								if (var6 >= Class13.anInt437) {
									var6 = 0;
								}
							}
							if (!Class13.aClass13Array1[var6].aBoolean101 && Class13.aClass13Array1[var6].anInt438 == var4 + (this.aBoolean43 ? 0 : 7)) {
								this.anIntArray35[var4] = var6;
								this.aBoolean39 = true;
								break;
							}
						}
					}
				}
				if (var3 >= 314 && var3 <= 323) {
					var4 = (var3 - 314) / 2;
					var5 = var3 & 1;
					var6 = this.anIntArray33[var4];
					if (var5 == 0) {
						--var6;
						if (var6 < 0) {
							var6 = anIntArrayArray4[var4].length - 1;
						}
					}
					if (var5 == 1) {
						++var6;
						if (var6 >= anIntArrayArray4[var4].length) {
							var6 = 0;
						}
					}
					this.anIntArray33[var4] = var6;
					this.aBoolean39 = true;
				}
				if (var3 == 324 && !this.aBoolean43) {
					this.aBoolean43 = true;
					this.method112((byte) -6);
				}
				if (var3 == 325 && this.aBoolean43) {
					this.aBoolean43 = false;
					this.method112((byte) -6);
				}
				if (var3 != 326) {
					if (var3 == 613) {
						this.aBoolean51 = !this.aBoolean51;
					}
					if (var3 >= 601 && var3 <= 612) {
						this.method77((byte) -60);
						if (this.aString9.length() > 0) {
							this.aClass1_Sub3_Sub3_6.method380((byte) -34, 190);
							this.aClass1_Sub3_Sub3_6.method387(true, Class40.method538(this.aString9));
							this.aClass1_Sub3_Sub3_6.method381(var3 - 601);
							this.aClass1_Sub3_Sub3_6.method381(this.aBoolean51 ? 1 : 0);
						}
					}
					return false;
				} else {
					this.aClass1_Sub3_Sub3_6.method380((byte) -34, 52);
					this.aClass1_Sub3_Sub3_6.method381(this.aBoolean43 ? 0 : 1);
					for (var4 = 0; var4 < 7; ++var4) {
						this.aClass1_Sub3_Sub3_6.method381(this.anIntArray35[var4]);
					}
					for (var5 = 0; var5 < 5; ++var5) {
						this.aClass1_Sub3_Sub3_6.method381(this.anIntArray33[var5]);
					}
					return true;
				}
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("80636, " + arg0 + ", " + arg1 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	public final void method67() {
		if (signlink.sunjava) {
			super.anInt129 = 5;
		}
		if (!aBoolean53) {
			this.aBoolean40 = true;
			this.aBoolean41 = true;
			this.method73(this, 2);
			this.method75(false, 12345678, "scape_main", 40000);
		}
		if (aBoolean69) {
			this.aBoolean67 = true;
		} else {
			aBoolean69 = true;
			boolean var1 = false;
			String var2 = this.method134(-7437);
			if (var2.endsWith("jagex.com")) {
				var1 = true;
			}
			if (var2.endsWith("runescape.com")) {
				var1 = true;
			}
			if (var2.endsWith("192.168.1.2")) {
				var1 = true;
			}
			if (var2.endsWith("192.168.1.249")) {
				var1 = true;
			}
			if (var2.endsWith("192.168.1.252")) {
				var1 = true;
			}
			if (var2.endsWith("192.168.1.253")) {
				var1 = true;
			}
			if (var2.endsWith("192.168.1.254")) {
				var1 = true;
			}
			if (var2.endsWith("127.0.0.1")) {
				var1 = true;
			}
			if (!var1) {
				this.aBoolean57 = true;
			} else {
				try {
					int var3 = 5;
					this.anIntArray38[8] = 0;
					while (this.anIntArray38[8] == 0) {
						this.method74(true, "Connecting to fileserver", 10);
						try {
							DataInputStream var35 = this.method155("crc" + (int) (Math.random() * 9.9999999E7D));
							Class1_Sub3_Sub3 var5 = new Class1_Sub3_Sub3(363, new byte[36]);
							var35.readFully(var5.aByteArray7, 0, 36);
							for (int var6 = 0; var6 < 9; ++var6) {
								this.anIntArray38[var6] = var5.method396();
							}
							var35.close();
						} catch (IOException var33) {
							for (int var4 = var3; var4 > 0; --var4) {
								this.method74(true, "Error loading - Will retry in " + var4 + " secs.", 10);
								try {
									Thread.sleep(1000L);
								} catch (Exception var28) {
								}
							}
							var3 *= 2;
							if (var3 > 60) {
								var3 = 60;
							}
						}
					}
					this.aClass39_1 = this.method98("title screen", this.anIntArray38[1], "title", 10, 0);
					this.aClass1_Sub3_Sub2_Sub4_1 = new Class1_Sub3_Sub2_Sub4(this.aClass39_1, "p11", 530);
					this.aClass1_Sub3_Sub2_Sub4_2 = new Class1_Sub3_Sub2_Sub4(this.aClass39_1, "p12", 530);
					this.aClass1_Sub3_Sub2_Sub4_3 = new Class1_Sub3_Sub2_Sub4(this.aClass39_1, "b12", 530);
					this.aClass1_Sub3_Sub2_Sub4_4 = new Class1_Sub3_Sub2_Sub4(this.aClass39_1, "q8", 530);
					this.method189((byte) 5);
					this.method109(0);
					Class39 var36 = this.method98("config", this.anIntArray38[2], "config", 15, 0);
					Class39 var37 = this.method98("interface", this.anIntArray38[3], "interface", 20, 0);
					Class39 var38 = this.method98("2d graphics", this.anIntArray38[4], "media", 30, 0);
					Class39 var7 = this.method98("3d graphics", this.anIntArray38[5], "models", 40, 0);
					Class39 var8 = this.method98("textures", this.anIntArray38[6], "textures", 60, 0);
					Class39 var9 = this.method98("chat system", this.anIntArray38[7], "wordenc", 65, 0);
					Class39 var10 = this.method98("sound effects", this.anIntArray38[8], "sounds", 70, 0);
					this.aByteArrayArrayArray7 = new byte[4][104][104];
					this.anIntArrayArrayArray3 = new int[4][105][105];
					this.aClass33_1 = new Class33(415, this.anIntArrayArrayArray3, 104, 4, 104);
					for (int var11 = 0; var11 < 4; ++var11) {
						this.aClass9Array1[var11] = new Class9(104, -708, 104);
					}
					this.aClass1_Sub3_Sub2_Sub2_6 = new Class1_Sub3_Sub2_Sub2(512, 512);
					this.method74(true, "Unpacking media", 75);
					this.aClass1_Sub3_Sub2_Sub3_9 = new Class1_Sub3_Sub2_Sub3(var38, "invback", 0);
					this.aClass1_Sub3_Sub2_Sub3_11 = new Class1_Sub3_Sub2_Sub3(var38, "chatback", 0);
					this.aClass1_Sub3_Sub2_Sub3_10 = new Class1_Sub3_Sub2_Sub3(var38, "mapback", 0);
					this.aClass1_Sub3_Sub2_Sub3_6 = new Class1_Sub3_Sub2_Sub3(var38, "backbase1", 0);
					this.aClass1_Sub3_Sub2_Sub3_7 = new Class1_Sub3_Sub2_Sub3(var38, "backbase2", 0);
					this.aClass1_Sub3_Sub2_Sub3_8 = new Class1_Sub3_Sub2_Sub3(var38, "backhmid1", 0);
					for (int var12 = 0; var12 < 13; ++var12) {
						this.aClass1_Sub3_Sub2_Sub3Array1[var12] = new Class1_Sub3_Sub2_Sub3(var38, "sideicons", var12);
					}
					this.aClass1_Sub3_Sub2_Sub2_11 = new Class1_Sub3_Sub2_Sub2(var38, "compass", 0);
					int var13;
					try {
						for (var13 = 0; var13 < 50; ++var13) {
							this.aClass1_Sub3_Sub2_Sub3Array3[var13] = new Class1_Sub3_Sub2_Sub3(var38, "mapscene", var13);
						}
					} catch (Exception var32) {
					}
					try {
						for (var13 = 0; var13 < 50; ++var13) {
							this.aClass1_Sub3_Sub2_Sub2Array7[var13] = new Class1_Sub3_Sub2_Sub2(var38, "mapfunction", var13);
						}
					} catch (Exception var31) {
					}
					try {
						for (var13 = 0; var13 < 20; ++var13) {
							this.aClass1_Sub3_Sub2_Sub2Array3[var13] = new Class1_Sub3_Sub2_Sub2(var38, "hitmarks", var13);
						}
					} catch (Exception var30) {
					}
					try {
						for (var13 = 0; var13 < 20; ++var13) {
							this.aClass1_Sub3_Sub2_Sub2Array5[var13] = new Class1_Sub3_Sub2_Sub2(var38, "headicons", var13);
						}
					} catch (Exception var29) {
					}
					this.aClass1_Sub3_Sub2_Sub2_5 = new Class1_Sub3_Sub2_Sub2(var38, "mapflag", 0);
					for (var13 = 0; var13 < 8; ++var13) {
						this.aClass1_Sub3_Sub2_Sub2Array6[var13] = new Class1_Sub3_Sub2_Sub2(var38, "cross", var13);
					}
					this.aClass1_Sub3_Sub2_Sub2_7 = new Class1_Sub3_Sub2_Sub2(var38, "mapdots", 0);
					this.aClass1_Sub3_Sub2_Sub2_8 = new Class1_Sub3_Sub2_Sub2(var38, "mapdots", 1);
					this.aClass1_Sub3_Sub2_Sub2_9 = new Class1_Sub3_Sub2_Sub2(var38, "mapdots", 2);
					this.aClass1_Sub3_Sub2_Sub2_10 = new Class1_Sub3_Sub2_Sub2(var38, "mapdots", 3);
					this.aClass1_Sub3_Sub2_Sub3_17 = new Class1_Sub3_Sub2_Sub3(var38, "scrollbar", 0);
					this.aClass1_Sub3_Sub2_Sub3_18 = new Class1_Sub3_Sub2_Sub3(var38, "scrollbar", 1);
					this.aClass1_Sub3_Sub2_Sub3_1 = new Class1_Sub3_Sub2_Sub3(var38, "redstone1", 0);
					this.aClass1_Sub3_Sub2_Sub3_2 = new Class1_Sub3_Sub2_Sub3(var38, "redstone2", 0);
					this.aClass1_Sub3_Sub2_Sub3_3 = new Class1_Sub3_Sub2_Sub3(var38, "redstone3", 0);
					this.aClass1_Sub3_Sub2_Sub3_4 = new Class1_Sub3_Sub2_Sub3(var38, "redstone1", 0);
					this.aClass1_Sub3_Sub2_Sub3_4.method347(-725);
					this.aClass1_Sub3_Sub2_Sub3_5 = new Class1_Sub3_Sub2_Sub3(var38, "redstone2", 0);
					this.aClass1_Sub3_Sub2_Sub3_5.method347(-725);
					this.aClass1_Sub3_Sub2_Sub3_12 = new Class1_Sub3_Sub2_Sub3(var38, "redstone1", 0);
					this.aClass1_Sub3_Sub2_Sub3_12.method348((byte) -74);
					this.aClass1_Sub3_Sub2_Sub3_13 = new Class1_Sub3_Sub2_Sub3(var38, "redstone2", 0);
					this.aClass1_Sub3_Sub2_Sub3_13.method348((byte) -74);
					this.aClass1_Sub3_Sub2_Sub3_14 = new Class1_Sub3_Sub2_Sub3(var38, "redstone3", 0);
					this.aClass1_Sub3_Sub2_Sub3_14.method348((byte) -74);
					this.aClass1_Sub3_Sub2_Sub3_15 = new Class1_Sub3_Sub2_Sub3(var38, "redstone1", 0);
					this.aClass1_Sub3_Sub2_Sub3_15.method347(-725);
					this.aClass1_Sub3_Sub2_Sub3_15.method348((byte) -74);
					this.aClass1_Sub3_Sub2_Sub3_16 = new Class1_Sub3_Sub2_Sub3(var38, "redstone2", 0);
					this.aClass1_Sub3_Sub2_Sub3_16.method347(-725);
					this.aClass1_Sub3_Sub2_Sub3_16.method348((byte) -74);
					Class1_Sub3_Sub2_Sub2 var14 = new Class1_Sub3_Sub2_Sub2(var38, "backleft1", 0);
					this.aClass32_6 = new Class32(this.method72(aByte16), var14.anInt461, 299, var14.anInt462);
					var14.method320(34676, 0, 0);
					Class1_Sub3_Sub2_Sub2 var39 = new Class1_Sub3_Sub2_Sub2(var38, "backleft2", 0);
					this.aClass32_7 = new Class32(this.method72(aByte16), var39.anInt461, 299, var39.anInt462);
					var39.method320(34676, 0, 0);
					Class1_Sub3_Sub2_Sub2 var40 = new Class1_Sub3_Sub2_Sub2(var38, "backright1", 0);
					this.aClass32_8 = new Class32(this.method72(aByte16), var40.anInt461, 299, var40.anInt462);
					var40.method320(34676, 0, 0);
					Class1_Sub3_Sub2_Sub2 var41 = new Class1_Sub3_Sub2_Sub2(var38, "backright2", 0);
					this.aClass32_9 = new Class32(this.method72(aByte16), var41.anInt461, 299, var41.anInt462);
					var41.method320(34676, 0, 0);
					Class1_Sub3_Sub2_Sub2 var42 = new Class1_Sub3_Sub2_Sub2(var38, "backtop1", 0);
					this.aClass32_10 = new Class32(this.method72(aByte16), var42.anInt461, 299, var42.anInt462);
					var42.method320(34676, 0, 0);
					Class1_Sub3_Sub2_Sub2 var43 = new Class1_Sub3_Sub2_Sub2(var38, "backtop2", 0);
					this.aClass32_11 = new Class32(this.method72(aByte16), var43.anInt461, 299, var43.anInt462);
					var43.method320(34676, 0, 0);
					Class1_Sub3_Sub2_Sub2 var44 = new Class1_Sub3_Sub2_Sub2(var38, "backvmid1", 0);
					this.aClass32_12 = new Class32(this.method72(aByte16), var44.anInt461, 299, var44.anInt462);
					var44.method320(34676, 0, 0);
					Class1_Sub3_Sub2_Sub2 var45 = new Class1_Sub3_Sub2_Sub2(var38, "backvmid2", 0);
					this.aClass32_13 = new Class32(this.method72(aByte16), var45.anInt461, 299, var45.anInt462);
					var45.method320(34676, 0, 0);
					Class1_Sub3_Sub2_Sub2 var46 = new Class1_Sub3_Sub2_Sub2(var38, "backvmid3", 0);
					this.aClass32_14 = new Class32(this.method72(aByte16), var46.anInt461, 299, var46.anInt462);
					var46.method320(34676, 0, 0);
					Class1_Sub3_Sub2_Sub2 var47 = new Class1_Sub3_Sub2_Sub2(var38, "backhmid2", 0);
					this.aClass32_15 = new Class32(this.method72(aByte16), var47.anInt461, 299, var47.anInt462);
					var47.method320(34676, 0, 0);
					int var15 = (int) (Math.random() * 21.0D) - 10;
					int var16 = (int) (Math.random() * 21.0D) - 10;
					int var17 = (int) (Math.random() * 21.0D) - 10;
					int var18 = (int) (Math.random() * 41.0D) - 20;
					for (int var19 = 0; var19 < 50; ++var19) {
						if (this.aClass1_Sub3_Sub2_Sub2Array7[var19] != null) {
							this.aClass1_Sub3_Sub2_Sub2Array7[var19].method319(var15 + var18, var16 + var18, var17 + var18, true);
						}
						if (this.aClass1_Sub3_Sub2_Sub3Array3[var19] != null) {
							this.aClass1_Sub3_Sub2_Sub3Array3[var19].method349(var15 + var18, var16 + var18, var17 + var18, true);
						}
					}
					this.method74(true, "Unpacking textures", 80);
					Class1_Sub3_Sub2_Sub1.method292((byte) 2, var8);
					Class1_Sub3_Sub2_Sub1.method296(true, 0.8D);
					Class1_Sub3_Sub2_Sub1.method291(20, -20);
					this.method74(true, "Unpacking models", 83);
					Class1_Sub3_Sub1.method225(anInt268, var7);
					Class10.method261(false, var7);
					Class12.method276(false, var7);
					this.method74(true, "Unpacking config", 86);
					Class19.method374(var36, 473);
					Class2.method21(var36);
					Class11.method272(var36, 473);
					Class5.method52(var36);
					Class3.method30(var36);
					Class13.method304(var36, 473);
					Class21.method407(var36, 473);
					Class23.method411(var36, 473);
					Class5.aBoolean29 = aBoolean52;
					if (!aBoolean53) {
						this.method74(true, "Unpacking sounds", 90);
						byte[] var20 = var10.method536("sounds.dat", (byte[]) null, (byte) 2);
						Class1_Sub3_Sub3 var21 = new Class1_Sub3_Sub3(363, var20);
						Class43.method561(var21, 473);
					}
					this.method74(true, "Unpacking interfaces", 92);
					Class1_Sub3_Sub2_Sub4[] var48 = new Class1_Sub3_Sub2_Sub4[] { this.aClass1_Sub3_Sub2_Sub4_1, this.aClass1_Sub3_Sub2_Sub4_2, this.aClass1_Sub3_Sub2_Sub4_3, this.aClass1_Sub3_Sub2_Sub4_4 };
					Class15.method331(var38, var48, 30, var37);
					this.method74(true, "Preparing game engine", 97);
					int var22;
					int var23;
					int var24;
					for (int var49 = 0; var49 < 33; ++var49) {
						var22 = 999;
						var23 = 0;
						for (var24 = 0; var24 < 35; ++var24) {
							if (this.aClass1_Sub3_Sub2_Sub3_10.aByteArray6[var24 + var49 * this.aClass1_Sub3_Sub2_Sub3_10.anInt513] == 0) {
								if (var22 == 999) {
									var22 = var24;
								}
							} else if (var22 != 999) {
								var23 = var24;
								break;
							}
						}
						this.anIntArray44[var49] = var22;
						this.anIntArray81[var49] = var23 - var22;
					}
					int var25;
					for (var22 = 9; var22 < 160; ++var22) {
						var23 = 999;
						var24 = 0;
						for (var25 = 10; var25 < 168; ++var25) {
							if (this.aClass1_Sub3_Sub2_Sub3_10.aByteArray6[var25 + var22 * this.aClass1_Sub3_Sub2_Sub3_10.anInt513] == 0 && (var25 > 34 || var22 > 34)) {
								if (var23 == 999) {
									var23 = var25;
								}
							} else if (var23 != 999) {
								var24 = var25;
								break;
							}
						}
						this.anIntArray83[var22 - 9] = var23 - 21;
						this.anIntArray61[var22 - 9] = var24 - var23;
					}
					Class1_Sub3_Sub2_Sub1.method289(96, 479, 0);
					this.anIntArray30 = Class1_Sub3_Sub2_Sub1.anIntArray139;
					Class1_Sub3_Sub2_Sub1.method289(261, 190, 0);
					this.anIntArray31 = Class1_Sub3_Sub2_Sub1.anIntArray139;
					Class1_Sub3_Sub2_Sub1.method289(334, 512, 0);
					this.anIntArray32 = Class1_Sub3_Sub2_Sub1.anIntArray139;
					int[] var50 = new int[9];
					for (var24 = 0; var24 < 9; ++var24) {
						var25 = 128 + var24 * 32 + 15;
						int var26 = 600 + var25 * 3;
						int var27 = Class1_Sub3_Sub2_Sub1.anIntArray137[var25];
						var50[var24] = var26 * var27 >> 16;
					}
					Class33.method504(var50, 800, 512, aByte13, 334, 500);
					Class25.method414(var9);
				} catch (Exception var34) {
					this.aBoolean46 = true;
				}
			}
		}
	}

	public final void method143(int arg0) {
		try {
			if (this.anInt216 == 0) {
				this.aStringArray5[0] = "Cancel";
				this.anIntArray86[0] = 1252;
				this.anInt304 = 1;
				this.method136(super.anInt135, 27078, super.anInt136);
				this.anInt225 = 0;
				int var7 = 12 / arg0;
				if (super.anInt135 > 8 && super.anInt136 > 11 && super.anInt135 < 520 && super.anInt136 < 345) {
					if (this.anInt271 != -1) {
						this.method90(super.anInt136, super.anInt135, 11, Class15.aClass15Array1[this.anInt271], 5082, 8, 0);
					} else {
						this.method192((byte) 2);
					}
				}
				if (this.anInt225 != this.anInt300) {
					this.anInt300 = this.anInt225;
				}
				this.anInt225 = 0;
				if (super.anInt135 > 562 && super.anInt136 > 231 && super.anInt135 < 752 && super.anInt136 < 492) {
					if (this.anInt330 != -1) {
						this.method90(super.anInt136, super.anInt135, 231, Class15.aClass15Array1[this.anInt330], 5082, 562, 0);
					} else if (this.anIntArray46[this.anInt166] != -1) {
						this.method90(super.anInt136, super.anInt135, 231, Class15.aClass15Array1[this.anIntArray46[this.anInt166]], 5082, 562, 0);
					}
				}
				if (this.anInt225 != this.anInt256) {
					this.aBoolean59 = true;
					this.anInt256 = this.anInt225;
				}
				this.anInt225 = 0;
				if (super.anInt135 > 22 && super.anInt136 > 375 && super.anInt135 < 431 && super.anInt136 < 471) {
					if (this.anInt280 != -1) {
						this.method90(super.anInt136, super.anInt135, 375, Class15.aClass15Array1[this.anInt280], 5082, 22, 0);
					} else {
						this.method92(super.anInt136 - 375, 0, super.anInt135 - 22);
					}
				}
				if (this.anInt280 != -1 && this.anInt225 != this.anInt221) {
					this.aBoolean60 = true;
					this.anInt221 = this.anInt225;
				}
				boolean var2 = false;
				while (!var2) {
					var2 = true;
					for (int var3 = 0; var3 < this.anInt304 - 1; ++var3) {
						if (this.anIntArray86[var3] < 1000 && this.anIntArray86[var3 + 1] > 1000) {
							String var4 = this.aStringArray5[var3];
							this.aStringArray5[var3] = this.aStringArray5[var3 + 1];
							this.aStringArray5[var3 + 1] = var4;
							int var5 = this.anIntArray86[var3];
							this.anIntArray86[var3] = this.anIntArray86[var3 + 1];
							this.anIntArray86[var3 + 1] = var5;
							int var8 = this.anIntArray84[var3];
							this.anIntArray84[var3] = this.anIntArray84[var3 + 1];
							this.anIntArray84[var3 + 1] = var8;
							int var9 = this.anIntArray85[var3];
							this.anIntArray85[var3] = this.anIntArray85[var3 + 1];
							this.anIntArray85[var3 + 1] = var9;
							int var10 = this.anIntArray87[var3];
							this.anIntArray87[var3] = this.anIntArray87[var3 + 1];
							this.anIntArray87[var3 + 1] = var10;
							var2 = false;
						}
					}
				}
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("87687, " + arg0 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	public final void method144(byte arg0) {
		try {
			Class2.aClass35_1.method529();
			Class2.aClass35_2.method529();
			Class3.aClass35_3.method529();
			Class5.aClass35_4.method529();
			Class5.aClass35_5.method529();
			Class1_Sub1_Sub3_Sub2.aClass35_9.method529();
			Class21.aClass35_8.method529();
			if (arg0 == this.aByte10) {
				boolean var4 = false;
			} else {
				this.aBoolean72 = !this.aBoolean72;
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("74536, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public final void method145(int arg0) {
		try {
			int var2;
			if (arg0 != this.anInt165) {
				for (var2 = 1; var2 > 0; ++var2) {
				}
			}
			this.method80(222);
			if (this.anInt156 == 1) {
				this.aClass1_Sub3_Sub2_Sub2Array6[this.anInt155 / 100].method322(this.anInt154 - 8 - 11, this.anInt153 - 8 - 8, false);
			}
			if (this.anInt156 == 2) {
				this.aClass1_Sub3_Sub2_Sub2Array6[4 + this.anInt155 / 100].method322(this.anInt154 - 8 - 11, this.anInt153 - 8 - 8, false);
			}
			if (this.anInt271 != -1) {
				this.method171(this.anInt271, this.anInt270, 623);
				this.method120(0, 0, 38682, Class15.aClass15Array1[this.anInt271], 0);
			}
			this.method79(39734);
			if (!this.aBoolean50) {
				this.method143(26);
				this.method165(true);
			} else if (this.anInt337 == 0) {
				this.method135(-961);
			}
			if (this.anInt276 == 1) {
				if (this.anInt316 <= 0 && this.anInt252 != 1) {
					this.aClass1_Sub3_Sub2_Sub2Array5[1].method322(296, 472, false);
				} else {
					this.aClass1_Sub3_Sub2_Sub2Array5[1].method322(258, 472, false);
				}
			}
			if (this.anInt316 > 0) {
				this.aClass1_Sub3_Sub2_Sub2Array5[0].method322(296, 472, false);
				this.aClass1_Sub3_Sub2_Sub4_2.method362(329, (byte) 6, 16776960, "Level: " + this.anInt316, 484);
			}
			if (this.anInt252 == 1) {
				this.aClass1_Sub3_Sub2_Sub2Array5[6].method322(296, 472, false);
				this.aClass1_Sub3_Sub2_Sub4_2.method362(329, (byte) 6, 16776960, "Arena", 484);
			}
			if (this.anInt267 != 0) {
				var2 = this.anInt267 / 50;
				int var3 = var2 / 60;
				var2 %= 60;
				if (var2 < 10) {
					this.aClass1_Sub3_Sub2_Sub4_2.method365(4, 329, false, 16776960, "System update in: " + var3 + ":0" + var2);
				} else {
					this.aClass1_Sub3_Sub2_Sub4_2.method365(4, 329, false, 16776960, "System update in: " + var3 + ":" + var2);
				}
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("17204, " + arg0 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	public final void method146(int arg0) {
		try {
			int var2 = this.aClass1_Sub1_Sub3_Sub2_1.anInt890 + this.anInt327;
			int var3 = this.aClass1_Sub1_Sub3_Sub2_1.anInt891 + this.anInt331;
			if (this.anInt243 - var2 < -500 || this.anInt243 - var2 > 500 || this.anInt244 - var3 < -500 || this.anInt244 - var3 > 500) {
				this.anInt243 = var2;
				this.anInt244 = var3;
			}
			if (this.anInt243 != var2) {
				this.anInt243 += (var2 - this.anInt243) / 16;
			}
			if (this.anInt244 != var3) {
				this.anInt244 += (var3 - this.anInt244) / 16;
			}
			if (super.anIntArray28[1] == 1) {
				this.anInt201 += (-24 - this.anInt201) / 2;
			} else if (super.anIntArray28[2] == 1) {
				this.anInt201 += (24 - this.anInt201) / 2;
			} else {
				this.anInt201 /= 2;
			}
			if (super.anIntArray28[3] == 1) {
				this.anInt202 += (12 - this.anInt202) / 2;
			} else if (super.anIntArray28[4] == 1) {
				this.anInt202 += (-12 - this.anInt202) / 2;
			} else {
				this.anInt202 /= 2;
			}
			this.anInt200 = this.anInt200 + this.anInt201 / 2 & 2047;
			this.anInt178 += arg0;
			this.anInt199 += this.anInt202 / 2;
			if (this.anInt199 < 128) {
				this.anInt199 = 128;
			}
			if (this.anInt199 > 383) {
				this.anInt199 = 383;
			}
			int var4 = this.anInt243 >> 7;
			int var5 = this.anInt244 >> 7;
			int var6 = this.method94(this.anInt231, this.anInt243, (byte) 5, this.anInt244);
			int var7 = 0;
			int var8;
			if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
				for (var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
					for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
						int var10 = this.anInt231;
						if (var10 < 3 && (this.aByteArrayArrayArray7[1][var8][var9] & 2) == 2) {
							++var10;
						}
						int var11 = var6 - this.anIntArrayArrayArray3[var10][var8][var9];
						if (var11 > var7) {
							var7 = var11;
						}
					}
				}
			}
			var8 = var7 * 192;
			if (var8 > 98048) {
				var8 = 98048;
			}
			if (var8 < 32768) {
				var8 = 32768;
			}
			if (var8 > this.anInt251) {
				this.anInt251 += (var8 - this.anInt251) / 24;
			} else if (var8 < this.anInt251) {
				this.anInt251 += (var8 - this.anInt251) / 80;
			}
		} catch (RuntimeException var12) {
			signlink.reporterror("53255, " + arg0 + ", " + var12.toString());
			throw new RuntimeException();
		}
	}

	public final void method147(byte arg0) {
		try {
			if (arg0 != -26) {
				this.anInt179 = -1;
			}
			for (Class1_Sub1_Sub1 var2 = (Class1_Sub1_Sub1) this.aClass28_3.method456(); var2 != null; var2 = (Class1_Sub1_Sub1) this.aClass28_3.method458(551)) {
				if (var2.anInt24 == this.anInt231 && anInt266 <= var2.anInt30) {
					if (anInt266 >= var2.anInt29) {
						if (var2.anInt33 > 0) {
							Class1_Sub1_Sub3_Sub1 var3 = this.aClass1_Sub1_Sub3_Sub1Array1[var2.anInt33 - 1];
							if (var3 != null) {
								var2.method19(this.method94(var2.anInt24, var3.anInt890, (byte) 5, var3.anInt891) - var2.anInt28, var3.anInt891, var3.anInt890, -855, anInt266);
							}
						}
						if (var2.anInt33 < 0) {
							int var4 = -var2.anInt33 - 1;
							Class1_Sub1_Sub3_Sub2 var6;
							if (var4 == this.anInt152) {
								var6 = this.aClass1_Sub1_Sub3_Sub2_1;
							} else {
								var6 = this.aClass1_Sub1_Sub3_Sub2Array1[var4];
							}
							if (var6 != null) {
								var2.method19(this.method94(var2.anInt24, var6.anInt890, (byte) 5, var6.anInt891) - var2.anInt28, var6.anInt891, var6.anInt890, -855, anInt266);
							}
						}
						var2.method20((byte) -30, this.anInt270);
						this.aClass33_1.method478(-44713, (int) var2.aDouble2, 60, var2.anInt34, (int) var2.aDouble1, -1, false, (Class1_Sub3_Sub1) null, var2, (int) var2.aDouble3, this.anInt231);
					}
				} else {
					var2.method567();
				}
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("67909, " + arg0 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	public final void method71(int arg0) {
		try {
			if (arg0 != 3) {
				aBoolean48 = !aBoolean48;
			}
			this.aBoolean37 = true;
		} catch (RuntimeException var3) {
			signlink.reporterror("92948, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public final void method148(int arg0, int arg1, Class1_Sub3_Sub2_Sub2 arg2, int arg3) {
		try {
			int var5 = this.anInt200 + this.anInt308 & 2047;
			int var6 = arg3 * arg3 + arg0 * arg0;
			if (arg1 != 4) {
				this.aBoolean45 = !this.aBoolean45;
			}
			if (var6 <= 6400) {
				int var7 = Class1_Sub3_Sub1.anIntArray124[var5];
				int var8 = Class1_Sub3_Sub1.anIntArray125[var5];
				int var12 = var7 * 256 / (this.anInt249 + 256);
				int var13 = var8 * 256 / (this.anInt249 + 256);
				int var9 = arg0 * var12 + arg3 * var13 >> 16;
				int var10 = arg0 * var13 - arg3 * var12 >> 16;
				if (var6 > 2500) {
					arg2.method329(this.aClass1_Sub3_Sub2_Sub3_10, 83 - var10 - arg2.anInt466 / 2, 94 + var9 - arg2.anInt465 / 2, (byte) -15);
				} else {
					arg2.method322(83 - var10 - arg2.anInt466 / 2, 94 + var9 - arg2.anInt465 / 2, false);
				}
			}
		} catch (RuntimeException var11) {
			signlink.reporterror("70875, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var11.toString());
			throw new RuntimeException();
		}
	}

	public final int method149(int arg0, int arg1, int arg2, int arg3) {
		try {
			int var5 = 256 - arg1;
			if (arg3 <= 0) {
				aBoolean48 = !aBoolean48;
			}
			return ((arg0 & 16711935) * var5 + (arg2 & 16711935) * arg1 & -16711936) + ((arg0 & 65280) * var5 + (arg2 & 65280) * arg1 & 16711680) >> 8;
		} catch (RuntimeException var6) {
			signlink.reporterror("68501, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	public final String method150(int arg0, int arg1) {
		try {
			if (arg1 >= 0) {
				this.anInt333 = -430;
			}
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (RuntimeException var4) {
			signlink.reporterror("83712, " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	public final void method151(int arg0, boolean arg1, Class1_Sub1_Sub3 arg2) {
		try {
			this.method152(arg2.anInt891, arg2.anInt890, this.anInt317, arg0);
			if (arg1) {
				this.anInt179 = -1;
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("52028, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	public final void method152(int arg0, int arg1, int arg2, int arg3) {
		try {
			if (arg1 >= 128 && arg0 >= 128 && arg1 <= 13056 && arg0 <= 13056) {
				int var5 = this.method94(this.anInt231, arg1, (byte) 5, arg0) - arg3;
				int var14 = arg1 - this.anInt322;
				int var15 = var5 - this.anInt323;
				int var12 = arg0 - this.anInt324;
				int var6 = Class1_Sub3_Sub1.anIntArray124[this.anInt325];
				int var7 = Class1_Sub3_Sub1.anIntArray125[this.anInt325];
				int var8 = Class1_Sub3_Sub1.anIntArray124[this.anInt326];
				int var9 = Class1_Sub3_Sub1.anIntArray125[this.anInt326];
				int var10 = var12 * var8 + var14 * var9 >> 16;
				int var13 = var12 * var9 - var14 * var8 >> 16;
				if (arg2 >= 0) {
					this.aClass1_Sub3_Sub3_6.method381(131);
				}
				var14 = var10;
				var10 = var15 * var7 - var13 * var6 >> 16;
				var12 = var15 * var6 + var13 * var7 >> 16;
				if (var12 >= 50) {
					this.anInt287 = Class1_Sub3_Sub2_Sub1.anInt430 + (var14 << 9) / var12;
					this.anInt288 = Class1_Sub3_Sub2_Sub1.anInt431 + (var10 << 9) / var12;
				} else {
					this.anInt287 = -1;
					this.anInt288 = -1;
				}
			} else {
				this.anInt287 = -1;
				this.anInt288 = -1;
			}
		} catch (RuntimeException var11) {
			signlink.reporterror("27324, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var11.toString());
			throw new RuntimeException();
		}
	}

	public final boolean method153(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		try {
			int var6 = arg3 >> 14 & 32767;
			int var7 = this.aClass33_1.method498(this.anInt231, arg1, arg2, arg3);
			if (var7 == -1) {
				return false;
			} else {
				int var8 = var7 & 31;
				int var9 = var7 >> 6 & 3;
				if (var8 != 10 && var8 != 11 && var8 != 22) {
					this.method168(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 0, false, arg1, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 2, 0, arg2, var9, var8 + 1, 0);
				} else {
					Class2 var10 = Class2.method23(var6);
					int var11;
					int var12;
					if (var9 != 0 && var9 != 2) {
						var11 = var10.anInt44;
						var12 = var10.anInt43;
					} else {
						var11 = var10.anInt43;
						var12 = var10.anInt44;
					}
					int var13 = var10.anInt55;
					if (var9 != 0) {
						var13 = (var13 << var9 & 15) + (var13 >> 4 - var9);
					}
					this.method168(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], var11, false, arg1, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 2, var12, arg2, 0, 0, var13);
				}
				this.anInt153 = super.anInt138;
				this.anInt154 = super.anInt139;
				this.anInt156 = 2;
				this.anInt155 = 0;
				this.aClass1_Sub3_Sub3_6.method380((byte) -34, arg0);
				this.aClass1_Sub3_Sub3_6.method382(arg1 + this.anInt169);
				this.aClass1_Sub3_Sub3_6.method382(arg2 + this.anInt170);
				this.aClass1_Sub3_Sub3_6.method382(var6);
				if (!arg4) {
					throw new NullPointerException();
				} else {
					return true;
				}
			}
		} catch (RuntimeException var14) {
			signlink.reporterror("35563, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + var14.toString());
			throw new RuntimeException();
		}
	}

	public final void method154(int arg0) {
		try {
			int var2 = this.aClass1_Sub3_Sub2_Sub4_3.method364(false, "Choose Option");
			int var4;
			for (int var3 = 0; var3 < this.anInt304; ++var3) {
				var4 = this.aClass1_Sub3_Sub2_Sub4_3.method364(false, this.aStringArray5[var3]);
				if (var4 > var2) {
					var2 = var4;
				}
			}
			var2 += 8;
			var4 = 15 * this.anInt304 + 21;
			if (arg0 < 0) {
				int var5;
				int var6;
				if (super.anInt138 > 8 && super.anInt139 > 11 && super.anInt138 < 520 && super.anInt139 < 345) {
					var5 = super.anInt138 - 8 - var2 / 2;
					if (var5 + var2 > 512) {
						var5 = 512 - var2;
					}
					if (var5 < 0) {
						var5 = 0;
					}
					var6 = super.anInt139 - 11;
					if (var6 + var4 > 334) {
						var6 = 334 - var4;
					}
					if (var6 < 0) {
						var6 = 0;
					}
					this.aBoolean50 = true;
					this.anInt337 = 0;
					this.anInt338 = var5;
					this.anInt339 = var6;
					this.anInt340 = var2;
					this.anInt341 = 15 * this.anInt304 + 22;
				}
				if (super.anInt138 > 562 && super.anInt139 > 231 && super.anInt138 < 752 && super.anInt139 < 492) {
					var5 = super.anInt138 - 562 - var2 / 2;
					if (var5 < 0) {
						var5 = 0;
					} else if (var5 + var2 > 190) {
						var5 = 190 - var2;
					}
					var6 = super.anInt139 - 231;
					if (var6 < 0) {
						var6 = 0;
					} else if (var6 + var4 > 261) {
						var6 = 261 - var4;
					}
					this.aBoolean50 = true;
					this.anInt337 = 1;
					this.anInt338 = var5;
					this.anInt339 = var6;
					this.anInt340 = var2;
					this.anInt341 = 15 * this.anInt304 + 22;
				}
				if (super.anInt138 > 22 && super.anInt139 > 375 && super.anInt138 < 501 && super.anInt139 < 471) {
					var5 = super.anInt138 - 22 - var2 / 2;
					if (var5 < 0) {
						var5 = 0;
					} else if (var5 + var2 > 479) {
						var5 = 479 - var2;
					}
					var6 = super.anInt139 - 375;
					if (var6 < 0) {
						var6 = 0;
					} else if (var6 + var4 > 96) {
						var6 = 96 - var4;
					}
					this.aBoolean50 = true;
					this.anInt337 = 2;
					this.anInt338 = var5;
					this.anInt339 = var6;
					this.anInt340 = var2;
					this.anInt341 = 15 * this.anInt304 + 22;
				}
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("57560, " + arg0 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	public final DataInputStream method155(String arg0) throws IOException {
		return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
	}

	public final void method156(byte arg0) {
		try {
			if (this.aClass32_16 == null) {
				super.aClass32_2 = null;
				this.aClass32_28 = null;
				this.aClass32_26 = null;
				this.aClass32_25 = null;
				this.aClass32_27 = null;
				this.aClass32_3 = null;
				this.aClass32_4 = null;
				this.aClass32_5 = null;
				this.aClass32_19 = new Class32(this.method72(aByte16), 128, 299, 265);
				Class1_Sub3_Sub2.method357(this.anInt336);
				this.aClass32_20 = new Class32(this.method72(aByte16), 128, 299, 265);
				Class1_Sub3_Sub2.method357(this.anInt336);
				this.aClass32_16 = new Class32(this.method72(aByte16), 533, 299, 186);
				Class1_Sub3_Sub2.method357(this.anInt336);
				this.aClass32_17 = new Class32(this.method72(aByte16), 360, 299, 146);
				Class1_Sub3_Sub2.method357(this.anInt336);
				this.aClass32_18 = new Class32(this.method72(aByte16), 360, 299, 200);
				Class1_Sub3_Sub2.method357(this.anInt336);
				this.aClass32_21 = new Class32(this.method72(aByte16), 214, 299, 267);
				Class1_Sub3_Sub2.method357(this.anInt336);
				this.aClass32_22 = new Class32(this.method72(aByte16), 215, 299, 267);
				Class1_Sub3_Sub2.method357(this.anInt336);
				this.aClass32_23 = new Class32(this.method72(aByte16), 86, 299, 79);
				if (arg0 != this.aByte12) {
					this.aClass1_Sub3_Sub3_6.method381(73);
				}
				Class1_Sub3_Sub2.method357(this.anInt336);
				this.aClass32_24 = new Class32(this.method72(aByte16), 87, 299, 79);
				Class1_Sub3_Sub2.method357(this.anInt336);
				if (this.aClass39_1 != null) {
					this.method189((byte) 5);
					this.method109(0);
				}
				this.aBoolean37 = true;
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("86250, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public final void method157(int arg0) {
		try {
			this.aBoolean70 = true;
			try {
				long var2 = System.currentTimeMillis();
				int var4 = 0;
				int var5 = 20;
				while (this.aBoolean54) {
					this.method103(true);
					this.method103(true);
					this.method89(true);
					++var4;
					if (var4 > 10) {
						long var6 = System.currentTimeMillis();
						int var8 = (int) (var6 - var2) / 10 - var5;
						var5 = 40 - var8;
						if (var5 < 5) {
							var5 = 5;
						}
						var4 = 0;
						var2 = var6;
					}
					try {
						Thread.sleep((long) var5);
					} catch (Exception var9) {
					}
				}
			} catch (Exception var10) {
			}
			this.aBoolean70 = false;
			if (arg0 != -33833) {
				aBoolean48 = !aBoolean48;
			}
		} catch (RuntimeException var11) {
			signlink.reporterror("93519, " + arg0 + ", " + var11.toString());
			throw new RuntimeException();
		}
	}

	public final void run() {
		if (this.aBoolean63) {
			this.method157(-33833);
		} else if (this.aBoolean40) {
			this.method87(true);
		} else {
			super.run();
		}
	}

	public final void method158(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, Class15 arg8) {
		try {
			if (this.aBoolean71) {
				this.anInt342 = 32;
			} else {
				this.anInt342 = 0;
			}
			this.aBoolean71 = false;
			this.anInt178 += arg1;
			if (arg0 >= arg6 && arg0 < arg6 + 16 && arg2 >= arg7 && arg2 < arg7 + 16) {
				arg8.anInt481 -= this.anInt253 * 4;
				if (arg5) {
					this.aBoolean59 = true;
					return;
				}
			} else if (arg0 >= arg6 && arg0 < arg6 + 16 && arg2 >= arg7 + arg4 - 16 && arg2 < arg7 + arg4) {
				arg8.anInt481 += this.anInt253 * 4;
				if (arg5) {
					this.aBoolean59 = true;
					return;
				}
			} else {
				if (arg0 < arg6 - this.anInt342 || arg0 >= arg6 + 16 + this.anInt342 || arg2 < arg7 + 16 || arg2 >= arg7 + arg4 - 16 || this.anInt253 <= 0) {
					return;
				}
				int var10 = (arg4 - 32) * arg4 / arg3;
				if (var10 < 8) {
					var10 = 8;
				}
				int var11 = arg2 - arg7 - 16 - var10 / 2;
				int var12 = arg4 - 32 - var10;
				arg8.anInt481 = (arg3 - arg4) * var11 / var12;
				if (arg5) {
					this.aBoolean59 = true;
				}
				this.aBoolean71 = true;
			}
		} catch (RuntimeException var13) {
			signlink.reporterror("76637, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + var13.toString());
			throw new RuntimeException();
		}
	}

	public final void method159(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString15 = "";
				this.aString16 = "Connecting to server...";
				this.method116(4);
			}
			this.aClass6_1 = new Class6(this, (byte) 2, this.method162(43594 + anInt236));
			this.aClass6_1.method204(this.aClass1_Sub3_Sub3_5.aByteArray7, 0, 8);
			this.aClass1_Sub3_Sub3_5.anInt561 = 0;
			this.aLong9 = this.aClass1_Sub3_Sub3_5.method397(603);
			int[] var4 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong9 >> 32), (int) this.aLong9 };
			this.aClass1_Sub3_Sub3_6.anInt561 = 0;
			this.aClass1_Sub3_Sub3_6.method381(10);
			this.aClass1_Sub3_Sub3_6.method385(var4[0]);
			this.aClass1_Sub3_Sub3_6.method385(var4[1]);
			this.aClass1_Sub3_Sub3_6.method385(var4[2]);
			this.aClass1_Sub3_Sub3_6.method385(var4[3]);
			this.aClass1_Sub3_Sub3_6.method385(signlink.anInt756);
			this.aClass1_Sub3_Sub3_6.method388(arg0);
			this.aClass1_Sub3_Sub3_6.method388(arg1);
			this.aClass1_Sub3_Sub3_6.method406(aBigInteger2, aBigInteger1, this.anInt151);
			this.aClass1_Sub3_Sub3_4.anInt561 = 0;
			if (arg2) {
				this.aClass1_Sub3_Sub3_4.method381(18);
			} else {
				this.aClass1_Sub3_Sub3_4.method381(16);
			}
			this.aClass1_Sub3_Sub3_4.method381(this.aClass1_Sub3_Sub3_6.anInt561 + 36 + 1 + 1);
			this.aClass1_Sub3_Sub3_4.method381(225);
			this.aClass1_Sub3_Sub3_4.method381(aBoolean53 ? 1 : 0);
			for (int var5 = 0; var5 < 9; ++var5) {
				this.aClass1_Sub3_Sub3_4.method385(this.anIntArray38[var5]);
			}
			this.aClass1_Sub3_Sub3_4.method389(this.aClass1_Sub3_Sub3_6.aByteArray7, this.aClass1_Sub3_Sub3_6.anInt561, 0, (byte) -106);
			this.aClass1_Sub3_Sub3_6.aClass38_2 = new Class38((byte) 1, var4);
			for (int var6 = 0; var6 < 4; ++var6) {
				var4[var6] += 50;
			}
			this.aClass38_1 = new Class38((byte) 1, var4);
			this.aClass6_1.method205(this.aClass1_Sub3_Sub3_4.aByteArray7, this.aClass1_Sub3_Sub3_4.anInt561, true, 0);
			int var7 = this.aClass6_1.method202();
			if (var7 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var14) {
				}
				this.method159(arg0, arg1, arg2);
				return;
			}
			if (var7 == 2 || var7 == 18) {
				if (var7 == 18) {
					this.aBoolean65 = true;
				} else {
					this.aBoolean65 = false;
				}
				Class8.method209((byte) 65);
				this.aBoolean62 = true;
				this.aClass1_Sub3_Sub3_6.anInt561 = 0;
				this.aClass1_Sub3_Sub3_5.anInt561 = 0;
				this.anInt179 = -1;
				this.anInt207 = -1;
				this.anInt208 = -1;
				this.anInt209 = -1;
				this.anInt178 = 0;
				this.anInt180 = 0;
				this.anInt267 = 0;
				this.anInt182 = 0;
				this.anInt241 = 0;
				this.anInt304 = 0;
				this.aBoolean50 = false;
				super.anInt133 = 0;
				for (int var8 = 0; var8 < 100; ++var8) {
					this.aStringArray7[var8] = null;
				}
				this.anInt281 = 0;
				this.anInt291 = 0;
				this.anInt307 = 0;
				this.anInt286 = 0;
				this.anInt327 = (int) (Math.random() * 100.0D) - 50;
				this.anInt331 = (int) (Math.random() * 110.0D) - 55;
				this.anInt334 = (int) (Math.random() * 80.0D) - 40;
				this.anInt308 = (int) (Math.random() * 120.0D) - 60;
				this.anInt249 = (int) (Math.random() * 30.0D) - 20;
				this.anInt200 = (int) (Math.random() * 20.0D) - 10 & 2047;
				this.anInt176 = -1;
				this.anInt296 = 0;
				this.anInt297 = 0;
				this.anInt205 = 0;
				this.anInt248 = 0;
				for (int var9 = 0; var9 < this.anInt203; ++var9) {
					this.aClass1_Sub1_Sub3_Sub2Array1[var9] = null;
					this.aClass1_Sub3_Sub3Array1[var9] = null;
				}
				for (int var10 = 0; var10 < 8192; ++var10) {
					this.aClass1_Sub1_Sub3_Sub1Array1[var10] = null;
				}
				this.aClass1_Sub1_Sub3_Sub2_1 = this.aClass1_Sub1_Sub3_Sub2Array1[this.anInt204] = new Class1_Sub1_Sub3_Sub2();
				this.aClass28_3.method460();
				this.aClass28_5.method460();
				this.aClass28_2.method460();
				int var12;
				for (int var11 = 0; var11 < 4; ++var11) {
					for (var12 = 0; var12 < 104; ++var12) {
						for (int var13 = 0; var13 < 104; ++var13) {
							this.aClass28ArrayArrayArray1[var11][var12][var13] = null;
						}
					}
				}
				this.aClass28_4 = new Class28(0);
				this.anInt312 = 0;
				this.anInt289 = -1;
				this.anInt280 = -1;
				this.anInt271 = -1;
				this.anInt330 = -1;
				this.aBoolean49 = false;
				this.anInt166 = 3;
				this.aBoolean66 = false;
				this.aBoolean50 = false;
				this.aBoolean47 = false;
				this.aString8 = null;
				this.anInt276 = 0;
				this.anInt329 = -1;
				this.aBoolean43 = true;
				this.method112((byte) -6);
				for (var12 = 0; var12 < 5; ++var12) {
					this.anIntArray33[var12] = 0;
				}
				anInt175 = 0;
				anInt224 = 0;
				anInt195 = 0;
				anInt188 = 0;
				anInt143 = 0;
				anInt220 = 0;
				anInt254 = 0;
				anInt237 = 0;
				anInt229 = 0;
				anInt285 = 0;
				this.method117(-7185);
				return;
			}
			if (var7 == 3) {
				this.aString15 = "";
				this.aString16 = "Invalid username or password.";
				return;
			}
			if (var7 == 4) {
				this.aString15 = "Your account has been disabled.";
				this.aString16 = "Please check your message-centre for details.";
				return;
			}
			if (var7 == 5) {
				this.aString15 = "Your account is already logged in.";
				this.aString16 = "Try again in 60 secs...";
				return;
			}
			if (var7 == 6) {
				this.aString15 = "RuneScape has been updated!";
				this.aString16 = "Please reload this page.";
				return;
			}
			if (var7 == 7) {
				this.aString15 = "This world is full.";
				this.aString16 = "Please use a different world.";
				return;
			}
			if (var7 == 8) {
				this.aString15 = "Unable to connect.";
				this.aString16 = "Login server offline.";
				return;
			}
			if (var7 == 9) {
				this.aString15 = "Login limit exceeded.";
				this.aString16 = "Too many connections from your address.";
				return;
			}
			if (var7 == 10) {
				this.aString15 = "Unable to connect.";
				this.aString16 = "Bad session id.";
				return;
			}
			if (var7 == 11) {
				this.aString16 = "Login server rejected session.";
				this.aString16 = "Please try again.";
				return;
			}
			if (var7 == 12) {
				this.aString15 = "You need a members account to login to this world.";
				this.aString16 = "Please subscribe, or use a different world.";
				return;
			}
			if (var7 == 13) {
				this.aString15 = "Could not complete login.";
				this.aString16 = "Please try using a different world.";
				return;
			}
			if (var7 == 14) {
				this.aString15 = "The server is being updated.";
				this.aString16 = "Please wait 1 minute and try again.";
				return;
			}
			if (var7 == 15) {
				this.aBoolean62 = true;
				this.aClass1_Sub3_Sub3_6.anInt561 = 0;
				this.aClass1_Sub3_Sub3_5.anInt561 = 0;
				this.anInt179 = -1;
				this.anInt207 = -1;
				this.anInt208 = -1;
				this.anInt209 = -1;
				this.anInt178 = 0;
				this.anInt180 = 0;
				this.anInt267 = 0;
				this.anInt304 = 0;
				this.aBoolean50 = false;
				return;
			}
			if (var7 == 16) {
				this.aString15 = "Login attempts exceeded.";
				this.aString16 = "Please wait 1 minute and try again.";
				return;
			}
			if (var7 == 17) {
				this.aString15 = "You are standing in a members-only area.";
				this.aString16 = "To play on this world move to a free area first";
				return;
			}
		} catch (IOException var15) {
			this.aString15 = "";
			this.aString16 = "Error connecting to server.";
		}
	}

	public final void method160(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			if (arg6 != -27819) {
				this.method67();
			}
			if (arg1 >= 1 && arg2 >= 1 && arg1 <= 102 && arg2 <= 102) {
				if (aBoolean53 && arg7 != this.anInt231) {
					return;
				}
				int var9 = 0;
				boolean var10 = true;
				boolean var11 = false;
				boolean var12 = false;
				if (arg3 == 0) {
					var9 = this.aClass33_1.method494(arg7, arg1, arg2);
				}
				if (arg3 == 1) {
					var9 = this.aClass33_1.method495(arg7, arg2, 3, arg1);
				}
				if (arg3 == 2) {
					var9 = this.aClass33_1.method496(arg7, arg1, arg2);
				}
				if (arg3 == 3) {
					var9 = this.aClass33_1.method497(arg7, arg1, arg2);
				}
				int var13;
				if (var9 != 0) {
					var13 = this.aClass33_1.method498(arg7, arg1, arg2, var9);
					int var16 = var9 >> 14 & 32767;
					int var17 = var13 & 31;
					int var18 = var13 >> 6;
					Class2 var14;
					if (arg3 == 0) {
						this.aClass33_1.method489(arg1, arg7, arg2, 1);
						var14 = Class2.method23(var16);
						if (var14.aBoolean7) {
							this.aClass9Array1[arg7].method254(var14.aBoolean8, var18, arg1, arg2, 323, var17);
						}
					}
					if (arg3 == 1) {
						this.aClass33_1.method490(arg7, arg2, this.anInt306, arg1);
					}
					if (arg3 == 2) {
						this.aClass33_1.method491(arg1, arg2, -54, arg7);
						var14 = Class2.method23(var16);
						if (arg1 + var14.anInt43 > 103 || arg2 + var14.anInt43 > 103 || arg1 + var14.anInt44 > 103 || arg2 + var14.anInt44 > 103) {
							return;
						}
						if (var14.aBoolean7) {
							this.aClass9Array1[arg7].method255(arg2, arg1, var18, var14.anInt43, true, var14.aBoolean8, var14.anInt44);
						}
					}
					if (arg3 == 3) {
						this.aClass33_1.method492(arg7, this.anInt290, arg1, arg2);
						var14 = Class2.method23(var16);
						if (var14.aBoolean7 && var14.aBoolean9) {
							this.aClass9Array1[arg7].method257(arg2, arg1, 0);
						}
					}
				}
				if (arg4 >= 0) {
					var13 = arg7;
					if (arg7 < 3 && (this.aByteArrayArrayArray7[1][arg1][arg2] & 2) == 2) {
						var13 = arg7 + 1;
					}
					Class4.method50(arg1, this.aClass28_1, this.aClass9Array1[arg7], arg2, arg0, this.anIntArrayArrayArray3, 0, arg7, arg4, arg5, this.aClass33_1, var13);
					return;
				}
			}
		} catch (RuntimeException var15) {
			signlink.reporterror("53981, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + var15.toString());
			throw new RuntimeException();
		}
	}

	public final void method161(long arg0, int arg1) {
		try {
			if (arg0 != 0L) {
				if (this.anInt312 >= 100) {
					this.method172(0, "Your friends list is full. Max of 100 hit", (byte) 4, "");
				} else {
					String var4 = Class40.method542(0, Class40.method539(arg0, false));
					for (int var5 = 0; var5 < this.anInt312; ++var5) {
						if (this.aLongArray4[var5] == arg0) {
							this.method172(0, var4 + " is already on your friend list", (byte) 4, "");
							return;
						}
					}
					for (int var6 = 0; var6 < this.anInt186; ++var6) {
						if (this.aLongArray3[var6] == arg0) {
							this.method172(0, "Please remove " + var4 + " from your ignore list first", (byte) 4, "");
							return;
						}
					}
					if (!var4.equals(this.aClass1_Sub1_Sub3_Sub2_1.aString30)) {
						this.aStringArray9[this.anInt312] = var4;
						this.aLongArray4[this.anInt312] = arg0;
						this.anIntArray34[this.anInt312] = 0;
						++this.anInt312;
						if (arg1 >= 0) {
							this.anInt294 = this.aClass38_1.method532();
						}
						this.aBoolean59 = true;
						this.aClass1_Sub3_Sub3_6.method380((byte) -34, 118);
						this.aClass1_Sub3_Sub3_6.method387(true, arg0);
					}
				}
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("3645, " + arg0 + ", " + arg1 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	public final void method69(byte arg0) {
		try {
			signlink.reporterror = false;
			try {
				if (this.aClass6_1 != null) {
					this.aClass6_1.method201();
				}
			} catch (Exception var3) {
			}
			this.aClass6_1 = null;
			this.method78(0);
			this.aBoolean41 = false;
			this.aClass1_Sub3_Sub3_6 = null;
			this.aClass1_Sub3_Sub3_4 = null;
			this.aClass1_Sub3_Sub3_5 = null;
			this.anIntArray56 = null;
			this.aByteArrayArray1 = null;
			this.aByteArrayArray2 = null;
			this.anIntArrayArrayArray3 = null;
			this.aByteArrayArrayArray7 = null;
			this.aClass33_1 = null;
			this.aClass9Array1 = null;
			this.anIntArrayArray5 = null;
			this.anIntArrayArray2 = null;
			this.anIntArray66 = null;
			this.anIntArray67 = null;
			this.aByteArray4 = null;
			this.aClass32_25 = null;
			this.aClass32_26 = null;
			this.aClass32_27 = null;
			this.aClass32_28 = null;
			this.aClass32_3 = null;
			this.aClass32_4 = null;
			this.aClass32_5 = null;
			this.aClass32_6 = null;
			this.aClass32_7 = null;
			this.aClass32_8 = null;
			this.aClass32_9 = null;
			this.aClass32_10 = null;
			this.aClass32_11 = null;
			this.aClass32_12 = null;
			this.aClass32_13 = null;
			this.aClass32_14 = null;
			this.aClass32_15 = null;
			this.aClass1_Sub3_Sub2_Sub3_9 = null;
			this.aClass1_Sub3_Sub2_Sub3_10 = null;
			this.aClass1_Sub3_Sub2_Sub3_11 = null;
			this.aClass1_Sub3_Sub2_Sub3_6 = null;
			this.aClass1_Sub3_Sub2_Sub3_7 = null;
			this.aClass1_Sub3_Sub2_Sub3_8 = null;
			this.aClass1_Sub3_Sub2_Sub3Array1 = null;
			this.aClass1_Sub3_Sub2_Sub3_1 = null;
			this.aClass1_Sub3_Sub2_Sub3_2 = null;
			this.aClass1_Sub3_Sub2_Sub3_3 = null;
			this.aClass1_Sub3_Sub2_Sub3_4 = null;
			this.aClass1_Sub3_Sub2_Sub3_5 = null;
			this.aClass1_Sub3_Sub2_Sub3_12 = null;
			this.aClass1_Sub3_Sub2_Sub3_13 = null;
			this.aClass1_Sub3_Sub2_Sub3_14 = null;
			this.aClass1_Sub3_Sub2_Sub3_15 = null;
			this.aClass1_Sub3_Sub2_Sub3_16 = null;
			this.aClass1_Sub3_Sub2_Sub2_11 = null;
			this.aClass1_Sub3_Sub2_Sub2Array3 = null;
			this.aClass1_Sub3_Sub2_Sub2Array5 = null;
			this.aClass1_Sub3_Sub2_Sub2Array6 = null;
			this.aClass1_Sub3_Sub2_Sub2_7 = null;
			this.aClass1_Sub3_Sub2_Sub2_8 = null;
			this.aClass1_Sub3_Sub2_Sub2_9 = null;
			this.aClass1_Sub3_Sub2_Sub2_10 = null;
			this.aClass1_Sub3_Sub2_Sub3Array3 = null;
			if (arg0 != -28) {
				this.method67();
			}
			this.aClass1_Sub3_Sub2_Sub2Array7 = null;
			this.anIntArrayArray3 = null;
			this.aClass1_Sub1_Sub3_Sub2Array1 = null;
			this.anIntArray39 = null;
			this.anIntArray40 = null;
			this.aClass1_Sub3_Sub3Array1 = null;
			this.anIntArray60 = null;
			this.aClass1_Sub1_Sub3_Sub1Array1 = null;
			this.anIntArray58 = null;
			this.aClass28ArrayArrayArray1 = null;
			this.aClass28_4 = null;
			this.aClass28_2 = null;
			this.aClass28_3 = null;
			this.aClass28_5 = null;
			this.aClass28_1 = null;
			this.anIntArray84 = null;
			this.anIntArray85 = null;
			this.anIntArray86 = null;
			this.anIntArray87 = null;
			this.aStringArray5 = null;
			this.anIntArray59 = null;
			this.anIntArray54 = null;
			this.anIntArray55 = null;
			this.aClass1_Sub3_Sub2_Sub2Array4 = null;
			this.aClass1_Sub3_Sub2_Sub2_6 = null;
			this.aStringArray9 = null;
			this.aLongArray4 = null;
			this.anIntArray34 = null;
			this.aClass32_19 = null;
			this.aClass32_20 = null;
			this.aClass32_16 = null;
			this.aClass32_17 = null;
			this.aClass32_18 = null;
			this.aClass32_21 = null;
			this.aClass32_22 = null;
			this.aClass32_23 = null;
			this.aClass32_24 = null;
			this.method99(true);
			Class2.method22(true);
			Class3.method31(true);
			Class5.method53(true);
			Class11.aClass11Array1 = null;
			Class13.aClass13Array1 = null;
			Class15.aClass15Array1 = null;
			Class17.aClass17Array1 = null;
			Class19.aClass19Array1 = null;
			Class21.aClass21Array1 = null;
			Class21.aClass35_8 = null;
			Class23.aClass23Array1 = null;
			super.aClass32_2 = null;
			Class1_Sub1_Sub3_Sub2.aClass35_9 = null;
			Class1_Sub3_Sub2_Sub1.method287(true);
			Class33.method466(true);
			Class1_Sub3_Sub1.method224(true);
			Class10.aClass10Array1 = null;
			Class12.aClass12Array1 = null;
			System.gc();
		} catch (RuntimeException var4) {
			signlink.reporterror("6631, " + arg0 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	public final Socket method162(int arg0) throws IOException {
		return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
	}

	public final void method163(boolean arg0, int arg1, int arg2, Class1_Sub1_Sub3_Sub2 arg3, int arg4) {
		try {
			if (arg0) {
				this.anInt290 = this.aClass38_1.method532();
			}
			if (arg3 != this.aClass1_Sub1_Sub3_Sub2_1) {
				if (this.anInt304 < 400) {
					String var6 = arg3.aString30 + method133(this.aClass1_Sub1_Sub3_Sub2_1.anInt940, false, arg3.anInt940) + " (level-" + arg3.anInt940 + ")";
					if (this.anInt281 == 1) {
						this.aStringArray5[this.anInt304] = "Use " + this.aString10 + " with @whi@" + var6;
						this.anIntArray86[this.anInt304] = 367;
						this.anIntArray87[this.anInt304] = arg2;
						this.anIntArray84[this.anInt304] = arg4;
						this.anIntArray85[this.anInt304] = arg1;
						++this.anInt304;
					} else if (this.anInt291 == 1) {
						if ((this.anInt293 & 8) == 8) {
							this.aStringArray5[this.anInt304] = this.aString11 + " @whi@" + var6;
							this.anIntArray86[this.anInt304] = 651;
							this.anIntArray87[this.anInt304] = arg2;
							this.anIntArray84[this.anInt304] = arg4;
							this.anIntArray85[this.anInt304] = arg1;
							++this.anInt304;
						}
					} else {
						this.aStringArray5[this.anInt304] = "Follow @whi@" + var6;
						this.anIntArray86[this.anInt304] = 1544;
						this.anIntArray87[this.anInt304] = arg2;
						this.anIntArray84[this.anInt304] = arg4;
						this.anIntArray85[this.anInt304] = arg1;
						++this.anInt304;
						if (this.anInt191 == 0) {
							this.aStringArray5[this.anInt304] = "Trade with @whi@" + var6;
							this.anIntArray86[this.anInt304] = 1373;
							this.anIntArray87[this.anInt304] = arg2;
							this.anIntArray84[this.anInt304] = arg4;
							this.anIntArray85[this.anInt304] = arg1;
							++this.anInt304;
						}
						if (this.anInt316 > 0) {
							this.aStringArray5[this.anInt304] = "Attack @whi@" + var6;
							if (this.aClass1_Sub1_Sub3_Sub2_1.anInt940 >= arg3.anInt940) {
								this.anIntArray86[this.anInt304] = 151;
							} else {
								this.anIntArray86[this.anInt304] = 2151;
							}
							this.anIntArray87[this.anInt304] = arg2;
							this.anIntArray84[this.anInt304] = arg4;
							this.anIntArray85[this.anInt304] = arg1;
							++this.anInt304;
						}
						if (this.anInt252 == 1) {
							this.aStringArray5[this.anInt304] = "Fight @whi@" + var6;
							this.anIntArray86[this.anInt304] = 151;
							this.anIntArray87[this.anInt304] = arg2;
							this.anIntArray84[this.anInt304] = arg4;
							this.anIntArray85[this.anInt304] = arg1;
							++this.anInt304;
						}
						if (this.anInt252 == 2) {
							this.aStringArray5[this.anInt304] = "Duel-with @whi@" + var6;
							this.anIntArray86[this.anInt304] = 1101;
							this.anIntArray87[this.anInt304] = arg2;
							this.anIntArray84[this.anInt304] = arg4;
							this.anIntArray85[this.anInt304] = arg1;
							++this.anInt304;
						}
					}
					for (int var7 = 0; var7 < this.anInt304; ++var7) {
						if (this.anIntArray86[var7] == 660) {
							this.aStringArray5[var7] = "Walk here @whi@" + var6;
							return;
						}
					}
				}
			}
		} catch (RuntimeException var8) {
			signlink.reporterror("4679, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	public final void method164(boolean arg0) {
		try {
			if (this.anInt267 > 1) {
				--this.anInt267;
			}
			if (this.anInt182 > 0) {
				--this.anInt182;
			}
			for (int var2 = 0; var2 < 5 && this.method197(false); ++var2) {
			}
			if (!arg0) {
				this.anInt179 = this.aClass1_Sub3_Sub3_5.method391();
			}
			if (this.aBoolean62) {
				int var13;
				int var10002;
				for (int var3 = 0; var3 < this.anInt286; ++var3) {
					if (this.anIntArray45[var3] <= 0) {
						boolean var4 = false;
						try {
							if (this.anIntArray82[var3] == this.anInt184 && this.anIntArray37[var3] == this.anInt301) {
								if (!this.method139(this.anInt177)) {
									var4 = true;
								}
							} else {
								Class1_Sub3_Sub3 var5 = Class43.method562((byte) -16, this.anIntArray37[var3], this.anIntArray82[var3]);
								if (System.currentTimeMillis() + (long) (var5.anInt561 / 22) > this.aLong7 + (long) (this.anInt198 / 22)) {
									this.anInt198 = var5.anInt561;
									this.aLong7 = System.currentTimeMillis();
									if (this.method138(var5.aByteArray7, var5.anInt561, 0)) {
										this.anInt184 = this.anIntArray82[var3];
										this.anInt301 = this.anIntArray37[var3];
									} else {
										var4 = true;
									}
								}
							}
						} catch (Exception var10) {
						}
						if (var4 && this.anIntArray45[var3] != -5) {
							this.anIntArray45[var3] = -5;
						} else {
							--this.anInt286;
							for (var13 = var3; var13 < this.anInt286; ++var13) {
								this.anIntArray82[var13] = this.anIntArray82[var13 + 1];
								this.anIntArray37[var13] = this.anIntArray37[var13 + 1];
								this.anIntArray45[var13] = this.anIntArray45[var13 + 1];
							}
							--var3;
						}
					} else {
						var10002 = this.anIntArray45[var3]--;
					}
				}
				if (this.anInt157 > 0) {
					this.anInt157 -= 20;
					if (this.anInt157 < 0) {
						this.anInt157 = 0;
					}
					if (this.anInt157 == 0 && this.aBoolean42 && !aBoolean53) {
						this.method75(false, this.anInt321, this.aString17, this.anInt343);
					}
				}
				Class1_Sub3_Sub3 var12 = Class8.method210(-809);
				if (var12 != null) {
					this.aClass1_Sub3_Sub3_6.method380((byte) -34, 81);
					this.aClass1_Sub3_Sub3_6.method382(var12.anInt561);
					this.aClass1_Sub3_Sub3_6.method389(var12.aByteArray7, var12.anInt561, 0, (byte) -106);
					var12.method379((byte) 8);
				}
				++this.anInt180;
				if (this.anInt180 > 750) {
					this.method182(false);
				}
				this.method193(true);
				this.method123(true);
				this.method186(this.aByte17);
				this.method105(this.anInt174);
				if ((super.anIntArray28[1] == 1 || super.anIntArray28[2] == 1 || super.anIntArray28[3] == 1 || super.anIntArray28[4] == 1) && this.anInt245++ > 5) {
					this.anInt245 = 0;
					this.aClass1_Sub3_Sub3_6.method380((byte) -34, 189);
					this.aClass1_Sub3_Sub3_6.method382(this.anInt199);
					this.aClass1_Sub3_Sub3_6.method382(this.anInt200);
					this.aClass1_Sub3_Sub3_6.method381(this.anInt308);
					this.aClass1_Sub3_Sub3_6.method381(this.anInt249);
				}
				++this.anInt270;
				if (this.anInt156 != 0) {
					this.anInt155 += 20;
					if (this.anInt155 >= 400) {
						this.anInt156 = 0;
					}
				}
				if (this.anInt260 != 0) {
					++this.anInt257;
					if (this.anInt257 >= 15) {
						if (this.anInt260 == 2) {
							this.aBoolean59 = true;
						}
						if (this.anInt260 == 3) {
							this.aBoolean60 = true;
						}
						this.anInt260 = 0;
					}
				}
				int var6;
				if (this.anInt216 != 0) {
					++this.anInt247;
					if (super.anInt135 > this.anInt217 + 5 || super.anInt135 < this.anInt217 - 5 || super.anInt136 > this.anInt218 + 5 || super.anInt136 < this.anInt218 - 5) {
						this.aBoolean58 = true;
					}
					if (super.anInt134 == 0) {
						if (this.anInt216 == 2) {
							this.aBoolean59 = true;
						}
						if (this.anInt216 == 3) {
							this.aBoolean60 = true;
						}
						this.anInt216 = 0;
						if (this.aBoolean58 && this.anInt247 >= 5) {
							this.anInt311 = -1;
							this.method143(26);
							if (this.anInt311 == this.anInt214 && this.anInt310 != this.anInt215) {
								Class15 var14 = Class15.aClass15Array1[this.anInt214];
								var6 = var14.anIntArray149[this.anInt310];
								var14.anIntArray149[this.anInt310] = var14.anIntArray149[this.anInt215];
								var14.anIntArray149[this.anInt215] = var6;
								int var15 = var14.anIntArray150[this.anInt310];
								var14.anIntArray150[this.anInt310] = var14.anIntArray150[this.anInt215];
								var14.anIntArray150[this.anInt215] = var15;
								this.aClass1_Sub3_Sub3_6.method380((byte) -34, 159);
								this.aClass1_Sub3_Sub3_6.method382(this.anInt214);
								this.aClass1_Sub3_Sub3_6.method382(this.anInt215);
								this.aClass1_Sub3_Sub3_6.method382(this.anInt310);
							}
						} else if ((this.anInt196 == 1 || this.method131(145, this.anInt304 - 1)) && this.anInt304 > 2) {
							this.method154(-386);
						} else if (this.anInt304 > 0) {
							this.method132(6412, this.anInt304 - 1);
						}
						this.anInt257 = 10;
						super.anInt137 = 0;
					}
				}
				++anInt279;
				if (anInt279 > 127) {
					anInt279 = 0;
					this.aClass1_Sub3_Sub3_6.method380((byte) -34, 215);
					this.aClass1_Sub3_Sub3_6.method384(4991788);
				}
				if (Class33.anInt714 != -1) {
					var13 = Class33.anInt714;
					var6 = Class33.anInt715;
					boolean var7 = this.method168(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 0, true, var13, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 0, 0, var6, 0, 0, 0);
					Class33.anInt714 = -1;
					if (var7) {
						this.anInt153 = super.anInt138;
						this.anInt154 = super.anInt139;
						this.anInt156 = 1;
						this.anInt155 = 0;
					}
				}
				if (super.anInt137 == 1 && this.aString8 != null) {
					this.aString8 = null;
					this.aBoolean60 = true;
					super.anInt137 = 0;
				}
				this.method177((byte) 3);
				this.method176((byte) 7);
				this.method179(this.anInt333);
				this.method91(0);
				if (super.anInt134 == 1 || super.anInt137 == 1) {
					++this.anInt253;
				}
				if (this.anInt307 == 2) {
					this.method146(0);
				}
				if (this.anInt307 == 2 && this.aBoolean61) {
					this.method178(this.aByte11);
				}
				for (var13 = 0; var13 < 5; ++var13) {
					var10002 = this.anIntArray68[var13]++;
				}
				this.method96(7);
				++super.anInt133;
				if (super.anInt133 > 4500) {
					this.anInt182 = 250;
					super.anInt133 -= 500;
					this.aClass1_Sub3_Sub3_6.method380((byte) -34, 70);
				}
				++this.anInt183;
				if (this.anInt183 > 500) {
					this.anInt183 = 0;
					var6 = (int) (Math.random() * 8.0D);
					if ((var6 & 1) == 1) {
						this.anInt327 += this.anInt328;
					}
					if ((var6 & 2) == 2) {
						this.anInt331 += this.anInt332;
					}
					if ((var6 & 4) == 4) {
						this.anInt334 += this.anInt335;
					}
				}
				if (this.anInt327 < -50) {
					this.anInt328 = 2;
				}
				if (this.anInt327 > 50) {
					this.anInt328 = -2;
				}
				if (this.anInt331 < -55) {
					this.anInt332 = 2;
				}
				if (this.anInt331 > 55) {
					this.anInt332 = -2;
				}
				if (this.anInt334 < -40) {
					this.anInt335 = 1;
				}
				if (this.anInt334 > 40) {
					this.anInt335 = -1;
				}
				++this.anInt163;
				if (this.anInt163 > 500) {
					this.anInt163 = 0;
					var6 = (int) (Math.random() * 8.0D);
					if ((var6 & 1) == 1) {
						this.anInt308 += this.anInt309;
					}
					if ((var6 & 2) == 2) {
						this.anInt249 += this.anInt250;
					}
				}
				if (this.anInt308 < -60) {
					this.anInt309 = 2;
				}
				if (this.anInt308 > 60) {
					this.anInt309 = -2;
				}
				if (this.anInt249 < -20) {
					this.anInt250 = 1;
				}
				if (this.anInt249 > 10) {
					this.anInt250 = -1;
				}
				++anInt313;
				if (anInt313 > 110) {
					anInt313 = 0;
					this.aClass1_Sub3_Sub3_6.method380((byte) -34, 236);
					this.aClass1_Sub3_Sub3_6.method385(0);
				}
				++this.anInt181;
				if (this.anInt181 > 50) {
					this.aClass1_Sub3_Sub3_6.method380((byte) -34, 108);
				}
				try {
					if (this.aClass6_1 != null && this.aClass1_Sub3_Sub3_6.anInt561 > 0) {
						this.aClass6_1.method205(this.aClass1_Sub3_Sub3_6.aByteArray7, this.aClass1_Sub3_Sub3_6.anInt561, true, 0);
						this.aClass1_Sub3_Sub3_6.anInt561 = 0;
						this.anInt181 = 0;
					}
				} catch (IOException var8) {
					this.method182(false);
				} catch (Exception var9) {
					this.method119(-780);
				}
			}
		} catch (RuntimeException var11) {
			signlink.reporterror("43736, " + arg0 + ", " + var11.toString());
			throw new RuntimeException();
		}
	}

	public final void method165(boolean arg0) {
		try {
			if (this.anInt304 >= 2 || this.anInt281 != 0 || this.anInt291 != 0) {
				String var2;
				if (this.anInt281 == 1 && this.anInt304 < 2) {
					var2 = "Use " + this.aString10 + " with...";
				} else if (this.anInt291 == 1 && this.anInt304 < 2) {
					var2 = this.aString11 + "...";
				} else {
					var2 = this.aStringArray5[this.anInt304 - 1];
				}
				if (this.anInt304 > 2) {
					var2 = var2 + "@whi@ / " + (this.anInt304 - 2) + " more options";
				}
				this.aClass1_Sub3_Sub2_Sub4_3.method368(anInt266 / 1000, true, (byte) -121, 15, 16777215, var2, 4);
				if (!arg0) {
					this.anInt179 = -1;
				}
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("32785, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public final void method166(byte arg0) {
		try {
			if (arg0 != this.aByte8) {
				this.anInt194 = -357;
			}
			for (Class1_Sub1_Sub2 var2 = (Class1_Sub1_Sub2) this.aClass28_5.method456(); var2 != null; var2 = (Class1_Sub1_Sub2) this.aClass28_5.method458(551)) {
				if (var2.anInt61 == this.anInt231 && !var2.aBoolean17) {
					if (anInt266 >= var2.anInt60) {
						var2.method29(this.anInt270, 0);
						if (var2.aBoolean17) {
							var2.method567();
						} else {
							this.aClass33_1.method478(-44713, var2.anInt63, 60, 0, var2.anInt62, -1, false, (Class1_Sub3_Sub1) null, var2, var2.anInt64, var2.anInt61);
						}
					}
				} else {
					var2.method567();
				}
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("59878, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		} else {
			try {
				if (super.aFrame_Sub1_2 != null) {
					return new URL("http://127.0.0.1:" + (80 + anInt236));
				}
			} catch (Exception var1) {
			}
			return super.getCodeBase();
		}
	}

	public static final void method167(int arg0) {
		try {
			Class33.aBoolean143 = false;
			Class1_Sub3_Sub2_Sub1.aBoolean96 = false;
			if (arg0 == 9) {
				aBoolean53 = false;
				Class4.aBoolean23 = false;
			}
		} catch (RuntimeException var2) {
			signlink.reporterror("39707, " + arg0 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	public final boolean method168(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
		try {
			byte var13 = 104;
			byte var14 = 104;
			int var16;
			for (int var15 = 0; var15 < var13; ++var15) {
				for (var16 = 0; var16 < var14; ++var16) {
					this.anIntArrayArray5[var15][var16] = 0;
					this.anIntArrayArray2[var15][var16] = 99999999;
				}
			}
			var16 = arg0;
			int var17 = arg4;
			this.anIntArrayArray5[arg0][arg4] = 99;
			this.anIntArrayArray2[arg0][arg4] = 0;
			byte var18 = 0;
			int var19 = 0;
			this.anIntArray66[var18] = arg0;
			int var29 = var18 + 1;
			this.anIntArray67[var18] = arg4;
			boolean var20 = false;
			int var21 = this.anIntArray66.length;
			int[][] var22 = this.aClass9Array1[this.anInt231].anIntArrayArray10;
			int var23;
			while (var19 != var29) {
				var16 = this.anIntArray66[var19];
				var17 = this.anIntArray67[var19];
				var19 = (var19 + 1) % var21;
				if (var16 == arg3 && var17 == arg8) {
					var20 = true;
					break;
				}
				if (arg10 != 0) {
					if ((arg10 < 5 || arg10 == 10) && this.aClass9Array1[this.anInt231].method258(-7517, arg9, arg8, arg10 - 1, var17, arg3, var16)) {
						var20 = true;
						break;
					}
					if (arg10 < 10 && this.aClass9Array1[this.anInt231].method259(arg9, arg10 - 1, this.anInt294, var16, arg3, var17, arg8)) {
						var20 = true;
						break;
					}
				}
				if (arg1 != 0 && arg7 != 0 && this.aClass9Array1[this.anInt231].method260(var17, arg7, var16, arg3, arg11, arg8, arg1, 168)) {
					var20 = true;
					break;
				}
				var23 = this.anIntArrayArray2[var16][var17] + 1;
				if (var16 > 0 && this.anIntArrayArray5[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 2621704) == 0) {
					this.anIntArray66[var29] = var16 - 1;
					this.anIntArray67[var29] = var17;
					var29 = (var29 + 1) % var21;
					this.anIntArrayArray5[var16 - 1][var17] = 2;
					this.anIntArrayArray2[var16 - 1][var17] = var23;
				}
				if (var16 < var13 - 1 && this.anIntArrayArray5[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 2621824) == 0) {
					this.anIntArray66[var29] = var16 + 1;
					this.anIntArray67[var29] = var17;
					var29 = (var29 + 1) % var21;
					this.anIntArrayArray5[var16 + 1][var17] = 8;
					this.anIntArrayArray2[var16 + 1][var17] = var23;
				}
				if (var17 > 0 && this.anIntArrayArray5[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
					this.anIntArray66[var29] = var16;
					this.anIntArray67[var29] = var17 - 1;
					var29 = (var29 + 1) % var21;
					this.anIntArrayArray5[var16][var17 - 1] = 1;
					this.anIntArrayArray2[var16][var17 - 1] = var23;
				}
				if (var17 < var14 - 1 && this.anIntArrayArray5[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
					this.anIntArray66[var29] = var16;
					this.anIntArray67[var29] = var17 + 1;
					var29 = (var29 + 1) % var21;
					this.anIntArrayArray5[var16][var17 + 1] = 4;
					this.anIntArrayArray2[var16][var17 + 1] = var23;
				}
				if (var16 > 0 && var17 > 0 && this.anIntArrayArray5[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 2621710) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
					this.anIntArray66[var29] = var16 - 1;
					this.anIntArray67[var29] = var17 - 1;
					var29 = (var29 + 1) % var21;
					this.anIntArrayArray5[var16 - 1][var17 - 1] = 3;
					this.anIntArrayArray2[var16 - 1][var17 - 1] = var23;
				}
				if (var16 < var13 - 1 && var17 > 0 && this.anIntArrayArray5[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 2621827) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
					this.anIntArray66[var29] = var16 + 1;
					this.anIntArray67[var29] = var17 - 1;
					var29 = (var29 + 1) % var21;
					this.anIntArrayArray5[var16 + 1][var17 - 1] = 9;
					this.anIntArrayArray2[var16 + 1][var17 - 1] = var23;
				}
				if (var16 > 0 && var17 < var14 - 1 && this.anIntArrayArray5[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 2621752) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
					this.anIntArray66[var29] = var16 - 1;
					this.anIntArray67[var29] = var17 + 1;
					var29 = (var29 + 1) % var21;
					this.anIntArrayArray5[var16 - 1][var17 + 1] = 6;
					this.anIntArrayArray2[var16 - 1][var17 + 1] = var23;
				}
				if (var16 < var13 - 1 && var17 < var14 - 1 && this.anIntArrayArray5[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 2621920) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
					this.anIntArray66[var29] = var16 + 1;
					this.anIntArray67[var29] = var17 + 1;
					var29 = (var29 + 1) % var21;
					this.anIntArrayArray5[var16 + 1][var17 + 1] = 12;
					this.anIntArrayArray2[var16 + 1][var17 + 1] = var23;
				}
			}
			this.anInt277 = 0;
			int var24;
			int var25;
			int var26;
			if (!var20) {
				if (arg2) {
					var23 = 100;
					for (var24 = 1; var24 < 2; ++var24) {
						for (var25 = arg3 - var24; var25 <= arg3 + var24; ++var25) {
							for (var26 = arg8 - var24; var26 <= arg8 + var24; ++var26) {
								if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.anIntArrayArray2[var25][var26] < var23) {
									var23 = this.anIntArrayArray2[var25][var26];
									var16 = var25;
									var17 = var26;
									this.anInt277 = 1;
									var20 = true;
								}
							}
						}
						if (var20) {
							break;
						}
					}
				}
				if (!var20) {
					return false;
				}
			}
			byte var30 = 0;
			this.anIntArray66[var30] = var16;
			if (arg5 != 0) {
				this.anInt179 = this.aClass1_Sub3_Sub3_5.method391();
			}
			var19 = var30 + 1;
			this.anIntArray67[var30] = var17;
			var23 = var24 = this.anIntArrayArray5[var16][var17];
			while (var16 != arg0 || var17 != arg4) {
				if (var23 != var24) {
					var24 = var23;
					this.anIntArray66[var19] = var16;
					this.anIntArray67[var19++] = var17;
				}
				if ((var23 & 2) != 0) {
					++var16;
				} else if ((var23 & 8) != 0) {
					--var16;
				}
				if ((var23 & 1) != 0) {
					++var17;
				} else if ((var23 & 4) != 0) {
					--var17;
				}
				var23 = this.anIntArrayArray5[var16][var17];
			}
			if (var19 <= 0) {
				if (arg6 == 1) {
					return false;
				} else {
					return true;
				}
			} else {
				var21 = var19;
				if (var19 > 25) {
					var21 = 25;
				}
				--var19;
				var25 = this.anIntArray66[var19];
				var26 = this.anIntArray67[var19];
				if (arg6 == 0) {
					this.aClass1_Sub3_Sub3_6.method380((byte) -34, 181);
					this.aClass1_Sub3_Sub3_6.method381(var21 + var21 + 3);
				}
				if (arg6 == 1) {
					this.aClass1_Sub3_Sub3_6.method380((byte) -34, 165);
					this.aClass1_Sub3_Sub3_6.method381(var21 + var21 + 3 + 14);
				}
				if (arg6 == 2) {
					this.aClass1_Sub3_Sub3_6.method380((byte) -34, 93);
					this.aClass1_Sub3_Sub3_6.method381(var21 + var21 + 3);
				}
				if (super.anIntArray28[5] == 1) {
					this.aClass1_Sub3_Sub3_6.method381(1);
				} else {
					this.aClass1_Sub3_Sub3_6.method381(0);
				}
				this.aClass1_Sub3_Sub3_6.method382(var25 + this.anInt169);
				this.aClass1_Sub3_Sub3_6.method382(var26 + this.anInt170);
				this.anInt296 = this.anIntArray66[0];
				this.anInt297 = this.anIntArray67[0];
				for (int var27 = 1; var27 < var21; ++var27) {
					--var19;
					this.aClass1_Sub3_Sub3_6.method381(this.anIntArray66[var19] - var25);
					this.aClass1_Sub3_Sub3_6.method381(this.anIntArray67[var19] - var26);
				}
				return true;
			}
		} catch (RuntimeException var28) {
			signlink.reporterror("92875, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + var28.toString());
			throw new RuntimeException();
		}
	}

	private static final String method169(boolean arg0, int arg1) {
		try {
			if (!arg0) {
				anInt238 = 434;
			}
			if (arg1 < 100000) {
				return String.valueOf(arg1);
			} else {
				return arg1 < 10000000 ? arg1 / 1000 + "K" : arg1 / 1000000 + "M";
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("32689, " + arg0 + ", " + arg1 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	private final void method170(Class1_Sub3_Sub3 arg0, int arg1, int arg2) {
		try {
			this.anInt255 = 0;
			this.anInt206 = 0;
			this.method195(11522, arg1, arg0);
			this.method110(arg1, arg0, 0);
			this.method118(2, arg1, arg0);
			this.method121(true, arg1, arg0);
			int var5;
			for (int var4 = 0; var4 < this.anInt255; ++var4) {
				var5 = this.anIntArray60[var4];
				if (this.aClass1_Sub1_Sub3_Sub2Array1[var5].anInt932 != anInt266) {
					this.aClass1_Sub1_Sub3_Sub2Array1[var5] = null;
				}
			}
			if (arg2 > 0) {
				if (arg0.anInt561 != arg1) {
					signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.anInt561 + " psize:" + arg1);
					throw new RuntimeException("eek");
				} else {
					for (var5 = 0; var5 < this.anInt205; ++var5) {
						if (this.aClass1_Sub1_Sub3_Sub2Array1[this.anIntArray39[var5]] == null) {
							signlink.reporterror(this.aString13 + " null entry in pl list - pos:" + var5 + " size:" + this.anInt205);
							throw new RuntimeException("eek");
						}
					}
				}
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("9307, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	public final boolean method171(int arg0, int arg1, int arg2) {
		try {
			boolean var4 = false;
			Class15 var5 = Class15.aClass15Array1[arg0];
			for (int var6 = 0; var6 < var5.anIntArray153.length && var5.anIntArray153[var6] != -1; ++var6) {
				Class15 var7 = Class15.aClass15Array1[var5.anIntArray153[var6]];
				if (var7.anInt472 == 1) {
					var4 |= this.method171(var7.anInt470, arg1, 623);
				}
				if (var7.anInt472 == 6 && (var7.anInt488 != -1 || var7.anInt489 != -1)) {
					boolean var8 = this.method175(var7, 65);
					int var9;
					if (var8) {
						var9 = var7.anInt489;
					} else {
						var9 = var7.anInt488;
					}
					if (var9 != -1) {
						Class19 var10 = Class19.aClass19Array1[var9];
						var7.anInt469 += arg1;
						while (var7.anInt469 > var10.anIntArray188[var7.anInt468]) {
							var7.anInt469 -= var10.anIntArray188[var7.anInt468] + 1;
							++var7.anInt468;
							if (var7.anInt468 >= var10.anInt543) {
								var7.anInt468 -= var10.anInt544;
								if (var7.anInt468 < 0 || var7.anInt468 >= var10.anInt543) {
									var7.anInt468 = 0;
								}
							}
							var4 = true;
						}
					}
				}
			}
			if (arg2 <= 0) {
				throw new NullPointerException();
			} else {
				return var4;
			}
		} catch (RuntimeException var11) {
			signlink.reporterror("31675, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var11.toString());
			throw new RuntimeException();
		}
	}

	public final void method172(int arg0, String arg1, byte arg2, String arg3) {
		try {
			if (arg0 == 0 && this.anInt289 != -1) {
				this.aString8 = arg1;
				super.anInt137 = 0;
			}
			if (this.anInt280 == -1) {
				this.aBoolean60 = true;
			}
			for (int var5 = 99; var5 > 0; --var5) {
				this.anIntArray49[var5] = this.anIntArray49[var5 - 1];
				this.aStringArray6[var5] = this.aStringArray6[var5 - 1];
				this.aStringArray7[var5] = this.aStringArray7[var5 - 1];
			}
			this.anIntArray49[0] = arg0;
			this.aStringArray6[0] = arg3;
			if (arg2 != 4) {
				this.aBoolean55 = !this.aBoolean55;
			}
			this.aStringArray7[0] = arg1;
		} catch (RuntimeException var6) {
			signlink.reporterror("40788, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	public final void method173(int arg0, int arg1) {
		try {
			Class15 var3 = Class15.aClass15Array1[arg1];
			for (int var4 = 0; var4 < var3.anIntArray153.length && var3.anIntArray153[var4] != -1; ++var4) {
				Class15 var5 = Class15.aClass15Array1[var3.anIntArray153[var4]];
				if (var5.anInt472 == 1) {
					this.method173(-321, var5.anInt470);
				}
				var5.anInt468 = 0;
				var5.anInt469 = 0;
			}
			if (arg0 >= 0) {
				this.aClass28ArrayArrayArray1 = null;
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("24441, " + arg0 + ", " + arg1 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	public final void method174(int arg0, long arg1) {
		try {
			int var4;
			if (arg0 != 43808) {
				for (var4 = 1; var4 > 0; ++var4) {
				}
			}
			if (arg1 != 0L) {
				for (var4 = 0; var4 < this.anInt312; ++var4) {
					if (this.aLongArray4[var4] == arg1) {
						--this.anInt312;
						this.aBoolean59 = true;
						for (int var5 = var4; var5 < this.anInt312; ++var5) {
							this.aStringArray9[var5] = this.aStringArray9[var5 + 1];
							this.anIntArray34[var5] = this.anIntArray34[var5 + 1];
							this.aLongArray4[var5] = this.aLongArray4[var5 + 1];
						}
						this.aClass1_Sub3_Sub3_6.method380((byte) -34, 11);
						this.aClass1_Sub3_Sub3_6.method387(true, arg1);
						return;
					}
				}
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("5387, " + arg0 + ", " + arg1 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	public final boolean method175(Class15 arg0, int arg1) {
		try {
			if (arg0.anIntArray151 == null) {
				return false;
			} else {
				for (int var3 = 0; var3 < arg0.anIntArray151.length; ++var3) {
					int var4 = this.method187(arg0, false, var3);
					int var5 = arg0.anIntArray152[var3];
					if (arg0.anIntArray151[var3] == 2) {
						if (var4 >= var5) {
							return false;
						}
					} else if (arg0.anIntArray151[var3] == 3) {
						if (var4 <= var5) {
							return false;
						}
					} else if (arg0.anIntArray151[var3] == 4) {
						if (var4 == var5) {
							return false;
						}
					} else if (var4 != var5) {
						return false;
					}
				}
				if (arg1 <= 0) {
					this.aClass1_Sub3_Sub3_6.method381(82);
				}
				return true;
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("59816, " + arg0 + ", " + arg1 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	public final void method176(byte arg0) {
		try {
			if (arg0 != this.aByte15) {
				this.aClass28ArrayArrayArray1 = null;
			}
			if (super.anInt137 == 1) {
				int var2 = super.anInt138 - 21 - 561;
				int var3 = super.anInt139 - 9 - 5;
				if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
					var2 -= 73;
					var3 -= 75;
					int var4 = this.anInt200 + this.anInt308 & 2047;
					int var5 = Class1_Sub3_Sub2_Sub1.anIntArray137[var4];
					int var6 = Class1_Sub3_Sub2_Sub1.anIntArray138[var4];
					int var13 = var5 * (this.anInt249 + 256) >> 8;
					int var14 = var6 * (this.anInt249 + 256) >> 8;
					int var7 = var3 * var13 + var2 * var14 >> 11;
					int var8 = var3 * var14 - var2 * var13 >> 11;
					int var9 = this.aClass1_Sub1_Sub3_Sub2_1.anInt890 + var7 >> 7;
					int var10 = this.aClass1_Sub1_Sub3_Sub2_1.anInt891 - var8 >> 7;
					boolean var11 = this.method168(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], 0, true, var9, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 0, 1, 0, var10, 0, 0, 0);
					if (var11) {
						this.aClass1_Sub3_Sub3_6.method381(var2);
						this.aClass1_Sub3_Sub3_6.method381(var3);
						this.aClass1_Sub3_Sub3_6.method382(this.anInt200);
						this.aClass1_Sub3_Sub3_6.method381(57);
						this.aClass1_Sub3_Sub3_6.method381(this.anInt308);
						this.aClass1_Sub3_Sub3_6.method381(this.anInt249);
						this.aClass1_Sub3_Sub3_6.method381(89);
						this.aClass1_Sub3_Sub3_6.method382(this.aClass1_Sub1_Sub3_Sub2_1.anInt890);
						this.aClass1_Sub3_Sub3_6.method382(this.aClass1_Sub1_Sub3_Sub2_1.anInt891);
						this.aClass1_Sub3_Sub3_6.method381(this.anInt277);
						this.aClass1_Sub3_Sub3_6.method381(63);
						return;
					}
				}
			}
		} catch (RuntimeException var12) {
			signlink.reporterror("6474, " + arg0 + ", " + var12.toString());
			throw new RuntimeException();
		}
	}

	public final void method177(byte arg0) {
		try {
			if (arg0 != 3) {
				this.anInt179 = this.aClass1_Sub3_Sub3_5.method391();
			}
			if (this.anInt216 == 0) {
				int var2 = super.anInt137;
				if (this.anInt291 == 1 && super.anInt138 >= 520 && super.anInt139 >= 165 && super.anInt138 <= 788 && super.anInt139 <= 230) {
					var2 = 0;
				}
				int var3;
				int var4;
				int var5;
				if (this.aBoolean50) {
					if (var2 != 1) {
						var3 = super.anInt135;
						var4 = super.anInt136;
						if (this.anInt337 == 0) {
							var3 -= 8;
							var4 -= 11;
						}
						if (this.anInt337 == 1) {
							var3 -= 562;
							var4 -= 231;
						}
						if (this.anInt337 == 2) {
							var3 -= 22;
							var4 -= 375;
						}
						if (var3 < this.anInt338 - 10 || var3 > this.anInt338 + this.anInt340 + 10 || var4 < this.anInt339 - 10 || var4 > this.anInt339 + this.anInt341 + 10) {
							this.aBoolean50 = false;
							if (this.anInt337 == 1) {
								this.aBoolean59 = true;
							}
							if (this.anInt337 == 2) {
								this.aBoolean60 = true;
							}
						}
					}
					if (var2 == 1) {
						var3 = this.anInt338;
						var4 = this.anInt339;
						var5 = this.anInt340;
						int var6 = super.anInt138;
						int var7 = super.anInt139;
						if (this.anInt337 == 0) {
							var6 -= 8;
							var7 -= 11;
						}
						if (this.anInt337 == 1) {
							var6 -= 562;
							var7 -= 231;
						}
						if (this.anInt337 == 2) {
							var6 -= 22;
							var7 -= 375;
						}
						int var8 = -1;
						for (int var9 = 0; var9 < this.anInt304; ++var9) {
							int var10 = var4 + 31 + (this.anInt304 - 1 - var9) * 15;
							if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
								var8 = var9;
							}
						}
						if (var8 != -1) {
							this.method132(6412, var8);
						}
						this.aBoolean50 = false;
						if (this.anInt337 == 1) {
							this.aBoolean59 = true;
						}
						if (this.anInt337 == 2) {
							this.aBoolean60 = true;
							return;
						}
					}
				} else {
					if (var2 == 1 && this.anInt304 > 0) {
						var3 = this.anIntArray86[this.anInt304 - 1];
						if (var3 == 602 || var3 == 596 || var3 == 22 || var3 == 892 || var3 == 415 || var3 == 405 || var3 == 38 || var3 == 422 || var3 == 478 || var3 == 347 || var3 == 188) {
							var4 = this.anIntArray84[this.anInt304 - 1];
							var5 = this.anIntArray85[this.anInt304 - 1];
							Class15 var12 = Class15.aClass15Array1[var5];
							if (var12.aBoolean108) {
								this.aBoolean58 = false;
								this.anInt247 = 0;
								this.anInt214 = var5;
								this.anInt215 = var4;
								this.anInt216 = 2;
								this.anInt217 = super.anInt138;
								this.anInt218 = super.anInt139;
								if (Class15.aClass15Array1[var5].anInt471 == this.anInt271) {
									this.anInt216 = 1;
								}
								if (Class15.aClass15Array1[var5].anInt471 == this.anInt280) {
									this.anInt216 = 3;
								}
								return;
							}
						}
					}
					if (var2 == 1 && (this.anInt196 == 1 || this.method131(145, this.anInt304 - 1)) && this.anInt304 > 2) {
						var2 = 2;
					}
					if (var2 == 1 && this.anInt304 > 0) {
						this.method132(6412, this.anInt304 - 1);
					}
					if (var2 != 2 || this.anInt304 <= 0) {
						return;
					}
					this.method154(-386);
				}
			}
		} catch (RuntimeException var11) {
			signlink.reporterror("37713, " + arg0 + ", " + var11.toString());
			throw new RuntimeException();
		}
	}

	public final void method178(byte arg0) {
		try {
			int var2 = this.anInt146 * 128 + 64;
			int var3 = this.anInt147 * 128 + 64;
			int var4 = this.method94(this.anInt231, this.anInt146, (byte) 5, this.anInt147) - this.anInt148;
			if (this.anInt322 < var2) {
				this.anInt322 += this.anInt149 + (var2 - this.anInt322) * this.anInt150 / 1000;
				if (this.anInt322 > var2) {
					this.anInt322 = var2;
				}
			}
			if (this.anInt322 > var2) {
				this.anInt322 -= this.anInt149 + (this.anInt322 - var2) * this.anInt150 / 1000;
				if (this.anInt322 < var2) {
					this.anInt322 = var2;
				}
			}
			if (this.anInt323 < var4) {
				this.anInt323 += this.anInt149 + (var4 - this.anInt323) * this.anInt150 / 1000;
				if (this.anInt323 > var4) {
					this.anInt323 = var4;
				}
			}
			if (this.anInt323 > var4) {
				this.anInt323 -= this.anInt149 + (this.anInt323 - var4) * this.anInt150 / 1000;
				if (this.anInt323 < var4) {
					this.anInt323 = var4;
				}
			}
			if (this.anInt324 < var3) {
				this.anInt324 += this.anInt149 + (var3 - this.anInt324) * this.anInt150 / 1000;
				if (this.anInt324 > var3) {
					this.anInt324 = var3;
				}
			}
			if (this.anInt324 > var3) {
				this.anInt324 -= this.anInt149 + (this.anInt324 - var3) * this.anInt150 / 1000;
				if (this.anInt324 < var3) {
					this.anInt324 = var3;
				}
			}
			var2 = this.anInt261 * 128 + 64;
			var3 = this.anInt262 * 128 + 64;
			var4 = this.method94(this.anInt231, this.anInt261, (byte) 5, this.anInt262) - this.anInt263;
			int var5 = var2 - this.anInt322;
			int var6 = var4 - this.anInt323;
			int var7 = var3 - this.anInt324;
			int var8 = (int) Math.sqrt((double) (var5 * var5 + var7 * var7));
			int var9 = (int) (Math.atan2((double) var6, (double) var8) * 325.949D) & 2047;
			int var10 = (int) (Math.atan2((double) var5, (double) var7) * -325.949D) & 2047;
			if (arg0 == 2) {
				if (var9 < 128) {
					var9 = 128;
				}
				if (var9 > 383) {
					var9 = 383;
				}
				if (this.anInt325 < var9) {
					this.anInt325 += this.anInt264 + (var9 - this.anInt325) * this.anInt265 / 1000;
					if (this.anInt325 > var9) {
						this.anInt325 = var9;
					}
				}
				if (this.anInt325 > var9) {
					this.anInt325 -= this.anInt264 + (this.anInt325 - var9) * this.anInt265 / 1000;
					if (this.anInt325 < var9) {
						this.anInt325 = var9;
					}
				}
				int var11 = var10 - this.anInt326;
				if (var11 > 1024) {
					var11 -= 2048;
				}
				if (var11 < -1024) {
					var11 += 2048;
				}
				if (var11 > 0) {
					this.anInt326 += this.anInt264 + var11 * this.anInt265 / 1000;
					this.anInt326 &= 2047;
				}
				if (var11 < 0) {
					this.anInt326 -= this.anInt264 + -var11 * this.anInt265 / 1000;
					this.anInt326 &= 2047;
				}
				int var12 = var10 - this.anInt326;
				if (var12 > 1024) {
					var12 -= 2048;
				}
				if (var12 < -1024) {
					var12 += 2048;
				}
				if (var12 < 0 && var11 > 0 || var12 > 0 && var11 < 0) {
					this.anInt326 = var10;
				}
			}
		} catch (RuntimeException var13) {
			signlink.reporterror("52951, " + arg0 + ", " + var13.toString());
			throw new RuntimeException();
		}
	}

	public final void method179(int arg0) {
		try {
			if (arg0 != 29286) {
				this.anInt174 = this.aClass38_1.method532();
			}
			if (super.anInt137 == 1) {
				if (super.anInt138 >= 549 && super.anInt138 <= 583 && super.anInt139 >= 195 && super.anInt139 < 231 && this.anIntArray46[0] != -1) {
					this.aBoolean59 = true;
					this.anInt166 = 0;
					this.aBoolean68 = true;
				}
				if (super.anInt138 >= 579 && super.anInt138 <= 609 && super.anInt139 >= 194 && super.anInt139 < 231 && this.anIntArray46[1] != -1) {
					this.aBoolean59 = true;
					this.anInt166 = 1;
					this.aBoolean68 = true;
				}
				if (super.anInt138 >= 607 && super.anInt138 <= 637 && super.anInt139 >= 194 && super.anInt139 < 231 && this.anIntArray46[2] != -1) {
					this.aBoolean59 = true;
					this.anInt166 = 2;
					this.aBoolean68 = true;
				}
				if (super.anInt138 >= 635 && super.anInt138 <= 679 && super.anInt139 >= 194 && super.anInt139 < 229 && this.anIntArray46[3] != -1) {
					this.aBoolean59 = true;
					this.anInt166 = 3;
					this.aBoolean68 = true;
				}
				if (super.anInt138 >= 676 && super.anInt138 <= 706 && super.anInt139 >= 194 && super.anInt139 < 231 && this.anIntArray46[4] != -1) {
					this.aBoolean59 = true;
					this.anInt166 = 4;
					this.aBoolean68 = true;
				}
				if (super.anInt138 >= 704 && super.anInt138 <= 734 && super.anInt139 >= 194 && super.anInt139 < 231 && this.anIntArray46[5] != -1) {
					this.aBoolean59 = true;
					this.anInt166 = 5;
					this.aBoolean68 = true;
				}
				if (super.anInt138 >= 732 && super.anInt138 <= 766 && super.anInt139 >= 195 && super.anInt139 < 231 && this.anIntArray46[6] != -1) {
					this.aBoolean59 = true;
					this.anInt166 = 6;
					this.aBoolean68 = true;
				}
				if (super.anInt138 >= 550 && super.anInt138 <= 584 && super.anInt139 >= 492 && super.anInt139 < 528 && this.anIntArray46[7] != -1) {
					this.aBoolean59 = true;
					this.anInt166 = 7;
					this.aBoolean68 = true;
				}
				if (super.anInt138 >= 582 && super.anInt138 <= 612 && super.anInt139 >= 492 && super.anInt139 < 529 && this.anIntArray46[8] != -1) {
					this.aBoolean59 = true;
					this.anInt166 = 8;
					this.aBoolean68 = true;
				}
				if (super.anInt138 >= 609 && super.anInt138 <= 639 && super.anInt139 >= 492 && super.anInt139 < 529 && this.anIntArray46[9] != -1) {
					this.aBoolean59 = true;
					this.anInt166 = 9;
					this.aBoolean68 = true;
				}
				if (super.anInt138 >= 637 && super.anInt138 <= 681 && super.anInt139 >= 493 && super.anInt139 < 528 && this.anIntArray46[10] != -1) {
					this.aBoolean59 = true;
					this.anInt166 = 10;
					this.aBoolean68 = true;
				}
				if (super.anInt138 >= 679 && super.anInt138 <= 709 && super.anInt139 >= 492 && super.anInt139 < 529 && this.anIntArray46[11] != -1) {
					this.aBoolean59 = true;
					this.anInt166 = 11;
					this.aBoolean68 = true;
				}
				if (super.anInt138 >= 706 && super.anInt138 <= 736 && super.anInt139 >= 492 && super.anInt139 < 529 && this.anIntArray46[12] != -1) {
					this.aBoolean59 = true;
					this.anInt166 = 12;
					this.aBoolean68 = true;
				}
				if (super.anInt138 >= 734 && super.anInt138 <= 768 && super.anInt139 >= 492 && super.anInt139 < 528 && this.anIntArray46[13] != -1) {
					this.aBoolean59 = true;
					this.anInt166 = 13;
					this.aBoolean68 = true;
				}
				++anInt232;
				if (anInt232 > 150) {
					anInt232 = 0;
					this.aClass1_Sub3_Sub3_6.method380((byte) -34, 233);
					this.aClass1_Sub3_Sub3_6.method381(43);
					return;
				}
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("26651, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public final boolean method180(Class15 arg0, byte arg1) {
		try {
			int var3 = arg0.anInt474;
			if (arg1 != this.aByte9) {
				this.anInt294 = this.aClass38_1.method532();
			}
			if (var3 >= 1 && var3 <= 200) {
				if (var3 >= 101) {
					var3 -= 101;
				} else {
					--var3;
				}
				this.aStringArray5[this.anInt304] = "Remove @whi@" + this.aStringArray9[var3];
				this.anIntArray86[this.anInt304] = 557;
				++this.anInt304;
				this.aStringArray5[this.anInt304] = "Message @whi@" + this.aStringArray9[var3];
				this.anIntArray86[this.anInt304] = 679;
				++this.anInt304;
				return true;
			} else if (var3 >= 401 && var3 <= 500) {
				this.aStringArray5[this.anInt304] = "Remove @whi@" + arg0.aString20;
				this.anIntArray86[this.anInt304] = 556;
				++this.anInt304;
				return true;
			} else {
				return false;
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("87437, " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	private final void method181(int arg0, Class1_Sub3_Sub3 arg1, int arg2) {
		try {
			if (arg0 < 0) {
				arg1.method401(223);
				int var4 = arg1.method402(9, 8);
				int var5;
				if (var4 < this.anInt248) {
					for (var5 = var4; var5 < this.anInt248; ++var5) {
						this.anIntArray60[this.anInt255++] = this.anIntArray58[var5];
					}
				}
				if (var4 > this.anInt248) {
					signlink.reporterror(this.aString13 + " Too many npcs");
					throw new RuntimeException("eek");
				} else {
					this.anInt248 = 0;
					for (var5 = 0; var5 < var4; ++var5) {
						int var6 = this.anIntArray58[var5];
						Class1_Sub1_Sub3_Sub1 var7 = this.aClass1_Sub1_Sub3_Sub1Array1[var6];
						int var8 = arg1.method402(9, 1);
						if (var8 == 0) {
							this.anIntArray58[this.anInt248++] = var6;
							var7.anInt932 = anInt266;
						} else {
							int var9 = arg1.method402(9, 2);
							if (var9 == 0) {
								this.anIntArray58[this.anInt248++] = var6;
								var7.anInt932 = anInt266;
								this.anIntArray40[this.anInt206++] = var6;
							} else {
								int var10;
								int var11;
								if (var9 == 1) {
									this.anIntArray58[this.anInt248++] = var6;
									var7.anInt932 = anInt266;
									var10 = arg1.method402(9, 3);
									var7.method570(false, var10, (byte) 6);
									var11 = arg1.method402(9, 1);
									if (var11 == 1) {
										this.anIntArray40[this.anInt206++] = var6;
									}
								} else if (var9 == 2) {
									this.anIntArray58[this.anInt248++] = var6;
									var7.anInt932 = anInt266;
									var10 = arg1.method402(9, 3);
									var7.method570(true, var10, (byte) 6);
									var11 = arg1.method402(9, 3);
									var7.method570(true, var11, (byte) 6);
									int var12 = arg1.method402(9, 1);
									if (var12 == 1) {
										this.anIntArray40[this.anInt206++] = var6;
									}
								} else if (var9 == 3) {
									this.anIntArray60[this.anInt255++] = var6;
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException var13) {
			signlink.reporterror("55760, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var13.toString());
			throw new RuntimeException();
		}
	}

	public final String getParameter(String arg0) {
		return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
	}

	public final void method182(boolean arg0) {
		try {
			if (this.anInt182 > 0) {
				this.method119(-780);
			} else {
				this.aClass32_27.method463((byte) 62);
				if (arg0) {
					this.method67();
				}
				this.aClass1_Sub3_Sub2_Sub4_2.method362(144, (byte) 6, 0, "Connection lost", 257);
				this.aClass1_Sub3_Sub2_Sub4_2.method362(143, (byte) 6, 16777215, "Connection lost", 256);
				this.aClass1_Sub3_Sub2_Sub4_2.method362(159, (byte) 6, 0, "Please wait - attempting to reestablish", 257);
				this.aClass1_Sub3_Sub2_Sub4_2.method362(158, (byte) 6, 16777215, "Please wait - attempting to reestablish", 256);
				this.aClass32_27.method464(11, super.aGraphics2, 8, 5193);
				this.anInt296 = 0;
				Class6 var2 = this.aClass6_1;
				this.aBoolean62 = false;
				this.method159(this.aString13, this.aString14, true);
				if (!this.aBoolean62) {
					this.method119(-780);
				}
				try {
					var2.method201();
				} catch (Exception var3) {
				}
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("55264, " + arg0 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	public final void method183(int arg0, Class1_Sub3_Sub2_Sub3 arg1) {
		try {
			short var3 = 256;
			for (int var4 = 0; var4 < this.anIntArray41.length; ++var4) {
				this.anIntArray41[var4] = 0;
			}
			int var6;
			for (int var5 = 0; var5 < 5000; ++var5) {
				var6 = (int) (Math.random() * 128.0D * (double) var3);
				this.anIntArray41[var6] = (int) (Math.random() * 256.0D);
			}
			int var7;
			int var8;
			int var9;
			for (var6 = 0; var6 < 20; ++var6) {
				for (var7 = 1; var7 < var3 - 1; ++var7) {
					for (var8 = 1; var8 < 127; ++var8) {
						var9 = var8 + (var7 << 7);
						this.anIntArray42[var9] = (this.anIntArray41[var9 - 1] + this.anIntArray41[var9 + 1] + this.anIntArray41[var9 - 128] + this.anIntArray41[var9 + 128]) / 4;
					}
				}
				int[] var14 = this.anIntArray41;
				this.anIntArray41 = this.anIntArray42;
				this.anIntArray42 = var14;
			}
			if (arg0 <= 0) {
				this.aBoolean55 = !this.aBoolean55;
			}
			if (arg1 != null) {
				var7 = 0;
				for (var8 = 0; var8 < arg1.anInt514; ++var8) {
					for (var9 = 0; var9 < arg1.anInt513; ++var9) {
						if (arg1.aByteArray6[var7++] != 0) {
							int var10 = var9 + 16 + arg1.anInt515;
							int var11 = var8 + 16 + arg1.anInt516;
							int var12 = var10 + (var11 << 7);
							this.anIntArray41[var12] = 0;
						}
					}
				}
			}
		} catch (RuntimeException var13) {
			signlink.reporterror("86499, " + arg0 + ", " + arg1 + ", " + var13.toString());
			throw new RuntimeException();
		}
	}

	public final void method184(int arg0, int arg1) {
		Class28 var3 = this.aClass28ArrayArrayArray1[this.anInt231][arg0][arg1];
		if (var3 == null) {
			this.aClass33_1.method493(this.anInt231, arg0, arg1);
		} else {
			int var4 = -99999999;
			Class1_Sub7 var5 = null;
			Class1_Sub7 var6;
			int var8;
			for (var6 = (Class1_Sub7) var3.method456(); var6 != null; var6 = (Class1_Sub7) var3.method458(551)) {
				Class5 var7 = Class5.method54(var6.anInt773);
				var8 = var7.anInt112;
				if (var7.aBoolean31) {
					var8 *= var6.anInt774 + 1;
				}
				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}
			var3.method454(var5, -26173);
			int var15 = -1;
			var8 = -1;
			int var9 = 0;
			int var10 = 0;
			for (var6 = (Class1_Sub7) var3.method456(); var6 != null; var6 = (Class1_Sub7) var3.method458(551)) {
				if (var6.anInt773 != var5.anInt773 && var15 == -1) {
					var15 = var6.anInt773;
					var9 = var6.anInt774;
				}
				if (var6.anInt773 != var5.anInt773 && var6.anInt773 != var15 && var8 == -1) {
					var8 = var6.anInt773;
					var10 = var6.anInt774;
				}
			}
			Class1_Sub3_Sub1 var11 = null;
			if (var15 != -1) {
				var11 = Class5.method54(var15).method58(var9);
			}
			Class1_Sub3_Sub1 var12 = null;
			if (var8 != -1) {
				var12 = Class5.method54(var8).method58(var10);
			}
			int var13 = arg0 + (arg1 << 7) + 1610612736;
			Class5 var14 = Class5.method54(var5.anInt773);
			this.aClass33_1.method474(var14.method58(var5.anInt774), var11, this.method94(this.anInt231, arg0 * 128 + 64, (byte) 5, arg1 * 128 + 64), this.anInt231, var13, arg1, arg0, var12, 429);
		}
	}

	public final void method185(int arg0) {
		try {
			try {
				this.anInt176 = -1;
				this.aClass28_2.method460();
				this.aClass28_1.method460();
				this.aClass28_5.method460();
				this.aClass28_3.method460();
				Class1_Sub3_Sub2_Sub1.method290(false);
				this.method144(this.aByte10);
				this.aClass33_1.method467(742);
				for (int var2 = 0; var2 < 4; ++var2) {
					this.aClass9Array1[var2].method249((byte) 74);
				}
				System.gc();
				Class4 var3 = new Class4(104, this.aByteArrayArrayArray7, 104, this.anIntArrayArrayArray3, this.anInt318);
				byte[] var4 = new byte[100000];
				int var5 = this.aByteArrayArray1.length;
				Class4.aBoolean23 = Class33.aBoolean143;
				int var7;
				int var8;
				for (int var6 = 0; var6 < var5; ++var6) {
					var7 = this.anIntArray56[var6] >> 8;
					var8 = this.anIntArray56[var6] & 255;
					if (var7 == 33 && var8 >= 71 && var8 <= 73) {
						Class4.aBoolean23 = false;
					}
				}
				if (Class4.aBoolean23) {
					this.aClass33_1.method468(0, this.anInt231);
				} else {
					this.aClass33_1.method468(0, 0);
				}
				this.aClass1_Sub3_Sub3_6.method380((byte) -34, 108);
				int var11;
				for (var7 = 0; var7 < var5; ++var7) {
					var8 = (this.anIntArray56[var7] >> 8) * 64 - this.anInt169;
					int var9 = (this.anIntArray56[var7] & 255) * 64 - this.anInt170;
					byte[] var10 = this.aByteArrayArray1[var7];
					if (var10 != null) {
						var11 = (new Class1_Sub3_Sub3(363, var10)).method396();
						Class34.method519(var4, var11, var10, var10.length - 4, 4);
						var3.method37(var4, (this.anInt212 - 6) * 8, 1, var9, var8, (this.anInt213 - 6) * 8);
					} else if (this.anInt213 < 800) {
						var3.method36(var8, var9, 3, 64, 64);
					}
				}
				this.aClass1_Sub3_Sub3_6.method380((byte) -34, 108);
				int var17;
				for (var8 = 0; var8 < var5; ++var8) {
					byte[] var15 = this.aByteArrayArray2[var8];
					if (var15 != null) {
						var17 = (new Class1_Sub3_Sub3(363, var15)).method396();
						Class34.method519(var4, var17, var15, var15.length - 4, 4);
						var11 = (this.anIntArray56[var8] >> 8) * 64 - this.anInt169;
						int var12 = (this.anIntArray56[var8] & 255) * 64 - this.anInt170;
						var3.method38(var4, this.aClass33_1, this.aClass9Array1, this.aClass28_1, true, var12, var11);
					}
				}
				this.aClass1_Sub3_Sub3_6.method380((byte) -34, 108);
				var3.method40(this.aClass33_1, -270, this.aClass9Array1);
				this.aClass32_27.method463((byte) 62);
				this.aClass1_Sub3_Sub3_6.method380((byte) -34, 108);
				for (Class1_Sub6 var16 = (Class1_Sub6) this.aClass28_1.method456(); var16 != null; var16 = (Class1_Sub6) this.aClass28_1.method458(551)) {
					if ((this.aByteArrayArrayArray7[1][var16.anInt653][var16.anInt654] & 2) == 2) {
						--var16.anInt651;
						if (var16.anInt651 < 0) {
							var16.method567();
						}
					}
				}
				for (var17 = 0; var17 < 104; ++var17) {
					for (var11 = 0; var11 < 104; ++var11) {
						this.method184(var17, var11);
					}
				}
				for (Class1_Sub4 var18 = (Class1_Sub4) this.aClass28_4.method456(); var18 != null; var18 = (Class1_Sub4) this.aClass28_4.method458(551)) {
					this.method160(var18.anInt598, var18.anInt595, var18.anInt596, var18.anInt594, var18.anInt597, var18.anInt599, -27819, var18.anInt593);
				}
			} catch (Exception var13) {
			}
			Class2.aClass35_1.method529();
			if (arg0 <= 0) {
				this.aBoolean72 = !this.aBoolean72;
			}
			System.gc();
			Class1_Sub3_Sub2_Sub1.method291(20, -20);
		} catch (RuntimeException var14) {
			signlink.reporterror("85866, " + arg0 + ", " + var14.toString());
			throw new RuntimeException();
		}
	}

	public final void method68(int arg0) {
		try {
			if (!this.aBoolean67 && !this.aBoolean46 && !this.aBoolean57) {
				++anInt266;
				if (arg0 > 0) {
					if (!this.aBoolean62) {
						this.method97((byte) -70);
					} else {
						this.method164(true);
					}
				}
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("41957, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public final void method186(byte arg0) {
		try {
			if (arg0 != 94) {
				this.method67();
			}
			int var3;
			for (int var2 = -1; var2 < this.anInt205; ++var2) {
				if (var2 == -1) {
					var3 = this.anInt204;
				} else {
					var3 = this.anIntArray39[var2];
				}
				Class1_Sub1_Sub3_Sub2 var4 = this.aClass1_Sub1_Sub3_Sub2Array1[var3];
				if (var4 != null && var4.anInt901 > 0) {
					--var4.anInt901;
					if (var4.anInt901 == 0) {
						var4.aString29 = null;
					}
				}
			}
			for (var3 = 0; var3 < this.anInt248; ++var3) {
				int var7 = this.anIntArray58[var3];
				Class1_Sub1_Sub3_Sub1 var5 = this.aClass1_Sub1_Sub3_Sub1Array1[var7];
				if (var5 != null && var5.anInt901 > 0) {
					--var5.anInt901;
					if (var5.anInt901 == 0) {
						var5.aString29 = null;
					}
				}
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("25131, " + arg0 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	public final int method187(Class15 arg0, boolean arg1, int arg2) {
		try {
			if (arg1) {
				this.aBoolean44 = !this.aBoolean44;
			}
			if (arg0.anIntArrayArray15 != null && arg2 < arg0.anIntArrayArray15.length) {
				try {
					int[] var4 = arg0.anIntArrayArray15[arg2];
					int var5 = 0;
					int var6 = 0;
					while (true) {
						int var7 = var4[var6++];
						if (var7 == 0) {
							return var5;
						}
						if (var7 == 1) {
							var5 += this.anIntArray36[var4[var6++]];
						}
						if (var7 == 2) {
							var5 += this.anIntArray57[var4[var6++]];
						}
						if (var7 == 3) {
							var5 += this.anIntArray72[var4[var6++]];
						}
						Class15 var8;
						int var9;
						int var10;
						if (var7 == 4) {
							var8 = Class15.aClass15Array1[var4[var6++]];
							var9 = var4[var6++] + 1;
							for (var10 = 0; var10 < var8.anIntArray149.length; ++var10) {
								if (var8.anIntArray149[var10] == var9) {
									var5 += var8.anIntArray150[var10];
								}
							}
						}
						if (var7 == 5) {
							var5 += this.anIntArray59[var4[var6++]];
						}
						if (var7 == 6) {
							var5 += anIntArray47[this.anIntArray57[var4[var6++]] - 1];
						}
						if (var7 == 7) {
							var5 += this.anIntArray59[var4[var6++]] * 100 / 46875;
						}
						if (var7 == 8) {
							var5 += this.aClass1_Sub1_Sub3_Sub2_1.anInt940;
						}
						int var13;
						if (var7 == 9) {
							for (var13 = 0; var13 < 19; ++var13) {
								if (var13 == 18) {
									var13 = 20;
								}
								var5 += this.anIntArray57[var13];
							}
						}
						if (var7 == 10) {
							var8 = Class15.aClass15Array1[var4[var6++]];
							var9 = var4[var6++] + 1;
							for (var10 = 0; var10 < var8.anIntArray149.length; ++var10) {
								if (var8.anIntArray149[var10] == var9) {
									var5 += 999999999;
									break;
								}
							}
						}
						if (var7 == 11) {
							var5 += this.anInt303;
						}
						if (var7 == 12) {
							var5 += this.anInt173;
						}
						if (var7 == 13) {
							var13 = this.anIntArray59[var4[var6++]];
							var9 = var4[var6++];
							var5 += (var13 & 1 << var9) != 0 ? 1 : 0;
						}
					}
				} catch (Exception var11) {
					return -1;
				}
			} else {
				return -2;
			}
		} catch (RuntimeException var12) {
			signlink.reporterror("5084, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var12.toString());
			throw new RuntimeException();
		}
	}

	public final void method188(boolean arg0) {
		try {
			Graphics var2 = this.method72(aByte16).getGraphics();
			var2.setColor(Color.black);
			var2.fillRect(0, 0, 789, 532);
			this.method65(386, 1);
			if (arg0) {
				this.method67();
			}
			byte var3;
			int var5;
			if (this.aBoolean46) {
				this.aBoolean54 = false;
				var2.setFont(new Font("Helvetica", 1, 16));
				var2.setColor(Color.yellow);
				var3 = 35;
				var2.drawString("Sorry, an error has occured whilst loading RuneScape", 30, var3);
				var5 = var3 + 50;
				var2.setColor(Color.white);
				var2.drawString("To fix this try the following (in order):", 30, var5);
				int var6 = var5 + 50;
				var2.setColor(Color.white);
				var2.setFont(new Font("Helvetica", 1, 12));
				var2.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, var6);
				int var7 = var6 + 30;
				var2.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, var7);
				int var8 = var7 + 30;
				var2.drawString("3: Try using a different game-world", 30, var8);
				int var9 = var8 + 30;
				var2.drawString("4: Try rebooting your computer", 30, var9);
				int var10 = var9 + 30;
				var2.drawString("5: Try selecting a different version of Java from the play-game menu", 30, var10);
			}
			if (this.aBoolean57) {
				this.aBoolean54 = false;
				var2.setFont(new Font("Helvetica", 1, 20));
				var2.setColor(Color.white);
				var2.drawString("Error - unable to load game!", 50, 50);
				var2.drawString("To play RuneScape make sure you play from", 50, 100);
				var2.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean67) {
				this.aBoolean54 = false;
				var2.setColor(Color.yellow);
				var3 = 35;
				var2.drawString("Error a copy of RuneScape already appears to be loaded", 30, var3);
				var5 = var3 + 50;
				var2.setColor(Color.white);
				var2.drawString("To fix this try the following (in order):", 30, var5);
				var5 += 50;
				var2.setColor(Color.white);
				var2.setFont(new Font("Helvetica", 1, 12));
				var2.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, var5);
				var5 += 30;
				var2.drawString("2: Try rebooting your computer, and reloading", 30, var5);
				var5 += 30;
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("19392, " + arg0 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	public final void method189(byte arg0) {
		try {
			byte[] var2 = this.aClass39_1.method536("title.dat", (byte[]) null, (byte) 2);
			Class1_Sub3_Sub2_Sub2 var3 = new Class1_Sub3_Sub2_Sub2(var2, this);
			this.aClass32_19.method463((byte) 62);
			var3.method320(34676, 0, 0);
			this.aClass32_20.method463((byte) 62);
			var3.method320(34676, -661, 0);
			this.aClass32_16.method463((byte) 62);
			var3.method320(34676, -128, 0);
			this.aClass32_17.method463((byte) 62);
			var3.method320(34676, -214, -386);
			this.aClass32_18.method463((byte) 62);
			var3.method320(34676, -214, -186);
			this.aClass32_21.method463((byte) 62);
			var3.method320(34676, 0, -265);
			this.aClass32_22.method463((byte) 62);
			var3.method320(34676, -574, -265);
			this.aClass32_23.method463((byte) 62);
			if (arg0 != 5) {
				this.aBoolean55 = !this.aBoolean55;
			}
			var3.method320(34676, -128, -186);
			this.aClass32_24.method463((byte) 62);
			var3.method320(34676, -574, -186);
			int[] var4 = new int[var3.anInt461];
			for (int var5 = 0; var5 < var3.anInt462; ++var5) {
				for (int var6 = 0; var6 < var3.anInt461; ++var6) {
					var4[var6] = var3.anIntArray148[var3.anInt461 - var6 - 1 + var3.anInt461 * var5];
				}
				for (int var7 = 0; var7 < var3.anInt461; ++var7) {
					var3.anIntArray148[var7 + var3.anInt461 * var5] = var4[var7];
				}
			}
			this.aClass32_19.method463((byte) 62);
			var3.method320(34676, 394, 0);
			this.aClass32_20.method463((byte) 62);
			var3.method320(34676, -267, 0);
			this.aClass32_16.method463((byte) 62);
			var3.method320(34676, 266, 0);
			this.aClass32_17.method463((byte) 62);
			var3.method320(34676, 180, -386);
			this.aClass32_18.method463((byte) 62);
			var3.method320(34676, 180, -186);
			this.aClass32_21.method463((byte) 62);
			var3.method320(34676, 394, -265);
			this.aClass32_22.method463((byte) 62);
			var3.method320(34676, -180, -265);
			this.aClass32_23.method463((byte) 62);
			var3.method320(34676, 212, -186);
			this.aClass32_24.method463((byte) 62);
			var3.method320(34676, -180, -186);
			var3 = new Class1_Sub3_Sub2_Sub2(this.aClass39_1, "logo", 0);
			this.aClass32_16.method463((byte) 62);
			var3.method322(18, super.anInt131 / 2 - var3.anInt461 / 2 - 128, false);
			var3 = null;
			Object var9 = null;
			Object var10 = null;
			System.gc();
		} catch (RuntimeException var8) {
			signlink.reporterror("21255, " + arg0 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	public final void method190(int arg0) {
		try {
			int var21 = 30 / arg0;
			for (Class1_Sub6 var2 = (Class1_Sub6) this.aClass28_1.method456(); var2 != null; var2 = (Class1_Sub6) this.aClass28_1.method458(551)) {
				boolean var3 = false;
				var2.anInt657 += this.anInt270;
				if (var2.anInt656 == -1) {
					var2.anInt656 = 0;
					var3 = true;
				}
				label70: {
					do {
						do {
							if (var2.anInt657 <= var2.aClass19_2.anIntArray188[var2.anInt656]) {
								break label70;
							}
							var2.anInt657 -= var2.aClass19_2.anIntArray188[var2.anInt656] + 1;
							++var2.anInt656;
							var3 = true;
						} while (var2.anInt656 < var2.aClass19_2.anInt543);
						var2.anInt656 -= var2.aClass19_2.anInt544;
					} while (var2.anInt656 >= 0 && var2.anInt656 < var2.aClass19_2.anInt543);
					var2.method567();
					var3 = false;
				}
				if (var3) {
					int var4 = var2.anInt651;
					int var5 = var2.anInt653;
					int var6 = var2.anInt654;
					int var7 = 0;
					if (var2.anInt652 == 0) {
						var7 = this.aClass33_1.method494(var4, var5, var6);
					}
					if (var2.anInt652 == 1) {
						var7 = this.aClass33_1.method495(var4, var6, 3, var5);
					}
					if (var2.anInt652 == 2) {
						var7 = this.aClass33_1.method496(var4, var5, var6);
					}
					if (var2.anInt652 == 3) {
						var7 = this.aClass33_1.method497(var4, var5, var6);
					}
					if (var7 != 0 && (var7 >> 14 & 32767) == var2.anInt655) {
						int var8 = this.anIntArrayArrayArray3[var4][var5][var6];
						int var9 = this.anIntArrayArrayArray3[var4][var5 + 1][var6];
						int var10 = this.anIntArrayArrayArray3[var4][var5 + 1][var6 + 1];
						int var11 = this.anIntArrayArrayArray3[var4][var5][var6 + 1];
						Class2 var12 = Class2.method23(var2.anInt655);
						int var13 = -1;
						if (var2.anInt656 != -1) {
							var13 = var2.aClass19_2.anIntArray186[var2.anInt656];
						}
						int var14;
						int var15;
						int var16;
						Class1_Sub3_Sub1 var17;
						if (var2.anInt652 == 2) {
							var14 = this.aClass33_1.method498(var4, var5, var6, var7);
							var15 = var14 & 31;
							var16 = var14 >> 6;
							if (var15 == 11) {
								var15 = 10;
							}
							var17 = var12.method26(var15, var16, var8, var9, var10, var11, var13);
							this.aClass33_1.method483(var5, var17, 1, var4, var6);
						} else if (var2.anInt652 == 1) {
							Class1_Sub3_Sub1 var22 = var12.method26(4, 0, var8, var9, var10, var11, var13);
							this.aClass33_1.method485(266, var6, var5, var22, var4);
						} else if (var2.anInt652 == 0) {
							var14 = this.aClass33_1.method498(var4, var5, var6, var7);
							var15 = var14 & 31;
							var16 = var14 >> 6;
							if (var15 == 2) {
								int var24 = var16 + 1 & 3;
								Class1_Sub3_Sub1 var18 = var12.method26(2, 4 + var16, var8, var9, var10, var11, var13);
								Class1_Sub3_Sub1 var19 = var12.method26(2, var24, var8, var9, var10, var11, var13);
								this.aClass33_1.method488(var18, var19, var6, this.aBoolean44, var5, var4);
							} else {
								var17 = var12.method26(var15, var16, var8, var9, var10, var11, var13);
								this.aClass33_1.method487(35568, var17, var6, var5, var4);
							}
						} else if (var2.anInt652 == 3) {
							var14 = this.aClass33_1.method498(var4, var5, var6, var7);
							var15 = var14 >> 6;
							Class1_Sub3_Sub1 var23 = var12.method26(22, var15, var8, var9, var10, var11, var13);
							this.aClass33_1.method486(var23, var6, -48639, var5, var4);
						}
					} else {
						var2.method567();
					}
				}
			}
		} catch (RuntimeException var20) {
			signlink.reporterror("25821, " + arg0 + ", " + var20.toString());
			throw new RuntimeException();
		}
	}

	public final void method191(int arg0, long arg1) {
		try {
			if (arg0 != 1) {
				this.anInt179 = -1;
			}
			if (arg1 != 0L) {
				for (int var4 = 0; var4 < this.anInt186; ++var4) {
					if (this.aLongArray3[var4] == arg1) {
						--this.anInt186;
						this.aBoolean59 = true;
						for (int var5 = var4; var5 < this.anInt186; ++var5) {
							this.aLongArray3[var5] = this.aLongArray3[var5 + 1];
						}
						this.aClass1_Sub3_Sub3_6.method380((byte) -34, 171);
						this.aClass1_Sub3_Sub3_6.method387(true, arg1);
						return;
					}
				}
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("36301, " + arg0 + ", " + arg1 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	public final void method192(byte arg0) {
		try {
			if (this.anInt281 == 0 && this.anInt291 == 0) {
				this.aStringArray5[this.anInt304] = "Walk here";
				this.anIntArray86[this.anInt304] = 660;
				this.anIntArray84[this.anInt304] = super.anInt135;
				this.anIntArray85[this.anInt304] = super.anInt136;
				++this.anInt304;
			}
			int var2 = -1;
			if (arg0 != 2) {
				aBoolean48 = !aBoolean48;
			}
			for (int var3 = 0; var3 < Class1_Sub3_Sub1.anInt378; ++var3) {
				int var4 = Class1_Sub3_Sub1.anIntArray123[var3];
				int var5 = var4 & 127;
				int var6 = var4 >> 7 & 127;
				int var7 = var4 >> 29 & 3;
				int var8 = var4 >> 14 & 32767;
				if (var4 != var2) {
					var2 = var4;
					int var10;
					if (var7 == 2 && this.aClass33_1.method498(this.anInt231, var5, var6, var4) >= 0) {
						Class2 var9 = Class2.method23(var8);
						if (this.anInt281 == 1) {
							this.aStringArray5[this.anInt304] = "Use " + this.aString10 + " with @cya@" + var9.aString1;
							this.anIntArray86[this.anInt304] = 450;
							this.anIntArray87[this.anInt304] = var4;
							this.anIntArray84[this.anInt304] = var5;
							this.anIntArray85[this.anInt304] = var6;
							++this.anInt304;
						} else if (this.anInt291 == 1) {
							if ((this.anInt293 & 4) == 4) {
								this.aStringArray5[this.anInt304] = this.aString11 + " @cya@" + var9.aString1;
								this.anIntArray86[this.anInt304] = 55;
								this.anIntArray87[this.anInt304] = var4;
								this.anIntArray84[this.anInt304] = var5;
								this.anIntArray85[this.anInt304] = var6;
								++this.anInt304;
							}
						} else {
							if (var9.aStringArray1 != null) {
								for (var10 = 4; var10 >= 0; --var10) {
									if (var9.aStringArray1[var10] != null) {
										this.aStringArray5[this.anInt304] = var9.aStringArray1[var10] + " @cya@" + var9.aString1;
										if (var10 == 0) {
											this.anIntArray86[this.anInt304] = 285;
										}
										if (var10 == 1) {
											this.anIntArray86[this.anInt304] = 504;
										}
										if (var10 == 2) {
											this.anIntArray86[this.anInt304] = 364;
										}
										if (var10 == 3) {
											this.anIntArray86[this.anInt304] = 581;
										}
										if (var10 == 4) {
											this.anIntArray86[this.anInt304] = 1501;
										}
										this.anIntArray87[this.anInt304] = var4;
										this.anIntArray84[this.anInt304] = var5;
										this.anIntArray85[this.anInt304] = var6;
										++this.anInt304;
									}
								}
							}
							this.aStringArray5[this.anInt304] = "Examine @cya@" + var9.aString1;
							this.anIntArray86[this.anInt304] = 1175;
							this.anIntArray87[this.anInt304] = var4;
							this.anIntArray84[this.anInt304] = var5;
							this.anIntArray85[this.anInt304] = var6;
							++this.anInt304;
						}
					}
					Class1_Sub1_Sub3_Sub1 var11;
					if (var7 == 1) {
						Class1_Sub1_Sub3_Sub1 var14 = this.aClass1_Sub1_Sub3_Sub1Array1[var8];
						if (var14.aClass3_1.aByte4 == 1 && (var14.anInt890 & 127) == 64 && (var14.anInt891 & 127) == 64) {
							for (var10 = 0; var10 < this.anInt248; ++var10) {
								var11 = this.aClass1_Sub1_Sub3_Sub1Array1[this.anIntArray58[var10]];
								if (var11 != null && var11 != var14 && var11.aClass3_1.aByte4 == 1 && var11.anInt890 == var14.anInt890 && var11.anInt891 == var14.anInt891) {
									this.method95(var11.aClass3_1, -641, var6, var5, this.anIntArray58[var10]);
								}
							}
						}
						this.method95(var14.aClass3_1, -641, var6, var5, var8);
					}
					if (var7 == 0) {
						Class1_Sub1_Sub3_Sub2 var15 = this.aClass1_Sub1_Sub3_Sub2Array1[var8];
						if ((var15.anInt890 & 127) == 64 && (var15.anInt891 & 127) == 64) {
							for (var10 = 0; var10 < this.anInt248; ++var10) {
								var11 = this.aClass1_Sub1_Sub3_Sub1Array1[this.anIntArray58[var10]];
								if (var11 != null && var11.aClass3_1.aByte4 == 1 && var11.anInt890 == var15.anInt890 && var11.anInt891 == var15.anInt891) {
									this.method95(var11.aClass3_1, -641, var6, var5, this.anIntArray58[var10]);
								}
							}
							for (int var17 = 0; var17 < this.anInt205; ++var17) {
								Class1_Sub1_Sub3_Sub2 var12 = this.aClass1_Sub1_Sub3_Sub2Array1[this.anIntArray39[var17]];
								if (var12 != null && var12 != var15 && var12.anInt890 == var15.anInt890 && var12.anInt891 == var15.anInt891) {
									this.method163(false, var6, this.anIntArray39[var17], var12, var5);
								}
							}
						}
						this.method163(false, var6, var8, var15, var5);
					}
					if (var7 == 3) {
						Class28 var16 = this.aClass28ArrayArrayArray1[this.anInt231][var5][var6];
						if (var16 != null) {
							for (Class1_Sub7 var18 = (Class1_Sub7) var16.method457((byte) 2); var18 != null; var18 = (Class1_Sub7) var16.method459(false)) {
								Class5 var19 = Class5.method54(var18.anInt773);
								if (this.anInt281 == 1) {
									this.aStringArray5[this.anInt304] = "Use " + this.aString10 + " with @lre@" + var19.aString3;
									this.anIntArray86[this.anInt304] = 217;
									this.anIntArray87[this.anInt304] = var18.anInt773;
									this.anIntArray84[this.anInt304] = var5;
									this.anIntArray85[this.anInt304] = var6;
									++this.anInt304;
								} else if (this.anInt291 == 1) {
									if ((this.anInt293 & 1) == 1) {
										this.aStringArray5[this.anInt304] = this.aString11 + " @lre@" + var19.aString3;
										this.anIntArray86[this.anInt304] = 965;
										this.anIntArray87[this.anInt304] = var18.anInt773;
										this.anIntArray84[this.anInt304] = var5;
										this.anIntArray85[this.anInt304] = var6;
										++this.anInt304;
									}
								} else {
									for (int var20 = 4; var20 >= 0; --var20) {
										if (var19.aStringArray3 != null && var19.aStringArray3[var20] != null) {
											this.aStringArray5[this.anInt304] = var19.aStringArray3[var20] + " @lre@" + var19.aString3;
											if (var20 == 0) {
												this.anIntArray86[this.anInt304] = 224;
											}
											if (var20 == 1) {
												this.anIntArray86[this.anInt304] = 993;
											}
											if (var20 == 2) {
												this.anIntArray86[this.anInt304] = 99;
											}
											if (var20 == 3) {
												this.anIntArray86[this.anInt304] = 746;
											}
											if (var20 == 4) {
												this.anIntArray86[this.anInt304] = 877;
											}
											this.anIntArray87[this.anInt304] = var18.anInt773;
											this.anIntArray84[this.anInt304] = var5;
											this.anIntArray85[this.anInt304] = var6;
											++this.anInt304;
										} else if (var20 == 2) {
											this.aStringArray5[this.anInt304] = "Take @lre@" + var19.aString3;
											this.anIntArray86[this.anInt304] = 99;
											this.anIntArray87[this.anInt304] = var18.anInt773;
											this.anIntArray84[this.anInt304] = var5;
											this.anIntArray85[this.anInt304] = var6;
											++this.anInt304;
										}
									}
									this.aStringArray5[this.anInt304] = "Examine @lre@" + var19.aString3;
									this.anIntArray86[this.anInt304] = 1102;
									this.anIntArray87[this.anInt304] = var18.anInt773;
									this.anIntArray84[this.anInt304] = var5;
									this.anIntArray85[this.anInt304] = var6;
									++this.anInt304;
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException var13) {
			signlink.reporterror("47222, " + arg0 + ", " + var13.toString());
			throw new RuntimeException();
		}
	}

	public final void method193(boolean arg0) {
		try {
			this.aBoolean62 &= arg0;
			int var3;
			for (int var2 = -1; var2 < this.anInt205; ++var2) {
				if (var2 == -1) {
					var3 = this.anInt204;
				} else {
					var3 = this.anIntArray39[var2];
				}
				Class1_Sub1_Sub3_Sub2 var4 = this.aClass1_Sub1_Sub3_Sub2Array1[var3];
				if (var4 != null) {
					this.method124(var4, (byte) -128, 1);
				}
			}
			++anInt242;
			if (anInt242 > 1406) {
				anInt242 = 0;
				this.aClass1_Sub3_Sub3_6.method380((byte) -34, 219);
				this.aClass1_Sub3_Sub3_6.method381(0);
				var3 = this.aClass1_Sub3_Sub3_6.anInt561;
				this.aClass1_Sub3_Sub3_6.method381(162);
				this.aClass1_Sub3_Sub3_6.method381(22);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub3_Sub3_6.method381(84);
				}
				this.aClass1_Sub3_Sub3_6.method382(31824);
				this.aClass1_Sub3_Sub3_6.method382(13490);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub3_Sub3_6.method381(123);
				}
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub3_Sub3_6.method381(134);
				}
				this.aClass1_Sub3_Sub3_6.method381(100);
				this.aClass1_Sub3_Sub3_6.method381(94);
				this.aClass1_Sub3_Sub3_6.method382(35521);
				this.aClass1_Sub3_Sub3_6.method390(0, this.aClass1_Sub3_Sub3_6.anInt561 - var3);
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("87242, " + arg0 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	public final void method194(byte arg0) {
		try {
			if (this.anInt241 == 2) {
				this.method152((this.anInt159 - this.anInt170 << 7) + this.anInt162, (this.anInt158 - this.anInt169 << 7) + this.anInt161, this.anInt317, this.anInt160 * 2);
				if (arg0 != -11) {
					this.aBoolean72 = !this.aBoolean72;
				}
				if (this.anInt287 > -1 && anInt266 % 20 < 10) {
					this.aClass1_Sub3_Sub2_Sub2Array5[2].method322(this.anInt288 - 28, this.anInt287 - 12, false);
				}
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("792, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	private final void method195(int arg0, int arg1, Class1_Sub3_Sub3 arg2) {
		try {
			arg2.method401(223);
			int var4 = arg2.method402(9, 1);
			if (arg0 != 11522) {
				this.aClass28ArrayArrayArray1 = null;
			}
			if (var4 != 0) {
				int var5 = arg2.method402(9, 2);
				if (var5 == 0) {
					this.anIntArray40[this.anInt206++] = this.anInt204;
				} else {
					int var6;
					int var7;
					if (var5 == 1) {
						var6 = arg2.method402(9, 3);
						this.aClass1_Sub1_Sub3_Sub2_1.method570(false, var6, (byte) 6);
						var7 = arg2.method402(9, 1);
						if (var7 == 1) {
							this.anIntArray40[this.anInt206++] = this.anInt204;
						}
					} else {
						int var8;
						if (var5 == 2) {
							var6 = arg2.method402(9, 3);
							this.aClass1_Sub1_Sub3_Sub2_1.method570(true, var6, (byte) 6);
							var7 = arg2.method402(9, 3);
							this.aClass1_Sub1_Sub3_Sub2_1.method570(true, var7, (byte) 6);
							var8 = arg2.method402(9, 1);
							if (var8 == 1) {
								this.anIntArray40[this.anInt206++] = this.anInt204;
							}
						} else if (var5 == 3) {
							this.anInt231 = arg2.method402(9, 2);
							var6 = arg2.method402(9, 7);
							var7 = arg2.method402(9, 7);
							var8 = arg2.method402(9, 1);
							this.aClass1_Sub1_Sub3_Sub2_1.method569(false, var8 == 1, var6, var7);
							int var9 = arg2.method402(9, 1);
							if (var9 == 1) {
								this.anIntArray40[this.anInt206++] = this.anInt204;
							}
						}
					}
				}
			}
		} catch (RuntimeException var10) {
			signlink.reporterror("31876, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var10.toString());
			throw new RuntimeException();
		}
	}

	public final void method196(boolean arg0) {
		try {
			if (arg0) {
				this.anInt179 = -1;
			}
			this.aClass32_28.method463((byte) 62);
			Class1_Sub3_Sub2_Sub1.anIntArray139 = this.anIntArray30;
			this.aClass1_Sub3_Sub2_Sub3_11.method350(0, 0, false);
			if (this.aBoolean47) {
				this.aClass1_Sub3_Sub2_Sub4_3.method362(40, (byte) 6, 0, this.aString6, 239);
				this.aClass1_Sub3_Sub2_Sub4_3.method362(60, (byte) 6, 128, this.aString5 + "*", 239);
			} else if (this.aBoolean66) {
				this.aClass1_Sub3_Sub2_Sub4_3.method362(40, (byte) 6, 0, "Enter amount:", 239);
				this.aClass1_Sub3_Sub2_Sub4_3.method362(60, (byte) 6, 128, this.aString7 + "*", 239);
			} else if (this.aString8 != null) {
				this.aClass1_Sub3_Sub2_Sub4_3.method362(40, (byte) 6, 0, this.aString8, 239);
				this.aClass1_Sub3_Sub2_Sub4_3.method362(60, (byte) 6, 128, "Click to continue", 239);
			} else if (this.anInt280 != -1) {
				this.method120(0, 0, 38682, Class15.aClass15Array1[this.anInt280], 0);
			} else if (this.anInt289 != -1) {
				this.method120(0, 0, 38682, Class15.aClass15Array1[this.anInt289], 0);
			} else {
				Class1_Sub3_Sub2_Sub4 var2 = this.aClass1_Sub3_Sub2_Sub4_2;
				int var3 = 0;
				Class1_Sub3_Sub2.method356(77, 0, 463, 789, 0);
				for (int var4 = 0; var4 < 100; ++var4) {
					if (this.aStringArray7[var4] != null) {
						int var5 = this.anIntArray49[var4];
						int var6 = 70 - var3 * 14 + this.anInt274;
						if (var5 == 0) {
							if (var6 > 0 && var6 < 110) {
								var2.method365(4, var6, false, 0, this.aStringArray7[var4]);
							}
							++var3;
						}
						if (var5 == 1) {
							if (var6 > 0 && var6 < 110) {
								var2.method365(4, var6, false, 16777215, this.aStringArray6[var4] + ":");
								var2.method365(12 + var2.method364(false, this.aStringArray6[var4]), var6, false, 255, this.aStringArray7[var4]);
							}
							++var3;
						}
						if (var5 == 2 && (this.anInt273 == 0 || this.anInt273 == 1 && this.method199(-20, this.aStringArray6[var4]))) {
							if (var6 > 0 && var6 < 110) {
								var2.method365(4, var6, false, 0, this.aStringArray6[var4] + ":");
								var2.method365(12 + var2.method364(false, this.aStringArray6[var4]), var6, false, 255, this.aStringArray7[var4]);
							}
							++var3;
						}
						if ((var5 == 3 || var5 == 7) && this.anInt210 == 0 && (var5 == 7 || this.anInt164 == 0 || this.anInt164 == 1 && this.method199(-20, this.aStringArray6[var4]))) {
							if (var6 > 0 && var6 < 110) {
								var2.method365(4, var6, false, 0, "From " + this.aStringArray6[var4] + ":");
								var2.method365(12 + var2.method364(false, "From " + this.aStringArray6[var4]), var6, false, 8388608, this.aStringArray7[var4]);
							}
							++var3;
						}
						if (var5 == 4 && (this.anInt234 == 0 || this.anInt234 == 1 && this.method199(-20, this.aStringArray6[var4]))) {
							if (var6 > 0 && var6 < 110) {
								var2.method365(4, var6, false, 8388736, this.aStringArray6[var4] + " " + this.aStringArray7[var4]);
							}
							++var3;
						}
						if (var5 == 5 && this.anInt210 == 0 && this.anInt164 < 2) {
							if (var6 > 0 && var6 < 110) {
								var2.method365(4, var6, false, 8388608, this.aStringArray7[var4]);
							}
							++var3;
						}
						if (var5 == 6 && this.anInt210 == 0 && this.anInt164 < 2) {
							if (var6 > 0 && var6 < 110) {
								var2.method365(4, var6, false, 0, "To " + this.aStringArray6[var4] + ":");
								var2.method365(12 + var2.method364(false, "To " + this.aStringArray6[var4]), var6, false, 8388608, this.aStringArray7[var4]);
							}
							++var3;
						}
						if (var5 == 8 && (this.anInt234 == 0 || this.anInt234 == 1 && this.method199(-20, this.aStringArray6[var4]))) {
							if (var6 > 0 && var6 < 110) {
								var2.method365(4, var6, false, 13350793, this.aStringArray6[var4] + " " + this.aStringArray7[var4]);
							}
							++var3;
						}
					}
				}
				Class1_Sub3_Sub2.method355(0);
				this.anInt185 = var3 * 14 + 7;
				if (this.anInt185 < 78) {
					this.anInt185 = 78;
				}
				this.method111(this.anInt192, 463, 0, this.anInt185 - this.anInt274 - 77, this.anInt185, 77);
				var2.method365(4, 90, false, 0, Class40.method542(0, this.aString13) + ":");
				var2.method365(6 + var2.method364(false, this.aString13 + ": "), 90, false, 255, this.aString18 + "*");
				Class1_Sub3_Sub2.method360(0, 0, 77, 479, 0);
			}
			if (this.aBoolean50 && this.anInt337 == 2) {
				this.method135(-961);
			}
			this.aClass32_28.method464(375, super.aGraphics2, 22, 5193);
			this.aClass32_27.method463((byte) 62);
			Class1_Sub3_Sub2_Sub1.anIntArray139 = this.anIntArray32;
		} catch (RuntimeException var7) {
			signlink.reporterror("15378, " + arg0 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	public final boolean method197(boolean arg0) {
		try {
			if (arg0) {
				this.aClass28ArrayArrayArray1 = null;
			}
			if (this.aClass6_1 == null) {
				return false;
			} else {
				String var3;
				int var4;
				try {
					int var2 = this.aClass6_1.method203();
					if (var2 == 0) {
						return false;
					}
					if (this.anInt179 == -1) {
						this.aClass6_1.method204(this.aClass1_Sub3_Sub3_5.aByteArray7, 0, 1);
						this.anInt179 = this.aClass1_Sub3_Sub3_5.aByteArray7[0] & 255;
						if (this.aClass38_1 != null) {
							this.anInt179 = this.anInt179 - this.aClass38_1.method532() & 255;
						}
						this.anInt178 = Class7.anIntArray90[this.anInt179];
						--var2;
					}
					if (this.anInt178 == -1) {
						if (var2 <= 0) {
							return false;
						}
						this.aClass6_1.method204(this.aClass1_Sub3_Sub3_5.aByteArray7, 0, 1);
						this.anInt178 = this.aClass1_Sub3_Sub3_5.aByteArray7[0] & 255;
						--var2;
					}
					if (this.anInt178 == -2) {
						if (var2 <= 1) {
							return false;
						}
						this.aClass6_1.method204(this.aClass1_Sub3_Sub3_5.aByteArray7, 0, 2);
						this.aClass1_Sub3_Sub3_5.anInt561 = 0;
						this.anInt178 = this.aClass1_Sub3_Sub3_5.method393();
						var2 -= 2;
					}
					if (var2 < this.anInt178) {
						return false;
					}
					this.aClass1_Sub3_Sub3_5.anInt561 = 0;
					this.aClass6_1.method204(this.aClass1_Sub3_Sub3_5.aByteArray7, 0, this.anInt178);
					this.anInt180 = 0;
					this.anInt209 = this.anInt208;
					this.anInt208 = this.anInt207;
					this.anInt207 = this.anInt179;
					int var27;
					if (this.anInt179 == 150) {
						var27 = this.aClass1_Sub3_Sub3_5.method393();
						byte var53 = this.aClass1_Sub3_Sub3_5.method392();
						this.anIntArray71[var27] = var53;
						if (this.anIntArray59[var27] != var53) {
							this.anIntArray59[var27] = var53;
							this.method122(var27, 49);
							this.aBoolean59 = true;
							if (this.anInt289 != -1) {
								this.aBoolean60 = true;
							}
						}
						this.anInt179 = -1;
						return true;
					}
					int var5;
					int var7;
					int var9;
					int var10;
					long var40;
					if (this.anInt179 == 152) {
						var40 = this.aClass1_Sub3_Sub3_5.method397(603);
						var5 = this.aClass1_Sub3_Sub3_5.method391();
						String var45 = Class40.method542(0, Class40.method539(var40, false));
						for (var7 = 0; var7 < this.anInt312; ++var7) {
							if (var40 == this.aLongArray4[var7]) {
								if (this.anIntArray34[var7] != var5) {
									this.anIntArray34[var7] = var5;
									this.aBoolean59 = true;
									if (var5 > 0) {
										this.method172(5, var45 + " has logged in.", (byte) 4, "");
									}
									if (var5 == 0) {
										this.method172(5, var45 + " has logged out.", (byte) 4, "");
									}
								}
								var45 = null;
								break;
							}
						}
						if (var45 != null && this.anInt312 < 100) {
							this.aLongArray4[this.anInt312] = var40;
							this.aStringArray9[this.anInt312] = var45;
							this.anIntArray34[this.anInt312] = var5;
							++this.anInt312;
							this.aBoolean59 = true;
						}
						boolean var42 = false;
						while (!var42) {
							var42 = true;
							for (var9 = 0; var9 < this.anInt312 - 1; ++var9) {
								if (this.anIntArray34[var9] != anInt235 && this.anIntArray34[var9 + 1] == anInt235 || this.anIntArray34[var9] == 0 && this.anIntArray34[var9 + 1] != 0) {
									var10 = this.anIntArray34[var9];
									this.anIntArray34[var9] = this.anIntArray34[var9 + 1];
									this.anIntArray34[var9 + 1] = var10;
									String var43 = this.aStringArray9[var9];
									this.aStringArray9[var9] = this.aStringArray9[var9 + 1];
									this.aStringArray9[var9 + 1] = var43;
									long var51 = this.aLongArray4[var9];
									this.aLongArray4[var9] = this.aLongArray4[var9 + 1];
									this.aLongArray4[var9 + 1] = var51;
									this.aBoolean59 = true;
									var42 = false;
								}
							}
						}
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 43) {
						this.anInt267 = this.aClass1_Sub3_Sub3_5.method393() * 30;
						this.anInt179 = -1;
						return true;
					}
					int var6;
					if (this.anInt179 == 80) {
						var27 = this.aClass1_Sub3_Sub3_5.method391();
						var4 = this.aClass1_Sub3_Sub3_5.method391();
						var5 = -1;
						for (var6 = 0; var6 < this.anIntArray56.length; ++var6) {
							if (this.anIntArray56[var6] == (var27 << 8) + var4) {
								var5 = var6;
							}
						}
						if (var5 != -1) {
							signlink.cachesave("m" + var27 + "_" + var4, this.aByteArrayArray1[var5]);
							this.anInt307 = 1;
						}
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 1) {
						this.method108(this.aClass1_Sub3_Sub3_5, this.anInt178, false);
						this.anInt179 = -1;
						return true;
					}
					int var8;
					if (this.anInt179 == 237) {
						var27 = this.aClass1_Sub3_Sub3_5.method393();
						var4 = this.aClass1_Sub3_Sub3_5.method393();
						if (this.anInt212 == var27 && this.anInt213 == var4 && this.anInt307 != 0) {
							this.anInt179 = -1;
							return true;
						}
						this.anInt212 = var27;
						this.anInt213 = var4;
						this.anInt169 = (this.anInt212 - 6) * 8;
						this.anInt170 = (this.anInt213 - 6) * 8;
						this.anInt307 = 1;
						this.aClass32_27.method463((byte) 62);
						this.aClass1_Sub3_Sub2_Sub4_2.method362(151, (byte) 6, 0, "Loading - please wait.", 257);
						this.aClass1_Sub3_Sub2_Sub4_2.method362(150, (byte) 6, 16777215, "Loading - please wait.", 256);
						this.aClass32_27.method464(11, super.aGraphics2, 8, 5193);
						signlink.looprate(5);
						var5 = (this.anInt178 - 2) / 10;
						this.aByteArrayArray1 = new byte[var5][];
						this.aByteArrayArray2 = new byte[var5][];
						this.anIntArray56 = new int[var5];
						this.aClass1_Sub3_Sub3_6.method380((byte) -34, 150);
						this.aClass1_Sub3_Sub3_6.method381(0);
						var6 = 0;
						int var11;
						for (var7 = 0; var7 < var5; ++var7) {
							var8 = this.aClass1_Sub3_Sub3_5.method391();
							var9 = this.aClass1_Sub3_Sub3_5.method391();
							var10 = this.aClass1_Sub3_Sub3_5.method396();
							var11 = this.aClass1_Sub3_Sub3_5.method396();
							this.anIntArray56[var7] = (var8 << 8) + var9;
							byte[] var12;
							if (var10 != 0) {
								var12 = signlink.cacheload("m" + var8 + "_" + var9);
								if (var12 != null) {
									this.aCRC32_1.reset();
									this.aCRC32_1.update(var12);
									if ((int) this.aCRC32_1.getValue() != var10) {
										var12 = null;
									}
								}
								if (var12 != null) {
									this.aByteArrayArray1[var7] = var12;
								} else {
									this.anInt307 = 0;
									this.aClass1_Sub3_Sub3_6.method381(0);
									this.aClass1_Sub3_Sub3_6.method381(var8);
									this.aClass1_Sub3_Sub3_6.method381(var9);
									var6 += 3;
								}
							}
							if (var11 != 0) {
								var12 = signlink.cacheload("l" + var8 + "_" + var9);
								if (var12 != null) {
									this.aCRC32_1.reset();
									this.aCRC32_1.update(var12);
									if ((int) this.aCRC32_1.getValue() != var11) {
										var12 = null;
									}
								}
								if (var12 != null) {
									this.aByteArrayArray2[var7] = var12;
								} else {
									this.anInt307 = 0;
									this.aClass1_Sub3_Sub3_6.method381(1);
									this.aClass1_Sub3_Sub3_6.method381(var8);
									this.aClass1_Sub3_Sub3_6.method381(var9);
									var6 += 3;
								}
							}
						}
						this.aClass1_Sub3_Sub3_6.method390(0, var6);
						signlink.looprate(50);
						this.aClass32_27.method463((byte) 62);
						if (this.anInt307 == 0) {
							this.aClass1_Sub3_Sub2_Sub4_2.method362(166, (byte) 6, 0, "Map area updated since last visit, so load will take longer this time only", 257);
							this.aClass1_Sub3_Sub2_Sub4_2.method362(165, (byte) 6, 16777215, "Map area updated since last visit, so load will take longer this time only", 256);
						}
						this.aClass32_27.method464(11, super.aGraphics2, 8, 5193);
						var8 = this.anInt169 - this.anInt171;
						var9 = this.anInt170 - this.anInt172;
						this.anInt171 = this.anInt169;
						this.anInt172 = this.anInt170;
						for (var10 = 0; var10 < 8192; ++var10) {
							Class1_Sub1_Sub3_Sub1 var41 = this.aClass1_Sub1_Sub3_Sub1Array1[var10];
							if (var41 != null) {
								for (int var47 = 0; var47 < 10; ++var47) {
									var41.anIntArray232[var47] -= var8;
									var41.anIntArray233[var47] -= var9;
								}
								var41.anInt890 -= var8 * 128;
								var41.anInt891 -= var9 * 128;
							}
						}
						for (var11 = 0; var11 < this.anInt203; ++var11) {
							Class1_Sub1_Sub3_Sub2 var49 = this.aClass1_Sub1_Sub3_Sub2Array1[var11];
							if (var49 != null) {
								for (int var13 = 0; var13 < 10; ++var13) {
									var49.anIntArray232[var13] -= var8;
									var49.anIntArray233[var13] -= var9;
								}
								var49.anInt890 -= var8 * 128;
								var49.anInt891 -= var9 * 128;
							}
						}
						byte var50 = 0;
						byte var46 = 104;
						byte var14 = 1;
						if (var8 < 0) {
							var50 = 103;
							var46 = -1;
							var14 = -1;
						}
						byte var15 = 0;
						byte var16 = 104;
						byte var17 = 1;
						if (var9 < 0) {
							var15 = 103;
							var16 = -1;
							var17 = -1;
						}
						for (int var18 = var50; var18 != var46; var18 += var14) {
							for (int var19 = var15; var19 != var16; var19 += var17) {
								int var20 = var18 + var8;
								int var21 = var19 + var9;
								for (int var22 = 0; var22 < 4; ++var22) {
									if (var20 >= 0 && var21 >= 0 && var20 < 104 && var21 < 104) {
										this.aClass28ArrayArrayArray1[var22][var18][var19] = this.aClass28ArrayArrayArray1[var22][var20][var21];
									} else {
										this.aClass28ArrayArrayArray1[var22][var18][var19] = null;
									}
								}
							}
						}
						for (Class1_Sub4 var54 = (Class1_Sub4) this.aClass28_4.method456(); var54 != null; var54 = (Class1_Sub4) this.aClass28_4.method458(551)) {
							var54.anInt595 -= var8;
							var54.anInt596 -= var9;
							if (var54.anInt595 < 0 || var54.anInt596 < 0 || var54.anInt595 >= 104 || var54.anInt596 >= 104) {
								var54.method567();
							}
						}
						if (this.anInt296 != 0) {
							this.anInt296 -= var8;
							this.anInt297 -= var9;
						}
						this.aBoolean61 = false;
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 197) {
						var27 = this.aClass1_Sub3_Sub3_5.method393();
						Class15.aClass15Array1[var27].aClass1_Sub3_Sub1_2 = this.aClass1_Sub1_Sub3_Sub2_1.method574(-718);
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 25) {
						this.anInt241 = this.aClass1_Sub3_Sub3_5.method391();
						if (this.anInt241 == 1) {
							this.anInt190 = this.aClass1_Sub3_Sub3_5.method393();
						}
						if (this.anInt241 >= 2 && this.anInt241 <= 6) {
							if (this.anInt241 == 2) {
								this.anInt161 = 64;
								this.anInt162 = 64;
							}
							if (this.anInt241 == 3) {
								this.anInt161 = 0;
								this.anInt162 = 64;
							}
							if (this.anInt241 == 4) {
								this.anInt161 = 128;
								this.anInt162 = 64;
							}
							if (this.anInt241 == 5) {
								this.anInt161 = 64;
								this.anInt162 = 0;
							}
							if (this.anInt241 == 6) {
								this.anInt161 = 64;
								this.anInt162 = 128;
							}
							this.anInt241 = 2;
							this.anInt158 = this.aClass1_Sub3_Sub3_5.method393();
							this.anInt159 = this.aClass1_Sub3_Sub3_5.method393();
							this.anInt160 = this.aClass1_Sub3_Sub3_5.method391();
						}
						if (this.anInt241 == 10) {
							this.anInt305 = this.aClass1_Sub3_Sub3_5.method393();
						}
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 54) {
						var3 = this.aClass1_Sub3_Sub3_5.method398();
						var4 = this.aClass1_Sub3_Sub3_5.method396();
						var5 = this.aClass1_Sub3_Sub3_5.method396();
						if (!var3.equals(this.aString17) && this.aBoolean42 && !aBoolean53) {
							this.method75(false, var4, var3, var5);
						}
						this.aString17 = var3;
						this.anInt321 = var4;
						this.anInt343 = var5;
						this.anInt157 = 0;
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 142) {
						this.method119(-780);
						this.anInt179 = -1;
						return false;
					}
					if (this.anInt179 == 20) {
						var27 = this.aClass1_Sub3_Sub3_5.method391();
						var4 = this.aClass1_Sub3_Sub3_5.method391();
						var5 = -1;
						for (var6 = 0; var6 < this.anIntArray56.length; ++var6) {
							if (this.anIntArray56[var6] == (var27 << 8) + var4) {
								var5 = var6;
							}
						}
						if (var5 != -1) {
							signlink.cachesave("l" + var27 + "_" + var4, this.aByteArrayArray2[var5]);
							this.anInt307 = 1;
						}
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 19) {
						this.anInt296 = 0;
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 139) {
						this.anInt152 = this.aClass1_Sub3_Sub3_5.method393();
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 151 || this.anInt179 == 23 || this.anInt179 == 50 || this.anInt179 == 191 || this.anInt179 == 69 || this.anInt179 == 49 || this.anInt179 == 223 || this.anInt179 == 42 || this.anInt179 == 76 || this.anInt179 == 59) {
						this.method83((byte) -45, this.aClass1_Sub3_Sub3_5, this.anInt179);
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 28) {
						var27 = this.aClass1_Sub3_Sub3_5.method393();
						var4 = this.aClass1_Sub3_Sub3_5.method393();
						if (this.anInt280 != -1) {
							this.anInt280 = -1;
							this.aBoolean60 = true;
						}
						if (this.aBoolean66) {
							this.aBoolean66 = false;
							this.aBoolean60 = true;
						}
						this.anInt271 = var27;
						this.anInt330 = var4;
						this.aBoolean59 = true;
						this.aBoolean68 = true;
						this.aBoolean49 = false;
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 175) {
						var27 = this.aClass1_Sub3_Sub3_5.method393();
						var4 = this.aClass1_Sub3_Sub3_5.method396();
						this.anIntArray71[var27] = var4;
						if (this.anIntArray59[var27] != var4) {
							this.anIntArray59[var27] = var4;
							this.method122(var27, 49);
							this.aBoolean59 = true;
							if (this.anInt289 != -1) {
								this.aBoolean60 = true;
							}
						}
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 146) {
						var27 = this.aClass1_Sub3_Sub3_5.method393();
						var4 = this.aClass1_Sub3_Sub3_5.method393();
						Class15.aClass15Array1[var27].anInt488 = var4;
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 167) {
						var27 = this.aClass1_Sub3_Sub3_5.method393();
						var4 = this.aClass1_Sub3_Sub3_5.method391();
						if (var27 == 65535) {
							var27 = -1;
						}
						this.anIntArray46[var4] = var27;
						this.aBoolean59 = true;
						this.aBoolean68 = true;
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 220) {
						var27 = this.aClass1_Sub3_Sub3_5.method391();
						var4 = this.aClass1_Sub3_Sub3_5.method391();
						var5 = this.aClass1_Sub3_Sub3_5.method393();
						var6 = this.aClass1_Sub3_Sub3_5.method393();
						var7 = -1;
						for (var8 = 0; var8 < this.anIntArray56.length; ++var8) {
							if (this.anIntArray56[var8] == (var27 << 8) + var4) {
								var7 = var8;
							}
						}
						if (var7 != -1) {
							if (this.aByteArrayArray2[var7] == null || this.aByteArrayArray2[var7].length != var6) {
								this.aByteArrayArray2[var7] = new byte[var6];
							}
							this.aClass1_Sub3_Sub3_5.method400(this.anInt178 - 6, -110, var5, this.aByteArrayArray2[var7]);
						}
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 133) {
						Class1_Sub3_Sub3 var52 = Class8.method211(854);
						if (var52 != null) {
							this.aClass1_Sub3_Sub3_6.method380((byte) -34, 81);
							this.aClass1_Sub3_Sub3_6.method382(var52.anInt561);
							this.aClass1_Sub3_Sub3_6.method389(var52.aByteArray7, var52.anInt561, 0, (byte) -106);
							var52.method379((byte) 8);
						}
						this.anInt179 = -1;
						return true;
					}
					Class15 var28;
					if (this.anInt179 == 98) {
						this.aBoolean59 = true;
						var27 = this.aClass1_Sub3_Sub3_5.method393();
						var28 = Class15.aClass15Array1[var27];
						var5 = this.aClass1_Sub3_Sub3_5.method391();
						for (var6 = 0; var6 < var5; ++var6) {
							var28.anIntArray149[var6] = this.aClass1_Sub3_Sub3_5.method393();
							var7 = this.aClass1_Sub3_Sub3_5.method391();
							if (var7 == 255) {
								var7 = this.aClass1_Sub3_Sub3_5.method396();
							}
							var28.anIntArray150[var6] = var7;
						}
						for (var7 = var5; var7 < var28.anIntArray149.length; ++var7) {
							var28.anIntArray149[var7] = 0;
							var28.anIntArray150[var7] = 0;
						}
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 226) {
						Class8.method208(-31717);
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 243) {
						this.aBoolean47 = false;
						this.aBoolean66 = true;
						this.aString7 = "";
						this.aBoolean60 = true;
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 15) {
						var27 = this.aClass1_Sub3_Sub3_5.method393();
						var28 = Class15.aClass15Array1[var27];
						for (var5 = 0; var5 < var28.anIntArray149.length; ++var5) {
							var28.anIntArray149[var5] = -1;
							var28.anIntArray149[var5] = 0;
						}
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 140) {
						this.anInt299 = this.aClass1_Sub3_Sub3_5.method396();
						this.anInt226 = this.aClass1_Sub3_Sub3_5.method393();
						this.anInt239 = this.aClass1_Sub3_Sub3_5.method391();
						this.anInt298 = this.aClass1_Sub3_Sub3_5.method393();
						if (this.anInt299 != 0 && this.anInt271 == -1) {
							signlink.dnslookup(Class40.method541(-946, this.anInt299));
							this.method77((byte) -60);
							short var48 = 650;
							if (this.anInt239 != 201) {
								var48 = 655;
							}
							this.aString9 = "";
							this.aBoolean51 = false;
							for (var4 = 0; var4 < Class15.aClass15Array1.length; ++var4) {
								if (Class15.aClass15Array1[var4] != null && Class15.aClass15Array1[var4].anInt474 == var48) {
									this.anInt271 = Class15.aClass15Array1[var4].anInt471;
									break;
								}
							}
						}
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 126) {
						this.anInt329 = this.aClass1_Sub3_Sub3_5.method391();
						if (this.anInt329 == this.anInt166) {
							if (this.anInt329 == 3) {
								this.anInt166 = 1;
							} else {
								this.anInt166 = 3;
							}
							this.aBoolean59 = true;
						}
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 212) {
						if (this.aBoolean42 && !aBoolean53) {
							var27 = this.aClass1_Sub3_Sub3_5.method393();
							var4 = this.aClass1_Sub3_Sub3_5.method396();
							var5 = this.anInt178 - 6;
							byte[] var36 = new byte[var4];
							Class34.method519(var36, var4, this.aClass1_Sub3_Sub3_5.aByteArray7, var5, this.aClass1_Sub3_Sub3_5.anInt561);
							this.method113(var36, 625, var4, false);
							this.anInt157 = var27;
						}
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 254) {
						this.anInt276 = this.aClass1_Sub3_Sub3_5.method391();
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 12) {
						var27 = this.aClass1_Sub3_Sub3_5.method393();
						var4 = this.aClass1_Sub3_Sub3_5.method391();
						var5 = this.aClass1_Sub3_Sub3_5.method393();
						if (this.aBoolean73 && !aBoolean53 && this.anInt286 < 50) {
							this.anIntArray82[this.anInt286] = var27;
							this.anIntArray37[this.anInt286] = var4;
							this.anIntArray45[this.anInt286] = var5 + Class43.anIntArray231[var27];
							++this.anInt286;
						}
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 204) {
						var27 = this.aClass1_Sub3_Sub3_5.method393();
						var4 = this.aClass1_Sub3_Sub3_5.method393();
						Class3 var34 = Class3.method32(var4);
						Class15.aClass15Array1[var27].aClass1_Sub3_Sub1_2 = var34.method35(false);
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 7) {
						this.anInt222 = this.aClass1_Sub3_Sub3_5.method391();
						this.anInt223 = this.aClass1_Sub3_Sub3_5.method391();
						this.anInt179 = -1;
						return true;
					}
					Class15 var35;
					if (this.anInt179 == 103) {
						var27 = this.aClass1_Sub3_Sub3_5.method393();
						var4 = this.aClass1_Sub3_Sub3_5.method393();
						var5 = this.aClass1_Sub3_Sub3_5.method393();
						var35 = Class15.aClass15Array1[var27];
						Class1_Sub3_Sub1 var44 = var35.aClass1_Sub3_Sub1_2;
						if (var44 != null) {
							var44.method237(var4, var5);
						}
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 32) {
						this.anInt273 = this.aClass1_Sub3_Sub3_5.method391();
						this.anInt164 = this.aClass1_Sub3_Sub3_5.method391();
						this.anInt234 = this.aClass1_Sub3_Sub3_5.method391();
						this.aBoolean56 = true;
						this.aBoolean60 = true;
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 195) {
						var27 = this.aClass1_Sub3_Sub3_5.method393();
						this.method173(-321, var27);
						if (this.anInt280 != -1) {
							this.anInt280 = -1;
							this.aBoolean60 = true;
						}
						if (this.aBoolean66) {
							this.aBoolean66 = false;
							this.aBoolean60 = true;
						}
						this.anInt330 = var27;
						this.aBoolean59 = true;
						this.aBoolean68 = true;
						this.anInt271 = -1;
						this.aBoolean49 = false;
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 14) {
						var27 = this.aClass1_Sub3_Sub3_5.method393();
						this.method173(-321, var27);
						if (this.anInt330 != -1) {
							this.anInt330 = -1;
							this.aBoolean59 = true;
							this.aBoolean68 = true;
						}
						this.anInt280 = var27;
						this.aBoolean60 = true;
						this.anInt271 = -1;
						this.aBoolean49 = false;
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 209) {
						var27 = this.aClass1_Sub3_Sub3_5.method393();
						var4 = this.aClass1_Sub3_Sub3_5.method394();
						var5 = this.aClass1_Sub3_Sub3_5.method394();
						var35 = Class15.aClass15Array1[var27];
						var35.anInt477 = var4;
						var35.anInt478 = var5;
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 3) {
						this.aBoolean61 = true;
						this.anInt146 = this.aClass1_Sub3_Sub3_5.method391();
						this.anInt147 = this.aClass1_Sub3_Sub3_5.method391();
						this.anInt148 = this.aClass1_Sub3_Sub3_5.method393();
						this.anInt149 = this.aClass1_Sub3_Sub3_5.method391();
						this.anInt150 = this.aClass1_Sub3_Sub3_5.method391();
						if (this.anInt150 >= 100) {
							this.anInt322 = this.anInt146 * 128 + 64;
							this.anInt324 = this.anInt147 * 128 + 64;
							this.anInt323 = this.method94(this.anInt231, this.anInt146, (byte) 5, this.anInt147) - this.anInt148;
						}
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 135) {
						this.anInt222 = this.aClass1_Sub3_Sub3_5.method391();
						this.anInt223 = this.aClass1_Sub3_Sub3_5.method391();
						for (var27 = this.anInt222; var27 < this.anInt222 + 8; ++var27) {
							for (var4 = this.anInt223; var4 < this.anInt223 + 8; ++var4) {
								if (this.aClass28ArrayArrayArray1[this.anInt231][var27][var4] != null) {
									this.aClass28ArrayArrayArray1[this.anInt231][var27][var4] = null;
									this.method184(var27, var4);
								}
							}
						}
						for (Class1_Sub4 var37 = (Class1_Sub4) this.aClass28_4.method456(); var37 != null; var37 = (Class1_Sub4) this.aClass28_4.method458(551)) {
							if (var37.anInt595 >= this.anInt222 && var37.anInt595 < this.anInt222 + 8 && var37.anInt596 >= this.anInt223 && var37.anInt596 < this.anInt223 + 8 && var37.anInt593 == this.anInt231) {
								this.method160(var37.anInt601, var37.anInt595, var37.anInt596, var37.anInt594, var37.anInt600, var37.anInt602, -27819, var37.anInt593);
								var37.method567();
							}
						}
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 132) {
						var27 = this.aClass1_Sub3_Sub3_5.method391();
						var4 = this.aClass1_Sub3_Sub3_5.method391();
						var5 = this.aClass1_Sub3_Sub3_5.method393();
						var6 = this.aClass1_Sub3_Sub3_5.method393();
						var7 = -1;
						for (var8 = 0; var8 < this.anIntArray56.length; ++var8) {
							if (this.anIntArray56[var8] == (var27 << 8) + var4) {
								var7 = var8;
							}
						}
						if (var7 != -1) {
							if (this.aByteArrayArray1[var7] == null || this.aByteArrayArray1[var7].length != var6) {
								this.aByteArrayArray1[var7] = new byte[var6];
							}
							this.aClass1_Sub3_Sub3_5.method400(this.anInt178 - 6, -110, var5, this.aByteArrayArray1[var7]);
						}
						this.anInt179 = -1;
						return true;
					}
					boolean var33;
					if (this.anInt179 == 41) {
						var40 = this.aClass1_Sub3_Sub3_5.method397(603);
						var5 = this.aClass1_Sub3_Sub3_5.method396();
						var6 = this.aClass1_Sub3_Sub3_5.method391();
						var33 = false;
						for (var8 = 0; var8 < 100; ++var8) {
							if (this.anIntArray48[var8] == var5) {
								var33 = true;
								break;
							}
						}
						if (var6 <= 1) {
							for (var9 = 0; var9 < this.anInt186; ++var9) {
								if (this.aLongArray3[var9] == var40) {
									var33 = true;
									break;
								}
							}
						}
						if (!var33 && this.anInt191 == 0) {
							try {
								this.anIntArray48[this.anInt219] = var5;
								this.anInt219 = (this.anInt219 + 1) % 100;
								String var38 = Class41.method545(this.aClass1_Sub3_Sub3_5, 118, this.anInt178 - 13);
								String var39 = Class25.method424(var38, 0);
								if (var6 > 1) {
									this.method172(7, var39, (byte) 4, Class40.method542(0, Class40.method539(var40, false)));
								} else {
									this.method172(3, var39, (byte) 4, Class40.method542(0, Class40.method539(var40, false)));
								}
							} catch (Exception var23) {
								signlink.reporterror("cde1");
							}
						}
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 193) {
						for (var27 = 0; var27 < this.anIntArray59.length; ++var27) {
							if (this.anIntArray59[var27] != this.anIntArray71[var27]) {
								this.anIntArray59[var27] = this.anIntArray71[var27];
								this.method122(var27, 49);
								this.aBoolean59 = true;
							}
						}
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 87) {
						var27 = this.aClass1_Sub3_Sub3_5.method393();
						var4 = this.aClass1_Sub3_Sub3_5.method393();
						Class15.aClass15Array1[var27].aClass1_Sub3_Sub1_2 = new Class1_Sub3_Sub1(false, var4);
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 185) {
						var27 = this.aClass1_Sub3_Sub3_5.method394();
						this.anInt289 = var27;
						this.aBoolean60 = true;
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 68) {
						if (this.anInt166 == 12) {
							this.aBoolean59 = true;
						}
						this.anInt303 = this.aClass1_Sub3_Sub3_5.method391();
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 74) {
						this.aBoolean61 = true;
						this.anInt261 = this.aClass1_Sub3_Sub3_5.method391();
						this.anInt262 = this.aClass1_Sub3_Sub3_5.method391();
						this.anInt263 = this.aClass1_Sub3_Sub3_5.method393();
						this.anInt264 = this.aClass1_Sub3_Sub3_5.method391();
						this.anInt265 = this.aClass1_Sub3_Sub3_5.method391();
						if (this.anInt265 >= 100) {
							var27 = this.anInt261 * 128 + 64;
							var4 = this.anInt262 * 128 + 64;
							var5 = this.method94(this.anInt231, this.anInt261, (byte) 5, this.anInt262) - this.anInt263;
							var6 = var27 - this.anInt322;
							var7 = var5 - this.anInt323;
							var8 = var4 - this.anInt324;
							var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
							this.anInt325 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 2047;
							this.anInt326 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 2047;
							if (this.anInt325 < 128) {
								this.anInt325 = 128;
							}
							if (this.anInt325 > 383) {
								this.anInt325 = 383;
							}
						}
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 84) {
						this.anInt166 = this.aClass1_Sub3_Sub3_5.method391();
						this.aBoolean59 = true;
						this.aBoolean68 = true;
						this.anInt179 = -1;
						return true;
					}
					String var29;
					if (this.anInt179 == 4) {
						var3 = this.aClass1_Sub3_Sub3_5.method398();
						long var31;
						if (var3.endsWith(":tradereq:")) {
							var29 = var3.substring(0, var3.indexOf(":"));
							var31 = Class40.method538(var29);
							var33 = false;
							for (var8 = 0; var8 < this.anInt186; ++var8) {
								if (this.aLongArray3[var8] == var31) {
									var33 = true;
									break;
								}
							}
							if (!var33 && this.anInt191 == 0) {
								this.method172(4, "wishes to trade with you.", (byte) 4, var29);
							}
						} else if (!var3.endsWith(":duelreq:")) {
							this.method172(0, var3, (byte) 4, "");
						} else {
							var29 = var3.substring(0, var3.indexOf(":"));
							var31 = Class40.method538(var29);
							var33 = false;
							for (var8 = 0; var8 < this.anInt186; ++var8) {
								if (this.aLongArray3[var8] == var31) {
									var33 = true;
									break;
								}
							}
							if (!var33 && this.anInt191 == 0) {
								this.method172(8, "wishes to duel with you.", (byte) 4, var29);
							}
						}
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 46) {
						var27 = this.aClass1_Sub3_Sub3_5.method393();
						var4 = this.aClass1_Sub3_Sub3_5.method393();
						var5 = this.aClass1_Sub3_Sub3_5.method393();
						Class5 var32 = Class5.method54(var4);
						Class15.aClass15Array1[var27].aClass1_Sub3_Sub1_2 = var32.method58(50);
						Class15.aClass15Array1[var27].anInt491 = var32.anInt106;
						Class15.aClass15Array1[var27].anInt492 = var32.anInt107;
						Class15.aClass15Array1[var27].anInt490 = var32.anInt105 * 100 / var5;
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 168) {
						var27 = this.aClass1_Sub3_Sub3_5.method393();
						this.method173(-321, var27);
						if (this.anInt330 != -1) {
							this.anInt330 = -1;
							this.aBoolean59 = true;
							this.aBoolean68 = true;
						}
						if (this.anInt280 != -1) {
							this.anInt280 = -1;
							this.aBoolean60 = true;
						}
						if (this.aBoolean66) {
							this.aBoolean66 = false;
							this.aBoolean60 = true;
						}
						this.anInt271 = var27;
						this.aBoolean49 = false;
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 2) {
						var27 = this.aClass1_Sub3_Sub3_5.method393();
						var4 = this.aClass1_Sub3_Sub3_5.method393();
						var5 = var4 >> 10 & 31;
						var6 = var4 >> 5 & 31;
						var7 = var4 & 31;
						Class15.aClass15Array1[var27].anInt485 = (var5 << 19) + (var6 << 11) + (var7 << 3);
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 136) {
						for (var27 = 0; var27 < this.aClass1_Sub1_Sub3_Sub2Array1.length; ++var27) {
							if (this.aClass1_Sub1_Sub3_Sub2Array1[var27] != null) {
								this.aClass1_Sub1_Sub3_Sub2Array1[var27].anInt915 = -1;
							}
						}
						for (var4 = 0; var4 < this.aClass1_Sub1_Sub3_Sub1Array1.length; ++var4) {
							if (this.aClass1_Sub1_Sub3_Sub1Array1[var4] != null) {
								this.aClass1_Sub1_Sub3_Sub1Array1[var4].anInt915 = -1;
							}
						}
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 26) {
						var27 = this.aClass1_Sub3_Sub3_5.method393();
						boolean var30 = this.aClass1_Sub3_Sub3_5.method391() == 1;
						Class15.aClass15Array1[var27].aBoolean106 = var30;
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 21) {
						this.anInt186 = this.anInt178 / 8;
						for (var27 = 0; var27 < this.anInt186; ++var27) {
							this.aLongArray3[var27] = this.aClass1_Sub3_Sub3_5.method397(603);
						}
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 239) {
						this.aBoolean61 = false;
						for (var27 = 0; var27 < 5; ++var27) {
							this.aBooleanArray1[var27] = false;
						}
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 129) {
						if (this.anInt330 != -1) {
							this.anInt330 = -1;
							this.aBoolean59 = true;
							this.aBoolean68 = true;
						}
						if (this.anInt280 != -1) {
							this.anInt280 = -1;
							this.aBoolean60 = true;
						}
						if (this.aBoolean66) {
							this.aBoolean66 = false;
							this.aBoolean60 = true;
						}
						this.anInt271 = -1;
						this.aBoolean49 = false;
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 201) {
						var27 = this.aClass1_Sub3_Sub3_5.method393();
						var29 = this.aClass1_Sub3_Sub3_5.method398();
						Class15.aClass15Array1[var27].aString20 = var29;
						if (Class15.aClass15Array1[var27].anInt471 == this.anIntArray46[this.anInt166]) {
							this.aBoolean59 = true;
						}
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 44) {
						this.aBoolean59 = true;
						var27 = this.aClass1_Sub3_Sub3_5.method391();
						var4 = this.aClass1_Sub3_Sub3_5.method396();
						var5 = this.aClass1_Sub3_Sub3_5.method391();
						this.anIntArray72[var27] = var4;
						this.anIntArray36[var27] = var5;
						this.anIntArray57[var27] = 1;
						for (var6 = 0; var6 < 98; ++var6) {
							if (var4 >= anIntArray47[var6]) {
								this.anIntArray57[var27] = var6 + 2;
							}
						}
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 162) {
						this.anInt222 = this.aClass1_Sub3_Sub3_5.method391();
						this.anInt223 = this.aClass1_Sub3_Sub3_5.method391();
						while (this.aClass1_Sub3_Sub3_5.anInt561 < this.anInt178) {
							var27 = this.aClass1_Sub3_Sub3_5.method391();
							this.method83((byte) -45, this.aClass1_Sub3_Sub3_5, var27);
						}
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 22) {
						if (this.anInt166 == 12) {
							this.aBoolean59 = true;
						}
						this.anInt173 = this.aClass1_Sub3_Sub3_5.method394();
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 13) {
						var27 = this.aClass1_Sub3_Sub3_5.method391();
						var4 = this.aClass1_Sub3_Sub3_5.method391();
						var5 = this.aClass1_Sub3_Sub3_5.method391();
						var6 = this.aClass1_Sub3_Sub3_5.method391();
						this.aBooleanArray1[var27] = true;
						this.anIntArray62[var27] = var4;
						this.anIntArray63[var27] = var5;
						this.anIntArray88[var27] = var6;
						this.anIntArray68[var27] = 0;
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 213) {
						this.aBoolean59 = true;
						var27 = this.aClass1_Sub3_Sub3_5.method393();
						var28 = Class15.aClass15Array1[var27];
						while (this.aClass1_Sub3_Sub3_5.anInt561 < this.anInt178) {
							var5 = this.aClass1_Sub3_Sub3_5.method391();
							var6 = this.aClass1_Sub3_Sub3_5.method393();
							var7 = this.aClass1_Sub3_Sub3_5.method391();
							if (var7 == 255) {
								var7 = this.aClass1_Sub3_Sub3_5.method396();
							}
							if (var5 >= 0 && var5 < var28.anIntArray149.length) {
								var28.anIntArray149[var5] = var6;
								var28.anIntArray150[var5] = var7;
							}
						}
						this.anInt179 = -1;
						return true;
					}
					if (this.anInt179 == 184) {
						this.method170(this.aClass1_Sub3_Sub3_5, this.anInt178, 822);
						if (this.anInt307 == 1) {
							this.anInt307 = 2;
							Class4.anInt81 = this.anInt231;
							this.method185(869);
						}
						if (aBoolean53 && this.anInt307 == 2 && Class4.anInt81 != this.anInt231) {
							this.aClass32_27.method463((byte) 62);
							this.aClass1_Sub3_Sub2_Sub4_2.method362(151, (byte) 6, 0, "Loading - please wait.", 257);
							this.aClass1_Sub3_Sub2_Sub4_2.method362(150, (byte) 6, 16777215, "Loading - please wait.", 256);
							this.aClass32_27.method464(11, super.aGraphics2, 8, 5193);
							Class4.anInt81 = this.anInt231;
							this.method185(869);
						}
						if (this.anInt231 != this.anInt176 && this.anInt307 == 2) {
							this.anInt176 = this.anInt231;
							this.method106(this.anInt231, -153);
						}
						this.anInt179 = -1;
						return true;
					}
					signlink.reporterror("T1 - " + this.anInt179 + "," + this.anInt178 + " - " + this.anInt208 + "," + this.anInt209);
					this.method119(-780);
				} catch (IOException var24) {
					this.method182(false);
				} catch (Exception var25) {
					var3 = "T2 - " + this.anInt179 + "," + this.anInt208 + "," + this.anInt209 + " - " + this.anInt178 + "," + (this.anInt169 + this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0]) + "," + (this.anInt170 + this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0]) + " - ";
					for (var4 = 0; var4 < this.anInt178 && var4 < 50; ++var4) {
						var3 = var3 + this.aClass1_Sub3_Sub3_5.aByteArray7[var4] + ",";
					}
					signlink.reporterror(var3);
					this.method119(-780);
				}
				return true;
			}
		} catch (RuntimeException var26) {
			signlink.reporterror("50315, " + arg0 + ", " + var26.toString());
			throw new RuntimeException();
		}
	}

	public final void method198(byte arg0) {
		try {
			this.aClass32_25.method463((byte) 62);
			Class1_Sub3_Sub2_Sub1.anIntArray139 = this.anIntArray31;
			this.aClass1_Sub3_Sub2_Sub3_9.method350(0, 0, false);
			if (this.anInt330 != -1) {
				this.method120(0, 0, 38682, Class15.aClass15Array1[this.anInt330], 0);
			} else if (this.anIntArray46[this.anInt166] != -1) {
				this.method120(0, 0, 38682, Class15.aClass15Array1[this.anIntArray46[this.anInt166]], 0);
			}
			if (this.aBoolean50 && this.anInt337 == 1) {
				this.method135(-961);
			}
			this.aClass32_25.method464(231, super.aGraphics2, 562, 5193);
			if (arg0 == 2) {
				boolean var4 = false;
				this.aClass32_27.method463((byte) 62);
				Class1_Sub3_Sub2_Sub1.anIntArray139 = this.anIntArray32;
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("63572, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public final boolean method199(int arg0, String arg1) {
		try {
			while (arg0 >= 0) {
				this.aClass1_Sub3_Sub3_6.method381(74);
			}
			if (arg1 == null) {
				return false;
			} else {
				for (int var3 = 0; var3 < this.anInt312; ++var3) {
					if (arg1.equalsIgnoreCase(this.aStringArray9[var3])) {
						return true;
					}
				}
				if (arg1.equalsIgnoreCase(this.aClass1_Sub1_Sub3_Sub2_1.aString30)) {
					return true;
				} else {
					return false;
				}
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("64810, " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	public final void init() {
		anInt235 = Integer.parseInt(this.getParameter("nodeid"));
		anInt236 = Integer.parseInt(this.getParameter("portoff"));
		String var1 = this.getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method88(true);
		} else {
			method167(9);
		}
		String var2 = this.getParameter("free");
		if (var2 != null && var2.equals("1")) {
			aBoolean52 = false;
		} else {
			aBoolean52 = true;
		}
		this.method63(532, false, 789);
	}

	private final void method200(boolean arg0, int arg1, int arg2, Class1_Sub3_Sub3 arg3, Class1_Sub1_Sub3_Sub2 arg4) {
		try {
			if (!arg0) {
				this.aBoolean44 = !this.aBoolean44;
			}
			int var6;
			if ((arg2 & 1) == 1) {
				var6 = arg3.method391();
				byte[] var7 = new byte[var6];
				Class1_Sub3_Sub3 var8 = new Class1_Sub3_Sub3(363, var7);
				arg3.method400(var6, -110, 0, var7);
				this.aClass1_Sub3_Sub3Array1[arg1] = var8;
				arg4.method572(false, var8);
			}
			int var16;
			if ((arg2 & 2) == 2) {
				var6 = arg3.method393();
				if (var6 == 65535) {
					var6 = -1;
				}
				if (var6 == arg4.anInt915) {
					arg4.anInt919 = 0;
				}
				var16 = arg3.method391();
				if (var6 == -1 || arg4.anInt915 == -1 || Class19.aClass19Array1[var6].anInt545 > Class19.aClass19Array1[arg4.anInt915].anInt545 || Class19.aClass19Array1[arg4.anInt915].anInt545 == 0) {
					arg4.anInt915 = var6;
					arg4.anInt916 = 0;
					arg4.anInt917 = 0;
					arg4.anInt918 = var16;
					arg4.anInt919 = 0;
				}
			}
			if ((arg2 & 4) == 4) {
				arg4.anInt909 = arg3.method393();
				if (arg4.anInt909 == 65535) {
					arg4.anInt909 = -1;
				}
			}
			if ((arg2 & 8) == 8) {
				arg4.aString29 = arg3.method398();
				arg4.anInt902 = 0;
				arg4.anInt903 = 0;
				arg4.anInt901 = 150;
				this.method172(2, arg4.aString29, (byte) 4, arg4.aString30);
			}
			if ((arg2 & 16) == 16) {
				arg4.anInt904 = arg3.method391();
				arg4.anInt905 = arg3.method391();
				arg4.anInt906 = anInt266 + 400;
				arg4.anInt907 = arg3.method391();
				arg4.anInt908 = arg3.method391();
			}
			if ((arg2 & 32) == 32) {
				arg4.anInt910 = arg3.method393();
				arg4.anInt911 = arg3.method393();
			}
			if ((arg2 & 64) == 64) {
				var6 = arg3.method393();
				var16 = arg3.method391();
				int var17 = arg3.method391();
				int var9 = arg3.anInt561;
				if (arg4.aString30 != null) {
					long var10 = Class40.method538(arg4.aString30);
					boolean var12 = false;
					if (var16 <= 1) {
						for (int var13 = 0; var13 < this.anInt186; ++var13) {
							if (this.aLongArray3[var13] == var10) {
								var12 = true;
								break;
							}
						}
					}
					if (!var12 && this.anInt191 == 0) {
						try {
							String var18 = Class41.method545(arg3, 118, var17);
							String var19 = Class25.method424(var18, 0);
							arg4.aString29 = var19;
							arg4.anInt902 = var6 >> 8;
							arg4.anInt903 = var6 & 255;
							arg4.anInt901 = 150;
							if (var16 > 1) {
								this.method172(1, var19, (byte) 4, arg4.aString30);
							} else {
								this.method172(2, var19, (byte) 4, arg4.aString30);
							}
						} catch (Exception var14) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg3.anInt561 = var9 + var17;
			}
			if ((arg2 & 256) == 256) {
				arg4.anInt920 = arg3.method393();
				var6 = arg3.method396();
				arg4.anInt924 = var6 >> 16;
				arg4.anInt923 = anInt266 + (var6 & 65535);
				arg4.anInt921 = 0;
				arg4.anInt922 = 0;
				if (arg4.anInt923 > anInt266) {
					arg4.anInt921 = -1;
				}
				if (arg4.anInt920 == 65535) {
					arg4.anInt920 = -1;
				}
			}
			if ((arg2 & 512) == 512) {
				arg4.anInt925 = arg3.method391();
				arg4.anInt927 = arg3.method391();
				arg4.anInt926 = arg3.method391();
				arg4.anInt928 = arg3.method391();
				arg4.anInt929 = arg3.method393() + anInt266;
				arg4.anInt930 = arg3.method393() + anInt266;
				arg4.anInt931 = arg3.method391();
				arg4.anInt935 = 0;
				arg4.anIntArray232[0] = arg4.anInt926;
				arg4.anIntArray233[0] = arg4.anInt928;
			}
		} catch (RuntimeException var15) {
			signlink.reporterror("94218, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + var15.toString());
			throw new RuntimeException();
		}
	}

	public final void method74(boolean arg0, String arg1, int arg2) {
		try {
			this.method156((byte) 99);
			if (this.aClass39_1 == null) {
				super.method74(true, arg1, arg2);
			} else {
				this.aClass32_18.method463((byte) 62);
				short var4 = 360;
				short var5 = 200;
				byte var6 = 20;
				this.aClass1_Sub3_Sub2_Sub4_3.method362(var5 / 2 - 26 - var6, (byte) 6, 16777215, "RuneScape is loading - please wait...", var4 / 2);
				this.aBoolean62 &= arg0;
				int var7 = var5 / 2 - 18 - var6;
				Class1_Sub3_Sub2.method359(3, var4 / 2 - 152, 9179409, 34, var7, 304);
				Class1_Sub3_Sub2.method359(3, var4 / 2 - 151, 0, 32, var7 + 1, 302);
				Class1_Sub3_Sub2.method358(var7 + 2, var4 / 2 - 150, 9179409, (byte) 93, arg2 * 3, 30);
				Class1_Sub3_Sub2.method358(var7 + 2, var4 / 2 - 150 + arg2 * 3, 0, (byte) 93, 300 - arg2 * 3, 30);
				this.aClass1_Sub3_Sub2_Sub4_3.method362(var5 / 2 + 5 - var6, (byte) 6, 16777215, arg1, var4 / 2);
				this.aClass32_18.method464(186, super.aGraphics2, 214, 5193);
				if (this.aBoolean37) {
					this.aBoolean37 = false;
					if (!this.aBoolean54) {
						this.aClass32_19.method464(0, super.aGraphics2, 0, 5193);
						this.aClass32_20.method464(0, super.aGraphics2, 661, 5193);
					}
					this.aClass32_16.method464(0, super.aGraphics2, 128, 5193);
					this.aClass32_17.method464(386, super.aGraphics2, 214, 5193);
					this.aClass32_21.method464(265, super.aGraphics2, 0, 5193);
					this.aClass32_22.method464(265, super.aGraphics2, 574, 5193);
					this.aClass32_23.method464(186, super.aGraphics2, 128, 5193);
					this.aClass32_24.method464(186, super.aGraphics2, 574, 5193);
				}
			}
		} catch (RuntimeException var8) {
			signlink.reporterror("68527, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 225);
			if (arg0.length != 4) {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members]");
			} else {
				anInt235 = Integer.parseInt(arg0[0]);
				anInt236 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method88(true);
				} else {
					if (!arg0[2].equals("highmem")) {
						System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members]");
						return;
					}
					method167(9);
				}
				if (arg0[3].equals("free")) {
					aBoolean52 = false;
				} else {
					if (!arg0[3].equals("members")) {
						System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members]");
						return;
					}
					aBoolean52 = true;
				}
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method62(532, 789, 0);
			}
		} catch (Exception var2) {
		}
	}

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; ++var1) {
			int var2 = var1 + 1;
			int var3 = (int) ((double) var2 + 300.0D * Math.pow(2.0D, (double) var2 / 7.0D));
			var0 += var3;
			anIntArray47[var1] = var0 / 4;
		}
		aBoolean48 = true;
		aByte13 = 15;
		anInt235 = 10;
		aBoolean52 = true;
		anInt238 = 629;
		aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		anIntArrayArray4 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
		anInt268 = 3;
		aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
		anIntArray70 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		aByte16 = 3;
	}
}
