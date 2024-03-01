package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class Class211 {

	@OriginalMember(owner = "client!gv", name = "p", descriptor = "I")
	public static final int anInt3703 = 5;

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "()V", line = 6)
	Class211() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!gv", name = "p", descriptor = "(B)[Lclient!le;", line = 91)
	public static Class296[] method24253() {
		return new Class296[] { Class296.aClass296_21, Class296.aClass296_25, Class296.aClass296_12, Class296.aClass296_16, Class296.aClass296_33, Class296.aClass296_7, Class296.aClass296_8, Class296.aClass296_11, Class296.aClass296_18, Class296.aClass296_6, Class296.aClass296_36, Class296.aClass296_23, Class296.aClass296_41, Class296.aClass296_4, Class296.aClass296_20, Class296.aClass296_30, Class296.aClass296_38, Class296.aClass296_22, Class296.aClass296_28, Class296.aClass296_37, Class296.aClass296_15, Class296.aClass296_3, Class296.aClass296_5, Class296.aClass296_26, Class296.aClass296_39, Class296.aClass296_1, Class296.aClass296_34, Class296.aClass296_40, Class296.aClass296_13, Class296.aClass296_9, Class296.aClass296_24, Class296.aClass296_31, Class296.aClass296_14, Class296.aClass296_35, Class296.aClass296_10, Class296.aClass296_19, Class296.aClass296_2, Class296.aClass296_27, Class296.aClass296_32, Class296.aClass296_17, Class296.aClass296_29 };
	}

	@OriginalMember(owner = "client!gv", name = "g", descriptor = "(CB)C", line = 95)
	static char method24252(@OriginalArg(0) char arg0) {
		if (arg0 == 198) {
			return 'E';
		} else if (arg0 == 230) {
			return 'e';
		} else if (arg0 == 223) {
			return 's';
		} else if (arg0 == 338) {
			return 'E';
		} else {
			return (char) (arg0 == 339 ? 'e' : '\u0000');
		}
	}
}
