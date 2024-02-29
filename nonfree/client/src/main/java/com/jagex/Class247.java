package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public class Class247 implements Interface25 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!fh", name = "this$0", descriptor = "Lclient!fc;")
	final Class242 this$0;

	@OriginalMember(owner = "client!fh", name = "p", descriptor = "Lclient!fp;")
	final Class254 aClass254_1;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lclient!fc;Lclient!akv;)V", line = 160)
	Class247(@OriginalArg(0) Class242 arg0, @OriginalArg(1) Class77_Sub39 arg1) {
		this.this$0 = arg0;
		@Pc(13) boolean local13 = arg1.method22478() != 255;
		if (local13) {
			arg1.anInt3089 -= -1387468933;
		}
		this.aClass254_1 = new Class254(arg1, local13, true);
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(Lclient!fd;)V", line = 167)
	@Override
	public void method26977(@OriginalArg(0) Class243 arg0) {
		arg0.method26071(this.aClass254_1);
	}

	@OriginalMember(owner = "client!fh", name = "p", descriptor = "(Lclient!fd;I)V", line = 167)
	@Override
	public void method26978(@OriginalArg(0) Class243 arg0) {
		arg0.method26071(this.aClass254_1);
	}

	@OriginalMember(owner = "client!fh", name = "v", descriptor = "(Lclient!fd;)V", line = 167)
	@Override
	public void method26979(@OriginalArg(0) Class243 arg0) {
		arg0.method26071(this.aClass254_1);
	}

	@OriginalMember(owner = "client!fh", name = "ah", descriptor = "(IIIIB)V", line = 245)
	static void method26132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class77_Sub1_Sub6 local4 = Class456.method29469(8, (long) arg0);
		local4.method21545();
		local4.anInt2959 = arg1 * 517206857;
		local4.anInt2953 = arg2 * -1621355885;
		local4.anInt2954 = arg3 * -105177451;
	}

	@OriginalMember(owner = "client!fh", name = "qz", descriptor = "(Lclient!yf;I)V", line = 7520)
	static final void method26133(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local11.anInt3954 * 2083357573;
	}
}
