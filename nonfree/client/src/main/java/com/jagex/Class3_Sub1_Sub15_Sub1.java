package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aos")
public class Class3_Sub1_Sub15_Sub1 extends Class3_Sub1_Sub15 {

	@OriginalMember(owner = "client!aos", name = "y", descriptor = "Ljava/lang/Object;")
	Object anObject7;

	@OriginalMember(owner = "client!aos", name = "<init>", descriptor = "(Lclient!sa;Ljava/lang/Object;I)V", line = 7)
	Class3_Sub1_Sub15_Sub1(@OriginalArg(0) Interface49 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject7 = arg1;
	}

	@OriginalMember(owner = "client!aos", name = "p", descriptor = "()Ljava/lang/Object;", line = 12)
	@Override
	Object method21242() {
		return this.anObject7;
	}

	@OriginalMember(owner = "client!aos", name = "g", descriptor = "()Ljava/lang/Object;", line = 12)
	@Override
	Object method21243() {
		return this.anObject7;
	}

	@OriginalMember(owner = "client!aos", name = "l", descriptor = "()Ljava/lang/Object;", line = 12)
	@Override
	Object method21240() {
		return this.anObject7;
	}

	@OriginalMember(owner = "client!aos", name = "h", descriptor = "()Ljava/lang/Object;", line = 12)
	@Override
	Object method21244() {
		return this.anObject7;
	}

	@OriginalMember(owner = "client!aos", name = "x", descriptor = "()Z", line = 16)
	@Override
	boolean method21239() {
		return false;
	}

	@OriginalMember(owner = "client!aos", name = "a", descriptor = "()Z", line = 16)
	@Override
	boolean method21241() {
		return false;
	}

	@OriginalMember(owner = "client!aos", name = "s", descriptor = "()Z", line = 16)
	@Override
	boolean method21245() {
		return false;
	}
}
