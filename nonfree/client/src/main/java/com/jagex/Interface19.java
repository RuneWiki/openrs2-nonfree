package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public interface Interface19 {

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "(I)Z")
	boolean method24602();

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "()V")
	void method24603();

	@OriginalMember(owner = "client!ib", name = "p", descriptor = "(I)V")
	void method24604();

	@OriginalMember(owner = "client!ib", name = "l", descriptor = "(Z)V")
	void method24605(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZI)V")
	void method24606(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ib", name = "s", descriptor = "()V")
	void method24607();

	@OriginalMember(owner = "client!ib", name = "x", descriptor = "()V")
	void method24608();

	@OriginalMember(owner = "client!ib", name = "u", descriptor = "()V")
	void method24609();

	@OriginalMember(owner = "client!ib", name = "y", descriptor = "()Z")
	boolean method24610();
}
