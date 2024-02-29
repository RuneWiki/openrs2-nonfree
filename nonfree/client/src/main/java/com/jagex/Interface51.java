package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public interface Interface51 {

	@OriginalMember(owner = "client!nu", name = "v", descriptor = "([BLclient!aar;Z)Ljava/lang/Object;")
	Object method28275(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!nu", name = "p", descriptor = "([BLclient!aar;ZI)Ljava/lang/Object;")
	Object method28276(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!nu", name = "c", descriptor = "([BLclient!aar;Z)Ljava/lang/Object;")
	Object method28277(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) boolean arg2);
}
