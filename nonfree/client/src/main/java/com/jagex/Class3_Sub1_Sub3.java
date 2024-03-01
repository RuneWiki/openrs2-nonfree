package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!amd")
public abstract class Class3_Sub1_Sub3 extends Class3_Sub1 {

	@OriginalMember(owner = "client!amd", name = "<init>", descriptor = "()V", line = 6)
	Class3_Sub1_Sub3() {
	}

	@OriginalMember(owner = "client!amd", name = "gx", descriptor = "(Lclient!vs;B)V", line = 5242)
	static final void method21265(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class628.method33833(local11, local14, arg0);
	}
}
