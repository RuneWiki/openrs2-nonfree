package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public interface Interface49 {

	@OriginalMember(owner = "client!sa", name = "l", descriptor = "()J")
	long method33644();

	@OriginalMember(owner = "client!sa", name = "p", descriptor = "()J")
	long method33645();

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "(Lclient!sa;)Z")
	boolean method33646(@OriginalArg(0) Interface49 arg0);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!sa;)Z")
	boolean method33647(@OriginalArg(0) Interface49 arg0);
}
