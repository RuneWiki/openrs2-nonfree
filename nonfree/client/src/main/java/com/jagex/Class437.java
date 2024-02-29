package com.jagex;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public class Class437 {

	@OriginalMember(owner = "client!od", name = "p", descriptor = "[F")
	static final float[] aFloatArray103 = new float[16384];

	@OriginalMember(owner = "client!od", name = "c", descriptor = "[F")
	static final float[] aFloatArray104 = new float[16384];

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray103[local9] = (float) Math.sin((double) local9 * local7);
			aFloatArray104[local9] = (float) Math.cos((double) local9 * local7);
		}
	}

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V", line = 15)
	Class437() throws Throwable {
		throw new Error();
	}
}
