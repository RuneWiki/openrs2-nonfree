package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!arn")
public abstract class Class77_Sub1_Sub15 extends Class77_Sub1 {

	@OriginalMember(owner = "client!arn", name = "q", descriptor = "Lclient!vs;")
	final Interface70 anInterface70_3;

	@OriginalMember(owner = "client!arn", name = "t", descriptor = "I")
	final int anInt3218;

	@OriginalMember(owner = "client!arn", name = "<init>", descriptor = "(Lclient!vs;I)V", line = 9)
	Class77_Sub1_Sub15(@OriginalArg(0) Interface70 arg0, @OriginalArg(1) int arg1) {
		this.anInterface70_3 = arg0;
		this.anInt3218 = arg1;
	}

	@OriginalMember(owner = "client!arn", name = "x", descriptor = "()Z")
	abstract boolean method24071();

	@OriginalMember(owner = "client!arn", name = "p", descriptor = "()Ljava/lang/Object;")
	abstract Object method24072();

	@OriginalMember(owner = "client!arn", name = "q", descriptor = "()Ljava/lang/Object;")
	abstract Object method24073();

	@OriginalMember(owner = "client!arn", name = "v", descriptor = "()Ljava/lang/Object;")
	abstract Object method24074();

	@OriginalMember(owner = "client!arn", name = "l", descriptor = "()Ljava/lang/Object;")
	abstract Object method24075();

	@OriginalMember(owner = "client!arn", name = "y", descriptor = "()Ljava/lang/Object;")
	abstract Object method24076();

	@OriginalMember(owner = "client!arn", name = "w", descriptor = "()Ljava/lang/Object;")
	abstract Object method24077();

	@OriginalMember(owner = "client!arn", name = "t", descriptor = "()Ljava/lang/Object;")
	abstract Object method24078();

	@OriginalMember(owner = "client!arn", name = "c", descriptor = "()Z")
	abstract boolean method24079();

	@OriginalMember(owner = "client!arn", name = "d", descriptor = "()Z")
	abstract boolean method24080();

	@OriginalMember(owner = "client!arn", name = "s", descriptor = "()Z")
	abstract boolean method24081();
}
