package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ajx")
public class Class77_Sub24 extends Class77 {

	@OriginalMember(owner = "client!ajx", name = "l", descriptor = "I")
	public int anInt1549;

	@OriginalMember(owner = "client!ajx", name = "y", descriptor = "I")
	int anInt1548;

	@OriginalMember(owner = "client!ajx", name = "<init>", descriptor = "(II)V", line = 9)
	Class77_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1549 = arg0 * -233716679;
		this.anInt1548 = arg1 * -917228969;
	}
}
