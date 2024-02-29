package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!abg")
public interface Interface5 {

	@OriginalMember(owner = "client!abg", name = "d", descriptor = "(ILclient!as;B)Lclient!am;")
	Interface12 method27821(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1);

	@OriginalMember(owner = "client!abg", name = "s", descriptor = "(S)Ljava/lang/Class;")
	Class method27822();

	@OriginalMember(owner = "client!abg", name = "g", descriptor = "(ILclient!as;)Lclient!am;")
	Interface12 method27823(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1);

	@OriginalMember(owner = "client!abg", name = "i", descriptor = "()Ljava/lang/Class;")
	Class method27824();

	@OriginalMember(owner = "client!abg", name = "z", descriptor = "(ILclient!as;)Lclient!am;")
	Interface12 method27825(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1);

	@OriginalMember(owner = "client!abg", name = "j", descriptor = "(ILclient!as;)Lclient!am;")
	Interface12 method27826(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1);

	@OriginalMember(owner = "client!abg", name = "r", descriptor = "(ILclient!as;)Lclient!am;")
	Interface12 method27827(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1);
}
