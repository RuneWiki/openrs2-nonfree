package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class Class120 {

	@OriginalMember(owner = "client!cv", name = "l", descriptor = "I")
	final int anInt3208;

	@OriginalMember(owner = "client!cv", name = "p", descriptor = "I")
	final int anInt3205;

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "I")
	final int anInt3207;

	@OriginalMember(owner = "client!cv", name = "g", descriptor = "I")
	final int anInt3206;

	@OriginalMember(owner = "client!cv", name = "h", descriptor = "S")
	final short aShort155;

	@OriginalMember(owner = "client!cv", name = "x", descriptor = "S")
	final short aShort156;

	@OriginalMember(owner = "client!cv", name = "s", descriptor = "S")
	final short aShort157;

	@OriginalMember(owner = "client!cv", name = "u", descriptor = "B")
	final byte aByte108;

	@OriginalMember(owner = "client!cv", name = "y", descriptor = "Z")
	final boolean aBoolean612;

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "I")
	final int anInt3209;

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 16)
	Class120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt3208 = arg0;
		this.anInt3205 = arg1;
		this.anInt3207 = arg2;
		this.anInt3206 = arg3;
		this.aShort155 = (short) arg4;
		this.aShort156 = (short) arg5;
		this.aShort157 = (short) arg6;
		this.aByte108 = (byte) arg8;
		this.aBoolean612 = arg10;
		this.anInt3209 = arg11;
	}
}
