package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public class Class516 {

	@OriginalMember(owner = "client!ro", name = "p", descriptor = "Lclient!rb;")
	Class505 aClass505_9;

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "Lclient!arc;")
	Class77_Sub39_Sub1 aClass77_Sub39_Sub1_3;

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(Lclient!rb;Lclient!arc;)V", line = 9)
	public Class516(@OriginalArg(0) Class505 arg0, @OriginalArg(1) Class77_Sub39_Sub1 arg1) {
		this.aClass505_9 = arg0;
		this.aClass77_Sub39_Sub1_3 = arg1;
	}

	@OriginalMember(owner = "client!ro", name = "s", descriptor = "(Ljava/lang/CharSequence;I)I", line = 147)
	public static int method30379(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			local4 = (local4 << 5) - local4 + arg0.charAt(local6);
		}
		return local4;
	}

	@OriginalMember(owner = "client!ro", name = "u", descriptor = "(Lclient!zo;I)V", line = 163)
	static void method30380(@OriginalArg(0) Class697 arg0) {
		Class98.aClass697_2 = arg0;
		Class77_Sub3_Sub2.aString96 = null;
	}

	@OriginalMember(owner = "client!ro", name = "xt", descriptor = "(Lclient!yf;B)V", line = 8759)
	static final void method30381(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 1544997815;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(33) int local33 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		@Pc(43) int local43 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 3];
		@Pc(53) int local53 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 4];
		if (local33 == -1) {
			throw new RuntimeException();
		}
		@Pc(66) Class36 local66 = (Class36) Class663.aClass35_Sub21_1.method18319(local33);
		if (local66.aClass498_2.method36479() != local23) {
			throw new RuntimeException();
		} else if (local66.aClass498_1.method36479() == local13) {
			@Pc(90) int[] local90 = local66.method631(local43);
			if (local53 < 0 || local90 == null || local90.length <= local53) {
				throw new RuntimeException();
			}
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local90[local53];
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ro", name = "aan", descriptor = "(Lclient!yf;I)V", line = 9255)
	static final void method30382(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = arg0.aClass368_3.anInt4552 * 35375019;
	}

	@OriginalMember(owner = "client!ro", name = "abt", descriptor = "(Lclient!yf;I)V", line = 9475)
	static final void method30383(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local13 * local23;
	}

	@OriginalMember(owner = "client!ro", name = "avi", descriptor = "(Lclient!yf;I)V", line = 13142)
	static final void method30384(@OriginalArg(0) Class665 arg0) {
		@Pc(1) boolean local1 = true;
		if (client.aBoolean588) {
			try {
				@Pc(7) Object local7 = Class413.aClass413_9.method28600();
				if (local7 != null) {
					local1 = (Boolean) local7;
				}
			} catch (@Pc(15) Throwable local15) {
			}
		}
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local1 ? 1 : 0;
	}

	@OriginalMember(owner = "client!ro", name = "ayc", descriptor = "(Lclient!yf;I)V", line = 13566)
	static void method30385(@OriginalArg(0) Class665 arg0) {
		@Pc(9) int local9 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 - 3];
		@Pc(19) int local19 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 - 2];
		@Pc(29) int local29 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 - 1];
		arg0.anInt5784 -= 926998689;
		if (local9 > arg0.anIntArray534[local19]) {
			throw new RuntimeException();
		} else if (local9 > arg0.anIntArray534[local29]) {
			throw new RuntimeException();
		} else if (local29 == local19) {
			throw new RuntimeException();
		} else {
			Class474.method29672(arg0.anIntArrayArray64[local19], arg0.anIntArrayArray64[local29], 0, local9 - 1);
		}
	}
}
