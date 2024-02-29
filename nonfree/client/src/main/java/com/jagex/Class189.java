package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class Class189 {

	@OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
	final int anInt3339;

	@OriginalMember(owner = "client!ch", name = "p", descriptor = "I")
	final int anInt3338;

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
	final int anInt3341;

	@OriginalMember(owner = "client!ch", name = "v", descriptor = "I")
	final int anInt3337;

	@OriginalMember(owner = "client!ch", name = "y", descriptor = "S")
	final short aShort151;

	@OriginalMember(owner = "client!ch", name = "w", descriptor = "S")
	final short aShort152;

	@OriginalMember(owner = "client!ch", name = "t", descriptor = "S")
	final short aShort153;

	@OriginalMember(owner = "client!ch", name = "q", descriptor = "B")
	final byte aByte109;

	@OriginalMember(owner = "client!ch", name = "x", descriptor = "Z")
	final boolean aBoolean566;

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
	final int anInt3340;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 16)
	Class189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt3339 = arg0;
		this.anInt3338 = arg1;
		this.anInt3341 = arg2;
		this.anInt3337 = arg3;
		this.aShort151 = (short) arg4;
		this.aShort152 = (short) arg5;
		this.aShort153 = (short) arg6;
		this.aByte109 = (byte) arg8;
		this.aBoolean566 = arg10;
		this.anInt3340 = arg11;
	}
}
