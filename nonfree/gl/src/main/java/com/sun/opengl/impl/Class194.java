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
	private int anInt5925;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/FunctionAvailabilityCache$Version", name = "minor", descriptor = "I")
	private int anInt5926;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/FunctionAvailabilityCache$Version", name = "sub", descriptor = "I")
	private int anInt5927;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/FunctionAvailabilityCache$Version", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class194(@OriginalArg(0) String arg0) {
		try {
			@Pc(11) StringTokenizer local11;
			if (arg0.startsWith("GL_VERSION_")) {
				local11 = new StringTokenizer(arg0, "_");
				local11.nextToken();
				local11.nextToken();
				if (!local11.hasMoreTokens()) {
					this.anInt5925 = 0;
					return;
				}
				this.anInt5925 = Integer.valueOf(local11.nextToken());
				if (!local11.hasMoreTokens()) {
					this.anInt5926 = 0;
					return;
				}
				this.anInt5926 = Integer.valueOf(local11.nextToken());
				if (!local11.hasMoreTokens()) {
					this.anInt5927 = 0;
					return;
				}
				this.anInt5927 = Integer.valueOf(local11.nextToken());
			} else {
				local11 = new StringTokenizer(arg0, ". ");
				this.anInt5925 = Integer.valueOf(local11.nextToken());
				this.anInt5926 = Integer.valueOf(local11.nextToken());
				local11 = new StringTokenizer(arg0, " ");
				if (local11.hasMoreTokens()) {
					local11.nextToken();
					if (local11.hasMoreTokens()) {
						@Pc(93) Pattern local93 = Pattern.compile("\\D*(\\d+)\\.(\\d+)\\.?(\\d*).*");
						@Pc(98) Matcher local98 = local93.matcher(local11.nextToken());
						if (local98.matches()) {
							@Pc(107) int local107 = Integer.valueOf(local98.group(1));
							@Pc(113) int local113 = Integer.valueOf(local98.group(2));
							if (local107 == this.anInt5925 && local113 > this.anInt5926 || local107 == this.anInt5925 + 1) {
								this.anInt5925 = local107;
								this.anInt5926 = local113;
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
		if (this.anInt5925 > local2.anInt5925) {
			return 1;
		} else if (this.anInt5925 < local2.anInt5925) {
			return -1;
		} else if (this.anInt5926 > local2.anInt5926) {
			return 1;
		} else if (this.anInt5926 < local2.anInt5926) {
			return -1;
		} else if (this.anInt5927 > local2.anInt5927) {
			return 1;
		} else if (this.anInt5927 < local2.anInt5927) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/FunctionAvailabilityCache$Version", name = "getMajor", descriptor = "()I")
	public int method4604() {
		return this.anInt5925;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/FunctionAvailabilityCache$Version", name = "getMinor", descriptor = "()I")
	public int method4605() {
		return this.anInt5926;
	}
}
