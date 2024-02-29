package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!atx")
public class Class77_Sub1_Sub15_Sub2 extends Class77_Sub1_Sub15 {

	@OriginalMember(owner = "client!atx", name = "x", descriptor = "Ljava/lang/Object;")
	Object anObject9;

	@OriginalMember(owner = "client!atx", name = "<init>", descriptor = "(Lclient!vs;Ljava/lang/Object;I)V", line = 7)
	Class77_Sub1_Sub15_Sub2(@OriginalArg(0) Interface70 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject9 = arg1;
	}

	@OriginalMember(owner = "client!atx", name = "w", descriptor = "()Ljava/lang/Object;", line = 12)
	@Override
	Object method24077() {
		return this.anObject9;
	}

	@OriginalMember(owner = "client!atx", name = "v", descriptor = "()Ljava/lang/Object;", line = 12)
	@Override
	Object method24074() {
		return this.anObject9;
	}

	@OriginalMember(owner = "client!atx", name = "p", descriptor = "()Ljava/lang/Object;", line = 12)
	@Override
	Object method24072() {
		return this.anObject9;
	}

	@OriginalMember(owner = "client!atx", name = "y", descriptor = "()Ljava/lang/Object;", line = 12)
	@Override
	Object method24076() {
		return this.anObject9;
	}

	@OriginalMember(owner = "client!atx", name = "t", descriptor = "()Ljava/lang/Object;", line = 12)
	@Override
	Object method24078() {
		return this.anObject9;
	}

	@OriginalMember(owner = "client!atx", name = "q", descriptor = "()Ljava/lang/Object;", line = 12)
	@Override
	Object method24073() {
		return this.anObject9;
	}

	@OriginalMember(owner = "client!atx", name = "l", descriptor = "()Ljava/lang/Object;", line = 12)
	@Override
	Object method24075() {
		return this.anObject9;
	}

	@OriginalMember(owner = "client!atx", name = "s", descriptor = "()Z", line = 16)
	@Override
	boolean method24081() {
		return false;
	}

	@OriginalMember(owner = "client!atx", name = "c", descriptor = "()Z", line = 16)
	@Override
	boolean method24079() {
		return false;
	}

	@OriginalMember(owner = "client!atx", name = "x", descriptor = "()Z", line = 16)
	@Override
	boolean method24071() {
		return false;
	}

	@OriginalMember(owner = "client!atx", name = "d", descriptor = "()Z", line = 16)
	@Override
	boolean method24080() {
		return false;
	}
}
