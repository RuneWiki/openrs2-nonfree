package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jv")
public class Class265 {

	@OriginalMember(owner = "client!jv", name = "af", descriptor = "I")
	static int anInt4208;

	@OriginalMember(owner = "client!jv", name = "h", descriptor = "Lclient!pg;")
	public static Class47 aClass47_1;

	@OriginalMember(owner = "client!jv", name = "p", descriptor = "Lclient!jv;")
	public static final Class265 aClass265_1 = new Class265();

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "Lclient!jv;")
	public static final Class265 aClass265_2 = new Class265();

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "()V", line = 7)
	Class265() {
	}

	@OriginalMember(owner = "client!jv", name = "jt", descriptor = "(Lclient!vs;I)V", line = 5794)
	static final void method25234(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class396.method27505(local11, local14, arg0);
	}
}
