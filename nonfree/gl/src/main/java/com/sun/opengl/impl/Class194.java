package com.sun.opengl.impl;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("gl!com/sun/opengl/impl/FunctionAvailabilityCache$Version")
public final class Class194 implements Comparable {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/FunctionAvailabilityCache$Version", name = "major", descriptor = "I")
	private int anInt6243;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/FunctionAvailabilityCache$Version", name = "minor", descriptor = "I")
	private int anInt6244;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/FunctionAvailabilityCache$Version", name = "sub", descriptor = "I")
	private int anInt6245;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/FunctionAvailabilityCache$Version", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class194(@OriginalArg(0) String arg0) {
		try {
			@Pc(11) StringTokenizer local11;
			if (arg0.startsWith("GL_VERSION_")) {
				local11 = new StringTokenizer(arg0, "_");
				local11.nextToken();
				local11.nextToken();
				if (!local11.hasMoreTokens()) {
					this.anInt6243 = 0;
					return;
				}
				this.anInt6243 = Integer.valueOf(local11.nextToken());
				if (!local11.hasMoreTokens()) {
					this.anInt6244 = 0;
					return;
				}
				this.anInt6244 = Integer.valueOf(local11.nextToken());
				if (!local11.hasMoreTokens()) {
					this.anInt6245 = 0;
					return;
				}
				this.anInt6245 = Integer.valueOf(local11.nextToken());
			} else {
				local11 = new StringTokenizer(arg0, ". ");
				this.anInt6243 = Integer.valueOf(local11.nextToken());
				this.anInt6244 = Integer.valueOf(local11.nextToken());
				local11 = new StringTokenizer(arg0, " ");
				if (local11.hasMoreTokens()) {
					local11.nextToken();
					if (local11.hasMoreTokens()) {
						@Pc(93) Pattern local93 = Pattern.compile("\\D*(\\d+)\\.(\\d+)\\.?(\\d*).*");
						@Pc(98) Matcher local98 = local93.matcher(local11.nextToken());
						if (local98.matches()) {
							@Pc(107) int local107 = Integer.valueOf(local98.group(1));
							@Pc(113) int local113 = Integer.valueOf(local98.group(2));
							if (local107 == this.anInt6243 && local113 > this.anInt6244 || local107 == this.anInt6243 + 1) {
								this.anInt6243 = local107;
								this.anInt6244 = local113;
							}
						}
					}
				}
			}
		} catch (@Pc(135) Exception local135) {
			throw (IllegalArgumentException) (new IllegalArgumentException("Illegally formatted version identifier: \"" + arg0 + "\"")).initCause(local135);
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/FunctionAvailabilityCache$Version", name = "compareTo", descriptor = "(Ljava/lang/Object;)I")
	@Override
	public int compareTo(@OriginalArg(0) Object arg0) {
		@Pc(2) Class194 local2 = (Class194) arg0;
		if (this.anInt6243 > local2.anInt6243) {
			return 1;
		} else if (this.anInt6243 < local2.anInt6243) {
			return -1;
		} else if (this.anInt6244 > local2.anInt6244) {
			return 1;
		} else if (this.anInt6244 < local2.anInt6244) {
			return -1;
		} else if (this.anInt6245 > local2.anInt6245) {
			return 1;
		} else if (this.anInt6245 < local2.anInt6245) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/FunctionAvailabilityCache$Version", name = "getMajor", descriptor = "()I")
	public int method4906() {
		return this.anInt6243;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/FunctionAvailabilityCache$Version", name = "getMinor", descriptor = "()I")
	public int method4907() {
		return this.anInt6244;
	}
}
