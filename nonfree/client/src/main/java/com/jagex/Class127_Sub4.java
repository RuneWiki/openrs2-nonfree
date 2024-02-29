package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ait")
final class Class127_Sub4 extends Class127 {

	@OriginalMember(owner = "client!ait", name = "<init>", descriptor = "(Lclient!xl;IZZ)V", line = 41)
	Class127_Sub4(@OriginalArg(0) Class647 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, (Class127_Sub1) null);
	}

	@OriginalMember(owner = "client!ait", name = "t", descriptor = "(Lclient!ci;I)Ljava/lang/Object;", line = 43)
	@Override
	Object method13151(@OriginalArg(0) Class75 arg0) {
		return arg0.aClass498_6 == Class498.aClass498_8 ? -1 : arg0.aClass498_6.method30201();
	}

	@OriginalMember(owner = "client!ait", name = "q", descriptor = "(Lclient!ci;)Ljava/lang/Object;", line = 43)
	@Override
	Object method13153(@OriginalArg(0) Class75 arg0) {
		return arg0.aClass498_6 == Class498.aClass498_8 ? -1 : arg0.aClass498_6.method30201();
	}

	@OriginalMember(owner = "client!ait", name = "x", descriptor = "(Lclient!ci;)Ljava/lang/Object;", line = 43)
	@Override
	Object method13152(@OriginalArg(0) Class75 arg0) {
		return arg0.aClass498_6 == Class498.aClass498_8 ? -1 : arg0.aClass498_6.method30201();
	}
}
