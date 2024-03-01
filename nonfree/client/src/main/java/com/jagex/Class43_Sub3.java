package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aes")
final class Class43_Sub3 extends Class43 {

	@OriginalMember(owner = "client!aes", name = "<init>", descriptor = "(Lclient!fv;IZZ)V", line = 25)
	Class43_Sub3(@OriginalArg(0) Class185 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, (Class43_Sub5) null);
	}

	@OriginalMember(owner = "client!aes", name = "u", descriptor = "(Lclient!cy;B)Ljava/lang/Object;", line = 27)
	@Override
	Object method9490(@OriginalArg(0) Class11 arg0) {
		return arg0.aClass339_3 == Class339.aClass339_105 || arg0.aClass339_3 == Class339.aClass339_5 ? -1 : arg0.aClass339_3.method26425();
	}

	@OriginalMember(owner = "client!aes", name = "y", descriptor = "(Lclient!cy;)Ljava/lang/Object;", line = 27)
	@Override
	Object method9494(@OriginalArg(0) Class11 arg0) {
		return arg0.aClass339_3 == Class339.aClass339_105 || arg0.aClass339_3 == Class339.aClass339_5 ? -1 : arg0.aClass339_3.method26425();
	}

	@OriginalMember(owner = "client!aes", name = "b", descriptor = "(Lclient!cy;)Ljava/lang/Object;", line = 27)
	@Override
	Object method9495(@OriginalArg(0) Class11 arg0) {
		return arg0.aClass339_3 == Class339.aClass339_105 || arg0.aClass339_3 == Class339.aClass339_5 ? -1 : arg0.aClass339_3.method26425();
	}
}
