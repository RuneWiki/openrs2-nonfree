package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class Class172 {

	@OriginalMember(owner = "client!bk", name = "l", descriptor = "Lclient!bn;")
	Interface14 anInterface14_6;

	@OriginalMember(owner = "client!bk", name = "p", descriptor = "S")
	short aShort145;

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "B")
	byte aByte106;

	@OriginalMember(owner = "client!bk", name = "v", descriptor = "B")
	byte aByte107;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lclient!bn;III)V", line = 10)
	Class172(@OriginalArg(0) Interface14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInterface14_6 = arg0;
		this.aShort145 = (short) arg1;
		this.aByte106 = (byte) arg2;
		this.aByte107 = (byte) arg3;
	}
}
