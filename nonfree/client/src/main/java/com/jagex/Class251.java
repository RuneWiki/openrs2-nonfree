package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
class Class251 implements Interface41 {

	@OriginalMember(owner = "client!fl", name = "hi", descriptor = "Lclient!anr;")
	public static Class35_Sub10 aClass35_Sub10_3;

	// $FF: synthetic field
	@OriginalMember(owner = "client!fl", name = "this$0", descriptor = "Lclient!fw;")
	final Class261 this$0;

	@OriginalMember(owner = "client!fl", name = "an", descriptor = "(III)V", line = 287)
	static void method26172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class77_Sub1_Sub6 local4 = Class456.method29469(15, (long) arg0);
		local4.method21545();
		local4.anInt2959 = arg1 * 517206857;
	}

	@OriginalMember(owner = "client!fl", name = "ab", descriptor = "(IZI)V", line = 293)
	static void method26173(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) Class77_Sub1_Sub6 local4 = Class456.method29469(22, (long) arg0);
		local4.method21545();
		local4.anInt2959 = (arg1 ? 1 : 0) * 517206857;
	}

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lclient!fw;)V", line = 480)
	Class251(@OriginalArg(0) Class261 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!fl", name = "p", descriptor = "(S)F", line = 482)
	@Override
	public float method26249() {
		return (float) Class35_Sub6.aClass77_Sub35_45.aClass143_Sub27_5.method15901() / 255.0F;
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "()F", line = 482)
	@Override
	public float method26250() {
		return (float) Class35_Sub6.aClass77_Sub35_45.aClass143_Sub27_5.method15901() / 255.0F;
	}

	@OriginalMember(owner = "client!fl", name = "jp", descriptor = "(Lclient!yf;I)V", line = 6192)
	static final void method26174(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class92.method23488(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!fl", name = "wi", descriptor = "(Lclient!yf;I)V", line = 8521)
	static final void method26175(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anInt2904 * 1423663301;
	}

	@OriginalMember(owner = "client!fl", name = "ags", descriptor = "(Lclient!yf;I)V", line = 10536)
	static final void method26176(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = RuntimeException_Sub4.aClass41_2.method688(local12).method22314();
	}

	@OriginalMember(owner = "client!fl", name = "aoe", descriptor = "(Lclient!yf;I)V", line = 12001)
	static final void method26177(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aBoolean587 ? 1 : 0;
	}
}
