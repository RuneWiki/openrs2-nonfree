package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!zo")
public class Class697 implements Interface75 {

	@OriginalMember(owner = "client!zo", name = "p", descriptor = "Lclient!zo;")
	public static final Class697 aClass697_3 = new Class697(-2);

	@OriginalMember(owner = "client!zo", name = "c", descriptor = "Lclient!zo;")
	public static final Class697 aClass697_4 = new Class697(-3);

	@OriginalMember(owner = "client!zo", name = "v", descriptor = "Lclient!zo;")
	public static final Class697 aClass697_7 = new Class697(2);

	@OriginalMember(owner = "client!zo", name = "l", descriptor = "Lclient!zo;")
	public static final Class697 aClass697_5 = new Class697(3);

	@OriginalMember(owner = "client!zo", name = "y", descriptor = "Lclient!zo;")
	static final Class697 aClass697_6 = new Class697(4);

	@OriginalMember(owner = "client!zo", name = "w", descriptor = "I")
	final int anInt5879;

	@OriginalMember(owner = "client!zo", name = "v", descriptor = "()[Lclient!zo;", line = 16)
	public static Class697[] method36467() {
		return new Class697[] { aClass697_7, aClass697_4, aClass697_5, aClass697_6, aClass697_3 };
	}

	@OriginalMember(owner = "client!zo", name = "w", descriptor = "()[Lclient!zo;", line = 16)
	public static Class697[] method36468() {
		return new Class697[] { aClass697_7, aClass697_4, aClass697_5, aClass697_6, aClass697_3 };
	}

	@OriginalMember(owner = "client!zo", name = "q", descriptor = "()[Lclient!zo;", line = 16)
	public static Class697[] method36469() {
		return new Class697[] { aClass697_7, aClass697_4, aClass697_5, aClass697_6, aClass697_3 };
	}

	@OriginalMember(owner = "client!zo", name = "t", descriptor = "()[Lclient!zo;", line = 16)
	public static Class697[] method36470() {
		return new Class697[] { aClass697_7, aClass697_4, aClass697_5, aClass697_6, aClass697_3 };
	}

	@OriginalMember(owner = "client!zo", name = "<init>", descriptor = "(I)V", line = 19)
	Class697(@OriginalArg(0) int arg0) {
		this.anInt5879 = arg0 * -191295345;
	}

	@OriginalMember(owner = "client!zo", name = "l", descriptor = "()I", line = 24)
	@Override
	public int method36478() {
		return this.anInt5879 * -895086993;
	}

	@OriginalMember(owner = "client!zo", name = "c", descriptor = "()I", line = 24)
	@Override
	public int method36479() {
		return this.anInt5879 * -895086993;
	}

	@OriginalMember(owner = "client!zo", name = "y", descriptor = "()I", line = 24)
	@Override
	public int method36477() {
		return this.anInt5879 * -895086993;
	}
}
