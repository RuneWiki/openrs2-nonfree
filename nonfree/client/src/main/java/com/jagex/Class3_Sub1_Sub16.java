package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!amw")
public class Class3_Sub1_Sub16 extends Class3_Sub1 {

	@OriginalMember(owner = "client!amw", name = "s", descriptor = "Lclient!aoa;")
	Class26_Sub1_Sub1_Sub4 aClass26_Sub1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!amw", name = "p", descriptor = "(Lclient!ahb;I)Lclient!km;", line = 28)
	public static Class281 method19425(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(6) Class277 local6 = Class3_Sub30.method11638()[arg0.method20269()];
		@Pc(13) Class276 local13 = Class400.method27575()[arg0.method20269()];
		@Pc(17) int local17 = arg0.method20272();
		@Pc(21) int local21 = arg0.method20272();
		@Pc(25) int local25 = arg0.method20375();
		@Pc(29) int local29 = arg0.method20275();
		@Pc(33) int local33 = arg0.method20269();
		return new Class281(local6, local13, local17, local21, local25, local29, local33);
	}

	@OriginalMember(owner = "client!amw", name = "<init>", descriptor = "(Lclient!aoa;)V", line = 11868)
	public Class3_Sub1_Sub16(@OriginalArg(0) Class26_Sub1_Sub1_Sub4 arg0) {
		this.aClass26_Sub1_Sub1_Sub4_1 = arg0;
	}
}
