package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public interface Interface8 {

	@OriginalMember(owner = "client!ct", name = "f", descriptor = "(Lclient!ky;)I")
	int method32383(@OriginalArg(0) Class290 arg0);

	@OriginalMember(owner = "client!ct", name = "y", descriptor = "(Lclient!ky;I)I")
	int method32384(@OriginalArg(0) Class290 arg0);

	@OriginalMember(owner = "client!ct", name = "u", descriptor = "(Lclient!cy;B)I")
	int method32385(@OriginalArg(0) Class11 arg0);

	@OriginalMember(owner = "client!ct", name = "o", descriptor = "(Lclient!cy;)I")
	int method32386(@OriginalArg(0) Class11 arg0);

	@OriginalMember(owner = "client!ct", name = "i", descriptor = "(Lclient!cy;)I")
	int method32387(@OriginalArg(0) Class11 arg0);

	@OriginalMember(owner = "client!ct", name = "w", descriptor = "(Lclient!cy;)I")
	int method32388(@OriginalArg(0) Class11 arg0);
}
