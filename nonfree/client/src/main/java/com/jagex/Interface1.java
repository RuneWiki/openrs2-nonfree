package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aac")
public interface Interface1 {

	@OriginalMember(owner = "client!aac", name = "ac", descriptor = "(Lclient!dx;I)[Lclient!cy;")
	Class83[] method28618(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!aac", name = "g", descriptor = "(II)I")
	int method28619(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aac", name = "ae", descriptor = "(I)I")
	int method28620(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aac", name = "av", descriptor = "(Lclient!dx;I)[Lclient!cy;")
	Class83[] method28621(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!aac", name = "at", descriptor = "(Lclient!dx;I)[Lclient!cy;")
	Class83[] method28622(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!aac", name = "r", descriptor = "(Lclient!dx;II)[Lclient!cy;")
	Class83[] method28623(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1);
}
