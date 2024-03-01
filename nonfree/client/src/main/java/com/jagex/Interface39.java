package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public interface Interface39 {

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I)[B")
	byte[] method26599(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!od", name = "p", descriptor = "(IB)[B")
	byte[] method26600(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!od", name = "g", descriptor = "(I)[B")
	byte[] method26601(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!od", name = "l", descriptor = "(I)[B")
	byte[] method26602(@OriginalArg(0) int arg0);
}
