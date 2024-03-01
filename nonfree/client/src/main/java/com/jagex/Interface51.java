package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public interface Interface51 {

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!tn;I)V")
	void method23107(@OriginalArg(0) Interface52 arg0);

	@OriginalMember(owner = "client!sv", name = "h", descriptor = "(Lclient!tn;IIZ)V")
	void method23108(@OriginalArg(0) Interface52 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2);

	@OriginalMember(owner = "client!sv", name = "g", descriptor = "(Lclient!tn;IIZ)V")
	void method23109(@OriginalArg(0) Interface52 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2);

	@OriginalMember(owner = "client!sv", name = "l", descriptor = "(Lclient!tn;IIZ)V")
	void method23110(@OriginalArg(0) Interface52 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2);

	@OriginalMember(owner = "client!sv", name = "x", descriptor = "(Lclient!tn;IIZ)V")
	void method23111(@OriginalArg(0) Interface52 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2);

	@OriginalMember(owner = "client!sv", name = "p", descriptor = "(Lclient!tn;IIZI)V")
	void method23112(@OriginalArg(0) Interface52 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3);
}
