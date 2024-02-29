package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public interface Interface70 {

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "(Lclient!vs;)Z")
	boolean method164(@OriginalArg(0) Interface70 arg0);

	@OriginalMember(owner = "client!vs", name = "p", descriptor = "()J")
	long method165();

	@OriginalMember(owner = "client!vs", name = "v", descriptor = "()J")
	long method166();

	@OriginalMember(owner = "client!vs", name = "l", descriptor = "(Lclient!vs;)Z")
	boolean method167(@OriginalArg(0) Interface70 arg0);

	@OriginalMember(owner = "client!vs", name = "y", descriptor = "(Lclient!vs;)Z")
	boolean method168(@OriginalArg(0) Interface70 arg0);
}
