package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!agr")
public class Class3_Sub33 extends Class3 {

	@OriginalMember(owner = "client!agr", name = "l", descriptor = "[I")
	int[] anIntArray185;

	@OriginalMember(owner = "client!agr", name = "h", descriptor = "[B")
	byte[] aByteArray21;

	@OriginalMember(owner = "client!agr", name = "<init>", descriptor = "([I[B)V", line = 1298)
	Class3_Sub33(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1) {
		this.anIntArray185 = arg0;
		this.aByteArray21 = arg1;
	}
}
