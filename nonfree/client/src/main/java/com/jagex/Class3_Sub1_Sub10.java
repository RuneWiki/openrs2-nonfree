package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amo")
public abstract class Class3_Sub1_Sub10 extends Class3_Sub1 {

	@OriginalMember(owner = "client!amo", name = "s", descriptor = "I")
	final int anInt2867;

	@OriginalMember(owner = "client!amo", name = "<init>", descriptor = "(I)V", line = 8)
	Class3_Sub1_Sub10(@OriginalArg(0) int arg0) {
		this.anInt2867 = arg0 * -89459693;
	}

	@OriginalMember(owner = "client!amo", name = "s", descriptor = "()Z")
	abstract boolean method21126();

	@OriginalMember(owner = "client!amo", name = "a", descriptor = "(I)Z")
	abstract boolean method21127();

	@OriginalMember(owner = "client!amo", name = "g", descriptor = "()Ljava/lang/Object;")
	abstract Object method21128();

	@OriginalMember(owner = "client!amo", name = "l", descriptor = "()Ljava/lang/Object;")
	abstract Object method21129();

	@OriginalMember(owner = "client!amo", name = "h", descriptor = "()Ljava/lang/Object;")
	abstract Object method21130();

	@OriginalMember(owner = "client!amo", name = "x", descriptor = "()Z")
	abstract boolean method21131();

	@OriginalMember(owner = "client!amo", name = "p", descriptor = "(B)Ljava/lang/Object;")
	abstract Object method21132();

	@OriginalMember(owner = "client!amo", name = "u", descriptor = "()Z")
	abstract boolean method21133();
}
