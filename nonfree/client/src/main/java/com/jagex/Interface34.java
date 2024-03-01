package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public interface Interface34 {

	@OriginalMember(owner = "client!lj", name = "g", descriptor = "([BLclient!yx;Z)Ljava/lang/Object;")
	Object method25549(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class611 arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!lj", name = "p", descriptor = "([BLclient!yx;ZB)Ljava/lang/Object;")
	Object method25550(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class611 arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "([BLclient!yx;Z)Ljava/lang/Object;")
	Object method25551(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class611 arg1, @OriginalArg(2) boolean arg2);
}
