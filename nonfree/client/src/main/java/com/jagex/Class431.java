package com.jagex;

import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nx")
public class Class431 {

	@OriginalMember(owner = "client!nx", name = "q", descriptor = "I")
	public static final int anInt4882 = 7;

	@OriginalMember(owner = "client!nx", name = "u", descriptor = "I")
	public static final int anInt4883 = 41;

	@OriginalMember(owner = "client!nx", name = "v", descriptor = "I")
	public static final int anInt4884 = 2;

	@OriginalMember(owner = "client!nx", name = "l", descriptor = "I")
	public static final int anInt4885 = 3;

	@OriginalMember(owner = "client!nx", name = "y", descriptor = "I")
	public static final int anInt4886 = 4;

	@OriginalMember(owner = "client!nx", name = "d", descriptor = "I")
	public static final int anInt4887 = 17;

	@OriginalMember(owner = "client!nx", name = "g", descriptor = "I")
	public static final int anInt4888 = 20;

	@OriginalMember(owner = "client!nx", name = "w", descriptor = "I")
	public static final int anInt4889 = 5;

	@OriginalMember(owner = "client!nx", name = "x", descriptor = "I")
	public static final int anInt4890 = 9;

	@OriginalMember(owner = "client!nx", name = "t", descriptor = "I")
	public static final int anInt4891 = 6;

	@OriginalMember(owner = "client!nx", name = "s", descriptor = "I")
	public static final int anInt4892 = 18;

	@OriginalMember(owner = "client!nx", name = "r", descriptor = "I")
	public static final int anInt4893 = 19;

	@OriginalMember(owner = "client!nx", name = "p", descriptor = "I")
	public static final int anInt4894 = 0;

	@OriginalMember(owner = "client!nx", name = "z", descriptor = "I")
	public static final int anInt4895 = 22;

	@OriginalMember(owner = "client!nx", name = "j", descriptor = "I")
	public static final int anInt4896 = 23;

	@OriginalMember(owner = "client!nx", name = "i", descriptor = "I")
	public static final int anInt4897 = 24;

	@OriginalMember(owner = "client!nx", name = "m", descriptor = "I")
	public static final int anInt4898 = 99;

	@OriginalMember(owner = "client!nx", name = "b", descriptor = "I")
	public static final int anInt4899 = 45;

	@OriginalMember(owner = "client!nx", name = "e", descriptor = "I")
	public static final int anInt4900 = 42;

	@OriginalMember(owner = "client!nx", name = "f", descriptor = "I")
	public static final int anInt4901 = 43;

	@OriginalMember(owner = "client!nx", name = "o", descriptor = "I")
	public static final int anInt4902 = 44;

	@OriginalMember(owner = "client!nx", name = "a", descriptor = "I")
	public static final int anInt4903 = 98;

	@OriginalMember(owner = "client!nx", name = "n", descriptor = "I")
	public static final int anInt4904 = 46;

	@OriginalMember(owner = "client!nx", name = "c", descriptor = "I")
	public static final int anInt4905 = 1;

	@OriginalMember(owner = "client!nx", name = "k", descriptor = "I")
	public static final int anInt4906 = 25;

	@OriginalMember(owner = "client!nx", name = "bc", descriptor = "I")
	public static int anInt4907;

	@OriginalMember(owner = "client!nx", name = "<init>", descriptor = "()V", line = 30)
	Class431() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!nx", name = "f", descriptor = "(Ljava/lang/Object;B)V", line = 556)
	static void method28819(@OriginalArg(0) Object arg0) {
		if (Class683.anEventQueue1 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < 50 && Class683.anEventQueue1.peekEvent() != null; local4++) {
			Class281.method26679(1L);
		}
		try {
			if (arg0 != null) {
				Class683.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
			}
		} catch (@Pc(26) Exception local26) {
		}
	}
}
