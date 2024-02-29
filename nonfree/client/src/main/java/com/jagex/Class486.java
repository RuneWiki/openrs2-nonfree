package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public class Class486 {

	@OriginalMember(owner = "client!qg", name = "ay", descriptor = "I")
	public static int anInt5040;

	@OriginalMember(owner = "client!qg", name = "wt", descriptor = "Lclient!u;")
	static Class569 aClass569_1;

	@OriginalMember(owner = "client!qg", name = "p", descriptor = "Lclient!qg;")
	static final Class486 aClass486_2 = new Class486(0);

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "Lclient!qg;")
	public static final Class486 aClass486_6 = new Class486(1);

	@OriginalMember(owner = "client!qg", name = "v", descriptor = "Lclient!qg;")
	public static final Class486 aClass486_1 = new Class486(2);

	@OriginalMember(owner = "client!qg", name = "l", descriptor = "Lclient!qg;")
	public static final Class486 aClass486_4 = new Class486(3);

	@OriginalMember(owner = "client!qg", name = "y", descriptor = "Lclient!qg;")
	public static final Class486 aClass486_5 = new Class486(4);

	@OriginalMember(owner = "client!qg", name = "w", descriptor = "Lclient!qg;")
	public static final Class486 aClass486_8 = new Class486(5);

	@OriginalMember(owner = "client!qg", name = "t", descriptor = "Lclient!qg;")
	public static final Class486 aClass486_7 = new Class486(6);

	@OriginalMember(owner = "client!qg", name = "q", descriptor = "Lclient!qg;")
	public static final Class486 aClass486_3 = new Class486(7);

	@OriginalMember(owner = "client!qg", name = "x", descriptor = "Lclient!qg;")
	static final Class486 aClass486_9 = new Class486(8);

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "Lclient!qg;")
	public static final Class486 aClass486_10 = new Class486(9);

	@OriginalMember(owner = "client!qg", name = "s", descriptor = "I")
	final int anInt5039;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(I)V", line = 17)
	Class486(@OriginalArg(0) int arg0) {
		this.anInt5039 = arg0 * 1422197795;
	}

	@OriginalMember(owner = "client!qg", name = "s", descriptor = "(I)V", line = 370)
	static void method29979() {
		if (Class504.anInt3372 * 1644564029 > 1) {
			Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub32_1, 4);
		} else {
			Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub32_1, 2);
		}
	}

	@OriginalMember(owner = "client!qg", name = "t", descriptor = "(Lclient!arc;I)V", line = 472)
	static final void method29980(@OriginalArg(0) Class77_Sub39_Sub1 arg0) {
		for (@Pc(1) int local1 = 0; local1 < Class152.anInt2401 * -1852482743; local1++) {
			arg0.method22483();
			@Pc(14) int local14 = Class152.anIntArray223[local1];
			@Pc(18) Class104_Sub1_Sub1_Sub1_Sub2 local18 = client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[local14];
			@Pc(22) int local22 = arg0.method22478();
			if ((local22 & 0x20) != 0) {
				local22 += arg0.method22478() << 8;
			}
			if ((local22 & 0x800) != 0) {
				local22 += arg0.method22478() << 16;
			}
			Class37.method656(arg0, local14, local18, local22);
		}
	}

	@OriginalMember(owner = "client!qg", name = "aa", descriptor = "(Lclient!yf;B)V", line = 4603)
	static final void method29981(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5782 -= 1091885681;
	}

	@OriginalMember(owner = "client!qg", name = "qv", descriptor = "(Lclient!yf;I)V", line = 7454)
	static final void method29982(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local11.anInt3880 * 2142374941;
	}

	@OriginalMember(owner = "client!qg", name = "acf", descriptor = "(Lclient!yf;I)V", line = 9544)
	static final void method29983(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		if (local13 == 0) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = (int) Math.pow((double) local13, (double) local23);
		}
	}
}
