package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!amm")
public class Class3_Sub1_Sub8 extends Class3_Sub1 {

	@OriginalMember(owner = "client!amm", name = "s", descriptor = "Lclient!aol;")
	Class26_Sub1_Sub1_Sub5 aClass26_Sub1_Sub1_Sub5_1;

	@OriginalMember(owner = "client!amm", name = "abj", descriptor = "(Lclient!vs;I)V", line = 8911)
	static final void method19030(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = ~local12;
	}

	@OriginalMember(owner = "client!amm", name = "<init>", descriptor = "(Lclient!aol;)V", line = 11860)
	public Class3_Sub1_Sub8(@OriginalArg(0) Class26_Sub1_Sub1_Sub5 arg0) {
		this.aClass26_Sub1_Sub1_Sub5_1 = arg0;
	}
}
