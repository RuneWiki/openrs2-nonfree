package com.sun.opengl.impl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("gl!com/sun/opengl/impl/FunctionAvailabilityCache")
public final class Class193 {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/FunctionAvailabilityCache", name = "availabilityCache", descriptor = "Ljava/util/HashMap;")
	private HashMap aHashMap1 = new HashMap(50);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/FunctionAvailabilityCache", name = "availableExtensionCache", descriptor = "Ljava/util/HashSet;")
	private HashSet aHashSet1 = new HashSet(50);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/FunctionAvailabilityCache", name = "context", descriptor = "Lgl!com/sun/opengl/impl/GLContextImpl;")
	private GLContext_Sub1 aGLContext_Sub1_1;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/FunctionAvailabilityCache", name = "mapGLExtensionName", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	private static String method4603(@OriginalArg(0) String arg0) {
		return arg0 != null && (arg0.equals("WGL_NV_vertex_array_range") || arg0.equals("GLX_NV_vertex_array_range")) ? "GL_NV_vertex_array_range" : arg0;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/FunctionAvailabilityCache", name = "<init>", descriptor = "(Lgl!com/sun/opengl/impl/GLContextImpl;)V")
	public Class193(@OriginalArg(0) GLContext_Sub1 arg0) {
		this.aGLContext_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/FunctionAvailabilityCache", name = "flush", descriptor = "()V")
	public void method4600() {
		this.aHashMap1.clear();
		this.aHashSet1.clear();
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/FunctionAvailabilityCache", name = "isExtensionAvailable", descriptor = "(Ljava/lang/String;)Z")
	public boolean method4601(@OriginalArg(0) String arg0) {
		this.method4602();
		return this.aHashSet1.contains(method4603(arg0));
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/FunctionAvailabilityCache", name = "initAvailableExtensions", descriptor = "()V")
	private void method4602() {
		if (!this.aHashSet1.isEmpty()) {
			return;
		}
		@Pc(7) GL local7 = this.aGLContext_Sub1_1.getGL();
		@Pc(22) String local22 = local7.glGetString(7939) + " " + this.aGLContext_Sub1_1.getPlatformExtensionsString();
		@Pc(27) StringTokenizer local27 = new StringTokenizer(local22);
		while (local27.hasMoreTokens()) {
			@Pc(34) String local34 = local27.nextToken().trim();
			@Pc(37) String local37 = local34.intern();
			this.aHashSet1.add(local37);
		}
		@Pc(50) Class194 local50 = new Class194(local7.glGetString(7938));
		@Pc(53) int local53 = local50.method4604();
		@Pc(56) int local56 = local50.method4605();
		while (local53 > 0) {
			while (local56 >= 0) {
				this.aHashSet1.add("GL_VERSION_" + local53 + "_" + local56);
				local56--;
			}
			switch(local53) {
				case 2:
					local56 = 5;
				case 1:
				default:
					local53--;
			}
		}
		this.aHashSet1.add("<INTERNAL_DUMMY_PLACEHOLDER>");
	}
}
