package com.jagex;

import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!asz")
public class Class77_Sub1_Sub10_Sub2 extends Class77_Sub1_Sub10 {

	@OriginalMember(owner = "client!asz", name = "q", descriptor = "Ljava/lang/ref/SoftReference;")
	SoftReference aSoftReference1;

	@OriginalMember(owner = "client!asz", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 10)
	Class77_Sub1_Sub10_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!asz", name = "l", descriptor = "()Ljava/lang/Object;", line = 15)
	@Override
	Object method23611() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!asz", name = "p", descriptor = "(I)Ljava/lang/Object;", line = 15)
	@Override
	Object method23608() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!asz", name = "y", descriptor = "()Ljava/lang/Object;", line = 15)
	@Override
	Object method23607() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!asz", name = "v", descriptor = "()Ljava/lang/Object;", line = 15)
	@Override
	Object method23610() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!asz", name = "c", descriptor = "(S)Z", line = 19)
	@Override
	boolean method23609() {
		return true;
	}

	@OriginalMember(owner = "client!asz", name = "w", descriptor = "()Z", line = 19)
	@Override
	boolean method23612() {
		return true;
	}

	@OriginalMember(owner = "client!asz", name = "t", descriptor = "()Z", line = 19)
	@Override
	boolean method23613() {
		return true;
	}
}
