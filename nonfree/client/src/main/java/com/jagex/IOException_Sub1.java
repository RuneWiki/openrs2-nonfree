package com.jagex;

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aox")
public class IOException_Sub1 extends IOException {

	@OriginalMember(owner = "client!aox", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 7)
	IOException_Sub1(@OriginalArg(0) String arg0) {
		super(arg0);
	}
}
