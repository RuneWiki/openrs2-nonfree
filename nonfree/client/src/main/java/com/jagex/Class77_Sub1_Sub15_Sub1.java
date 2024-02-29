package com.jagex;

import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!atw")
public class Class77_Sub1_Sub15_Sub1 extends Class77_Sub1_Sub15 {

	@OriginalMember(owner = "client!atw", name = "x", descriptor = "Ljava/lang/ref/SoftReference;")
	SoftReference aSoftReference2;

	@OriginalMember(owner = "client!atw", name = "<init>", descriptor = "(Lclient!vs;Ljava/lang/Object;I)V", line = 10)
	Class77_Sub1_Sub15_Sub1(@OriginalArg(0) Interface70 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!atw", name = "p", descriptor = "()Ljava/lang/Object;", line = 15)
	@Override
	Object method24072() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!atw", name = "v", descriptor = "()Ljava/lang/Object;", line = 15)
	@Override
	Object method24074() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!atw", name = "l", descriptor = "()Ljava/lang/Object;", line = 15)
	@Override
	Object method24075() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!atw", name = "y", descriptor = "()Ljava/lang/Object;", line = 15)
	@Override
	Object method24076() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!atw", name = "w", descriptor = "()Ljava/lang/Object;", line = 15)
	@Override
	Object method24077() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!atw", name = "t", descriptor = "()Ljava/lang/Object;", line = 15)
	@Override
	Object method24078() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!atw", name = "q", descriptor = "()Ljava/lang/Object;", line = 15)
	@Override
	Object method24073() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!atw", name = "d", descriptor = "()Z", line = 19)
	@Override
	boolean method24080() {
		return true;
	}

	@OriginalMember(owner = "client!atw", name = "c", descriptor = "()Z", line = 19)
	@Override
	boolean method24079() {
		return true;
	}

	@OriginalMember(owner = "client!atw", name = "x", descriptor = "()Z", line = 19)
	@Override
	boolean method24071() {
		return true;
	}

	@OriginalMember(owner = "client!atw", name = "s", descriptor = "()Z", line = 19)
	@Override
	boolean method24081() {
		return true;
	}
}
