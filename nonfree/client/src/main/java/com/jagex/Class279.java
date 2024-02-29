package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class Class279 {

	@OriginalMember(owner = "client!go", name = "p", descriptor = "I")
	final int anInt3961;

	@OriginalMember(owner = "client!go", name = "c", descriptor = "I")
	final int anInt3957;

	@OriginalMember(owner = "client!go", name = "v", descriptor = "I")
	final int anInt3958;

	@OriginalMember(owner = "client!go", name = "l", descriptor = "I")
	final int anInt3959;

	@OriginalMember(owner = "client!go", name = "y", descriptor = "I")
	final int anInt3960;

	@OriginalMember(owner = "client!go", name = "w", descriptor = "[Lclient!gv;")
	final Class286[] aClass286Array1;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(IIIII[Lclient!gv;)V", line = 1330)
	Class279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class286[] arg5) {
		this.anInt3961 = arg0;
		this.anInt3957 = arg1;
		this.anInt3958 = arg2;
		this.anInt3959 = arg3;
		this.anInt3960 = arg4;
		this.aClass286Array1 = arg5;
	}
}
