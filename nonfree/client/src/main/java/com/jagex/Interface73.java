package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xd")
public interface Interface73 {

	@OriginalMember(owner = "client!xd", name = "t", descriptor = "(Z)V")
	void method32818();

	@OriginalMember(owner = "client!xd", name = "c", descriptor = "(IIII)V")
	void method32819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!xd", name = "l", descriptor = "(III)V")
	void method32820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!xd", name = "v", descriptor = "(III)V")
	void method32821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!xd", name = "y", descriptor = "(Z)V")
	void method32822();

	@OriginalMember(owner = "client!xd", name = "w", descriptor = "(Z)V")
	void method32823();

	@OriginalMember(owner = "client!xd", name = "p", descriptor = "(ZI)V")
	void method32824(@OriginalArg(0) boolean arg0);
}
