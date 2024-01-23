package com.sun.gluegen.runtime;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!com/sun/gluegen/runtime/DynamicLinker")
public interface Interface6 {

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/DynamicLinker", name = "openLibrary", descriptor = "(Ljava/lang/String;)J")
	long method4370(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/DynamicLinker", name = "closeLibrary", descriptor = "(J)V")
	void method4371(@OriginalArg(0) long arg0);
}
