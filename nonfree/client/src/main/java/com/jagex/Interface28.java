package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hx")
public interface Interface28 {

	@OriginalMember(owner = "client!hx", name = "v", descriptor = "(Ljava/lang/String;)J")
	long method27308(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "client!hx", name = "c", descriptor = "(Ljava/lang/String;)J")
	long method27309(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "client!hx", name = "p", descriptor = "(Ljava/lang/String;S)J")
	long method27310(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "client!hx", name = "l", descriptor = "(Ljava/lang/String;)J")
	long method27311(@OriginalArg(0) String arg0);
}
