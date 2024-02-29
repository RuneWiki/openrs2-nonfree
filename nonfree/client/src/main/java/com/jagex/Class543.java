package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class Class543 {

	@OriginalMember(owner = "client!su", name = "p", descriptor = "B")
	byte aByte163;

	@OriginalMember(owner = "client!su", name = "c", descriptor = "B")
	byte aByte162;

	@OriginalMember(owner = "client!su", name = "v", descriptor = "I")
	int anInt5211;

	@OriginalMember(owner = "client!su", name = "l", descriptor = "S")
	short aShort177;

	@OriginalMember(owner = "client!su", name = "y", descriptor = "B")
	byte aByte164;

	@OriginalMember(owner = "client!su", name = "w", descriptor = "[I")
	int[] anIntArray485;

	@OriginalMember(owner = "client!su", name = "t", descriptor = "[B")
	byte[] aByteArray91;

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "(IIIII[I[B)V", line = 1322)
	Class543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte163 = (byte) arg0;
		this.aByte162 = (byte) arg1;
		this.anInt5211 = arg2;
		this.aShort177 = (short) arg3;
		this.aByte164 = (byte) arg4;
		this.anIntArray485 = arg5;
		this.aByteArray91 = arg6;
	}
}
