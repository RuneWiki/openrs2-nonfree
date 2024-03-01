package com.jagex;

import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aou")
public class Class3_Sub1_Sub15_Sub2 extends Class3_Sub1_Sub15 {

	@OriginalMember(owner = "client!aou", name = "y", descriptor = "Ljava/lang/ref/SoftReference;")
	SoftReference aSoftReference2;

	@OriginalMember(owner = "client!aou", name = "<init>", descriptor = "(Lclient!sa;Ljava/lang/Object;I)V", line = 10)
	Class3_Sub1_Sub15_Sub2(@OriginalArg(0) Interface49 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!aou", name = "h", descriptor = "()Ljava/lang/Object;", line = 15)
	@Override
	Object method21244() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!aou", name = "p", descriptor = "()Ljava/lang/Object;", line = 15)
	@Override
	Object method21242() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!aou", name = "l", descriptor = "()Ljava/lang/Object;", line = 15)
	@Override
	Object method21240() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!aou", name = "g", descriptor = "()Ljava/lang/Object;", line = 15)
	@Override
	Object method21243() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!aou", name = "a", descriptor = "()Z", line = 19)
	@Override
	boolean method21241() {
		return true;
	}

	@OriginalMember(owner = "client!aou", name = "x", descriptor = "()Z", line = 19)
	@Override
	boolean method21239() {
		return true;
	}

	@OriginalMember(owner = "client!aou", name = "s", descriptor = "()Z", line = 19)
	@Override
	boolean method21245() {
		return true;
	}
}
