package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public interface Interface4 extends Interface10, Interface13 {

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "(I)V")
	void method22071(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bj", name = "z", descriptor = "(I)V")
	void method22072(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bj", name = "n", descriptor = "(I)V")
	void method22073(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bj", name = "j", descriptor = "(I)V")
	void method22074(@OriginalArg(0) int arg0);
}
