package com.jagex;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public abstract class Class23 {

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "F")
	public static final float aFloat99 = Float.POSITIVE_INFINITY;

	@OriginalMember(owner = "client!ha", name = "ak", descriptor = "I")
	static final int anInt587 = 50;

	@OriginalMember(owner = "client!ha", name = "aa", descriptor = "I")
	static final int anInt588 = 10000;

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "Lclient!gs;")
	Class208 aClass208_2;

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "Lclient!gl;")
	Class201 aClass201_2;

	@OriginalMember(owner = "client!ha", name = "at", descriptor = "F")
	float aFloat97;

	@OriginalMember(owner = "client!ha", name = "x", descriptor = "Lclient!go;")
	Class204 aClass204_2;

	@OriginalMember(owner = "client!ha", name = "s", descriptor = "Lclient!id;")
	Class30 aClass30_2;

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "Lclient!wu;")
	Class69 aClass69_2;

	@OriginalMember(owner = "client!ha", name = "as", descriptor = "Z")
	boolean aBoolean141;

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
	int anInt586;

	@OriginalMember(owner = "client!ha", name = "y", descriptor = "Lclient!gi;")
	Class198 aClass198_2;

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "F")
	float aFloat105;

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "F")
	float aFloat106;

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "F")
	float aFloat107;

	@OriginalMember(owner = "client!ha", name = "af", descriptor = "F")
	float aFloat108;

	@OriginalMember(owner = "client!ha", name = "ah", descriptor = "F")
	float aFloat109;

	@OriginalMember(owner = "client!ha", name = "an", descriptor = "F")
	float aFloat110;

	@OriginalMember(owner = "client!ha", name = "aj", descriptor = "Z")
	boolean aBoolean142;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "Lclient!gb;")
	Class192 aClass192_2;

	@OriginalMember(owner = "client!ha", name = "z", descriptor = "Lclient!mh;")
	final Class320 aClass320_9 = new Class320();

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "Lclient!mh;")
	final Class320 aClass320_10 = new Class320();

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "Lclient!mh;")
	final Class320 aClass320_11 = new Class320();

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "Lclient!mh;")
	final Class320 aClass320_8 = new Class320();

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "F")
	final float aFloat100 = 5120.0F;

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "F")
	final float aFloat101 = 10.0F;

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "F")
	final float aFloat102 = 1.0F;

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "F")
	float aFloat103 = 5120.0F;

	@OriginalMember(owner = "client!ha", name = "t", descriptor = "F")
	float aFloat104 = 10.0F;

	@OriginalMember(owner = "client!ha", name = "w", descriptor = "F")
	float aFloat98 = 1.0F;

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "Lclient!mh;")
	final Class320 aClass320_13 = new Class320();

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "Lclient!mh;")
	final Class320 aClass320_12 = new Class320();

	@OriginalMember(owner = "client!ha", name = "ai", descriptor = "I")
	int anInt589 = 0;

	@OriginalMember(owner = "client!ha", name = "aq", descriptor = "F")
	float aFloat111 = 1.0F;

	@OriginalMember(owner = "client!ha", name = "av", descriptor = "Lclient!xn;")
	Class581 aClass581_4 = new Class581(8);

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "Lclient!gw;")
	final Class212 aClass212_2;

	@OriginalMember(owner = "client!ha", name = "u", descriptor = "Lclient!gg;")
	final Interface15 anInterface15_2;

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "(Ljava/lang/String;ZLjava/lang/String;ZI)V", line = 32)
	public static void method5938(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3) {
		if (!arg1) {
			Class369.method26934(arg0, 3);
			return;
		}
		if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
			try {
				Desktop.getDesktop().browse(new URI(arg0));
				return;
			} catch (@Pc(17) Exception local17) {
			}
		}
		if (Class391.aString215.startsWith("win") && !arg3) {
			Class369.method26934(arg0, 0);
			return;
		}
		if (Class391.aString215.startsWith("mac")) {
			Class361.method26768(arg0, 1, arg2);
			return;
		}
		Class369.method26934(arg0, 2);
	}

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lclient!gw;Lclient!gg;)V", line = 68)
	Class23(@OriginalArg(0) Class212 arg0, @OriginalArg(1) Interface15 arg1) {
		this.aClass212_2 = arg0;
		this.anInterface15_2 = arg1;
		this.method5798(true);
	}

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "(ZI)V", line = 75)
	public void method5798(@OriginalArg(0) boolean arg0) {
		this.aClass201_2 = Class201.aClass201_5;
		this.aClass208_2 = null;
		this.aClass69_2 = null;
		this.aClass204_2 = null;
		this.aClass30_2 = null;
		if (Class212.aClass212_3 != this.aClass212_2 && arg0) {
			this.aClass192_2 = Class192.aClass192_3;
		} else {
			this.aClass192_2 = Class192.aClass192_4;
		}
		this.aClass198_2 = Class198.aClass198_3;
		this.aClass320_9.method25863(100.0F, 100.0F, 100.0F);
		this.aClass320_10.method25863(100.0F, 100.0F, 100.0F);
		this.aFloat107 = 0.05F;
		this.aClass320_11.method25863(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		this.aClass320_8.method25863(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		this.aClass320_13.method25863(1.0F, 1.0F, 1.0F);
		this.aClass320_12.method25863(1.0F, 1.0F, 1.0F);
		this.aFloat106 = 1.1F;
		this.aFloat105 = 1.1F;
		this.aFloat97 = 50.0F;
		this.aFloat108 = 10000.0F;
		this.aFloat110 = 1.5707964F;
		this.aFloat109 = 1.5707964F;
		this.anInt586 = -2033346175;
		this.aBoolean142 = true;
		this.aBoolean141 = true;
		this.anInt589 = 0;
		this.aFloat111 = 1.0F;
		this.aClass581_4.method33222();
	}

	@OriginalMember(owner = "client!ha", name = "bw", descriptor = "(Z)V", line = 75)
	public void method5849(@OriginalArg(0) boolean arg0) {
		this.aClass201_2 = Class201.aClass201_5;
		this.aClass208_2 = null;
		this.aClass69_2 = null;
		this.aClass204_2 = null;
		this.aClass30_2 = null;
		if (Class212.aClass212_3 != this.aClass212_2 && arg0) {
			this.aClass192_2 = Class192.aClass192_3;
		} else {
			this.aClass192_2 = Class192.aClass192_4;
		}
		this.aClass198_2 = Class198.aClass198_3;
		this.aClass320_9.method25863(100.0F, 100.0F, 100.0F);
		this.aClass320_10.method25863(100.0F, 100.0F, 100.0F);
		this.aFloat107 = 0.05F;
		this.aClass320_11.method25863(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		this.aClass320_8.method25863(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		this.aClass320_13.method25863(1.0F, 1.0F, 1.0F);
		this.aClass320_12.method25863(1.0F, 1.0F, 1.0F);
		this.aFloat106 = 1.1F;
		this.aFloat105 = 1.1F;
		this.aFloat97 = 50.0F;
		this.aFloat108 = 10000.0F;
		this.aFloat110 = 1.5707964F;
		this.aFloat109 = 1.5707964F;
		this.anInt586 = -2033346175;
		this.aBoolean142 = true;
		this.aBoolean141 = true;
		this.anInt589 = 0;
		this.aFloat111 = 1.0F;
		this.aClass581_4.method33222();
	}

	@OriginalMember(owner = "client!ha", name = "bp", descriptor = "(Z)V", line = 75)
	public void method5850(@OriginalArg(0) boolean arg0) {
		this.aClass201_2 = Class201.aClass201_5;
		this.aClass208_2 = null;
		this.aClass69_2 = null;
		this.aClass204_2 = null;
		this.aClass30_2 = null;
		if (Class212.aClass212_3 != this.aClass212_2 && arg0) {
			this.aClass192_2 = Class192.aClass192_3;
		} else {
			this.aClass192_2 = Class192.aClass192_4;
		}
		this.aClass198_2 = Class198.aClass198_3;
		this.aClass320_9.method25863(100.0F, 100.0F, 100.0F);
		this.aClass320_10.method25863(100.0F, 100.0F, 100.0F);
		this.aFloat107 = 0.05F;
		this.aClass320_11.method25863(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		this.aClass320_8.method25863(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		this.aClass320_13.method25863(1.0F, 1.0F, 1.0F);
		this.aClass320_12.method25863(1.0F, 1.0F, 1.0F);
		this.aFloat106 = 1.1F;
		this.aFloat105 = 1.1F;
		this.aFloat97 = 50.0F;
		this.aFloat108 = 10000.0F;
		this.aFloat110 = 1.5707964F;
		this.aFloat109 = 1.5707964F;
		this.anInt586 = -2033346175;
		this.aBoolean142 = true;
		this.aBoolean141 = true;
		this.anInt589 = 0;
		this.aFloat111 = 1.0F;
		this.aClass581_4.method33222();
	}

	@OriginalMember(owner = "client!ha", name = "bd", descriptor = "(Z)V", line = 75)
	public void method5851(@OriginalArg(0) boolean arg0) {
		this.aClass201_2 = Class201.aClass201_5;
		this.aClass208_2 = null;
		this.aClass69_2 = null;
		this.aClass204_2 = null;
		this.aClass30_2 = null;
		if (Class212.aClass212_3 != this.aClass212_2 && arg0) {
			this.aClass192_2 = Class192.aClass192_3;
		} else {
			this.aClass192_2 = Class192.aClass192_4;
		}
		this.aClass198_2 = Class198.aClass198_3;
		this.aClass320_9.method25863(100.0F, 100.0F, 100.0F);
		this.aClass320_10.method25863(100.0F, 100.0F, 100.0F);
		this.aFloat107 = 0.05F;
		this.aClass320_11.method25863(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		this.aClass320_8.method25863(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		this.aClass320_13.method25863(1.0F, 1.0F, 1.0F);
		this.aClass320_12.method25863(1.0F, 1.0F, 1.0F);
		this.aFloat106 = 1.1F;
		this.aFloat105 = 1.1F;
		this.aFloat97 = 50.0F;
		this.aFloat108 = 10000.0F;
		this.aFloat110 = 1.5707964F;
		this.aFloat109 = 1.5707964F;
		this.anInt586 = -2033346175;
		this.aBoolean142 = true;
		this.aBoolean141 = true;
		this.anInt589 = 0;
		this.aFloat111 = 1.0F;
		this.aClass581_4.method33222();
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(F[[[ILclient!ni;IIB)V", line = 105)
	public void method5896(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class346 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass69_2 != null) {
			this.aClass69_2.method20202(arg0);
		}
		if (this.aClass30_2 != null) {
			this.aClass30_2.method16447(arg0, arg1, arg2, arg3, arg4);
		}
		@Pc(24) Iterator local24 = this.aClass581_4.iterator();
		while (local24.hasNext()) {
			@Pc(31) Class3_Sub1_Sub2 local31 = (Class3_Sub1_Sub2) local24.next();
			local31.method21206(arg0);
		}
	}

	@OriginalMember(owner = "client!ha", name = "bm", descriptor = "(ZFLclient!mh;Lclient!mx;Lclient!mh;Lclient!mh;)V", line = 114)
	public void method5797(@OriginalArg(0) boolean arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class320 arg2, @OriginalArg(3) Class335 arg3, @OriginalArg(4) Class320 arg4, @OriginalArg(5) Class320 arg5) {
		if (Class198.aClass198_4 == this.aClass198_2) {
			Class331.method26181(arg1, arg2, arg4, arg5, arg0 ? this.aClass320_8 : this.aClass320_11, arg0 ? this.aClass320_10 : this.aClass320_9, (float) (this.anInt589 * -2123581087), this.aFloat111, this.aFloat103, this.aFloat104);
		} else if (this.aClass198_2 == Class198.aClass198_3) {
			Class70.method33878(arg1, arg2, arg3, arg4, arg5, arg0 ? this.aClass320_8 : this.aClass320_11, arg0 ? this.aClass320_10 : this.aClass320_9, (float) (this.anInt589 * -2123581087), this.aFloat111, this.aFloat103, this.aFloat104);
		} else if (this.aClass198_2 == Class198.aClass198_5) {
			Class349.method26571(arg1, arg2, arg3, arg4, arg5, arg0 ? this.aClass320_12 : this.aClass320_13, arg0 ? this.aFloat105 : this.aFloat106, this.aFloat103, this.aFloat98);
		}
	}

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "(ZFLclient!mh;Lclient!mx;Lclient!mh;Lclient!mh;I)V", line = 114)
	public void method5800(@OriginalArg(0) boolean arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class320 arg2, @OriginalArg(3) Class335 arg3, @OriginalArg(4) Class320 arg4, @OriginalArg(5) Class320 arg5) {
		if (Class198.aClass198_4 == this.aClass198_2) {
			Class331.method26181(arg1, arg2, arg4, arg5, arg0 ? this.aClass320_8 : this.aClass320_11, arg0 ? this.aClass320_10 : this.aClass320_9, (float) (this.anInt589 * -2123581087), this.aFloat111, this.aFloat103, this.aFloat104);
		} else if (this.aClass198_2 == Class198.aClass198_3) {
			Class70.method33878(arg1, arg2, arg3, arg4, arg5, arg0 ? this.aClass320_8 : this.aClass320_11, arg0 ? this.aClass320_10 : this.aClass320_9, (float) (this.anInt589 * -2123581087), this.aFloat111, this.aFloat103, this.aFloat104);
		} else if (this.aClass198_2 == Class198.aClass198_5) {
			Class349.method26571(arg1, arg2, arg3, arg4, arg5, arg0 ? this.aClass320_12 : this.aClass320_13, arg0 ? this.aFloat105 : this.aFloat106, this.aFloat103, this.aFloat98);
		}
	}

	@OriginalMember(owner = "client!ha", name = "bs", descriptor = "(ZFLclient!mh;Lclient!mx;Lclient!mh;Lclient!mh;)V", line = 114)
	public void method5852(@OriginalArg(0) boolean arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class320 arg2, @OriginalArg(3) Class335 arg3, @OriginalArg(4) Class320 arg4, @OriginalArg(5) Class320 arg5) {
		if (Class198.aClass198_4 == this.aClass198_2) {
			Class331.method26181(arg1, arg2, arg4, arg5, arg0 ? this.aClass320_8 : this.aClass320_11, arg0 ? this.aClass320_10 : this.aClass320_9, (float) (this.anInt589 * -2123581087), this.aFloat111, this.aFloat103, this.aFloat104);
		} else if (this.aClass198_2 == Class198.aClass198_3) {
			Class70.method33878(arg1, arg2, arg3, arg4, arg5, arg0 ? this.aClass320_8 : this.aClass320_11, arg0 ? this.aClass320_10 : this.aClass320_9, (float) (this.anInt589 * -2123581087), this.aFloat111, this.aFloat103, this.aFloat104);
		} else if (this.aClass198_2 == Class198.aClass198_5) {
			Class349.method26571(arg1, arg2, arg3, arg4, arg5, arg0 ? this.aClass320_12 : this.aClass320_13, arg0 ? this.aFloat105 : this.aFloat106, this.aFloat103, this.aFloat98);
		}
	}

	@OriginalMember(owner = "client!ha", name = "x", descriptor = "(Ljava/lang/CharSequence;II[BIS)I", line = 119)
	public static int method5944(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg2 - arg1;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			@Pc(14) char local14 = arg0.charAt(arg1 + local5);
			if (local14 > 0 && local14 < 128 || !(local14 < 160 || local14 > 255)) {
				arg3[arg4 + local5] = (byte) local14;
			} else if (local14 == 8364) {
				arg3[local5 + arg4] = -128;
			} else if (local14 == 8218) {
				arg3[arg4 + local5] = -126;
			} else if (local14 == 402) {
				arg3[arg4 + local5] = -125;
			} else if (local14 == 8222) {
				arg3[arg4 + local5] = -124;
			} else if (local14 == 8230) {
				arg3[arg4 + local5] = -123;
			} else if (local14 == 8224) {
				arg3[arg4 + local5] = -122;
			} else if (local14 == 8225) {
				arg3[local5 + arg4] = -121;
			} else if (local14 == 710) {
				arg3[local5 + arg4] = -120;
			} else if (local14 == 8240) {
				arg3[local5 + arg4] = -119;
			} else if (local14 == 352) {
				arg3[arg4 + local5] = -118;
			} else if (local14 == 8249) {
				arg3[arg4 + local5] = -117;
			} else if (local14 == 338) {
				arg3[local5 + arg4] = -116;
			} else if (local14 == 381) {
				arg3[local5 + arg4] = -114;
			} else if (local14 == 8216) {
				arg3[local5 + arg4] = -111;
			} else if (local14 == 8217) {
				arg3[local5 + arg4] = -110;
			} else if (local14 == 8220) {
				arg3[local5 + arg4] = -109;
			} else if (local14 == 8221) {
				arg3[arg4 + local5] = -108;
			} else if (local14 == 8226) {
				arg3[arg4 + local5] = -107;
			} else if (local14 == 8211) {
				arg3[arg4 + local5] = -106;
			} else if (local14 == 8212) {
				arg3[local5 + arg4] = -105;
			} else if (local14 == 732) {
				arg3[local5 + arg4] = -104;
			} else if (local14 == 8482) {
				arg3[local5 + arg4] = -103;
			} else if (local14 == 353) {
				arg3[local5 + arg4] = -102;
			} else if (local14 == 8250) {
				arg3[arg4 + local5] = -101;
			} else if (local14 == 339) {
				arg3[local5 + arg4] = -100;
			} else if (local14 == 382) {
				arg3[arg4 + local5] = -98;
			} else if (local14 == 376) {
				arg3[arg4 + local5] = -97;
			} else {
				arg3[arg4 + local5] = 63;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "(S)V", line = 122)
	public static final void method5942() {
		Class190.anInt3648 = -1846339461;
		Class190.anInt3671 = -1299825770;
		Class190.anInt3669 = 807121618;
	}

	@OriginalMember(owner = "client!ha", name = "bt", descriptor = "(Lclient!gb;)V", line = 126)
	public void method5855(@OriginalArg(0) Class192 arg0) {
		this.aClass192_2 = arg0;
	}

	@OriginalMember(owner = "client!ha", name = "bk", descriptor = "(Lclient!gb;)V", line = 126)
	public void method5856(@OriginalArg(0) Class192 arg0) {
		this.aClass192_2 = arg0;
	}

	@OriginalMember(owner = "client!ha", name = "bf", descriptor = "(Lclient!gb;)V", line = 126)
	public void method5902(@OriginalArg(0) Class192 arg0) {
		this.aClass192_2 = arg0;
	}

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "(Lclient!gb;I)V", line = 126)
	public void method5923(@OriginalArg(0) Class192 arg0) {
		this.aClass192_2 = arg0;
	}

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "(Lclient!gs;ZB)Lclient!wu;", line = 130)
	public Class69 method5802(@OriginalArg(0) Class208 arg0, @OriginalArg(1) boolean arg1) throws Exception_Sub4 {
		if (Class192.aClass192_4 == this.aClass192_2 && !arg1) {
			throw new Exception_Sub4();
		}
		this.aClass208_2 = arg0;
		if (arg0 == Class208.aClass208_3) {
			this.aClass69_2 = new Class69_Sub5(this);
		} else if (Class208.aClass208_5 == arg0) {
			this.aClass69_2 = new Class69_Sub2(this);
		} else if (arg0 == Class208.aClass208_8) {
			this.aClass69_2 = new Class69_Sub4(this);
		} else if (arg0 == Class208.aClass208_4) {
			this.aClass69_2 = new Class69_Sub1_Sub2(this);
		} else if (arg0 == Class208.aClass208_6) {
			this.aClass69_2 = new Class69_Sub1_Sub1(this);
		} else if (arg0 == Class208.aClass208_7) {
			this.aClass69_2 = new Class69_Sub3(this);
		} else if (Class208.aClass208_9 == arg0) {
			this.aClass69_2 = new Class69_Sub1_Sub3(this);
		}
		return this.aClass69_2;
	}

	@OriginalMember(owner = "client!ha", name = "bg", descriptor = "(Lclient!gs;Z)Lclient!wu;", line = 130)
	public Class69 method5857(@OriginalArg(0) Class208 arg0, @OriginalArg(1) boolean arg1) throws Exception_Sub4 {
		if (Class192.aClass192_4 == this.aClass192_2 && !arg1) {
			throw new Exception_Sub4();
		}
		this.aClass208_2 = arg0;
		if (arg0 == Class208.aClass208_3) {
			this.aClass69_2 = new Class69_Sub5(this);
		} else if (Class208.aClass208_5 == arg0) {
			this.aClass69_2 = new Class69_Sub2(this);
		} else if (arg0 == Class208.aClass208_8) {
			this.aClass69_2 = new Class69_Sub4(this);
		} else if (arg0 == Class208.aClass208_4) {
			this.aClass69_2 = new Class69_Sub1_Sub2(this);
		} else if (arg0 == Class208.aClass208_6) {
			this.aClass69_2 = new Class69_Sub1_Sub1(this);
		} else if (arg0 == Class208.aClass208_7) {
			this.aClass69_2 = new Class69_Sub3(this);
		} else if (Class208.aClass208_9 == arg0) {
			this.aClass69_2 = new Class69_Sub1_Sub3(this);
		}
		return this.aClass69_2;
	}

	@OriginalMember(owner = "client!ha", name = "br", descriptor = "(Lclient!gs;Z)Lclient!wu;", line = 130)
	public Class69 method5893(@OriginalArg(0) Class208 arg0, @OriginalArg(1) boolean arg1) throws Exception_Sub4 {
		if (Class192.aClass192_4 == this.aClass192_2 && !arg1) {
			throw new Exception_Sub4();
		}
		this.aClass208_2 = arg0;
		if (arg0 == Class208.aClass208_3) {
			this.aClass69_2 = new Class69_Sub5(this);
		} else if (Class208.aClass208_5 == arg0) {
			this.aClass69_2 = new Class69_Sub2(this);
		} else if (arg0 == Class208.aClass208_8) {
			this.aClass69_2 = new Class69_Sub4(this);
		} else if (arg0 == Class208.aClass208_4) {
			this.aClass69_2 = new Class69_Sub1_Sub2(this);
		} else if (arg0 == Class208.aClass208_6) {
			this.aClass69_2 = new Class69_Sub1_Sub1(this);
		} else if (arg0 == Class208.aClass208_7) {
			this.aClass69_2 = new Class69_Sub3(this);
		} else if (Class208.aClass208_9 == arg0) {
			this.aClass69_2 = new Class69_Sub1_Sub3(this);
		}
		return this.aClass69_2;
	}

	@OriginalMember(owner = "client!ha", name = "by", descriptor = "(Lclient!go;Z)Lclient!id;", line = 143)
	public Class30 method5860(@OriginalArg(0) Class204 arg0, @OriginalArg(1) boolean arg1) throws Exception_Sub4 {
		if (Class192.aClass192_4 == this.aClass192_2 && !arg1) {
			throw new Exception_Sub4();
		}
		this.aClass204_2 = arg0;
		if (arg0 == Class204.aClass204_3) {
			this.aClass30_2 = new Class30_Sub3(this);
		} else if (arg0 == Class204.aClass204_5) {
			this.aClass30_2 = new Class30_Sub1(this);
		} else if (Class204.aClass204_7 == arg0) {
			this.aClass30_2 = new Class30_Sub2_Sub3(this);
		} else if (arg0 == Class204.aClass204_6) {
			this.aClass30_2 = new Class30_Sub2_Sub1(this);
		} else if (Class204.aClass204_4 == arg0) {
			this.aClass30_2 = new Class30_Sub2_Sub2(this);
		}
		return this.aClass30_2;
	}

	@OriginalMember(owner = "client!ha", name = "x", descriptor = "(Lclient!go;ZI)Lclient!id;", line = 143)
	public Class30 method5872(@OriginalArg(0) Class204 arg0, @OriginalArg(1) boolean arg1) throws Exception_Sub4 {
		if (Class192.aClass192_4 == this.aClass192_2 && !arg1) {
			throw new Exception_Sub4();
		}
		this.aClass204_2 = arg0;
		if (arg0 == Class204.aClass204_3) {
			this.aClass30_2 = new Class30_Sub3(this);
		} else if (arg0 == Class204.aClass204_5) {
			this.aClass30_2 = new Class30_Sub1(this);
		} else if (Class204.aClass204_7 == arg0) {
			this.aClass30_2 = new Class30_Sub2_Sub3(this);
		} else if (arg0 == Class204.aClass204_6) {
			this.aClass30_2 = new Class30_Sub2_Sub1(this);
		} else if (Class204.aClass204_4 == arg0) {
			this.aClass30_2 = new Class30_Sub2_Sub2(this);
		}
		return this.aClass30_2;
	}

	@OriginalMember(owner = "client!ha", name = "bb", descriptor = "(Lclient!go;Z)Lclient!id;", line = 143)
	public Class30 method5919(@OriginalArg(0) Class204 arg0, @OriginalArg(1) boolean arg1) throws Exception_Sub4 {
		if (Class192.aClass192_4 == this.aClass192_2 && !arg1) {
			throw new Exception_Sub4();
		}
		this.aClass204_2 = arg0;
		if (arg0 == Class204.aClass204_3) {
			this.aClass30_2 = new Class30_Sub3(this);
		} else if (arg0 == Class204.aClass204_5) {
			this.aClass30_2 = new Class30_Sub1(this);
		} else if (Class204.aClass204_7 == arg0) {
			this.aClass30_2 = new Class30_Sub2_Sub3(this);
		} else if (arg0 == Class204.aClass204_6) {
			this.aClass30_2 = new Class30_Sub2_Sub1(this);
		} else if (Class204.aClass204_4 == arg0) {
			this.aClass30_2 = new Class30_Sub2_Sub2(this);
		}
		return this.aClass30_2;
	}

	@OriginalMember(owner = "client!ha", name = "s", descriptor = "(I)Z", line = 154)
	boolean method5804() {
		if (Class212.aClass212_3 == this.aClass212_2 && this.aClass192_2 == Class192.aClass192_4) {
			return true;
		} else {
			return this.aClass212_2 == Class212.aClass212_4 && this.aClass192_2 == Class192.aClass192_3;
		}
	}

	@OriginalMember(owner = "client!ha", name = "u", descriptor = "(FI)V", line = 160)
	public void method5805(@OriginalArg(0) float arg0) throws Exception_Sub4 {
		if (!this.method5804()) {
			throw new Exception_Sub4();
		}
	}

	@OriginalMember(owner = "client!ha", name = "bl", descriptor = "(F)V", line = 160)
	public void method5861(@OriginalArg(0) float arg0) throws Exception_Sub4 {
		if (!this.method5804()) {
			throw new Exception_Sub4();
		}
	}

	@OriginalMember(owner = "client!ha", name = "bu", descriptor = "(F)V", line = 160)
	public void method5863(@OriginalArg(0) float arg0) throws Exception_Sub4 {
		if (!this.method5804()) {
			throw new Exception_Sub4();
		}
	}

	@OriginalMember(owner = "client!ha", name = "ba", descriptor = "(F)V", line = 160)
	public void method5874(@OriginalArg(0) float arg0) throws Exception_Sub4 {
		if (!this.method5804()) {
			throw new Exception_Sub4();
		}
	}

	@OriginalMember(owner = "client!ha", name = "bi", descriptor = "(F)V", line = 160)
	public void method5926(@OriginalArg(0) float arg0) throws Exception_Sub4 {
		if (!this.method5804()) {
			throw new Exception_Sub4();
		}
	}

	@OriginalMember(owner = "client!ha", name = "y", descriptor = "(FS)V", line = 164)
	public void method5806(@OriginalArg(0) float arg0) throws Exception_Sub4 {
		if (!this.method5804()) {
			throw new Exception_Sub4();
		}
		this.aFloat107 = arg0;
	}

	@OriginalMember(owner = "client!ha", name = "bo", descriptor = "(F)V", line = 164)
	public void method5865(@OriginalArg(0) float arg0) throws Exception_Sub4 {
		if (!this.method5804()) {
			throw new Exception_Sub4();
		}
		this.aFloat107 = arg0;
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Lclient!gi;I)V", line = 169)
	public void method5858(@OriginalArg(0) Class198 arg0) throws Exception_Sub4 {
		if (!this.method5804()) {
			throw new Exception_Sub4();
		}
		this.aClass198_2 = arg0;
	}

	@OriginalMember(owner = "client!ha", name = "bc", descriptor = "(Lclient!gi;)V", line = 169)
	public void method5864(@OriginalArg(0) Class198 arg0) throws Exception_Sub4 {
		if (!this.method5804()) {
			throw new Exception_Sub4();
		}
		this.aClass198_2 = arg0;
	}

	@OriginalMember(owner = "client!ha", name = "bn", descriptor = "(Lclient!gi;)V", line = 169)
	public void method5915(@OriginalArg(0) Class198 arg0) throws Exception_Sub4 {
		if (!this.method5804()) {
			throw new Exception_Sub4();
		}
		this.aClass198_2 = arg0;
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(Lclient!mh;I)V", line = 174)
	public void method5808(@OriginalArg(0) Class320 arg0) throws Exception_Sub4 {
		if (!this.method5804() || !this.aClass198_2.aBoolean663) {
			throw new Exception_Sub4();
		}
		this.aClass320_11.method25893(arg0);
	}

	@OriginalMember(owner = "client!ha", name = "bj", descriptor = "(Lclient!mh;)V", line = 174)
	public void method5832(@OriginalArg(0) Class320 arg0) throws Exception_Sub4 {
		if (!this.method5804() || !this.aClass198_2.aBoolean663) {
			throw new Exception_Sub4();
		}
		this.aClass320_11.method25893(arg0);
	}

	@OriginalMember(owner = "client!ha", name = "be", descriptor = "(Lclient!mh;)V", line = 174)
	public void method5868(@OriginalArg(0) Class320 arg0) throws Exception_Sub4 {
		if (!this.method5804() || !this.aClass198_2.aBoolean663) {
			throw new Exception_Sub4();
		}
		this.aClass320_11.method25893(arg0);
	}

	@OriginalMember(owner = "client!ha", name = "bx", descriptor = "(Lclient!mh;)V", line = 174)
	public void method5869(@OriginalArg(0) Class320 arg0) throws Exception_Sub4 {
		if (!this.method5804() || !this.aClass198_2.aBoolean663) {
			throw new Exception_Sub4();
		}
		this.aClass320_11.method25893(arg0);
	}

	@OriginalMember(owner = "client!ha", name = "bh", descriptor = "(Lclient!mh;)V", line = 174)
	public void method5870(@OriginalArg(0) Class320 arg0) throws Exception_Sub4 {
		if (!this.method5804() || !this.aClass198_2.aBoolean663) {
			throw new Exception_Sub4();
		}
		this.aClass320_11.method25893(arg0);
	}

	@OriginalMember(owner = "client!ha", name = "z", descriptor = "(Lclient!mh;I)V", line = 179)
	public void method5809(@OriginalArg(0) Class320 arg0) throws Exception_Sub4 {
		if (!this.method5804() || !this.aClass198_2.aBoolean663) {
			throw new Exception_Sub4();
		}
		this.aClass320_8.method25893(arg0);
	}

	@OriginalMember(owner = "client!ha", name = "bq", descriptor = "(Lclient!mh;)V", line = 179)
	public void method5876(@OriginalArg(0) Class320 arg0) throws Exception_Sub4 {
		if (!this.method5804() || !this.aClass198_2.aBoolean663) {
			throw new Exception_Sub4();
		}
		this.aClass320_8.method25893(arg0);
	}

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "(FFFI)V", line = 184)
	public void method5810(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) throws Exception_Sub4 {
		if (!this.method5804()) {
			throw new Exception_Sub4();
		}
		this.aFloat103 = arg0;
		this.aFloat104 = arg1;
		this.aFloat98 = arg2;
	}

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "(B)V", line = 191)
	public void method5811() throws Exception_Sub4 {
		if (!this.method5804()) {
			throw new Exception_Sub4();
		}
		this.aFloat103 = 5120.0F;
		this.aFloat104 = 10.0F;
		this.aFloat98 = 1.0F;
	}

	@OriginalMember(owner = "client!ha", name = "bv", descriptor = "()V", line = 191)
	public void method5873() throws Exception_Sub4 {
		if (!this.method5804()) {
			throw new Exception_Sub4();
		}
		this.aFloat103 = 5120.0F;
		this.aFloat104 = 10.0F;
		this.aFloat98 = 1.0F;
	}

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(Lclient!mh;I)V", line = 198)
	public void method5812(@OriginalArg(0) Class320 arg0) throws Exception_Sub4 {
		if (!this.method5804() || !this.aClass198_2.aBoolean663) {
			throw new Exception_Sub4();
		}
		this.aClass320_9.method25893(arg0);
	}

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "(Lclient!mh;I)V", line = 203)
	public void method5813(@OriginalArg(0) Class320 arg0) throws Exception_Sub4 {
		if (!this.method5804() || !this.aClass198_2.aBoolean663) {
			throw new Exception_Sub4();
		}
		this.aClass320_10.method25893(arg0);
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(Lclient!mh;FB)V", line = 208)
	public void method5814(@OriginalArg(0) Class320 arg0, @OriginalArg(1) float arg1) throws Exception_Sub4 {
		if (!this.method5804() || this.aClass198_2.aBoolean663) {
			throw new Exception_Sub4();
		}
		this.aClass320_13.method25893(arg0);
		this.aClass320_12.method25893(arg0);
		this.aFloat106 = arg1;
		this.aFloat105 = arg1;
	}

	@OriginalMember(owner = "client!ha", name = "cm", descriptor = "(Lclient!mh;F)V", line = 208)
	public void method5866(@OriginalArg(0) Class320 arg0, @OriginalArg(1) float arg1) throws Exception_Sub4 {
		if (!this.method5804() || this.aClass198_2.aBoolean663) {
			throw new Exception_Sub4();
		}
		this.aClass320_13.method25893(arg0);
		this.aClass320_12.method25893(arg0);
		this.aFloat106 = arg1;
		this.aFloat105 = arg1;
	}

	@OriginalMember(owner = "client!ha", name = "ck", descriptor = "(Lclient!mh;F)V", line = 208)
	public void method5875(@OriginalArg(0) Class320 arg0, @OriginalArg(1) float arg1) throws Exception_Sub4 {
		if (!this.method5804() || this.aClass198_2.aBoolean663) {
			throw new Exception_Sub4();
		}
		this.aClass320_13.method25893(arg0);
		this.aClass320_12.method25893(arg0);
		this.aFloat106 = arg1;
		this.aFloat105 = arg1;
	}

	@OriginalMember(owner = "client!ha", name = "bz", descriptor = "(Lclient!mh;F)V", line = 208)
	public void method5898(@OriginalArg(0) Class320 arg0, @OriginalArg(1) float arg1) throws Exception_Sub4 {
		if (!this.method5804() || this.aClass198_2.aBoolean663) {
			throw new Exception_Sub4();
		}
		this.aClass320_13.method25893(arg0);
		this.aClass320_12.method25893(arg0);
		this.aFloat106 = arg1;
		this.aFloat105 = arg1;
	}

	@OriginalMember(owner = "client!ha", name = "cj", descriptor = "(Lclient!mh;F)V", line = 216)
	public void method5877(@OriginalArg(0) Class320 arg0, @OriginalArg(1) float arg1) throws Exception_Sub4 {
		if (!this.method5804() || this.aClass198_2.aBoolean663) {
			throw new Exception_Sub4();
		}
		this.aClass320_13.method25893(arg0);
		this.aFloat106 = arg1;
	}

	@OriginalMember(owner = "client!ha", name = "cu", descriptor = "(Lclient!mh;F)V", line = 216)
	public void method5878(@OriginalArg(0) Class320 arg0, @OriginalArg(1) float arg1) throws Exception_Sub4 {
		if (!this.method5804() || this.aClass198_2.aBoolean663) {
			throw new Exception_Sub4();
		}
		this.aClass320_13.method25893(arg0);
		this.aFloat106 = arg1;
	}

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "(Lclient!mh;FI)V", line = 216)
	public void method5927(@OriginalArg(0) Class320 arg0, @OriginalArg(1) float arg1) throws Exception_Sub4 {
		if (!this.method5804() || this.aClass198_2.aBoolean663) {
			throw new Exception_Sub4();
		}
		this.aClass320_13.method25893(arg0);
		this.aFloat106 = arg1;
	}

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "(Lclient!mh;FI)V", line = 222)
	public void method5816(@OriginalArg(0) Class320 arg0, @OriginalArg(1) float arg1) throws Exception_Sub4 {
		if (!this.method5804() || this.aClass198_2.aBoolean663) {
			throw new Exception_Sub4();
		}
		this.aClass320_12.method25893(arg0);
		this.aFloat105 = arg1;
	}

	@OriginalMember(owner = "client!ha", name = "cv", descriptor = "(Lclient!mh;F)V", line = 222)
	public void method5881(@OriginalArg(0) Class320 arg0, @OriginalArg(1) float arg1) throws Exception_Sub4 {
		if (!this.method5804() || this.aClass198_2.aBoolean663) {
			throw new Exception_Sub4();
		}
		this.aClass320_12.method25893(arg0);
		this.aFloat105 = arg1;
	}

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "(FFI)V", line = 228)
	public void method5817(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) throws Exception_Sub4 {
		if (!this.method5804()) {
			throw new Exception_Sub4();
		}
		if (arg0 < 1.0F) {
			arg0 = 50.0F;
		}
		if (arg1 < 1.0F) {
			arg1 = 10000.0F;
		}
		if (arg0 >= arg1) {
			throw new Exception_Sub4();
		}
		this.aFloat97 = arg0;
		this.aFloat108 = arg1;
	}

	@OriginalMember(owner = "client!ha", name = "cl", descriptor = "(FF)V", line = 228)
	public void method5880(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) throws Exception_Sub4 {
		if (!this.method5804()) {
			throw new Exception_Sub4();
		}
		if (arg0 < 1.0F) {
			arg0 = 50.0F;
		}
		if (arg1 < 1.0F) {
			arg1 = 10000.0F;
		}
		if (arg0 >= arg1) {
			throw new Exception_Sub4();
		}
		this.aFloat97 = arg0;
		this.aFloat108 = arg1;
	}

	@OriginalMember(owner = "client!ha", name = "cq", descriptor = "(FF)V", line = 228)
	public void method5894(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) throws Exception_Sub4 {
		if (!this.method5804()) {
			throw new Exception_Sub4();
		}
		if (arg0 < 1.0F) {
			arg0 = 50.0F;
		}
		if (arg1 < 1.0F) {
			arg1 = 10000.0F;
		}
		if (arg0 >= arg1) {
			throw new Exception_Sub4();
		}
		this.aFloat97 = arg0;
		this.aFloat108 = arg1;
	}

	@OriginalMember(owner = "client!ha", name = "t", descriptor = "(FFB)V", line = 237)
	public void method5818(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) throws Exception_Sub4 {
		if (!this.method5804()) {
			throw new Exception_Sub4();
		}
		this.aFloat109 = arg0;
		this.aFloat110 = arg1;
	}

	@OriginalMember(owner = "client!ha", name = "cg", descriptor = "(FF)V", line = 237)
	public void method5882(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) throws Exception_Sub4 {
		if (!this.method5804()) {
			throw new Exception_Sub4();
		}
		this.aFloat109 = arg0;
		this.aFloat110 = arg1;
	}

	@OriginalMember(owner = "client!ha", name = "cp", descriptor = "(FF)V", line = 237)
	public void method5883(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) throws Exception_Sub4 {
		if (!this.method5804()) {
			throw new Exception_Sub4();
		}
		this.aFloat109 = arg0;
		this.aFloat110 = arg1;
	}

	@OriginalMember(owner = "client!ha", name = "cc", descriptor = "(FF)V", line = 237)
	public void method5884(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) throws Exception_Sub4 {
		if (!this.method5804()) {
			throw new Exception_Sub4();
		}
		this.aFloat109 = arg0;
		this.aFloat110 = arg1;
	}

	@OriginalMember(owner = "client!ha", name = "w", descriptor = "(ZZI)V", line = 243)
	public void method5819(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) throws Exception_Sub4 {
		if (!this.method5804()) {
			throw new Exception_Sub4();
		}
		this.aBoolean142 = arg0;
		this.aBoolean141 = arg1;
	}

	@OriginalMember(owner = "client!ha", name = "cs", descriptor = "(ZZ)V", line = 243)
	public void method5885(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) throws Exception_Sub4 {
		if (!this.method5804()) {
			throw new Exception_Sub4();
		}
		this.aBoolean142 = arg0;
		this.aBoolean141 = arg1;
	}

	@OriginalMember(owner = "client!ha", name = "ct", descriptor = "(ZZ)V", line = 243)
	public void method5918(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) throws Exception_Sub4 {
		if (!this.method5804()) {
			throw new Exception_Sub4();
		}
		this.aBoolean142 = arg0;
		this.aBoolean141 = arg1;
	}

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "(IFI)V", line = 249)
	public void method5820(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) throws Exception_Sub4 {
		if (!this.method5804() || !this.aClass198_2.aBoolean663) {
			throw new Exception_Sub4();
		}
		this.anInt589 = arg0 * 1822796449;
		this.aFloat111 = arg1;
	}

	@OriginalMember(owner = "client!ha", name = "cx", descriptor = "(IF)V", line = 249)
	public void method5917(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) throws Exception_Sub4 {
		if (!this.method5804() || !this.aClass198_2.aBoolean663) {
			throw new Exception_Sub4();
		}
		this.anInt589 = arg0 * 1822796449;
		this.aFloat111 = arg1;
	}

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "(Lclient!amb;I)V", line = 255)
	public void method5821(@OriginalArg(0) Class3_Sub1_Sub2 arg0) {
		this.aClass581_4.method33241(arg0, (long) (arg0.anInt2869 * -36949057));
	}

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(II)V", line = 259)
	public void method5822(@OriginalArg(0) int arg0) {
		@Pc(6) Class3_Sub1_Sub2 local6 = (Class3_Sub1_Sub2) this.aClass581_4.method33217((long) arg0);
		if (local6 != null) {
			local6.method33656();
		}
	}

	@OriginalMember(owner = "client!ha", name = "cn", descriptor = "(I)V", line = 259)
	public void method5879(@OriginalArg(0) int arg0) {
		@Pc(6) Class3_Sub1_Sub2 local6 = (Class3_Sub1_Sub2) this.aClass581_4.method33217((long) arg0);
		if (local6 != null) {
			local6.method33656();
		}
	}

	@OriginalMember(owner = "client!ha", name = "cy", descriptor = "(I)V", line = 259)
	public void method5888(@OriginalArg(0) int arg0) {
		@Pc(6) Class3_Sub1_Sub2 local6 = (Class3_Sub1_Sub2) this.aClass581_4.method33217((long) arg0);
		if (local6 != null) {
			local6.method33656();
		}
	}

	@OriginalMember(owner = "client!ha", name = "cb", descriptor = "(I)V", line = 259)
	public void method5889(@OriginalArg(0) int arg0) {
		@Pc(6) Class3_Sub1_Sub2 local6 = (Class3_Sub1_Sub2) this.aClass581_4.method33217((long) arg0);
		if (local6 != null) {
			local6.method33656();
		}
	}

	@OriginalMember(owner = "client!ha", name = "cz", descriptor = "(I)V", line = 259)
	public void method5890(@OriginalArg(0) int arg0) {
		@Pc(6) Class3_Sub1_Sub2 local6 = (Class3_Sub1_Sub2) this.aClass581_4.method33217((long) arg0);
		if (local6 != null) {
			local6.method33656();
		}
	}

	@OriginalMember(owner = "client!ha", name = "co", descriptor = "(I)Lclient!amb;", line = 264)
	public Class3_Sub1_Sub2 method5867(@OriginalArg(0) int arg0) {
		return (Class3_Sub1_Sub2) this.aClass581_4.method33217((long) arg0);
	}

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "(IS)Lclient!amb;", line = 264)
	public Class3_Sub1_Sub2 method5897(@OriginalArg(0) int arg0) {
		return (Class3_Sub1_Sub2) this.aClass581_4.method33217((long) arg0);
	}

	@OriginalMember(owner = "client!ha", name = "at", descriptor = "(B)V", line = 268)
	public void method5803() {
		this.aClass581_4.method33222();
	}

	@OriginalMember(owner = "client!ha", name = "af", descriptor = "(B)Z", line = 272)
	public boolean method5824() {
		if (this.aClass69_2 == null || this.aClass30_2 == null) {
			return false;
		} else if (this.aClass69_2.method20209()) {
			return this.aClass30_2.method16425();
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ha", name = "cd", descriptor = "()Z", line = 272)
	public boolean method5848() {
		if (this.aClass69_2 == null || this.aClass30_2 == null) {
			return false;
		} else if (this.aClass69_2.method20209()) {
			return this.aClass30_2.method16425();
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ha", name = "ch", descriptor = "()Z", line = 272)
	public boolean method5895() {
		if (this.aClass69_2 == null || this.aClass30_2 == null) {
			return false;
		} else if (this.aClass69_2.method20209()) {
			return this.aClass30_2.method16425();
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ha", name = "ca", descriptor = "(Lclient!gu;Lclient!mu;Lclient!mq;II)V", line = 279)
	public void method5829(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class332 arg1, @OriginalArg(2) Class328 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!this.method5824()) {
			return;
		}
		this.aClass69_2.method20206(arg0, arg1, arg3, arg4, this.aClass30_2.method16429());
		this.aClass30_2.method16430(arg0, arg3, arg4);
		if (this.aClass201_2 == Class201.aClass201_5) {
			arg2.method26115(this.aFloat97, this.aFloat108, this.aFloat109, this.aFloat110);
		} else {
			arg2.method26057(this.aFloat97, this.aFloat108, (float) (this.anInt586 * 844054661));
		}
		@Pc(52) Iterator local52 = this.aClass581_4.iterator();
		while (local52.hasNext()) {
			@Pc(59) Class3_Sub1_Sub2 local59 = (Class3_Sub1_Sub2) local52.next();
			local59.method21205(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ha", name = "ci", descriptor = "(Lclient!gu;Lclient!mu;Lclient!mq;II)V", line = 279)
	public void method5837(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class332 arg1, @OriginalArg(2) Class328 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!this.method5824()) {
			return;
		}
		this.aClass69_2.method20206(arg0, arg1, arg3, arg4, this.aClass30_2.method16429());
		this.aClass30_2.method16430(arg0, arg3, arg4);
		if (this.aClass201_2 == Class201.aClass201_5) {
			arg2.method26115(this.aFloat97, this.aFloat108, this.aFloat109, this.aFloat110);
		} else {
			arg2.method26057(this.aFloat97, this.aFloat108, (float) (this.anInt586 * 844054661));
		}
		@Pc(52) Iterator local52 = this.aClass581_4.iterator();
		while (local52.hasNext()) {
			@Pc(59) Class3_Sub1_Sub2 local59 = (Class3_Sub1_Sub2) local52.next();
			local59.method21205(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ha", name = "ce", descriptor = "(Lclient!gu;Lclient!mu;Lclient!mq;II)V", line = 279)
	public void method5844(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class332 arg1, @OriginalArg(2) Class328 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!this.method5824()) {
			return;
		}
		this.aClass69_2.method20206(arg0, arg1, arg3, arg4, this.aClass30_2.method16429());
		this.aClass30_2.method16430(arg0, arg3, arg4);
		if (this.aClass201_2 == Class201.aClass201_5) {
			arg2.method26115(this.aFloat97, this.aFloat108, this.aFloat109, this.aFloat110);
		} else {
			arg2.method26057(this.aFloat97, this.aFloat108, (float) (this.anInt586 * 844054661));
		}
		@Pc(52) Iterator local52 = this.aClass581_4.iterator();
		while (local52.hasNext()) {
			@Pc(59) Class3_Sub1_Sub2 local59 = (Class3_Sub1_Sub2) local52.next();
			local59.method21205(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ha", name = "cr", descriptor = "(Lclient!gu;Lclient!mu;Lclient!mq;II)V", line = 279)
	public void method5862(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class332 arg1, @OriginalArg(2) Class328 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!this.method5824()) {
			return;
		}
		this.aClass69_2.method20206(arg0, arg1, arg3, arg4, this.aClass30_2.method16429());
		this.aClass30_2.method16430(arg0, arg3, arg4);
		if (this.aClass201_2 == Class201.aClass201_5) {
			arg2.method26115(this.aFloat97, this.aFloat108, this.aFloat109, this.aFloat110);
		} else {
			arg2.method26057(this.aFloat97, this.aFloat108, (float) (this.anInt586 * 844054661));
		}
		@Pc(52) Iterator local52 = this.aClass581_4.iterator();
		while (local52.hasNext()) {
			@Pc(59) Class3_Sub1_Sub2 local59 = (Class3_Sub1_Sub2) local52.next();
			local59.method21205(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ha", name = "cw", descriptor = "(Lclient!gu;Lclient!mu;Lclient!mq;II)V", line = 279)
	public void method5899(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class332 arg1, @OriginalArg(2) Class328 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!this.method5824()) {
			return;
		}
		this.aClass69_2.method20206(arg0, arg1, arg3, arg4, this.aClass30_2.method16429());
		this.aClass30_2.method16430(arg0, arg3, arg4);
		if (this.aClass201_2 == Class201.aClass201_5) {
			arg2.method26115(this.aFloat97, this.aFloat108, this.aFloat109, this.aFloat110);
		} else {
			arg2.method26057(this.aFloat97, this.aFloat108, (float) (this.anInt586 * 844054661));
		}
		@Pc(52) Iterator local52 = this.aClass581_4.iterator();
		while (local52.hasNext()) {
			@Pc(59) Class3_Sub1_Sub2 local59 = (Class3_Sub1_Sub2) local52.next();
			local59.method21205(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ha", name = "ak", descriptor = "(Lclient!gu;Lclient!mu;Lclient!mq;IIB)V", line = 279)
	public void method5920(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class332 arg1, @OriginalArg(2) Class328 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!this.method5824()) {
			return;
		}
		this.aClass69_2.method20206(arg0, arg1, arg3, arg4, this.aClass30_2.method16429());
		this.aClass30_2.method16430(arg0, arg3, arg4);
		if (this.aClass201_2 == Class201.aClass201_5) {
			arg2.method26115(this.aFloat97, this.aFloat108, this.aFloat109, this.aFloat110);
		} else {
			arg2.method26057(this.aFloat97, this.aFloat108, (float) (this.anInt586 * 844054661));
		}
		@Pc(52) Iterator local52 = this.aClass581_4.iterator();
		while (local52.hasNext()) {
			@Pc(59) Class3_Sub1_Sub2 local59 = (Class3_Sub1_Sub2) local52.next();
			local59.method21205(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ha", name = "aa", descriptor = "(I)Lclient!gb;", line = 292)
	public Class192 method5826() {
		return this.aClass192_2;
	}

	@OriginalMember(owner = "client!ha", name = "cf", descriptor = "()Lclient!gb;", line = 292)
	public Class192 method5925() {
		return this.aClass192_2;
	}

	@OriginalMember(owner = "client!ha", name = "ah", descriptor = "(I)Lclient!id;", line = 296)
	public Class30 method5827() {
		return this.aClass30_2;
	}

	@OriginalMember(owner = "client!ha", name = "an", descriptor = "(I)Lclient!wu;", line = 300)
	public Class69 method5799() {
		return this.aClass69_2;
	}

	@OriginalMember(owner = "client!ha", name = "df", descriptor = "()Lclient!wu;", line = 300)
	public Class69 method5846() {
		return this.aClass69_2;
	}

	@OriginalMember(owner = "client!ha", name = "dv", descriptor = "()Lclient!wu;", line = 300)
	public Class69 method5853() {
		return this.aClass69_2;
	}

	@OriginalMember(owner = "client!ha", name = "aj", descriptor = "(B)Lclient!gg;", line = 304)
	public Interface15 method5859() {
		return this.anInterface15_2;
	}

	@OriginalMember(owner = "client!ha", name = "as", descriptor = "(I)Lclient!gs;", line = 308)
	public Class208 method5830() {
		return this.aClass208_2;
	}

	@OriginalMember(owner = "client!ha", name = "dh", descriptor = "()Lclient!gs;", line = 308)
	public Class208 method5903() {
		return this.aClass208_2;
	}

	@OriginalMember(owner = "client!ha", name = "ai", descriptor = "(I)Lclient!go;", line = 312)
	public Class204 method5887() {
		return this.aClass204_2;
	}

	@OriginalMember(owner = "client!ha", name = "db", descriptor = "()Lclient!go;", line = 312)
	public Class204 method5904() {
		return this.aClass204_2;
	}

	@OriginalMember(owner = "client!ha", name = "aq", descriptor = "(I)Lclient!mh;", line = 316)
	public Class320 method5908() {
		return this.aClass30_2 != null && this.aClass30_2.method16425() ? this.aClass30_2.method16426() : null;
	}

	@OriginalMember(owner = "client!ha", name = "av", descriptor = "(B)[D", line = 321)
	public double[] method5833() {
		return this.aClass30_2 != null && this.aClass30_2.method16425() ? this.aClass30_2.method16427() : null;
	}

	@OriginalMember(owner = "client!ha", name = "dp", descriptor = "()[D", line = 321)
	public double[] method5905() {
		return this.aClass30_2 != null && this.aClass30_2.method16425() ? this.aClass30_2.method16427() : null;
	}

	@OriginalMember(owner = "client!ha", name = "dk", descriptor = "()[D", line = 321)
	public double[] method5906() {
		return this.aClass30_2 != null && this.aClass30_2.method16425() ? this.aClass30_2.method16427() : null;
	}

	@OriginalMember(owner = "client!ha", name = "dy", descriptor = "()[D", line = 321)
	public double[] method5907() {
		return this.aClass30_2 != null && this.aClass30_2.method16425() ? this.aClass30_2.method16427() : null;
	}

	@OriginalMember(owner = "client!ha", name = "ax", descriptor = "(I)Lclient!mh;", line = 326)
	public Class320 method5834() {
		return this.aClass69_2 != null && this.aClass69_2.method20209() ? this.aClass69_2.method20203() : null;
	}

	@OriginalMember(owner = "client!ha", name = "dg", descriptor = "()Lclient!mh;", line = 326)
	public Class320 method5847() {
		return this.aClass69_2 != null && this.aClass69_2.method20209() ? this.aClass69_2.method20203() : null;
	}

	@OriginalMember(owner = "client!ha", name = "dq", descriptor = "()Lclient!mh;", line = 326)
	public Class320 method5871() {
		return this.aClass69_2 != null && this.aClass69_2.method20209() ? this.aClass69_2.method20203() : null;
	}

	@OriginalMember(owner = "client!ha", name = "az", descriptor = "(B)F", line = 331)
	public float method5835() {
		@Pc(3) Class320 local3 = this.method5908();
		@Pc(7) Class320 local7 = this.method5834();
		@Pc(9) float local9 = 0.0F;
		if (local3 != null && local7 != null) {
			@Pc(18) Class320 local18 = Class320.method25928(local7, local3);
			@Pc(33) float local33 = (float) Math.sqrt((double) (local18.aFloat261 * local18.aFloat261 + local18.aFloat259 * local18.aFloat259));
			local9 = (float) Math.atan2((double) -local18.aFloat260, (double) local33);
			local3.method25874();
			local7.method25874();
		}
		return local9;
	}

	@OriginalMember(owner = "client!ha", name = "ds", descriptor = "()F", line = 331)
	public float method5910() {
		@Pc(3) Class320 local3 = this.method5908();
		@Pc(7) Class320 local7 = this.method5834();
		@Pc(9) float local9 = 0.0F;
		if (local3 != null && local7 != null) {
			@Pc(18) Class320 local18 = Class320.method25928(local7, local3);
			@Pc(33) float local33 = (float) Math.sqrt((double) (local18.aFloat261 * local18.aFloat261 + local18.aFloat259 * local18.aFloat259));
			local9 = (float) Math.atan2((double) -local18.aFloat260, (double) local33);
			local3.method25874();
			local7.method25874();
		}
		return local9;
	}

	@OriginalMember(owner = "client!ha", name = "dr", descriptor = "()F", line = 331)
	public float method5911() {
		@Pc(3) Class320 local3 = this.method5908();
		@Pc(7) Class320 local7 = this.method5834();
		@Pc(9) float local9 = 0.0F;
		if (local3 != null && local7 != null) {
			@Pc(18) Class320 local18 = Class320.method25928(local7, local3);
			@Pc(33) float local33 = (float) Math.sqrt((double) (local18.aFloat261 * local18.aFloat261 + local18.aFloat259 * local18.aFloat259));
			local9 = (float) Math.atan2((double) -local18.aFloat260, (double) local33);
			local3.method25874();
			local7.method25874();
		}
		return local9;
	}

	@OriginalMember(owner = "client!ha", name = "al", descriptor = "(I)F", line = 345)
	public float method5836() {
		@Pc(3) Class320 local3 = this.method5908();
		@Pc(7) Class320 local7 = this.method5834();
		@Pc(9) float local9 = 0.0F;
		if (local3 != null && local7 != null) {
			@Pc(18) Class320 local18 = Class320.method25928(local3, local7);
			local18.aFloat260 = 0.0F;
			local9 = (float) Math.atan2((double) local18.aFloat259, (double) local18.aFloat261);
			local3.method25874();
			local7.method25874();
		}
		return (float) (3.141592653589793D - (double) local9);
	}

	@OriginalMember(owner = "client!ha", name = "dc", descriptor = "()F", line = 345)
	public float method5912() {
		@Pc(3) Class320 local3 = this.method5908();
		@Pc(7) Class320 local7 = this.method5834();
		@Pc(9) float local9 = 0.0F;
		if (local3 != null && local7 != null) {
			@Pc(18) Class320 local18 = Class320.method25928(local3, local7);
			local18.aFloat260 = 0.0F;
			local9 = (float) Math.atan2((double) local18.aFloat259, (double) local18.aFloat261);
			local3.method25874();
			local7.method25874();
		}
		return (float) (3.141592653589793D - (double) local9);
	}

	@OriginalMember(owner = "client!ha", name = "ao", descriptor = "(B)F", line = 359)
	float method5801() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!ha", name = "da", descriptor = "()F", line = 359)
	float method5825() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!ha", name = "dd", descriptor = "()F", line = 359)
	float method5831() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!ha", name = "dt", descriptor = "()F", line = 359)
	float method5913() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!ha", name = "ap", descriptor = "(I)Lclient!mx;", line = 363)
	public Class335 method5838() {
		@Pc(1) Class335 local1 = Class335.method26300();
		local1.method26303(this.method5836(), this.method5835(), this.method5801());
		return local1;
	}

	@OriginalMember(owner = "client!ha", name = "ab", descriptor = "(B)Lclient!mh;", line = 369)
	public Class320 method5839() {
		return this.aClass320_11;
	}

	@OriginalMember(owner = "client!ha", name = "de", descriptor = "()Lclient!mh;", line = 369)
	public Class320 method5901() {
		return this.aClass320_11;
	}

	@OriginalMember(owner = "client!ha", name = "dz", descriptor = "()Lclient!mh;", line = 369)
	public Class320 method5916() {
		return this.aClass320_11;
	}

	@OriginalMember(owner = "client!ha", name = "au", descriptor = "(I)Lclient!mh;", line = 373)
	public Class320 method5840() {
		return this.aClass320_8;
	}

	@OriginalMember(owner = "client!ha", name = "dl", descriptor = "()Lclient!mh;", line = 373)
	public Class320 method5900() {
		return this.aClass320_8;
	}

	@OriginalMember(owner = "client!ha", name = "dj", descriptor = "()Lclient!mh;", line = 373)
	public Class320 method5909() {
		return this.aClass320_8;
	}

	@OriginalMember(owner = "client!ha", name = "dm", descriptor = "()F", line = 377)
	public float method5815() {
		return this.aFloat107;
	}

	@OriginalMember(owner = "client!ha", name = "dx", descriptor = "()F", line = 377)
	public float method5828() {
		return this.aFloat107;
	}

	@OriginalMember(owner = "client!ha", name = "ay", descriptor = "(I)F", line = 377)
	public float method5841() {
		return this.aFloat107;
	}

	@OriginalMember(owner = "client!ha", name = "du", descriptor = "()F", line = 377)
	public float method5891() {
		return this.aFloat107;
	}

	@OriginalMember(owner = "client!ha", name = "dw", descriptor = "()F", line = 377)
	public float method5922() {
		return this.aFloat107;
	}

	@OriginalMember(owner = "client!ha", name = "ag", descriptor = "(I)Lclient!mh;", line = 381)
	public Class320 method5842() {
		return this.aClass320_9;
	}

	@OriginalMember(owner = "client!ha", name = "do", descriptor = "()Lclient!mh;", line = 381)
	public Class320 method5924() {
		return this.aClass320_9;
	}

	@OriginalMember(owner = "client!ha", name = "dn", descriptor = "()Lclient!mh;", line = 385)
	public Class320 method5823() {
		return this.aClass320_10;
	}

	@OriginalMember(owner = "client!ha", name = "am", descriptor = "(I)Lclient!mh;", line = 385)
	public Class320 method5843() {
		return this.aClass320_10;
	}

	@OriginalMember(owner = "client!ha", name = "di", descriptor = "()Lclient!mh;", line = 385)
	public Class320 method5921() {
		return this.aClass320_10;
	}

	@OriginalMember(owner = "client!ha", name = "ex", descriptor = "()Lclient!mh;", line = 385)
	public Class320 method5928() {
		return this.aClass320_10;
	}

	@OriginalMember(owner = "client!ha", name = "ee", descriptor = "()Lclient!mh;", line = 385)
	public Class320 method5933() {
		return this.aClass320_10;
	}

	@OriginalMember(owner = "client!ha", name = "ar", descriptor = "(S)F", line = 389)
	public float method5892() {
		return this.aFloat97;
	}

	@OriginalMember(owner = "client!ha", name = "eb", descriptor = "()F", line = 389)
	public float method5929() {
		return this.aFloat97;
	}

	@OriginalMember(owner = "client!ha", name = "ef", descriptor = "()F", line = 389)
	public float method5930() {
		return this.aFloat97;
	}

	@OriginalMember(owner = "client!ha", name = "ey", descriptor = "()F", line = 389)
	public float method5931() {
		return this.aFloat97;
	}

	@OriginalMember(owner = "client!ha", name = "ae", descriptor = "(S)F", line = 393)
	public float method5845() {
		return this.aFloat108;
	}

	@OriginalMember(owner = "client!ha", name = "ej", descriptor = "()F", line = 397)
	public float method5807() {
		return this.aFloat109;
	}

	@OriginalMember(owner = "client!ha", name = "ad", descriptor = "(B)F", line = 397)
	public float method5886() {
		return this.aFloat109;
	}

	@OriginalMember(owner = "client!ha", name = "er", descriptor = "()F", line = 397)
	public float method5932() {
		return this.aFloat109;
	}

	@OriginalMember(owner = "client!ha", name = "en", descriptor = "()F", line = 397)
	public float method5934() {
		return this.aFloat109;
	}

	@OriginalMember(owner = "client!ha", name = "ew", descriptor = "()F", line = 397)
	public float method5935() {
		return this.aFloat109;
	}

	@OriginalMember(owner = "client!ha", name = "aw", descriptor = "(I)Z", line = 401)
	public boolean method5914() {
		return this.aBoolean142;
	}

	@OriginalMember(owner = "client!ha", name = "em", descriptor = "()Z", line = 401)
	public boolean method5936() {
		return this.aBoolean142;
	}

	@OriginalMember(owner = "client!ha", name = "ac", descriptor = "(I)Z", line = 405)
	public boolean method5854() {
		return this.aBoolean141;
	}

	@OriginalMember(owner = "client!ha", name = "ec", descriptor = "()Z", line = 405)
	public boolean method5937() {
		return this.aBoolean141;
	}

	@OriginalMember(owner = "client!ha", name = "al", descriptor = "(Lclient!aml;I)Ljava/lang/String;", line = 1090)
	public static String method5943(@OriginalArg(0) Class3_Sub1_Sub7 arg0) {
		if (Class250.aBoolean688 || arg0 == null) {
			return "";
		} else if ((arg0.aString109 == null || arg0.aString109.length() == 0) && arg0.aString111 != null && arg0.aString111.length() > 0) {
			return arg0.aString111;
		} else {
			return arg0.aString109;
		}
	}

	@OriginalMember(owner = "client!ha", name = "bh", descriptor = "(Lclient!vs;I)V", line = 4344)
	static final void method5939(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class189.method23985(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!ha", name = "yf", descriptor = "(Lclient!vs;B)V", line = 8569)
	static final void method5940(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = arg0.aClass245_4.aByte131;
	}

	@OriginalMember(owner = "client!ha", name = "avr", descriptor = "(Lclient!vs;I)V", line = 12779)
	static final void method5941(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class390.anInt3019 * 1617726299;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class390.anInt3019 * 1617726299;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 1;
	}
}
