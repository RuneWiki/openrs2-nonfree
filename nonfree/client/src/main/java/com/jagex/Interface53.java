package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public interface Interface53 {

	@OriginalMember(owner = "client!ok", name = "q", descriptor = "(II)Ljava/lang/Object;")
	Object method1940(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ok", name = "x", descriptor = "(I)Ljava/lang/Object;")
	Object method1941(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "(I)Ljava/lang/Object;")
	Object method1942(@OriginalArg(0) int arg0);
}
