package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!if")
public interface Interface21 extends Interface24, Interface22 {

	@OriginalMember(owner = "client!if", name = "y", descriptor = "()V")
	void method27208();

	@OriginalMember(owner = "client!if", name = "g", descriptor = "()V")
	void method27209();

	@OriginalMember(owner = "client!if", name = "b", descriptor = "()V")
	void method27210();

	@OriginalMember(owner = "client!if", name = "p", descriptor = "(II)Z")
	boolean method25687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!if", name = "a", descriptor = "(II)Z")
	boolean method25688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
