package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aqe")
public class Class77_Sub1_Sub5 extends Class77_Sub1 {

	@OriginalMember(owner = "client!aqe", name = "t", descriptor = "Lclient!atn;")
	Class104_Sub1_Sub1_Sub5 aClass104_Sub1_Sub1_Sub5_1;

	@OriginalMember(owner = "client!aqe", name = "<init>", descriptor = "(Lclient!atn;)V", line = 12521)
	public Class77_Sub1_Sub5(@OriginalArg(0) Class104_Sub1_Sub1_Sub5 arg0) {
		this.aClass104_Sub1_Sub1_Sub5_1 = arg0;
	}
}
