package com.jagex;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amr")
public abstract class Class3_Sub1_Sub12 extends Class3_Sub1 {

	@OriginalMember(owner = "client!amr", name = "u", descriptor = "Z")
	boolean aBoolean514;

	@OriginalMember(owner = "client!amr", name = "s", descriptor = "Z")
	boolean aBoolean515;

	@OriginalMember(owner = "client!amr", name = "y", descriptor = "Z")
	volatile boolean aBoolean516 = true;

	@OriginalMember(owner = "client!amr", name = "<init>", descriptor = "()V", line = 10)
	Class3_Sub1_Sub12() {
	}

	@OriginalMember(owner = "client!amr", name = "g", descriptor = "()[B")
	abstract byte[] method21154();

	@OriginalMember(owner = "client!amr", name = "a", descriptor = "(I)I")
	abstract int method21155();

	@OriginalMember(owner = "client!amr", name = "l", descriptor = "()[B")
	abstract byte[] method21156();

	@OriginalMember(owner = "client!amr", name = "p", descriptor = "(I)[B")
	abstract byte[] method21157();

	@OriginalMember(owner = "client!amr", name = "h", descriptor = "()I")
	abstract int method21158();

	@OriginalMember(owner = "client!amr", name = "x", descriptor = "()I")
	abstract int method21159();
}
