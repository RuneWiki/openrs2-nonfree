package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public interface Interface50 {

	@OriginalMember(owner = "client!sk", name = "p", descriptor = "(Lclient!agg;[Lclient!qd;ILclient!qt;I)Z")
	boolean method28750(@OriginalArg(0) Class3_Sub22 arg0, @OriginalArg(1) Interface46[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class65 arg3);

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!agg;[Lclient!qd;ILclient!qt;)Z")
	boolean method28751(@OriginalArg(0) Class3_Sub22 arg0, @OriginalArg(1) Interface46[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class65 arg3);

	@OriginalMember(owner = "client!sk", name = "g", descriptor = "(Lclient!agg;[Lclient!qd;ILclient!qt;)Z")
	boolean method28752(@OriginalArg(0) Class3_Sub22 arg0, @OriginalArg(1) Interface46[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class65 arg3);

	@OriginalMember(owner = "client!sk", name = "l", descriptor = "(Lclient!agg;[Lclient!qd;ILclient!qt;)Z")
	boolean method28753(@OriginalArg(0) Class3_Sub22 arg0, @OriginalArg(1) Interface46[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class65 arg3);
}
