package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aoi")
public class Class3_Sub1_Sub10_Sub1 extends Class3_Sub1_Sub10 {

	@OriginalMember(owner = "client!aoi", name = "u", descriptor = "Ljava/lang/Object;")
	Object anObject6;

	@OriginalMember(owner = "client!aoi", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 7)
	Class3_Sub1_Sub10_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject6 = arg0;
	}

	@OriginalMember(owner = "client!aoi", name = "p", descriptor = "(B)Ljava/lang/Object;", line = 12)
	@Override
	Object method21132() {
		return this.anObject6;
	}

	@OriginalMember(owner = "client!aoi", name = "l", descriptor = "()Ljava/lang/Object;", line = 12)
	@Override
	Object method21129() {
		return this.anObject6;
	}

	@OriginalMember(owner = "client!aoi", name = "h", descriptor = "()Ljava/lang/Object;", line = 12)
	@Override
	Object method21130() {
		return this.anObject6;
	}

	@OriginalMember(owner = "client!aoi", name = "g", descriptor = "()Ljava/lang/Object;", line = 12)
	@Override
	Object method21128() {
		return this.anObject6;
	}

	@OriginalMember(owner = "client!aoi", name = "a", descriptor = "(I)Z", line = 16)
	@Override
	boolean method21127() {
		return false;
	}

	@OriginalMember(owner = "client!aoi", name = "s", descriptor = "()Z", line = 16)
	@Override
	boolean method21126() {
		return false;
	}

	@OriginalMember(owner = "client!aoi", name = "u", descriptor = "()Z", line = 16)
	@Override
	boolean method21133() {
		return false;
	}

	@OriginalMember(owner = "client!aoi", name = "x", descriptor = "()Z", line = 16)
	@Override
	boolean method21131() {
		return false;
	}
}
