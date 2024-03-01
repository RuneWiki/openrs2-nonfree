package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class Class409 {

	@OriginalMember(owner = "client!qk", name = "p", descriptor = "B")
	byte aByte158;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "B")
	byte aByte156;

	@OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
	int anInt4817;

	@OriginalMember(owner = "client!qk", name = "l", descriptor = "B")
	byte aByte157;

	@OriginalMember(owner = "client!qk", name = "h", descriptor = "B")
	byte aByte159;

	@OriginalMember(owner = "client!qk", name = "x", descriptor = "[I")
	int[] anIntArray432;

	@OriginalMember(owner = "client!qk", name = "s", descriptor = "[B")
	byte[] aByteArray84;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(IIIII[I[B)V", line = 1313)
	Class409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte158 = (byte) arg0;
		this.aByte156 = (byte) arg1;
		this.anInt4817 = arg2;
		this.aByte157 = (byte) arg3;
		this.aByte159 = (byte) arg4;
		this.anIntArray432 = arg5;
		this.aByteArray84 = arg6;
	}
}
