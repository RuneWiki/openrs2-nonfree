package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!do")
public class Class132 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!do", name = "this$0", descriptor = "Lclient!dh;")
	final Class20 this$0;

	@OriginalMember(owner = "client!do", name = "p", descriptor = "[I")
	public int[] anIntArray328;

	@OriginalMember(owner = "client!do", name = "a", descriptor = "[I")
	public int[] anIntArray326;

	@OriginalMember(owner = "client!do", name = "g", descriptor = "[I")
	public int[] anIntArray327;

	@OriginalMember(owner = "client!do", name = "l", descriptor = "[[F")
	public float[][] aFloatArrayArray22;

	@OriginalMember(owner = "client!do", name = "<init>", descriptor = "(Lclient!dh;[I[I[I[[F)V", line = 653)
	Class132(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) float[][] arg4) {
		this.this$0 = arg0;
		this.anIntArray328 = arg1;
		this.anIntArray326 = arg2;
		this.anIntArray327 = arg3;
		this.aFloatArrayArray22 = arg4;
	}
}
