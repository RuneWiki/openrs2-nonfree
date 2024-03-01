package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public interface Interface48 {

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!ano;)Z")
	boolean method33352(@OriginalArg(0) Class26_Sub1_Sub1 arg0);

	@OriginalMember(owner = "client!rr", name = "p", descriptor = "(Lclient!ano;S)Z")
	boolean method33353(@OriginalArg(0) Class26_Sub1_Sub1 arg0);
}
