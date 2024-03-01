package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gz")
public interface Interface16 {

	@OriginalMember(owner = "client!gz", name = "a", descriptor = "(Ljava/lang/String;)J")
	long method23405(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "client!gz", name = "p", descriptor = "(Ljava/lang/String;B)J")
	long method23406(@OriginalArg(0) String arg0);
}
