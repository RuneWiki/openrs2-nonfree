package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aoj")
public class Class35_Sub19 extends Class35 {

	@OriginalMember(owner = "client!aoj", name = "<init>", descriptor = "(Lclient!ym;Lclient!yi;Lclient!pw;)V", line = 12)
	public Class35_Sub19(@OriginalArg(0) Class670 arg0, @OriginalArg(1) Class667 arg1, @OriginalArg(2) Class478 arg2) {
		super(arg0, arg1, arg2, Class647.aClass647_90, 64, new Class46(Class77_Sub1_Sub2.class));
	}

	@OriginalMember(owner = "client!aoj", name = "p", descriptor = "(Lclient!akv;I)Lclient!mq;", line = 29)
	static Class118 method17775(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(6) Class410 local6 = Class683.method36094()[arg0.method22478()];
		@Pc(13) Class402 local13 = Class700.method36485()[arg0.method22478()];
		@Pc(17) int local17 = arg0.method22487();
		@Pc(21) int local21 = arg0.method22487();
		@Pc(25) int local25 = arg0.method22483();
		@Pc(29) int local29 = arg0.method22483();
		@Pc(33) int local33 = arg0.method22487();
		@Pc(37) int local37 = arg0.method22549();
		@Pc(41) int local41 = arg0.method22500();
		return new Class118(local6, local13, local17, local21, local25, local29, local33, local37, local41);
	}
}
