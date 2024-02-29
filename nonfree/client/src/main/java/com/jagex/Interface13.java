package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public interface Interface13 extends Iterable {

	@OriginalMember(owner = "client!as", name = "w", descriptor = "()I")
	int method18313();

	@OriginalMember(owner = "client!as", name = "l", descriptor = "(I)Lclient!am;")
	Interface12 method18314(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!as", name = "v", descriptor = "(I)Lclient!am;")
	Interface12 method18315(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!as", name = "t", descriptor = "()I")
	int method18316();

	@OriginalMember(owner = "client!as", name = "y", descriptor = "(I)Lclient!am;")
	Interface12 method18317(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!as", name = "c", descriptor = "(B)I")
	int method18318();

	@OriginalMember(owner = "client!as", name = "p", descriptor = "(II)Lclient!am;")
	Interface12 method18319(@OriginalArg(0) int arg0);
}
