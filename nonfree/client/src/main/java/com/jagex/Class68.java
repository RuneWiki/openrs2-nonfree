package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public class Class68 {

	@OriginalMember(owner = "client!aj", name = "st", descriptor = "Lclient!ago;")
	public static Class3_Sub30 aClass3_Sub30_2;

	@OriginalMember(owner = "client!aj", name = "w", descriptor = "[Lclient!co;")
	static Class6[] aClass6Array5;

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "Lclient!ew;")
	static Class161 aClass161_10 = new Class161(4);

	@OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
	public int anInt2009;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
	int anInt2010;

	@OriginalMember(owner = "client!aj", name = "x", descriptor = "I")
	public int anInt2011;

	@OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
	public int anInt2012;

	@OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
	int anInt2013;

	@OriginalMember(owner = "client!aj", name = "y", descriptor = "I")
	public int anInt2014;

	@OriginalMember(owner = "client!aj", name = "s", descriptor = "I")
	int anInt2015;

	@OriginalMember(owner = "client!aj", name = "p", descriptor = "I")
	public int anInt2017;

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
	int anInt2018;

	@OriginalMember(owner = "client!aj", name = "u", descriptor = "I")
	public int anInt2016 = -696283591;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V", line = 24)
	Class68() {
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)Lclient!wo;", line = 24)
	public static Class557 method14038(@OriginalArg(0) int arg0) {
		@Pc(2) Class557[] local2 = Class213.method24266();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class557 local12 = local2[local4];
			if (local12.anInt5335 * -426129241 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aj", name = "x", descriptor = "(Lclient!de;IIIII)Lclient!dh;", line = 27)
	public static Class20 method14025(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(2) long local2 = (long) arg5;
		@Pc(7) Class20 local7 = (Class20) aClass161_10.method23219(local2);
		@Pc(9) short local9 = 2055;
		if (local7 == null) {
			@Pc(16) Class138 local16 = Class138.method22955(Class55.aClass359_17, arg5, 0);
			if (local16 == null) {
				return null;
			}
			if (local16.anInt3415 < 13) {
				local16.method22968(2);
			}
			local7 = arg0.method17100(local16, local9, Class212.anInt3704 * -1018743043, 64, 768);
			aClass161_10.method23222(local7, local2);
		}
		local7 = local7.method5430((byte) 6, local9, true);
		if (arg1 != 0) {
			local7.method5329(arg1);
		}
		if (arg2 != 0) {
			local7.method5331(arg2);
		}
		if (arg3 != 0) {
			local7.method5482(arg3);
		}
		if (arg4 != 0) {
			local7.method5333(0, arg4, 0);
		}
		return local7;
	}

	@OriginalMember(owner = "client!aj", name = "s", descriptor = "()V", line = 51)
	static void method14027() {
		aClass161_10.method23224();
	}

	@OriginalMember(owner = "client!aj", name = "u", descriptor = "()V", line = 51)
	static void method14028() {
		aClass161_10.method23224();
	}

	@OriginalMember(owner = "client!aj", name = "y", descriptor = "(I)V", line = 55)
	static void method14029(@OriginalArg(0) int arg0) {
		aClass161_10.method23240(arg0);
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V", line = 55)
	static void method14030(@OriginalArg(0) int arg0) {
		aClass161_10.method23240(arg0);
	}

	@OriginalMember(owner = "client!aj", name = "z", descriptor = "()V", line = 59)
	static void method14026() {
		aClass161_10.method23245();
	}

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "()V", line = 59)
	static void method14031() {
		aClass161_10.method23245();
	}

	@OriginalMember(owner = "client!aj", name = "j", descriptor = "()V", line = 59)
	static void method14032() {
		aClass161_10.method23245();
	}

	@OriginalMember(owner = "client!aj", name = "h", descriptor = "(II)V", line = 79)
	public static void method14033(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Class482.anInt5158 = arg0 * 1523104401;
		Class482.aClass478Array1 = new Class478[Class126.anIntArray324[Class482.anInt5158 * 1631733361] + 1];
		Class482.anInt5156 = 0;
		Class482.anInt5154 = 0;
	}

	@OriginalMember(owner = "client!aj", name = "ff", descriptor = "(S)V", line = 2292)
	static void method14037() {
		@Pc(3) int local3 = Class128.anInt3317 * 2037417253;
		@Pc(7) int local7 = Class575.anInt5428 * 1261116487;
		if (client.anInt3026 * -2098608041 < local3) {
			local3 = client.anInt3026 * -2098608041;
		}
		if (Class613.anInt5546 * -457495395 < local7) {
			local7 = Class613.anInt5546 * -457495395;
		}
		try {
			if (Class510.aClass3_Sub45_37 != null) {
				Class300.aClass300_5.method25653(new Object[] { local3, local7, Class492.method29292(), Class510.aClass3_Sub45_37.aClass60_Sub8_1.method13313() });
			}
		} catch (@Pc(58) Throwable local58) {
		}
	}

	@OriginalMember(owner = "client!aj", name = "kp", descriptor = "(Lclient!vs;I)V", line = 6077)
	static final void method14034(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class245.method24868(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!aj", name = "uu", descriptor = "(Lclient!vs;I)V", line = 7789)
	static final void method14035(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class424.aClass165_1.method23323(local12);
	}

	@OriginalMember(owner = "client!aj", name = "ko", descriptor = "([Lclient!fo;IIIZI)V", line = 10262)
	public static void method14036(@OriginalArg(0) Class178[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Class178 local9 = arg0[local1];
			if (local9 != null && arg1 == local9.anInt3500 * 610124465) {
				Class342.method26475(local9, arg2, arg3, arg4);
				Class465.method28644(local9, arg2, arg3);
				if (local9.anInt3573 * 598019781 > local9.anInt3554 * -1920517457 - local9.anInt3498 * -1494060731) {
					local9.anInt3573 = local9.anInt3554 * 1185987299 - local9.anInt3498 * 2047737985;
				}
				if (local9.anInt3573 * 598019781 < 0) {
					local9.anInt3573 = 0;
				}
				if (local9.anInt3557 * 1648318741 > local9.anInt3505 * 247707339 - local9.anInt3499 * -751005789) {
					local9.anInt3557 = local9.anInt3505 * -2133522337 - local9.anInt3499 * 1449624535;
				}
				if (local9.anInt3557 * 1648318741 < 0) {
					local9.anInt3557 = 0;
				}
				if (local9.anInt3492 * -107621169 == 0) {
					Class491.method29255(arg0, local9, arg4);
				}
			}
		}
	}
}
