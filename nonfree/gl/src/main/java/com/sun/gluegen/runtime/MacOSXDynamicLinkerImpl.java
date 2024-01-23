package com.sun.gluegen.runtime;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!com/sun/gluegen/runtime/MacOSXDynamicLinkerImpl")
public final class MacOSXDynamicLinkerImpl implements Interface6 {

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/MacOSXDynamicLinkerImpl", name = "dlclose", descriptor = "(J)I")
	private static native int dlclose(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/MacOSXDynamicLinkerImpl", name = "dlopen", descriptor = "(Ljava/lang/String;I)J")
	private static native long dlopen(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/MacOSXDynamicLinkerImpl", name = "openLibrary", descriptor = "(Ljava/lang/String;)J")
	@Override
	public long method4444(@OriginalArg(0) String arg0) {
		return dlopen(arg0, 9);
	}

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/MacOSXDynamicLinkerImpl", name = "closeLibrary", descriptor = "(J)V")
	@Override
	public void method4445(@OriginalArg(0) long arg0) {
		dlclose(arg0);
	}
}
