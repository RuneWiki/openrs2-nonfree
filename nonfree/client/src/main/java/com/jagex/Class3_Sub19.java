package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agd")
public class Class3_Sub19 extends Class3 {

	@OriginalMember(owner = "client!agd", name = "l", descriptor = "I")
	int anInt2839;

	@OriginalMember(owner = "client!agd", name = "h", descriptor = "Ljava/lang/String;")
	String aString126;

	@OriginalMember(owner = "client!agd", name = "<init>", descriptor = "()V", line = 68)
	Class3_Sub19() {
	}

	@OriginalMember(owner = "client!agd", name = "ik", descriptor = "(Lclient!vs;I)V", line = 5515)
	static final void method20809(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class148.method23116(local11, local14, arg0);
	}
}
