package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class Class2 {

	@OriginalMember(owner = "client!aa", name = "l", descriptor = "I")
	int anInt3;

	@OriginalMember(owner = "client!aa", name = "y", descriptor = "I")
	int anInt4;

	@OriginalMember(owner = "client!aa", name = "v", descriptor = "I")
	int anInt5;

	@OriginalMember(owner = "client!aa", name = "p", descriptor = "I")
	int anInt6;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V", line = 3254)
	Class2() {
	}

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lclient!aa;)V", line = 3256)
	Class2(@OriginalArg(0) Class2 arg0) {
		this.anInt6 = arg0.anInt6;
		this.anInt5 = arg0.anInt5;
		this.anInt3 = arg0.anInt3;
		this.anInt4 = arg0.anInt4;
	}
}
