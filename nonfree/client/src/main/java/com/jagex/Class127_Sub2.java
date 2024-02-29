package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aio")
final class Class127_Sub2 extends Class127 {

	@OriginalMember(owner = "client!aio", name = "ta", descriptor = "I")
	static int anInt1420;

	@OriginalMember(owner = "client!aio", name = "<init>", descriptor = "(Lclient!xl;IZZ)V", line = 29)
	Class127_Sub2(@OriginalArg(0) Class647 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, (Class127_Sub1) null);
	}

	@OriginalMember(owner = "client!aio", name = "x", descriptor = "(Lclient!ci;)Ljava/lang/Object;", line = 31)
	@Override
	Object method13152(@OriginalArg(0) Class75 arg0) {
		return Class498.aClass498_8 == arg0.aClass498_6 ? -1 : arg0.aClass498_6.method30201();
	}

	@OriginalMember(owner = "client!aio", name = "t", descriptor = "(Lclient!ci;I)Ljava/lang/Object;", line = 31)
	@Override
	Object method13151(@OriginalArg(0) Class75 arg0) {
		return Class498.aClass498_8 == arg0.aClass498_6 ? -1 : arg0.aClass498_6.method30201();
	}

	@OriginalMember(owner = "client!aio", name = "q", descriptor = "(Lclient!ci;)Ljava/lang/Object;", line = 31)
	@Override
	Object method13153(@OriginalArg(0) Class75 arg0) {
		return Class498.aClass498_8 == arg0.aClass498_6 ? -1 : arg0.aClass498_6.method30201();
	}

	@OriginalMember(owner = "client!aio", name = "aoa", descriptor = "(Lclient!yf;B)V", line = 12104)
	static final void method12579(@OriginalArg(0) Class665 arg0) {
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub2_1, arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307] == 1 ? 1 : 0);
		Class667.method33150();
		client.aBoolean593 = false;
	}
}
