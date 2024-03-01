package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!agt")
public class Class3_Sub34 extends Class3 {

	@OriginalMember(owner = "client!agt", name = "l", descriptor = "S")
	public short aShort63;

	@OriginalMember(owner = "client!agt", name = "<init>", descriptor = "(S)V", line = 6)
	public Class3_Sub34(@OriginalArg(0) short arg0) {
		this.aShort63 = arg0;
	}
}
