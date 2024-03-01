package com.jagex;

import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dw")
public abstract class Class14 {

	@OriginalMember(owner = "client!dw", name = "g", descriptor = "I")
	public static final int anInt302 = 0;

	@OriginalMember(owner = "client!dw", name = "l", descriptor = "I")
	public static final int anInt303 = 1;

	@OriginalMember(owner = "client!dw", name = "h", descriptor = "I")
	public static final int anInt304 = 0;

	@OriginalMember(owner = "client!dw", name = "x", descriptor = "I")
	static int anInt306 = 350014811;

	@OriginalMember(owner = "client!dw", name = "s", descriptor = "I")
	static int anInt301 = 812609425;

	@OriginalMember(owner = "client!dw", name = "u", descriptor = "I")
	static int anInt307 = 0;

	@OriginalMember(owner = "client!dw", name = "y", descriptor = "I")
	static int anInt308 = 0;

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "I")
	static int anInt309 = 0;

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "I")
	static int anInt305 = 0;

	@OriginalMember(owner = "client!dw", name = "z", descriptor = "I")
	static int anInt310 = 0;

	@OriginalMember(owner = "client!dw", name = "j", descriptor = "I")
	static int anInt311 = 0;

	@OriginalMember(owner = "client!dw", name = "n", descriptor = "[Ljava/lang/String;")
	static String[] aStringArray6 = new String[100];

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "Lclient!de;")
	Class21 aClass21_6;

	@OriginalMember(owner = "client!dw", name = "p", descriptor = "Lclient!yx;")
	Class611 aClass611_6;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Lclient!de;Lclient!yx;)V", line = 24)
	Class14(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class611 arg1) {
		this.aClass21_6 = arg0;
		this.aClass611_6 = arg1;
	}

	@OriginalMember(owner = "client!dw", name = "k", descriptor = "(Ljava/lang/String;IIII)V", line = 30)
	public void method3280(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method3290(arg3, arg4);
			this.method3287(arg0, arg1, arg2, null, null, null, 0, 0);
		}
	}

	@OriginalMember(owner = "client!dw", name = "at", descriptor = "(Ljava/lang/String;IIII)V", line = 30)
	public void method3297(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method3290(arg3, arg4);
			this.method3287(arg0, arg1, arg2, null, null, null, 0, 0);
		}
	}

	@OriginalMember(owner = "client!dw", name = "i", descriptor = "(Ljava/lang/String;IIII)V", line = 30)
	public void method3303(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method3290(arg3, arg4);
			this.method3287(arg0, arg1, arg2, null, null, null, 0, 0);
		}
	}

	@OriginalMember(owner = "client!dw", name = "f", descriptor = "(Ljava/lang/String;IIII)V", line = 30)
	public void method3304(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method3290(arg3, arg4);
			this.method3287(arg0, arg1, arg2, null, null, null, 0, 0);
		}
	}

	@OriginalMember(owner = "client!dw", name = "af", descriptor = "(Ljava/lang/String;IIII)V", line = 30)
	public void method3324(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method3290(arg3, arg4);
			this.method3287(arg0, arg1, arg2, null, null, null, 0, 0);
		}
	}

	@OriginalMember(owner = "client!dw", name = "p", descriptor = "(Ljava/lang/String;IIIII)V", line = 30)
	public void method3329(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method3290(arg3, arg4);
			this.method3287(arg0, arg1, arg2, null, null, null, 0, 0);
		}
	}

	@OriginalMember(owner = "client!dw", name = "aa", descriptor = "(Ljava/lang/String;IIII)V", line = 36)
	public void method3292(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method3290(arg3, arg4);
			this.method3287(arg0, arg1 - this.aClass611_6.method33592(arg0), arg2, null, null, null, 0, 0);
		}
	}

	@OriginalMember(owner = "client!dw", name = "ak", descriptor = "(Ljava/lang/String;IIII)V", line = 36)
	public void method3308(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method3290(arg3, arg4);
			this.method3287(arg0, arg1 - this.aClass611_6.method33592(arg0), arg2, null, null, null, 0, 0);
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Ljava/lang/String;IIIIB)V", line = 36)
	public void method3309(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method3290(arg3, arg4);
			this.method3287(arg0, arg1 - this.aClass611_6.method33592(arg0), arg2, null, null, null, 0, 0);
		}
	}

	@OriginalMember(owner = "client!dw", name = "ah", descriptor = "(Ljava/lang/String;IIII)V", line = 36)
	public void method3310(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method3290(arg3, arg4);
			this.method3287(arg0, arg1 - this.aClass611_6.method33592(arg0), arg2, null, null, null, 0, 0);
		}
	}

	@OriginalMember(owner = "client!dw", name = "an", descriptor = "(Ljava/lang/String;IIII)V", line = 36)
	public void method3311(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method3290(arg3, arg4);
			this.method3287(arg0, arg1 - this.aClass611_6.method33592(arg0), arg2, null, null, null, 0, 0);
		}
	}

	@OriginalMember(owner = "client!dw", name = "aj", descriptor = "(Ljava/lang/String;IIII)V", line = 36)
	public void method3312(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method3290(arg3, arg4);
			this.method3287(arg0, arg1 - this.aClass611_6.method33592(arg0), arg2, null, null, null, 0, 0);
		}
	}

	@OriginalMember(owner = "client!dw", name = "as", descriptor = "(Ljava/lang/String;IIII)V", line = 42)
	public void method3281(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method3290(arg3, arg4);
			this.method3287(arg0, arg1 - this.aClass611_6.method33592(arg0) / 2, arg2, null, null, null, 0, 0);
		}
	}

	@OriginalMember(owner = "client!dw", name = "g", descriptor = "(Ljava/lang/String;IIIII)V", line = 42)
	public void method3282(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method3290(arg3, arg4);
			this.method3287(arg0, arg1 - this.aClass611_6.method33592(arg0) / 2, arg2, null, null, null, 0, 0);
		}
	}

	@OriginalMember(owner = "client!dw", name = "l", descriptor = "(Ljava/lang/String;IIIIIIIII[Lclient!co;[ILclient!ch;III)I", line = 48)
	public int method3283(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class6[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) Class5 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		return this.method3284(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, 0, arg10, arg11, arg12, arg13, arg14);
	}

	@OriginalMember(owner = "client!dw", name = "av", descriptor = "(Ljava/lang/String;IIIIIIIII[Lclient!co;[ILclient!ch;II)I", line = 48)
	public int method3293(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class6[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) Class5 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		return this.method3284(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, 0, arg10, arg11, arg12, arg13, arg14);
	}

	@OriginalMember(owner = "client!dw", name = "ai", descriptor = "(Ljava/lang/String;IIIIIIIII[Lclient!co;[ILclient!ch;II)I", line = 48)
	public int method3313(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class6[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) Class5 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		return this.method3284(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, 0, arg10, arg11, arg12, arg13, arg14);
	}

	@OriginalMember(owner = "client!dw", name = "aq", descriptor = "(Ljava/lang/String;IIIIIIIII[Lclient!co;[ILclient!ch;II)I", line = 48)
	public int method3315(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class6[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) Class5 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		return this.method3284(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, 0, arg10, arg11, arg12, arg13, arg14);
	}

	@OriginalMember(owner = "client!dw", name = "h", descriptor = "(Ljava/lang/String;IIIIIIIIII[Lclient!co;[ILclient!ch;IIB)I", line = 52)
	public int method3284(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) Class6[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class5 arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (arg0 == null) {
			return 0;
		}
		this.method3290(arg5, arg6);
		if (arg9 == 0) {
			arg9 = this.aClass611_6.anInt5538 * 1433409675;
		}
		@Pc(38) int[] local38;
		if (arg4 < arg9 + this.aClass611_6.anInt5536 * -1990992757 + this.aClass611_6.anInt5537 * -1760037867 && arg4 < arg9 + arg9) {
			local38 = null;
		} else {
			local38 = new int[] { arg3 };
		}
		@Pc(55) int local55 = this.aClass611_6.method33579(arg0, local38, aStringArray6, arg11);
		if (arg10 == -1) {
			arg10 = arg4 / arg9;
			if (arg10 <= 0) {
				arg10 = 1;
			}
		}
		if (arg10 > 0 && local55 >= arg10) {
			aStringArray6[arg10 - 1] = this.aClass611_6.method33583(aStringArray6[arg10 - 1], arg3, arg11);
			local55 = arg10;
		}
		if (arg8 == 3 && local55 == 1) {
			arg8 = 1;
		}
		@Pc(108) int local108;
		@Pc(187) int local187;
		if (arg8 == 0) {
			local108 = this.aClass611_6.anInt5537 * -1760037867 + arg2;
		} else if (arg8 == 1) {
			local108 = this.aClass611_6.anInt5537 * -1760037867 + arg2 + (arg4 - this.aClass611_6.anInt5537 * -1760037867 - this.aClass611_6.anInt5536 * -1990992757 - (local55 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local108 = arg2 + arg4 - this.aClass611_6.anInt5536 * -1990992757 - (local55 - 1) * arg9;
		} else {
			local187 = (arg4 - this.aClass611_6.anInt5537 * -1760037867 - this.aClass611_6.anInt5536 * -1990992757 - (local55 - 1) * arg9) / (local55 + 1);
			if (local187 < 0) {
				local187 = 0;
			}
			local108 = local187 + arg2 + this.aClass611_6.anInt5537 * -1760037867;
			arg9 += local187;
		}
		for (local187 = 0; local187 < local55; local187++) {
			if (arg7 == 0) {
				this.method3287(aStringArray6[local187], arg1, local108, arg11, arg12, arg13, arg14, arg15);
			} else if (arg7 == 1) {
				this.method3287(aStringArray6[local187], arg1 + (arg3 - this.aClass611_6.method33592(aStringArray6[local187])) / 2, local108, arg11, arg12, arg13, arg14, arg15);
			} else if (arg7 == 2) {
				this.method3287(aStringArray6[local187], arg3 + arg1 - this.aClass611_6.method33592(aStringArray6[local187]), local108, arg11, arg12, arg13, arg14, arg15);
			} else if (local187 == local55 - 1) {
				this.method3287(aStringArray6[local187], arg1, local108, arg11, arg12, arg13, arg14, arg15);
			} else {
				this.method3322(aStringArray6[local187], arg3);
				this.method3287(aStringArray6[local187], arg1, local108, arg11, arg12, arg13, arg14, arg15);
				anInt310 = 0;
			}
			local108 += arg9;
		}
		return local55;
	}

	@OriginalMember(owner = "client!dw", name = "ax", descriptor = "(Ljava/lang/String;IIIIIIIIII[Lclient!co;[ILclient!ch;II)I", line = 52)
	public int method3317(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) Class6[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class5 arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (arg0 == null) {
			return 0;
		}
		this.method3290(arg5, arg6);
		if (arg9 == 0) {
			arg9 = this.aClass611_6.anInt5538 * 1433409675;
		}
		@Pc(38) int[] local38;
		if (arg4 < arg9 + this.aClass611_6.anInt5536 * -1990992757 + this.aClass611_6.anInt5537 * -1760037867 && arg4 < arg9 + arg9) {
			local38 = null;
		} else {
			local38 = new int[] { arg3 };
		}
		@Pc(55) int local55 = this.aClass611_6.method33579(arg0, local38, aStringArray6, arg11);
		if (arg10 == -1) {
			arg10 = arg4 / arg9;
			if (arg10 <= 0) {
				arg10 = 1;
			}
		}
		if (arg10 > 0 && local55 >= arg10) {
			aStringArray6[arg10 - 1] = this.aClass611_6.method33583(aStringArray6[arg10 - 1], arg3, arg11);
			local55 = arg10;
		}
		if (arg8 == 3 && local55 == 1) {
			arg8 = 1;
		}
		@Pc(108) int local108;
		@Pc(187) int local187;
		if (arg8 == 0) {
			local108 = this.aClass611_6.anInt5537 * -1760037867 + arg2;
		} else if (arg8 == 1) {
			local108 = this.aClass611_6.anInt5537 * -1760037867 + arg2 + (arg4 - this.aClass611_6.anInt5537 * -1760037867 - this.aClass611_6.anInt5536 * -1990992757 - (local55 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local108 = arg2 + arg4 - this.aClass611_6.anInt5536 * -1990992757 - (local55 - 1) * arg9;
		} else {
			local187 = (arg4 - this.aClass611_6.anInt5537 * -1760037867 - this.aClass611_6.anInt5536 * -1990992757 - (local55 - 1) * arg9) / (local55 + 1);
			if (local187 < 0) {
				local187 = 0;
			}
			local108 = local187 + arg2 + this.aClass611_6.anInt5537 * -1760037867;
			arg9 += local187;
		}
		for (local187 = 0; local187 < local55; local187++) {
			if (arg7 == 0) {
				this.method3287(aStringArray6[local187], arg1, local108, arg11, arg12, arg13, arg14, arg15);
			} else if (arg7 == 1) {
				this.method3287(aStringArray6[local187], arg1 + (arg3 - this.aClass611_6.method33592(aStringArray6[local187])) / 2, local108, arg11, arg12, arg13, arg14, arg15);
			} else if (arg7 == 2) {
				this.method3287(aStringArray6[local187], arg3 + arg1 - this.aClass611_6.method33592(aStringArray6[local187]), local108, arg11, arg12, arg13, arg14, arg15);
			} else if (local187 == local55 - 1) {
				this.method3287(aStringArray6[local187], arg1, local108, arg11, arg12, arg13, arg14, arg15);
			} else {
				this.method3322(aStringArray6[local187], arg3);
				this.method3287(aStringArray6[local187], arg1, local108, arg11, arg12, arg13, arg14, arg15);
				anInt310 = 0;
			}
			local108 += arg9;
		}
		return local55;
	}

	@OriginalMember(owner = "client!dw", name = "s", descriptor = "(IZI)Lclient!afp;", line = 88)
	static Class3_Sub8 method3338(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) long local8 = (long) (arg0 | (arg1 ? Integer.MIN_VALUE : 0));
		return (Class3_Sub8) Class3_Sub8.aClass581_6.method33217(local8);
	}

	@OriginalMember(owner = "client!dw", name = "x", descriptor = "(Ljava/lang/String;IIIIII)V", line = 96)
	public void method3301(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method3290(arg3, arg4);
		@Pc(10) int local10 = arg0.length();
		@Pc(13) int[] local13 = new int[local10];
		for (@Pc(15) int local15 = 0; local15 < local10; local15++) {
			local13[local15] = (int) (Math.sin((double) local15 / 2.0D + (double) arg5 / 5.0D) * 5.0D);
		}
		this.method3294(arg0, arg1 - this.aClass611_6.method33592(arg0) / 2, arg2, null, null, null, local13);
	}

	@OriginalMember(owner = "client!dw", name = "al", descriptor = "(Ljava/lang/String;IIIII)V", line = 96)
	public void method3314(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method3290(arg3, arg4);
		@Pc(10) int local10 = arg0.length();
		@Pc(13) int[] local13 = new int[local10];
		for (@Pc(15) int local15 = 0; local15 < local10; local15++) {
			local13[local15] = (int) (Math.sin((double) local15 / 2.0D + (double) arg5 / 5.0D) * 5.0D);
		}
		this.method3294(arg0, arg1 - this.aClass611_6.method33592(arg0) / 2, arg2, null, null, null, local13);
	}

	@OriginalMember(owner = "client!dw", name = "az", descriptor = "(Ljava/lang/String;IIIII)V", line = 96)
	public void method3318(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method3290(arg3, arg4);
		@Pc(10) int local10 = arg0.length();
		@Pc(13) int[] local13 = new int[local10];
		for (@Pc(15) int local15 = 0; local15 < local10; local15++) {
			local13[local15] = (int) (Math.sin((double) local15 / 2.0D + (double) arg5 / 5.0D) * 5.0D);
		}
		this.method3294(arg0, arg1 - this.aClass611_6.method33592(arg0) / 2, arg2, null, null, null, local13);
	}

	@OriginalMember(owner = "client!dw", name = "s", descriptor = "(Ljava/lang/String;IIIIII)V", line = 105)
	public void method3286(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method3290(arg3, arg4);
		@Pc(10) int local10 = arg0.length();
		@Pc(13) int[] local13 = new int[local10];
		@Pc(16) int[] local16 = new int[local10];
		for (@Pc(18) int local18 = 0; local18 < local10; local18++) {
			local13[local18] = (int) (Math.sin((double) local18 / 5.0D + (double) arg5 / 5.0D) * 5.0D);
			local16[local18] = (int) (Math.sin((double) arg5 / 5.0D + (double) local18 / 3.0D) * 5.0D);
		}
		this.method3294(arg0, arg1 - this.aClass611_6.method33592(arg0) / 2, arg2, null, null, local13, local16);
	}

	@OriginalMember(owner = "client!dw", name = "ao", descriptor = "(Ljava/lang/String;IIIII)V", line = 105)
	public void method3320(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method3290(arg3, arg4);
		@Pc(10) int local10 = arg0.length();
		@Pc(13) int[] local13 = new int[local10];
		@Pc(16) int[] local16 = new int[local10];
		for (@Pc(18) int local18 = 0; local18 < local10; local18++) {
			local13[local18] = (int) (Math.sin((double) local18 / 5.0D + (double) arg5 / 5.0D) * 5.0D);
			local16[local18] = (int) (Math.sin((double) arg5 / 5.0D + (double) local18 / 3.0D) * 5.0D);
		}
		this.method3294(arg0, arg1 - this.aClass611_6.method33592(arg0) / 2, arg2, null, null, local13, local16);
	}

	@OriginalMember(owner = "client!dw", name = "ap", descriptor = "(Ljava/lang/String;IIIII)V", line = 105)
	public void method3321(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method3290(arg3, arg4);
		@Pc(10) int local10 = arg0.length();
		@Pc(13) int[] local13 = new int[local10];
		@Pc(16) int[] local16 = new int[local10];
		for (@Pc(18) int local18 = 0; local18 < local10; local18++) {
			local13[local18] = (int) (Math.sin((double) local18 / 5.0D + (double) arg5 / 5.0D) * 5.0D);
			local16[local18] = (int) (Math.sin((double) arg5 / 5.0D + (double) local18 / 3.0D) * 5.0D);
		}
		this.method3294(arg0, arg1 - this.aClass611_6.method33592(arg0) / 2, arg2, null, null, local13, local16);
	}

	@OriginalMember(owner = "client!dw", name = "u", descriptor = "(Ljava/lang/String;IIIIIII)V", line = 118)
	public void method3279(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg0 == null) {
			return;
		}
		this.method3290(arg3, arg4);
		@Pc(15) double local15 = 7.0D - (double) arg6 / 8.0D;
		if (local15 < 0.0D) {
			local15 = 0.0D;
		}
		@Pc(24) int local24 = arg0.length();
		@Pc(27) int[] local27 = new int[local24];
		for (@Pc(29) int local29 = 0; local29 < local24; local29++) {
			local27[local29] = (int) (Math.sin((double) local29 / 1.5D + (double) arg5 / 1.0D) * local15);
		}
		this.method3294(arg0, arg1 - this.aClass611_6.method33592(arg0) / 2, arg2, null, null, null, local27);
	}

	@OriginalMember(owner = "client!dw", name = "ay", descriptor = "(Ljava/lang/String;IIIIII)V", line = 118)
	public void method3285(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg0 == null) {
			return;
		}
		this.method3290(arg3, arg4);
		@Pc(15) double local15 = 7.0D - (double) arg6 / 8.0D;
		if (local15 < 0.0D) {
			local15 = 0.0D;
		}
		@Pc(24) int local24 = arg0.length();
		@Pc(27) int[] local27 = new int[local24];
		for (@Pc(29) int local29 = 0; local29 < local24; local29++) {
			local27[local29] = (int) (Math.sin((double) local29 / 1.5D + (double) arg5 / 1.0D) * local15);
		}
		this.method3294(arg0, arg1 - this.aClass611_6.method33592(arg0) / 2, arg2, null, null, null, local27);
	}

	@OriginalMember(owner = "client!dw", name = "ab", descriptor = "(Ljava/lang/String;IIIIII)V", line = 118)
	public void method3319(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg0 == null) {
			return;
		}
		this.method3290(arg3, arg4);
		@Pc(15) double local15 = 7.0D - (double) arg6 / 8.0D;
		if (local15 < 0.0D) {
			local15 = 0.0D;
		}
		@Pc(24) int local24 = arg0.length();
		@Pc(27) int[] local27 = new int[local24];
		for (@Pc(29) int local29 = 0; local29 < local24; local29++) {
			local27[local29] = (int) (Math.sin((double) local29 / 1.5D + (double) arg5 / 1.0D) * local15);
		}
		this.method3294(arg0, arg1 - this.aClass611_6.method33592(arg0) / 2, arg2, null, null, null, local27);
	}

	@OriginalMember(owner = "client!dw", name = "au", descriptor = "(Ljava/lang/String;IIIIII)V", line = 118)
	public void method3323(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg0 == null) {
			return;
		}
		this.method3290(arg3, arg4);
		@Pc(15) double local15 = 7.0D - (double) arg6 / 8.0D;
		if (local15 < 0.0D) {
			local15 = 0.0D;
		}
		@Pc(24) int local24 = arg0.length();
		@Pc(27) int[] local27 = new int[local24];
		for (@Pc(29) int local29 = 0; local29 < local24; local29++) {
			local27[local29] = (int) (Math.sin((double) local29 / 1.5D + (double) arg5 / 1.0D) * local15);
		}
		this.method3294(arg0, arg1 - this.aClass611_6.method33592(arg0) / 2, arg2, null, null, null, local27);
	}

	@OriginalMember(owner = "client!dw", name = "y", descriptor = "(Ljava/lang/String;IIIILjava/util/Random;I[Lclient!co;[IB)I", line = 129)
	public int method3288(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Random arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class6[] arg7, @OriginalArg(8) int[] arg8) {
		if (arg0 == null) {
			return 0;
		}
		arg5.setSeed((long) arg6);
		@Pc(15) int local15 = (arg5.nextInt() & 0x1F) + 192;
		this.method3290(local15 << 24 | arg3 & 0xFFFFFF, local15 << 24 | arg4 & 0xFFFFFF);
		@Pc(35) int local35 = arg0.length();
		@Pc(38) int[] local38 = new int[local35];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < local35; local42++) {
			local38[local42] = local40;
			if ((arg5.nextInt() & 0x3) == 0) {
				local40++;
			}
		}
		this.method3294(arg0, arg1, arg2, arg7, arg8, local38, null);
		return local40;
	}

	@OriginalMember(owner = "client!dw", name = "ag", descriptor = "(Ljava/lang/String;IIIILjava/util/Random;I[Lclient!co;[I)I", line = 129)
	public int method3307(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Random arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class6[] arg7, @OriginalArg(8) int[] arg8) {
		if (arg0 == null) {
			return 0;
		}
		arg5.setSeed((long) arg6);
		@Pc(15) int local15 = (arg5.nextInt() & 0x1F) + 192;
		this.method3290(local15 << 24 | arg3 & 0xFFFFFF, local15 << 24 | arg4 & 0xFFFFFF);
		@Pc(35) int local35 = arg0.length();
		@Pc(38) int[] local38 = new int[local35];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < local35; local42++) {
			local38[local42] = local40;
			if ((arg5.nextInt() & 0x3) == 0) {
				local40++;
			}
		}
		this.method3294(arg0, arg1, arg2, arg7, arg8, local38, null);
		return local40;
	}

	@OriginalMember(owner = "client!dw", name = "am", descriptor = "(Ljava/lang/String;IIIILjava/util/Random;I[Lclient!co;[I)I", line = 129)
	public int method3326(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Random arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class6[] arg7, @OriginalArg(8) int[] arg8) {
		if (arg0 == null) {
			return 0;
		}
		arg5.setSeed((long) arg6);
		@Pc(15) int local15 = (arg5.nextInt() & 0x1F) + 192;
		this.method3290(local15 << 24 | arg3 & 0xFFFFFF, local15 << 24 | arg4 & 0xFFFFFF);
		@Pc(35) int local35 = arg0.length();
		@Pc(38) int[] local38 = new int[local35];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < local35; local42++) {
			local38[local42] = local40;
			if ((arg5.nextInt() & 0x3) == 0) {
				local40++;
			}
		}
		this.method3294(arg0, arg1, arg2, arg7, arg8, local38, null);
		return local40;
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(Ljava/lang/String;IIIIIIIILjava/util/Random;I[I[Lclient!co;[II)I", line = 145)
	public int method3296(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Random arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) Class6[] arg12, @OriginalArg(13) int[] arg13) {
		if (arg0 == null) {
			return 0;
		}
		arg9.setSeed((long) arg10);
		@Pc(15) int local15 = (arg9.nextInt() & 0x1F) + 192;
		this.method3290(local15 << 24 | arg5 & 0xFFFFFF, arg6 == -1 ? 0 : local15 << 24 | arg6 & 0xFFFFFF);
		@Pc(40) int local40 = arg0.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		@Pc(47) int local47;
		for (local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg9.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		local47 = arg1;
		@Pc(72) int local72 = this.aClass611_6.anInt5537 * -1760037867 + arg2;
		@Pc(74) int local74 = -1;
		if (arg8 == 1) {
			local72 += (arg4 - this.aClass611_6.anInt5537 * -1760037867 - this.aClass611_6.anInt5536 * -1990992757) / 2;
		} else if (arg8 == 2) {
			local72 = arg4 + arg2 - this.aClass611_6.anInt5536 * -1990992757;
		}
		if (arg7 == 1) {
			local74 = this.aClass611_6.method33592(arg0) + local45;
			local47 = arg1 + (arg3 - local74) / 2;
		} else if (arg7 == 2) {
			local74 = this.aClass611_6.method33592(arg0) + local45;
			local47 = arg1 + (arg3 - local74);
		}
		this.method3294(arg0, local47, local72, arg12, arg13, local43, null);
		if (arg11 != null) {
			if (local74 == -1) {
				local74 = this.aClass611_6.method33592(arg0) + local45;
			}
			arg11[0] = local47;
			arg11[1] = local72 - this.aClass611_6.anInt5537 * -1760037867;
			arg11[2] = local74;
			arg11[3] = this.aClass611_6.anInt5536 * -1990992757 + this.aClass611_6.anInt5537 * -1760037867;
		}
		return local45;
	}

	@OriginalMember(owner = "client!dw", name = "ad", descriptor = "(Ljava/lang/String;IIIIIIIILjava/util/Random;I[I[Lclient!co;[I)I", line = 145)
	public int method3305(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Random arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) Class6[] arg12, @OriginalArg(13) int[] arg13) {
		if (arg0 == null) {
			return 0;
		}
		arg9.setSeed((long) arg10);
		@Pc(15) int local15 = (arg9.nextInt() & 0x1F) + 192;
		this.method3290(local15 << 24 | arg5 & 0xFFFFFF, arg6 == -1 ? 0 : local15 << 24 | arg6 & 0xFFFFFF);
		@Pc(40) int local40 = arg0.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		@Pc(47) int local47;
		for (local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg9.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		local47 = arg1;
		@Pc(72) int local72 = this.aClass611_6.anInt5537 * -1760037867 + arg2;
		@Pc(74) int local74 = -1;
		if (arg8 == 1) {
			local72 += (arg4 - this.aClass611_6.anInt5537 * -1760037867 - this.aClass611_6.anInt5536 * -1990992757) / 2;
		} else if (arg8 == 2) {
			local72 = arg4 + arg2 - this.aClass611_6.anInt5536 * -1990992757;
		}
		if (arg7 == 1) {
			local74 = this.aClass611_6.method33592(arg0) + local45;
			local47 = arg1 + (arg3 - local74) / 2;
		} else if (arg7 == 2) {
			local74 = this.aClass611_6.method33592(arg0) + local45;
			local47 = arg1 + (arg3 - local74);
		}
		this.method3294(arg0, local47, local72, arg12, arg13, local43, null);
		if (arg11 != null) {
			if (local74 == -1) {
				local74 = this.aClass611_6.method33592(arg0) + local45;
			}
			arg11[0] = local47;
			arg11[1] = local72 - this.aClass611_6.anInt5537 * -1760037867;
			arg11[2] = local74;
			arg11[3] = this.aClass611_6.anInt5536 * -1990992757 + this.aClass611_6.anInt5537 * -1760037867;
		}
		return local45;
	}

	@OriginalMember(owner = "client!dw", name = "ae", descriptor = "(Ljava/lang/String;IIIIIIIILjava/util/Random;I[I[Lclient!co;[I)I", line = 145)
	public int method3316(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Random arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) Class6[] arg12, @OriginalArg(13) int[] arg13) {
		if (arg0 == null) {
			return 0;
		}
		arg9.setSeed((long) arg10);
		@Pc(15) int local15 = (arg9.nextInt() & 0x1F) + 192;
		this.method3290(local15 << 24 | arg5 & 0xFFFFFF, arg6 == -1 ? 0 : local15 << 24 | arg6 & 0xFFFFFF);
		@Pc(40) int local40 = arg0.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		@Pc(47) int local47;
		for (local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg9.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		local47 = arg1;
		@Pc(72) int local72 = this.aClass611_6.anInt5537 * -1760037867 + arg2;
		@Pc(74) int local74 = -1;
		if (arg8 == 1) {
			local72 += (arg4 - this.aClass611_6.anInt5537 * -1760037867 - this.aClass611_6.anInt5536 * -1990992757) / 2;
		} else if (arg8 == 2) {
			local72 = arg4 + arg2 - this.aClass611_6.anInt5536 * -1990992757;
		}
		if (arg7 == 1) {
			local74 = this.aClass611_6.method33592(arg0) + local45;
			local47 = arg1 + (arg3 - local74) / 2;
		} else if (arg7 == 2) {
			local74 = this.aClass611_6.method33592(arg0) + local45;
			local47 = arg1 + (arg3 - local74);
		}
		this.method3294(arg0, local47, local72, arg12, arg13, local43, null);
		if (arg11 != null) {
			if (local74 == -1) {
				local74 = this.aClass611_6.method33592(arg0) + local45;
			}
			arg11[0] = local47;
			arg11[1] = local72 - this.aClass611_6.anInt5537 * -1760037867;
			arg11[2] = local74;
			arg11[3] = this.aClass611_6.anInt5536 * -1990992757 + this.aClass611_6.anInt5537 * -1760037867;
		}
		return local45;
	}

	@OriginalMember(owner = "client!dw", name = "ar", descriptor = "(Ljava/lang/String;IIIIIIIILjava/util/Random;I[I[Lclient!co;[I)I", line = 145)
	public int method3327(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Random arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) Class6[] arg12, @OriginalArg(13) int[] arg13) {
		if (arg0 == null) {
			return 0;
		}
		arg9.setSeed((long) arg10);
		@Pc(15) int local15 = (arg9.nextInt() & 0x1F) + 192;
		this.method3290(local15 << 24 | arg5 & 0xFFFFFF, arg6 == -1 ? 0 : local15 << 24 | arg6 & 0xFFFFFF);
		@Pc(40) int local40 = arg0.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		@Pc(47) int local47;
		for (local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg9.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		local47 = arg1;
		@Pc(72) int local72 = this.aClass611_6.anInt5537 * -1760037867 + arg2;
		@Pc(74) int local74 = -1;
		if (arg8 == 1) {
			local72 += (arg4 - this.aClass611_6.anInt5537 * -1760037867 - this.aClass611_6.anInt5536 * -1990992757) / 2;
		} else if (arg8 == 2) {
			local72 = arg4 + arg2 - this.aClass611_6.anInt5536 * -1990992757;
		}
		if (arg7 == 1) {
			local74 = this.aClass611_6.method33592(arg0) + local45;
			local47 = arg1 + (arg3 - local74) / 2;
		} else if (arg7 == 2) {
			local74 = this.aClass611_6.method33592(arg0) + local45;
			local47 = arg1 + (arg3 - local74);
		}
		this.method3294(arg0, local47, local72, arg12, arg13, local43, null);
		if (arg11 != null) {
			if (local74 == -1) {
				local74 = this.aClass611_6.method33592(arg0) + local45;
			}
			arg11[0] = local47;
			arg11[1] = local72 - this.aClass611_6.anInt5537 * -1760037867;
			arg11[2] = local74;
			arg11[3] = this.aClass611_6.anInt5536 * -1990992757 + this.aClass611_6.anInt5537 * -1760037867;
		}
		return local45;
	}

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "(III)V", line = 181)
	void method3290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt306 = 350014811;
		anInt301 = 812609425;
		anInt308 = (anInt307 = arg0 * -1776417103) * -1071140273;
		anInt310 = 0;
		anInt311 = 0;
		if (arg1 == -1) {
			arg1 = 0;
		}
		anInt305 = (anInt309 = -979011563 * arg1) * -1447685199;
	}

	@OriginalMember(owner = "client!dw", name = "ac", descriptor = "(II)V", line = 181)
	void method3325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt306 = 350014811;
		anInt301 = 812609425;
		anInt308 = (anInt307 = arg0 * -1776417103) * -1071140273;
		anInt310 = 0;
		anInt311 = 0;
		if (arg1 == -1) {
			arg1 = 0;
		}
		anInt305 = (anInt309 = -979011563 * arg1) * -1447685199;
	}

	@OriginalMember(owner = "client!dw", name = "aw", descriptor = "(II)V", line = 181)
	void method3330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt306 = 350014811;
		anInt301 = 812609425;
		anInt308 = (anInt307 = arg0 * -1776417103) * -1071140273;
		anInt310 = 0;
		anInt311 = 0;
		if (arg1 == -1) {
			arg1 = 0;
		}
		anInt305 = (anInt309 = -979011563 * arg1) * -1447685199;
	}

	@OriginalMember(owner = "client!dw", name = "bw", descriptor = "(II)V", line = 181)
	void method3331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt306 = 350014811;
		anInt301 = 812609425;
		anInt308 = (anInt307 = arg0 * -1776417103) * -1071140273;
		anInt310 = 0;
		anInt311 = 0;
		if (arg1 == -1) {
			arg1 = 0;
		}
		anInt305 = (anInt309 = -979011563 * arg1) * -1447685199;
	}

	@OriginalMember(owner = "client!dw", name = "z", descriptor = "(Ljava/lang/String;I)V", line = 192)
	void method3291(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				anInt308 = (anInt308 * -616007329 & -16777216 | Class26_Sub1_Sub1_Sub1_Sub2.method16770(arg0.substring(4), 16) & 0xFFFFFF) * -119397729;
			} else if (arg0.equals("/col")) {
				anInt308 = (-616007329 * anInt308 & -16777216 | anInt307 * -851803567 & 0xFFFFFF) * -119397729;
			}
			if (arg0.startsWith("argb=")) {
				anInt308 = Class26_Sub1_Sub1_Sub1_Sub2.method16770(arg0.substring(5), 16) * -119397729;
			} else if (arg0.equals("/argb")) {
				anInt308 = anInt307 * -1071140273;
			} else if (arg0.startsWith("str=")) {
				anInt306 = (-616007329 * anInt308 & -16777216 | Class26_Sub1_Sub1_Sub1_Sub2.method16770(arg0.substring(4), 16)) * -350014811;
			} else if (arg0.equals("str")) {
				anInt306 = (anInt308 * -616007329 & -16777216 | 0x800000) * -350014811;
			} else if (arg0.equals("/str")) {
				anInt306 = 350014811;
			} else if (arg0.startsWith("u=")) {
				anInt301 = (-616007329 * anInt308 & -16777216 | Class26_Sub1_Sub1_Sub1_Sub2.method16770(arg0.substring(2), 16)) * -812609425;
			} else if (arg0.equals("u")) {
				anInt301 = (anInt308 * -616007329 & -16777216) * -812609425;
			} else if (arg0.equals("/u")) {
				anInt301 = 812609425;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				anInt305 = 0;
			} else if (arg0.startsWith("shad=")) {
				anInt305 = (anInt308 * -616007329 & 0xFF000000 | Class26_Sub1_Sub1_Sub1_Sub2.method16770(arg0.substring(5), 16)) * 725587333;
			} else if (arg0.equals("shad")) {
				anInt305 = (anInt308 * -616007329 & 0xFF000000) * 725587333;
			} else if (arg0.equals("/shad")) {
				anInt305 = anInt309 * -1447685199;
			} else if (arg0.equals("br")) {
				this.method3290(anInt307 * -851803567, anInt309 * -1740204227);
			}
		} catch (@Pc(208) Exception local208) {
		}
	}

	@OriginalMember(owner = "client!dw", name = "bp", descriptor = "(Ljava/lang/String;)V", line = 192)
	void method3332(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				anInt308 = (anInt308 * -616007329 & -16777216 | Class26_Sub1_Sub1_Sub1_Sub2.method16770(arg0.substring(4), 16) & 0xFFFFFF) * -119397729;
			} else if (arg0.equals("/col")) {
				anInt308 = (-616007329 * anInt308 & -16777216 | anInt307 * -851803567 & 0xFFFFFF) * -119397729;
			}
			if (arg0.startsWith("argb=")) {
				anInt308 = Class26_Sub1_Sub1_Sub1_Sub2.method16770(arg0.substring(5), 16) * -119397729;
			} else if (arg0.equals("/argb")) {
				anInt308 = anInt307 * -1071140273;
			} else if (arg0.startsWith("str=")) {
				anInt306 = (-616007329 * anInt308 & -16777216 | Class26_Sub1_Sub1_Sub1_Sub2.method16770(arg0.substring(4), 16)) * -350014811;
			} else if (arg0.equals("str")) {
				anInt306 = (anInt308 * -616007329 & -16777216 | 0x800000) * -350014811;
			} else if (arg0.equals("/str")) {
				anInt306 = 350014811;
			} else if (arg0.startsWith("u=")) {
				anInt301 = (-616007329 * anInt308 & -16777216 | Class26_Sub1_Sub1_Sub1_Sub2.method16770(arg0.substring(2), 16)) * -812609425;
			} else if (arg0.equals("u")) {
				anInt301 = (anInt308 * -616007329 & -16777216) * -812609425;
			} else if (arg0.equals("/u")) {
				anInt301 = 812609425;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				anInt305 = 0;
			} else if (arg0.startsWith("shad=")) {
				anInt305 = (anInt308 * -616007329 & 0xFF000000 | Class26_Sub1_Sub1_Sub1_Sub2.method16770(arg0.substring(5), 16)) * 725587333;
			} else if (arg0.equals("shad")) {
				anInt305 = (anInt308 * -616007329 & 0xFF000000) * 725587333;
			} else if (arg0.equals("/shad")) {
				anInt305 = anInt309 * -1447685199;
			} else if (arg0.equals("br")) {
				this.method3290(anInt307 * -851803567, anInt309 * -1740204227);
			}
		} catch (@Pc(208) Exception local208) {
		}
	}

	@OriginalMember(owner = "client!dw", name = "j", descriptor = "(Ljava/lang/String;IS)V", line = 212)
	void method3322(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.length(); local5++) {
			@Pc(13) char local13 = arg0.charAt(local5);
			if (local13 == '<') {
				local3 = true;
			} else if (local13 == '>') {
				local3 = false;
			} else if (!local3 && local13 == ' ') {
				local1++;
			}
		}
		if (local1 > 0) {
			anInt310 = (arg1 - this.aClass611_6.method33592(arg0) << 8) / local1 * -230033985;
		}
	}

	@OriginalMember(owner = "client!dw", name = "bd", descriptor = "(Ljava/lang/String;I)V", line = 212)
	void method3333(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.length(); local5++) {
			@Pc(13) char local13 = arg0.charAt(local5);
			if (local13 == '<') {
				local3 = true;
			} else if (local13 == '>') {
				local3 = false;
			} else if (!local3 && local13 == ' ') {
				local1++;
			}
		}
		if (local1 > 0) {
			anInt310 = (arg1 - this.aClass611_6.method33592(arg0) << 8) / local1 * -230033985;
		}
	}

	@OriginalMember(owner = "client!dw", name = "bs", descriptor = "(Ljava/lang/String;I)V", line = 212)
	void method3334(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.length(); local5++) {
			@Pc(13) char local13 = arg0.charAt(local5);
			if (local13 == '<') {
				local3 = true;
			} else if (local13 == '>') {
				local3 = false;
			} else if (!local3 && local13 == ' ') {
				local1++;
			}
		}
		if (local1 > 0) {
			anInt310 = (arg1 - this.aClass611_6.method33592(arg0) << 8) / local1 * -230033985;
		}
	}

	@OriginalMember(owner = "client!dw", name = "n", descriptor = "(Ljava/lang/String;II[Lclient!co;[ILclient!ch;III)V", line = 224)
	void method3287(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class6[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(7) int local7 = arg2 - this.aClass611_6.anInt5538 * 1433409675;
		@Pc(9) int local9 = -1;
		@Pc(11) int local11 = -1;
		@Pc(14) int local14 = arg0.length();
		for (@Pc(16) int local16 = 0; local16 < local14; local16++) {
			@Pc(28) char local28 = (char) (Class525.method32378(arg0.charAt(local16)) & 0xFF);
			if (local28 == '<') {
				local9 = local16;
			} else {
				if (local28 == '>' && local9 != -1) {
					@Pc(47) String local47 = arg0.substring(local9 + 1, local16);
					local9 = -1;
					if (local47.equals("lt")) {
						local28 = '<';
					} else if (local47.equals("gt")) {
						local28 = '>';
					} else if (local47.equals("nbsp")) {
						local28 = 160;
					} else if (local47.equals("shy")) {
						local28 = 173;
					} else if (local47.equals("times")) {
						local28 = 215;
					} else if (local47.equals("euro")) {
						local28 = 8364;
					} else if (local47.equals("copy")) {
						local28 = 169;
					} else {
						if (!local47.equals("reg")) {
							if (local47.startsWith("img=")) {
								try {
									@Pc(115) int local115 = Class70.method33883(local47.substring(4));
									@Pc(119) Class6 local119 = arg3[local115];
									@Pc(129) int local129 = arg4 == null ? local119.method16779() : arg4[local115];
									if ((-616007329 * anInt308 & -16777216) == -16777216) {
										local119.method16794(arg1, local7 + this.aClass611_6.anInt5538 * 1433409675 - local129, 1, -1, 1);
									} else {
										local119.method16794(arg1, this.aClass611_6.anInt5538 * 1433409675 + local7 - local129, 0, anInt308 * -616007329 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg1 += arg3[local115].method16772();
									local11 = -1;
								} catch (@Pc(184) Exception local184) {
								}
							} else {
								this.method3291(local47);
							}
							continue;
						}
						local28 = 174;
					}
				}
				if (local9 == -1) {
					if (local11 != -1) {
						arg1 += this.aClass611_6.method33597(local11, local28);
					}
					if (local28 == ' ') {
						if (anInt310 * 1848703551 > 0) {
							anInt311 += anInt310 * 403185727;
							arg1 += anInt311 * -1631541759 >> 8;
							anInt311 = (anInt311 * -1631541759 & 0xFF) * 1961056769;
						}
					} else if (arg5 == null) {
						if ((anInt305 * -702604467 & 0xFF000000) != 0) {
							this.method3295(local28, arg1 + 1, local7 + 1, anInt305 * -702604467, true);
						}
						this.method3295(local28, arg1, local7, anInt308 * -616007329, false);
					} else {
						if ((anInt305 * -702604467 & 0xFF000000) != 0) {
							this.method3328(local28, arg1 + 1, local7 + 1, anInt305 * -702604467, true, arg5, arg6, arg7);
						}
						this.method3328(local28, arg1, local7, anInt308 * -616007329, false, arg5, arg6, arg7);
					}
					@Pc(307) int local307 = this.aClass611_6.method33580(local28);
					if (anInt306 * 695297325 != -1) {
						this.aClass21_6.method17065(arg1, (int) ((double) (this.aClass611_6.anInt5538 * 1433409675) * 0.7D) + local7, local307, anInt306 * 695297325);
					}
					if (-1118122353 * anInt301 != -1) {
						this.aClass21_6.method17065(arg1, local7 + 1 + this.aClass611_6.anInt5538 * 1433409675, local307, anInt301 * -1118122353);
					}
					arg1 += local307;
					local11 = local28;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dw", name = "bm", descriptor = "(Ljava/lang/String;II[Lclient!co;[ILclient!ch;II)V", line = 224)
	void method3335(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class6[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(7) int local7 = arg2 - this.aClass611_6.anInt5538 * 1433409675;
		@Pc(9) int local9 = -1;
		@Pc(11) int local11 = -1;
		@Pc(14) int local14 = arg0.length();
		for (@Pc(16) int local16 = 0; local16 < local14; local16++) {
			@Pc(28) char local28 = (char) (Class525.method32378(arg0.charAt(local16)) & 0xFF);
			if (local28 == '<') {
				local9 = local16;
			} else {
				if (local28 == '>' && local9 != -1) {
					@Pc(47) String local47 = arg0.substring(local9 + 1, local16);
					local9 = -1;
					if (local47.equals("lt")) {
						local28 = '<';
					} else if (local47.equals("gt")) {
						local28 = '>';
					} else if (local47.equals("nbsp")) {
						local28 = 160;
					} else if (local47.equals("shy")) {
						local28 = 173;
					} else if (local47.equals("times")) {
						local28 = 215;
					} else if (local47.equals("euro")) {
						local28 = 8364;
					} else if (local47.equals("copy")) {
						local28 = 169;
					} else {
						if (!local47.equals("reg")) {
							if (local47.startsWith("img=")) {
								try {
									@Pc(115) int local115 = Class70.method33883(local47.substring(4));
									@Pc(119) Class6 local119 = arg3[local115];
									@Pc(129) int local129 = arg4 == null ? local119.method16779() : arg4[local115];
									if ((-616007329 * anInt308 & -16777216) == -16777216) {
										local119.method16794(arg1, local7 + this.aClass611_6.anInt5538 * 1433409675 - local129, 1, -1, 1);
									} else {
										local119.method16794(arg1, this.aClass611_6.anInt5538 * 1433409675 + local7 - local129, 0, anInt308 * -616007329 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg1 += arg3[local115].method16772();
									local11 = -1;
								} catch (@Pc(184) Exception local184) {
								}
							} else {
								this.method3291(local47);
							}
							continue;
						}
						local28 = 174;
					}
				}
				if (local9 == -1) {
					if (local11 != -1) {
						arg1 += this.aClass611_6.method33597(local11, local28);
					}
					if (local28 == ' ') {
						if (anInt310 * 1848703551 > 0) {
							anInt311 += anInt310 * 403185727;
							arg1 += anInt311 * -1631541759 >> 8;
							anInt311 = (anInt311 * -1631541759 & 0xFF) * 1961056769;
						}
					} else if (arg5 == null) {
						if ((anInt305 * -702604467 & 0xFF000000) != 0) {
							this.method3295(local28, arg1 + 1, local7 + 1, anInt305 * -702604467, true);
						}
						this.method3295(local28, arg1, local7, anInt308 * -616007329, false);
					} else {
						if ((anInt305 * -702604467 & 0xFF000000) != 0) {
							this.method3328(local28, arg1 + 1, local7 + 1, anInt305 * -702604467, true, arg5, arg6, arg7);
						}
						this.method3328(local28, arg1, local7, anInt308 * -616007329, false, arg5, arg6, arg7);
					}
					@Pc(307) int local307 = this.aClass611_6.method33580(local28);
					if (anInt306 * 695297325 != -1) {
						this.aClass21_6.method17065(arg1, (int) ((double) (this.aClass611_6.anInt5538 * 1433409675) * 0.7D) + local7, local307, anInt306 * 695297325);
					}
					if (-1118122353 * anInt301 != -1) {
						this.aClass21_6.method17065(arg1, local7 + 1 + this.aClass611_6.anInt5538 * 1433409675, local307, anInt301 * -1118122353);
					}
					arg1 += local307;
					local11 = local28;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dw", name = "e", descriptor = "(Ljava/lang/String;II[Lclient!co;[I[I[IB)V", line = 292)
	void method3294(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class6[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(7) int local7 = arg2 - this.aClass611_6.anInt5538 * 1433409675;
		@Pc(9) int local9 = -1;
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = 0;
		@Pc(16) int local16 = arg0.length();
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			@Pc(30) char local30 = (char) (Class525.method32378(arg0.charAt(local18)) & 0xFF);
			if (local30 == '<') {
				local9 = local18;
			} else {
				@Pc(117) int local117;
				@Pc(126) int local126;
				if (local30 == '>' && local9 != -1) {
					@Pc(49) String local49 = arg0.substring(local9 + 1, local18);
					local9 = -1;
					if (local49.equals("lt")) {
						local30 = '<';
					} else if (local49.equals("gt")) {
						local30 = '>';
					} else if (local49.equals("nbsp")) {
						local30 = 160;
					} else if (local49.equals("shy")) {
						local30 = 173;
					} else if (local49.equals("times")) {
						local30 = 215;
					} else if (local49.equals("euro")) {
						local30 = 8364;
					} else if (local49.equals("copy")) {
						local30 = 169;
					} else {
						if (!local49.equals("reg")) {
							if (local49.startsWith("img=")) {
								try {
									if (arg5 == null) {
										local117 = 0;
									} else {
										local117 = arg5[local13];
									}
									if (arg6 == null) {
										local126 = 0;
									} else {
										local126 = arg6[local13];
									}
									local13++;
									@Pc(136) int local136 = Class70.method33883(local49.substring(4));
									@Pc(140) Class6 local140 = arg3[local136];
									@Pc(149) int local149 = arg4 == null ? local140.method16779() : arg4[local136];
									local140.method16794(local117 + arg1, this.aClass611_6.anInt5538 * 1433409675 + local7 - local149 + local126, 1, -1, 1);
									arg1 += arg3[local136].method16772();
									local11 = -1;
								} catch (@Pc(179) Exception local179) {
								}
							} else {
								this.method3291(local49);
							}
							continue;
						}
						local30 = 174;
					}
				}
				if (local9 == -1) {
					if (local11 != -1) {
						arg1 += this.aClass611_6.method33597(local11, local30);
					}
					@Pc(207) int local207;
					if (arg5 == null) {
						local207 = 0;
					} else {
						local207 = arg5[local13];
					}
					if (arg6 == null) {
						local117 = 0;
					} else {
						local117 = arg6[local13];
					}
					local13++;
					if (local30 != ' ') {
						if ((anInt305 * -702604467 & 0xFF000000) != 0) {
							this.method3295(local30, arg1 + 1 + local207, local7 + 1 + local117, anInt305 * -702604467, true);
						}
						this.method3295(local30, local207 + arg1, local117 + local7, anInt308 * -616007329, false);
					} else if (anInt310 * 1848703551 > 0) {
						anInt311 += anInt310 * 403185727;
						arg1 += anInt311 * -1631541759 >> 8;
						anInt311 = (anInt311 * -1631541759 & 0xFF) * 1961056769;
					}
					local126 = this.aClass611_6.method33580(local30);
					if (anInt306 * 695297325 != -1) {
						this.aClass21_6.method17065(arg1, (int) ((double) (this.aClass611_6.anInt5538 * 1433409675) * 0.7D) + local7, local126, anInt306 * 695297325);
					}
					if (anInt301 * -1118122353 != -1) {
						this.aClass21_6.method17065(arg1, this.aClass611_6.anInt5538 * 1433409675 + local7, local126, anInt301 * -1118122353);
					}
					arg1 += local126;
					local11 = local30;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dw", name = "bf", descriptor = "(Ljava/lang/String;II[Lclient!co;[I[I[I)V", line = 292)
	void method3336(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class6[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(7) int local7 = arg2 - this.aClass611_6.anInt5538 * 1433409675;
		@Pc(9) int local9 = -1;
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = 0;
		@Pc(16) int local16 = arg0.length();
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			@Pc(30) char local30 = (char) (Class525.method32378(arg0.charAt(local18)) & 0xFF);
			if (local30 == '<') {
				local9 = local18;
			} else {
				@Pc(117) int local117;
				@Pc(126) int local126;
				if (local30 == '>' && local9 != -1) {
					@Pc(49) String local49 = arg0.substring(local9 + 1, local18);
					local9 = -1;
					if (local49.equals("lt")) {
						local30 = '<';
					} else if (local49.equals("gt")) {
						local30 = '>';
					} else if (local49.equals("nbsp")) {
						local30 = 160;
					} else if (local49.equals("shy")) {
						local30 = 173;
					} else if (local49.equals("times")) {
						local30 = 215;
					} else if (local49.equals("euro")) {
						local30 = 8364;
					} else if (local49.equals("copy")) {
						local30 = 169;
					} else {
						if (!local49.equals("reg")) {
							if (local49.startsWith("img=")) {
								try {
									if (arg5 == null) {
										local117 = 0;
									} else {
										local117 = arg5[local13];
									}
									if (arg6 == null) {
										local126 = 0;
									} else {
										local126 = arg6[local13];
									}
									local13++;
									@Pc(136) int local136 = Class70.method33883(local49.substring(4));
									@Pc(140) Class6 local140 = arg3[local136];
									@Pc(149) int local149 = arg4 == null ? local140.method16779() : arg4[local136];
									local140.method16794(local117 + arg1, this.aClass611_6.anInt5538 * 1433409675 + local7 - local149 + local126, 1, -1, 1);
									arg1 += arg3[local136].method16772();
									local11 = -1;
								} catch (@Pc(179) Exception local179) {
								}
							} else {
								this.method3291(local49);
							}
							continue;
						}
						local30 = 174;
					}
				}
				if (local9 == -1) {
					if (local11 != -1) {
						arg1 += this.aClass611_6.method33597(local11, local30);
					}
					@Pc(207) int local207;
					if (arg5 == null) {
						local207 = 0;
					} else {
						local207 = arg5[local13];
					}
					if (arg6 == null) {
						local117 = 0;
					} else {
						local117 = arg6[local13];
					}
					local13++;
					if (local30 != ' ') {
						if ((anInt305 * -702604467 & 0xFF000000) != 0) {
							this.method3295(local30, arg1 + 1 + local207, local7 + 1 + local117, anInt305 * -702604467, true);
						}
						this.method3295(local30, local207 + arg1, local117 + local7, anInt308 * -616007329, false);
					} else if (anInt310 * 1848703551 > 0) {
						anInt311 += anInt310 * 403185727;
						arg1 += anInt311 * -1631541759 >> 8;
						anInt311 = (anInt311 * -1631541759 & 0xFF) * 1961056769;
					}
					local126 = this.aClass611_6.method33580(local30);
					if (anInt306 * 695297325 != -1) {
						this.aClass21_6.method17065(arg1, (int) ((double) (this.aClass611_6.anInt5538 * 1433409675) * 0.7D) + local7, local126, anInt306 * 695297325);
					}
					if (anInt301 * -1118122353 != -1) {
						this.aClass21_6.method17065(arg1, this.aClass611_6.anInt5538 * 1433409675 + local7, local126, anInt301 * -1118122353);
					}
					arg1 += local126;
					local11 = local30;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dw", name = "agm", descriptor = "(Lclient!vs;I)V", line = 10183)
	static final void method3337(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class58.aClass3_Sub1_Sub4_2 == null ? -1 : Class58.aClass3_Sub1_Sub4_2.anInt2649 * 75245013;
	}

	@OriginalMember(owner = "client!dw", name = "aqu", descriptor = "(Lclient!vs;I)V", line = 11893)
	static final void method3339(@OriginalArg(0) Class536 arg0) {
		if (client.anInt3039 * 1115111877 == 18) {
			Class570.aBoolean828 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381] == 1;
		}
	}

	@OriginalMember(owner = "client!dw", name = "w", descriptor = "(CIIIZLclient!ch;II)V")
	abstract void method3289(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!dw", name = "r", descriptor = "(CIIIZ)V")
	abstract void method3295(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!dw", name = "m", descriptor = "(CIIIZ)V")
	abstract void method3298(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!dw", name = "v", descriptor = "(CIIIZLclient!ch;II)V")
	abstract void method3299(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!dw", name = "t", descriptor = "(CIIIZLclient!ch;II)V")
	abstract void method3300(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!dw", name = "o", descriptor = "(CIIIZLclient!ch;II)V")
	abstract void method3302(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!dw", name = "q", descriptor = "(CIIIZ)V")
	abstract void method3306(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!dw", name = "d", descriptor = "(CIIIZLclient!ch;II)V")
	abstract void method3328(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);
}
