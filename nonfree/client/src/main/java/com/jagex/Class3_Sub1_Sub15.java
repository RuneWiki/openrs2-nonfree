package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amu")
public abstract class Class3_Sub1_Sub15 extends Class3_Sub1 {

	@OriginalMember(owner = "client!amu", name = "u", descriptor = "Lclient!sa;")
	final Interface49 anInterface49_3;

	@OriginalMember(owner = "client!amu", name = "s", descriptor = "I")
	final int anInt2870;

	@OriginalMember(owner = "client!amu", name = "<init>", descriptor = "(Lclient!sa;I)V", line = 9)
	Class3_Sub1_Sub15(@OriginalArg(0) Interface49 arg0, @OriginalArg(1) int arg1) {
		this.anInterface49_3 = arg0;
		this.anInt2870 = arg1;
	}

	@OriginalMember(owner = "client!amu", name = "x", descriptor = "()Z")
	abstract boolean method21239();

	@OriginalMember(owner = "client!amu", name = "l", descriptor = "()Ljava/lang/Object;")
	abstract Object method21240();

	@OriginalMember(owner = "client!amu", name = "a", descriptor = "()Z")
	abstract boolean method21241();

	@OriginalMember(owner = "client!amu", name = "p", descriptor = "()Ljava/lang/Object;")
	abstract Object method21242();

	@OriginalMember(owner = "client!amu", name = "g", descriptor = "()Ljava/lang/Object;")
	abstract Object method21243();

	@OriginalMember(owner = "client!amu", name = "h", descriptor = "()Ljava/lang/Object;")
	abstract Object method21244();

	@OriginalMember(owner = "client!amu", name = "s", descriptor = "()Z")
	abstract boolean method21245();
}
