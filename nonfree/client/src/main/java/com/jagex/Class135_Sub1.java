package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akc")
final class Class135_Sub1 extends Class135 {

	@OriginalMember(owner = "client!akc", name = "<init>", descriptor = "(Ljava/lang/String;IZZ)V", line = 25)
	Class135_Sub1(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, (Class135_Sub1) null);
	}

	@OriginalMember(owner = "client!akc", name = "ba", descriptor = "(Lclient!are;Lclient!aar;I)I", line = 1376)
	static int method13726(@OriginalArg(0) Class77_Sub1_Sub11 arg0, @OriginalArg(1) Class17 arg1) {
		@Pc(3) String local3 = Class632.method32648(arg0);
		return arg1.method299(local3, Class148.aClass83Array6);
	}
}
