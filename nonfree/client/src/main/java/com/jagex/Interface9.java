package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cz")
public interface Interface9 {

	@OriginalMember(owner = "client!cz", name = "x", descriptor = "(Lclient!nw;IB)Lclient!cy;")
	Class11 method24295(@OriginalArg(0) Class43 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!cz", name = "s", descriptor = "(II)Lclient!ky;")
	Class290 method24296(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cz", name = "v", descriptor = "(Lclient!nw;I)Lclient!cy;")
	Class11 method24297(@OriginalArg(0) Class43 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!cz", name = "t", descriptor = "(I)Lclient!ky;")
	Class290 method24298(@OriginalArg(0) int arg0);
}
