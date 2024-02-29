package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aof")
public class Class42_Sub1 extends Class42 {

	@OriginalMember(owner = "client!aof", name = "<init>", descriptor = "(Lclient!ym;Lclient!yi;Lclient!pw;Z)V", line = 12)
	public Class42_Sub1(@OriginalArg(0) Class670 arg0, @OriginalArg(1) Class667 arg1, @OriginalArg(2) Class478 arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, Class647.aClass647_57, arg2, new Class46(Class77_Sub1_Sub3.class), arg3);
	}

	@OriginalMember(owner = "client!aof", name = "p", descriptor = "(Lclient!akv;I)Lclient!mj;", line = 37)
	public static Class401 method17684(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) String local3 = arg0.method22523();
		@Pc(10) Class410 local10 = Class683.method36094()[arg0.method22478()];
		@Pc(17) Class402 local17 = Class700.method36485()[arg0.method22478()];
		@Pc(21) int local21 = arg0.method22487();
		@Pc(25) int local25 = arg0.method22487();
		@Pc(29) int local29 = arg0.method22478();
		@Pc(33) int local33 = arg0.method22478();
		@Pc(37) int local37 = arg0.method22478();
		@Pc(41) int local41 = arg0.method22483();
		@Pc(45) int local45 = arg0.method22483();
		@Pc(49) int local49 = arg0.method22549();
		@Pc(53) int local53 = arg0.method22500();
		@Pc(57) int local57 = arg0.method22500();
		return new Class401(local3, local10, local17, local21, local25, local29, local33, local37, local41, local45, local49, local53, local57);
	}
}
