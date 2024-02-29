package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public class Class347 {

	@OriginalMember(owner = "client!jp", name = "p", descriptor = "I")
	static final int anInt4489 = 11;

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "I")
	static final int anInt4490 = 2048;

	@OriginalMember(owner = "client!jp", name = "v", descriptor = "I")
	static final int anInt4491 = 2;

	@OriginalMember(owner = "client!jp", name = "l", descriptor = "I")
	static final int anInt4492 = 6;

	@OriginalMember(owner = "client!jp", name = "y", descriptor = "[I")
	static int[] anIntArray442 = new int[512];

	static {
		@Pc(4) byte local4 = 9;
		for (@Pc(8) int local8 = local4 - 1; local8 >= 0; local8--) {
			@Pc(18) int local18 = 0x1 << local4 - local8 - 1;
			@Pc(24) int local24 = 0x1 << local4 - local8;
			for (@Pc(26) int local26 = local18; local26 < local24; local26++) {
				anIntArray442[local26] = (local8 << 6) + (local24 - local26 << 6 >>> local4 - local8 - 1);
			}
		}
	}

	@OriginalMember(owner = "client!jp", name = "v", descriptor = "(Lclient!aba;B)V", line = 28)
	public static void method27848(@OriginalArg(0) Class27 arg0) {
		Class86.method19916(new Class572(arg0));
	}

	@OriginalMember(owner = "client!jp", name = "dn", descriptor = "(Lclient!yf;S)V", line = 5046)
	static final void method27849(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class566.method31373(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!jp", name = "dc", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 5176)
	static final void method27850(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg2.anInt5784 -= 1235998252;
		arg0.anInt3901 = arg2.anIntArray536[arg2.anInt5784 * 2088438307] * 41070409;
		arg0.anInt3925 = arg2.anIntArray536[arg2.anInt5784 * 2088438307 + 1] * -2102679829;
		arg0.anInt3902 = arg2.anIntArray536[arg2.anInt5784 * 2088438307 + 2] * -1553197639;
		arg0.anInt3903 = arg2.anIntArray536[arg2.anInt5784 * 2088438307 + 3] * -782514323;
		Class461.method29531(arg0);
	}
}
