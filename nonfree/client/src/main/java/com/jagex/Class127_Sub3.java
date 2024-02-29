package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ais")
final class Class127_Sub3 extends Class127 {

	@OriginalMember(owner = "client!ais", name = "c", descriptor = "(Lclient!yf;S)V", line = 21)
	static void method12942(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class324.method27480();
	}

	@OriginalMember(owner = "client!ais", name = "<init>", descriptor = "(Lclient!xl;IZZ)V", line = 51)
	Class127_Sub3(@OriginalArg(0) Class647 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, (Class127_Sub1) null);
	}

	@OriginalMember(owner = "client!ais", name = "q", descriptor = "(Lclient!ci;)Ljava/lang/Object;", line = 53)
	@Override
	Object method13153(@OriginalArg(0) Class75 arg0) {
		return arg0.aClass498_6 == Class498.aClass498_8 ? -1 : arg0.aClass498_6.method30201();
	}

	@OriginalMember(owner = "client!ais", name = "t", descriptor = "(Lclient!ci;I)Ljava/lang/Object;", line = 53)
	@Override
	Object method13151(@OriginalArg(0) Class75 arg0) {
		return arg0.aClass498_6 == Class498.aClass498_8 ? -1 : arg0.aClass498_6.method30201();
	}

	@OriginalMember(owner = "client!ais", name = "x", descriptor = "(Lclient!ci;)Ljava/lang/Object;", line = 53)
	@Override
	Object method13152(@OriginalArg(0) Class75 arg0) {
		return arg0.aClass498_6 == Class498.aClass498_8 ? -1 : arg0.aClass498_6.method30201();
	}

	@OriginalMember(owner = "client!ais", name = "y", descriptor = "(B)V", line = 59)
	static void method12943() {
		Class73.aClass232_5.method25857();
	}

	@OriginalMember(owner = "client!ais", name = "ag", descriptor = "(I)V", line = 167)
	static void method12944() {
		@Pc(3) Class77_Sub1_Sub6 local3 = Class456.method29469(14, 0L);
		local3.method21544();
	}
}
