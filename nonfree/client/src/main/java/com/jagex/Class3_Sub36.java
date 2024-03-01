package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!agv")
public class Class3_Sub36 extends Class3 {

	@OriginalMember(owner = "client!agv", name = "l", descriptor = "J")
	public long aLong79;

	@OriginalMember(owner = "client!agv", name = "<init>", descriptor = "(J)V", line = 6)
	public Class3_Sub36(@OriginalArg(0) long arg0) {
		this.aLong79 = arg0 * 5570757074813571727L;
	}
}
