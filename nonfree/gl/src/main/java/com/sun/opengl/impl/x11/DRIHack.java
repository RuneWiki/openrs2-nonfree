package com.sun.opengl.impl.x11;

import com.sun.gluegen.runtime.Class185;
import java.io.File;
import java.security.AccessController;
import java.security.PrivilegedAction;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("gl!com/sun/opengl/impl/x11/DRIHack")
public final class DRIHack {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/DRIHack", name = "driHackNeeded", descriptor = "Z")
	private static boolean driHackNeeded;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/DRIHack", name = "oglLib", descriptor = "Lgl!com/sun/gluegen/runtime/NativeLibrary;")
	private static Class185 oglLib;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/DRIHack", name = "begin", descriptor = "()V")
	public static void begin() {
		AccessController.doPrivileged(new PrivilegedAction() {

			@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/DRIHack$1", name = "run", descriptor = "()Ljava/lang/Object;")
			@Override
			public Object run() {
				@Pc(3) String local3 = System.getProperty("os.name").toLowerCase();
				DRIHack.driHackNeeded = local3.startsWith("linux") || (new File("/usr/lib/dri")).exists() || (new File("/usr/X11R6/lib/modules/dri")).exists();
				if (System.getProperty("jogl.drihack.disable") != null) {
					DRIHack.driHackNeeded = false;
				}
				return null;
			}
		});
		if (driHackNeeded) {
			oglLib = Class185.method4964("libGL.so.1", null);
			if (oglLib == null) {
				oglLib = Class185.method4964("/usr/lib/libGL.so.1", null);
			}
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/DRIHack", name = "end", descriptor = "()V")
	public static void end() {
		if (oglLib != null) {
			oglLib.method4966();
			oglLib = null;
		}
	}
}
