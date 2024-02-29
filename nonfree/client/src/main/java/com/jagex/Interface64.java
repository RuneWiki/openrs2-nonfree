package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public interface Interface64 {

	@OriginalMember(owner = "client!uf", name = "p", descriptor = "(Lclient!akz;[Lclient!tl;ILclient!tb;I)Z")
	boolean method32034(@OriginalArg(0) Class77_Sub42 arg0, @OriginalArg(1) Interface62[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class141 arg3);

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(Lclient!akz;[Lclient!tl;ILclient!tb;)Z")
	boolean method32035(@OriginalArg(0) Class77_Sub42 arg0, @OriginalArg(1) Interface62[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class141 arg3);
}
