package com.sun.gluegen.runtime;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("gl!com/sun/gluegen/runtime/CPU")
public final class Class184 {

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/CPU", name = "is32Bit", descriptor = "Z")
	private static boolean aBoolean348;

	static {
		@Pc(3) String local3 = System.getProperty("os.name").toLowerCase();
		@Pc(7) String local7 = System.getProperty("os.arch").toLowerCase();
		if (local3.startsWith("windows") && local7.equals("x86") || !(!local3.startsWith("linux") || !local7.equals("i386")) || local3.startsWith("linux") && local7.equals("x86") || local3.startsWith("mac os") && local7.equals("ppc") || local3.startsWith("mac os") && local7.equals("i386") || local3.startsWith("sunos") && local7.equals("sparc") || local3.startsWith("sunos") && local7.equals("x86") || local3.startsWith("freebsd") && local7.equals("i386") || local3.startsWith("hp-ux") && local7.equals("pa_risc2.0")) {
			aBoolean348 = true;
		} else if ((!local3.startsWith("windows") || !local7.equals("amd64")) && (!local3.startsWith("linux") || !local7.equals("amd64")) && (!local3.startsWith("linux") || !local7.equals("x86_64")) && (!local3.startsWith("linux") || !local7.equals("ia64")) && (!local3.startsWith("mac os") || !local7.equals("x86_64")) && (!local3.startsWith("sunos") || !local7.equals("sparcv9")) && (!local3.startsWith("sunos") || !local7.equals("amd64"))) {
			throw new RuntimeException("Please port CPU detection (32/64 bit) to your platform (" + local3 + "/" + local7 + ")");
		}
	}

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/CPU", name = "is32Bit", descriptor = "()Z")
	public static boolean method4868() {
		return aBoolean348;
	}
}
