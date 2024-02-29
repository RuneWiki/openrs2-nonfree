package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqa")
public class Class77_Sub1_Sub4 extends Class77_Sub1 {

	@OriginalMember(owner = "client!aqa", name = "t", descriptor = "Lclient!atz;")
	Class104_Sub1_Sub1_Sub6 aClass104_Sub1_Sub1_Sub6_1;

	@OriginalMember(owner = "client!aqa", name = "ao", descriptor = "(IIB)V", line = 177)
	public static void method21358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class77_Sub1_Sub6 local9 = Class456.method29469(20, (long) arg1 << 32 | (long) arg0);
		local9.method21544();
	}

	@OriginalMember(owner = "client!aqa", name = "<init>", descriptor = "(Lclient!atz;)V", line = 12513)
	public Class77_Sub1_Sub4(@OriginalArg(0) Class104_Sub1_Sub1_Sub6 arg0) {
		this.aClass104_Sub1_Sub1_Sub6_1 = arg0;
	}
}
