package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public class Class202 {

	@OriginalMember(owner = "client!gm", name = "p", descriptor = "Z")
	public static boolean aBoolean664 = false;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "()V", line = 7)
	Class202() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!gm", name = "kq", descriptor = "(Lclient!vs;I)V", line = 6060)
	static final void method24160(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		Class77.method21574(local11, arg0);
	}

	@OriginalMember(owner = "client!gm", name = "rx", descriptor = "(Lclient!vs;I)V", line = 7320)
	static final void method24162(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local16.anInt3520 * 1884512825;
	}

	@OriginalMember(owner = "client!gm", name = "yi", descriptor = "(Lclient!vs;S)V", line = 8565)
	static final void method24161(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = arg0.aClass245_4.aByte133;
	}
}
