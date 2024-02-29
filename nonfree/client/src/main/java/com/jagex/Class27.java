package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aba")
public class Class27 implements Interface75 {

	@OriginalMember(owner = "client!aba", name = "ur", descriptor = "I")
	static int anInt125;

	@OriginalMember(owner = "client!aba", name = "p", descriptor = "Lclient!aba;")
	static final Class27 aClass27_5 = new Class27(0);

	@OriginalMember(owner = "client!aba", name = "c", descriptor = "Lclient!aba;")
	static final Class27 aClass27_2 = new Class27(1);

	@OriginalMember(owner = "client!aba", name = "v", descriptor = "Lclient!aba;")
	static final Class27 aClass27_3 = new Class27(2);

	@OriginalMember(owner = "client!aba", name = "l", descriptor = "Lclient!aba;")
	public static final Class27 aClass27_4 = new Class27(3);

	@OriginalMember(owner = "client!aba", name = "y", descriptor = "Lclient!aba;")
	public static final Class27 aClass27_14 = new Class27(4);

	@OriginalMember(owner = "client!aba", name = "w", descriptor = "Lclient!aba;")
	static final Class27 aClass27_6 = new Class27(5);

	@OriginalMember(owner = "client!aba", name = "t", descriptor = "Lclient!aba;")
	static final Class27 aClass27_7 = new Class27(6);

	@OriginalMember(owner = "client!aba", name = "q", descriptor = "Lclient!aba;")
	static final Class27 aClass27_8 = new Class27(7);

	@OriginalMember(owner = "client!aba", name = "x", descriptor = "Lclient!aba;")
	public static final Class27 aClass27_9 = new Class27(8);

	@OriginalMember(owner = "client!aba", name = "d", descriptor = "Lclient!aba;")
	public static final Class27 aClass27_10 = new Class27(9);

	@OriginalMember(owner = "client!aba", name = "s", descriptor = "Lclient!aba;")
	public static final Class27 aClass27_13 = new Class27(10);

	@OriginalMember(owner = "client!aba", name = "r", descriptor = "Lclient!aba;")
	static final Class27 aClass27_12 = new Class27(11);

	@OriginalMember(owner = "client!aba", name = "g", descriptor = "Lclient!aba;")
	public static final Class27 aClass27_11 = new Class27(12);

	@OriginalMember(owner = "client!aba", name = "z", descriptor = "Lclient!aba;")
	public static final Class27 aClass27_1 = new Class27(13);

	@OriginalMember(owner = "client!aba", name = "j", descriptor = "I")
	final int anInt124;

	@OriginalMember(owner = "client!aba", name = "p", descriptor = "(Lclient!pw;Lclient!xl;I)I", line = 12)
	static int method470(@OriginalArg(0) Class478 arg0, @OriginalArg(1) Class647 arg1) {
		if (arg0 == null) {
			return 0;
		} else if (arg1.method32842() > 1) {
			@Pc(12) int local12 = arg0.method29753() - 1;
			return local12 * arg1.method32842() + arg0.method29752(local12);
		} else {
			return arg0.method29752(arg1.anInt5724 * 1570156841);
		}
	}

	@OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(I)V", line = 22)
	Class27(@OriginalArg(0) int arg0) {
		this.anInt124 = arg0 * -1100168257;
	}

	@OriginalMember(owner = "client!aba", name = "c", descriptor = "()I", line = 27)
	@Override
	public int method36479() {
		return this.anInt124 * -399954881;
	}

	@OriginalMember(owner = "client!aba", name = "l", descriptor = "()I", line = 27)
	@Override
	public int method36478() {
		return this.anInt124 * -399954881;
	}

	@OriginalMember(owner = "client!aba", name = "y", descriptor = "()I", line = 27)
	@Override
	public int method36477() {
		return this.anInt124 * -399954881;
	}
}
