package com.sun.gluegen.runtime;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!com/sun/gluegen/runtime/WindowsDynamicLinkerImpl")
public final class WindowsDynamicLinkerImpl implements Interface6 {

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/WindowsDynamicLinkerImpl", name = "FreeLibrary", descriptor = "(J)I")
	private static native int FreeLibrary(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/WindowsDynamicLinkerImpl", name = "LoadLibraryA", descriptor = "(Ljava/lang/String;)J")
	private static native long LoadLibraryA(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/WindowsDynamicLinkerImpl", name = "openLibrary", descriptor = "(Ljava/lang/String;)J")
	@Override
	public long method4900(@OriginalArg(0) String arg0) {
		return LoadLibraryA(arg0);
	}

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/WindowsDynamicLinkerImpl", name = "closeLibrary", descriptor = "(J)V")
	@Override
	public void method4901(@OriginalArg(0) long arg0) {
		FreeLibrary(arg0);
	}
}
