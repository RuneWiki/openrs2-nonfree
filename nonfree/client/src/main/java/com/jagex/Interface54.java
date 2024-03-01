package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public interface Interface54 {

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "(Z)V")
	void method29351();

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "(Z)V")
	void method29352();

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "(Z)V")
	void method29353();

	@OriginalMember(owner = "client!ud", name = "s", descriptor = "(III)V")
	void method29354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ud", name = "p", descriptor = "(ZB)V")
	void method29355(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ud", name = "x", descriptor = "(III)V")
	void method29356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIII)V")
	void method29357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ud", name = "u", descriptor = "(III)V")
	void method29358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
