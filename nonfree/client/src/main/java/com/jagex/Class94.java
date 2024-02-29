package com.jagex;

import java.awt.Container;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public abstract class Class94 {

	@OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
	public static final int anInt912 = 1;

	@OriginalMember(owner = "client!dj", name = "v", descriptor = "I")
	public static final int anInt913 = 0;

	@OriginalMember(owner = "client!dj", name = "y", descriptor = "I")
	public static final int anInt914 = 0;

	@OriginalMember(owner = "client!dj", name = "w", descriptor = "I")
	static int anInt916 = 658379099;

	@OriginalMember(owner = "client!dj", name = "t", descriptor = "I")
	static int anInt911 = 1043358759;

	@OriginalMember(owner = "client!dj", name = "q", descriptor = "I")
	static int anInt917 = 0;

	@OriginalMember(owner = "client!dj", name = "x", descriptor = "I")
	static int anInt918 = 0;

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
	static int anInt919 = 0;

	@OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
	static int anInt915 = 0;

	@OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
	static int anInt920 = 0;

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
	static int anInt921 = 0;

	@OriginalMember(owner = "client!dj", name = "z", descriptor = "[Ljava/lang/String;")
	static String[] aStringArray13 = new String[100];

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "Lclient!dx;")
	Class86 aClass86_7;

	@OriginalMember(owner = "client!dj", name = "p", descriptor = "Lclient!aar;")
	Class17 aClass17_7;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lclient!dx;Lclient!aar;)V", line = 24)
	Class94(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class17 arg1) {
		this.aClass86_7 = arg0;
		this.aClass17_7 = arg1;
	}

	@OriginalMember(owner = "client!dj", name = "p", descriptor = "(Ljava/lang/String;IIIIB)V", line = 30)
	public void method7602(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method7633(arg3, arg4);
			this.method7644(arg0, arg1, arg2, null, null, null, 0, 0);
		}
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(Ljava/lang/String;IIII)V", line = 30)
	public void method7603(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method7633(arg3, arg4);
			this.method7644(arg0, arg1, arg2, null, null, null, 0, 0);
		}
	}

	@OriginalMember(owner = "client!dj", name = "n", descriptor = "(Ljava/lang/String;IIII)V", line = 30)
	public void method7604(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method7633(arg3, arg4);
			this.method7644(arg0, arg1, arg2, null, null, null, 0, 0);
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/lang/String;IIII)V", line = 30)
	public void method7605(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method7633(arg3, arg4);
			this.method7644(arg0, arg1, arg2, null, null, null, 0, 0);
		}
	}

	@OriginalMember(owner = "client!dj", name = "m", descriptor = "(Ljava/lang/String;IIII)V", line = 30)
	public void method7606(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method7633(arg3, arg4);
			this.method7644(arg0, arg1, arg2, null, null, null, 0, 0);
		}
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(Ljava/lang/String;IIIII)V", line = 36)
	public void method7607(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method7633(arg3, arg4);
			this.method7644(arg0, arg1 - this.aClass17_7.method297(arg0), arg2, null, null, null, 0, 0);
		}
	}

	@OriginalMember(owner = "client!dj", name = "h", descriptor = "(Ljava/lang/String;IIII)V", line = 36)
	public void method7608(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method7633(arg3, arg4);
			this.method7644(arg0, arg1 - this.aClass17_7.method297(arg0), arg2, null, null, null, 0, 0);
		}
	}

	@OriginalMember(owner = "client!dj", name = "aj", descriptor = "(Ljava/lang/String;IIII)V", line = 36)
	public void method7609(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method7633(arg3, arg4);
			this.method7644(arg0, arg1 - this.aClass17_7.method297(arg0), arg2, null, null, null, 0, 0);
		}
	}

	@OriginalMember(owner = "client!dj", name = "ai", descriptor = "(Ljava/lang/String;IIII)V", line = 36)
	public void method7610(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method7633(arg3, arg4);
			this.method7644(arg0, arg1 - this.aClass17_7.method297(arg0), arg2, null, null, null, 0, 0);
		}
	}

	@OriginalMember(owner = "client!dj", name = "ag", descriptor = "(Ljava/lang/String;IIII)V", line = 36)
	public void method7611(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method7633(arg3, arg4);
			this.method7644(arg0, arg1 - this.aClass17_7.method297(arg0), arg2, null, null, null, 0, 0);
		}
	}

	@OriginalMember(owner = "client!dj", name = "v", descriptor = "(Ljava/lang/String;IIIII)V", line = 42)
	public void method7612(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method7633(arg3, arg4);
			this.method7644(arg0, arg1 - this.aClass17_7.method297(arg0) / 2, arg2, null, null, null, 0, 0);
		}
	}

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "(IIIILclient!as;Lclient!as;I)Lclient!ri;", line = 47)
	public static Class510 method7613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface13 arg4, @OriginalArg(5) Interface13 arg5) {
		@Pc(1) Class521[] local1 = null;
		@Pc(7) Class581 local7 = (Class581) arg4.method18319(arg0);
		if (local7.anIntArray505 != null) {
			local1 = new Class521[local7.anIntArray505.length];
			for (@Pc(17) int local17 = 0; local17 < local1.length; local17++) {
				@Pc(30) Class326 local30 = (Class326) arg5.method18319(local7.anIntArray505[local17]);
				local1[local17] = new Class521(local30.anInt4085 * -1842236195, local30.anInt4089 * -970761915, local30.anInt4083 * -768505479, local30.anInt4084 * -626850589, local30.anInt4086 * -1997297471, local30.anInt4081 * -154850755, local30.anInt4087 * 565548279, local30.aBoolean704, local30.anInt4088 * 950333711, local30.anInt4082 * 943734367, local30.anInt4090 * -1786753521);
			}
		}
		return new Class510(local7.anInt5446 * 2085042865, local1, local7.anInt5445 * 1576956907, arg1, arg2, arg3, local7.aClass571_4, local7.anInt5444 * 761892639);
	}

	@OriginalMember(owner = "client!dj", name = "l", descriptor = "(Ljava/lang/String;IIIIIIIII[Lclient!cy;[ILclient!cd;III)I", line = 48)
	public int method7614(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class83[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) Class90 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		return this.method7617(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, 0, arg10, arg11, arg12, arg13, arg14);
	}

	@OriginalMember(owner = "client!dj", name = "al", descriptor = "(Ljava/lang/String;IIIIIIIII[Lclient!cy;[ILclient!cd;II)I", line = 48)
	public int method7615(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class83[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) Class90 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		return this.method7617(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, 0, arg10, arg11, arg12, arg13, arg14);
	}

	@OriginalMember(owner = "client!dj", name = "ao", descriptor = "(Ljava/lang/String;IIIIIIIIII[Lclient!cy;[ILclient!cd;II)I", line = 52)
	public int method7616(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) Class83[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class90 arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (arg0 == null) {
			return 0;
		}
		this.method7633(arg5, arg6);
		if (arg9 == 0) {
			arg9 = this.aClass17_7.anInt50 * -1062735011;
		}
		@Pc(39) int[] local39;
		if (arg4 < arg9 + this.aClass17_7.anInt51 * 728893755 + this.aClass17_7.anInt52 * 102396103 && arg4 < arg9 + arg9) {
			local39 = null;
		} else {
			local39 = new int[] { arg3 };
		}
		@Pc(56) int local56 = this.aClass17_7.method303(arg0, local39, aStringArray13, arg11);
		if (arg10 == -1) {
			arg10 = arg4 / arg9;
			if (arg10 <= 0) {
				arg10 = 1;
			}
		}
		if (arg10 > 0 && local56 >= arg10) {
			aStringArray13[arg10 - 1] = this.aClass17_7.method300(aStringArray13[arg10 - 1], arg3, arg11);
			local56 = arg10;
		}
		if (arg8 == 3 && local56 == 1) {
			arg8 = 1;
		}
		@Pc(109) int local109;
		@Pc(188) int local188;
		if (arg8 == 0) {
			local109 = this.aClass17_7.anInt52 * 102396103 + arg2;
		} else if (arg8 == 1) {
			local109 = (arg4 - this.aClass17_7.anInt52 * 102396103 - this.aClass17_7.anInt51 * 728893755 - (local56 - 1) * arg9) / 2 + this.aClass17_7.anInt52 * 102396103 + arg2;
		} else if (arg8 == 2) {
			local109 = arg2 + arg4 - this.aClass17_7.anInt51 * 728893755 - arg9 * (local56 - 1);
		} else {
			local188 = (arg4 - this.aClass17_7.anInt52 * 102396103 - this.aClass17_7.anInt51 * 728893755 - arg9 * (local56 - 1)) / (local56 + 1);
			if (local188 < 0) {
				local188 = 0;
			}
			local109 = arg2 + this.aClass17_7.anInt52 * 102396103 + local188;
			arg9 += local188;
		}
		for (local188 = 0; local188 < local56; local188++) {
			if (arg7 == 0) {
				this.method7644(aStringArray13[local188], arg1, local109, arg11, arg12, arg13, arg14, arg15);
			} else if (arg7 == 1) {
				this.method7644(aStringArray13[local188], arg1 + (arg3 - this.aClass17_7.method297(aStringArray13[local188])) / 2, local109, arg11, arg12, arg13, arg14, arg15);
			} else if (arg7 == 2) {
				this.method7644(aStringArray13[local188], arg3 + arg1 - this.aClass17_7.method297(aStringArray13[local188]), local109, arg11, arg12, arg13, arg14, arg15);
			} else if (local188 == local56 - 1) {
				this.method7644(aStringArray13[local188], arg1, local109, arg11, arg12, arg13, arg14, arg15);
			} else {
				this.method7640(aStringArray13[local188], arg3);
				this.method7644(aStringArray13[local188], arg1, local109, arg11, arg12, arg13, arg14, arg15);
				anInt920 = 0;
			}
			local109 += arg9;
		}
		return local56;
	}

	@OriginalMember(owner = "client!dj", name = "y", descriptor = "(Ljava/lang/String;IIIIIIIIII[Lclient!cy;[ILclient!cd;IIB)I", line = 52)
	public int method7617(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) Class83[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class90 arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (arg0 == null) {
			return 0;
		}
		this.method7633(arg5, arg6);
		if (arg9 == 0) {
			arg9 = this.aClass17_7.anInt50 * -1062735011;
		}
		@Pc(39) int[] local39;
		if (arg4 < arg9 + this.aClass17_7.anInt51 * 728893755 + this.aClass17_7.anInt52 * 102396103 && arg4 < arg9 + arg9) {
			local39 = null;
		} else {
			local39 = new int[] { arg3 };
		}
		@Pc(56) int local56 = this.aClass17_7.method303(arg0, local39, aStringArray13, arg11);
		if (arg10 == -1) {
			arg10 = arg4 / arg9;
			if (arg10 <= 0) {
				arg10 = 1;
			}
		}
		if (arg10 > 0 && local56 >= arg10) {
			aStringArray13[arg10 - 1] = this.aClass17_7.method300(aStringArray13[arg10 - 1], arg3, arg11);
			local56 = arg10;
		}
		if (arg8 == 3 && local56 == 1) {
			arg8 = 1;
		}
		@Pc(109) int local109;
		@Pc(188) int local188;
		if (arg8 == 0) {
			local109 = this.aClass17_7.anInt52 * 102396103 + arg2;
		} else if (arg8 == 1) {
			local109 = (arg4 - this.aClass17_7.anInt52 * 102396103 - this.aClass17_7.anInt51 * 728893755 - (local56 - 1) * arg9) / 2 + this.aClass17_7.anInt52 * 102396103 + arg2;
		} else if (arg8 == 2) {
			local109 = arg2 + arg4 - this.aClass17_7.anInt51 * 728893755 - arg9 * (local56 - 1);
		} else {
			local188 = (arg4 - this.aClass17_7.anInt52 * 102396103 - this.aClass17_7.anInt51 * 728893755 - arg9 * (local56 - 1)) / (local56 + 1);
			if (local188 < 0) {
				local188 = 0;
			}
			local109 = arg2 + this.aClass17_7.anInt52 * 102396103 + local188;
			arg9 += local188;
		}
		for (local188 = 0; local188 < local56; local188++) {
			if (arg7 == 0) {
				this.method7644(aStringArray13[local188], arg1, local109, arg11, arg12, arg13, arg14, arg15);
			} else if (arg7 == 1) {
				this.method7644(aStringArray13[local188], arg1 + (arg3 - this.aClass17_7.method297(aStringArray13[local188])) / 2, local109, arg11, arg12, arg13, arg14, arg15);
			} else if (arg7 == 2) {
				this.method7644(aStringArray13[local188], arg3 + arg1 - this.aClass17_7.method297(aStringArray13[local188]), local109, arg11, arg12, arg13, arg14, arg15);
			} else if (local188 == local56 - 1) {
				this.method7644(aStringArray13[local188], arg1, local109, arg11, arg12, arg13, arg14, arg15);
			} else {
				this.method7640(aStringArray13[local188], arg3);
				this.method7644(aStringArray13[local188], arg1, local109, arg11, arg12, arg13, arg14, arg15);
				anInt920 = 0;
			}
			local109 += arg9;
		}
		return local56;
	}

	@OriginalMember(owner = "client!dj", name = "ak", descriptor = "(Ljava/lang/String;IIIIIIIIII[Lclient!cy;[ILclient!cd;II)I", line = 52)
	public int method7618(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) Class83[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class90 arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (arg0 == null) {
			return 0;
		}
		this.method7633(arg5, arg6);
		if (arg9 == 0) {
			arg9 = this.aClass17_7.anInt50 * -1062735011;
		}
		@Pc(39) int[] local39;
		if (arg4 < arg9 + this.aClass17_7.anInt51 * 728893755 + this.aClass17_7.anInt52 * 102396103 && arg4 < arg9 + arg9) {
			local39 = null;
		} else {
			local39 = new int[] { arg3 };
		}
		@Pc(56) int local56 = this.aClass17_7.method303(arg0, local39, aStringArray13, arg11);
		if (arg10 == -1) {
			arg10 = arg4 / arg9;
			if (arg10 <= 0) {
				arg10 = 1;
			}
		}
		if (arg10 > 0 && local56 >= arg10) {
			aStringArray13[arg10 - 1] = this.aClass17_7.method300(aStringArray13[arg10 - 1], arg3, arg11);
			local56 = arg10;
		}
		if (arg8 == 3 && local56 == 1) {
			arg8 = 1;
		}
		@Pc(109) int local109;
		@Pc(188) int local188;
		if (arg8 == 0) {
			local109 = this.aClass17_7.anInt52 * 102396103 + arg2;
		} else if (arg8 == 1) {
			local109 = (arg4 - this.aClass17_7.anInt52 * 102396103 - this.aClass17_7.anInt51 * 728893755 - (local56 - 1) * arg9) / 2 + this.aClass17_7.anInt52 * 102396103 + arg2;
		} else if (arg8 == 2) {
			local109 = arg2 + arg4 - this.aClass17_7.anInt51 * 728893755 - arg9 * (local56 - 1);
		} else {
			local188 = (arg4 - this.aClass17_7.anInt52 * 102396103 - this.aClass17_7.anInt51 * 728893755 - arg9 * (local56 - 1)) / (local56 + 1);
			if (local188 < 0) {
				local188 = 0;
			}
			local109 = arg2 + this.aClass17_7.anInt52 * 102396103 + local188;
			arg9 += local188;
		}
		for (local188 = 0; local188 < local56; local188++) {
			if (arg7 == 0) {
				this.method7644(aStringArray13[local188], arg1, local109, arg11, arg12, arg13, arg14, arg15);
			} else if (arg7 == 1) {
				this.method7644(aStringArray13[local188], arg1 + (arg3 - this.aClass17_7.method297(aStringArray13[local188])) / 2, local109, arg11, arg12, arg13, arg14, arg15);
			} else if (arg7 == 2) {
				this.method7644(aStringArray13[local188], arg3 + arg1 - this.aClass17_7.method297(aStringArray13[local188]), local109, arg11, arg12, arg13, arg14, arg15);
			} else if (local188 == local56 - 1) {
				this.method7644(aStringArray13[local188], arg1, local109, arg11, arg12, arg13, arg14, arg15);
			} else {
				this.method7640(aStringArray13[local188], arg3);
				this.method7644(aStringArray13[local188], arg1, local109, arg11, arg12, arg13, arg14, arg15);
				anInt920 = 0;
			}
			local109 += arg9;
		}
		return local56;
	}

	@OriginalMember(owner = "client!dj", name = "w", descriptor = "(Ljava/lang/String;IIIIII)V", line = 96)
	public void method7619(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method7633(arg3, arg4);
		@Pc(10) int local10 = arg0.length();
		@Pc(13) int[] local13 = new int[local10];
		for (@Pc(15) int local15 = 0; local15 < local10; local15++) {
			local13[local15] = (int) (Math.sin((double) arg5 / 5.0D + (double) local15 / 2.0D) * 5.0D);
		}
		this.method7647(arg0, arg1 - this.aClass17_7.method297(arg0) / 2, arg2, null, null, null, local13);
	}

	@OriginalMember(owner = "client!dj", name = "t", descriptor = "(Ljava/lang/String;IIIIII)V", line = 105)
	public void method7620(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method7633(arg3, arg4);
		@Pc(10) int local10 = arg0.length();
		@Pc(13) int[] local13 = new int[local10];
		@Pc(16) int[] local16 = new int[local10];
		for (@Pc(18) int local18 = 0; local18 < local10; local18++) {
			local13[local18] = (int) (Math.sin((double) arg5 / 5.0D + (double) local18 / 5.0D) * 5.0D);
			local16[local18] = (int) (Math.sin((double) local18 / 3.0D + (double) arg5 / 5.0D) * 5.0D);
		}
		this.method7647(arg0, arg1 - this.aClass17_7.method297(arg0) / 2, arg2, null, null, local13, local16);
	}

	@OriginalMember(owner = "client!dj", name = "au", descriptor = "(Ljava/lang/String;IIIII)V", line = 105)
	public void method7621(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method7633(arg3, arg4);
		@Pc(10) int local10 = arg0.length();
		@Pc(13) int[] local13 = new int[local10];
		@Pc(16) int[] local16 = new int[local10];
		for (@Pc(18) int local18 = 0; local18 < local10; local18++) {
			local13[local18] = (int) (Math.sin((double) arg5 / 5.0D + (double) local18 / 5.0D) * 5.0D);
			local16[local18] = (int) (Math.sin((double) local18 / 3.0D + (double) arg5 / 5.0D) * 5.0D);
		}
		this.method7647(arg0, arg1 - this.aClass17_7.method297(arg0) / 2, arg2, null, null, local13, local16);
	}

	@OriginalMember(owner = "client!dj", name = "ar", descriptor = "(Ljava/lang/String;IIIII)V", line = 105)
	public void method7622(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method7633(arg3, arg4);
		@Pc(10) int local10 = arg0.length();
		@Pc(13) int[] local13 = new int[local10];
		@Pc(16) int[] local16 = new int[local10];
		for (@Pc(18) int local18 = 0; local18 < local10; local18++) {
			local13[local18] = (int) (Math.sin((double) arg5 / 5.0D + (double) local18 / 5.0D) * 5.0D);
			local16[local18] = (int) (Math.sin((double) local18 / 3.0D + (double) arg5 / 5.0D) * 5.0D);
		}
		this.method7647(arg0, arg1 - this.aClass17_7.method297(arg0) / 2, arg2, null, null, local13, local16);
	}

	@OriginalMember(owner = "client!dj", name = "ad", descriptor = "(Ljava/lang/String;IIIII)V", line = 105)
	public void method7623(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method7633(arg3, arg4);
		@Pc(10) int local10 = arg0.length();
		@Pc(13) int[] local13 = new int[local10];
		@Pc(16) int[] local16 = new int[local10];
		for (@Pc(18) int local18 = 0; local18 < local10; local18++) {
			local13[local18] = (int) (Math.sin((double) arg5 / 5.0D + (double) local18 / 5.0D) * 5.0D);
			local16[local18] = (int) (Math.sin((double) local18 / 3.0D + (double) arg5 / 5.0D) * 5.0D);
		}
		this.method7647(arg0, arg1 - this.aClass17_7.method297(arg0) / 2, arg2, null, null, local13, local16);
	}

	@OriginalMember(owner = "client!dj", name = "ax", descriptor = "(Ljava/lang/String;IIIII)V", line = 105)
	public void method7624(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method7633(arg3, arg4);
		@Pc(10) int local10 = arg0.length();
		@Pc(13) int[] local13 = new int[local10];
		@Pc(16) int[] local16 = new int[local10];
		for (@Pc(18) int local18 = 0; local18 < local10; local18++) {
			local13[local18] = (int) (Math.sin((double) arg5 / 5.0D + (double) local18 / 5.0D) * 5.0D);
			local16[local18] = (int) (Math.sin((double) local18 / 3.0D + (double) arg5 / 5.0D) * 5.0D);
		}
		this.method7647(arg0, arg1 - this.aClass17_7.method297(arg0) / 2, arg2, null, null, local13, local16);
	}

	@OriginalMember(owner = "client!dj", name = "av", descriptor = "(Ljava/lang/String;IIIIII)V", line = 118)
	public void method7625(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg0 == null) {
			return;
		}
		this.method7633(arg3, arg4);
		@Pc(14) double local14 = 7.0D - (double) arg6 / 8.0D;
		if (local14 < 0.0D) {
			local14 = 0.0D;
		}
		@Pc(23) int local23 = arg0.length();
		@Pc(26) int[] local26 = new int[local23];
		for (@Pc(28) int local28 = 0; local28 < local23; local28++) {
			local26[local28] = (int) (Math.sin((double) local28 / 1.5D + (double) arg5 / 1.0D) * local14);
		}
		this.method7647(arg0, arg1 - this.aClass17_7.method297(arg0) / 2, arg2, null, null, null, local26);
	}

	@OriginalMember(owner = "client!dj", name = "q", descriptor = "(Ljava/lang/String;IIIIIII)V", line = 118)
	public void method7626(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg0 == null) {
			return;
		}
		this.method7633(arg3, arg4);
		@Pc(14) double local14 = 7.0D - (double) arg6 / 8.0D;
		if (local14 < 0.0D) {
			local14 = 0.0D;
		}
		@Pc(23) int local23 = arg0.length();
		@Pc(26) int[] local26 = new int[local23];
		for (@Pc(28) int local28 = 0; local28 < local23; local28++) {
			local26[local28] = (int) (Math.sin((double) local28 / 1.5D + (double) arg5 / 1.0D) * local14);
		}
		this.method7647(arg0, arg1 - this.aClass17_7.method297(arg0) / 2, arg2, null, null, null, local26);
	}

	@OriginalMember(owner = "client!dj", name = "ac", descriptor = "(Ljava/lang/String;IIIIII)V", line = 118)
	public void method7627(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg0 == null) {
			return;
		}
		this.method7633(arg3, arg4);
		@Pc(14) double local14 = 7.0D - (double) arg6 / 8.0D;
		if (local14 < 0.0D) {
			local14 = 0.0D;
		}
		@Pc(23) int local23 = arg0.length();
		@Pc(26) int[] local26 = new int[local23];
		for (@Pc(28) int local28 = 0; local28 < local23; local28++) {
			local26[local28] = (int) (Math.sin((double) local28 / 1.5D + (double) arg5 / 1.0D) * local14);
		}
		this.method7647(arg0, arg1 - this.aClass17_7.method297(arg0) / 2, arg2, null, null, null, local26);
	}

	@OriginalMember(owner = "client!dj", name = "x", descriptor = "(Ljava/lang/String;IIIILjava/util/Random;I[Lclient!cy;[IB)I", line = 129)
	public int method7628(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Random arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class83[] arg7, @OriginalArg(8) int[] arg8) {
		if (arg0 == null) {
			return 0;
		}
		arg5.setSeed((long) arg6);
		@Pc(14) int local14 = (arg5.nextInt() & 0x1F) + 192;
		this.method7633(local14 << 24 | arg3 & 0xFFFFFF, local14 << 24 | arg4 & 0xFFFFFF);
		@Pc(34) int local34 = arg0.length();
		@Pc(37) int[] local37 = new int[local34];
		@Pc(39) int local39 = 0;
		for (@Pc(41) int local41 = 0; local41 < local34; local41++) {
			local37[local41] = local39;
			if ((arg5.nextInt() & 0x3) == 0) {
				local39++;
			}
		}
		this.method7647(arg0, arg1, arg2, arg7, arg8, local37, null);
		return local39;
	}

	@OriginalMember(owner = "client!dj", name = "ah", descriptor = "(Ljava/lang/String;IIIIIIIILjava/util/Random;I[I[Lclient!cy;[I)I", line = 145)
	public int method7629(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Random arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) Class83[] arg12, @OriginalArg(13) int[] arg13) {
		if (arg0 == null) {
			return 0;
		}
		arg9.setSeed((long) arg10);
		@Pc(15) int local15 = (arg9.nextInt() & 0x1F) + 192;
		this.method7633(local15 << 24 | arg5 & 0xFFFFFF, arg6 == -1 ? 0 : local15 << 24 | arg6 & 0xFFFFFF);
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
		@Pc(72) int local72 = this.aClass17_7.anInt52 * 102396103 + arg2;
		@Pc(74) int local74 = -1;
		if (arg8 == 1) {
			local72 += (arg4 - this.aClass17_7.anInt52 * 102396103 - this.aClass17_7.anInt51 * 728893755) / 2;
		} else if (arg8 == 2) {
			local72 = arg4 + arg2 - this.aClass17_7.anInt51 * 728893755;
		}
		if (arg7 == 1) {
			local74 = this.aClass17_7.method297(arg0) + local45;
			local47 = arg1 + (arg3 - local74) / 2;
		} else if (arg7 == 2) {
			local74 = this.aClass17_7.method297(arg0) + local45;
			local47 = arg1 + (arg3 - local74);
		}
		this.method7647(arg0, local47, local72, arg12, arg13, local43, null);
		if (arg11 != null) {
			if (local74 == -1) {
				local74 = this.aClass17_7.method297(arg0) + local45;
			}
			arg11[0] = local47;
			arg11[1] = local72 - this.aClass17_7.anInt52 * 102396103;
			arg11[2] = local74;
			arg11[3] = this.aClass17_7.anInt51 * 728893755 + this.aClass17_7.anInt52 * 102396103;
		}
		return local45;
	}

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "(Ljava/lang/String;IIIIIIIILjava/util/Random;I[I[Lclient!cy;[IB)I", line = 145)
	public int method7630(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Random arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) Class83[] arg12, @OriginalArg(13) int[] arg13) {
		if (arg0 == null) {
			return 0;
		}
		arg9.setSeed((long) arg10);
		@Pc(15) int local15 = (arg9.nextInt() & 0x1F) + 192;
		this.method7633(local15 << 24 | arg5 & 0xFFFFFF, arg6 == -1 ? 0 : local15 << 24 | arg6 & 0xFFFFFF);
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
		@Pc(72) int local72 = this.aClass17_7.anInt52 * 102396103 + arg2;
		@Pc(74) int local74 = -1;
		if (arg8 == 1) {
			local72 += (arg4 - this.aClass17_7.anInt52 * 102396103 - this.aClass17_7.anInt51 * 728893755) / 2;
		} else if (arg8 == 2) {
			local72 = arg4 + arg2 - this.aClass17_7.anInt51 * 728893755;
		}
		if (arg7 == 1) {
			local74 = this.aClass17_7.method297(arg0) + local45;
			local47 = arg1 + (arg3 - local74) / 2;
		} else if (arg7 == 2) {
			local74 = this.aClass17_7.method297(arg0) + local45;
			local47 = arg1 + (arg3 - local74);
		}
		this.method7647(arg0, local47, local72, arg12, arg13, local43, null);
		if (arg11 != null) {
			if (local74 == -1) {
				local74 = this.aClass17_7.method297(arg0) + local45;
			}
			arg11[0] = local47;
			arg11[1] = local72 - this.aClass17_7.anInt52 * 102396103;
			arg11[2] = local74;
			arg11[3] = this.aClass17_7.anInt51 * 728893755 + this.aClass17_7.anInt52 * 102396103;
		}
		return local45;
	}

	@OriginalMember(owner = "client!dj", name = "at", descriptor = "(Ljava/lang/String;IIIIIIIILjava/util/Random;I[I[Lclient!cy;[I)I", line = 145)
	public int method7631(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Random arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) Class83[] arg12, @OriginalArg(13) int[] arg13) {
		if (arg0 == null) {
			return 0;
		}
		arg9.setSeed((long) arg10);
		@Pc(15) int local15 = (arg9.nextInt() & 0x1F) + 192;
		this.method7633(local15 << 24 | arg5 & 0xFFFFFF, arg6 == -1 ? 0 : local15 << 24 | arg6 & 0xFFFFFF);
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
		@Pc(72) int local72 = this.aClass17_7.anInt52 * 102396103 + arg2;
		@Pc(74) int local74 = -1;
		if (arg8 == 1) {
			local72 += (arg4 - this.aClass17_7.anInt52 * 102396103 - this.aClass17_7.anInt51 * 728893755) / 2;
		} else if (arg8 == 2) {
			local72 = arg4 + arg2 - this.aClass17_7.anInt51 * 728893755;
		}
		if (arg7 == 1) {
			local74 = this.aClass17_7.method297(arg0) + local45;
			local47 = arg1 + (arg3 - local74) / 2;
		} else if (arg7 == 2) {
			local74 = this.aClass17_7.method297(arg0) + local45;
			local47 = arg1 + (arg3 - local74);
		}
		this.method7647(arg0, local47, local72, arg12, arg13, local43, null);
		if (arg11 != null) {
			if (local74 == -1) {
				local74 = this.aClass17_7.method297(arg0) + local45;
			}
			arg11[0] = local47;
			arg11[1] = local72 - this.aClass17_7.anInt52 * 102396103;
			arg11[2] = local74;
			arg11[3] = this.aClass17_7.anInt51 * 728893755 + this.aClass17_7.anInt52 * 102396103;
		}
		return local45;
	}

	@OriginalMember(owner = "client!dj", name = "ae", descriptor = "(Ljava/lang/String;IIIIIIIILjava/util/Random;I[I[Lclient!cy;[I)I", line = 145)
	public int method7632(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Random arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) Class83[] arg12, @OriginalArg(13) int[] arg13) {
		if (arg0 == null) {
			return 0;
		}
		arg9.setSeed((long) arg10);
		@Pc(15) int local15 = (arg9.nextInt() & 0x1F) + 192;
		this.method7633(local15 << 24 | arg5 & 0xFFFFFF, arg6 == -1 ? 0 : local15 << 24 | arg6 & 0xFFFFFF);
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
		@Pc(72) int local72 = this.aClass17_7.anInt52 * 102396103 + arg2;
		@Pc(74) int local74 = -1;
		if (arg8 == 1) {
			local72 += (arg4 - this.aClass17_7.anInt52 * 102396103 - this.aClass17_7.anInt51 * 728893755) / 2;
		} else if (arg8 == 2) {
			local72 = arg4 + arg2 - this.aClass17_7.anInt51 * 728893755;
		}
		if (arg7 == 1) {
			local74 = this.aClass17_7.method297(arg0) + local45;
			local47 = arg1 + (arg3 - local74) / 2;
		} else if (arg7 == 2) {
			local74 = this.aClass17_7.method297(arg0) + local45;
			local47 = arg1 + (arg3 - local74);
		}
		this.method7647(arg0, local47, local72, arg12, arg13, local43, null);
		if (arg11 != null) {
			if (local74 == -1) {
				local74 = this.aClass17_7.method297(arg0) + local45;
			}
			arg11[0] = local47;
			arg11[1] = local72 - this.aClass17_7.anInt52 * 102396103;
			arg11[2] = local74;
			arg11[3] = this.aClass17_7.anInt51 * 728893755 + this.aClass17_7.anInt52 * 102396103;
		}
		return local45;
	}

	@OriginalMember(owner = "client!dj", name = "s", descriptor = "(III)V", line = 181)
	void method7633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt916 = 658379099;
		anInt911 = 1043358759;
		anInt918 = (anInt917 = -17963335 * arg0) * -18968535;
		anInt920 = 0;
		anInt921 = 0;
		if (arg1 == -1) {
			arg1 = 0;
		}
		anInt915 = (anInt919 = arg1 * -360402663) * -323331121;
	}

	@OriginalMember(owner = "client!dj", name = "aq", descriptor = "(II)V", line = 181)
	void method7634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt916 = 658379099;
		anInt911 = 1043358759;
		anInt918 = (anInt917 = -17963335 * arg0) * -18968535;
		anInt920 = 0;
		anInt921 = 0;
		if (arg1 == -1) {
			arg1 = 0;
		}
		anInt915 = (anInt919 = arg1 * -360402663) * -323331121;
	}

	@OriginalMember(owner = "client!dj", name = "am", descriptor = "(II)V", line = 181)
	void method7635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt916 = 658379099;
		anInt911 = 1043358759;
		anInt918 = (anInt917 = -17963335 * arg0) * -18968535;
		anInt920 = 0;
		anInt921 = 0;
		if (arg1 == -1) {
			arg1 = 0;
		}
		anInt915 = (anInt919 = arg1 * -360402663) * -323331121;
	}

	@OriginalMember(owner = "client!dj", name = "as", descriptor = "(II)V", line = 181)
	void method7636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt916 = 658379099;
		anInt911 = 1043358759;
		anInt918 = (anInt917 = -17963335 * arg0) * -18968535;
		anInt920 = 0;
		anInt921 = 0;
		if (arg1 == -1) {
			arg1 = 0;
		}
		anInt915 = (anInt919 = arg1 * -360402663) * -323331121;
	}

	@OriginalMember(owner = "client!dj", name = "r", descriptor = "(Ljava/lang/String;I)V", line = 192)
	void method7637(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				anInt918 = (anInt918 * -1624596383 & 0xFF000000 | Class152.method17436(arg0.substring(4), 16) & 0xFFFFFF) * 1213203361;
			} else if (arg0.equals("/col")) {
				anInt918 = (anInt918 * -1624596383 & 0xFF000000 | anInt917 * -903331959 & 0xFFFFFF) * 1213203361;
			}
			if (arg0.startsWith("argb=")) {
				anInt918 = Class152.method17436(arg0.substring(5), 16) * 1213203361;
			} else if (arg0.equals("/argb")) {
				anInt918 = anInt917 * -18968535;
			} else if (arg0.startsWith("str=")) {
				anInt916 = (-1624596383 * anInt918 & -16777216 | Class152.method17436(arg0.substring(4), 16)) * -658379099;
			} else if (arg0.equals("str")) {
				anInt916 = (-1624596383 * anInt918 & -16777216 | 0x800000) * -658379099;
			} else if (arg0.equals("/str")) {
				anInt916 = 658379099;
			} else if (arg0.startsWith("u=")) {
				anInt911 = (anInt918 * -1624596383 & -16777216 | Class152.method17436(arg0.substring(2), 16)) * -1043358759;
			} else if (arg0.equals("u")) {
				anInt911 = (-1624596383 * anInt918 & -16777216) * -1043358759;
			} else if (arg0.equals("/u")) {
				anInt911 = 1043358759;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				anInt915 = 0;
			} else if (arg0.startsWith("shad=")) {
				anInt915 = (anInt918 * -1624596383 & -16777216 | Class152.method17436(arg0.substring(5), 16)) * -2073487817;
			} else if (arg0.equals("shad")) {
				anInt915 = (anInt918 * -1624596383 & -16777216) * -2073487817;
			} else if (arg0.equals("/shad")) {
				anInt915 = anInt919 * -323331121;
			} else if (arg0.equals("br")) {
				this.method7633(anInt917 * -903331959, anInt919 * 719461161);
			}
		} catch (@Pc(208) Exception local208) {
		}
	}

	@OriginalMember(owner = "client!dj", name = "af", descriptor = "(Ljava/lang/String;)V", line = 192)
	void method7638(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				anInt918 = (anInt918 * -1624596383 & 0xFF000000 | Class152.method17436(arg0.substring(4), 16) & 0xFFFFFF) * 1213203361;
			} else if (arg0.equals("/col")) {
				anInt918 = (anInt918 * -1624596383 & 0xFF000000 | anInt917 * -903331959 & 0xFFFFFF) * 1213203361;
			}
			if (arg0.startsWith("argb=")) {
				anInt918 = Class152.method17436(arg0.substring(5), 16) * 1213203361;
			} else if (arg0.equals("/argb")) {
				anInt918 = anInt917 * -18968535;
			} else if (arg0.startsWith("str=")) {
				anInt916 = (-1624596383 * anInt918 & -16777216 | Class152.method17436(arg0.substring(4), 16)) * -658379099;
			} else if (arg0.equals("str")) {
				anInt916 = (-1624596383 * anInt918 & -16777216 | 0x800000) * -658379099;
			} else if (arg0.equals("/str")) {
				anInt916 = 658379099;
			} else if (arg0.startsWith("u=")) {
				anInt911 = (anInt918 * -1624596383 & -16777216 | Class152.method17436(arg0.substring(2), 16)) * -1043358759;
			} else if (arg0.equals("u")) {
				anInt911 = (-1624596383 * anInt918 & -16777216) * -1043358759;
			} else if (arg0.equals("/u")) {
				anInt911 = 1043358759;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				anInt915 = 0;
			} else if (arg0.startsWith("shad=")) {
				anInt915 = (anInt918 * -1624596383 & -16777216 | Class152.method17436(arg0.substring(5), 16)) * -2073487817;
			} else if (arg0.equals("shad")) {
				anInt915 = (anInt918 * -1624596383 & -16777216) * -2073487817;
			} else if (arg0.equals("/shad")) {
				anInt915 = anInt919 * -323331121;
			} else if (arg0.equals("br")) {
				this.method7633(anInt917 * -903331959, anInt919 * 719461161);
			}
		} catch (@Pc(208) Exception local208) {
		}
	}

	@OriginalMember(owner = "client!dj", name = "ay", descriptor = "(Ljava/lang/String;)V", line = 192)
	void method7639(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				anInt918 = (anInt918 * -1624596383 & 0xFF000000 | Class152.method17436(arg0.substring(4), 16) & 0xFFFFFF) * 1213203361;
			} else if (arg0.equals("/col")) {
				anInt918 = (anInt918 * -1624596383 & 0xFF000000 | anInt917 * -903331959 & 0xFFFFFF) * 1213203361;
			}
			if (arg0.startsWith("argb=")) {
				anInt918 = Class152.method17436(arg0.substring(5), 16) * 1213203361;
			} else if (arg0.equals("/argb")) {
				anInt918 = anInt917 * -18968535;
			} else if (arg0.startsWith("str=")) {
				anInt916 = (-1624596383 * anInt918 & -16777216 | Class152.method17436(arg0.substring(4), 16)) * -658379099;
			} else if (arg0.equals("str")) {
				anInt916 = (-1624596383 * anInt918 & -16777216 | 0x800000) * -658379099;
			} else if (arg0.equals("/str")) {
				anInt916 = 658379099;
			} else if (arg0.startsWith("u=")) {
				anInt911 = (anInt918 * -1624596383 & -16777216 | Class152.method17436(arg0.substring(2), 16)) * -1043358759;
			} else if (arg0.equals("u")) {
				anInt911 = (-1624596383 * anInt918 & -16777216) * -1043358759;
			} else if (arg0.equals("/u")) {
				anInt911 = 1043358759;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				anInt915 = 0;
			} else if (arg0.startsWith("shad=")) {
				anInt915 = (anInt918 * -1624596383 & -16777216 | Class152.method17436(arg0.substring(5), 16)) * -2073487817;
			} else if (arg0.equals("shad")) {
				anInt915 = (anInt918 * -1624596383 & -16777216) * -2073487817;
			} else if (arg0.equals("/shad")) {
				anInt915 = anInt919 * -323331121;
			} else if (arg0.equals("br")) {
				this.method7633(anInt917 * -903331959, anInt919 * 719461161);
			}
		} catch (@Pc(208) Exception local208) {
		}
	}

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "(Ljava/lang/String;II)V", line = 212)
	void method7640(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
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
			anInt920 = (arg1 - this.aClass17_7.method297(arg0) << 8) / local1 * 1098032017;
		}
	}

	@OriginalMember(owner = "client!dj", name = "an", descriptor = "(Ljava/lang/String;I)V", line = 212)
	void method7641(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
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
			anInt920 = (arg1 - this.aClass17_7.method297(arg0) << 8) / local1 * 1098032017;
		}
	}

	@OriginalMember(owner = "client!dj", name = "ab", descriptor = "(Ljava/lang/String;I)V", line = 212)
	void method7642(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
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
			anInt920 = (arg1 - this.aClass17_7.method297(arg0) << 8) / local1 * 1098032017;
		}
	}

	@OriginalMember(owner = "client!dj", name = "aa", descriptor = "(Ljava/lang/String;I)V", line = 212)
	void method7643(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
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
			anInt920 = (arg1 - this.aClass17_7.method297(arg0) << 8) / local1 * 1098032017;
		}
	}

	@OriginalMember(owner = "client!dj", name = "z", descriptor = "(Ljava/lang/String;II[Lclient!cy;[ILclient!cd;IIS)V", line = 224)
	void method7644(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class83[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) Class90 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(7) int local7 = arg2 - this.aClass17_7.anInt50 * -1062735011;
		@Pc(9) int local9 = -1;
		@Pc(11) int local11 = -1;
		@Pc(14) int local14 = arg0.length();
		for (@Pc(16) int local16 = 0; local16 < local14; local16++) {
			@Pc(28) char local28 = (char) (Class544.method30950(arg0.charAt(local16)) & 0xFF);
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
						local28 = ' ';
					} else if (local47.equals("shy")) {
						local28 = '\u00ad';
					} else if (local47.equals("times")) {
						local28 = '×';
					} else if (local47.equals("euro")) {
						local28 = '\u0080';
					} else if (local47.equals("copy")) {
						local28 = '©';
					} else {
						if (!local47.equals("reg")) {
							@Pc(115) int local115;
							@Pc(129) int local129;
							if (local47.startsWith("img=")) {
								try {
									local115 = Class679.method36041(local47.substring(4));
									@Pc(119) Class83 local119 = arg3[local115];
									local129 = arg4 == null ? local119.method18198() : arg4[local115];
									if ((anInt918 * -1624596383 & -16777216) == -16777216) {
										local119.method18177(arg1, this.aClass17_7.anInt50 * -1062735011 + local7 - local129, 1, -1, 1);
									} else {
										local119.method18177(arg1, local7 + this.aClass17_7.anInt50 * -1062735011 - local129, 0, anInt918 * -1624596383 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg1 += arg3[local115].method18121();
									local11 = -1;
								} catch (@Pc(184) Exception local184) {
								}
							} else if (!local47.startsWith("sprite=")) {
								this.method7637(local47);
							} else if (this.aClass17_7.anInterface1_1 != null) {
								try {
									@Pc(195) boolean local195 = true;
									@Pc(197) int local197 = 0;
									local129 = local47.indexOf(44);
									if (local129 == -1) {
										local115 = Class679.method36041(local47.substring(7));
									} else {
										local115 = Class679.method36041(local47.substring(7, local129));
										local197 = Class679.method36041(local47.substring(local129 + 1));
									}
									@Pc(235) Class83[] local235 = this.aClass17_7.anInterface1_1.method28623(this.aClass86_7, local115);
									if (local235 != null) {
										@Pc(255) int local255 = Math.min(local235[local197].method18198(), this.aClass17_7.anInt51 * 728893755 + this.aClass17_7.anInt52 * 102396103);
										if ((-1624596383 * anInt918 & -16777216) == -16777216) {
											local235[local197].method18177(arg1, local7 + 2 + this.aClass17_7.anInt50 * -1062735011 - local255, 1, -1, 1);
										} else {
											local235[local197].method18177(arg1, this.aClass17_7.anInt50 * -1062735011 + 2 + local7 - local255, 0, anInt918 * -1624596383 & 0xFF000000 | 0xFFFFFF, 1);
										}
										arg1 += local235[local197].method18121();
									}
									local11 = -1;
								} catch (@Pc(318) Exception local318) {
								}
							}
							continue;
						}
						local28 = '®';
					}
				}
				if (local9 == -1) {
					if (local11 != -1) {
						arg1 += this.aClass17_7.method293(local11, local28);
					}
					if (local28 == ' ') {
						if (anInt920 * -1509393039 > 0) {
							anInt921 += anInt920 * 1273476081;
							arg1 += anInt921 * 1931534721 >> 8;
							anInt921 = (anInt921 * 1931534721 & 0xFF) * -668901759;
						}
					} else if (arg5 == null) {
						if ((anInt915 * 32538503 & 0xFF000000) != 0) {
							this.method7660(local28, arg1 + 1, local7 + 1, anInt915 * 32538503, true);
						}
						this.method7660(local28, arg1, local7, anInt918 * -1624596383, false);
					} else {
						if ((anInt915 * 32538503 & 0xFF000000) != 0) {
							this.method7661(local28, arg1 + 1, local7 + 1, anInt915 * 32538503, true, arg5, arg6, arg7);
						}
						this.method7661(local28, arg1, local7, anInt918 * -1624596383, false, arg5, arg6, arg7);
					}
					@Pc(440) int local440 = this.aClass17_7.method295(local28);
					if (anInt916 * -1699985107 != -1) {
						this.aClass86_7.method19994(arg1, (int) ((double) (this.aClass17_7.anInt50 * -1062735011) * 0.7D) + local7, local440, anInt916 * -1699985107);
					}
					if (anInt911 * 1310274665 != -1) {
						this.aClass86_7.method19994(arg1, this.aClass17_7.anInt50 * -1062735011 + local7 + 1, local440, anInt911 * 1310274665);
					}
					arg1 += local440;
					local11 = local28;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "aw", descriptor = "(Ljava/lang/String;II[Lclient!cy;[ILclient!cd;II)V", line = 224)
	void method7645(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class83[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) Class90 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(7) int local7 = arg2 - this.aClass17_7.anInt50 * -1062735011;
		@Pc(9) int local9 = -1;
		@Pc(11) int local11 = -1;
		@Pc(14) int local14 = arg0.length();
		for (@Pc(16) int local16 = 0; local16 < local14; local16++) {
			@Pc(28) char local28 = (char) (Class544.method30950(arg0.charAt(local16)) & 0xFF);
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
						local28 = ' ';
					} else if (local47.equals("shy")) {
						local28 = '\u00ad';
					} else if (local47.equals("times")) {
						local28 = '×';
					} else if (local47.equals("euro")) {
						local28 = '\u0080';
					} else if (local47.equals("copy")) {
						local28 = '©';
					} else {
						if (!local47.equals("reg")) {
							@Pc(115) int local115;
							@Pc(129) int local129;
							if (local47.startsWith("img=")) {
								try {
									local115 = Class679.method36041(local47.substring(4));
									@Pc(119) Class83 local119 = arg3[local115];
									local129 = arg4 == null ? local119.method18198() : arg4[local115];
									if ((anInt918 * -1624596383 & -16777216) == -16777216) {
										local119.method18177(arg1, this.aClass17_7.anInt50 * -1062735011 + local7 - local129, 1, -1, 1);
									} else {
										local119.method18177(arg1, local7 + this.aClass17_7.anInt50 * -1062735011 - local129, 0, anInt918 * -1624596383 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg1 += arg3[local115].method18121();
									local11 = -1;
								} catch (@Pc(184) Exception local184) {
								}
							} else if (!local47.startsWith("sprite=")) {
								this.method7637(local47);
							} else if (this.aClass17_7.anInterface1_1 != null) {
								try {
									@Pc(195) boolean local195 = true;
									@Pc(197) int local197 = 0;
									local129 = local47.indexOf(44);
									if (local129 == -1) {
										local115 = Class679.method36041(local47.substring(7));
									} else {
										local115 = Class679.method36041(local47.substring(7, local129));
										local197 = Class679.method36041(local47.substring(local129 + 1));
									}
									@Pc(235) Class83[] local235 = this.aClass17_7.anInterface1_1.method28623(this.aClass86_7, local115);
									if (local235 != null) {
										@Pc(255) int local255 = Math.min(local235[local197].method18198(), this.aClass17_7.anInt51 * 728893755 + this.aClass17_7.anInt52 * 102396103);
										if ((-1624596383 * anInt918 & -16777216) == -16777216) {
											local235[local197].method18177(arg1, local7 + 2 + this.aClass17_7.anInt50 * -1062735011 - local255, 1, -1, 1);
										} else {
											local235[local197].method18177(arg1, this.aClass17_7.anInt50 * -1062735011 + 2 + local7 - local255, 0, anInt918 * -1624596383 & 0xFF000000 | 0xFFFFFF, 1);
										}
										arg1 += local235[local197].method18121();
									}
									local11 = -1;
								} catch (@Pc(318) Exception local318) {
								}
							}
							continue;
						}
						local28 = '®';
					}
				}
				if (local9 == -1) {
					if (local11 != -1) {
						arg1 += this.aClass17_7.method293(local11, local28);
					}
					if (local28 == ' ') {
						if (anInt920 * -1509393039 > 0) {
							anInt921 += anInt920 * 1273476081;
							arg1 += anInt921 * 1931534721 >> 8;
							anInt921 = (anInt921 * 1931534721 & 0xFF) * -668901759;
						}
					} else if (arg5 == null) {
						if ((anInt915 * 32538503 & 0xFF000000) != 0) {
							this.method7660(local28, arg1 + 1, local7 + 1, anInt915 * 32538503, true);
						}
						this.method7660(local28, arg1, local7, anInt918 * -1624596383, false);
					} else {
						if ((anInt915 * 32538503 & 0xFF000000) != 0) {
							this.method7661(local28, arg1 + 1, local7 + 1, anInt915 * 32538503, true, arg5, arg6, arg7);
						}
						this.method7661(local28, arg1, local7, anInt918 * -1624596383, false, arg5, arg6, arg7);
					}
					@Pc(440) int local440 = this.aClass17_7.method295(local28);
					if (anInt916 * -1699985107 != -1) {
						this.aClass86_7.method19994(arg1, (int) ((double) (this.aClass17_7.anInt50 * -1062735011) * 0.7D) + local7, local440, anInt916 * -1699985107);
					}
					if (anInt911 * 1310274665 != -1) {
						this.aClass86_7.method19994(arg1, this.aClass17_7.anInt50 * -1062735011 + local7 + 1, local440, anInt911 * 1310274665);
					}
					arg1 += local440;
					local11 = local28;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "ap", descriptor = "(Ljava/lang/String;II[Lclient!cy;[ILclient!cd;II)V", line = 224)
	void method7646(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class83[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) Class90 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(7) int local7 = arg2 - this.aClass17_7.anInt50 * -1062735011;
		@Pc(9) int local9 = -1;
		@Pc(11) int local11 = -1;
		@Pc(14) int local14 = arg0.length();
		for (@Pc(16) int local16 = 0; local16 < local14; local16++) {
			@Pc(28) char local28 = (char) (Class544.method30950(arg0.charAt(local16)) & 0xFF);
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
						local28 = ' ';
					} else if (local47.equals("shy")) {
						local28 = '\u00ad';
					} else if (local47.equals("times")) {
						local28 = '×';
					} else if (local47.equals("euro")) {
						local28 = '\u0080';
					} else if (local47.equals("copy")) {
						local28 = '©';
					} else {
						if (!local47.equals("reg")) {
							@Pc(115) int local115;
							@Pc(129) int local129;
							if (local47.startsWith("img=")) {
								try {
									local115 = Class679.method36041(local47.substring(4));
									@Pc(119) Class83 local119 = arg3[local115];
									local129 = arg4 == null ? local119.method18198() : arg4[local115];
									if ((anInt918 * -1624596383 & -16777216) == -16777216) {
										local119.method18177(arg1, this.aClass17_7.anInt50 * -1062735011 + local7 - local129, 1, -1, 1);
									} else {
										local119.method18177(arg1, local7 + this.aClass17_7.anInt50 * -1062735011 - local129, 0, anInt918 * -1624596383 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg1 += arg3[local115].method18121();
									local11 = -1;
								} catch (@Pc(184) Exception local184) {
								}
							} else if (!local47.startsWith("sprite=")) {
								this.method7637(local47);
							} else if (this.aClass17_7.anInterface1_1 != null) {
								try {
									@Pc(195) boolean local195 = true;
									@Pc(197) int local197 = 0;
									local129 = local47.indexOf(44);
									if (local129 == -1) {
										local115 = Class679.method36041(local47.substring(7));
									} else {
										local115 = Class679.method36041(local47.substring(7, local129));
										local197 = Class679.method36041(local47.substring(local129 + 1));
									}
									@Pc(235) Class83[] local235 = this.aClass17_7.anInterface1_1.method28623(this.aClass86_7, local115);
									if (local235 != null) {
										@Pc(255) int local255 = Math.min(local235[local197].method18198(), this.aClass17_7.anInt51 * 728893755 + this.aClass17_7.anInt52 * 102396103);
										if ((-1624596383 * anInt918 & -16777216) == -16777216) {
											local235[local197].method18177(arg1, local7 + 2 + this.aClass17_7.anInt50 * -1062735011 - local255, 1, -1, 1);
										} else {
											local235[local197].method18177(arg1, this.aClass17_7.anInt50 * -1062735011 + 2 + local7 - local255, 0, anInt918 * -1624596383 & 0xFF000000 | 0xFFFFFF, 1);
										}
										arg1 += local235[local197].method18121();
									}
									local11 = -1;
								} catch (@Pc(318) Exception local318) {
								}
							}
							continue;
						}
						local28 = '®';
					}
				}
				if (local9 == -1) {
					if (local11 != -1) {
						arg1 += this.aClass17_7.method293(local11, local28);
					}
					if (local28 == ' ') {
						if (anInt920 * -1509393039 > 0) {
							anInt921 += anInt920 * 1273476081;
							arg1 += anInt921 * 1931534721 >> 8;
							anInt921 = (anInt921 * 1931534721 & 0xFF) * -668901759;
						}
					} else if (arg5 == null) {
						if ((anInt915 * 32538503 & 0xFF000000) != 0) {
							this.method7660(local28, arg1 + 1, local7 + 1, anInt915 * 32538503, true);
						}
						this.method7660(local28, arg1, local7, anInt918 * -1624596383, false);
					} else {
						if ((anInt915 * 32538503 & 0xFF000000) != 0) {
							this.method7661(local28, arg1 + 1, local7 + 1, anInt915 * 32538503, true, arg5, arg6, arg7);
						}
						this.method7661(local28, arg1, local7, anInt918 * -1624596383, false, arg5, arg6, arg7);
					}
					@Pc(440) int local440 = this.aClass17_7.method295(local28);
					if (anInt916 * -1699985107 != -1) {
						this.aClass86_7.method19994(arg1, (int) ((double) (this.aClass17_7.anInt50 * -1062735011) * 0.7D) + local7, local440, anInt916 * -1699985107);
					}
					if (anInt911 * 1310274665 != -1) {
						this.aClass86_7.method19994(arg1, this.aClass17_7.anInt50 * -1062735011 + local7 + 1, local440, anInt911 * 1310274665);
					}
					arg1 += local440;
					local11 = local28;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "j", descriptor = "(Ljava/lang/String;II[Lclient!cy;[I[I[IB)V", line = 318)
	void method7647(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class83[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(7) int local7 = arg2 - this.aClass17_7.anInt50 * -1062735011;
		@Pc(9) int local9 = -1;
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = 0;
		@Pc(16) int local16 = arg0.length();
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			@Pc(30) char local30 = (char) (Class544.method30950(arg0.charAt(local18)) & 0xFF);
			if (local30 == '<') {
				local9 = local18;
			} else {
				@Pc(118) int local118;
				@Pc(128) int local128;
				if (local30 == '>' && local9 != -1) {
					@Pc(49) String local49 = arg0.substring(local9 + 1, local18);
					local9 = -1;
					if (local49.equals("lt")) {
						local30 = '<';
					} else if (local49.equals("gt")) {
						local30 = '>';
					} else if (local49.equals("nbsp")) {
						local30 = ' ';
					} else if (local49.equals("shy")) {
						local30 = '\u00ad';
					} else if (local49.equals("times")) {
						local30 = '×';
					} else if (local49.equals("euro")) {
						local30 = '\u0080';
					} else if (local49.equals("copy")) {
						local30 = '©';
					} else {
						if (!local49.equals("reg")) {
							@Pc(138) int local138;
							@Pc(152) int local152;
							if (local49.startsWith("img=")) {
								try {
									if (arg5 == null) {
										local118 = 0;
									} else {
										local118 = arg5[local13];
									}
									if (arg6 == null) {
										local128 = 0;
									} else {
										local128 = arg6[local13];
									}
									local13++;
									local138 = Class679.method36041(local49.substring(4));
									@Pc(142) Class83 local142 = arg3[local138];
									local152 = arg4 == null ? local142.method18198() : arg4[local138];
									local142.method18177(local118 + arg1, local128 + (local7 + this.aClass17_7.anInt50 * -1062735011 - local152), 1, -1, 1);
									arg1 += arg3[local138].method18121();
									local11 = -1;
								} catch (@Pc(182) Exception local182) {
								}
							} else if (!local49.startsWith("sprite=")) {
								this.method7637(local49);
							} else if (this.aClass17_7.anInterface1_1 != null) {
								try {
									@Pc(194) boolean local194 = true;
									local128 = 0;
									local138 = local49.indexOf(44);
									if (local138 == -1) {
										local118 = Class679.method36041(local49.substring(7));
									} else {
										local118 = Class679.method36041(local49.substring(7, local138));
										local128 = Class679.method36041(local49.substring(local138 + 1));
									}
									@Pc(232) int local232;
									if (arg5 == null) {
										local232 = 0;
									} else {
										local232 = arg5[local13];
									}
									if (arg6 == null) {
										local152 = 0;
									} else {
										local152 = arg6[local13];
									}
									local13++;
									@Pc(254) Class83[] local254 = this.aClass17_7.anInterface1_1.method28623(this.aClass86_7, local118);
									if (local254 != null) {
										@Pc(274) int local274 = Math.min(local254[local128].method18198(), this.aClass17_7.anInt51 * 728893755 + this.aClass17_7.anInt52 * 102396103);
										local254[local128].method18177(arg1 + local232, this.aClass17_7.anInt50 * -1062735011 + 3 + local7 - local274 + local152, 1, -1, 1);
										arg1 += local254[local128].method18121();
									}
									local11 = -1;
								} catch (@Pc(308) Exception local308) {
								}
							}
							continue;
						}
						local30 = '®';
					}
				}
				if (local9 == -1) {
					if (local11 != -1) {
						arg1 += this.aClass17_7.method293(local11, local30);
					}
					@Pc(335) int local335;
					if (arg5 == null) {
						local335 = 0;
					} else {
						local335 = arg5[local13];
					}
					if (arg6 == null) {
						local118 = 0;
					} else {
						local118 = arg6[local13];
					}
					local13++;
					if (local30 != ' ') {
						if ((anInt915 * 32538503 & 0xFF000000) != 0) {
							this.method7660(local30, arg1 + 1 + local335, local7 + 1 + local118, anInt915 * 32538503, true);
						}
						this.method7660(local30, arg1 + local335, local118 + local7, anInt918 * -1624596383, false);
					} else if (anInt920 * -1509393039 > 0) {
						anInt921 += anInt920 * 1273476081;
						arg1 += anInt921 * 1931534721 >> 8;
						anInt921 = (anInt921 * 1931534721 & 0xFF) * -668901759;
					}
					local128 = this.aClass17_7.method295(local30);
					if (-1699985107 * anInt916 != -1) {
						this.aClass86_7.method19994(arg1, local7 + (int) ((double) (this.aClass17_7.anInt50 * -1062735011) * 0.7D), local128, anInt916 * -1699985107);
					}
					if (anInt911 * 1310274665 != -1) {
						this.aClass86_7.method19994(arg1, this.aClass17_7.anInt50 * -1062735011 + local7, local128, anInt911 * 1310274665);
					}
					arg1 += local128;
					local11 = local30;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "az", descriptor = "(Ljava/lang/String;II[Lclient!cy;[I[I[I)V", line = 318)
	void method7648(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class83[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(7) int local7 = arg2 - this.aClass17_7.anInt50 * -1062735011;
		@Pc(9) int local9 = -1;
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = 0;
		@Pc(16) int local16 = arg0.length();
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			@Pc(30) char local30 = (char) (Class544.method30950(arg0.charAt(local18)) & 0xFF);
			if (local30 == '<') {
				local9 = local18;
			} else {
				@Pc(118) int local118;
				@Pc(128) int local128;
				if (local30 == '>' && local9 != -1) {
					@Pc(49) String local49 = arg0.substring(local9 + 1, local18);
					local9 = -1;
					if (local49.equals("lt")) {
						local30 = '<';
					} else if (local49.equals("gt")) {
						local30 = '>';
					} else if (local49.equals("nbsp")) {
						local30 = ' ';
					} else if (local49.equals("shy")) {
						local30 = '\u00ad';
					} else if (local49.equals("times")) {
						local30 = '×';
					} else if (local49.equals("euro")) {
						local30 = '\u0080';
					} else if (local49.equals("copy")) {
						local30 = '©';
					} else {
						if (!local49.equals("reg")) {
							@Pc(138) int local138;
							@Pc(152) int local152;
							if (local49.startsWith("img=")) {
								try {
									if (arg5 == null) {
										local118 = 0;
									} else {
										local118 = arg5[local13];
									}
									if (arg6 == null) {
										local128 = 0;
									} else {
										local128 = arg6[local13];
									}
									local13++;
									local138 = Class679.method36041(local49.substring(4));
									@Pc(142) Class83 local142 = arg3[local138];
									local152 = arg4 == null ? local142.method18198() : arg4[local138];
									local142.method18177(local118 + arg1, local128 + (local7 + this.aClass17_7.anInt50 * -1062735011 - local152), 1, -1, 1);
									arg1 += arg3[local138].method18121();
									local11 = -1;
								} catch (@Pc(182) Exception local182) {
								}
							} else if (!local49.startsWith("sprite=")) {
								this.method7637(local49);
							} else if (this.aClass17_7.anInterface1_1 != null) {
								try {
									@Pc(194) boolean local194 = true;
									local128 = 0;
									local138 = local49.indexOf(44);
									if (local138 == -1) {
										local118 = Class679.method36041(local49.substring(7));
									} else {
										local118 = Class679.method36041(local49.substring(7, local138));
										local128 = Class679.method36041(local49.substring(local138 + 1));
									}
									@Pc(232) int local232;
									if (arg5 == null) {
										local232 = 0;
									} else {
										local232 = arg5[local13];
									}
									if (arg6 == null) {
										local152 = 0;
									} else {
										local152 = arg6[local13];
									}
									local13++;
									@Pc(254) Class83[] local254 = this.aClass17_7.anInterface1_1.method28623(this.aClass86_7, local118);
									if (local254 != null) {
										@Pc(274) int local274 = Math.min(local254[local128].method18198(), this.aClass17_7.anInt51 * 728893755 + this.aClass17_7.anInt52 * 102396103);
										local254[local128].method18177(arg1 + local232, this.aClass17_7.anInt50 * -1062735011 + 3 + local7 - local274 + local152, 1, -1, 1);
										arg1 += local254[local128].method18121();
									}
									local11 = -1;
								} catch (@Pc(308) Exception local308) {
								}
							}
							continue;
						}
						local30 = '®';
					}
				}
				if (local9 == -1) {
					if (local11 != -1) {
						arg1 += this.aClass17_7.method293(local11, local30);
					}
					@Pc(335) int local335;
					if (arg5 == null) {
						local335 = 0;
					} else {
						local335 = arg5[local13];
					}
					if (arg6 == null) {
						local118 = 0;
					} else {
						local118 = arg6[local13];
					}
					local13++;
					if (local30 != ' ') {
						if ((anInt915 * 32538503 & 0xFF000000) != 0) {
							this.method7660(local30, arg1 + 1 + local335, local7 + 1 + local118, anInt915 * 32538503, true);
						}
						this.method7660(local30, arg1 + local335, local118 + local7, anInt918 * -1624596383, false);
					} else if (anInt920 * -1509393039 > 0) {
						anInt921 += anInt920 * 1273476081;
						arg1 += anInt921 * 1931534721 >> 8;
						anInt921 = (anInt921 * 1931534721 & 0xFF) * -668901759;
					}
					local128 = this.aClass17_7.method295(local30);
					if (-1699985107 * anInt916 != -1) {
						this.aClass86_7.method19994(arg1, local7 + (int) ((double) (this.aClass17_7.anInt50 * -1062735011) * 0.7D), local128, anInt916 * -1699985107);
					}
					if (anInt911 * 1310274665 != -1) {
						this.aClass86_7.method19994(arg1, this.aClass17_7.anInt50 * -1062735011 + local7, local128, anInt911 * 1310274665);
					}
					arg1 += local128;
					local11 = local30;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "bc", descriptor = "(Ljava/lang/String;II[Lclient!cy;[I[I[I)V", line = 318)
	void method7649(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class83[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(7) int local7 = arg2 - this.aClass17_7.anInt50 * -1062735011;
		@Pc(9) int local9 = -1;
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = 0;
		@Pc(16) int local16 = arg0.length();
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			@Pc(30) char local30 = (char) (Class544.method30950(arg0.charAt(local18)) & 0xFF);
			if (local30 == '<') {
				local9 = local18;
			} else {
				@Pc(118) int local118;
				@Pc(128) int local128;
				if (local30 == '>' && local9 != -1) {
					@Pc(49) String local49 = arg0.substring(local9 + 1, local18);
					local9 = -1;
					if (local49.equals("lt")) {
						local30 = '<';
					} else if (local49.equals("gt")) {
						local30 = '>';
					} else if (local49.equals("nbsp")) {
						local30 = ' ';
					} else if (local49.equals("shy")) {
						local30 = '\u00ad';
					} else if (local49.equals("times")) {
						local30 = '×';
					} else if (local49.equals("euro")) {
						local30 = '\u0080';
					} else if (local49.equals("copy")) {
						local30 = '©';
					} else {
						if (!local49.equals("reg")) {
							@Pc(138) int local138;
							@Pc(152) int local152;
							if (local49.startsWith("img=")) {
								try {
									if (arg5 == null) {
										local118 = 0;
									} else {
										local118 = arg5[local13];
									}
									if (arg6 == null) {
										local128 = 0;
									} else {
										local128 = arg6[local13];
									}
									local13++;
									local138 = Class679.method36041(local49.substring(4));
									@Pc(142) Class83 local142 = arg3[local138];
									local152 = arg4 == null ? local142.method18198() : arg4[local138];
									local142.method18177(local118 + arg1, local128 + (local7 + this.aClass17_7.anInt50 * -1062735011 - local152), 1, -1, 1);
									arg1 += arg3[local138].method18121();
									local11 = -1;
								} catch (@Pc(182) Exception local182) {
								}
							} else if (!local49.startsWith("sprite=")) {
								this.method7637(local49);
							} else if (this.aClass17_7.anInterface1_1 != null) {
								try {
									@Pc(194) boolean local194 = true;
									local128 = 0;
									local138 = local49.indexOf(44);
									if (local138 == -1) {
										local118 = Class679.method36041(local49.substring(7));
									} else {
										local118 = Class679.method36041(local49.substring(7, local138));
										local128 = Class679.method36041(local49.substring(local138 + 1));
									}
									@Pc(232) int local232;
									if (arg5 == null) {
										local232 = 0;
									} else {
										local232 = arg5[local13];
									}
									if (arg6 == null) {
										local152 = 0;
									} else {
										local152 = arg6[local13];
									}
									local13++;
									@Pc(254) Class83[] local254 = this.aClass17_7.anInterface1_1.method28623(this.aClass86_7, local118);
									if (local254 != null) {
										@Pc(274) int local274 = Math.min(local254[local128].method18198(), this.aClass17_7.anInt51 * 728893755 + this.aClass17_7.anInt52 * 102396103);
										local254[local128].method18177(arg1 + local232, this.aClass17_7.anInt50 * -1062735011 + 3 + local7 - local274 + local152, 1, -1, 1);
										arg1 += local254[local128].method18121();
									}
									local11 = -1;
								} catch (@Pc(308) Exception local308) {
								}
							}
							continue;
						}
						local30 = '®';
					}
				}
				if (local9 == -1) {
					if (local11 != -1) {
						arg1 += this.aClass17_7.method293(local11, local30);
					}
					@Pc(335) int local335;
					if (arg5 == null) {
						local335 = 0;
					} else {
						local335 = arg5[local13];
					}
					if (arg6 == null) {
						local118 = 0;
					} else {
						local118 = arg6[local13];
					}
					local13++;
					if (local30 != ' ') {
						if ((anInt915 * 32538503 & 0xFF000000) != 0) {
							this.method7660(local30, arg1 + 1 + local335, local7 + 1 + local118, anInt915 * 32538503, true);
						}
						this.method7660(local30, arg1 + local335, local118 + local7, anInt918 * -1624596383, false);
					} else if (anInt920 * -1509393039 > 0) {
						anInt921 += anInt920 * 1273476081;
						arg1 += anInt921 * 1931534721 >> 8;
						anInt921 = (anInt921 * 1931534721 & 0xFF) * -668901759;
					}
					local128 = this.aClass17_7.method295(local30);
					if (-1699985107 * anInt916 != -1) {
						this.aClass86_7.method19994(arg1, local7 + (int) ((double) (this.aClass17_7.anInt50 * -1062735011) * 0.7D), local128, anInt916 * -1699985107);
					}
					if (anInt911 * 1310274665 != -1) {
						this.aClass86_7.method19994(arg1, this.aClass17_7.anInt50 * -1062735011 + local7, local128, anInt911 * 1310274665);
					}
					arg1 += local128;
					local11 = local30;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "j", descriptor = "(S)Ljava/awt/Container;", line = 457)
	public static Container method7650() {
		if (Class184.aFrame1 == null) {
			return Class460.aFrame2 == null ? Class331.anApplet2 : Class460.aFrame2;
		} else {
			return Class184.aFrame1;
		}
	}

	@OriginalMember(owner = "client!dj", name = "du", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 5129)
	static final void method7651(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		@Pc(12) int local12 = arg2.anIntArray536[(arg2.anInt5784 -= 308999563) * 2088438307];
		if (local12 != arg0.anInt3904 * 1565138829) {
			if (local12 == -1) {
				arg0.aClass151_6 = null;
			} else {
				if (arg0.aClass151_6 == null) {
					arg0.aClass151_6 = new Class151_Sub2();
				}
				arg0.aClass151_6.method23401(local12);
			}
			arg0.anInt3904 = local12 * -1933558971;
			Class461.method29531(arg0);
		}
		if (arg0.anInt3927 * 1365669833 == -1 && !arg1.aBoolean662) {
			Class96_Sub17.method7691(arg0.anInt3863 * -1278450723);
		}
	}

	@OriginalMember(owner = "client!dj", name = "wm", descriptor = "(Lclient!yf;I)V", line = 8600)
	static final void method7652(@OriginalArg(0) Class665 arg0) {
		Class148.method15595(Class92_Sub2_Sub2.method23290(), arg0);
	}

	@OriginalMember(owner = "client!dj", name = "aab", descriptor = "(Lclient!yf;S)V", line = 9291)
	static final void method7653(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = arg0.aClass368_3.anInt4549 * -1507311497;
	}

	@OriginalMember(owner = "client!dj", name = "ahr", descriptor = "(Lclient!yf;I)V", line = 10625)
	static final void method7654(@OriginalArg(0) Class665 arg0) {
		throw new RuntimeException("");
	}

	@OriginalMember(owner = "client!dj", name = "ms", descriptor = "(Ljava/lang/String;I)V", line = 12362)
	static void method7655(@OriginalArg(0) String arg0) {
		client.aString157 = arg0;
		if (Class335.method27670() == Class513.aClass513_4) {
			return;
		}
		try {
			@Pc(11) String local11 = Class331.anApplet2.getParameter(Class417.aClass417_25.aString212);
			@Pc(16) String local16 = Class331.anApplet2.getParameter(Class417.aClass417_26.aString212);
			@Pc(31) String local31 = local11 + "settings=" + arg0 + "; version=1; path=/; domain=" + local16;
			if (arg0.length() == 0) {
				local31 = local31 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local31 = local31 + "; Expires=" + Class111.method9221(Class280.method26667() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Class31.method516(Class331.anApplet2, "document.cookie=\"" + local31 + "\"");
		} catch (@Pc(78) Throwable local78) {
		}
	}

	@OriginalMember(owner = "client!dj", name = "u", descriptor = "(CIIIZ)V")
	abstract void method7656(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "(CIIIZ)V")
	abstract void method7657(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "(CIIIZLclient!cd;II)V")
	abstract void method7658(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class90 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!dj", name = "o", descriptor = "(CIIIZLclient!cd;II)V")
	abstract void method7659(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class90 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!dj", name = "i", descriptor = "(CIIIZ)V")
	abstract void method7660(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!dj", name = "k", descriptor = "(CIIIZLclient!cd;II)V")
	abstract void method7661(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class90 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);
}
