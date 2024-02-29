package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!asb")
public class Class77_Sub1_Sub10_Sub1 extends Class77_Sub1_Sub10 {

	@OriginalMember(owner = "client!asb", name = "q", descriptor = "Ljava/lang/Object;")
	Object anObject8;

	@OriginalMember(owner = "client!asb", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 7)
	Class77_Sub1_Sub10_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject8 = arg0;
	}

	@OriginalMember(owner = "client!asb", name = "l", descriptor = "()Ljava/lang/Object;", line = 12)
	@Override
	Object method23611() {
		return this.anObject8;
	}

	@OriginalMember(owner = "client!asb", name = "v", descriptor = "()Ljava/lang/Object;", line = 12)
	@Override
	Object method23610() {
		return this.anObject8;
	}

	@OriginalMember(owner = "client!asb", name = "p", descriptor = "(I)Ljava/lang/Object;", line = 12)
	@Override
	Object method23608() {
		return this.anObject8;
	}

	@OriginalMember(owner = "client!asb", name = "y", descriptor = "()Ljava/lang/Object;", line = 12)
	@Override
	Object method23607() {
		return this.anObject8;
	}

	@OriginalMember(owner = "client!asb", name = "c", descriptor = "(S)Z", line = 16)
	@Override
	boolean method23609() {
		return false;
	}

	@OriginalMember(owner = "client!asb", name = "w", descriptor = "()Z", line = 16)
	@Override
	boolean method23612() {
		return false;
	}

	@OriginalMember(owner = "client!asb", name = "t", descriptor = "()Z", line = 16)
	@Override
	boolean method23613() {
		return false;
	}
}
