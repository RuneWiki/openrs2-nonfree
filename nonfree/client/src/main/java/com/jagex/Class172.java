package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class Class172 {

	@OriginalMember(owner = "client!fh", name = "p", descriptor = "I")
	final int anInt3464;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
	final int anInt3466;

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "I")
	final int anInt3465;

	@OriginalMember(owner = "client!fh", name = "l", descriptor = "I")
	final int anInt3467;

	@OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
	final int anInt3463;

	@OriginalMember(owner = "client!fh", name = "x", descriptor = "[Lclient!fg;")
	final Class171[] aClass171Array1;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(IIIII[Lclient!fg;)V", line = 1326)
	Class172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class171[] arg5) {
		this.anInt3464 = arg0;
		this.anInt3466 = arg1;
		this.anInt3465 = arg2;
		this.anInt3467 = arg3;
		this.anInt3463 = arg4;
		this.aClass171Array1 = arg5;
	}
}
