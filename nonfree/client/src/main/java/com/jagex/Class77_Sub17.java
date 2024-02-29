package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ajp")
public class Class77_Sub17 extends Class77 {

	@OriginalMember(owner = "client!ajp", name = "l", descriptor = "S")
	public short aShort101;

	@OriginalMember(owner = "client!ajp", name = "<init>", descriptor = "(S)V", line = 6)
	public Class77_Sub17(@OriginalArg(0) short arg0) {
		this.aShort101 = arg0;
	}
}
