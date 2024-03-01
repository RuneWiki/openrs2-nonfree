package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public class Class195 {

	@OriginalMember(owner = "client!ge", name = "ix", descriptor = "Lclient!qg;")
	static Class62 aClass62_3;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V", line = 9)
	Class195() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "(Lclient!gp;)V", line = 14)
	public static void method24082(@OriginalArg(0) Class205 arg0) {
		Class154.aClass205_1 = arg0;
	}

	@OriginalMember(owner = "client!ge", name = "x", descriptor = "(Lclient!gp;)V", line = 14)
	public static void method24084(@OriginalArg(0) Class205 arg0) {
		Class154.aClass205_1 = arg0;
	}

	@OriginalMember(owner = "client!ge", name = "s", descriptor = "(Lclient!gp;)V", line = 14)
	public static void method24088(@OriginalArg(0) Class205 arg0) {
		Class154.aClass205_1 = arg0;
	}

	@OriginalMember(owner = "client!ge", name = "u", descriptor = "(Lclient!ahb;Ljava/lang/String;)I", line = 18)
	public static int method24085(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) String arg1) {
		@Pc(4) int local4 = arg0.anInt2803 * 62066237;
		@Pc(8) byte[] local8 = Class281.method25434(arg1);
		arg0.method20267(local8.length);
		arg0.anInt2803 += Class154.aClass205_1.method24180(local8, 0, local8.length, arg0.aByteArray51, arg0.anInt2803 * 62066237) * -918980331;
		return arg0.anInt2803 * 62066237 - local4;
	}

	@OriginalMember(owner = "client!ge", name = "y", descriptor = "(Lclient!ahb;Ljava/lang/String;)I", line = 18)
	public static int method24086(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) String arg1) {
		@Pc(4) int local4 = arg0.anInt2803 * 62066237;
		@Pc(8) byte[] local8 = Class281.method25434(arg1);
		arg0.method20267(local8.length);
		arg0.anInt2803 += Class154.aClass205_1.method24180(local8, 0, local8.length, arg0.aByteArray51, arg0.anInt2803 * 62066237) * -918980331;
		return arg0.anInt2803 * 62066237 - local4;
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(Lclient!ahb;)Ljava/lang/String;", line = 26)
	public static String method24083(@OriginalArg(0) Class3_Sub41 arg0) {
		return Class164.method23305(arg0, 32767);
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(Lclient!ahb;)Ljava/lang/String;", line = 26)
	public static String method24087(@OriginalArg(0) Class3_Sub41 arg0) {
		return Class164.method23305(arg0, 32767);
	}

	@OriginalMember(owner = "client!ge", name = "z", descriptor = "(Lclient!ahb;I)Ljava/lang/String;", line = 31)
	static String method24089(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) int local3 = arg0.method20334();
			if (local3 > arg1) {
				local3 = arg1;
			}
			@Pc(11) byte[] local11 = new byte[local3];
			arg0.anInt2803 += Class154.aClass205_1.method24179(arg0.aByteArray51, arg0.anInt2803 * 62066237, local11, 0, local3) * -918980331;
			return Class60_Sub7.method13289(local11, 0, local3);
		} catch (@Pc(39) Exception local39) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!ge", name = "aax", descriptor = "(Lclient!vs;I)V", line = 8753)
	static final void method24090(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(18) int local18 = client.aClass367Array1[local12].method26908();
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local18 == 1 ? 1 : 0;
	}

	@OriginalMember(owner = "client!ge", name = "jw", descriptor = "(IIIIIIIII)V", line = 9409)
	public static void method24091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < 0 || arg2 < 0 || arg1 >= client.aClass370_1.method26943() - 1 || arg2 >= client.aClass370_1.method27062() - 1) {
			return;
		}
		if (client.aClass370_1.method26950() == null) {
			return;
		}
		@Pc(35) Interface43 local35;
		if (arg3 == 0) {
			local35 = (Interface43) client.aClass370_1.method26950().method28066(arg0, arg1, arg2);
			@Pc(45) Interface43 local45 = (Interface43) client.aClass370_1.method26950().method28067(arg0, arg1, arg2);
			if (local35 != null && arg4 != 2) {
				if (local35 instanceof Class26_Sub1_Sub3_Sub2) {
					((Class26_Sub1_Sub3_Sub2) local35).aClass387_3.method27366(arg6, arg7);
				} else {
					Class85.method21639(arg0, arg3, arg1, arg2, local35.method11163(), arg5, arg4, arg6, arg7);
				}
			}
			if (local45 != null) {
				if (local45 instanceof Class26_Sub1_Sub3_Sub2) {
					((Class26_Sub1_Sub3_Sub2) local45).aClass387_3.method27366(arg6, arg7);
				} else {
					Class85.method21639(arg0, arg3, arg1, arg2, local45.method11163(), arg5, arg4, arg6, arg7);
				}
			}
		} else if (arg3 == 1) {
			local35 = (Interface43) client.aClass370_1.method26950().method28200(arg0, arg1, arg2);
			if (local35 != null) {
				if (local35 instanceof Class26_Sub1_Sub4_Sub1) {
					((Class26_Sub1_Sub4_Sub1) local35).aClass387_4.method27366(arg6, arg7);
				} else {
					@Pc(132) int local132 = local35.method11163();
					if (arg4 == 4 || arg4 == 5) {
						Class85.method21639(arg0, arg3, arg1, arg2, local132, arg5, 4, arg6, arg7);
					} else if (arg4 == 6) {
						Class85.method21639(arg0, arg3, arg1, arg2, local132, arg5 + 4, 4, arg6, arg7);
					} else if (arg4 == 7) {
						Class85.method21639(arg0, arg3, arg1, arg2, local132, (arg5 + 2 & 0x3) + 4, 4, arg6, arg7);
					} else if (arg4 == 8) {
						Class85.method21639(arg0, arg3, arg1, arg2, local132, arg5 + 4, 4, arg6, arg7);
						Class85.method21639(arg0, arg3, arg1, arg2, local132, (arg5 + 2 & 0x3) + 4, 4, arg6, arg7);
					}
				}
			}
		} else if (arg3 == 2) {
			local35 = (Interface43) client.aClass370_1.method26950().method28150(arg0, arg1, arg2, client.anInterface48_1);
			if (local35 != null) {
				if (arg4 == 11) {
					arg4 = 10;
				}
				if (local35 instanceof Class26_Sub1_Sub1_Sub2) {
					((Class26_Sub1_Sub1_Sub2) local35).aClass387_1.method27366(arg6, arg7);
				} else {
					Class85.method21639(arg0, arg3, arg1, arg2, local35.method11163(), arg5, arg4, arg6, arg7);
				}
			}
		} else if (arg3 == 3) {
			local35 = (Interface43) client.aClass370_1.method26950().method28053(arg0, arg1, arg2);
			if (local35 != null) {
				if (local35 instanceof Class26_Sub1_Sub2_Sub1) {
					((Class26_Sub1_Sub2_Sub1) local35).aClass387_2.method27366(arg6, arg7);
				} else {
					Class85.method21639(arg0, arg3, arg1, arg2, local35.method11163(), arg5, arg4, arg6, arg7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "att", descriptor = "(Lclient!vs;B)V", line = 12390)
	static final void method24092(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub5_1.method12921() ? 1 : 0;
	}
}
