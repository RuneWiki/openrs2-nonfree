package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uu")
public class Class514 {

	@OriginalMember(owner = "client!uu", name = "p", descriptor = "Lclient!ju;")
	static Class48 aClass48_6 = null;

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "()V", line = 19)
	Class514() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!uu", name = "u", descriptor = "()V", line = 30)
	public static void method29603() {
		if (aClass48_6 != null) {
			aClass48_6.method9519();
			aClass48_6 = null;
		}
	}

	@OriginalMember(owner = "client!uu", name = "y", descriptor = "()V", line = 30)
	public static void method29605() {
		if (aClass48_6 != null) {
			aClass48_6.method9519();
			aClass48_6 = null;
		}
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "()V", line = 37)
	public static void method29606() {
		if (aClass48_6 != null) {
			aClass48_6.method9511();
		}
	}

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "()V", line = 37)
	public static void method29607() {
		if (aClass48_6 != null) {
			aClass48_6.method9511();
		}
	}

	@OriginalMember(owner = "client!uu", name = "z", descriptor = "()V", line = 37)
	public static void method29608() {
		if (aClass48_6 != null) {
			aClass48_6.method9511();
		}
	}

	@OriginalMember(owner = "client!uu", name = "j", descriptor = "()V", line = 37)
	public static void method29609() {
		if (aClass48_6 != null) {
			aClass48_6.method9511();
		}
	}

	@OriginalMember(owner = "client!uu", name = "n", descriptor = "(Lclient!ny;ILclient!sv;ZLclient!ew;)Lclient!tn;", line = 41)
	public static Interface52 method29610(@OriginalArg(0) Class359 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface51 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class161 arg4) {
		if (aClass48_6 == null) {
			return null;
		} else {
			return (Interface52) (arg3 ? new Class481(arg0, arg1, aClass48_6, arg2) : new Class485(arg0, arg1, aClass48_6, arg2, arg4));
		}
	}

	@OriginalMember(owner = "client!uu", name = "e", descriptor = "(Lclient!ny;ILclient!sv;ZLclient!ew;)Lclient!tn;", line = 41)
	public static Interface52 method29611(@OriginalArg(0) Class359 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface51 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class161 arg4) {
		if (aClass48_6 == null) {
			return null;
		} else {
			return (Interface52) (arg3 ? new Class481(arg0, arg1, aClass48_6, arg2) : new Class485(arg0, arg1, aClass48_6, arg2, arg4));
		}
	}

	@OriginalMember(owner = "client!uu", name = "d", descriptor = "(IIFLclient!jf;)V", line = 49)
	public static void method29604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Interface25 arg3) {
		if (aClass48_6 != null) {
			aClass48_6.method9518().method25228(arg0, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!uu", name = "r", descriptor = "(IIFLclient!jf;)V", line = 49)
	public static void method29612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Interface25 arg3) {
		if (aClass48_6 != null) {
			aClass48_6.method9518().method25228(arg0, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!uu", name = "q", descriptor = "(IIFLclient!jf;)V", line = 49)
	public static void method29613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Interface25 arg3) {
		if (aClass48_6 != null) {
			aClass48_6.method9518().method25228(arg0, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!uu", name = "m", descriptor = "(I)Lclient!kf;", line = 53)
	public static Class275 method29614(@OriginalArg(0) int arg0) {
		return aClass48_6 == null ? null : aClass48_6.method9518().method25226(arg0);
	}

	@OriginalMember(owner = "client!uu", name = "v", descriptor = "(II)Z", line = 58)
	public static boolean method29615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (aClass48_6 == null || aClass48_6.method9518() == null) {
			return false;
		} else if (arg1 == arg0) {
			return true;
		} else {
			@Pc(20) Class275 local20 = aClass48_6.method9518().method25226(arg0);
			@Pc(27) Class275 local27 = aClass48_6.method9518().method25226(arg1);
			@Pc(29) Class275 local29 = local20;
			do {
				if (local29 == null) {
					local29 = local27;
					do {
						if (local29 == null) {
							return false;
						}
						local29 = local29.method25361();
						if (local20 == local29) {
							return true;
						}
					} while (local27 != local29);
					return false;
				}
				local29 = local29.method25361();
				if (local27 == local29) {
					return true;
				}
			} while (local29 != local20);
			return false;
		}
	}

	@OriginalMember(owner = "client!uu", name = "t", descriptor = "(II)Z", line = 58)
	public static boolean method29616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (aClass48_6 == null || aClass48_6.method9518() == null) {
			return false;
		} else if (arg1 == arg0) {
			return true;
		} else {
			@Pc(20) Class275 local20 = aClass48_6.method9518().method25226(arg0);
			@Pc(27) Class275 local27 = aClass48_6.method9518().method25226(arg1);
			@Pc(29) Class275 local29 = local20;
			do {
				if (local29 == null) {
					local29 = local27;
					do {
						if (local29 == null) {
							return false;
						}
						local29 = local29.method25361();
						if (local20 == local29) {
							return true;
						}
					} while (local27 != local29);
					return false;
				}
				local29 = local29.method25361();
				if (local27 == local29) {
					return true;
				}
			} while (local29 != local20);
			return false;
		}
	}

	@OriginalMember(owner = "client!uu", name = "w", descriptor = "(II)Z", line = 58)
	public static boolean method29617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (aClass48_6 == null || aClass48_6.method9518() == null) {
			return false;
		} else if (arg1 == arg0) {
			return true;
		} else {
			@Pc(20) Class275 local20 = aClass48_6.method9518().method25226(arg0);
			@Pc(27) Class275 local27 = aClass48_6.method9518().method25226(arg1);
			@Pc(29) Class275 local29 = local20;
			do {
				if (local29 == null) {
					local29 = local27;
					do {
						if (local29 == null) {
							return false;
						}
						local29 = local29.method25361();
						if (local20 == local29) {
							return true;
						}
					} while (local27 != local29);
					return false;
				}
				local29 = local29.method25361();
				if (local27 == local29) {
					return true;
				}
			} while (local29 != local20);
			return false;
		}
	}

	@OriginalMember(owner = "client!uu", name = "u", descriptor = "([F[IIIB)V", line = 143)
	public static void method29618(@OriginalArg(0) float[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg2) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) float local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) int local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		for (@Pc(40) int local40 = arg2; local40 < arg3; local40++) {
			if (arg0[local40] > local14) {
				@Pc(53) float local53 = arg0[local40];
				arg0[local40] = arg0[local10];
				arg0[local10] = local53;
				@Pc(67) int local67 = arg1[local40];
				arg1[local40] = arg1[local10];
				arg1[local10++] = local67;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		method29618(arg0, arg1, arg2, local10 - 1);
		method29618(arg0, arg1, local10 + 1, arg3);
	}
}
