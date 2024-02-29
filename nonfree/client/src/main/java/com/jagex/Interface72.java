package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wz")
public interface Interface72 {

	@OriginalMember(owner = "client!wz", name = "g", descriptor = "(I)I")
	int method11086(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wz", name = "v", descriptor = "(IB)I")
	int method11087(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wz", name = "z", descriptor = "(I)I")
	int method11088(@OriginalArg(0) int arg0);
}
