package com.jagex;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mz")
public class Class337 {

	@OriginalMember(owner = "client!mz", name = "p", descriptor = "[F")
	static final float[] aFloatArray107 = new float[16384];

	@OriginalMember(owner = "client!mz", name = "a", descriptor = "[F")
	static final float[] aFloatArray108 = new float[16384];

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray107[local9] = (float) Math.sin((double) local9 * local7);
			aFloatArray108[local9] = (float) Math.cos((double) local9 * local7);
		}
	}

	@OriginalMember(owner = "client!mz", name = "<init>", descriptor = "()V", line = 15)
	Class337() throws Throwable {
		throw new Error();
	}
}
