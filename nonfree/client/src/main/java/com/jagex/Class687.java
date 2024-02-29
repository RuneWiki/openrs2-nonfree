package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ze")
public class Class687 {

	@OriginalMember(owner = "client!ze", name = "p", descriptor = "Lclient!ze;")
	static final Class687 aClass687_4 = new Class687(0);

	@OriginalMember(owner = "client!ze", name = "c", descriptor = "Lclient!ze;")
	public static final Class687 aClass687_3 = new Class687(1);

	@OriginalMember(owner = "client!ze", name = "v", descriptor = "Lclient!ze;")
	static final Class687 aClass687_2 = new Class687(2);

	@OriginalMember(owner = "client!ze", name = "l", descriptor = "I")
	public final int anInt5871;

	@OriginalMember(owner = "client!ze", name = "y", descriptor = "()[Lclient!ze;", line = 11)
	static Class687[] method36287() {
		return new Class687[] { aClass687_2, aClass687_4, aClass687_3 };
	}

	@OriginalMember(owner = "client!ze", name = "l", descriptor = "()[Lclient!ze;", line = 11)
	static Class687[] method36288() {
		return new Class687[] { aClass687_2, aClass687_4, aClass687_3 };
	}

	@OriginalMember(owner = "client!ze", name = "v", descriptor = "()[Lclient!ze;", line = 11)
	static Class687[] method36289() {
		return new Class687[] { aClass687_2, aClass687_4, aClass687_3 };
	}

	@OriginalMember(owner = "client!ze", name = "<init>", descriptor = "(I)V", line = 14)
	Class687(@OriginalArg(0) int arg0) {
		this.anInt5871 = arg0 * 1321132793;
	}

	@OriginalMember(owner = "client!ze", name = "aiv", descriptor = "(Lclient!yf;B)V", line = 10995)
	static final void method36290(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) int local16 = Class161.method24333(local12);
		if (local16 < 0) {
			throw new RuntimeException();
		}
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local16;
	}
}
