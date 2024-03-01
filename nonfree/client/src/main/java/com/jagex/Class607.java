package com.jagex;

import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yr")
public class Class607 {

	@OriginalMember(owner = "client!yr", name = "p", descriptor = "Ljava/util/Random;")
	static Random aRandom2;

	@OriginalMember(owner = "client!yr", name = "a", descriptor = "Ljava/lang/Object;")
	static final Object anObject28 = new Object();

	@OriginalMember(owner = "client!yr", name = "<init>", descriptor = "()V", line = 9)
	Class607() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!yr", name = "z", descriptor = "(II)I", line = 14)
	public static int method33543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4;
		if (arg1 > arg0) {
			local4 = arg0;
			arg0 = arg1;
			arg1 = local4;
		}
		while (arg1 != 0) {
			local4 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local4;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!yr", name = "b", descriptor = "(II)I", line = 14)
	public static int method33544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4;
		if (arg1 > arg0) {
			local4 = arg0;
			arg0 = arg1;
			arg1 = local4;
		}
		while (arg1 != 0) {
			local4 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local4;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!yr", name = "c", descriptor = "(II)I", line = 14)
	public static int method33545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4;
		if (arg1 > arg0) {
			local4 = arg0;
			arg0 = arg1;
			arg1 = local4;
		}
		while (arg1 != 0) {
			local4 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local4;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!yr", name = "y", descriptor = "(II)I", line = 14)
	public static int method33552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4;
		if (arg1 > arg0) {
			local4 = arg0;
			arg0 = arg1;
			arg1 = local4;
		}
		while (arg1 != 0) {
			local4 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local4;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!yr", name = "j", descriptor = "(I)I", line = 28)
	public static int method33547(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(6) int local6 = local0 | local0 >>> 1;
		@Pc(12) int local12 = local6 | local6 >>> 2;
		@Pc(18) int local18 = local12 | local12 >>> 4;
		@Pc(24) int local24 = local18 | local18 >>> 8;
		@Pc(30) int local30 = local24 | local24 >>> 16;
		return local30 + 1;
	}

	@OriginalMember(owner = "client!yr", name = "n", descriptor = "(I)I", line = 28)
	public static int method33548(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(6) int local6 = local0 | local0 >>> 1;
		@Pc(12) int local12 = local6 | local6 >>> 2;
		@Pc(18) int local18 = local12 | local12 >>> 4;
		@Pc(24) int local24 = local18 | local18 >>> 8;
		@Pc(30) int local30 = local24 | local24 >>> 16;
		return local30 + 1;
	}

	@OriginalMember(owner = "client!yr", name = "r", descriptor = "(I)I", line = 28)
	public static int method33550(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(6) int local6 = local0 | local0 >>> 1;
		@Pc(12) int local12 = local6 | local6 >>> 2;
		@Pc(18) int local18 = local12 | local12 >>> 4;
		@Pc(24) int local24 = local18 | local18 >>> 8;
		@Pc(30) int local30 = local24 | local24 >>> 16;
		return local30 + 1;
	}

	@OriginalMember(owner = "client!yr", name = "e", descriptor = "(I)I", line = 28)
	public static int method33556(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(6) int local6 = local0 | local0 >>> 1;
		@Pc(12) int local12 = local6 | local6 >>> 2;
		@Pc(18) int local18 = local12 | local12 >>> 4;
		@Pc(24) int local24 = local18 | local18 >>> 8;
		@Pc(30) int local30 = local24 | local24 >>> 16;
		return local30 + 1;
	}

	@OriginalMember(owner = "client!yr", name = "q", descriptor = "(I)I", line = 38)
	public static int method33549(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 >>> 1;
		@Pc(9) int local9 = local3 | local3 >>> 1;
		@Pc(15) int local15 = local9 | local9 >>> 2;
		@Pc(21) int local21 = local15 | local15 >>> 4;
		@Pc(27) int local27 = local21 | local21 >>> 8;
		@Pc(33) int local33 = local27 | local27 >>> 16;
		return arg0 & ~local33;
	}

	@OriginalMember(owner = "client!yr", name = "d", descriptor = "(I)I", line = 38)
	public static int method33551(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 >>> 1;
		@Pc(9) int local9 = local3 | local3 >>> 1;
		@Pc(15) int local15 = local9 | local9 >>> 2;
		@Pc(21) int local21 = local15 | local15 >>> 4;
		@Pc(27) int local27 = local21 | local21 >>> 8;
		@Pc(33) int local33 = local27 | local27 >>> 16;
		return arg0 & ~local33;
	}

	@OriginalMember(owner = "client!yr", name = "m", descriptor = "(I)I", line = 38)
	public static int method33553(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 >>> 1;
		@Pc(9) int local9 = local3 | local3 >>> 1;
		@Pc(15) int local15 = local9 | local9 >>> 2;
		@Pc(21) int local21 = local15 | local15 >>> 4;
		@Pc(27) int local27 = local21 | local21 >>> 8;
		@Pc(33) int local33 = local27 | local27 >>> 16;
		return arg0 & ~local33;
	}

	@OriginalMember(owner = "client!yr", name = "v", descriptor = "(I)Z", line = 48)
	public static boolean method33542(@OriginalArg(0) int arg0) {
		return (arg0 & -arg0) == arg0;
	}

	@OriginalMember(owner = "client!yr", name = "t", descriptor = "(I)Z", line = 48)
	public static boolean method33554(@OriginalArg(0) int arg0) {
		return (arg0 & -arg0) == arg0;
	}

	@OriginalMember(owner = "client!yr", name = "o", descriptor = "(I)I", line = 52)
	public static int method33546(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local1 += 16;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local1 += 8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local1 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local1 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local1++;
		}
		return local1 + arg0;
	}

	@OriginalMember(owner = "client!yr", name = "w", descriptor = "(I)I", line = 52)
	public static int method33555(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local1 += 16;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local1 += 8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local1 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local1 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local1++;
		}
		return local1 + arg0;
	}
}
