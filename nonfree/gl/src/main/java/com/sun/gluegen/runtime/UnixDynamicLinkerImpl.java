package com.sun.gluegen.runtime;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!com/sun/gluegen/runtime/UnixDynamicLinkerImpl")
public final class UnixDynamicLinkerImpl implements Interface6 {

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/UnixDynamicLinkerImpl", name = "dlclose", descriptor = "(J)I")
	private static native int dlclose(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/UnixDynamicLinkerImpl", name = "dlopen", descriptor = "(Ljava/lang/String;I)J")
	private static native long dlopen(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/UnixDynamicLinkerImpl", name = "openLibrary", descriptor = "(Ljava/lang/String;)J")
	@Override
	public long method4900(@OriginalArg(0) String arg0) {
		return dlopen(arg0, 257);
	}

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/UnixDynamicLinkerImpl", name = "closeLibrary", descriptor = "(J)V")
	@Override
	public void method4901(@OriginalArg(0) long arg0) {
		dlclose(arg0);
	}
}
