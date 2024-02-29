package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public interface Interface55 {

	@OriginalMember(owner = "client!qf", name = "v", descriptor = "(I)[B")
	byte[] method30019(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)[B")
	byte[] method30020(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qf", name = "p", descriptor = "(II)[B")
	byte[] method30021(@OriginalArg(0) int arg0);
}
