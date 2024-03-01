package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class Class88 {

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "Lclient!bu;")
	Interface5 anInterface5_6;

	@OriginalMember(owner = "client!bc", name = "p", descriptor = "S")
	short aShort144;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "B")
	byte aByte107;

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "B")
	byte aByte106;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lclient!bu;III)V", line = 10)
	Class88(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInterface5_6 = arg0;
		this.aShort144 = (short) arg1;
		this.aByte107 = (byte) arg2;
		this.aByte106 = (byte) arg3;
	}
}
