package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class Class226 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!ej", name = "this$0", descriptor = "Lclient!dv;")
	final Class84 this$0;

	@OriginalMember(owner = "client!ej", name = "p", descriptor = "[I")
	public int[] anIntArray366;

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "[I")
	public int[] anIntArray365;

	@OriginalMember(owner = "client!ej", name = "v", descriptor = "[I")
	public int[] anIntArray367;

	@OriginalMember(owner = "client!ej", name = "l", descriptor = "[[F")
	public float[][] aFloatArrayArray22;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lclient!dv;[I[I[I[[F)V", line = 654)
	Class226(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) float[][] arg4) {
		this.this$0 = arg0;
		this.anIntArray366 = arg1;
		this.anIntArray365 = arg2;
		this.anIntArray367 = arg3;
		this.aFloatArrayArray22 = arg4;
	}
}
