package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public interface Interface36 extends Interface33, Interface35 {

	@OriginalMember(owner = "client!kp", name = "r", descriptor = "()V")
	void method30321();

	@OriginalMember(owner = "client!kp", name = "v", descriptor = "()V")
	void method30322();

	@OriginalMember(owner = "client!kp", name = "p", descriptor = "(II)Z")
	boolean method28760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "(II)Z")
	boolean method28761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!kp", name = "g", descriptor = "()V")
	void method30319();

	@OriginalMember(owner = "client!kp", name = "s", descriptor = "()V")
	void method30320();

	@OriginalMember(owner = "client!kp", name = "l", descriptor = "(II)Z")
	boolean method28762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
