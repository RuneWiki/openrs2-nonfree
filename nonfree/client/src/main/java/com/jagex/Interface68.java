package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public interface Interface68 {

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(Lclient!vg;I)V")
	void method26108(@OriginalArg(0) Interface69 arg0);

	@OriginalMember(owner = "client!vf", name = "p", descriptor = "(Lclient!vg;IIZI)V")
	void method26109(@OriginalArg(0) Interface69 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!vf", name = "v", descriptor = "(Lclient!vg;IIZ)V")
	void method26110(@OriginalArg(0) Interface69 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2);

	@OriginalMember(owner = "client!vf", name = "l", descriptor = "(Lclient!vg;)V")
	void method26111(@OriginalArg(0) Interface69 arg0);
}
