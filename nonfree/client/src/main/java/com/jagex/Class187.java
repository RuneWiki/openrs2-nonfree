package com.jagex;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public class Class187 {

	@OriginalMember(owner = "client!cf", name = "p", descriptor = "[F")
	static final float[] aFloatArray93 = new float[16384];

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "[F")
	static final float[] aFloatArray94 = new float[16384];

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray93[local9] = (float) Math.sin((double) local9 * local7);
			aFloatArray94[local9] = (float) Math.cos((double) local9 * local7);
		}
	}

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V", line = 18)
	Class187() throws Throwable {
		throw new Error();
	}
}
