package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public interface Interface56 extends Interface21, Interface20 {

	@OriginalMember(owner = "client!qq", name = "z", descriptor = "(I)V")
	void method30332(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qq", name = "j", descriptor = "(I)V")
	void method30333(@OriginalArg(0) int arg0);
}
