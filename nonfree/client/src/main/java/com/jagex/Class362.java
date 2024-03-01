package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
class Class362 implements Interface32 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!oa", name = "this$0", descriptor = "Lclient!on;")
	final Class371 this$0;

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "(II)Z", line = 52)
	static boolean method26776(@OriginalArg(0) int arg0) {
		return arg0 >= Class456.aClass456_7.anInt5061 * 821735799 && arg0 <= Class456.aClass456_11.anInt5061 * 821735799;
	}

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lclient!on;)V", line = 74)
	Class362(@OriginalArg(0) Class371 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "()V", line = 76)
	@Override
	public void method26774() {
		this.this$0.method27088(true);
	}

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "(I)V", line = 76)
	@Override
	public void method26775() {
		this.this$0.method27088(true);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "()V", line = 76)
	@Override
	public void method26773() {
		this.this$0.method27088(true);
	}

	@OriginalMember(owner = "client!oa", name = "aq", descriptor = "(IS)V", line = 163)
	public static void method26779(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(22, (long) arg0);
		local4.method19145();
	}

	@OriginalMember(owner = "client!oa", name = "lo", descriptor = "(Lclient!vs;B)V", line = 6260)
	static final void method26777(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class301.method25663(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!oa", name = "ux", descriptor = "(Lclient!vs;S)V", line = 7760)
	static final void method26778(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class352.aClass621_1.method33757(local12).anInt5549 * -613706239;
	}
}
