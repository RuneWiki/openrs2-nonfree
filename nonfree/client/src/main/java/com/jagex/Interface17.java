package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public interface Interface17 {

	@OriginalMember(owner = "client!cn", name = "t", descriptor = "(II)Lclient!ji;")
	Class343 method27606(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cn", name = "w", descriptor = "(Lclient!pd;II)Lclient!ci;")
	Class75 method27607(@OriginalArg(0) Class127 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!cn", name = "f", descriptor = "(Lclient!pd;I)Lclient!ci;")
	Class75 method27608(@OriginalArg(0) Class127 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)Lclient!ji;")
	Class343 method27609(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cn", name = "o", descriptor = "(I)Lclient!ji;")
	Class343 method27610(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cn", name = "n", descriptor = "(I)Lclient!ji;")
	Class343 method27611(@OriginalArg(0) int arg0);
}
