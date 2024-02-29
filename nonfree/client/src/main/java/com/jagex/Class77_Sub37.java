package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!akt")
public class Class77_Sub37 extends Class77 {

	@OriginalMember(owner = "client!akt", name = "l", descriptor = "[I")
	int[] anIntArray217;

	@OriginalMember(owner = "client!akt", name = "y", descriptor = "[B")
	byte[] aByteArray35;

	@OriginalMember(owner = "client!akt", name = "<init>", descriptor = "([I[B)V", line = 1307)
	Class77_Sub37(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1) {
		this.anIntArray217 = arg0;
		this.aByteArray35 = arg1;
	}
}
