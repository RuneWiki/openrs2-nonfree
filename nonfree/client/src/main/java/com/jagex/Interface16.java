package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public interface Interface16 extends Interface21, Interface20 {

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "(I)V")
	void method25512(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cb", name = "z", descriptor = "(I)V")
	void method25513(@OriginalArg(0) int arg0);
}
